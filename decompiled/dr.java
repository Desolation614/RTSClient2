package osrs;

import java.util.Iterator;
import net.runelite.api.events.AnimationChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
public final class dr implements fN {
   @ObfuscatedName("aa")
   static Thread a;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   private static dr c = new dr(1, (byte)3);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   private static dr d = new dr(3, (byte)1);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   private static dr e = new dr(2, (byte)2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   private static dr f = new dr(0, (byte)0);
   @ObfuscatedName("ac")
   private byte g;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1058756989
   )
   final int b;

   private dr(int var1, byte var2) {
      this.b = var1;
      this.g = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.g;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "-800839183"
   )
   public static int a(int var0, int var1, int var2) {
      var2 = fg.a(var2 - var1 + 1) << var1;
      return var0 & ~var2;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)[Lll;",
      garbageValue = "-19"
   )
   static dr[] b() {
      return new dr[]{e, d, f, c};
   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      signature = "(B)J",
      garbageValue = "88"
   )
   static long c() {
      return client.dG;
   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-987936070"
   )
   static final void d() {
      Iterator var0 = client.ag.iterator();

      while(var0.hasNext()) {
         kd var1;
         Iterator var2 = (var1 = (kd)var0.next()).g.iterator();

         while(var2.hasNext()) {
            kc var3;
            if ((var3 = (kc)var2.next()) != null) {
               a(var1, var3, var3.aQ.k);
            }
         }
      }

   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      signature = "(Ldl;Lcn;IB)V",
      garbageValue = "57"
   )
   static final void a(kd var0, jE var1, int var2) {
      jE.a(var1);
      int var3;
      boolean var10000;
      if (var1.N != -1) {
         jE var11;
         kd var13;
         if (var1.N < 65536) {
            var11 = (jE)(var13 = fd.a(var1.N, client.ag)).g.a((long)var1.N);
         } else {
            var3 = var1.N - 65536;
            jA var5;
            Iterator var4 = (var5 = client.ag).iterator();

            kd var6;
            while(true) {
               if (var4.hasNext()) {
                  kd var9;
                  if ((jG)(var9 = (kd)var4.next()).e.a((long)var3) == null || var9.k == -1) {
                     continue;
                  }

                  var6 = var9;
                  break;
               }

               var6 = jA.a(var5, -612502515);
               break;
            }

            var13 = var6;
            var11 = (jE)var6.e.a((long)var3);
         }

         if (var11 != null) {
            go var14 = hv.a((float)var1.s, 0.0F, (float)var1.n);
            go var15;
            if (var0.k != var13.k) {
               if (var0.k == -1) {
                  var15 = ((hG)aM.a.l.b((long)var13.k)).b(var11.s, var11.n);
               } else if (var13.k == -1) {
                  var15 = ((hG)aM.a.l.b((long)var0.k)).a(var11.s, var11.n);
               } else {
                  hG var19 = (hG)aM.a.l.b((long)var13.k);
                  hG var10 = (hG)aM.a.l.b((long)var0.k);
                  go var7 = var19.b(var11.s, var11.n);
                  var15 = var10.a((int)var7.g, (int)var7.h);
                  go.a(var7, -2057678928);
               }
            } else {
               var15 = hv.a((float)var11.s, 0.0F, (float)var11.n);
            }

            var2 = (int)(var14.g - var15.g);
            int var20 = (int)(var14.h - var15.h);
            if (var2 != 0 || var20 != 0) {
               var2 = (int)(Math.atan2((double)var2, (double)var20) * 325.94932345220167D) & 2047;
               var1.as = var2;
            }

            go.a(var14, -2097048079);
            go.a(var15, -1948286651);
         } else {
            var10000 = var1.h;
         }
      }

      int var17;
      int var18;
      if (var1.aj == 0 || var1.ah > 0) {
         var18 = -1;
         if (var1.o != -1 && var1.g != -1) {
            var3 = (var1.o - aM.a.n << 7) + 64;
            var2 = (var1.g - aM.a.i << 7) + 64;
            var3 = var1.s - var3;
            var17 = var1.n - var2;
            if (var3 != 0 || var17 != 0) {
               var18 = (int)(Math.atan2((double)var3, (double)var17) * 325.94932345220167D) & 2047;
            }
         } else if (var1.t != -1) {
            var18 = var1.t;
         }

         if (var18 != -1) {
            var1.as = var18;
            if (var1.k) {
               var1.l = var1.as;
            }
         }

         var1.r();
      }

      if ((var18 = var1.as - var1.l & 2047) != 0) {
         var1.aq += 367718377;
         var3 = var18 > 1024 ? -1 : 1;
         var1.l += var3 * var1.ac;
         boolean var12 = true;
         if (var18 < var1.ac || var18 > 2048 - var1.ac) {
            var1.l = var1.as;
            var12 = false;
         }

         if (var1.ac > 0 && var1.V == var1.K && (var1.aq * -1778984871 > 25 || var12)) {
            if (var3 == -1 && var1.Y != -1) {
               var1.V = var1.Y;
            } else if (var3 == 1 && var1.A * 1051182823 != -1) {
               var1.V = var1.A * 1051182823;
            } else {
               var1.V = var1.R;
            }
         }

         var1.l &= 2047;
      } else {
         var10000 = var1.h;
         var1.aq = 0;
      }

      var1.e = false;
      if (var1.V != -1) {
         bP var23;
         if ((var23 = az.a(var1.V)) != null) {
            if (!var23.b() && var23.p != null) {
               ++var1.M;
               if (var1.B < var23.p.length && var1.M > var23.i[var1.B]) {
                  var1.M = 1;
                  ++var1.B;
                  aV.a(var0, var23, var1.B, var1.s, var1.n, var1 == ai.a);
               }

               if (var1.B >= var23.p.length) {
                  if (var23.k > 0) {
                     var1.B -= var23.k;
                     if (var23.u) {
                        ++var1.al;
                     }

                     if (var1.B < 0 || var1.B >= var23.p.length || var23.u && var1.al >= var23.y) {
                        var1.M = 0;
                        var1.B = 0;
                        var1.al = 0;
                     }
                  } else {
                     var1.M = 0;
                     var1.B = 0;
                  }

                  aV.a(var0, var23, var1.B, var1.s, var1.n, var1 == ai.a);
               }
            } else if (var23.b()) {
               ++var1.B;
               var3 = var23.a();
               if (var1.B < var3) {
                  aV.a(var0, var23, var1.B, var1.s, var1.n, var1 == ai.a);
               } else {
                  if (var23.k > 0) {
                     var1.B -= var23.k;
                     if (var23.u) {
                        ++var1.al;
                     }

                     if (var1.B < 0 || var1.B >= var3 || var23.u && var1.al >= var23.y) {
                        var1.B = 0;
                        var1.M = 0;
                        var1.al = 0;
                     }
                  } else {
                     var1.M = 0;
                     var1.B = 0;
                  }

                  aV.a(var0, var23, var1.B, var1.s, var1.n, var1 == ai.a);
               }
            } else {
               var1.V = -1;
            }
         } else {
            var1.V = -1;
         }
      }

      gc var24;
      for(hs var21 = (hs)(var24 = new gc(var1.ar)).a(); var21 != null; var21 = (hs)var24.next()) {
         if (var21.e != -1 && client.Z >= var21.a) {
            if ((var2 = eT.a(var21.e).e) != -1) {
               var21.b = Math.max(var21.b, 0);
               bP var16;
               if ((var16 = az.a(var2)).p != null && !var16.b()) {
                  ++var21.d;
                  if (var21.b < var16.p.length && var21.d > var16.i[var21.b]) {
                     var21.d = 1;
                     ++var21.b;
                     aV.a(var0, var16, var21.b, var1.s, var1.n, var1 == ai.a);
                  }

                  if (var21.b < var16.p.length) {
                     continue;
                  }
               } else if (var16.b()) {
                  ++var21.b;
                  var17 = var16.a();
                  if (var21.b < var17) {
                     aV.a(var0, var16, var21.b, var1.s, var1.n, var1 == ai.a);
                  } else {
                     gk.a(var21);
                     --var1.ad;
                  }
                  continue;
               }
            }

            gk.a(var21);
            --var1.ad;
         }
      }

      if (var1.ab != -1 && var1.au <= 1 && az.a(var1.ab).t * 443579069 == 1 && var1.aw > 0 && var1.ap <= client.Z && var1.an < client.Z) {
         var1.au = 1;
      } else {
         if (var1.ab != -1 && var1.au == 0) {
            AnimationChanged var8;
            bP var22;
            if ((var22 = az.a(var1.ab)) == null) {
               label259: {
                  var1.ab = -1;
                  if (var1 instanceof kc) {
                     switch(((kc)var1).getId()) {
                     case 8615:
                     case 8616:
                     case 8617:
                     case 8618:
                     case 8619:
                     case 8620:
                     case 8621:
                     case 8622:
                        break label259;
                     }
                  }

                  if (jE.a) {
                     var1.aA = (byte)(var1.aA | 2);
                  } else {
                     (var8 = new AnimationChanged()).setActor(var1);
                     dF.c.getCallbacks().post(var8);
                  }
               }
            } else if (!var22.b() && var22.p != null) {
               ++var1.ae;
               if (var1.ak < var22.p.length && var1.ae > var22.i[var1.ak]) {
                  var1.ae = 1;
                  ++var1.ak;
                  aV.a(var0, var22, var1.ak, var1.s, var1.n, var1 == ai.a);
               }

               if (var1.ak >= var22.p.length) {
                  var1.ak -= var22.k;
                  ++var1.av;
                  if (var1.av >= var22.y) {
                     label314: {
                        var1.ab = -1;
                        if (var1 instanceof kc) {
                           switch(((kc)var1).getId()) {
                           case 8615:
                           case 8616:
                           case 8617:
                           case 8618:
                           case 8619:
                           case 8620:
                           case 8621:
                           case 8622:
                              break label314;
                           }
                        }

                        if (jE.a) {
                           var1.aA = (byte)(var1.aA | 2);
                        } else {
                           (var8 = new AnimationChanged()).setActor(var1);
                           dF.c.getCallbacks().post(var8);
                        }
                     }
                  } else if (var1.ak >= 0 && var1.ak < var22.p.length) {
                     aV.a(var0, var22, var1.ak, var1.s, var1.n, var1 == ai.a);
                  } else {
                     label503: {
                        var1.ab = -1;
                        if (var1 instanceof kc) {
                           switch(((kc)var1).getId()) {
                           case 8615:
                           case 8616:
                           case 8617:
                           case 8618:
                           case 8619:
                           case 8620:
                           case 8621:
                           case 8622:
                              break label503;
                           }
                        }

                        if (jE.a) {
                           var1.aA = (byte)(var1.aA | 2);
                        } else {
                           (var8 = new AnimationChanged()).setActor(var1);
                           dF.c.getCallbacks().post(var8);
                        }
                     }
                  }
               }

               var1.e = var22.g;
            } else if (var22.b()) {
               ++var1.ak;
               var2 = var22.a();
               if (var1.ak < var2) {
                  aV.a(var0, var22, var1.ak, var1.s, var1.n, var1 == ai.a);
               } else {
                  var1.ak -= var22.k;
                  ++var1.av;
                  if (var1.av >= var22.y) {
                     label266: {
                        var1.ab = -1;
                        if (var1 instanceof kc) {
                           switch(((kc)var1).getId()) {
                           case 8615:
                           case 8616:
                           case 8617:
                           case 8618:
                           case 8619:
                           case 8620:
                           case 8621:
                           case 8622:
                              break label266;
                           }
                        }

                        if (jE.a) {
                           var1.aA = (byte)(var1.aA | 2);
                        } else {
                           (var8 = new AnimationChanged()).setActor(var1);
                           dF.c.getCallbacks().post(var8);
                        }
                     }
                  } else if (var1.ak >= 0 && var1.ak < var2) {
                     aV.a(var0, var22, var1.ak, var1.s, var1.n, var1 == ai.a);
                  } else {
                     label504: {
                        var1.ab = -1;
                        if (var1 instanceof kc) {
                           switch(((kc)var1).getId()) {
                           case 8615:
                           case 8616:
                           case 8617:
                           case 8618:
                           case 8619:
                           case 8620:
                           case 8621:
                           case 8622:
                              break label504;
                           }
                        }

                        if (jE.a) {
                           var1.aA = (byte)(var1.aA | 2);
                        } else {
                           (var8 = new AnimationChanged()).setActor(var1);
                           dF.c.getCallbacks().post(var8);
                        }
                     }
                  }
               }
            } else {
               label485: {
                  var1.ab = -1;
                  if (var1 instanceof kc) {
                     switch(((kc)var1).getId()) {
                     case 8615:
                     case 8616:
                     case 8617:
                     case 8618:
                     case 8619:
                     case 8620:
                     case 8621:
                     case 8622:
                        break label485;
                     }
                  }

                  if (jE.a) {
                     var1.aA = (byte)(var1.aA | 2);
                  } else {
                     (var8 = new AnimationChanged()).setActor(var1);
                     dF.c.getCallbacks().post(var8);
                  }
               }
            }
         }

         if (var1.au > 0) {
            --var1.au;
         }
      }

      jE.v();
   }

