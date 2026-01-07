package osrs;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
public final class ha {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lsn;"
   )
   static final ha a = new ha("Bearer");
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lsn;"
   )
   static final ha b = new ha("Basic");
   @ObfuscatedName("an")
   final String c;

   private ha(String var1) {
      this.c = var1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Ltp;IIIII)V",
      garbageValue = "1087577696"
   )
   public static void a(hD var0, int var1, int var2, int var3, int var4) {
      iv var6 = iv.c;
      gl.a(var0, var6, true);
      if (var3 < 0) {
         var3 = 0;
      }

      var2 = var3 + var4;
      if (var4 < 0 || var2 < 0 || var2 > var0.c * 935110769) {
         var2 = var0.c * 935110769;
      }

      int[] var5 = var0.a;
      var1 = var1;

      for(var3 = var3; var3 < var2; ++var3) {
         var5[var3] = var1++;
      }

   }

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2054952981"
   )
   static void a() {
      client.cr = true;
      if (eq.a != null && eq.a.c) {
         ka.a(eq.a, (byte)95);
      }

      cS.a();
      l.c();
      if (dU.h != null) {
         dU.h.g = false;
      }

      dU.h = null;
      kg.a(client.P);
      if (fs.g != null) {
         try {
            fs.g.a();
         } catch (Exception var2) {
         }
      }

      fs.g = null;
      G.a();
      bZ.a = null;
      n.c = null;
      fJ.z = null;
      cl.a = null;
      gY.s = null;
      ej.e = null;
      ai.b = null;
      gs.a = null;
      ki.e = null;
      af.a = null;
      bN.c = null;
      client.ag.b();
      client.aw.a();
      er.b = null;
      ac.a(0, 0);
      Z.a();
      client.cz = false;
      df.c();
      if (jD.c != null) {
         jD.c.h();
      }

      ec.f.a();
      dG.a();
      if (aE.a != null) {
         K.a(aE.a, (byte)27);
      }

      aN.a();
      bT.d = null;
      bT.c = null;
      bT.a = null;
      aB.b();
      ej.f = null;
      client.ff.clear();
      client.fm = 0;
      ec.f = new fv();
      aE.a = new u(dF.c.fy, 231);

      try {
         ba.a("ferox", fI.a, bV.c.f, 0, 25);
      } catch (IOException var1) {
         throw new RuntimeException(var1);
      }

      ej.f = new hp(255, bT.d, bT.c, 750000);
      fs.g = new bN();
      dF.c.r = true;
      jR.a(iF.h);
      jT.d(0);
      client.O();
   }
}
