package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wm")
public class jd extends im {
   @ObfuscatedName("aq")
   public static int[] h;
   @ObfuscatedName("ay")
   public static int i;
   @ObfuscatedName("ba")
   public static int j;
   @ObfuscatedName("bi")
   public static int k = 0;
   @ObfuscatedName("bl")
   public static int l = 0;
   @ObfuscatedName("bq")
   public static int m = 0;
   @ObfuscatedName("bv")
   public static int n = 0;
   @ObfuscatedName("bx")
   public static float[] o;

   protected jd() {
   }

   @ObfuscatedName("eb")
   public static void c(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < n) {
         var2 -= n - var0;
         var0 = n;
      }

      if (var1 < l) {
         var3 -= l - var1;
         var1 = l;
      }

      if (var0 + var2 > m) {
         var2 = m - var0;
      }

      if (var3 + var1 > k) {
         var3 = k - var1;
      }

      var4 = (var5 * (var4 & 16711935) >> 8 & 16711935) + (var5 * (var4 & '\uff00') >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = i - var2;
      var0 += i * var1;

      for(var1 = 0; var1 < var3; ++var1) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            int var9 = (((var9 = h[var0]) & 16711935) * var6 >> 8 & 16711935) + (var6 * (var9 & '\uff00') >> 8 & '\uff00');
            client.a(h, var0++, var9 + var4, var5);
         }

