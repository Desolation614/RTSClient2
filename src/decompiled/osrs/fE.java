package osrs;

import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class fE extends fB {
   @ObfuscatedName("ac")
   private static CRC32 v = new CRC32();
   @ObfuscatedName("md")
   private static boolean w = !fE.class.desiredAssertionStatus();
   @ObfuscatedName("aa")
   boolean m = false;
   @ObfuscatedName("ad")
   boolean n = false;
   @ObfuscatedName("af")
   volatile boolean[] o;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "Ltb;"
   )
   hp p;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "Ltb;"
   )
   hp q;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1498055627
   )
   private int x = -1;
   @ObfuscatedName("am")
   boolean r = false;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 7418749
   )
   volatile int s = 0;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "Lpm;"
   )
   fv t;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1498055627
   )
   private int y;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 111504285
   )
   int u;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1174618069
   )
   private int z;

   @ObfuscatedSignature(
      signature = "(Ltb;Ltb;Lpm;IZZZZZ)V"
   )
   public fE(hp var1, hp var2, fv var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      super(var5, var6);
      this.q = var1;
      this.p = var2;
      this.u = var4;
      this.m = var7;
      this.n = var8;
      this.r = var9;
      this.t = var3;
      int var11 = this.u;
      fv var10 = this.t;
      if (this.n) {
         if (!this.r) {
            if (var11 <= var10.i) {
               throw new RuntimeException("");
            }

            if (var11 < var10.h) {
               var10.h = var11;
            }
         }
      } else {
         if (var11 >= var10.h) {
            throw new RuntimeException("");
         }

         if (var11 > var10.i) {
            var10.i = var11;
         }
      }

      if (var10.f != null) {
         fv.a(var10, this, var11, (byte)118);
      } else {
         var10.a((fE)null, fJ.p.A, 255, 0, (byte)0, true);
         var10.j[var11] = this;
      }

      if (var4 >= 0 && var4 < 21) {
         client.C[var4] = this;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-81273982"
   )
   final void c(int var1, int var2) {
      this.z = var1;
      this.y = var2 * -1004132169;
      if (this.p != null) {
         cB.a(this.u, this.p, this);
      } else {
         this.t.a(this, fJ.p.A, this.u, this.z, (byte)0, true);
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1812723925"
   )
   public final int c() {
      if (this.s == 1 || this.n && this.s == 2) {
         return 100;
      } else if (super.f != null) {
         return 99;
      } else {
         int var1;
         if ((var1 = fv.a(this.t, fJ.p.A, this.u, (byte)-61)) >= 100) {
            var1 = 99;
         }

         return var1;
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1136974801"
   )
   final int a(int var1) {
      if (super.f[var1] != null) {
         return 100;
      } else {
         return this.o[var1] ? 100 : fv.a(this.t, this.u, var1, (byte)-40);
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "24291"
   )
   final void b(int var1) {
      if (this.q != null && this.o != null && this.o[var1]) {
         cB.a(var1, this.q, this);
      } else {
         this.t.a(this, this.u, var1, super.g[var1], (byte)2, true);
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1813905262"
   )
   final void d() {
      this.s = 2;
      super.i = new int[0];
      super.g = new int[0];
      super.k = new int[0];
      super.c = new int[0];
      super.j = new int[0][];
      super.f = new Object[0];
      super.b = new Object[0][];
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ltb;I[BZI)V",
      garbageValue = "1916701713"
   )
   public final void a(hp var1, int var2, byte[] var3, boolean var4) {
      int var8;
      if (var1 == this.p) {
         if (this.s == 1) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            this.t.b(this, 255, this.u, this.z, (byte)0, true);
            return;
         }

         synchronized(v) {
            v.reset();
            v.update(var3, 0, var3.length);
            var8 = (int)v.getValue();
         }

         if (var8 != this.z) {
            this.t.b(this, 255, this.u, this.z, (byte)0, true);
            return;
         }

         jk var10;
         if ((var8 = jk.a((jk)(var10 = new jk(cv.a(var3))), (byte)2)) < 5 || var8 > 7) {
            throw new RuntimeException(var8 + "," + this.u + "," + var2);
         }

         int var9 = 0;
         if (var8 >= 6) {
            var9 = jk.d(var10, 1687107415);
         }

         if (this.y * 447821063 == var9) {
            this.a(var3);
            b(this, 1033134005);
            return;
         }

         this.t.b(this, 255, this.u, this.z, (byte)0, true);
      } else {
         if (!var4 && var2 == this.x) {
            this.s = 1;
         }

         if (var3 != null && var3.length > 2) {
            synchronized(v) {
               v.reset();
               v.update(var3, 0, var3.length - 2);
               var8 = (int)v.getValue();
            }

            int var5 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
            if (var8 == super.g[var2] && (super.k[var2] & '\uffff') == var5) {
               this.o[var2] = true;
               if (var4) {
                  if (!w && super.f[var2] != null) {
                     throw new AssertionError();
                  }

                  Object[] var10000 = super.f;
                  Object var10002;
                  if (var3 == null) {
                     var10002 = null;
                  } else if (var3.length > 136) {
                     (var2 = new eg()).a(var3);
                     var10002 = var2;
                  } else {
                     var10002 = var3;
                  }

                  var10000[var2] = var10002;
                  return;
               }
            } else {
               this.o[var2] = false;
               if (this.m || var4) {
                  this.t.b(this, this.u, (int)var2, super.g[var2], (byte)2, var4);
               }
            }

            return;
         } else {
            this.o[var2] = false;
            if (this.m || var4) {
               this.t.b(this, this.u, (int)var2, super.g[var2], (byte)2, var4);
            }
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "54"
   )
   final void c(int var1) {
      fv var10000 = this.t;
      int var10002 = var1;
      boolean var19 = true;
      int var3 = var10002;
      int var2 = this.u;
      fv var20 = var10000;
      fn var21;
      if (var10000 == null) {
         var10000 = var20;
         var3 = var2;
         var2 = var2;
         var20 = var20;
         synchronized(var10000) {
            long var15 = (long)(var3 + (var2 << 16));
            if ((var21 = (fn)gb.a(var20.e, var15)) != null) {
               gj var22 = var20.g;
               if (var21.aK != null) {
                  var21.n();
               }

               var21.aK = var22.a.aK;
               var21.aL = var22.a;
               var21.aK.aL = var21;
               var21.aL.aK = var21;
            }

         }
      } else {
         synchronized(var20) {
            long var7 = (long)(var3 + (var2 << 16));
            if ((var21 = (fn)gb.a(var20.e, var7)) != null) {
               var20.g.a(var21);
            }

         }
      }
   }

   @ObfuscatedName("oy")
   public final void c(String var1) {
      String var2 = var1.toLowerCase();
      int var3;
      if ((var3 = super.d.a(bc.a(var2))) >= 0) {
         this.c(var3);
      }

   }

   @ObfuscatedName("ku")
   public static int a(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      return jj.a(var0, var1, var2, 9);
   }

   @ObfuscatedName("nb")
   @ObfuscatedSignature(
      signature = "(Lpu;I)I"
   )
   public static int a(fE var0, int var1) {
      int var2;
      int var3;
      if (var0 == null) {
         fE var5 = var0;
         var2 = 0;
         var3 = 0;

         for(int var4 = 0; var4 < var5.f.length; ++var4) {
            if (var5.g[var4] > 0) {
               var2 += 100;
               var3 += var5.a(var4);
            }
         }

         if (var2 == 0) {
            boolean var10000 = true;
         } else {
            int var10001 = var3 * 100 / var2;
         }
      }

      var1 = 0;
      var2 = 0;

      for(var3 = 0; var3 < var0.f.length; ++var3) {
         if (var0.c[var3] > 0) {
            var1 += 100;
            var2 += var0.a(var3);
         }
      }

      if (var1 == 0) {
         return 100;
      } else {
         return var2 * 100 / var1;
      }
   }

   @ObfuscatedName("ok")
   @ObfuscatedSignature(
      signature = "(Lpu;I)V"
   )
   public static void b(fE var0, int var1) {
      var0.o = new boolean[var0.f.length];

      int var2;
      for(var2 = 0; var2 < var0.o.length; ++var2) {
         if (var1 <= 16711935) {
            return;
         }

         var0.o[var2] = false;
      }

      if (var0.q == null) {
         var0.s = 1;
      } else {
         var0.x = -1;

         for(var2 = 0; var2 < var0.o.length; ++var2) {
            if (var0.c[var2] > 0) {
               hp var5 = var0.q;
               fl var3;
               (var3 = new fl()).e = 1;
               var3.cf = (long)var2;
               var3.d = var5;
               var3.b = var0;
               synchronized(fH.e) {
                  fU.a((fU)fH.e, var3);
               }

               aa.b();
               var0.x = var2;
            }
         }

         if (var0.x == -1) {
            var0.s = 1;
         }

      }
   }
}
