package osrs;

import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public final class Q {
   @ObfuscatedName("aa")
   static int[] a = new int[5];
   @ObfuscatedName("ac")
   static int[] b = new int[5];
   @ObfuscatedName("ah")
   static int[] c = new int[5];
   @ObfuscatedName("ai")
   private static int[] x;
   @ObfuscatedName("aj")
   static int[] d;
   @ObfuscatedName("al")
   static int[] e = new int[5];
   @ObfuscatedName("am")
   static int[] f = new int[5];
   @ObfuscatedName("an")
   private static int[] y = new int['耀'];
   @ObfuscatedName("ab")
   int g = 100;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   kb h;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   kb i;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   kb j;
   @ObfuscatedName("ag")
   int k = 500;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   kb l;
   @ObfuscatedName("ao")
   int[] m = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "Lea;"
   )
   s n;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   kb o;
   @ObfuscatedName("as")
   int[] p = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   kb q;
   @ObfuscatedName("au")
   int r = 0;
   @ObfuscatedName("av")
   int[] s = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   kb t;
   @ObfuscatedName("ax")
   int u = 0;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   kb v;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   kb w;

   Q() {
   }

   @ObfuscatedName("aj")
   static int a(int var0, int var1, int var2) {
      if (var2 == 1) {
         return (var0 & 32767) < 16384 ? var1 : -var1;
      } else if (var2 == 2) {
         return x[var0 & 32767] * var1 >> 14;
      } else if (var2 == 3) {
         return (var1 * (var0 & 32767) >> 14) - var1;
      } else {
         return var2 == 4 ? var1 * y[var0 / 2607 & 32767] : 0;
      }
   }

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         y[var1] = (var0.nextInt() & 2) - 1;
      }

      x = new int['耀'];

      for(var1 = 0; var1 < 32768; ++var1) {
         x[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      d = new int[220500];
   }
}
