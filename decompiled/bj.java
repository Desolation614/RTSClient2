package osrs;

import net.runelite.api.VarbitComposition;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public final class bj extends im implements VarbitComposition {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   public static fE a;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   public static dX b = new dX(64);
   @ObfuscatedName("ap")
   private static int[] g = new int[32];
   @ObfuscatedName("pk")
   static byte[][] c;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 513673625
   )
   public int d;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1071189655
   )
   public int e;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1701175277
   )
   public int f;

   bj() {
   }

   public final int getIndex() {
      return this.d;
   }

   public final int getLeastSignificantBit() {
      return this.e;
   }

   public final int getMostSignificantBit() {
      return this.f;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1968824318"
   )
   public static int a(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   @ObfuscatedName("lw")
   @ObfuscatedSignature(
      signature = "(IIIILjava/lang/String;I)V",
      garbageValue = "1875052207"
   )
   static void a(int var0, int var1, int var2, int var3, String var4) {
      int var5 = var0 >>> 16;
      int var6 = var0 & '\uffff';
      fd var7;
      if ((var7 = eu.a(jD.a, var1, var2, (byte)45)) != null) {
         if (var7.aZ != null) {
            jK var8;
            (var8 = new jK()).j = var7;
            var8.b = var6;
            var8.a = var5;
            var8.m = var4;
            var8.g = var7.aZ;
            fW.a(var8);
         }

         boolean var10 = true;
         if (var7.e > 0) {
            var10 = js.a(var7);
         }

         if (var10 && aq.a(fh.a(var7), var6 - 1)) {
            dQ var9;
            if (iZ.a <= 230) {
               if (var0 == 1) {
                  (var9 = X.a(j.aD, client.P.f)).g.c(var1);
                  var9.g.d(var2);
                  var9.g.d(var3);
                  client.P.a(var9);
               }

               if (var0 == 2) {
                  (var9 = X.a(j.s, client.P.f)).g.c(var1);
                  var9.g.d(var2);
                  var9.g.d(var3);
                  client.P.a(var9);
               }

               if (var0 == 3) {
                  (var9 = X.a(j.e, client.P.f)).g.c(var1);
                  var9.g.d(var2);
                  var9.g.d(var3);
                  client.P.a(var9);
               }

               if (var0 == 4) {
                  (var9 = X.a(j.ar, client.P.f)).g.c(var1);
                  var9.g.d(var2);
                  var9.g.d(var3);
                  client.P.a(var9);
               }

               if (var0 == 5) {
                  (var9 = X.a(j.aI, client.P.f)).g.c(var1);
                  var9.g.d(var2);
                  var9.g.d(var3);
                  client.P.a(var9);
               }

               if (var0 == 6) {
                  (var9 = X.a(j.ax, client.P.f)).g.c(var1);
                  var9.g.d(var2);
                  var9.g.d(var3);
                  client.P.a(var9);
               }

               if (var0 == 7) {
                  (var9 = X.a(j.ac, client.P.f)).g.c(var1);
                  var9.g.d(var2);
                  var9.g.d(var3);
                  client.P.a(var9);
               }

               if (var0 == 8) {
                  (var9 = X.a(j.b, client.P.f)).g.c(var1);
                  var9.g.d(var2);
                  var9.g.d(var3);
                  client.P.a(var9);
               }

               if (var0 == 9) {
                  (var9 = X.a(j.aQ, client.P.f)).g.c(var1);
                  var9.g.d(var2);
                  var9.g.d(var3);
                  client.P.a(var9);
               }

               if (var0 == 10) {
                  (var9 = X.a(j.p, client.P.f)).g.c(var1);
                  var9.g.d(var2);
                  var9.g.d(var3);
                  client.P.a(var9);
               }
            } else if (var5 == 0) {
               (var9 = X.a(j.aA, client.P.f)).g.c(var1);
               var9.g.d(var2);
               var9.g.d(var3);
               var9.g.b(var6);
               client.P.a(var9);
            }

            if (var5 != 0) {
               (var9 = X.a(j.z, client.P.f)).g.c(var1);
               var9.g.d(var2);
               var9.g.d(var3);
               var9.g.b(var6);
               var9.g.b(var5 - 1);
               client.P.a(var9);
            }
         }
      }

   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         g[var1] = var0 - 1;
         var0 += var0;
      }

   }
}
