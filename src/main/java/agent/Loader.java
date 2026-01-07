package agent;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import org.objectweb.asm.*;
import agent.scripting.ScriptManager;

public class Loader {

    public static void init() {
        System.out.println("[Loader] Initializing scripts...");

        // Register GoblinFighter via ScriptManager (handles readiness)
        ScriptManager.registerIfReady();

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

        // ============================
        // ASM Transformer to hook osrs.client.init()
        // ============================
        try {
            Instrumentation inst = Agent.getInstrumentation(); // Must implement getter in Agent
            inst.addTransformer(new ClassFileTransformer() {
                @Override
                public byte[] transform(Module module, ClassLoader loader, String className,
                                        Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
                                        byte[] classfileBuffer) {

                    if (!"osrs/client".equals(className)) return null;

                    ClassReader cr = new ClassReader(classfileBuffer);
                    ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_MAXS);
                    ClassVisitor cv = new ClassVisitor(Opcodes.ASM9, cw) {
                        @Override
                        public MethodVisitor visitMethod(int access, String name, String desc,
                                                         String signature, String[] exceptions) {
                            MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions);

                            if ("init".equals(name) && "()V".equals(desc)) {
                                return new MethodVisitor(Opcodes.ASM9, mv) {
                                    @Override
                                    public void visitInsn(int opcode) {
                                        if (opcode == Opcodes.RETURN) {
                                            mv.visitVarInsn(Opcodes.ALOAD, 0); // load 'this'
                                            mv.visitMethodInsn(
                                                    Opcodes.INVOKESTATIC,
                                                    "agent/Agent",
                                                    "init",
                                                    "(Lnet/runelite/api/Client;)V",
                                                    false
                                            );
                                        }
                                        super.visitInsn(opcode);
                                    }
                                };
                            }
                            return mv;
                        }
                    };
                    cr.accept(cv, ClassReader.EXPAND_FRAMES);
                    return cw.toByteArray();
                }
            }, true);
            System.out.println("[Loader] ASM Transformer registered for osrs.client.init()");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
