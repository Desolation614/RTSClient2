package agent;

import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;

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

    // Cache fw.a(...) as a Method. It's static, so invoke with null target.
    private static volatile Method fwAMethod = null;

    public static void premain(String agentArgs, Instrumentation inst)
    {
        System.out.println("[AGENT] premain - HUNTING CLIENT");
        Loader.init();

        new Thread(() ->
        {
            int attempts = 0;

            while (!initialized && attempts < 5000)
            {
                attempts++;

                // 1) BEST: hook gamepack main client directly (from your decompile: osrs/client.java)
                hookMainClient();

                // 2) Cache interaction executor (from your decompile: osrs.fw.a(...))
                tryFwCapture();

                // 3) Keep old heuristics as fallback (harmless)
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

    /**
     * Hook the *real* RS client object by scanning static fields in osrs.client (or client).
     * Your grep output shows decompiled/osrs/client.java exists, so "osrs.client" is the first target. [web:13]
     */
    private static void hookMainClient() {
        try {
            // ClientLoader holds the real client instance
            Class<?> loaderCls = Class.forName("net.runelite.client.rs.ClientLoader");

            for (Field f : loaderCls.getDeclaredFields()) {
                if (Modifier.isStatic(f.getModifiers())) {
                    f.setAccessible(true);
                    Object obj = f.get(null);
                    if (obj instanceof Client cl) {
                        Agent.clientInstance = cl;
                        System.out.println("[AGENT] HOOKED ClientLoader." + f.getName());
                        Agent.init(cl);
                        return;
                    }
                }
            }

            // Instance fields too
            Field instanceField = loaderCls.getDeclaredField("INSTANCE");
            instanceField.setAccessible(true);
            Object loaderInstance = instanceField.get(null);
            for (Field f : loaderCls.getDeclaredFields()) {
                f.setAccessible(true);
                Object obj = f.get(loaderInstance);
                if (obj instanceof Client cl) {
                    Agent.clientInstance = cl;
                    System.out.println("[AGENT] HOOKED ClientLoader.INSTANCE." + f.getName());
                    Agent.init(cl);
                    return;
                }
            }
        } catch (Exception ignored) {}
    }


    /**
     * Cache fw.a(...) as a Method. Decompile shows calls like osrs.fw.a(...), so try osrs.fw first. [web:13]
     */
    private static void tryFwCapture()
    {
        if (fwAMethod != null) return;

        String[] fwNames = new String[] { "osrs.fw", "fw", "osrs.fW", "fW" };

        for (String name : fwNames)
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
            catch (Throwable ignored)
            {
            }
        }
    }

    private static void diagnoseRuneLite() {
        try {
            Class<?> rlClass = Class.forName("net.runelite.client.RuneLite");
            Field instanceField = rlClass.getDeclaredField("INSTANCE");
            instanceField.setAccessible(true);
            Object runeLiteInstance = instanceField.get(null);

            Field clientField = rlClass.getDeclaredField("client");
            clientField.setAccessible(true);
            Object obj = clientField.get(runeLiteInstance);

            if (obj instanceof Client cl) {
                Agent.clientInstance = cl;
                System.out.println("[AGENT] HOOKED RuneLite.INSTANCE.client");
                Agent.init(cl);
                return;
            }
        } catch (Exception ex) {
            // silent
        }
    }




    private static void diagnoseStaticFields()
    {
        // NOTE: these must be full class names to work with Class.forName().
        String[] targets = {
                "osrs.client",
                "client",
                "osrs.fw",
                "fw",
                "net.runelite.client.rs.ClientLoader"
        };

        for (String t : targets)
        {
            try
            {
                Class<?> cls = Class.forName(t);

                for (Field f : cls.getDeclaredFields())
                {
                    if (!Modifier.isStatic(f.getModifiers())) continue;

                    f.setAccessible(true);
                    Object obj = f.get(null);

                    if (obj != null && Client.class.isInstance(obj))
                    {
                        clientInstance = (Client) obj;
                        System.out.println("[AGENT] HOOKED static " + t + "." + f.getName());
                        init(clientInstance);
                        return;
                    }
                }
            }
            catch (Throwable ignored)
            {
            }
        }
    }

    private static void diagnoseLoadedClasses()
    {
        // RSPS pattern: single-letter class with static client-ish field (keep as last-resort).
        for (char c = 'a'; c <= 'z'; c++)
        {
            try
            {
                String className = String.valueOf(c);
                Class<?> cls = Class.forName(className);

                for (Field f : cls.getDeclaredFields())
                {
                    if (!Modifier.isStatic(f.getModifiers())) continue;

                    f.setAccessible(true);
                    Object obj = f.get(null);

                    if (obj != null && Client.class.isInstance(obj))
                    {
                        clientInstance = (Client) obj;
                        System.out.println("[AGENT] HOOKED obfuscated " + className + "." + f.getName());
                        init(clientInstance);
                        return;
                    }
                }
            }
            catch (Throwable ignored)
            {
            }
        }
    }

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
        Thread heartbeat = new Thread(() ->
        {
            while (running)
            {
                try
                {
                    for (Runnable script : scripts)
                    {
                        try { script.run(); } catch (Throwable t) { t.printStackTrace(); }
                    }
                    Thread.sleep(100);
                }
                catch (InterruptedException ignored)
                {
                }
            }
        }, "Agent-Heartbeat");

        heartbeat.setDaemon(true);
        heartbeat.start();
    }

    public static void shutdown()
    {
        running = false;
    }

    public static void attackNpc(NPC npc)
    {
        if (clientInstance == null || npc == null) return;

        if (fwAMethod == null)
        {
            tryFwCapture();
            if (fwAMethod == null)
            {
                System.out.println("[AGENT] Cannot attack: fw.a not cached yet");
                return;
            }
        }

        Player p = clientInstance.getLocalPlayer();
        if (p == null) return;

        WorldPoint ploc = p.getWorldLocation();
        WorldPoint nloc = npc.getWorldLocation();
        if (ploc == null || nloc == null) return;

        if (ploc.distanceTo(nloc) > 1) return;

        try
        {
            // static call => invoke(null, ...)
            fwAMethod.invoke(
                    null,
                    ploc.getX(),
                    ploc.getY(),
                    20,
                    npc.getIndex(),
                    0,
                    npc.getId(),
                    "Attack",
                    npc.getName(),
                    -1,
                    -1
            );

            System.out.println("[AGENT] ATTACK EXECUTED on " + npc.getIndex());
        }
        catch (Throwable ex)
        {
            System.err.println("[AGENT] Attack failed: " + ex.getClass().getSimpleName() + ": " + ex.getMessage());
        }
    }
}
