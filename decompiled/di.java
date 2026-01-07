package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
public final class di {
   @ObfuscatedName("ae")
   public static int[] a;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1793932931
   )
   final int b;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1126546759
   )
   final int c;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1095827275
   )
   final int d;

   di(int var1, int var2, int var3) {
      this.d = var1;
      this.b = var2;
      this.c = var3;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(IB)F",
      garbageValue = "40"
   )
   public static float a(int var0) {
      var0 &= 16383;
      return (float)(3.834951969714103E-4D * (double)((float)var0));
   }
}
