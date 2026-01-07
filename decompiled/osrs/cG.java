package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public final class cG implements ds {
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1496990717
   )
   private int a;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1501852901
   )
   private int b;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 51276729
   )
   private int c;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -888472545
   )
   private int d;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1370629845
   )
   private int e;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 706976047
   )
   private int f;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1542544165
   )
   private int g;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1505341487
   )
   private int h;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -991495653
   )
   private int i;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1303045837
   )
   private int j;

   cG() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "2137904343"
   )
   public final void a(jk var1) {
      this.j = jk.a(var1, (byte)-53);
      this.f = jk.a((jk)var1, (byte)75);
      this.i = var1.d();
      this.e = var1.d();
      this.g = var1.d();
      this.b = var1.d();
      this.a = var1.d();
      this.h = var1.d();
      this.d = var1.d();
      this.c = var1.d();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "668393896"
   )
   public final int[] a(int var1, int var2, int var3) {
      return !this.b(var1, var2, var3) ? null : new int[]{(this.a << 6) - (this.i << 6) + var2, var3 + ((this.h << 6) - (this.e << 6))};
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "-1948636213"
   )
   public final boolean b(int var1, int var2, int var3) {
      if (var1 >= this.j && var1 < this.f + this.j) {
         return var2 >> 6 >= this.i && var2 >> 6 <= this.g && var3 >> 6 >= this.e && var3 >> 6 <= this.b;
      } else {
         return false;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(III)Lnp;",
      garbageValue = "1118968187"
   )
   public final ew a(int var1, int var2) {
      if (!this.b(var1, var2)) {
         return null;
      } else {
         var1 += (this.i << 6) - (this.a << 6);
         var2 += (this.e << 6) - (this.h << 6);
         return new ew(this.j, var1, var2);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "839967711"
   )
   public final boolean b(int var1, int var2) {
      return var1 >> 6 >= this.a && var1 >> 6 <= this.d && var2 >> 6 >= this.h && var2 >> 6 <= this.c;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lla;I)V",
      garbageValue = "-1851402279"
   )
   public final void a(df var1) {
      if (var1.h * 368158575 > this.a) {
         var1.h = this.a * -2024826993;
      }

      if (var1.e < this.d) {
         var1.e = this.d;
      }

      if (var1.d > this.h) {
         var1.d = this.h;
      }

      if (var1.l < this.c) {
         var1.l = this.c;
      }

   }
}
