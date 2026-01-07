package osrs;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("se")
public abstract class gR implements Comparator {
   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      signature = "Lvf;"
   )
   static iw c;
   @ObfuscatedName("aj")
   private Comparator a;

   protected gR() {
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(Lsi;Lsi;I)I",
      garbageValue = "-1917332522"
   )
   protected final int a(gX var1, gX var2) {
      return this.a == null ? 0 : this.a.compare(var1, var2);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;I)V",
      garbageValue = "951128096"
   )
   final void a(Comparator var1) {
      while(this.a != null) {
         if (!(this.a instanceof gR)) {
            return;
         }

         this = (gR)this.a;
      }

      this.a = var1;
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
