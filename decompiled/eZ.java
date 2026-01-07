package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
public final class eZ {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(Lps;II)V",
      garbageValue = "1896807201"
   )
   static void a(fB var0, int var1) {
      if ((var1 & iC.i.l) != 0) {
         eC.a = fn.a(var0, "logo_deadman_mode", "");
      } else if ((var1 & iC.j.l) != 0) {
         eC.a = fn.a(var0, "logo_seasonal_mode", "");
      } else if ((var1 & iC.a.l) != 0) {
         eC.a = fn.a(var0, "logo_speedrunning", "");
      } else {
         eC.a = fn.a(var0, "logo", "");
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Ltp;II)Ljava/lang/Object;",
      garbageValue = "-499677898"
   )
   public static Object a(hD var0, int var1) {
      gl.a(var0, (iv)null, true);
      if (var1 >= 0 && var1 < var0.c * 935110769) {
         Object var2 = hD.a(var0, var1);
         if (var1 < var0.c * 935110769 - 1) {
            aw.a(var0, var1 + 1, var0, var1, var0.c * 935110769 - (var1 + 1));
         }

         var0.c(var0.c * 935110769 - 1);
         return var2;
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("hb")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-714035305"
   )
   static final void a() {
      kg.a(client.P);
      G.a();
      client.ag.b();
      client.aw.a();
      client.ax.a();
      client.aR.a();
      System.gc();
      ac.a(0, 0);
      Z.a();
      client.cz = false;
      df.c();
      jT.d(10);
      client.bA = 0;
      client.E();
      be.a().a();
      bB var0;
      if ((var0 = be.a()).d != null) {
         var0.d.a();
      }

   }

   static {
      Math.sqrt(8192.0D);
   }
}
