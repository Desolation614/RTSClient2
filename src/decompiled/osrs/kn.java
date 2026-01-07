package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public final class kn {
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      signature = "Lwy;"
   )
   static jp a;
   @ObfuscatedName("cr")
   static String b;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1043069727
   )
   int c;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -2120145705
   )
   int d;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1835601643
   )
   int e;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1637381969
   )
   private int f;

   kn(int var1, int var2, int var3, int var4) {
      this.f = var1;
      this.d = var2;
      this.e = var3;
      this.c = var4;
   }

   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      signature = "(Ldu;I)I"
   )
   public static int a(kn var0, int var1) {
      return var0 == null ? var0.c * 1157386353 : var0.f;
   }
}
