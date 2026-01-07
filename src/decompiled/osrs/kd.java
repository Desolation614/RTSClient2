package osrs;

import java.util.Iterator;
import net.runelite.api.Actor;
import net.runelite.api.CollisionData;
import net.runelite.api.Deque;
import net.runelite.api.IndexedObjectSet;
import net.runelite.api.Projectile;
import net.runelite.api.Scene;
import net.runelite.api.Tile;
import net.runelite.api.WorldView;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public final class kd extends hR implements WorldView {
   @ObfuscatedName("zm")
   public boolean a;
   @ObfuscatedName("zd")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   public fU b = new fU();
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 583189071
   )
   public int c;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1099364355
   )
   public int d;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "Lqx;"
   )
   gg e;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "Lsw;"
   )
   hk f;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "Lqx;"
   )
   public gg g;
   @ObfuscatedName("ag")
   int[][] h;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1634749657
   )
   int i;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "[Lkf;"
   )
   cI[] j;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -139155621
   )
   int k;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "Lqp;"
   )
   ga l;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 792933123
   )
   public int m;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -714035305
   )
   int n;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Ljg;"
   )
   public ci o;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   final fU p;
   @ObfuscatedName("ar")
   byte[][][] q;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   fU r;
   @ObfuscatedName("au")
   int[][][] s;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "Lsw;"
   )
   hk t;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   fU u;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "[[[Lqk;"
   )
   fU[][][] v;
   @ObfuscatedName("eu")
   public int[][][] w;
   @ObfuscatedName("im")
   @ObfuscatedSignature(
      signature = "[[[Lqk;"
   )
   public final fU[][][] x;
   @ObfuscatedName("my")
   public int[] y;
   @ObfuscatedName("nu")
   @ObfuscatedGetter(
      intValue = -881504341
   )
   public int z;

   @ObfuscatedSignature(
      signature = "(IIIILiz;)V"
   )
   kd(int var1, int var2, int var3, int var4, ca var5) {
      this.x = new fU[4][var2][var3];
      this.p = new fU();
      this.j = new cI[4];
      this.u = new fU();
      this.r = new fU();
      this.f = new hk(149);
      this.t = new hk(25);
      this.k = var1;
      this.d = var2;
      this.c = var3;
      this.e = new gg(var1 == -1 ? 512 : 8);
      this.g = new gg(var1 == -1 ? 128 : 8);
      this.l = new ga(var1 == -1 ? 32 : 1);
      this.v = new fU[4][var2][var3];
      this.s = new int[4][var2 + 1][var3 + 1];
      this.q = new byte[4][var2][var3];
      this.h = new int[var2][var3];
      boolean var6 = var1 != -1;

      for(int var7 = 0; var7 < 4; ++var7) {
         this.j[var7] = new cI(var2, var3, var6);
      }

      this.o = new ci(var1, 4, var2, var3, var4, var5, this.s);
      this.o.d = this;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "41"
   )
   final void a() {
      hk.a(this.f, 388884917);
      hk.a(this.t, 707897634);
      gg.a(this.e);
      gg.a(this.g);
      this.l.b();
      this.r.a();
      this.u = new fU();

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         for(int var2 = 0; var2 < this.d; ++var2) {
            for(int var3 = 0; var3 < this.c; ++var3) {
               this.v[var1][var2][var3] = null;
            }
         }
      }

      this.o.a();

      for(var1 = 0; var1 < 4; ++var1) {
         this.j[var1].a();
      }

   }

   public final IndexedObjectSet players() {
      return this.e;
   }

   public final int getPlane() {
      return this.m;
   }

   public final IndexedObjectSet npcs() {
      return this.g;
   }

   public final boolean isTopLevel() {
      return this.k == -1;
   }

   public final IndexedObjectSet worldEntities() {
      return this.l;
   }

   public final int getId() {
      return this.k;
   }

   public final Deque getGraphicsObjects() {
      return this.r;
   }

   public final int getBaseY() {
      return this.i;
   }

   public final int getBaseX() {
      return this.n;
   }

   public final int[][][] getInstanceTemplateChunks() {
      return this.w;
   }

   public final Projectile createProjectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Actor var11, int var12, int var13) {
      client var10000 = dF.c;
      return client.a(var1, var2, var3, var4, var5, var6, var7, var8, var11, var12, var13);
   }

   public final Tile getSelectedSceneTile() {
      int var1 = dF.c.isMenuOpen() ? this.o.v : this.o.R;
      int var2 = dF.c.isMenuOpen() ? this.o.n : this.o.E;
      return var1 >= this.o.an && var2 >= this.o.ah && var1 < this.o.av && var2 < this.o.al ? this.o.ak[this.getPlane()][this.o.e + var1][this.o.e + var2] : null;
   }

   public final Scene getScene() {
      return this.o;
   }

   public final int[] getMapRegions() {
      return this.y;
   }

   public final boolean isInstance() {
      return this.a;
   }

   public final CollisionData[] getCollisionMaps() {
      return this.j;
   }

   public final int getSizeY() {
      return this.c;
   }

   public final byte[][][] getTileSettings() {
      return this.q;
   }

   public final int getSizeX() {
      return this.d;
   }

   public final int[][][] getTileHeights() {
      return this.s;
   }

   @ObfuscatedName("ts")
   public final void b() {
      Iterator var1 = this.p.iterator();

      while(var1.hasNext()) {
         gD var2;
         (var2 = (gD)var1.next()).a();
         var2.b();
      }

   }

   @ObfuscatedName("uu")
   public final void c() {
      this.z = this.m * -881504341;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)Lva;",
      garbageValue = "77279217"
   )
   public static ir a(int var0) {
      ir var1;
      if ((var1 = (ir)dX.a(ir.a, (long)var0)) != null) {
         return var1;
      } else {
         byte[] var2 = fB.a(iP.b, 38, (int)var0);
         var1 = new ir();
         if (var2 != null) {
            jk var3 = new jk(var2);
            ir var15 = var1;

            label64:
            while(true) {
               while(true) {
                  int var4;
                  if ((var4 = jk.a((jk)var3, (byte)25)) == 0) {
                     break label64;
                  }

                  jk var5 = var3;
                  ir var16 = var15;
                  if (var4 == 3) {
                     int var6 = jk.a(var3, (byte)-59);
                     if (var15.d == null) {
                        var15.d = new Object[var6][];
                        var15.b = new int[var6][];
                     }

                     for(var6 = jk.a((jk)var3, (byte)32); var6 != 255; var6 = jk.a(var5, (byte)-28)) {
                        int var7;
                        int[] var8 = new int[var7 = jk.a(var5, (byte)-12)];

                        for(int var9 = 0; var9 < var7; ++var9) {
                           var8[var9] = jk.a(var5, 1910102552);
                        }

                        Object[][] var17 = var16.d;
                        var7 = jk.a(var5, 1761332735);
                        Object[] var10 = new Object[var8.length * var7];

                        for(int var11 = 0; var11 < var7; ++var11) {
                           for(int var12 = 0; var12 < var8.length; ++var12) {
                              int var13 = var12 + var8.length * var11;
                              iv var14 = de.a(var8[var12]);
                              var10[var13] = var14.a(var5);
                           }
                        }

                        var17[var6] = var10;
                        var16.b[var6] = var8;
                     }
                  } else if (var4 == 4) {
                     var15.c = var3.n();
                  }
               }
            }
         }

         ir.a(var1, (byte)-105);
         ir.a.a((im)var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("na")
   @ObfuscatedSignature(
      signature = "(Ldl;II)Lcp;",
      garbageValue = "-1889777543"
   )
   public static jG a(kd var0, int var1) {
      if (var0 == null) {
         gg var10000 = var0.e;
         long var5 = (long)var1;
         gg var2 = var10000;
         in var3 = var10000.c[(int)(var5 & (long)(var2.b - 1))];
         var2.a = var3.aM;

         in var7;
         while(true) {
            if (var3 == var2.a) {
               var2.a = null;
               var7 = null;
               break;
            }

            if (var2.a.aO == var5) {
               var3 = var2.a;
               var2.a = var2.a.aM;
               var7 = var3;
               break;
            }

            var2.a = var2.a.aM;
         }

         jG var8 = (jG)var7;
      }

      return (jG)var0.e.a((long)var1);
   }

   @ObfuscatedName("pi")
   @ObfuscatedSignature(
      signature = "(I)Ldl;"
   )
   public static kd b(int var0) {
      return var0 == -1 ? aM.a : client.ag.b(var0);
   }

   @ObfuscatedName("rc")
   @ObfuscatedSignature(
      signature = "(Ldl;IIILik;II)V",
      garbageValue = "1576849375"
   )
   public static void a(kd var0, int var1, int var2, int var3, bJ var4, int var5) {
      int var6;
      int var7;
      int var8;
      if (var0 == null) {
         int var12 = var1;
         var6 = var1;
         kd var10 = var0;
         if (var4 != null && bJ.a(var4, (byte)-29)) {
            label115: {
               int var13 = var4.z * 114269115;
               int var14 = var4.D * 3692313;
               if (var1 == 1 || var1 == 3) {
                  var13 = var4.k * 248167153;
                  var14 = var4.I * 317434925;
               }

               int var11 = var13 + var1 << 7;
               var13 = var1 + var14 << 7;
               var7 = var1 << 7;
               var8 = var1 << 7;
               var14 = var4.L * 332434449;
               int var15 = var4.L * 1947703547 << 7;
               int var16 = var4.L << 7;
               bJ var9;
               if (var4.v != null && (var9 = bJ.b(var4, (byte)0)) != null) {
                  if (var1 == 541892438) {
                     break label115;
                  }

                  var14 = var9.F * 604993141;
                  var15 = var9.m * 878510295 << 7;
                  var16 = var9.l * -692053209 << 7;
               }

               for(gD var19 = (gD)fU.e(var0.p); var19 != null; var19 = (gD)fU.b(var10.p)) {
                  if (var19.c == var6 && var19.k == var7) {
                     if (var12 == 541892438) {
                        break;
                     }

                     if (var19.c == var8 && var19.m == var11) {
                        if (var12 == 541892438) {
                           break;
                        }

                        if (var19.f * -31212479 == var13 && var19.f == var14) {
                           if (var12 == 541892438) {
                              break;
                           }

                           if (gD.a(var19, -629119022) == var15 && var19.m == var16) {
                              var19.b();
                              var19.a();
                              gk.a(var19);
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if (var4 != null && bJ.a(var4, (byte)-29)) {
         var6 = var4.q * -1313509743;
         var7 = var4.o;
         if (var5 == 1 || var5 == 3) {
            var6 = var4.o;
            var7 = var4.q * -1313509743;
         }

         var5 = var6 + var2 << 7;
         var6 = var3 + var7 << 7;
         var2 <<= 7;
         var3 <<= 7;
         var7 = var4.I;
         var8 = var4.M << 7;
         int var20 = var4.L << 7;
         if (var4.v != null && (var4 = bJ.b(var4, (byte)0)) != null) {
            var7 = var4.I;
            var8 = var4.M << 7;
            var20 = var4.L << 7;
         }

         for(gD var18 = (gD)fU.e(var0.p); var18 != null; var18 = (gD)fU.b(var0.p)) {
            if (var18.i == var1 && var18.m == var2 && var18.h == var3 && var18.k == var5 && var18.c == var6 && var18.f * -31212479 == var7 && gD.a(var18, -629119022) == var8 && var18.g == var20) {
               var18.a();
               var18.b();
               gk.a(var18);
               return;
            }
         }
      }

   }
}
