package agent.scripting;

import net.runelite.api.Client;
import net.runelite.api.GameState;
import java.util.ArrayList;
import java.util.List;

public class ScriptManager {
    private static final List<Script> scripts = new ArrayList<>();
    private static boolean registeredGoblinFighter = false;

    public static void register(Script script) {
        scripts.add(script);
        System.out.println("[ScriptManager] Registered: " + script.getClass().getSimpleName());
    }

    public static void registerIfReady() {
        if (registeredGoblinFighter) return;
        Client client = agent.Agent.clientInstance;
        if (client == null || client.getGameState() != GameState.LOGGED_IN || client.getNpcs() == null) {
            return;
        }
        register(new agent.scripting.examples.GoblinFighter());
        registeredGoblinFighter = true;
        System.out.println("[ScriptManager] GoblinFighter registered - client ready");
        ScriptManager.startAll();
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
}
