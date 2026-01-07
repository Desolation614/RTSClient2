package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
public final class ej {
   @ObfuscatedName("ai")
   static int[] a = new int[32];
   @ObfuscatedName("aj")
   public static int[] b = new int[11000];
   @ObfuscatedName("al")
   static int[] c;
   @ObfuscatedName("an")
   public static int[] d = new int[11000];
   @ObfuscatedName("ql")
   @ObfuscatedSignature(
      signature = "[Lwd;"
   )
   static iT[] e;
   @ObfuscatedName("wt")
   @ObfuscatedSignature(
      signature = "Ltb;"
   )
   static hp f;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "1"
   )
   public static void a(int var0, int var1) {
      bj var4;
      int var2 = (var4 = hE.a(var0)).d;
      int var3 = var4.e;
      var0 = var4.f;
      var0 = a[var0 - var3];
      if (var1 < 0 || var1 > var0) {
         var1 = 0;
      }

      var0 <<= var3;
      int[] var10002 = d;
      var10002[var2] = var10002[var2] & ~var0 | var1 << var3 & var0;
      client.k(var2);
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         a[var1] = var0 - 1;
         var0 += var0;
      }

   }
}
