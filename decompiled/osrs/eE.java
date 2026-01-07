package osrs;

import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public final class eE extends hR {
   @ObfuscatedName("ft")
   static boolean a;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "[Lmu;"
   )
   eb[] b = new eb[128];
   @ObfuscatedName("ac")
   byte[] c = new byte[128];
   @ObfuscatedName("ag")
   int[] d = new int[128];
   @ObfuscatedName("ah")
   ArrayList e = new ArrayList(8);
   @ObfuscatedName("ai")
   short[] f = new short[128];
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -993317529
   )
   int g;
   @ObfuscatedName("al")
   byte[] h = new byte[128];
   @ObfuscatedName("am")
   byte[] i = new byte[128];
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "[Leh;"
   )
   z[] j = new z[128];

   eE(byte[] var1) {
      jk var18 = new jk(var1);

      int var2;
      for(var2 = 0; var18.d[var2 + var18.c] != 0; ++var2) {
      }

      byte[] var3 = new byte[var2];

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var18.B();
      }

      ++var18.c;
      ++var2;
      var4 = var18.c;
      var18.c += var2;

      for(var2 = 0; var18.d[var2 + var18.c] != 0; ++var2) {
      }

      byte[] var5 = new byte[var2];

      int var6;
      for(var6 = 0; var6 < var2; ++var6) {
         var5[var6] = var18.B();
      }

      ++var18.c;
      ++var2;
      var6 = var18.c;
      var18.c += var2;

      for(var2 = 0; var18.d[var2 + var18.c] != 0; ++var2) {
      }

      byte[] var7 = new byte[var2];

      int var8;
      for(var8 = 0; var8 < var2; ++var8) {
         var7[var8] = var18.B();
      }

      ++var18.c;
      ++var2;
      byte[] var27 = new byte[var2];
      int var9;
      int var10;
      int var12;
      if (var2 > 1) {
         var27[1] = 1;
         int var11 = 1;
         var9 = 2;

         for(var10 = 2; var10 < var2; ++var10) {
            if ((var12 = jk.a(var18, (byte)-45)) == 0) {
               var11 = var9++;
            } else {
               if (var12 <= var11) {
                  --var12;
               }

               var11 = var12;
            }

            var27[var10] = (byte)var11;
         }
      } else {
         var9 = var2;
      }

      eb[] var30 = new eb[var9];

      for(var10 = 0; var10 < var30.length; ++var10) {
         eb var31 = var30[var10] = new eb();
         if ((var2 = jk.a(var18, (byte)-1)) > 0) {
            var31.i = new byte[var2 << 1];
         }

         if ((var2 = jk.a((jk)var18, (byte)27)) > 0) {
            var31.e = new byte[(var2 << 1) + 2];
            var31.e[1] = 64;
         }
      }

      byte[] var22 = (var10 = jk.a((jk)var18, (byte)76)) > 0 ? new byte[var10 << 1] : null;
      byte[] var29 = (var10 = jk.a((jk)var18, (byte)23)) > 0 ? new byte[var10 << 1] : null;

      for(var12 = 0; var18.d[var12 + var18.c] != 0; ++var12) {
      }

      byte[] var13 = new byte[var12];

      int var14;
      for(var14 = 0; var14 < var12; ++var14) {
         var13[var14] = var18.B();
      }

      ++var18.c;
      var14 = 0;

      for(var12 = 0; var12 < 128; ++var12) {
         var14 += jk.a((jk)var18, (byte)50);
         this.f[var12] = (short)var14;
      }

      var14 = 0;

      short[] var15;
      for(var12 = 0; var12 < 128; ++var12) {
         var14 += jk.a((jk)var18, (byte)2);
         (var15 = this.f)[var12] = (short)(var15[var12] + (var14 << 8));
      }

      var12 = 0;
      var14 = 0;
      int var16 = 0;

      int var17;
      for(var17 = 0; var17 < 128; ++var17) {
         if (var12 == 0) {
            if (var14 < var13.length) {
               var12 = var13[var14++];
            } else {
               var12 = -1;
            }

            var16 = var18.s();
         }

         (var15 = this.f)[var17] = (short)(var15[var17] + ((var16 - 1 & 2) << 14));
         this.d[var17] = var16;
         --var12;
      }

      var12 = 0;
      var14 = 0;
      var17 = 0;

      int var34;
      for(var34 = 0; var34 < 128; ++var34) {
         if (this.d[var34] != 0) {
            if (var12 == 0) {
               if (var14 < var3.length) {
                  var12 = var3[var14++];
               } else {
                  var12 = -1;
               }

               var17 = var18.d[var4++] - 1;
            }

            this.i[var34] = (byte)var17;
            --var12;
         }
      }

      var12 = 0;
      var14 = 0;
      var34 = 0;

      int var19;
      for(var19 = 0; var19 < 128; ++var19) {
         if (this.d[var19] != 0) {
            if (var12 == 0) {
               if (var14 < var5.length) {
                  var12 = var5[var14++];
               } else {
                  var12 = -1;
               }

               var34 = var18.d[var6++] + 16 << 2;
            }

            this.c[var19] = (byte)var34;
            --var12;
         }
      }

      var12 = 0;
      var14 = 0;
      eb var20 = null;

      for(var4 = 0; var4 < 128; ++var4) {
         if (this.d[var4] != 0) {
            if (var12 == 0) {
               var20 = var30[var27[var14]];
               if (var14 < var7.length) {
                  var12 = var7[var14++];
               } else {
                  var12 = -1;
               }
            }

            this.b[var4] = var20;
            --var12;
         }
      }

      var12 = 0;
      var14 = 0;
      var4 = 0;

      for(var19 = 0; var19 < 128; ++var19) {
         if (var12 == 0) {
            if (var14 < var13.length) {
               var12 = var13[var14++];
            } else {
               var12 = -1;
            }

            if (this.d[var19] > 0) {
               var4 = jk.a(var18, (byte)-13) + 1;
            }
         }

         this.h[var19] = (byte)var4;
         --var12;
      }

      this.g = jk.a((jk)var18, (byte)57) + 1;

      int var21;
      eb var24;
      for(var19 = 0; var19 < var9; ++var19) {
         if ((var24 = var30[var19]).i != null) {
            for(var21 = 1; var21 < var24.i.length; var21 += 2) {
               var24.i[var21] = var18.B();
            }
         }

         if (var24.e != null) {
            for(var21 = 3; var21 < var24.e.length - 2; var21 += 2) {
               var24.e[var21] = var18.B();
            }
         }
      }

      if (var22 != null) {
         for(var19 = 1; var19 < var22.length; var19 += 2) {
            var22[var19] = var18.B();
         }
      }

      if (var29 != null) {
         for(var19 = 1; var19 < var29.length; var19 += 2) {
            var29[var19] = var18.B();
         }
      }

      for(var19 = 0; var19 < var9; ++var19) {
         if ((var24 = var30[var19]).e != null) {
            var14 = 0;

            for(var21 = 2; var21 < var24.e.length; var21 += 2) {
               var14 = var14 + 1 + jk.a((jk)var18, (byte)45);
               var24.e[var21] = (byte)var14;
            }
         }
      }

      for(var19 = 0; var19 < var9; ++var19) {
         if ((var24 = var30[var19]).i != null) {
            var14 = 0;

            for(var21 = 2; var21 < var24.i.length; var21 += 2) {
               var14 = var14 + 1 + jk.a((jk)var18, (byte)94);
               var24.i[var21] = (byte)var14;
            }
         }
      }

      int var25;
      byte var35;
      if (var22 != null) {
         var14 = jk.a(var18, (byte)-12);
         var22[0] = (byte)var14;

         for(var19 = 2; var19 < var22.length; var19 += 2) {
            var14 = var14 + 1 + jk.a(var18, (byte)-57);
            var22[var19] = (byte)var14;
         }

         var35 = var22[0];
         byte var32 = var22[1];

         for(var21 = 0; var21 < var35; ++var21) {
            this.h[var21] = (byte)(var32 * this.h[var21] + 32 >> 6);
         }

         for(var21 = 2; var21 < var22.length; var21 += 2) {
            byte var28 = var22[var21];
            byte var26 = var22[var21 + 1];
            var6 = var32 * (var28 - var35) + (var28 - var35) / 2;

            for(var25 = var35; var25 < var28; ++var25) {
               var8 = var28 - var35;
               var8 = ((var12 = var6 >>> 31) + var6) / var8 - var12;
               this.h[var25] = (byte)(var8 * this.h[var25] + 32 >> 6);
               var6 += var26 - var32;
            }

            var35 = (byte)var28;
            var32 = var26;
         }

         for(var19 = var35; var19 < 128; ++var19) {
            this.h[var19] = (byte)(var32 * this.h[var19] + 32 >> 6);
         }
      }

      if (var29 != null) {
         var14 = jk.a(var18, (byte)-76);
         var29[0] = (byte)var14;

         for(var19 = 2; var19 < var29.length; var19 += 2) {
            var14 = var14 + 1 + jk.a(var18, (byte)-74);
            var29[var19] = (byte)var14;
         }

         var35 = var29[0];
         int var33 = var29[1] << 1;

         for(var21 = 0; var21 < var35; ++var21) {
            if ((var19 = var33 + (this.c[var21] & 255)) < 0) {
               var19 = 0;
            }

            if (var19 > 128) {
               var19 = 128;
            }

            this.c[var21] = (byte)var19;
         }

         for(var21 = 2; var21 < var29.length; var21 += 2) {
            byte var23 = var29[var21];
            var4 = var29[var21 + 1] << 1;
            var6 = var33 * (var23 - var35) + (var23 - var35) / 2;

            for(var25 = var35; var25 < var23; ++var25) {
               var8 = var23 - var35;
               if ((var19 = ((var12 = var6 >>> 31) + var6) / var8 - var12 + (this.c[var25] & 255)) < 0) {
                  var19 = 0;
               }

               if (var19 > 128) {
                  var19 = 128;
               }

               this.c[var25] = (byte)var19;
               var6 += var4 - var33;
            }

            var35 = var23;
            var33 = var4;
         }

         for(var19 = var35; var19 < 128; ++var19) {
            if ((var4 = var33 + (this.c[var19] & 255)) < 0) {
               var4 = 0;
            }

            if (var4 > 128) {
               var4 = 128;
            }

            this.c[var19] = (byte)var4;
         }
      }

      for(var19 = 0; var19 < var9; ++var19) {
         var30[var19].f = jk.a((jk)var18, (byte)52);
      }

      for(var19 = 0; var19 < var9; ++var19) {
         if ((var24 = var30[var19]).i != null) {
            var24.c = jk.a((jk)var18, (byte)70);
         }

         if (var24.e != null) {
            var24.d = jk.a((jk)var18, (byte)11);
         }

         if (var24.f > 0) {
            var24.a = jk.a(var18, (byte)-29);
         }
      }

      for(var19 = 0; var19 < var9; ++var19) {
         var30[var19].h = jk.a((jk)var18, (byte)42);
      }

      for(var19 = 0; var19 < var9; ++var19) {
         if ((var24 = var30[var19]).h > 0) {
            var24.g = jk.a((jk)var18, (byte)2);
         }
      }

      for(var19 = 0; var19 < var9; ++var19) {
         if ((var24 = var30[var19]).g > 0) {
            var24.b = jk.a(var18, (byte)-53);
         }
      }

   }
}
