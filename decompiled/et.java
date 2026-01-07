package osrs;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public final class et extends jX {
   @ObfuscatedName("kc")
   @ObfuscatedSignature(
      signature = "Lpu;"
   )
   static fE a;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Ldg;"
   )
   jY b = new jY();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lmt;"
   )
   private ea d;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   fU c = new fU();

   @ObfuscatedSignature(
      signature = "(Lmt;)V"
   )
   et(ea var1) {
      this.d = var1;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "()Ldf;"
   )
   protected final jX a() {
      ek var1;
      do {
         if ((var1 = (ek)fU.b(this.c)) == null) {
            return null;
         }
      } while(var1.s == null);

      return var1.s;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "()Ldf;"
   )
   protected final jX b() {
      ek var1;
      if ((var1 = (ek)fU.e(this.c)) == null) {
         return null;
      } else {
         return (jX)(var1.s != null ? var1.s : this.a());
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lne;II)V",
      garbageValue = "23067036"
   )
   private void a(ek var1, int var2) {
      if ((this.d.i[var1.j] & 4) != 0 && var1.n < 0) {
         int var3;
         int var4 = ((var3 = this.d.g[var1.j] / B.a) + 1048575 - var1.d) / var3;
         var1.d = var3 * var2 + var1.d & 1048575;
         if (var4 <= var2) {
            if (this.d.j[var1.j] == 0) {
               var1.s = o.a(var1.h, var1.s.e(), var1.s.g(), var1.s.d());
            } else {
               var1.s = o.a(var1.h, var1.s.e(), 0, var1.s.d());
               this.d.a(var1, var1.m.f[var1.o] < 0);
            }

            if (var1.m.f[var1.o] < 0) {
               var1.s.f(-1);
            }

            var2 = var1.d / var3;
         }
      }

      var1.s.a(var2);
   }

   @ObfuscatedName("am")
   protected final int c() {
      return 0;
   }

   @ObfuscatedName("au")
   protected final void a(int var1) {
      this.b.a(var1);

      for(ek var2 = (ek)fU.e(this.c); var2 != null; var2 = (ek)fU.b(this.c)) {
         if (!this.d.a(var2)) {
            int var3 = var1;

            do {
               if (var3 <= var2.a * -1638674219) {
                  this.a(var2, var3);
                  var2.a -= var3 * 92989565;
                  break;
               }

               this.a(var2, var2.a * -1638674219);
               var3 -= var2.a * -1638674219;
            } while(!this.d.a(var2, (int[])null, 0, var3));
         }
      }

   }

   @ObfuscatedName("bx")
   protected final void a(int[] var1, int var2, int var3) {
      this.b.a(var1, var2, var3);

      for(ek var4 = (ek)fU.e(this.c); var4 != null; var4 = (ek)fU.b(this.c)) {
         if (!this.d.a(var4)) {
            int var5 = var2;
            int var6 = var3;

            do {
               if (var6 <= var4.a * -1638674219) {
                  a(this, var4, var1, var5, var6, var5 + var6);
                  var4.a -= var6 * 92989565;
                  break;
               }

               a(this, var4, var1, var5, var4.a * -1638674219, var6 + var5);
               var5 += var4.a * -1638674219;
               var6 -= var4.a * -1638674219;
            } while(!this.d.a(var4, var1, var5, var6));
         }
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "([I[IIII)V",
      garbageValue = "1344331663"
   )
   public static void a(int[] var0, int[] var1, int var2, int var3) {
      while(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         var4 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var0[var8] < (var8 & var4) + var6) {
               int var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               var9 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var9;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         a(var0, var1, var2, var5 - 1);
         var2 = var5 + 1;
         var1 = var1;
         var0 = var0;
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(ILcr;ZS)I",
      garbageValue = "255"
   )
   static int a(int var0, boolean var1) {
      fd var10000;
      if (var0 >= 2000) {
         var0 -= 1000;
         var10000 = jD.a.b(hE.c[--hE.e]);
      } else {
         var10000 = var1 ? ic.a : ef.a;
      }

      fd var4 = var10000;
      gs.a(var10000);
      int var2;
      int var3;
      if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if (var0 == 1201) {
            var4.ap = 2;
            var4.aq = hE.c[--hE.e];
            return 1;
         } else if (var0 == 1202) {
            var4.ap = 3;
            var4.aq = ai.a.aV.a();
            return 1;
         } else if (var0 == 1207) {
            boolean var6 = hE.c[--hE.e] == 1;
            var4.a(ai.a.aV, var6);
            return 1;
         } else if (var0 == 1208) {
            var2 = hE.c[--hE.e];
            if (var4.X == null) {
               throw new RuntimeException("");
            } else {
               var4.X.d(var2);
               return 1;
            }
         } else if (var0 == 1209) {
            hE.e -= 2;
            var2 = hE.c[hE.e];
            var3 = hE.c[hE.e + 1];
            if (var4.X == null) {
               throw new RuntimeException("");
            } else {
               var4.X.b(var2, var3);
               return 1;
            }
         } else if (var0 == 1210) {
            var2 = hE.c[--hE.e];
            if (var4.X == null) {
               throw new RuntimeException("");
            } else {
               var4.X.a(ai.a.aV.i, var2);
               return 1;
            }
         } else {
            return 2;
         }
      } else {
         hE.e -= 2;
         var2 = hE.c[hE.e];
         var3 = hE.c[hE.e + 1];
         var4.bJ = var2;
         var4.bG = var3;
         bC var5 = cE.a(var2);
         var4.ak = var5.n;
         var4.ai = var5.I;
         var4.ab = var5.x;
         var4.ah = var5.u;
         var4.ad = var5.G;
         var4.ao = var5.m;
         if (var0 == 1205) {
            var4.au = 0;
         } else if (var0 == 1212 | 1 == var5.C) {
            var4.au = 1;
         } else {
            var4.au = 2;
         }

         if (var4.an > 0) {
            var4.ao = (var4.ao << 5) / var4.an;
         } else if (var4.u > 0) {
            var4.ao = (var4.ao << 5) / var4.u;
         }

         return 1;
      }
   }

   @ObfuscatedName("ob")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-155564374"
   )
   static void d() {
      if (gq.a != null) {
         client.bf = client.Z;
         gq.a.c = 0;
         Iterator var0 = aM.a.e.iterator();

         while(var0.hasNext()) {
            jG var1 = (jG)var0.next();
            fV var10000 = gq.a;
            int var10001 = (var1.s >> 7) + aM.a.n;
            int var3 = (var1.n >> 7) + aM.a.i;
            int var2 = var10001;
            fV var4 = var10000;
            if (var10000 == null) {
               if ((var4 = var4).c < var4.d.length) {
                  var4.b[var4.c] = var2;
                  var4.d[var4.c] = var2;
                  ++var4.c;
               }
            } else if (var4.c < var4.b.length) {
               var4.b[var4.c] = var2;
               var4.d[var4.c] = var3;
               ++var4.c;
            }
         }
      }

   }

   @ObfuscatedName("sh")
   @ObfuscatedSignature(
      signature = "(Lnm;Lne;[IIIII)V",
      garbageValue = "1355104735"
   )
   private static void a(et var0, ek var1, int[] var2, int var3, int var4, int var5) {
      if ((var0.d.i[var1.j] & 4) != 0 && var1.n < 0) {
         int var6 = var0.d.g[var1.j] / B.a;

         int var7;
         while((var7 = (var6 + 1048575 - var1.d) / var6) <= var4) {
            var1.s.a(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.d += var6 * var7 - 1048576;
            var7 = B.a / 100;
            int var8;
            if ((var8 = 262144 / var6) < var7) {
               var7 = var8;
            }

            o var9 = var1.s;
            if (var0.d.j[var1.j] == 0) {
               var1.s = o.a(var1.h, var9.e(), var9.g(), var9.d());
            } else {
               var1.s = o.a(var1.h, var9.e(), 0, var9.d());
               var0.d.a(var1, var1.m.f[var1.o] < 0);
               var1.s.a(var7, var9.g());
            }

            if (var1.m.f[var1.o] < 0) {
               var1.s.f(-1);
            }

            var9.c(var7);
            var9.a(var2, var3, var5 - var3);
            if (o.a(var9)) {
               var0.b.a((jX)var9);
            }
         }

         var1.d += var4 * var6;
      }

      var1.s.a(var2, var3, var4);
   }
}
