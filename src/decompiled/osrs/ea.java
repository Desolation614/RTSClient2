package osrs;

import java.util.BitSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public final class ea extends jX {
   @ObfuscatedName("ai")
   static AtomicBoolean a = null;
   @ObfuscatedName("al")
   static ThreadPoolExecutor b = null;
   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      signature = "[Lwy;"
   )
   static jp[] c;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 100551355
   )
   public int d = 0;
   @ObfuscatedName("ab")
   int[] e = new int[16];
   @ObfuscatedName("ac")
   PriorityQueue f = new PriorityQueue(5, new ep());
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1138591593
   )
   private int t = -416920000;
   @ObfuscatedName("af")
   int[] g = new int[16];
   @ObfuscatedName("ag")
   private int[] u = new int[16];
   @ObfuscatedName("ah")
   private int[] v = new int[16];
   @ObfuscatedName("ak")
   private int[] w = new int[16];
   @ObfuscatedName("am")
   int[] h = new int[16];
   @ObfuscatedName("ao")
   int[] i = new int[16];
   @ObfuscatedName("aq")
   int[] j = new int[16];
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1309766171
   )
   int k = 256;
   @ObfuscatedName("as")
   private int[] x = new int[16];
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "Lqq;"
   )
   private gb y;
   @ObfuscatedName("ax")
   private int[] z = new int[16];
   @ObfuscatedName("ay")
   private int[] A = new int[16];
   @ObfuscatedName("az")
   private int[] B = new int[16];
   @ObfuscatedName("ba")
   int[] l = new int[16];
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1138591593
   )
   private int C;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      longValue = -348765912245905445L
   )
   private long D;
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "[[Lne;"
   )
   private ek[][] E = new ek[16][128];
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "Lnm;"
   )
   private et F = new et(this);
   @ObfuscatedName("bl")
   int[] m = new int[16];
   @ObfuscatedName("bm")
   private boolean G;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -1627871829
   )
   private int H;
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "Lma;"
   )
   private dI I = new dI();
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "Ldc;"
   )
   jV n = null;
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "[[Lne;"
   )
   private ek[][] J = new ek[16][128];
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      longValue = -5739573981979140621L
   )
   private long K;
   @ObfuscatedName("bx")
   int[] o = new int[16];

   @ObfuscatedSignature(
      signature = "(Ldc;)V"
   )
   public ea(jV var1) {
      this.n = var1;
      this.y = new gb(128);
      this.i();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "()Ldf;"
   )
   protected final jX a() {
      return null;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "()Ldf;"
   )
   protected final jX b() {
      return this.F;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "354234421"
   )
   public final void d() {
      synchronized(this.n) {
         this.I.c();
         this.i();
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2142649350"
   )
   public final boolean e() {
      synchronized(this.n) {
         return dI.a(this.I);
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-320224391"
   )
   public final void g() {
      synchronized(this.n) {
         for(eE var2 = (eE)this.y.a(); var2 != null; var2 = (eE)this.y.c()) {
            gk.a(var2);
         }

      }
   }

   @ObfuscatedName("ak")
   private boolean h() {
      synchronized(this.n) {
         return this.y.b() > 0;
      }
   }

   @ObfuscatedName("am")
   protected final int c() {
      return 0;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lnh;Lps;Ldz;B)Z",
      garbageValue = "73"
   )
   public final boolean a(en var1, fB var2, r var3) {
      synchronized(this.n) {
         boolean var5 = true;
         synchronized(this.f) {
            this.f.clear();
         }

         for(eC var6 = (eC)var1.b.a(); var6 != null; var6 = (eC)var1.b.c()) {
            int var7 = (int)var6.cf;
            eE var8;
            if ((var8 = (eE)gb.a(this.y, (long)var7)) == null) {
               byte[] var9;
               eE var10;
               if ((var9 = fB.b(var2, var7)) == null) {
                  var10 = null;
               } else {
                  var10 = new eE(var9);
               }

               var8 = var10;
               if (var10 == null) {
                  var5 = false;
                  continue;
               }

               this.y.a((hR)var10, (long)var7);
            }

            BitSet var25 = var6.c;
            r var24 = var3;
            eE var22 = var8;
            boolean var11 = true;
            int var12 = 0;
            z var13 = new z();

            int var14;
            for(int var15 = var25.nextSetBit(0); var15 != -1; var15 = var25.nextSetBit(var14)) {
               var14 = var25.nextClearBit(var15);

               for(var15 = var15; var15 < var14; ++var15) {
                  int var16;
                  if (var25.get(var15) && (var16 = var22.d[var15]) != 0) {
                     if (var16 != var12) {
                        var12 = var16--;
                        z var28;
                        if ((var16 & 1) == 0) {
                           var28 = new z;
                           int var10003 = var16 >> 2;
                           boolean var27 = true;
                           var16 = var10003;
                           if (var24 == null) {
                              var24.a(var16, (int[])null);
                           }

                           var28.<init>(var24.a(var16, (int[])null));
                        } else {
                           var16 >>= 2;
                           if (var24.b.e == 1) {
                              var28 = var24.a(0, var16);
                           } else {
                              if (var24.b.d(var16) != 1) {
                                 throw new RuntimeException();
                              }

                              var28 = var24.a(var16, 0);
                           }
                        }

                        var13 = var28;
                        if (var28.a()) {
                           var11 = false;
                        } else {
                           var22.e.add(var22.e.size(), var13);
                        }
                     }

                     if (!var13.a()) {
                        var22.j[var15] = var13;
                        var22.d[var15] = 0;
                     }
                  }
               }
            }

            if (!var11) {
               var5 = false;
            } else if (this.f != null) {
               synchronized(this.f) {
                  Iterator var26 = var8.e.iterator();

                  while(var26.hasNext()) {
                     z var23 = (z)var26.next();
                     this.f.add(new eq(var6.b, var23));
                  }
               }
            }
         }

         return var5;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1820148035"
   )
   private void b(int var1, int var2) {
      ek var3;
      if ((var3 = this.E[var1][var2]) != null) {
         this.E[var1][var2] = null;
         if ((this.i[var1] & 2) != 0) {
            ek var4 = (ek)fU.e(this.F.c);

            while(true) {
               if (var4 == null) {
                  return;
               }

               if (var4.j == var3.j && var4.n < 0 && var4 != var3) {
                  var3.n = 0;
                  break;
               }

               var4 = (ek)fU.b(this.F.c);
            }
         } else {
            var3.n = 0;
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1508078496"
   )
   public final void b(int var1) {
      synchronized(this.n) {
         this.k = var1;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "2001892277"
   )
   final void a(int var1, int var2) {
      if (var2 != this.z[var1]) {
         this.z[var1] = var2;

         for(var2 = 0; var2 < 128; ++var2) {
            this.J[var1][var2] = null;
         }
      }

   }

   @ObfuscatedName("au")
   protected final void a(int var1) {
      if (dI.a(this.I)) {
         int var2 = this.I.e * this.t * 786158161 / osrs.B.a;

         do {
            long var3 = this.D + (long)var2 * (long)var1;
            if (this.K - var3 >= 0L) {
               this.D = var3;
               break;
            }

            int var5 = (int)(((long)var2 + (this.K - this.D) - 1L) / (long)var2);
            this.D += (long)var2 * (long)var5;
            this.F.a(var5);
            var1 -= var5;
            this.j();
         } while(dI.a(this.I));
      }

      this.F.a(var1);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Lne;ZI)V",
      garbageValue = "1746515813"
   )
   final void a(ek var1, boolean var2) {
      int var3 = var1.h.d.length;
      int var4;
      if (var2 && var1.h.e) {
         var4 = var3 + var3 - var1.h.f;
         var4 = (int)((long)this.j[var1.j] * (long)var4 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.s.h();
         }
      } else {
         var4 = (int)((long)var3 * (long)this.j[var1.j] >> 6);
      }

      var1.s.b(var4);
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      signature = "(Lne;I)I",
      garbageValue = "-79391058"
   )
   private int b(ek var1) {
      int var2;
      return (var2 = this.h[var1.j]) < 8192 ? var2 * var1.t + 32 >> 6 : 16384 - ((128 - var1.t) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedName("bc")
   private void c(int var1, int var2) {
      this.g[var1] = var2;
      this.j[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "2119911940"
   )
   private void c(int var1) {
      if ((this.i[var1] & 2) != 0) {
         for(ek var2 = (ek)fU.e(this.F.c); var2 != null; var2 = (ek)fU.b(this.F.c)) {
            if (var2.j == var1 && this.E[var1][var2.o] == null && var2.n < 0) {
               var2.n = 0;
            }
         }
      }

   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1721035935"
   )
   private void d(int var1) {
      int var2;
      int var3;
      if ((var2 = var1 & 240) == 128) {
         var2 = var1 & 15;
         var3 = var1 >> 8 & 127;
         this.b(var2, var3);
      } else {
         ea var4;
         int var5;
         int var6;
         ek var8;
         label226: {
            if (var2 == 144) {
               var2 = var1 & 15;
               var3 = var1 >> 8 & 127;
               if ((var1 = var1 >> 16 & 127) <= 0) {
                  this.b(var2, var3);
                  return;
               }

               var6 = var1;
               var1 = var3;
               var5 = var2;
               var4 = this;
               this.b(var2, var3);
               if ((this.i[var2] & 2) == 0) {
                  break label226;
               }

               var8 = (ek)fU.c(this.F.c);

               while(true) {
                  if (var8 == null) {
                     break label226;
                  }

                  if (var8.j == var5 && var8.n < 0) {
                     var4.E[var5][var8.o] = null;
                     var4.E[var5][var3] = var8;
                     var3 = (var8.b * var8.f >> 12) + var8.p;
                     var8.p += var1 - var8.o << 8;
                     var8.f = var3 - var8.p;
                     var8.b = 4096;
                     var8.o = var1;
                     break;
                  }

                  var8 = (ek)var4.F.c.b();
               }
            } else if (var2 != 160) {
               if (var2 == 176) {
                  var2 = var1 & 15;
                  var3 = var1 >> 8 & 127;
                  var1 = var1 >> 16 & 127;
                  if (var3 == 0) {
                     this.o[var2] = (var1 << 14) + (this.o[var2] & -2080769);
                  }

                  if (var3 == 32) {
                     this.o[var2] = (var1 << 7) + (this.o[var2] & -16257);
                  }

                  if (var3 == 1) {
                     this.m[var2] = (var1 << 7) + (this.m[var2] & -16257);
                  }

                  if (var3 == 33) {
                     this.m[var2] = var1 + (this.m[var2] & -128);
                  }

                  if (var3 == 5) {
                     this.u[var2] = (var1 << 7) + (this.u[var2] & -16257);
                  }

                  if (var3 == 37) {
                     this.u[var2] = var1 + (this.u[var2] & -128);
                  }

                  if (var3 == 7) {
                     this.e[var2] = (var1 << 7) + (this.e[var2] & -16257);
                  }

                  if (var3 == 39) {
                     this.e[var2] = var1 + (this.e[var2] & -128);
                  }

                  if (var3 == 10) {
                     this.h[var2] = (var1 << 7) + (this.h[var2] & -16257);
                  }

                  if (var3 == 42) {
                     this.h[var2] = var1 + (this.h[var2] & -128);
                  }

                  if (var3 == 11) {
                     this.v[var2] = (var1 << 7) + (this.v[var2] & -16257);
                  }

                  if (var3 == 43) {
                     this.v[var2] = var1 + (this.v[var2] & -128);
                  }

                  int[] var10000;
                  if (var3 == 64) {
                     if (var1 >= 64) {
                        var10000 = this.i;
                        var10000[var2] |= 1;
                     } else {
                        var10000 = this.i;
                        var10000[var2] &= -2;
                     }
                  }

                  if (var3 == 65) {
                     if (var1 >= 64) {
                        var10000 = this.i;
                        var10000[var2] |= 2;
                     } else {
                        this.c(var2);
                        var10000 = this.i;
                        var10000[var2] &= -3;
                     }
                  }

                  if (var3 == 99) {
                     this.x[var2] = (var1 << 7) + (this.x[var2] & 127);
                  }

                  int[] var10002;
                  if (var3 == 98) {
                     var10002 = this.x;
                     var10002[var2] = (var10002[var2] & 16256) + var1;
                  }

                  if (var3 == 101) {
                     this.x[var2] = (var1 << 7) + (this.x[var2] & 127) + 16384;
                  }

                  if (var3 == 100) {
                     var10002 = this.x;
                     var10002[var2] = (var10002[var2] & 16256) + var1 + 16384;
                  }

                  if (var3 == 120) {
                     b(this, var2);
                  }

                  if (var3 == 121) {
                     c(this, var2);
                  }

                  if (var3 == 123) {
                     var5 = var2;
                     var4 = this;

                     for(ek var11 = (ek)fU.e(this.F.c); var11 != null; var11 = (ek)fU.b(var4.F.c)) {
                        if ((var5 < 0 || var11.j == var5) && var11.n < 0) {
                           var4.E[var11.j][var11.o] = null;
                           var11.n = 0;
                        }
                     }
                  }

                  if (var3 == 6 && this.x[var2] == 16384) {
                     this.A[var2] = (var1 << 7) + (this.A[var2] & -16257);
                  }

                  if (var3 == 38 && this.x[var2] == 16384) {
                     this.A[var2] = var1 + (this.A[var2] & -128);
                  }

                  if (var3 == 16) {
                     this.j[var2] = (var1 << 7) + (this.j[var2] & -16257);
                  }

                  if (var3 == 48) {
                     this.j[var2] = var1 + (this.j[var2] & -128);
                  }

                  if (var3 == 81) {
                     if (var1 >= 64) {
                        var10000 = this.i;
                        var10000[var2] |= 4;
                     } else {
                        this.e(var2);
                        var10000 = this.i;
                        var10000[var2] &= -5;
                     }
                  }

                  if (var3 == 17) {
                     a(this, var2, (var1 << 7) + (this.w[var2] & -16257));
                  }

                  if (var3 == 49) {
                     a(this, var2, var1 + (this.w[var2] & -128));
                     return;
                  }
               } else {
                  if (var2 == 192) {
                     var2 = var1 & 15;
                     var3 = var1 >> 8 & 127;
                     this.a(var2, var3 + this.o[var2]);
                     return;
                  }

                  if (var2 != 208) {
                     if (var2 == 224) {
                        var2 = var1 & 15;
                        var3 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
                        this.B[var2] = var3;
                        return;
                     }

                     if ((var2 = var1 & 255) == 255) {
                        this.i();
                     }
                  }
               }
            }

            return;
         }

         eE var9;
         kl var10;
         if ((var9 = (eE)gb.a(var4.y, (long)var4.z[var5])) != null && var9.j[var3] != null && (var10 = osrs.z.b(var9.j[var3], (byte)-88)) != null) {
            ek var7;
            (var7 = new ek()).j = var5;
            var7.m = var9;
            var7.h = var10;
            var7.k = var9.b[var1];
            var7.q = var9.i[var1] * 624432751;
            var7.o = var1;
            var7.e = var6 * var6 * var9.h[var1] * var9.g + 1024 >> 11;
            var7.t = var9.c[var1] & 255;
            var7.p = (var1 << 8) - (var9.f[var1] & 32767);
            var7.g = 0;
            var7.r = 0;
            var7.c = 0;
            var7.n = -1;
            var7.l = 0;
            if (var4.j[var5] == 0) {
               var7.s = osrs.o.a(var10, var4.c(var7), a(var4, var7, -772434331), var4.b(var7));
            } else {
               var7.s = osrs.o.a(var10, var4.c(var7), 0, var4.b(var7));
               var4.a(var7, var9.f[var1] < 0);
            }

            if (var9.f[var1] < 0) {
               var7.s.f(-1);
            }

            if (var7.q * 378013839 >= 0) {
               if ((var8 = var4.J[var5][var7.q * 378013839]) != null && var8.n < 0) {
                  var4.E[var5][var8.o] = null;
                  var8.n = 0;
               }

               var4.J[var5][var7.q * 378013839] = var7;
            }

            fU.a((fU)var4.F.c, var7);
            var4.E[var5][var1] = var7;
         }

      }
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "(Lne;[IIII)Z",
      garbageValue = "1318605471"
   )
   final boolean a(ek var1, int[] var2, int var3, int var4) {
      var1.a = osrs.B.a / 100 * 92989565;
      o var5;
      if (var1.n < 0 || var1.s != null && (var5 = var1.s).a >= 0 && var5.a < ((kl)var5.s).d.length << 8) {
         int var10;
         if ((var10 = var1.b) > 0) {
            if ((var10 -= (int)(16.0D * Math.pow(2.0D, (double)this.u[var1.j] * 4.921259842519685E-4D) + 0.5D)) < 0) {
               var10 = 0;
            }

            var1.b = var10;
         }

         var1.s.d(this.c(var1));
         eb var11 = var1.k;
         boolean var6 = false;
         ++var1.i;
         var1.u += var11.h;
         double var8 = 5.086263020833333E-6D * (double)((var1.o - 60 << 8) + (var1.f * var1.b >> 12));
         if (var11.f > 0) {
            if (var11.a > 0) {
               var1.g += (int)(128.0D * Math.pow(2.0D, var8 * (double)var11.a) + 0.5D);
            } else {
               var1.g += 128;
            }
         }

         if (var11.i != null) {
            if (var11.c > 0) {
               var1.r += (int)(128.0D * Math.pow(2.0D, (double)var11.c * var8) + 0.5D);
            } else {
               var1.r += 128;
            }

            while(var1.c < var11.i.length - 2 && var1.r > (var11.i[var1.c + 2] & 255) << 8) {
               var1.c += 2;
            }

            if (var11.i.length - 2 == var1.c && var11.i[var1.c + 1] == 0) {
               var6 = true;
            }
         }

         if (var1.n >= 0 && var11.e != null && (this.i[var1.j] & 1) == 0 && (var1.q * 378013839 < 0 || this.J[var1.j][var1.q * 378013839] != var1)) {
            if (var11.d > 0) {
               var1.n += (int)(128.0D * Math.pow(2.0D, var8 * (double)var11.d) + 0.5D);
            } else {
               var1.n += 128;
            }

            while(var1.l < var11.e.length - 2 && var1.n > (var11.e[var1.l + 2] & 255) << 8) {
               var1.l += 2;
            }

            if (var11.e.length - 2 == var1.l) {
               var6 = true;
            }
         }

         if (var6) {
            var1.s.c(var1.a * -1638674219);
            if (var2 != null) {
               var1.s.a(var2, var3, var4);
            } else {
               var1.s.a(var4);
            }

            if (osrs.o.a(var1.s)) {
               this.F.b.a((jX)var1.s);
            }

            var1.a();
            if (var1.n >= 0) {
               gk.a(var1);
               if (var1.q * 378013839 > 0 && this.J[var1.j][var1.q * 378013839] == var1) {
                  this.J[var1.j][var1.q * 378013839] = null;
               }
            }

            return true;
         } else {
            var1.s.a(var1.a * -1638674219, a(this, var1, 88678770), this.b(var1));
            return false;
         }
      } else {
         var1.a();
         gk.a(var1);
         if (var1.q * 378013839 > 0 && this.J[var1.j][var1.q * 378013839] == var1) {
            this.J[var1.j][var1.q * 378013839] = null;
         }

         return true;
      }
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "7"
   )
   private void e(int var1) {
      if ((this.i[var1] & 4) != 0) {
         for(ek var2 = (ek)fU.e(this.F.c); var2 != null; var2 = (ek)fU.b(this.F.c)) {
            if (var2.j == var1) {
               var2.d = 0;
            }
         }
      }

   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-378931642"
   )
   private void i() {
      b(this, -1);
      c(this, -1);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.z[var1] = this.l[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.o[var1] = this.l[var1] & -128;
      }

   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "(Lne;I)I",
      garbageValue = "-1847913563"
   )
   private int c(ek var1) {
      int var2 = (var1.b * var1.f >> 12) + var1.p + ((this.B[var1.j] - 8192) * this.A[var1.j] >> 12);
      eb var3;
      int var4;
      if ((var3 = var1.k).h > 0 && (var3.g > 0 || this.m[var1.j] > 0)) {
         var4 = var3.g << 2;
         int var8 = var3.b << 1;
         if (var1.i < var8) {
            var4 = var4 * var1.i / var8;
         }

         var4 += this.m[var1.j] >> 7;
         double var6 = Math.sin((double)(var1.u & 511) * 0.01227184630308513D);
         var2 += (int)(var6 * (double)var4);
      }

      return (var4 = (int)((double)(var1.h.g << 8) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)osrs.B.a + 0.5D)) <= 0 ? 1 : var4;
   }

   @ObfuscatedName("bx")
   protected final void a(int[] var1, int var2, int var3) {
      if (dI.a(this.I)) {
         int var4 = this.I.e * this.t * 786158161 / osrs.B.a;

         do {
            long var5 = (long)var4 * (long)var3 + this.D;
            if (this.K - var5 >= 0L) {
               this.D = var5;
               break;
            }

            int var7 = (int)(((long)var4 + (this.K - this.D) - 1L) / (long)var4);
            this.D += (long)var4 * (long)var7;
            this.F.a(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.j();
         } while(dI.a(this.I));
      }

      this.F.a(var1, var2, var3);
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "(Lne;B)Z",
      garbageValue = "6"
   )
   final boolean a(ek var1) {
      if (var1.s == null) {
         if (var1.n >= 0) {
            gk.a(var1);
            if (var1.q * 378013839 > 0 && this.J[var1.j][var1.q * 378013839] == var1) {
               this.J[var1.j][var1.q * 378013839] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "31"
   )
   private void j() {
      int var1 = this.C;
      int var2 = this.H;

      long var3;
      for(var3 = this.K; var2 == this.H; var3 = this.I.e(var2)) {
         while(var2 == this.I.d[var1]) {
            this.I.c(var1);
            int var5;
            if ((var5 = this.I.b(var1)) == 1) {
               jh.a(this.I);
               this.I.a(var1);
               if (this.I.b()) {
                  if (!this.G || var2 == 0) {
                     this.i();
                     this.I.c();
                     return;
                  }

                  this.I.a(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.d(var5);
            }

            this.I.d(var1);
            this.I.a(var1);
         }

         var1 = dI.b(this.I);
         var2 = this.I.d[var1];
      }

      this.C = var1;
      this.H = var2;
      this.K = var3;
   }

   @ObfuscatedName("zv")
   @ObfuscatedSignature(
      signature = "(Lmt;Lnh;ZI)V"
   )
   public static void a(ea var0, en var1, boolean var2, int var3) {
      if (var0 == null) {
         boolean var5 = var2;
         en var14 = var1;
         ea var4 = var0;
         synchronized(var0.n) {
            int var8 = 354234421;
            ea var7 = var4;
            synchronized(var4.n) {
               var7.k = 354234421;
            }

            var4.I.a(var14.a);
            var4.G = var5;
            var4.D = 0L;
            var3 = var4.I.f.length;

            dI var16;
            for(int var15 = 0; var15 < var3; ++var15) {
               (var16 = var4.I).f[var15] = var16.a.c;
               var4.I.a(var15);
               var4.I.c(var15);
            }

            var4.t = dI.b(var4.I);
            var4.H = var4.I.g[var4.t];
            dI var10001 = var4.I;
            var8 = var4.C * 28939763;
            var16 = var10001;
            var4.K = var10001.b + (long)var8 * (long)var16.c;
         }
      }

      synchronized(var0.n) {
         var0.d();
         var0.I.a(var1.a);
         var0.G = var2;
         var0.D = 0L;
         int var12 = var0.I.f.length;

         for(int var13 = 0; var13 < var12; ++var13) {
            var0.I.c(var13);
            var0.I.d(var13);
            var0.I.a(var13);
         }

         var0.C = dI.b(var0.I);
         var0.H = var0.I.d[var0.C];
         var0.K = var0.I.e(var0.H);
      }
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      signature = "(Lmt;II)V",
      garbageValue = "-686845012"
   )
   private static void b(ea var0, int var1) {
      for(ek var2 = (ek)fU.e(var0.F.c); var2 != null; var2 = (ek)fU.b(var0.F.c)) {
         if (var1 < 0 || var2.j == var1) {
            if (var2.s != null) {
               var2.s.c(osrs.B.a / 100);
               if (osrs.o.a(var2.s)) {
                  var0.F.b.a((jX)var2.s);
               }

               var2.a();
            }

            if (var2.n < 0) {
               var0.E[var2.j][var2.o] = null;
            }

            gk.a(var2);
         }
      }

   }

   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      signature = "(Lmt;II)V",
      garbageValue = "-619581226"
   )
   private static void c(ea var0, int var1) {
      if (var1 >= 0) {
         var0.e[var1] = 12800;
         var0.h[var1] = 8192;
         var0.v[var1] = 16383;
         var0.B[var1] = 8192;
         var0.m[var1] = 0;
         var0.u[var1] = 8192;
         var0.c(var1);
         var0.e(var1);
         var0.i[var1] = 0;
         var0.x[var1] = 32767;
         var0.A[var1] = 256;
         var0.j[var1] = 0;
         a((ea)var0, var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            c(var0, var1);
         }

      }
   }

   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      signature = "(Lmt;I)Z"
   )
   public static boolean a(ea var0, int var1) {
      if (var0 == null) {
         return var0.h();
      } else {
         synchronized(var0.n) {
            return var0.y.b() > 0;
         }
      }
   }

   @ObfuscatedName("sy")
   @ObfuscatedSignature(
      signature = "(Lmt;Lne;I)I"
   )
   private static int a(ea var0, ek var1, int var2) {
      eb var8 = var1.k;
      int var3 = (((var3 = var0.v[var1.j] * var0.e[var1.j] + 4096 >> 13) * var3 + 16384 >> 15) * var1.e + 16384 >> 15) * var0.k + 128 >> 8;
      if (var8.f > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5D, (double)var8.f * (double)var1.g * 1.953125E-5D) + 0.5D);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (var8.i != null) {
         var7 = var1.r;
         var4 = var8.i[var1.c + 1];
         if (var1.c < var8.i.length - 2) {
            var5 = (var8.i[var1.c] & 255) << 8;
            var6 = (var8.i[var1.c + 2] & 255) << 8;
            var4 += (var7 - var5) * (var8.i[var1.c + 3] - var4) / (var6 - var5);
         }

         var3 = var3 * var4 + 32 >> 6;
      }

      if (var1.n > 0 && var8.e != null) {
         var7 = var1.n;
         var4 = var8.e[var1.l + 1];
         if (var1.l < var8.e.length - 2) {
            var5 = (var8.e[var1.l] & 255) << 8;
            var6 = (var8.e[var1.l + 2] & 255) << 8;
            var4 += (var8.e[var1.l + 3] - var4) * (var7 - var5) / (var6 - var5);
         }

         var3 = var3 * var4 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedName("tb")
   @ObfuscatedSignature(
      signature = "(Lmt;III)V",
      garbageValue = "825335636"
   )
   private static void a(ea var0, int var1, int var2) {
      if (var0 == null) {
         var0.c(var1, var1);
      } else {
         var0.w[var1] = var2;
         var0.g[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
      }
   }

   @ObfuscatedName("ut")
   @ObfuscatedSignature(
      signature = "(Lmt;B)V"
   )
   public static void a(ea var0, byte var1) {
      eE var2;
      if (var0 == null) {
         synchronized((var0 = var0).n) {
            for(var2 = (eE)var0.y.a(); var2 != null; var2 = (eE)var0.y.a()) {
               var2.d = null;
            }

         }
      } else {
         synchronized(var0.n) {
            for(var2 = (eE)var0.y.a(); var2 != null; var2 = (eE)var0.y.c()) {
               var2.d = null;
            }

         }
      }
   }
}
