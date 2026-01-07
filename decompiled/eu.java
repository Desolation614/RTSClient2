package osrs;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
public final class eu {
   static String a = null;
   @ObfuscatedName("ap")
   private static boolean[] m;
   @ObfuscatedName("uf")
   static boolean b;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "[[Lov;"
   )
   public fd[][] c;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   fB d;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "Lso;"
   )
   hb e;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "Lso;"
   )
   hb f;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   dX g = new dX(8);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   dX h = new dX(50);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   fB i;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   private fB n;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   fB j;
   @ObfuscatedName("am")
   private Map o = new HashMap();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   private fB p;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   dX k = new dX(20);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   dX l = new dX(200);

   @ObfuscatedSignature(
      signature = "(Lps;Lps;Lps;Lps;Lps;)V"
   )
   public eu(fE var1, fE var2, fE var3, fE var4, fE var5) {
      this.e = new hb(10, gP.a);
      this.f = new hb(10, gP.a);
      int var6 = 0;
      if (var1 != null) {
         this.n = var1;
         this.i = var2;
         this.j = var3;
         this.d = var4;
         this.p = var5;
         var6 = this.n.e;
      }

      this.c = new fd[var6][];
      m = new boolean[var6];
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1462724772"
   )
   public final void a(int var1) {
      if (var1 != -1 && m[var1]) {
         this.n.f(var1);
         if (this.c[var1] != null) {
            for(int var2 = 0; var2 < this.c[var1].length; ++var2) {
               if (this.c[var1][var2] != null) {
                  this.c[var1][var2] = null;
               }
            }

            this.c[var1] = null;
            m[var1] = false;
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(IB)Lov;",
      garbageValue = "-120"
   )
   public final fd b(int var1) {
      int var2 = var1 >> 16;
      var1 &= 65535;
      return (this.c[var2] == null || this.c[var2][var1] == null) && !a(this, var2) ? null : this.c[var2][var1];
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "-727783969"
   )
   static int a(int var0, boolean var1) {
      int var2 = -1;
      fd var10000;
      if (var0 >= 2000) {
         var0 -= 1000;
         var2 = hE.c[--hE.e];
         var10000 = jD.a.b(var2);
      } else {
         var10000 = var1 ? ic.a : ef.a;
      }

      fd var4 = var10000;
      client var5;
      if (var0 == 1000) {
         hE.e -= 4;
         var4.c = hE.c[hE.e];
         var4.r = hE.c[hE.e + 1];
         var4.p = hE.c[hE.e + 2];
         var4.l = hE.c[hE.e + 3];
         gs.a(var4);
         var5 = dF.c;
         client.a(var4);
         if (var2 != -1 && var4.j == 0) {
            aP.a(jD.a.c[var2 >> 16], var4, false, (byte)3);
         }

         return 1;
      } else if (var0 == 1001) {
         hE.e -= 4;
         var4.u = hE.c[hE.e];
         var4.t = hE.c[hE.e + 1];
         var4.d = hE.c[hE.e + 2];
         var4.h = hE.c[hE.e + 3];
         gs.a(var4);
         var5 = dF.c;
         client.a(var4);
         if (var2 != -1 && var4.j == 0) {
            aP.a(jD.a.c[var2 >> 16], var4, false, (byte)3);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var3;
         if ((var3 = hE.c[--hE.e] == 1) != var4.P) {
            var4.P = var3;
            gs.a(var4);
         }

         return 1;
      } else if (var0 == 1005) {
         var4.bY = hE.c[--hE.e] == 1;
         return 1;
      } else if (var0 == 1006) {
         var4.bR = hE.c[--hE.e] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      signature = "(Ldl;Lcn;IIIIIB)V"
   )
   static final void a(kd var0, jE var1, int var2, int var3, int var4, int var5, int var6) {
      if (ci.a(var1, true)) {
         var6 = var6;
         var5 = var5;
         var4 = var4;
         var3 = var3;
         jE var7 = var1;
         kd var8 = var0;
         if (var1 != null && var1.q()) {
            if (var1 instanceof kc) {
               aY var9;
               if ((var9 = ((kc)var1).aQ).B != null) {
                  var9 = var9.a();
               }

               if (var9 == null) {
                  return;
               }
            }

            int var85 = client.ax.f;
            int[] var10 = client.ax.d;
            boolean var11 = var2 < var85;
            int var12 = -2;
            if (client.o(1) && var1.F != null && (!var11 || !var1.P && (client.cA == 4 || !var1.H && (client.cA == 0 || client.cA == 3 || client.cA == 1 && ((jG)var1).y())))) {
               osrs.l.a(var0, var1, var1.t());
               if (client.dK >= 0 && client.di < client.da) {
                  client.dz[client.di] = hf.a.a(var1.F) / 2;
                  client.dH[client.di] = hf.a.c;
                  client.dl[client.di] = client.dK;
                  client.dc[client.di] = client.dt - -2;
                  client.dF[client.di] = var1.O;
                  client.dp[client.di] = var1.J;
                  client.dL[client.di] = var1.E;
                  client.dI[client.di] = var1.C;
                  client.dr[client.di] = var1.F;
                  ++client.di;
                  var12 += 12;
               }
            }

            iT var15;
            int var10000;
            int var10002;
            int var25;
            int var83;
            int var88;
            if (!var1.u.c()) {
               osrs.l.a(var0, var1, var1.t() + 15);
               if (!client.o(1073741824)) {
                  return;
               }

               for(jT var81 = (jT)fR.a((fR)var1.u, (hR)null); var81 != null; var81 = (jT)var7.u.a()) {
                  jN var14;
                  if ((var14 = var81.a(client.Z)) == null) {
                     if (var81.a.c()) {
                        gk.a(var81);
                     }
                  } else {
                     bq var13;
                     var15 = (var13 = var81.b).a();
                     iT var16 = bq.a(var13, (byte)-1);
                     var25 = 0;
                     if (var15 != null && var16 != null) {
                        if (var13.l << 1 < var16.a) {
                           var25 = var13.l;
                        }

                        var83 = var16.a - (var25 << 1);
                     } else {
                        var83 = var13.f;
                     }

                     int var26 = 255;
                     int var17 = client.Z - var14.e;
                     int var18 = var83 * var14.d / var13.f;
                     int var19;
                     int var20;
                     if (var14.b > var17) {
                        if (var13.i == 0) {
                           var10000 = 0;
                        } else {
                           var10002 = var13.i;
                           var10000 = var10002 * (var17 / var10002);
                        }

                        var19 = var10000;
                        var88 = var83 * var14.c / var13.f;
                        var20 = var19 * (var18 - var88) / var14.b + var88;
                     } else {
                        var20 = var18;
                        var19 = var13.o + var14.b - var17;
                        if (var13.m >= 0) {
                           var26 = (var19 << 8) / (var13.o - var13.m);
                        }
                     }

                     if (var14.d > 0 && var20 <= 0) {
                        var20 = 1;
                     }

                     if (var15 != null && var16 != null) {
                        if (var20 == var83) {
                           var20 += var25 << 1;
                        } else {
                           var20 += var25;
                        }

                        var19 = var15.e;
                        var12 += var19;
                        var88 = var3 + client.dK - (var83 >> 1);
                        var83 = var4 + client.dt - var12;
                        var88 -= var25;
                        if (var26 >= 0 && var26 < 255) {
                           iT.a(var15, var88, var83, var26);
                           jd.e(var88, var83, var88 + var20, var19 + var83);
                           iT.a(var16, var88, var83, var26);
                        } else {
                           var15.a(var88, var83);
                           jd.e(var88, var83, var88 + var20, var83 + var19);
                           var16.a(var88, var83);
                        }

                        jd.d(var3, var4, var5 + var3, var4 + var6);
                     } else {
                        var12 += 5;
                        if (client.dK >= 0) {
                           var19 = var3 + client.dK - (var83 >> 1);
                           var88 = var4 + client.dt - var12;
                           jd.h(var19, var88, var20, 5, 65280);
                           jd.h(var19 + var20, var88, var83 - var20, 5, 16711680);
                        }
                     }

                     var12 += 2;
                  }
               }
            }

            if (var12 == -2) {
               var12 += 7;
            }

            jG var84;
            if (var11 && var7.r * 24066969 == client.Z && aZ.a((jG)var7)) {
               var84 = (jG)var7;
               if (var11) {
                  osrs.l.a(var0, var7, var7.t() + 15);
                  gw var89 = (gw)client.ad.get(iQ.c);
                  var12 += 4;
                  var89.c(jw.a(var84.aT, -1032988889), var3 + client.dK, var4 + client.dt - var12, 16777215, 0);
                  var12 += 18;
               }
            }

            if (var11) {
               if ((var84 = (jG)var7).aE) {
                  return;
               }

               if (var84.bc != -1 || var84.aQ != -1) {
                  osrs.l.a(var0, var7, var7.at + 15);
                  if (client.dK >= 0) {
                     if (var84.bc != -1) {
                        var12 += 25;
                        cl.a[var84.bc].a(var3 + client.dK - 12, var4 + client.dt - var12);
                     }

                     if (var84.aQ != -1) {
                        var12 += 25;
                        gY.s[var84.aQ].a(var3 + client.dK - 12, var4 + client.dt - var12);
                     }
                  }
               }

               if (var2 >= 0 && client.cF == 10 && var10[var2] == client.cJ) {
                  osrs.l.a(var0, var7, var7.at + 15);
                  if (client.dK >= 0) {
                     var12 += ej.e[1].e;
                     ej.e[1].a(var3 + client.dK - 12, var4 + client.dt - var12);
                  }
               }
            } else {
               kc var90;
               int[] var91 = kc.c(var90 = (kc)var7, 1103522935);
               short[] var93;
               if ((var93 = kc.b(var90, -1809823740)) != null && var91 != null) {
                  for(int var95 = 0; var95 < var93.length; ++var95) {
                     if (var93[var95] >= 0 && var91[var95] >= 0) {
                        long var103 = (long)var91[var95] << 8 | (long)var93[var95];
                        iT var80;
                        iT[] var97;
                        if ((var80 = (iT)hb.a(client.fl, var103, -2060938296)) == null && (var97 = hb.a(fk.a, var91[var95], 0)) != null && var93[var95] < var97.length) {
                           var80 = var97[var93[var95]];
                           client.fl.a(var103, var80);
                        }

                        if (var80 != null) {
                           osrs.l.a(var8, var7, var7.t() + 15);
                           if (client.dK >= 0) {
                              var80.a(var3 + client.dK - (var80.a >> 1), (var4 - var80.e - 2) * (var95 + 1) - var80.e + client.dt - 4);
                           }
                        }
                     }
                  }
               }

               if (client.cF == 1) {
                  int var79 = var2 - var85;
                  if (client.cI == var8.f.b[var79] && client.Z % 20 < 10) {
                     osrs.l.a(var8, var7, var7.t() + 15);
                     if (client.dK >= 0) {
                        ej.e[0].a(var3 + client.dK - 12, var4 + client.dt - 28);
                     }
                  }
               }
            }

            for(int var92 = 0; var92 < 4; ++var92) {
               var88 = var7.x[var92];
               int var94 = var7.i[var92];
               bG var96 = null;
               var25 = 0;
               if (var94 >= 0) {
                  if (var88 <= client.Z) {
                     continue;
                  }

                  var25 = (var96 = jD.d(var7.i[var92])).i;
                  if (var96 != null && var96.l != null && (var96 = var96.c()) == null) {
                     var7.x[var92] = -1;
                     continue;
                  }
               } else if (var88 < 0) {
                  continue;
               }

               var83 = var7.j[var92];
               bG var104 = null;
               if (var83 >= 0 && (var104 = jD.d(var83)) != null && var104.l != null) {
                  var104 = var104.c();
               }

               if (var88 - var25 <= client.Z) {
                  if (var96 == null) {
                     var7.x[var92] = -1;
                  } else {
                     osrs.l.a(var8, var7, var7.t() / 2);
                     if (client.dK >= 0) {
                        if (var92 == 1) {
                           client.dt -= 20;
                        }

                        if (var92 == 2) {
                           client.dK -= 15;
                           client.dt -= 10;
                        }

                        if (var92 == 3) {
                           client.dK += 15;
                           client.dt -= 10;
                        }

                        var88 = 0;
                        var83 = 0;
                        int var82 = 0;
                        var2 = 0;
                        var5 = 0;
                        var6 = 0;
                        var85 = 0;
                        int var86 = 0;
                        iT var87 = null;
                        iT var99 = null;
                        var15 = null;
                        iT var21 = null;
                        int var22 = 0;
                        int var23 = 0;
                        int var24 = 0;
                        var25 = 0;
                        int var27 = 0;
                        int var28 = 0;
                        int var29 = 0;
                        int var30 = 0;
                        iT var98;
                        if ((var98 = var96.b()) != null) {
                           var88 = var98.a;
                           var10000 = var98.e;
                           var5 = var98.d;
                        }

                        iT var100;
                        if ((var100 = bG.a(var96, -234045725)) != null) {
                           var83 = var100.a;
                           var10000 = var100.e;
                           var6 = var100.d;
                        }

                        iT var101;
                        if ((var101 = var96.d()) != null) {
                           var82 = var101.a;
                           var10000 = var101.e;
                           var85 = var101.d;
                        }

                        iT var102;
                        if ((var102 = var96.a()) != null) {
                           var2 = var102.a;
                           var10000 = var102.e;
                           var86 = var102.d;
                        }

                        if (var104 != null) {
                           if ((var87 = var104.b()) != null) {
                              var22 = var87.a;
                              var10000 = var87.e;
                              var27 = var87.d;
                           }

                           if ((var99 = bG.a(var104, -234045725)) != null) {
                              var23 = var99.a;
                              var10000 = var99.e;
                              var28 = var99.d;
                           }

                           if ((var15 = var104.d()) != null) {
                              var24 = var15.a;
                              var10000 = var15.e;
                              var29 = var15.d;
                           }

                           if ((var21 = var104.a()) != null) {
                              var25 = var21.a;
                              var10000 = var21.e;
                              var30 = var21.d;
                           }
                        }

                        gp var31;
                        if ((var31 = bG.a(var96, (byte)118)) == null) {
                           var31 = dt.a;
                        }

                        gp var32;
                        if (var104 == null || (var32 = bG.a(var104, (byte)69)) == null) {
                           var32 = dt.a;
                        }

                        String var34 = null;
                        int var35 = 0;
                        String var33 = var96.a(var7.p[var92]);
                        int var36 = var31.a(var33);
                        if (var104 != null) {
                           var34 = var104.a(var7.m[var92]);
                           var35 = var32.a(var34);
                        }

                        int var37 = 0;
                        int var38 = 0;
                        if (var83 > 0) {
                           if (var101 == null && var102 == null) {
                              var37 = 1;
                           } else {
                              var37 = var36 / var83 + 1;
                           }
                        }

                        if (var104 != null && var23 > 0) {
                           if (var15 == null && var21 == null) {
                              var38 = 1;
                           } else {
                              var38 = var35 / var23 + 1;
                           }
                        }

                        int var39 = 0;
                        if (var88 > 0) {
                           var39 = var88 + 0;
                        }

                        var39 += 2;
                        var88 = var39;
                        if (var82 > 0) {
                           var39 += var82;
                        }

                        var82 = var39;
                        int var40 = var39;
                        int var41;
                        if (var83 > 0) {
                           var41 = var37 * var83;
                           var39 += var41;
                           var40 += (var41 - var36) / 2;
                        } else {
                           var39 += var36;
                        }

                        var41 = var39;
                        if (var2 > 0) {
                           var39 += var2;
                        }

                        var2 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68;
                        if (var104 != null) {
                           var39 += 2;
                           var2 = var39;
                           if (var22 > 0) {
                              var39 += var22;
                           }

                           var39 += 2;
                           var64 = var39;
                           if (var24 > 0) {
                              var39 += var24;
                           }

                           var65 = var39;
                           var67 = var39;
                           if (var23 > 0) {
                              var68 = var23 * var38;
                              var39 += var68;
                              var67 += (var68 - var35) / 2;
                           } else {
                              var39 += var35;
                           }

                           var66 = var39;
                           if (var25 > 0) {
                              var39 += var25;
                           }
                        }

                        var68 = var7.x[var92] - client.Z;
                        var10002 = var96.h;
                        int var69 = var10002 - var68 * var10002 / var96.i;
                        int var70 = var68 * var96.p / var96.i - var96.p;
                        int var71 = var3 + client.dK - (var39 >> 1) + var69;
                        int var72;
                        int var73 = (var72 = var4 + client.dt - 12 + var70) + var96.f + 15;
                        var10000 = var31.d;
                        var10000 = var31.f;
                        int var74 = 0;
                        if (var104 != null) {
                           var74 = var72 + var104.f + 15;
                           var10000 = var32.d;
                           var10000 = var32.f;
                        }

                        int var75 = 255;
                        if (var96.k >= 0) {
                           var75 = (var68 << 8) / (var96.i - var96.k);
                        }

                        int var76;
                        if (var75 >= 0 && var75 < 255) {
                           if (var98 != null) {
                              iT.a(var98, var71 + 0 - var5, var72, var75);
                           }

                           if (var101 != null) {
                              iT.a(var101, var71 + var88 - var85, var72, var75);
                           }

                           if (var100 != null) {
                              for(var76 = 0; var76 < var37; ++var76) {
                                 iT.a(var100, var76 * var83 + (var82 + var71 - var6), var72, var75);
                              }
                           }

                           if (var102 != null) {
                              iT.a(var102, var71 + var41 - var86, var72, var75);
                           }

                           var31.a((String)var33, var71 + var40, var73, var96.g, 0, var75);
                           if (var104 != null) {
                              if (var87 != null) {
                                 iT.a(var87, var71 + var2 - var27, var72, var75);
                              }

                              if (var15 != null) {
                                 iT.a(var15, var71 + var64 - var29, var72, var75);
                              }

                              if (var99 != null) {
                                 for(var76 = 0; var76 < var38; ++var76) {
                                    iT.a(var99, var76 * var23 + (var71 + var65 - var28), var72, var75);
                                 }
                              }

                              if (var21 != null) {
                                 iT.a(var21, var66 + var71 - var30, var72, var75);
                              }

                              var32.a((String)var34, var67 + var71, var74, var104.g, 0, var75);
                           }
                        } else {
                           if (var98 != null) {
                              var98.a(var71 + 0 - var5, var72);
                           }

                           if (var101 != null) {
                              var101.a(var71 + var88 - var85, var72);
                           }

                           if (var100 != null) {
                              for(var76 = 0; var76 < var37; ++var76) {
                                 var100.a(var83 * var76 + (var71 + var82 - var6), var72);
                              }
                           }

                           if (var102 != null) {
                              var102.a(var41 + var71 - var86, var72);
                           }

                           var31.a(var33, var71 + var40, var73, var96.g | -16777216, 0);
                           if (var104 != null) {
                              if (var87 != null) {
                                 var87.a(var2 + var71 - var27, var72);
                              }

                              if (var15 != null) {
                                 var15.a(var64 + var71 - var29, var72);
                              }

                              if (var99 != null) {
                                 for(var76 = 0; var76 < var38; ++var76) {
                                    var99.a(var23 * var76 + (var65 + var71 - var28), var72);
                                 }
                              }

                              if (var21 != null) {
                                 var21.a(var66 + var71 - var30, var72);
                              }

                              var32.a(var34, var71 + var67, var74, var104.g | -16777216, 0);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("lp")
   @ObfuscatedSignature(
      signature = "(Lnn;IIB)Lov;"
   )
   public static fd a(eu var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         fd var7 = var0.b(var1);
         if (var1 != -1) {
            fd var10000;
            if (var7 != null && var7.bH != null && var1 < var7.bH.length) {
               var10000 = var7.bH[var1];
            } else {
               var10000 = null;
            }
         }
      }

      fd var6 = var0.b(var1);
      if (var2 == -1) {
         return var6;
      } else {
         return var6 != null && var6.bH != null && var2 < var6.bH.length ? var6.bH[var2] : null;
      }
   }

   @ObfuscatedName("pc")
   @ObfuscatedSignature(
      signature = "(Lnn;B)V"
   )
   public static void a(eu var0, byte var1) {
      if (var0 == null) {
         dX var2;
         fK.a((var2 = var0.k).c);
         var2.a.b();
         var2.e = new im();
         var2.d = var2.b;
         fK.a((var2 = var0.k).c);
         var2.a.b();
         var2.e = new im();
         var2.d = var2.b;
         var0.l.b();
         var0.h.a();
      }

      var0.l.b();
      var0.h.b();
      var0.k.b();
      var0.g.b();
   }

   @ObfuscatedName("vw")
   @ObfuscatedSignature(
      signature = "(Lnn;IB)Z"
   )
   public static boolean a(eu var0, int var1) {
      if (m[var1]) {
         return true;
      } else {
         File var2;
         fd var19;
         if (a != null && !a.isEmpty() && (var2 = new File(a + "/" + var1)).exists() && var2.isDirectory()) {
            client.cV.trace("Attempting to load interface from {}", var2.getAbsolutePath());
            String[] var15;
            if ((var15 = var2.list()) != null && var15.length != 0) {
               if (var0.c[var1] == null) {
                  var0.c[var1] = new fd[var15.length];
               }

               int var16;
               for(var16 = 0; var16 < var0.c[var1].length; ++var16) {
                  String var10002 = var2.getAbsolutePath();
                  File var20;
                  if (!(var20 = new File(var10002 + "/" + var16)).exists()) {
                     client.cV.error("Unable to load {}", var20.getAbsolutePath());
                     return false;
                  }

                  try {
                     FileInputStream var22 = new FileInputStream(var20);

                     try {
                        fd var17;
                        (var17 = new fd()).m = (var1 << 16) + var16;
                        var17.a(new jk(osrs.g.a(var22)));
                        var0.c[var1][var16] = var17;
                     } catch (Throwable var12) {
                        try {
                           var22.close();
                        } catch (Throwable var11) {
                           var12.addSuppressed(var11);
                        }

                        throw var12;
                     }

                     var22.close();
                  } catch (Exception var13) {
                     client.cV.error("Unable to load {}", var20.getAbsolutePath(), var13);
                  }
               }

               for(var16 = 0; var16 < var0.c[var1].length; ++var16) {
                  if ((var19 = var0.c[var1][var16]) != null && var19.v != -1) {
                     fd var23 = var0.c[var1][var19.v & '\uffff'];
                     if (var16 > var23.G) {
                        var23.G = var16;
                     }

                     if (var16 < var23.y) {
                        var23.y = var16;
                     }
                  }
               }

               m[var1] = true;
               return true;
            } else {
               client.cV.error("Unable to load interface from directory. Files are null or empty?");
               return false;
            }
         } else if (!fB.c(var0.n, var1)) {
            return false;
         } else {
            int var14;
            if ((var14 = var0.n.d(var1)) == 0) {
               m[var1] = true;
               return true;
            } else {
               if (var0.c[var1] == null) {
                  var0.c[var1] = new fd[var14];
               }

               int var3;
               fd var4;
               for(var3 = 0; var3 < var14; ++var3) {
                  byte[] var5;
                  if (var0.c[var1][var3] == null && (var5 = fB.a(var0.n, var1, var3)) != null) {
                     var4 = new fd();
                     var0.c[var1][var3] = var4;
                     var4.m = var3 + (var1 << 16);
                     if (var5[0] == -1) {
                        var4.a(new jk(var5));
                     } else {
                        jk var10001 = new jk(var5);
                        int var18 = -2136590290;
                        jk var6 = var10001;
                        var19 = var4;
                        var4.f = false;
                        var4.j = jk.a(var6, (byte)-9);
                        var4.q = jk.a((jk)var6, (byte)28);
                        var4.e = var6.d();
                        var4.c = var6.c();
                        var4.r = var6.c();
                        var4.u = var6.d();
                        var4.t = var6.d();
                        var4.K = jk.a(var6, (byte)-84);
                        var4.v = var6.d();
                        if (var4.v == 65535) {
                           var4.v = -1;
                        } else {
                           var4.v += var4.m & -65536;
                        }

                        var4.bB = var6.d();
                        if (var4.bB == 65535) {
                           var4.bB = -1;
                        }

                        int var7;
                        int var8;
                        if ((var7 = jk.a((jk)var6, (byte)11)) > 0) {
                           var4.bD = new int[var7];
                           var4.bx = new int[var7];

                           for(var8 = 0; var8 < var7; ++var8) {
                              var19.bD[var8] = jk.a((jk)var6, (byte)28);
                              var19.bx[var8] = var6.d();
                           }
                        }

                        if ((var8 = jk.a((jk)var6, (byte)36)) > 0) {
                           var19.bN = new int[var8][];

                           for(var7 = 0; var7 < var8; ++var7) {
                              int var9 = var6.d();
                              var19.bN[var7] = new int[var9];

                              for(int var10 = 0; var10 < var9; ++var10) {
                                 var19.bN[var7][var10] = var6.d();
                                 if (var19.bN[var7][var10] == 65535) {
                                    var19.bN[var7][var10] = -1;
                                 }
                              }
                           }
                        }

                        if (var19.j == 0) {
                           var19.S = var6.d();
                           var19.P = jk.a((jk)var6, (byte)22) == 1;
                        }

                        if (var19.j == 1) {
                           var6.d();
                           jk.a(var6, (byte)-43);
                        }

                        if (var19.j == 3) {
                           boolean var24;
                           if (jk.a((jk)var6, (byte)6) == 1) {
                              var24 = true;
                           } else {
                              var24 = false;
                           }

                           var19.A = var24;
                        }

                        if (var19.j == 4 || var19.j == 1) {
                           var19.aK = jk.a(var6, (byte)-50);
                           var19.aB = jk.a(var6, (byte)-3);
                           var19.aa = jk.a((jk)var6, (byte)65);
                           var19.aj = var6.d();
                           if (var19.aj == 65535) {
                              var19.aj = -1;
                           }

                           var19.aG = jk.a(var6, (byte)-95) == 1;
                        }

                        if (var19.j == 4) {
                           var19.aC = var6.p();
                           var19.bu = var6.p();
                        }

                        if (var19.j == 1 || var19.j == 3 || var19.j == 4) {
                           var19.R = jk.d(var6, 1687107415);
                        }

                        if (var19.j == 3 || var19.j == 4) {
                           var19.U = jk.d(var6, 1687107415);
                           var19.N = jk.d(var6, 1687107415);
                           var19.O = jk.d(var6, 1687107415);
                        }

                        if (var19.j == 5) {
                           var19.x = jk.d(var6, 1687107415);
                           var19.I = jk.d(var6, 1687107415);
                        }

                        if (var19.j == 6) {
                           var19.ap = 1;
                           var19.aq = var6.d();
                           if (var19.aq == 65535) {
                              var19.aq = -1;
                           }

                           var19.am = 1;
                           var19.Y = var6.d();
                           if (var19.Y == 65535) {
                              var19.Y = -1;
                           }

                           var19.at = var6.d();
                           if (var19.at == 65535) {
                              var19.at = -1;
                           }

                           var19.as = var6.d();
                           if (var19.as == 65535) {
                              var19.as = -1;
                           }

                           var19.ao = var6.d();
                           var19.ak = var6.d();
                           var19.ai = var6.d();
                        }

                        if (var19.j == 8) {
                           var19.aC = var6.p();
                        }

                        if (var19.q == 2) {
                           var19.bt = var6.p();
                           var19.ar = var6.p();
                           var7 = var6.d() & 63;
                           var19.aE |= var7 << 11;
                        }

                        if (var19.q == 1 || var19.q == 4 || var19.q == 5 || var19.q == 6) {
                           var19.Q = var6.p();
                           if (var19.Q.isEmpty()) {
                              if (var19.q == 1) {
                                 var19.Q = "Ok";
                              }

                              if (var19.q == 4) {
                                 var19.Q = "Select";
                              }

                              if (var19.q == 5) {
                                 var19.Q = "Select";
                              }

                              if (var19.q == 6) {
                                 var19.Q = "Continue";
                              }
                           }
                        }

                        if (var19.q == 1 || var19.q == 4 || var19.q == 5) {
                           var19.aE |= 4194304;
                        }

                        if (var19.q == 6) {
                           var19.aE |= 1;
                        }
                     }

                     byte[] var21;
                     if (var0.p != null && (var21 = fB.a(var0.p, var1, var3)) != null && var21.length > 0) {
                        fd.a(var4, (jk)(new jk(var21)), (byte)83);
                        var0.o.put(var4.g, var1);
                     }
                  }
               }

               for(var3 = 0; var3 < var14; ++var3) {
                  if ((var19 = var0.c[var1][var3]) != null && var19.v != -1) {
                     var4 = var0.c[var1][var19.v & '\uffff'];
                     if (var3 > var4.G) {
                        var4.G = var3;
                     }

                     if (var3 < var4.y) {
                        var4.y = var3;
                     }
                  }
               }

               m[var1] = true;
               return true;
            }
         }
      }
   }
}
