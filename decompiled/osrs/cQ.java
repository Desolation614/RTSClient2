package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public final class cQ {
   @ObfuscatedName("qz")
   @ObfuscatedGetter(
      intValue = -210513467
   )
   static int a;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1747261115
   )
   int b;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 2081998313
   )
   int c;
   @ObfuscatedName("ai")
   final int[] d;
   @ObfuscatedName("aj")
   final int[][] e;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 558695873
   )
   private int h;
   @ObfuscatedName("an")
   final int[] f;
   @ObfuscatedName("ap")
   final int[][] g;

   cQ(int var1, int var2) {
      this.g = new int[var1][var2];
      this.e = new int[var1][var2];
      var1 = jN.a(var2 * var1 / 4);
      this.f = new int[var1];
      this.d = new int[var1];
      this.h = var1 - 1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-593320468"
   )
   final void a(int var1, int var2) {
      this.c = var1;
      this.b = var2;
   }

   @ObfuscatedName("ya")
   @ObfuscatedSignature(
      signature = "(Lkm;I)I"
   )
   public static int a(cQ var0, int var1) {
      if (var0 == null) {
         int var10000 = var0.h;
      }

      return var0.h;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(IIIIZIII)J",
      garbageValue = "-1383170489"
   )
   public static long a(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
      long var7 = (long)(var1 & 127 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16) | ((long)var5 & 4294967295L) << 20 | ((long)var6 & 4095L) << 52;
      if (var4) {
         var7 |= 524288L;
      }

      return var7;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[Ljava/lang/Object;III)V",
      garbageValue = "-1027036201"
   )
   public static void a(String[] var0, Object[] var1, int var2, int var3) {
      while(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(var4 = var2; var4 < var3; ++var4) {
            if (var6 == null || var0[var4] != null && var0[var4].compareTo(var6) < (var4 & 1)) {
               String var8 = var0[var4];
               var0[var4] = var0[var5];
               var0[var5] = var8;
               Object var9 = var1[var4];
               var1[var4] = var1[var5];
               var1[var5++] = var9;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         a(var0, var1, var2, var5 - 1);
         var2 = var5 + 1;
         var1 = var1;
         var0 = var0;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)[Lmv;",
      garbageValue = "1995725684"
   )
   public static k[] a() {
      return new k[]{k.p, k.j, k.n, k.i, k.l, k.c, k.a, k.m, k.h, k.g, k.u, k.r, k.d, k.f, k.k, k.z, k.w, k.t, k.e, k.v, k.o, k.s, k.x, k.b, k.q, k.y, k.A, k.X, k.L, k.I, k.V, k.Q, k.M, k.E, k.O, k.W, k.F, k.J, k.T, k.D, k.S, k.N, k.C, k.G, k.B, k.U, k.Z, k.Y, k.R, k.K, k.H, k.P, k.ak, k.ay, k.aa, k.ar, k.au, k.ad, k.al, k.aq, k.ai, k.ag, k.ax, k.aw, k.az, k.as, k.at, k.af, k.ah, k.ap, k.ae, k.ao, k.aj, k.ac, k.an, k.av, k.ab, k.am, k.aL, k.aB, k.aK, k.aE, k.aU, k.aV, k.aR, k.aD, k.aY, k.aX, k.aM, k.aI, k.aP, k.aN, k.aG, k.aT, k.aS, k.aQ, k.aC, k.aJ, k.aA, k.aZ, k.aO, k.aH, k.aW, k.aF, k.bt, k.bi, k.bp, k.bh, k.bm, k.be, k.bn, k.bl, k.ba, k.bw, k.bf, k.by, k.bq, k.br, k.bs, k.bc, k.bo, k.bz, k.bu, k.bb, k.bk, k.bj, k.bx, k.bg, k.bd, k.bv, k.bE, k.bA, k.bG, k.bC, k.bD, k.bF, k.bB};
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(Ltp;II)I",
      garbageValue = "1721632644"
   )
   public static int a(hD var0, int var1) {
      iv var2 = iv.c;
      gl.a(var0, var2, false);
      if (var1 >= 0) {
         int[] var5 = var0.a;
         int var4 = var0.c * 935110769;

         for(int var3 = 0; var3 < var4; ++var3) {
            if (var1 < var5[var3]) {
               return var3;
            }

            var1 -= var5[var3];
         }
      }

      return -1;
   }

   @ObfuscatedName("vf")
   @ObfuscatedSignature(
      signature = "(Lkm;I)[[I"
   )
   public static int[][] b(cQ var0, int var1) {
      if (var0 == null) {
         int[][] var10000 = var0.g;
      }

      return var0.g;
   }
}
