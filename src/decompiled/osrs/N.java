package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public final class N extends gR {
   @ObfuscatedName("na")
   @ObfuscatedSignature(
      signature = "Ldg;"
   )
   static jY a;
   @ObfuscatedName("ap")
   private boolean b;

   public N(boolean var1) {
      this.b = var1;
   }

   public final int compare(Object var1, Object var2) {
      gX var10001 = (gX)var1;
      gX var3 = (gX)var2;
      gX var4 = var10001;
      int var10000;
      if (var4.f != 0 && var3.f != 0) {
         if (!this.b) {
            return jw.a(var3.c, var4.c, -1272671100);
         }

         var10000 = jw.a(var4.c, var3.c, -1272671100);
      } else {
         var10000 = this.a(var4, var3);
      }

      return var10000;
   }

   @ObfuscatedName("me")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "-65"
   )
   static void a(boolean var0) {
      client.dX = var0;
   }
}
