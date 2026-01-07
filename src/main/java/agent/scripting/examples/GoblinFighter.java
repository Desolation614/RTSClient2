package agent.examples;

import agent.Agent;
import agent.scripting.Script;
import agent.scripting.ScriptManager;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;

import java.util.List;

public class GoblinFighter extends Script {

    private final Client client;

    // Optional: distance within which to attack
    private final int MAX_DISTANCE = 5;

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

        // Get all NPCs from RuneLite (read-only)
        List<NPC> npcs = client.getNpcs();

        for (NPC npc : npcs) {
            if (npc == null) continue;
            if (npc.getHealthRatio() <= 0) continue; // skip dead NPCs
            if (!npc.getName().equalsIgnoreCase("Goblin")) continue; // target goblins only

            WorldPoint npcLoc = npc.getWorldLocation();
            if (npcLoc.distanceTo(playerLoc) > MAX_DISTANCE) continue;

            // Attack using fw.a(...) via Agent helper
            Agent.attackNpc(npc);

            System.out.println("[GoblinFighter] Attacking goblin index=" + npc.getIndex() + " id=" + npc.getId());
        }
    }

    @Override
    public void onStop() {
        System.out.println("[GoblinFighter] Script stopped");
    }

    // Optional: register automatically when class is loaded
    public static void register(Client client) {
        ScriptManager.register(new GoblinFighter(client));
    }
}
