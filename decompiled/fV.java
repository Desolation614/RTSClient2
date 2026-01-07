package osrs;

import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public final class fV {
   @ObfuscatedName("ai")
   static int[] a;
   @ObfuscatedName("aa")
   int[] b = new int[2048];
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lrv;"
   )
   private gH e = new gH(0, 0);
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 892251439
   )
   int c = 0;
   @ObfuscatedName("al")
   private HashMap f = new HashMap();
   @ObfuscatedName("am")
   int[] d = new int[2048];

   public fV() {
      a = new int[2000];
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 240; var1 < 16; var2 -= 12) {
         var3 = W.a((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var1 / 16.0F + 0.075F));
         a[var1] = var3;
         ++var1;
      }

      var2 = 48;

      for(int var10000 = 48 / 6; var1 < a.length; var2 -= 8) {
         var3 = var1 << 1;

         for(int var4 = W.a((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var3 && var1 < a.length; ++var1) {
            a[var1] = var4;
         }
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(IILwd;FB)V",
      garbageValue = "-29"
   )
   public final void a(int var1, int var2, iT var3, float var4) {
      int var5 = (int)(18.0F * var4);
      int var7;
      int var15;
      int var17;
      if (!this.f.containsKey(var5)) {
         int var13 = var5;
         var15 = (var5 << 1) + 1;
         double var21 = (double)((float)var5 / 3.0F);
         double[] var16 = new double[(var5 << 1) + 1];
         var17 = -var5;

         for(int var18 = 0; var17 <= var13; ++var18) {
            double var10002 = (double)var17;
            double var34 = 0.0D;
            double var38;
            var16[var18] = Math.exp(-(var38 = var10002 / var21) * var38 / 2.0D) / Math.sqrt(6.283185307179586D) / var21;
            ++var17;
         }

         double[] var51 = var16;
         double var27 = var16[var13] * var16[var13];
         int[] var6 = new int[var15 * var15];

         for(var7 = 0; var7 < var15; ++var7) {
            for(int var8 = 0; var8 < var15; ++var8) {
               var6[var8 + var15 * var7] = (int)(var51[var8] * var51[var7] / var27 * 256.0D);
            }
         }

         iT var43 = new iT(var6, var15, var15);
         this.f.put(var13, var43);
      }

      iT var42 = (iT)this.f.get(var5);
      var7 = (var5 << 1) + 1;
      gH var44 = new gH(0, 0, var3.a, var3.e);
      gH var9 = new gH(0, 0);
      this.e.c(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      for(var7 = 0; var7 < this.c; ++var7) {
         var10 = this.b[var7];
         var11 = this.d[var7];
         var10 = (int)((float)(var10 - var1) * var4) - var5;
         var11 = (int)((float)var3.e - var4 * (float)(var11 - var2)) - var5;
         this.e.b(var10, var11);
         gH var45;
         gH var48 = var45 = this.e;
         var9.f = var48.f;
         var9.e = var48.e;
         if (var48.f < var44.f) {
            var9.e -= var44.f - var48.f;
            var9.f = var44.f;
         }

         if (var9.c() > var44.c()) {
            var9.e -= var9.c() - var44.c();
         }

         if (var9.e < 0) {
            var9.e = 0;
         }

         var9.g = var45.g;
         var9.d = var45.d;
         if (var45.g < var44.g) {
            var9.d -= var44.g - var45.g;
            var9.g = var44.g;
         }

         if (var9.b() > var44.b()) {
            var9.d -= var9.b() - var44.b();
         }

         if (var9.d < 0) {
            var9.d = 0;
         }

         gH var12 = var9;
         iT var47 = var3;
         iT var46 = var42;
         if (var9.e != 0 && var9.d != 0) {
            var15 = 0;
            int var53 = 0;
            if (var9.f == 0) {
               var15 = var42.a - var9.e;
            }

            if (var9.g == 0) {
               var53 = var42.e - var9.d;
            }

            int var22 = var15 + var53 * var42.a;
            int var14 = var3.a * var9.g + var9.f;

            for(int var49 = 0; var49 < var12.d; ++var49) {
               for(var17 = 0; var17 < var12.e; ++var17) {
                  int[] var52 = var47.b;
                  int var54 = var14++;
                  var52[var54] += var46.b[var22++];
               }

               var22 += var46.a - var12.e;
               var14 += var47.a - var12.e;
            }
         }
      }

      System.nanoTime();
      System.nanoTime();

      for(var7 = 0; var7 < var3.b.length; ++var7) {
         if (var3.b[var7] == 0) {
            var3.b[var7] = -16777216;
         } else if ((var10 = (var3.b[var7] + 64 - 1) / 256) <= 0) {
            var3.b[var7] = -16777216;
         } else {
            if (var10 > a.length) {
               var10 = a.length;
            }

            var11 = a[var10 - 1];
            var3.b[var7] = -16777216 | var11;
         }
      }

      System.nanoTime();
   }
}
