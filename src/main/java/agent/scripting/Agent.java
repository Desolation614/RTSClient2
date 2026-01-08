package agent.scripting;

import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.GameState;
import agent.scripting.scripts.GoblinPrinter;

import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Agent {
    public static volatile Client clientInstance;
    private static volatile boolean initialized = false;
    private static volatile boolean running = false;
    private static volatile Method fwAMethod = null;
    private static volatile Instrumentation instrumentation;

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("[AGENT] premain - initializing agent");
        instrumentation = inst;
        Loader.init();

        new Thread(() -> {
            int attempts = 0;
            while (!initialized && attempts < 2000) {
                attempts++;
                hookMainClient();
                tryFwCapture();
                if (attempts % 20 == 0) {
                    System.out.println("[AGENT] #" + attempts + " client=" + (clientInstance != null) + " fw.a=" + (fwAMethod != null));
                }
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            }
        }, "Client-Hunter").start();
    }

    private static void hookMainClient() {
        if (initialized) return;
        try {
            for (Class<?> cls : instrumentation.getAllLoadedClasses()) {
                for (Field f : cls.getDeclaredFields()) {
                    if (Modifier.isStatic(f.getModifiers()) && Client.class.isAssignableFrom(f.getType())) {
                        f.setAccessible(true);
                        Object clientObj = f.get(null);
                        if (clientObj != null) {
                            System.out.println("[AGENT] HOOKED Client: " + cls.getName());
                            init((Client) clientObj);
                            return;
                        }
                    }
                }
            }
        } catch (Throwable t) {
            System.out.println("[AGENT-DEBUG] hookMainClient failed: " + t);
        }
    }

    private static void tryFwCapture() {
        if (fwAMethod != null) return;
        String[] names = {"osrs.fw", "fw", "osrs.fW", "fW"};
        for (String name : names) {
            try {
                Class<?> fwCls = Class.forName(name);
                Method m = fwCls.getDeclaredMethod("a", int.class, int.class, int.class, int.class, int.class, int.class, String.class, String.class, int.class, int.class);
                m.setAccessible(true);
                fwAMethod = m;
                System.out.println("[AGENT] Cached " + name + ".a(...)");
                return;
            } catch (Throwable ignored) {}
        }
    }

    public static void init(Client client) {
        if (initialized) return;
        clientInstance = client;
        initialized = true;
        running = true;
        System.out.println("[AGENT] Client hooked and ready");
        startHeartbeat();
    }

    // In Agent.java startHeartbeat() - replace the whole method:
    private static void startHeartbeat() {
        Thread heartbeat = new Thread(() -> {
            GoblinPrinter goblinScript = null;
            int tickCount = 0;

            while (running) {
                try {
                    tickCount++;
                    if (clientInstance != null && tickCount % 10 == 0) {
                        System.out.println("[HEARTBEAT] state=" + clientInstance.getGameState());
                    }

                    if (clientInstance != null && clientInstance.getGameState() == GameState.LOGGED_IN) {
                        if (goblinScript == null) {
                            goblinScript = new GoblinPrinter();
                            goblinScript.onStart();
                            System.out.println("[AGENT] GoblinPrinter direct");
                        } else {
                            // Nuclear force output
                            System.out.println("[DIRECT] Tick #" + tickCount + " NPCs=" + (clientInstance.getNpcs() != null ? clientInstance.getNpcs().size() : "null"));
                        }
                        goblinScript.onTick();
                    }

                    Thread.sleep(600);
                } catch (InterruptedException ignored) {}
            }
        }, "Agent-Heartbeat");
        heartbeat.setDaemon(true);
        heartbeat.start();
    }


    public static void attackNpc(NPC npc) {
        if (clientInstance == null || npc == null) return;
        if (fwAMethod == null) {
            tryFwCapture();
            if (fwAMethod == null) {
                System.out.println("[AGENT] Cannot attack: fw.a not cached");
                return;
            }
        }
        Player p = clientInstance.getLocalPlayer();
        if (p == null) return;
        WorldPoint nl = npc.getWorldLocation();
        if (nl == null) return;
        try {
            fwAMethod.invoke(null, nl.getX(), nl.getY(), 9, npc.getIndex(), 0, npc.getId(), "Attack", npc.getName(), -1, -1);
            System.out.println("[AGENT] ATTACK -> npc idx=" + npc.getIndex());
        } catch (Throwable t) {
            System.err.println("[AGENT] Attack failed: " + t.getMessage());
        }
    }

    public static void runOnClientThread(Runnable task) {
        if (clientInstance == null) return;
        try {
            osrs.client decompiledClient = (osrs.client) clientInstance;
            if (decompiledClient.fw != null) {
                decompiledClient.fw.submit(() -> {
                    try {
                        if (!decompiledClient.isClientThread()) return;
                        task.run();
                    } catch (Throwable t) {
                        System.err.println("[AGENT] ClientThread error: " + t.getMessage());
                    }
                });
            } else {
                task.run();
            }
        } catch (ClassCastException e) {
            System.err.println("[AGENT] Not decompiled client");
        }
    }
}
