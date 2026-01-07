package osrs;

import java.awt.Color;
import java.awt.image.BufferedImage;
import net.runelite.api.SpritePixels;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wd")
public final class iT extends jd implements SpritePixels {
   @ObfuscatedName("aa")
   public int a;
   @ObfuscatedName("ac")
   public int[] b;
   @ObfuscatedName("ag")
   int c;
   @ObfuscatedName("ah")
   public int d;
   @ObfuscatedName("am")
   public int e;
   @ObfuscatedName("ar")
   public int f;
   @ObfuscatedName("au")
   public int g;

   public iT(int[] var1, int var2, int var3) {
      this.b = var1;
      this.a = this.g = var2;
      this.e = this.f = var3;
      this.c = 0;
      this.d = 0;
   }

   public iT(int var1, int var2) {
      this(new int[var2 * var1], var1, var2);
   }

   iT() {
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "()Lwd;"
   )
   public final iT a() {
      iT var1 = new iT(this.g, this.f);

      for(int var2 = 0; var2 < this.e; ++var2) {
         for(int var3 = 0; var3 < this.a; ++var3) {
            var1.b[var3 + (var2 + this.c) * this.g + this.d] = this.b[var3 + var2 * this.a];
         }
      }

      return var1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "()Lwd;"
   )
   public final iT b() {
      iT var1;
      (var1 = new iT(this.a, this.e)).g = this.g;
      var1.f = this.f;
      var1.d = this.d;
      var1.c = this.c;
      int var2 = this.b.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.b[var3] = this.b[var3];
      }

