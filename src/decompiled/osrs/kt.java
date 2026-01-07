package osrs;

import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

final class kt implements Iterator {
   @ObfuscatedName("ns")
   @ObfuscatedSignature(
      signature = "Lqc;"
   )
   private fM a;
   @ObfuscatedName("po")
   @ObfuscatedSignature(
      signature = "Lud;"
   )
   private hT b;

   @ObfuscatedSignature(
      signature = "(Lqc;)V"
   )
   public kt(fM var1) {
      this.a = var1;
      this.b = this.a.b.e;
   }

   public final boolean hasNext() {
      return this.a.b != this.b;
   }

   public final void remove() {
      hT var1;
      if ((var1 = this.b.d) == this.a.b) {
         throw new IllegalStateException();
      } else {
         var1.a();
      }
   }

   public final Object next() {
      if (this.a.b == this.b) {
         throw new NoSuchElementException();
      } else {
         gQ var2 = (gQ)this.b;
         this.b = this.b.e;
         return var2;
      }
   }
}
