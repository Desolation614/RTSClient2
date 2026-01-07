package agent;

public class Loader {
    public static void init() {
        System.out.println("[Loader] Initializing scripts...");
        if (Agent.clientInstance != null) {
            agent.examples.GoblinFighter.register(Agent.clientInstance);
        } else {
            System.out.println("[Loader] ERROR: Client instance is null!");
        }
    }
}
