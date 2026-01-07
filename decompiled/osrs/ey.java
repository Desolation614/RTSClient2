package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public final class ey extends im {
   @ObfuscatedName("ai")
   public final int[] a;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 2137417273
   )
   public final int b;
   @ObfuscatedName("an")
   public final int[] c;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1125397623
   )
   public final int d;

   ey(int var1, int var2, int[] var3, int[] var4) {
      this.d = var1;
      this.b = var2;
      this.c = var3;
      this.a = var4;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1157994802"
   )
   public final boolean a(int var1, int var2) {
      if (var2 >= 0 && var2 < this.a.length) {
         int var3 = this.a[var2];
         if (var1 >= var3 && var1 <= var3 + this.c[var2]) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-2105783114"
   )
   public static int a(int var0) {
      return var0 >> 14 & 1023;
   }
}
