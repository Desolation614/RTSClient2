package osrs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public final class ki {
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1396666983
   )
   static int a = 0;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lqp;"
   )
   static final ga b = new ga(1024);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lqa;"
   )
   static final fK c = new fK();
   @ObfuscatedName("ap")
   static final Map d = new HashMap();
   @ObfuscatedName("qp")
   @ObfuscatedSignature(
      signature = "[Lwd;"
   )
   static iT[] e;
   @ObfuscatedName("vh")
   @ObfuscatedGetter(
      intValue = -1994986839
   )
   static int f;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Ljm;IIIII)Z",
      garbageValue = "-916934984"
   )
   static boolean a(cn var0, int var1, int var2, int var3, int var4) {
      cB var6 = cn.a(var0, var1);
      var1 = var2 + var6.c;
      var2 = var3 + var6.b;
      var3 = var4 + var6.f;
      var4 = var6.h;
      int var5 = var6.d;
      int var7 = var6.e;
      var1 = ar.a - var1;
      var2 = hn.a - var2;
      var3 = av.a - var3;
      if (Math.abs(var1) > var4 + aJ.a) {
         return false;
      } else if (Math.abs(var2) > var5 + bF.a) {
         return false;
      } else if (Math.abs(var3) > var7 + hE.p) {
         return false;
      } else if (Math.abs(var3 * dj.a - var2 * bw.c) > var5 * hE.p + var7 * bF.a) {
         return false;
      } else if (Math.abs(var1 * bw.c - var3 * bT.f) > var4 * hE.p + var7 * aJ.a) {
         return false;
      } else {
         return Math.abs(var2 * bT.f - var1 * dj.a) <= var5 * aJ.a + var4 * bF.a;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "760586844"
   )
   static void a() {
      client var10000 = dF.c;
      jD var0 = client.j();
      jk var1;
      (var1 = new jk(419, true)).b(12);
      var1.b(var0.m ? 1 : 0);
      var1.b(var0.g ? 1 : 0);
      var1.b(var0.q);
      var1.b(var0.l.size());
      Iterator var2 = var0.l.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.c((Integer)var3.getKey());
         var1.c((Integer)var3.getValue());
      }

      jk.a(var1, var0.r != null ? var0.r : "", -1559098139);
      jk.a(var1, var0.j, 1194800231);
      var1.b((int)(var0.p * 100.0D));
      var1.b(var0.n);
      var1.b(var0.f);
      var1.b(var0.h);
      var1.b(var0.k * 617413103);
      var1.b(var0.e ? 1 : 0);
      var1.c(var0.i);
      var1.b(var0.o);
      var1.b(var0.d ? 1 : 0);
      dF.c.fw.execute(() -> {
         client.a(var1);
      });
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lps;I)V",
      garbageValue = "-1010700983"
   )
   public static void a(fE var0) {
      bE.b = var0;
   }
}
