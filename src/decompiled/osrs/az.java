package osrs;

import net.runelite.api.events.PostAnimation;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public final class az extends im {
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -483192749
   )
   public static int a;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   public static dX b = new dX(64);
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1189518373
   )
   public static int c;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 533587421
   )
   public int d = 0;

   az() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lwt;B)V",
      garbageValue = "-5"
   )
   final void a(jk var1) {
      int var2;
      while((var2 = jk.a((jk)var1, (byte)91)) != 0) {
         if (var2 == 5) {
            this.d = var1.d();
         }
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)Lip;",
      garbageValue = "-1689463428"
   )
   public static bP a(int var0) {
      synchronized(bP.c) {
         bP var2;
         if ((var2 = (bP)dX.a(bP.c, (long)var0)) != null) {
            var2 = var2;
         } else {
            byte[] var3 = fB.a(bP.d, 12, (int)var0);
            var2 = new bP();
            if (var3 != null) {
               bP.a(var2, new jk(var3), 1871736615);
            }

            bP var6 = var2;
            if (var2.t * 443579069 == -1) {
               if (var2.m == null && var2.q == null) {
                  var2.t = 0;
               } else {
                  var2.t = -2131254998;
               }
            }

            if (var2.x * 428391817 == -1) {
               if (var2.m == null && var2.q == null) {
                  var2.x = 0;
               } else {
                  var2.x = -663121550;
               }
            }

            if (var2.i != null) {
               var2.o = 0;

               for(int var4 = 0; var4 < var6.i.length; ++var4) {
                  var6.o += -321096257 * var6.i[var4];
               }
            }

            bP.c.a((im)var2, (long)var0);
            var2 = var2;
         }

         if (var2.z * -1796589521 == -1) {
            var2.z = var0 * -459927857;
            dF.c.getCallbacks().post(new PostAnimation(var2));
         }

         return var2;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "477485197"
   )
   public static void a() {
      bk.a.b();
   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   static final void b() {
      if (client.bH * 151075783 > 0) {
         eZ.a();
      } else {
         fp var10000 = client.cO;
         int var0 = 1306984710;
         fp var2 = var10000;
         if (var10000 == null && -1L != var2.d * 9163079647723614637L) {
            var2.b = (au.a() - var2.d * 9163079647723614637L) * 690945005243200539L;
            var2.c = -1L;
         }

         if (-1L != var2.c) {
            var2.d = (au.a() - var2.c) * -5734237473767229705L;
            var2.c = -1L;
         }

         jT.d(40);
         gD.a = client.P.m;
         client.P.m = null;
      }
   }

   @ObfuscatedName("os")
   @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "-1686072307"
   )
   static final void a(int var0, int var1, boolean var2) {
      if (client.aG[var0] != null && var1 >= 0 && var1 < client.aG[var0].a()) {
         af var3 = (af)client.aG[var0].f.get(var1);
         dQ var4;
         (var4 = X.a(j.l, client.P.f)).g.b(4 + hd.a(jw.a(var3.c, 1445825148)));
         var4.g.b(var0);
         var4.g.d(var1);
         jk.a(var4.g, var2, 820984254);
         jk.a(var4.g, (String)jw.a(var3.c, -958000089), -1559098139);
         client.P.a(var4);
      }

   }
}
