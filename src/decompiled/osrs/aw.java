package osrs;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.api.clan.ClanChannel;
import net.runelite.api.clan.ClanChannelMember;
import net.runelite.api.events.ClanMemberJoined;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public final class aw extends hR implements ClanChannel {
   @ObfuscatedName("aa")
   private boolean g = true;
   @ObfuscatedName("ac")
   private boolean h;
   @ObfuscatedName("ai")
   public byte a;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      longValue = -6173762561185738429L
   )
   public long b;
   @ObfuscatedName("al")
   public byte c;
   @ObfuscatedName("am")
   int[] d;
   @ObfuscatedName("an")
   public String e = null;
   @ObfuscatedName("ap")
   public List f;

   @ObfuscatedSignature(
      signature = "(Lwt;)V"
   )
   public aw(jo var1) {
      jo var2 = var1;
      aw var7 = this;
      int var3;
      if (((var3 = jk.a((jk)var1, (byte)-79)) & 1) != 0) {
         this.h = true;
      }

      if ((var3 & 2) != 0) {
         this.g = true;
      }

      int var4 = 2;
      if ((var3 & 4) != 0) {
         var4 = jk.a((jk)var1, (byte)38);
      }

      super.cf = var1.e();
      this.b = var1.e();
      this.e = var1.p();
      var1.i();
      this.a = var1.B();
      this.c = var1.B();
      if ((var3 = var1.d()) > 0) {
         this.f = new ArrayList(var3);

         for(int var5 = 0; var5 < var3; ++var5) {
            af var6 = new af();
            if (var7.h) {
               var2.e();
            }

            if (var7.g) {
               var6.c = new jw(var2.p());
            }

            var6.d = var2.B();
            var6.b = var2.d();
            if (var4 >= 3) {
               var2.i();
            }

            var7.f.add(var5, var6);
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-88"
   )
   public final int a() {
      return this.f.size();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)[I",
      garbageValue = "-1982180383"
   )
   public final int[] b() {
      if (this.d == null) {
         String[] var1 = new String[this.f.size()];
         this.d = new int[this.f.size()];

         for(int var2 = 0; var2 < this.f.size(); this.d[var2] = var2++) {
            var1[var2] = ((af)this.f.get(var2)).c.a;
         }

         as.a(var1, this.d);
      }

      return this.d;
   }

   @ObfuscatedName("or")
   @ObfuscatedSignature(
      signature = "(Lfm;)V"
   )
   private void a(af var1) {
      dF.c.getCallbacks().post(new ClanMemberJoined(this, var1));
   }

   public final List getMembers() {
      return this.f;
   }

   public final String getName() {
      return this.e;
   }

   public final ClanChannelMember findMember(String var1) {
      if ((var1 = (new jw(var1, gR.c)).a) == null) {
         return null;
      } else {
         List var2 = this.getMembers();
         int[] var3 = this.b();
         int var4 = 0;
         int var5 = var3.length - 1;

         while(var4 <= var5) {
            int var6 = var4 + var5 >>> 1;
            int var7 = var3[var6];
            int var8;
            af var9;
            if ((var8 = (var9 = (af)var2.get(var7)).c.a.compareTo(var1)) < 0) {
               var4 = var6 + 1;
            } else {
               if (var8 <= 0) {
                  return var9;
               }

               var5 = var6 - 1;
            }
         }

         return null;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Lov;II)V",
      garbageValue = "388896101"
   )
   static final void a(fd var0, int var1) {
      if (var0.aN == null) {
         throw new RuntimeException();
      } else {
         if (var0.bX == null) {
            var0.bX = new int[var0.aN.length];
         }

         var0.bX[var1] = Integer.MAX_VALUE;
      }
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(Ltp;ILtp;III)V",
      garbageValue = "1145049713"
   )
   static void a(hD var0, int var1, hD var2, int var3, int var4) {
      if (var0.d == iv.c) {
         System.arraycopy(var0.a, var1, var2.a, var3, var4);
      } else if (var0.d == iv.a) {
         System.arraycopy(var0.f, var1, var2.f, var3, var4);
      } else {
         System.arraycopy(var0.b, var1, var2.b, var3, var4);
      }
   }

   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      signature = "(Lgd;Ljava/lang/String;I)I"
   )
   public static int a(aw var0, String var1, int var2) {
      if (var0 == null) {
         aw var10000 = var0;
         var1 = var1;
         var0 = var0;
         if (!var10000.g) {
            throw new RuntimeException("Displaynames not available");
         } else {
            for(var2 = 0; var2 < var0.f.size(); ++var2) {
               if (jw.a(((af)var0.f.get(var2)).c, -1656274936).equalsIgnoreCase(var1)) {
                  return var2;
               }
            }

            return -1;
         }
      } else if (!var0.g) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(var2 = 0; var2 < var0.f.size(); ++var2) {
            if (jw.a(((af)var0.f.get(var2)).c, -1656274936).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("us")
   @ObfuscatedSignature(
      signature = "(Lgd;Lfm;I)V"
   )
   public static void a(aw var0, af var1, int var2) {
      if (var0 == null) {
         (var0 = var0).f.add(var1);
         var0.d = null;
         var0.a(var1);
      } else {
         var0.f.add(var1);
         var0.d = null;
         var0.a(var1);
      }
   }

   static {
      new BitSet(65536);
   }
}
