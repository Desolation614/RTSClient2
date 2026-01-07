package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
public final class gK extends RuntimeException {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1183707887"
   )
   static int a(int var0, int var1) {
      jP var4;
      if ((var4 = (jP)gb.a(jP.a, (long)var0)) == null) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < var4.c.length; ++var3) {
            if (var4.b[var3] == var1) {
               var2 += var4.c[var3];
            }
         }

         return var2;
      }
   }
}