         var0 += var7;
      }

   }

   @ObfuscatedName("ec")
   public static void a(int[] var0) {
      n = var0[0];
      l = var0[1];
      m = var0[2];
      k = var0[3];
   }

   @ObfuscatedName("ed")
   public static void g(int var0, int var1, int var2, int var3, int var4) {
      f(var0, var1, var2, var4);
      f(var0, var3 + var1 - 1, var2, var4);
      g(var0, var1, var3, var4);
      g(var0 + var2 - 1, var1, var3, var4);
   }

   @ObfuscatedName("ef")
   protected static void b(int[] var0, int var1, int var2, float[] var3) {
      h = var0;
      i = var1;
      j = var2;
      o = var3;
      d(0, 0, var1, var2);
   }

   @ObfuscatedName("eg")
   @ObfuscatedSignature(
      signature = "(IIIIII[BIZ)V",
      garbageValue = "1"
   )
   public static void a(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7) {
      int var8 = i;
      int var9 = j;
      int[] var10 = h;
      int var11;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      int var19;
      int var20;
      int var21;
      int var22;
      if (!dF.c.isGpu()) {
         var11 = var7;
         byte[] var23 = var6;
         var9 = var5;
         var13 = var4;
         var14 = var3;
         var15 = var2;
         var8 = var1;
         var16 = var0;
         if (var0 + var2 >= 0 && var1 + var3 >= 0 && var0 < i && var1 < j) {
            var17 = 0;
            var18 = 0;
            if (var0 < 0) {
               var17 = 0 - var0;
               var15 = var2 + var0;
            }

            if (var1 < 0) {
               var18 = 0 - var1;
               var14 = var3 + var1;
            }

            if (var0 + var15 > i) {
               var15 = i - var0;
            }

            if (var1 + var14 > j) {
               var14 = j - var1;
            }

            var19 = var6.length / var7;
            var20 = i - var15;
            var21 = var4 >>> 24;
            var22 = var5 >>> 24;
            if (var21 == 255 && var22 == 255) {
               var21 = (var1 + var18) * i + var0 + var17;

               for(var0 = var1 + var18; var0 < var8 + var18 + var14; ++var0) {
                  for(var1 = var16 + var17; var1 < var16 + var17 + var15; ++var1) {
                     var2 = (var0 - var8) % var19;
                     var3 = (var1 - var16) % var11;
                     if (var23[var3 + var2 * var11] != 0) {
                        h[var21++] = var9;
                     } else {
                        h[var21++] = var13;
                     }
                  }

                  var21 += var20;
               }
            } else {
               var21 = (var1 + var18) * i + var0 + var17;

               for(var0 = var1 + var18; var0 < var8 + var18 + var14; ++var0) {
                  for(var1 = var16 + var17; var1 < var16 + var17 + var15; ++var1) {
                     var2 = (var0 - var8) % var19;
                     var3 = (var1 - var16) % var11;
                     var4 = var13;
                     if (var23[var3 + var2 * var11] != 0) {
                        var4 = var9;
                     }

                     var2 = var4 >>> 24;
                     var3 = 255 - var2;
                     var5 = h[var21];
                     var2 = ((var4 & 16711935) * var2 + (var5 & 16711935) * var3 & -16711936) + (var2 * (var4 & '\uff00') + var3 * (var5 & '\uff00') & 16711680) >> 8;
                     h[var21++] = var2;
                  }

                  var21 += var20;
               }
            }
         }

      } else {
         if (var0 + var2 >= 0 && var3 + var1 >= 0 && var0 < var8 && var1 < var9) {
            var11 = 0;
            int var12 = 0;
            if (var0 < 0) {
               var11 = 0 - var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var12 = 0 - var1;
               var3 += var1;
            }

            if (var0 + var2 > var8) {
               var2 = var8 - var0;
            }

            if (var3 + var1 > var9) {
               var3 = var9 - var1;
            }

            var9 = var6.length / var7;
            var13 = var8 - var2;
            var14 = var4 >>> 24;
            var15 = var5 >>> 24;
            if (var14 == 255 && var15 == 255) {
               var8 = var0 + var11 + var8 * (var12 + var1);

               for(var16 = var12 + var1; var16 < var3 + var12 + var1; ++var16) {
                  for(var14 = var0 + var11; var14 < var0 + var11 + var2; ++var14) {
                     var17 = (var16 - var1) % var9;
                     var18 = (var14 - var0) % var7;
                     if (var6[var18 + var17 * var7] != 0) {
                        var10[var8++] = var5;
                     } else {
                        var10[var8++] = var4;
                     }
                  }

                  var8 += var13;
               }
            } else {
               var8 = var0 + var11 + var8 * (var12 + var1);

               for(var16 = var12 + var1; var16 < var3 + var12 + var1; ++var16) {
                  for(var14 = var0 + var11; var14 < var0 + var11 + var2; ++var14) {
                     var17 = (var16 - var1) % var9;
                     var18 = (var14 - var0) % var7;
                     var19 = var4;
                     if (var6[var18 + var17 * var7] != 0) {
                        var19 = var5;
                     }

                     var20 = var19 >>> 24;
                     var21 = 255 - var20;
                     var22 = var10[var8];
                     var21 = (var20 * (var19 & '\uff00') + var21 * (var22 & '\uff00') & 16711680) + ((var19 & 16711935) * var20 + (var22 & 16711935) * var21 & -16711936) >> 8;
                     client.a(var10, var8++, var21, var20);
                  }

                  var8 += var13;
               }
            }
         }

      }
   }

   @ObfuscatedName("ej")
   public static void d(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < n) {
            var2 -= n - var0;
            var0 = n;
         }

         if (var1 < l) {
            var6 = 0 + (l - var1) * var7;
            var3 -= l - var1;
            var1 = l;
         }

         if (var0 + var2 > m) {
            var2 = m - var0;
         }

         if (var3 + var1 > k) {
            var3 = k - var1;
         }

         int var8 = i - var2;
         var0 += i * var1;

         for(var1 = -var3; var1 < 0; ++var1) {
            var3 = 65536 - var6 >> 8;
            int var9;
            var3 = ((var9 = var6 >> 8) * (var5 & 16711935) + var3 * (var4 & 16711935) & -16711936) + (var9 * (var5 & '\uff00') + var3 * (var4 & '\uff00') & 16711680) >>> 8;

            for(var9 = -var2; var9 < 0; ++var9) {
               h[var0++] = var3 | -16777216;
            }

            var0 += var8;
            var6 += var7;
         }
      }

   }

   @ObfuscatedName("ek")
   public static void h(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < n) {
         var2 -= n - var0;
         var0 = n;
      }

      if (var1 < l) {
         var3 -= l - var1;
         var1 = l;
      }

      if (var0 + var2 > m) {
         var2 = m - var0;
      }

      if (var3 + var1 > k) {
         var3 = k - var1;
      }

      int var5 = i - var2;
      var0 += i * var1;

      for(var1 = -var3; var1 < 0; ++var1) {
         for(var3 = -var2; var3 < 0; ++var3) {
            h[var0++] = var4 | -16777216;
         }

         var0 += var5;
      }

   }

   @ObfuscatedName("eo")
   public static void g() {
      int var0 = 0;

      int var1;
      for(var1 = i * j - 7; var0 < var1; h[var0++] = 0) {
         h[var0++] = 0;
         h[var0++] = 0;
         h[var0++] = 0;
         h[var0++] = 0;
         h[var0++] = 0;
         h[var0++] = 0;
         h[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; h[var0++] = 0) {
      }

      i();
   }

   @ObfuscatedName("eq")
   public static void d(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > i) {
         var2 = i;
      }

      if (var3 > j) {
         var3 = j;
      }

      n = var0;
      l = var1;
      m = var2;
      k = var3;
   }

   @ObfuscatedName("er")
   public static void e(int var0, int var1, int var2, int var3) {
      if (n < var0) {
         n = var0;
      }

      if (l < var1) {
         l = var1;
      }

      if (m > var2) {
         m = var2;
      }

      if (k > var3) {
         k = var3;
      }

   }

   @ObfuscatedName("es")
   public static void b(int[] var0) {
      var0[0] = n;
      var0[1] = l;
      var0[2] = m;
      var0[3] = k;
   }

   @ObfuscatedName("eu")
   public static void i(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            a(var0, var1, var2, var3);
            return;
         }

         if (var2 < 0) {
            var2 = -var2;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         var3 = var4 * (var3 & 255);
         int var8;
         if ((var8 = var1 - var2) < l) {
            var8 = l;
         }

         int var9;
         if ((var9 = var2 + var1 + 1) > k) {
            var9 = k;
         }

         int var10 = var8;
         int var11 = var2 * var2;
         int var12 = 0;
         int var13;
         int var14 = (var13 = (var8 = var1 - var8) * var8) - var8;
         if (var1 > var9) {
            var1 = var9;
         }

         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         int var20;
         while(var10 < var1) {
            while(var14 <= var11 || var13 <= var11) {
               var13 = var13 + var12 + var12;
               var14 += var12++ + var12;
            }

            if ((var15 = var0 - var12 + 1) < n) {
               var15 = n;
            }

            if ((var18 = var0 + var12) > m) {
               var18 = m;
            }

            var19 = var15 + var10 * i;

            for(var20 = var15; var20 < var18; ++var20) {
               var15 = var5 * (h[var19] >> 16 & 255);
               var16 = (h[var19] >> 8 & 255) * var5;
               var17 = var5 * (h[var19] & 255);
               var15 = (var3 + var17 >> 8) + (var6 + var15 >> 8 << 16) + (var7 + var16 >> 8 << 8);
               client.a(h, var19++, var15, var4);
            }

            ++var10;
            var13 -= var8-- + var8;
            var14 -= var8 + var8;
         }

         var12 = var2;
         var8 = -var8;
         var13 = (var14 = var11 + var8 * var8) - var2;

         for(var14 -= var8; var10 < var9; var13 += var8++ + var8) {
            while(var14 > var11 && var13 > var11) {
               var14 -= var12-- + var12;
               var13 -= var12 + var12;
            }

            if ((var15 = var0 - var12) < n) {
               var15 = n;
            }

            if ((var18 = var0 + var12) > m - 1) {
               var18 = m - 1;
            }

            var19 = var15 + var10 * i;

            for(var20 = var15; var20 <= var18; ++var20) {
               var15 = var5 * (h[var19] >> 16 & 255);
               var16 = (h[var19] >> 8 & 255) * var5;
               var17 = var5 * (h[var19] & 255);
               var15 = (var3 + var17 >> 8) + (var6 + var15 >> 8 << 16) + (var7 + var16 >> 8 << 8);
               client.a(h, var19++, var15, var4);
            }

            ++var10;
            var14 = var14 + var8 + var8;
         }
      }

   }

   @ObfuscatedName("ev")
   public static void e(int var0, int var1, int var2, int var3, int var4, int var5) {
      j(var0, var1, var2, var4, var5);
      j(var0, var3 + var1 - 1, var2, var4, var5);
      if (var3 >= 3) {
         k(var0, var1 + 1, var3 - 2, var4, var5);
         k(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   @ObfuscatedName("ex")
   public static void b(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = i;
      int var9 = n;
      int var10 = l;
      int var11 = m;
      int var12 = k;
      int[] var13 = h;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      int var19;
      if (!dF.c.isGpu()) {
         var14 = var7;
         var15 = var6;
         var9 = var5;
         var10 = var4;
         var11 = var3;
         var12 = var2;
         var16 = var1;
         var17 = var0;
         if (var2 > 0 && var3 > 0) {
            var18 = 0;
            var19 = 65536 / var3;
            if (var0 < n) {
               var12 = var2 - (n - var0);
               var17 = n;
            }

            if (var1 < l) {
               var18 = 0 + var19 * (l - var1);
               var11 = var3 - (l - var1);
               var16 = l;
            }

            if (var17 + var12 > m) {
               var12 = m - var17;
            }

            if (var16 + var11 > k) {
               var11 = k - var16;
            }

            var0 = i - var12;
            var1 = var17 + var16 * i;

            for(var3 = -var11; var3 < 0; ++var3) {
               var2 = 65536 - var18 >> 8;
               var4 = var18 >> 8;
               if ((var5 = var15 * var2 + var14 * var4 >>> 8 & 255) == 0) {
                  var1 += i;
                  var18 += var19;
               } else {
                  var2 = ((var10 & 16711935) * var2 + (var9 & 16711935) * var4 & -16711936) + (var2 * (var10 & '\uff00') + var4 * (var9 & '\uff00') & 16711680) >>> 8;
                  var4 = 255 - var5;
                  var2 = ((var2 & 16711935) * var5 >> 8 & 16711935) + (var5 * (var2 & '\uff00') >> 8 & '\uff00');

                  for(var5 = -var12; var5 < 0; ++var5) {
                     if ((var6 = h[var1]) == 0) {
                        h[var1++] = var2;
                     } else {
                        var6 = ((var6 & 16711935) * var4 >> 8 & 16711935) + (var4 * (var6 & '\uff00') >> 8 & '\uff00');
                        h[var1++] = var2 + var6;
                     }
                  }

                  var1 += var0;
                  var18 += var19;
               }
            }
         }

      } else {
         if (var2 > 0 && var3 > 0) {
            var14 = 0;
            var15 = 65536 / var3;
            if (var0 < var9) {
               var2 -= var9 - var0;
               var0 = var9;
            }

            if (var1 < var10) {
               var14 = 0 + (var10 - var1) * var15;
               var3 -= var10 - var1;
               var1 = var10;
            }

            if (var0 + var2 > var11) {
               var2 = var11 - var0;
            }

            if (var3 + var1 > var12) {
               var3 = var12 - var1;
            }

            var9 = var8 - var2;
            var10 = var0 + var8 * var1;

            for(var11 = -var3; var11 < 0; ++var11) {
               var12 = 65536 - var14 >> 8;
               var16 = var14 >> 8;
               if ((var17 = var12 * var6 + var16 * var7 >>> 8 & 255) == 0) {
                  var10 += var8;
                  var14 += var15;
               } else {
                  var18 = (var12 * (var4 & '\uff00') + var16 * (var5 & '\uff00') & 16711680) + (var12 * (var4 & 16711935) + var16 * (var5 & 16711935) & -16711936) >>> 8;
                  var19 = 255 - var17;
                  var0 = ((var18 & 16711935) * var17 >> 8 & 16711935) + (var17 * (var18 & '\uff00') >> 8 & '\uff00');

                  for(var1 = -var2; var1 < 0; ++var1) {
                     var3 = (((var3 = var13[var10]) & 16711935) * var19 >> 8 & 16711935) + (var19 * (var3 & '\uff00') >> 8 & '\uff00');
                     client.a(var13, var10++, var0 + var3, var17);
                  }

                  var10 += var9;
                  var14 += var15;
               }
            }
         }

      }
   }

   @ObfuscatedName("ey")
   public static void h() {
      n = 0;
      l = 0;
      m = i;
      k = j;
   }

   @ObfuscatedName("ez")
   private static void a(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         a(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4;
         if ((var4 = var1 - var2) < l) {
            var4 = l;
         }

         int var5;
         if ((var5 = var2 + var1 + 1) > k) {
            var5 = k;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9;
         int var10 = (var9 = (var4 = var1 - var4) * var4) - var4;
         if (var1 > var5) {
            var1 = var5;
         }

         int var11;
         int var12;
         int var13;
         while(var6 < var1) {
            while(var10 <= var7 || var9 <= var7) {
               var9 = var9 + var8 + var8;
               var10 += var8++ + var8;
            }

            if ((var11 = var0 - var8 + 1) < n) {
               var11 = n;
            }

            if ((var12 = var0 + var8) > m) {
               var12 = m;
            }

            var13 = var11 + var6 * i;

            for(var11 = var11; var11 < var12; ++var11) {
               h[var13++] = var3 | -16777216;
            }

            ++var6;
            var9 -= var4-- + var4;
            var10 -= var4 + var4;
         }

         var8 = var2;
         var4 = var6 - var1;
         var9 = (var10 = var7 + var4 * var4) - var2;

         for(var10 -= var4; var6 < var5; var9 += var4++ + var4) {
            while(var10 > var7 && var9 > var7) {
               var10 -= var8-- + var8;
               var9 -= var8 + var8;
            }

            if ((var11 = var0 - var8) < n) {
               var11 = n;
            }

            if ((var12 = var0 + var8) > m - 1) {
               var12 = m - 1;
            }

            var13 = var11 + var6 * i;

            for(var11 = var11; var11 <= var12; ++var11) {
               h[var13++] = var3 | -16777216;
            }

            ++var6;
            var10 = var10 + var4 + var4;
         }

      }
   }

   @ObfuscatedName("fa")
   static void j(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= l && var1 < k) {
         if (var0 < n) {
            var2 -= n - var0;
            var0 = n;
         }

         if (var0 + var2 > m) {
            var2 = m - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         var3 = var4 * (var3 & 255);
         var0 += i * var1;

         for(var1 = 0; var1 < var2; ++var1) {
            int var8 = var5 * (h[var0] >> 16 & 255);
            int var9 = (h[var0] >> 8 & 255) * var5;
            int var10 = var5 * (h[var0] & 255);
            var8 = (var3 + var10 >> 8) + (var6 + var8 >> 8 << 16) + (var7 + var9 >> 8 << 8);
            client.a(h, var0++, var8, var4);
         }
      }

   }

   @ObfuscatedName("fg")
   public static void b(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + i * var1;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            h[var6++] = var2 | -16777216;
         }

         var5 += i;
      }

   }

   @ObfuscatedName("fi")
   public static void i() {
      if (!dF.c.isGpu() && o != null) {
         int var0;
         int var1;
         int var2;
         if (n == 0 && m == i && l == 0 && k == j) {
            var1 = (var0 = o.length) - (var0 & 7);

            for(var2 = 0; var2 < var1; o[var2++] = 0.0F) {
               o[var2++] = 0.0F;
               o[var2++] = 0.0F;
               o[var2++] = 0.0F;
               o[var2++] = 0.0F;
               o[var2++] = 0.0F;
               o[var2++] = 0.0F;
               o[var2++] = 0.0F;
            }

            while(var2 < var0) {
               o[var2++] = 0.0F;
            }
         } else {
            var0 = m - n;
            var1 = k - l;
            var2 = i - var0;
            int var3 = l * i + n;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for(var1 = -var1; var1 < 0; ++var1) {
               if (var4 > 0) {
                  var3 = var4;

                  do {
                     ++var0;
                     o[var0] = 0.0F;
                     ++var0;
                     o[var0] = 0.0F;
                     ++var0;
                     o[var0] = 0.0F;
                     ++var0;
                     o[var0] = 0.0F;
                     ++var0;
                     o[var0] = 0.0F;
                     ++var0;
                     o[var0] = 0.0F;
                     ++var0;
                     o[var0] = 0.0F;
                     ++var0;
                     o[var0] = 0.0F;
                     --var3;
                  } while(var3 > 0);
               }

               if (var5 > 0) {
                  var3 = var5;

                  do {
                     ++var0;
                     o[var0] = 0.0F;
                     --var3;
                  } while(var3 > 0);
               }

               var0 += var2;
            }
         }
      }

   }

   @ObfuscatedName("fk")
   static void k(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= n && var0 < m) {
         if (var1 < l) {
            var2 -= l - var1;
            var1 = l;
         }

         if (var2 + var1 > k) {
            var2 = k - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         var3 = var4 * (var3 & 255);
         var0 += i * var1;

         for(var1 = 0; var1 < var2; ++var1) {
            int var8 = var5 * (h[var0] >> 16 & 255);
            int var9 = (h[var0] >> 8 & 255) * var5;
            int var10 = var5 * (h[var0] & 255);
            var8 = (var3 + var10 >> 8) + (var6 + var8 >> 8 << 16) + (var7 + var9 >> 8 << 8);
            client.a(h, var0, var8, var4);
            var0 += i;
         }
      }

   }

   @ObfuscatedName("fm")
   public static void c(int[] var0) {
      var0[0] = n;
      var0[1] = l;
      var0[2] = m;
      var0[3] = k;
   }

   @ObfuscatedName("fo")
   public static void l(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      if ((var3 -= var1) == 0) {
         if (var2 >= 0) {
            f(var0, var1, var2 + 1, var4);
         } else {
            f(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            g(var0, var1, var3 + 1, var4);
         } else {
            g(var0, var3 + var1, -var3 + 1, var4);
         }
      } else {
         if (var3 + var2 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if (var2 > var3) {
            var1 = (var1 <<= 16) + '耀';
            var5 = (int)Math.floor((double)(var3 <<= 16) / (double)var2 + 0.5D);
            var2 += var0;
            if (var0 < n) {
               var1 += var5 * (n - var0);
               var0 = n;
            }

            if (var2 >= m) {
               var2 = m - 1;
            }

            while(var0 <= var2) {
               if ((var6 = var1 >> 16) >= l && var6 < k) {
                  h[var0 + var6 * i] = var4 | -16777216;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 = (var0 <<= 16) + '耀';
            var5 = (int)Math.floor((double)(var2 <<= 16) / (double)var3 + 0.5D);
            var3 += var1;
            if (var1 < l) {
               var0 += (l - var1) * var5;
               var1 = l;
            }

            if (var3 >= k) {
               var3 = k - 1;
            }

            while(var1 <= var3) {
               if ((var6 = var0 >> 16) >= n && var6 < m) {
                  h[var6 + i * var1] = var4 | -16777216;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   @ObfuscatedName("fq")
   public static void f(int var0, int var1, int var2, int var3) {
      if (var1 >= l && var1 < k) {
         if (var0 < n) {
            var2 -= n - var0;
            var0 = n;
         }

         if (var0 + var2 > m) {
            var2 = m - var0;
         }

         var0 += i * var1;

         for(var1 = 0; var1 < var2; ++var1) {
            h[var0 + var1] = var3 | -16777216;
         }
      }

   }

   @ObfuscatedName("fu")
   private static void a(int var0, int var1, int var2) {
      if (var0 >= n && var1 >= l && var0 < m && var1 < k) {
         h[var0 + i * var1] = var2 | -16777216;
      }

   }

   @ObfuscatedName("fw")
   public static void g(int var0, int var1, int var2, int var3) {
      if (var0 >= n && var0 < m) {
         if (var1 < l) {
            var2 -= l - var1;
            var1 = l;
         }

         if (var2 + var1 > k) {
            var2 = k - var1;
         }

         var0 += i * var1;

         for(var1 = 0; var1 < var2; ++var1) {
            h[var0 + var1 * i] = var3 | -16777216;
         }
      }

   }

   @ObfuscatedName("fx")
   public static void j() {
      if (o != null) {
         int var0 = o.length;

         for(int var1 = 0; var1 < var0; ++var1) {
            if (var1 % i < i / 2 && o[var1] > 0.0F) {
               int var2 = (int)(255.0F * au.a(o[var1]));
               h[var1] = var2 << 16 | var2 << 8 | var2;
            }
         }
      }

   }

   @ObfuscatedName("fy")
   public static void d(int[] var0) {
      var0[0] = n;
      var0[1] = l;
      var0[2] = m;
      var0[3] = k;
   }

   @ObfuscatedName("ga")
   public static void m(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            a(var0, var1, var2, var3);
            return;
         }

         if (var2 < 0) {
            var2 = -var2;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         var3 = var4 * (var3 & 255);
         if ((var4 = var1 - var2) < l) {
            var4 = l;
         }

         int var8;
         if ((var8 = var2 + var1 + 1) > k) {
            var8 = k;
         }

         int var9 = var4;
         int var10 = var2 * var2;
         int var11 = 0;
         int var12;
         int var13 = (var12 = (var4 = var1 - var4) * var4) - var4;
         if (var1 > var8) {
            var1 = var8;
         }

         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         while(var9 < var1) {
            while(var13 <= var10 || var12 <= var10) {
               var12 = var12 + var11 + var11;
               var13 += var11++ + var11;
            }

            if ((var14 = var0 - var11 + 1) < n) {
               var14 = n;
            }

            if ((var17 = var0 + var11) > m) {
               var17 = m;
            }

            var18 = var14 + var9 * i;

            for(var19 = var14; var19 < var17; ++var19) {
               var14 = var5 * (h[var18] >> 16 & 255);
               var15 = (h[var18] >> 8 & 255) * var5;
               var16 = var5 * (h[var18] & 255);
               var14 = (var3 + var16 >> 8) + (var6 + var14 >> 8 << 16) + (var7 + var15 >> 8 << 8);
               h[var18++] = var14;
            }

            ++var9;
            var12 -= var4-- + var4;
            var13 -= var4 + var4;
         }

         var11 = var2;
         var4 = -var4;
         var12 = (var13 = var10 + var4 * var4) - var2;

         for(var13 -= var4; var9 < var8; var12 += var4++ + var4) {
            while(var13 > var10 && var12 > var10) {
               var13 -= var11-- + var11;
               var12 -= var11 + var11;
            }

            if ((var14 = var0 - var11) < n) {
               var14 = n;
            }

            if ((var17 = var0 + var11) > m - 1) {
               var17 = m - 1;
            }

            var18 = var14 + var9 * i;

            for(var19 = var14; var19 <= var17; ++var19) {
               var14 = var5 * (h[var18] >> 16 & 255);
               var15 = (h[var18] >> 8 & 255) * var5;
               var16 = var5 * (h[var18] & 255);
               var14 = (var3 + var16 >> 8) + (var6 + var14 >> 8 << 16) + (var7 + var15 >> 8 << 8);
               h[var18++] = var14;
            }

            ++var9;
            var13 = var13 + var4 + var4;
         }
      }

   }

   @ObfuscatedName("gc")
   public static void n(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < n) {
         var2 -= n - var0;
         var0 = n;
      }

      if (var1 < l) {
         var3 -= l - var1;
         var1 = l;
      }

      if (var0 + var2 > m) {
         var2 = m - var0;
      }

      if (var3 + var1 > k) {
         var3 = k - var1;
      }

      int var5 = i - var2;
      var0 += i * var1;

      for(var1 = -var3; var1 < 0; ++var1) {
         for(var3 = -var2; var3 < 0; ++var3) {
            h[var0++] = var4;
         }

         var0 += var5;
      }

   }

   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      signature = "(IIIIII[BIZ)V",
      garbageValue = "1"
   )
   public static void b(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7) {
      if (var0 + var2 >= 0 && var3 + var1 >= 0 && var0 < i && var1 < j) {
         int var8 = 0;
         int var9 = 0;
         if (var0 < 0) {
            var8 = 0 - var0;
            var2 += var0;
         }

         if (var1 < 0) {
            var9 = 0 - var1;
            var3 += var1;
         }

         if (var0 + var2 > i) {
            var2 = i - var0;
         }

         if (var3 + var1 > j) {
            var3 = j - var1;
         }

         int var10 = var6.length / var7;
         int var11 = i - var2;
         int var12 = var4 >>> 24;
         int var13 = var5 >>> 24;
         int var14;
         int var15;
         int var16;
         if (var12 == 255 && var13 == 255) {
            var12 = var0 + var8 + (var9 + var1) * i;

            for(var13 = var9 + var1; var13 < var3 + var9 + var1; ++var13) {
               for(var14 = var0 + var8; var14 < var0 + var8 + var2; ++var14) {
                  var15 = (var13 - var1) % var10;
                  var16 = (var14 - var0) % var7;
                  if (var6[var16 + var15 * var7] != 0) {
                     h[var12++] = var5;
                  } else {
                     h[var12++] = var4;
                  }
               }

               var12 += var11;
            }
         } else {
            var12 = var0 + var8 + (var9 + var1) * i;

            for(var13 = var9 + var1; var13 < var3 + var9 + var1; ++var13) {
               for(var14 = var0 + var8; var14 < var0 + var8 + var2; ++var14) {
                  var15 = (var13 - var1) % var10;
                  var16 = (var14 - var0) % var7;
                  int var17 = var4;
                  if (var6[var16 + var15 * var7] != 0) {
                     var17 = var5;
                  }

                  var15 = var17 >>> 24;
                  var16 = 255 - var15;
                  int var18 = h[var12];
                  var15 = (var16 * (var18 & 1186349999) + var15 * (var17 & '\uff00') & -1773582495) + ((var17 & -1740535660) * var15 + var16 * (var18 & -1796606515) & 1390130401) >> 8;
                  h[var12++] = var15;
               }

               var12 += var11;
            }
         }
      }

   }

   @ObfuscatedName("gr")
   public static void e(int[] var0) {
      n = var0[0];
      l = var0[1];
      m = var0[2];
      k = var0[3];
   }

   @ObfuscatedName("gv")
   public static void f(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         var4 = 0;
         var5 = 65536 / var3;
         if (var0 < n) {
            var2 -= n - var0;
            var0 = n;
         }

         if (var1 < l) {
            var4 = 0 + (l - var1) * var5;
            var3 -= l - var1;
            var1 = l;
         }

         if (var0 + var2 > m) {
            var2 = m - var0;
         }

         if (var3 + var1 > k) {
            var3 = k - var1;
         }

         int var6 = i - var2;
         var0 += i * var1;

         for(var1 = -var3; var1 < 0; ++var1) {
            var3 = 531239531 - var4 >> 8;
            int var7;
            var3 = (((var7 = var4 >> 8) << 7) + 0 & -16711936) + (0 * var3 + 0 & -1522704973) >>> 8;

            for(var7 = -var2; var7 < 0; ++var7) {
               h[var0++] = var3;
            }

            var0 += var6;
            var4 += var5;
         }
      }

   }

   @ObfuscatedName("gy")
   public static void o(int var0, int var1, int var2, int var3, int var4) {
      f(var0, var1, var2, var4);
      f(var0, var3 + var1 - 1, var2, var4);
      g(var0, var1, var3, var4);
      g(var0 + var2 - 1, var1, var3, var4);
   }

   @ObfuscatedName("gz")
   public static void p(int var0, int var1, int var2, int var3, int var4) {
      f(var0, var1, 2, 256);
      f(var0, var1 + 16776960 - 1, 2, 256);
      g(var0, var1, 16776960, 256);
      g(var0 + 2 - 1, var1, 16776960, 256);
   }

   @ObfuscatedName("hh")
   public static void q(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      if ((var3 -= var1) == 0) {
         if (var2 >= 0) {
            f(var0, var1, var2 + 1, var4);
         } else {
            f(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            g(var0, var1, var3 + 1, var4);
         } else {
            g(var0, var3 + var1, -var3 + 1, var4);
         }
      } else {
         if (var3 + var2 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if (var2 > var3) {
            var1 = (var1 <<= 16) + '耀';
            var5 = (int)Math.floor((double)(var3 <<= 16) / (double)var2 + 0.5D);
            var2 += var0;
            if (var0 < n) {
               var1 += var5 * (n - var0);
               var0 = n;
            }

            if (var2 >= m) {
               var2 = m - 1;
            }

            while(var0 <= var2) {
               if ((var6 = var1 >> 16) >= l && var6 < k) {
                  h[var0 + var6 * i] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 = (var0 <<= 16) + '耀';
            var5 = (int)Math.floor((double)(var2 <<= 16) / (double)var3 + 0.5D);
            var3 += var1;
            if (var1 < l) {
               var0 += (l - var1) * var5;
               var1 = l;
            }

            if (var3 >= k) {
               var3 = k - 1;
            }

            while(var1 <= var3) {
               if ((var6 = var0 >> 16) >= n && var6 < m) {
                  h[var6 + i * var1] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   @ObfuscatedName("hm")
   public static void h(int var0, int var1, int var2, int var3) {
      if (var1 >= l && var1 < k) {
         if (var0 < n) {
            var2 -= n - var0;
            var0 = n;
         }

         if (var0 + var2 > m) {
            var2 = m - var0;
         }

         var0 += i * var1;

         for(var1 = 0; var1 < var2; ++var1) {
            h[var0 + var1] = var3;
         }
      }

   }

   @ObfuscatedName("pa")
   @ObfuscatedSignature(
      signature = "(Ljm;IIIIIIII)V"
   )
   public static void a(cn var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var19;
      int var20;
      int var21;
      int var22;
      int var23;
      int var76;
      int var77;
      if (var0 == null) {
         var17 = var1;
         var16 = var1;
         var15 = var1;
         var14 = var1;
         var12 = var1;
         var11 = var1;
         var10 = var1;
         cn var9 = var0;
         cn var18;
         if (var0.W != 2) {
            var18 = var0;
            if (var0.V != 2) {
               var0.V = 2;
               var0.J = 0;

               for(var19 = 0; var19 < var18.y; ++var19) {
                  int var52 = (int)var18.ac[var19];
                  int var53 = (int)var18.af[var19];
                  var20 = (int)var18.x[var19];
                  if ((var20 = var52 * var52 + var20 * var20 + var53 * var53) > var18.J) {
                     var18.J = var20;
                  }
               }

               var18.J = (int)(Math.sqrt((double)var18.J) + 0.99D);
               var18.S = var18.J;
               var18.L = var18.J + var18.J;
            }
         }

         var77 = cc.m();
         var19 = cc.n();
         var20 = cn.t[var1];
         var21 = cn.e[var1];
         var22 = cn.t[var1];
         var23 = cn.e[var1];
         int var24 = cn.j[var1];
         int var25 = cn.m[var1];
         int var26 = cn.f[var1];
         var13 = cn.n[var1];
         int var27 = var26 * var1 + var13 * var1 >> 16;

         for(int var28 = 0; var28 < var9.w; ++var28) {
            int var29 = (int)var9.ac[var28];
            int var30 = (int)var9.af[var28];
            int var31 = (int)var9.x[var28];
            int var32;
            if (var12 != 0) {
               var32 = var30 * var24 + var29 * var25 >> 16;
               var30 = var30 * var25 - var29 * var24 >> 16;
               var29 = var32;
            }

            if (var10 != 0) {
               var32 = var30 * var21 - var31 * var20 >> 16;
               var31 = var30 * var20 + var31 * var21 >> 16;
               var30 = var32;
            }

            if (var11 != 0) {
               var32 = var31 * var22 + var29 * var23 >> 16;
               var31 = var31 * var23 - var29 * var22 >> 16;
               var29 = var32;
            }

            var29 += var14;
            var30 += var15;
            var31 += var16;
            var32 = var30 * var13 - var31 * var26 >> 16;
            var31 = var30 * var26 + var31 * var13 >> 16;
            cn.f[var28] = var31 - var27;
            cn.n[var28] = var77 + var29 * cc.c() / var17;
            cn.u[var28] = var19 + var32 * cc.o() / var17;
            cn.v[var28] = p.a(var17);
            if (var9.X != null) {
               cn.u[var28] = var29;
               cn.s[var28] = var32;
               cn.c[var28] = var31;
            }
         }

         try {
            long var79 = 0L;
            boolean var78 = false;
            var18 = var9;
            if (var9.L < -984249629) {
               for(var76 = 0; var76 < var18.L; ++var76) {
                  cn.r[var76] = 0;
               }

               int var64;
               int var65;
               for(char var66 = 0; var66 < var18.E; ++var66) {
                  if (var18.O[var66] != -2) {
                     int var67 = var18.D[var66];
                     var76 = var18.C[var66];
                     var10 = var18.A[var66];
                     var64 = cn.g[var67];
                     var11 = cn.g[var76];
                     var12 = cn.g[var10];
                     if ((var64 - var11) * (cn.f[var10] - cn.f[var76]) - (var12 - var11) * (cn.f[var67] - cn.f[var76]) > 0) {
                        cn.i[var66] = false;
                        var65 = cc.d();
                        if (var64 >= 0 && var11 >= 0 && var12 >= 0 && var64 <= var65 && var11 <= var65 && var12 <= var65) {
                           cn.a[var66] = false;
                        } else {
                           cn.a[var66] = true;
                        }

                        var10 = (cn.l[var67] + cn.l[var76] + cn.l[var10]) / 3 + var18.S;
                        cn.q[var10][cn.r[var10]++] = var66;
                     }
                  }
               }

               boolean var80 = var18.G != null && var18.G.a() && !cc.d.g.a();
               short var81 = var18.Q;
               if (var80) {
                  cc.d.g.a(var18.G);
               } else {
                  var18.Q = (short)var18.E;
               }

               char[] var68;
               char var69;
               if (var18.F == null) {
                  for(var76 = var18.L - 1; var76 >= 0; --var76) {
                     if ((var69 = cn.r[var76]) > 0) {
                        var68 = cn.q[var76];

                        for(var11 = 0; var11 < var69; ++var11) {
                           var18.a(var68[var11]);
                        }
                     }
                  }

                  var18.Q = var81;
                  if (var80) {
                     cc.d.g.b();
                  }
               } else {
                  for(var76 = 0; var76 < 12; ++var76) {
                     cn.n[var76] = 0;
                     cn.m[var76] = 0;
                  }

                  for(var76 = var18.L - 1; var76 >= 0; --var76) {
                     if ((var69 = cn.r[var76]) > 0) {
                        var68 = cn.q[var76];

                        for(var11 = 0; var11 < var69; ++var11) {
                           char var70 = var68[var11];
                           byte var71 = var18.F[var70];
                           var10 = cn.n[var71]++;
                           cn.d[var71][var10] = var70;
                           if (var71 < 10) {
                              int[] var84 = cn.m;
                              var84[var71] += var76;
                           } else if (var71 == 10) {
                              cn.p[var10] = var76;
                           } else {
                              cn.j[var10] = var76;
                           }
                        }
                     }
                  }

                  var76 = 0;
                  if (cn.n[1] > 0 || cn.n[2] > 0) {
                     var76 = (cn.m[1] + cn.m[2]) / (cn.n[1] + cn.n[2]);
                  }

                  var10 = 0;
                  if (cn.n[3] > 0 || cn.n[4] > 0) {
                     var10 = (cn.m[3] + cn.m[4]) / (cn.n[3] + cn.n[4]);
                  }

                  var64 = 0;
                  if (cn.n[6] > 0 || cn.n[8] > 0) {
                     var64 = (cn.m[8] + cn.m[6]) / (cn.n[8] + cn.n[6]);
                  }

                  var12 = 0;
                  var65 = cn.n[10];
                  int[] var82 = cn.d[10];
                  int[] var83 = cn.p;
                  if (var65 == 0) {
                     var12 = 0;
                     var65 = cn.n[11];
                     var82 = cn.d[11];
                     var83 = cn.j;
                  }

                  if (var65 > 0) {
                     var11 = var83[0];
                  } else {
                     var11 = 1655149310;
                  }

                  for(var13 = 0; var13 < 10; ++var13) {
                     while(var13 == 0 && var11 > var76) {
                        var18.a(var82[var12++]);
                        if (var12 == var65 && var82 != cn.d[11]) {
                           var12 = 0;
                           var65 = cn.n[11];
                           var82 = cn.d[11];
                           var83 = cn.j;
                        }

                        if (var12 < var65) {
                           var11 = var83[var12];
                        } else {
                           var11 = -1192900929;
                        }
                     }

                     while(var13 == 3 && var11 > var10) {
                        var18.a(var82[var12++]);
                        if (var12 == var65 && var82 != cn.d[11]) {
                           var12 = 0;
                           var65 = cn.n[11];
                           var82 = cn.d[11];
                           var83 = cn.j;
                        }

                        if (var12 < var65) {
                           var11 = var83[var12];
                        } else {
                           var11 = -1000;
                        }
                     }

                     while(var13 == 5 && var11 > var64) {
                        var18.a(var82[var12++]);
                        if (var12 == var65 && var82 != cn.d[11]) {
                           var12 = 0;
                           var65 = cn.n[11];
                           var82 = cn.d[11];
                           var83 = cn.j;
                        }

                        if (var12 < var65) {
                           var11 = var83[var12];
                        } else {
                           var11 = -414076763;
                        }
                     }

                     var14 = cn.n[var13];
                     int[] var72 = cn.d[var13];

                     for(int var73 = 0; var73 < var14; ++var73) {
                        var18.a(var72[var73]);
                     }
                  }

                  while(var11 != 1809609030) {
                     var18.a(var82[var12++]);
                     if (var12 == var65 && var82 != cn.d[11]) {
                        var12 = 0;
                        var82 = cn.d[11];
                        var65 = cn.n[11];
                        var83 = cn.j;
                     }

                     if (var12 < var65) {
                        var11 = var83[var12];
                     } else {
                        var11 = -1000;
                     }
                  }

                  var18.Q = var81;
                  if (var80) {
                     cc.d.g.b();
                  }
               }
            }
         } catch (Exception var75) {
         }
      }

      if (var0.V != 2) {
         var0.b();
      }

      var76 = cc.a();
      var10 = cc.g();
      var11 = cn.b[var1];
      var12 = cn.k[var1];
      var13 = cn.b[var2];
      var14 = cn.k[var2];
      var15 = cn.b[var3];
      var16 = cn.k[var3];
      var17 = cn.b[var4];
      var4 = cn.k[var4];
      var77 = var17 * var6 + var4 * var7 >> 16;

      for(var19 = 0; var19 < var0.y; ++var19) {
         var20 = (int)var0.ac[var19];
         var21 = (int)var0.af[var19];
         var22 = (int)var0.x[var19];
         if (var3 != 0) {
            var23 = var21 * var15 + var20 * var16 >> 16;
            var21 = var21 * var16 - var20 * var15 >> 16;
            var20 = var23;
         }

         if (var1 != 0) {
            var23 = var21 * var12 - var22 * var11 >> 16;
            var22 = var21 * var11 + var22 * var12 >> 16;
            var21 = var23;
         }

         if (var2 != 0) {
            var23 = var22 * var13 + var20 * var14 >> 16;
            var22 = var22 * var14 - var20 * var13 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var4 - var22 * var17 >> 16;
         var22 = var21 * var17 + var22 * var4 >> 16;
         cn.l[var19] = var22 - var77;
         cn.g[var19] = var76 + var20 * cc.c() / var8;
         cn.f[var19] = var10 + var23 * cc.c() / var8;
         cn.o[var19] = p.a(var8);
         if (var0.X != null) {
            cn.c[var19] = var20;
            cn.e[var19] = var23;
            cn.h[var19] = var22;
         }
      }

      try {
         var0.a(false, false, false, 0L);
      } catch (Exception var74) {
      }
   }
}
