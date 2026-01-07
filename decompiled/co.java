package osrs;

import net.runelite.api.SceneTileModel;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("jn")
public final class co implements SceneTileModel {
   @ObfuscatedName("aa")
   static int[] a = new int[6];
   @ObfuscatedName("ac")
   static int[] b = new int[6];
   @ObfuscatedName("ai")
   static int[] c = new int[6];
   @ObfuscatedName("aj")
   private static int[][] v = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};
   @ObfuscatedName("al")
   static float[] d = new float[6];
   @ObfuscatedName("am")
   static int[] e = new int[6];
   @ObfuscatedName("an")
   static int[] f = new int[6];
   @ObfuscatedName("ap")
   private static int[][] w = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
   @ObfuscatedName("ad")
   int[] g;
   @ObfuscatedName("ae")
   boolean h = true;
   @ObfuscatedName("af")
   int[] i;
   @ObfuscatedName("ag")
   int[] j;
   @ObfuscatedName("ah")
   int[] k;
   @ObfuscatedName("ak")
   int[] l;
   @ObfuscatedName("ao")
   int m;
   @ObfuscatedName("ar")
   int[] n;
   @ObfuscatedName("as")
   int o;
   @ObfuscatedName("at")
   int[] p;
   @ObfuscatedName("au")
   int[] q;
   @ObfuscatedName("av")
   int r;
   @ObfuscatedName("aw")
   int[] s;
   @ObfuscatedName("ax")
   int t;
   @ObfuscatedName("az")
   int[] u;
   @ObfuscatedName("ho")
   private int x;
   @ObfuscatedName("ie")
   private int y;
   @ObfuscatedName("pc")
   private int z;

   co(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
      if (var7 != var6 || var8 != var6 || var9 != var6) {
         this.h = false;
      }

      this.r = var1;
      this.m = var2;
      this.o = var18;
      this.t = var19;
      int var10000 = 128 / 2;
      var10000 = 128 / 4;
      var10000 = 384 / 4;
      int[] var29;
      var19 = (var29 = w[var1]).length;
      this.p = new int[var19];
      this.g = new int[var19];
      this.n = new int[var19];
      int[] var20 = new int[var19];
      int[] var21 = new int[var19];
      var4 *= 128;
      var5 <<= 7;

      int var22;
      int var23;
      int var24;
      int var25;
      int var26;
      int var27;
      for(int var28 = 0; var28 < var19; ++var28) {
         if (((var22 = var29[var28]) & 1) == 0 && var22 <= 8) {
            var22 = (var22 - var2 - var2 - 1 & 7) + 1;
         }

         if (var22 > 8 && var22 <= 12) {
            var22 = (var22 - 9 - var2 & 3) + 9;
         }

         if (var22 > 12 && var22 <= 16) {
            var22 = (var22 - 13 - var2 & 3) + 13;
         }

         if (var22 == 1) {
            var23 = var4;
            var24 = var5;
            var25 = var6;
            var26 = var10;
            var27 = var14;
         } else if (var22 == 2) {
            var23 = var4 + 64;
            var24 = var5;
            var25 = var7 + var6 >> 1;
            var26 = var11 + var10 >> 1;
            var27 = var15 + var14 >> 1;
         } else if (var22 == 3) {
            var23 = var4 + 128;
            var24 = var5;
            var25 = var7;
            var26 = var11;
            var27 = var15;
         } else if (var22 == 4) {
            var23 = var4 + 128;
            var24 = var5 + 64;
            var25 = var8 + var7 >> 1;
            var26 = var11 + var12 >> 1;
            var27 = var15 + var16 >> 1;
         } else if (var22 == 5) {
            var23 = var4 + 128;
            var24 = var5 + 128;
            var25 = var8;
            var26 = var12;
            var27 = var16;
         } else if (var22 == 6) {
            var23 = var4 + 64;
            var24 = var5 + 128;
            var25 = var8 + var9 >> 1;
            var26 = var13 + var12 >> 1;
            var27 = var17 + var16 >> 1;
         } else if (var22 == 7) {
            var23 = var4;
            var24 = var5 + 128;
            var25 = var9;
            var26 = var13;
            var27 = var17;
         } else if (var22 == 8) {
            var23 = var4;
            var24 = var5 + 64;
            var25 = var9 + var6 >> 1;
            var26 = var13 + var10 >> 1;
            var27 = var17 + var14 >> 1;
         } else if (var22 == 9) {
            var23 = var4 + 64;
            var24 = var5 + 32;
            var25 = var7 + var6 >> 1;
            var26 = var11 + var10 >> 1;
            var27 = var15 + var14 >> 1;
         } else if (var22 == 10) {
            var23 = var4 + 96;
            var24 = var5 + 64;
            var25 = var8 + var7 >> 1;
            var26 = var11 + var12 >> 1;
            var27 = var15 + var16 >> 1;
         } else if (var22 == 11) {
            var23 = var4 + 64;
            var24 = var5 + 96;
            var25 = var8 + var9 >> 1;
            var26 = var13 + var12 >> 1;
            var27 = var17 + var16 >> 1;
         } else if (var22 == 12) {
            var23 = var4 + 32;
            var24 = var5 + 64;
            var25 = var9 + var6 >> 1;
            var26 = var13 + var10 >> 1;
            var27 = var17 + var14 >> 1;
         } else if (var22 == 13) {
            var23 = var4 + 32;
            var24 = var5 + 32;
            var25 = var6;
            var26 = var10;
            var27 = var14;
         } else if (var22 == 14) {
            var23 = var4 + 96;
            var24 = var5 + 32;
            var25 = var7;
            var26 = var11;
            var27 = var15;
         } else if (var22 == 15) {
            var23 = var4 + 96;
            var24 = var5 + 96;
            var25 = var8;
            var26 = var12;
            var27 = var16;
         } else {
            var23 = var4 + 32;
            var24 = var5 + 96;
            var25 = var9;
            var26 = var13;
            var27 = var17;
         }

         this.p[var28] = var23;
         this.g[var28] = var25;
         this.n[var28] = var24;
         var20[var28] = var26;
         var21[var28] = var27;
      }

      int[] var30;
      var22 = (var30 = v[var1]).length / 4;
      this.i = new int[var22];
      this.k = new int[var22];
      this.u = new int[var22];
      this.s = new int[var22];
      this.q = new int[var22];
      this.j = new int[var22];
      if (var3 != -1) {
         this.l = new int[var22];
      }

      var23 = 0;

      for(var24 = 0; var24 < var22; ++var24) {
         var25 = var30[var23];
         var26 = var30[var23 + 1];
         var27 = var30[var23 + 2];
         var1 = var30[var23 + 3];
         var23 += 4;
         if (var26 < 4) {
            var26 = var26 - var2 & 3;
         }

         if (var27 < 4) {
            var27 = var27 - var2 & 3;
         }

         if (var1 < 4) {
            var1 = var1 - var2 & 3;
         }

         this.i[var24] = var26;
         this.k[var24] = var27;
         this.u[var24] = var1;
         if (var25 == 0) {
            this.s[var24] = var20[var26];
            this.q[var24] = var20[var27];
            this.j[var24] = var20[var1];
            if (this.l != null) {
               this.l[var24] = -1;
            }
         } else {
            this.s[var24] = var21[var26];
            this.q[var24] = var21[var27];
            this.j[var24] = var21[var1];
            if (this.l != null) {
               this.l[var24] = var3;
            }
         }
      }

      var24 = var6;
      var25 = var7;
      if (var7 < var6) {
         var24 = var7;
      }

      if (var7 > var7) {
         var25 = var7;
      }

      if (var8 < var24) {
         var24 = var8;
      }

      if (var8 > var25) {
         var25 = var8;
      }

      if (var9 < var24) {
         var24 = var9;
      }

      if (var9 > var25) {
         var25 = var9;
      }

      var10000 = var24 / 14;
      var10000 = var25 / 14;
   }

   public final int[] getVertexX() {
      return this.p;
   }

   public final int[] getVertexZ() {
      return this.n;
   }

   public final int[] getFaceX() {
      return this.i;
   }

   public final int[] getFaceY() {
      return this.k;
   }

   public final int[] getFaceZ() {
      return this.u;
   }

   public final int[] getTriangleColorA() {
      return this.s;
   }

   public final int getModelOverlay() {
      return this.t;
   }

   public final int getModelUnderlay() {
      return this.o;
   }

   public final void setBufferLen(int var1) {
      this.y = var1;
   }

   public final void setUvBufferOffset(int var1) {
      this.z = var1;
   }

   public final int getRotation() {
      return this.m;
   }

   public final int[] getTriangleTextureId() {
      return this.l;
   }

   public final int getUvBufferOffset() {
      return this.z;
   }

   public final int[] getTriangleColorC() {
      return this.j;
   }

   public final int getBufferOffset() {
      return this.x;
   }

   public final int[] getTriangleColorB() {
      return this.q;
   }

   public final int[] getVertexY() {
      return this.g;
   }

   public final void setBufferOffset(int var1) {
      this.x = var1;
   }

   public final boolean isFlat() {
      return this.h;
   }

   public final int getShape() {
      return this.r;
   }

   public final int getBufferLen() {
      return this.y;
   }
}
