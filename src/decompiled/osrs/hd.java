package osrs;

import net.runelite.api.FriendsChatManager;
import net.runelite.api.FriendsChatMember;
import net.runelite.api.FriendsChatRank;
import net.runelite.api.events.FriendsChatMemberJoined;
import net.runelite.api.events.FriendsChatMemberLeft;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
public final class hd extends hg<FriendsChatMember> implements FriendsChatManager {
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1806065849
   )
   public int a;
   @ObfuscatedName("ac")
   public byte b;
   @ObfuscatedName("ai")
   public String c = null;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lvf;"
   )
   final iw d;
   @ObfuscatedName("al")
   public String e = null;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1026475387
   )
   int f = 1;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lsr;"
   )
   private he j;

   @ObfuscatedSignature(
      signature = "(Lvf;Lsr;)V"
   )
   public hd(iw var1, client var2) {
      super(500);
      this.d = var1;
      this.j = var2;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(Lsh;I)V",
      garbageValue = "-1230092492"
   )
   final void a(gT var1) {
      if (var1.c.equals(this.j.a())) {
         this.a = var1.d;
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "195051048"
   )
   public final void a(jo var1) {
      jw var2 = new jw(var1.p(), this.d);
      int var3 = var1.d();
      byte var4 = var1.B();
      boolean var5 = false;
      if (var4 == -128) {
         var5 = true;
      }

      gT var6;
      if (var5) {
         if (super.h == 0) {
            return;
         }

         if ((var6 = (gT)this.e(var2)) != null && var6.f == var3) {
            this.b((gU)var6);
            return;
         }
      } else {
         var1.p();
         if ((var6 = (gT)this.e(var2)) == null) {
            if (super.h > super.i) {
               return;
            }

            var6 = (gT)this.a(var2, (jw)null);
         }

         var6.a(var3, ++this.f - 1);
         var6.d = var4;
         this.a(var6);
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)[Lsi;",
      garbageValue = "-308089342"
   )
   final gU[] a(int var1) {
      return new gT[var1];
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)Lsi;",
      garbageValue = "1"
   )
   final gU a() {
      return new gT();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "5"
   )
   public final void b() {
      for(int var1 = 0; var1 < super.h; ++var1) {
         gT.a((gT)this.b(var1), (byte)-32);
      }

   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(Lxm;Lxm;)V"
   )
   public final void a(jw var1) {
      FriendsChatMember var3;
      if ((var3 = (FriendsChatMember)this.e(var1)) != null) {
         FriendsChatMemberJoined var4 = new FriendsChatMemberJoined(var3);
         dF.c.getCallbacks().postDeferred(var4);
      }

   }

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      signature = "(Lsi;)V"
   )
   public final void a(gU var1) {
      jw var2 = var1.c;
      FriendsChatMember var3;
      if ((var3 = (FriendsChatMember)this.e(var2)) != null) {
         FriendsChatMemberLeft var4 = new FriendsChatMemberLeft(var3);
         dF.c.getCallbacks().postDeferred(var4);
      }

   }

   public final String getName() {
      return this.c;
   }

   public final FriendsChatRank getMyRank() {
      return FriendsChatRank.valueOf(this.a);
   }

   public final String getOwner() {
      return this.e;
   }

   public final FriendsChatRank getKickRank() {
      return FriendsChatRank.valueOf(this.b);
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "-627052889"
   )
   public static int a(String var0) {
      return var0.length() + 1;
   }

   @ObfuscatedName("vg")
   @ObfuscatedSignature(
      signature = "(Lsq;I)V"
   )
   public static void a(hd var0, int var1) {
      if (var0 == null) {
         var0 = var0;

         for(var1 = 0; var1 < var0.h; ++var1) {
            gT.b((gT)var0.b(var1), (byte)-26);
         }

      } else {
         for(var1 = 0; var1 < var0.h; ++var1) {
            gT.b((gT)var0.b(var1), (byte)-26);
         }

      }
   }
}
