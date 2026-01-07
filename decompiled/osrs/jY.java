package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public final class jY extends jX {
   @ObfuscatedName("ai")
   private int b = 0;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   private fU c = new fU();
   @ObfuscatedName("an")
   private int d = -1;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   fU a = new fU();

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "()Ldf;"
   )
   protected final jX a() {
      return (jX)fU.b(this.a);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "()Ldf;"
   )
   protected final jX b() {
      return (jX)fU.e(this.a);
   }

   @ObfuscatedName("ag")
   private void c(int[] var1, int var2, int var3) {
      for(jX var4 = (jX)fU.e(this.a); var4 != null; var4 = (jX)fU.b(this.a)) {
         var4.b(var1, var2, var3);
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Lub;Len;)V"
   )
   private void a(hR var1, F var2) {
      while(this.c.a != var1 && ((F)var1).a <= var2.a) {
         var1 = var1.ch;
      }

      fU.a(var2, var1);
      this.d = ((F)this.c.a.ch).a;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Ldf;)V"
   )
   public final synchronized void a(o var1) {
      gk.a(var1);
   }

   @ObfuscatedName("am")
   protected final int c() {
      return 0;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(Len;)V"
   )
   private void a(F var1) {
      gk.a(var1);
      hR var2;
      if ((var2 = this.c.a.ch) == this.c.a) {
         this.d = -1;
      } else {
         this.d = ((F)var2).a;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Ldf;)V"
   )
   public final synchronized void a(jX var1) {
      this.a.a((hR)var1);
   }

   @ObfuscatedName("ar")
   private void b(int var1) {
      for(jX var2 = (jX)fU.e(this.a); var2 != null; var2 = (jX)fU.b(this.a)) {
         var2.a(var1);
      }

   }

   @ObfuscatedName("au")
   public final synchronized void a(int var1) {
      do {
         if (this.d < 0) {
            this.b(var1);
            return;
         }

         if (this.b + var1 < this.d) {
            this.b += var1;
            this.b(var1);
            return;
         }

         int var2 = this.d - this.b;
         this.b(var2);
         var1 -= var2;
         this.b += var2;
         a(this);
         F var6;
         synchronized(var6 = (F)fU.e(this.c)) {
            int var4;
            if ((var4 = var6.a()) < 0) {
               var6.a = 0;
               this.a(var6);
            } else {
               var6.a = var4;
               this.a(var6.ch, var6);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("bx")
   public final synchronized void a(int[] var1, int var2, int var3) {
      do {
         if (this.d < 0) {
            this.c(var1, var2, var3);
            return;
         }

         if (var3 + this.b < this.d) {
            this.b += var3;
            this.c(var1, var2, var3);
            return;
         }

         int var4 = this.d - this.b;
         this.c(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.b += var4;
         a(this);
         F var8;
         synchronized(var8 = (F)fU.e(this.c)) {
            int var6;
            if ((var6 = var8.a()) < 0) {
               var8.a = 0;
               this.a(var8);
            } else {
               var8.a = var6;
               this.a(var8.ch, var8);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("tz")
   @ObfuscatedSignature(
      signature = "(Ldg;)V"
   )
   private static void a(jY var0) {
      if (var0.b > 0) {
         for(F var1 = (F)fU.e(var0.c); var1 != null; var1 = (F)fU.b(var0.c)) {
            var1.a -= var0.b;
         }

         var0.d -= var0.b;
         var0.b = 0;
      }

   }
}
