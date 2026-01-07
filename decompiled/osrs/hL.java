package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
public final class hL {
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "120"
   )
   static int a(int var0) {
      return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
   }

   @ObfuscatedName("po")
   @ObfuscatedSignature(
      signature = "(Ljj;SS)V"
   )
   public static void a(class243 var0, short var1, short var2) {
      if (var0 == null) {
         var0.a(var1, var1);
      }

      if (var0.h != null) {
         for(int var3 = 0; var3 < var0.c; ++var3) {
            if (var0.h[var3] == var1) {
               var0.h[var3] = var2;
            }
         }
      }

   }
}
