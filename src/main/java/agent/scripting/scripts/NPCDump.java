import java.lang.reflect.Field;
import osrs.kd;
import osrs.gg;

public class NPCDump {

    public static void dumpNPCs(Object clientInstance) {
        try {
            // Access the 'kd' class (NPC container class)
            Class<?> kdClass = Class.forName("osrs.kd");
            Field gField = kdClass.getDeclaredField("g");
            gField.setAccessible(true);

            // Get the 'gg' object, which holds the list of NPCs
            Object gg = gField.get(clientInstance);

            // Now let's inspect the 'gg' object (which is likely a linked list, deque, or array)
            if (gg != null) {
                // Inspect the class of 'gg'
                System.out.println("Found gg object of class: " + gg.getClass().getName());

                // Attempt to inspect NPCs directly if it's a list/array
                // Assuming it's an array or something iterable, we try basic array iteration first
                if (gg.getClass().isArray()) {
                    Object[] npcs = (Object[]) gg;
                    System.out.println("Found " + npcs.length + " NPCs in gg.");
                    for (Object npc : npcs) {
                        if (npc != null) {
                            // Dump basic NPC info here (adjust field names accordingly)
                            System.out.println("NPC: " + npc.getClass().getName() + ", Name: " + getNpcName(npc));
                        }
                    }
                } else {
                    // Fallback: print fields if it's a collection or linked list
                    Field[] fields = gg.getClass().getDeclaredFields();
                    for (Field field : fields) {
                        field.setAccessible(true);
                        System.out.println("Field: " + field.getName() + " = " + field.get(gg));
                    }
                }
            } else {
                System.out.println("No NPC container (gg) found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper function to fetch NPC name (assuming there's a field for the name in NPCs)
    private static String getNpcName(Object npc) {
        try {
            Field nameField = npc.getClass().getDeclaredField("name");
            nameField.setAccessible(true);
            return (String) nameField.get(npc);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            return "Unknown NPC";
        }
    }
}
