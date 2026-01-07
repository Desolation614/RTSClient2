package osrs;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("do")
public final class kh {
   @ObfuscatedName("aa")
   int[] a;
   @ObfuscatedName("ac")
   int b;
   @ObfuscatedName("ai")
   int c;
   @ObfuscatedName("aj")
   int d;
   @ObfuscatedName("al")
   int e;
   @ObfuscatedName("an")
   int f;
   @ObfuscatedName("ap")
   int g;

   kh() {
      w var1 = E.l;
      this.g = w.a((w)var1, 16);
      this.d = w.a((w)var1, 24);
      this.f = w.a((w)var1, 24);
      this.c = w.a((w)var1, 24) + 1;
      this.e = w.a((w)var1, 6) + 1;
      this.b = w.a((w)var1, 8);
      int[] var2 = new int[this.e];

      int var3;
      for(var3 = 0; var3 < this.e; ++var3) {
         int var4 = 0;
         int var5 = w.a((w)var1, 3);
         if (var1.a() != 0) {
            var4 = w.a((w)var1, 5);
         }

         var2[var3] = var4 << 3 | var5;
      }

      this.a = new int[this.e << 3];

      for(var3 = 0; var3 < this.e << 3; ++var3) {
         this.a[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? w.a((w)var1, 8) : -1;
      }

   }
}
