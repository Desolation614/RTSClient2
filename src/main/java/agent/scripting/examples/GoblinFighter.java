package agent.scripting.examples;

import agent.Agent;
import agent.scripting.Script;
import net.runelite.api.Client;
import net.runelite.api.NPC;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GoblinFighter implements Script {
    private static final int[] GOBLIN_IDS = {9857, 9858, 9859};
    private static final int MAX_DIST = 10;
    private static final long ATTACK_COOLDOWN = 1500;

    private long lastAttackTime = 0;

    @Override
    public void onStart() {
        System.out.println("[GoblinFighter] Script started!");
    }

    @Override
    public void onTick() {
        try {
            Client client = Agent.clientInstance;

            // Find the 'kd' field in the client
            Field kdField = null;
            for (Field f : client.getClass().getDeclaredFields()) {
                if (f.getType().getSimpleName().equals("kd")) {
                    kdField = f;
                    kdField.setAccessible(true);
                    break;
                }
            }
            if (kdField == null) return;

            Object kdInstance = kdField.get(client);

            // Get the npcs() method from kd
            Method npcsMethod = kdInstance.getClass().getDeclaredMethod("npcs");
            npcsMethod.setAccessible(true);
            Object npcSetObj = npcsMethod.invoke(kdInstance);
            if (npcSetObj == null) return;

            // IndexedObjectSet implements Iterable, so we can loop directly
            for (Object npcObj : (Iterable<?>) npcSetObj) {
                if (npcObj == null) continue;
                NPC npc = (NPC) npcObj;

                // Skip dead or out-of-range NPCs
                if (npc.getHealthRatio() <= 0) continue;
                if (client.getLocalPlayer().getWorldLocation().distanceTo(npc.getWorldLocation()) > MAX_DIST) continue;

                // Only attack goblins
                boolean isGoblin = false;
                for (int id : GOBLIN_IDS) {
                    if (id == npc.getId()) {
                        isGoblin = true;
                        break;
                    }
                }
                if (!isGoblin) continue;

                // Respect attack cooldown
                if (System.currentTimeMillis() - lastAttackTime < ATTACK_COOLDOWN) continue;

                // Attack the goblin
                System.out.println("[GoblinFighter] Attacking goblin ID=" + npc.getId() + " idx=" + npc.getIndex());
                Agent.attackNpc(npc);
                lastAttackTime = System.currentTimeMillis();
                break; // attack only one per tick
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onStop() {
        System.out.println("[GoblinFighter] Script stopped!");
    }
}
