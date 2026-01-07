package agent;

public class Loader {
    public static void init() {
        System.out.println("[Loader] Initializing scripts...");

        new Thread(() -> {
            int polls = 0;
            while (polls < 1000) { // timeout after ~100s
                polls++;
                if (Agent.clientInstance != null) {
                    System.out.println("[Loader] Client found after " + polls + " polls, registering scripts...");

                    // Directly register GoblinFighter Runnable
                    Agent.registerScript(new agent.examples.GoblinFighter(Agent.clientInstance));

                    return;
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {}
            }
            System.out.println("[Loader] ERROR: Client timeout after " + polls + " polls");
        }, "Client-Polling").start();
    }
}