   @ObfuscatedName("lb")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-88"
   )
   static void e() {
      if (client.dU) {
         fd var0;
         if ((var0 = eu.a(jD.a, fo.b, client.dM, (byte)86)) != null && var0.bb != null) {
            jK var1;
            (var1 = new jK()).j = var0;
            var1.g = var0.bb;
            fW.a(var1);
         }

         client.ea = -1;
         client.dU = false;
         gs.a(var0);
      }

   }

   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      signature = "(Lov;IIIIIII)V",
      garbageValue = "274708225"
   )
   static final void a(fd var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (client.dj) {
         client.de = 32;
      } else {
         client.de = 0;
      }

      client.dj = false;
      int var7;
      if (gY.h == 1 || !I.b && gY.h == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.D -= -1523331788;
            gs.a(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.D += -1523331788;
            gs.a(var0);
         } else if (var5 >= var1 - client.de && var5 < client.de + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            if ((var7 = var3 * (var3 - 32) / var4) < 8) {
               var7 = 8;
            }

            int var8 = var6 - var2 - 16 - var7 / 2;
            var7 = var3 - 32 - var7;
            var0.D = var8 * (var4 - var3) / var7 * -380832947;
            gs.a(var0);
            client.dj = true;
         }
      }

      if (client.ci != 0) {
         var7 = var0.i * -1805166981;
         if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.D += client.ci * 42386569;
            gs.a(var0);
         }
      }

   }

   @ObfuscatedName("nn")
   @ObfuscatedSignature(
      signature = "(Lov;IIII)V",
      garbageValue = "-413433980"
   )
   static final void a(fd var0, int var1, int var2) {
      ey var3;
      if ((var3 = fd.a(var0, jD.a, false, -705806057)) != null) {
         if (client.eX < 3) {
            bZ.a.a(var1, var2, var3.d, var3.b, 25, 25, client.cd, 256, var3.a, var3.c);
            return;
         }

         jd.b(var1, var2, 0, var3.a, var3.c);
      }

   }

   @ObfuscatedName("od")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-15104"
   )
   static final void f() {
      client.ek = client.bU * 733503027;
      eu.b = true;
   }
}
