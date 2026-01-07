package osrs;

import net.runelite.api.FriendsChatMember;
import net.runelite.api.FriendsChatRank;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
public final class gT extends gX implements FriendsChatMember {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Ltc;"
   )
   hq a;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Ltc;"
   )
   private hq g;

   gT() {
      this.g = hq.c;
      this.a = hq.c;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1974840189"
   )
   private void e() {
      this.g = jE.b.e.b(super.c) ? hq.a : hq.b;
   }

   public final FriendsChatRank getRank() {
      return FriendsChatRank.valueOf(super.d);
   }

   @ObfuscatedName("zq")
   @ObfuscatedSignature(
      signature = "(Lsh;B)V"
   )
   public static void a(gT var0, byte var1) {
      if (var0 == null) {
         var0.a = hq.b;
      } else {
         var0.g = hq.c;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)[Lxs;",
      garbageValue = "-1951555505"
   )
   static jx[] a() {
      return new jx[]{jx.b, jx.c, jx.a};
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "135299876"
   )
   static int a(int var0) {
      return (int)((Math.log((double)var0) / hE.d - 7.0D) * 256.0D);
   }

   @ObfuscatedName("nb")
   @ObfuscatedSignature(
      signature = "(Lsh;I)Z"
   )
   public static boolean a(gT var0, int var1) {
      if (var0 == null) {
         if (var0.a == hq.b) {
            var0.e();
         }

         boolean var10000;
         if (var0.a == hq.c) {
            var10000 = true;
         } else {
            var10000 = false;
         }
      }

      if (var0.g == hq.c) {
         var0.e();
      }

      return var0.g == hq.a;
   }

   @ObfuscatedName("th")
   @ObfuscatedSignature(
      signature = "(Lsh;B)V"
   )
   public static void b(gT var0, byte var1) {
      if (var0 == null) {
         var0.a = hq.c;
      } else {
         var0.a = hq.c;
      }
   }
}
