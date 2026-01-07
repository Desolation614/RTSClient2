package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public final class kl extends J {
   @ObfuscatedName("ac")
   boolean b = false;
   @ObfuscatedName("ai")
   int c;
   @ObfuscatedName("aj")
   public short[] d;
   @ObfuscatedName("al")
   public boolean e;
   @ObfuscatedName("an")
   public int f;
   @ObfuscatedName("ap")
   public int g;

   kl(int var1, short[] var2, int var3, int var4, boolean var5, boolean var6) {
      this.g = var1;
      this.d = var2;
      this.f = var3;
      this.c = var4;
      this.e = var5;
      this.b = var6;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lel;)Lds;"
   )
   private kl a(D var1) {
      this.d = var1.a(this.d);
      this.f = var1.a(this.g);
      if (this.f == this.c) {
         this.f = this.c = var1.b(this.g);
      } else {
         this.g = var1.b(this.f);
         this.c = var1.b(this.c);
         if (this.g == this.c) {
            this.g = this.f - 1;
         }
      }

      return this;
   }

   @ObfuscatedName("sd")
   @ObfuscatedSignature(
      signature = "(Lds;Lel;)Lds;"
   )
   public static kl a(kl var0, D var1) {
      if (var0 == null) {
         return var0.a(var1);
      } else {
         var0.d = var1.a(var0.d);
         var0.g = var1.a(var0.g);
         if (var0.f == var0.c) {
            var0.f = var0.c = var1.b(var0.f);
         } else {
            var0.f = var1.b(var0.f);
            var0.c = var1.b(var0.c);
            if (var0.f == var0.c) {
               --var0.f;
            }
         }

         return var0;
      }
   }
}
