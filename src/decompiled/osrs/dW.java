package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public final class dW {
   @ObfuscatedName("oz")
   @ObfuscatedSignature(
      signature = "(Lov;B)Ljava/lang/String;",
      garbageValue = "-33"
   )
   static String a(fd var0) {
      if ((ck.a(var0) >> 11 & 63) == 0) {
         return null;
      } else {
         return var0.bt != null && !var0.bt.trim().isEmpty() ? var0.bt : null;
      }
   }
}
