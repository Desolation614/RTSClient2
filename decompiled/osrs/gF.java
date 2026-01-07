package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public final class gF {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "([FIFZFZ[FI)I",
      garbageValue = "1479768784"
   )
   public static int a(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for(int var8 = 0; var8 < var1 + 1; ++var8) {
         var7 += Math.abs(var0[var8]);
      }

      float var23 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * ap.a;
      if (var7 <= var23) {
         return -1;
      } else {
         float[] var9 = new float[var1 + 1];

         int var10;
         for(var10 = 0; var10 < var1 + 1; ++var10) {
            var9[var10] = 1.0F / var7 * var0[var10];
         }

         while(Math.abs(var9[var1]) < var23) {
            --var1;
         }

         var10 = 0;
         if (var1 == 0) {
            return 0;
         } else if (var1 == 1) {
            var6[0] = -var9[0] / var9[1];
            boolean var19 = var3 ? var2 < var23 + var6[0] : var2 < var6[0] - var23;
            boolean var22 = var5 ? var4 > var6[0] - var23 : var4 > var6[0] + var23;
            if ((var10 = var19 && var22 ? 1 : 0) > 0) {
               if (var3 && var6[0] < var2) {
                  var6[0] = var2;
               } else if (var5 && var6[0] > var4) {
                  var6[0] = var4;
               }
            }

            return var10;
         } else {
            gz var18 = new gz(var9, var1);
            float[] var20 = new float[var1 + 1];

            for(int var11 = 1; var11 <= var1; ++var11) {
               var20[var11 - 1] = (float)var11 * var9[var11];
            }

            float[] var24 = new float[var1 + 1];
            int var21;
            if ((var21 = a(var20, var1 - 1, var2, false, var4, false, var24)) == -1) {
               return 0;
            } else {
               boolean var12 = false;
               float var13 = 0.0F;
               float var15 = 0.0F;

               for(int var16 = 0; var16 <= var21; ++var16) {
                  if (var10 > var1) {
                     return var10;
                  }

                  float var14;
                  float var17;
                  if (var16 == 0) {
                     var17 = var2;
                     if (Math.abs(var14 = cV.a(var9, var1, var2)) <= var23 && var3) {
                        var6[var10++] = var2;
                     }
                  } else {
                     var17 = var15;
                     var14 = var13;
                  }

                  if (var21 == var16) {
                     var15 = var4;
                     var12 = false;
                  } else {
                     var15 = var24[var16];
                  }

                  var13 = cV.a(var9, var1, var15);
                  if (var12) {
                     var12 = false;
                  } else if (Math.abs(var13) < var23) {
                     if (var16 != var21 || var5) {
                        var6[var10++] = var15;
                        var12 = true;
                     }
                  } else if (var14 < 0.0F && var13 > 0.0F || var14 > 0.0F && var13 < 0.0F) {
                     var6[var10++] = cD.a(var18, var17, var15, 0.0F);
                     if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var23) {
                        var6[var10 - 2] = (var6[var10 - 1] + var6[var10 - 2]) * 0.5F;
                        --var10;
                     }
                  }
               }

               return var10;
            }
         }
      }
   }
}
