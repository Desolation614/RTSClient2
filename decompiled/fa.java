package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public final class fa implements fN {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Los;"
   )
   public static final fa a = new fa(3);
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1227401437
   )
   final int b;

   private fa(int var1) {
      this.b = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.b;
   }

   static {
      new fa(1);
      new fa(4);
      new fa(2);
      new fa(0);
   }
}
