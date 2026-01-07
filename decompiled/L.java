package osrs;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("et")
public final class L {
   @ObfuscatedName("ai")
   int[] a;
   @ObfuscatedName("aj")
   int b;
   @ObfuscatedName("an")
   int[] c;
   @ObfuscatedName("ap")
   int d;

   L() {
      w var1;
      w.a((w)(var1 = E.l), 16);
      this.b = var1.a() != 0 ? w.a((w)var1, 4) + 1 : 1;
      if (var1.a() != 0) {
         w.a((w)var1, 8);
      }

      w.a((w)var1, 2);
      if (this.b > 1) {
         this.d = w.a((w)var1, 4);
      }

      this.c = new int[this.b];
      this.a = new int[this.b];

      for(int var2 = 0; var2 < this.b; ++var2) {
         w.a((w)var1, 8);
         this.c[var2] = w.a((w)var1, 8);
         this.a[var2] = w.a((w)var1, 8);
      }

   }
}
