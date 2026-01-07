package osrs;

import net.runelite.api.WidgetNode;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public final class jR extends hR implements WidgetNode {
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      signature = "Lwd;"
   )
   static iT a;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -2106237637
   )
   int b;
   @ObfuscatedName("an")
   boolean c = false;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -450283911
   )
   int d;

   jR() {
   }

   public final int getId() {
      return this.d;
   }

   public final int getModalMode() {
      return this.b;
   }

   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      signature = "(Lce;I)V",
      garbageValue = "-1451334217"
   )
   static void a(iF var0) {
      if (client.bn != var0) {
         client.bn = var0;
      }

   }
}
