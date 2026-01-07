package osrs;

import net.runelite.api.IndexedSprite;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wy")
public final class jp extends jd implements IndexedSprite {
   @ObfuscatedName("aa")
   public int a;
   @ObfuscatedName("ac")
   public int b;
   @ObfuscatedName("ai")
   public int c;
   @ObfuscatedName("aj")
   public int[] d;
   @ObfuscatedName("al")
   public int e;
   @ObfuscatedName("am")
   public int f;
   @ObfuscatedName("an")
   public int g;
   @ObfuscatedName("ap")
   public byte[] p;

   jp() {
   }

   @ObfuscatedName("at")
   public final void a(int var1, int var2, int var3, int var4) {
      a(this, var1, var2, var3, var4);
   }

   @ObfuscatedName("lr")
   private void b(int var1, int var2, int var3, int var4) {
      int var5 = this.e;
      int var6 = this.a;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.a;
      int var10 = this.c;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.c > 0) {
         var13 = (var11 + (this.b << 16) - 1) / var11;
         var1 += var13;
         var7 = 0 + (var13 * var11 - (this.g << 16));
      }

      if (this.e > 0) {
         var13 = (var12 + (this.c << 16) - 1) / var12;
         var2 += var13;
         var8 = 0 + (var13 * var12 - (this.f << 16));
      }

      if (var5 < var9) {
         var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
      }

      if (var6 < var10) {
         var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
      }

      var13 = var1 + var2 * jd.l;
      var6 = jd.m - var3;
      if (var2 + var4 > jd.l) {
         var4 -= var2 + var4 - jd.m;
      }

      if (var2 < jd.l) {
         var2 = jd.m - var2;
         var4 -= var2;
         var13 += var2 * jd.m;
         var8 += var12 * var2;
      }

      if (var3 + var1 > jd.l) {
         var2 = var3 + var1 - jd.m;
         var3 -= var2;
         var6 += var2;
      }

      if (var1 < jd.j) {
         var2 = jd.j - var1;
         var3 -= var2;
         var13 += var2;
         var7 += var11 * var2;
         var6 += var2;
      }

