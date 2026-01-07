package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wc")
public final class iS implements fN {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lwc;"
   )
   public static final iS a;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lwc;"
   )
   public static final iS b;
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "Lcb;"
   )
   static ia c;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 568496815
   )
   private int e;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1701016191
   )
   final int d;

   private iS(int var1, int var2) {
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

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-103"
   )
   public final boolean b() {
      return this == a;
   }

   static {
      new iS(0, 8);
      new iS(5, 6);
      a = new iS(1, 2);
      new iS(3, 7);
      new iS(4, 5);
      b = new iS(2, 0);
   }
}
