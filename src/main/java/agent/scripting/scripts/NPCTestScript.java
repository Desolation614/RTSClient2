package agent.scripting.scripts;
import agent.scripting.scripts.Script;
import java.util.List;

/**
 * NPCTestScript - Test script that discovers NPCs every 10 ticks
 * 
 * Usage:
 *   1. Call NPCDiscovery.init() once at startup
 *   2. Register this script: ScriptManager.register(new NPCTestScript())
 *   3. Script will tick every ~600ms and discover NPCs every 10 ticks
 * 
 * Expected output:
 *   [NPC-TEST] ========== NPC Discovery Cycle ========== (tick 10)
 *   [NPC-TEST] Total NPCs found: 5
 *   [NPC-TEST]   NPC{id=8342, name='Goblin', pos=(100,200), class=kc}
 *   ...
 */
public class NPCTestScript implements Script {


    private static final String TAG = "[NPC-TEST]";
    private static final int DISCOVERY_INTERVAL = 10;  // Every 10 ticks (~6 seconds)

    private int tickCounter = 0;

    @Override
    public void onTick() {
        tickCounter++;

        // Discover NPCs every DISCOVERY_INTERVAL ticks
        if (tickCounter % DISCOVERY_INTERVAL == 0) {
            discoverAndPrintNPCs();
        }
    }

    private void discoverAndPrintNPCs() {
        System.out.println(TAG + " ========== NPC Discovery Cycle ========== (tick " + tickCounter + ")");

        try {
            List<NPCDiscovery.NPCData> npcs = NPCDiscovery.discoverNPCs();

            System.out.println(TAG + " Total NPCs found: " + npcs.size());
            System.out.println(TAG + " ===== NPC List =====");

            for (NPCDiscovery.NPCData npc : npcs) {
                System.out.println(TAG + "   " + npc);
            }

            System.out.println(TAG + " ===== END =====");
            System.out.println(TAG + " ==========================================");

        } catch (Exception e) {
            System.err.println(TAG + " Discovery cycle failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void onStart() {
        System.out.println(TAG + " Script started");
    }

    @Override
    public void onStop() {
        System.out.println(TAG + " Script stopped");
    }
}
