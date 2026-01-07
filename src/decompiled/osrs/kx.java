package osrs;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.api.ModelData;
import net.runelite.api.events.PreMapLoad;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

public class kx implements Runnable {
   @ObfuscatedName("yw")
   private static ExecutorService s = Executors.newSingleThreadExecutor((var0) -> {
      Thread var1;
      (var1 = new Thread(var0, "Map Loader")).setDaemon(true);
      return var1;
   });
   @ObfuscatedName("yd")
   private int t;
   @ObfuscatedName("xt")
   private int u;
   @ObfuscatedName("zm")
   public final kq a;
   @ObfuscatedName("xo")
   private byte[][][] v;
   @ObfuscatedName("zx")
   public final int[][][] b;
   @ObfuscatedName("zm")
   private int[][] w;
   @ObfuscatedName("aa")
   private int x;
   @ObfuscatedName("ah")
   private int[] y;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   private dX z = new dX(64);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      signature = "[Lkf;"
   )
   public cI[] c;
   @ObfuscatedName("bp")
   public int[][][] d;
   @ObfuscatedName("ca")
   public int e;
   @ObfuscatedName("cd")
   private int A;
   @ObfuscatedName("cl")
   public int f;
   @ObfuscatedName("dc")
   private RandomAccessFile B;
   @ObfuscatedName("dn")
   private int[] C;
   @ObfuscatedName("fp")
   private int D;
   @ObfuscatedName("fy")
   private int E;
   @ObfuscatedName("hc")
   public final DrawCallbacks g;
   @ObfuscatedName("hr")
   private short[][][] F;
   @ObfuscatedName("hw")
   public int[][][] h;
   @ObfuscatedName("ib")
   public int i;
   @ObfuscatedName("if")
   @ObfuscatedSignature(
      signature = "Ljg;"
   )
   public ci j;
   @ObfuscatedName("ii")
   public final byte[][][] k;
   @ObfuscatedName("iz")
   public int l;
   @ObfuscatedName("kh")
   private short[][][] G;
   @ObfuscatedName("kp")
   public int m;
   @ObfuscatedName("mb")
   private int H;
   @ObfuscatedName("mp")
   @ObfuscatedSignature(
      signature = "Ldl;"
   )
   public final kd n;
   @ObfuscatedName("nk")
   private int[] I;
   @ObfuscatedName("nt")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   public fU o = new fU();
   @ObfuscatedName("oc")
   public byte[][][] p;
   @ObfuscatedName("od")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   private dX J = new dX(64);
   @ObfuscatedName("ow")
   private int[] K;
   @ObfuscatedName("qk")
   private byte[][][] L;
   @ObfuscatedName("sa")
   public Future q;
   @ObfuscatedName("uf")
   public byte[][][] r;
   @ObfuscatedName("vl")
   private int M;
   @ObfuscatedName("vr")
   private int N;
   @ObfuscatedName("vr")
   private int[] O;
   @ObfuscatedName("wp")
   private int P;
   // $FF: synthetic field
   private static boolean Q = !kx.class.desiredAssertionStatus();

   @ObfuscatedSignature(
      signature = "(Lnet/runelite/api/hooks/DrawCallbacks;ILdl;Lrl1;)V"
   )
   public kx(DrawCallbacks var1, int var2, kd var3, kq var4) {
      if (!Q && var2 != 0 && !var3.isTopLevel()) {
         throw new AssertionError();
      } else {
         this.g = var1;
         this.A = var3.d;
         this.P = var3.c;
         int var5 = var3.isTopLevel() ? 40 : 0;
         this.u = (var5 << 1) + var3.d;
         this.D = (var5 << 1) + var3.c;
         this.t = var5;
         this.x = var2;
         this.N = -var2 << 3;
         this.H = -var2 << 3;
         this.M = var3.d + (var2 << 3);
         this.E = var3.c + (var2 << 3);
         this.n = var3;
         this.a = var4;
         this.b = new int[4][this.u + 1][this.D + 1];
         this.k = new byte[4][this.u + 1][this.D + 1];
         this.w = new int[this.u + 1][this.D + 1];
         this.K = new int[this.D];
         this.O = new int[this.D];
         this.I = new int[this.D];
         this.y = new int[this.D];
         this.C = new int[this.D];
      }
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      signature = "(Ldl;[BII[Lkf;)V"
   )
   private void a(kd var1, byte[] var2, int var3, int var4, cI[] var5) {
      jk var15 = new jk(var2);
      int var6 = -1;

      int var7;
      while((var7 = var15.r()) != 0) {
         var6 += var7;
         var7 = 0;

         int var8;
         while((var8 = jk.a(var15, -1039512213)) != 0) {
            var8 = (var7 += var8 - 1) & 63;
            int var9 = var7 >> 6 & 63;
            int var10 = var7 >> 12;
            int var11;
            int var12 = (var11 = jk.a((jk)var15, (byte)2)) >> 2;
            var11 &= 3;
            var9 += var3;
            var8 += var4;
            if (var9 > this.N && var8 > this.H && var9 < this.M - 1 && var8 < this.E - 1) {
               int var13 = var10;
               if ((this.r[1][var9 + this.t][var8 + this.t] & 2) == 2) {
                  var13 = var10 - 1;
               }

               cI var14 = null;
               if (var13 >= 0) {
                  var14 = var5[var13];
               }

               a(var1, var10, var9, var8, var6, var11, var12, var14);
            }
         }
      }

   }

   @ObfuscatedName("fa")
   private boolean c() {
      fE var1 = client.C[5];
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.a.f.length; ++var3) {
         if (this.a.h[var3] != -1 && this.a.f[var3] == null) {
            this.a.f[var3] = var1.loadData(this.a.h[var3], 0);
            if (this.a.f[var3] == null) {
               ++var2;
            }
         }

         if (this.a.g[var3] != -1 && this.a.d[var3] == null) {
            this.a.d[var3] = var1.a(this.a.g[var3], 0, this.a.a[var3]);
            if (this.a.d[var3] == null) {
               ++var2;
            }
         }
      }

      if (var2 > 0) {
         return false;
      } else {
         boolean var107 = true;

         int var4;
         int var5;
         for(var2 = 0; var2 < this.a.f.length; ++var2) {
            byte[] var6;
            if ((var6 = this.a.d[var2]) != null) {
               var4 = (this.a.e[var2] >> 8 << 6) - this.m;
               var5 = ((this.a.e[var2] & 255) << 6) - this.i;
               var107 &= this.a(var6, var4, var5);
            }
         }

         if (!var107) {
            return false;
         } else {
            kx var7;
            int var8;
            int var9;
            int var10;
            int var12;
            int var10001;
            int var111;
            for(var2 = 0; var2 < this.a.e.length; ++var2) {
               if ((var111 = this.a.g[var2]) != -1) {
                  var4 = var1.g[var111];
                  var5 = var1.k[var111];
                  var10001 = this.a.e[var2];
                  int[] var11 = this.a.a[var2];
                  var10 = var5;
                  var9 = var4;
                  var8 = var10001;
                  var7 = this;
                  if (this.B != null) {
                     try {
                        var7.B.seek((long)(var8 * 25));
                        var7.B.writeByte(1);
                        var7.B.writeInt(var9);
                        var7.B.writeInt(var10);

                        for(var12 = 0; var12 < 4; ++var12) {
                           var7.B.writeInt(var11[var12]);
                        }
                     } catch (IOException var106) {
                        client.cV.error("io error saving xtea", var106);
                     }
                  }
               }
            }

            this.h = new int[4][this.u + 1][this.D + 1];
            this.j = new ci(this.n.k, 4, this.u, this.D, osrs.j.aS.o, ca.b, this.h);
            this.j.e = this.t;
            this.j.an = this.N;
            this.j.av = this.M;
            this.j.ah = this.H;
            this.j.al = this.E;
            this.j.as = false;
            this.c = new cI[4];

            for(var2 = 0; var2 < 4; ++var2) {
               this.c[var2] = new cI(this.A, this.P, !this.n.isTopLevel());
            }

            this.r = new byte[4][this.u][this.D];
            jH.c = 99;
            this.F = new short[4][this.u][this.D];
            this.G = new short[4][this.u][this.D];
            this.L = new byte[4][this.u][this.D];
            this.v = new byte[4][this.u][this.D];
            this.j.az = this.F;
            this.j.aA = this.G;
            this.j.b = this.L;
            this.j.c = this.r;
            this.j.aF = this.m;
            this.j.aG = this.i;
            this.j.aw = this.a.b;
            this.j.ar = this.a.c;
            this.j.ag = this.a.e;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var10002;
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
            int var33;
            int var65;
            int var66;
            int var68;
            int var113;
            int var114;
            if (!this.a.b) {
               var113 = this.x + 6;
               var8 = this.e - var113 >> 3;
               var9 = var113 + this.e >> 3;
               var10 = this.l - var113 >> 3;
               var113 = var113 + this.l >> 3;
               var114 = this.e - 6 >> 3;
               var12 = 6 + this.e >> 3;
               var13 = this.l - 6 >> 3;
               var14 = 6 + this.l >> 3;
               var15 = 0;

               for(var16 = var8; var16 <= var9; ++var16) {
                  for(var2 = var10; var2 <= var113; ++var2) {
                     if (var16 < var114 || var16 > var12 || var2 < var13 || var2 > var14) {
                        ++var15;
                     }
                  }
               }

               int[] var108 = new int[var15];
               byte[][] var110 = new byte[var15][];
               byte[][] var112 = new byte[var15][];
               boolean[] var120 = new boolean[var15];
               var16 = var8;

               for(var2 = 0; var16 <= var9; ++var16) {
                  for(var17 = var10; var17 <= var113; ++var17) {
                     if (var16 < var114 || var16 > var12 || var17 < var13 || var17 > var14) {
                        var3 = var17 | var16 << 8;
                        var108[var2] = var3;
                        var8 = var1.a("m" + var16 + "_" + var17);
                        var18 = var1.a("l" + var16 + "_" + var17);
                        if (var8 != -1 && var18 != -1) {
                           var110[var2] = var1.loadData(var8, 0);
                           var8 = var1.g[var18];
                           var19 = var1.k[var18];
                           int[] var109;
                           if ((var109 = this.a(var3, var8, var19)) != null) {
                              try {
                                 var112[var2] = var1.a(var18, 0, var109);
                              } catch (Exception var105) {
                                 client.cV.error("error decrypting map data", var105);
                              }

                              var3 = (var16 << 6) - this.m;
                              var8 = (var17 << 6) - this.i;
                              var120[var2] = var110[var2] != null && var112[var2] != null && this.a(var112[var2], var3, var8);
                           }
                        }

                        ++var2;
                     }
                  }
               }

               byte[] var124;
               for(var3 = 0; var3 < this.a.f.length; ++var3) {
                  if ((var124 = this.a.f[var3]) != null) {
                     var9 = ((var8 = this.a.e[var3]) >> 8 << 6) - this.m;
                     var10 = ((var8 & 255) << 6) - this.i;
                     if (!Q && (this.e << 3) - 48 != this.m) {
                        throw new AssertionError();
                     }

                     if (!Q && (this.l << 3) - 48 != this.i) {
                        throw new AssertionError();
                     }

                     this.a(var124, var9, var10, this.m, this.i, this.c);
                  }
               }

               for(var3 = 0; var3 < var108.length; ++var3) {
                  if (var120[var3]) {
                     var8 = ((var113 = var108[var3]) >> 8 << 6) - this.m;
                     var9 = ((var113 & 255) << 6) - this.i;
                     this.a(var110[var3], var8, var9, this.m, this.i, this.c);
                  }
               }

               for(var3 = 0; var3 < this.a.f.length; ++var3) {
                  if (this.a.f[var3] == null && this.l < 800) {
                     var9 = ((var8 = this.a.e[var3]) >> 8 << 6) - this.m;
                     var10 = ((var8 & 255) << 6) - this.i;
                     this.a(var9, var10, 64, 64);
                  }
               }

               for(var3 = 0; var3 < var108.length; ++var3) {
                  if (!var120[var3] && this.l < 800) {
                     var8 = ((var113 = var108[var3]) >> 8 << 6) - this.m;
                     var9 = ((var113 & 255) << 6) - this.i;
                     this.a(var8, var9, 64, 64);
                  }
               }

               client.J();

               for(var3 = 0; var3 < this.a.f.length; ++var3) {
                  if ((var124 = this.a.d[var3]) != null) {
                     var9 = ((var8 = this.a.e[var3]) >> 8 << 6) - this.m;
                     var10 = ((var8 & 255) << 6) - this.i;
                     this.a(this.n, var124, var9, var10, this.c);
                  }
               }

               for(var3 = 0; var3 < var108.length; ++var3) {
                  if (var120[var3]) {
                     var8 = ((var113 = var108[var3]) >> 8 << 6) - this.m;
                     var9 = ((var113 & 255) << 6) - this.i;
                     this.a(this.n, var112[var3], var8, var9, this.c);
                  }
               }

               client.A();
               client.J();
            } else {
               var2 = this.A / 8;
               var111 = this.P / 8;

               int var10004;
               int var10007;
               for(var4 = 0; var4 < 4; ++var4) {
                  for(var5 = 0; var5 < var2; ++var5) {
                     for(var3 = 0; var3 < var111; ++var3) {
                        boolean var123 = false;
                        if ((var8 = this.a.c[var4][var5][var3]) != -1) {
                           var9 = var8 >> 24 & 3;
                           var10 = var8 >> 1 & 3;
                           var113 = var8 >> 14 & 1023;
                           var114 = var8 >> 3 & 2047;
                           var12 = (var113 / 8 << 8) + var114 / 8;

                           for(var13 = 0; var13 < this.a.e.length; ++var13) {
                              if (var12 == this.a.e[var13] && this.a.f[var13] != null) {
                                 var14 = var113 - var5 << 3;
                                 var15 = var114 - var3 << 3;
                                 byte[] var143 = this.a.f[var13];
                                 int var10003 = var5 << 3;
                                 var10004 = var3 << 3;
                                 int var10006 = (var113 & 7) << 3;
                                 var10007 = (var114 & 7) << 3;
                                 var17 = var15;
                                 var16 = var14;
                                 var15 = var10;
                                 var14 = var10007;
                                 var13 = var10006;
                                 var12 = var9;
                                 var114 = var10004;
                                 var10 = var10003;
                                 var9 = var4;
                                 byte[] var115 = var143;
                                 var7 = this;
                                 cI var125 = this.c[var4];

                                 for(var20 = var10; var20 < var10 + 8; ++var20) {
                                    for(var19 = var114; var19 < var114 + 8; ++var19) {
                                       if (var125.b(var20, var19)) {
                                          var125.c(var20, var19, 1073741824);
                                       }
                                    }
                                 }

                                 jk var128 = new jk(var115);

                                 for(var19 = 0; var19 < 4; ++var19) {
                                    for(var21 = 0; var21 < 64; ++var21) {
                                       for(var22 = 0; var22 < 64; ++var22) {
                                          if (var12 == var19 && var21 >= var13 && var21 < var13 + 8 && var22 >= var14 && var22 < var14 + 8) {
                                             var10001 = var21 & 7;
                                             var28 = var22 & 7;
                                             var27 = var10001;
                                             var23 = var10 + ((var29 = var15 & 3) == 0 ? var27 : (var29 == 1 ? var28 : (var29 == 2 ? 7 - var27 : 7 - var28)));
                                             var10001 = var21 & 7;
                                             var28 = var22 & 7;
                                             var27 = var10001;
                                             var24 = var114 + ((var29 = var15 & 3) == 0 ? var28 : (var29 == 1 ? 7 - var27 : (var29 == 2 ? 7 - var28 : var27)));
                                             var25 = var10 + (var21 & 7) + var16;
                                             var26 = var17 + (var22 & 7) + var114;
                                             var7.a(var128, var9, var23, var24, var25, var26, var15);
                                          } else {
                                             var7.a(var128, -1, -1, -1, 0, 0, 0);
                                          }
                                       }
                                    }
                                 }

                                 var123 = true;
                                 break;
                              }
                           }
                        }

                        if (!var123) {
                           var10002 = var5 << 3;
                           var10 = var3 << 3;
                           var9 = var10002;
                           var8 = var4;
                           var7 = this;
                           var114 = var9 + this.t;
                           var12 = var10 + this.t;

                           for(var13 = 0; var13 < 8; ++var13) {
                              for(var14 = 0; var14 < 8; ++var14) {
                                 var7.h[var8][var13 + var114][var14 + var12] = 0;
                              }
                           }

                           if (var114 > 0) {
                              for(var13 = 1; var13 < 8; ++var13) {
                                 var7.h[var8][var114][var13 + var12] = var7.h[var8][var114 - 1][var13 + var12];
                              }
                           }

                           if (var12 > 0) {
                              for(var13 = 1; var13 < 8; ++var13) {
                                 var7.h[var8][var13 + var114][var12] = var7.h[var8][var13 + var114][var12 - 1];
                              }
                           }

                           if (var114 > 0 && var7.h[var8][var114 - 1][var12] != 0) {
                              var7.h[var8][var114][var12] = var7.h[var8][var114 - 1][var12];
                           } else if (var12 > 0 && var7.h[var8][var114][var12 - 1] != 0) {
                              var7.h[var8][var114][var12] = var7.h[var8][var114][var12 - 1];
                           } else if (var114 > 0 && var12 > 0 && var7.h[var8][var114 - 1][var12 - 1] != 0) {
                              var7.h[var8][var114][var12] = var7.h[var8][var114 - 1][var12 - 1];
                           }
                        }
                     }
                  }
               }

               for(var4 = 0; var4 < 13; ++var4) {
                  for(var5 = 0; var5 < 13; ++var5) {
                     if (this.a.c[0][var4][var5] == -1) {
                        this.a(var4 << 3, var5 << 3, 8, 8);
                     }
                  }
               }

               for(var4 = 0; var4 < 4; ++var4) {
                  for(var5 = 0; var5 < var2; ++var5) {
                     label837:
                     for(var3 = 0; var3 < var111; ++var3) {
                        if ((var113 = this.a.c[var4][var5][var3]) != -1) {
                           var8 = var113 >> 24 & 3;
                           var9 = var113 >> 1 & 3;
                           var10 = var113 >> 14 & 1023;
                           var113 = var113 >> 3 & 2047;
                           var114 = (var10 / 8 << 8) + var113 / 8;

                           for(var12 = 0; var12 < this.a.e.length; ++var12) {
                              if (var114 == this.a.e[var12] && this.a.d[var12] != null) {
                                 byte[] var144 = this.a.d[var12];
                                 var10004 = var5 << 3;
                                 int var10005 = var3 << 3;
                                 var10007 = (var10 & 7) << 3;
                                 int var10008 = (var113 & 7) << 3;
                                 cI[] var126 = this.c;
                                 var16 = var9;
                                 var15 = var10008;
                                 var14 = var10007;
                                 var13 = var8;
                                 var12 = var10005;
                                 var114 = var10004;
                                 var10 = var4;
                                 byte[] var116 = var144;
                                 kd var117 = this.n;
                                 var7 = this;
                                 jk var127 = new jk(var116);
                                 var19 = -1;

                                 while(true) {
                                    if ((var20 = var127.L()) == 0) {
                                       continue label837;
                                    }

                                    var19 += var20;
                                    var21 = 0;

                                    while((var22 = var127.a()) != 0) {
                                       var23 = (var21 += var22 - 1) & 63;
                                       var24 = var21 >> 6 & 63;
                                       var25 = var21 >> 12;
                                       var27 = (var26 = var127.M()) >> 2;
                                       var28 = var26 & 3;
                                       if (var25 == var13 && var24 >= var14 && var24 < var14 + 8 && var23 >= var15 && var23 < var15 + 8) {
                                          bJ var130 = bJ.c(var19);
                                          var10001 = var24 & 7;
                                          var10002 = var23 & 7;
                                          var10004 = var130.q * -1313509743;
                                          var66 = var130.o;
                                          var65 = var10004;
                                          var33 = var10002;
                                          var31 = var10001;
                                          if ((var28 & 1) == 1) {
                                             var68 = var65;
                                             var65 = var66;
                                             var66 = var68;
                                          }

                                          var20 = var114 + ((var68 = var16 & 3) == 0 ? var31 : (var68 == 1 ? var33 : (var68 == 2 ? 7 - var31 - (var65 - 1) : 7 - var33 - (var66 - 1))));
                                          var10001 = var24 & 7;
                                          var10002 = var23 & 7;
                                          var10004 = var130.q * -1313509743;
                                          var66 = var130.o;
                                          var65 = var10004;
                                          var33 = var10002;
                                          var31 = var10001;
                                          if ((var28 & 1) == 1) {
                                             var68 = var65;
                                             var65 = var66;
                                             var66 = var68;
                                          }

                                          int var64;
                                          var30 = var12 + ((var64 = var16 & 3) == 0 ? var33 : (var64 == 1 ? 7 - var31 - (var65 - 1) : (var64 == 2 ? 7 - var33 - (var66 - 1) : var31)));
                                          if (var20 > var7.N && var30 > var7.H && var20 < var7.M - 1 && var30 < var7.E - 1) {
                                             var31 = var10;
                                             if ((var7.r[1][var20 + var7.t][var30 + var7.t] & 2) == 2) {
                                                var31 = var10 - 1;
                                             }

                                             cI var32 = null;
                                             if (var31 >= 0) {
                                                var32 = var126[var31];
                                             }

                                             a(var117, var10, var20, var30, var19, var28 + var16 & 3, var27, var32);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            var7 = this;

            int[] var10000;
            for(var8 = 0; var8 < 4; ++var8) {
               for(var9 = 0; var9 < var7.A; ++var9) {
                  var10 = var9 + var7.t;

                  for(var114 = 0; var114 < var7.P; ++var114) {
                     var12 = var114 + var7.t;
                     if ((var7.r[var8][var10][var12] & 1) == 1) {
                        var13 = var8;
                        if ((var7.r[1][var10][var12] & 2) == 2) {
                           var13 = var8 - 1;
                        }

                        if (var13 >= 0) {
                           cI var72 = var7.c[var13];
                           int var73 = var9 - var72.b * 377417723;
                           int var74 = var114 - var72.e;
                           var10000 = var72.c[var73];
                           var10000[var74] |= 2097152;
                        }
                     }
                  }
               }
            }

            var8 = (int)Math.sqrt(5100.0D) * 768 >> 8;

            int var79;
            for(var9 = 0; var9 < 4; ++var9) {
               byte[][] var121 = var7.k[var9];

               for(var114 = 1; var114 < var7.j.D - 1; ++var114) {
                  for(var12 = 1; var12 < var7.j.r - 1; ++var12) {
                     var13 = var7.h[var9][var12 + 1][var114] - var7.h[var9][var12 - 1][var114];
                     var16 = (int)Math.sqrt((double)((var15 = var7.h[var9][var12][var114 + 1] - var7.h[var9][var12][var114 - 1]) * var15 + var13 * var13 + 65536));
                     var17 = (var13 << 8) / var16;
                     var18 = 65536 / var16;
                     var20 = ((var15 << 8) / var16 * -50 + var17 * -50 + var18 * -10) / var8 + 96;
                     var21 = (var121[var12 - 1][var114] >> 2) + (var121[var12][var114 - 1] >> 2) + (var121[var12 + 1][var114] >> 3) + (var121[var12][var114 + 1] >> 3) + (var121[var12][var114] >> 1);
                     var7.w[var12][var114] = var20 - var21;
                  }
               }

               for(var114 = 0; var114 < var7.D; ++var114) {
                  var7.K[var114] = 0;
                  var7.O[var114] = 0;
                  var7.I[var114] = 0;
                  var7.y[var114] = 0;
                  var7.C[var114] = 0;
               }

               for(var114 = -5; var114 < var7.u + 5; ++var114) {
                  for(var12 = 0; var12 < var7.D; ++var12) {
                     bu var129;
                     if ((var13 = var114 + 5) >= 0 && var13 < var7.u && (var15 = var7.F[var9][var13][var12] & 32767) > 0) {
                        var129 = var7.b(var15 - 1);
                        var10000 = var7.K;
                        var10000[var12] += var129.b();
                        var10000 = var7.O;
                        var10000[var12] += var129.c();
                        var10000 = var7.I;
                        var10000[var12] += var129.d();
                        var10000 = var7.y;
                        var10000[var12] += var129.e();
                        var10002 = var7.C[var12]++;
                     }

                     if ((var15 = var114 - 5) >= 0 && var15 < var7.u && (var16 = var7.F[var9][var15][var12] & 32767) > 0) {
                        var129 = var7.b(var16 - 1);
                        var10000 = var7.K;
                        var10000[var12] -= var129.b();
                        var10000 = var7.O;
                        var10000[var12] -= var129.c();
                        var10000 = var7.I;
                        var10000[var12] -= var129.d();
                        var10000 = var7.y;
                        var10000[var12] -= var129.e();
                        var10002 = var7.C[var12]--;
                     }
                  }

                  if (var114 > 0 && var114 < var7.u - 1) {
                     var12 = 0;
                     var13 = 0;
                     var15 = 0;
                     var16 = 0;
                     var17 = 0;

                     for(var18 = -5; var18 < var7.D + 5; ++var18) {
                        if ((var19 = var18 + 5) >= 0 && var19 < var7.D) {
                           var12 += var7.K[var19];
                           var13 += var7.O[var19];
                           var15 += var7.I[var19];
                           var16 += var7.y[var19];
                           var17 += var7.C[var19];
                        }

                        if ((var20 = var18 - 5) >= 0 && var20 < var7.D) {
                           var12 -= var7.K[var20];
                           var13 -= var7.O[var20];
                           var15 -= var7.I[var20];
                           var16 -= var7.y[var20];
                           var17 -= var7.C[var20];
                        }

                        if (var18 > 0 && var18 < var7.D - 1 && (!client.bv || (var7.r[0][var114][var18] & 2) != 0 || (var7.r[var9][var114][var18] & 16) == 0)) {
                           if (var9 < jH.c) {
                              jH.c = var9;
                           }

                           var21 = var7.F[var9][var114][var18] & 32767;
                           var22 = var7.G[var9][var114][var18] & 32767;
                           if (var21 > 0 || var22 > 0) {
                              var23 = var7.h[var9][var114][var18];
                              var24 = var7.h[var9][var114 + 1][var18];
                              var25 = var7.h[var9][var114 + 1][var18 + 1];
                              var26 = var7.h[var9][var114][var18 + 1];
                              var27 = var7.w[var114][var18];
                              var28 = var7.w[var114 + 1][var18];
                              var29 = var7.w[var114 + 1][var18 + 1];
                              var20 = var7.w[var114][var18 + 1];
                              var30 = -1;
                              var31 = -1;
                              int var131;
                              if (var21 > 0) {
                                 var131 = (var12 << 8) / var16;
                                 var31 = var13 / var17;
                                 var33 = var15 / var17;
                                 var31 = var30 = b(var131, var31, var33);
                              }

                              var131 = 0;
                              if (var31 != -1) {
                                 var131 = cc.e[a(var31, 96)];
                              }

                              if (var22 == 0) {
                                 var7.j.a(var9, var114, var18, 0, 0, -1, var23, var24, var25, var26, a(var30, var27), a(var30, var28), a(var30, var29), a(var30, var20), 0, 0, 0, 0, var131, 0);
                              } else {
                                 var31 = var7.L[var9][var114][var18] + 1;
                                 byte var132 = var7.v[var9][var114][var18];
                                 int var67;
                                 bE var133;
                                 if ((var65 = (var133 = var7.a(var22 - 1)).c()) >= 0) {
                                    var67 = client.dw.getDefaultColor(var65);
                                    var66 = -1;
                                 } else if (var133.a() == 16711935) {
                                    var66 = -2;
                                    var65 = -1;
                                    var67 = -2;
                                 } else {
                                    var67 = var66 = b(var133.c, var133.h, var133.f);
                                 }

                                 var68 = 0;
                                 if (var67 != -2) {
                                    var68 = cc.e[b(var67, 96)];
                                 }

                                 if (var133.d != -1) {
                                    var67 = b(var133.e, var133.k, var133.j);
                                    var68 = cc.e[b(var67, 96)];
                                 }

                                 var7.j.a(var9, var114, var18, var31, var132, var65, var23, var24, var25, var26, a(var30, var27), a(var30, var28), a(var30, var29), a(var30, var20), b(var66, var27), b(var66, var28), b(var66, var29), b(var66, var20), var131, var68);
                              }
                           }
                        }
                     }
                  }
               }

               for(var114 = 1; var114 < var7.D - 1; ++var114) {
                  for(var12 = 1; var12 < var7.u - 1; ++var12) {
                     ci var145 = var7.j;
                     boolean var135 = false;
                     ci var137 = var145;
                     var79 = var145.a(var9, var12, var114);
                     if ((var137.c[var9][var12][var114] & 8) != 0) {
                        var10000 = var137.ao;
                        var10000[var79] |= 64;
                     }
                  }
               }
            }

            boolean var134 = true;
            boolean var71 = true;
            boolean var70 = true;
            byte var76 = -50;
            byte var75 = -10;
            byte var138 = -50;
            ci var136 = var7.j;

            for(int var77 = 0; var77 < var136.C; ++var77) {
               for(int var78 = 0; var78 < var136.r; ++var78) {
                  for(var79 = 0; var79 < var136.D; ++var79) {
                     int var80 = var136.a(var77, var78, var79);
                     if (var136.d(var80)) {
                        cS var81;
                        if ((var81 = var136.au[var80]) != null && var81.i instanceof class243) {
                           class243 var82 = (class243)var81.i;
                           var136.a(var82, var77, var78, var79, 1, 1);
                           if (var81.e instanceof ModelData) {
                              class243 var83 = (class243)var81.e;
                              var136.a(var83, var77, var78, var79, 1, 1);
                              class243.a(var82, var83, 0, 0, 0, false);
                              var81.e = var83.b(var83.m, var83.k, var138, var75, var76);
                           }

                           var81.i = var82.b(var82.m, var82.k, var138, var75, var76);
                        }

                        byte var139 = var136.i[var80];

                        for(int var140 = 0; var140 < var139; ++var140) {
                           cJ var84;
                           if ((var84 = var136.af[var80 * 5 + var140]) != null && var84.m instanceof class243) {
                              class243 var85 = (class243)var84.m;
                              var136.a(var85, var77, var78, var79, var84.k - var84.g + 1, var84.o - var84.f + 1);
                              var84.m = var85.b(var85.m, var85.k, var138, var75, var76);
                           }
                        }

                        ce var141;
                        if ((var141 = var136.aj[var80]) != null && var141.g instanceof class243) {
                           class243 var142 = (class243)var141.g;
                           int var95 = var79;
                           int var94 = var78;
                           int var93 = var77;
                           class243 var92 = var142;
                           ci var91 = var136;
                           int var96 = var78 + 1;
                           int var97 = var79 + 1;

                           for(int var98 = var78; var98 <= var96; ++var98) {
                              if (var98 >= 0 && var98 < var91.r) {
                                 for(int var99 = var95 - 1; var99 <= var97; ++var99) {
                                    if (var99 >= 0 && var99 < var91.D && (var98 >= var96 || var99 >= var97)) {
                                       int var100 = var91.a(var93, var98, var99);
                                       ce var101;
                                       if (var91.d(var100) && (var101 = var91.aj[var100]) != null && var101.g instanceof class243) {
                                          int var102 = var91.i(var93, var98, var99) - var91.i(var93, var94, var95);
                                          class243 var103 = (class243)var101.g;
                                          class243.a(var92, var103, var98 - var94 << 7, var102, var99 - var95 << 7, true);
                                       }
                                    }
                                 }
                              }
                           }

                           var141.g = var142.b(var142.m, var142.k, var138, var75, var76);
                        }
                     }
                  }
               }
            }

            for(var9 = 0; var9 < var7.u; ++var9) {
               for(var10 = 0; var10 < var7.D; ++var10) {
                  if ((var7.r[1][var9][var10] & 2) == 2) {
                     var7.j.a(var9, var10);
                  }
               }
            }

            synchronized(bJ.e) {
               bJ.e.reset();
            }

            bJ.c.reset();
            if (this.n.isTopLevel()) {
               if (client.bv) {
                  this.j.a(jH.c);
               } else {
                  this.j.a(0);
               }

               if (!this.a.b) {
                  var2 = (this.e - 6) / 8;
                  var111 = (this.e + 6) / 8;
                  var4 = (this.l - 6) / 8;
                  var5 = (this.l + 6) / 8;

                  for(var3 = var2 - 1; var3 <= var111 + 1; ++var3) {
                     for(var113 = var4 - 1; var113 <= var5 + 1; ++var113) {
                        if (var3 < var2 || var3 > var111 || var113 < var4 || var113 > var5) {
                           var1.c("m" + var3 + "_" + var113);
                           var1.c("l" + var3 + "_" + var113);
                        }
                     }
                  }
               }
            }

            if ((client.E & 16) != 0) {
               var7 = this;

               for(var8 = 1; var8 <= 2; ++var8) {
                  for(var9 = 0; var9 < var7.u; ++var9) {
                     for(var10 = 0; var10 < var7.D; ++var10) {
                        if (var7.j.d(var7.j.a(var8 + 1, var9, var10))) {
                           byte[] var122;
                           (var122 = var7.r[var8][var9])[var10] = (byte)(var122[var10] | var7.r[var8 - 1][var9][var10] & 4);
                        }
                     }
                  }
               }
            }

            this.j.h();
            var7 = this;
            int[][][] var118 = new int[4][this.A + 1][this.P + 1];

            for(var9 = 0; var9 < 4; ++var9) {
               for(var10 = 0; var10 < var7.A + 1; ++var10) {
                  for(var114 = 0; var114 < var7.P + 1; ++var114) {
                     var118[var9][var10][var114] = var7.h[var9][var10 + var7.t][var114 + var7.t];
                  }
               }
            }

            this.d = var118;
            var7 = this;
            byte[][][] var119 = new byte[4][this.A][this.P];

            for(var9 = 0; var9 < 4; ++var9) {
               for(var10 = 0; var10 < var7.A; ++var10) {
                  for(var114 = 0; var114 < var7.P; ++var114) {
                     var119[var9][var10][var114] = var7.r[var9][var10 + var7.t][var114 + var7.t];
                  }
               }
            }

            this.p = var119;
            this.j.ae = this.d();
            if (!this.n.isTopLevel()) {
               if (this.g != null) {
                  this.g.loadScene(this.n, this.j);
               }

               return true;
            } else {
               client.a(this.j);
               dF.c.getCallbacks().post(new PreMapLoad(this.n, this.j));
               if (this.g != null) {
                  this.g.loadScene(this.j);
                  this.g.loadScene(this.n, this.j);
               }

               return true;
            }
         }
      }
   }

   @ObfuscatedName("fl")
   public final boolean a() {
      return this.q.isDone();
   }

   @ObfuscatedName("fp")
   private boolean a(byte[] var1, int var2, int var3) {
      jk var10 = new jk(var1);
      int var4 = -1;
      boolean var5 = true;

      int var6;
      label61:
      while((var6 = var10.r()) != 0) {
         var4 += var6;
         var6 = 0;

         while(true) {
            while(true) {
               int var7;
               int var8;
               do {
                  if ((var7 = jk.a(var10, -1039512213)) == 0) {
                     continue label61;
                  }

                  var8 = (var6 += var7 - 1) & 63;
                  int var9 = var6 >> 6 & 63;
                  jk.a((jk)var10, (byte)2);
                  var7 = var9 + var2;
                  var8 += var3;
               } while(!this.a.b && (var7 <= this.N || var8 <= this.H || var7 >= this.M - 1 || var8 >= this.E - 1));

               bJ var11 = bJ.c(var4);
               if ((client.E & 16) != 0 && var11.v != null) {
                  if (!var11.a()) {
                     var5 = false;
                  }

                  for(var8 = 0; var8 < var11.v.length; ++var8) {
                     if (!bJ.c(var11.v[var8]).a()) {
                        var5 = false;
                     }
                  }
               } else if (!var11.a()) {
                  var5 = false;
               }
            }
         }
      }

      return var5;
   }

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      signature = "(I)Lhw;"
   )
   private bu b(int var1) {
      long var6 = (long)var1;
      bu var2;
      if ((var2 = (bu)dX.a(this.z, var6)) != null) {
         return var2;
      } else {
         byte[] var3 = client.C[2].loadData(1, var1);
         var2 = new bu();
         if (var3 != null) {
            var2.a(new jk(var3), var1);
         }

         var2.a();
         long var7 = (long)var1;
         this.z.a((im)var2, var7);
         return var2;
      }
   }

   @ObfuscatedName("hy")
   private kB[][][] d() {
      kB[][][] var1 = new kB[4][this.A][this.P];

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < this.A; ++var3) {
            for(int var4 = 0; var4 < this.P; ++var4) {
               var1[var2][var3][var4] = this.j.ak[var2][var3 + this.t][var4 + this.t];
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("kf")
   @ObfuscatedSignature(
      signature = "(Lwt;IIIIII)V"
   )
   private void a(jk var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= 0 && var2 < 4 && var3 >= this.N && var3 < this.M && var4 >= this.H && var4 < this.E) {
         var3 += this.t;
         var4 += this.t;
         this.r[var2][var3][var4] = 0;

         int var8;
         while((var8 = var1.d()) != 0) {
            if (var8 == 1) {
               int var10;
               if ((var10 = jk.a((jk)var1, (byte)2)) == 1) {
                  var10 = 0;
               }

               if (var2 == 0) {
                  this.h[0][var3][var4] = -var10 << 3;
               } else {
                  this.h[var2][var3][var4] = this.h[var2 - 1][var3][var4] - (var10 << 3);
               }

               return;
            }

            if (var8 <= 49) {
               this.G[var2][var3][var4] = (short)var1.c();
               this.L[var2][var3][var4] = (byte)((var8 - 2) / 4);
               this.v[var2][var3][var4] = (byte)(var8 - 2 + var7 & 3);
            } else if (var8 <= 81) {
               this.r[var2][var3][var4] = (byte)(var8 - 49);
            } else {
               this.F[var2][var3][var4] = (short)(var8 - 81);
            }
         }

         if (var2 == 0) {
            this.h[0][var3][var4] = -c(var5 + 932731, var6 + 556238) << 3;
         } else {
            this.h[var2][var3][var4] = this.h[var2 - 1][var3][var4] - 240;
         }
      } else {
         while((var3 = var1.d()) != 0) {
            if (var3 == 1) {
               jk.a((jk)var1, (byte)2);
               return;
            }

            if (var3 <= 49) {
               var1.c();
            }
         }
      }

   }

   @ObfuscatedName("nw")
   @ObfuscatedSignature(
      signature = "([BIIII[Lkf;)V"
   )
   private void a(byte[] var1, int var2, int var3, int var4, int var5, cI[] var6) {
      if (!Q && var6 == null) {
         throw new AssertionError();
      } else {
         int var7;
         int var8;
         for(int var9 = 0; var9 < 4; ++var9) {
            for(var7 = var2; var7 < var2 + 64; ++var7) {
               for(var8 = var3; var8 < var3 + 64; ++var8) {
                  if (var6[var9].b(var7, var8)) {
                     var6[var9].c(var7, var8, 1073741824);
                  }
               }
            }
         }

         jk var13 = new jk(var1);

         for(var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 64; ++var8) {
               for(int var11 = 0; var11 < 64; ++var11) {
                  int var12 = var8 + var2;
                  int var10 = var3 + var11;
                  this.a(var13, var7, var12, var10, var12 + var4, var5 + var10, 0);
               }
            }
         }

      }
   }

   @ObfuscatedName("py")
   public final void b() {
      if (!Q && this.q != null) {
         throw new AssertionError();
      } else {
         this.q = s.submit(this);
      }
   }

   @ObfuscatedName("qj")
   @ObfuscatedSignature(
      signature = "(I)Lif;"
   )
   public final bE a(int var1) {
      long var6 = (long)var1;
      bE var2;
      if ((var2 = (bE)dX.a(this.J, var6)) != null) {
         return var2;
      } else {
         byte[] var3 = client.C[2].loadData(4, var1);
         var2 = new bE();
         if (var3 != null) {
            jk var8 = new jk(var3);
            var2.a(var8, var1);
         }

         var2.b();
         return var2;
      }
   }

   @ObfuscatedName("qx")
   private void a(int var1, int var2, int var3, int var4) {
      for(int var5 = var2; var5 <= var2 + var4; ++var5) {
         for(int var6 = var1; var6 <= var3 + var1; ++var6) {
            if (var6 >= this.N && var6 < this.M && var5 >= this.H && var5 < this.E) {
               int var7 = var6 + this.t;
               int var8 = var5 + this.t;
               this.k[0][var7][var8] = 127;
               if (var6 == var1 && var6 > 0) {
                  this.h[0][var7][var8] = this.h[0][var7 - 1][var8];
               }

               if (var6 == var3 + var1 && var6 < this.u - 1) {
                  this.h[0][var7][var8] = this.h[0][var7 + 1][var8];
               }

               if (var5 == var2 && var5 > 0) {
                  this.h[0][var7][var8] = this.h[0][var7][var8 - 1];
               }

               if (var5 == var2 + var4 && var5 < this.D - 1) {
                  this.h[0][var7][var8] = this.h[0][var7][var8 + 1];
               }
            }
         }
      }

   }

   public void run() {
      try {
         try {
            String var10004 = File.separator;
            this.B = new RandomAccessFile(osrs.x.a + var10004 + "cache" + var10004 + "xtea", "rw");
         } catch (Exception var12) {
            client.cV.error("unable to setup xtea cache", var12);
         }

         while(!this.c()) {
            try {
               Thread.sleep(20L);
            } catch (InterruptedException var11) {
            }
         }
      } catch (Throwable var13) {
         String var2 = "map loading";
         var13.printStackTrace();
         throw var13;
      } finally {
         try {
            if (this.B != null) {
               this.B.close();
            }
         } catch (Exception var10) {
            client.cV.error("unable to setup xtea cache", var10);
         }

      }

   }

   @ObfuscatedName("wi")
   private int[] a(int var1, int var2, int var3) {
      if (this.B == null) {
         return null;
      } else {
         try {
            int[] var4 = new int[4];
            this.B.seek((long)(var1 * 25));
            if (this.B.readByte() != 1) {
               return null;
            } else {
               var1 = this.B.readInt();
               int var5 = this.B.readInt();
               if (var1 == var2 && var3 == var5) {
                  for(var1 = 0; var1 < 4; ++var1) {
                     var4[var1] = this.B.readInt();
                  }

                  return var4;
               } else {
                  return null;
               }
            }
         } catch (EOFException var6) {
            return null;
         } catch (IOException var7) {
            client.cV.error("io error loading xtea", var7);
            return null;
         }
      }
   }

   @ObfuscatedName("dr")
   private static int a(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         if ((var1 = (var0 & 127) * var1 / 128) < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("hz")
   private static int b(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         if ((var1 = (var0 & 127) * var1 / 128) < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("ix")
   private static int c(int var0, int var1) {
      int var10000 = var0 + '넵';
      int var10001 = var1 + 91923;
      byte var4 = 4;
      int var3 = var10001;
      var10000 = gD.a(var10000, var3, var4) - 128;
      var10001 = var0 + 10294;
      int var10002 = var1 + '鎽';
      var4 = 2;
      var3 = var10002;
      var10000 += gD.a(var10001, var3, var4) - 128 >> 1;
      var4 = 1;
      if ((var0 = (int)((double)(var10000 + (gD.a(var0, var1, var4) - 128 >> 2)) * 0.3D) + 35) < 10) {
         var0 = 10;
      } else if (var0 > 60) {
         var0 = 60;
      }

      return var0;
   }

   @ObfuscatedName("jj")
   private static int b(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      return (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
   }

   @ObfuscatedName("tl")
   @ObfuscatedSignature(
      signature = "(Ldl;IIIIIILkf;)V"
   )
   private static void a(kd var0, int var1, int var2, int var3, int var4, int var5, int var6, cI var7) {
      osrs.q.a(var0, var1, var2, var3, var4, var5, var6, var7);
   }
}
