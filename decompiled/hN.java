package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
public final class hN {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lty;"
   )
   static final hN a = new hN(3);
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 749709939
   )
   final int b;

   private hN(int var1) {
      this.b = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "([BILjava/lang/CharSequence;I)I",
      garbageValue = "504277750"
   )
   public static int a(byte[] var0, int var1, CharSequence var2) {
      int var3 = var2.length();
      int var4 = var1;

      for(int var5 = 0; var5 < var3; ++var5) {
         char var6;
         if ((var6 = var2.charAt(var5)) <= 127) {
            var0[var4++] = (byte)var6;
         } else if (var6 <= 2047) {
            var0[var4++] = (byte)(192 | var6 >> 6);
            var0[var4++] = (byte)(128 | var6 & 63);
         } else {
            var0[var4++] = (byte)(224 | var6 >> 12);
            var0[var4++] = (byte)(128 | var6 >> 6 & 63);
            var0[var4++] = (byte)(128 | var6 & 63);
         }
      }

      return var4 - var1;
   }

   @ObfuscatedName("io")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-19949134"
   )
   static void a(int var0) {
      client.aI = 0L;
      if (var0 >= 2) {
         client.aT = true;
         client.L();
      } else {
         client.aT = false;
         client.L();
      }

      if (eg.c() == 1) {
         dF.c.a(765, 503);
      } else {
         dF.c.a(7680, 2160);
      }

      if (client.aa >= 25) {
         y.a();
      }

   }

   static {
      new hN(1);
   }
}
