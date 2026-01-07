package osrs;

import java.util.Iterator;
import net.runelite.api.HashTable;
import net.runelite.api.Node;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
public final class gb implements HashTable {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lub;"
   )
   private hR d;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "[Lub;"
   )
   hR[] a;
   @ObfuscatedName("al")
   int b;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lub;"
   )
   hR c;
   @ObfuscatedName("ap")
   private int e = 0;

   public gb(int var1) {
      this.b = var1;
      this.a = new hR[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         hR var3;
         (var3 = this.a[var2] = new hR()).ch = var3;
         var3.cg = var3;
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "()Lub;"
   )
   public final hR a() {
      this.e = 0;
      return this.c();
   }

   @ObfuscatedName("aj")
   public final int b() {
      int var1 = 0;

      hR var3;
      for(int var2 = 0; var2 < this.b; ++var2) {
         for(hR var4 = (var3 = this.a[var2]).ch; var4 != var3; var4 = var4.ch) {
            ++var1;
         }
      }

      return var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "()Lub;"
   )
   public final hR c() {
      hR var1;
      if (this.e > 0 && this.a[this.e - 1] != this.d) {
         var1 = this.d;
         this.d = var1.ch;
         return var1;
      } else {
         while(this.e < this.b) {
            if ((var1 = this.a[this.e++].ch) != this.a[this.e - 1]) {
               this.d = var1.ch;
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lub;J)V"
   )
   public final void a(hR var1, long var2) {
      if (var1.cg != null) {
         gk.a(var1);
      }

      hR var4 = this.a[(int)(var2 & (long)(this.b - 1))];
      var1.cg = var4.cg;
      var1.ch = var4;
      var1.cg.ch = var1;
      var1.ch.cg = var1;
      var1.cf = var2;
   }

   public final Iterator iterator() {
      return new ks(this);
   }

   public final Node get(long var1) {
      return bs.a(this, var1);
   }

   @ObfuscatedName("xr")
   @ObfuscatedSignature(
      signature = "(Lqq;J)Lub;"
   )
   public static hR a(gb var0, long var1) {
      hR var8;
      if (var0 == null) {
         gb var10000 = var0;
         long var6 = var1;
         var0 = var0;
         var8 = var10000.a[(int)(var1 & (long)(var0.b - 1))];

         for(var0.c = var8.cg; var8 != var0.d; var0.d = var0.c.ch) {
            if (var0.d.cf == var6) {
               var8 = var0.c;
               var0.c = var0.d.cg;
               return var8;
            }
         }

         var0.d = null;
         return null;
      } else {
         hR var3 = var0.a[(int)(var1 & (long)(var0.b - 1))];

         for(var0.c = var3.ch; var3 != var0.c; var0.c = var0.c.ch) {
            if (var0.c.cf == var1) {
               var8 = var0.c;
               var0.c = var0.c.ch;
               return var8;
            }
         }

         var0.c = null;
         return null;
      }
   }
}
