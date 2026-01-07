package osrs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public final class bn implements fN {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lhr;"
   )
   static final bn a = new bn(2, 1);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lhr;"
   )
   static final bn b = new bn(0, 2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lhr;"
   )
   static final bn c = new bn(1, 0);
   @ObfuscatedName("kp")
   @ObfuscatedSignature(
      signature = "Lpu;"
   )
   static fE d;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1202097001
   )
   public final int e;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -46270567
   )
   private int f;

   private bn(int var1, int var2) {
      this.e = var1;
      this.f = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.f;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "163"
   )
   static final int b() {
      return cf.b;
   }

   @ObfuscatedName("mz")
   @ObfuscatedSignature(
      signature = "([Lov;IIIIIIIIIIB)V",
      garbageValue = "-4"
   )
   static final void a(fd[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      client.b(var0, var1, var2, var3, var4, var9, var10);

      for(var1 = var1; var1 <= var2; ++var1) {
         fd var11;
         if ((var11 = var0[var1]) != null && var3 == var11.v && var4 == var11.M && (!var11.f || var11.j == 0 || var11.j == 11 || var11.aO || var11.e == 1338 || var11.j == 12 || ck.a(var11) != 0 || fh.a(var11) != 0 || var11 == client.ec)) {
            if (var11.f) {
               if (aQ.a(var11)) {
                  continue;
               }
            } else if (var11.j == 0 && var11 != bu.c && aQ.a(var11)) {
               continue;
            }

            int var12;
            boolean var10000;
            eu var22;
            int var30;
            int var60;
            int var63;
            if (var11.j == 11) {
               u var24 = aE.a;
               var22 = jD.a;
               if (var11.j == 11 && var11.ca != null) {
                  label975: {
                     bS var25;
                     switch((var25 = var11.ca).f * 211326051) {
                     case 0:
                        bS.a(var25, var24, 1587902701);
                        break;
                     case 1:
                        bS.a(var25, -985247295);
                     }

                     if (var11.ca.f * 211326051 != var11.bZ) {
                        var11.bZ = var11.ca.f * 211326051;
                        if (var11.bZ >= 3) {
                           var10000 = true;
                           break label975;
                        }

                        if (var11.bZ == 2) {
                           eu var26 = var22;
                           fd var47 = var11;
                           var11.bY = true;
                           bS var75 = var11.ca;
                           boolean var28 = true;
                           bS var29 = var75;
                           ArrayList var59 = var75 == null ? var29.g.j : var29.g.j;
                           ArrayList var61 = var11.ca.g.f;
                           var12 = var59.size() + var61.size();
                           var11.bH = new fd[var12];
                           var30 = 0;

                           Iterator var31;
                           fd var32;
                           for(var31 = var59.iterator(); var31.hasNext(); var47.bH[var30++] = var32) {
                              bF var27 = (bF)var31.next();
                              (var32 = be.a(5, var47, var30, 0, 0, 0, 0, var27.b)).aI = G.a(var27.c, (byte)-94);
                              eR var33 = new eR(var27.c);
                              var26.e.a(var32.aI, var33);
                           }

                           for(var31 = var61.iterator(); var31.hasNext(); var47.bH[var30++] = var32) {
                              bQ var55 = (bQ)var31.next();
                              (var32 = be.a(4, var47, var30, 0, 0, 0, 0, var55.d)).aC = var55.c;
                              var32.aj = (Integer)var47.cc.get(var55.b);
                              var32.aK = var55.a;
                              var32.aB = var55.e;
                           }

                           var10000 = true;
                           break label975;
                        }
                     }

                     var10000 = false;
                  }
               } else {
                  var10000 = false;
               }

               if (var10000) {
                  if (var11.c()) {
                     gs.a(var11);
                     aP.a(var11.bH, var11, true, (byte)3);
                     var11.ca.d.a(3, var11.ca.g.e);
                  }

                  if (var11.aV != null) {
                     jK var34;
                     (var34 = new jK()).j = var11;
                     var34.g = var11.aV;
                     fU.a((fU)client.cf, var34);
                  }
               }
            } else if (var11.j == 12) {
               var22 = jD.a;
               eK var48;
               if ((var48 = fd.b(var11, 945049450)) == null) {
                  var10000 = false;
               } else {
                  boolean var51 = false;
                  if (!var48.h && var11.aj != -1) {
                     int var56 = eK.c(var48, 519136006);
                     var60 = eK.a(var48, (byte)-110);
                     var63 = eK.a(var48, (short)-18227);
                     var12 = var48.p;
                     gp var66;
                     if ((var66 = var11.a(var22)) != null) {
                        boolean var72 = !var48.h;
                        gv.a(var48.f, var66, 693246299);
                        gv.a(var48.b, var66, 875734280);
                        var48.h = true;
                        var72 = var72 | eK.a(var48, var48.i * 260151395, var48.o * -511517567) | var48.b(var48.t, var48.p);
                        if (var48.d()) {
                           var48.k();
                           var72 = true;
                        }

                        var51 = (var51 = false | var72) | var11.a(var48) | eK.a(var48, var56, var60) | var48.b(var63, var12);
                     }
                  } else if (var48.h) {
                     var51 = false | var11.a(var48);
                  }

                  boolean var70 = true;
                  if (var48 == null) {
                     var48.b();
                  }

                  var48.u = (var48.u * -413217807 + 1) % 60 * -2147171055;
                  if (var48.e > 0) {
                     --var48.e;
                  }

                  var10000 = var51;
               }

               if (var10000) {
                  gs.a(var11);
               }
            }

            var12 = var9 + var11.o;
            int var13 = var10 + var11.k;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var11.j == 9) {
               var16 = var12;
               var18 = var13;
               var19 = var12 + var11.i * -1805166981;
               int var20 = var13 + var11.n * -2133353239;
               if (var19 < var12) {
                  var16 = var19;
                  var19 = var12;
               }

               if (var20 < var13) {
                  var18 = var20;
                  var20 = var13;
               }

               ++var19;
               ++var20;
               var14 = var16 > var5 ? var16 : var5;
               var15 = var18 > var6 ? var18 : var6;
               var16 = var19 < var7 ? var19 : var7;
               var17 = var20 < var8 ? var20 : var8;
            } else {
               var16 = var12 + var11.i * -1805166981;
               var18 = var13 + var11.n * -2133353239;
               var14 = var12 > var5 ? var12 : var5;
               var15 = var13 > var6 ? var13 : var6;
               var16 = var16 < var7 ? var16 : var7;
               var17 = var18 < var8 ? var18 : var8;
            }

            if (var11 == client.dO) {
               client.eu = true;
               client.er = var12;
               client.ej = var13;
            }

            boolean var36 = false;
            if (var11.av) {
               switch(client.bV) {
               case 0:
                  var36 = true;
               case 1:
               default:
                  break;
               case 2:
                  if (client.bZ == var11.m >>> 16) {
                     var36 = true;
                  }
                  break;
               case 3:
                  if (var11.m == client.bZ) {
                     var36 = true;
                  }
               }
            }

            if (var36 || !var11.f || var14 < var16 && var15 < var17) {
               if (var11.f) {
                  jK var21;
                  if (var11.bY) {
                     if (gY.j >= var14 && gY.b >= var15 && gY.j < var16 && gY.b < var17) {
                        for(var21 = (jK)fU.e(client.cf); var21 != null; var21 = (jK)fU.b(client.cf)) {
                           if (var21.k) {
                              gk.a(var21);
                              var21.j.bv = false;
                           }
                        }

                        for(cH var39 = (cH)fU.e(client.co); var39 != null; var39 = (cH)fU.b(client.co)) {
                           gk.a(var39);
                        }

                        if (t.a == 0) {
                           client.dO = null;
                           client.ec = null;
                        }

                        if (!client.dP) {
                           iB.a();
                        }
                     }
                  } else if (var11.bR && gY.j >= var14 && gY.b >= var15 && gY.j < var16 && gY.b < var17) {
                     for(var21 = (jK)fU.e(client.cf); var21 != null; var21 = (jK)fU.b(client.cf)) {
                        if (var21.k && var21.j.bI == var21.g) {
                           gk.a(var21);
                        }
                     }
                  }
               }

               int var76 = gY.j;
               var76 = gY.b;
               var18 = client.H();
               var19 = client.U();
               boolean var38 = var18 >= var14 && var19 >= var15 && var18 < var16 && var19 < var17;
               if (var11.e == 1337) {
                  if (!client.bk && !client.dP && var38) {
                     m.a(var18, var19, var14, var15);
                  }
               } else if (var11.e == 1338) {
                  aP.a(var11, var12, var13);
               } else {
                  int var41;
                  int var43;
                  if (var11.e == 1400) {
                     ip var77 = er.b;
                     int var10006 = var11.i * -1805166981;
                     var63 = var11.n * -2133353239;
                     var60 = var10006;
                     var43 = gY.b;
                     var41 = gY.j;
                     ip var23 = var77;
                     if (var77.D.b) {
                        if (gq.a != null) {
                           var23.w = var23.s;
                        } else {
                           if (var23.w < var23.s) {
                              var23.w = Math.min(var23.s, var23.w + var23.w / 30.0F);
                           }

                           if (var23.w > var23.s) {
                              var23.w = Math.max(var23.s, var23.w - var23.w / 30.0F);
                           }
                        }

                        int var68;
                        if (ip.a(var23, -2000685757)) {
                           var68 = var23.B - var23.v;
                           int var71 = var23.y - var23.u;
                           if (var68 != 0) {
                              var68 /= Math.min(8, Math.abs(var68));
                           }

                           if (var71 != 0) {
                              var71 /= Math.min(8, Math.abs(var71));
                           }

                           var23.a(var68 + var23.v, var71 + var23.u, true);
                           if (var23.v == var23.B && var23.y == var23.u) {
                              var23.B = -1;
                              var23.y = -1;
                           }
                        }

                        if (var38) {
                           var30 = (int)Math.ceil((double)((float)var60 / var23.w));
                           var68 = (int)Math.ceil((double)((float)var63 / var23.w));
                           List var73 = var23.p.a(var23.v - var30 / 2 - 1, var23.u - var68 / 2 - 1, var30 / 2 + var23.v + 1, var68 / 2 + var23.u + 1, var12, var13, var60, var63, var41, var43);
                           HashSet var58 = new HashSet();

                           Object[] var50;
                           byte var52;
                           jK var62;
                           dz var65;
                           dH var69;
                           Iterator var74;
                           for(var74 = var73.iterator(); var74.hasNext(); fW.a(var62)) {
                              var65 = (dz)var74.next();
                              var58.add(var65);
                              var62 = new jK();
                              var69 = new dH(var65.b(), var65.e, var65.b);
                              var50 = new Object[]{var69, var41, var43};
                              var62.g = var50;
                              if (var23.o.contains(var65)) {
                                 var52 = 17;
                                 var62.c = var52;
                              } else {
                                 var52 = 15;
                                 var62.c = var52;
                              }
                           }

                           var74 = var23.o.iterator();

                           while(var74.hasNext()) {
                              var65 = (dz)var74.next();
                              if (!var58.contains(var65)) {
                                 var62 = new jK();
                                 var69 = new dH(var65.b(), var65.e, var65.b);
                                 var50 = new Object[]{var69, var41, var43};
                                 var62.g = var50;
                                 var52 = 16;
                                 var62.c = var52;
                                 fW.a(var62);
                              }
                           }

                           var23.o = var58;
                        }
                     }
                  }

                  if (!client.dP && var38) {
                     if (var11.e == 1400) {
                        ip.a(er.b, var12, var13, var11.i * -1805166981, var11.n * -2133353239, var18, var19, (byte)29);
                     } else {
                        x.a(var11);
                     }
                  }

                  int var40;
                  if (var36) {
                     for(var41 = 0; var41 < var11.aN.length; ++var41) {
                        var36 = false;
                        boolean var42 = false;
                        if (var11.aN[var41] != null) {
                           for(var40 = 0; var40 < var11.aN[var41].length; ++var40) {
                              boolean var46 = false;
                              if (var11.bX != null) {
                                 var46 = client.aU.c(var11.aN[var41][var40]);
                              }

                              if (eV.a(var11.aN[var41][var40]) || var46) {
                                 var36 = true;
                                 if (var11.bX != null && var11.bX[var41] > client.Z) {
                                    break;
                                 }

                                 byte var49;
                                 if ((var49 = var11.az[var41][var40]) == 0 || ((var49 & 8) == 0 || !client.aU.c(86) && !client.aU.c(82) && !client.aU.c(81)) && ((var49 & 2) == 0 || client.aU.c(86)) && ((var49 & 1) == 0 || client.aU.c(82)) && ((var49 & 4) == 0 || client.aU.c(81))) {
                                    var42 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var42) {
                           if (var41 < 10) {
                              bj.a(var41 + 1, var11.m, var11.s * -744024149, var11.bJ, "");
                           } else if (var41 == 10) {
                              dr.e();
                              is.a(var11.m, var11.s * -744024149, ck.a(var11) >> 11 & 63, var11.bJ);
                              if ((client.dN = dW.a(var11)) == null) {
                                 client.dN = "null";
                              }

                              String var78 = var11.ac;
                              client.dR = var78 + dz.a(16777215);
                           }

                           var40 = var11.aP[var41];
                           if (var11.bX == null) {
                              var11.bX = new int[var11.aN.length];
                           }

                           if (var11.aH == null) {
                              var11.aH = new int[var11.aN.length];
                           }

                           if (var40 != 0) {
                              if (var11.bX[var41] == 0) {
                                 var11.bX[var41] = var40 + client.Z + var11.aH[var41];
                              } else {
                                 var11.bX[var41] = var40 + client.Z;
                              }
                           } else {
                              var11.bX[var41] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var36 && var11.bX != null) {
                           var11.bX[var41] = 0;
                        }
                     }
                  }

                  jK var45;
                  if (var11.f) {
                     boolean var44 = false;
                     var38 = client.b(var14, var15, var16, var17);
                     if ((gY.h == 1 || !I.b && gY.h == 4) && var38) {
                        var44 = true;
                     }

                     var36 = false;
                     if ((gY.k == 1 || !I.b && gY.k == 4) && gY.g >= var14 && gY.f >= var15 && gY.g < var16 && gY.f < var17) {
                        var36 = true;
                     }

                     if (var36) {
                        al.a(var11, gY.g - var12, gY.f - var13);
                     }

                     if (var11.j == 11 || var11.j == 12) {
                        if (var36) {
                           fU.a((fU)client.co, new cH(0, gY.j - var12, gY.b - var13, var11));
                        }

                        if (var44) {
                           fU.a((fU)client.co, new cH(1, gY.j - var12, gY.b - var13, var11));
                        }
                     }

                     if (var11.e == 1400) {
                        ip.a(er.b, var18, var19, var38 & var44, var38 & var36, (byte)5);
                     }

                     if (client.dO != null && var11 != client.dO && var38 && bJ.b(ck.a(var11))) {
                        client.ei = var11;
                     }

                     if (var11 == client.ec) {
                        client.ev = true;
                        client.eh = var12;
                        client.ex = var13;
                     }

                     if (var11.aO) {
                        if (var38 && client.ci != 0 && var11.bI != null) {
                           (var45 = new jK()).k = true;
                           var45.j = var11;
                           var45.h = client.ci;
                           var45.g = var11.bI;
                           fU.a((fU)client.cf, var45);
                        }

                        if (client.dO != null || client.dP) {
                           var36 = false;
                           var44 = false;
                           var38 = false;
                        }

                        if (!var11.bK && var36) {
                           var11.bK = true;
                           if (var11.ba != null) {
                              (var45 = new jK()).k = true;
                              var45.j = var11;
                              var45.f = gY.g - var12;
                              var45.h = gY.f - var13;
                              var45.g = var11.ba;
                              fU.a((fU)client.cf, var45);
                           }
                        }

                        if (var11.bK && var44 && var11.bi != null) {
                           (var45 = new jK()).k = true;
                           var45.j = var11;
                           var45.f = gY.j - var12;
                           var45.h = gY.b - var13;
                           var45.g = var11.bi;
                           fU.a((fU)client.cf, var45);
                        }

                        if (var11.bK && !var44) {
                           var11.bK = false;
                           if (var11.aW != null) {
                              (var45 = new jK()).k = true;
                              var45.j = var11;
                              var45.f = gY.j - var12;
                              var45.h = gY.b - var13;
                              var45.g = var11.aW;
                              fU.a((fU)client.cp, var45);
                           }
                        }

                        if (var44 && var11.bh != null) {
                           (var45 = new jK()).k = true;
                           var45.j = var11;
                           var45.f = gY.j - var12;
                           var45.h = gY.b - var13;
                           var45.g = var11.bh;
                           fU.a((fU)client.cf, var45);
                        }

                        if (!var11.bv && var38) {
                           var11.bv = true;
                           if (var11.aR != null) {
                              (var45 = new jK()).k = true;
                              var45.j = var11;
                              var45.f = gY.j - var12;
                              var45.h = gY.b - var13;
                              var45.g = var11.aR;
                              fU.a((fU)client.cf, var45);
                           }
                        }

                        if (var11.bv && var38 && var11.aM != null) {
                           (var45 = new jK()).k = true;
                           var45.j = var11;
                           var45.f = gY.j - var12;
                           var45.h = gY.b - var13;
                           var45.g = var11.aM;
                           fU.a((fU)client.cf, var45);
                        }

                        if (var11.bv && !var38) {
                           var11.bv = false;
                           if (var11.bE != null) {
                              (var45 = new jK()).k = true;
                              var45.j = var11;
                              var45.f = gY.j - var12;
                              var45.h = gY.b - var13;
                              var45.g = var11.bE;
                              fU.a((fU)client.cp, var45);
                           }
                        }

                        if (var11.aY != null) {
                           (var45 = new jK()).j = var11;
                           var45.g = var11.aY;
                           fU.a((fU)client.bS, var45);
                        }

                        jK var53;
                        if (var11.bp != null && client.es > var11.bs) {
                           if (var11.bc != null && client.es - var11.bs <= 32) {
                              label759:
                              for(var43 = var11.bs; var43 < client.es; ++var43) {
                                 var40 = client.ey[var43 & 31];

                                 for(var18 = 0; var18 < var11.bc.length; ++var18) {
                                    if (var40 == var11.bc[var18]) {
                                       (var53 = new jK()).j = var11;
                                       var53.g = var11.bp;
                                       fU.a((fU)client.cf, var53);
                                       break label759;
                                    }
                                 }
                              }
                           } else {
                              (var45 = new jK()).j = var11;
                              var45.g = var11.bp;
                              fU.a((fU)client.cf, var45);
                           }

                           var11.bs = client.es;
                        }

                        if (var11.br != null && client.et > var11.bw) {
                           if (var11.bk != null && client.et - var11.bw <= 32) {
                              label735:
                              for(var43 = var11.bw; var43 < client.et; ++var43) {
                                 var40 = client.eA[var43 & 31];

                                 for(var18 = 0; var18 < var11.bk.length; ++var18) {
                                    if (var40 == var11.bk[var18]) {
                                       (var53 = new jK()).j = var11;
                                       var53.g = var11.br;
                                       fU.a((fU)client.cf, var53);
                                       break label735;
                                    }
                                 }
                              }
                           } else {
                              (var45 = new jK()).j = var11;
                              var45.g = var11.br;
                              fU.a((fU)client.cf, var45);
                           }

                           var11.bw = client.et;
                        }

                        if (var11.bA != null && client.ez > var11.bU) {
                           if (var11.aS != null && client.ez - var11.bU <= 32) {
                              label711:
                              for(var43 = var11.bU; var43 < client.ez; ++var43) {
                                 var40 = client.eo[var43 & 31];

                                 for(var18 = 0; var18 < var11.aS.length; ++var18) {
                                    if (var40 == var11.aS[var18]) {
                                       (var53 = new jK()).j = var11;
                                       var53.g = var11.bA;
                                       fU.a((fU)client.cf, var53);
                                       break label711;
                                    }
                                 }
                              }
                           } else {
                              (var45 = new jK()).j = var11;
                              var45.g = var11.bA;
                              fU.a((fU)client.cf, var45);
                           }

                           var11.bU = client.ez;
                        }

                        if (client.ce > var11.bP && var11.bg != null) {
                           (var45 = new jK()).j = var11;
                           var45.g = var11.bg;
                           fU.a((fU)client.cf, var45);
                        }

                        if (client.ep > var11.bP && var11.bj != null) {
                           (var45 = new jK()).j = var11;
                           var45.g = var11.bj;
                           fU.a((fU)client.cf, var45);
                        }

                        if (client.ew > var11.bP && var11.bq != null) {
                           (var45 = new jK()).j = var11;
                           var45.g = var11.bq;
                           fU.a((fU)client.cf, var45);
                        }

                        if (client.ek > var11.bP && var11.bm != null) {
                           (var45 = new jK()).j = var11;
                           var45.g = var11.bm;
                           fU.a((fU)client.cf, var45);
                        }

                        if (client.eq > var11.bP && var11.aA != null) {
                           (var45 = new jK()).j = var11;
                           var45.g = var11.aA;
                           fU.a((fU)client.cf, var45);
                        }

                        if (client.em > var11.bP && var11.bC != null) {
                           (var45 = new jK()).j = var11;
                           var45.g = var11.bC;
                           fU.a((fU)client.cf, var45);
                        }

                        if (client.en > var11.bP && var11.be != null) {
                           (var45 = new jK()).j = var11;
                           var45.g = var11.be;
                           fU.a((fU)client.cf, var45);
                        }

                        if (client.eH > var11.bP && var11.ay != null) {
                           (var45 = new jK()).j = var11;
                           var45.g = var11.ay;
                           fU.a((fU)client.cf, var45);
                        }

                        var11.bP = client.bU * 733503027;
                        jK var37;
                        if (var11.by != null) {
                           for(var43 = 0; var43 < client.ck; ++var43) {
                              (var37 = new jK()).j = var11;
                              var37.e = client.cs[var43];
                              var37.d = client.cn[var43];
                              var37.g = var11.by;
                              fU.a((fU)client.cf, var37);
                           }
                        }

                        int[] var35;
                        int var57;
                        int[] var64;
                        cV var67;
                        if (var11.bL != null) {
                           var64 = new int[(var67 = client.aU).b];

                           for(var57 = 0; var57 < var67.b; ++var57) {
                              var64[var57] = var67.g[var57];
                           }

                           var35 = var64;

                           for(var40 = 0; var40 < var35.length; ++var40) {
                              (var37 = new jK()).j = var11;
                              var37.e = var35[var40];
                              var37.g = var11.bL;
                              fU.a((fU)client.cf, var37);
                           }
                        }

                        if (var11.aU != null) {
                           var64 = new int[(var67 = client.aU).k];

                           for(var57 = 0; var57 < var67.k; ++var57) {
                              var64[var57] = var67.a[var57];
                           }

                           var35 = var64;

                           for(var40 = 0; var40 < var35.length; ++var40) {
                              (var37 = new jK()).j = var11;
                              var37.e = var35[var40];
                              var37.g = var11.aU;
                              fU.a((fU)client.cf, var37);
                           }
                        }
                     }
                  }

                  if (!var11.f) {
                     if (client.dO != null || client.dP) {
                        continue;
                     }

                     if ((var11.bB >= 0 || var11.N != 0) && gY.j >= var14 && gY.b >= var15 && gY.j < var16 && gY.b < var17) {
                        if (var11.bB >= 0) {
                           bu.c = var0[var11.bB];
                        } else {
                           bu.c = var11;
                        }
                     }

                     if (var11.j == 8 && gY.j >= var14 && gY.b >= var15 && gY.j < var16 && gY.b < var17) {
                        eI.e = var11;
                     }

                     if (var11.S > var11.n * -2133353239) {
                        dr.a(var11, var12 + var11.i * -1805166981, var13, var11.n * -2133353239, var11.S, gY.j, gY.b);
                     }
                  }

                  if (var11.j == 0) {
                     a(var0, var11.y, var11.G, var11.m, var11.s * -744024149, var14, var15, var16, var17, var12 - var11.L, var13 - var11.D * 178093445);
                     if (var11.bH != null) {
                        a(var11.bH, 0, var11.bH.length - 1, var11.m, -1, var14, var15, var16, var17, var12 - var11.L, var13 - var11.D * 178093445);
                     }

                     jR var54;
                     if (var11.s * -744024149 == -1 && (var54 = (jR)gb.a(client.bT, (long)var11.m)) != null) {
                        if (var54.b == 0 && gY.j >= var14 && gY.b >= var15 && gY.j < var16 && gY.b < var17 && !client.dP) {
                           for(var45 = (jK)fU.e(client.cf); var45 != null; var45 = (jK)fU.b(client.cf)) {
                              if (var45.k) {
                                 gk.a(var45);
                                 var45.j.bv = false;
                              }
                           }

                           if (t.a == 0) {
                              client.dO = null;
                              client.ec = null;
                           }

                           if (!client.dP) {
                              iB.a();
                           }
                        }

                        aD.a(var54.d, var14, var15, var16, var17, var12, var13);
                     }
                  }
               }
            }
         }
      }

   }
}
