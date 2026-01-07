package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public final class cW {
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1069406477
   )
   int a = 0;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 732307795
   )
   int b = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1276273555
   )
   int c = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1903007061
   )
   int d = 0;

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "29"
   )
   public final void a(int var1) {
      this.d = var1 & 2047;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Lks;I)V",
      garbageValue = "-1525487803"
   )
   public final void a(cW var1) {
      this.d = var1.d;
      this.b = var1.b;
      this.a = var1.a;
      this.c = var1.c;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-2146523987"
   )
   public final void a(int var1, int var2, int var3, int var4) {
      this.b += var1;
      this.a += var2;
      this.c += var3;
      this.a(var4 + this.d);
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "([BIIB)I",
      garbageValue = "48"
   )
   public static int a(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(var1 = var1; var1 < var2; ++var1) {
         var3 = var3 >>> 8 ^ jk.b[(var3 ^ var0[var1]) & 255];
      }

      return var3 = ~var3;
   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      signature = "(Ldl;IIIIB)V",
      garbageValue = "56"
   )
   static final void a(kd var0, int var1, int var2, int var3, int var4) {
      client.di = 0;
      boolean var5 = false;
      int var6 = -1;
      int var7 = -1;
      int var8 = client.ax.f;
      int[] var9 = client.ax.d;

      int var10;
      int var12;
      for(var10 = 0; var10 < var8 + var0.f.a; ++var10) {
         jE var11;
         if (var10 < var8) {
            var11 = (jE)var0.e.a((long)var9[var10]);
            if (var9[var10] == client.dW) {
               var5 = true;
               var6 = var10;
               continue;
            }

            if (var11 == ai.a) {
               var7 = var10;
               continue;
            }
         } else {
            var12 = var10 - var8;
            var11 = (jE)var0.g.a((long)var0.f.b[var12]);
         }

         eu.a(var0, var11, var10, var1, var2, var3, var4);
      }

      if (client.ao && var7 != -1) {
         eu.a(var0, ai.a, var7, var1, var2, var3, var4);
      }

      if (var5) {
         eu.a(var0, (jE)var0.e.a((long)client.dW), var6, var1, var2, var3, var4);
      }

      for(var10 = 0; var10 < client.di; ++var10) {
         int var41 = client.dl[var10];
         int var34 = client.dc[var10];
         int var35 = client.dz[var10];
         var6 = client.dH[var10];
         boolean var36 = true;

         while(var36) {
            var36 = false;

            for(var8 = 0; var8 < var10; ++var8) {
               if (var34 + 2 > client.dc[var8] - client.dH[var8] && var34 - var6 < client.dc[var8] + 2 && var41 - var35 < client.dl[var8] + client.dz[var8] && var35 + var41 > client.dl[var8] - client.dz[var8] && client.dc[var8] - client.dH[var8] < var34) {
                  var34 = client.dc[var8] - client.dH[var8];
                  var36 = true;
               }
            }
         }

         client.dK = client.dl[var10];
         client.dt = client.dc[var10] = var34;
         String var39 = client.dr[var10];
         if (client.dS == 0) {
            var34 = 16776960;
            if (client.dF[var10] < 6) {
               var34 = client.eG[client.dF[var10]];
            }

            if (client.dF[var10] == 6) {
               var34 = client.dA % 20 < 10 ? 16711680 : 16776960;
            }

            if (client.dF[var10] == 7) {
               var34 = client.dA % 20 < 10 ? 255 : '\uffff';
            }

            if (client.dF[var10] == 8) {
               var34 = client.dA % 20 < 10 ? '뀀' : 8454016;
            }

            if (client.dF[var10] == 9) {
               if ((var35 = 150 - client.dL[var10]) < 50) {
                  var34 = var35 * 1280 + 16711680;
               } else if (var35 < 100) {
                  var34 = 16776960 - (var35 - 50) * 327680;
               } else if (var35 < 150) {
                  var34 = (var35 - 100) * 5 + '\uff00';
               }
            }

            if (client.dF[var10] == 10) {
               if ((var35 = 150 - client.dL[var10]) < 50) {
                  var34 = var35 * 5 + 16711680;
               } else if (var35 < 100) {
                  var34 = 16711935 - (var35 - 50) * 327680;
               } else if (var35 < 150) {
                  var34 = (var35 - 100) * 327680 + 255 - (var35 - 100) * 5;
               }
            }

            if (client.dF[var10] == 11) {
               if ((var35 = 150 - client.dL[var10]) < 50) {
                  var34 = 16777215 - var35 * 327685;
               } else if (var35 < 100) {
                  var34 = (var35 - 50) * 327685 + '\uff00';
               } else if (var35 < 150) {
                  var34 = 16777215 - (var35 - 100) * 327680;
               }
            }

            if (client.dF[var10] == 12 && client.dI[var10] == null) {
               var35 = var39.length();
               client.dI[var10] = new int[var35];

               for(var6 = 0; var6 < var35; ++var6) {
                  var7 = (int)(64.0F * ((float)var6 / (float)var35)) << 10 | 896 | 64;
                  client.dI[var10][var6] = hY.a[var7];
               }
            }

            if (client.dp[var10] == 0) {
               hf.a.a(var39, client.dK + var1, var2 + client.dt, var34, 0, client.dI[var10]);
            }

            int[] var13;
            int[] var14;
            int var10002;
            int var10003;
            String var37;
            gp var38;
            int var40;
            int[] var42;
            if (client.dp[var10] == 1) {
               var10002 = client.dK + var1;
               var10003 = var2 + client.dt;
               var13 = client.dI[var10];
               var12 = client.dA;
               var5 = false;
               var40 = var10003;
               var7 = var10002;
               var37 = var39;
               var38 = hf.a;
               if (var39 != null) {
                  gw.a(var34, 0);
                  var14 = null;
                  if (var13 != null) {
                     var14 = gw.a(var38, var13, var39.length());
                  }

                  var42 = new int[var39.length()];

                  for(int var32 = 0; var32 < var37.length(); ++var32) {
                     var42[var32] = (int)(Math.sin((double)var32 / 2.0D + (double)var12 / 5.0D) * 5.0D);
                  }

                  var38.a(var37, var7 - var38.a(var37) / 2, var40, var14, (int[])null, var42);
               }
            }

            if (client.dp[var10] == 2) {
               var10002 = client.dK + var1;
               var10003 = var2 + client.dt;
               var13 = client.dI[var10];
               var12 = client.dA;
               var5 = false;
               var40 = var10003;
               var7 = var10002;
               var37 = var39;
               var38 = hf.a;
               if (var39 != null) {
                  gw.a(var34, 0);
                  var14 = null;
                  if (var13 != null) {
                     var14 = gw.a(var38, var13, var39.length());
                  }

                  var42 = new int[var39.length()];
                  int[] var45 = new int[var39.length()];

                  for(int var33 = 0; var33 < var37.length(); ++var33) {
                     var42[var33] = (int)(Math.sin((double)var33 / 5.0D + (double)var12 / 5.0D) * 5.0D);
                     var45[var33] = (int)(Math.sin((double)var33 / 3.0D + (double)var12 / 5.0D) * 5.0D);
                  }

                  var38.a(var37, var7 - var38.a(var37) / 2, var40, var14, var42, var45);
               }
            }

            if (client.dp[var10] == 3) {
               var10002 = client.dK + var1;
               var10003 = var2 + client.dt;
               int var10007 = 150 - client.dL[var10];
               var14 = client.dI[var10];
               int var43 = var10007;
               var12 = client.dA;
               var5 = false;
               var40 = var10003;
               var7 = var10002;
               var37 = var39;
               var38 = hf.a;
               if (var39 != null) {
                  gw.a(var34, 0);
                  var42 = null;
                  if (var14 != null) {
                     var42 = gw.a(var38, var14, var39.length());
                  }

                  double var46;
                  if ((var46 = 7.0D - (double)var43 / 8.0D) < 0.0D) {
                     var46 = 0.0D;
                  }

                  var13 = new int[var39.length()];

                  for(int var44 = 0; var44 < var37.length(); ++var44) {
                     var13[var44] = (int)(Math.sin((double)var44 / 1.5D + (double)var12) * var46);
                  }

                  var38.a(var37, var7 - var38.a(var37) / 2, var40, var42, (int[])null, var13);
               }
            }

            if (client.dp[var10] == 4) {
               var35 = (150 - client.dL[var10]) * (hf.a.a(var39) + 100) / 150;
               jd.e(client.dK + var1 - 50, var2, client.dK + var1 + 50, var2 + var4);
               gw.a(hf.a, var39, client.dK + var1 + 50 - var35, var2 + client.dt, var34, 0, client.dI[var10]);
               jd.d(var1, var2, var3 + var1, var2 + var4);
            }

            if (client.dp[var10] == 5) {
               var35 = 150 - client.dL[var10];
               var6 = 0;
               if (var35 < 25) {
                  var6 = var35 - 25;
               } else if (var35 > 125) {
                  var6 = var35 - 125;
               }

               jd.e(var1, var2 + client.dt - hf.a.c - 1, var3 + var1, var2 + client.dt + 5);
               hf.a.a(var39, client.dK + var1, var6 + var2 + client.dt, var34, 0, client.dI[var10]);
               jd.d(var1, var2, var3 + var1, var2 + var4);
            }
         } else {
            hf.a.c(var39, client.dK + var1, var2 + client.dt, 16776960, 0);
         }
      }

   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      signature = "(Ldl;IZI)V",
      garbageValue = "250024176"
   )
   static void a(kd var0, int var1, boolean var2) {
      jG var9;
      if ((var9 = (jG)var0.e.a((long)var1)) != null && var9.q() && !var9.aE) {
         int var3 = var9.bj * -226423085;
         var9.ba = false;
         if ((client.bv && client.ax.f > 50 || client.ax.f > 200) && var2 && var9.V == var9.K) {
            var9.ba = true;
         }

         int var10 = var9.s >> 7;
         int var4 = var9.n >> 7;
         if (var10 >= 0 && var10 < 104 && var4 >= 0 && var4 < 104) {
            long var7 = cQ.a(0, 0, 0, 0, false, var9.y, var0.k);
            if (var9.be != null && client.Z >= var9.aX && client.Z < var9.aR) {
               var9.ba = false;
               var9.aS = fq.a(var0, var9.s, var9.n, var3, var9.bd);
               var9.r = client.Z * -1922570071;
               var0.o.a(var3, var9.s, var9.n, var9.aS, var9, var9.l, var7, var9.aY, var9.aD, var9.aZ, var9.aF);
               return;
            }

            if ((var9.s & 127) == 64 && (var9.n & 127) == 64) {
               if (var0.h[var10][var4] == client.dA) {
                  return;
               }

               var0.h[var10][var4] = client.dA;
            }

            var9.aS = fq.a(var0, var9.s, var9.n, var3, var9.bd);
            var9.r = client.Z * -1922570071;
            var0.o.a(var3, var9.s, var9.n, var9.aS, 60, var9, var9.l, var7, var9.e);
         }
      }

   }

   @ObfuscatedName("vu")
   @ObfuscatedSignature(
      signature = "(Lks;III)V",
      garbageValue = "-214277242"
   )
   public static void a(cW var0, int var1, int var2) {
      if (var0 == null) {
         (var0 = var0).c = var0.a * -1295202529 + var1 * 513594175;
         var0.a = var0.b * 1260982241 + var1 * -1936984865;
      } else {
         var0.b += var1;
         var0.c += var2;
      }
   }
}
