package agent;

import agent.scripting.ScriptManager;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.GameState;

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

        // Try to hook client via static field scan
        new Thread(() -> {
            int attempts = 0;
            while (!initialized && attempts < 2000) {
                attempts++;
                hookMainClient();
                tryFwCapture();

                if (attempts % 20 == 0) {
                    System.out.println("[AGENT] #" + attempts +
                            " client=" + (clientInstance != null) +
                            " fw.a=" + (fwAMethod != null) +
                            " initialized=" + initialized);
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
                            System.out.println("[AGENT] HOOKED Client via static field scan: " + cls.getName());
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
                Method m = fwCls.getDeclaredMethod(
                        "a",
                        int.class, int.class, int.class, int.class, int.class, int.class,
                        String.class, String.class, int.class, int.class
                );
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

        System.out.println("[AGENT] Client INIT: " + clientInstance);
        startHeartbeat();
    }

    private static void startHeartbeat() {
        Thread heartbeat = new Thread(() -> {
            while (running) {
                try {
                    if (clientInstance != null) {
                        System.out.println("[HEARTBEAT] client=true state=" + clientInstance.getGameState());
                    }

                    if (clientInstance != null && clientInstance.getGameState() == GameState.LOGGED_IN) {
                        ScriptManager.registerIfReady();
                        ScriptManager.tickAll();
                    }

                    Thread.sleep(600);
                } catch (InterruptedException ignored) {}
            }
        }, "Agent-Heartbeat");

        heartbeat.setDaemon(true);
        heartbeat.start();
    }

    // =======================
    // ATTACK METHOD
    // =======================
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
            fwAMethod.invoke(
                    null,
                    nl.getX(),
                    nl.getY(),
                    9,                 // NPC attack opcode (Ferox)
                    npc.getIndex(),
                    0,
                    npc.getId(),
                    "Attack",
                    npc.getName(),
                    -1,
                    -1
            );
            System.out.println("[AGENT] ATTACK EXECUTED -> npc idx=" + npc.getIndex());
        } catch (Throwable t) {
            System.err.println("[AGENT] Attack failed");
            t.printStackTrace();
        }
    }

    // =======================
    // CLIENT THREAD HELPER
    // =======================
    public static void runOnClientThread(Runnable task) {
        if (clientInstance == null) return;

        try {
            // Cast to decompiled client to access fw and isClientThread
            osrs.client decompiledClient = (osrs.client) clientInstance;

            if (decompiledClient.fw != null) {
                decompiledClient.fw.submit(() -> {
                    try {
                        if (!decompiledClient.isClientThread()) return;
                        task.run();
                    } catch (Throwable t) {
                        System.err.println("[AGENT] runOnClientThread failed");
                        t.printStackTrace();
                    }
                });
            } else {
                // fallback: run immediately (may throw assertion if not client thread)
                task.run();
            }
        } catch (ClassCastException e) {
            System.err.println("[AGENT] clientInstance is not decompiled client class!");
            e.printStackTrace();
        }
    }
}
