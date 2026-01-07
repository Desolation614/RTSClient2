package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
public final class fb {
   @ObfuscatedName("nc")
   @ObfuscatedSignature(
      signature = "(IIIILwd;Lnr;I)V",
      garbageValue = "1326736334"
   )
   static final void a(int var0, int var1, int var2, int var3, iT var4, ey var5) {
      try {
         if (var4 != null) {
            int var6 = client.cd & 2047;
            int var7;
            if ((var7 = var2 * var2 + var3 * var3) <= 6400) {
               int var8 = cc.b[var6];
               var6 = cc.a[var6];
               int var9 = var3 * var8 + var2 * var6 >> 16;
               var2 = var3 * var6 - var2 * var8 >> 16;
               if (var7 > 2500) {
                  var4.a(var5.d / 2 + var9 - var4.g / 2, var5.b / 2 - var2 - var4.f / 2, var0, var1, var5.d, var5.b, var5.a, var5.c);
                  return;
               }

               var4.a(var5.d / 2 + var0 + var9 - var4.g / 2, var5.b / 2 + var1 - var2 - var4.f / 2);
            }
         }

      } catch (Exception var10) {
      }
   }
}
