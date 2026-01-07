package agent;

import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Agent {

    public static Client clientInstance;
    private static final List<Runnable> scripts = new ArrayList<>();
    private static boolean running = false;

    // --- javaagent entrypoint ---
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("[AGENT] premain called, instrumentation=" + inst);
        Loader.init();

        // CLIENT HOOK: poll until clientInstance is found
        new Thread(() -> {
            int attempts = 0;

            while (clientInstance == null && attempts < 1000) {
                attempts++;
                try {
                    // --- Candidate classes to scan for static Client fields ---
                    Class<?>[] candidates = new Class<?>[] {
                            fw.class,          // main RSPS framework class
                            Class.forName("client") // try plain 'client' class if it exists
                    };

                    for (Class<?> cls : candidates) {
                        for (Field f : cls.getDeclaredFields()) {
                            if (Modifier.isStatic(f.getModifiers()) && Client.class.isAssignableFrom(f.getType())) {
                                f.setAccessible(true);
                                try {
                                    Object obj = f.get(null);
                                    if (obj != null) {
                                        clientInstance = (Client) obj;
                                        System.out.println("[AGENT] Client hooked via field: "
                                                + cls.getSimpleName() + "." + f.getName()
                                                + " after " + attempts + " polls");
                                        init(clientInstance);
                                        return;
                                    }
                                } catch (Exception ignored) {}
                            }
                        }
                    }

                } catch (ClassNotFoundException ex) {
                    // ignore if a class doesn't exist
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {}
            }

            if (clientInstance == null) {
                System.out.println("[AGENT] ERROR: Could not find Client after " + attempts + " polls");
            }
        }, "Client-Hook").start();
    }

    // Register a script/plugin
    public static void registerScript(Runnable r) {
        scripts.add(r);
        System.out.println("[AGENT] Script registered: " + r.getClass().getName());
    }

    // Initialize Agent once client is found
    public static void init(Client client) {
        clientInstance = client;
        System.out.println("[AGENT] Client fully initialized: " + clientInstance);

        running = true;
        Thread heartbeat = new Thread(() -> {
            while (running) {
                try {
                    for (Runnable script : scripts) {
                        try {
                            script.run();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Agent-Heartbeat");

        heartbeat.setDaemon(true);
        heartbeat.start();
    }

    public static void shutdown() {
        running = false;
    }

    public static void attackNpc(NPC npc) {
        if (clientInstance == null || npc == null) {
            System.out.println("[AGENT] Client or NPC is null!");
            return;
        }

        Player localPlayer = clientInstance.getLocalPlayer();
        if (localPlayer == null) return;

        WorldPoint playerLoc = localPlayer.getWorldLocation();
        WorldPoint npcLoc = npc.getWorldLocation();
        if (playerLoc == null || npcLoc == null) return;

        if (playerLoc.distanceTo(npcLoc) > 1) return;

        try {
            // fw.a is the RSPS attack method
            fw.a(
                    playerLoc.getX(),
                    playerLoc.getY(),
                    20,
                    npc.getIndex(),
                    0,
                    npc.getId(),
                    "Attack",
                    npc.getName(),
                    -1,
                    -1
            );

            System.out.println("[AGENT] Sent attack to NPC index " + npc.getIndex());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
