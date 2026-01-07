package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
public final class hO implements fN {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Ltz;"
   )
   public static final hO a = new hO(1, 1);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Ltz;"
   )
   public static final hO b = new hO(2, 2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Ltz;"
   )
   static final hO c = new hO(0, 0);
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1177417485
   )
   private int d;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1859438597
   )
   private int e;

   private hO(int var1, int var2) {
      this.e = var1;
      this.d = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.d;
   }
}