      return var1;
   }

   @ObfuscatedName("at")
   public final void c() {
      this.f();
   }

   @ObfuscatedName("av")
   public final void a(int var1) {
      for(int var2 = this.e - 1; var2 > 0; --var2) {
         int var3 = var2 * this.a;

         for(int var4 = this.a - 1; var4 > 0; --var4) {
            if (this.b[var4 + var3] == 0 && this.b[var4 + var3 - 1 - this.a] != 0) {
               this.b[var4 + var3] = var1;
            }
         }
      }

   }

   @ObfuscatedName("az")
   public final void b(int var1) {
      if (this.a != this.g || this.e != this.f) {
         int var2 = var1;
         if (var1 > this.d) {
            var2 = this.d;
         }

         int var3 = var1;
         if (var1 + this.d + this.a > this.g) {
            var3 = this.g - this.d - this.a;
         }

         int var4 = var1;
         if (var1 > this.c) {
            var4 = this.c;
         }

         int var5 = var1;
         if (var1 + this.c + this.e > this.f) {
            var5 = this.f - this.c - this.e;
         }

         var1 = var2 + var3 + this.a;
         var3 = var4 + var5 + this.e;
         int[] var8 = new int[var1 * var3];

         for(int var6 = 0; var6 < this.e; ++var6) {
            for(int var7 = 0; var7 < this.a; ++var7) {
               var8[var1 * (var6 + var4) + var7 + var2] = this.b[var7 + var6 * this.a];
            }
         }

         this.b = var8;
         this.a = var1;
         this.e = var3;
         this.d -= var2;
         this.c -= var4;
      }

   }

   @ObfuscatedName("bi")
   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         var3 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
         var7 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
         var12 = var12 * var8 >> 8;
         var7 = var7 * var8 >> 8;
         var5 = var11 * var12 + var3 * var7 + (var5 << 16);
         var3 = var11 * var7 - var3 * var12 + (var6 << 16);
         var6 = var1 + var2 * jd.i;

         for(var2 = 0; var2 < var4; ++var2) {
            var1 = var9[var2];
            var8 = var6 + var1;
            var11 = var5 + var7 * var1;
            int var13 = var3 - var12 * var1;

            for(var1 = -var10[var2]; var1 < 0; ++var1) {
               jd.h[var8++] = this.b[this.a * (var13 >> 16) + (var11 >> 16)] | -16777216;
               var11 += var7;
               var13 -= var12;
            }

            var5 += var12;
            var3 += var7;
            var6 += jd.i;
         }

      } catch (Exception var14) {
      }
   }

   @ObfuscatedName("bl")
   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
      int var9 = var2 < 0 ? -var2 : 0;
      var6 = var2 + this.e <= var6 ? this.e : var6 - var2;
      int var10 = var1 < 0 ? -var1 : 0;
      if (this.a + var1 <= var5) {
         int var10000 = this.a;
      }

      var3 = var3 + var10 + (var9 + var2 + var4) * jd.i + var1;
      var2 += var9;

      for(var4 = var9; var4 < var6; ++var4) {
         var5 = var7[var2];
         var9 = var8[var2++];
         int var11 = var3;
         int var12;
         if (var1 < var5) {
            var12 = var5 - var1;
            var11 = var3 + (var12 - var10);
         } else {
            var12 = var10;
         }

         if (this.a + var1 <= var5 + var9) {
            var5 = this.a;
         } else {
            var5 = var5 + var9 - var1;
         }

         for(var9 = var12; var9 < var5; ++var9) {
            if ((var12 = this.b[var9 + var4 * this.a]) != 0) {
               jd.h[var11++] = var12 | -16777216;
            } else {
               ++var11;
            }
         }

         var3 += jd.i;
      }

   }

   @ObfuscatedName("bv")
   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         if (var7 < 1.5707963267948966D || var7 > 4.71238898038469D) {
            if (jd.i % 2 != 0) {
               ++var5;
            }

            if (jd.j % 2 != 0) {
               ++var6;
            }
         }

         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0D);
         int var15 = (int)(Math.cos(var7) * 65536.0D);
         var12 = var12 * var9 >> 8;
         var15 = var15 * var9 >> 8;
         var5 = var11 * var12 + var10 * var15 + (var5 << 16);
         var6 = var11 * var15 - var10 * var12 + (var6 << 16);
         int var8 = var1 + var2 * jd.i;

         for(var2 = 0; var2 < var4; ++var2) {
            var9 = var8;
            var10 = var5;
            var11 = var6;

            for(var1 = -var3; var1 < 0; ++var1) {
               int var13;
               if ((var13 = this.b[this.a * (var11 >> 16) + (var10 >> 16)]) != 0) {
                  jd.h[var9++] = var13 | -16777216;
               } else {
                  ++var9;
               }

               var10 += var15;
               var11 -= var12;
            }

            var5 += var12;
            var6 += var15;
            var8 += jd.i;
         }

      } catch (Exception var14) {
      }
   }

   @ObfuscatedName("cn")
   public final void d() {
      int[] var1 = new int[this.a * this.e];
      int var2 = 0;

      for(int var3 = 0; var3 < this.e; ++var3) {
         for(int var4 = this.a - 1; var4 >= 0; --var4) {
            var1[var2++] = this.b[var4 + var3 * this.a];
         }
      }

      this.b = var1;
      this.d = this.g - this.a - this.d;
   }

   @ObfuscatedName("db")
   public final void e() {
      int[] var1 = new int[this.a * this.e];
      int var2 = 0;

      for(int var3 = this.e - 1; var3 >= 0; --var3) {
         for(int var4 = 0; var4 < this.a; ++var4) {
            var1[var2++] = this.b[var4 + var3 * this.a];
         }
      }

      this.b = var1;
      this.c = this.f - this.e - this.c;
   }

   @ObfuscatedName("dk")
   public final void f() {
      jd.b(this.b, this.a, this.e, (float[])null);
   }

   @ObfuscatedName("dm")
   public final void a(int var1, int var2) {
      var1 += this.d;
      var2 += this.c;
      int var3 = var1 + var2 * jd.i;
      int var4 = 0;
      int var5 = this.e;
      int var6 = this.a;
      int var7 = jd.i - var6;
      int var8 = 0;
      int var9;
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
         a(jd.h, this.b, var4, var3, var6, var5, var7, var8);
      }

   }

   @ObfuscatedName("dn")
   public final void a(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = this.a;
         int var6 = this.e;
         int var7 = 0;
         int var8 = 0;
         int var9 = this.g;
         int var10 = this.f;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         int var13;
         if (this.d > 0) {
            var13 = (var11 + (this.d << 16) - 1) / var11;
            var1 += var13;
            var7 = 0 + (var13 * var11 - (this.d << 16));
         }

         if (this.c > 0) {
            var13 = (var12 + (this.c << 16) - 1) / var12;
            var2 += var13;
            var8 = 0 + (var13 * var12 - (this.c << 16));
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

         a(jd.h, this.b, var7, var8, var13, var6, var3, var4, var11, var12, var5);
      }

   }

   @ObfuscatedName("dp")
   public final void b(int var1, int var2) {
      var1 += this.d;
      var2 += this.c;
      int var3 = var1 + var2 * jd.i;
      int var4 = 0;
      int var5 = this.e;
      int var6 = this.a;
      int var7 = jd.i - var6;
      int var8 = 0;
      int var9;
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
         b(jd.h, this.b, var4, var3, var6, var5, var7, var8);
      }

   }

   @ObfuscatedName("ds")
   public final void b(int var1, int var2, int var3, int var4) {
      dp.a(this, this.g << 3, this.f << 3, var1 << 4, var2 << 4, var3, var4);
   }

   @ObfuscatedName("dz")
   public final void a(int var1, int var2, int var3) {
      var1 += this.d;
      var2 += this.c;
      var3 = var1 + var2 * jd.i;
      int var4 = 0;
      int var5 = this.e;
      int var6 = this.a;
      int var7 = jd.i - var6;
      int var8 = 0;
      int var9;
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
         a(jd.h, this.b, var4, var3, var6, var5, var7, var8, 192);
      }

   }

   @ObfuscatedName("gn")
   public final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      this.a(var1, var2, var3, var4, var5, var6, var7, 256, var9, var10);
   }

   public final int getWidth() {
      return this.a;
   }

   public final int getHeight() {
      return this.e;
   }

   public final void toBufferedImage(BufferedImage var1) {
      int var2 = this.getWidth();
      int var3 = this.getHeight();
      if (var1.getWidth() == var2 && var1.getHeight() == var3) {
         int[] var4;
         int[] var5 = new int[(var4 = this.getPixels()).length];

         for(int var6 = 0; var6 < var4.length; ++var6) {
            if (var4[var6] != 0) {
               var5[var6] = var4[var6] | -16777216;
            }
         }

         var1.setRGB(0, 0, var2, var3, var5, 0, var2);
      } else {
         throw new IllegalArgumentException("Image bounds do not match SpritePixels");
      }
   }

   public final void toBufferedOutline(BufferedImage var1, int var2) {
      int var3 = this.getWidth();
      int var4 = this.getHeight();
      if (var1.getWidth() == var3 && var1.getHeight() == var4) {
         int[] var5 = this.getPixels();
         int[] var6 = new int[var3 * var4];
         int var7 = 0;

         for(int var8 = 0; var8 < var4; ++var8) {
            for(int var9 = 0; var9 < var3; ++var9) {
               int var10;
               if ((var10 = var5[var7]) == 16777215 || var10 == 0) {
                  if (var9 > 0 && var5[var7 - 1] != 0) {
                     var10 = var2;
                  } else if (var8 > 0 && var5[var7 - var3] != 0) {
                     var10 = var2;
                  } else if (var9 < var3 - 1 && var5[var7 + 1] != 0) {
                     var10 = var2;
                  } else if (var8 < var4 - 1 && var5[var7 + var3] != 0) {
                     var10 = var2;
                  }

                  var6[var7] = var10;
               }

               ++var7;
            }
         }

         var1.setRGB(0, 0, var3, var4, var6, 0, var3);
      } else {
         throw new IllegalArgumentException("Image bounds do not match SpritePixels");
      }
   }

   public final int[] getPixels() {
      return this.b;
   }

   public final void setOffsetX(int var1) {
      this.d = var1;
   }

   public final void setMaxHeight(int var1) {
      this.f = var1;
   }

   public final void setMaxWidth(int var1) {
      this.g = var1;
   }

   public final void setOffsetY(int var1) {
      this.c = var1;
   }

   public final int getOffsetX() {
      return this.d;
   }

   public final void drawAt(int var1, int var2) {
      this.a(var1, var2);
   }

   public final int getOffsetY() {
      return this.c;
   }

   public final int getMaxWidth() {
      return this.g;
   }

   public final int getMaxHeight() {
      return this.f;
   }

   public final BufferedImage toBufferedOutline(Color var1) {
      BufferedImage var2 = new BufferedImage(this.getWidth(), this.getHeight(), 2);
      this.toBufferedOutline(var2, var1.getRGB());
      return var2;
   }

   public final BufferedImage toBufferedImage() {
      BufferedImage var1 = new BufferedImage(this.getWidth(), this.getHeight(), 2);
      this.toBufferedImage(var1);
      return var1;
   }

   @ObfuscatedName("ac")
   static void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = 256 - var11;
      int var13 = var2;

      for(int var14 = -var7; var14 < 0; ++var14) {
         int var15 = var10 * (var3 >> 16);

         for(int var16 = -var6; var16 < 0; ++var16) {
            if ((var7 = var1[(var2 >> 16) + var15]) != 0) {
               int var17 = var0[var4];
               client.a(var0, var4++, ((var7 & '\uff00') * var11 + var12 * (var17 & '\uff00') & 16711680) + ((var17 & 16711935) * var12 + var11 * (var7 & 16711935) & -16711936) >> 8, var11);
            } else {
               ++var4;
            }

            var2 += var8;
         }

         var3 += var9;
         var2 = var13;
         var4 += var5;
      }

   }

   @ObfuscatedName("ai")
   static void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var8;
      int var11 = (var9 & 16711935) * var10 & -16711936;
      var10 = (var9 & '\uff00') * var10 & 16711680;
      var9 = (var11 | var10) >>> 8;

      for(int var12 = -var5; var12 < 0; ++var12) {
         for(int var13 = -var4; var13 < 0; ++var13) {
            if ((var5 = var1[var2++]) != 0) {
               var11 = var8 * (var5 & 16711935) & -16711936;
               var10 = (var5 & '\uff00') * var8 & 16711680;
               var0[var3++] = var9 + ((var11 | var10) >>> 8) | -16777216;
            } else {
               ++var3;
            }
         }

         var3 += var6;
         var2 += var7;
      }

   }

   @ObfuscatedName("aj")
   private static void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            if ((var5 = var1[var2++]) != 0) {
               var0[var3++] = var5 | -16777216;
            } else {
               ++var3;
            }

            if ((var5 = var1[var2++]) != 0) {
               var0[var3++] = var5 | -16777216;
            } else {
               ++var3;
            }

            if ((var5 = var1[var2++]) != 0) {
               var0[var3++] = var5 | -16777216;
            } else {
               ++var3;
            }

            if ((var5 = var1[var2++]) != 0) {
               var0[var3++] = var5 | -16777216;
            } else {
               ++var3;
            }
         }

         for(var10 = var4; var10 < 0; ++var10) {
            if ((var5 = var1[var2++]) != 0) {
               var0[var3++] = var5 | -16777216;
            } else {
               ++var3;
            }
         }

         var3 += var6;
         var2 += var7;
      }

   }

   @ObfuscatedName("am")
   static void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var12 = -var5; var12 < 0; ++var12) {
         for(int var11 = -var4; var11 < 0; ++var11) {
            if ((var5 = var1[var2++]) != 0) {
               int var9;
               var5 = ((var9 = var8 * (var5 & 16711935)) & -16711936) + (var8 * var5 - var9 & 16711680) >>> 8;
               var9 = var0[var3];
               int var10 = var5 + var9;
               var9 = ((var5 = (var5 & 16711935) + (var9 & 16711935)) & 16777472) + (var10 - var5 & 65536);
               var0[var3++] = var10 - var9 | var9 - (var9 >>> 8);
            } else {
               ++var3;
            }
         }

         var3 += var6;
         var2 += var7;
      }

   }

   @ObfuscatedName("an")
   private static void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = var2;

      for(int var12 = -var7; var12 < 0; ++var12) {
         int var13 = var10 * (var3 >> 16);

         for(int var14 = -var6; var14 < 0; ++var14) {
            if ((var7 = var1[(var2 >> 16) + var13]) != 0) {
               var0[var4++] = var7 | -16777216;
            } else {
               ++var4;
            }

            var2 += var8;
         }

         var3 += var9;
         var2 = var11;
         var4 += var5;
      }

   }

   @ObfuscatedName("ap")
   private static void b(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(var5 = -var5; var5 < 0; ++var5) {
         int var8;
         for(var8 = var3 + var4 - 3; var3 < var8; var0[var3++] = var1[var2++] | -16777216) {
            var0[var3++] = var1[var2++] | -16777216;
            var0[var3++] = var1[var2++] | -16777216;
            var0[var3++] = var1[var2++] | -16777216;
         }

         for(var8 += 3; var3 < var8; var0[var3++] = var1[var2++] | -16777216) {
         }

         var3 += var6;
         var2 += var7;
      }

   }

   @ObfuscatedName("rv")
   @ObfuscatedSignature(
      signature = "(Lwd;I)V"
   )
   public static void a(iT var0, int var1) {
      int[] var2;
      int var3;
      int var4;
      int var5;
      int var6;
      if (var0 == null) {
         iT var10000 = var0;
         var1 = var1;
         var0 = var0;
         var2 = new int[var10000.f * var0.d];
         var3 = 0;

         for(var4 = 0; var4 < var0.e; ++var4) {
            for(var5 = 0; var5 < var0.g; ++var5) {
               if ((var6 = var0.b[var3]) == 0) {
                  if (var5 > 0 && var0.b[var3 - 1] != 0) {
                     var6 = var1;
                  } else if (var4 > 0 && var0.b[var3 - var0.e] != 0) {
                     var6 = var1;
                  } else if (var5 < var0.f - 1 && var0.b[var3 + 1] != 0) {
                     var6 = var1;
                  } else if (var4 < var0.f - 1 && var0.b[var3 + var0.f] != 0) {
                     var6 = var1;
                  }
               }

               var2[var3++] = var6;
            }
         }

         var0.b = var2;
      } else {
         var2 = new int[var0.a * var0.e];
         var3 = 0;

         for(var4 = 0; var4 < var0.e; ++var4) {
            for(var5 = 0; var5 < var0.a; ++var5) {
               if ((var6 = var0.b[var3]) == 0) {
                  if (var5 > 0 && var0.b[var3 - 1] != 0) {
                     var6 = var1;
                  } else if (var4 > 0 && var0.b[var3 - var0.a] != 0) {
                     var6 = var1;
                  } else if (var5 < var0.a - 1 && var0.b[var3 + 1] != 0) {
                     var6 = var1;
                  } else if (var4 < var0.e - 1 && var0.b[var3 + var0.a] != 0) {
                     var6 = var1;
                  }
               }

               var2[var3++] = var6;
            }
         }

         var0.b = var2;
      }
   }

   @ObfuscatedName("tc")
   @ObfuscatedSignature(
      signature = "(Lwd;III)V"
   )
   public static void a(iT var0, int var1, int var2, int var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var16;
      if (var0 == null) {
         var5 = var1 + var0.e;
         var6 = var1 + var0.c;
         var8 = var5 + var6 * jd.m;
         var9 = 0;
         var10 = var0.d;
         var11 = var0.e;
         var12 = jd.i - var11;
         var13 = 0;
         if (var6 < jd.j) {
            var14 = jd.l - var6;
            var10 -= var14;
            var6 = jd.n;
            var9 = 0 + var14 * var11;
            var8 += var14 * jd.j;
         }

         if (var10 + var6 > jd.k) {
            var10 -= var10 + var6 - jd.i;
         }

         if (var5 < jd.n) {
            var14 = jd.m - var5;
            var11 -= var14;
            var5 = jd.k;
            var9 += var14;
            var8 += var14;
            var13 = var14 + 0;
            var12 += var14;
         }

         if (var11 + var5 > jd.n) {
            var14 = var11 + var5 - jd.k;
            var11 -= var14;
            var13 += var14;
            var12 += var14;
         }

         if (var11 > 0 && var10 > 0) {
            int var10003 = var8;
            int var10005 = var10;
            var10 = var1;
            var8 = var13;
            var7 = var12;
            var6 = var10005;
            var5 = var11;
            var4 = var10003;
            var16 = var9;
            int[] var15 = var0.b;
            int[] var19 = jd.h;
            var11 = 256 - var1;

            for(var12 = -var6; var12 < 0; ++var12) {
               for(var13 = -var5; var13 < 0; ++var13) {
                  if ((var6 = var15[var16++]) != 0) {
                     var14 = var19[var4];
                     var19[var4++] = ((var14 & 16711935) * var11 + var10 * (var6 & 16711935) & -16711936) + ((var6 & '\uff00') * var10 + var11 * (var14 & '\uff00') & 16711680) >> 8;
                  } else {
                     ++var4;
                  }
               }

               var4 += var7;
               var16 += var8;
            }
         }
      }

      var1 += var0.d;
      var2 += var0.c;
      var4 = var1 + var2 * jd.i;
      var5 = 0;
      var6 = var0.e;
      var7 = var0.a;
      var8 = jd.i - var7;
      var9 = 0;
      if (var2 < jd.l) {
         var10 = jd.l - var2;
         var6 -= var10;
         var2 = jd.l;
         var5 = 0 + var10 * var7;
         var4 += var10 * jd.i;
      }

      if (var6 + var2 > jd.k) {
         var6 -= var6 + var2 - jd.k;
      }

      if (var1 < jd.n) {
         var10 = jd.n - var1;
         var7 -= var10;
         var1 = jd.n;
         var5 += var10;
         var4 += var10;
         var9 = var10 + 0;
         var8 += var10;
      }

      if (var7 + var1 > jd.m) {
         var10 = var7 + var1 - jd.m;
         var7 -= var10;
         var9 += var10;
         var8 += var10;
      }

      if (var7 > 0 && var6 > 0) {
         var12 = var3;
         var11 = var9;
         var10 = var8;
         var9 = var6;
         var8 = var7;
         var7 = var4;
         var6 = var5;
         int[] var18 = var0.b;
         int[] var17 = jd.h;
         var14 = 256 - var3;

         for(var9 = -var9; var9 < 0; ++var9) {
            for(int var20 = -var8; var20 < 0; ++var20) {
               if ((var13 = var18[var6++]) != 0) {
                  var16 = var17[var7];
                  client.a(var17, var7++, ((var16 & 16711935) * var14 + var12 * (var13 & 16711935) & -16711936) + ((var13 & '\uff00') * var12 + var14 * (var16 & '\uff00') & 16711680) >> 8, var12);
               } else {
                  ++var7;
               }
            }

            var7 += var10;
            var6 += var11;
         }
      }

   }
}
