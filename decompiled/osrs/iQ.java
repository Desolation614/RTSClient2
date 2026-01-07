package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vz")
public final class iQ {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lvz;"
   )
   public static final iQ a = new iQ("verdana_15pt_regular");
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lvz;"
   )
   public static final iQ b = new iQ("verdana_11pt_regular");
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lvz;"
   )
   public static final iQ c = new iQ("p12_full");
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lvz;"
   )
   public static final iQ d = new iQ("verdana_13pt_regular");
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lvz;"
   )
   public static final iQ e = new iQ("b12_full");
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lvz;"
   )
   public static final iQ f = new iQ("p11_full");
   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      signature = "Lwy;"
   )
   static jp g;
   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      signature = "Lon;"
   )
   static eV h;
   @ObfuscatedName("aa")
   String i;

   private iQ(String var1) {
      this.i = var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "2"
   )
   protected static final void a() {
      fs.m.a();

      int var0;
      for(var0 = 0; var0 < 32; ++var0) {
         fs.k[var0] = 0L;
      }

      for(var0 = 0; var0 < 32; ++var0) {
         fs.b[var0] = 0L;
      }

      fs.c = 0;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)[Lvz;",
      garbageValue = "487820194"
   )
   public static iQ[] b() {
      return new iQ[]{c, f, d, a, e, b};
   }

   @ObfuscatedName("kd")
   @ObfuscatedSignature(
      signature = "(Ldl;Lwx;B)V",
      garbageValue = "7"
   )
   static void a(kd var0, jo var1) {
      int var2;
      int var3;
      if ((var2 = jk.a((jk)var1, (byte)85)) < var0.t.a) {
         for(int var4 = var2; var4 < var0.t.a; ++var4) {
            aW.a(var3 = var0.t.b[var4]);
            hG var5;
            if ((var5 = (hG)var0.l.b((long)var3)) != null) {
               gk.a(var5);
            }
         }
      }

      if (var2 > var0.t.a) {
         throw new RuntimeException("");
      } else {
         hk.a(var0.t, -54701622);
         cW var15 = new cW();

         int var6;
         int var10;
         int var16;
         for(var3 = 0; var3 < var2; ++var3) {
            var6 = var0.t.b[var3];
            hG var7 = (hG)var0.l.b((long)var6);
            if ((var16 = jk.a((jk)var1, (byte)98)) == 0) {
               aW.a(var6);
               if (var7 != null) {
                  gk.a(var7);
               }
            } else {
               var0.t.b(var6);
               if (var16 != 1) {
                  var15.a(var7.g == 0 ? var7.a : var7.h[0].b);
                  byte var17;
                  if ((var17 = var1.B()) != 0) {
                     int var8 = eA.a(var1, (byte)var17, 0);
                     int var9 = eA.a(var1, (byte)var17, 2);
                     var10 = eA.a(var1, (byte)var17, 4);
                     var6 = eA.a(var1, (byte)var17, 6);
                     var15.a(var8, var9, var10, var6);
                  }

                  if (var16 == 2) {
                     var7.a(var15);
                  } else {
                     var7.b(var15);
                  }
               }
            }
         }

         while(true) {
            var6 = client.P.e;
            if (var6 - var1.c <= 0) {
               return;
            }

            var3 = var1.d();
            var0.t.b(var3);
            var6 = jk.a((jk)var1, (byte)25);
            int var18 = jk.a((jk)var1, (byte)-26);
            var16 = var6 << 3;
            var6 = var18 << 3;
            kd var20 = client.ag.a(var3, var16, var6, j.aS.o, ca.a);
            hG var22 = new hG(var3, var20);
            var0.l.b(var22, (long)var3);
            var22.f = var3;
            var22.b = var0.k;
            var10 = var1.c();
            ba var13;
            ba var19;
            if ((var19 = (ba)dX.a(ba.a, (long)var10)) != null) {
               var13 = var19;
            } else {
               byte[] var11 = fB.a(gn.a, 72, (int)var10);
               var19 = new ba();
               if (var11 != null) {
                  jk var12 = new jk(var11);
                  ba var21 = var19;

                  while((var3 = jk.a((jk)var12, (byte)4)) != 0) {
                     switch(var3) {
                     case 2:
                        var21.k = jk.a((jk)var12, (byte)44);
                     case 3:
                     case 10:
                     case 11:
                     case 13:
                     default:
                        break;
                     case 4:
                        var21.h = var12.c();
                        break;
                     case 5:
                        var21.d = var12.c() * -226937945;
                        break;
                     case 6:
                        var21.f = var12.c();
                        break;
                     case 7:
                        var21.i = var12.c() * -1759422655;
                        break;
                     case 8:
                        var21.b = var12.d();
                        break;
                     case 9:
                        var21.e = var12.d();
                        break;
                     case 12:
                        var12.p();
                        break;
                     case 14:
                        var21.c = true;
                        break;
                     case 15:
                     case 16:
                     case 17:
                     case 18:
                     case 19:
                        var16 = var3 - 15;
                        var21.g[var16] = var12.p();
                        if (var21.g[var16].equalsIgnoreCase("Hidden")) {
                           var21.g[var16] = null;
                        }
                        break;
                     case 20:
                        var12.d();
                     }
                  }
               }

               ba.a(var19, 1567878801);
               ba.a.a((im)var19, (long)var10);
               var13 = var19;
            }

            hG.a(var22, var13, -1542390317);
            bY.a(var1, var22.a, 0, 0);
            var22.a(var22.a);
            eP var14 = (eP)aU.a(jS.b(), jk.a((jk)var1, (byte)13));
            var22.c = var14;
         }
      }
   }

   @ObfuscatedName("pi")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "124"
   )
   static void c() {
      for(int var0 = 0; var0 < client.fh.size(); ++var0) {
         if (dF.a((Integer)client.fh.get(var0)) != 2) {
            client.fh.remove(var0);
            --var0;
         }
      }

   }
}
