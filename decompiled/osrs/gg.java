package osrs;

import java.util.Iterator;
import net.runelite.api.IndexedObjectSet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
public final class gg implements Iterable, IndexedObjectSet {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Luw;"
   )
   in a;
   @ObfuscatedName("aj")
   int b;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "[Luw;"
   )
   in[] c;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lqj;"
   )
   private fT d;

   public gg(int var1) {
      this.b = var1;
      this.c = new in[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         in var3;
         (var3 = this.c[var2] = new in()).aM = var3;
         var3.aN = var3;
      }

      this.d = new fT(this);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(J)Luw;"
   )
   public final in a(long var1) {
      in var3 = this.c[(int)(var1 & (long)(this.b - 1))];

      for(this.a = var3.aM; var3 != this.a; this.a = this.a.aM) {
         if (this.a.aO == var1) {
            in var4 = this.a;
            this.a = this.a.aM;
            return var4;
         }
      }

      this.a = null;
      return null;
   }

   public final Iterator iterator() {
      return new fT(this);
   }

   public final Object byIndex(int var1) {
      long var5 = (long)var1;
      return this.a(var5);
   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      signature = "(Ltr;II)V",
      garbageValue = "1421943498"
   )
   public static void a(hG var0, int var1) {
   }

   @ObfuscatedName("nu")
   @ObfuscatedSignature(
      signature = "(Lqx;)V"
   )
   public static void a(gg var0) {
      int var1;
      in var2;
      in var3;
      if (var0 == null) {
         var0 = var0;

         for(var1 = 0; var1 < var0.b; ++var1) {
            var2 = var0.c[var1];

            while((var3 = var2.aM) != var2) {
               var3.o();
            }
         }

         var0.a = null;
      } else {
         for(var1 = 0; var1 < var0.b; ++var1) {
            var2 = var0.c[var1];

            while((var3 = var2.aM) != var2) {
               var3.o();
            }
         }

         var0.a = null;
      }
   }

   @ObfuscatedName("vo")
   @ObfuscatedSignature(
      signature = "(Lqx;Luw;J)V"
   )
   public static void a(gg var0, jE var1, long var2) {
      if (var0 == null) {
         if (var1.aN != null) {
            var1.o();
         }

         in var4 = var0.c[(int)(var2 & (long)(var0.b - 1))];
         var1.aN = var4.aM;
         var1.aM = var4;
         var1.aM.aN = var1;
         var1.aN.aM = var1;
         var1.aO = var2;
      }

      if (var1.aN != null) {
         var1.o();
      }

      in var9 = var0.c[(int)(var2 & (long)(var0.b - 1))];
      var1.aN = var9.aN;
      var1.aM = var9;
      var1.aN.aM = var1;
      var1.aM.aN = var1;
      var1.aO = var2;
   }
}
