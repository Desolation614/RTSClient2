package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
public final class cv {
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "([BI)[B",
      garbageValue = "982163979"
   )
   static final byte[] a(byte[] var0) {
      jk var1;
      int var2 = jk.a((jk)(var1 = new jk(var0)), (byte)2);
      int var3;
      if ((var3 = jk.d(var1, 1687107415)) >= 0) {
         if (var2 == 0) {
            byte[] var9 = new byte[var3];
            int var7 = var3;
            boolean var8 = false;
            var1.b(var9, 0, var7);
            return var9;
         } else {
            int var4;
            if ((var4 = jk.d(var1, 1687107415)) < 0) {
               throw new RuntimeException();
            } else {
               byte[] var5 = new byte[var4];
               if (var2 == 1) {
                  fE.a(var5, var4, var0, var3, 9);
               } else {
                  synchronized(fB.a) {
                     fB.a.a(var1, var5);
                  }
               }

               return var5;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("mg")
   @ObfuscatedSignature(
      signature = "(Lov;IIZI)V",
      garbageValue = "-431005857"
   )
   static void a(fd var0, int var1, int var2, boolean var3) {
      int var4 = var0.i * -1805166981;
      int var5 = var0.n * -2133353239;
      if (var0.d == 0) {
         var0.i = var0.u * -352773965;
      } else if (var0.d == 1) {
         var0.i = (var1 - var0.u) * -352773965;
      } else if (var0.d == 2) {
         var0.i = (var0.u * var1 >> 14) * -352773965;
      }

      if (var0.h == 0) {
         var0.n = var0.t * -1251804327;
      } else if (var0.h == 1) {
         var0.n = (var2 - var0.t) * -1251804327;
      } else if (var0.h == 2) {
         var0.n = (var2 * var0.t >> 14) * -1251804327;
      }

      if (var0.d == 4) {
         var0.i = var0.F * var0.n * -2133353239 / var0.T * -352773965;
      }

      if (var0.h == 4) {
         var0.n = var0.T * var0.i * -1805166981 / var0.F * -1251804327;
      }

      if (var0.e == 1337) {
         client.aS = var0;
      }

      if (var0.j == 12) {
         fd.b(var0, 1065857997).a(var0.i * -1805166981, var0.n * -2133353239);
      }

      if (var3 && var0.aT != null && (var4 != var0.i * -1805166981 || var5 != var0.n * -2133353239)) {
         jK var6;
         (var6 = new jK()).j = var0;
         var6.g = var0.aT;
         fU.a((fU)client.cf, var6);
      }

   }
}
