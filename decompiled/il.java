package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
public abstract class il {
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1382075685
   )
   private int a = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1510255345
   )
   private int c = 0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1517811763
   )
   private int d = 0;
   @ObfuscatedName("au")
   double b = 0.0D;

   il(int var1, int var2) {
      this.c = var1;
      this.a = 0;
      this.d = var2 >= 0 && var2 <= 27 ? var2 : 0;
      this.b = hJ.a(this.a, this.c, this.d);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1728415487"
   )
   public final void d() {
      if (this.a < this.c) {
         ++this.a;
         this.b = hJ.a(this.a, this.c, this.d);
      }

   }
}
