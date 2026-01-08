package agent.scripting;

public class Loader {
    public static void init() {
        System.out.println("[Loader] Initializing scripts...");

        // Register GoblinFighter via ScriptManager (handles readiness)
        // Agent.heartbeat already runs - ScriptManager checks client state
        //ScriptManager.registerIfReady();

        // Confirmation thread
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