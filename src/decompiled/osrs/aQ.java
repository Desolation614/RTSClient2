package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public final class aQ extends ak {
   @ObfuscatedName("aa")
   static int[] a;
   @ObfuscatedName("aj")
   private String b;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      longValue = -4713865280900147193L
   )
   private long c;
   @ObfuscatedSignature(
      signature = "Lfp;"
   )
   private ai d;

   @ObfuscatedSignature(
      signature = "(Lfp;)V"
   )
   aQ(ai var1) {
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
      String var2 = this.b;
      long var3 = this.c;
      if (var2 != null && var2.isEmpty()) {
         var2 = null;
      }

      if (var3 > 0L != var1.x) {
         throw new RuntimeException("");
      } else if (var1.w != (var2 != null)) {
         throw new RuntimeException("");
      } else {
         if (var3 > 0L && (var1.r == null || var1.s >= var1.r.length) || var2 != null && (var1.v == null || var1.s >= var1.v.length)) {
            int var6 = var1.s + 5;
            if (var1.x) {
               if (var1.r != null) {
                  System.arraycopy(var1.r, 0, var1.r = new long[var6], 0, var1.s);
               } else {
                  var1.r = new long[var6];
               }
            }

            if (var1.w) {
               if (var1.v != null) {
                  System.arraycopy(var1.v, 0, var1.v = new String[var6], 0, var1.s);
               } else {
                  var1.v = new String[var6];
               }
            }
         }

         if (var1.r != null) {
            var1.r[var1.s] = var3;
         }

         if (var1.v != null) {
            var1.v[var1.s] = var2;
         }

         ++var1.s;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-1635342078"
   )
   final void a(jk var1) {
      if (jk.a((jk)var1, (byte)2) != 255) {
         --var1.c;
         this.c = var1.e();
      }

      this.b = var1.k();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Lps;Ljava/lang/String;Ljava/lang/String;I)[Lwd;",
      garbageValue = "1789615666"
   )
   public static iT[] a(fE var0, String var1, String var2) {
      if (!var0.b(var1, var2)) {
         return null;
      } else {
         int var3 = var0.b(var1);
         int var4 = var0.a(var3, var2);
         return hb.a(var0, var3, var4);
      }
   }

   @ObfuscatedName("mr")
   @ObfuscatedSignature(
      signature = "([Lov;IIIIIIIIIIII)V",
      garbageValue = "1932391359"
   )
   static final void a(fd[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      client.a(var0, var1, var2, var3, var4, var9, var10);
      jd.d(var5, var6, var7, var8);
      cc.k();

      label923:
      for(int var12 = var1; var12 <= var2; ++var12) {
         fd var13;
         if ((var13 = var0[var12]) != null && (var3 == var13.v && var4 == var13.M || var3 == -1412584499 && var13 == client.dO)) {
            int var14;
            if (var11 == -1) {
               client.eF[client.eC] = var9 + var13.o;
               client.eB[client.eC] = var10 + var13.k;
               client.eQ[client.eC] = var13.i * -1805166981;
               client.eP[client.eC] = var13.n * -2133353239;
               var14 = ++client.eC - 1;
            } else {
               var14 = var11;
            }

            var13.bW = var14 * -1058398199;
            var13.bT = client.Z;
            if (!var13.f || !var13.P) {
               int var27;
               if (var13.e > 0) {
                  if ((var27 = var13.e) == 324) {
                     if (client.fg == -1) {
                        client.fg = var13.x;
                        client.fo = var13.I;
                     }

                     if (client.Y.i == 1) {
                        var13.x = client.fg;
                     } else {
                        var13.x = client.fo;
                     }
                  } else if (var27 == 325) {
                     if (client.fg == -1) {
                        client.fg = var13.x;
                        client.fo = var13.I;
                     }

                     if (client.Y.i == 1) {
                        var13.x = client.fo;
                     } else {
                        var13.x = client.fg;
                     }
                  } else if (var27 == 327) {
                     var13.ak = 150;
                     var13.ai = (int)(Math.sin((double)client.Z / 40.0D) * 256.0D) & 2047;
                     var13.ap = 5;
                     var13.aq = 0;
                  } else if (var27 == 328) {
                     var13.ak = 150;
                     var13.ai = (int)(Math.sin((double)client.Z / 40.0D) * 256.0D) & 2047;
                     var13.ap = 5;
                     var13.aq = 1;
                  }
               }

               int var15 = var9 + var13.o;
               int var16 = var10 + var13.k;
               int var17 = var13.K;
               int var18;
               int var19;
               if (var13 == client.dO) {
                  if (var3 != -1412584499 && !var13.aD) {
                     ct.aH = var0;
                     gZ.a = var9;
                     ec.e = var10;
                     continue;
                  }

                  if (client.el && client.ev) {
                     var18 = gY.j;
                     var19 = gY.b;
                     var18 -= client.eg;
                     var19 -= client.dV;
                     if (var18 < client.eh) {
                        var18 = client.eh;
                     }

                     if (var18 + var13.i * -1805166981 > client.ec.i * -1805166981 + client.eh) {
                        var18 = client.ec.i * -1805166981 + client.eh - var13.i * -1805166981;
                     }

                     if (var19 < client.ex) {
                        var19 = client.ex;
                     }

                     if (var19 + var13.n * -2133353239 > client.ec.n * -2133353239 + client.ex) {
                        var19 = client.ec.n * -2133353239 + client.ex - var13.n * -2133353239;
                     }

                     var15 = var18;
                     var16 = var19;
                  }

                  if (!var13.aD) {
                     var17 = 128;
                  }
               }

               int var20;
               int var21;
               int var22;
               int var23;
               if (var13.j == 9) {
                  var20 = var15;
                  var21 = var16;
                  var22 = var15 + var13.i * -1805166981;
                  var23 = var16 + var13.n * -2133353239;
                  if (var22 < var15) {
                     var20 = var22;
                     var22 = var15;
                  }

                  if (var23 < var16) {
                     var21 = var23;
                     var23 = var16;
                  }

                  ++var22;
                  ++var23;
                  var18 = var20 > var5 ? var20 : var5;
                  var19 = var21 > var6 ? var21 : var6;
                  var20 = var22 < var7 ? var22 : var7;
                  var21 = var23 < var8 ? var23 : var8;
               } else {
                  var20 = var15 + var13.i * -1805166981;
                  var21 = var16 + var13.n * -2133353239;
                  var18 = var15 > var5 ? var15 : var5;
                  var19 = var16 > var6 ? var16 : var6;
                  var20 = var20 < var7 ? var20 : var7;
                  var21 = var21 < var8 ? var21 : var8;
               }

               if (!var13.f || var18 < var20 && var19 < var21) {
                  label1022: {
                     int var10003;
                     int var28;
                     int var29;
                     if (var13.e != 0) {
                        if (var13.e == 1336) {
                           if (jD.a(j.aS, -169090307)) {
                              var16 += 15;
                              cA.a.b("Fps:" + fs.e, var15 + var13.i * -1805166981, var16, 16776960, -1);
                              var16 += 15;
                              if (client.bX >= 2) {
                                 cA.a.b("Lps:" + fs.f, var15 + var13.i * -1805166981, var16, 16776960, -1);
                                 var16 += 15;
                              }

                              Runtime var115;
                              var21 = (int)(((var115 = Runtime.getRuntime()).totalMemory() - var115.freeMemory()) / 1024L);
                              var22 = 16776960;
                              if (var21 > 327680 && !client.bv) {
                                 var22 = 16711680;
                              }

                              cA.a.b("Mem:" + var21 + "k", var15 + var13.i * -1805166981, var16, var22, -1);
                           }
                           continue;
                        }

                        if (var13.e == 1337) {
                           client.ef = var15;
                           client.dZ = var16;
                           hv.a(var15, var16, var13.i * -1805166981, var13.n * -2133353239);
                           client.eE[var13.bW * 33779257] = true;
                           break label1022;
                        }

                        if (var13.e == 1338) {
                           ev.a(var13, var15, var16);
                           break label1022;
                        }

                        if (var13.e == 1339) {
                           dr.a(var13, var15, var16);
                           break label1022;
                        }

                        if (var13.e == 1400) {
                           ip.a(er.b, var15, var16, var13.i * -1805166981, var13.n * -2133353239, client.Z, jD.a((jD)j.aS, (byte)37));
                        }

                        if (var13.e == 1401) {
                           ip var10000 = er.b;
                           var10003 = var13.i * -1805166981;
                           var29 = var13.n * -2133353239;
                           var28 = var10003;
                           ip var25 = var10000;
                           if (var10000.D.b) {
                              label986: {
                                 if (!dq.a(var25.p, (byte)-72)) {
                                    var25.p.a(var25.l, df.d(var25.h, 268028725), client.ac);
                                    if (!dq.a(var25.p, (byte)7)) {
                                       break label986;
                                    }
                                 }

                                 dq.a(var25.p, var15, var16, var28, var29, var25.x, var25.t, var25.r);
                              }
                           }
                        }

                        if (var13.e == 1402) {
                           iS.c.a(var15, client.Z);
                        }
                     }

                     if (var13.j == 0) {
                        if (!var13.f && var13.P && var13 != bu.c) {
                           continue;
                        }

                        if (!var13.f) {
                           if (var13.D * 178093445 > var13.S - var13.n * -2133353239) {
                              var13.D = var13.S * -380832947 - var13.n * 284646677;
                           }

                           if (var13.D * 178093445 < 0) {
                              var13.D = 0;
                           }
                        }

                        a(var0, var13.y, var13.G, var13.m, var13.s * -744024149, var18, var19, var20, var21, var15 - var13.L, var16 - var13.D * 178093445, var14);
                        if (var13.bH != null) {
                           a(var13.bH, 0, var13.bH.length - 1, var13.m, -1, var18, var19, var20, var21, var15 - var13.L, var16 - var13.D * 178093445, var14);
                        }

                        jR var24;
                        if (var13.s * -744024149 == -1 && (var24 = (jR)gb.a(client.bT, (long)var13.m)) != null) {
                           aA.a(var24.d, var18, var19, var20, var21, var15, var16, var14);
                        }

                        jd.d(var5, var6, var7, var8);
                        cc.k();
                     } else if (var13.j == 11) {
                        if (var13.P && var13 != bu.c) {
                           continue;
                        }

                        if (var13.bH != null) {
                           a(var13.bH, 0, var13.bH.length - 1, var13.m, -1, var18, var19, var20, var21, var15 - var13.L, var16 - var13.D * 178093445, var14);
                        }

                        jd.d(var5, var6, var7, var8);
                        cc.k();
                     }

                     if (!client.aT && !client.eN[var14] && client.eD <= 1) {
                        continue;
                     }

                     if (var13.j == 0 && !var13.f && var13.S > var13.n * -2133353239) {
                        aT.a(var15 + var13.i * -1805166981, var16, var13.D * 178093445, var13.n * -2133353239, var13.S);
                     }

                     if (var13.j == 1) {
                        continue;
                     }

                     if (var13.j == 3) {
                        if (jS.a(var13)) {
                           var20 = var13.U;
                           if (var13 == bu.c && var13.O != 0) {
                              var20 = var13.O;
                           }
                        } else {
                           var20 = var13.R;
                           if (var13 == bu.c && var13.N != 0) {
                              var20 = var13.N;
                           }
                        }

                        if (var13.A) {
                           switch(var13.C.d) {
                           case 1:
                              jd.d(var15, var16, var13.i * -1805166981, var13.n * -2133353239, var13.R, var13.U);
                              continue;
                           case 2:
                              jd.b(var15, var16, var13.i * -1805166981, var13.n * -2133353239, var13.R, var13.U, 255 - (var13.K & 255), 255 - (var13.z & 255));
                              continue;
                           default:
                              if (var17 == 0) {
                                 jd.h(var15, var16, var13.i * -1805166981, var13.n * -2133353239, var20);
                              } else {
                                 jd.c(var15, var16, var13.i * -1805166981, var13.n * -2133353239, var20, 256 - (var17 & 255));
                              }
                           }
                        } else if (var17 == 0) {
                           jd.g(var15, var16, var13.i * -1805166981, var13.n * -2133353239, var20);
                        } else {
                           jd.e(var15, var16, var13.i * -1805166981, var13.n * -2133353239, var20, 256 - (var17 & 255));
                        }
                        continue;
                     }

                     if (var13.j == 4) {
                        gp var114;
                        if ((var114 = var13.a(jD.a)) == null) {
                           if (fd.a) {
                              gs.a(var13);
                           }
                           continue;
                        }

                        String var79 = var13.aC;
                        if (jS.a(var13)) {
                           var21 = var13.U;
                           if (var13 == bu.c && var13.O != 0) {
                              var21 = var13.O;
                           }

                           if (!var13.bu.isEmpty()) {
                              var79 = var13.bu;
                           }
                        } else {
                           var21 = var13.R;
                           if (var13 == bu.c && var13.N != 0) {
                              var21 = var13.N;
                           }
                        }

                        if (var13.f && var13.bJ != -1) {
                           bC var98;
                           if ((var79 = (var98 = cE.a(var13.bJ)).k) == null) {
                              var79 = "null";
                           }

                           if ((var98.C == 1 || var13.bG != 1) && var13.bG != -1) {
                              var79 = dz.a(16748608) + var79 + "</col> x" + n.b(var13.bG);
                           }
                        }

                        if (var13 == client.bY) {
                           var79 = "Please wait...";
                           var21 = var13.R;
                        }

                        if (!var13.f) {
                           var79 = aY.a(var79, var13);
                        }

                        gw.a(var114, var79, var15, var16, var13.i * -1805166981, var13.n * -2133353239, var21, var13.aG ? 0 : -1, hY.a(var13.K), var13.aK, var13.aB, var13.aa);
                        continue;
                     }

                     int var10004;
                     int var30;
                     int var96;
                     int var109;
                     if (var13.j == 5) {
                        iT var97;
                        if (!var13.f) {
                           if ((var97 = var13.a(jD.a, jS.a(var13), aE.a)) != null) {
                              var97.a(var15, var16);
                           } else if (fd.a) {
                              gs.a(var13);
                           }
                           continue;
                        }

                        if (var13.bJ != -1) {
                           var97 = ji.a(var13.bJ, var13.bG, var13.ag, var13.W, var13.au, false);
                        } else {
                           var97 = var13.a(jD.a, false, aE.a);
                        }

                        if (var97 == null) {
                           if (fd.a) {
                              gs.a(var13);
                           }
                           continue;
                        }

                        var21 = var97.g;
                        var22 = var97.f;
                        if (!var13.H) {
                           var23 = var13.i * 1969729536 / var21;
                           if (var13.w != 0) {
                              var97.b(var15 + var13.i * -1805166981 / 2, var16 + var13.n * -2133353239 / 2, var13.w, var23);
                              continue;
                           }

                           if (var17 != 0) {
                              var10003 = var13.i * -1805166981;
                              var10004 = var13.n * -2133353239;
                              var14 = 256 - (var17 & 255);
                              var29 = var10004;
                              var28 = var10003;
                              var27 = var16;
                              var96 = var15;
                              if (var28 > 0 && var29 > 0) {
                                 var18 = var97.a;
                                 var19 = var97.e;
                                 var15 = 0;
                                 var20 = 0;
                                 var17 = var97.g;
                                 int var116 = var97.f;
                                 int var47 = (var17 << 16) / var28;
                                 var21 = (var116 << 16) / var29;
                                 if (var97.d > 0) {
                                    var22 = (var47 + (var97.d << 16) - 1) / var47;
                                    var96 += var22;
                                    var15 = 0 + (var22 * var47 - (var97.d << 16));
                                 }

                                 if (var97.c > 0) {
                                    var22 = (var21 + (var97.c << 16) - 1) / var21;
                                    var27 = var16 + var22;
                                    var20 = 0 + (var22 * var21 - (var97.c << 16));
                                 }

                                 if (var18 < var17) {
                                    var28 = (var47 + ((var18 << 16) - var15) - 1) / var47;
                                 }

                                 if (var19 < var116) {
                                    var29 = (var21 + ((var19 << 16) - var20) - 1) / var21;
                                 }

                                 var22 = var96 + var27 * jd.i;
                                 var109 = jd.i - var28;
                                 if (var27 + var29 > jd.k) {
                                    var29 -= var27 + var29 - jd.k;
                                 }

                                 if (var27 < jd.l) {
                                    var30 = jd.l - var27;
                                    var29 -= var30;
                                    var22 += var30 * jd.i;
                                    var20 += var21 * var30;
                                 }

                                 if (var28 + var96 > jd.m) {
                                    var30 = var28 + var96 - jd.m;
                                    var28 -= var30;
                                    var109 += var30;
                                 }

                                 if (var96 < jd.n) {
                                    var30 = jd.n - var96;
                                    var28 -= var30;
                                    var22 += var30;
                                    var15 += var47 * var30;
                                    var109 += var30;
                                 }

                                 iT.a(jd.h, var97.b, var15, var20, var22, var109, var28, var29, var47, var21, var18, var14);
                              }
                              continue;
                           }

                           if (var21 == var13.i * -1805166981 && var22 == var13.n * -2133353239) {
                              var97.a(var15, var16);
                              continue;
                           }

                           var97.a(var15, var16, var13.i * -1805166981, var13.n * -2133353239);
                           continue;
                        }

                        jd.e(var15, var16, var15 + var13.i * -1805166981, var16 + var13.n * -2133353239);
                        var23 = (var21 - 1 + var13.i * -1805166981) / var21;
                        var109 = (var13.n * -2133353239 + (var22 - 1)) / var22;

                        for(var14 = 0; var14 < var23; ++var14) {
                           for(var18 = 0; var18 < var109; ++var18) {
                              if (var13.w != 0) {
                                 var97.b(var21 / 2 + var15 + var21 * var14, var22 / 2 + var16 + var18 * var22, var13.w, 4096);
                              } else if (var17 != 0) {
                                 iT.a(var97, var15 + var21 * var14, var16 + var18 * var22, 256 - (var17 & 255));
                              } else {
                                 var97.a(var15 + var14 * var21, var16 + var18 * var22);
                              }
                           }
                        }

                        jd.d(var5, var6, var7, var8);
                        continue;
                     }

                     if (var13.j == 6) {
                        boolean var76;
                        if (var76 = jS.a(var13)) {
                           var21 = var13.as;
                        } else {
                           var21 = var13.at;
                        }

                        cn var102 = null;
                        var23 = 0;
                        if (var13.bJ != -1) {
                           bC var99;
                           if ((var99 = cE.a(var13.bJ)) != null) {
                              if ((var102 = bC.a((bC)var99, var13.bG, (byte)51).a(1)) != null) {
                                 var102.a();
                                 var23 = var102.aI / 2;
                              } else {
                                 gs.a(var13);
                              }
                           }
                        } else if (var13.ap == 5) {
                           if (var13.aq == 0) {
                              var102 = eY.a(client.Y, (bP)null, -1, (bP)null, -1);
                           } else {
                              var102 = ai.a.k();
                           }
                        } else if (var13.ap == 7) {
                           var102 = eY.a(var13.X, (bP)null, -1, az.a(ai.a.K), ai.a.B);
                        } else {
                           aY var101 = null;
                           br var92 = null;
                           if (var13.ap == 6) {
                              kc var73;
                              if ((var18 = var13.aq) >= 0 && (var73 = (kc)aM.a.g.a((long)var18)) != null && var73.aQ != null) {
                                 if ((var101 = var73.aQ).B != null) {
                                    var101 = var101.a();
                                 }

                                 var92 = kc.a(var73, (byte)0);
                              }
                           } else if (var13.ap == 2 && (var101 = B.a(var13.aq)).B != null) {
                              var101 = var101.a();
                           }

                           bP var75 = null;
                           var19 = -1;
                           if (var21 != -1) {
                              var75 = az.a(var21);
                              var19 = var13.bz;
                           }

                           eY var77 = ai.a.aV;
                           var28 = var19;
                           eu var100 = jD.a;
                           fd.a = false;
                           if (var76) {
                              var20 = var13.am;
                              var17 = var13.Y;
                           } else {
                              var20 = var13.ap;
                              var17 = var13.aq;
                           }

                           cn var124;
                           if (var20 == 0) {
                              var124 = null;
                           } else if (var20 == 1 && var17 == -1) {
                              var124 = null;
                           } else {
                              label1017: {
                                 if (var92 != null && var92.d && var20 == 6) {
                                    var20 = 3;
                                 }

                                 long var46 = (long)(var17 + (var20 << 16));
                                 if (var20 == 2 || var20 == 6) {
                                    if (var101 == null) {
                                       var124 = null;
                                       break label1017;
                                    }

                                    var46 = (long)(var101.e + (var20 << 16));
                                 }

                                 if (var92 != null) {
                                    var46 |= var92.f << 20;
                                 }

                                 cn var104;
                                 if ((var104 = (cn)dX.a(var100.h, var46)) == null) {
                                    class243 var108 = null;
                                    var109 = 64;
                                    var30 = 768;
                                    switch(var20) {
                                    case 1:
                                       var108 = class243.a(var100.i, var17, 0);
                                       break;
                                    case 2:
                                       var108 = aY.a(var101, (br)null, -2119011705);
                                       break;
                                    case 3:
                                       class243 var121;
                                       if (var77 != null) {
                                          if ((var77 = var77).k != -1) {
                                             var121 = aY.a(B.a(var77.k), (br)null, -1963833838);
                                          } else {
                                             boolean var84 = false;

                                             int var66;
                                             int var67;
                                             bC var111;
                                             bC var122;
                                             for(var19 = 0; var19 < 12; ++var19) {
                                                var17 = var77.n[var19];
                                                bk var105;
                                                if (eY.a(var77, var17) && (var105 = eY.a(var77, var17, (byte)101)) != null && !bk.a(var105, 1987932031)) {
                                                   var84 = true;
                                                }

                                                if (eY.b(var17)) {
                                                   aC var106 = var77.m == null ? null : var77.m[var19];
                                                   var122 = eY.c(var17);
                                                   var20 = var77.i;
                                                   var111 = var122;
                                                   var66 = var122.V * -4778767;
                                                   var67 = var111.M;
                                                   if (var20 == 1) {
                                                      var66 = var111.O;
                                                      var67 = var111.R;
                                                   }

                                                   if (var106 != null && var106.a(var20)) {
                                                      var66 = aC.a(var106, var20);
                                                   }

                                                   boolean var123;
                                                   if (var66 == -1) {
                                                      var123 = true;
                                                   } else {
                                                      boolean var68 = true;
                                                      if (!gA.a.b(var66, 0)) {
                                                         var68 = false;
                                                      }

                                                      if (var67 != -1 && !gA.a.b(var67, 0)) {
                                                         var68 = false;
                                                      }

                                                      var123 = var68;
                                                   }

                                                   if (!var123) {
                                                      var84 = true;
                                                   }
                                                }
                                             }

                                             if (var84) {
                                                var121 = null;
                                             } else {
                                                class243[] var95 = new class243[12];
                                                var17 = 0;

                                                for(var21 = 0; var21 < 12; ++var21) {
                                                   var20 = var77.n[var21];
                                                   if (eY.a(var77, var20)) {
                                                      bk var86 = eY.a(var77, var20, (byte)55);
                                                      var108 = null;
                                                      if (var86 != null) {
                                                         bk var113 = var86;
                                                         class243[] var117 = new class243[5];
                                                         int var65 = 0;

                                                         for(var66 = 0; var66 < 5; ++var66) {
                                                            if (var113.d[var66] != -1) {
                                                               var117[var65++] = class243.a(jO.a, var113.d[var66], 0);
                                                            }
                                                         }

                                                         class243 var118 = new class243(var117, var65);
                                                         if (var113.g != null) {
                                                            for(var67 = 0; var67 < var113.g.length; ++var67) {
                                                               var118.b(var113.g[var67], var113.f[var67]);
                                                            }
                                                         }

                                                         if (var113.i != null) {
                                                            for(var67 = 0; var67 < var113.i.length; ++var67) {
                                                               hL.a(var118, var113.i[var67], var113.h[var67]);
                                                            }
                                                         }

                                                         var108 = var118;
                                                      }

                                                      if (var108 != null) {
                                                         var95[var17++] = var108;
                                                      }
                                                   }

                                                   if (eY.b(var20)) {
                                                      aC var89 = var77.m == null ? null : var77.m[var21];
                                                      var122 = eY.c(var20);
                                                      var20 = var77.i;
                                                      var111 = var122;
                                                      var66 = var122.V * -4778767;
                                                      var67 = var111.M;
                                                      if (var20 == 1) {
                                                         var66 = var111.O;
                                                         var67 = var111.R;
                                                      }

                                                      if (var89 != null && var89.a(var20)) {
                                                         var66 = aC.a(var89, var20);
                                                      }

                                                      if (var66 == -1) {
                                                         var121 = null;
                                                      } else {
                                                         class243 var119 = class243.a(gA.a, var66, 0);
                                                         if (var67 != -1) {
                                                            class243 var69 = class243.a(gA.a, var67, 0);
                                                            class243[] var70 = new class243[]{var119, var69};
                                                            var119 = new class243(var70, 2);
                                                         }

                                                         bC.a(var111, var119, var89, (byte)1);
                                                         var121 = var119;
                                                      }

                                                      var108 = var121;
                                                      if (var121 != null) {
                                                         var95[var17++] = var108;
                                                      }
                                                   }
                                                }

                                                class243 var107 = new class243(var95, var17);

                                                for(var20 = 0; var20 < 5; ++var20) {
                                                   if (var77.l[var20] < eY.d[var20].length) {
                                                      var107.b(eY.g[var20], eY.d[var20][var77.l[var20]]);
                                                   }

                                                   if (var77.l[var20] < eY.b[var20].length) {
                                                      var107.b(eY.e[var20], eY.b[var20][var77.l[var20]]);
                                                   }
                                                }

                                                var121 = var107;
                                             }
                                          }
                                       } else {
                                          var121 = null;
                                       }

                                       var108 = var121;
                                       break;
                                    case 4:
                                       bC var78;
                                       var108 = (var78 = cE.a(var17)).b(10);
                                       var109 = 64 + var78.J;
                                       var30 = 768 + var78.D;
                                    case 5:
                                    default:
                                       break;
                                    case 6:
                                       var108 = aY.a(var101, var92, -1942143693);
                                    }

                                    if (var108 == null) {
                                       fd.a = true;
                                       var124 = null;
                                       break label1017;
                                    }

                                    var104 = var108.a(var109, var30, -50, -10, -50);
                                    var100.h.a((im)var104, var46);
                                 }

                                 if (var75 != null) {
                                    if (!var75.b()) {
                                       cl var112 = da.a((var19 = var75.p[var19]) >> 16);
                                       var19 &= 65535;
                                       if (var112 == null) {
                                          var124 = cn.a(var104, true);
                                       } else {
                                          cl var110 = null;
                                          var22 = 0;
                                          if (var75.n != null && var28 < var75.n.length) {
                                             var110 = da.a((var22 = var75.n[var28]) >> 16);
                                             var22 &= 65535;
                                          }

                                          cn var91;
                                          if (var110 != null && var22 != 65535) {
                                             (var91 = cn.a(var104, !var112.a(var19) & !var110.a(var22))).a(var112, var19);
                                             var91.a(var110, var22);
                                             var124 = var91;
                                          } else {
                                             (var91 = cn.a(var104, !var112.a(var19))).a(var112, var19);
                                             var124 = var91;
                                          }
                                       }
                                    } else {
                                       var124 = var75.a(var104, var19);
                                    }

                                    var104 = var124;
                                 }

                                 var124 = var104;
                              }
                           }

                           var102 = var124;
                           if (var124 == null && fd.a) {
                              gs.a(var13);
                           }
                        }

                        cc.a(var15 + var13.i * -1805166981 / 2, var13.n * -2133353239 / 2 + var16);
                        var109 = cc.b[var13.ak] * var13.ao >> 16;
                        var14 = cc.a[var13.ak] * var13.ao >> 16;
                        if (var102 != null) {
                           cc.a(false);
                           if (!var13.f) {
                              var102.a(0, var13.ai, 0, var13.ak, 0, var109, var14);
                           } else {
                              var102.a();
                              if (var13.ae) {
                                 jd.a(var102, 0, var13.ai, var13.ab, var13.ak, var13.ah, var23 + var109 + var13.ad, var14 + var13.ad, var13.ao);
                              } else {
                                 var102.a(0, var13.ai, var13.ab, var13.ak, var13.ah, var109 + var23 + var13.ad, var14 + var13.ad);
                              }
                           }
                        }

                        cc.i();
                        continue;
                     }

                     gp var74;
                     if (var13.j == 8) {
                        if (var13 != eI.e || client.dQ != client.dY) {
                           continue;
                        }

                        var20 = 0;
                        var21 = 0;
                        var74 = cA.a;

                        String var87;
                        String var90;
                        for(var90 = aY.a(var13.aC, var13); !var90.isEmpty(); var21 = var21 + var74.c + 1) {
                           if ((var14 = var90.indexOf("<br>")) != -1) {
                              var87 = var90.substring(0, var14);
                              var90 = var90.substring(var14 + 4);
                           } else {
                              var87 = var90;
                              var90 = "";
                           }

                           if ((var18 = var74.a(var87)) > var20) {
                              var20 = var18;
                           }
                        }

                        var20 += 6;
                        var21 += 7;
                        var14 = var15 + var13.i * -1805166981 - 5 - var20;
                        var18 = var16 + var13.n * -2133353239 + 5;
                        if (var14 < var15 + 5) {
                           var14 = var15 + 5;
                        }

                        if (var20 + var14 > var7) {
                           var14 = var7 - var20;
                        }

                        if (var21 + var18 > var8) {
                           var18 = var8 - var21;
                        }

                        jd.h(var14, var18, var20, var21, 16777120);
                        jd.g(var14, var18, var20, var21, 0);
                        var90 = var13.aC;
                        var19 = var18 + var74.c + 2;
                        var90 = aY.a(var90, var13);

                        while(true) {
                           if (var90.isEmpty()) {
                              continue label923;
                           }

                           if ((var20 = var90.indexOf("<br>")) != -1) {
                              var87 = var90.substring(0, var20);
                              var90 = var90.substring(var20 + 4);
                           } else {
                              var87 = var90;
                              var90 = "";
                           }

                           var74.a(var87, var14 + 3, var19, 0, -1);
                           var19 = var19 + var74.c + 1;
                        }
                     }

                     if (var13.j == 9) {
                        if (var13.E) {
                           var20 = var15;
                           var21 = var16 + var13.n * -2133353239;
                           var22 = var15 + var13.i * -1805166981;
                           var23 = var16;
                        } else {
                           var20 = var15;
                           var21 = var16;
                           var22 = var15 + var13.i * -1805166981;
                           var23 = var16 + var13.n * -2133353239;
                        }

                        if (var13.J == 1) {
                           jd.l(var20, var21, var22, var23, var13.R);
                        } else {
                           aa.a(var20, var21, var22, var23, var13.R, var13.J);
                        }
                        continue;
                     }

                     if (var13.j != 12) {
                        continue;
                     }

                     eK var83 = fd.b(var13, -212956636);
                     el var85 = var13.a();
                     if (var83 == null || var85 == null || !var83.h || (var74 = var13.a(jD.a)) == null) {
                        continue;
                     }

                     jz var120 = client.eJ;
                     int var10001 = var15;
                     var10003 = var13.i * -1805166981;
                     var10004 = var13.n * -2133353239;
                     int var10005 = eK.c(var83, -1541480169);
                     int var10006 = eK.a(var83, (byte)-88);
                     int var10007 = var83.p;
                     int var10008 = eK.a(var83, (short)22090);
                     boolean var26 = true;
                     if (var83 == null) {
                        boolean var10009;
                        if (var83.f.b > 1) {
                           var10009 = true;
                        } else {
                           var10009 = false;
                        }
                     }

                     boolean var81 = var83.g && var83.u * -413217807 % 60 < 30;
                     var15 = var10008;
                     var19 = var10007;
                     var18 = var10006;
                     var14 = var10005;
                     var29 = var10004;
                     var28 = var10003;
                     var96 = var10001;
                     jz var93 = var120;
                     var120.f = var96;
                     var93.i = var16;
                     var93.e = var28;
                     var93.g = var29;
                     var93.b = var14;
                     var93.a = var18 * -1818627295;
                     var93.h = var19;
                     var93.d = var15 * 1392395843;
                     var93.c = var81;
                     var23 = var13.aG ? var13.W : -1;
                     if (!var83.g && gv.f(var83.f, 1778849672)) {
                        client.eJ.a(var85.d, var23, var85.b, var85.c);
                        jz.a(client.eJ, var83.b, var74, (byte)11);
                     } else {
                        client.eJ.a(var13.R, var23, var85.b, var85.c);
                        jz.a(client.eJ, var83.f, var74, (byte)-38);
                     }
                  }

                  jd.d(var5, var6, var7, var8);
               }
            }
         }
      }

      client.a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @ObfuscatedName("oc")
   @ObfuscatedSignature(
      signature = "(Lov;B)Z",
      garbageValue = "0"
   )
   static boolean a(fd var0) {
      return var0.P;
   }
}
