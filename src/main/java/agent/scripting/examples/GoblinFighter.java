package scripts;

import agent.Agent;
import agent.scripting.Script;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;

import java.util.List;

public class GoblinFighter extends Script {

    private final Client client;
    private final int GOBLIN_ID = 9857;

    public GoblinFighter(Client client) {
        super("GoblinFighter");
        this.client = client;
    }

    @Override
    public void onStart() {
        System.out.println("[GoblinFighter] Script started");
    }

    @Override
    public void onTick() {
        if (client == null) return;

        Player localPlayer = client.getLocalPlayer();
        if (localPlayer == null) return;

        WorldPoint playerLoc = localPlayer.getWorldLocation();
        List<NPC> npcs = client.getNpcs();

        for (NPC npc : npcs) {
            if (npc == null) continue;
            if (npc.getId() != GOBLIN_ID) continue;
            if (npc.getHealthRatio() <= 0) continue; // skip dead

            WorldPoint npcLoc = npc.getWorldLocation();
            if (npcLoc.distanceTo(playerLoc) > 1) continue;

            // Attack using Agent
            Agent.attackNpc(npc);

            System.out.println("[GoblinFighter] Attacking goblin " + npc.getIndex());
        }
    }

    @Override
    public void onStop() {
        System.out.println("[GoblinFighter] Script stopped");
    }
}
