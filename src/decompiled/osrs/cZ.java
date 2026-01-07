package osrs;

import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public final class cZ {
   cZ() {
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)[Laa;",
      garbageValue = "1323089697"
   )
   public static l[] a() {
      return new l[]{l.b};
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Z",
      garbageValue = "1256893014"
   )
   static boolean a(String var0) {
      try {
         new URL(var0);
         return true;
      } catch (MalformedURLException var1) {
         return false;
      }
   }
}
