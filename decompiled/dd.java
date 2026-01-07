package osrs;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public final class dd implements Comparator {
   public final int compare(Object var1, Object var2) {
      cU var10000 = (cU)var1;
      cU var3 = (cU)var2;
      return var10000.a() - var3.a();
   }

   public final boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "549627622"
   )
   static int a(int var0) {
      if (var0 == 7463) {
         client.ed = hE.c[--hE.e] == 1;
         return 1;
      } else {
         return 2;
      }
   }
}
