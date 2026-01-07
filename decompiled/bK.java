package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public final class bK extends bD {
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1325069279
   )
   private int b;
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   private bO c;

   @ObfuscatedSignature(
      signature = "(Lio;Ljava/lang/String;I)V"
   )
   bK(bO var1, String var2, int var3) {
      super(var1, var2);
      this.c = var1;
      this.b = var3;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1519037099"
   )
   public final int b() {
      return this.b;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1702909446"
   )
   public final int c() {
      return 0;
   }
}
