package osrs;

import net.runelite.api.Nameable;
import net.runelite.api.clan.ClanChannelMember;
import net.runelite.api.clan.ClanRank;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public final class af implements ClanChannelMember {
   @ObfuscatedName("qj")
   @ObfuscatedSignature(
      signature = "[Lwy;"
   )
   static jp[] a;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 691312845
   )
   public int b;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lxm;"
   )
   public jw c;
   @ObfuscatedName("ap")
   public byte d;

   af() {
   }

   public final String getName() {
      jw var1;
      if ((var1 = this.c) == null) {
         return null;
      } else {
         String var2;
         return (var2 = var1.b) == null ? null : var2.replace(' ', ' ');
      }
   }

   public final ClanRank getRank() {
      return client.q(this.d);
   }

   public final String getPrevName() {
      return null;
   }

   public final int getWorld() {
      return this.b;
   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-106"
   )
   static void a() {
      if (er.b != null) {
         er.b.a(aM.a.m, (client.do >> 7) + aM.a.n, (client.dn >> 7) + aM.a.i, false);
         er.b.D.a();
      }

   }

   @ObfuscatedName("kq")
   @ObfuscatedSignature(
      signature = "(IIIIIIII)Z",
      garbageValue = "-1325335667"
   )
   static boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      ci var7 = ec.a.o;
      int var9;
      if (var5 == fy.d.e) {
         cS var8;
         if ((var8 = var7.h(var0, var1, var2)) != null) {
            var9 = eg.a(var8.h);
            if (var3 == fc.h.m) {
               var8.i = new jM(ec.a, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.i);
               var8.e = new jM(ec.a, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.e);
            } else {
               var8.i = new jM(ec.a, var9, var3, var4, var0, var1, var2, var6, false, var8.i);
            }

            ci.b(var0, var1, var2, var5);
            return true;
         }
      } else if (var5 == fy.b.e) {
         cD var10;
         if ((var10 = ci.d(var7, var0, var1, var2)) != null) {
            var9 = eg.a(var10.f);
            if (var3 != fc.b.m && var3 != fc.a.m) {
               if (var3 == fc.g.m) {
                  var10.g = new jM(ec.a, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.g);
               } else if (var3 == fc.d.m) {
                  var10.g = new jM(ec.a, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.g);
               } else if (var3 == fc.c.m) {
                  var10.g = new jM(ec.a, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.g);
                  var10.k = new jM(ec.a, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.k);
               }
            } else {
               var10.g = new jM(ec.a, var9, 4, var4, var0, var1, var2, var6, false, var10.g);
            }

            ci.b(var0, var1, var2, var5);
            return true;
         }
      } else if (var5 == fy.c.e) {
         cJ var11 = var7.c(var0, var1, var2);
         if (var3 == fc.k.m) {
            var3 = fc.i.m;
         }

         if (var11 != null) {
            var11.m = new jM(ec.a, eg.a(var11.l), var3, var4, var0, var1, var2, var6, false, var11.m);
            ci.b(var0, var1, var2, var5);
            return true;
         }
      } else {
         ce var12;
         if (var5 == fy.a.e && (var12 = var7.g(var0, var1, var2)) != null) {
            var12.g = new jM(ec.a, eg.a(var12.d), 22, var4, var0, var1, var2, var6, false, var12.g);
            ci.b(var0, var1, var2, var5);
            return true;
         }
      }

      ci.b(var0, var1, var2, var5);
      return false;
   }

   // $FF: synthetic method
   public final int compareTo(Object var1) {
      Nameable var2 = (Nameable)var1;
      return this.getName().compareTo(var2.getName());
   }
}
