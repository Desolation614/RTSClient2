package osrs;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public final class kg {
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -755942415
   )
   int a = 0;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lmv;"
   )
   k b = null;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "Lmv;"
   )
   k c;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "Lmv;"
   )
   k d;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 520261313
   )
   private int n = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -59638065
   )
   int e = 0;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lwo;"
   )
   public jf f;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 584269303
   )
   int g;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "Lmv;"
   )
   k h;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lwx;"
   )
   jo i = new jo(40000);
   @ObfuscatedName("am")
   boolean j = true;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lwt;"
   )
   private jk o = new jk(5000);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lqh;"
   )
   private fR p = new fR();
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1420789563
   )
   int k = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 991669831
   )
   int l = 0;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "Ltg;"
   )
   hw m;

   kg() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(B)Ltg;",
      garbageValue = "28"
   )
   final hw a() {
      return this.m;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1835646424"
   )
   final void b() throws IOException {
      if (this.m != null && this.n > 0) {
         this.o.c = 0;

         dQ var1;
         while((var1 = (dQ)fR.a((fR)this.p, (hR)null)) != null && var1.d <= this.o.d.length - this.o.c) {
            this.o.a((byte[])var1.g.d, 0, (int)var1.d);
            this.n -= var1.d;
            gk.a(var1);
            var1.g.b();
            dQ.a(var1, (byte)107);
         }

         this.m.a(this.o.d, 0, this.o.c);
         this.l = 0;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lmk;B)V",
      garbageValue = "-128"
   )
   public final void a(dQ var1) {
      this.p.b(var1);
      var1.d = var1.g.c;
      var1.g.c = 0;
      this.n += var1.d;
   }

   @ObfuscatedName("ap")
   private void c() {
      this.p.clear();
      this.g = 0;
   }

   @ObfuscatedName("lp")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "-2138041936"
   )
   static void a(int var0, String var1) {
      int var2 = client.ax.f;
      int[] var3 = client.ax.d;
      boolean var4 = false;
      jw var5 = new jw(var1, gR.c);
      kd var6;
      if ((var6 = ai.a.s()) == null) {
         fu.a(4, "", "Unable to find " + var1 + ", current world null.");
      } else {
         for(int var7 = 0; var7 < var2; ++var7) {
            jG var8;
            if ((var8 = (jG)var6.e.a((long)var3[var7])) != null && var8 != ai.a && var8.aT != null && var8.aT.equals(var5)) {
               dQ var9;
               if (var0 == 1) {
                  (var9 = X.a(osrs.j.t, client.P.f)).g.f(var3[var7]);
                  jk.d((jo)var9.g, 0);
                  client.P.a(var9);
               } else if (var0 == 4) {
                  (var9 = X.a(osrs.j.aH, client.P.f)).g.o(var3[var7]);
                  var9.g.b(0);
                  client.P.a(var9);
               } else if (var0 == 6) {
                  (var9 = X.a(osrs.j.j, client.P.f)).g.f(var3[var7]);
                  jk.d((jo)var9.g, 0);
                  client.P.a(var9);
               } else if (var0 == 7) {
                  (var9 = X.a(osrs.j.d, client.P.f)).g.f(var3[var7]);
                  var9.g.b(0);
                  client.P.a(var9);
               }

               var4 = true;
               break;
            }
         }

         if (!var4) {
            fu.a(4, "", "Unable to find " + var1);
         }

      }
   }

   @ObfuscatedName("nw")
   @ObfuscatedSignature(
      signature = "(Ldn;B)V"
   )
   public static void a(kg var0, byte var1) {
      if (var0 == null) {
         var0.c();
      } else {
         var0.p.b();
         var0.n = 0;
      }
   }

   @ObfuscatedName("tu")
   @ObfuscatedSignature(
      signature = "(Ldn;I)V"
   )
   public static void a(kg var0) {
      if (var0.m != null) {
         var0.m.a();
         var0.m = null;
      }

   }
}
