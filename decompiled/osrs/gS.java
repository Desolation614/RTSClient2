package osrs;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
final class gS implements Comparator {
   @ObfuscatedSignature(
      signature = "Lso;"
   )
   private hb a;

   @ObfuscatedSignature(
      signature = "(Lso;)V"
   )
   gS(hb var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      return super.equals(var1);
   }

   public final int compare(Object var1, Object var2) {
      gM var10000 = (gM)var1;
      gM var4 = (gM)var2;
      gM var3 = var10000;
      if (var10000.c > var4.c) {
         return 1;
      } else {
         return var3.c < var4.c ? -1 : 0;
      }
   }
}
