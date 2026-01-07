package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public final class au extends im {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   public static dX a = new dX(64);
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = 418528339
   )
   static int b;

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(FI)F",
      garbageValue = "-1591989896"
   )
   public static final float a(float var0) {
      return ((var0 = 750000.0F / (10000.0F - 9925.0F * var0)) - 75.0F) / 9925.0F;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)J",
      garbageValue = "-126"
   )
   public static final synchronized long a() {
      long var0;
      if ((var0 = System.currentTimeMillis()) < dT.b) {
         dT.a += dT.b - var0;
      }

      dT.b = var0;
      return dT.a + var0;
   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "-1546790714"
   )
   static final void a(int var0, int var1, int var2, int var3, boolean var4) {
      if (var4) {
         kv.a(aM.a);
      }

      if (var2 <= 0) {
         var2 = 1;
      }

      if (var3 <= 0) {
         var3 = 1;
      }

      int var5;
      double var6;
      if ((var5 = var3 - 334) < 0) {
         var6 = (double)client.aQ;
      } else if (var5 >= 100) {
         var6 = (double)client.aD;
      } else {
         var6 = (double)((client.aD - client.aQ) * var5 / 100 + client.aQ);
      }

      double var8;
      double var10;
      if ((var8 = (double)var3 * var6 * 512.0D / (double)(var2 * 334)) < (double)client.ba) {
         if ((var6 = (var8 = (double)client.ba) * (double)var2 * 334.0D / (double)(var3 << 9)) > (double)client.aF) {
            var6 = (double)client.aF;
            var10 = (double)var3 * var6 * 512.0D / (var8 * 334.0D);
            var5 = (int)(((double)var2 - var10) / 2.0D);
            if (var4) {
               cm.a();
               cm.a(var0, var1, var5, var3, -16777216);
               cm.a(var0 + var2 - var5, var1, var5, var3, -16777216);
            }

            var0 += var5;
            var2 -= var5 << 1;
         }
      } else if (var8 > (double)client.aV && (var6 = (var8 = (double)client.aV) * (double)var2 * 334.0D / (double)(var3 << 9)) < (double)client.aL) {
         var6 = (double)client.aL;
         var10 = var8 * (double)var2 * 334.0D / (var6 * 512.0D);
         var5 = (int)(((double)var3 - var10) / 2.0D);
         if (var4) {
            cm.a();
            cm.a(var0, var1, var2, var5, -16777216);
            cm.a(var0, var3 + var1 - var5, var2, var5, -16777216);
         }

         var1 += var5;
         var3 -= var5 << 1;
      }

      client.bd = (int)((double)var3 * var6 / 334.0D);
      if (var2 != client.aZ || var3 != client.bg) {
         client.d(var2, var3);
      }

      client.bb = var0;
      client.aX = var1;
      client.aZ = var2;
      client.bg = var3;
   }
}
