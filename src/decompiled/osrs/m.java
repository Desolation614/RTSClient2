package osrs;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ab")
public final class m extends Canvas {
   @ObfuscatedName("ap")
   private Component a;

   m(fs var1) {
      this.a = var1;
   }

   public final void update(Graphics var1) {
      this.a.update(var1);
   }

   public final void paint(Graphics var1) {
      this.a.paint(var1);
   }

   @ObfuscatedName("lh")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-18"
   )
   static final void a(int var0, int var1, int var2, int var3) {
      int var10000 = client.aO;
      int var16;
      int var86;
      if (!client.dU) {
         var10000 = var0 - var2;
         int var22 = var1 - var3;
         int var21 = var10000;
         int[] var73 = new int[client.ag.a];
         float[] var18 = new float[client.ag.a];
         var16 = 0;

         for(Iterator var19 = client.ag.iterator(); var19.hasNext(); ++var16) {
            kd var74 = (kd)var19.next();
            var73[var16] = var74.k;
            var18[var16] = var74.o.y;
         }

         hs.a(var18, var73, 0, var18.length - 1);
         HashMap var95 = new HashMap();

         for(var16 = var73.length - 1; var16 >= 0; --var16) {
            if (var18[var16] > 0.0F || var73[var16] == -1) {
               hO var75 = jA.b(client.ag, var73[var16]);
               if (!var95.containsKey(var75)) {
                  var95.put(var75, var73[var16]);
               }
            }
         }

         for(var16 = 0; var16 < var73.length; ++var16) {
            var1 = var73[var16];
            hO var76 = jA.b(client.ag, var1);
            Integer var78;
            if ((var78 = (Integer)var95.get(var76)) != null && var78.equals(var1)) {
               if (var76 == hO.a) {
                  fh.a("Walk here", "", 23, 0, var21, var22, 0, false, var1);
               } else if (var76 == hO.b) {
                  ci var104 = aM.a.o;
                  int var4 = fk.b;
                  var3 = jD.b;
                  var2 = l.d;
                  int var7 = client.dJ;
                  ci var6 = var104;
                  bS.a(var104.O, var6.S, var6.z, var6.T);
                  go var5;
                  go var105 = var5 = hv.a(0.0F, 1.0F, 0.0F);
                  go var72 = cf.g;
                  go var77;
                  float var82;
                  if (Math.abs(var82 = var105.b(var72)) < 1.0E-5F) {
                     go.a(var5, -2074597560);
                     var105 = null;
                  } else {
                     go var64 = hv.a((var77 = hv.a((float)var2, (float)var3, (float)var4)).g, var77.f - (float)var7, var77.h);
                     float var65 = -var5.b(var64) / var82;
                     go.a(var5, -2129723723);
                     if (var65 < 0.0F) {
                        go.a(var64, -1918590804);
                        go.a(var77, -2137177409);
                        var105 = null;
                     } else {
                        go var67;
                        go var69;
                        var105 = var69 = var67 = jt.a(cf.g);
                        var105.g *= var65;
                        var69.f *= var65;
                        var69.h *= var65;
                        go var68;
                        go.a(var68 = jt.a(var77), var67, -1275301079);
                        go.a(var67, -1870168309);
                        go.a(var64, -1879687808);
                        go.a(var77, -1940461902);
                        var105 = var68;
                     }
                  }

                  var77 = var105;
                  if (var105 != null) {
                     go var79 = hv.a((float)client.do, (float)client.dJ, (float)client.dn);
                     go var80;
                     go var84;
                     var105 = var84 = var80 = jt.a(var77);
                     var105.g -= var79.g;
                     var84.f -= var79.f;
                     var84.h -= var79.h;
                     (var84 = var5 = jt.a(go.b)).a(var80.h * var84.f - var80.f * var84.h, var84.h * var80.g - var84.g * var80.h, var80.f * var84.g - var84.f * var80.g);
                     var72 = go.d;
                     var86 = (((int)((double)((float)Math.atan2((double)var5.b(var72), (double)go.b.b(var80))) / 6.283185307179586D * 2048.0D) & 2047) + 64 & 2047) / 128;
                     fh.a("Set heading", "", 60, var86, 0, 0, 0, false, var1);
                     go.a(var79, -1889902095);
                     go.a(var80, -1845444160);
                     go.a(var5, -2082824146);
                     go.a(var77, -1929680823);
                  }
               }
            }
         }
      }

      long var81 = -1L;
      var0 = 0;
      long var85 = -1L;
      var1 = 0;

      while(true) {
         var2 = cf.d;
         int var89;
         if (var1 >= var2) {
            if (-1L != var81) {
               var1 = fh.a(var81);
               var89 = (int)(var81 >>> 7 & 127L);
               W.a((jG)aM.a.e.a((long)client.dW), client.dW, var1, var89, var0);
            }

            return;
         }

         long var11;
         if ((var11 = cf.a[var1]) != var85) {
            label471: {
               var85 = var11;
               var3 = var2 = fh.a(cf.a[var1]);
               var86 = cH.a(var1);
               int var9 = (int)(cf.a[var1] >>> 16 & 7L);
               int var10;
               int var13 = var10 = eg.a(cf.a[var1]);
               int var14;
               int var15 = var14 = bP.a(cf.a[var1]);
               kd var17 = null;
               hG var93 = (hG)aM.a.l.b((long)var14);
               if (var14 >= 0 && var93 != null) {
                  if (hG.b(var93, -1337003944)) {
                     break label471;
                  }

                  var17 = var93.e;
               } else if (var14 == -1) {
                  var93 = null;
                  var17 = aM.a;
               }

               if (var17 != null) {
                  int var94 = -1;
                  if (var14 == client.aA) {
                     var94 = var17.m;
                  } else {
                     label389: {
                        if (client.aA != -1) {
                           if ((var93 = client.ag.a()).e.m != var93.d.k) {
                              break label389;
                           }

                           if (var14 == -1) {
                              var94 = var93.c();
                              break label389;
                           }
                        }

                        var94 = var93.d.k;
                     }
                  }

                  var16 = var94;
                  if (var94 != -1) {
                     label449: {
                        String var10001;
                        if (var9 == 2 && var17.o.a(var94, var2, var86, var11) >= 0) {
                           bJ var88;
                           if ((var88 = jT.b(var10)).v != null) {
                              var88 = bJ.b(var88, (byte)0);
                           }

                           if (var88 == null) {
                              break label449;
                           }

                           ik var97 = null;

                           for(ik var96 = (ik)fU.e(var17.u); var96 != null; var96 = (ik)fU.b(var17.u)) {
                              if (var16 == var96.j && var3 == var96.i && var86 == var96.k && var13 == var96.h) {
                                 var97 = var96;
                                 break;
                              }
                           }

                           if (!dA.m) {
                              var10000 = client.aO;
                           }

                           if (client.dU) {
                              if (!dA.m && (gq.b & 4) == 4) {
                                 var10001 = client.dR;
                                 fh.a(client.dN, var10001 + " -> " + dz.a(65535) + var88.n, 2, var13, var3, var86, -1, false, var14);
                              }
                           } else {
                              String[] var98;
                              if ((var98 = var88.B) != null) {
                                 for(var2 = 4; var2 >= 0; --var2) {
                                    if (!dA.m && (var97 == null || ik.a(var97, var2))) {
                                       String var91 = var98[var2];
                                       if (var97 != null && var97.p != null && var2 >= 0 && var2 < var97.p.length && var97.p[var2] != null) {
                                          var91 = var97.p != null && var2 >= 0 && var2 < var97.p.length ? var97.p[var2] : null;
                                       }

                                       if (var91 != null) {
                                          short var20 = 0;
                                          if (var2 == 0) {
                                             var20 = 3;
                                          }

                                          if (var2 == 1) {
                                             var20 = 4;
                                          }

                                          if (var2 == 2) {
                                             var20 = 5;
                                          }

                                          if (var2 == 3) {
                                             var20 = 6;
                                          }

                                          if (var2 == 4) {
                                             var20 = 1001;
                                          }

                                          fh.a(var91, dz.a(65535) + var88.n, var20, var13, var3, var86, -1, false, var15);
                                       }
                                    }
                                 }
                              }

                              fh.a("Examine", dz.a(65535) + var88.n, 1002, var88.k, var3, var86, -1, false, var15);
                           }
                        }

                        jG var92;
                        int[] var99;
                        kc var100;
                        if (var9 == 1) {
                           kc var101;
                           if ((var101 = (kc)var17.g.a((long)var13)) == null) {
                              break label449;
                           }

                           if (var101.aQ.k == 1 && (var101.s & 127) == 64 && (var101.n & 127) == 64) {
                              for(var10 = 0; var10 < var17.f.a; ++var10) {
                                 if ((var100 = (kc)var17.g.a((long)var17.f.b[var10])) != null && var100 != var101 && var100.aQ.k == 1 && var101.s == var100.s && var101.n == var100.n) {
                                    bC.a(var100, var100.y, var3, var86, var15);
                                 }
                              }

                              var10 = client.ax.f;
                              var99 = client.ax.d;

                              for(var2 = 0; var2 < var10; ++var2) {
                                 if ((var92 = (jG)var17.e.a((long)var99[var2])) != null && var92.s == var101.s && var101.n == var92.n) {
                                    W.a(var92, var99[var2], var3, var86, var15);
                                 }
                              }
                           }

                           bC.a(var101, var13, var3, var86, var15);
                        }

                        if (var9 == 0) {
                           jG var102;
                           if ((var102 = (jG)var17.e.a((long)var13)) == null) {
                              break label449;
                           }

                           if ((var102.s & 127) == 64 && (var102.n & 127) == 64) {
                              for(var10 = 0; var10 < var17.f.a; ++var10) {
                                 if ((var100 = (kc)var17.g.a((long)var17.f.b[var10])) != null && var100.aQ.k == 1 && var100.s == var102.s && var100.n == var102.n) {
                                    bC.a(var100, var17.f.b[var10], var3, var86, var15);
                                 }
                              }

                              var10 = client.ax.f;
                              var99 = client.ax.d;

                              for(var2 = 0; var2 < var10; ++var2) {
                                 if ((var92 = (jG)var17.e.a((long)var99[var2])) != null && var102 != var92 && var92.s == var102.s && var92.n == var102.n) {
                                    W.a(var92, var99[var2], var3, var86, var15);
                                 }
                              }
                           }

                           if (var13 != client.dW) {
                              W.a(var102, var13, var3, var86, var15);
                           } else {
                              var81 = var11;
                              var0 = var15;
                           }
                        }

                        fU var103;
                        if (var9 == 3 && (var103 = var17.v[var16][var3][var86]) != null) {
                           for(kk var83 = (kk)fU.c(var103); var83 != null; var83 = (kk)var103.b()) {
                              bC var87 = cE.a(var83.h);
                              if (!aA.a) {
                                 var10000 = client.aO;
                              }

                              if (client.dU) {
                                 if (!aA.a && (gq.b & 1) == 1) {
                                    var10001 = client.dR;
                                    fh.a(client.dN, var10001 + " -> " + dz.a(16748608) + var87.k, 17, var83.h, var3, var86, -1, false, var15);
                                 }
                              } else {
                                 String[] var90 = var87.v;

                                 for(var89 = 4; var89 >= 0; --var89) {
                                    if (!aA.a && (var89 >= 0 && var89 <= 4 ? (var83.c & 1 << var89) != 0 : true)) {
                                       if (var90 != null && var90[var89] != null) {
                                          byte var12 = 0;
                                          if (var89 == 0) {
                                             var12 = 18;
                                          }

                                          if (var89 == 1) {
                                             var12 = 19;
                                          }

                                          if (var89 == 2) {
                                             var12 = 20;
                                          }

                                          if (var89 == 3) {
                                             var12 = 21;
                                          }

                                          if (var89 == 4) {
                                             var12 = 22;
                                          }

                                          fh.a(var90[var89], dz.a(16748608) + var87.k, var12, var83.h, var3, var86, -1, false, var15);
                                       } else if (var89 == 2) {
                                          fh.a("Take", dz.a(16748608) + var87.k, 20, var83.h, var3, var86, -1, false, var15);
                                       }
                                    }
                                 }

                                 fh.a("Examine", dz.a(16748608) + var87.k, 1004, var83.h, var3, var86, -1, false, var15);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         ++var1;
      }
   }

   @ObfuscatedName("oe")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1195462019"
   )
   static void a(String var0) {
      gh.g = var0;

      try {
         String var1 = dF.c.getParameter(Integer.toString(18));
         String var2 = dF.c.getParameter(Integer.toString(13));
         var1 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
         if (var0.isEmpty()) {
            var1 = var1 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var0 = var1 + "; Expires=";
            long var5 = au.a() + 94608000000L;
            eo.b.setTime(new Date(var5));
            int var9 = eo.b.get(7);
            int var10 = eo.b.get(5);
            int var3 = eo.b.get(2);
            int var4 = eo.b.get(1);
            int var11 = eo.b.get(11);
            int var6 = eo.b.get(12);
            int var7 = eo.b.get(13);
            var1 = eo.a[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + eo.c[0][var3] + "-" + var4 + " " + var11 / 10 + var11 % 10 + ":" + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + " GMT";
            var1 = var0 + var1 + "; Max-Age=94608000";
         }

         client var10000 = dF.c;
         var1 = "document.cookie=\"" + var1 + "\"";
         JSObject.getWindow(var10000).eval(var1);
      } catch (Throwable var8) {
      }
   }

   @ObfuscatedName("ok")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-613046261"
   )
   static final void a(int var0, int var1) {
      af var2;
      if (client.aG[var0] != null && var1 >= 0 && var1 < client.aG[var0].a() && (var2 = (af)client.aG[var0].f.get(var1)).d == -1) {
         dQ var3;
         (var3 = X.a(j.V, client.P.f)).g.b(3 + hd.a(jw.a(var2.c, -1607585471)));
         var3.g.b(var0);
         var3.g.d(var1);
         jk.a(var3.g, (String)jw.a(var2.c, -2031443084), -1559098139);
         client.P.a(var3);
      }

   }
}
