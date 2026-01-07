package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
public final class do implements ds {
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -2027904087
   )
   private int a;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1451885025
   )
   private int b;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1277316649
   )
   private int c;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1742668909
   )
   private int d;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 16890185
   )
   private int e;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -2086652681
   )
   private int f;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1932073375
   )
   private int g;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -544494821
   )
   private int h;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1009718171
   )
   private int i;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1252243189
   )
   private int j;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -802542697
   )
   private int k;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -354932289
   )
   private int l;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 815553665
   )
   private int m;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -601900463
   )
   private int n;

   do() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "2137904343"
   )
   public final void a(jk var1) {
      this.l = jk.a(var1, (byte)-12);
      this.h = jk.a(var1, (byte)-41);
      this.k = var1.d();
      this.a = jk.a(var1, (byte)-10);
      this.f = jk.a(var1, (byte)-63);
      this.g = var1.d();
      this.j = jk.a((jk)var1, (byte)51);
      this.e = jk.a((jk)var1, (byte)47);
      this.i = var1.d();
      this.n = jk.a(var1, (byte)-4);
      this.c = jk.a((jk)var1, (byte)37);
      this.b = var1.d();
      this.m = jk.a((jk)var1, (byte)13);
      this.d = jk.a(var1, (byte)-87);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "668393896"
   )
   public final int[] a(int var1, int var2, int var3) {
      return !this.b(var1, var2, var3) ? null : new int[]{(this.i << 6) - (this.k << 6) + var2 + ((this.n << 3) - (this.a << 3)), var3 + ((this.b << 6) - (this.g << 6)) + ((this.m << 3) - (this.j << 3))};
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "-1948636213"
   )
   public final boolean b(int var1, int var2, int var3) {
      if (var1 >= this.l && var1 < this.h + this.l) {
         return var2 >= (this.k << 6) + (this.a << 3) && var2 <= (this.k << 6) + (this.f << 3) + 7 && var3 >= (this.g << 6) + (this.j << 3) && var3 <= (this.g << 6) + (this.e << 3) + 7;
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
         var1 += (this.k << 6) - (this.i << 6) + ((this.a << 3) - (this.n << 3));
         var2 = (this.g << 6) - (this.b << 6) + var2 + ((this.j << 3) - (this.m << 3));
         return new ew(this.l, var1, var2);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "839967711"
   )
   public final boolean b(int var1, int var2) {
      return var1 >= (this.i << 6) + (this.n << 3) && var1 <= (this.i << 6) + (this.c << 3) + 7 && var2 >= (this.b << 6) + (this.m << 3) && var2 <= (this.b << 6) + (this.d << 3) + 7;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lla;I)V",
      garbageValue = "-1851402279"
   )
   public final void a(df var1) {
      if (var1.h * 368158575 > this.i) {
         var1.h = this.i * -2024826993;
      }

      if (var1.e < this.i) {
         var1.e = this.i;
      }

      if (var1.d > this.b) {
         var1.d = this.b;
      }

      if (var1.l < this.b) {
         var1.l = this.b;
      }

   }
}
