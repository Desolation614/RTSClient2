package agent.examples;

import agent.Agent;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.WorldView;
import net.runelite.api.coords.WorldPoint;

public class GoblinFighter implements Runnable {
    private final Client client;

    private static final int MAX_DISTANCE = 5;

    public GoblinFighter(Client client) {
        this.client = client;
    }

    @Override
    public void run() {
        if (client == null) return;

        Player localPlayer = client.getLocalPlayer();
        if (localPlayer == null) return;

        WorldPoint playerLoc = localPlayer.getWorldLocation();
        if (playerLoc == null) return;

        WorldView wv = client.getTopLevelWorldView();
        if (wv == null) return;

        for (NPC npc : wv.npcs()) {
            if (npc == null || npc.getHealthRatio() <= 0) continue;
            if (!"Goblin".equalsIgnoreCase(npc.getName())) continue;

            WorldPoint npcLoc = npc.getWorldLocation();
            if (npcLoc == null || playerLoc.distanceTo(npcLoc) > MAX_DISTANCE) continue;

            Agent.attackNpc(npc);
            System.out.println("[GoblinFighter] Attacking goblin index=" + npc.getIndex() + " id=" + npc.getId());
            return; // one action per tick
        }
    }
}
