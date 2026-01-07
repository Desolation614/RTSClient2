package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public final class aH extends ak {
   @ObfuscatedName("ap")
   private String a;
   @ObfuscatedSignature(
      signature = "Lfp;"
   )
   private ai b;

   @ObfuscatedSignature(
      signature = "(Lfp;)V"
   )
   aH(ai var1) {
      this.b = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lgu;I)V",
      garbageValue = "-1572789515"
   )
   final void a(aP var1) {
      var1.h = this.a;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-1635342078"
   )
   final void a(jk var1) {
      this.a = var1.p();
      jk.d(var1, 1687107415);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "([I[JIII)V",
      garbageValue = "-406051341"
   )
   public static void a(int[] var0, long[] var1, int var2, int var3) {
      while(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         var4 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for(int var9 = var2; var9 < var3; ++var9) {
            if (var0[var9] < (var9 & var4) + var6) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               long var12 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var12;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         a(var0, var1, var2, var5 - 1);
         var2 = var5 + 1;
         var1 = var1;
         var0 = var0;
      }

   }
}
