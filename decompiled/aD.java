package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public final class aD extends ak {
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 684515493
   )
   private int a;
   @ObfuscatedSignature(
      signature = "Lfp;"
   )
   private ai b;

   @ObfuscatedSignature(
      signature = "(Lfp;)V"
   )
   aD(ai var1) {
      this.b = var1;
      this.a = -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lgu;I)V",
      garbageValue = "-1572789515"
   )
   final void a(aP var1) {
      int var2 = this.a;
      --var1.s;
      if (var1.s == 0) {
         var1.r = null;
         var1.v = null;
      } else {
         if (var1.r != null) {
            System.arraycopy(var1.r, var2 + 1, var1.r, var2, var1.s - var2);
         }

         if (var1.v != null) {
            System.arraycopy(var1.v, var2 + 1, var1.v, var2, var1.s - var2);
         }

      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-1635342078"
   )
   final void a(jk var1) {
      this.a = var1.d();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "-788083369"
   )
   static int a(int var0, boolean var1) {
      fd var3 = var1 ? ic.a : ef.a;
      if (var0 == 1700) {
         hE.c[++hE.e - 1] = var3.bJ;
         return 1;
      } else if (var0 == 1701) {
         if (var3.bJ != -1) {
            hE.c[++hE.e - 1] = var3.bG;
         } else {
            hE.c[++hE.e - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         hE.c[++hE.e - 1] = var3.s * -744024149;
         return 1;
      } else if (var0 == 1703) {
         bh var4;
         if ((var4 = bN.a(var0 = hE.c[--hE.e])).a()) {
            hE.n[++aU.a - 1] = var3.a(var0, (Object)var4.e);
         } else {
            hE.c[++hE.e - 1] = var3.a(var0, var4.d);
         }

         return 1;
      } else if (var0 == 1704) {
         Object var2 = fw.a(hE.c[--hE.e]);
         var0 = hE.c[--hE.e];
         var3.b(var0, var2);
         return 1;
      } else if (var0 == 1707) {
         hE.c[++hE.e - 1] = var3.c() ? 1 : 0;
         return 1;
      } else if (var0 == 1708) {
         return bW.a(var3);
      } else {
         return var0 == 1709 ? w.a(var3) : 2;
      }
   }

   @ObfuscatedName("im")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "-18"
   )
   static final void a(int var0, int var1, int var2) {
      if (l.d < var0 && (l.d = (var0 - l.d) * cP.b / 1000 + l.d + ag.a) > var0) {
         l.d = var0;
      }

      int var10000;
      if (l.d > var0) {
         var10000 = l.d;
         if ((l.d = var10000 - ((var10000 - var0) * cP.b / 1000 + ag.a)) < var0) {
            l.d = var0;
         }
      }

      if (jD.b < var1 && (jD.b = (var1 - jD.b) * cP.b / 1000 + jD.b + ag.a) > var1) {
         jD.b = var1;
      }

      if (jD.b > var1) {
         var10000 = jD.b;
         if ((jD.b = var10000 - ((var10000 - var1) * cP.b / 1000 + ag.a)) < var1) {
            jD.b = var1;
         }
      }

      if (fk.b < var2 && (fk.b = (var2 - fk.b) * cP.b / 1000 + fk.b + ag.a) > var2) {
         fk.b = var2;
      }

      if (fk.b > var2) {
         var10000 = fk.b;
         if ((fk.b = var10000 - ((var10000 - var2) * cP.b / 1000 + ag.a)) < var2) {
            fk.b = var2;
         }
      }

   }

   @ObfuscatedName("mu")
   @ObfuscatedSignature(
      signature = "(IIIIIIII)V",
      garbageValue = "-1939748619"
   )
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      client.t(var0);
      if (!eu.a(jD.a, var0)) {
         client.n(var0);
      } else {
         bn.a(jD.a.c[var0], 0, jD.a.c[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6);
         client.n(var0);
      }
   }
}
