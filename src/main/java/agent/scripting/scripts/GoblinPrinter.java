package agent.scripting.scripts;

import agent.scripting.Agent;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import java.util.List;

public class GoblinPrinter implements Script {
    private static final String TAG = "[Goblin]";
    private int tickCounter = 0;

    @Override
    public void onStart() {
        System.out.println(TAG + " ACTIVE");
    }

    @Override
    public void onTick() {
        // CRITICAL: Use client thread for NPC access
        Agent.runOnClientThread(() -> {
            Client client = Agent.clientInstance;
            if (client == null || client.getGameState() != GameState.LOGGED_IN) return;

            Player local = client.getLocalPlayer();
            if (local == null) return;

            List<NPC> npcs = client.getNpcs();
            if (npcs == null || npcs.isEmpty()) return;

            int goblinCount = 0;
            for (NPC npc : npcs) {
                if (npc != null && npc.getName() != null && npc.getName().toLowerCase().contains("goblin")) {
                    goblinCount++;
                    System.out.println(TAG + " #" + goblinCount + " idx=" + npc.getIndex() + " id=" + npc.getId());
                }
            }

            if (goblinCount > 0) {
                System.out.println(TAG + " TOTAL: " + goblinCount);
            }
        });
    }


    private NPC getNearestGoblin(List<NPC> npcs) {
        NPC nearest = null;
        int minDist = Integer.MAX_VALUE;
        Player local = Agent.clientInstance.getLocalPlayer();

        for (NPC npc : npcs) {
            if (npc != null && npc.getName() != null && npc.getName().toLowerCase().contains("goblin")) {
                int dist = local.getWorldLocation().distanceTo(npc.getWorldLocation());
                if (dist < minDist) {
                    minDist = dist;
                    nearest = npc;
                }
            }
        }
        return nearest;
    }

    @Override
    public void onStop() {}
}
