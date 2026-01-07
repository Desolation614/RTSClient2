package osrs;

import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.api.events.WorldListLoad;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public final class I {
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      signature = "[Lwy;"
   )
   static jp[] a;
   @ObfuscatedName("ji")
   static boolean b;
   @ObfuscatedName("px")
   static int[][] c;
   @ObfuscatedName("ai")
   private Future d;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lai;"
   )
   private jU e;
   @ObfuscatedName("an")
   private ExecutorService f = Executors.newSingleThreadExecutor();
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lwt;"
   )
   private jk g;

   @ObfuscatedSignature(
      signature = "(Lwt;Lai;)V"
   )
   public I(jo var1, am var2) {
      this.g = var1;
      this.e = var2;
      this.d = this.f.submit(new ke(this, this.g, this.e));
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2129641257"
   )
   public final void a() {
      this.f.shutdown();
      this.f = null;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(S)Lwt;",
      garbageValue = "166"
   )
   public final jk b() {
      try {
         return (jk)this.d.get();
      } catch (Exception var1) {
         return null;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "-16903"
   )
   public final boolean c() {
      return this.d.isDone();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IIB)Lbd;",
      garbageValue = "66"
   )
   static dj a(int var0, int var1) {
      iu var2 = (iu)ki.d.get(var0);
      return var1 >= 0 && var1 < var2.d ? var2.c[var1] : null;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-3407872"
   )
   static boolean d() {
      try {
         if (l.a == null) {
            l.a = K.a(aE.a, new URL(n.b), 2089531643);
         } else if (G.a(l.a, -520081333)) {
            byte[] var0 = l.a.c;
            jk var6;
            jk.d(var6 = new jk(var0), 1687107415);
            iB.a = new dO[dO.b = var6.d()];

            dO var1;
            for(int var2 = 0; var2 < dO.b; var1.l = var2++) {
               (var1 = iB.a[var2] = new dO()).k = var6.d();
               var1.i = jk.d(var6, 1687107415);
               var1.g = var6.p();
               var1.h = var6.p();
               var1.m = jk.a(var6, (byte)-40);
               var1.f = var6.c() * 1690272959;
               client var10000 = dF.c;
               dO[] var4;
               if ((var4 = client.i()) != null && var4.length > 0 && var1 == var4[var4.length - 1]) {
                  WorldListLoad var3 = new WorldListLoad(var4);
                  dF.c.getCallbacks().post(var3);
               }
            }

            q.a(iB.a, 0, iB.a.length - 1, dO.c, dO.d);
            l.a = null;
            return true;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         l.a = null;
      }

      return false;
   }

   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      signature = "(Lqk;)Lub;"
   )
   public static hR a(fU var0) {
      if (var0 == null) {
         hR var2;
         if ((var2 = var0.a.ch) == var0.a) {
            Object var10000 = null;
         } else {
            gk.a(var2);
         }
      }

      hR var1;
      if ((var1 = var0.a.ch) == var0.a) {
         return null;
      } else {
         gk.a(var1);
         return var1;
      }
   }
}
