package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("we")
public final class iU extends je {
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "[Lrv;"
   )
   private gH[] e = new gH[16];
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "[Lrv;"
   )
   private gH[] f = new gH[16];
   @ObfuscatedName("ai")
   private int[] g = new int[16];
   @ObfuscatedName("aj")
   private int[][] h = new int[16][4];
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "[Lrv;"
   )
   private gH[] i = new gH[16];
   @ObfuscatedName("an")
   private int[] j = new int[16];
   @ObfuscatedName("ap")
   private int[][] k = new int[16][4];

   public iU(int var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);

      for(var1 = 0; var1 < 16; ++var1) {
         int var5 = cp.a(var2 = var1 << 7);
         var2 = ay.a(var2);
         int var6 = -(var3 * var5 - var2 * var4 >> 16);
         int var7 = var3 * var2 + var5 * var4 >> 16;
         int var8 = var5 * super.c - var2 * super.b >> 16;
         int var9 = var2 * super.c + var5 * super.b >> 16;
         int var10 = var5 * super.c + var2 * super.b >> 16;
         int var11 = var5 * super.b - var2 * super.c >> 16;
         this.k[var1] = new int[4];
         this.h[var1] = new int[4];
         this.k[var1][0] = var6 - var8;
         this.h[var1][0] = var7 + var9;
         this.k[var1][1] = var6 + var10;
         this.h[var1][1] = var7 + var11;
         this.k[var1][2] = var6 + var8;
         this.h[var1][2] = var7 - var9;
         this.k[var1][3] = var6 - var10;
         this.h[var1][3] = var7 - var11;
         this.g[var1] = Math.abs(var2 * super.b) >> 16;
         this.j[var1] = Math.abs(var5 * super.b) >> 16;
         var2 = Math.min(this.k[var1][0], Math.min(this.k[var1][1], Math.min(this.k[var1][2], this.k[var1][3])));
         var5 = Math.max(this.k[var1][0], Math.max(this.k[var1][1], Math.max(this.k[var1][2], this.k[var1][3])));
         var8 = Math.min(this.h[var1][0], Math.min(this.h[var1][1], Math.min(this.h[var1][2], this.h[var1][3])));
         var9 = Math.max(this.h[var1][0], Math.max(this.h[var1][1], Math.max(this.h[var1][2], this.h[var1][3])));
         this.i[var1] = new gH(var2, var8, var5 - var2, var9 - var8);
         var2 = Math.min(this.k[var1][2], Math.min(this.k[var1][3], var6));
         var5 = Math.max(this.k[var1][2], Math.max(this.k[var1][3], var6));
         var8 = Math.min(this.h[var1][2], Math.min(this.h[var1][3], var7));
         var9 = Math.max(this.h[var1][2], Math.max(this.h[var1][3], var7));
         this.f[var1] = new gH(var2, var8, var5 - var2, var9 - var8);
         var2 = Math.min(this.k[var1][0], Math.min(this.k[var1][1], var6));
         var5 = Math.max(this.k[var1][0], Math.max(this.k[var1][1], var6));
         var8 = Math.min(this.h[var1][0], Math.min(this.h[var1][1], var7));
         var9 = Math.max(this.h[var1][0], Math.max(this.h[var1][1], var7));
         this.e[var1] = new gH(var2, var8, var5 - var2, var9 - var8);
      }

   }
}
