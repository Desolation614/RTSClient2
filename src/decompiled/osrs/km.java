package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public final class km {
   @ObfuscatedName("ai")
   private int a;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "[Ley;"
   )
   private Q[] b = new Q[10];
   @ObfuscatedName("an")
   private int c;

   @ObfuscatedSignature(
      signature = "(Lwt;)V"
   )
   private km(jk var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         if (jk.a(var1, (byte)-67) != 0) {
            --var1.c;
            this.b[var2] = new Q();
            Q var10000 = this.b[var2];
            jk var4 = var1;
            Q var3 = var10000;
            var10000.o = new kb();
            var3.o.b(var1);
            var3.h = new kb();
            var3.h.b(var1);
            if (jk.a(var1, (byte)-92) != 0) {
               --var1.c;
               var3.j = new kb();
               var3.j.b(var1);
               var3.l = new kb();
               var3.l.b(var1);
            }

            if (jk.a((jk)var1, (byte)9) != 0) {
               --var1.c;
               var3.w = new kb();
               var3.w.b(var1);
               var3.t = new kb();
               var3.t.b(var1);
            }

            if (jk.a(var1, (byte)-101) != 0) {
               --var1.c;
               var3.q = new kb();
               var3.q.b(var1);
               var3.i = new kb();
               var3.i.b(var1);
            }

            int var6;
            for(int var5 = 0; var5 < 10 && (var6 = jk.a(var4, 231589889)) != 0; ++var5) {
               var3.s[var5] = var6;
               var3.m[var5] = var4.j();
               var3.p[var5] = jk.a(var4, -2051858510);
            }

            var3.u = jk.a(var4, 1989130932);
            var3.g = jk.a(var4, 1458487893);
            var3.k = var4.d();
            var3.r = var4.d();
            var3.n = new s();
            var3.v = new kb();
            kb var10 = var3.v;
            var4 = var4;
            s var9 = var3.n;
            var6 = jk.a(var4, (byte)-6);
            var9.d[0] = var6 >> 4;
            var9.d[1] = var6 & 15;
            if (var6 == 0) {
               int[] var11 = var9.e;
               var9.e[1] = 0;
               var11[0] = 0;
            } else {
               var9.e[0] = var4.d();
               var9.e[1] = var4.d();
               var6 = jk.a((jk)var4, (byte)23);

               int var7;
               int var8;
               for(var7 = 0; var7 < 2; ++var7) {
                  for(var8 = 0; var8 < var9.d[var7]; ++var8) {
                     var9.c[var7][0][var8] = var4.d();
                     var9.f[var7][0][var8] = var4.d();
                  }
               }

               for(var7 = 0; var7 < 2; ++var7) {
                  for(var8 = 0; var8 < var9.d[var7]; ++var8) {
                     if ((var6 & 1 << (var7 << 2) << var8) != 0) {
                        var9.c[var7][1][var8] = var4.d();
                        var9.f[var7][1][var8] = var4.d();
                     } else {
                        var9.c[var7][1][var8] = var9.c[var7][0][var8];
                        var9.f[var7][1][var8] = var9.f[var7][0][var8];
                     }
                  }
               }

               if (var6 != 0 || var9.e[1] != var9.e[0]) {
                  var10.a(var4);
               }
            }
         }
      }

      this.c = var1.d();
      this.a = var1.d();
   }

   @ObfuscatedName("ad")
   public final int a() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.b[var2] != null && this.b[var2].r / 20 < var1) {
            var1 = this.b[var2].r / 20;
         }
      }

      if (this.c < this.a && this.c / 20 < var1) {
         var1 = this.c / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.b[var2] != null) {
               Q var10000 = this.b[var2];
               var10000.r -= var1 * 20;
            }
         }

         if (this.c < this.a) {
            this.c -= var1 * 20;
            this.a -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Z)Lds;"
   )
   public final kl a(boolean var1) {
      boolean var3 = var1;
      km var2 = this;
      int var4 = 0;

      int var5;
      for(var5 = 0; var5 < 10; ++var5) {
         if (var2.b[var5] != null && var2.b[var5].k + var2.b[var5].r > var4) {
            var4 = var2.b[var5].k + var2.b[var5].r;
         }
      }

      short[] var10000;
      if (var4 == 0) {
         var10000 = new short[0];
      } else {
         short[] var25 = new short[var4 * 22050 / 1000];

         for(var5 = 0; var5 < 10; ++var5) {
            if (var2.b[var5] != null) {
               int var6 = var2.b[var5].k * 22050 / 1000;
               int var7 = var2.b[var5].r * 22050 / 1000;
               Q var10002 = var2.b[var5];
               int var10 = var10002.k;
               int var9 = var6;
               Q var8 = var10002;
               hh.a(Q.d, 0, var6);
               if (var10 >= 10) {
                  double var19 = (double)var6 / ((double)var10 + 0.0D);
                  kb.a(var8.o);
                  kb.a(var8.h);
                  var10 = 0;
                  int var11 = 0;
                  int var12 = 0;
                  if (var8.j != null) {
                     kb.a(var8.j);
                     kb.a(var8.l);
                     var10 = (int)((double)(var8.j.a - var8.j.c) * 32.768D / var19);
                     var11 = (int)((double)var8.j.c * 32.768D / var19);
                  }

                  int var13 = 0;
                  int var14 = 0;
                  int var15 = 0;
                  if (var8.w != null) {
                     kb.a(var8.w);
                     kb.a(var8.t);
                     var13 = (int)((double)(var8.w.a - var8.w.c) * 32.768D / var19);
                     var14 = (int)((double)var8.w.c * 32.768D / var19);
                  }

                  int var16;
                  for(var16 = 0; var16 < 5; ++var16) {
                     if (var8.s[var16] != 0) {
                        Q.e[var16] = 0;
                        Q.b[var16] = (int)((double)var8.p[var16] * var19);
                        Q.a[var16] = (var8.s[var16] << 14) / 100;
                        Q.f[var16] = (int)((double)(var8.o.a - var8.o.c) * 32.768D * Math.pow(1.0057929410678534D, (double)var8.m[var16]) / var19);
                        Q.c[var16] = (int)((double)var8.o.c * 32.768D / var19);
                     }
                  }

                  int var17;
                  int var18;
                  int var21;
                  int var22;
                  int[] var28;
                  for(var16 = 0; var16 < var9; ++var16) {
                     var17 = var8.o.a(var9);
                     var18 = var8.h.a(var9);
                     if (var8.j != null) {
                        var21 = var8.j.a(var9);
                        var22 = var8.l.a(var9);
                        var17 += Q.a(var12, var22, var8.j.b) >> 1;
                        var12 = var12 + var11 + (var21 * var10 >> 16);
                     }

                     if (var8.w != null) {
                        var21 = var8.w.a(var9);
                        var22 = var8.t.a(var9);
                        var18 = var18 * ((Q.a(var15, var22, var8.w.b) >> 1) + '耀') >> 15;
                        var15 = var15 + var14 + (var21 * var13 >> 16);
                     }

                     for(var21 = 0; var21 < 5; ++var21) {
                        if (var8.s[var21] != 0 && (var22 = Q.b[var21] + var16) < var9) {
                           var28 = Q.d;
                           var28[var22] += Q.a(Q.e[var21], var18 * Q.a[var21] >> 15, var8.o.b);
                           var28 = Q.e;
                           var28[var21] += (var17 * Q.f[var21] >> 16) + Q.c[var21];
                        }
                     }
                  }

                  if (var8.q != null) {
                     kb.a(var8.q);
                     kb.a(var8.i);
                     var16 = 0;
                     boolean var27 = true;

                     for(var21 = 0; var21 < var9; ++var21) {
                        var22 = var8.q.a(var9);
                        var10 = var8.i.a(var9);
                        if (var27) {
                           var17 = (var22 * (var8.q.a - var8.q.c) >> 8) + var8.q.c;
                        } else {
                           var17 = (var10 * (var8.q.a - var8.q.c) >> 8) + var8.q.c;
                        }

                        var16 += 256;
                        if (var16 >= var17) {
                           var16 = 0;
                           var27 = !var27;
                        }

                        if (var27) {
                           Q.d[var21] = 0;
                        }
                     }
                  }

                  if (var8.u > 0 && var8.g > 0) {
                     for(var17 = var16 = (int)((double)var8.u * var19); var17 < var9; ++var17) {
                        var28 = Q.d;
                        var28[var17] += Q.d[var17 - var16] * var8.g / 100;
                     }
                  }

                  if (var8.n.d[0] > 0 || var8.n.d[1] > 0) {
                     kb.a(var8.v);
                     var16 = var8.v.a(var9 + 1);
                     var17 = var8.n.a(0, (float)var16 / 65536.0F);
                     var18 = var8.n.a(1, (float)var16 / 65536.0F);
                     if (var9 >= var17 + var18) {
                        var21 = 0;
                        var22 = var18;
                        if (var18 > var9 - var17) {
                           var22 = var9 - var17;
                        }

                        label215:
                        while(true) {
                           if (var21 >= var22) {
                              var22 = 128;

                              while(true) {
                                 if (var22 > var9 - var17) {
                                    var22 = var9 - var17;
                                 }

                                 while(var21 < var22) {
                                    var11 = (int)((long)Q.d[var21 + var17] * (long)s.b >> 16);

                                    for(var10 = 0; var10 < var17; ++var10) {
                                       var11 += (int)((long)Q.d[var21 + var17 - 1 - var10] * (long)s.a[0][var10] >> 16);
                                    }

                                    for(var10 = 0; var10 < var18; ++var10) {
                                       var11 -= (int)((long)Q.d[var21 - 1 - var10] * (long)s.a[1][var10] >> 16);
                                    }

                                    Q.d[var21] = var11;
                                    var16 = var8.v.a(var9 + 1);
                                    ++var21;
                                 }

                                 if (var21 >= var9 - var17) {
                                    while(true) {
                                       if (var21 >= var9) {
                                          break label215;
                                       }

                                       var11 = 0;

                                       for(var10 = var21 + var17 - var9; var10 < var17; ++var10) {
                                          var11 += (int)((long)Q.d[var21 + var17 - 1 - var10] * (long)s.a[0][var10] >> 16);
                                       }

                                       for(var10 = 0; var10 < var18; ++var10) {
                                          var11 -= (int)((long)Q.d[var21 - 1 - var10] * (long)s.a[1][var10] >> 16);
                                       }

                                       Q.d[var21] = var11;
                                       var8.v.a(var9 + 1);
                                       ++var21;
                                    }
                                 }

                                 var17 = var8.n.a(0, (float)var16 / 65536.0F);
                                 var18 = var8.n.a(1, (float)var16 / 65536.0F);
                                 var22 += 128;
                              }
                           }

                           var10 = (int)((long)Q.d[var21 + var17] * (long)s.b >> 16);

                           for(var11 = 0; var11 < var17; ++var11) {
                              var10 += (int)((long)Q.d[var21 + var17 - 1 - var11] * (long)s.a[0][var11] >> 16);
                           }

                           for(var11 = 0; var11 < var21; ++var11) {
                              var10 -= (int)((long)Q.d[var21 - 1 - var11] * (long)s.a[1][var11] >> 16);
                           }

                           Q.d[var21] = var10;
                           var16 = var8.v.a(var9 + 1);
                           ++var21;
                        }
                     }
                  }

                  for(var16 = 0; var16 < var9; ++var16) {
                     if (Q.d[var16] < -32768) {
                        Q.d[var16] = -32768;
                     }

                     if (Q.d[var16] > 32767) {
                        Q.d[var16] = 32767;
                     }
                  }
               }

               int[] var26 = Q.d;
               if (var3) {
                  for(var9 = 0; var9 < var6; ++var9) {
                     var10 = (var26[var9] >> 8) + var25[var9 + var7];
                     var10 = Math.max(-128, Math.min(var10, 127));
                     var25[var9 + var7] = (short)((byte)var10);
                  }
               } else {
                  for(var9 = 0; var9 < var6; ++var9) {
                     var10 = var26[var9] + var25[var9 + var7];
                     var10 = Math.max(-32768, Math.min(var10, 32767));
                     var25[var9 + var7] = (short)var10;
                  }
               }
            }
         }

         var10000 = var25;
      }

      short[] var24 = var10000;
      return new kl(22050, var24, this.c * 22050 / 1000, this.a * 22050 / 1000, false, var1);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lps;II)Ldt;"
   )
   public static km a(fB var0, int var1, int var2) {
      byte[] var3;
      return (var3 = fB.a(var0, var1, var2)) == null ? null : new km(new jk(var3));
   }
}
