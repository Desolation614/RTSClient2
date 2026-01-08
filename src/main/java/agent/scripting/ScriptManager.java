package agent.scripting;

import agent.Agent;
import agent.scripting.examples.GoblinPrinter;

import java.util.ArrayList;
import java.util.List;

public class ScriptManager {
    private static final List<Script> scripts = new ArrayList<>();
    private static boolean registeredGoblinFighter = false;

    public static void registerIfReady() {
        if (registeredGoblinFighter) return;
        if (Agent.clientInstance == null) return;

        // register GoblinPrinter with raw client
        register(new GoblinPrinter(Agent.clientInstance));

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
