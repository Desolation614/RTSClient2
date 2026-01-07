package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
public final class gq {
   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      signature = "Lql;"
   )
   public static fV a;
   @ObfuscatedName("ss")
   @ObfuscatedGetter(
      intValue = -805103121
   )
   static int b;
   @ObfuscatedName("aa")
   float c = 1.0F;
   @ObfuscatedName("ac")
   float d = 0.0F;
   @ObfuscatedName("ag")
   float e = 0.0F;
   @ObfuscatedName("ah")
   float f = 0.0F;
   @ObfuscatedName("ai")
   float g = 0.0F;
   @ObfuscatedName("aj")
   float h = 0.0F;
   @ObfuscatedName("al")
   float i = 0.0F;
   @ObfuscatedName("am")
   float j = 1.0F;
   @ObfuscatedName("an")
   float k = 1.0F;
   @ObfuscatedName("ap")
   float l = 0.0F;
   @ObfuscatedName("ar")
   float m = 0.0F;
   @ObfuscatedName("au")
   float n = 0.0F;

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(FB)V",
      garbageValue = "-100"
   )
   final void a(float var1) {
      float var2 = (float)Math.cos((double)var1);
      var1 = (float)Math.sin((double)var1);
      float var3 = this.k;
      float var4 = this.f;
      float var5 = this.l;
      float var6 = this.d;
      this.k = var3 * var2 - this.m * var1;
      this.m = var2 * this.m + var3 * var1;
      this.f = var4 * var2 - this.c * var1;
      this.c = var4 * var1 + this.c * var2;
      this.l = var5 * var2 - var1 * this.e;
      this.e = var5 * var1 + var2 * this.e;
      this.d = var6 * var2 - var1 * this.i;
      this.i = var2 * this.i + var1 * var6;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(FI)V",
      garbageValue = "-1240324780"
   )
   public final void b(float var1) {
      float var2 = (float)Math.cos((double)var1);
      var1 = (float)Math.sin((double)var1);
      float var3 = this.m;
      float var4 = this.c;
      float var5 = this.e;
      float var6 = this.i;
      this.m = var2 * var3 - var1 * this.h;
      this.h = var1 * var3 + this.h * var2;
      this.c = var2 * var4 - var1 * this.n;
      this.n = var2 * this.n + var4 * var1;
      this.e = var2 * var5 - this.j * var1;
      this.j = this.j * var2 + var1 * var5;
      this.i = var6 * var2 - this.g * var1;
      this.g = var6 * var1 + var2 * this.g;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(FFFI)V",
      garbageValue = "1766325916"
   )
   public final void a(float var1, float var2, float var3) {
      this.d += var1;
      this.i += var2;
      this.g += var3;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(FI)V",
      garbageValue = "-1593837146"
   )
   public final void c(float var1) {
      float var2 = (float)Math.cos((double)var1);
      var1 = (float)Math.sin((double)var1);
      float var3 = this.k;
      float var4 = this.f;
      float var5 = this.l;
      float var6 = this.d;
      this.k = var3 * var2 + this.h * var1;
      this.h = this.h * var2 - var3 * var1;
      this.f = var2 * var4 + this.n * var1;
      this.n = this.n * var2 - var4 * var1;
      this.l = var1 * this.j + var5 * var2;
      this.j = var2 * this.j - var5 * var1;
      this.d = var2 * var6 + this.g * var1;
      this.g = var2 * this.g - var6 * var1;
   }

   public final String toString() {
      return this.k + "," + this.f + "," + this.l + "," + this.d + "\n" + this.m + "," + this.c + "," + this.e + "," + this.i + "\n" + this.h + "," + this.n + "," + this.j + "," + this.g;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(Ltp;B)I",
      garbageValue = "1"
   )
   public static int a(hD var0) {
      gl.a(var0, (iv)null, false);
      int var1 = var0.c * 935110769;
      int var2 = -1;
      int var6;
      if (var0.d == iv.c) {
         int[] var3 = var0.a;

         for(var6 = 0; var6 < var1; ++var6) {
            if (var2 == -1 || var3[var6] < var3[var2]) {
               var2 = var6;
            }
         }
      } else if (var0.d == iv.a) {
         long[] var8 = var0.f;

         for(var6 = 0; var6 < var1; ++var6) {
            if (var2 == -1 || var8[var6] < var8[var2]) {
               var2 = var6;
            }
         }
      } else if (var0.d == iv.b) {
         String var9 = null;
         Object[] var7 = var0.b;

         for(int var4 = 0; var4 < var1; ++var4) {
            String var5 = (String)var7[var4];
            if (var2 == -1 || var5 != null && var5.compareTo(var9) < 0) {
               var2 = var4;
               var9 = var5;
            }
         }
      }

      return var2;
   }

   static {
      new gq();
   }
}
