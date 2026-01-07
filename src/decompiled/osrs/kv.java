package osrs;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.api.RuneLiteObjectController;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

public final class kv extends ct {
   @ObfuscatedName("rx")
   private static Map a = new IdentityHashMap();
   @ObfuscatedName("ig")
   private RuneLiteObjectController b;
   @ObfuscatedName("oc")
   private int c;

   private kv(RuneLiteObjectController var1) {
      this.b = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)Ljm;",
      garbageValue = "27"
   )
   public final cn k() {
      try {
         return (cn)this.b.getModel();
      } catch (Exception var2) {
         if (this.c < 10) {
            ++this.c;
            client.cV.warn("Exception rendering RuneLiteObjectController {}", this.b, var2);
         }

         return null;
      }
   }

   @ObfuscatedName("ek")
   public static void a(RuneLiteObjectController var0) {
      if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         kv var1;
         if ((var1 = (kv)a.remove(var0)) != null) {
            gk.a(var1);
         }

      }
   }

   @ObfuscatedName("np")
   public static void b(RuneLiteObjectController var0) {
      if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         if (!a.containsKey(var0)) {
            kv var1 = new kv(var0);
            a.put(var0, var1);
            client var10000 = dF.c;
            fU.a((fU)client.j(var0.getWorldView()).b, var1);
         }

      }
   }

   @ObfuscatedName("nu")
   public static boolean c(RuneLiteObjectController var0) {
      if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return a.containsKey(var0);
      }
   }

   @ObfuscatedName("pj")
   @ObfuscatedSignature(
      signature = "(Ldl;)V"
   )
   public static void a(kd var0) {
      Iterator var1 = var0.worldEntities().iterator();

      while(var1.hasNext()) {
         a(((hG)var1.next()).e);
      }

      for(kv var2 = (kv)fU.e(var0.b); var2 != null; var2 = (kv)fU.b(var0.b)) {
         kv var10000 = var2;
         kd var18 = var0;
         kv var17 = var10000;

         try {
            var17.b.tick(client.cP);
            if (var17.ch != null) {
               ci var19 = var18.o;
               int var10001 = var17.b.getLevel();
               int var10002 = var17.b.getX();
               int var10003 = var17.b.getY();
               int var10004 = var17.b.getZ();
               int var10005 = var17.b.getRadius();
               int var10007 = var17.b.getOrientation();
               boolean var10 = var17.b.isDrawFrontTilesFirst();
               long var14 = -1L;
               int var9 = var10007;
               int var7 = var10005;
               int var6 = var10004;
               int var5 = var10003;
               int var4 = var10002;
               int var3 = var10001;
               var19.a(var3, var4, var5, var6, var7, var17, var9, -1L, var10);
            }
         } catch (Exception var16) {
            if (var17.c < 10) {
               ++var17.c;
               client.cV.warn("Exception ticking RuneLiteObjectController {}", var17.b, var16);
            }
         }
      }

   }
}
