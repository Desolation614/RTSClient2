package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
public final class bl extends im {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   public static dX a = new dX(30);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   public static fE b;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   public static dX c = new dX(64);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   public static fE d;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1901225809
   )
   public int e = -1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 995465221
   )
   private int g;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 583921253
   )
   private int h = 128;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 2066928075
   )
   private int i = 0;
   @ObfuscatedName("ag")
   private short[] j;
   @ObfuscatedName("ah")
   private short[] k;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1994917653
   )
   private int l = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1701957071
   )
   int f;
   @ObfuscatedName("am")
   private short[] m;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 304266475
   )
   private int n = 128;
   @ObfuscatedName("au")
   private short[] o;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1904574911
   )
   private int p = 0;

   bl() {
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IB)Ljm;",
      garbageValue = "18"
   )
   public final cn a(int var1) {
      cn var2;
      if ((var2 = this.a()) == null) {
         return null;
      } else {
         cn var3;
         if (this.e != -1 && var1 != -1) {
            var3 = bP.a(az.a(this.e), var2, var1);
         } else {
            var3 = cn.b(var2, true);
         }

         if (this.n != 128 || this.h != 128) {
            var3.a(this.n, this.h, this.n);
         }

         if (this.i != 0) {
            if (this.i == 90) {
               var3.c();
            }

            if (this.i == 180) {
               var3.c();
               var3.c();
            }

            if (this.i == 270) {
               var3.c();
               var3.c();
               var3.c();
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)Ljm;",
      garbageValue = "-625895714"
   )
   public final cn a() {
      cn var1;
      if ((var1 = (cn)dX.a(a, (long)this.f)) == null) {
         class243 var3;
         if ((var3 = class243.a(b, this.g, 0)) == null) {
            return null;
         }

         int var2;
         if (this.m != null) {
            for(var2 = 0; var2 < this.m.length; ++var2) {
               var3.b(this.m[var2], this.k[var2]);
            }
         }

         if (this.j != null) {
            for(var2 = 0; var2 < this.j.length; ++var2) {
               hL.a(var3, this.j[var2], this.o[var2]);
            }
         }

         var1 = var3.a(this.l + 64, this.p + 850, -30, -50, -30);
         a.a((im)var1, (long)this.f);
      }

      return var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lwt;IB)V",
      garbageValue = "-1"
   )
   private void a(jk var1, int var2) {
      if (var2 == 1) {
         this.g = var1.d();
      } else if (var2 == 2) {
         this.e = var1.d();
      } else if (var2 == 4) {
         this.n = var1.d();
      } else if (var2 == 5) {
         this.h = var1.d();
      } else if (var2 == 6) {
         this.i = var1.d();
      } else if (var2 == 7) {
         this.l = jk.a(var1, (byte)-72);
      } else if (var2 == 8) {
         this.p = jk.a((jk)var1, (byte)3);
      } else if (var2 == 9) {
         var1.p();
      } else {
         int var3;
         if (var2 == 40) {
            var2 = jk.a((jk)var1, (byte)23);
            this.m = new short[var2];
            this.k = new short[var2];

            for(var3 = 0; var3 < var2; ++var3) {
               this.m[var3] = (short)var1.d();
               this.k[var3] = (short)var1.d();
            }
         } else if (var2 == 41) {
            var2 = jk.a(var1, (byte)-1);
            this.j = new short[var2];
            this.o = new short[var2];

            for(var3 = 0; var3 < var2; ++var3) {
               this.j[var3] = (short)var1.d();
               this.o[var3] = (short)var1.d();
            }
         }

      }
   }

   @ObfuscatedName("yb")
   @ObfuscatedSignature(
      signature = "(Lhp;Lwt;I)V"
   )
   public static void a(bl var0, jk var1, int var2) {
      while((var2 = jk.a((jk)var1, (byte)14)) != 0) {
         var0.a(var1, var2);
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "7076"
   )
   public static void b() {
      iD.a.b();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "14"
   )
   public static void c() {
      bm.a.b();
   }
}
