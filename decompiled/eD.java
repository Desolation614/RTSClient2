package osrs;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public final class eD {
   @ObfuscatedName("ar")
   static final BigInteger a = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   @ObfuscatedName("au")
   static final BigInteger b = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   @ObfuscatedName("ld")
   @ObfuscatedGetter(
      intValue = -496824645
   )
   static int c;

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-239653335"
   )
   public static int a(int var0) {
      return ih.b[var0 & 16383];
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Lbo;I)V",
      garbageValue = "-803681993"
   )
   static void a() {
      cV var0 = client.aU;

      while(var0.a()) {
         if (var0.i == 13) {
            dU.a();
            return;
         }

         if (var0.i == 96) {
            if (jB.B > 0 && bb.b != null) {
               --jB.B;
            }
         } else if (var0.i == 97 && jB.B < jB.A && iQ.g != null) {
            ++jB.B;
         }
      }

      if (gY.k == 1 || !I.b && gY.k == 4) {
         int var3 = jB.f + 280;
         if (gY.g >= var3 && gY.g <= var3 + 14 && gY.f >= 4 && gY.f <= 18) {
            hl.a(0, 0);
            return;
         }

         if (gY.g >= var3 + 15 && gY.g <= var3 + 80 && gY.f >= 4 && gY.f <= 18) {
            hl.a(0, 1);
            return;
         }

         var3 = jB.f + 390;
         if (gY.g >= var3 && gY.g <= var3 + 14 && gY.f >= 4 && gY.f <= 18) {
            hl.a(1, 0);
            return;
         }

         if (gY.g >= var3 + 15 && gY.g <= var3 + 80 && gY.f >= 4 && gY.f <= 18) {
            hl.a(1, 1);
            return;
         }

         var3 = jB.f + 500;
         if (gY.g >= var3 && gY.g <= var3 + 14 && gY.f >= 4 && gY.f <= 18) {
            hl.a(2, 0);
            return;
         }

         if (gY.g >= var3 + 15 && gY.g <= var3 + 80 && gY.f >= 4 && gY.f <= 18) {
            hl.a(2, 1);
            return;
         }

         var3 = jB.f + 610;
         if (gY.g >= var3 && gY.g <= var3 + 14 && gY.f >= 4 && gY.f <= 18) {
            hl.a(3, 0);
            return;
         }

         if (gY.g >= var3 + 15 && gY.g <= var3 + 80 && gY.f >= 4 && gY.f <= 18) {
            hl.a(3, 1);
            return;
         }

         if (gY.g >= jB.f + 708 && gY.f >= 4 && gY.g <= jB.f + 708 + 50 && gY.f <= 20) {
            dU.a();
            return;
         }

         if (jB.C != -1) {
            dO var4 = iB.a[jB.C];
            boolean var1 = G.a(client.aY, iC.g);
            boolean var2;
            eE.a = var2 = var4.c();
            var4.j = var2 ? "beta" : var4.j;
            dm.a(var4);
            dU.a();
            if (var2 != var1) {
               ha.a();
            }

            return;
         }

         if (jB.B > 0 && bb.b != null && gY.g >= 0 && gY.g <= bb.b.g && gY.f >= fs.a / 2 - 50 && gY.f <= fs.a / 2 + 50) {
            --jB.B;
         }

         if (jB.B < jB.A && iQ.g != null && gY.g >= fs.h - iQ.g.g - 5 && gY.g <= fs.h && gY.f >= fs.a / 2 - 50 && gY.f <= fs.a / 2 + 50) {
            ++jB.B;
         }
      }

   }
}
