package agent;

import osrs.fw;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;

import java.lang.instrument.Instrumentation;
import java.util.ArrayList;
import java.util.List;

public class Agent {

    public static Client clientInstance;
    private static final List<Runnable> scripts = new ArrayList<>();
    private static boolean running = false;

    // --- javaagent entrypoint ---
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("[AGENT] premain called, instrumentation=" + inst);
        Loader.init();  // <-- this wires your existing Client hook
    }


    // Register a script/plugin
    public static void registerScript(Runnable r) {
        scripts.add(r);
        System.out.println("[AGENT] Script registered: " + r.getClass().getName());
    }

    // Initialize for offline/standalone (called from your hook once you have Client)
    public static void init(Client client) {
        clientInstance = client;
        System.out.println("[AGENT] Client hooked: " + clientInstance);

        Loader.init();

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
        if (localPlayer == null) {
            return;
        }

        WorldPoint playerLoc = localPlayer.getWorldLocation();
        WorldPoint npcLoc = npc.getWorldLocation();
        if (playerLoc == null || npcLoc == null) {
            return;
        }

        if (playerLoc.distanceTo(npcLoc) > 1) {
            return;
        }

        try {
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

            System.out.println("[AGENT] Sent attack interaction to NPC index " + npc.getIndex());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
