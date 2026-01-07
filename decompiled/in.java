package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uw")
public class in extends im {
   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      signature = "Luw;"
   )
   public in aM;
   @ObfuscatedName("em")
   @ObfuscatedSignature(
      signature = "Luw;"
   )
   public in aN;
   @ObfuscatedName("ep")
   public long aO;

   @ObfuscatedName("ji")
   public final void o() {
      if (this.aN != null) {
         this.aN.aM = this.aM;
         this.aM.aN = this.aN;
         this.aM = null;
         this.aN = null;
      }

   }
}
