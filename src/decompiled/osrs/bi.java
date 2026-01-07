package osrs;

import net.runelite.api.SpritePixels;
import net.runelite.api.worldmap.MapElementConfig;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public final class bi extends im implements MapElementConfig {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   public static fE a;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "[Lhm;"
   )
   public static bi[] b;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   public static dX c = new dX(256);
   @ObfuscatedName("lr")
   @ObfuscatedGetter(
      intValue = 1725421633
   )
   static int d;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -212662327
   )
   public int e = -1;
   @ObfuscatedName("ab")
   byte[] f;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1215653805
   )
   public final int g;
   @ObfuscatedName("ad")
   public boolean h = false;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1700837237
   )
   int i = Integer.MAX_VALUE;
   @ObfuscatedName("af")
   public String[] j = new String[5];
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1537906121
   )
   public int k;
   @ObfuscatedName("ah")
   public String l;
   @ObfuscatedName("ak")
   public String m;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1435476333
   )
   int n = Integer.MIN_VALUE;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   public bt o;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1829003601
   )
   public int p;
   @ObfuscatedName("ar")
   public boolean q = true;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "Lhr;"
   )
   public bn r;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1638886259
   )
   int s = Integer.MAX_VALUE;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 568360745
   )
   public int t = 0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1034414593
   )
   int u = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1156012941
   )
   int v = Integer.MIN_VALUE;
   @ObfuscatedName("ax")
   int[] w;
   @ObfuscatedName("az")
   int[] x;

   public bi(int var1) {
      this.o = bt.a;
      this.r = bn.a;
      this.p = -1;
      this.g = var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(ZI)Lwd;",
      garbageValue = "-65145515"
   )
   public final iT a(boolean var1) {
      int var3;
      if ((var3 = var1 ? this.u : this.e) < 0) {
         return null;
      } else {
         iT var2;
         if ((var2 = (iT)dX.a(c, (long)var3)) == null && (var2 = hn.a(a, var3, 0)) != null) {
            c.a((im)var2, (long)var3);
         }

         return var2;
      }
   }

   public final int getCategory() {
      return this.p;
   }

   public final SpritePixels getMapIcon(boolean var1) {
      return this.a(var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(CB)Z",
      garbageValue = "101"
   )
   static final boolean a(char var0) {
      if (Character.isISOControl(var0)) {
         return false;
      } else if (osrs.r.a(var0)) {
         return true;
      } else {
         char[] var1 = iM.b;

         int var2;
         char var3;
         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if (var0 == var3) {
               return true;
            }
         }

         var1 = iM.a;

         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if (var0 == var3) {
               return true;
            }
         }

         return false;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)J",
      garbageValue = "1831596672"
   )
   static long a(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         var1 *= 37L;
         char var5;
         if ((var5 = var0.charAt(var4)) >= 'A' && var5 <= 'Z') {
            var1 += (long)(var5 + 1 - 65);
         } else if (var5 >= 'a' && var5 <= 'z') {
            var1 += (long)(var5 + 1 - 97);
         } else if (var5 >= '0' && var5 <= '9') {
            var1 += (long)(var5 + 27 - 48);
         }

         if (var1 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var1 % 37L && var1 != 0L) {
         var1 /= 37L;
      }

      return var1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-57"
   )
   static int a(int var0, int var1) {
      bE var3;
      if ((var3 = eP.a(var0)) == null) {
         return var1;
      } else {
         int var2;
         if (var3.d >= 0) {
            var1 = var3.e;
            var2 = var3.k;
            if ((var0 = var3.j) > 179) {
               var2 /= 2;
            }

            if (var0 > 192) {
               var2 /= 2;
            }

            if (var0 > 217) {
               var2 /= 2;
            }

            if (var0 > 243) {
               var2 /= 2;
            }

            var0 = Y.a((var2 / 32 << 7) + var0 / 2 + (var1 / 4 << 10), 96);
            return cc.e[var0] | -16777216;
         } else if (var3.g >= 0) {
            var0 = Y.a(cc.d.a.a(var3.g), 96);
            return cc.e[var0] | -16777216;
         } else if (var3.i == 16711935) {
            return var1;
         } else {
            var1 = var3.c;
            var2 = var3.h;
            if ((var0 = var3.f) > 179) {
               var2 /= 2;
            }

            if (var0 > 192) {
               var2 /= 2;
            }

            if (var0 > 217) {
               var2 /= 2;
            }

            if (var0 > 243) {
               var2 /= 2;
            }

            var0 = Y.a((var2 / 32 << 7) + var0 / 2 + (var1 / 4 << 10), 96);
            return cc.e[var0] | -16777216;
         }
      }
   }

   @ObfuscatedName("nf")
   @ObfuscatedSignature(
      signature = "(IIIILwd;Lnr;I)V",
      garbageValue = "-681344111"
   )
   static final void a(int var0, int var1, int var2, int var3, iT var4, ey var5, boolean var6) {
      int var7;
      if ((var7 = var3 * var3 + var2 * var2) <= 4225 || var7 >= 90000 && !var6) {
         fb.a(var0, var1, var2, var3, var4, var5);
      } else {
         int var15 = client.cd & 2047;
         int var16 = cc.b[var15];
         var7 = (var15 = cc.a[var15]) * var2 + var3 * var16 >> 16;
         var2 = var3 * var15 - var16 * var2 >> 16;
         double var13 = Math.atan2((double)var7, (double)var2);
         var2 = var5.d / 2 - 25;
         var3 = (int)(Math.sin(var13) * (double)var2);
         var2 = (int)(Math.cos(var13) * (double)var2);
         osrs.n.c.a(var3 + (var0 + var5.d / 2 - 20 / 2), var5.b / 2 + var1 - 20 / 2 - var2 - 10, 20, 20, 15, 15, var13, 256);
      }
   }
}
