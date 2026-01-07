package osrs;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public final class aN extends aG {
   @ObfuscatedName("oy")
   @ObfuscatedSignature(
      signature = "Lbc;"
   )
   static cY a;
   @ObfuscatedName("aj")
   private byte b;
   @ObfuscatedName("an")
   private byte c;
   @ObfuscatedName("ap")
   private String d;
   @ObfuscatedSignature(
      signature = "Lgg;"
   )
   private aA e;

   @ObfuscatedSignature(
      signature = "(Lgg;)V"
   )
   aN(aA var1) {
      this.e = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lgd;B)V",
      garbageValue = "0"
   )
   final void a(aw var1) {
      var1.e = this.d;
      if (this.d != null) {
         var1.c = this.b;
         var1.a = this.c;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-830685594"
   )
   final void a(jk var1) {
      this.d = var1.k();
      if (this.d != null) {
         jk.a((jk)var1, (byte)90);
         this.b = var1.B();
         this.c = var1.B();
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "255"
   )
   public static void a() {
      try {
         bT.d.a();

         for(int var0 = 0; var0 < bT.b; ++var0) {
            bT.a[var0].a();
         }

         bT.c.a();
         bT.e.a();
      } catch (Exception var1) {
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "9"
   )
   static int b() {
      return jB.l;
   }

   @ObfuscatedName("nq")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1963321979"
   )
   static final void a(int var0) {
      ci.e(var0);
      ah.d();
      Iterator var1 = client.ag.iterator();

      kd var2;
      while(var1.hasNext()) {
         for(gD var3 = (gD)fU.e((var2 = (kd)var1.next()).p); var3 != null; var3 = (gD)fU.b(var2.p)) {
            if (var3.b != null) {
               var3.c();
            }
         }
      }

      int var4;
      if ((var4 = cN.a(var0).d) != 0) {
         int var5 = ej.d[var0];
         if (var4 == 1) {
            if (var5 == 1) {
               l.a(0.9D);
            }

            if (var5 == 2) {
               l.a(0.8D);
            }

            if (var5 == 3) {
               l.a(0.7D);
            }

            if (var5 == 4) {
               l.a(0.6D);
            }
         }

         if (var4 == 3) {
            if (var5 == 0) {
               id.a(255);
            }

            if (var5 == 1) {
               id.a(192);
            }

            if (var5 == 2) {
               id.a(128);
            }

            if (var5 == 3) {
               id.a(64);
            }

            if (var5 == 4) {
               id.a(0);
            }
         }

         if (var4 == 4) {
            if (var5 == 0) {
               dp.a(127);
            }

            if (var5 == 1) {
               dp.a(96);
            }

            if (var5 == 2) {
               dp.a(64);
            }

            if (var5 == 3) {
               dp.a(32);
            }

            if (var5 == 4) {
               dp.a(0);
            }
         }

         if (var4 == 5) {
            client.ed = var5 == 1;
         }

         if (var4 == 6) {
            client.dS = var5;
         }

         if (var4 == 10) {
            if (var5 == 0) {
               gJ.a(127);
            }

            if (var5 == 1) {
               gJ.a(96);
            }

            if (var5 == 2) {
               gJ.a(64);
            }

            if (var5 == 3) {
               gJ.a(32);
            }

            if (var5 == 4) {
               gJ.a(0);
            }
         }

         if (var4 == 17) {
            client.ch = var5 & '\uffff';
         }

         if (var4 == 18 && (client.cG = (ko)aU.a(dF.b(), var5)) == null) {
            client.cG = ko.e;
         }

         if (var4 == 19) {
            if (var5 == -1) {
               client.dW = -1;
            } else {
               client.dW = var5 & 2047;
            }
         }

         if (var4 == 22 && (client.cK = (ko)aU.a(dF.b(), var5)) == null) {
            client.cK = ko.e;
         }
      }

   }
}
