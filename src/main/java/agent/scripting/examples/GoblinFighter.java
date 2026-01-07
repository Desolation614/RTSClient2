package agent.examples;

import agent.Agent;
import agent.scripting.Script;
import agent.scripting.ScriptManager;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.WorldView;
import net.runelite.api.coords.WorldPoint;

public class GoblinFighter implements Script
{
    private final Client client;

    private static final int MAX_DISTANCE = 5;

    public GoblinFighter(Client client)
    {
        this.client = client;
    }

    @Override
    public void onStart()
    {
        System.out.println("[GoblinFighter] Script started");
    }

    @Override
    public void onTick()
    {
        if (client == null)
        {
            return;
        }

        Player localPlayer = client.getLocalPlayer();
        if (localPlayer == null)
        {
            return;
        }

        WorldPoint playerLoc = localPlayer.getWorldLocation();
        if (playerLoc == null)
        {
            return;
        }

        WorldView wv = client.getTopLevelWorldView();
        if (wv == null)
        {
            return;
        }

        for (NPC npc : wv.npcs())
        {
            if (npc == null)
            {
                continue;
            }

            String name = npc.getName();
            if (name == null)
            {
                continue;
            }

            if (npc.getHealthRatio() <= 0)
            {
                continue; // dead/invalid
            }

            if (!name.equalsIgnoreCase("Goblin"))
            {
                continue;
            }

            WorldPoint npcLoc = npc.getWorldLocation();
            if (npcLoc == null)
            {
                continue;
            }

            if (npcLoc.distanceTo(playerLoc) > MAX_DISTANCE)
            {
                continue;
            }

            Agent.attackNpc(npc);
            System.out.println("[GoblinFighter] Attacking goblin index=" + npc.getIndex() + " id=" + npc.getId());
            return; // one action per tick
        }
    }

    @Override
    public void onStop()
    {
        System.out.println("[GoblinFighter] Script stopped");
    }

    public static void register(Client client)
    {
        ScriptManager.register(new GoblinFighter(client));
    }
}
