package agent;

import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;

import java.util.ArrayList;
import java.util.List;

/**
 * Minimal offline Client stub for testing scripts
 */
public class FakeClient {

    public static Client create() {
        return new Client() {
            // Example player stub
            @Override
            public Player getLocalPlayer() {
                return new Player() {
                    @Override
                    public WorldPoint getWorldLocation() {
                        return new WorldPoint(3200, 3200, 0); // sample coords
                    }

                    // implement other Player methods if GoblinFighter needs them
                };
            }

            // Example NPC list stub
            @Override
            public List<NPC> getNpcs() {
                List<NPC> npcs = new ArrayList<>();

                // Add one Goblin-like NPC
                npcs.add(new NPC() {
                    @Override
                    public int getId() {
                        return 9857; // Goblin ID
                    }

                    @Override
                    public int getIndex() {
                        return 0;
                    }

                    @Override
                    public int getHealthRatio() {
                        return 100; // alive
                    }

                    @Override
                    public WorldPoint getWorldLocation() {
                        return new WorldPoint(3201, 3200, 0);
                    }

                    // implement other NPC methods if needed
                });

                return npcs;
            }

            // Stub other Client methods to avoid nulls if needed
        };
    }
}
