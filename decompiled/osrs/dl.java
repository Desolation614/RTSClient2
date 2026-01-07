package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public final class dl {
   @ObfuscatedName("aj")
   private byte[][][] a;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1179002257
   )
   private int b;

   dl(int var1) {
      this.b = var1;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "44"
   )
   private void b() {
      byte[] var1 = new byte[this.b * this.b];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.b - 1; var3 >= 0; --var3) {
         for(var4 = this.b - 1; var4 >= 0; --var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[2][0] = var1;
      var1 = new byte[this.b * this.b];
      var2 = 0;

      for(var3 = this.b - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.b; ++var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[2][1] = var1;
      var1 = new byte[this.b * this.b];
      var2 = 0;

      for(var3 = 0; var3 < this.b; ++var3) {
         for(var4 = 0; var4 < this.b; ++var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[2][2] = var1;
      var1 = new byte[this.b * this.b];
      var2 = 0;

      for(var3 = 0; var3 < this.b; ++var3) {
         for(var4 = this.b - 1; var4 >= 0; --var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[2][3] = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1972862605"
   )
   private void c() {
      byte[] var1 = new byte[this.b * this.b];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.b; ++var3) {
         for(var4 = 0; var4 < this.b; ++var4) {
            if (var4 <= var3 - this.b / 2) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[6][0] = var1;
      var1 = new byte[this.b * this.b];
      var2 = 0;

      for(var3 = this.b - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.b; ++var4) {
            if (var4 <= var3 - this.b / 2) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[6][1] = var1;
      var1 = new byte[this.b * this.b];
      var2 = 0;

      for(var3 = this.b - 1; var3 >= 0; --var3) {
         for(var4 = this.b - 1; var4 >= 0; --var4) {
            if (var4 <= var3 - this.b / 2) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[6][2] = var1;
      var1 = new byte[this.b * this.b];
      var2 = 0;

      for(var3 = 0; var3 < this.b; ++var3) {
         for(var4 = this.b - 1; var4 >= 0; --var4) {
            if (var4 <= var3 - this.b / 2) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[6][3] = var1;
   }

   @ObfuscatedName("ah")
   final void a(int var1) {
      if (this.a != null) {
         if (var1 == 1899428840) {
            return;
         }
      } else {
         this.a = new byte[8][4][];
         a(this, -749822101);
         this.b(697301858);
         this.b();
         a(this, (byte)2);
         b(this, -1606733377);
         this.a();
         this.c();
         this.d();
      }

   }

   @ObfuscatedName("al")
   private void b(int var1) {
      byte[] var2 = new byte[this.b * this.b];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.b - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.b; ++var5) {
            if (var5 <= var4 >> 1) {
               if (var1 != 697301858) {
                  return;
               }

               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.a[1][0] = var2;
      var2 = new byte[this.b * this.b];
      var3 = 0;

      for(var4 = 0; var4 < this.b; ++var4) {
         for(var5 = 0; var5 < this.b; ++var5) {
            if (var3 >= 0 && var3 < var2.length) {
               if (var5 >= var4 << 1) {
                  var2[var3] = -1;
               }

               ++var3;
            } else {
               ++var3;
            }
         }
      }

      this.a[1][1] = var2;
      var2 = new byte[this.b * this.b];
      var3 = 0;

      for(var4 = 0; var4 < this.b; ++var4) {
         for(var5 = this.b - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.a[1][2] = var2;
      var2 = new byte[this.b * this.b];
      var3 = 0;

      for(var4 = this.b - 1; var4 >= 0; --var4) {
         for(var5 = this.b - 1; var5 >= 0; --var5) {
            if (var1 != 697301858) {
               return;
            }

            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.a[1][3] = var2;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1432204118"
   )
   private static int c(int var0) {
      if (var0 != 9 && var0 != 10) {
         return var0 == 11 ? 8 : var0;
      } else {
         return 1;
      }
   }

   @ObfuscatedName("ap")
   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      if (var7 != 0 && this.b != 0) {
         if (var9 != 1) {
            return;
         }

         if (this.a != null) {
            var8 = a(this, var8, var7);
            var7 = c(var7);
            jd.b(var1, var2, var5, var6, var3, var4, this.a[var7 - 1][var8], this.b);
            return;
         }
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "16284"
   )
   private void d() {
      byte[] var1 = new byte[this.b * this.b];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.b; ++var3) {
         for(var4 = 0; var4 < this.b; ++var4) {
            if (var4 >= var3 - this.b / 2) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[7][0] = var1;
      var1 = new byte[this.b * this.b];
      var2 = 0;

      for(var3 = this.b - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.b; ++var4) {
            if (var4 >= var3 - this.b / 2) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[7][1] = var1;
      var1 = new byte[this.b * this.b];
      var2 = 0;

      for(var3 = this.b - 1; var3 >= 0; --var3) {
         for(var4 = this.b - 1; var4 >= 0; --var4) {
            if (var4 >= var3 - this.b / 2) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[7][2] = var1;
      var1 = new byte[this.b * this.b];
      var2 = 0;

      for(var3 = 0; var3 < this.b; ++var3) {
         for(var4 = this.b - 1; var4 >= 0; --var4) {
            if (var4 >= var3 - this.b / 2) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[7][3] = var1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1899428840"
   )
   final void a() {
      byte[] var1 = new byte[this.b * this.b];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.b; ++var3) {
         for(var4 = 0; var4 < this.b; ++var4) {
            if (var4 <= this.b / 2) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[5][0] = var1;
      var1 = new byte[this.b * this.b];
      var2 = 0;

      for(var3 = 0; var3 < this.b; ++var3) {
         for(var4 = 0; var4 < this.b; ++var4) {
            if (var3 <= this.b / 2) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[5][1] = var1;
      var1 = new byte[this.b * this.b];
      var2 = 0;

      for(var3 = 0; var3 < this.b; ++var3) {
         for(var4 = 0; var4 < this.b; ++var4) {
            if (var4 >= this.b / 2) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[5][2] = var1;
      var1 = new byte[this.b * this.b];
      var2 = 0;

      for(var3 = 0; var3 < this.b; ++var3) {
         for(var4 = 0; var4 < this.b; ++var4) {
            if (var3 >= this.b / 2) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.a[5][3] = var1;
   }

   @ObfuscatedName("ei")
   @ObfuscatedSignature(
      signature = "(Llf;III)I",
      garbageValue = "1675603699"
   )
   private static int a(dl var0, int var1, int var2) {
      if (var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedName("ew")
   @ObfuscatedSignature(
      signature = "(Llf;I)V"
   )
   private static void a(dl var0, int var1) {
      byte[] var5 = new byte[var0.b * var0.b];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < var0.b; ++var3) {
         for(var4 = 0; var4 < var0.b; ++var4) {
            if (var4 <= var3) {
               var5[var2] = -1;
            }

            ++var2;
         }
      }

      var0.a[0][0] = var5;
      var5 = new byte[var0.b * var0.b];
      var2 = 0;

      for(var3 = var0.b - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < var0.b; ++var4) {
            if (var4 <= var3) {
               var5[var2] = -1;
            }

            ++var2;
         }
      }

      var0.a[0][1] = var5;
      var5 = new byte[var0.b * var0.b];
      var2 = 0;

      for(var3 = 0; var3 < var0.b; ++var3) {
         for(var4 = 0; var4 < var0.b; ++var4) {
            if (var4 >= var3) {
               var5[var2] = -1;
            }

            ++var2;
         }
      }

      var0.a[0][2] = var5;
      var5 = new byte[var0.b * var0.b];
      var2 = 0;

      for(var3 = var0.b - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < var0.b; ++var4) {
            if (var4 >= var3) {
               var5[var2] = -1;
            }

            ++var2;
         }
      }

      var0.a[0][3] = var5;
   }

   @ObfuscatedName("mm")
   @ObfuscatedSignature(
      signature = "(Llf;B)V"
   )
   private static void a(dl var0, byte var1) {
      byte[] var5 = new byte[var0.b * var0.b];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = var0.b - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < var0.b; ++var4) {
            if (var4 >= var3 >> 1) {
               var5[var2] = -1;
            }

            ++var2;
         }
      }

      var0.a[3][0] = var5;
      var5 = new byte[var0.b * var0.b];
      var2 = 0;

      for(var3 = 0; var3 < var0.b; ++var3) {
         for(var4 = 0; var4 < var0.b; ++var4) {
            if (var4 <= var3 << 1) {
               var5[var2] = -1;
            }

            ++var2;
         }
      }

      var0.a[3][1] = var5;
      var5 = new byte[var0.b * var0.b];
      var2 = 0;

      for(var3 = 0; var3 < var0.b; ++var3) {
         for(var4 = var0.b - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var5[var2] = -1;
            }

            ++var2;
         }
      }

      var0.a[3][2] = var5;
      var5 = new byte[var0.b * var0.b];
      var2 = 0;

      for(var3 = var0.b - 1; var3 >= 0; --var3) {
         for(var4 = var0.b - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var5[var2] = -1;
            }

            ++var2;
         }
      }

      var0.a[3][3] = var5;
   }

   @ObfuscatedName("pi")
   @ObfuscatedSignature(
      signature = "(Llf;I)V"
   )
   private static void b(dl var0, int var1) {
      byte[] var5 = new byte[var0.b * var0.b];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = var0.b - 1; var3 >= 0; --var3) {
         for(var4 = var0.b - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var5[var2] = -1;
            }

            ++var2;
         }
      }

      var0.a[4][0] = var5;
      var5 = new byte[var0.b * var0.b];
      var2 = 0;

      for(var3 = var0.b - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < var0.b; ++var4) {
            if (var4 <= var3 << 1) {
               var5[var2] = -1;
            }

            ++var2;
         }
      }

      var0.a[4][1] = var5;
      var5 = new byte[var0.b * var0.b];
      var2 = 0;

      for(var3 = 0; var3 < var0.b; ++var3) {
         for(var4 = 0; var4 < var0.b; ++var4) {
            if (var4 >= var3 >> 1) {
               var5[var2] = -1;
            }

            ++var2;
         }
      }

      var0.a[4][2] = var5;
      var5 = new byte[var0.b * var0.b];
      var2 = 0;

      for(var3 = 0; var3 < var0.b; ++var3) {
         for(var4 = var0.b - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var5[var2] = -1;
            }

            ++var2;
         }
      }

      var0.a[4][3] = var5;
   }

   @ObfuscatedName("qy")
   @ObfuscatedSignature(
      signature = "(Llf;IIIIIIIIB)V"
   )
   public static void a(dl var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      if (var0 == null) {
         var0.a(var1, var1, var1, var1, var1, var1, var1, var1, (byte)1);
      }

      if (var7 != 0 && var0.b != 0 && var0.a != null) {
         var8 = a(var0, var8, var7);
         var7 = c(var7);
         jd.a(var1, var2, var5, var6, var3, var4, var0.a[var7 - 1][var8], var0.b);
      }
   }
}
