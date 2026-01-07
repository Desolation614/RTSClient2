package osrs;

import java.util.Arrays;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
final class fu implements Comparator {
   public final int compare(Object var1, Object var2) {
      fm var10000 = (fm)var1;
      fm var4 = (fm)var2;
      fm var3 = var10000;
      if (var10000.d < var4.d) {
         return -1;
      } else {
         return var4.d == var3.d ? 0 : 1;
      }
   }

   public final boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(Ltp;Ltp;I)V",
      garbageValue = "-1071324675"
   )
   public static void a(hD var0, hD var1) {
      if (var0 != null && var0.c * 935110769 > 1) {
         gl.a(var0, (iv)null, true);
         if (var1 != null) {
            gl.a(var1, (iv)null, true);
         }

         int var2 = var0.c * 935110769;
         if (var1 != null && var1.c * 935110769 < var2) {
            throw new RuntimeException();
         }

         if (var0.d == iv.c) {
            if (var1 == null) {
               et.a(var0.a, hy.a, 0, var2 - 1);
               return;
            }

            if (iv.c == var1.d) {
               et.a(var0.a, var1.a, 0, var2 - 1);
               return;
            }

            if (iv.a == var1.d) {
               aH.a(var0.a, var1.f, 0, var2 - 1);
               return;
            }

            hw.a(var0.a, var1.b, 0, var2 - 1);
            return;
         }

         if (var0.d == iv.a) {
            if (var1 == null) {
               Arrays.sort(var0.f, 0, var2);
               return;
            }

            if (iv.c == var1.d) {
               K.a(var0.f, var1.a, 0, var2 - 1);
               return;
            }

            if (iv.a == var1.d) {
               hp.a(var0.f, var1.f, 0, var2 - 1);
               return;
            }

            dc.a(var0.f, var1.b, 0, var2 - 1);
            return;
         }

         if (var0.d != iv.b) {
            throw new RuntimeException();
         }

         if (var1 == null) {
            Arrays.sort(var0.b, 0, var2);
            return;
         }

         if (iv.c == var1.d) {
            gD.a((String[])var0.b, var1.a, 0, var2 - 1);
            return;
         }

         if (iv.a == var1.d) {
            ho.a((String[])var0.b, var1.f, 0, var2 - 1);
            return;
         }

         cQ.a((String[])var0.b, var1.b, 0, var2 - 1);
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "15"
   )
   static void a(int var0, String var1, String var2) {
      hx.a(var0, var1, var2, (String)null);
   }
}
