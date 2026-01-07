package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public final class js implements fN {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lag;"
   )
   public static final js a;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lag;"
   )
   public static final js b;
   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      signature = "Lwy;"
   )
   static jp c;
   @ObfuscatedName("iz")
   @ObfuscatedGetter(
      intValue = 1559372579
   )
   static int d;
   @ObfuscatedName("aa")
   String e;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 968537279
   )
   private int g;
   @ObfuscatedName("ah")
   boolean f;
   @ObfuscatedName("am")
   private boolean h;

   private js(int var1, String var2, boolean var3, boolean var4) {
      this.g = var1;
      this.e = var2;
      this.h = var3;
      this.f = var4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.g;
   }

   @ObfuscatedName("nd")
   @ObfuscatedSignature(
      signature = "(Lov;I)Z",
      garbageValue = "-1673463596"
   )
   static final boolean a(fd var0) {
      int var6;
      if ((var6 = var0.e) == 205) {
         client.bH = -1761250506;
         return true;
      } else {
         int var1;
         int var2;
         boolean var3;
         int[] var4;
         int var5;
         eY var8;
         int var12;
         eY var10000;
         if (var6 >= 300 && var6 <= 313) {
            var1 = (var6 - 300) / 2;
            var2 = var6 & 1;
            var10000 = client.Y;
            var3 = var2 == 1;
            var2 = var1;
            var8 = var10000;
            var4 = var10000.n;
            if (bs.c == null) {
               (bs.c = new int[7])[bs.h.k] = bM.d.j;
               bs.c[bs.e.k] = bM.h.j;
               bs.c[bs.g.k] = bM.f.j;
               bs.c[bs.d.k] = bM.a.j;
               bs.c[bs.f.k] = bM.c.j;
               bs.c[bs.b.k] = bM.g.j;
               bs.c[bs.a.k] = bM.i.j;
            }

            var5 = bs.c[var1];
            if ((var12 = var4[var5]) != 0) {
               var12 -= 256;

               bk var13;
               do {
                  do {
                     do {
                        if (!var3) {
                           --var12;
                           if (var12 < 0) {
                              var12 = bk.b - 1;
                           }
                        } else {
                           ++var12;
                           if (var12 >= bk.b) {
                              var12 = 0;
                           }
                        }
                     } while((var13 = kk.b(var12)) == null);
                  } while(var13.e);
               } while(!var13.a(var2, var8.i));

               int[] var9 = var8.n;
               if (bs.c == null) {
                  (bs.c = new int[7])[bs.h.k] = bM.d.j;
                  bs.c[bs.e.k] = bM.h.j;
                  bs.c[bs.g.k] = bM.f.j;
                  bs.c[bs.d.k] = bM.a.j;
                  bs.c[bs.f.k] = bM.c.j;
                  bs.c[bs.b.k] = bM.g.j;
                  bs.c[bs.a.k] = bM.i.j;
               }

               var2 = bs.c[var2];
               var9[var2] = var12 + 256;
               var8.b();
            }
         }

         if (var6 >= 314 && var6 <= 323) {
            var1 = (var6 - 314) / 2;
            var2 = var6 & 1;
            var10000 = client.Y;
            var3 = var2 == 1;
            var2 = var1;
            var8 = var10000;
            var12 = var10000.l[var1];
            boolean var14;
            if (!var3) {
               do {
                  --var12;
                  if (var12 < 0) {
                     var12 = eY.d[var2].length - 1;
                  }

                  if (var2 == 4 && var12 >= 8) {
                     var14 = false;
                  } else {
                     var14 = true;
                  }
               } while(!var14);
            } else {
               do {
                  ++var12;
                  if (var12 >= eY.d[var2].length) {
                     var12 = 0;
                  }

                  if (var2 == 4 && var12 >= 8) {
                     var14 = false;
                  } else {
                     var14 = true;
                  }
               } while(!var14);
            }

            var8.l[var2] = var12;
            var8.b();
         }

         if (var6 == 324) {
            client.Y.a(0);
         }

         if (var6 == 325) {
            client.Y.a(1);
         }

         if (var6 != 326) {
            return false;
         } else {
            dQ var7 = X.a(j.v, client.P.f);
            jo var10 = var7.g;
            var8 = client.Y;
            var10.b(var8.i);

            int var11;
            for(var11 = 0; var11 < 7; ++var11) {
               var4 = var8.n;
               if (bs.c == null) {
                  (bs.c = new int[7])[bs.h.k] = bM.d.j;
                  bs.c[bs.e.k] = bM.h.j;
                  bs.c[bs.g.k] = bM.f.j;
                  bs.c[bs.d.k] = bM.a.j;
                  bs.c[bs.f.k] = bM.c.j;
                  bs.c[bs.b.k] = bM.g.j;
                  bs.c[bs.a.k] = bM.i.j;
               }

               var5 = bs.c[var11];
               if ((var12 = var4[var5]) == 0) {
                  var10.d(-1);
               } else {
                  var10.d(var12 - 256);
               }
            }

            for(var11 = 0; var11 < 5; ++var11) {
               var10.b(var8.l[var11]);
            }

            client.P.a(var7);
            return true;
         }
      }
   }

   @ObfuscatedName("sa")
   @ObfuscatedSignature(
      signature = "(Lag;I)Z"
   )
   public static boolean a(js var0, int var1) {
      return var0 == null ? var0.h : var0.h;
   }

   static {
      new js(3, "PATCH", false, true);
      a = new js(1, "GET", true, false);
      new js(4, "DELETE", false, true);
      new js(2, "PUT", false, true);
      b = new js(0, "POST", true, true);
   }
}