      a(jd.h, this.p, this.d, var7, var8, var13, var6, var3, var4, var11, var12, var5);
   }

   public final int getOriginalWidth() {
      return this.a;
   }

   public final void setOffsetY(int var1) {
      this.b = var1;
   }

   public final int getHeight() {
      return this.c;
   }

   public final int getOriginalHeight() {
      return this.f;
   }

   public final void setOffsetX(int var1) {
      this.e = var1;
   }

   public final int getWidth() {
      return this.g;
   }

   public final void setOriginalWidth(int var1) {
      this.a = var1;
   }

   public final int getOffsetX() {
      return this.e;
   }

   public final void setPixels(byte[] var1) {
      this.p = var1;
   }

   public final int getOffsetY() {
      return this.b;
   }

   public final int[] getPalette() {
      return this.d;
   }

   public final void setOriginalHeight(int var1) {
      this.f = var1;
   }

   public final void setHeight(int var1) {
      this.c = var1;
   }

   public final byte[] getPixels() {
      return this.p;
   }

   public final void setPalette(int[] var1) {
      this.d = var1;
   }

   public final void setWidth(int var1) {
      this.g = var1;
   }

   @ObfuscatedName("aj")
   private static void a(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(var8 = -var8; var8 < 0; ++var8) {
         int var13 = var11 * (var4 >> 16);

         for(int var14 = -var7; var14 < 0; ++var14) {
            byte var15;
            if ((var15 = var1[(var3 >> 16) + var13]) != 0) {
               var0[var5++] = var2[var15 & 255] | -16777216;
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   @ObfuscatedName("ap")
   private static void a(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(var6 = -var6; var6 < 0; ++var6) {
         int var10;
         byte var11;
         for(var10 = var9; var10 < 0; ++var10) {
            if ((var11 = var1[var3++]) != 0) {
               var0[var4++] = var2[var11 & 255] | -16777216;
            } else {
               ++var4;
            }

            if ((var11 = var1[var3++]) != 0) {
               var0[var4++] = var2[var11 & 255] | -16777216;
            } else {
               ++var4;
            }

            if ((var11 = var1[var3++]) != 0) {
               var0[var4++] = var2[var11 & 255] | -16777216;
            } else {
               ++var4;
            }

            if ((var11 = var1[var3++]) != 0) {
               var0[var4++] = var2[var11 & 255] | -16777216;
            } else {
               ++var4;
            }
         }

         for(var10 = var5; var10 < 0; ++var10) {
            if ((var11 = var1[var3++]) != 0) {
               var0[var4++] = var2[var11 & 255] | -16777216;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("ls")
   @ObfuscatedSignature(
      signature = "(Lwy;IIII)V"
   )
   public static void a(jp var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.b(var1, var1, var1, var1);
      }

      int var5 = var0.g;
      int var6 = var0.c;
      int var7 = 0;
      int var8 = 0;
      int var9 = var0.a;
      int var10 = var0.f;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (var0.e > 0) {
         var13 = ((var0.e << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 = 0 + (var13 * var11 - (var0.e << 16));
      }

      if (var0.b > 0) {
         var13 = ((var0.b << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 = 0 + (var13 * var12 - (var0.b << 16));
      }

      if (var5 < var9) {
         var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
      }

      if (var6 < var10) {
         var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
      }

      var13 = var1 + var2 * jd.i;
      var6 = jd.i - var3;
      if (var2 + var4 > jd.k) {
         var4 -= var2 + var4 - jd.k;
      }

      if (var2 < jd.l) {
         var2 = jd.l - var2;
         var4 -= var2;
         var13 += var2 * jd.i;
         var8 += var12 * var2;
      }

      if (var3 + var1 > jd.m) {
         var2 = var3 + var1 - jd.m;
         var3 -= var2;
         var6 += var2;
      }

      if (var1 < jd.n) {
         var2 = jd.n - var1;
         var3 -= var2;
         var13 += var2;
         var7 += var11 * var2;
         var6 += var2;
      }

      a(jd.h, var0.p, var0.d, var7, var8, var13, var6, var3, var4, var11, var12, var5);
   }

   @ObfuscatedName("mr")
   @ObfuscatedSignature(
      signature = "(Lwy;II)V"
   )
   public static void a(jp var0, int var1, int var2) {
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      if (var0 == null) {
         var4 = var1 + var0.g;
         var5 = var1 + var0.b;
         var6 = var4 + var5 * jd.i;
         var7 = 0;
         var8 = var0.e;
         var9 = var0.e;
         int var10 = jd.n - var9;
         int var11 = 0;
         int var12;
         if (var5 < jd.n) {
            var12 = jd.n - var5;
            var8 -= var12;
            var5 = jd.j;
            var7 = 0 + var12 * var9;
            var6 += var12 * jd.l;
         }

         if (var8 + var5 > jd.n) {
            var8 -= var8 + var5 - jd.l;
         }

         if (var4 < jd.i) {
            var12 = jd.i - var4;
            var9 -= var12;
            var4 = jd.m;
            var7 += var12;
            var6 += var12;
            var11 = var12 + 0;
            var10 += var12;
         }

         if (var9 + var4 > jd.n) {
            var12 = var9 + var4 - jd.k;
            var9 -= var12;
            var11 += var12;
            var10 += var12;
         }

         if (var9 > 0 && var8 > 0) {
            a(jd.h, var0.p, var0.d, var7, var6, var9, var8, var10, var11);
         }
      }

      var1 += var0.e;
      var2 += var0.b;
      int var3 = var1 + var2 * jd.i;
      var4 = 0;
      var5 = var0.c;
      var6 = var0.g;
      var7 = jd.i - var6;
      var8 = 0;
      if (var2 < jd.l) {
         var9 = jd.l - var2;
         var5 -= var9;
         var2 = jd.l;
         var4 = 0 + var9 * var6;
         var3 += var9 * jd.i;
      }

      if (var5 + var2 > jd.k) {
         var5 -= var5 + var2 - jd.k;
      }

      if (var1 < jd.n) {
         var9 = jd.n - var1;
         var6 -= var9;
         var1 = jd.n;
         var4 += var9;
         var3 += var9;
         var8 = var9 + 0;
         var7 += var9;
      }

      if (var6 + var1 > jd.m) {
         var9 = var6 + var1 - jd.m;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         a(jd.h, var0.p, var0.d, var4, var3, var6, var5, var7, var8);
      }

   }
}
