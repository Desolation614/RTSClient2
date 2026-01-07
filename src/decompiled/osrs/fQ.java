package osrs;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
public final class fQ implements Iterator {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Luv;"
   )
   private im a;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Luv;"
   )
   private im b = null;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lqa;"
   )
   private fK c;

   @ObfuscatedSignature(
      signature = "(Lqa;)V"
   )
   fQ(fK var1) {
      this.c = var1;
      this.a = this.c.b.aL;
      this.b = null;
   }

   public final Object next() {
      im var1;
      if ((var1 = this.a) == this.c.b) {
         var1 = null;
         this.a = null;
      } else {
         this.a = var1.aL;
      }

      this.b = var1;
      return var1;
   }

   public final boolean hasNext() {
      return this.c.b != this.a;
   }

   public final void remove() {
      if (this.b == null) {
         throw new IllegalStateException();
      } else {
         this.b.n();
         this.b = null;
      }
   }
}
