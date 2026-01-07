package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public final class el {
   @ObfuscatedName("kt")
   @ObfuscatedSignature(
      signature = "Lpu;"
   )
   static fE a;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 168218257
   )
   public int b;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1420984831
   )
   public int c;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -2064503183
   )
   public int d;

   el() {
   }

   @ObfuscatedName("pn")
   @ObfuscatedSignature(
      signature = "(II)Lvu;",
      garbageValue = "-1158963920"
   )
   static iL a(int var0) {
      iL var1;
      if ((var1 = (iL)dX.a(client.cl, (long)var0)) == null) {
         var1 = new iL(ex.a, var0 >>> 12, jQ.a(var0));
         client.cl.a((im)var1, (long)var0);
      }

      return var1;
   }
}
