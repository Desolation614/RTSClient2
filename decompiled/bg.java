package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public final class bg extends im {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   static dX a = new dX(64);

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)V",
      garbageValue = "-22"
   )
   static void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      ar.a = (var3 + var0) / 2;
      hn.a = (var4 + var1) / 2;
      av.a = (var5 + var2) / 2;
      bT.f = (var3 - var0) / 2;
      dj.a = (var4 - var1) / 2;
      bw.c = (var5 - var2) / 2;
      osrs.aJ.a = Math.abs(bT.f);
      bF.a = Math.abs(dj.a);
      hE.p = Math.abs(bw.c);
      osrs.cf.g.a((float)(var3 - var0), (float)(var4 - var1), (float)(var5 - var2));
      osrs.cf.g.a();
      osrs.cf.e = true;
   }
}
