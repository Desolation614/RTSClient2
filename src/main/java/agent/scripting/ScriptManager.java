package agent.scripting;

import agent.Agent;
import agent.scripting.examples.GoblinFighter;

import java.util.ArrayList;
import java.util.List;

public class ScriptManager {
    private static final List<Script> scripts = new ArrayList<>();
    private static boolean registeredGoblinFighter = false;

    public static void registerIfReady() {
        if (registeredGoblinFighter) return;

        if (Agent.clientInstance == null) return;

        // Only register when NPCs exist in the world
        if (Agent.clientInstance.getGameState() != net.runelite.api.GameState.LOGGED_IN) return;
        if (Agent.clientInstance.getNpcs() == null || Agent.clientInstance.getNpcs().isEmpty()) return;

        register(new GoblinFighter());
        registeredGoblinFighter = true;
        System.out.println("[ScriptManager] GoblinFighter registered!");
    }

    public static void register(Script script) {
        scripts.add(script);
    }

    public static void tickAll() {
        for (Script script : scripts) {
            try {
                script.onTick();
            } catch (Throwable t) {
                System.err.println("[ScriptManager] Script tick failed: " + t);
            }
        }
    }
}
