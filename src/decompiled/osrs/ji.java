package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public final class ji implements fN {
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "Lch;"
   )
   static final ji a = new ji(6, 21);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lch;"
   )
   static final ji b = new ji(5, 6);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lch;"
   )
   static final ji c = new ji(3, 4);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lch;"
   )
   static final ji d = new ji(1, 2);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lch;"
   )
   static final ji e = new ji(4, 5);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lch;"
   )
   static final ji f = new ji(2, 3);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lch;"
   )
   static final ji g = new ji(0, -1);
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -312746233
   )
   private int i;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 960264871
   )
   final int h;

   private ji(int var1, int var2) {
      this.h = var1;
      this.i = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.i;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(IIIIIZI)Lwd;",
      garbageValue = "-1467311986"
   )
   public static final iT a(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0;
      iT var8;
      if (!var5 && (var8 = (iT)dX.a(bC.c, var6)) != null) {
         return var8;
      } else {
         bC var18 = cE.a(var0);
         if (var1 > 1 && var18.z != null) {
            int var9 = -1;

            for(int var10 = 0; var10 < 10; ++var10) {
               if (var1 >= var18.E[var10] && var18.E[var10] != 0) {
                  var9 = var18.z[var10];
               }
            }

            if (var9 != -1) {
               var18 = cE.a(var9);
            }
         }

         cn var19;
         if ((var19 = var18.a(1)) == null) {
            return null;
         } else {
            iT var20 = null;
            if (var18.s != -1) {
               if ((var20 = a(var18.o, 10, 1, 0, 0, true)) == null) {
                  return null;
               }
            } else if (var18.K != -1) {
               if ((var20 = a(var18.Y, var1, var2, var3, 0, false)) == null) {
                  return null;
               }
            } else if (var18.W != -1 && (var20 = a(var18.T, var1, 0, 0, 0, false)) == null) {
               return null;
            }

            int[] var11 = jd.h;
            int var12 = jd.i;
            int var13 = jd.j;
            float[] var14 = jd.o;
            int[] var15;
            jd.b(var15 = new int[4]);
            cc.a((var8 = new iT(36, 32)).b, 36, 32, (float[])null);
            jd.g();
            cc.k();
            cc.a(16, 16);
            cc.d.d = false;
            if (var18.W != -1) {
               var20.a(0, 0);
            }

            int var16 = var18.m;
            if (var5) {
               var16 = (int)(1.5D * (double)var16);
            } else if (var2 == 2) {
               var16 = (int)((double)var16 * 1.04D);
            }

            int var17 = var16 * cc.b[var18.n] >> 16;
            var16 = var16 * cc.a[var18.n] >> 16;
            var19.a();
            var19.a(0, var18.I, var18.x, var18.n, var18.u, var19.aI / 2 + var17 + var18.G, var16 + var18.G);
            if (var18.K != -1) {
               var20.a(0, 0);
            }

            if (var2 > 0) {
               iT.a(var8, 1);
            }

            if (var2 >= 2) {
               iT.a(var8, 16777215);
            }

            if (var3 != 0) {
               var8.a(var3);
            }

            cc.a(var8.b, 36, 32, (float[])null);
            if (var18.s != -1) {
               var20.a(0, 0);
            }

            if (var4 == 1 || var4 == 2 && var18.C == 1) {
               jr.b.a(gQ.a(var1), 0, 9, 16776960, 1);
            }

            if (!var5) {
               bC.c.a((im)var8, var6);
            }

            cc.a(var11, var12, var13, var14);
            jd.a(var15);
            cc.k();
            cc.d.d = true;
            return var8;
         }
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Lei;B)V",
      garbageValue = "-127"
   )
   public static final void a(bW var0) {
      bq.e = var0;
   }
}
