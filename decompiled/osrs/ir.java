package osrs;

import net.runelite.api.dbtable.DBRowConfig;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("va")
public final class ir extends im implements DBRowConfig {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   public static dX a = new dX(64);
   @ObfuscatedName("ai")
   int[][] b;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1548193487
   )
   public int c = -1;
   @ObfuscatedName("an")
   Object[][] d;

   ir() {
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(II)[Ljava/lang/Object;",
      garbageValue = "141433590"
   )
   public final Object[] a(int var1) {
      return this.d == null ? null : this.d[var1];
   }

   public final int getTableID() {
      return this.c;
   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      signature = "(ILcr;ZB)I",
      garbageValue = "6"
   )
   static int b(int var0) {
      if (var0 == 7108) {
         hE.c[++hE.e - 1] = client.dP ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("kk")
   @ObfuscatedSignature(
      signature = "(Lva;B)V"
   )
   public static void a(ir var0, byte var1) {
   }
}
