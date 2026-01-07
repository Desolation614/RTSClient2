package osrs;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public final class bo {
   @ObfuscatedName("aj")
   private MessageDigest a = a();

   @ObfuscatedSignature(
      signature = "(Lah;)V"
   )
   bo() {
   }

   @ObfuscatedName("ai")
   final byte[] a(String var1, long var2) {
      StringBuilder var4;
      (var4 = new StringBuilder()).append(var1).append(Long.toHexString(var2));
      this.a.reset();

      try {
         this.a.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var5) {
         var5.printStackTrace();
      }

      return this.a.digest();
   }

   @ObfuscatedName("al")
   private static MessageDigest a() {
      try {
         return MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var1) {
         var1.printStackTrace();
         return null;
      }
   }
}
