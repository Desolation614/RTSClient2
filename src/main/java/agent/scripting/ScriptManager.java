package agent.scripting;

import java.util.ArrayList;
import java.util.List;

public class ScriptManager {
    private static final List<Script> scripts = new ArrayList<>();

    public static void register(Script script) {
        scripts.add(script);
        System.out.println("[ScriptManager] Registered: " + script.getClass().getSimpleName());
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
    }
}
