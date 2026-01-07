package agent;

import net.runelite.api.Client;
import scripts.GoblinFighter;
import agent.scripting.ScriptManager;

public class TestLauncher {
    public static void main(String[] args) {
        System.out.println("[TestLauncher] Starting offline GoblinFighter test...");

        // Create or hook your offline/fake client
        Client client = FakeClient.create(); // see below: simple offline implementation
        if (client == null) {
            System.out.println("[TestLauncher] Failed to create fake client");
            return;
        }

        // Initialize agent with the client
        Agent.init(client);

        // Register GoblinFighter script
        ScriptManager.register(new GoblinFighter(client));

        // Start scripts
        ScriptManager.startAll();

        System.out.println("[TestLauncher] Scripts started. Heartbeat running...");
        // Agent will tick scripts automatically in its heartbeat thread
    }
}
