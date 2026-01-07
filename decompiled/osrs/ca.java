package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public final class ca {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static final ca a = new ca();
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static final ca b = new ca();

   ca() {
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "()[Liz;"
   )
   public static ca[] a() {
      return new ca[]{b, a};
   }
}
