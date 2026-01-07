package osrs;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import net.runelite.api.DecorativeObject;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Renderable;
import net.runelite.api.TileObject;
import net.runelite.api.WorldView;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.geometry.Shapes;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
public final class cD implements DecorativeObject, TileObject {
   @ObfuscatedName("zo")
   public int a;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 647786003
   )
   int b;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1958462383
   )
   int c;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1393213525
   )
   int d;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 11828785
   )
   int e;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      longValue = -7395594187873777427L
   )
   public long f = 0L;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Ljr;"
   )
   public ct g;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1093110903
   )
   int h;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1318744095
   )
   int i;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1149136133
   )
   int j;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Ljr;"
   )
   public ct k;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1938687773
   )
   int l = 0;

   cD() {
   }

   @ObfuscatedName("ne")
   private int c() {
      int var1;
      if ((long)(var1 = (int)(this.getHash() >> 52 & 4095L)) == 4095L) {
         var1 = -1;
      }

      return var1;
   }

   @ObfuscatedName("qx")
   @ObfuscatedSignature(
      signature = "()Ljm;"
   )
   private cn d() {
      ct var1;
      if ((var1 = this.k) == null) {
         return null;
      } else {
         cn var2;
         if (var1 instanceof cn) {
            var2 = (cn)var1;
         } else {
            var2 = var1.j();
         }

         return var2;
      }
   }

   public final Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(dF.c, this.getLocalLocation(), this.getPlane(), var1);
   }

   public final long getHash() {
      return this.f;
   }

   public final int getX() {
      return this.c;
   }

   public final LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY(), this.c());
   }

   public final int getY() {
      return this.b;
   }

   public final int getPlane() {
      return this.a;
   }

   public final int getXOffset() {
      return this.j;
   }

   public final int getZ() {
      return this.h;
   }

   public final int getYOffset() {
      return this.d;
   }

   public final Shape getConvexHull() {
      cn var1;
      return (var1 = this.e()) == null ? null : var1.a(this.getX() + this.getXOffset(), this.getY() + this.getYOffset(), 0, this.getZ());
   }

   public final Shape getClickbox() {
      Shape var1 = Perspective.getClickbox(dF.c, this.e(), 0, this.getX() + this.getXOffset(), this.getY() + this.getYOffset(), this.getZ());
      Shape var2 = Perspective.getClickbox(dF.c, this.d(), 0, this.getX(), this.getY(), this.getZ());
      if (var1 == null && var2 == null) {
         return null;
      } else if (var1 != null && var2 != null) {
         return new Shapes(new Shape[]{var1, var2});
      } else {
         return var1 != null ? var1 : var2;
      }
   }

   public final Shape getConvexHull2() {
      cn var1;
      return (var1 = this.d()) == null ? null : var1.a(this.getX(), this.getY(), 0, this.getZ());
   }

   public final int getId() {
      return (int)(this.getHash() >>> 20);
   }

   public final Polygon getCanvasTilePoly() {
      return Perspective.getCanvasTileAreaPoly(dF.c, this.getLocalLocation(), 1, 1, this.getPlane(), 0);
   }

   public final Renderable getRenderable2() {
      return this.k;
   }

   public final Point getMinimapLocation() {
      return Perspective.localToMinimap(dF.c, this.getLocalLocation());
   }

   public final Renderable getRenderable() {
      return this.g;
   }

   public final int getConfig() {
      return this.l;
   }

   public final WorldPoint getWorldLocation() {
      return WorldPoint.fromLocal(dF.c, this.getX(), this.getY(), this.getPlane());
   }

   public final WorldView getWorldView() {
      return kd.b(this.c());
   }

   public final Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(dF.c, var1, this.getLocalLocation(), var2, var3);
   }

   public final Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   @ObfuscatedName("sd")
   @ObfuscatedSignature(
      signature = "()Ljm;"
   )
   private cn e() {
      ct var1;
      if ((var1 = this.g) == null) {
         return null;
      } else {
         cn var2;
         if (var1 instanceof cn) {
            var2 = (cn)var1;
         } else {
            var2 = var1.j();
         }

         return var2;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lrz;I)Lrz;",
      garbageValue = "818557913"
   )
   public static gL a(gL var0) {
      synchronized(gL.c) {
         if (gL.b == 0) {
            return new gL(var0);
         } else {
            gL.a(gL.c[--gL.b], var0, -1662681798);
            return gL.c[gL.b];
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "543543108"
   )
   static void a() {
      jI.b.b();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lro;FFFI)F",
      garbageValue = "1011476231"
   )
   static float a(gz var0, float var1, float var2, float var3) {
      if (Math.abs(var3 = cV.a(var0.b, var0.a, var1)) < ap.a) {
         return var1;
      } else {
         float var4;
         if (Math.abs(var4 = cV.a(var0.b, var0.a, var2)) < ap.a) {
            return var2;
         } else {
            float var5 = 0.0F;
            float var6 = 0.0F;
            float var7 = 0.0F;
            float var8 = 0.0F;
            boolean var9 = true;

            boolean var10;
            do {
               var10 = false;
               if (var9) {
                  var5 = var1;
                  var8 = var3;
                  var7 = var6 = var2 - var1;
                  var9 = false;
               }

               if (Math.abs(var8) < Math.abs(var4)) {
                  var1 = var2;
                  var2 = var5;
                  var5 = var1;
                  var3 = var4;
                  var4 = var8;
                  var8 = var3;
               }

               float var11 = ap.b * Math.abs(var2) + 0.0F;
               float var12;
               if (Math.abs(var12 = (var5 - var2) * 0.5F) > var11 && var4 != 0.0F) {
                  if (!(Math.abs(var7) < var11) && !(Math.abs(var3) <= Math.abs(var4))) {
                     float var14 = var4 / var3;
                     if (var1 == var5) {
                        var1 = var14 * var12 * 2.0F;
                        var3 = 1.0F - var14;
                     } else {
                        var3 /= var8;
                        float var13 = var4 / var8;
                        var1 = var14 * ((var3 - var13) * var3 * 2.0F * var12 - (var2 - var1) * (var13 - 1.0F));
                        var3 = (var14 - 1.0F) * (var3 - 1.0F) * (var13 - 1.0F);
                     }

                     if ((double)var1 > 0.0D) {
                        var3 = -var3;
                     } else {
                        var1 = -var1;
                     }

                     var14 = var7;
                     var7 = var6;
                     if (var1 * 2.0F < var3 * 3.0F * var12 - Math.abs(var3 * var11) && var1 < Math.abs(0.5F * var14 * var3)) {
                        var6 = var1 / var3;
                     } else {
                        var6 = var12;
                        var7 = var12;
                     }
                  } else {
                     var6 = var12;
                     var7 = var12;
                  }

                  var1 = var2;
                  var3 = var4;
                  if (Math.abs(var6) > var11) {
                     var2 += var6;
                  } else if ((double)var12 > 0.0D) {
                     var2 += var11;
                  } else {
                     var2 -= var11;
                  }

                  if ((double)((var4 = cV.a(var0.b, var0.a, var2)) * (var8 / Math.abs(var8))) > 0.0D) {
                     var9 = true;
                  }

                  var10 = true;
               }
            } while(var10);

            return var2;
         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-435382010"
   )
   public static void b() {
      bx.a.b();
   }

   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      signature = "(Lml;I)V",
      garbageValue = "1201152666"
   )
   static final void a(dR var0) {
      jo var1 = client.P.i;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var17;
      int var18;
      int var28;
      if (dR.n == var0) {
         var2 = jk.f(var1, -1900104473);
         var4 = (var3 = jk.d((jk)var1, 1687107415)) >> 28;
         var5 = ew.d(var3);
         var6 = var3 & 16383;
         var7 = jk.a((jo)var1, (byte)7);
         var17 = var1.d();
         var8 = var1.D();
         var9 = ec.a.m;
         var10 = (var8 >> 4 & 7) + hm.a + ec.a.n;
         var11 = (var8 & 7) + bG.e + ec.a.i;
         var12 = jk.f(var1, -1314325991);
         var13 = var1.y();
         var28 = jk.f(var1, -1689698719);
         var3 = jk.a((jk)var1, (byte)29);
         int var38 = jk.b(var1, (byte)-64);
         var18 = var1.H();
         if (var17 != 65535) {
            jQ var40 = new jQ(var9, var10, var11, var7, var18, var4, var5, var6, var2, var13, var17, var12 + client.Z, var28 + client.Z, var3, var38);
            fU.a((fU)client.aw, var40);
         }

      } else {
         int var10000;
         int var10001;
         fU var20;
         kk var22;
         if (dR.i == var0) {
            var2 = jk.b(var1, (byte)-6);
            var4 = ((var3 = var1.D()) >> 4 & 7) + hm.a;
            var5 = (var3 & 7) + bG.e;
            var6 = var1.I();
            var7 = ec.a.m;
            if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
               var10000 = client.cW == -1 ? var7 : client.cW;
               var10001 = var4;
               var4 = var6;
               var3 = var2;
               var18 = var10001;
               var17 = var10000;
               if ((var20 = ec.a.v[var17][var18][var5]) != null) {
                  for(var22 = (kk)fU.e(var20); var22 != null; var22 = (kk)fU.b(var20)) {
                     if (var3 == var22.h && var4 == var22.e) {
                        gk.a(var22);
                        break;
                     }
                  }

                  if (fU.e(var20) == null) {
                     ec.a.v[var17][var18][var5] = null;
                  }

                  dE.a(var17, var18, var5);
               }

               return;
            }
         } else if (dR.l == var0) {
            var3 = (var2 = var1.G()) >> 2;
            var4 = var2 & 3;
            var5 = client.W[var3];
            var7 = ((var6 = var1.D()) >> 4 & 7) + hm.a;
            var17 = (var6 & 7) + bG.e;
            if (var7 >= 0 && var17 >= 0 && var7 < ec.a.d && var17 < ec.a.c) {
               var8 = client.cW == -1 ? ec.a.m : client.cW;
               dF.a(ec.a, var8, var7, var17, var5, -1, var3, var4, 31, (String[])null, 0, -1);
               return;
            }
         } else if (dR.k == var0) {
            var2 = jk.c(var1, (byte)-20);
            var3 = jk.b(var1, (byte)-29);
            var5 = ((var4 = var1.D()) >> 4 & 7) + hm.a;
            var6 = (var4 & 7) + bG.e;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
               var10000 = client.cW == -1 ? ec.a.m : client.cW;
               var4 = var2;
               var3 = var3;
               var17 = var10000;
               if ((var20 = ec.a.v[var17][var5][var6]) != null) {
                  for(var22 = (kk)fU.e(var20); var22 != null; var22 = (kk)fU.b(var20)) {
                     if (var3 == var22.h && var4 == var22.e) {
                        var22.d = null;
                        break;
                     }
                  }

                  dE.a(var17, var5, var6);
               }

               return;
            }
         } else if (dR.e == var0) {
            var3 = ((var2 = jk.a((jk)var1, (byte)26)) >> 4 & 7) + hm.a;
            var4 = (var2 & 7) + bG.e;
            var5 = jk.b(var1, (byte)-33);
            var7 = (var6 = var1.G()) >> 2;
            var17 = var6 & 3;
            var8 = client.W[var7];
            if (var3 >= 0 && var3 < 103 && var4 >= 0 && var4 < 103) {
               var9 = client.cW == -1 ? ec.a.m : client.cW;
               ik var15;
               if ((var15 = dj.a(ec.a, var9, var3, var4, var8)) != null && jT.b(var15.h).N) {
                  af.a(var9, var3, var4, var7, var17, var8, var5);
                  var15.n = var5;
                  return;
               }

               if (af.a(var9, var3, var4, var7, var17, var8, var5)) {
                  return;
               }

               if (var15 != null) {
                  var15.n = var5;
               }

               return;
            }
         } else if (dR.d == var0) {
            var3 = ((var2 = var1.D()) >> 4 & 7) + hm.a;
            var4 = (var2 & 7) + bG.e;
            var5 = jk.a((jo)var1, (byte)7);
            var6 = jk.c(var1, -499234783);
            var7 = jk.b(var1, (byte)-57);
            if (var3 >= 0 && var4 >= 0 && var3 < ec.a.d && var4 < ec.a.c) {
               var3 = (var3 << 7) + 64;
               var4 = (var4 << 7) + 64;
               var17 = client.cW == -1 ? ec.a.m : client.cW;
               fY var29 = new fY(ec.a, var7, var17, var3, var4, bW.a(ec.a, var3, var4, var17) - var6, var5, client.Z);
               fU.a((fU)ec.a.r, var29);
               return;
            }
         } else {
            int var10006;
            if (dR.a == var0) {
               var2 = jk.f(var1, -1875423286);
               var4 = ((var3 = jk.c(var1, -499234783)) >> 4 & 7) + hm.a;
               var5 = (var3 & 7) + bG.e;
               var6 = jk.c(var1, -499234783);
               var7 = var1.z();
               var17 = jk.f(var1, -1395035523);
               var8 = var1.d();
               boolean var36 = var1.D() == 1;
               var10 = jk.a((jk)var1, (byte)-2);
               if (var4 >= 0 && var5 >= 0 && var4 < ec.a.d && var5 < ec.a.c) {
                  var10000 = client.cW == -1 ? ec.a.m : client.cW;
                  var10001 = var4;
                  int var10004 = var7;
                  var10006 = var8;
                  var8 = var6;
                  var7 = var17;
                  var6 = var10006;
                  var4 = var10004;
                  var18 = var10001;
                  var17 = var10000;
                  kk var27;
                  (var27 = new kk()).h = var2;
                  var27.a(var4);
                  var27.e = var4;
                  var27.c = var10;
                  var27.g = client.bA + var6;
                  var27.f = var7 + client.bA;
                  var27.i = var8;
                  var27.b = var36;
                  if (ec.a.v[var17][var18][var5] == null) {
                     ec.a.v[var17][var18][var5] = new fU();
                  }

                  fU.a((fU)ec.a.v[var17][var18][var5], var27);
                  dE.a(var17, var18, var5);
               }

               return;
            }

            if (dR.j == var0) {
               var3 = ((var2 = jk.a((jk)var1, (byte)49)) >> 4 & 7) + hm.a;
               var4 = (var2 & 7) + bG.e;
               var5 = var1.d();
               var6 = var1.I();
               var7 = jk.c(var1, (byte)-30);
               if (var3 >= 0 && var4 >= 0 && var3 < ec.a.d && var4 < ec.a.c) {
                  u.a(client.cW == -1 ? ec.a.m : client.cW, var3, var4, var5, var7, var6);
                  return;
               }
            } else {
               byte var30;
               if (dR.b == var0) {
                  var3 = ((var2 = jk.a((jk)var1, (byte)-63)) >> 4 & 7) + hm.a;
                  var4 = (var2 & 7) + bG.e;
                  var30 = jk.i(var1, 217767970);
                  var6 = jk.a((jk)var1, (byte)50) << 2;
                  var7 = var1.d();
                  var17 = var1.G();
                  var8 = var1.d();
                  var9 = var1.G() << 2;
                  byte var39 = var1.A();
                  var11 = jk.a(var1, 1238449082);
                  var12 = var1.d();
                  var13 = jk.f(var1, -1171811820);
                  var28 = var1.H();
                  if (var7 != 65535) {
                     var3 += ec.a.n;
                     var4 += ec.a.i;
                     var5 = var30 + var3;
                     var10 = var39 + var4;
                     jQ var19 = new jQ(ec.a.m, var3, var4, var6, var28, ec.a.m, var5, var10, var9, var11, var7, var12 + client.Z, var13 + client.Z, var17, var8);
                     fU.a((fU)client.aw, var19);
                  }

                  return;
               }

               if (dR.c == var0) {
                  var2 = jk.b(var1, (byte)-9);
                  var3 = var1.z();
                  var4 = jk.e(var1, 1835893014);
                  var6 = ((var5 = var1.G()) >> 4 & 7) + hm.a;
                  var7 = (var5 & 7) + bG.e;
                  short var34 = (short)var1.E();
                  var8 = var1.E();
                  short var37 = (short)var1.F();
                  var10 = jk.b(var1, (byte)-19);
                  if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                     var10000 = client.cW == -1 ? ec.a.m : client.cW;
                     var10001 = var6;
                     var10006 = var8;
                     var8 = var4;
                     var6 = var10006;
                     var4 = var3;
                     var3 = var10;
                     var18 = var10001;
                     var17 = var10000;
                     fU var25;
                     if ((var25 = ec.a.v[var17][var18][var7]) != null) {
                        for(kk var26 = (kk)fU.e(var25); var26 != null; var26 = (kk)fU.b(var25)) {
                           if (var3 == var26.h && var4 == var26.e) {
                              aC var23;
                              if ((var23 = var26.d) == null) {
                                 var23 = new aC(var3);
                              }

                              if (aC.a(var23, (byte)24) && var6 >= 0 && var6 < var23.f.length) {
                                 var23.f[var6] = var37;
                              }

                              if (var23.c != null && var8 >= 0 && var8 < var23.c.length) {
                                 var23.c[var8] = var34;
                              }

                              if (var2 >= 0) {
                                 var23.i = var2;
                                 var23.h = null;
                              }

                              var26.d = var23;
                              break;
                           }
                        }

                        dE.a(var17, var18, var7);
                     }
                  }

                  return;
               }

               if (dR.m == var0) {
                  var2 = jk.b(var1, (byte)-57);
                  var3 = var1.D();
                  var5 = (var4 = var1.G()) >> 2;
                  var6 = var4 & 3;
                  var7 = client.W[var5];
                  var8 = ((var17 = jk.a((jk)var1, (byte)-42)) >> 4 & 7) + hm.a;
                  var9 = (var17 & 7) + bG.e;
                  var10 = jk.c(var1, -499234783);
                  String[] var32 = null;
                  if (var10 > 0) {
                     var32 = new String[5];

                     for(var12 = 0; var12 < var10; ++var12) {
                        var13 = var1.D();
                        String var35 = var1.p();
                        if (var13 >= 0 && var13 < 5) {
                           var32[var13] = var35;
                        }
                     }
                  }

                  if (var8 >= 0 && var9 >= 0 && var8 < ec.a.d && var9 < ec.a.c) {
                     var12 = client.cW == -1 ? ec.a.m : client.cW;
                     dF.a(ec.a, var12, var8, var9, var7, var2, var5, var6, var3, var32, 0, -1);
                  }

                  return;
               }

               if (dR.g == var0) {
                  var3 = ((var2 = jk.c(var1, -499234783)) >> 4 & 7) + hm.a;
                  var4 = (var2 & 7) + bG.e;
                  var5 = var1.D();
                  var6 = jk.a((jo)var1, (byte)7);
                  var7 = var1.G();
                  var17 = jk.c(var1, -499234783) & 31;
                  var8 = var1.G();
                  if (var3 >= 0 && var4 >= 0 && var3 < ec.a.d && var4 < ec.a.c) {
                     var9 = var17 + 1;
                     if (ai.a.aa[0] >= var3 - var9 && ai.a.aa[0] <= var3 + var9 && ai.a.az[0] >= var4 - var9 && ai.a.az[0] <= var9 + var4) {
                        var10000 = ec.a.k;
                        if (osrs.j.aS.h != 0 && var5 > 0 && jC.c < 50) {
                           cw.a(ec.a.k, var6, var3, var4, var17, var8, var5, var7, false);
                        }

                        return;
                     }
                  }
               } else {
                  if (dR.h == var0) {
                     var2 = jk.f(var1, -895811856);
                     var4 = ((var3 = jk.a((jk)var1, (byte)-59)) >> 4 & 7) + hm.a;
                     var5 = (var3 & 7) + bG.e;
                     var6 = jk.a((jk)var1, (byte)52);
                     var7 = ec.a.m;
                     if (var4 >= 0 && var5 >= 0 && var4 < ec.a.d && var5 < ec.a.c) {
                        fU var31;
                        if ((var31 = ec.a.v[var7][var4][var5]) != null) {
                           for(kk var33 = (kk)fU.e(var31); var33 != null; var33 = (kk)fU.b(var31)) {
                              if (var2 == var33.h) {
                                 var33.c = var6;
                                 break;
                              }
                           }
                        }

                        if (var4 >= 0 && var5 >= 0 && var4 < ec.a.d && var5 < ec.a.c) {
                           fw.a(client.cW == -1 ? ec.a.m : client.cW, var4, var5, var2, var6);
                        }

                        return;
                     }
                  }

                  if (dR.f == var0) {
                     var30 = var1.A();
                     var4 = (var3 = jk.a((jk)var1, (byte)104)) >> 2;
                     var5 = var3 & 3;
                     var6 = client.W[var4];
                     var17 = ((var7 = jk.a((jk)var1, (byte)58)) >> 4 & 7) + hm.a;
                     var8 = (var7 & 7) + bG.e;
                     byte var24 = var1.B();
                     var10 = var1.d();
                     var11 = jk.f(var1, -984514392);
                     var12 = var1.d();
                     var13 = jk.b(var1, (byte)-52);
                     byte var14 = var1.B();
                     byte var21 = var1.g();
                     jG var16;
                     if (var13 == client.au) {
                        var16 = ai.a;
                     } else {
                        var16 = (jG)ec.a.e.a((long)var13);
                     }

                     if (var16 != null) {
                        dh.a(client.cW == -1 ? ec.a.m : client.cW, var17, var8, var4, var5, var6, var11, var12, var10, var30, var24, var14, var21, var16);
                     }
                  }
               }
            }
         }

      }
   }
}
