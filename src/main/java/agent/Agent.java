package agent;

import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.MenuAction;
import net.runelite.api.coords.WorldPoint;
import osrs.fw; // only if needed for raw attack packet

import java.util.ArrayList;
import java.util.List;

public class Agent {

    public static Client clientInstance;
    private static final List<Runnable> scripts = new ArrayList<>();
    private static boolean running = false;

    // Register a script/plugin
    public static void registerScript(Runnable r) {
        scripts.add(r);
        System.out.println("[AGENT] Script registered: " + r.getClass().getName());
    }

    // Initialize for offline/standalone
    public static void init(Client client) {
        clientInstance = client;
        System.out.println("[AGENT] Client hooked: " + clientInstance);

        Loader.init(); // any initialization logic

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
                    Thread.sleep(100); // 10 ticks
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

    // Attack an NPC using RuneLite's menu system
    public static void attackNpc(NPC npc) {
        if (clientInstance == null || npc == null) {
            System.out.println("[AGENT] Client or NPC is null!");
            return;
        }

        Player localPlayer = clientInstance.getLocalPlayer();
        if (localPlayer == null) return;

        WorldPoint playerLoc = localPlayer.getWorldLocation();
        WorldPoint npcLoc = npc.getWorldLocation();

        int distance = playerLoc.distanceTo(npcLoc);
        if (distance > 1) return; // Only attack in range

        try {
            // Prefer RuneLite API interaction if available
            npc.interact("Attack");

            System.out.println("[AGENT] Sent attack interaction to NPC index " + npc.getIndex());
        } catch (Exception e) {
            e.printStackTrace();

            // Fallback: raw packet call via fw
            try {
                fw.a(
                        playerLoc.getX(),
                        playerLoc.getY(),
                        20,           // opcode for attack
                        npc.getIndex(),
                        0,
                        npc.getId(),
                        "Attack",
                        npc.getName(),
                        -1,
                        -1
                );
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
