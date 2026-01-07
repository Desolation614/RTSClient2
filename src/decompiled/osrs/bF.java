package osrs;

import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public final class bF {
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = 1877000185
   )
   static int a;
   @ObfuscatedName("aj")
   public float[] b;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Leo;"
   )
   public G c;
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   private bO d;

   @ObfuscatedSignature(
      signature = "(Lio;)V"
   )
   bF(bO var1) {
      this.d = var1;
      this.b = new float[4];
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Ltp;Ljava/lang/Object;IIB)V",
      garbageValue = "-95"
   )
   public static void a(hD var0, Object var1, int var2, int var3) {
      gl.a(var0, (iv)null, true);
      if (var2 < 0) {
         var2 = 0;
      }

      int var4 = var3 + var2;
      if (var3 < 0 || var4 < 0 || var4 > var0.c * 935110769) {
         var4 = var0.c * 935110769;
      }

      if (var0.d == iv.c) {
         Arrays.fill(var0.a, var2, var4, (Integer)var1);
      } else if (var0.d == iv.a) {
         Arrays.fill(var0.f, var2, var4, (Long)var1);
      } else {
         Arrays.fill(var0.b, var2, var4, var1);
      }
   }
}
