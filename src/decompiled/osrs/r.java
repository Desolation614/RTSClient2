package osrs;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public final class r {
   @ObfuscatedName("ko")
   @ObfuscatedSignature(
      signature = "Lpu;"
   )
   static fE a;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   fB b;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lqq;"
   )
   private gb c;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   private fB d;

   @ObfuscatedSignature(
      signature = "(Lps;Lps;)V"
   )
   public r(fB var1, fB var2) {
      new gb(256);
      this.c = new gb(256);
      this.d = var1;
      this.b = var2;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(IIZB)J",
      garbageValue = "74"
   )
   private static long a(int var0, int var1, boolean var2) {
      var1 = var1 ^ (var0 << 4 & '\uffff' | var0 >> 12) | var0 << 16;
      return var2 ? (long)var1 ^ 4294967296L : (long)var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(III)Leh;",
      garbageValue = "-276516117"
   )
   final z a(int var1, int var2) {
      long var3 = a(var1, var2, true);
      z var5;
      if ((var5 = (z)gb.a(this.c, var3)) != null) {
         return var5;
      } else {
         E var6;
         if ((var6 = E.a(this.b, var1, var2)) == null) {
            return new z();
         } else {
            z var7 = new z(var6);
            this.c.a((hR)var7, var3);
            return var7;
         }
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I[IB)Lds;",
      garbageValue = "112"
   )
   final kl a(int var1, int[] var2) {
      if (this.d.e == 1) {
         return this.a(0, var1, var2);
      } else if (this.d.d(var1) == 1) {
         return this.a(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II[IB)Lds;",
      garbageValue = "-90"
   )
   private kl a(int var1, int var2, int[] var3) {
      long var4 = a(var1, var2, false);
      z var6;
      if ((var6 = (z)gb.a(this.c, var4)) != null) {
         return z.b(var6, (byte)-105);
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         km var7;
         if ((var7 = km.a(this.d, var1, var2)) == null) {
            return null;
         } else {
            kl var8 = var7.a(false);
            this.c.a((hR)(new z(var8)), var4);
            if (var3 != null) {
               var3[0] -= var8.d.length;
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "-249027209"
   )
   public static boolean a(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1821477672"
   )
   public static void a(int var0) {
      if (!ee.e.isEmpty()) {
         Iterator var1 = ee.e.iterator();

         ev var2;
         while(var1.hasNext()) {
            if ((var2 = (ev)var1.next()) != null) {
               var2.f = var0;
            }
         }

         if ((var2 = (ev)ee.e.get(0)) != null && var2.m != null && var2.m.e() && !var2.e) {
            var2.m.b(var0);
            var2.h = (float)var0;
         }
      }

   }

   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      signature = "(Lov;I)V",
      garbageValue = "583189071"
   )
   static void a(fd var0) {
      fd var1 = var0;
      var0.bS = new eW();

      int var2;
      for(var2 = 1; var2 <= 12; ++var2) {
         var1.bS.f.a((int)var2, 0);
      }

      for(char var6 = 0; var6 < ' '; ++var6) {
         var1.bS.f.a((char)var6, 0);
      }

      var1.bS.f.a((char)'\u0080', 0);
      var1.bS.f.a((int)82, 2);
      var1.bS.f.a((int)81, 2);
      var1.bS.f.a((int)86, 2);
      eK var10000 = fd.b(var0, 765111122);
      jW var10001 = new jW(var0);
      boolean var7 = true;
      jW var8 = var10001;
      eK var5 = var10000;
      if (var10000 == null) {
         var5.l = var8;
      } else {
         var5.n = var8;
      }

      var10000 = fd.b(var0, 387459732);
      q var10 = new q(var0);
      var2 = -268200157;
      q var9 = var10;
      var5 = var10000;
      if (var10000 == null) {
         var5.l = var9;
      }

      var5.l = var9;
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      signature = "(ZLwx;I)V",
      garbageValue = "-1950917234"
   )
   static final void a(boolean var0, jo var1) {
      client.N();
      client.cU = var0;
      int var2;
      int var3;
      int var4;
      int var5;
      int var9;
      int var10000;
      int var10001;
      boolean var10002;
      if (!var0) {
         var1.F();
         int var6 = jk.b(var1, (byte)-122);
         var9 = jk.f(var1, -1039715526);
         jQ.a = new int[var2 = var1.d()][4];

         for(var3 = 0; var3 < var2; ++var3) {
            for(var4 = 0; var4 < 4; ++var4) {
               jQ.a[var3][var4] = jk.d((jk)var1, 1687107415);
            }
         }

         S.c = new int[var2];
         dJ.b = new int[var2];
         eS.a = new int[var2];
         n.d = new byte[var2][];
         bj.c = new byte[var2][];
         var2 = 0;

         for(var3 = (var6 - 6) / 8; var3 <= (var6 + 6) / 8; ++var3) {
            for(var4 = (var9 - 6) / 8; var4 <= (var9 + 6) / 8; ++var4) {
               var5 = var4 + (var3 << 8);
               S.c[var2] = var5;
               dJ.b[var2] = bn.d.b("m" + var3 + "_" + var4);
               eS.a[var2] = bn.d.b("l" + var3 + "_" + var4);
               ++var2;
            }
         }

         var10000 = var6;
         var10001 = var9;
         var10002 = true;
      } else {
         boolean var11 = var1.G() == 1;
         var9 = jk.b(var1, (byte)-46);
         var2 = var1.d();
         var3 = var1.d();
         var1.P();

         int var7;
         for(var4 = 0; var4 < 4; ++var4) {
            for(var5 = 0; var5 < 13; ++var5) {
               for(var7 = 0; var7 < 13; ++var7) {
                  if (var1.s(1) == 1) {
                     client.cT[var4][var5][var7] = var1.s(26);
                  } else {
                     client.cT[var4][var5][var7] = -1;
                  }
               }
            }
         }

         jo.j(var1, 1653139943);
         jQ.a = new int[var3][4];

         for(var4 = 0; var4 < var3; ++var4) {
            for(var5 = 0; var5 < 4; ++var5) {
               jQ.a[var4][var5] = jk.d((jk)var1, 1687107415);
            }
         }

         S.c = new int[var3];
         dJ.b = new int[var3];
         eS.a = new int[var3];
         n.d = new byte[var3][];
         bj.c = new byte[var3][];
         var3 = 0;

         for(var4 = 0; var4 < 4; ++var4) {
            for(var5 = 0; var5 < 13; ++var5) {
               for(var7 = 0; var7 < 13; ++var7) {
                  int var8;
                  if ((var8 = client.cT[var4][var5][var7]) != -1) {
                     int var10 = ey.a(var8);
                     var8 = dk.b(var8);
                     var10 = (var10 / 8 << 8) + var8 / 8;

                     for(var8 = 0; var8 < var3; ++var8) {
                        if (S.c[var8] == var10) {
                           var10 = -1;
                           break;
                        }
                     }

                     if (var10 != -1) {
                        S.c[var3] = var10;
                        var8 = var10 >> 8 & 255;
                        var10 &= 255;
                        dJ.b[var3] = bn.d.b("m" + var8 + "_" + var10);
                        eS.a[var3] = bn.d.b("l" + var8 + "_" + var10);
                        ++var3;
                     }
                  }
               }
            }
         }

         var10000 = var9;
         var10001 = var2;
         var10002 = !var11;
      }

      as.a(var10000, var10001, var10002);
      client.t();
   }
}
