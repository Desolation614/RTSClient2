package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public final class cl extends im {
   @ObfuscatedName("pa")
   @ObfuscatedSignature(
      signature = "[Lwd;"
   )
   static iT[] a;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "[Ljf;"
   )
   cg[] b;

   @ObfuscatedSignature(
      signature = "(Lps;Lps;I)V"
   )
   public cl(fB var1, fB var2, int var3) {
      int var4 = var1.d(var3);
      this.b = new cg[var4];
      cz var8 = null;
      int[] var5 = var1.e(var3);

      for(int var6 = 0; var6 < var5.length; ++var6) {
         byte[] var7 = fB.a(var1, var3, var5[var6]);
         if (var8 == null) {
            var4 = (var7[0] & 255) << 8 | var7[1] & 255;
            byte[] var9 = var2.a(var4, 0);
            var8 = new cz(var9);
         }

         this.b[var5[var6]] = new cg(var7, var8);
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-119"
   )
   public final boolean a(int var1) {
      return this.b[var1].g;
   }

   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      signature = "(IZZZZI)Lpu;",
      garbageValue = "-534466592"
   )
   static fE a(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      hp var5 = null;
      if (bT.d != null) {
         var5 = new hp(var0, bT.d, bT.a[var0], 1000000);
      }

      return new fE(var5, ej.f, ec.f, var0, var1, var2, true, var4, false);
   }
}
