package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public final class cM {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "[Lkm;"
   )
   cQ[] a;

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(IIILkn;Lkf;Lkm;B)Z",
      garbageValue = "1"
   )
   static boolean a(int var0, int var1, int var2, cR var3, cI var4, cQ var5) {
      int var6 = var5.g.length;
      int var7 = var5.g[0].length;
      int[][] var8 = var5.e;
      int[][] var9 = cQ.b(var5, -1982962644);
      int[] var10 = var5.f;
      int[] var11 = var5.d;
      int var12 = cQ.a(var5, -591190651);
      int var13 = var0;
      int var14 = var1;
      int var15 = var6 >> 1;
      int var16 = var7 >> 1;
      int var17 = var0 - var15;
      int var18 = var1 - var16;
      var9[var15][var16] = 99;
      var8[var15][var16] = 0;
      byte var19 = 0;
      int var20 = 0;
      var10[0] = var0;
      int var23 = var19 + 1;
      var11[0] = var1;

      label196:
      while(var20 != var23) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = var20 + 1 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         var0 = var13 - var4.b * 377417723;
         var1 = var14 - var4.e;
         if (var3.a(var13, var14)) {
            var5.a(var13, var14);
            return true;
         }

         int var21 = var8[var15][var16] + 1;
         int var22;
         if (var15 > 0 && var9[var15 - 1][var16] == 0 && !var4.a(var0 - 1, var1, 1076101390) && !var4.a(var0 - 1, var2 + var1 - 1, 1076101432)) {
            var22 = 1;

            while(true) {
               if (var22 >= var2 - 1) {
                  var10[var23] = var13 - 1;
                  var11[var23] = var14;
                  var23 = var23 + 1 & var12;
                  var9[var15 - 1][var16] = 2;
                  var8[var15 - 1][var16] = var21;
                  break;
               }

               if (var4.a(var0 - 1, var22 + var1, 1076101438)) {
                  break;
               }

               ++var22;
            }
         }

         if (var15 < var6 - var2 && var9[var15 + 1][var16] == 0 && !var4.a(var2 + var0, var1, 1076101507) && !var4.a(var2 + var0, var2 + var1 - 1, 1076101600)) {
            var22 = 1;

            while(true) {
               if (var22 >= var2 - 1) {
                  var10[var23] = var13 + 1;
                  var11[var23] = var14;
                  var23 = var23 + 1 & var12;
                  var9[var15 + 1][var16] = 8;
                  var8[var15 + 1][var16] = var21;
                  break;
               }

               if (var4.a(var2 + var0, var1 + var22, 1076101603)) {
                  break;
               }

               ++var22;
            }
         }

         if (var16 > 0 && var9[var15][var16 - 1] == 0 && !var4.a(var0, var1 - 1, 1076101390) && !var4.a(var2 + var0 - 1, var1 - 1, 1076101507)) {
            var22 = 1;

            while(true) {
               if (var22 >= var2 - 1) {
                  var10[var23] = var13;
                  var11[var23] = var14 - 1;
                  var23 = var23 + 1 & var12;
                  var9[var15][var16 - 1] = 1;
                  var8[var15][var16 - 1] = var21;
                  break;
               }

               if (var4.a(var22 + var0, var1 - 1, 1076101519)) {
                  break;
               }

               ++var22;
            }
         }

         if (var16 < var7 - var2 && var9[var15][var16 + 1] == 0 && !var4.a(var0, var2 + var1, 1076101432) && !var4.a(var2 + var0 - 1, var2 + var1, 1076101600)) {
            var22 = 1;

            while(true) {
               if (var22 >= var2 - 1) {
                  var10[var23] = var13;
                  var11[var23] = var14 + 1;
                  var23 = var23 + 1 & var12;
                  var9[var15][var16 + 1] = 4;
                  var8[var15][var16 + 1] = var21;
                  break;
               }

               if (var4.a(var22 + var0, var2 + var1, 1076101624)) {
                  break;
               }

               ++var22;
            }
         }

         if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && !var4.a(var0 - 1, var1 - 1, 1076101390)) {
            var22 = 1;

            while(true) {
               if (var22 >= var2) {
                  var10[var23] = var13 - 1;
                  var11[var23] = var14 - 1;
                  var23 = var23 + 1 & var12;
                  var9[var15 - 1][var16 - 1] = 3;
                  var8[var15 - 1][var16 - 1] = var21;
                  break;
               }

               if (var4.a(var0 - 1, var22 + (var1 - 1), 1076101438) || var4.a(var22 + (var0 - 1), var1 - 1, 1076101519)) {
                  break;
               }

               ++var22;
            }
         }

         if (var15 < var6 - var2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && !var4.a(var2 + var0, var1 - 1, 1076101507)) {
            var22 = 1;

            while(true) {
               if (var22 >= var2) {
                  var10[var23] = var13 + 1;
                  var11[var23] = var14 - 1;
                  var23 = var23 + 1 & var12;
                  var9[var15 + 1][var16 - 1] = 9;
                  var8[var15 + 1][var16 - 1] = var21;
                  break;
               }

               if (var4.a(var2 + var0, var22 + (var1 - 1), 1076101603) || var4.a(var0 + var22, var1 - 1, 1076101519)) {
                  break;
               }

               ++var22;
            }
         }

         if (var15 > 0 && var16 < var7 - var2 && var9[var15 - 1][var16 + 1] == 0 && !var4.a(var0 - 1, var2 + var1, 1076101432)) {
            var22 = 1;

            while(true) {
               if (var22 >= var2) {
                  var10[var23] = var13 - 1;
                  var11[var23] = var14 + 1;
                  var23 = var23 + 1 & var12;
                  var9[var15 - 1][var16 + 1] = 6;
                  var8[var15 - 1][var16 + 1] = var21;
                  break;
               }

               if (var4.a(var0 - 1, var1 + var22, 1076101438) || var4.a(var22 + (var0 - 1), var2 + var1, 1076101624)) {
                  break;
               }

               ++var22;
            }
         }

         if (var15 < var6 - var2 && var16 < var7 - var2 && var9[var15 + 1][var16 + 1] == 0 && !var4.a(var2 + var0, var2 + var1, 1076101600)) {
            for(var22 = 1; var22 < var2; ++var22) {
               if (var4.a(var0 + var22, var2 + var1, 1076101624) || var4.a(var2 + var0, var1 + var22, 1076101603)) {
                  continue label196;
               }
            }

            var10[var23] = var13 + 1;
            var11[var23] = var14 + 1;
            var23 = var23 + 1 & var12;
            var9[var15 + 1][var16 + 1] = 12;
            var8[var15 + 1][var16 + 1] = var21;
         }
      }

      var5.a(var13, var14);
      return false;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IILkn;Lkf;Lkm;I)Z",
      garbageValue = "-2137853195"
   )
   static boolean a(int var0, int var1, cR var2, cI var3, cQ var4) {
      int var5 = var4.g.length;
      int var6 = var4.g[0].length;
      int[][] var7 = var4.e;
      int[][] var8 = cQ.b(var4, 153769201);
      int[] var9 = var4.f;
      int[] var10 = var4.d;
      int var11 = cQ.a(var4, -591190651);
      int var12 = var0;
      int var13 = var1;
      int var14 = var5 >> 1;
      int var15 = var6 >> 1;
      int var16 = var0 - var14;
      int var17 = var1 - var15;
      var8[var14][var15] = 99;
      var7[var14][var15] = 0;
      byte var18 = 0;
      int var19 = 0;
      var9[0] = var0;
      int var21 = var18 + 1;
      var10[0] = var1;

      while(var19 != var21) {
         var12 = var9[var19];
         var13 = var10[var19];
         var19 = var19 + 1 & var11;
         var14 = var12 - var16;
         var15 = var13 - var17;
         var0 = var12 - var3.b * 377417723;
         var1 = var13 - var3.e;
         if (var2.a(var12, var13)) {
            var4.a(var12, var13);
            return true;
         }

         int var20 = var7[var14][var15] + 1;
         if (var14 > 0 && var8[var14 - 1][var15] == 0 && !var3.a(var0 - 1, var1, 1076101384)) {
            var9[var21] = var12 - 1;
            var10[var21] = var13;
            var21 = var21 + 1 & var11;
            var8[var14 - 1][var15] = 2;
            var7[var14 - 1][var15] = var20;
         }

         if (var14 < var5 - 1 && var8[var14 + 1][var15] == 0 && !var3.a(var0 + 1, var1, 1076101504)) {
            var9[var21] = var12 + 1;
            var10[var21] = var13;
            var21 = var21 + 1 & var11;
            var8[var14 + 1][var15] = 8;
            var7[var14 + 1][var15] = var20;
         }

         if (var15 > 0 && var8[var14][var15 - 1] == 0 && !var3.a(var0, var1 - 1, 1076101378)) {
            var9[var21] = var12;
            var10[var21] = var13 - 1;
            var21 = var21 + 1 & var11;
            var8[var14][var15 - 1] = 1;
            var7[var14][var15 - 1] = var20;
         }

         if (var15 < var6 - 1 && var8[var14][var15 + 1] == 0 && !var3.a(var0, var1 + 1, 1076101408)) {
            var9[var21] = var12;
            var10[var21] = var13 + 1;
            var21 = var21 + 1 & var11;
            var8[var14][var15 + 1] = 4;
            var7[var14][var15 + 1] = var20;
         }

         if (var14 > 0 && var15 > 0 && var8[var14 - 1][var15 - 1] == 0 && !var3.a(var0 - 1, var1 - 1, 1076101390) && !var3.a(var0 - 1, var1, 1076101384) && !var3.a(var0, var1 - 1, 1076101378)) {
            var9[var21] = var12 - 1;
            var10[var21] = var13 - 1;
            var21 = var21 + 1 & var11;
            var8[var14 - 1][var15 - 1] = 3;
            var7[var14 - 1][var15 - 1] = var20;
         }

         if (var14 < var5 - 1 && var15 > 0 && var8[var14 + 1][var15 - 1] == 0 && !var3.a(var0 + 1, var1 - 1, 1076101507) && !var3.a(var0 + 1, var1, 1076101504) && !var3.a(var0, var1 - 1, 1076101378)) {
            var9[var21] = var12 + 1;
            var10[var21] = var13 - 1;
            var21 = var21 + 1 & var11;
            var8[var14 + 1][var15 - 1] = 9;
            var7[var14 + 1][var15 - 1] = var20;
         }

         if (var14 > 0 && var15 < var6 - 1 && var8[var14 - 1][var15 + 1] == 0 && !var3.a(var0 - 1, var1 + 1, 1076101432) && !var3.a(var0 - 1, var1, 1076101384) && !var3.a(var0, var1 + 1, 1076101408)) {
            var9[var21] = var12 - 1;
            var10[var21] = var13 + 1;
            var21 = var21 + 1 & var11;
            var8[var14 - 1][var15 + 1] = 6;
            var7[var14 - 1][var15 + 1] = var20;
         }

         if (var14 < var5 - 1 && var15 < var6 - 1 && var8[var14 + 1][var15 + 1] == 0 && !var3.a(var0 + 1, var1 + 1, 1076101600) && !var3.a(var0 + 1, var1, 1076101504) && !var3.a(var0, var1 + 1, 1076101408)) {
            var9[var21] = var12 + 1;
            var10[var21] = var13 + 1;
            var21 = var21 + 1 & var11;
            var8[var14 + 1][var15 + 1] = 12;
            var7[var14 + 1][var15 + 1] = var20;
         }
      }

      var4.a(var12, var13);
      return false;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(IILkn;Lkf;Lkm;I)Z",
      garbageValue = "221188846"
   )
   static boolean b(int var0, int var1, cR var2, cI var3, cQ var4) {
      int var5 = var4.g.length;
      int var6 = var4.g[0].length;
      int[][] var7 = var4.e;
      int[][] var8 = cQ.b(var4, -1793108330);
      int[] var9 = var4.f;
      int[] var10 = var4.d;
      int var11 = cQ.a(var4, -591190651);
      int var12 = var0;
      int var13 = var1;
      int var14 = var5 >> 1;
      int var15 = var6 >> 1;
      int var16 = var0 - var14;
      int var17 = var1 - var15;
      var8[var14][var15] = 99;
      var7[var14][var15] = 0;
      byte var18 = 0;
      int var19 = 0;
      var9[0] = var0;
      int var21 = var18 + 1;
      var10[0] = var1;

      while(var21 != var19) {
         var12 = var9[var19];
         var13 = var10[var19];
         var19 = var19 + 1 & var11;
         var14 = var12 - var16;
         var15 = var13 - var17;
         var0 = var12 - var3.b * 377417723;
         var1 = var13 - var3.e;
         if (var2.a(var12, var13)) {
            var4.a(var12, var13);
            return true;
         }

         int var20 = var7[var14][var15] + 1;
         if (var14 > 0 && var8[var14 - 1][var15] == 0 && !var3.a(var0 - 1, var1, 1076101390) && !var3.a(var0 - 1, var1 + 1, 1076101432)) {
            var9[var21] = var12 - 1;
            var10[var21] = var13;
            var21 = var21 + 1 & var11;
            var8[var14 - 1][var15] = 2;
            var7[var14 - 1][var15] = var20;
         }

         if (var14 < var5 - 2 && var8[var14 + 1][var15] == 0 && !var3.a(var0 + 2, var1, 1076101507) && !var3.a(var0 + 2, var1 + 1, 1076101600)) {
            var9[var21] = var12 + 1;
            var10[var21] = var13;
            var21 = var21 + 1 & var11;
            var8[var14 + 1][var15] = 8;
            var7[var14 + 1][var15] = var20;
         }

         if (var15 > 0 && var8[var14][var15 - 1] == 0 && !var3.a(var0, var1 - 1, 1076101390) && !var3.a(var0 + 1, var1 - 1, 1076101507)) {
            var9[var21] = var12;
            var10[var21] = var13 - 1;
            var21 = var21 + 1 & var11;
            var8[var14][var15 - 1] = 1;
            var7[var14][var15 - 1] = var20;
         }

         if (var15 < var6 - 2 && var8[var14][var15 + 1] == 0 && !var3.a(var0, var1 + 2, 1076101432) && !var3.a(var0 + 1, var1 + 2, 1076101600)) {
            var9[var21] = var12;
            var10[var21] = var13 + 1;
            var21 = var21 + 1 & var11;
            var8[var14][var15 + 1] = 4;
            var7[var14][var15 + 1] = var20;
         }

         if (var14 > 0 && var15 > 0 && var8[var14 - 1][var15 - 1] == 0 && !var3.a(var0 - 1, var1, 1076101438) && !var3.a(var0 - 1, var1 - 1, 1076101390) && !var3.a(var0, var1 - 1, 1076101519)) {
            var9[var21] = var12 - 1;
            var10[var21] = var13 - 1;
            var21 = var21 + 1 & var11;
            var8[var14 - 1][var15 - 1] = 3;
            var7[var14 - 1][var15 - 1] = var20;
         }

         if (var14 < var5 - 2 && var15 > 0 && var8[var14 + 1][var15 - 1] == 0 && !var3.a(var0 + 1, var1 - 1, 1076101519) && !var3.a(var0 + 2, var1 - 1, 1076101507) && !var3.a(var0 + 2, var1, 1076101603)) {
            var9[var21] = var12 + 1;
            var10[var21] = var13 - 1;
            var21 = var21 + 1 & var11;
            var8[var14 + 1][var15 - 1] = 9;
            var7[var14 + 1][var15 - 1] = var20;
         }

         if (var14 > 0 && var15 < var6 - 2 && var8[var14 - 1][var15 + 1] == 0 && !var3.a(var0 - 1, var1 + 1, 1076101438) && !var3.a(var0 - 1, var1 + 2, 1076101432) && !var3.a(var0, var1 + 2, 1076101624)) {
            var9[var21] = var12 - 1;
            var10[var21] = var13 + 1;
            var21 = var21 + 1 & var11;
            var8[var14 - 1][var15 + 1] = 6;
            var7[var14 - 1][var15 + 1] = var20;
         }

         if (var14 < var5 - 2 && var15 < var6 - 2 && var8[var14 + 1][var15 + 1] == 0 && !var3.a(var0 + 1, var1 + 2, 1076101624) && !var3.a(var0 + 2, var1 + 2, 1076101600) && !var3.a(var0 + 2, var1 + 1, 1076101603)) {
            var9[var21] = var12 + 1;
            var10[var21] = var13 + 1;
            var21 = var21 + 1 & var11;
            var8[var14 + 1][var15 + 1] = 12;
            var7[var14 + 1][var15 + 1] = var20;
         }
      }

      var4.a(var12, var13);
      return false;
   }
}
