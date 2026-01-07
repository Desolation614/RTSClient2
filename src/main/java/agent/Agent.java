package agent;

import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Agent {

    public static Client clientInstance;
    private static final List<Runnable> scripts = new ArrayList<>();
    private static boolean running = false;
    private static Object fwInstance;

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("[AGENT] premain - HUNTING CLIENT");
        Loader.init();

        new Thread(() -> {
            int attempts = 0;
            while (clientInstance == null && attempts < 5000) {
                attempts++;

                diagnoseRuneLite();
                diagnoseStaticFields();
                diagnoseLoadedClasses();

                if (attempts % 50 == 0) { // 12s intervals
                    System.out.println("[AGENT] #" + attempts + " client=" + (clientInstance != null) +
                            " fw=" + (fwInstance != null));
                }
                try { Thread.sleep(250); } catch (InterruptedException ignored) {}
            }
        }, "Client-Hunter").start();
    }

    private static void diagnoseRuneLite() {
        try {
            Class<?> rlClass = Class.forName("net.runelite.client.RuneLite");
            Field[] fields = rlClass.getDeclaredFields();
            for (Field f : fields) {
                if (f.getType().getName().contains("Client")) {
                    f.setAccessible(true);
                    Object obj = f.get(null);
                    if (obj instanceof Client cl) {
                        clientInstance = cl;
                        System.out.println("[AGENT] HOOKED RuneLite." + f.getName() + "=" + cl);
                        tryFwCapture();
                        init(clientInstance);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            // silent
        }
    }

    private static void diagnoseStaticFields() {
        String[] targets = {"client", "fw", "fW", "RuneLite", "ClientLoader"};
        for (String t : targets) {
            try {
                Class<?> cls = Class.forName(t);
                Field[] fields = cls.getDeclaredFields();
                for (Field f : fields) {
                    if (Modifier.isStatic(f.getModifiers()) && f.getType().getName().contains("Client")) {
                        f.setAccessible(true);
                        Object obj = f.get(null);
                        if (obj instanceof Client cl) {
                            clientInstance = cl;
                            System.out.println("[AGENT] HOOKED static " + t + "." + f.getName());
                            tryFwCapture();
                            init(clientInstance);
                            return;
                        }
                    }
                }
            } catch (Exception ignored) {}
        }
    }

    private static void diagnoseLoadedClasses() {
        // RSPS pattern: single-letter class with client field
        for (char c = 'a'; c <= 'z'; c++) {
            try {
                String className = String.valueOf(c);
                Class<?> cls = Class.forName(className);
                Field[] fields = cls.getDeclaredFields();
                for (Field f : fields) {
                    if (Modifier.isStatic(f.getModifiers()) && f.getType().getName().contains("Client")) {
                        f.setAccessible(true);
                        Object obj = f.get(null);
                        if (obj instanceof Client cl) {
                            clientInstance = cl;
                            System.out.println("[AGENT] HOOKED obfuscated " + className + "." + f.getName());
                            tryFwCapture();
                            init(clientInstance);
                            return;
                        }
                    }
                }
            } catch (Exception ignored) {}
        }
    }

    private static void tryFwCapture() {
        if (fwInstance != null) return;
        String[] fwNames = {"fw", "fW"};
        for (String name : fwNames) {
            try {
                Class<?> fwCls = Class.forName(name);
                fwInstance = fwCls.getDeclaredConstructor().newInstance();
                System.out.println("[AGENT] fw captured: " + name);
                return;
            } catch (Exception ex) {
                if (fwInstance == null) System.out.println("[AGENT] fw fail: " + ex.getClass().getSimpleName());
            }
        }
    }

    public static void registerScript(Runnable r) {
        scripts.add(r);
        System.out.println("[AGENT] Script registered: " + r.getClass().getName());
    }

    public static void init(Client client) {
        clientInstance = client;
        System.out.println("[AGENT] Client INIT: " + clientInstance);
        running = true;
        Thread heartbeat = new Thread(() -> {
            while (running) {
                try {
                    for (Runnable script : scripts) {
                        script.run();
                    }
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {}
            }
        }, "Agent-Heartbeat");
        heartbeat.setDaemon(true);
        heartbeat.start();
    }

    public static void shutdown() {
        running = false;
    }

    public static void attackNpc(NPC npc) {
        if (clientInstance == null || npc == null || fwInstance == null) return;

        Player p = clientInstance.getLocalPlayer();
        if (p == null) return;

        WorldPoint ploc = p.getWorldLocation(), nloc = npc.getWorldLocation();
        if (ploc.distanceTo(nloc) > 1) return;

        try {
            Method m = fwInstance.getClass().getDeclaredMethod("a", int.class, int.class, int.class, int.class,
                    int.class, int.class, String.class, String.class, int.class, int.class);
            m.setAccessible(true);
            m.invoke(fwInstance, ploc.getX(), ploc.getY(), 20, npc.getIndex(), 0, npc.getId(),
                    "Attack", npc.getName(), -1, -1);
            System.out.println("[AGENT] ATTACK EXECUTED on " + npc.getIndex());
        } catch (Exception ex) {
            System.err.println("[AGENT] Attack failed: " + ex.getMessage());
        }
    }
}
