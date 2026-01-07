package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public final class H {
   @ObfuscatedName("ac")
   int[] a;
   @ObfuscatedName("ai")
   private int[] c;
   @ObfuscatedName("aj")
   private int d;
   @ObfuscatedName("al")
   private float[][] e;
   @ObfuscatedName("an")
   private int[] f;
   @ObfuscatedName("ap")
   int b;

   H() {
      w var1;
      w.a((w)(var1 = E.l), 24);
      this.b = w.a((w)var1, 16);
      this.d = w.a((w)var1, 24);
      this.f = new int[this.d];
      int var2;
      int var3;
      int var4;
      int var5;
      if (var1.a() != 0) {
         var2 = 0;

         for(var3 = w.a((w)var1, 5) + 1; var2 < this.d; ++var3) {
            var5 = w.a(var1, aV.a(this.d - var2));

            for(var4 = 0; var4 < var5; ++var4) {
               this.f[var2++] = var3;
            }
         }
      } else {
         boolean var15 = var1.a() != 0;

         for(var3 = 0; var3 < this.d; ++var3) {
            if (var15 && var1.a() == 0) {
               this.f[var3] = 0;
            } else {
               this.f[var3] = w.a((w)var1, 5) + 1;
            }
         }
      }

      H var7 = this;
      int[] var8 = new int[this.d];
      int[] var9 = new int[33];

      int var10;
      int var11;
      int var12;
      int var13;
      for(var10 = 0; var10 < var7.d; ++var10) {
         if ((var11 = var7.f[var10]) != 0) {
            var12 = 1 << 32 - var11;
            var13 = var9[var11];
            var8[var10] = var13;
            if ((var13 & var12) != 0) {
               var2 = var9[var11 - 1];
            } else {
               var2 = var13 | var12;

               for(var3 = var11 - 1; var3 > 0 && (var5 = var9[var3]) == var13; --var3) {
                  var4 = 1 << 32 - var3;
                  if ((var5 & var4) != 0) {
                     var9[var3] = var9[var3 - 1];
                     break;
                  }

                  var9[var3] = var5 | var4;
               }
            }

            var9[var11] = var2;

            for(var3 = var11 + 1; var3 <= 32; ++var3) {
               if (var9[var3] == var13) {
                  var9[var3] = var2;
               }
            }
         }
      }

      var7.a = new int[8];
      var5 = 0;

      for(var10 = 0; var10 < var7.d; ++var10) {
         if ((var11 = var7.f[var10]) != 0) {
            var12 = var8[var10];
            var13 = 0;

            for(var2 = 0; var2 < var11; ++var2) {
               var3 = Integer.MIN_VALUE >>> var2;
               if ((var12 & var3) != 0) {
                  if (var7.a[var13] == 0) {
                     var7.a[var13] = var5;
                  }

                  var13 = var7.a[var13];
               } else {
                  ++var13;
               }

               if (var13 >= var7.a.length) {
                  int[] var16 = new int[var7.a.length << 1];

                  for(var4 = 0; var4 < var7.a.length; ++var4) {
                     var16[var4] = var7.a[var4];
                  }

                  var7.a = var16;
               }
            }

            var7.a[var13] = ~var10;
            if (var13 >= var5) {
               var5 = var13 + 1;
            }
         }
      }

      if ((var2 = w.a((w)var1, 4)) > 0) {
         float var18 = E.a(w.a((w)var1, 32));
         float var17 = E.a(w.a((w)var1, 32));
         var4 = w.a((w)var1, 4) + 1;
         boolean var6 = var1.a() != 0;
         int var19;
         int var20;
         int var21;
         if (var2 != 1) {
            var19 = this.d * this.b;
         } else {
            int var10000 = this.d;
            var20 = this.b;
            var19 = var10000;
            var21 = (int)Math.pow((double)var10000, 1.0D / (double)var20) + 1;

            while(true) {
               var10 = var21;
               var11 = var20;

               for(var12 = 1; var11 > 1; var11 >>= 1) {
                  if ((var11 & 1) != 0) {
                     var12 *= var10;
                  }

                  var10 *= var10;
               }

               if (var11 == 1) {
                  var13 = var12 * var10;
               } else {
                  var13 = var12;
               }

               if (var13 <= var19) {
                  var19 = var21;
                  break;
               }

               --var21;
            }
         }

         this.c = new int[var19];

         for(var20 = 0; var20 < var19; ++var20) {
            this.c[var20] = w.a(var1, var4);
         }

         this.e = new float[this.d][this.b];
         float var14;
         float var22;
         if (var2 == 1) {
            for(var20 = 0; var20 < this.d; ++var20) {
               var14 = 0.0F;
               var2 = 1;

               for(var4 = 0; var4 < this.b; ++var4) {
                  var21 = var20 / var2 % var19;
                  var22 = (float)this.c[var21] * var17 + var18 + var14;
                  this.e[var20][var4] = var22;
                  if (var6) {
                     var14 = var22;
                  }

                  var2 *= var19;
               }
            }
         } else {
            for(var20 = 0; var20 < this.d; ++var20) {
               var14 = 0.0F;
               var2 = var20 * this.b;

               for(var4 = 0; var4 < this.b; ++var4) {
                  var22 = (float)this.c[var2] * var17 + var18 + var14;
                  this.e[var20][var4] = var22;
                  if (var6) {
                     var14 = var22;
                  }

                  ++var2;
               }
            }
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Lef;)[F"
   )
   final float[] a(w var1) {
      return this.e[this.b(var1)];
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lef;)I"
   )
   final int b(w var1) {
      int var2;
      for(var2 = 0; this.a[var2] >= 0; var2 = var1.a() != 0 ? this.a[var2] : var2 + 1) {
      }

      return ~this.a[var2];
   }
}
