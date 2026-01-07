package osrs;

import net.runelite.mapping.ObfuscatedName;

class kq {
   @ObfuscatedName("xj")
   public final int[][] a;
   @ObfuscatedName("bg")
   public final boolean b;
   @ObfuscatedName("gv")
   public final int[][][] c;
   @ObfuscatedName("id")
   public final byte[][] d;
   @ObfuscatedName("lq")
   public final int[] e;
   @ObfuscatedName("md")
   private boolean i;
   @ObfuscatedName("mh")
   public final byte[][] f;
   @ObfuscatedName("rg")
   public final int[] g;
   @ObfuscatedName("wv")
   public final int[] h;
   // $FF: synthetic field
   private static boolean j = !kq.class.desiredAssertionStatus();

   private kq(boolean var1, boolean var2, int[][][] var3, int[][] var4, int[] var5, int[] var6, int[] var7, byte[][] var8, byte[][] var9) {
      this.i = var1;
      this.b = var2;
      this.c = var3;
      this.a = var4;
      this.e = var5;
      this.h = var6;
      this.g = var7;
      this.f = var8;
      this.d = var9;
   }

   @ObfuscatedName("cp")
   public final void a() {
      if (this.i) {
         client.cU = this.b;
         client.cT = this.c;
         a = this.a;
         S.c = this.e;
         dJ.b = this.h;
         eS.a = this.g;
         d = this.f;
         bj.c = this.d;
      } else if (!j && !this.b) {
         throw new AssertionError();
      } else {
         client.cR = this.c;
         I.c = this.a;
         bp.b = this.e;
         cN.a = this.h;
         bO.a = this.g;
         ie.a = this.f;
         dh.e = this.d;
      }
   }

   @ObfuscatedName("vh")
   public static kq a(boolean var0) {
      return var0 ? new kq(var0, client.cU, client.cT, jQ.a, S.c, dJ.b, eS.a, n.d, bj.c) : new kq(var0, true, client.cR, I.c, bp.b, cN.a, bO.a, ie.a, dh.e);
   }
}
