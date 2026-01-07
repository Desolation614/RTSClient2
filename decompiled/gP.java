package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
public final class gP {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lsc;"
   )
   public static final gP a;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -283230723
   )
   final int b;

   private gP(int var1) {
      this.b = var1;
   }

   static {
      new gP(1);
      a = new gP(0);
   }
}
