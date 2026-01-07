package osrs;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public final class bv extends im {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   static dX a = new dX(64);

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-47"
   )
   protected static int a() {
      int var0 = 0;
      if (bk.c == null || !bk.c.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2;
               if ((var2 = (GarbageCollectorMXBean)var1.next()).isValid()) {
                  bk.c = var2;
                  fs.n = -1L;
                  fs.o = -1L;
               }
            }
         } catch (Throwable var9) {
         }
      }

      if (bk.c != null) {
         long var10 = au.a();
         long var3 = bk.c.getCollectionTime();
         if (-1L != fs.o) {
            long var5 = var3 - fs.o;
            long var7;
            if ((var7 = var10 - fs.n) != 0L) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         fs.o = var3;
         fs.n = var10;
      }

      return var0;
   }

   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "178402658"
   )
   static void b() {
      if (iF.h == client.bn) {
         dE.a = cl.a(fJ.c.A, false, true, true, false);
         fW.c = cl.a(fJ.m.A, true, true, true, false);
         fk.a = cl.a(fJ.g.A, false, true, true, false);
         bs.i = cl.a(fJ.q.A, false, true, true, false);
         el.a = cl.a(fJ.k.A, true, false, true, false);
         ar.b = cl.a(fJ.x.A, false, true, true, false);
         ka.a = cl.a(fJ.v.A, false, true, true, false);
         fJ.y = cl.a(fJ.s.A, true, true, true, false);
         gZ.a(20, "Connecting to update server");
         jR.a(iF.g);
      } else {
         int var0;
         byte[] var2;
         int var3;
         fE var5;
         int var6;
         int var8;
         int var9;
         if (client.bn == iF.g) {
            if ((var0 = (var0 = 0 + dE.a.c() * 53 / 100) + fW.c.c() * 5 / 100 + fk.a.c() * 36 / 100 + bs.i.c() / 100 + el.a.c() / 100 + (ar.b.c() << 1) / 100 + ka.a.c() / 100 + (fJ.y.s == 1 && fJ.y.a() ? 1 : 0)) == 100) {
               iW.a(dE.a, "Sound FX");
               iW.a(fW.c, "Music Tracks");
               iW.a(fk.a, "Sprites");
               iW.a(ar.b, "Music Samples");
               iW.a(ka.a, "Music Patches");
               hM var10000 = ec.d = new hM();
               var5 = fJ.y;
               hM var4 = var10000;
               var2 = fB.b(var5, hN.a.b);
               jk var7 = new jk(var2);

               while(true) {
                  while((var3 = jk.a((jk)var7, (byte)3)) != 0) {
                     switch(var3) {
                     case 1:
                        var7.f();
                        break;
                     case 2:
                        var4.a = var7.u();
                        var4.h = var7.u();
                        var4.f = var7.u();
                        var4.e = var7.u();
                        var4.j = var7.u();
                        var4.i = var7.u();
                        var4.c = var7.u();
                        var4.d = var7.u();
                        var4.g = var7.u();
                        var4.l = var7.u();
                        var4.k = var7.u();
                        break;
                     case 3:
                        for(var8 = 0; var8 < var4.b.length; ++var8) {
                           for(var9 = 0; var9 < var4.b[var8].length; ++var9) {
                              var4.b[var8][var9] = var7.f();
                           }
                        }

                        int[][] var44;
                        var9 = (var44 = var4.b).length;

                        for(var6 = 0; var6 < var9; ++var6) {
                           Arrays.fill(var44[var6], 16777215);
                        }
                     }
                  }

                  gZ.a(40, "Loaded update list");
                  jR.a(iF.b);
                  return;
               }
            }

            if (var0 != 0) {
               gZ.a(30, "Checking for updates - " + var0 + "%");
               return;
            }
         } else {
            fE var12;
            fE var14;
            fE var20;
            boolean var45;
            if (client.bn != iF.b) {
               int var1;
               int var10001;
               if (iF.a == client.bn) {
                  if (de.a == null) {
                     de.a = new ie(fk.a, el.a);
                  }

                  int var64 = iQ.b().length;
                  ie var65 = de.a;
                  iQ[] var53 = iQ.b();
                  ie var39 = var65;
                  HashMap var35 = new HashMap();
                  iQ[] var43 = var53;

                  for(var3 = 0; var3 < var43.length; ++var3) {
                     iQ var54 = var43[var3];
                     if (var39.c.containsKey(var54)) {
                        var35.put(var54, var39.c.get(var54));
                     } else {
                        fB var58 = var39.d;
                        fB var49 = var39.b;
                        String var56 = var54.i;
                        gp var59;
                        if (!var58.b(var56, "")) {
                           var59 = null;
                        } else {
                           var0 = var58.b(var56);
                           var1 = var58.a(var0, "");
                           var59 = eU.a(var58, var49, var0, var1);
                        }

                        if (var59 != null) {
                           var39.c.put(var54, var59);
                           var35.put(var54, var59);
                        }
                     }
                  }

                  client.ad = var35;
                  if (var35.size() < 6) {
                     var10001 = client.ad.size() * 100;
                     gZ.a(80, "Loading fonts - " + var10001 / 6 + "%");
                     return;
                  }

                  dt.a = (gp)client.ad.get(iQ.f);
                  cA.a = (gp)client.ad.get(iQ.c);
                  hf.a = (gp)client.ad.get(iQ.e);
                  df.b = client.fr.a();
                  gZ.a(80, "Loaded fonts");
                  jR.a(iF.k);
                  return;
               }

               int var13;
               String var23;
               if (client.bn == iF.k) {
                  var14 = bs.i;
                  var12 = fk.a;
                  var13 = 0;
                  String[] var19 = jB.s;

                  for(var1 = 0; var1 < var19.length; ++var1) {
                     var23 = var19[var1];
                     if (var14.a(var23, "")) {
                        ++var13;
                     }
                  }

                  var19 = jB.E;

                  for(var1 = 0; var1 < var19.length; ++var1) {
                     var23 = var19[var1];
                     if (var12.a(var23, "")) {
                        ++var13;
                     }
                  }

                  var19 = jB.z;

                  for(var1 = 0; var1 < var19.length; ++var1) {
                     var23 = var19[var1];
                     if (var12.b(var23) != -1 && var12.a(var23, "")) {
                        ++var13;
                     }
                  }

                  var1 = aU.a(fk.a);
                  if (var13 < var1) {
                     gZ.a(90, "Loading title screen - " + var13 * 100 / var1 + "%");
                  } else {
                     gZ.a(100, "Loaded title screen");
                     if (!eE.a) {
                        jR.a(iF.l);
                        return;
                     }

                     jT.d(5);
                     jR.a(iF.q);
                  }
               } else {
                  if (iF.q == client.bn) {
                     jT.d(10);
                     return;
                  }

                  int var31;
                  if (iF.l == client.bn) {
                     bB.c = cl.a(fJ.j.A, false, true, true, false);
                     fD.c = cl.a(fJ.w.A, false, true, true, true);
                     r.a = cl.a(fJ.n.A, false, true, true, false);
                     et.a = cl.a(fJ.i.A, true, false, true, false);
                     ec.c = cl.a(fJ.l.A, false, true, true, false);
                     bn.d = cl.a(fJ.a.A, true, true, true, false);
                     df.a = cl.a(fJ.h.A, false, true, true, false);
                     bI.b = cl.a(fJ.t.A, false, true, true, false);
                     bS.a = cl.a(fJ.d.A, false, true, true, false);
                     ij.c = cl.a(fJ.f.A, false, true, true, false);
                     cY.A = cl.a(fJ.e.A, false, true, true, false);
                     fl.a = cl.a(fJ.u.A, false, true, true, false);
                     z.a = cl.a(fJ.o.A, false, true, true, false);
                     ex.a = cl.a(fJ.r.A, false, true, true, false);
                     var31 = fJ.b.A;
                     hp var48 = null;
                     if (bT.d != null) {
                        var48 = new hp(var31, bT.d, bT.a[var31], 1000000);
                     }

                     em.a = new fE(var48, ej.f, ec.f, var31, false, true, true, true, true);
                     gZ.a(20, "Connecting to update server");
                     jR.a(iF.j);
                     return;
                  }

                  if (client.bn == iF.j) {
                     if ((var0 = (var0 = 0 + (bB.c.c() << 2) / 100) + fD.c.c() / 100 + (r.a.c() << 1) / 100 + et.a.c() / 100 + ec.c.c() / 100 + bn.d.c() * 10 / 100 + df.a.c() * 65 / 100 + bI.b.c() / 100 + bS.a.c() / 100 + ij.c.c() * 6 / 100 + fl.a.c() / 100 + (cY.A.c() << 1) / 100 + (z.a.c() << 1) / 100 + ex.a.c() / 100 + (em.a.c() << 1) / 100) == 100) {
                        iW.a(bB.c, "Animations");
                        iW.a(fD.c, "Animation Keyframes");
                        iW.a(r.a, "Skeletons");
                        iW.a(bn.d, "Maps");
                        iW.a(df.a, "Models");
                        iW.a(bS.a, "Music Jingles");
                        iW.a(fl.a, "World Map");
                        iW.a(cY.A, "World Map Geography");
                        iW.a(z.a, "World Map Ground");
                        gZ.a(30, "Loaded update list");
                        jR.a(iF.m);
                        return;
                     }

                     if (var0 != 0) {
                        gZ.a(30, "Checking for updates - " + var0 + "%");
                        return;
                     }
                  } else {
                     if (client.bn == iF.m) {
                        ec.a = aM.a = jA.a(client.ag, 104, 104, j.aS.o, (byte)-8);
                        dU.i = new iT(512, 512);
                        gZ.a(30, "Starting game engine...");
                        jR.a(iF.f);
                        return;
                     }

                     int var10002;
                     fE var18;
                     if (iF.f == client.bn) {
                        if (!et.a.a()) {
                           gZ.a(40, "Loading config - " + fE.a(et.a, 1570176546) + "%");
                           return;
                        }

                        if (!ex.a.a()) {
                           var10002 = fE.a(ij.c, 1674216443);
                           gZ.a(40, "Loading config - " + (80 + var10002 / 6) + "%");
                           return;
                        }

                        ki.a(et.a);
                        bu.b = et.a;
                        var20 = et.a;
                        var14 = df.a;
                        aP.a = var20;
                        jO.a = var14;
                        bk.b = aP.a.d(3);
                        var12 = et.a;
                        var20 = df.a;
                        var45 = client.bv;
                        bJ.d = var12;
                        fz.a = var20;
                        bJ.f = var45;
                        var5 = df.a;
                        aY.d = et.a;
                        aY.b = var5;
                        aZ.b = et.a;
                        eM.a(et.a, df.a, client.ac, dt.a);
                        ev.a(et.a, bB.c, fD.c, r.a);
                        var12 = et.a;
                        var20 = df.a;
                        bl.d = var12;
                        bl.b = var20;
                        bj.a = et.a;
                        eL.a(et.a);
                        jD.a = new eu(ec.c, df.a, fk.a, el.a, em.a);
                        osrs.aL.b = et.a;
                        bw.b = et.a;
                        be.b = et.a;
                        dR.a();
                        bh.b = et.a;
                        gn.a = et.a;
                        iD.b = et.a;
                        cS.a(et.a);
                        hj.b = new iy(iQ.h, 54, eN.c, et.a);
                        bP.f = new iy(iQ.h, 47, eN.c, et.a);
                        eq.a = new ka();
                        var12 = et.a;
                        var20 = fk.a;
                        var18 = el.a;
                        C.a = var12;
                        gC.a = var20;
                        bG.c = var18;
                        hV var57;
                        (var57 = df.b).a = (Arrays.hashCode(dF.c.fx.getClass().getSigners()) >> 2) * -601237760 + 8192 + ((fs.q ? 1 : 0) - 1) * -16384;
                        var57.c = client.u();
                        an.a(et.a, fk.a);
                        var12 = et.a;
                        bi.a = fk.a;
                        bi.b = new bi[iP.a = var12.d(35)];

                        label512:
                        for(var1 = 0; var1 < iP.a; ++var1) {
                           var2 = fB.a(var12, 35, (int)var1);
                           bi.b[var1] = new bi(var1);
                           if (var2 != null) {
                              bi var63 = bi.b[var1];
                              jk var47 = new jk(var2);
                              bi var33 = var63;

                              while(true) {
                                 while((var13 = jk.a((jk)var47, (byte)44)) != 0) {
                                    jk var25 = var47;
                                    bi var40 = var33;
                                    if (var13 == 1) {
                                       var33.e = var47.u();
                                    } else if (var13 == 2) {
                                       var33.u = var47.u();
                                    } else if (var13 == 3) {
                                       var33.m = var47.p();
                                    } else if (var13 == 4) {
                                       var33.k = var47.f();
                                    } else if (var13 == 5) {
                                       var47.f();
                                    } else if (var13 == 6) {
                                       var33.t = jk.a((jk)var47, (byte)16);
                                    } else if (var13 == 7) {
                                       if (((var6 = jk.a(var47, (byte)-116)) & 1) == 0) {
                                          var33.q = false;
                                       }

                                       if ((var6 & 2) == 2) {
                                          var33.h = true;
                                       }
                                    } else if (var13 == 8) {
                                       jk.a((jk)var47, (byte)51);
                                    } else if (var13 >= 10 && var13 <= 14) {
                                       var33.j[var13 - 10] = var47.p();
                                    } else if (var13 != 15) {
                                       if (var13 != 16) {
                                          if (var13 == 17) {
                                             var33.l = var47.p();
                                          } else if (var13 == 18) {
                                             var47.u();
                                          } else if (var13 == 19) {
                                             var33.p = var47.d();
                                          } else if (var13 == 21) {
                                             jk.d(var47, 1687107415);
                                          } else if (var13 == 22) {
                                             jk.d(var47, 1687107415);
                                          } else if (var13 == 23) {
                                             jk.a((jk)var47, (byte)109);
                                             jk.a((jk)var47, (byte)31);
                                             jk.a((jk)var47, (byte)48);
                                          } else if (var13 == 24) {
                                             var47.c();
                                             var47.c();
                                          } else if (var13 == 25) {
                                             var47.u();
                                          } else if (var13 == 28) {
                                             jk.a((jk)var47, (byte)22);
                                          } else if (var13 == 29) {
                                             var33.o = (bt)aU.a(aT.a(), jk.a(var47, (byte)-69));
                                          } else if (var13 == 30) {
                                             bn[] var55 = new bn[]{bn.b, bn.c, bn.a};
                                             var33.r = (bn)aU.a(var55, jk.a((jk)var47, (byte)48));
                                          }
                                       }
                                    } else {
                                       var6 = jk.a(var47, (byte)-94);
                                       var33.x = new int[var6 << 1];

                                       int var52;
                                       for(var52 = 0; var52 < var6 << 1; ++var52) {
                                          var40.x[var52] = var25.c();
                                       }

                                       jk.d(var25, 1687107415);
                                       var52 = jk.a(var25, (byte)-67);
                                       var40.w = new int[var52];

                                       for(var9 = 0; var9 < var40.w.length; ++var9) {
                                          var40.w[var9] = jk.d(var25, 1687107415);
                                       }

                                       var40.f = new byte[var6];

                                       for(var9 = 0; var9 < var6; ++var9) {
                                          var40.f[var9] = var25.B();
                                       }
                                    }
                                 }

                                 if ((var33 = bi.b[var1]).x == null) {
                                    break;
                                 }

                                 var6 = 0;

                                 while(true) {
                                    if (var6 >= var33.x.length) {
                                       continue label512;
                                    }

                                    if (var33.x[var6] < var33.s) {
                                       var33.s = var33.x[var6];
                                    } else if (var33.x[var6] > var33.n) {
                                       var33.n = var33.x[var6];
                                    }

                                    if (var33.x[var6 + 1] < var33.i) {
                                       var33.i = var33.x[var6 + 1];
                                    } else if (var33.x[var6 + 1] > var33.v) {
                                       var33.v = var33.x[var6 + 1];
                                    }

                                    var6 += 2;
                                 }
                              }
                           }
                        }

                        gZ.a(50, "Loaded config");
                        jR.a(iF.e);
                        return;
                     }

                     if (iF.e == client.bn) {
                        var0 = 0;
                        if (bZ.a == null) {
                           bZ.a = hn.a(fk.a, ec.d.a, 0);
                        } else {
                           ++var0;
                        }

                        if (n.c == null) {
                           n.c = hn.a(fk.a, ec.d.h, 0);
                        } else {
                           ++var0;
                        }

                        if (fJ.z == null) {
                           fJ.z = hQ.a(fk.a, ec.d.f, 0);
                        } else {
                           ++var0;
                        }

                        if (cl.a == null) {
                           cl.a = hb.a(fk.a, ec.d.e, 0);
                        } else {
                           ++var0;
                        }

                        if (gY.s == null) {
                           gY.s = hb.a(fk.a, ec.d.j, 0);
                        } else {
                           ++var0;
                        }

                        if (ej.e == null) {
                           ej.e = hb.a(fk.a, ec.d.i, 0);
                        } else {
                           ++var0;
                        }

                        if (ai.b == null) {
                           ai.b = hb.a(fk.a, ec.d.c, 0);
                        } else {
                           ++var0;
                        }

                        if (gs.a == null) {
                           gs.a = hb.a(fk.a, ec.d.d, 0);
                        } else {
                           ++var0;
                        }

                        if (ki.e == null) {
                           ki.e = hb.a(fk.a, ec.d.g, 0);
                        } else {
                           ++var0;
                        }

                        if (af.a == null) {
                           af.a = hQ.a(fk.a, ec.d.l, 0);
                        } else {
                           ++var0;
                        }

                        if (bN.c == null) {
                           bN.c = hQ.a(fk.a, ec.d.k, 0);
                        } else {
                           ++var0;
                        }

                        if (var0 < 11) {
                           gZ.a(70, "Loading sprites - " + var0 * 100 / 12 + "%");
                           return;
                        }

                        gw.b = bN.c;
                        iT var27;
                        if ((var27 = n.c).a != var27.g || var27.e != var27.f) {
                           int[] var38 = new int[var27.g * var27.f];

                           for(var6 = 0; var6 < var27.e; ++var6) {
                              for(var13 = 0; var13 < var27.a; ++var13) {
                                 var38[var13 + (var6 + var27.c) * var27.g + var27.d] = var27.b[var13 + var6 * var27.a];
                              }
                           }

                           var27.b = var38;
                           var27.a = var27.g;
                           var27.e = var27.f;
                           var27.d = 0;
                           var27.c = 0;
                        }

                        var31 = (int)(Math.random() * 21.0D) - 10;
                        var0 = (int)(Math.random() * 21.0D) - 10;
                        var13 = (int)(Math.random() * 21.0D) - 10;
                        var1 = (int)(Math.random() * 41.0D) - 20;
                        jp var62 = fJ.z[0];
                        var10001 = var1 + var31;
                        var10002 = var0 + var1;
                        var13 += var1;
                        var6 = var10002;
                        int var41 = var10001;
                        jp var32 = var62;

                        for(int var36 = 0; var36 < var32.d.length; ++var36) {
                           if ((var3 = (var32.d[var36] >> 16 & 255) + var41) < 0) {
                              var3 = 0;
                           } else if (var3 > 255) {
                              var3 = 255;
                           }

                           if ((var8 = (var32.d[var36] >> 8 & 255) + var6) < 0) {
                              var8 = 0;
                           } else if (var8 > 255) {
                              var8 = 255;
                           }

                           if ((var9 = (var32.d[var36] & 255) + var13) < 0) {
                              var9 = 0;
                           } else if (var9 > 255) {
                              var9 = 255;
                           }

                           var32.d[var36] = var9 + (var8 << 8) + (var3 << 16);
                        }

                        gZ.a(60, "Loaded sprites");
                        jR.a(iF.p);
                        return;
                     }

                     if (client.bn == iF.p) {
                        if (!bI.b.a()) {
                           gZ.a(70, "Loading textures - 0%");
                           return;
                        }

                        cc.a(client.dw = new cx(bI.b, fk.a, 20, jD.a((jD)j.aS, (byte)37), client.bv ? 64 : 128));
                        cc.a(jD.a((jD)j.aS, (byte)37));
                        jR.a(iF.n);
                        return;
                     }

                     if (client.bn == iF.n) {
                        if ((var0 = cx.a(client.dw, -1149354793)) < 100) {
                           gZ.a(80, "Loading textures - " + var0 + "%");
                           return;
                        }

                        gZ.a(90, "Loaded textures");
                        jR.a(iF.c);
                        return;
                     }

                     if (client.bn == iF.c) {
                        dU.h = new jL();
                        byte var22 = 10;
                        jL var16 = dU.h;
                        fs.g.a(2, var22, var16);
                        gZ.a(92, "Loaded input handler");
                        jR.a(iF.d);
                        return;
                     }

                     if (iF.d == client.bn) {
                        if (!bs.i.a("huffman", "")) {
                           gZ.a(94, "Loading wordpack - 0%");
                           return;
                        }

                        eF.b = new ef(bs.i.c("huffman", ""));
                        gZ.a(94, "Loaded wordpack");
                        jR.a(iF.i);
                        return;
                     }

                     if (iF.i == client.bn) {
                        if (!ec.c.a()) {
                           var10001 = fE.a(ec.c, 549183329) << 2;
                           gZ.a(96, "Loading interfaces - " + var10001 / 5 + "%");
                           return;
                        }

                        if (!em.a.a()) {
                           var10001 = fE.a(em.a, 2078200223) << 2;
                           gZ.a(96, "Loading interfaces - " + var10001 / 5 + "%");
                           return;
                        }

                        if (!ij.c.a()) {
                           var10002 = fE.a(ij.c, 1023684023);
                           gZ.a(96, "Loading interfaces - " + (80 + var10002 / 6) + "%");
                           return;
                        }

                        if (!el.a.a()) {
                           var10002 = fE.a(el.a, 2038967422);
                           gZ.a(96, "Loading interfaces - " + (96 + var10002 / 50) + "%");
                           return;
                        }

                        gZ.a(98, "Loaded interfaces");
                        if (ij.c.b("version.dat", "")) {
                           client.ae = (new jk(ij.c.c("version.dat", ""))).d();
                        }

                        jR.a(iF.r);
                        return;
                     }

                     if (iF.r == client.bn) {
                        if (fl.a.e > 0) {
                           var23 = dh.d.f;
                           fE var24 = fl.a;
                           var23 = var23.toLowerCase();
                           var13 = var24.d.a(bc.a(var23));
                           if (!fB.c(var24, var13)) {
                              var23 = dh.d.f;
                              var24 = fl.a;
                              var23 = var23.toLowerCase();
                              var13 = var24.d.a(bc.a(var23));
                              var10001 = var24.a(var13);
                              gZ.a(100, "Loading world map - " + var10001 / 10 + "%");
                              return;
                           }
                        }

                        if (er.b == null) {
                           ip var61 = er.b = new ip();
                           jp[] var46 = fJ.z;
                           HashMap var17 = client.ad;
                           gp var34 = hf.a;
                           var18 = z.a;
                           fE var30 = cY.A;
                           var5 = fl.a;
                           ip var26 = var61;
                           var61.i = var46;
                           var26.l = var5;
                           var26.j = var30;
                           var26.e = var18;
                           var26.k = var34;
                           var26.g = new HashMap();
                           var26.g.put(cL.c, var17.get(ip.a));
                           var26.g.put(cL.a, var17.get(ip.c));
                           var26.g.put(cL.b, var17.get(ip.b));
                           var26.D = new ii(var5);
                           var6 = var26.l.b(dh.d.f);
                           int[] var10;
                           var9 = (var10 = var26.l.e(var6)) == null ? 0 : var10.length;
                           var26.m = new HashMap(var9);

                           for(var0 = 0; var0 < var9; ++var0) {
                              jk var15 = new jk(fB.a(var26.l, var6, var10[var0]));
                              df var21;
                              df.a(var21 = new df(), var15, var10[var0]);
                              var26.m.put(df.d(var21, 268028725), var21);
                              if (var21.k) {
                                 var26.d = var21;
                              }
                           }

                           var26.a(var26.d);
                           var26.n = null;
                        }

                        gZ.a(100, "Loaded world map");
                        if (eE.a) {
                           jR.a(iF.o);
                        } else {
                           jR.a(iF.q);
                        }

                        client.cr = false;
                        return;
                     }

                     if (client.bn == iF.o) {
                        dn.a = false;
                        jT.d(20);
                        dc.a(cY.q);
                        return;
                     }
                  }
               }
            } else {
               P.a(22050, !client.bv, 2);
               ArrayList var37 = new ArrayList(3);
               bN var66 = fs.g;
               jD.c = osrs.aL.a(0, 2048);
               N.a = new jY();
               jY var28;
               (var28 = new jY()).a((jX)N.a);

               for(var0 = 0; var0 < 3; ++var0) {
                  ea var29;
                  ea var67 = var29 = new ea(jD.c);
                  boolean var50 = true;
                  var45 = true;
                  ea var42 = var67;
                  synchronized(var67.n) {
                     short var51 = 128;
                     byte var60 = 9;
                     var42.l[var60] = var51;
                     var42.o[var60] = var51 & -128;
                     var42.a(var60, var51);
                  }

                  var28.a((jX)var29);
                  var37.add(var29);
               }

               jD.c.a(var28);
               var12 = ka.a;
               var20 = ar.b;
               var14 = dE.a;
               V.a = var12;
               ed.a = var20;
               ee.a = var14;
               ee.f = var37;
               l.e = new D(22050, B.a);
               gZ.a(60, "Prepared sound engine");
               jR.a(iF.a);
            }
         }

      }
   }
}
