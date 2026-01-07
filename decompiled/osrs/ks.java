package osrs;

import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

final class ks implements Iterator {
   @ObfuscatedName("lg")
   private int a;
   @ObfuscatedName("sr")
   @ObfuscatedSignature(
      signature = "Lqq;"
   )
   private gb b;
   @ObfuscatedName("ub")
   @ObfuscatedSignature(
      signature = "Lub;"
   )
   private hR c;

   @ObfuscatedSignature(
      signature = "(Lqq;)V"
   )
   public ks(gb var1) {
      this.b = var1;
   }

   public final boolean hasNext() {
      if (this.a > 0 && this.b.a[this.a - 1] != this.c) {
         return true;
      } else {
         for(int var1 = this.a; var1 < this.b.b; ++var1) {
            hR var2;
            hR var3 = (var2 = this.b.a[var1]).ch;
            if (var2 != var3) {
               return true;
            }
         }

         return false;
      }
   }

   public final Object next() {
      ks var1 = this;
      hR var2;
      if (this.a > 0 && this.b.a[this.a - 1] != this.c) {
         var2 = this.c;
         this.c = var2.ch;
         return var2;
      } else {
         while(var1.a < var1.b.b) {
            hR var3 = (var2 = var1.b.a[var1.a++]).ch;
            if (var2 != var3) {
               var1.c = var3.ch;
               return var3;
            }
         }

         throw new NoSuchElementException();
      }
   }
}
