package osrs;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public final class fT implements Iterator {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Luw;"
   )
   private in a;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Luw;"
   )
   private in b = null;
   @ObfuscatedName("an")
   private int c;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lqx;"
   )
   private gg d;

   @ObfuscatedSignature(
      signature = "(Lqx;)V"
   )
   fT(gg var1) {
      this.d = var1;
      this.a = this.d.c[0].aM;
      this.c = 1;
      this.b = null;
   }

   public final boolean hasNext() {
      if (this.d.c[this.c - 1] != this.a) {
         return true;
      } else {
         while(this.c < this.d.b) {
            if (this.d.c[this.c++].aM != this.d.c[this.c - 1]) {
               this.a = this.d.c[this.c - 1].aM;
               return true;
            }

            this.a = this.d.c[this.c - 1];
         }

         return false;
      }
   }

   public final void remove() {
      if (this.b == null) {
         throw new IllegalStateException();
      } else {
         this.b.o();
         this.b = null;
      }
   }

   public final Object next() {
      in var1;
      if (this.d.c[this.c - 1] != this.a) {
         var1 = this.a;
         this.a = var1.aM;
         this.b = var1;
         return var1;
      } else {
         while(this.c < this.d.b) {
            if ((var1 = this.d.c[this.c++].aM) != this.d.c[this.c - 1]) {
               this.a = var1.aM;
               this.b = var1;
               return var1;
            }
         }

         return null;
      }
   }
}
