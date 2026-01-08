package agent.scripting;

import agent.scripting.Agent;
import agent.scripting.scripts.Script;
import java.util.ArrayList;
import java.util.List;

public class ScriptManager {
    private static final List<Script> scripts = new ArrayList<>();

    public static void register(Script script) {
        if (script != null && !scripts.contains(script)) {
            scripts.add(script);
            script.onStart();
            System.out.println("[ScriptManager] Started: " + script.getClass().getSimpleName());
        }
    }

    public static void tickAll() {
        for (Script script : scripts) {
            try {
                script.onTick();
            } catch (Throwable ignored) {}  // Silent fail - other scripts don't block
        }
    }
}
