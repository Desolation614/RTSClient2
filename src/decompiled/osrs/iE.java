package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vn")
public final class iE {
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1109366469
   )
   static final int a = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1109838611
   )
   static final int b = (int)(Math.pow(2.0D, 4.0D) - 1.0D);

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
      garbageValue = "74"
   )
   public static void a(String var0, Throwable var1) {
      Throwable var2 = var1;
      if (var1 instanceof jv && "".equals(var1.getMessage())) {
         var2 = var1.getCause();
      }

      if (var0 == null) {
         client.cV.error("Client error", var2);
      } else {
         client.cV.error("Client error: {}", var0, var2);
      }

      dF.c.getCallbacks().error(var0, var2);
   }
}
