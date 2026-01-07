package agent.scripting;

import net.runelite.api.Client;
import net.runelite.api.GameState;
import java.util.ArrayList;
import java.util.List;

public class ScriptManager {
    private static final List<Script> scripts = new ArrayList<>();
    private static boolean registeredGoblinFighter = false;  // Prevent duplicates

    public static void register(Script script) {
        scripts.add(script);
        System.out.println("[ScriptManager] Registered: " + script.getClass().getSimpleName());
    }

    // NEW: Safe registration for GoblinFighter - called from client tick
    public static void registerIfReady() {
        if (registeredGoblinFighter) return;  // Already done

        Client client = getClient();  // Assume getClient() exists from RuneLite hook
        if (client == null || client.getGameState() != GameState.LOGGEDIN || client.getNpcs() == null) {
            return;  // Not ready yet
        }

        register(new GoblinFighter());
        registeredGoblinFighter = true;
        System.out.println("[ScriptManager] GoblinFighter registered - client ready");
    }

    public static void startAll() {
        for (Script script : scripts) {
            script.onStart();
        }
    }

    public static void tickAll() {
        for (Script script : scripts) {
            script.onTick();
        }
    }

    public static void stopAll() {
        for (Script script : scripts) {
            script.onStop();
        }
        scripts.clear();
        registeredGoblinFighter = false;
    }

    // Helper - replace with your actual client accessor
    private static Client getClient() {
        return net.runelite.api.ClientThread.INSTANCE.get();  // Or your hook
    }
}
