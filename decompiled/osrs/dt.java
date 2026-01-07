package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public final class dt implements ds {
   @ObfuscatedName("fy")
   @ObfuscatedSignature(
      signature = "Lrf;"
   )
   static gp a;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 748378341
   )
   private int b;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -88669421
   )
   private int c;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1038290587
   )
   private int d;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1185215949
   )
   private int e;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 624233795
   )
   private int f;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 570372601
   )
   private int g;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1513018543
   )
   private int h;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1079506623
   )
   private int i;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1381504471
   )
   private int j;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1477353883
   )
   private int k;

   dt() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "2137904343"
   )
   public final void a(jk var1) {
      this.k = jk.a((jk)var1, (byte)11);
      this.g = jk.a((jk)var1, (byte)7);
      this.j = var1.d();
      this.b = jk.a(var1, (byte)-43);
      this.f = var1.d();
      this.i = jk.a((jk)var1, (byte)52);
      this.h = var1.d();
      this.e = jk.a(var1, (byte)-62);
      this.c = var1.d();
      this.d = jk.a((jk)var1, (byte)8);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "668393896"
   )
   public final int[] a(int var1, int var2, int var3) {
      return !this.b(var1, var2, var3) ? null : new int[]{(this.h << 6) - (this.j << 6) + var2 + ((this.e << 3) - (this.b << 3)), var3 + ((this.c << 6) - (this.f << 6)) + ((this.d << 3) - (this.i << 3))};
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "-1948636213"
   )
   public final boolean b(int var1, int var2, int var3) {
      if (var1 >= this.k && var1 < this.g + this.k) {
         return var2 >= (this.j << 6) + (this.b << 3) && var2 <= (this.j << 6) + (this.b << 3) + 7 && var3 >= (this.f << 6) + (this.i << 3) && var3 <= (this.f << 6) + (this.i << 3) + 7;
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
         var1 += (this.j << 6) - (this.h << 6) + ((this.b << 3) - (this.e << 3));
         var2 = (this.f << 6) - (this.c << 6) + var2 + ((this.i << 3) - (this.d << 3));
         return new ew(this.k, var1, var2);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "839967711"
   )
   public final boolean b(int var1, int var2) {
      return var1 >= (this.h << 6) + (this.e << 3) && var1 <= (this.h << 6) + (this.e << 3) + 7 && var2 >= (this.c << 6) + (this.d << 3) && var2 <= (this.c << 6) + (this.d << 3) + 7;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lla;I)V",
      garbageValue = "-1851402279"
   )
   public final void a(df var1) {
      if (var1.h * 368158575 > this.h) {
         var1.h = this.h * -2024826993;
      }

      if (var1.e < this.h) {
         var1.e = this.h;
      }

      if (var1.d > this.c) {
         var1.d = this.c;
      }

      if (var1.l < this.c) {
         var1.l = this.c;
      }

   }
}
