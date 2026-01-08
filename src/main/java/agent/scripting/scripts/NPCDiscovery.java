package agent.scripting.scripts;

import java.lang.reflect.*;
import java.util.*;

/**
 * NPCDiscovery - Runtime NPC discovery via reflection
 *
 * Access path (bytecode-verified):
 *   osrs.aM.a (static kd instance)
 *     └─ kd.g (IndexedObjectSet of NPCs)
 *       └─ iterate and extract
 *
 * Usage:
 *   NPCDiscovery.init();  // Call once at startup
 *   List<NPCData> npcs = NPCDiscovery.discoverNPCs();
 */
public class NPCDiscovery {

    // Cached reflection lookups
    private static Class<?> amClass;
    private static Field amFieldA;
    private static Class<?> kdClass;
    private static Field kdFieldG;
    private static Class<?> ggClass;
    private static Method ggIterator;
    private static Method ggA;
    private static Method ggB;
    private static Field ggBackingArray;

    private static boolean initialized = false;
    private static final String TAG = "[NPC-DISCOVERY]";

    /**
     * Initialize reflection caches (call once at startup)
     */
    public static void init() {
        if (initialized) return;

        try {
            // Find osrs.aM
            amClass = Class.forName("osrs.aM");
            System.out.println(TAG + " Found aM class: " + amClass);

            // Find osrs.kd
            kdClass = Class.forName("osrs.kd");
            System.out.println(TAG + " Found kd class: " + kdClass);

            // Find osrs.gg
            ggClass = Class.forName("osrs.gg");
            System.out.println(TAG + " Found gg class: " + ggClass);

            // Cache aM.a field (static kd instance)
            amFieldA = amClass.getDeclaredField("a");
            amFieldA.setAccessible(true);
            System.out.println(TAG + " Cached aM.a field");

            // Cache kd.g field (NPC container)
            kdFieldG = kdClass.getDeclaredField("g");
            kdFieldG.setAccessible(true);
            System.out.println(TAG + " Cached kd.g field");

            // Try to cache gg methods (may not exist)
            try {
                ggIterator = ggClass.getMethod("iterator");
                ggIterator.setAccessible(true);
            } catch (NoSuchMethodException ignored) {}

            try {
                ggA = ggClass.getMethod("a");
                ggA.setAccessible(true);
            } catch (NoSuchMethodException ignored) {}

            try {
                ggB = ggClass.getMethod("b");
                ggB.setAccessible(true);
            } catch (NoSuchMethodException ignored) {}

            // Try to cache backing array field
            try {
                ggBackingArray = ggClass.getDeclaredField("a");
                ggBackingArray.setAccessible(true);
            } catch (NoSuchFieldException ignored) {}

            initialized = true;
            System.out.println(TAG + " Initialization complete");

        } catch (Exception e) {
            System.err.println(TAG + " Initialization failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Discover all NPCs in current world
     */
    public static List<NPCData> discoverNPCs() {
        List<NPCData> result = new ArrayList<>();

        if (!initialized) {
            System.err.println(TAG + " Not initialized! Call init() first.");
            return result;
        }

        try {
            // Get kd instance from static aM.a
            Object kdInstance = amFieldA.get(null);
            if (kdInstance == null) {
                System.err.println(TAG + " kd instance is null");
                return result;
            }
            System.out.println(TAG + " Got kd instance: " + kdInstance.getClass().getSimpleName());

            // Get NPC container (gg) from kd.g
            Object ggInstance = kdFieldG.get(kdInstance);
            if (ggInstance == null) {
                System.err.println(TAG + " gg instance is null");
                return result;
            }
            System.out.println(TAG + " Got gg instance (" + ggInstance.getClass().getSimpleName() + ")");

            // Count NPCs first
            int npcCount = getNPCCount(ggInstance);
            System.out.println(TAG + " Found " + npcCount + " NPC objects");

            // Try standard iterator first
            if (ggIterator != null) {
                try {
                    Object iter = ggIterator.invoke(ggInstance);
                    if (iter != null && iter instanceof Iterator) {
                        System.out.println(TAG + " [ITERATE] Used iterator() pattern, found " + npcCount + " NPCs");
                        Iterator<?> iterator = (Iterator<?>) iter;
                        while (iterator.hasNext()) {
                            Object npc = iterator.next();
                            NPCData data = extractNPCData(npc);
                            if (data != null) {
                                result.add(data);
                            }
                        }
                        return result;
                    }
                } catch (Exception e) {
                    System.out.println(TAG + " [ITERATE] iterator() failed: " + e.getMessage());
                }
            }

            // Try gg.a() / gg.b() pattern (first/next)
            if (ggA != null && ggB != null) {
                try {
                    System.out.println(TAG + " [ITERATE] Trying a()/b() pattern");
                    Object current = ggA.invoke(ggInstance);
                    int count = 0;
                    while (current != null && count < 10000) {
                        NPCData data = extractNPCData(current);
                        if (data != null) {
                            result.add(data);
                        }
                        current = ggB.invoke(ggInstance);
                        count++;
                    }
                    if (count > 0) {
                        System.out.println(TAG + " [ITERATE] a()/b() pattern succeeded, " + result.size() + " NPCs");
                        return result;
                    }
                } catch (Exception e) {
                    System.out.println(TAG + " [ITERATE] a()/b() failed: " + e.getMessage());
                }
            }

            // Try backing array field
            if (ggBackingArray != null) {
                try {
                    System.out.println(TAG + " [ITERATE] Trying backing array field");
                    Object[] array = (Object[]) ggBackingArray.get(ggInstance);
                    if (array != null) {
                        for (Object npc : array) {
                            if (npc != null) {
                                NPCData data = extractNPCData(npc);
                                if (data != null) {
                                    result.add(data);
                                }
                            }
                        }
                        if (result.size() > 0) {
                            System.out.println(TAG + " [ITERATE] Backing array succeeded, " + result.size() + " NPCs");
                            return result;
                        }
                    }
                } catch (Exception e) {
                    System.out.println(TAG + " [ITERATE] Backing array failed: " + e.getMessage());
                }
            }

            System.err.println(TAG + " [ITERATE-ERROR] Could not find working iteration pattern");

        } catch (Exception e) {
            System.err.println(TAG + " Discovery failed: " + e.getMessage());
            e.printStackTrace();
        }

        return result;
    }

    /**
     * Count NPCs in container (for logging)
     */
    private static int getNPCCount(Object ggInstance) {
        try {
            // Try size() method
            try {
                Method sizeMethod = ggInstance.getClass().getMethod("size");
                return (int) sizeMethod.invoke(ggInstance);
            } catch (NoSuchMethodException ignored) {}

            // Try backing array length
            try {
                Field backingArray = ggInstance.getClass().getDeclaredField("a");
                backingArray.setAccessible(true);
                Object[] array = (Object[]) backingArray.get(ggInstance);
                if (array != null) {
                    return array.length;
                }
            } catch (NoSuchFieldException ignored) {}

            // Fallback
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * Extract NPC data from an NPC object
     */
    private static NPCData extractNPCData(Object npc) {
        try {
            if (npc == null) return null;

            // Get NPC class (usually osrs.kc or similar)
            Class<?> npcClass = npc.getClass();
            String className = npcClass.getSimpleName();

            // Extract ID (usually int id field)
            int id = 0;
            try {
                Field idField = npcClass.getDeclaredField("id");
                idField.setAccessible(true);
                id = (int) idField.get(npc);
            } catch (Exception ignored) {}

            // Extract name (usually String name field)
            String name = null;
            try {
                Field nameField = npcClass.getDeclaredField("name");
                nameField.setAccessible(true);
                name = (String) nameField.get(npc);
            } catch (Exception ignored) {}

            // Extract position (usually int x, int y or localX, localY)
            int x = 0, y = 0;
            try {
                Field xField = npcClass.getDeclaredField("x");
                xField.setAccessible(true);
                x = (int) xField.get(npc);
            } catch (Exception ex1) {
                try {
                    Field xField = npcClass.getDeclaredField("localX");
                    xField.setAccessible(true);
                    x = (int) xField.get(npc);
                } catch (Exception ignored) {}
            }

            try {
                Field yField = npcClass.getDeclaredField("y");
                yField.setAccessible(true);
                y = (int) yField.get(npc);
            } catch (Exception ignored) {
                try {
                    Field yField = npcClass.getDeclaredField("localY");
                    yField.setAccessible(true);
                    y = (int) yField.get(npc);
                } catch (Exception ignored1) {}
            }

            return new NPCData(id, name, x, y, className);

        } catch (Exception e) {
            System.err.println(TAG + " Failed to extract NPC data: " + e.getMessage());
            return null;
        }
    }

    /**
     * NPC data container
     */
    public static class NPCData {
        public int id;
        public String name;
        public int x;
        public int y;
        public String className;

        public NPCData(int id, String name, int x, int y, String className) {
            this.id = id;
            this.name = name;
            this.x = x;
            this.y = y;
            this.className = className;
        }

        @Override
        public String toString() {
            return String.format("NPC{id=%d, name='%s', pos=(%d,%d), class=%s}",
                    id, name != null ? name : "null", x, y, className);
        }
    }
}