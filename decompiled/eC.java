package osrs;

import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public final class eC extends hR {
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      signature = "Lwy;"
   )
   static jp a;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1926703807
   )
   int b;
   @ObfuscatedName("ap")
   BitSet c;

   eC(int var1) {
      this.b = var1;
      this.c = new BitSet(128);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)Ltp;",
      garbageValue = "-1810322857"
   )
   public static hD a(String var0, String var1) {
      if (var1 != null && !var1.isEmpty()) {
         int var2 = var1.length();
         int var3 = 1;

         int var4;
         for(var4 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var4 += var2) {
            ++var3;
         }

         hD var5 = new hD(iv.b, (Object)null, var3, var3);
         int var6 = 0;
         var4 = 0;

         for(var3 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var6 = var4 += var2) {
            var5.b[var3++] = var0.substring(var6, var4);
         }

         var5.b[var3] = var0.substring(var6);
         return var5;
      } else {
         throw new RuntimeException();
      }
   }
}
