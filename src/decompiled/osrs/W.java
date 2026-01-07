package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public final class W extends ak {
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 847979093
   )
   static int a;
   @ObfuscatedName("aj")
   private String b;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      longValue = 3986657128780362739L
   )
   private long c;
   @ObfuscatedSignature(
      signature = "Lfp;"
   )
   private ai d;

   @ObfuscatedSignature(
      signature = "(Lfp;)V"
   )
   W(ai var1) {
      this.d = var1;
      this.c = -1L;
      this.b = null;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lgu;I)V",
      garbageValue = "-1572789515"
   )
   final void a(aP var1) {
      var1.a(this.c, this.b, 0);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-1635342078"
   )
   final void a(jk var1) {
      if (jk.a((jk)var1, (byte)1) != 255) {
         --var1.c;
         this.c = var1.e();
      }

      this.b = var1.k();
   }

   @ObfuscatedName("ap")
   public static final int a(double var0, double var2, double var4) {
      double var6 = 0.0D;
      double var8 = 0.0D;
      double var10 = 0.0D;
      double var12;
      if (var4 < 0.5D) {
         var12 = var4 * 1.999899983406067D;
      } else {
         var12 = var4 + 0.9998999834060669D - var4 * 0.9998999834060669D;
      }

      double var14 = var4 * 2.0D - var12;
      double var16;
      if ((var16 = var0 + 0.3333333333333333D) > 1.0D) {
         --var16;
      }

      double var18;
      if ((var18 = var0 - 0.3333333333333333D) < 0.0D) {
         ++var18;
      }

      if (var16 * 6.0D < 1.0D) {
         var6 = var14 + var16 * (var12 - var14) * 6.0D;
      } else if (var16 * 2.0D < 1.0D) {
         var6 = var12;
      } else if (var16 * 3.0D < 2.0D) {
         var6 = 6.0D * (0.6666666666666666D - var16) * (var12 - var14) + var14;
      } else {
         var6 = var14;
      }

      if (var0 * 6.0D < 1.0D) {
         var8 = var0 * (var12 - var14) * 6.0D + var14;
      } else if (var0 * 2.0D < 1.0D) {
         var8 = var12;
      } else if (var0 * 3.0D < 2.0D) {
         var8 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var0);
      } else {
         var8 = var14;
      }

      if (var18 * 6.0D < 1.0D) {
         var10 = var14 + var18 * 6.0D * (var12 - var14);
      } else if (var18 * 2.0D < 1.0D) {
         var10 = var12;
      } else if (var18 * 3.0D < 2.0D) {
         var10 = var14 + 6.0D * (0.6666666666666666D - var18) * (var12 - var14);
      } else {
         var10 = var14;
      }

      int var20 = (int)(var6 * 256.0D);
      int var13 = (int)(var8 * 256.0D);
      int var21;
      return (var21 = (int)(var10 * 256.0D)) + (var13 << 8) + (var20 << 16);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-19821417"
   )
   public static int a(int var0, int var1) {
      return (var0 << 8) + var1;
   }

   @ObfuscatedName("mp")
   @ObfuscatedSignature(
      signature = "(Lcp;IIIIB)V",
      garbageValue = "-1"
   )
   static final void a(jG var0, int var1, int var2, int var3, int var4) {
      if (ci.a(var0, false)) {
         int var5 = var4;
         int var6 = var3;
         int var7 = var2;
         int var8 = var1;
         jG var9 = var0;
         if (var0.y != client.au && client.dT.h < 400) {
            String var10;
            String var10000;
            if (var0.aU == 0) {
               var10000 = var0.aW[0];
               var10 = var10000 + String.valueOf(var0.aT) + var0.aW[1] + C.a(var0.bf, ai.a.bf) + "  (level-" + var0.bf + ")" + var0.aW[2];
            } else {
               var10000 = var0.aW[0];
               var10 = var10000 + String.valueOf(var0.aT) + var0.aW[1] + "  (skill-" + var0.aU + ")" + var0.aW[2];
            }

            int var12 = client.aO;
            if (client.dU) {
               if ((gq.b & 8) == 8) {
                  String var10001 = client.dR;
                  fh.a(client.dN, var10001 + " -> " + dz.a(16777215) + var10, 15, var1, var2, var3, -1, false, var4);
               }
            } else {
               for(var1 = 7; var1 >= 0; --var1) {
                  if (client.dB[var1] != null) {
                     short var11 = 0;
                     if (client.dB[var1].equalsIgnoreCase("Attack")) {
                        if (ko.a == client.cG) {
                           continue;
                        }

                        if (ko.b == client.cG || client.cG == ko.e && var9.bf > ai.a.bf) {
                           var11 = 2000;
                        }

                        if (ai.a.aG != 0 && var9.aG != 0) {
                           if (var9.aG == ai.a.aG) {
                              var11 = 2000;
                           } else {
                              var11 = 0;
                           }
                        } else if (client.cG == ko.c && var9.w()) {
                           var11 = 2000;
                        }
                     } else if (client.ds[var1]) {
                        var11 = 2000;
                     }

                     var2 = client.U[var1] + var11;
                     fh.a(client.dB[var1], dz.a(16777215) + var10, var2, var8, var7, var6, -1, false, var5);
                  }
               }
            }

            for(var1 = 0; var1 < client.dT.h; ++var1) {
               if (client.dT.k[var1] == 23) {
                  String[] var13 = client.dT.e;
                  String var10002 = dz.a(16777215);
                  var13[var1] = var10002 + var10;
                  return;
               }
            }
         }
      }

   }
}
