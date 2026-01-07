package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
public final class eP implements fN {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Loh;"
   )
   public static final eP a = new eP(1, 1);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Loh;"
   )
   public static final eP b = new eP(2, 2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Loh;"
   )
   public static final eP c = new eP(0, 0);
   @ObfuscatedName("hx")
   @ObfuscatedSignature(
      signature = "Lts;"
   )
   static hH d;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1995982963
   )
   private int e;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1330904487
   )
   private int f;

   private eP(int var1, int var2) {
      this.f = var1;
      this.e = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.e;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)Lif;",
      garbageValue = "-1924186663"
   )
   public static bE a(int var0) {
      bE var1;
      if ((var1 = (bE)dX.a(bE.a, (long)var0)) != null) {
         return var1;
      } else {
         byte[] var2 = fB.a(bE.b, 4, (int)var0);
         var1 = new bE();
         if (var2 != null) {
            var1.a(new jk(var2), var0);
         }

         var1.b();
         bE.a.a((im)var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Ltp;III)V",
      garbageValue = "-1023999147"
   )
   public static void a(hD var0, int var1, int var2) {
      gl.a(var0, (iv)null, true);
      if (var1 != 0) {
         if (var2 >= 0 && var2 < var0.c * 935110769 && var1 >= 0 && var2 + var1 <= var0.c * 935110769) {
            if (var2 < var0.c * 935110769 - var1) {
               aw.a(var0, var2 + var1, var0, var2, var0.c * 935110769 - (var2 + var1));
            }

            var0.c(var0.c * 935110769 - var1);
         } else {
            throw new RuntimeException();
         }
      }
   }
}
