package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wp")
public interface jg {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1537061280"
   )
   int c();

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-71"
   )
   int d();

   @ObfuscatedName("cf")
   default int e() {
      return this.c();
   }

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2121730630"
   )
   int f();

   @ObfuscatedName("jh")
   float g();

   @ObfuscatedName("rf")
   float h();
}
