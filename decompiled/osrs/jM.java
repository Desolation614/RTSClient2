package osrs;

import net.runelite.api.Animation;
import net.runelite.api.DynamicObject;
import net.runelite.api.Model;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
public final class jM extends ct implements DynamicObject {
   @ObfuscatedName("as")
   static String[] a;
   @ObfuscatedName("zv")
   public int b = -1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1367261069
   )
   private int f;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 632029471
   )
   private int g;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1477283285
   )
   private int h;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1584539933
   )
   private int i;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1850328327
   )
   private int j;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1171399541
   )
   private int k;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1610359691
   )
   private int l;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   private bP m;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1330516337
   )
   private int n;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Ldl;"
   )
   private kd o;
   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      signature = "Ljg;"
   )
   public ci c;
   @ObfuscatedName("mb")
   public int d;
   @ObfuscatedName("ww")
   public boolean e;

   @ObfuscatedSignature(
      signature = "(Ldl;IIIIIIIZLjr;)V"
   )
   jM(kd var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, ct var10) {
      this.c = var1.o;
      this.o = var1;
      this.k = var2;
      this.n = var3;
      this.j = var4;
      this.l = var5;
      this.g = var6;
      this.f = var7;
      if (var8 != -1) {
         this.m = az.a(var8);
         this.h = 0;
         this.i = client.Z - 1;
         jM var11;
         if (this.m.w == 0 && var10 instanceof jM && (var11 = (jM)var10).m == this.m) {
            this.h = var11.h;
            this.i = var11.i;
            return;
         }

         if (var9 && this.m.k != -1) {
            if (!this.m.b()) {
               this.h = (int)(Math.random() * (double)this.m.p.length);
               this.i -= (int)(Math.random() * (double)this.m.i[this.h]);
               return;
            }

            this.h = (int)(Math.random() * (double)this.m.a());
         }
      }

   }

   @ObfuscatedName("zs")
   @ObfuscatedSignature(
      signature = "(Lik;)Lik;"
   )
   private bJ a(bJ var1) {
      if (this.b == -1) {
         return null;
      } else {
         int var2 = -1;
         if (var1.t != -1) {
            var2 = client.c(var1.t, this.d);
         } else if (var1.K != -1) {
            var2 = this.d;
         }

         int var3;
         if (var2 >= 0 && var2 < var1.v.length - 1) {
            var3 = var1.v[var2];
         } else {
            var3 = var1.v[var1.v.length - 1];
         }

         return var3 != -1 ? bJ.c(var3) : null;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)Ljm;",
      garbageValue = "27"
   )
   protected final cn k() {
      if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         bJ var1;
         if ((var1 = bJ.c(this.k)).v != null) {
            var1 = bJ.b(var1, (byte)0);
         }

         if (var1 == null) {
            return null;
         } else {
            int var2;
            int var3;
            if (this.j != 1 && this.j != 3) {
               var2 = var1.q * -1313509743;
               var3 = var1.o;
            } else {
               var2 = var1.o;
               var3 = var1.q * -1313509743;
            }

            int var4 = (this.g << 7) + (var2 << 6);
            int var5 = (this.f << 7) + (var3 << 6);
            int var6;
            int var7;
            if (this.m != null) {
               var6 = client.Z - this.i;
               if (this.m.k > 0 && this.m.o * -153191873 > 0) {
                  var6 %= this.m.o * -153191873;
               }

               if (this.m.isMayaAnim()) {
                  var7 = this.m.a();
                  this.h += var6;
                  var6 = 0;
                  if (this.h >= var7) {
                     this.h = var7 - this.m.k;
                     if (this.h < 0 || this.h > var7) {
                        this.m = null;
                     }
                  }

                  if (this.m != null) {
                     client.a(this.o, this.m, this.h, var4, var5, false);
                  }
               } else {
                  for(; var6 > this.m.i[this.h]; client.a(this.o, this.m, this.h, var4, var5, false)) {
                     var6 -= this.m.i[this.h];
                     ++this.h;
                     if (this.h >= this.m.p.length) {
                        this.h -= this.m.k;
                        if (this.h < 0 || this.h >= this.m.p.length) {
                           this.m = null;
                           break;
                        }
                     }
                  }
               }

               this.i = client.Z - var6;
            }

            var6 = this.c.e + this.g;
            var7 = this.c.e + this.f;
            var4 = var6 + (var2 >> 1);
            var5 = var6 + (var2 + 1 >> 1);
            int var8 = var7 + (var3 >> 1);
            int var9 = var7 + (var3 + 1 >> 1);
            int[][] var10;
            var4 = (var10 = this.c.t[this.l])[var4][var9] + var10[var4][var8] + var10[var5][var8] + var10[var5][var9] >> 2;
            var2 = (var6 << 7) + (var2 << 6);
            var3 = (var7 << 7) + (var3 << 6);
            if (client.D != null && this.m != null && client.D.test(this.m.z * -1796589521)) {
               var5 = dF.c.getGameCycle() - this.i;
               var5 = Integer.MIN_VALUE | Math.max(var5 - 1, 0) << 16 | this.h;
            } else {
               var5 = this.h;
            }

            var9 = var5;
            bP var40 = this.m;
            var7 = var3;
            var5 = var2;
            var3 = this.j;
            var2 = this.n;
            long var36;
            if (var1.j == null) {
               var36 = (long)((var1.k << 10) + var3);
            } else {
               var36 = (long)((var1.k << 10) + var3 + (var2 << 3));
            }

            cn var41;
            if ((var41 = (cn)dX.a(bJ.b, var36)) == null) {
               class243 var38;
               if ((var38 = var1.a(var2, var3)) == null) {
                  return null;
               }

               var41 = var38.a(var1.u + 64, var1.x + 768, -50, -10, -50);
               bJ.b.a((im)var41, var36);
            }

            if (var40 != null || var1.H != -1) {
               if (var40 != null) {
                  var41 = var40.a(var41, var9, var3);
               } else {
                  var41 = cn.a(var41, true);
               }

               if (var1.H >= 0) {
                  var41 = var41.a(var10, var5, var4, var7, false, var1.H);
               }
            }

            return var41;
         }
      }
   }

   @ObfuscatedName("ho")
   public final void a() {
      bJ var1;
      if ((var1 = bJ.c(this.k)).v != null) {
         if (var1.t != -1) {
            this.b = client.s(var1.t);
            this.d = ej.d[this.b];
            return;
         }

         if (var1.K != -1) {
            this.b = var1.K;
            this.d = ej.d[this.b];
         }
      }

   }

   @ObfuscatedName("ma")
   @ObfuscatedSignature(
      signature = "()Ljm;"
   )
   public final cn b() {
      if (this.m != null) {
         return null;
      } else {
         bJ var1;
         if ((var1 = bJ.c(this.k)).v != null) {
            var1 = this.a(var1);
         }

         if (var1 == null) {
            return null;
         } else {
            int var2;
            int var3;
            if (this.j != 1 && this.j != 3) {
               var2 = var1.q * -1313509743;
               var3 = var1.o;
            } else {
               var2 = var1.o;
               var3 = var1.q * -1313509743;
            }

            int var4 = this.c.e + this.g;
            int var5 = this.c.e + this.f;
            int var6 = var4 + (var2 >> 1);
            int var7 = var4 + (var2 + 1 >> 1);
            int var8 = var5 + (var3 >> 1);
            int var9 = var5 + (var3 + 1 >> 1);
            int[][] var10;
            var6 = (var10 = this.c.t[this.l])[var6][var9] + var10[var6][var8] + var10[var7][var8] + var10[var7][var9] >> 2;
            var2 = (var4 << 7) + (var2 << 6);
            var3 = (var5 << 7) + (var3 << 6);
            return var1.b(this.n, this.j, var10, var2, var6, var3);
         }
      }
   }

   @ObfuscatedName("qg")
   public final boolean c() {
      return this.m == null;
   }

   public final int getAnimCycle() {
      return this.i;
   }

   public final Animation getAnimation() {
      return this.m;
   }

   public final int getAnimFrame() {
      return this.h;
   }

   public final Model getModelZbuf() {
      return this.b();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "1296407636"
   )
   static int a(int var0, boolean var1) {
      boolean var2 = true;
      fd var6;
      if (var0 >= 2000) {
         var0 -= 1000;
         var6 = jD.a.b(hE.c[--hE.e]);
         var2 = false;
      } else {
         var6 = var1 ? ic.a : ef.a;
      }

      if (var0 == 1300) {
         if ((var0 = hE.c[--hE.e] - 1) >= 0 && var0 < 32) {
            var6.a(var0, (String)hE.n[--aU.a]);
            return 1;
         } else {
            --aU.a;
            return 1;
         }
      } else {
         int var7;
         if (var0 == 1301) {
            hE.e -= 2;
            var0 = hE.c[hE.e];
            var7 = hE.c[hE.e + 1];
            var6.aQ = eu.a(jD.a, var0, var7, (byte)124);
            return 1;
         } else if (var0 == 1302) {
            var6.aD = hE.c[--hE.e] == 1;
            return 1;
         } else if (var0 == 1303) {
            var6.aL = hE.c[--hE.e] * 1962941219;
            return 1;
         } else if (var0 == 1304) {
            var6.aw = hE.c[--hE.e];
            return 1;
         } else if (var0 == 1305) {
            var6.ac = (String)hE.n[--aU.a];
            return 1;
         } else if (var0 == 1306) {
            var6.bt = (String)hE.n[--aU.a];
            return 1;
         } else if (var0 == 1307) {
            var6.aJ = null;
            var6.ax = null;
            return 1;
         } else if (var0 == 1308) {
            var6.bV = hE.c[--hE.e] == 1;
            return 1;
         } else if (var0 == 1309) {
            --hE.e;
            return 1;
         } else if (var0 == 1310) {
            if ((var0 = hE.c[--hE.e] - 1) >= 0 && var0 <= 9 && var6.ax != null) {
               var6.ax[var0] = null;
               return 1;
            } else {
               return 1;
            }
         } else if (var0 == 1311) {
            var0 = hE.c[--hE.e] - 1;
            if ((var7 = hE.c[--hE.e] - 1) >= 0 && var7 <= 9 && var0 >= 0) {
               String var11 = (String)hE.n[--aU.a];
               if (var6.ax == null || var6.ax.length <= var7) {
                  String[][] var12 = new String[var7 + 1][];
                  if (var6.ax != null) {
                     System.arraycopy(var6.ax, 0, var12, 0, var6.ax.length);
                  }

                  var6.ax = var12;
               }

               if (var6.ax[var7] == null || var6.ax[var7].length <= var0) {
                  String[] var13 = new String[var0 + 1];
                  if (var6.ax[var7] != null) {
                     System.arraycopy(var6.ax[var7], 0, var13, 0, var6.ax[var7].length);
                  }

                  var6.ax[var7] = var13;
               }

               var6.ax[var7][var0] = var11;
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 1312) {
            if ((var0 = hE.c[--hE.e]) == -1) {
               var6.aF = -209307052;
            } else if (var0 > 0 && var0 <= 10) {
               var6.aF = (var0 - 1) * -52326763;
            }

            return 1;
         } else {
            int var3;
            byte[] var5;
            if (var0 != 1350) {
               if (var0 == 1351) {
                  hE.e -= 2;
                  var5 = new byte[]{(byte)hE.c[hE.e]};
                  byte[] var8 = new byte[]{(byte)hE.c[hE.e + 1]};
                  ap.a(var6, 10, var5, var8);
                  return 1;
               } else if (var0 == 1352) {
                  hE.e -= 3;
                  var0 = hE.c[hE.e] - 1;
                  var7 = hE.c[hE.e + 1];
                  var3 = hE.c[hE.e + 2];
                  if (var0 >= 0 && var0 <= 9) {
                     bp.a(var6, var0, var7, var3);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1353) {
                  var7 = hE.c[--hE.e];
                  var3 = hE.c[--hE.e];
                  bp.a(var6, 10, var7, var3);
                  return 1;
               } else if (var0 == 1354) {
                  --hE.e;
                  if ((var0 = hE.c[hE.e] - 1) >= 0 && var0 <= 9) {
                     aw.a(var6, var0);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1355) {
                  aw.a(var6, 10);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var4 = null;
               var5 = null;
               if (var2) {
                  hE.e -= 10;

                  for(var3 = 0; var3 < 10 && hE.c[var3 + hE.e] >= 0; var3 += 2) {
                  }

                  if (var3 > 0) {
                     var4 = new byte[var3 / 2];
                     var5 = new byte[var3 / 2];

                     for(var3 -= 2; var3 >= 0; var3 -= 2) {
                        var4[var3 / 2] = (byte)hE.c[var3 + hE.e];
                        var5[var3 / 2] = (byte)hE.c[var3 + hE.e + 1];
                     }
                  }
               } else {
                  hE.e -= 2;
                  var4 = new byte[]{(byte)hE.c[hE.e]};
                  var5 = new byte[]{(byte)hE.c[hE.e + 1]};
               }

               if ((var3 = hE.c[--hE.e] - 1) >= 0 && var3 <= 9) {
                  ap.a(var6, var3, var4, var5);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }
}
