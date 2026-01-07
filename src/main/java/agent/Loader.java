package agent;

public class Loader {
    public static void init() {
        System.out.println("[Loader] Initializing scripts...");
        agent.scripting.examples.GoblinFighter.register();
    }
}