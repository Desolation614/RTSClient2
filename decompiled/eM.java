package osrs;

import net.runelite.api.widgets.WidgetConfigNode;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
public final class eM extends hR implements WidgetConfigNode {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 841739245
   )
   private int a;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1616303513
   )
   private int b;

   public eM(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final int getClickMask() {
      return this.a;
   }

   public final int getOpMask() {
      return this.b;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lps;Lps;ZLrf;B)V",
      garbageValue = "23"
   )
   public static void a(fE var0, fE var1, boolean var2, gp var3) {
      D.a = var0;
      gA.a = var1;
      jI.a = var2;
      iJ.a = D.a.d(10);
      jr.b = var3;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "(Lof;B)I"
   )
   public static int a(eM var0, byte var1) {
      if (var0 == null) {
         int var10000 = var0.a * 763073245;
      }

      return var0.b;
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      signature = "(Lof;I)I"
   )
   public static int a(eM var0, int var1) {
      return var0 == null ? var0.a : var0.a;
   }
}
