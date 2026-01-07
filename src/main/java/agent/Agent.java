package agent;

import agent.scripting.ScriptManager;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.GameState;

import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Agent {

    public static volatile Client clientInstance;

    private static final List<Runnable> scripts = new ArrayList<>();
    private static volatile boolean running = false;
    private static volatile boolean initialized = false;

    private static volatile Method fwAMethod = null;
    private static volatile Instrumentation instrumentation;

    public static Instrumentation getInstrumentation() {
        return instrumentation;
    }

    // =======================
    // premain ENTRYPOINT
    // =======================
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("[AGENT] premain - initializing agent");
        instrumentation = inst;

        Loader.init();

        // Static-field client hook (deterministic)
        hookClientStaticField();

        // Cache fw.a method for attacks
        tryFwCapture();

        // Start heartbeat and script runner
        startHeartbeat();
    }

    // =======================
    // CLIENT HOOKING
    // =======================
    private static void hookClientStaticField() {
        try {
            Class<?> dfCls = Class.forName("osrs.dF");
            Field clientField = dfCls.getDeclaredField("c");
            clientField.setAccessible(true);
            Object clientObj = clientField.get(null);

            if (clientObj != null) {
                System.out.println("[AGENT] HOOKED Client via static field: osrs.dF");
                init((Client) clientObj);
            } else {
                System.out.println("[AGENT] Client field null, waiting...");
            }
        } catch (Throwable t) {
            System.err.println("[AGENT-ERROR] Failed static field hook: " + t);
            t.printStackTrace();
        }
    }

    // =======================
    // fw.a(...) CAPTURE
    // =======================
    private static void tryFwCapture() {
        if (fwAMethod != null) return;

        String[] names = { "osrs.fw", "fw", "osrs.fW", "fW" };
        for (String name : names) {
            try {
                Class<?> fwCls = Class.forName(name);
                Method m = fwCls.getDeclaredMethod(
                        "a",
                        int.class, int.class, int.class, int.class, int.class,
                        int.class, String.class, String.class, int.class, int.class
                );
                m.setAccessible(true);
                fwAMethod = m;
                System.out.println("[AGENT] Cached " + name + ".a(...)");
                return;
            } catch (Throwable ignored) {}
        }
    }

    // =======================
    // SCRIPT CORE
    // =======================
    public static void registerScript(Runnable r) {
        scripts.add(r);
        System.out.println("[AGENT] Script registered: " + r.getClass().getName());
    }

    public static void init(Client client) {
        if (initialized) return;

        clientInstance = client;
        initialized = true;

        System.out.println("[AGENT] Client INIT: " + clientInstance);

        running = true;
    }

    private static void startHeartbeat() {
        Thread heartbeat = new Thread(() -> {
            while (running) {
                try {
                    System.out.println("[HEARTBEAT] client=" + (clientInstance != null)
                            + (clientInstance != null ? " state=" + clientInstance.getGameState() : ""));

                    if (clientInstance != null && clientInstance.getGameState() == GameState.LOGGED_IN) {
                        ScriptManager.registerIfReady();
                    }

                    for (Runnable r : scripts) {
                        try { r.run(); } catch (Throwable t) { t.printStackTrace(); }
                    }

                    Thread.sleep(600);
                } catch (InterruptedException ignored) {}
            }
        }, "Agent-Heartbeat");

        heartbeat.setDaemon(true);
        heartbeat.start();
    }

    // =======================
    // ACTIONS
    // =======================
    public static void attackNpc(NPC npc) {
        if (clientInstance == null || npc == null) return;

        if (fwAMethod == null) {
            tryFwCapture();
            if (fwAMethod == null) {
                System.out.println("[AGENT] Cannot attack: fw.a not cached");
                return;
            }
        }

        Player p = clientInstance.getLocalPlayer();
        if (p == null) return;

        WorldPoint pl = p.getWorldLocation();
        WorldPoint nl = npc.getWorldLocation();
        if (pl == null || nl == null) return;

        if (pl.distanceTo(nl) > 1) return;

        try {
            fwAMethod.invoke(
                    null,
                    pl.getX(),
                    pl.getY(),
                    20,
                    npc.getIndex(),
                    0,
                    npc.getId(),
                    "Attack",
                    npc.getName(),
                    -1,
                    -1
            );
            System.out.println("[AGENT] ATTACK EXECUTED -> npc=" + npc.getIndex());
        } catch (Throwable t) {
            System.err.println("[AGENT] Attack failed: " + t.getMessage());
        }
    }
}
