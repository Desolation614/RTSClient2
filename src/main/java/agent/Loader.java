package agent;

public class Loader {
    public static void init() {
        System.out.println("[Loader] Initializing scripts...");

        // Register immediately - Agent.heartbeat handles null-safety
        Agent.registerScript(new agent.examples.GoblinFighter());

        // Optional: heartbeat confirmation
        new Thread(() -> {
            int polls = 0;
            while (polls < 100) {
                polls++;
                if (Agent.clientInstance != null) {
                    System.out.println("[Loader] Scripts active after " + polls + " polls");
                    return;
                }
                try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
            }
            System.out.println("[Loader] Client still loading...");
        }, "Loader-Confirm").start();
    }
}
