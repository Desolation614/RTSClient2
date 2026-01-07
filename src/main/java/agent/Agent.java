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
import java.util.List;

public class Agent
{
    public static volatile Client clientInstance;

    private static final List<Runnable> scripts = new ArrayList<>();
    private static volatile boolean running = false;
    private static volatile boolean initialized = false;

    // Cached internal executor
    private static volatile Method fwAMethod = null;

    // Store Instrumentation for ASM/Loader hooks
    private static volatile Instrumentation instrumentation;

    public static Instrumentation getInstrumentation() {
        return instrumentation;
    }

    // =======================
    // premain ENTRYPOINT
    // =======================
    public static void premain(String agentArgs, Instrumentation inst)
    {
        System.out.println("[AGENT] premain - HUNTING CLIENT");

        // Store instrumentation for later access
        instrumentation = inst;

        Loader.init();

        new Thread(() -> {
            int attempts = 0;

            while (!initialized && attempts < 5000)
            {
                attempts++;

                hookMainClient();
                tryFwCapture();
                diagnoseRuneLite();
                diagnoseStaticFields();
                diagnoseLoadedClasses();

                if (attempts % 50 == 0)
                {
                    System.out.println("[AGENT] #" + attempts
                            + " client=" + (clientInstance != null)
                            + " fw.a=" + (fwAMethod != null)
                            + " initialized=" + initialized);
                }

                try { Thread.sleep(250); } catch (InterruptedException ignored) {}
            }
        }, "Client-Hunter").start();
    }

    // =======================
    // CLIENT HOOKING
    // =======================
    private static void hookMainClient()
    {
        try
        {
            Class<?> loaderCls = Class.forName("net.runelite.client.rs.ClientLoader");

            // Static fields
            for (Field f : loaderCls.getDeclaredFields())
            {
                if (!Modifier.isStatic(f.getModifiers())) continue;

                f.setAccessible(true);
                Object obj = f.get(null);

                if (obj instanceof Client cl)
                {
                    System.out.println("[AGENT] HOOKED ClientLoader." + f.getName());
                    init(cl);
                    return;
                }
            }

            // INSTANCE fields
            try
            {
                Field instanceField = loaderCls.getDeclaredField("INSTANCE");
                instanceField.setAccessible(true);
                Object instance = instanceField.get(null);

                for (Field f : loaderCls.getDeclaredFields())
                {
                    f.setAccessible(true);
                    Object obj = f.get(instance);

                    if (obj instanceof Client cl)
                    {
                        System.out.println("[AGENT] HOOKED ClientLoader.INSTANCE." + f.getName());
                        init(cl);
                        return;
                    }
                }
            }
            catch (Throwable ignored) {}

        }
        catch (Throwable ignored) {}
    }

    private static void diagnoseRuneLite()
    {
        try
        {
            Class<?> rl = Class.forName("net.runelite.client.RuneLite");

            Field instField = rl.getDeclaredField("INSTANCE");
            instField.setAccessible(true);
            Object rlInst = instField.get(null);

            Field clientField = rl.getDeclaredField("client");
            clientField.setAccessible(true);
            Object obj = clientField.get(rlInst);

            if (obj instanceof Client cl)
            {
                System.out.println("[AGENT] HOOKED RuneLite.INSTANCE.client");
                init(cl);
            }
        }
        catch (Throwable ignored) {}
    }

    private static void diagnoseStaticFields()
    {
        String[] targets = {
                "osrs.client",
                "client",
                "net.runelite.client.rs.ClientLoader"
        };

        for (String name : targets)
        {
            try
            {
                Class<?> cls = Class.forName(name);

                for (Field f : cls.getDeclaredFields())
                {
                    if (!Modifier.isStatic(f.getModifiers())) continue;

                    f.setAccessible(true);
                    Object obj = f.get(null);

                    if (obj instanceof Client cl)
                    {
                        System.out.println("[AGENT] HOOKED static " + name + "." + f.getName());
                        init(cl);
                        return;
                    }
                }
            }
            catch (Throwable ignored) {}
        }
    }

    private static void diagnoseLoadedClasses()
    {
        for (char c = 'a'; c <= 'z'; c++)
        {
            try
            {
                Class<?> cls = Class.forName(String.valueOf(c));

                for (Field f : cls.getDeclaredFields())
                {
                    if (!Modifier.isStatic(f.getModifiers())) continue;

                    f.setAccessible(true);
                    Object obj = f.get(null);

                    if (obj instanceof Client cl)
                    {
                        System.out.println("[AGENT] HOOKED obfuscated " + cls.getName() + "." + f.getName());
                        init(cl);
                        return;
                    }
                }
            }
            catch (Throwable ignored) {}
        }
    }

    // =======================
    // fw.a(...) CAPTURE
    // =======================
    private static void tryFwCapture()
    {
        if (fwAMethod != null) return;

        String[] names = { "osrs.fw", "fw", "osrs.fW", "fW" };

        for (String name : names)
        {
            try
            {
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
            }
            catch (Throwable ignored) {}
        }
    }

    // =======================
    // SCRIPT CORE
    // =======================
    public static void registerScript(Runnable r)
    {
        scripts.add(r);
        System.out.println("[AGENT] Script registered: " + r.getClass().getName());
    }

    public static void init(Client client)
    {
        if (initialized) return;

        clientInstance = client;
        initialized = true;

        System.out.println("[AGENT] Client INIT: " + clientInstance);

        running = true;

        Thread heartbeat = new Thread(() -> {
            while (running)
            {
                try
                {
                    System.out.println("[HEARTBEAT] client="
                            + (clientInstance != null)
                            + (clientInstance != null ? " state=" + clientInstance.getGameState() : ""));

                    if (clientInstance != null
                            && clientInstance.getGameState() == GameState.LOGGED_IN)
                    {
                        ScriptManager.registerIfReady();
                    }

                    for (Runnable r : scripts)
                    {
                        try { r.run(); }
                        catch (Throwable t) { t.printStackTrace(); }
                    }

                    Thread.sleep(600); // game tick
                }
                catch (InterruptedException ignored) {}
            }
        }, "Agent-Heartbeat");

        heartbeat.setDaemon(true);
        heartbeat.start();
    }

    // =======================
    // ACTIONS
    // =======================
    public static void attackNpc(NPC npc)
    {
        if (clientInstance == null || npc == null) return;

        if (fwAMethod == null)
        {
            tryFwCapture();
            if (fwAMethod == null)
            {
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

        try
        {
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
        }
        catch (Throwable t)
        {
            System.err.println("[AGENT] Attack failed: " + t.getMessage());
        }
    }
}
