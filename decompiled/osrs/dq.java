package osrs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.api.worldmap.WorldMapRegion;
import net.runelite.api.worldmap.WorldMapRenderer;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public final class dq implements WorldMapRenderer {
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "Lls;"
   )
   private dA e;
   @ObfuscatedName("ac")
   private boolean f = false;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1493741963
   )
   int a;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1264926639
   )
   int b;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "[[Lle;"
   )
   private dk[][] g;
   @ObfuscatedName("ah")
   HashMap c;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -599154697
   )
   public int d = 0;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   private fB h;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1772006567
   )
   private int i;
   @ObfuscatedName("al")
   private boolean j = false;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "Lwd;"
   )
   private iT k;
   @ObfuscatedName("an")
   private HashMap l;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   private fB m;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "[Lwy;"
   )
   private jp[] n;
   @ObfuscatedName("au")
   private HashMap o = new HashMap();
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1452882287
   )
   private int p;

   @ObfuscatedSignature(
      signature = "([Lwy;Ljava/util/HashMap;Lps;Lps;)V"
   )
   public dq(jp[] var1, HashMap var2, fB var3, fB var4) {
      this.n = var1;
      this.l = var2;
      this.m = var3;
      this.h = var4;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(IIIII)Llx;",
      garbageValue = "-115325263"
   )
   private dE a(int var1, int var2, int var3, int var4) {
      dE var5 = new dE(this);
      var1 += this.a;
      var2 += this.b;
      var3 += this.a;
      var4 += this.b;
      var1 /= 64;
      var2 /= 64;
      var3 /= 64;
      var4 /= 64;
      var5.e = var3 - var1 + 1;
      var5.c = var4 - var2 + 1;
      var5.d = var1 - df.c(this.e, 1430663035);
      var5.b = var2 - df.a(this.e, -1321050795);
      if (var5.d < 0) {
         var5.e += var5.d;
         var5.d = 0;
      }

      if (var5.d > this.g.length - var5.e) {
         var5.e = this.g.length - var5.d;
      }

      if (var5.b < 0) {
         var5.c += var5.b;
         var5.b = 0;
      }

      if (var5.b > this.g[0].length - var5.c) {
         var5.c = this.g[0].length - var5.b;
      }

      var5.e = Math.min(var5.e, this.g.length);
      var5.c = Math.min(var5.c, this.g[0].length);
      return var5;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIIII)Ljava/util/List;",
      garbageValue = "-1845243284"
   )
   public final List a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var16 = new LinkedList();
      if (!this.j) {
         return var16;
      } else {
         dE var14 = this.a(var1, var2, var3, var4);
         float var15 = b();
         var4 = (int)(64.0F * var15);
         var1 += this.a;
         var2 += this.b;

         for(int var11 = var14.d; var11 < var14.e + var14.d; ++var11) {
            for(int var12 = var14.b; var12 < var14.b + var14.c; ++var12) {
               List var13;
               if (!(var13 = dk.a(this.g[var11][var12], var5 + var4 * ((this.g[var11][var12].c << 6) - var1) / 64, var8 + var6 - var4 * ((this.g[var11][var12].h << 6) - var2 + 64) / 64, var4, var9, var10)).isEmpty()) {
                  var16.addAll(var13);
               }
            }
         }

         return var16;
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(I)Ljava/util/HashMap;",
      garbageValue = "388286579"
   )
   public final HashMap a() {
      this.c();
      return this.c;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
      garbageValue = "-1946906411"
   )
   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, HashSet var8, HashSet var9, int var10, int var11, boolean var12) {
      dE var32 = this.a(var1, var2, var3, var4);
      float var33 = b();
      var4 = (int)(64.0F * var33);
      var1 += this.a;
      var2 += this.b;

      int var13;
      dk var14;
      dk var10000;
      int var21;
      int var35;
      for(var6 = var32.d; var6 < var32.d + var32.e; ++var6) {
         for(var13 = var32.b; var13 < var32.c + var32.b; ++var13) {
            if (var12) {
               Iterator var16 = this.g[var6][var13].e.values().iterator();

               while(var16.hasNext()) {
                  dz var17;
                  if ((var17 = (dz)var16.next()) instanceof dc) {
                     ((dc)var17).e();
                  }
               }
            }

            var10000 = this.g[var6][var13];
            int var10001 = var5 + var4 * ((this.g[var6][var13].c << 6) - var1) / 64;
            int var10002 = var7 - var4 * ((this.g[var6][var13].h << 6) - var2 + 64) / 64;
            HashSet var18 = var8;
            var35 = var10002;
            int var15 = var10001;
            var14 = var10000;
            if (var8 == null) {
               var18 = new HashSet();
            }

            int var23 = var4;
            HashSet var22 = var18;
            var21 = var35;
            int var20 = var15;
            dk var19 = var14;
            float var24;
            float var25 = (var24 = (float)var4 / 64.0F) / 2.0F;
            Iterator var26 = var14.e.entrySet().iterator();

            int var46;
            while(var26.hasNext()) {
               Entry var27;
               ew var28 = (ew)(var27 = (Entry)var26.next()).getKey();
               int var29 = (int)((float)var20 + var24 * (float)var28.b - var25);
               var46 = (int)((float)(var21 + var23) - var24 * (float)(var28.c * -1165521101) - var25);
               dz var43;
               if ((var43 = (dz)var27.getValue()) != null && var43.i()) {
                  var43.d = var29;
                  var43.c = var46 * 398647695;
                  bi var30 = aL.a(var43.b());
                  if (!var22.contains(var30.g)) {
                     var19.a(var43, var29, var46, var24);
                  }
               }
            }

            var22 = var18;
            var21 = var35;
            var20 = var15;
            var19 = var14;
            var24 = (float)var4 / 64.0F;
            Iterator var40 = var14.d.iterator();

            while(var40.hasNext()) {
               dz var42;
               if ((var42 = (dz)var40.next()).i()) {
                  int var44 = var42.b.b % 64;
                  var46 = var42.b.c * -1165521101 % 64;
                  var42.d = (int)((float)var20 + (float)var44 * var24);
                  var42.c = (int)((float)var21 + var24 * (float)(63 - var46)) * 398647695;
                  if (!var22.contains(var42.b())) {
                     var19.a(var42, var42.d, var42.c * 1918705007, var24);
                  }
               }
            }
         }
      }

      if (var9 != null && var10 > 0) {
         for(var6 = var32.d; var6 < var32.d + var32.e; ++var6) {
            for(var13 = var32.b; var13 < var32.c + var32.b; ++var13) {
               var10000 = this.g[var6][var13];
               int var36 = var11;
               var35 = var10;
               HashSet var34 = var9;
               var14 = var10000;
               Iterator var37 = var10000.e.values().iterator();

               while(var37.hasNext()) {
                  dz var38;
                  if ((var38 = (dz)var37.next()).i()) {
                     var21 = var38.b();
                     if (var34.contains(var21)) {
                        dk.a(aL.a(var21), var38.d, var38.c * 1918705007, var35, var36);
                     }
                  }
               }

               int var41 = var36;
               int var39 = var35;
               HashSet var31 = var34;
               Iterator var45 = var14.d.iterator();

               while(var45.hasNext()) {
                  dz var47;
                  bi var48;
                  if ((var47 = (dz)var45.next()).i() && (var48 = aL.a(var47.b())) != null && var31.contains(var48.g)) {
                     dk.a(var48, var47.d, var47.c * 1918705007, var39, var41);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lps;Ljava/lang/String;ZB)V",
      garbageValue = "-76"
   )
   public final void a(fB var1, String var2, boolean var3) {
      if (!this.f) {
         this.j = false;
         this.f = true;
         System.nanoTime();
         int var4 = var1.b(dh.d.f);
         var4 = var1.a(var4, var2);
         jk var5 = new jk(var1.c(dh.d.f, var2));
         jk var6 = new jk(var1.c(dh.a.f, var2));
         System.nanoTime();
         System.nanoTime();
         this.e = new dA();

         try {
            dA.a(this.e, var5, var6, var4, var3);
         } catch (IllegalStateException var13) {
            return;
         }

         df.e(this.e, -1278014505);
         this.e.b();
         this.e.a();
         this.a = df.c(this.e, 881712588) << 6;
         this.b = df.a(this.e, -639715506) << 6;
         this.i = this.e.e - df.c(this.e, -448106679) + 1 << 6;
         this.p = this.e.l - df.a(this.e, -791098278) + 1 << 6;
         int var14 = this.e.e - df.c(this.e, 379639612) + 1;
         var4 = this.e.l - df.a(this.e, -1172687867) + 1;
         System.nanoTime();
         System.nanoTime();
         dG.b();
         this.g = new dk[var14][var4];
         Iterator var15 = this.e.n.iterator();

         int var7;
         int var10;
         dk var10000;
         dk var19;
         List var23;
         while(var15.hasNext()) {
            cP var16;
            var7 = (var16 = (cP)var15.next()).k;
            int var8 = var16.h;
            int var9 = var7 - df.c(this.e, -666490909);
            var10 = var8 - df.a(this.e, -1735100004);
            this.g[var9][var10] = new dk(var7, var8, this.e.f, this.l);
            var10000 = this.g[var9][var10];
            var23 = this.e.p;
            var19 = var10000;
            var10000.e.clear();
            var19.g = var16;
            var19.a(var23);
         }

         for(int var17 = 0; var17 < var14; ++var17) {
            for(var7 = 0; var7 < var4; ++var7) {
               if (this.g[var17][var7] == null) {
                  this.g[var17][var7] = new dk(df.c(this.e, 173081566) + var17, df.a(this.e, -1720731949) + var7, this.e.f, this.l);
                  var10000 = this.g[var17][var7];
                  var23 = this.e.p;
                  HashSet var21 = this.e.o;
                  var19 = var10000;
                  var10000.e.clear();
                  var15 = var21.iterator();

                  while(var15.hasNext()) {
                     dB var22;
                     dB var25 = var22 = (dB)var15.next();
                     int var11 = -480931281;
                     dB var24 = var25;
                     if (var25 == null) {
                        int var26 = var24.g * 1535591097;
                     }

                     if (var24.k == var19.c && var22.h == var19.h) {
                        var19.f.add(var22);
                     }
                  }

                  var19.a(var23);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.b(dh.c.f, var2)) {
            byte[] var18 = var1.c(dh.c.f, var2);
            this.k = cA.a(var18);
         }

         System.nanoTime();
         fB var20 = var1;

         for(var10 = 0; var10 < var20.f.length; ++var10) {
            if (var20.f[var10] instanceof eg) {
               ((eg)var20.f[var10]).b();
            }

            var20.f[var10] = null;
         }

         var1.b();
         this.j = true;
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(IIB)F",
      garbageValue = "0"
   )
   private static float b() {
      client var10000 = dF.c;
      return client.k().getWorldMapZoom();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1307961963"
   )
   private void c() {
      if (this.c == null) {
         this.c = new HashMap();
      }

      this.c.clear();

      for(int var1 = 0; var1 < this.g.length; ++var1) {
         for(int var2 = 0; var2 < this.g[var1].length; ++var2) {
            Iterator var3 = this.g[var1][var2].b().iterator();

            while(var3.hasNext()) {
               dz var4;
               if ((var4 = (dz)var3.next()).i()) {
                  int var5 = var4.b();
                  if (!this.c.containsKey(var5)) {
                     LinkedList var6;
                     (var6 = new LinkedList()).add(var4);
                     this.c.put(var5, var6);
                  } else {
                     ((List)this.c.get(var5)).add(var4);
                  }
               }
            }
         }
      }

   }

   public final boolean isLoaded() {
      return this.j;
   }

   public final WorldMapRegion[][] getMapRegions() {
      return this.g;
   }

   @ObfuscatedName("lf")
   @ObfuscatedSignature(
      signature = "(Llk;IIIILjava/util/HashSet;III)V",
      garbageValue = "1180530337"
   )
   public static void a(dq var0, int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (var0 == null) {
         int var16 = var1;
         int var12 = var1;
         int var11 = var1;
         int var10 = var1;
         int var9 = var1;
         dq var8 = var0;
         if (var0.k != null) {
            iT var17 = var0.k;
            if (var1 == 256) {
               var17.a(var1, var1);
            } else {
               int var18 = var1 + var17.d;
               int var19 = var1 + var17.c;
               int var22 = var18 + var19 * jd.i;
               int var23 = 0;
               int var24 = var17.e;
               int var25 = var17.a;
               int var26 = jd.i - var25;
               int var27 = 0;
               int var28;
               if (var19 < jd.l) {
                  var28 = jd.l - var19;
                  var24 -= var28;
                  var19 = jd.l;
                  var23 = 0 + var28 * var25;
                  var22 += var28 * jd.i;
               }

               if (var24 + var19 > jd.k) {
                  var24 -= var24 + var19 - jd.k;
               }

               if (var18 < jd.n) {
                  var28 = jd.n - var18;
                  var25 -= var28;
                  var18 = jd.n;
                  var23 += var28;
                  var22 += var28;
                  var27 = var28 + 0;
                  var26 += var28;
               }

               if (var25 + var18 > jd.m) {
                  var28 = var25 + var18 - jd.m;
                  var25 -= var28;
                  var27 += var28;
                  var26 += var28;
               }

               if (var25 > 0 && var24 > 0) {
                  iT.a(jd.h, var17.b, var23, var22, var25, var24, var26, var27, var1, var1);
               }
            }

            if (var1 > 0 && var1 % var1 < var1 / 2) {
               if (var0.c == null) {
                  var0.c();
               }

               Iterator var13 = var5.iterator();

               label91:
               while(true) {
                  int var14;
                  List var34;
                  do {
                     if (!var13.hasNext() || var16 == -1908194828) {
                        break label91;
                     }

                     var14 = (Integer)var13.next();
                  } while((var34 = (List)var8.o.get(var14)) == null);

                  Iterator var35 = var34.iterator();

                  while(var35.hasNext()) {
                     dz var15 = (dz)var35.next();
                     int var37 = var11 * (var15.e.b - var8.b * 672753381) / (var8.p * 1962314679);
                     int var36 = var12 - (var15.b.c * -1165521101 - var8.a * -79501587) * var12 / (var8.b * -438152639);
                     jd.p(var37 + var9, var36 + var10, 2, 16776960, 256);
                  }
               }
            }
         }
      }

      if (var0.k != null) {
         var0.k.a(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (var0.c == null) {
               var0.c();
            }

            Iterator var29 = var5.iterator();

            while(true) {
               List var30;
               do {
                  if (!var29.hasNext()) {
                     return;
                  }

                  var6 = (Integer)var29.next();
               } while((var30 = (List)var0.c.get(var6)) == null);

               Iterator var31 = var30.iterator();

               while(var31.hasNext()) {
                  dz var32 = (dz)var31.next();
                  int var33 = var3 * (var32.b.b - var0.a) / var0.i;
                  var7 = var4 - var4 * (var32.b.c * -1165521101 - var0.b) / var0.p;
                  jd.i(var33 + var1, var7 + var2, 2, 16776960, 256);
               }
            }
         }
      }

   }

   @ObfuscatedName("qj")
   @ObfuscatedSignature(
      signature = "(Llk;B)Z"
   )
   public static boolean a(dq var0, byte var1) {
      return var0 == null ? var0.j : var0.j;
   }

   @ObfuscatedName("su")
   @ObfuscatedSignature(
      signature = "(Llk;IIIIIIIII)V",
      garbageValue = "-518553220"
   )
   public static void a(dq var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8;
      int var9;
      int var12;
      int var14;
      dk var10000;
      int var10001;
      dl var10002;
      int var30;
      int var31;
      int var32;
      int var33;
      int var34;
      int var37;
      int var41;
      int var62;
      int var63;
      int var64;
      int var73;
      int var76;
      int var77;
      if (var0 == null) {
         var73 = var1;
         var30 = var1;
         int var72 = var1;
         dq var65 = var0;
         int[] var75 = jd.h;
         var76 = jd.m;
         var77 = jd.l;
         float[] var78 = jd.o;
         int[] var79;
         jd.c(var79 = new int[4]);
         dE var69 = var0.a(var1, var1, var1, var1);
         float var60;
         var8 = (int)Math.ceil((double)(var60 = b()));
         var0.d = var8;
         if (!var0.c.containsKey(var8)) {
            dl var61;
            (var61 = new dl(var8)).a();
            var0.c.put(var8, var61);
         }

         var9 = var69.e * 414439011 + var69.b * -1771513005 - 1;
         var62 = var69.b * -706506175 + var69.b - 1;

         dk var70;
         for(var63 = var69.b * -185781479; var63 <= var9; ++var63) {
            if (var73 <= -706562264) {
               return;
            }

            for(var12 = var69.c * -708477503; var12 <= var62; ++var12) {
               var10000 = var65.g[var63][var12];
               var10002 = (dl)var65.c.get(var8);
               double var89 = 0.725D;
               fB var84 = var65.h;
               fB var83 = var65.h;
               jp[] var82 = var65.n;
               dl var81 = var10002;
               var70 = var10000;
               var10000.i = var8;
               if ((var70.g != null || !var70.f.isEmpty()) && ic.a(var70.c, var70.h, var8) == null) {
                  if (cc.b() != 0.725D) {
                     cc.a(0.725D);
                  }

                  boolean var85 = true & var70.a(var83);
                  if (var70.g != null) {
                     var37 = var70.g.l;
                  } else {
                     var37 = ((dy)var70.f.getFirst()).l;
                  }

                  if (var85 & fB.c(var84, var37)) {
                     dp var86;
                     byte[] var87;
                     if ((var87 = fB.b(var84, var37)) == null) {
                        var86 = new dp();
                     } else {
                        var86 = new dp(cA.a(var87).b);
                     }

                     iT var88;
                     (var88 = new iT(var70.i << 6, var70.i << 6)).f();
                     if (var70.g != null) {
                        dk.a(var70, var81, var82, var86, 508626597);
                     } else {
                        dk.b(var70, var81, var82, var86, 1870955333);
                     }

                     var41 = var70.c;
                     int var56 = var70.h;
                     var1 = var70.i;
                     dk.a.a(var88, aR.a(var41, var56, var1), var88.b.length << 2);
                     var70.a();
                  }
               }
            }
         }

         cc.a(var75, var76, var77, var78);
         jd.e(var79);
         var63 = (int)(var60 * 64.0F);
         var12 = var65.i * 673776515 + var1;
         var62 = var65.i * 1608905287 + var1;

         for(var64 = var69.d; var64 < var69.b * -185781479 + var69.b * -1771513005; ++var64) {
            for(var14 = var69.b; var14 < var69.b + var69.e * -1228128869; ++var14) {
               var10000 = var65.g[var64][var14];
               var10001 = var72 + var63 * (var65.g[var64][var14].h * 1455916736 - var12) / 64;
               int var90 = var30 - var63 * ((var65.g[var64][var14].h << 6) - var62 + 64) / 64;
               var34 = 1597190833;
               var32 = var90;
               var31 = var10001;
               var70 = var10000;
               if ((var33 = var63 % 4) == 0) {
                  jd.g(var70.i * var31, var70.i * (63 - var32), var70.i * -1961869864, 1597190833);
               }

               if (var33 == 1) {
                  jd.f(var70.i * var31 * 1717750542, var70.i * (63 - var32), var70.i, 1597190833);
               }

               if (var33 == 2) {
                  jd.g(var70.i * var31 * 957735432 + var70.i - 1, (79517949 - var32) * var70.i * 1566929701, var70.i, 1597190833);
               }

               if (var33 == 3) {
                  jd.f(var70.i * var31, (1893745814 - var32) * var70.i * -151745846 + var70.i - 1, var70.i, 1597190833);
               }
            }
         }

      } else {
         int[] var59 = jd.h;
         var8 = jd.i;
         var9 = jd.j;
         float[] var10 = jd.o;
         int[] var11;
         jd.b(var11 = new int[4]);
         dE var57 = var0.a(var1, var2, var3, var4);
         float var58;
         var12 = (int)Math.ceil((double)(var58 = b()));
         var0.d = var12;
         if (!var0.o.containsKey(var12)) {
            dl var13;
            (var13 = new dl(var12)).a(1899428840);
            var0.o.put(var12, var13);
         }

         var64 = var57.e + var57.d - 1;
         var14 = var57.c + var57.b - 1;

         int var15;
         int var16;
         dk var17;
         int var18;
         int var27;
         int var28;
         int var67;
         for(var15 = var57.d; var15 <= var64; ++var15) {
            for(var16 = var57.b; var16 <= var14; ++var16) {
               var10000 = var0.g[var15][var16];
               var10002 = (dl)var0.o.get(var12);
               double var29 = 0.725D;
               fB var22 = var0.h;
               fB var21 = var0.m;
               jp[] var20 = var0.n;
               dl var19 = var10002;
               var17 = var10000;
               var10000.i = var12;
               if ((var17.g != null || !var17.f.isEmpty()) && ic.a(var17.c, var17.h, var12) == null) {
                  if (cc.b() != 0.725D) {
                     cc.a(0.725D);
                  }

                  boolean var23 = true & var17.a(var21);
                  if (var17.g != null) {
                     var18 = var17.g.l;
                  } else {
                     var18 = ((dy)var17.f.getFirst()).l;
                  }

                  if (var23 & fB.c(var22, var18)) {
                     byte[] var24;
                     dp var25;
                     if ((var24 = fB.b(var22, var18)) == null) {
                        var25 = new dp();
                     } else {
                        var25 = new dp(cA.a(var24).b);
                     }

                     iT var26;
                     (var26 = new iT(var17.i << 6, var17.i << 6)).f();
                     if (var17.g != null) {
                        dk.a(var17, var19, var20, var25, 1398773083);
                     } else {
                        dk.b(var17, var19, var20, var25, 1810456643);
                     }

                     var27 = var17.c;
                     var28 = var17.h;
                     var67 = var17.i;
                     dk.a.a(var26, aR.a(var27, var28, var67), var26.b.length << 2);
                     var17.a();
                  }
               }
            }
         }

         cc.a(var59, var8, var9, var10);
         jd.a(var11);
         var15 = (int)(var58 * 64.0F);
         var16 = var0.a + var1;
         var1 = var2 + var0.b;

         for(var2 = var57.d; var2 < var57.d + var57.e; ++var2) {
            for(var4 = var57.b; var4 < var57.b + var57.c; ++var4) {
               var10000 = var0.g[var2][var4];
               var10001 = var5 + var15 * ((var0.g[var2][var4].c << 6) - var16) / 64;
               int var66 = var7 - ((var0.g[var2][var4].h << 6) - var1 + 64) * var15 / 64;
               var18 = var10001;
               var17 = var10000;
               iT var71;
               if ((var71 = ic.a(var10000.c, var17.h, var17.i)) != null) {
                  if (var15 == var17.i << 6) {
                     var71.b(var18, var66);
                  } else {
                     var10001 = var18;
                     int var74 = var15;
                     var18 = var15;
                     var73 = var66;
                     var30 = var10001;
                     iT var80 = var71;
                     if (var15 > var71.g || var15 > var71.f) {
                        throw new IllegalArgumentException();
                     }

                     var76 = var15 * var71.d / var71.g + var30;
                     var77 = (var15 * (var71.d + var71.a) + var71.g - 1) / var71.g + var30;
                     var27 = var66 + var15 * var71.c / var71.f;
                     var28 = var66 + (var71.f + (var71.c + var71.e) * var15 - 1) / var71.f;
                     if (var76 < jd.n) {
                        var76 = jd.n;
                     }

                     if (var77 > jd.m) {
                        var77 = jd.m;
                     }

                     if (var27 < jd.l) {
                        var27 = jd.l;
                     }

                     if (var28 > jd.k) {
                        var28 = jd.k;
                     }

                     if (var76 < var77 && var27 < var28) {
                        var67 = var76 + var27 * jd.i;
                        var6 = jd.i - (var77 - var76);
                        if (var67 < jd.h.length) {
                           for(var8 = var27; var8 < var28; ++var8) {
                              for(var9 = var76; var9 < var77; ++var9) {
                                 var62 = var9 - var30 << 4;
                                 var63 = var8 - var73 << 4;
                                 var12 = var62 * var80.g / var18 - (var80.d << 4);
                                 var62 = (var62 + 16) * var80.g / var18 - (var80.d << 4);
                                 var64 = var63 * var80.f / var74 - (var80.c << 4);
                                 var14 = (var63 + 16) * var80.f / var74 - (var80.c << 4);
                                 int var68;
                                 if ((var68 = (var62 - var12) * (var14 - var64) >> 1) != 0) {
                                    if (var12 < 0) {
                                       var12 = 0;
                                    }

                                    if (var62 >= var80.a << 4) {
                                       var62 = var80.a << 4;
                                    }

                                    if (var64 < 0) {
                                       var64 = 0;
                                    }

                                    if (var14 >= var80.e << 4) {
                                       var14 = var80.e << 4;
                                    }

                                    --var62;
                                    --var14;
                                    var31 = 16 - (var12 & 15);
                                    var32 = (var62 & 15) + 1;
                                    var33 = 16 - (var64 & 15);
                                    var34 = (var14 & 15) + 1;
                                    var12 >>= 4;
                                    var62 >>= 4;
                                    var64 >>= 4;
                                    var14 >>= 4;
                                    int var35 = 0;
                                    int var54 = 0;
                                    int var55 = 0;
                                    int var36 = 0;

                                    for(var37 = var64; var37 <= var14; ++var37) {
                                       int var38 = 16;
                                       if (var37 == var64) {
                                          var38 = var33;
                                       }

                                       if (var37 == var14) {
                                          var38 = var34;
                                       }

                                       for(int var39 = var12; var39 <= var62; ++var39) {
                                          int var40;
                                          if ((var40 = var80.b[var39 + var37 * var80.a]) != 0) {
                                             if (var39 == var12) {
                                                var41 = var38 * var31;
                                             } else if (var39 == var62) {
                                                var41 = var38 * var32;
                                             } else {
                                                var41 = var38 << 4;
                                             }

                                             var36 += var41;
                                             var35 += var41 * (var40 >> 16 & 255);
                                             var54 += var41 * (var40 >> 8 & 255);
                                             var55 += (var40 & 255) * var41;
                                          }
                                       }
                                    }

                                    if (var36 >= var68) {
                                       if ((var37 = var55 / var36 + (var35 / var36 << 16) + (var54 / var36 << 8)) == 0) {
                                          var37 = 1;
                                       }

                                       jd.h[var67] = var37 | -16777216;
                                    }

                                    ++var67;
                                 }
                              }

                              var67 += var6;
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("wl")
   @ObfuscatedSignature(
      signature = "(Llk;B)I"
   )
   public static int b(dq var0, byte var1) {
      return var0 == null ? var0.e.g : var0.e.g;
   }
}
