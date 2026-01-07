package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public final class dB extends dy {
   @ObfuscatedName("mp")
   @ObfuscatedGetter(
      intValue = -53317489
   )
   static int a;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1990878815
   )
   private int r;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -117555121
   )
   int b;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 541915447
   )
   int p;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 494197731
   )
   int q;

   dB() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-1467436394"
   )
   final void a(jk var1) {
      super.m = Math.min(super.m, 4);
      super.j = new short[1][64][64];
      super.f = new short[super.m][64][64];
      super.i = new byte[super.m][64][64];
      super.o = new byte[super.m][64][64];
      super.n = new di[super.m][64][64][];
      if (jk.a((jk)var1, (byte)59) != dG.a.c) {
         throw new IllegalStateException("");
      } else {
         int var2 = jk.a((jk)var1, (byte)43);
         int var3 = jk.a(var1, (byte)-26);
         int var4 = jk.a(var1, (byte)-84);
         int var5 = jk.a(var1, (byte)-57);
         if (var2 == super.k && var3 == super.h && var4 == this.r && var5 == this.b) {
            for(var2 = 0; var2 < 8; ++var2) {
               for(var3 = 0; var3 < 8; ++var3) {
                  this.a(var2 + (this.r << 3), var3 + (this.b << 3), var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;B)V",
      garbageValue = "-103"
   )
   final void b(jk var1) {
      if (jk.a((jk)var1, (byte)63) != dg.a.d) {
         throw new IllegalStateException("");
      } else {
         super.g = jk.a((jk)var1, (byte)99);
         super.m = jk.a(var1, (byte)-18);
         super.d = var1.d() * 135645033;
         super.c = var1.d();
         this.p = jk.a(var1, (byte)-43);
         this.q = jk.a(var1, (byte)-100);
         super.k = var1.d();
         super.h = var1.d();
         this.r = jk.a(var1, (byte)-37);
         this.b = jk.a(var1, (byte)-36);
         super.l = var1.u();
         super.e = var1.u();
      }
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof dB)) {
         return false;
      } else {
         dB var2 = (dB)var1;
         if (super.k == var2.k && super.h == var2.h) {
            return this.r == var2.r && var2.b == this.b;
         } else {
            return false;
         }
      }
   }

   public final int hashCode() {
      return super.k | super.h << 8 | this.r << 16 | this.b << 24;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(Ltp;IIB)V",
      garbageValue = "79"
   )
   public static void a(hD var0, int var1, int var2) {
      gl.a(var0, (iv)null, true);
      if (var1 >= 0 && var2 >= 0 && var1 < var0.c * 935110769 && var2 < var0.c * 935110769) {
         if (var2 != var1) {
            if (var0.d == iv.c) {
               int[] var8;
               int var10 = (var8 = var0.a)[var1];
               var8[var1] = var8[var2];
               var8[var2] = var10;
            } else if (var0.d == iv.a) {
               long[] var7;
               long var9 = (var7 = var0.f)[var1];
               var7[var1] = var7[var2];
               var7[var2] = var9;
            } else {
               Object[] var6;
               Object var4 = (var6 = var0.b)[var1];
               var6[var1] = var6[var2];
               var6[var2] = var4;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(Llu;B)I"
   )
   public static int a(dB var0, byte var1) {
      return var0 == null ? var0.r : var0.r;
   }
}
