package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public final class B extends gR {
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 2085681499
   )
   public static int a;
   @ObfuscatedName("ap")
   private boolean b;

   public B(boolean var1) {
      this.b = var1;
   }

   public final int compare(Object var1, Object var2) {
      gX var10001 = (gX)var1;
      gX var3 = (gX)var2;
      gX var4 = var10001;
      int var10000;
      if (var3.f != var4.f) {
         if (!this.b) {
            return var3.f - var4.f;
         }

         var10000 = var4.f - var3.f;
      } else {
         var10000 = this.a(var4, var3);
      }

      return var10000;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IB)Lhd;",
      garbageValue = "97"
   )
   public static aY a(int var0) {
      aY var1;
      if ((var1 = (aY)dX.a(aY.c, (long)var0)) != null) {
         return var1;
      } else {
         byte[] var2 = fB.a(aY.d, 9, (int)var0);
         (var1 = new aY()).e = var0;
         if (var2 != null) {
            jk var3 = new jk(var2);
            aY var9 = var1;

            label250:
            while(true) {
               while(true) {
                  int var4;
                  if ((var4 = jk.a((jk)var3, (byte)72)) == 0) {
                     break label250;
                  }

                  jk var5 = var3;
                  aY var10 = var9;
                  int var6;
                  int var7;
                  if (var4 == 1) {
                     var7 = jk.a(var3, (byte)-14);
                     var9.j = new int[var7];

                     for(var6 = 0; var6 < var7; ++var6) {
                        var10.j[var6] = var5.d();
                     }
                  } else if (var4 == 2) {
                     var9.m = var3.p();
                  } else if (var4 == 12) {
                     var9.k = jk.a((jk)var3, (byte)27);
                  } else if (var4 == 13) {
                     var9.p = var3.d();
                  } else if (var4 == 14) {
                     var9.l = var3.d();
                  } else if (var4 == 15) {
                     var9.g = var3.d();
                  } else if (var4 == 16) {
                     var9.i = var3.d();
                  } else if (var4 == 17) {
                     var9.l = var3.d();
                     var9.x = var3.d();
                     var9.u = var3.d();
                     var9.r = var3.d();
                  } else if (var4 == 18) {
                     var3.d();
                  } else if (var4 >= 30 && var4 < 35) {
                     var9.T[var4 - 30] = var3.p();
                     if (var9.T[var4 - 30].equalsIgnoreCase("Hidden")) {
                        var9.T[var4 - 30] = null;
                     }
                  } else if (var4 == 40) {
                     var7 = jk.a((jk)var3, (byte)35);
                     var9.y = new short[var7];
                     var9.G = new short[var7];

                     for(var6 = 0; var6 < var7; ++var6) {
                        var10.y[var6] = (short)var5.d();
                        var10.G[var6] = (short)var5.d();
                     }
                  } else if (var4 == 41) {
                     var7 = jk.a((jk)var3, (byte)4);
                     var9.J = new short[var7];
                     var9.V = new short[var7];

                     for(var6 = 0; var6 < var7; ++var6) {
                        var10.J[var6] = (short)var5.d();
                        var10.V[var6] = (short)var5.d();
                     }
                  } else if (var4 == 60) {
                     var7 = jk.a(var3, (byte)-6);
                     var9.s = new int[var7];

                     for(var6 = 0; var6 < var7; ++var6) {
                        var10.s[var6] = var5.d();
                     }
                  } else if (var4 == 74) {
                     var9.P[0] = var3.d();
                  } else if (var4 == 75) {
                     var9.P[1] = var3.d();
                  } else if (var4 == 76) {
                     var9.P[2] = var3.d();
                  } else if (var4 == 77) {
                     var9.P[3] = var3.d();
                  } else if (var4 == 78) {
                     var9.P[4] = var3.d();
                  } else if (var4 == 79) {
                     var9.P[5] = var3.d();
                  } else if (var4 == 93) {
                     var9.O = false;
                  } else if (var4 == 95) {
                     var9.K = var3.d();
                  } else if (var4 == 97) {
                     var9.C = var3.d();
                  } else if (var4 == 98) {
                     var9.M = var3.d();
                  } else if (var4 == 99) {
                     var9.U = true;
                  } else if (var4 == 100) {
                     var9.D = var3.B();
                  } else if (var4 == 101) {
                     var9.H = var3.B() * 5;
                  } else {
                     int var8;
                     if (var4 == 102) {
                        var7 = jk.a((jk)var3, (byte)51);
                        var6 = 0;

                        for(var8 = var7; var8 != 0; var8 >>= 1) {
                           ++var6;
                        }

                        var9.I = new int[var6];
                        var9.F = new short[var6];

                        for(var8 = 0; var8 < var6; ++var8) {
                           if ((var7 & 1 << var8) == 0) {
                              var10.I[var8] = -1;
                              var10.F[var8] = -1;
                           } else {
                              var10.I[var8] = var5.u();
                              var10.F[var8] = (short)var5.x();
                           }
                        }
                     } else if (var4 == 103) {
                        var9.R = var3.d();
                     } else if (var4 != 106 && var4 != 118) {
                        if (var4 == 107) {
                           var9.A = false;
                        } else if (var4 == 109) {
                           var9.E = false;
                        } else if (var4 == 114) {
                           var9.h = var3.d();
                        } else if (var4 == 115) {
                           var9.h = var3.d();
                           var9.t = var3.d();
                           var9.n = var3.d();
                           var9.q = var3.d();
                        } else if (var4 == 116) {
                           var9.v = var3.d();
                        } else if (var4 == 117) {
                           var9.v = var3.d();
                           var9.f = var3.d();
                           var9.o = var3.d();
                           var9.w = var3.d();
                        } else if (var4 == 122) {
                           var9.z = true;
                        } else if (var4 == 123) {
                           var9.S = true;
                        } else if (var4 == 124) {
                           var9.X = var3.d();
                        } else if (var4 == 126) {
                           var9.N = var3.d();
                        } else if (var4 == 249) {
                           var9.W = K.a(var3, var9.W);
                        }
                     } else {
                        var9.Q = var3.d();
                        if (var9.Q == 65535) {
                           var9.Q = -1;
                        }

                        var9.L = var3.d();
                        if (var9.L == 65535) {
                           var9.L = -1;
                        }

                        var7 = -1;
                        if (var4 == 118 && (var7 = var3.d()) == 65535) {
                           var7 = -1;
                        }

                        var6 = jk.a(var3, (byte)-42);
                        var9.B = new int[var6 + 2];

                        for(var8 = 0; var8 <= var6; ++var8) {
                           var10.B[var8] = var5.d();
                           if (var10.B[var8] == 65535) {
                              var10.B[var8] = -1;
                           }
                        }

                        var10.B[var6 + 1] = var7;
                     }
                  }
               }
            }
         }

         if (var1.N == -1) {
            var1.N = (int)((float)(var1.k << 7) * 0.4F);
         }

         aY.c.a((im)var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1499375175"
   )
   static void b(int var0) {
      jP var2;
      if ((var2 = (jP)gb.a(jP.a, (long)var0)) != null) {
         for(int var1 = 0; var1 < var2.b.length; ++var1) {
            var2.b[var1] = -1;
            var2.c[var1] = 0;
         }
      }

   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "895126381"
   )
   static boolean a() {
      return (client.ay & 1) != 0;
   }

   @ObfuscatedName("lm")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIII)I",
      garbageValue = "-1913197673"
   )
   public static final int a(String var0, String var1, int var2, int var3, int var4, int var5) {
      return fh.a(var0, var1, var2, var3, var4, var5, -1, false, -1);
   }
}
