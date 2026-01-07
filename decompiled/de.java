package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public final class de {
   @ObfuscatedName("pp")
   @ObfuscatedSignature(
      signature = "Luo;"
   )
   static ie a;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IB)Lve;",
      garbageValue = "44"
   )
   public static iv a(int var0) {
      if ((var0 = it.a[var0]) == 1) {
         return iv.c;
      } else if (var0 == 2) {
         return iv.b;
      } else {
         return var0 == 3 ? iv.a : null;
      }
   }
}
