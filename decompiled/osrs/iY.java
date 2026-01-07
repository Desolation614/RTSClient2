package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
public final class iY {
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 476993049
   )
   int a = 0;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lpu;"
   )
   final fE b;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -368061863
   )
   final int c;

   @ObfuscatedSignature(
      signature = "(Lpu;Ljava/lang/String;)V"
   )
   iY(fE var1) {
      this.b = var1;
      this.c = var1.e;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "1196147180"
   )
   public static void a(byte[] param0) {
      // $FF: Couldn't be decompiled
   }
}
