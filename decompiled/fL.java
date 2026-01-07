package osrs;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
public final class fL implements Iterator {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lub;"
   )
   private hR b;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lub;"
   )
   private hR c = null;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lqh;"
   )
   fR a;

   @ObfuscatedSignature(
      signature = "(Lqh;)V"
   )
   fL(fR var1) {
      jl.a(this, var1);
   }

   @ObfuscatedName("aj")
   private void a() {
      if (this.c == null) {
         throw new IllegalStateException();
      } else {
         gk.a(this.b);
         this.c = null;
      }
   }

   public final Object next() {
      hR var1;
      if ((var1 = this.b) == this.a.a) {
         var1 = null;
         this.b = null;
      } else {
         this.b = var1.ch;
      }

      this.c = var1;
      return var1;
   }

   public final boolean hasNext() {
      return this.a.a != this.b && this.b != null;
   }

   public final void remove() {
      if (this.c == null) {
         throw new IllegalStateException();
      } else {
         gk.a(this.c);
         this.c = null;
      }
   }

   @ObfuscatedName("qv")
   @ObfuscatedSignature(
      signature = "(Lqb;)V"
   )
   public static void a(fL var0) {
      if (var0 == null) {
         var0.a();
      }

      var0.b = var0.a != null ? var0.a.a.ch : null;
      var0.c = null;
   }
}
