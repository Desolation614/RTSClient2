package osrs;

import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
public final class hv {
   @ObfuscatedName("aa")
   String[] a = new String[3];
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lwt;"
   )
   jk b;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1306744753
   )
   int c = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 999856973
   )
   int d = 1850589277;
   @ObfuscatedName("ai")
   byte e;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1648344429
   )
   int f = -1;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   cX g;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 2044314573
   )
   int h = -1;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lnp;"
   )
   ew i = new ew();
   @ObfuscatedName("ap")
   final ArrayList j = new ArrayList(1);
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 999856973
   )
   int k = 0;

   hv(int var1) {
      this.f = var1;

      for(var1 = 0; var1 < 3; ++var1) {
         this.a[var1] = "";
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "718137620"
   )
   final boolean a() {
      return this.k == -1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(ILdl;I)Lcp;",
      garbageValue = "-609131142"
   )
   final jG a(int var1, kd var2) {
      jG var3 = new jG(var1);
      if (this.b != null) {
         jG.a(var3, this.b, -1703948318);
      }

      var3.as = this.c * 1017867421;
      var3.N = this.d * 292547595;
      var3.i();
      var3.ao[0] = this.g;
      var3.bj = this.i.a * 1270278621;
      var3.z = var2.k;
      var3.aW = this.a;
      var3.a(this.i.b - var2.n, this.i.c * -1165521101 - var2.i);
      return var3;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Lcp;I)V"
   )
   private void b(jG var1) {
      c(var1);
      this.j.remove(var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "15"
   )
   final void a(int var1) {
      this.k = var1;
      this.c = 0;
      this.h = -1;
      this.d = 1850589277;
      this.e = 0;
      this.g = cX.c;
      this.b = null;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1282055829"
   )
   final void b() {
      this.k = ew.a(this.i, 297729785);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lcp;B)V",
      garbageValue = "0"
   )
   final void a(jG var1) {
      d(var1);
      this.j.add(var1);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(ILpn;ZLjava/lang/String;[BI)V",
      garbageValue = "-347925700"
   )
   final void a(int var1, fw var2, boolean var3, String var4, byte[] var5) {
      boolean var6 = false;
      String var7 = null;

      int var8;
      for(var8 = 0; var8 < this.j.size(); ++var8) {
         jG var9;
         if ((var9 = (jG)this.j.get(var8)).aT != null && var9.aV != null) {
            boolean var10 = false;
            if (var2.G && cN.a(jE.b, var9.aT, 342185015)) {
               var10 = true;
            }

            if (!var10 && client.av == 0 && !var9.aE) {
               var6 = true;
               var7 = jw.a(var9.aT, 277136074);
               var9.F = var4.trim();
               var9.u();
               var9.O = var1 >> 8;
               var9.J = var1 & 255;
               var9.E = 150;
               var9.C = kk.a(var5);
               var9.H = var3;
               var9.P = var9 != ai.a && var2.G && !client.cm.isEmpty() && var4.toLowerCase().indexOf(client.cm) == -1;
            }
         }
      }

      if (var6 && var7 != null) {
         if (var2.E) {
            var8 = var3 ? 91 : 1;
         } else {
            var8 = var3 ? 90 : 2;
         }

         if (var2.F != -1) {
            fu.a(var8, cx.d(var2.F) + var7, var4);
            return;
         }

         fu.a(var8, var7, var4);
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1050850761"
   )
   final void c() {
      this.b = null;
      this.j.clear();
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-324215022"
   )
   final void b(int var1) {
      this.i.a = var1 * -831772521;
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      signature = "(Lcp;)V"
   )
   private static void c(jG var0) {
      dF.c.getCallbacks().post(new PlayerDespawned(var0));
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      signature = "(Lcp;)V"
   )
   private static void d(jG var0) {
      dF.c.getCallbacks().postDeferred(new PlayerSpawned(var0));
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(FFFI)Lre;",
      garbageValue = "1461132049"
   )
   public static go a(float var0, float var1, float var2) {
      synchronized(go.c) {
         if (fG.a == 0) {
            return new go(var0, var1, var2);
         } else {
            go.c[--fG.a].a(var0, var1, var2);
            return go.c[fG.a];
         }
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-981801792"
   )
   public static void c(int var0) {
      gY.c = var0;
      client.B();
   }

   @ObfuscatedName("ht")
   @ObfuscatedSignature(
      signature = "(Lmk;S)V",
      garbageValue = "1919"
   )
   static void a(dQ var0) {
      var0.g.m(fW.c.l);
      jk.h(var0.g, bs.i.l);
      var0.g.m(bB.c.l);
      var0.g.m(bI.b.l);
      var0.g.m(df.a.l);
      var0.g.c(r.a.l);
      var0.g.m(ij.c.l);
      jk.a((jo)var0.g, cY.A.l, (byte)61);
      jk.a((jo)var0.g, ka.a.l, (byte)12);
      var0.g.c(ex.a.l);
      jk.a(var0.g, fJ.y.l, (byte)-51);
      var0.g.m(dE.a.l);
      var0.g.c(bn.d.l);
      jk.h(var0.g, fD.c.l);
      var0.g.c(0);
      var0.g.c(el.a.l);
      jk.a(var0.g, ar.b.l, (byte)-28);
      jk.h(var0.g, z.a.l);
      var0.g.c(fl.a.l);
      jk.a(var0.g, bS.a.l, (byte)-25);
      var0.g.m(fk.a.l);
      jk.h(var0.g, et.a.l);
      jk.a((jo)var0.g, ec.c.l, (byte)73);
   }

   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1458021708"
   )
   static final void a(int var0, int var1, int var2, int var3) {
      fX.a();
      au.a(var0, var1, var2, var3, true);
      var0 = client.bb;
      var1 = client.aX;
      var2 = client.aZ;
      var3 = client.bg;
      jd.d(var0, var1, var2 + var0, var3 + var1);
      cc.k();
      jd.i();
      int var4 = client.bW;
      if (client.dk / 256 > var4) {
         var4 = client.dk / 256;
      }

      if (client.eV[4] && client.fq[4] + 128 > var4) {
         var4 = client.fq[4] + 128;
      }

      int var5 = client.cd & 2047;
      int var6 = C.b;
      int var7 = cQ.a;
      int var8 = bs.j;
      int var9 = bC.a(var4 * 3 + 600, var3);
      int var10 = 2048 - var4 & 2047;
      int var11 = 2048 - var5 & 2047;
      int var12 = 0;
      int var13 = 0;
      int var14 = var9;
      int var15;
      int var16;
      int var17;
      if (var10 != 0) {
         var15 = cc.b[var10];
         var16 = cc.a[var10];
         var17 = 0 * var16 - var15 * var9 >> 16;
         var14 = var16 * var9 + 0 * var15 >> 16;
         var13 = var17;
      }

      if (var11 != 0) {
         var15 = cc.b[var11];
         var16 = cc.a[var11];
         var17 = var14 * var15 + 0 * var16 >> 16;
         var14 = var16 * var14 - 0 * var15 >> 16;
         var12 = var17;
      }

      if (client.cu) {
         br.a = var6 - var12;
         eI.f = var7 - var13;
         es.a = var8 - var14;
         iu.b = var4;
         eo.d = var5;
      } else {
         l.d = var6 - var12;
         jD.b = var7 - var13;
         fk.b = var8 - var14;
         dB.a = var4;
         gv.a = var5;
      }

      if (client.az == 1 && client.bX >= 2 && client.Z % 50 == 0 && (C.b >> 7 != ai.a.s >> 7 || bs.j >> 7 != ai.a.n >> 7)) {
         var15 = ai.a.bj * -226423085;
         var16 = (C.b >> 7) + aM.a.n;
         var17 = (bs.j >> 7) + aM.a.i;
         bC.a(var16, var17, var15, true);
      }

      if (!client.cu) {
         label413: {
            if (!osrs.j.aS.m) {
               var12 = 3;
               var13 = client.do >> 7;
               var14 = client.dn >> 7;
               if (dB.a < 310) {
                  if (client.az == 1) {
                     var15 = C.b >> 7;
                     var16 = bs.j >> 7;
                  } else {
                     var15 = var13;
                     var16 = var14;
                  }

                  var17 = l.d >> 7;
                  var5 = fk.b >> 7;
                  if (var17 < 0 || 104 <= var17 || var5 < 0 || 104 <= var5) {
                     var11 = aM.a.m;
                     break label413;
                  }

                  if (var15 < 0 || 104 <= var15 || var16 < 0 || 104 <= var16) {
                     var11 = aM.a.m;
                     break label413;
                  }

                  if ((aM.a.q[aM.a.m][var17][var5] & 4) != 0) {
                     var12 = aM.a.m;
                  }

                  if (var15 > var17) {
                     var6 = var15 - var17;
                  } else {
                     var6 = var17 - var15;
                  }

                  if (var16 > var5) {
                     var4 = var16 - var5;
                  } else {
                     var4 = var5 - var16;
                  }

                  if (var6 > var4) {
                     var4 = (var4 << 16) / var6;
                     var7 = 32768;

                     while(var17 != var15) {
                        if (var17 < var15) {
                           ++var17;
                        } else if (var17 > var15) {
                           --var17;
                        }

                        if ((aM.a.q[aM.a.m][var17][var5] & 4) != 0) {
                           var12 = aM.a.m;
                        }

                        if ((var7 += var4) >= 65536) {
                           var7 -= 65536;
                           if (var5 < var16) {
                              ++var5;
                           } else if (var5 > var16) {
                              --var5;
                           }

                           if ((aM.a.q[aM.a.m][var17][var5] & 4) != 0) {
                              var12 = aM.a.m;
                           }
                        }
                     }
                  } else if (var4 > 0) {
                     var4 = (var6 << 16) / var4;
                     var7 = 32768;

                     while(var16 != var5) {
                        if (var5 < var16) {
                           ++var5;
                        } else if (var5 > var16) {
                           --var5;
                        }

                        if ((aM.a.q[aM.a.m][var17][var5] & 4) != 0) {
                           var12 = aM.a.m;
                        }

                        if ((var7 += var4) >= 65536) {
                           var7 -= 65536;
                           if (var17 < var15) {
                              ++var17;
                           } else if (var17 > var15) {
                              --var17;
                           }

                           if ((aM.a.q[aM.a.m][var17][var5] & 4) != 0) {
                              var12 = aM.a.m;
                           }
                        }
                     }
                  }
               }

               if (var13 >= 0 && 104 > var13 && var14 >= 0 && 104 > var14) {
                  if ((aM.a.q[aM.a.m][var13][var14] & 4) != 0) {
                     var12 = aM.a.m;
                  }

                  var11 = var12;
                  break label413;
               }
            }

            var11 = aM.a.m;
         }

         var10 = var11;
      } else {
         label326: {
            if (!osrs.j.aS.m) {
               var12 = l.d >> 7;
               var13 = fk.b >> 7;
               if (var12 >= 0 && 104 > var12 && var13 >= 0 && 104 > var13 && (bW.a(aM.a, l.d, fk.b, aM.a.m) - jD.b >= 800 || (aM.a.q[aM.a.m][var12][var13] & 4) == 0)) {
                  var11 = 3;
                  break label326;
               }
            }

            var11 = aM.a.m;
         }

         var10 = var11;
      }

      var11 = l.d;
      var12 = jD.b;
      var13 = fk.b;
      var14 = dB.a;
      var15 = gv.a;

      for(var16 = 0; var16 < 5; ++var16) {
         if (client.eV[var16]) {
            var17 = (int)(Math.random() * (double)((client.eY[var16] << 1) + 1) - (double)client.eY[var16] + Math.sin((double)client.fn[var16] / 100.0D * (double)client.fk[var16]) * (double)client.fq[var16]);
            if (var16 == 0) {
               l.d += var17;
            }

            if (var16 == 1) {
               jD.b += var17;
            }

            if (var16 == 2) {
               fk.b += var17;
            }

            if (var16 == 3) {
               gv.a = var17 + gv.a & 2047;
            }

            if (var16 == 4) {
               if ((dB.a += var17) < 128) {
                  dB.a = 128;
               }

               if (dB.a > 383) {
                  dB.a = 383;
               }
            }
         }
      }

      var16 = gY.j;
      var17 = gY.b;
      if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) {
         iL.a(var16 - var0, var17 - var1);
         Iterator var22 = client.ag.iterator();

         while(var22.hasNext()) {
            kd var25;
            ci.e((var25 = (kd)var22.next()).o, var25.m, var16 - var0, var17 - var1);
         }
      } else {
         cf.c = false;
         cf.d = 0;
      }

      client.d(var0, var1, var2, var3);
      var5 = cc.c();
      cc.a(dF.c.t);
      cc.d.i = client.bd;
      ca var23 = client.aA == -1 ? ca.b : ca.a;
      ci.a(aM.a.o, var23);
      int var10001 = l.d;
      var10001 = jD.b;
      var10001 = fk.b;
      aM.a.o.a(var10, client.do, client.dn, client.cu);
      cc.a(false);
      if (client.bs) {
         jd.j();
      }

      cc.d.i = var5;
      cW.a(aM.a, var0, var1, var2, var3);

      for(var4 = 0; var4 < aM.a.t.a; ++var4) {
         hG var27;
         if ((var27 = (hG)aM.a.l.b((long)aM.a.t.b[var4])) != null) {
            cW.a(var27.e, var0, var1, var2, var3);
         }
      }

      eN.a(aM.a, var0, var1);
      cx var10000 = (cx)cc.d.a;
      var4 = client.cP;
      cx var26 = var10000;

      for(var5 = 0; var5 < var26.a.length; ++var5) {
         cs var24;
         if ((var24 = var26.a[var5]) != null && var24.j != 0 && var24.h) {
            cs var29 = var24;
            if (var24.e != null) {
               int var18;
               int var19;
               int var20;
               short var30;
               int[] var31;
               if (var24.j == 1 || var24.j == 3) {
                  if (cs.a == null || cs.a.length < var24.e.length) {
                     cs.a = new int[var24.e.length];
                  }

                  if (var24.e.length == 4096) {
                     var30 = 64;
                  } else {
                     var30 = 128;
                  }

                  var16 = var24.e.length;
                  var17 = var30 * var24.d * var4;
                  var18 = var16 - 1;
                  if (var24.j == 1) {
                     var17 = -var17;
                  }

                  for(var19 = 0; var19 < var16; ++var19) {
                     var20 = var19 + var17 & var18;
                     cs.a[var19] = var29.e[var20];
                  }

                  var31 = var29.e;
                  var29.e = cs.a;
                  cs.a = var31;
               }

               if (var29.j == 2 || var29.j == 4) {
                  if (cs.a == null || cs.a.length < var29.e.length) {
                     cs.a = new int[var29.e.length];
                  }

                  if (var29.e.length == 4096) {
                     var30 = 64;
                  } else {
                     var30 = 128;
                  }

                  var16 = var29.e.length;
                  var17 = var29.d * var4;
                  var18 = var30 - 1;
                  if (var29.j == 2) {
                     var17 = -var17;
                  }

                  for(var19 = 0; var19 < var16; var19 += var30) {
                     for(var20 = 0; var20 < var30; ++var20) {
                        var8 = var19 + var20;
                        int var21 = var19 + (var20 + var17 & var18);
                        cs.a[var8] = var29.e[var21];
                     }
                  }

                  var31 = var29.e;
                  var29.e = cs.a;
                  cs.a = var31;
               }
            }

            var24.h = false;
         }
      }

      dF.c.getCallbacks().drawAboveOverheads();
      ag.a();
      l.d = var11;
      jD.b = var12;
      fk.b = var13;
      dB.a = var14;
      gv.a = var15;
      if (client.bk) {
         fv var28 = ec.f;
         if (0 + var28.b + var28.c == 0) {
            client.bk = false;
         }
      }

      if (client.bk) {
         client.d(var0, var1, var2, var3);
         fy.a("Loading - please wait.");
      }

      dh.a();
   }

   @ObfuscatedName("oe")
   @ObfuscatedSignature(
      signature = "(Lby;Lcp;I)V"
   )
   public static void a(hv var0, jG var1, int var2) {
      if (var0 == null) {
         var0.b(var1);
      }

      c(var1);
      var0.j.remove(var1);
   }
}
