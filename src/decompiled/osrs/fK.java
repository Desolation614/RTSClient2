package osrs;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
public final class fK implements Iterable {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Luv;"
   )
   im a;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Luv;"
   )
   public im b = new im();

   public fK() {
      this.b.aL = this.b;
      this.b.aK = this.b;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Luv;)V"
   )
   public final void a(im var1) {
      if (var1.aK != null) {
         var1.n();
      }

      var1.aK = this.b.aK;
      var1.aL = this.b;
      var1.aK.aL = var1;
      var1.aL.aK = var1;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "()Luv;"
   )
   public final im a() {
      im var1;
      if ((var1 = this.b.aL) == this.b) {
         return null;
      } else {
         var1.n();
         return var1;
      }
   }

   public final Iterator iterator() {
      return new fQ(this);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Luv;Luv;)V"
   )
   public static void a(dN var0, dM var1) {
      if (var0.aK != null) {
         var0.n();
      }

      var0.aK = var1;
      var0.aL = var1.aL;
      var0.aK.aL = var0;
      var0.aL.aK = var0;
   }

   @ObfuscatedName("ll")
   @ObfuscatedSignature(
      signature = "(Lqa;Luv;)Luv;"
   )
   public static im a(fK var0, im var1) {
      if (var1 == null) {
         var1 = var0.b.aL;
      } else {
         var1 = var1;
      }

      if (var1 == var0.b) {
         var0.a = null;
         return null;
      } else {
         var0.a = var1.aL;
         return var1;
      }
   }

   @ObfuscatedName("wt")
   @ObfuscatedSignature(
      signature = "(Lqa;)V"
   )
   public static void a(fK var0) {
      if (var0 == null) {
         fK var1 = var0;

         while(var1.b.aK != var1.b) {
            var1.b.aL.n();
         }
      }

      while(var0.b != var0.b.aL) {
         var0.b.aL.n();
      }

   }
}
