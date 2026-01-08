package agent.scripting.scripts;

import agent.scripting.Agent;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import java.util.List;

public class GoblinPrinter implements Script
{
    private static final String TAG = "[GoblinPrinter]";
    private static final int CHECK_INTERVAL = 10;
    private int tickCounter = 0;

    @Override
    public void onStart()
    {
        System.out.println(TAG + " Script started!");
    }

    @Override
    public void onStop()
    {
        System.out.println(TAG + " Script stopped!");
    }

    @Override
    public void onTick()
    {
        tickCounter++;

        if (tickCounter % CHECK_INTERVAL != 0)
        {
            return;
        }

        Agent.runOnClientThread(this::countGoblins);
    }

    private void countGoblins()
    {
        Client client = Agent.clientInstance;
        if (client == null)
        {
            return;
        }

        List<NPC> npcs = client.getNpcs();
        if (npcs == null || npcs.isEmpty())
        {
            return;
        }

        int goblinCount = 0;
        for (NPC npc : npcs)
        {
            if (npc == null || npc.getName() == null)
            {
                continue;
            }

            if (npc.getName().toLowerCase().contains("goblin"))
            {
                goblinCount++;
            }
        }

        System.out.println(TAG + " Goblins around you: " + goblinCount);
    }
}
