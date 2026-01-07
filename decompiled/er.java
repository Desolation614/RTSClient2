package osrs;

import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
final class er implements ThreadFactory {
   @ObfuscatedName("lo")
   @ObfuscatedGetter(
      intValue = 1272218955
   )
   static int a;
   @ObfuscatedName("ws")
   @ObfuscatedSignature(
      signature = "Luy;"
   )
   static ip b;
   @ObfuscatedSignature(
      signature = "Lmt;"
   )
   private ea c;

   @ObfuscatedSignature(
      signature = "(Lmt;)V"
   )
   er(ea var1) {
      this.c = var1;
   }

   public final Thread newThread(Runnable var1) {
      return new Thread(var1, "OSRS WAV Load");
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "584657797"
   )
   static int a(int var0, boolean var1) {
      fd var2 = var1 ? ic.a : ef.a;
      if (var0 == 1800) {
         hE.c[++hE.e - 1] = ck.a(var2) >> 11 & 63;
         return 1;
      } else if (var0 != 1801) {
         if (var0 == 1802) {
            if (var2.ac == null) {
               hE.n[++aU.a - 1] = "";
            } else {
               hE.n[++aU.a - 1] = var2.ac;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         var0 = hE.c[--hE.e];
         --var0;
         if (var2.aJ != null && var0 < var2.aJ.length && var2.aJ[var0] != null) {
            hE.n[++aU.a - 1] = var2.aJ[var0];
         } else {
            hE.n[++aU.a - 1] = "";
         }

         return 1;
      }
   }
}
