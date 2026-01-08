package agent.scripting.examples;

import agent.scripting.Script;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GoblinPrinter implements Script {

    private final Object client;

    public GoblinPrinter(Object client) {
        this.client = client;
    }

    @Override
    public void onStart() {
        System.out.println("[GoblinPrinter] Script started!");
    }

    @Override
    public void onStop() {
        System.out.println("[GoblinPrinter] Script stopped!");
    }

    @Override
    public void onTick() {
        try {
            // 1. Find the field in client that is of type 'kd'
            Field kdField = null;
            for (Field f : client.getClass().getDeclaredFields()) {
                if (f.getType().getSimpleName().equals("kd")) {
                    f.setAccessible(true);
                    kdField = f;
                    break;
                }
            }

            if (kdField == null) {
                System.err.println("[GoblinPrinter] No field in client is of type kd!");
                return;
            }

            Object kdInstance = kdField.get(client);
            if (kdInstance == null) {
                System.err.println("[GoblinPrinter] kd instance is null!");
                return;
            }

            // 2. Call npcs() on kd instance
            Method npcsMethod = kdInstance.getClass().getDeclaredMethod("npcs");
            npcsMethod.setAccessible(true);
            Object npcsObj = npcsMethod.invoke(kdInstance);

            if (npcsObj == null) {
                System.err.println("[GoblinPrinter] NPC list is null");
                return;
            }

            // 3. Iterate
            Iterable<?> npcsIterable = (Iterable<?>) npcsObj;
            for (Object npc : npcsIterable) {
                System.out.println("[GoblinPrinter] Found NPC: " + npc);
            }

        } catch (Exception e) {
            System.err.println("[GoblinPrinter] Failed to fetch NPCs: " + e);
        }
    }
}
