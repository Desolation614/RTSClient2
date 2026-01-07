package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public final class fy implements fN {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lpp;"
   )
   public static final fy a = new fy(3);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lpp;"
   )
   public static final fy b = new fy(1);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lpp;"
   )
   public static final fy c = new fy(2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lpp;"
   )
   public static final fy d = new fy(0);
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -421975081
   )
   public final int e;

   private fy(int var1) {
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

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZI)V",
      garbageValue = "1758844007"
   )
   static final void a(String var0) {
      if (client.aq) {
         int var1 = cA.a.b(var0, 250);
         int var2 = cA.a.a((String)var0, (int)250) * 13;
         jd.h(6, 6, var1 + 4 + 4, var2 + 8, 0);
         jd.g(6, 6, var1 + 4 + 4, var2 + 8, 16777215);
         cA.a.a(var0, 10, 10, var1, var2, 16777215, -1, 1, 1, 0);
         gd.a(6, 6, var1 + 4 + 4, var2 + 4 + 4);
         int var3 = var1;
         var1 = var2;

         for(var2 = 0; var2 < client.eC; ++var2) {
            if (client.eF[var2] + client.eQ[var2] > 10 && client.eF[var2] < var3 + 10 && client.eP[var2] + client.eB[var2] > 10 && client.eB[var2] < var1 + 10) {
               client.eL[var2] = true;
            }
         }
      }

   }
}
