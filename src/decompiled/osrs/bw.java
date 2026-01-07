package osrs;

import net.runelite.api.EnumComposition;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public final class bw extends im implements EnumComposition {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   static dX a = new dX(64);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   public static fE b;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -1618932575
   )
   static int c;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1232725907
   )
   public int d = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -311000709
   )
   public int e;
   @ObfuscatedName("ag")
   public String[] f;
   @ObfuscatedName("ah")
   public int[] g;
   @ObfuscatedName("ai")
   public char h;
   @ObfuscatedName("al")
   public String i = "null";
   @ObfuscatedName("am")
   public int[] j;
   @ObfuscatedName("an")
   public char k;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "Ltp;"
   )
   private hD l;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "Ltp;"
   )
   private hD m;

   bw() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)Ltp;",
      garbageValue = "-1741019282"
   )
   public final hD a() {
      if (this.m == null) {
         int[] var1 = this.j;
         hD var2;
         (var2 = new hD(iv.c, false)).a = var1;
         var2.c = var1.length * 1090132113;
         var2.e = var1.length;
         this.m = var2;
      }

      return this.m;
   }

   public final int[] getKeys() {
      return this.j;
   }

   public final int[] getIntVals() {
      return this.g;
   }

   public final String[] getStringVals() {
      return this.f;
   }

   public final int getIntValue(int var1) {
      int[] var2;
      if ((var2 = this.getKeys()) == null) {
         return this.e;
      } else {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] == var1) {
               return this.getIntVals()[var3];
            }
         }

         return this.e;
      }
   }

   public final String getStringValue(int var1) {
      int[] var2;
      if ((var2 = this.getKeys()) == null) {
         return this.i;
      } else {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] == var1) {
               return this.getStringVals()[var3];
            }
         }

         return this.i;
      }
   }

   public final int size() {
      return this.d;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lps;Lps;II)Z",
      garbageValue = "-714407408"
   )
   public static boolean a(fB var0, fB var1, int var2) {
      byte[] var3;
      if ((var3 = var0.a(var2 >> 16 & '\uffff', var2 & '\uffff')) == null) {
         return false;
      } else {
         int var4 = (var3[1] & 255) << 8 | var3[2] & 255;
         return var1.a(var4, 0) != null;
      }
   }

   @ObfuscatedName("xy")
   @ObfuscatedSignature(
      signature = "(Lhy;I)Ltp;"
   )
   public static hD a(bw var0, int var1) {
      hD var2;
      int[] var3;
      if (var0 == null) {
         if (var0.l == null) {
            if (var0.h == 's') {
               var0.l = iu.a(var0.f);
            } else {
               var3 = var0.g;
               (var2 = new hD(iv.a, false)).a = var3;
               var2.c = var3.length * 1090132113;
               var2.e = var3.length;
               var0.m = var2;
            }
         }

         return var0.m;
      } else {
         if (var0.l == null) {
            if (var0.h == 's') {
               var0.l = iu.a(var0.f);
            } else {
               var3 = var0.g;
               (var2 = new hD(iv.c, false)).a = var3;
               var2.c = var3.length * 1090132113;
               var2.e = var3.length;
               var0.l = var2;
            }
         }

         return var0.l;
      }
   }
}
