package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
public final class be extends im {
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
   @ObfuscatedName("an")
   public boolean c = false;

   be() {
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;II[BIS)I",
      garbageValue = "7090"
   )
   public static int a(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      var1 = var2;

      for(var2 = 0; var2 < var1; ++var2) {
         char var5;
         if (((var5 = var0.charAt(var2)) <= 0 || var5 >= 128) && (var5 < 160 || var5 > 255)) {
            if (var5 == 8364) {
               var3[var2 + var4] = -128;
            } else if (var5 == 8218) {
               var3[var2 + var4] = -126;
            } else if (var5 == 402) {
               var3[var2 + var4] = -125;
            } else if (var5 == 8222) {
               var3[var2 + var4] = -124;
            } else if (var5 == 8230) {
               var3[var2 + var4] = -123;
            } else if (var5 == 8224) {
               var3[var2 + var4] = -122;
            } else if (var5 == 8225) {
               var3[var2 + var4] = -121;
            } else if (var5 == 710) {
               var3[var2 + var4] = -120;
            } else if (var5 == 8240) {
               var3[var2 + var4] = -119;
            } else if (var5 == 352) {
               var3[var2 + var4] = -118;
            } else if (var5 == 8249) {
               var3[var2 + var4] = -117;
            } else if (var5 == 338) {
               var3[var2 + var4] = -116;
            } else if (var5 == 381) {
               var3[var2 + var4] = -114;
            } else if (var5 == 8216) {
               var3[var2 + var4] = -111;
            } else if (var5 == 8217) {
               var3[var2 + var4] = -110;
            } else if (var5 == 8220) {
               var3[var2 + var4] = -109;
            } else if (var5 == 8221) {
               var3[var2 + var4] = -108;
            } else if (var5 == 8226) {
               var3[var2 + var4] = -107;
            } else if (var5 == 8211) {
               var3[var2 + var4] = -106;
            } else if (var5 == 8212) {
               var3[var2 + var4] = -105;
            } else if (var5 == 732) {
               var3[var2 + var4] = -104;
            } else if (var5 == 8482) {
               var3[var2 + var4] = -103;
            } else if (var5 == 353) {
               var3[var2 + var4] = -102;
            } else if (var5 == 8250) {
               var3[var2 + var4] = -101;
            } else if (var5 == 339) {
               var3[var2 + var4] = -100;
            } else if (var5 == 382) {
               var3[var2 + var4] = -98;
            } else if (var5 == 376) {
               var3[var2 + var4] = -97;
            } else {
               var3[var2 + var4] = 63;
            }
         } else {
            var3[var2 + var4] = (byte)var5;
         }
      }

      return var1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)Lic;",
      garbageValue = "-1039978270"
   )
   public static bB a() {
      return bB.a;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(ILov;IIIII[FB)Lov;",
      garbageValue = "27"
   )
   static fd a(int var0, fd var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      fd var8;
      (var8 = new fd()).j = var0;
      var8.v = var1.m;
      var8.s = var2 * 926100227;
      var8.f = true;
      var8.p = 0;
      var8.l = 0;
      var8.d = 0;
      var8.h = 0;
      var8.c = (int)(var7[0] * (float)(var1.i * -1805166981));
      var8.r = (int)(var7[1] * (float)(var1.n * -2133353239));
      var8.u = (int)(var7[2] * (float)(var1.i * -1805166981));
      var8.t = (int)((float)(var1.n * -2133353239) * var7[3]);
      return var8;
   }

   @ObfuscatedName("nl")
   @ObfuscatedSignature(
      signature = "(Lhi;Lwt;II)V",
      garbageValue = "-1898017727"
   )
   public static void a(be var0, jk var1, int var2) {
      if (var2 == 2) {
         var0.c = true;
      }

   }
}
