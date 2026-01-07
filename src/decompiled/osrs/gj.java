package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public final class gj {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Luv;"
   )
   im a = new im();

   public gj() {
      this.a.aL = this.a;
      this.a.aK = this.a;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Luv;)V"
   )
   public final void a(fn var1) {
      if (var1.aK != null) {
         var1.n();
      }

      var1.aK = this.a;
      var1.aL = this.a.aL;
      var1.aK.aL = var1;
      var1.aL.aK = var1;
   }
}
