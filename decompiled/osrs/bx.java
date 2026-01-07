package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public final class bx extends im {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   static dX a = new dX(64);

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(CB)Z",
      garbageValue = "10"
   )
   public static boolean a(char var0) {
      return var0 >= '0' && var0 <= '9';
   }
}
