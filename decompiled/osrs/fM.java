package osrs;

import java.util.Iterator;
import net.runelite.api.Deque;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public final class fM implements Deque {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lud;"
   )
   hT a;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lud;"
   )
   hT b = new hT();

   public fM() {
      this.b.e = this.b;
      this.b.d = this.b;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "()Lud;"
   )
   public final hT a() {
      hT var1;
      if ((var1 = this.a) == this.b) {
         this.a = null;
         return null;
      } else {
         this.a = var1.e;
         return var1;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lud;)V"
   )
   public final void a(gQ var1) {
      if (var1.d != null) {
         var1.a();
      }

      var1.d = this.b.d;
      var1.e = this.b;
      var1.d.e = var1;
      var1.e.d = var1;
   }

   public final Iterator iterator() {
      return new kt(this);
   }

   public final void addLast(Object var1) {
      gQ var2 = (gQ)var1;
      this.a(var2);
   }

   public final void clear() {
      Iterator var1 = this.iterator();

      while(var1.hasNext()) {
         var1.remove();
      }

   }

   @ObfuscatedName("sd")
   @ObfuscatedSignature(
      signature = "(Lqc;)Lud;"
   )
   public static hT a(fM var0) {
      hT var1;
      if (var0 == null) {
         if ((var1 = var0.a.e) == var0.b) {
            var0.b = null;
            return null;
         } else {
            var0.b = var1.e;
            return var1;
         }
      } else if ((var1 = var0.b.e) == var0.b) {
         var0.a = null;
         return null;
      } else {
         var0.a = var1.e;
         return var1;
      }
   }
}
