package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public final class x {
   @ObfuscatedName("az")
   static String a;

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-51383257"
   )
   public static int a(int var0) {
      bj var3;
      int var1 = (var3 = hE.a(var0)).d;
      int var2 = var3.e;
      var0 = var3.f;
      var0 = ej.a[var0 - var2];
      return ej.d[var1] >> var2 & var0;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "1158018141"
   )
   static int b(int var0) {
      int var1;
      if (var0 == 4000) {
         hE.e -= 2;
         var0 = hE.c[hE.e];
         var1 = hE.c[hE.e + 1];
         hE.c[++hE.e - 1] = var1 + var0;
         return 1;
      } else if (var0 == 4001) {
         hE.e -= 2;
         var0 = hE.c[hE.e];
         var1 = hE.c[hE.e + 1];
         hE.c[++hE.e - 1] = var0 - var1;
         return 1;
      } else if (var0 == 4002) {
         hE.e -= 2;
         var0 = hE.c[hE.e];
         var1 = hE.c[hE.e + 1];
         hE.c[++hE.e - 1] = var1 * var0;
         return 1;
      } else if (var0 == 4003) {
         hE.e -= 2;
         var0 = hE.c[hE.e];
         var1 = hE.c[hE.e + 1];
         hE.c[++hE.e - 1] = var0 / var1;
         return 1;
      } else if (var0 == 4004) {
         var0 = hE.c[--hE.e];
         hE.c[++hE.e - 1] = (int)(Math.random() * (double)var0);
         return 1;
      } else if (var0 == 4005) {
         var0 = hE.c[--hE.e];
         hE.c[++hE.e - 1] = (int)(Math.random() * (double)(var0 + 1));
         return 1;
      } else {
         int var2;
         int var3;
         int var4;
         if (var0 == 4006) {
            hE.e -= 5;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            var2 = hE.c[hE.e + 2];
            var3 = hE.c[hE.e + 3];
            var4 = hE.c[hE.e + 4];
            hE.c[++hE.e - 1] = var0 + (var4 - var2) * (var1 - var0) / (var3 - var2);
            return 1;
         } else if (var0 == 4007) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            hE.c[++hE.e - 1] = var0 + var0 * var1 / 100;
            return 1;
         } else if (var0 == 4008) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            hE.c[++hE.e - 1] = var0 | 1 << var1;
            return 1;
         } else if (var0 == 4009) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            hE.c[++hE.e - 1] = var0 & -1 - (1 << var1);
            return 1;
         } else if (var0 == 4010) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            hE.c[++hE.e - 1] = (var0 & 1 << var1) != 0 ? 1 : 0;
            return 1;
         } else if (var0 == 4011) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            hE.c[++hE.e - 1] = var0 % var1;
            return 1;
         } else if (var0 == 4012) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            if (var0 == 0) {
               hE.c[++hE.e - 1] = 0;
            } else {
               hE.c[++hE.e - 1] = (int)Math.pow((double)var0, (double)var1);
            }

            return 1;
         } else if (var0 == 4013) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            if (var0 == 0) {
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else {
               switch(var1) {
               case 0:
                  hE.c[++hE.e - 1] = Integer.MAX_VALUE;
                  break;
               case 1:
                  hE.c[++hE.e - 1] = var0;
                  break;
               case 2:
                  hE.c[++hE.e - 1] = (int)Math.sqrt((double)var0);
                  break;
               case 3:
                  hE.c[++hE.e - 1] = (int)Math.cbrt((double)var0);
                  break;
               case 4:
                  hE.c[++hE.e - 1] = (int)Math.sqrt(Math.sqrt((double)var0));
                  break;
               default:
                  hE.c[++hE.e - 1] = (int)Math.pow((double)var0, 1.0D / (double)var1);
               }

               return 1;
            }
         } else if (var0 == 4014) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            hE.c[++hE.e - 1] = var0 & var1;
            return 1;
         } else if (var0 == 4015) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            hE.c[++hE.e - 1] = var0 | var1;
            return 1;
         } else if (var0 == 4016) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            hE.c[++hE.e - 1] = var0 < var1 ? var0 : var1;
            return 1;
         } else if (var0 == 4017) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            hE.c[++hE.e - 1] = var0 > var1 ? var0 : var1;
            return 1;
         } else if (var0 == 4018) {
            hE.e -= 3;
            long var12 = (long)hE.c[hE.e];
            long var8 = (long)hE.c[hE.e + 1];
            long var10 = (long)hE.c[hE.e + 2];
            hE.c[++hE.e - 1] = (int)(var10 * var12 / var8);
            return 1;
         } else if (var0 == 4025) {
            var0 = jV.b(hE.c[--hE.e]);
            hE.c[++hE.e - 1] = var0;
            return 1;
         } else if (var0 == 4026) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            hE.c[++hE.e - 1] = var0 ^ 1 << var1;
            return 1;
         } else if (var0 == 4027) {
            hE.e -= 3;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            var2 = hE.c[hE.e + 2];
            hE.c[++hE.e - 1] = dw.a(var0, var1, var2);
            return 1;
         } else if (var0 == 4028) {
            hE.e -= 3;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            var2 = hE.c[hE.e + 2];
            hE.c[++hE.e - 1] = dr.a(var0, var1, var2);
            return 1;
         } else if (var0 == 4029) {
            hE.e -= 3;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            var2 = hE.c[hE.e + 2];
            var3 = 31 - var2;
            hE.c[++hE.e - 1] = var0 << var3 >>> var1 + var3;
            return 1;
         } else if (var0 == 4030) {
            hE.e -= 4;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            var2 = hE.c[hE.e + 2];
            var3 = hE.c[hE.e + 3];
            var0 = dr.a(var0, var2, var3);
            var4 = fg.a(var3 - var2 + 1);
            if (var1 > var4) {
               var1 = var4;
            }

            hE.c[++hE.e - 1] = var0 | var1 << var2;
            return 1;
         } else if (var0 == 4032) {
            hE.c[hE.e - 1] = K.a(hE.c[hE.e - 1]);
            return 1;
         } else if (var0 == 4033) {
            hE.c[hE.e - 1] = eD.a(hE.c[hE.e - 1]);
            return 1;
         } else if (var0 == 4034) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            var2 = jN.a(var0, var1);
            hE.c[++hE.e - 1] = var2;
            return 1;
         } else if (var0 == 4035) {
            hE.c[hE.e - 1] = Math.abs(hE.c[hE.e - 1]);
            return 1;
         } else if (var0 == 4036) {
            String var6 = (String)hE.n[--aU.a];
            var1 = -1;
            if (dG.a(var6)) {
               var1 = ao.a((CharSequence)var6);
            }

            hE.c[++hE.e - 1] = var1;
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ObfuscatedName("mn")
   @ObfuscatedSignature(
      signature = "(Lov;I)V",
      garbageValue = "1027591305"
   )
   static final void a(fd var0) {
      if (var0.q == 1) {
         cp.a(var0.Q, "", 24, 0, 0, var0.m, var0.bJ);
      }

      String var1;
      if (var0.q == 2 && !client.dU && (var1 = dW.a(var0)) != null) {
         cp.a(var1, dz.a(65280) + var0.ar, 25, 0, -1, var0.m, var0.bJ);
      }

      if (var0.q == 3) {
         B.a("Close", "", 26, 0, 0, var0.m);
      }

      if (var0.q == 4) {
         B.a(var0.Q, "", 28, 0, 0, var0.m);
      }

      if (var0.q == 5) {
         B.a(var0.Q, "", 29, 0, 0, var0.m);
      }

      if (var0.q == 6 && client.bY == null) {
         B.a(var0.Q, "", 30, 0, -1, var0.m);
      }

      if (var0.f) {
         if (client.dU) {
            if ((ck.a(var0) >> 21 & 1) != 0 && (gq.b & 32) == 32) {
               cp.a(client.dN, client.dR + " -> " + var0.ac, 58, 0, var0.s * -744024149, var0.m, var0.bJ);
               return;
            }
         } else {
            for(int var11 = 31; var11 >= 0; --var11) {
               String var2;
               if (var0.aF * -1196438339 == var11 && (var2 = dW.a(var0)) != null) {
                  cp.a(var2, var0.ac, 25, 0, var0.s * -744024149, var0.m, var0.bJ);
               }

               if ((aq.a(fh.a(var0), var11) || var0.aZ != null) && var0.aJ != null && var0.aJ.length > var11 && var0.aJ[var11] != null && !var0.aJ[var11].trim().isEmpty()) {
                  var2 = var0.aJ[var11];
               } else {
                  var2 = null;
               }

               if (var2 != null) {
                  short var3;
                  int var12;
                  if (var11 > var0.aF * -1196438339) {
                     var3 = 1007;
                     var12 = cp.a(var2, var0.ac, 1007, var11 + 1, var0.s * -744024149, var0.m, var0.bJ);
                  } else {
                     var3 = 57;
                     var12 = fh.a(var2, var0.ac, 57, var11 + 1, var0.s * -744024149, var0.m, var0.bJ, var0.bV, -1);
                  }

                  if (var0.ax != null && var11 < var0.ax.length && var0.ax[var11] != null) {
                     String[] var4;
                     for(int var5 = (var4 = var0.ax[var11]).length - 1; var5 >= 0; --var5) {
                        int var6 = var5 + 1 << 16 | var11 + 1;
                        if (var4[var5] != null && !var4[var5].isEmpty()) {
                           String var7 = var4[var5];
                           int var8 = var0.s * -744024149;
                           int var9 = var0.m;
                           int var10 = var0.bJ;
                           if (!client.dP && hg.a(-1, var3) && var12 >= 0 && var12 < client.dT.n.length) {
                              if (client.dT.n[var12] == null) {
                                 client.dT.n[var12] = new jy(false);
                              }

                              client.dT.n[var12].a(var7, "", var3, var6, var8, var9, var10, false, -1);
                           }
                        }
                     }
                  }
               }
            }

            if (aa.a(ck.a(var0))) {
               B.a("Continue", "", 30, 0, var0.s * -744024149, var0.m);
            }
         }
      }

   }
}
