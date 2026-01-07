package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public final class cX implements fN {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   public static final cX a = new cX((byte)2);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   public static final cX b = new cX((byte)0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   public static final cX c = new cX((byte)1);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   public static final cX d = new cX((byte)-1);
   @ObfuscatedName("al")
   private byte e;

   private cX(byte var1) {
      this.e = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.e;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IIII)Lcr;",
      garbageValue = "-1036430378"
   )
   static jI a(int var0, int var1, int var2) {
      jI var3;
      if ((var3 = y.a(W.a(var1, var0))) != null) {
         return var3;
      } else if ((var3 = y.a(dw.a(var2, var0))) != null) {
         return var3;
      } else {
         return (var3 = y.a(var0 += -512)) != null ? var3 : null;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "1"
   )
   public static String a(String var0) {
      int var1;
      char[] var2 = new char[var1 = var0.length()];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            var5 = bN.b(var5);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 != '.' && var5 != '?' && var5 != '!') {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "1771448669"
   )
   static int a(int var0) {
      if (var0 == 5630) {
         client.bH = -1761250506;
         return 1;
      } else {
         return 2;
      }
   }
}
