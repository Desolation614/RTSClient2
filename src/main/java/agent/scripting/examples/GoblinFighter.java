package agent.examples;

import agent.Agent;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;

public class GoblinFighter implements Runnable {
    private static final int MAX_DISTANCE = 5;

    @Override
    public void run() {
        // Use Agent's client (already hooked)
        Client client = Agent.clientInstance;
        if (client == null) return;

        Player localPlayer = client.getLocalPlayer();
        if (localPlayer == null) return;

        WorldPoint playerLoc = localPlayer.getWorldLocation();
        if (playerLoc == null) return;

        // Ferox uses client.getNpcs() (no WorldView needed)
        NPC target = client.getNpcs().stream()
                .filter(npc -> npc != null)
                .filter(npc -> npc.getHealthRatio() > 0)
                .filter(npc -> npc.getName() != null && npc.getName().toLowerCase().contains("goblin"))
                .filter(npc -> {
                    WorldPoint npcLoc = npc.getWorldLocation();
                    return npcLoc != null && playerLoc.distanceTo(npcLoc) <= MAX_DISTANCE;
                })
                .min((a, b) -> {
                    // Prefer closest + lowest HP
                    int da = playerLoc.distanceTo(a.getWorldLocation());
                    int db = playerLoc.distanceTo(b.getWorldLocation());
                    return Integer.compare(da, db);
                })
                .orElse(null);

        if (target != null) {
            Agent.attackNpc(target);
            System.out.println("[GoblinFighter] Attacking goblin #" + target.getIndex()
                    + " id=" + target.getId() + " dist=" + playerLoc.distanceTo(target.getWorldLocation()));
        }
    }
}
