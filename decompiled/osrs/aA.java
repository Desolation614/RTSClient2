package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public final class aA {
   @ObfuscatedName("nu")
   static boolean a;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      longValue = 3274406513398282671L
   )
   public long b = -1L;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      longValue = -8742692319367184903L
   )
   private long c;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "Lqh;"
   )
   private fR d = new fR();

   @ObfuscatedSignature(
      signature = "(Lwt;)V"
   )
   public aA(jo var1) {
      jo var2 = var1;
      aA var4 = this;
      this.c = var2.e();
      this.b = var2.e();

      for(int var3 = jk.a((jk)var2, (byte)20); var3 != 0; var3 = jk.a((jk)var2, (byte)-50)) {
         Object var5;
         if (var3 == 1) {
            var5 = new at(var4);
         } else if (var3 == 4) {
            var5 = new aN(var4);
         } else if (var3 == 3) {
            var5 = new aF(var4);
         } else if (var3 == 2) {
            var5 = new U(var4);
         } else {
            if (var3 != 5) {
               throw new RuntimeException("");
            }

            var5 = new aB(var4);
         }

         ((aG)var5).a((jk)var2);
         var4.d.b((hR)var5);
      }

   }

   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      signature = "(Lgg;Lgd;I)V"
   )
   public static void a(aA var0, aw var1, int var2) {
      if (var1.cf == var0.c && var1.b == var0.b) {
         for(aG var3 = (aG)fR.a((fR)var0.d, (hR)null); var3 != null; var3 = (aG)var0.d.a()) {
            var3.a(var1);
         }

         ++var1.b;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("mh")
   @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "1720191634"
   )
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (eu.a(jD.a, var0)) {
         ct.aH = null;
         aQ.a(jD.a.c[var0], 0, jD.a.c[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6, var7);
         if (ct.aH != null) {
            aQ.a(ct.aH, 0, ct.aH.length - 1, -1412584499, -1412584499, var1, var2, var3, var4, gZ.a, ec.e, var7);
            ct.aH = null;
            return;
         }
      } else {
         if (var7 != -1) {
            client.eE[var7] = true;
            return;
         }

         for(var0 = 0; var0 < 100; ++var0) {
            client.eE[var0] = true;
         }
      }

   }

   @ObfuscatedName("oq")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-984632497"
   )
   static final void a() {
      client.ew = client.bU * 733503027;
      aJ.b = true;
   }
}
