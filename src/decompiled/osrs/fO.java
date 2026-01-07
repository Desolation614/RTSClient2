package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
public final class fO {
   @ObfuscatedName("sw")
   @ObfuscatedSignature(
      signature = "Lbh;"
   )
   static dY a;

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1342978777"
   )
   public static int a(int var0) {
      return var0 >> 1 & 1023;
   }
}
