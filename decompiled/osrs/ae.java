package osrs;

import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
final class ae implements Callable {
   public final Object call() {
      throw null;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "-929572055"
   )
   public static boolean a(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "798264099"
   )
   static final boolean a() {
      return cf.c;
   }
}
