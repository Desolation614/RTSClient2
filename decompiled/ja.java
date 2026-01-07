package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wj")
public final class ja {
   @ObfuscatedName("aj")
   short[] a = new short[8];
   @ObfuscatedName("ap")
   int[] b = new int[8];

   @ObfuscatedSignature(
      signature = "(Lhd;)V"
   )
   public ja(aY var1) {
      int var2 = 0;
      if (var1.I != null && var1.F != null) {
         var2 = var1.I.length;
         System.arraycopy(var1.I, 0, this.b, 0, var2);
         System.arraycopy(var1.F, 0, this.a, 0, var2);
      }

      for(int var4 = var2; var4 < 8; ++var4) {
         this.b[var4] = -1;
         this.a[var4] = -1;
      }

   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      signature = "(Lwj;B)[I"
   )
   public static int[] a(ja var0, byte var1) {
      if (var0 == null) {
         int[] var10000 = var0.b;
      }

      return var0.b;
   }
}
