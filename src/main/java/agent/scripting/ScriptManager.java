package agent.scripting;

import agent.scripting.scripts.GoblinPrinter;
import agent.scripting.scripts.Script;

import java.util.ArrayList;
import java.util.List;

public class ScriptManager {
    private static final List<Script> scripts = new ArrayList<>();
    private static boolean registeredGoblinFighter = false;

    public static void registerIfReady() {
        if (registeredGoblinFighter) return;
        if (Agent.clientInstance == null) return;

        // register GoblinPrinter with raw client
        register(new GoblinPrinter());


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