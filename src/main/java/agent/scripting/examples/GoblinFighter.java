package agent.scripting.examples;

import agent.Agent;
import agent.scripting.Script;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;

public class GoblinFighter implements Script {
    private static final int GOBLIN_ID = 3239;
    private static final int MAX_DIST = 10;
    private static final long ATTACK_COOLDOWN = 1000; // ms between attacks

    private long lastAttackTime = 0;

    @Override
    public void onStart() {
        System.out.println("[GoblinFighter] Started");
    }

    @Override
    public void onTick() {
        Client client = Agent.clientInstance;
        if (client == null) return;

        Player local = client.getLocalPlayer();
        if (local == null) return;

        WorldPoint pLoc = local.getWorldLocation();
        if (pLoc == null) return;

        if (client.getNpcs() == null) return;

        // Avoid attacking too frequently
        if (System.currentTimeMillis() - lastAttackTime < ATTACK_COOLDOWN) return;

        NPC goblin = client.getNpcs().stream()
                .filter(n -> n != null && n.getId() == GOBLIN_ID)
                .filter(n -> n.getHealthRatio() > 0)
                .filter(n -> {
                    WorldPoint npcLoc = n.getWorldLocation();
                    return npcLoc != null && pLoc.distanceTo(npcLoc) <= MAX_DIST;
                })
                .min((a, b) -> Integer.compare(
                        pLoc.distanceTo(a.getWorldLocation()),
                        pLoc.distanceTo(b.getWorldLocation())
                ))
                .orElse(null);

        if (goblin != null) {
            System.out.println("[GoblinFighter] Attacking goblin at " + goblin.getWorldLocation());
            Agent.attackNpc(goblin);
            lastAttackTime = System.currentTimeMillis();
        }
    }

    @Override
    public void onStop() {
        System.out.println("[GoblinFighter] Stopped");
    }
}
