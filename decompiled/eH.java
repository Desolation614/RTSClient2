package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public final class eH {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Loa;"
   )
   static final eH a = new eH("WIP", 2);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Loa;"
   )
   static final eH b = new eH("BUILDLIVE", 3);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Loa;"
   )
   static final eH c = new eH("RC", 1);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Loa;"
   )
   static final eH d = new eH("LIVE", 0);
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1227870063
   )
   public final int e;
   @ObfuscatedName("al")
   public final String f;

   private eH(String var1, int var2) {
      this.f = var1;
      this.e = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IIIII)Lrv;",
      garbageValue = "-1376096067"
   )
   public static gH a(int var0, int var1, int var2, int var3) {
      synchronized(gH.c) {
         if (gH.b == 0) {
            return new gH(var0, var1, var2, var3);
         } else {
            --gH.b;
            gH.c[gH.b].b(var0, var1);
            gH.c[gH.b].c(var2, var3);
            return gH.c[gH.b];
         }
      }
   }
}
