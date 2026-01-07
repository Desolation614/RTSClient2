package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
public final class eq {
   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      signature = "Ldi;"
   )
   static ka a;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Leh;"
   )
   z b;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1843677409
   )
   int c;

   @ObfuscatedSignature(
      signature = "(ILeh;)V"
   )
   eq(int var1, z var2) {
      this.c = var1;
      this.b = var2;
   }
}
