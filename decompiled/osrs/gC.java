package osrs;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
public final class gC implements Iterator {
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   public static fE a;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -811791685
   )
   private int b = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 315447363
   )
   private int c;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lrq;"
   )
   private gB d;

   @ObfuscatedSignature(
      signature = "(Lrq;)V"
   )
   gC(gB var1) {
      this.c = this.d.c;
      this.d = var1;
   }

   public final boolean hasNext() {
      return this.b < this.d.a;
   }

   public final Object next() {
      if (this.d.c != this.c) {
         throw new ConcurrentModificationException();
      } else if (this.b < this.d.a) {
         Object var1 = this.d.b[this.b].b;
         ++this.b;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public final void remove() {
      throw new UnsupportedOperationException();
   }
}
