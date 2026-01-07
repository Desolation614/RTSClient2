package osrs;

import net.runelite.api.Mesh;
import net.runelite.api.Model;
import net.runelite.api.ModelData;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class243 extends ct implements ModelData {
   @ObfuscatedName("aa")
   static int[] a;
   @ObfuscatedName("ac")
   private static int q = 0;
   @ObfuscatedName("ai")
   private static int[] r = new int[10000];
   @ObfuscatedName("al")
   private static int[] s = new int[10000];
   @ObfuscatedName("am")
   static int[] b;
   @ObfuscatedName("za")
   private int[] t;
   @ObfuscatedName("ab")
   int c = 0;
   @ObfuscatedName("ad")
   private int u;
   @ObfuscatedName("ae")
   private byte[] v;
   @ObfuscatedName("af")
   int[] d;
   @ObfuscatedName("ag")
   private int[] w;
   @ObfuscatedName("ah")
   private int x;
   @ObfuscatedName("ak")
   int[] e;
   @ObfuscatedName("ao")
   short[] f;
   @ObfuscatedName("aq")
   byte[] g;
   @ObfuscatedName("ar")
   private int[] y;
   @ObfuscatedName("as")
   short[] h;
   @ObfuscatedName("at")
   private byte[] z;
   @ObfuscatedName("au")
   private int[] A;
   @ObfuscatedName("av")
   private byte[] B;
   @ObfuscatedName("aw")
   byte[] i;
   @ObfuscatedName("ax")
   private byte C = 0;
   @ObfuscatedName("ay")
   private short[] D;
   @ObfuscatedName("az")
   int[] j;
   @ObfuscatedName("ba")
   private short[] E;
   @ObfuscatedName("bb")
   private int F;
   @ObfuscatedName("bc")
   private int G;
   @ObfuscatedName("bd")
   private boolean H = false;
   @ObfuscatedName("be")
   private int[][] I;
   @ObfuscatedName("bf")
   private int[][] J;
   @ObfuscatedName("bg")
   private int K;
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "[Ljo;"
   )
   private cp[] L;
   @ObfuscatedName("bj")
   private int[][] M;
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "[Ljs;"
   )
   private cu[] N;
   @ObfuscatedName("bm")
   private int[][] O;
   @ObfuscatedName("bn")
   private int P;
   @ObfuscatedName("bo")
   private int[] Q;
   @ObfuscatedName("bq")
   public short k;
   @ObfuscatedName("bs")
   int l = 0;
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "[Ljo;"
   )
   private cp[] R;
   @ObfuscatedName("bv")
   public short m;
   @ObfuscatedName("bw")
   private int[] S;
   @ObfuscatedName("bx")
   private short[] T;
   @ObfuscatedName("dw")
   private int[] U;
   @ObfuscatedName("ns")
   public float[] n;
   @ObfuscatedName("oh")
   public float[] o;
   @ObfuscatedName("ua")
   public float[] p;
   @ObfuscatedName("uu")
   private int[] V;

   @ObfuscatedSignature(
      signature = "(Ljj;ZZZZ)V",
      garbageValue = "1"
   )
   public class243(class243 var1, boolean var2, boolean var3, boolean var4) {
      this.l = var1.l;
      this.c = var1.c;
      this.K = var1.K;
      int var5;
      if (var2) {
         this.p = var1.p;
         this.n = var1.n;
         this.o = var1.o;
      } else {
         this.p = new float[this.l];
         this.n = new float[this.l];
         this.o = new float[this.l];

         for(var5 = 0; var5 < this.l; ++var5) {
            this.p[var5] = var1.p[var5];
            this.n[var5] = var1.n[var5];
            this.o[var5] = var1.o[var5];
         }
      }

      if (var3) {
         this.f = var1.f;
      } else {
         this.f = new short[this.c];

         for(var5 = 0; var5 < this.c; ++var5) {
            this.f[var5] = var1.f[var5];
         }
      }

      if (!var4 && var1.h != null) {
         this.h = new short[this.c];

         for(var5 = 0; var5 < this.c; ++var5) {
            this.h[var5] = var1.h[var5];
         }
      } else {
         this.h = var1.h;
      }

      this.z = var1.z;
      this.d = var1.d;
      this.e = var1.e;
      this.j = var1.j;
      this.g = var1.g;
      this.B = var1.B;
      this.i = var1.i;
      this.C = var1.C;
      this.v = var1.v;
      this.D = var1.D;
      this.E = var1.E;
      this.T = var1.T;
      this.Q = var1.Q;
      this.S = var1.S;
      this.J = var1.J;
      this.M = var1.M;
      this.R = var1.R;
      this.N = var1.N;
      this.L = var1.L;
      this.O = var1.O;
      this.I = var1.I;
      this.m = var1.m;
      this.k = var1.k;
   }

   class243() {
   }

   @ObfuscatedSignature(
      signature = "([Ljj;I)V"
   )
   public class243(class243[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      this.l = 0;
      this.c = 0;
      this.K = 0;
      this.C = -1;

      int var10;
      class243 var11;
      for(var10 = 0; var10 < var2; ++var10) {
         if ((var11 = var1[var10]) != null) {
            this.l += var11.l;
            this.c += var11.c;
            this.K += var11.K;
            if (var11.B != null) {
               var4 = true;
            } else {
               if (this.C == -1) {
                  this.C = var11.C;
               }

               if (this.C != var11.C) {
                  var4 = true;
               }
            }

            var3 |= var11.g != null;
            var5 |= var11.z != null;
            var6 |= var11.S != null;
            var7 |= var11.h != null;
            var8 |= var11.i != null;
            var9 |= var11.O != null;
         }
      }

      this.p = new float[this.l];
      this.n = new float[this.l];
      this.o = new float[this.l];
      this.Q = new int[this.l];
      this.d = new int[this.c];
      this.e = new int[this.c];
      this.j = new int[this.c];
      if (var3) {
         this.g = new byte[this.c];
      }

      if (var4) {
         this.B = new byte[this.c];
      }

      if (var5) {
         this.z = new byte[this.c];
      }

      if (var6) {
         this.S = new int[this.c];
      }

      if (var7) {
         this.h = new short[this.c];
      }

      if (var8) {
         this.i = new byte[this.c];
      }

      if (var9) {
         this.O = new int[this.l][];
         this.I = new int[this.l][];
      }

      this.f = new short[this.c];
      if (this.K > 0) {
         this.v = new byte[this.K];
         this.D = new short[this.K];
         this.E = new short[this.K];
         this.T = new short[this.K];
      }

      this.l = 0;
      this.c = 0;
      this.K = 0;

      for(var10 = 0; var10 < var2; ++var10) {
         if ((var11 = var1[var10]) != null) {
            int var13;
            for(var13 = 0; var13 < var11.c; ++var13) {
               if (var3 && var11.g != null) {
                  this.g[this.c] = var11.g[var13];
               }

               if (var4) {
                  if (var11.B != null) {
                     this.B[this.c] = var11.B[var13];
                  } else {
                     this.B[this.c] = var11.C;
                  }
               }

               if (var5 && var11.z != null) {
                  this.z[this.c] = var11.z[var13];
               }

               if (var6 && var11.S != null) {
                  this.S[this.c] = var11.S[var13];
               }

               if (var7) {
                  if (var11.h != null) {
                     this.h[this.c] = var11.h[var13];
                  } else {
                     this.h[this.c] = -1;
                  }
               }

               if (var8) {
                  if (var11.i != null && var11.i[var13] != -1) {
                     this.i[this.c] = (byte)(this.K + var11.i[var13]);
                  } else {
                     this.i[this.c] = -1;
                  }
               }

               this.f[this.c] = var11.f[var13];
               this.d[this.c] = this.a(var11, var11.d[var13]);
               this.e[this.c] = this.a(var11, var11.e[var13]);
               this.j[this.c] = this.a(var11, var11.j[var13]);
               ++this.c;
            }

            for(var13 = 0; var13 < var11.K; ++var13) {
               if ((this.v[this.K] = var11.v[var13]) == 0) {
                  this.D[this.K] = (short)this.a(var11, var11.D[var13]);
                  this.E[this.K] = (short)this.a(var11, var11.E[var13]);
                  this.T[this.K] = (short)this.a(var11, var11.T[var13]);
               }

               ++this.K;
            }
         }
      }

   }

   private class243(byte[] var1) {
      if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
         method6258(this, var1);
      } else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
         this.method6176(var1);
      } else {
         jk var5;
         jk var6;
         jk var7;
         jk var8;
         jk var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         int var25;
         int var26;
         int var27;
         int var28;
         int var29;
         int var30;
         int var31;
         int var32;
         int var33;
         int var34;
         int var35;
         int var36;
         int var37;
         int var38;
         class243 var42;
         int var43;
         if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
            var42 = this;
            jk var44 = new jk(var1);
            jk var45 = new jk(var1);
            var5 = new jk(var1);
            var6 = new jk(var1);
            var7 = new jk(var1);
            var8 = new jk(var1);
            var9 = new jk(var1);
            var44.c = var1.length - 23;
            var43 = var44.d();
            var10 = var44.d();
            var11 = jk.a(var44, (byte)-8);
            var12 = jk.a((jk)var44, (byte)10);
            var13 = jk.a((jk)var44, (byte)31);
            var14 = jk.a((jk)var44, (byte)67);
            var15 = jk.a((jk)var44, (byte)19);
            var16 = jk.a((jk)var44, (byte)2);
            var17 = jk.a(var44, (byte)-4);
            var18 = var44.d();
            var19 = var44.d();
            var20 = var44.d();
            var21 = var44.d();
            var22 = var44.d();
            var23 = 0;
            var24 = 0;
            var25 = 0;
            if (var11 > 0) {
               this.v = new byte[var11];
               var44.c = 0;

               for(var26 = 0; var26 < var11; ++var26) {
                  byte var46;
                  if ((var46 = var42.v[var26] = var44.B()) == 0) {
                     ++var23;
                  }

                  if (var46 > 0 && var46 <= 3) {
                     ++var24;
                  }

                  if (var46 == 2) {
                     ++var25;
                  }
               }
            }

            var27 = var26 = var11 + var43;
            if (var12 == 1) {
               var26 += var10;
            }

            var28 = var26;
            var29 = var26 += var10;
            if (var13 == 255) {
               var26 += var10;
            }

            var30 = var26;
            if (var15 == 1) {
               var26 += var10;
            }

            var31 = var26;
            if (var17 == 1) {
               var26 += var43;
            }

            var32 = var26;
            if (var14 == 1) {
               var26 += var10;
            }

            var33 = var26;
            var21 = var26 += var21;
            if (var16 == 1) {
               var26 += var10 << 1;
            }

            var34 = var26;
            var22 = var26 += var22;
            var35 = var26 += var10 << 1;
            var18 = var26 += var18;
            var19 = var26 += var19;
            var20 = var26 += var20;
            var36 = var26 += var23 * 6;
            var37 = var26 += var24 * 6;
            var23 = var26 += var24 * 6;
            var38 = var26 += var24 << 1;
            int var47 = var26 += var24;
            var26 += (var24 << 1) + (var25 << 1);
            var42.l = var43;
            var42.c = var10;
            var42.K = var11;
            var42.p = new float[var43];
            var42.n = new float[var43];
            var42.o = new float[var43];
            var42.d = new int[var10];
            var42.e = new int[var10];
            var42.j = new int[var10];
            if (var17 == 1) {
               var42.Q = new int[var43];
            }

            if (var12 == 1) {
               var42.g = new byte[var10];
            }

            if (var13 == 255) {
               var42.B = new byte[var10];
            } else {
               var42.C = (byte)var13;
            }

            if (var14 == 1) {
               var42.z = new byte[var10];
            }

            if (var15 == 1) {
               var42.S = new int[var10];
            }

            if (var16 == 1) {
               var42.h = new short[var10];
            }

            if (var16 == 1 && var11 > 0) {
               var42.i = new byte[var10];
            }

            var42.f = new short[var10];
            if (var11 > 0) {
               var42.D = new short[var11];
               var42.E = new short[var11];
               var42.T = new short[var11];
            }

            var44.c = var11;
            var45.c = var35;
            var5.c = var18;
            var6.c = var19;
            var7.c = var31;
            var18 = 0;
            var19 = 0;
            var24 = 0;

            int var40;
            int var41;
            for(var25 = 0; var25 < var43; ++var25) {
               var31 = jk.a(var44, (byte)-66);
               var35 = 0;
               if ((var31 & 1) != 0) {
                  var35 = var45.j();
               }

               var40 = 0;
               if ((var31 & 2) != 0) {
                  var40 = var5.j();
               }

               var41 = 0;
               if ((var31 & 4) != 0) {
                  var41 = var6.j();
               }

               var42.p[var25] = (float)(var18 + var35);
               var42.n[var25] = (float)(var19 + var40);
               var42.o[var25] = (float)(var24 + var41);
               var18 = (int)var42.p[var25];
               var19 = (int)var42.n[var25];
               var24 = (int)var42.o[var25];
               if (var17 == 1) {
                  var42.Q[var25] = jk.a(var7, (byte)-50);
               }
            }

            var44.c = var22;
            var45.c = var27;
            var5.c = var29;
            var6.c = var32;
            var7.c = var30;
            var8.c = var21;
            var9.c = var34;

            for(var25 = 0; var25 < var10; ++var25) {
               var42.f[var25] = (short)var44.d();
               if (var12 == 1) {
                  var42.g[var25] = var45.B();
               }

               if (var13 == 255) {
                  var42.B[var25] = var5.B();
               }

               if (var14 == 1) {
                  var42.z[var25] = var6.B();
               }

               if (var15 == 1) {
                  var42.S[var25] = jk.a(var7, (byte)-15);
               }

               if (var16 == 1) {
                  var42.h[var25] = (short)(var8.d() - 1);
               }

               if (var42.i != null && var42.h[var25] != -1) {
                  var42.i[var25] = (byte)(jk.a(var9, (byte)-89) - 1);
               }
            }

            var44.c = var33;
            var45.c = var28;
            var25 = 0;
            var31 = 0;
            var35 = 0;
            var40 = 0;

            for(var41 = 0; var41 < var10; ++var41) {
               if ((var43 = jk.a((jk)var45, (byte)30)) == 1) {
                  var25 = var44.j() + var40;
                  var31 = var44.j() + var25;
                  var40 = var35 = var44.j() + var31;
                  var42.d[var41] = var25;
                  var42.e[var41] = var31;
                  var42.j[var41] = var35;
               }

               if (var43 == 2) {
                  var31 = var35;
                  var40 = var35 = var44.j() + var40;
                  var42.d[var41] = var25;
                  var42.e[var41] = var31;
                  var42.j[var41] = var35;
               }

               if (var43 == 3) {
                  var25 = var35;
                  var40 = var35 = var44.j() + var40;
                  var42.d[var41] = var25;
                  var42.e[var41] = var31;
                  var42.j[var41] = var35;
               }

               if (var43 == 4) {
                  var43 = var25;
                  var25 = var31;
                  var31 = var43;
                  var40 = var35 = var44.j() + var40;
                  var42.d[var41] = var25;
                  var42.e[var41] = var43;
                  var42.j[var41] = var35;
               }
            }

            var44.c = var20;
            var45.c = var36;
            var5.c = var37;
            var6.c = var23;
            var7.c = var38;
            var8.c = var47;

            for(var41 = 0; var41 < var11; ++var41) {
               if ((var42.v[var41] & 255) == 0) {
                  var42.D[var41] = (short)var44.d();
                  var42.E[var41] = (short)var44.d();
                  var42.T[var41] = (short)var44.d();
               }
            }

            var44.c = var26;
            if (jk.a((jk)var44, (byte)7) != 0) {
               new cZ();
               var44.d();
               var44.d();
               var44.d();
               jk.d(var44, 1687107415);
            }

         } else {
            var42 = this;
            boolean var3 = false;
            boolean var4 = false;
            var5 = new jk(var1);
            var6 = new jk(var1);
            var7 = new jk(var1);
            var8 = new jk(var1);
            var9 = new jk(var1);
            var5.c = var1.length - 18;
            var43 = var5.d();
            var10 = var5.d();
            var11 = jk.a((jk)var5, (byte)79);
            var12 = jk.a(var5, (byte)-34);
            var13 = jk.a((jk)var5, (byte)79);
            var14 = jk.a((jk)var5, (byte)22);
            var15 = jk.a(var5, (byte)-16);
            var16 = jk.a(var5, (byte)-18);
            var17 = var5.d();
            var18 = var5.d();
            var5.d();
            var20 = var5.d();
            var23 = var21 = var43 + 0;
            var24 = var21 += var10;
            if (var13 == 255) {
               var21 += var10;
            }

            var25 = var21;
            if (var15 == 1) {
               var21 += var10;
            }

            var26 = var21;
            if (var12 == 1) {
               var21 += var10;
            }

            var27 = var21;
            if (var16 == 1) {
               var21 += var43;
            }

            var28 = var21;
            if (var14 == 1) {
               var21 += var10;
            }

            var29 = var21;
            var30 = var21 += var20;
            var31 = var21 += var10 << 1;
            var32 = var21 += var11 * 6;
            var33 = var21 += var17;
            var21 += var18;
            this.l = var43;
            this.c = var10;
            this.K = var11;
            this.p = new float[var43];
            this.n = new float[var43];
            this.o = new float[var43];
            this.d = new int[var10];
            this.e = new int[var10];
            this.j = new int[var10];
            if (var11 > 0) {
               this.v = new byte[var11];
               this.D = new short[var11];
               this.E = new short[var11];
               this.T = new short[var11];
            }

            if (var16 == 1) {
               this.Q = new int[var43];
            }

            if (var12 == 1) {
               this.g = new byte[var10];
               this.i = new byte[var10];
               this.h = new short[var10];
            }

            if (var13 == 255) {
               this.B = new byte[var10];
            } else {
               this.C = (byte)var13;
            }

            if (var14 == 1) {
               this.z = new byte[var10];
            }

            if (var15 == 1) {
               this.S = new int[var10];
            }

            this.f = new short[var10];
            var5.c = 0;
            var6.c = var32;
            var7.c = var33;
            var8.c = var21;
            var9.c = var27;
            var34 = 0;
            var22 = 0;
            var35 = 0;

            for(var18 = 0; var18 < var43; ++var18) {
               var19 = jk.a(var5, (byte)-54);
               var20 = 0;
               if ((var19 & 1) != 0) {
                  var20 = var6.j();
               }

               var36 = 0;
               if ((var19 & 2) != 0) {
                  var36 = var7.j();
               }

               var37 = 0;
               if ((var19 & 4) != 0) {
                  var37 = var8.j();
               }

               var42.p[var18] = (float)(var34 + var20);
               var42.n[var18] = (float)(var22 + var36);
               var42.o[var18] = (float)(var35 + var37);
               var34 = (int)var42.p[var18];
               var22 = (int)var42.n[var18];
               var35 = (int)var42.o[var18];
               if (var16 == 1) {
                  var42.Q[var18] = jk.a(var9, (byte)-85);
               }
            }

            var5.c = var30;
            var6.c = var26;
            var7.c = var24;
            var8.c = var28;
            var9.c = var25;

            for(var18 = 0; var18 < var10; ++var18) {
               var42.f[var18] = (short)var5.d();
               if (var12 == 1) {
                  if (((var19 = jk.a(var6, (byte)-43)) & 1) == 1) {
                     var42.g[var18] = 1;
                     var3 = true;
                  } else {
                     var42.g[var18] = 0;
                  }

                  if ((var19 & 2) == 2) {
                     var42.i[var18] = (byte)(var19 >> 2);
                     var42.h[var18] = var42.f[var18];
                     var42.f[var18] = 127;
                     if (var42.h[var18] != -1) {
                        var4 = true;
                     }
                  } else {
                     var42.i[var18] = -1;
                     var42.h[var18] = -1;
                  }
               }

               if (var13 == 255) {
                  var42.B[var18] = var7.B();
               }

               if (var14 == 1) {
                  var42.z[var18] = var8.B();
               }

               if (var15 == 1) {
                  var42.S[var18] = jk.a((jk)var9, (byte)19);
               }
            }

            var5.c = var29;
            var6.c = var23;
            var18 = 0;
            var19 = 0;
            var20 = 0;
            var36 = 0;

            for(var37 = 0; var37 < var10; ++var37) {
               if ((var23 = jk.a((jk)var6, (byte)12)) == 1) {
                  var18 = var5.j() + var36;
                  var19 = var5.j() + var18;
                  var36 = var20 = var5.j() + var19;
                  var42.d[var37] = var18;
                  var42.e[var37] = var19;
                  var42.j[var37] = var20;
               }

               if (var23 == 2) {
                  var19 = var20;
                  var36 = var20 = var5.j() + var36;
                  var42.d[var37] = var18;
                  var42.e[var37] = var19;
                  var42.j[var37] = var20;
               }

               if (var23 == 3) {
                  var18 = var20;
                  var36 = var20 = var5.j() + var36;
                  var42.d[var37] = var18;
                  var42.e[var37] = var19;
                  var42.j[var37] = var20;
               }

               if (var23 == 4) {
                  var38 = var18;
                  var18 = var19;
                  var19 = var38;
                  var36 = var20 = var5.j() + var36;
                  var42.d[var37] = var18;
                  var42.e[var37] = var38;
                  var42.j[var37] = var20;
               }
            }

            var5.c = var31;

            for(var37 = 0; var37 < var11; ++var37) {
               var42.v[var37] = 0;
               var42.D[var37] = (short)var5.d();
               var42.E[var37] = (short)var5.d();
               var42.T[var37] = (short)var5.d();
            }

            if (var42.i != null) {
               boolean var39 = false;

               for(var23 = 0; var23 < var10; ++var23) {
                  if ((var38 = var42.i[var23] & 255) != 255) {
                     if (var42.d[var23] == (var42.D[var38] & '\uffff') && var42.e[var23] == (var42.E[var38] & '\uffff') && var42.j[var23] == (var42.T[var38] & '\uffff')) {
                        var42.i[var23] = -1;
                     } else {
                        var39 = true;
                     }
                  }
               }

               if (!var39) {
                  var42.i = null;
               }
            }

            if (!var4) {
               var42.h = null;
            }

            if (!var3) {
               var42.g = null;
            }

         }
      }
   }

   public class243(int var1, int var2, int var3) {
      this.p = new float[3];
      this.n = new float[3];
      this.o = new float[3];
      this.Q = new int[3];
      this.d = new int[1];
      this.e = new int[1];
      this.j = new int[1];
      this.g = new byte[1];
      this.B = new byte[1];
      this.z = new byte[1];
      this.f = new short[1];
      this.h = new short[1];
      this.i = new byte[1];
      this.S = new int[1];
   }

   @ObfuscatedName("zq")
   private void i() {
      cp[] var1 = this.R;
      cp[] var2 = this.L;
      if (var1 != null && this.V == null) {
         int var3 = this.getVerticesCount();
         this.V = new int[var3];
         this.U = new int[var3];
         this.t = new int[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            cp var5;
            if (var2 != null && (var5 = var2[var4]) != null) {
               this.V[var4] = var5.d;
               this.U[var4] = var5.b;
               this.t[var4] = var5.c;
            } else if ((var5 = var1[var4]) != null) {
               this.V[var4] = var5.d;
               this.U[var4] = var5.b;
               this.t[var4] = var5.c;
            }
         }
      }

   }

   @ObfuscatedName("ab")
   public final void a(short var1, short var2) {
      if (this.h != null) {
         for(int var3 = 0; var3 < this.G; ++var3) {
            if (this.f[var3] == var1) {
               this.T[var3] = var2;
            }
         }
      }

   }

   @ObfuscatedName("ae")
   public final void a() {
      for(int var1 = 0; var1 < this.l; ++var1) {
         float[] var10002 = this.p;
         var10002[var1] = -var10002[var1];
         var10002 = this.o;
         var10002[var1] = -var10002[var1];
      }

      this.e();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "([[IIIIZI)Ljj;"
   )
   public final class243 a(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.q();
      int var7 = var2 + this.x;
      int var8 = var2 + this.u;
      int var9 = var4 + this.P;
      int var10 = var4 + this.F;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class243 var14;
            if (var5) {
               (var14 = new class243(this, true, true, true)).n = new float[var14.l];
            } else {
               var14 = this;
            }

            int var11;
            int var12;
            int var13;
            if (var6 == 0) {
               for(var7 = 0; var7 < var14.l; ++var7) {
                  var8 = var2 + (int)this.p[var7];
                  var9 = (int)this.o[var7] + var4;
                  var10 = var8 & 127;
                  var11 = var9 & 127;
                  var12 = var8 >> 7;
                  var9 >>= 7;
                  var13 = var1[var12][var9] * (128 - var10) + var1[var12 + 1][var9] * var10 >> 7;
                  var10 = var1[var12][var9 + 1] * (128 - var10) + var10 * var1[var12 + 1][var9 + 1] >> 7;
                  var9 = var13 * (128 - var11) + var10 * var11 >> 7;
                  var14.n[var7] = (float)(var9 + (int)this.n[var7] - var3);
               }
            } else {
               for(var7 = 0; var7 < var14.l; ++var7) {
                  if ((var8 = (-((int)this.n[var7]) << 16) / super.aI) < var6) {
                     var9 = var2 + (int)this.p[var7];
                     var10 = (int)this.o[var7] + var4;
                     var11 = var9 & 127;
                     var12 = var10 & 127;
                     var9 >>= 7;
                     var13 = var10 >> 7;
                     var10 = var1[var9][var13] * (128 - var11) + var1[var9 + 1][var13] * var11 >> 7;
                     var9 = var1[var9][var13 + 1] * (128 - var11) + var11 * var1[var9 + 1][var13 + 1] >> 7;
                     var9 = var10 * (128 - var12) + var9 * var12 >> 7;
                     var14.n[var7] = (float)((int)this.n[var7] + (var6 - var8) * (var9 - var3) / var6);
                  } else {
                     var14.n[var7] = this.n[var7];
                  }
               }
            }

            var14.e();
            return var14;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedName("ak")
   public final int a(int var1, int var2, int var3) {
      for(var2 = 0; var2 < this.l; ++var2) {
         if ((int)this.p[var2] == var1 && -8 == (int)this.n[var2] && var3 == (int)this.o[var2]) {
            return var2;
         }
      }

      this.p[this.l] = (float)var1;
      this.n[this.l] = -8.0F;
      this.o[this.l] = (float)var3;
      return this.l++;
   }

   @ObfuscatedName("aq")
   public final void b() {
      int var1;
      for(var1 = 0; var1 < this.l; ++var1) {
         float[] var10002 = this.o;
         var10002[var1] = (float)(-((int)var10002[var1]));
      }

      for(var1 = 0; var1 < this.c; ++var1) {
         int var2 = this.d[var1];
         this.d[var1] = this.j[var1];
         this.j[var1] = var2;
      }

      this.e();
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Ljj;I)I"
   )
   private int a(class243 var1, int var2) {
      int var3 = -1;
      int var4 = (int)var1.p[var2];
      int var5 = (int)var1.n[var2];
      int var6 = (int)var1.o[var2];

      for(int var7 = 0; var7 < this.l; ++var7) {
         if (var4 == (int)this.p[var7] && var5 == (int)this.n[var7] && var6 == (int)this.o[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.p[this.l] = (float)var4;
         this.n[this.l] = (float)var5;
         this.o[this.l] = (float)var6;
         if (var1.Q != null) {
            this.Q[this.l] = var1.Q[var2];
         }

         if (var1.O != null) {
            this.O[this.l] = var1.O[var2];
            this.I[this.l] = var1.I[var2];
         }

         var3 = this.l++;
      }

      return var3;
   }

   @ObfuscatedName("as")
   public final void b(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.l; ++var4) {
         float[] var10000 = this.p;
         var10000[var4] += (float)var1;
         var10000 = this.n;
         var10000[var4] += (float)var2;
         var10000 = this.o;
         var10000[var4] += (float)var3;
      }

      this.e();
   }

   @ObfuscatedName("av")
   public final void c() {
      for(int var1 = 0; var1 < this.l; ++var1) {
         float var2 = this.o[var1];
         this.o[var1] = this.p[var1];
         this.p[var1] = -var2;
      }

      this.e();
   }

   @ObfuscatedName("aw")
   private void p() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.Q != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.l; ++var3) {
            var4 = this.Q[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.J = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.J[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.l; this.J[var4][var1[var4]++] = var3++) {
            var4 = this.Q[var3];
         }

         this.Q = null;
      }

      if (this.S != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.c; ++var3) {
            var4 = this.S[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.M = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.M[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.c; this.M[var4][var1[var4]++] = var3++) {
            var4 = this.S[var3];
         }

         this.S = null;
      }

   }

   @ObfuscatedName("ax")
   public final void b(short var1, short var2) {
      for(int var3 = 0; var3 < this.c; ++var3) {
         if (this.f[var3] == var1) {
            this.f[var3] = var2;
         }
      }

   }

   @ObfuscatedName("ay")
   public final void c(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.l; ++var4) {
         this.p[var4] = (float)var1 * this.p[var4] / 128.0F;
         this.n[var4] = (float)var2 * this.n[var4] / 128.0F;
         this.o[var4] = (float)var3 * this.o[var4] / 128.0F;
      }

      this.e();
   }

   @ObfuscatedName("ba")
   public final void d() {
      if (this.R == null) {
         this.R = new cp[this.l];

         int var1;
         for(var1 = 0; var1 < this.l; ++var1) {
            this.R[var1] = new cp();
         }

         for(var1 = 0; var1 < this.c; ++var1) {
            int var2 = this.d[var1];
            int var3 = this.e[var1];
            int var4 = this.j[var1];
            int var5 = (int)this.p[var3] - (int)this.p[var2];
            int var6 = (int)this.n[var3] - (int)this.n[var2];
            int var7 = (int)this.o[var3] - (int)this.o[var2];
            int var8 = (int)this.p[var4] - (int)this.p[var2];
            int var9 = (int)this.n[var4] - (int)this.n[var2];
            int var10 = (int)this.o[var4] - (int)this.o[var2];
            int var11 = var6 * var10 - var9 * var7;
            var7 = var7 * var8 - var10 * var5;

            for(var5 = var5 * var9 - var8 * var6; var11 > 8192 || var7 > 8192 || var5 > 8192 || var11 < -8192 || var7 < -8192 || var5 < -8192; var5 >>= 1) {
               var11 >>= 1;
               var7 >>= 1;
            }

            if ((var6 = (int)Math.sqrt((double)(var11 * var11 + var7 * var7 + var5 * var5))) <= 0) {
               var6 = 1;
            }

            var11 = (var11 << 8) / var6;
            var7 = (var7 << 8) / var6;
            var5 = (var5 << 8) / var6;
            byte var14;
            if (this.g == null) {
               var14 = 0;
            } else {
               var14 = this.g[var1];
            }

            if (var14 == 0) {
               cp var12;
               cp var10000 = var12 = this.R[var2];
               var10000.d += var11;
               var12.b += var7;
               var12.c += var5;
               ++var12.a;
               var10000 = var12 = this.R[var3];
               var10000.d += var11;
               var12.b += var7;
               var12.c += var5;
               ++var12.a;
               var10000 = var12 = this.R[var4];
               var10000.d += var11;
               var12.b += var7;
               var12.c += var5;
               ++var12.a;
            } else if (var14 == 1) {
               if (this.N == null) {
                  this.N = new cu[this.c];
               }

               cu var13;
               (var13 = this.N[var1] = new cu()).c = var11;
               var13.a = var7;
               var13.b = var5;
            }
         }
      }

   }

   @ObfuscatedName("bg")
   void method6176(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      jk var4 = new jk(var1);
      jk var5 = new jk(var1);
      jk var6 = new jk(var1);
      jk var7 = new jk(var1);
      jk var8 = new jk(var1);
      var4.c = var1.length - 23;
      int var33 = var4.d();
      int var9 = var4.d();
      int var10 = jk.a(var4, (byte)-79);
      int var11 = jk.a(var4, (byte)-40);
      int var12 = jk.a(var4, (byte)-108);
      int var13 = jk.a((jk)var4, (byte)27);
      int var14 = jk.a(var4, (byte)-8);
      int var15 = jk.a((jk)var4, (byte)17);
      int var16 = jk.a(var4, (byte)-94);
      int var17 = var4.d();
      int var18 = var4.d();
      var4.d();
      int var19 = var4.d();
      int var20 = var4.d();
      int var21;
      int var22 = var21 = var33 + 0;
      int var23 = var21 += var9;
      if (var12 == 255) {
         var21 += var9;
      }

      int var24 = var21;
      if (var14 == 1) {
         var21 += var9;
      }

      int var25 = var21;
      if (var11 == 1) {
         var21 += var9;
      }

      int var26 = var21;
      var20 = var21 += var20;
      if (var13 == 1) {
         var21 += var9;
      }

      int var27 = var21;
      var19 = var21 += var19;
      int var28 = var21 += var9 << 1;
      int var29 = var21 += var10 * 6;
      var17 = var21 += var17;
      var21 += var18;
      this.l = var33;
      this.c = var9;
      this.K = var10;
      this.p = new float[var33];
      this.n = new float[var33];
      this.o = new float[var33];
      this.d = new int[var9];
      this.e = new int[var9];
      this.j = new int[var9];
      if (var10 > 0) {
         this.v = new byte[var10];
         this.D = new short[var10];
         this.E = new short[var10];
         this.T = new short[var10];
      }

      if (var15 == 1) {
         this.Q = new int[var33];
      }

      if (var11 == 1) {
         this.g = new byte[var9];
         this.i = new byte[var9];
         this.h = new short[var9];
      }

      if (var12 == 255) {
         this.B = new byte[var9];
      } else {
         this.C = (byte)var12;
      }

      if (var13 == 1) {
         this.z = new byte[var9];
      }

      if (var14 == 1) {
         this.S = new int[var9];
      }

      if (var16 == 1) {
         this.O = new int[var33][];
         this.I = new int[var33][];
      }

      this.f = new short[var9];
      var4.c = 0;
      var5.c = var29;
      var6.c = var17;
      var7.c = var21;
      var8.c = var26;
      var17 = 0;
      var18 = 0;
      var21 = 0;

      int var30;
      int var31;
      int var32;
      for(var26 = 0; var26 < var33; ++var26) {
         var29 = jk.a(var4, (byte)-25);
         var30 = 0;
         if ((var29 & 1) != 0) {
            var30 = var5.j();
         }

         var31 = 0;
         if ((var29 & 2) != 0) {
            var31 = var6.j();
         }

         var32 = 0;
         if ((var29 & 4) != 0) {
            var32 = var7.j();
         }

         this.p[var26] = (float)(var17 + var30);
         this.n[var26] = (float)(var18 + var31);
         this.o[var26] = (float)(var21 + var32);
         var17 = (int)this.p[var26];
         var18 = (int)this.n[var26];
         var21 = (int)this.o[var26];
         if (var15 == 1) {
            this.Q[var26] = jk.a(var8, (byte)-57);
         }
      }

      if (var16 == 1) {
         for(var26 = 0; var26 < var33; ++var26) {
            var29 = jk.a(var8, (byte)-24);
            this.O[var26] = new int[var29];
            this.I[var26] = new int[var29];

            for(var30 = 0; var30 < var29; ++var30) {
               this.O[var26][var30] = jk.a(var8, (byte)-26);
               this.I[var26][var30] = jk.a((jk)var8, (byte)2);
            }
         }
      }

      var4.c = var19;
      var5.c = var25;
      var6.c = var23;
      var7.c = var20;
      var8.c = var24;

      for(var26 = 0; var26 < var9; ++var26) {
         this.f[var26] = (short)var4.d();
         if (var11 == 1) {
            if (((var29 = jk.a(var5, (byte)-8)) & 1) == 1) {
               this.g[var26] = 1;
               var2 = true;
            } else {
               this.g[var26] = 0;
            }

            if ((var29 & 2) == 2) {
               this.i[var26] = (byte)(var29 >> 2);
               this.h[var26] = this.f[var26];
               this.f[var26] = 127;
               if (this.h[var26] != -1) {
                  var3 = true;
               }
            } else {
               this.i[var26] = -1;
               this.h[var26] = -1;
            }
         }

         if (var12 == 255) {
            this.B[var26] = var6.B();
         }

         if (var13 == 1) {
            this.z[var26] = var7.B();
         }

         if (var14 == 1) {
            this.S[var26] = jk.a((jk)var8, (byte)61);
         }
      }

      var4.c = var27;
      var5.c = var22;
      var26 = 0;
      var29 = 0;
      var30 = 0;
      var31 = 0;

      int var35;
      for(var32 = 0; var32 < var9; ++var32) {
         if ((var33 = jk.a(var5, (byte)-57)) == 1) {
            var26 = var4.j() + var31;
            var29 = var4.j() + var26;
            var31 = var30 = var4.j() + var29;
            this.d[var32] = var26;
            this.e[var32] = var29;
            this.j[var32] = var30;
         }

         if (var33 == 2) {
            var29 = var30;
            var31 = var30 = var4.j() + var31;
            this.d[var32] = var26;
            this.e[var32] = var29;
            this.j[var32] = var30;
         }

         if (var33 == 3) {
            var26 = var30;
            var31 = var30 = var4.j() + var31;
            this.d[var32] = var26;
            this.e[var32] = var29;
            this.j[var32] = var30;
         }

         if (var33 == 4) {
            var35 = var26;
            var26 = var29;
            var29 = var35;
            var31 = var30 = var4.j() + var31;
            this.d[var32] = var26;
            this.e[var32] = var35;
            this.j[var32] = var30;
         }
      }

      var4.c = var28;

      for(var32 = 0; var32 < var10; ++var32) {
         this.v[var32] = 0;
         this.D[var32] = (short)var4.d();
         this.E[var32] = (short)var4.d();
         this.T[var32] = (short)var4.d();
      }

      if (this.i != null) {
         boolean var34 = false;

         for(var33 = 0; var33 < var9; ++var33) {
            if ((var35 = this.i[var33] & 255) != 255) {
               if (this.d[var33] == (this.D[var35] & '\uffff') && this.e[var33] == (this.E[var35] & '\uffff') && this.j[var33] == (this.T[var35] & '\uffff')) {
                  this.i[var33] = -1;
               } else {
                  var34 = true;
               }
            }
         }

         if (!var34) {
            this.i = null;
         }
      }

      if (!var3) {
         this.h = null;
      }

      if (!var2) {
         this.g = null;
      }

   }

   @ObfuscatedName("bl")
   private void q() {
      if (!this.H) {
         super.aI = 0;
         this.G = 0;
         this.x = 999999;
         this.u = -999999;
         this.F = -99999;
         this.P = 99999;

         for(int var1 = 0; var1 < this.l; ++var1) {
            int var2 = (int)this.p[var1];
            int var3 = (int)this.n[var1];
            int var4 = (int)this.o[var1];
            if (var2 < this.x) {
               this.x = var2;
            }

            if (var2 > this.u) {
               this.u = var2;
            }

            if (var4 < this.P) {
               this.P = var4;
            }

            if (var4 > this.F) {
               this.F = var4;
            }

            if (-var3 > super.aI) {
               super.aI = -var3;
            }

            if (var3 > this.G) {
               this.G = var3;
            }
         }

         this.H = true;
      }

   }

   @ObfuscatedName("bx")
   final void e() {
      this.R = null;
      this.L = null;
      this.N = null;
      this.H = false;
   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      signature = "(IIIII)Ljm;"
   )
   public final cn a(int var1, int var2, int var3, int var4, int var5) {
      client.cV.trace("Lighting model {}", this);
      int var6 = var5;
      int var7 = var4;
      int var8 = var3;
      var1 = var1;
      class243 var9 = this;
      this.d();
      var3 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      var2 = var2 * var3 >> 8;
      cn var12;
      (var12 = new cn()).z = new int[this.c];
      var12.B = new int[this.c];
      var12.O = new int[this.c];
      int var10;
      if (this.K > 0 && this.i != null) {
         int[] var13 = new int[this.K];

         for(var5 = 0; var5 < var9.c; ++var5) {
            if (var9.i[var5] != -1) {
               ++var13[var9.i[var5] & 255];
            }
         }

         var12.P = 0;

         for(var5 = 0; var5 < var9.K; ++var5) {
            if (var13[var5] > 0 && var9.v[var5] == 0) {
               ++var12.P;
            }
         }

         var12.T = new int[var12.P];
         var12.M = new int[var12.P];
         var12.K = new int[var12.P];
         var5 = 0;

         for(var10 = 0; var10 < var9.K; ++var10) {
            if (var13[var10] > 0 && var9.v[var10] == 0) {
               var12.T[var5] = var9.D[var10] & '\uffff';
               var12.M[var5] = var9.E[var10] & '\uffff';
               var12.K[var5] = var9.T[var10] & '\uffff';
               var13[var10] = var5++;
            } else {
               var13[var10] = -1;
            }
         }

         var12.aa = new byte[var9.c];

         for(var10 = 0; var10 < var9.c; ++var10) {
            if (var9.i[var10] != -1) {
               var12.aa[var10] = (byte)var13[var9.i[var10] & 255];
            } else {
               var12.aa[var10] = -1;
            }
         }
      }

      for(var4 = 0; var4 < var9.c; ++var4) {
         byte var14;
         if (var9.g == null) {
            var14 = 0;
         } else {
            var14 = var9.g[var4];
         }

         byte var16;
         if (var9.z == null) {
            var16 = 0;
         } else {
            var16 = var9.z[var4];
         }

         short var11;
         if (var9.h == null) {
            var11 = -1;
         } else {
            var11 = var9.h[var4];
         }

         if (var16 == -2) {
            var14 = 3;
         }

         if (var16 == -1) {
            var14 = 2;
         }

         cp var15;
         cu var17;
         if (var11 == -1) {
            if (var14 != 0) {
               if (var14 == 1) {
                  var17 = var9.N[var4];
                  var5 = (var8 * var17.c + var7 * var17.a + var6 * var17.b) / (var2 / 2 + var2) + var1;
                  var12.z[var4] = a(var9.f[var4] & '\uffff', var5);
                  var12.O[var4] = -1;
               } else if (var14 == 3) {
                  var12.z[var4] = 128;
                  var12.O[var4] = -1;
               } else {
                  var12.O[var4] = -2;
               }
            } else {
               var10 = var9.f[var4] & '\uffff';
               if (var9.L != null && var9.L[var9.d[var4]] != null) {
                  var15 = var9.L[var9.d[var4]];
               } else {
                  var15 = var9.R[var9.d[var4]];
               }

               var5 = (var8 * var15.d + var7 * var15.b + var6 * var15.c) / (var2 * var15.a) + var1;
               var12.z[var4] = a(var10, var5);
               if (var9.L != null && var9.L[var9.e[var4]] != null) {
                  var15 = var9.L[var9.e[var4]];
               } else {
                  var15 = var9.R[var9.e[var4]];
               }

               var5 = (var8 * var15.d + var7 * var15.b + var6 * var15.c) / (var2 * var15.a) + var1;
               var12.B[var4] = a(var10, var5);
               if (var9.L != null && var9.L[var9.j[var4]] != null) {
                  var15 = var9.L[var9.j[var4]];
               } else {
                  var15 = var9.R[var9.j[var4]];
               }

               var5 = (var8 * var15.d + var7 * var15.b + var6 * var15.c) / (var2 * var15.a) + var1;
               var12.O[var4] = a(var10, var5);
            }
         } else if (var14 != 0) {
            if (var14 == 1) {
               var17 = var9.N[var4];
               var5 = (var8 * var17.c + var7 * var17.a + var6 * var17.b) / (var2 / 2 + var2) + var1;
               var12.z[var4] = a(var5);
               var12.O[var4] = -1;
            } else {
               var12.O[var4] = -2;
            }
         } else {
            if (var9.L != null && var9.L[var9.d[var4]] != null) {
               var15 = var9.L[var9.d[var4]];
            } else {
               var15 = var9.R[var9.d[var4]];
            }

            var5 = (var8 * var15.d + var7 * var15.b + var6 * var15.c) / (var2 * var15.a) + var1;
            var12.z[var4] = a(var5);
            if (var9.L != null && var9.L[var9.e[var4]] != null) {
               var15 = var9.L[var9.e[var4]];
            } else {
               var15 = var9.R[var9.e[var4]];
            }

            var5 = (var8 * var15.d + var7 * var15.b + var6 * var15.c) / (var2 * var15.a) + var1;
            var12.B[var4] = a(var5);
            if (var9.L != null && var9.L[var9.j[var4]] != null) {
               var15 = var9.L[var9.j[var4]];
            } else {
               var15 = var9.R[var9.j[var4]];
            }

            var5 = (var8 * var15.d + var7 * var15.b + var6 * var15.c) / (var2 * var15.a) + var1;
            var12.O[var4] = a(var5);
         }
      }

      var9.p();
      var12.y = var9.l;
      var12.ac = var9.p;
      var12.af = var9.n;
      var12.x = var9.o;
      var12.E = var9.c;
      var12.D = var9.d;
      var12.C = var9.e;
      var12.A = var9.j;
      var12.F = var9.B;
      var12.U = var9.z;
      var12.H = var9.C;
      var12.I = var9.J;
      var12.R = var9.M;
      var12.X = var9.h;
      var12.Z = var9.O;
      var12.Y = var9.I;
      if ((client.E & 4) == 4) {
         this.i();
         var12.ae = this.V;
         var12.ag = this.U;
         var12.ad = this.t;
      }

      return var12;
   }

   @ObfuscatedName("dv")
   public final void c(short var1, short var2) {
      for(int var3 = 0; var3 < this.c; ++var3) {
         if (this.f[var3] == var1) {
            this.f[var3] = var2;
         }
      }

   }

   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      signature = "()Ljm;"
   )
   public final cn f() {
      return this.b(64, 768, -50, -10, -50);
   }

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      signature = "()Ljj;"
   )
   public final class243 g() {
      return new class243(this, true, true, true);
   }

   @ObfuscatedName("nh")
   @ObfuscatedSignature(
      signature = "(IIIII)Ljm;"
   )
   public final cn b(int var1, int var2, int var3, int var4, int var5) {
      return this.a(var1, var2, var3, var4, var5);
   }

   public int getFaceCount() {
      return this.c;
   }

   public int getVerticesCount() {
      return this.l;
   }

   public ModelData cloneVertices() {
      this.p = (float[])this.p.clone();
      this.n = (float[])this.n.clone();
      this.o = (float[])this.o.clone();
      return this;
   }

   public float[] getVerticesY() {
      return this.n;
   }

   public ModelData retexture(short var1, short var2) {
      hL.a(this, var1, var2);
      return this;
   }

   public ModelData cloneTextures() {
      this.h = (short[])this.h.clone();
      return this;
   }

   public short[] getFaceTextures() {
      return this.h;
   }

   public float[] getVerticesX() {
      return this.p;
   }

   public short[] getFaceColors() {
      return this.f;
   }

   public ModelData recolor(short var1, short var2) {
      this.b(var1, var2);
      return this;
   }

   public float[] getVerticesZ() {
      return this.o;
   }

   public ModelData cloneColors() {
      return this.h();
   }

   public ModelData shallowCopy() {
      return this.g();
   }

   public byte[] getFaceTransparencies() {
      return this.z;
   }

   public ModelData cloneTransparencies(boolean var1) {
      return this.a(var1);
   }

   public int[] getFaceIndices3() {
      return this.j;
   }

   public int[] getFaceIndices2() {
      return this.e;
   }

   public ModelData cloneTransparencies() {
      return this.a(false);
   }

   public Model light() {
      return this.f();
   }

   public Model light(int var1, int var2, int var3, int var4, int var5) {
      return this.b(var1, var2, var3, var4, var5);
   }

   public int[] getFaceIndices1() {
      return this.d;
   }

   @ObfuscatedName("rr")
   @ObfuscatedSignature(
      signature = "()Ljj;"
   )
   public final class243 h() {
      this.f = (short[])this.f.clone();
      return this;
   }

   @ObfuscatedName("tc")
   @ObfuscatedSignature(
      signature = "(Z)Ljj;"
   )
   private class243 a(boolean var1) {
      if (this.z != null) {
         this.z = (byte[])this.z.clone();
      } else if (var1) {
         this.z = new byte[this.getFaceCount()];
      }

      return this;
   }

   @ObfuscatedName("ai")
   private static int a(int var0, int var1) {
      if ((var1 = (var0 & 127) * var1 >> 7) < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   @ObfuscatedName("al")
   private static int a(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lps;II)Ljj;"
   )
   public static class243 a(fB var0, int var1, int var2) {
      byte[] var4 = var0.loadData(var1, var2);

      try {
         return var4 == null ? null : new class243(var4);
      } catch (NullPointerException var3) {
         throw new RuntimeException("loading model " + var1 + ", " + var2, var3);
      }
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(Lps;II)Ljj;"
   )
   public static class243 b(fB var0, int var1, int var2) {
      byte[] var3;
      return (var3 = fB.a(var0, var1, (int)0)) == null ? null : new class243(var3);
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      signature = "(Ljj;Ljj;IIIZ)V"
   )
   public static void a(class243 var0, class243 var1, int var2, int var3, int var4, boolean var5) {
      class243 var10000 = var0;
      var4 = var4;
      var3 = var3;
      var2 = var2;
      var1 = var1;
      var0 = var0;
      var10000.q();
      var0.d();
      var1.q();
      var1.d();
      ++q;
      int var6 = 0;
      float[] var7 = var1.p;
      int var8 = var1.l;

      int var9;
      for(var9 = 0; var9 < var0.l; ++var9) {
         cp var10;
         int var11;
         int var12;
         int var13;
         if ((var10 = var0.R[var9]).a != 0 && (var11 = (int)var0.n[var9] - var3) <= var1.G && (var12 = (int)var0.p[var9] - var2) >= var1.x && var12 <= var1.u && (var13 = (int)var0.o[var9] - var4) >= var1.P && var13 <= var1.F) {
            for(int var14 = 0; var14 < var8; ++var14) {
               cp var15 = var1.R[var14];
               if (var12 == (int)var7[var14] && var13 == (int)var1.o[var14] && var11 == (int)var1.n[var14] && var15.a != 0) {
                  if (var0.L == null) {
                     var0.L = new cp[var0.l];
                  }

                  if (var1.L == null) {
                     var1.L = new cp[var8];
                  }

                  cp var16;
                  if ((var16 = var0.L[var9]) == null) {
                     var16 = var0.L[var9] = new cp(var10);
                  }

                  cp var17;
                  if ((var17 = var1.L[var14]) == null) {
                     var17 = var1.L[var14] = new cp(var15);
                  }

                  var16.d += var15.d;
                  var16.b += var15.b;
                  var16.c += var15.c;
                  var16.a += var15.a;
                  var17.d += var10.d;
                  var17.b += var10.b;
                  var17.c += var10.c;
                  var17.a += var10.a;
                  ++var6;
                  r[var9] = q;
                  s[var14] = q;
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.c; ++var9) {
            if (r[var0.d[var9]] == q && r[var0.e[var9]] == q && r[var0.j[var9]] == q) {
               if (var0.g == null) {
                  var0.g = new byte[var0.c];
               }

               var0.g[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.c; ++var9) {
            if (q == s[var1.d[var9]] && q == s[var1.e[var9]] && q == s[var1.j[var9]]) {
               if (var1.g == null) {
                  var1.g = new byte[var1.c];
               }

               var1.g[var9] = 2;
            }
         }
      }

   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      signature = "(Ljj;[B)V"
   )
   public static void method6258(class243 var0, byte[] var1) {
      jk var2;
      jk var3;
      jk var4;
      jk var5;
      if (var0 == null) {
         var0 = var0;
         var2 = new jk(var1);
         var3 = new jk(var1);
         var4 = new jk(var1);
         var5 = new jk(var1);
         jk var64 = new jk(var1);
         jk var65 = new jk(var1);
         jk var66 = new jk(var1);
         var2.c = var1.length - 26;
         int var67 = var2.q(-1148779951);
         int var68 = var2.G();
         int var69 = jk.a((jk)var2, (byte)60);
         int var70 = jk.a(var2, (byte)-56);
         int var71 = jk.a(var2, (byte)-90);
         int var72 = jk.a(var2, (byte)-60);
         int var73 = jk.a(var2, (byte)-26);
         int var74 = jk.a(var2, (byte)-21);
         int var75 = jk.a(var2, (byte)-48);
         int var76 = jk.a(var2, (byte)-25);
         int var77 = var2.D();
         int var78 = var2.F();
         int var79 = var2.G();
         int var80 = var2.E();
         int var81 = var2.q(-384160884);
         int var82 = var2.D();
         int var83 = 0;
         int var84 = 0;
         int var85 = 0;
         int var86;
         if (var69 > 0) {
            var0.z = new byte[var69];
            var2.c = 0;

            for(var86 = 0; var86 < var69; ++var86) {
               byte var87;
               if ((var87 = var0.v[var86] = var2.B()) == 0) {
                  ++var83;
               }

               if (var87 > 0 && var87 <= 3) {
                  ++var84;
               }

               if (var87 == 2) {
                  ++var85;
               }
            }
         }

         int var118 = var86 = var69 + var67;
         if (var70 == 1) {
            var86 += var68;
         }

         int var88 = var86;
         int var89 = var86 += var68;
         if (var71 == 255) {
            var86 += var68;
         }

         int var90 = var86;
         if (var73 == 1) {
            var86 += var68;
         }

         int var91 = var86;
         int var92 = var86 += var82;
         if (var72 == 1) {
            var86 += var68;
         }

         int var93 = var86;
         int var94 = var86 += var80;
         if (var74 == 1) {
            var86 += var68 << 1;
         }

         int var95 = var86;
         int var96 = var86 += var81;
         int var97 = var86 += var68 << 1;
         int var98 = var86 += var77;
         int var99 = var86 += var78;
         int var100 = var86 += var79;
         int var101 = var86 += var83 * 6;
         int var102 = var86 += var84 * 6;
         int var103 = var86 += var84 * 6;
         int var104 = var86 += var84 << 1;
         int var105 = var86 += var84;
         var86 += (var84 << 1) + (var85 << 1);
         var0.u = var67;
         var0.l = var68;
         var0.x = var69;
         var0.o = new float[var67];
         var0.o = new float[var67];
         var0.p = new float[var67];
         var0.S = new int[var68];
         var0.e = new int[var68];
         var0.j = new int[var68];
         if (var75 == 1) {
            var0.S = new int[var67];
         }

         if (var70 == 1) {
            var0.i = new byte[var68];
         }

         if (var71 == 255) {
            var0.v = new byte[var68];
         } else {
            var0.C = (byte)var71;
         }

         if (var72 == 1) {
            var0.z = new byte[var68];
         }

         if (var73 == 1) {
            var0.j = new int[var68];
         }

         if (var74 == 1) {
            var0.E = new short[var68];
         }

         if (var74 == 1 && var69 > 0) {
            var0.i = new byte[var68];
         }

         if (var76 == 1) {
            var0.M = new int[var67][];
            var0.J = new int[var67][];
         }

         var0.T = new short[var68];
         if (var69 > 0) {
            var0.h = new short[var69];
            var0.h = new short[var69];
            var0.D = new short[var69];
         }

         var2.c = var69;
         var3.c = var97;
         var4.c = var98;
         var5.c = var99;
         var64.c = var91;
         int var106 = 0;
         int var107 = 0;
         int var108 = 0;

         int var109;
         int var110;
         int var111;
         int var112;
         int var113;
         for(var109 = 0; var109 < var67; ++var109) {
            var110 = jk.a((jk)var2, (byte)1);
            var111 = 0;
            if ((var110 & 1) != 0) {
               var111 = var3.q(-1364051016);
            }

            var112 = 0;
            if ((var110 & 2) != 0) {
               var112 = var4.j();
            }

            var113 = 0;
            if ((var110 & 4) != 0) {
               var113 = var5.u();
            }

            var0.p[var109] = (float)(var106 + var111);
            var0.p[var109] = (float)(var107 + var112);
            var0.n[var109] = (float)(var108 + var113);
            var106 = (int)var0.n[var109];
            var107 = (int)var0.n[var109];
            var108 = (int)var0.o[var109];
            if (var75 == 1) {
               var0.y[var109] = jk.a(var64, (byte)-15);
            }
         }

         if (var76 == 1) {
            for(var109 = 0; var109 < var67; ++var109) {
               var110 = jk.a(var64, (byte)-6);
               var0.I[var109] = new int[var110];
               var0.M[var109] = new int[var110];

               for(var111 = 0; var111 < var110; ++var111) {
                  var0.O[var109][var111] = jk.a(var64, (byte)-30);
                  var0.O[var109][var111] = jk.a((jk)var64, (byte)76);
               }
            }
         }

         var2.c = var96;
         var3.c = var118;
         var4.c = var89;
         var5.c = var92;
         var64.c = var90;
         var65.c = var94;
         var66.c = var95;

         for(var109 = 0; var109 < var68; ++var109) {
            var0.h[var109] = (short)var2.J();
            if (var70 == 1) {
               var0.g[var109] = var3.B();
            }

            if (var71 == 255) {
               var0.v[var109] = var4.B();
            }

            if (var72 == 1) {
               var0.v[var109] = var5.g();
            }

            if (var73 == 1) {
               var0.j[var109] = jk.a(var64, (byte)-13);
            }

            if (var74 == 1) {
               var0.E[var109] = (short)(var65.E() - 1);
            }

            if (var0.B != null && var0.f[var109] != -1) {
               var0.v[var109] = (byte)(jk.a((jk)var66, (byte)1) - 1);
            }
         }

         var2.c = var93;
         var3.c = var88;
         var109 = 0;
         var110 = 0;
         var111 = 0;
         var112 = 0;

         for(var113 = 0; var113 < var68; ++var113) {
            int var114;
            if ((var114 = jk.a(var3, (byte)-48)) == 1) {
               var109 = var2.h() + var112;
               var110 = var2.d() + var109;
               var112 = var111 = var2.z() + var110;
               var0.d[var113] = var109;
               var0.y[var113] = var110;
               var0.d[var113] = var111;
            }

            if (var114 == 2) {
               var2.D();
               var0.Q[var113] = var109;
               int[] var10000 = var0.A;
               throw new NullPointerException();
            }

            if (var114 == 3) {
               var109 = var111;
               var112 = var111 = var2.D() + var112;
               var0.Q[var113] = var109;
               var0.S[var113] = var110;
               var0.w[var113] = var111;
            }

            if (var114 == 4) {
               int var115 = var109;
               var109 = var110;
               var110 = var115;
               var112 = var111 = var2.d() + var112;
               var0.S[var113] = var109;
               var0.w[var113] = var115;
               var0.w[var113] = var111;
            }
         }

         var2.c = var100;
         var3.c = var101;
         var4.c = var102;
         var5.c = var103;
         var64.c = var104;
         var65.c = var105;

         for(var113 = 0; var113 < var69; ++var113) {
            if ((var0.B[var113] & 255) == 0) {
               var0.f[var113] = (short)var2.q(-1837593618);
               var0.h[var113] = (short)var2.j();
               var0.T[var113] = (short)var2.I();
            }
         }

         var2.c = var86;
         if (jk.a((jk)var2, (byte)94) != 0) {
            new cZ();
            var2.h();
            var2.J();
            var2.u();
            jk.d(var2, 1687107415);
         }

      } else {
         var2 = new jk(var1);
         var3 = new jk(var1);
         var4 = new jk(var1);
         var5 = new jk(var1);
         jk var6 = new jk(var1);
         jk var7 = new jk(var1);
         jk var8 = new jk(var1);
         var2.c = var1.length - 26;
         int var116 = var2.d();
         int var9 = var2.d();
         int var10 = jk.a((jk)var2, (byte)60);
         int var11 = jk.a(var2, (byte)-56);
         int var12 = jk.a(var2, (byte)-90);
         int var13 = jk.a(var2, (byte)-60);
         int var14 = jk.a(var2, (byte)-26);
         int var15 = jk.a(var2, (byte)-21);
         int var16 = jk.a(var2, (byte)-48);
         int var17 = jk.a(var2, (byte)-25);
         int var18 = var2.d();
         int var19 = var2.d();
         int var20 = var2.d();
         int var21 = var2.d();
         int var22 = var2.d();
         int var23 = var2.d();
         int var24 = 0;
         int var25 = 0;
         int var26 = 0;
         int var27;
         if (var10 > 0) {
            var0.v = new byte[var10];
            var2.c = 0;

            for(var27 = 0; var27 < var10; ++var27) {
               byte var28;
               if ((var28 = var0.v[var27] = var2.B()) == 0) {
                  ++var24;
               }

               if (var28 > 0 && var28 <= 3) {
                  ++var25;
               }

               if (var28 == 2) {
                  ++var26;
               }
            }
         }

         int var117 = var27 = var10 + var116;
         if (var11 == 1) {
            var27 += var9;
         }

         int var29 = var27;
         int var30 = var27 += var9;
         if (var12 == 255) {
            var27 += var9;
         }

         int var31 = var27;
         if (var14 == 1) {
            var27 += var9;
         }

         int var32 = var27;
         var23 = var27 += var23;
         if (var13 == 1) {
            var27 += var9;
         }

         int var33 = var27;
         var21 = var27 += var21;
         if (var15 == 1) {
            var27 += var9 << 1;
         }

         int var34 = var27;
         var22 = var27 += var22;
         int var35 = var27 += var9 << 1;
         var18 = var27 += var18;
         var19 = var27 += var19;
         var20 = var27 += var20;
         var24 = var27 += var24 * 6;
         int var36 = var27 += var25 * 6;
         int var37 = var27 += var25 * 6;
         int var38 = var27 += var25 << 1;
         int var39 = var27 += var25;
         var27 += (var25 << 1) + (var26 << 1);
         var0.l = var116;
         var0.c = var9;
         var0.K = var10;
         var0.p = new float[var116];
         var0.n = new float[var116];
         var0.o = new float[var116];
         var0.d = new int[var9];
         var0.e = new int[var9];
         var0.j = new int[var9];
         if (var16 == 1) {
            var0.Q = new int[var116];
         }

         if (var11 == 1) {
            var0.g = new byte[var9];
         }

         if (var12 == 255) {
            var0.B = new byte[var9];
         } else {
            var0.C = (byte)var12;
         }

         if (var13 == 1) {
            var0.z = new byte[var9];
         }

         if (var14 == 1) {
            var0.S = new int[var9];
         }

         if (var15 == 1) {
            var0.h = new short[var9];
         }

         if (var15 == 1 && var10 > 0) {
            var0.i = new byte[var9];
         }

         if (var17 == 1) {
            var0.O = new int[var116][];
            var0.I = new int[var116][];
         }

         var0.f = new short[var9];
         if (var10 > 0) {
            var0.D = new short[var10];
            var0.E = new short[var10];
            var0.T = new short[var10];
         }

         var2.c = var10;
         var3.c = var35;
         var4.c = var18;
         var5.c = var19;
         var6.c = var32;
         var18 = 0;
         var19 = 0;
         var25 = 0;

         int var40;
         int var41;
         for(var26 = 0; var26 < var116; ++var26) {
            var32 = jk.a((jk)var2, (byte)1);
            var35 = 0;
            if ((var32 & 1) != 0) {
               var35 = var3.j();
            }

            var40 = 0;
            if ((var32 & 2) != 0) {
               var40 = var4.j();
            }

            var41 = 0;
            if ((var32 & 4) != 0) {
               var41 = var5.j();
            }

            var0.p[var26] = (float)(var18 + var35);
            var0.n[var26] = (float)(var19 + var40);
            var0.o[var26] = (float)(var25 + var41);
            var18 = (int)var0.p[var26];
            var19 = (int)var0.n[var26];
            var25 = (int)var0.o[var26];
            if (var16 == 1) {
               var0.Q[var26] = jk.a(var6, (byte)-15);
            }
         }

         if (var17 == 1) {
            for(var26 = 0; var26 < var116; ++var26) {
               var32 = jk.a(var6, (byte)-6);
               var0.O[var26] = new int[var32];
               var0.I[var26] = new int[var32];

               for(var35 = 0; var35 < var32; ++var35) {
                  var0.O[var26][var35] = jk.a(var6, (byte)-30);
                  var0.I[var26][var35] = jk.a((jk)var6, (byte)76);
               }
            }
         }

         var2.c = var22;
         var3.c = var117;
         var4.c = var30;
         var5.c = var23;
         var6.c = var31;
         var7.c = var21;
         var8.c = var34;

         for(var26 = 0; var26 < var9; ++var26) {
            var0.f[var26] = (short)var2.d();
            if (var11 == 1) {
               var0.g[var26] = var3.B();
            }

            if (var12 == 255) {
               var0.B[var26] = var4.B();
            }

            if (var13 == 1) {
               var0.z[var26] = var5.B();
            }

            if (var14 == 1) {
               var0.S[var26] = jk.a(var6, (byte)-13);
            }

            if (var15 == 1) {
               var0.h[var26] = (short)(var7.d() - 1);
            }

            if (var0.i != null && var0.h[var26] != -1) {
               var0.i[var26] = (byte)(jk.a((jk)var8, (byte)1) - 1);
            }
         }

         var2.c = var33;
         var3.c = var29;
         var26 = 0;
         var32 = 0;
         var35 = 0;
         var40 = 0;

         for(var41 = 0; var41 < var9; ++var41) {
            if ((var116 = jk.a(var3, (byte)-48)) == 1) {
               var26 = var2.j() + var40;
               var32 = var2.j() + var26;
               var40 = var35 = var2.j() + var32;
               var0.d[var41] = var26;
               var0.e[var41] = var32;
               var0.j[var41] = var35;
            }

            if (var116 == 2) {
               var32 = var35;
               var40 = var35 = var2.j() + var40;
               var0.d[var41] = var26;
               var0.e[var41] = var32;
               var0.j[var41] = var35;
            }

            if (var116 == 3) {
               var26 = var35;
               var40 = var35 = var2.j() + var40;
               var0.d[var41] = var26;
               var0.e[var41] = var32;
               var0.j[var41] = var35;
            }

            if (var116 == 4) {
               var116 = var26;
               var26 = var32;
               var32 = var116;
               var40 = var35 = var2.j() + var40;
               var0.d[var41] = var26;
               var0.e[var41] = var116;
               var0.j[var41] = var35;
            }
         }

         var2.c = var20;
         var3.c = var24;
         var4.c = var36;
         var5.c = var37;
         var6.c = var38;
         var7.c = var39;

         for(var41 = 0; var41 < var10; ++var41) {
            if ((var0.v[var41] & 255) == 0) {
               var0.D[var41] = (short)var2.d();
               var0.E[var41] = (short)var2.d();
               var0.T[var41] = (short)var2.d();
            }
         }

         var2.c = var27;
         if (jk.a((jk)var2, (byte)94) != 0) {
            new cZ();
            var2.d();
            var2.d();
            var2.d();
            jk.d(var2, 1687107415);
         }

      }
   }

   @ObfuscatedName("ob")
   @ObfuscatedSignature(
      signature = "(Ljj;)V"
   )
   public static void a(class243 var0) {
      for(int var1 = 0; var1 < var0.l; ++var1) {
         float var2 = var0.p[var1];
         var0.p[var1] = var0.o[var1];
         var0.o[var1] = -var2;
      }

      var0.e();
   }

   @ObfuscatedName("wh")
   @ObfuscatedSignature(
      signature = "(Ljj;)Ljj;"
   )
   public static class243 b(class243 var0) {
      if (var0 == null) {
         a(var0);
         return var0;
      } else {
         class243 var1 = new class243();
         if (var0.g != null) {
            var1.g = new byte[var0.c];

            for(int var2 = 0; var2 < var0.c; ++var2) {
               var1.g[var2] = var0.g[var2];
            }
         }

         var1.l = var0.l;
         var1.c = var0.c;
         var1.K = var0.K;
         var1.p = var0.p;
         var1.n = var0.n;
         var1.o = var0.o;
         var1.d = var0.d;
         var1.e = var0.e;
         var1.j = var0.j;
         var1.B = var0.B;
         var1.z = var0.z;
         var1.i = var0.i;
         var1.f = var0.f;
         var1.h = var0.h;
         var1.C = var0.C;
         var1.v = var0.v;
         var1.D = var0.D;
         var1.E = var0.E;
         var1.T = var0.T;
         var1.Q = var0.Q;
         var1.S = var0.S;
         var1.J = var0.J;
         var1.M = var0.M;
         var1.R = var0.R;
         var1.N = var0.N;
         var1.m = var0.m;
         var1.k = var0.k;
         return var1;
      }
   }

   // $FF: synthetic method
   public Mesh scale(int var1, int var2, int var3) {
      this.c(var1, var2, var3);
      return this;
   }

   // $FF: synthetic method
   public Mesh translate(int var1, int var2, int var3) {
      this.b(var1, var2, var3);
      return this;
   }

   // $FF: synthetic method
   public Mesh rotateY270Ccw() {
      this.c();
      return this;
   }

   // $FF: synthetic method
   public Mesh rotateY180Ccw() {
      this.a();
      return this;
   }

   // $FF: synthetic method
   public Mesh rotateY90Ccw() {
      a(this);
      return this;
   }

   static {
      a = cc.b;
      b = cc.a;
   }
}
