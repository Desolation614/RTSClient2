package osrs;

import net.runelite.api.Projection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public abstract class cj implements Projection {
   @ObfuscatedName("bd")
   static boolean e;

   cj() {
   }

   @ObfuscatedName("ys")
   @ObfuscatedSignature(
      signature = "(Ljr;IIIIJ)V"
   )
   public final void b(ct var1, int var2, int var3, int var4, int var5, long var6) {
      this.a(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedName("yx")
   @ObfuscatedSignature(
      signature = "(Ljg;Lkb;III)V"
   )
   public void a(ci var1, cE var2, int var3, int var4, int var5) {
      this.b(var1, var2, var3, var4, var5);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(Ljg;Lkb;IIIIIIIIIIIIIIB)V",
      garbageValue = "-39"
   )
   static void a(ci var0, cE var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      try {
         cK var16;
         int var17 = (var16 = cc.d).i;
         int var18 = var16.c;
         int var19 = var16.f;
         int var20 = var18 + var4 * var17 / var12;
         int var21 = var19 + var17 * var8 / var12;
         int var22 = var17 * var5 / var13 + var18;
         int var23 = var19 + var9 * var17 / var13;
         int var24 = var17 * var6 / var14 + var18;
         int var25 = var10 * var17 / var14 + var19;
         var18 += var17 * var7 / var15;
         var17 = var17 * var11 / var15 + var19;
         float var32 = cm.b(var12);
         float var26 = cm.b(var13);
         float var27 = cm.b(var14);
         float var28 = cm.b(var15);
         var16.l = 0;
         kB var29 = var0.ak[var0.d.m][var2 + var0.e][var3 + var0.e];
         float var30;
         int var33;
         if ((var23 - var17) * (var24 - var18) - (var25 - var17) * (var22 - var18) > 0) {
            if (ci.a(var0.K, var0.aa, var25, var17, var23, var24, var18, var22)) {
               if ((var30 = a(var0.K, var0.aa, var24, var18, var22, var25, var17, var23, var27, var28, var26)) > var0.y) {
                  var0.a(var2, var3, var30);
               }

               if (var0.K >= dF.c.getViewportXOffset() && var0.K < dF.c.getViewportXOffset() + dF.c.getViewportWidth() && var0.aa >= dF.c.getViewportYOffset() && var0.aa < dF.c.getViewportYOffset() + dF.c.getViewportHeight() && var29 != null && var1 == var29.f()) {
                  var0.j(var2, var3, var29.e());
               }
            }

            if (!dF.c.isGpu()) {
               var16.e = false;
               var33 = var16.o;
               if (var24 < 0 || var18 < 0 || var22 < 0 || var24 > var33 || var18 > var33 || var22 > var33) {
                  var16.e = true;
               }

               if (var1.e == -1) {
                  if (var1.f != 12345678) {
                     cm.c(var25, var17, var23, var24, var18, var22, var27, var28, var26, var1.f, var1.c, var1.d * -530915411);
                  }
               } else if (!ci.a) {
                  if (var1.b) {
                     cm.c(var25, var17, var23, var24, var18, var22, var27, var28, var26, var1.f, var1.c, var1.d * -530915411, var4, var5, var7, var8, var9, var11, var12, var13, var15, var1.e);
                  } else {
                     cm.c(var25, var17, var23, var24, var18, var22, var27, var28, var26, var1.f, var1.c, var1.d * -530915411, var6, var7, var5, var10, var11, var9, var14, var15, var13, var1.e);
                  }
               } else {
                  var6 = var16.a.e(var1.e);
                  cm.c(var25, var17, var23, var24, var18, var22, var27, var28, var26, ci.b(var6, var1.f), ci.b(var6, var1.c), ci.b(var6, var1.d * -530915411));
               }
            }
         }

         if ((var17 - var23) * (var20 - var22) - (var21 - var23) * (var18 - var22) > 0) {
            if (ci.a(var0.K, var0.aa, var21, var23, var17, var20, var22, var18)) {
               if ((var30 = a(var0.K, var0.aa, var20, var22, var18, var21, var23, var17, var32, var26, var28)) > var0.y) {
                  var0.a(var2, var3, var30);
               }

               if (var0.K >= dF.c.getViewportXOffset() && var0.K < dF.c.getViewportXOffset() + dF.c.getViewportWidth() && var0.aa >= dF.c.getViewportYOffset() && var0.aa < dF.c.getViewportYOffset() + dF.c.getViewportHeight() && var29 != null && var1 == var29.f()) {
                  var0.j(var2, var3, var29.e());
               }
            }

            if (!dF.c.isGpu()) {
               var16.e = false;
               var33 = var16.o;
               if (var20 < 0 || var22 < 0 || var18 < 0 || var20 > var33 || var22 > var33 || var18 > var33) {
                  var16.e = true;
               }

               if (var1.e == -1) {
                  if (var1.g != 12345678) {
                     cm.c(var21, var23, var17, var20, var22, var18, var32, var26, var28, var1.g, var1.d * -530915411, var1.c);
                     return;
                  }
               } else {
                  if (!ci.a) {
                     cm.c(var21, var23, var17, var20, var22, var18, var32, var26, var28, var1.g, var1.d * -530915411, var1.c, var4, var5, var7, var8, var9, var11, var12, var13, var15, var1.e);
                     return;
                  }

                  var6 = var16.a.e(var1.e);
                  cm.c(var21, var23, var17, var20, var22, var18, var32, var26, var28, ci.b(var6, var1.g), ci.b(var6, var1.d * -530915411), ci.b(var6, var1.c));
               }
            }
         }

      } catch (Exception var31) {
         client.cV.warn("error during underlay rendering", var31);
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Ljg;Ljn;III)V",
      garbageValue = "-302086052"
   )
   static void c(ci var0, co var1, int var2, int var3) {
      try {
         cK var4 = cc.d;
         boolean var5 = dF.c.isGpu();
         if (client.dd != null) {
            client.dd.drawSceneTileModel(var0, var1, var2, var3);
         }

         kB var6 = var0.ak[var0.d.m][var2 + var0.e][var3 + var0.e];
         var4.l = 0;
         int var7 = var1.i.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            int var9 = var1.i[var8];
            int var10 = var1.k[var8];
            int var11 = var1.u[var8];
            int var12 = co.f[var9];
            int var13 = co.f[var10];
            int var14 = co.f[var11];
            int var15 = co.c[var9];
            int var16 = co.c[var10];
            int var17 = co.c[var11];
            float var18 = co.d[var9];
            float var19 = co.d[var10];
            float var20 = co.d[var11];
            if ((var12 - var13) * (var17 - var16) - (var15 - var16) * (var14 - var13) > 0) {
               if (ci.a(var0.K, var0.aa, var15, var16, var17, var12, var13, var14)) {
                  float var21;
                  if ((var21 = a(var0.K, var0.aa, var12, var13, var14, var15, var16, var17, var18, var19, var20)) > var0.y) {
                     var0.a(var2, var3, var21);
                  }

                  if (var6 != null && var1 == var6.i() && var0.K >= dF.c.getViewportXOffset() && var0.K < dF.c.getViewportXOffset() + dF.c.getViewportWidth() && var0.aa >= dF.c.getViewportYOffset() && var0.aa < dF.c.getViewportYOffset() + dF.c.getViewportHeight()) {
                     var0.j(var2, var3, var6.e());
                  }
               }

               if (!var5) {
                  var4.e = false;
                  int var23 = var4.o;
                  if (var12 < 0 || var13 < 0 || var14 < 0 || var12 > var23 || var13 > var23 || var14 > var23) {
                     var4.e = true;
                  }

                  if (var1.l != null && var1.l[var8] != -1) {
                     if (!ci.a) {
                        if (var1.h) {
                           cm.c(var15, var16, var17, var12, var13, var14, var18, var19, var20, var1.s[var8], var1.q[var8], var1.j[var8], co.b[0], co.b[1], co.b[3], co.a[0], co.a[1], co.a[3], co.e[0], co.e[1], co.e[3], var1.l[var8]);
                        } else {
                           cm.c(var15, var16, var17, var12, var13, var14, var18, var19, var20, var1.s[var8], var1.q[var8], var1.j[var8], co.b[var9], co.b[var10], co.b[var11], co.a[var9], co.a[var10], co.a[var11], co.e[var9], co.e[var10], co.e[var11], var1.l[var8]);
                        }
                     } else {
                        var9 = var4.a.e(var1.l[var8]);
                        cm.c(var15, var16, var17, var12, var13, var14, var18, var19, var20, ci.b(var9, var1.s[var8]), ci.b(var9, var1.q[var8]), ci.b(var9, var1.j[var8]));
                     }
                  } else if (var1.s[var8] != 12345678) {
                     cm.c(var15, var16, var17, var12, var13, var14, var18, var19, var20, var1.s[var8], var1.q[var8], var1.j[var8]);
                  }
               }
            }
         }

      } catch (Exception var22) {
         client.cV.warn("error during overlay rendering", var22);
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Ljg;Lkb;IIIB)V",
      garbageValue = "83"
   )
   abstract void b(ci var1, cE var2, int var3, int var4, int var5);

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljg;Ljn;III)V",
      garbageValue = "-1298388971"
   )
   abstract void a(ci var1, co var2, int var3, int var4);

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Ljr;IIIIJ)V"
   )
   abstract void a(ct var1, int var2, int var3, int var4, int var5, long var6);

   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      signature = "(Ljg;Ljn;II)V"
   )
   public void b(ci var1, co var2, int var3, int var4) {
      this.a(var1, var2, var3, var4);
   }

   @ObfuscatedName("cx")
   private static float a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      return gU.a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      signature = "(ILnp;ZI)V",
      garbageValue = "-758324581"
   )
   static void a(int var0, ew var1, boolean var2) {
      df var6 = er.b.a(var0);
      int var3 = ai.a.bj * -226423085;
      int var4 = (ai.a.s >> 7) + aM.a.n;
      int var5 = (ai.a.n >> 7) + aM.a.i;
      ew var7 = new ew(var3, var4, var5);
      ip.a(er.b, var6, var7, var1, var2, -2003427000);
   }
}
