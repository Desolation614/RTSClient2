package osrs;

import java.time.LocalDate;
import net.runelite.api.clan.ClanMember;
import net.runelite.api.clan.ClanRank;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

public final class kp implements ClanMember {
   @ObfuscatedName("nv")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   private aP a;
   @ObfuscatedName("rl")
   private int b;

   @ObfuscatedSignature(
      signature = "(Lgu;I)V"
   )
   public kp(aP var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final String getName() {
      return this.a.t[this.b];
   }

   public final ClanRank getRank() {
      return client.q(this.a.o[this.b]);
   }

   public final String toString() {
      String var10000 = this.getName();
      return "ClanMemberImpl(getName=" + var10000 + ", getRank=" + String.valueOf(this.getRank()) + ")";
   }

   public final LocalDate getJoinDate() {
      return LocalDate.ofEpochDay((long)(this.a.q[this.b] + 11745));
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof kp)) {
         return false;
      } else {
         kp var4 = (kp)var1;
         if (!(this instanceof kp)) {
            return false;
         } else {
            String var2 = this.getName();
            String var3 = var4.getName();
            if (var2 == null) {
               if (var3 != null) {
                  return false;
               }
            } else if (!var2.equals(var3)) {
               return false;
            }

            ClanRank var6 = this.getRank();
            ClanRank var5 = var4.getRank();
            if (var6 == null) {
               if (var5 == null) {
                  return true;
               }
            } else if (var6.equals(var5)) {
               return true;
            }

            return false;
         }
      }
   }

   public final int hashCode() {
      String var1 = this.getName();
      int var3 = 59 + (var1 == null ? 43 : var1.hashCode());
      ClanRank var2 = this.getRank();
      return var3 * 59 + (var2 == null ? 43 : var2.hashCode());
   }
}
