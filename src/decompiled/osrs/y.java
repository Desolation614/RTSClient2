package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public final class y extends gR {
   @ObfuscatedName("ap")
   private boolean a;

   public y(boolean var1) {
      this.a = var1;
   }

   public final int compare(Object var1, Object var2) {
      gX var10001 = (gX)var1;
      gX var3 = (gX)var2;
      gX var4 = var10001;
      int var10000;
      if (client.aj == var4.f && var3.f == client.aj) {
         if (!this.a) {
            return var3.e - var4.e;
         }

         var10000 = var4.e - var3.e;
      } else {
         var10000 = this.a(var4, var3);
      }

      return var10000;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(III)Lcr;",
      garbageValue = "1793092062"
   )
   static jI a(int var0) {
      jI var1;
      if ((var1 = (jI)dX.a(jI.b, (long)(var0 << 16))) != null) {
         return var1;
      } else {
         String var2 = String.valueOf(var0);
         int var3;
         if ((var3 = ij.c.b(var2)) == -1) {
            return null;
         } else {
            byte[] var4;
            if ((var4 = fB.b(ij.c, var3)) != null) {
               if (var4.length <= 1) {
                  return null;
               } else {
                  var1 = C.a(var4);
                  jI.b.a((im)var1, (long)(var0 << 16));
                  return var1;
               }
            } else {
               return null;
            }
         }
      }
   }

   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-40"
   )
   static void a() {
      if (client.P != null && client.P.f != null) {
         dQ var0;
         (var0 = X.a(j.A, client.P.f)).g.b(eg.c());
         var0.g.d(fs.h);
         var0.g.d(fs.a);
         client.P.a(var0);
      }

   }

   @ObfuscatedName("ma")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1547492899"
   )
   static final void a(int var0, int var1) {
      if (eu.a(jD.a, var0)) {
         da.a(jD.a.c[var0], var1);
      }

   }
}
