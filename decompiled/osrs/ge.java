package osrs;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qu")
public final class ge {
   @ObfuscatedName("ai")
   private static int[] b;
   @ObfuscatedName("aj")
   private static char[] c;
   @ObfuscatedName("an")
   private static char[] d;
   @ObfuscatedName("ap")
   public static char[] a = new char[64];

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         a[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         a[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         a[var0] = (char)(var0 + 48 - 52);
      }

      a[62] = '+';
      a[63] = '/';
      c = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         c[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         c[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         c[var0] = (char)(var0 + 48 - 52);
      }

      c[62] = '*';
      c[63] = '-';
      d = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         d[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         d[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         d[var0] = (char)(var0 + 48 - 52);
      }

      d[62] = '-';
      d[63] = '_';
      b = new int[128];

      for(var0 = 0; var0 < b.length; ++var0) {
         b[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         b[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         b[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         b[var0] = var0 - 48 + 52;
      }

      int[] var1 = b;
      b[43] = 62;
      var1[42] = 62;
      var1 = b;
      b[47] = 63;
      var1[45] = 63;
   }
}
