package osrs;

import net.runelite.api.Actor;
import net.runelite.api.Animation;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public final class jQ extends ct implements Projectile {
   @ObfuscatedName("pi")
   static int[][] a;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -89573569
   )
   int b;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 58643479
   )
   int c = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 3329409
   )
   int d;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 780683861
   )
   int e;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 523619617
   )
   int f;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1715101287
   )
   int g;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1072675713
   )
   int h;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -979611933
   )
   int i;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -2046465727
   )
   int j;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 122389861
   )
   int k;
   @ObfuscatedName("ak")
   double l;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -442517587
   )
   int m;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -638285973
   )
   int n;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -982957147
   )
   int o;
   @ObfuscatedName("ao")
   double p;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1760636453
   )
   int q;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1728656389
   )
   int r = 0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1528490365
   )
   int s;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1279225121
   )
   private int z;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 2065503699
   )
   int t;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 599838015
   )
   int u;
   @ObfuscatedName("av")
   boolean v = false;
   @ObfuscatedName("aw")
   double w;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   bP x;
   @ObfuscatedName("az")
   double y;

   jQ(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      this.q = var1;
      this.k = var2;
      this.o = var3;
      this.j = var4;
      this.m = var5;
      this.d = var6;
      this.b = var7;
      this.n = var8;
      this.i = var9;
      this.h = var10;
      this.z = var11;
      this.u = var12;
      this.s = var13;
      this.e = var14;
      this.g = var15;
      if ((var1 = eT.a(this.z).e) != -1) {
         this.x = az.a(var1);
      } else {
         this.x = null;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)Ljm;",
      garbageValue = "27"
   )
   protected final cn k() {
      cn var1;
      if ((var1 = eT.a(this.z).a(this.c)) == null) {
         return null;
      } else {
         int var3 = this.f;
         cn var2 = var1;
         int var4 = cn.b[var3];
         var3 = cn.k[var3];

         for(int var5 = 0; var5 < var2.y; ++var5) {
            int var6 = var3 * (int)var2.af[var5] - var4 * (int)var2.x[var5] >> 16;
            var2.x[var5] = (float)(var4 * (int)var2.af[var5] + var3 * (int)var2.x[var5] >> 16);
            var2.af[var5] = (float)var6;
         }

         var2.e();
         return var1;
      }
   }

   @ObfuscatedName("dm")
   public final void a(int var1, int var2) {
      this.k += var1;
      this.o += var2;
      this.b += var1;
      this.n += var2;
      this.l += (double)(var1 << 7);
      this.y += (double)(var2 << 7);
   }

   public final int getSourceLevel() {
      return this.q;
   }

   public final int getEndCycle() {
      return this.s;
   }

   public final LocalPoint getTarget() {
      return LocalPoint.fromWorld(osrs.aM.a, this.b, this.n);
   }

   public final double getY() {
      return this.y;
   }

   public final int getX1() {
      return LocalPoint.fromWorld(osrs.aM.a, this.k, this.o).getX();
   }

   public final int getEndHeight() {
      return this.i;
   }

   public final int getRemainingCycles() {
      int var1 = dF.c.getGameCycle();
      return this.getEndCycle() - var1;
   }

   public final int getTargetLevel() {
      return this.d;
   }

   public final Actor getSourceActor() {
      int var1 = this.m;
      kd var2 = osrs.aM.a;
      long var5;
      if (var1 > 0) {
         --var1;
         var5 = (long)var1;
         return (Actor)var2.g.a(var5);
      } else if (var1 < 0) {
         var1 = -var1 - 1;
         var5 = (long)var1;
         return (Actor)var2.e.a(var5);
      } else {
         return null;
      }
   }

   public final int getId() {
      return this.z;
   }

   public final Animation getAnimation() {
      return this.x;
   }

   public final Actor getTargetActor() {
      int var1 = this.h;
      kd var2 = osrs.aM.a;
      long var5;
      if (var1 > 0) {
         --var1;
         var5 = (long)var1;
         return (Actor)var2.g.a(var5);
      } else if (var1 < 0) {
         var1 = -var1 - 1;
         var5 = (long)var1;
         return (Actor)var2.e.a(var5);
      } else {
         return null;
      }
   }

   public final WorldPoint getTargetPoint() {
      return new WorldPoint(this.b, this.n, this.d);
   }

   public final int getHeight() {
      return this.j;
   }

   public final int getStartCycle() {
      return this.u;
   }

   public final int getOrientation() {
      return this.t;
   }

   public final int getSlope() {
      return this.e;
   }

   public final int getStartPos() {
      return this.g;
   }

   public final int getAnimationFrame() {
      return this.c;
   }

   public final void setEndCycle(int var1) {
      this.s = var1;
   }

   public final WorldPoint getSourcePoint() {
      return new WorldPoint(this.k, this.o, this.q);
   }

   public final int getY1() {
      return LocalPoint.fromWorld(osrs.aM.a, this.k, this.o).getY();
   }

   public final double getX() {
      return this.l;
   }

   public final double getZ() {
      return this.w;
   }

   public final int getStartHeight() {
      return this.j;
   }

   public final int getFloor() {
      return this.getSourceLevel();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "1517681272"
   )
   static void a(byte[] var0) {
      jk var1;
      (var1 = new jk(var0)).c = var0.length - 2;
      iR.b = new int[iR.f = var1.d()];
      ej.c = new int[iR.f];
      eL.a = new int[iR.f];
      aQ.a = new int[iR.f];
      iR.a = new byte[iR.f][];
      var1.c = var0.length - 7 - (iR.f << 3);
      iR.c = var1.d();
      iR.e = var1.d();
      int var2 = (jk.a((jk)var1, (byte)57) & 255) + 1;

      int var3;
      for(var3 = 0; var3 < iR.f; ++var3) {
         iR.b[var3] = var1.d();
      }

      for(var3 = 0; var3 < iR.f; ++var3) {
         ej.c[var3] = var1.d();
      }

      for(var3 = 0; var3 < iR.f; ++var3) {
         eL.a[var3] = var1.d();
      }

      for(var3 = 0; var3 < iR.f; ++var3) {
         aQ.a[var3] = var1.d();
      }

      var1.c = var0.length - 7 - (iR.f << 3) - (var2 - 1) * 3;
      iR.d = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         iR.d[var3] = var1.f();
         if (iR.d[var3] == 0) {
            iR.d[var3] = 1;
         }
      }

      var1.c = 0;

      for(var3 = 0; var3 < iR.f; ++var3) {
         int var7 = eL.a[var3];
         var2 = aQ.a[var3];
         int var4;
         byte[] var5 = new byte[var4 = var7 * var2];
         iR.a[var3] = var5;
         int var6;
         if ((var6 = jk.a((jk)var1, (byte)29)) == 0) {
            for(var6 = 0; var6 < var4; ++var6) {
               var5[var6] = var1.B();
            }
         } else if (var6 == 1) {
            for(var6 = 0; var6 < var7; ++var6) {
               for(var4 = 0; var4 < var2; ++var4) {
                  var5[var6 + var7 * var4] = var1.B();
               }
            }
         }
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Throwable;Ljava/lang/String;)Lxi;"
   )
   public static jv a(Throwable var0, String var1) {
      jv var2;
      if (var0 instanceof jv) {
         var2 = (jv)var0;
      } else {
         var2 = new jv(var0, "");
      }

      if (!var1.endsWith("()")) {
         if (var2.c.length() != 0) {
            var2.c = var2.c + " ";
         }

         var2.c = var2.c + var1;
      }

      return var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1583947370"
   )
   public static int a(int var0) {
      return var0 >>> 4 & iE.a;
   }

   @ObfuscatedName("lo")
   @ObfuscatedSignature(
      signature = "(IIB)Lkn;",
      garbageValue = "-34"
   )
   static gh b(int var0, int var1) {
      client.ai.e = var0;
      client.ai.c = var1;
      client.ai.d = 1;
      client.ai.b = 1;
      return client.ai;
   }
}
