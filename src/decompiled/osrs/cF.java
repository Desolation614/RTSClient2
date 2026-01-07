package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public interface cF {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "2032088871"
   )
   boolean b();

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1205864267"
   )
   int a(int var1);

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "973328106"
   )
   boolean b(int var1);

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "1086905002"
   )
   int[] c(int var1);

   @ObfuscatedName("kk")
   default int e(int var1) {
      return this.a(var1);
   }
}
