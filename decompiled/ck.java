package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public final class ck {
   @ObfuscatedName("ou")
   @ObfuscatedSignature(
      signature = "(Lov;I)I",
      garbageValue = "1213224984"
   )
   static int a(fd var0) {
      eM var1;
      int var2;
      if ((var1 = (eM)gb.a(client.cy, ((long)var0.m << 32) + (long)(var0.s * -744024149))) != null) {
         var2 = eM.a(var1, 290260604);
      } else {
         var2 = var0.aE;
      }

      var2 = var2;
      if (client.bm) {
         var2 |= 2097152;
      }

      return var2;
   }
}
