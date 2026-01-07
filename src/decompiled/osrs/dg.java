package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
public final class dg {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Llb;"
   )
   static final dg a = new dg(1);
   @ObfuscatedName("ak")
   static String b;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Llb;"
   )
   static final dg c = new dg(0);
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1167897365
   )
   final int d;

   private dg(int var1) {
      this.d = var1;
   }

   @ObfuscatedName("aj")
   public static String a(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var6 = new StringBuilder(var2);

            while(var0 != 0L) {
               long var4 = var0;
               var0 /= 37L;
               var6.append(gi.a[(int)(var4 - 37L * var0)]);
            }

            return var6.reverse().toString();
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1805360819"
   )
   static void a(int var0) {
      dQ var1;
      (var1 = X.a(j.J, client.P.f)).g.b(var0);
      client.P.a(var1);
   }
}
