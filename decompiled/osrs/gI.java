package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public final class gI {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1454620925
   )
   private static int g;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1880340437
   )
   static int a;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "[Lrw;"
   )
   static gI[] b;
   @ObfuscatedName("aa")
   float c;
   @ObfuscatedName("ac")
   float d;
   @ObfuscatedName("ai")
   float e;
   @ObfuscatedName("al")
   float f;

   gI() {
      a(this, 2085242843);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Lrw;I)V",
      garbageValue = "-1952176513"
   )
   public final void a(gI var1) {
      this.c(this.d * var1.f + var1.e * this.c + this.e * var1.c - var1.d * this.f, var1.c * this.f - var1.e * this.d + var1.f * this.c + this.e * var1.d, var1.d * this.c + (this.f * var1.e + this.d * var1.c - this.e * var1.f), this.c * var1.c - var1.e * this.e - var1.f * this.f - this.d * var1.d);
   }

   @ObfuscatedName("ac")
   private void c() {
      synchronized(b) {
         if (a < g) {
            b[++a - 1] = this;
         }

      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(FFFFI)V",
      garbageValue = "1795429539"
   )
   private void b(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.sin((double)(0.5F * var4));
      var4 = (float)Math.cos((double)(var4 * 0.5F));
      this.e = var5 * var1;
      this.f = var2 * var5;
      this.d = var3 * var5;
      this.c = var4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-655322342"
   )
   public final void a() {
      synchronized(b) {
         if (a < g) {
            b[++a - 1] = this;
         }

      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(FFFI)V",
      garbageValue = "-495368862"
   )
   public final void a(float var1, float var2, float var3) {
      this.b(0.0F, 1.0F, 0.0F, var1);
      gI var4;
      (var4 = fm.a()).b(1.0F, 0.0F, 0.0F, var2);
      this.a(var4);
      var4.b(0.0F, 0.0F, 1.0F, var3);
      this.a(var4);
      var4.a();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(FFFFI)V",
      garbageValue = "-1695580763"
   )
   private void c(float var1, float var2, float var3, float var4) {
      this.e = var1;
      this.f = var2;
      this.d = var3;
      this.c = var4;
   }

   public final int hashCode() {
      float var1 = (31.0F + this.e) * 31.0F + this.f;
      var1 = this.d + 31.0F * var1;
      return (int)(this.c + var1 * 31.0F);
   }

   public final String toString() {
      return this.e + "," + this.f + "," + this.d + "," + this.c;
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof gI)) {
         return false;
      } else {
         gI var2 = (gI)var1;
         return this.e == var2.e && var2.f == this.f && this.d == var2.d && var2.c == this.c;
      }
   }

   @ObfuscatedName("sd")
   public final void a(float var1, float var2, float var3, float var4) {
      this.b(var1, var2, var3, var4);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1467820326"
   )
   static int a(int var0) {
      return var0 - 1;
   }

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      signature = "(Lrw;I)V"
   )
   public static void a(gI var0, int var1) {
      if (var0 == null) {
         var0.c();
      }

      var0.d = 0.0F;
      var0.f = 0.0F;
      var0.e = 0.0F;
      var0.c = 1.0F;
   }

   @ObfuscatedName("km")
   @ObfuscatedSignature(
      signature = "()Lrw;"
   )
   public static gI b() {
      return fm.a();
   }

   static {
      new gI();
      b = new gI[0];
      g = 16;
      b = new gI[16];
      a = 0;
   }
}
