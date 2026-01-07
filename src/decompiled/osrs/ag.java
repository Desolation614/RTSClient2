package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public final class ag extends ak {
   @ObfuscatedName("vv")
   @ObfuscatedGetter(
      intValue = -734235235
   )
   static int a;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -248590595
   )
   private int b;
   @ObfuscatedSignature(
      signature = "Lfp;"
   )
   private ai c;

   @ObfuscatedSignature(
      signature = "(Lfp;)V"
   )
   ag(ai var1) {
      this.c = var1;
      this.b = -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lgu;I)V",
      garbageValue = "-1572789515"
   )
   final void a(aP var1) {
      int var2 = this.b;
      if (var2 >= 0 && var2 < var1.d) {
         --var1.d;
         var1.y = null;
         if (var1.d == 0) {
            var1.l = null;
            var1.t = null;
            var1.o = null;
            var1.f = null;
            var1.q = null;
            var1.k = null;
            var1.j = -1;
            var1.n = -1;
         } else {
            System.arraycopy(var1.o, var2 + 1, var1.o, var2, var1.d - var2);
            System.arraycopy(var1.f, var2 + 1, var1.f, var2, var1.d - var2);
            System.arraycopy(var1.q, var2 + 1, var1.q, var2, var1.d - var2);
            System.arraycopy(var1.k, var2 + 1, var1.k, var2, var1.d - var2);
            if (var1.l != null) {
               System.arraycopy(var1.l, var2 + 1, var1.l, var2, var1.d - var2);
            }

            if (var1.t != null) {
               System.arraycopy(var1.t, var2 + 1, var1.t, var2, var1.d - var2);
            }

            var1.b();
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-1635342078"
   )
   final void a(jk var1) {
      this.b = var1.d();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)Lhi;",
      garbageValue = "1551333846"
   )
   public static be a(int var0) {
      be var1;
      if ((var1 = (be)dX.a(be.a, (long)var0)) != null) {
         return var1;
      } else {
         byte[] var2 = fB.a(be.b, 19, (int)var0);
         var1 = new be();
         if (var2 != null) {
            jk var3 = new jk(var2);
            be var5 = var1;

            int var4;
            while((var4 = jk.a((jk)var3, (byte)1)) != 0) {
               be.a(var5, var3, var4);
            }
         }

         be.a.a((im)var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      signature = "(IIIIS)V",
      garbageValue = "17299"
   )
   static final void a() {
      client.av = 0;
      int var0 = (ai.a.s >> 7) + aM.a.n;
      int var1 = (ai.a.n >> 7) + aM.a.i;
      if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
         client.av = 1;
      }

      if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
         client.av = 1;
      }

      if (client.av == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
         client.av = 0;
      }

   }

   @ObfuscatedName("kh")
   @ObfuscatedSignature(
      signature = "(Ldl;I)V",
      garbageValue = "1495576013"
   )
   static void a(kd var0) {
      client var10000 = dF.c;
      int var1 = client.q();
      if (!client.dx && var1 != 25 && var1 != 30) {
         throw new AssertionError();
      } else if (!client.dx && !client.ct) {
         throw new AssertionError();
      } else {
         kx var2;
         if (client.L != null) {
            if (client.L.a()) {
               var2 = client.L;
               client.L = null;
               client.bC = false;
               client.a(var2);
               client.ct = false;
               aC.a = null;
               return;
            }
         } else {
            var2 = new kx(client.dd, 0, var0, kq.a(false));
            var0.w = var2.a.c;
            var0.a = var2.a.b;
            var0.y = var2.a.e;
            if (!client.dx && ec.a != var0) {
               throw new AssertionError();
            }

            var2.f = ec.a.m;
            if (!client.dx && aC.a != var0) {
               throw new AssertionError();
            }

            if (!client.dx && client.bC) {
               throw new AssertionError();
            }

            client.bC = true;
            if (!client.dx && client.L != null) {
               throw new AssertionError();
            }

            client.L = var2;
            var2.b();
         }

      }
   }

   @ObfuscatedName("mq")
   @ObfuscatedSignature(
      signature = "(IIIZI)V",
      garbageValue = "-1186697553"
   )
   static final void a(int var0, int var1, int var2, boolean var3) {
      if (eu.a(jD.a, var0)) {
         osrs.cf.a(jD.a.c[var0], 0, jD.a.c[var0].length - 1, -1, -1, var1, var2, var3);
      }

   }
}
