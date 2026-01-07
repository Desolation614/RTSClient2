package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
public final class fS {
   @ObfuscatedName("db")
   @ObfuscatedGetter(
      intValue = -1078559373
   )
   static int a;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lre;"
   )
   public go b = iF.b();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lre;"
   )
   public go c = hv.a(1.0F, 1.0F, 1.0F);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lrw;"
   )
   public gI d = fm.a();

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "805917751"
   )
   public final void a() {
      this.d.a();
      go.a(this.b, -1845540931);
      go.a(this.c, -2032090266);
   }

   public final String toString() {
      String var10000 = this.d.toString();
      return "[" + var10000 + "|" + this.b.toString() + "|" + this.c.toString() + "]";
   }

   public final boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (this == var1) {
         return true;
      } else if (!(var1 instanceof fS)) {
         return false;
      } else {
         fS var2 = (fS)var1;
         return this.d.equals(var2.d) && this.b.a(var2.b) && this.c.a(var2.c);
      }
   }

   public final int hashCode() {
      int var1 = (31 + this.d.hashCode()) * 31 + this.b.hashCode();
      return var1 * 31 + this.c.hashCode();
   }
}
