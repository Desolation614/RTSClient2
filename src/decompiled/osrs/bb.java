package osrs;

import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public final class bb extends im {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   static dX a = new dX(64);
   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      signature = "Lwy;"
   )
   static jp b;

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Lps;IB)V",
      garbageValue = "-11"
   )
   public static void a(fE var0, int var1) {
      if (!ee.g.isEmpty()) {
         ArrayList var2 = new ArrayList();
         Iterator var3 = ee.g.iterator();

         while(var3.hasNext()) {
            ev var4;
            (var4 = (ev)var3.next()).i = false;
            var4.a = false;
            var4.e = false;
            var4.d = false;
            var4.k = var0;
            var4.f = var1;
            var4.h = 0.0F;
            var2.add(var4);
         }

         gO.a(var2, ee.c, ee.k, ee.j, ee.b, false);
      }

   }

   @ObfuscatedName("lr")
   @ObfuscatedSignature(
      signature = "(IIII[Ljava/lang/Object;B)V",
      garbageValue = "8"
   )
   static void a(int var0, int var1, int var2, int var3, Object[] var4) {
      fd var5;
      if ((var5 = eu.a(jD.a, var0, var1, (byte)109)) != null) {
         if ((ck.a(var5) >> 23 & 1) == 0) {
            return;
         }

         dQ var6;
         (var6 = X.a(j.g, client.P.f)).g.d(0);
         int var11 = var6.g.c;
         var6.g.d(var1);
         jk.a(var6.g, var0, (byte)-60);
         var6.g.o(var2);
         var6.g.m(var3);
         Object[] var7 = var4;

         for(var1 = 0; var1 < var7.length; ++var1) {
            Object var8;
            if ((var8 = var7[var1]) instanceof Integer) {
               var6.g.e((Integer)var8);
            } else if (var8 instanceof String) {
               jk.a(var6.g, (String)((String)var8), -1559098139);
            } else if (var8 instanceof hD) {
               hD var9;
               var3 = (var9 = (hD)var8).c * 935110769;
               var6.g.g(var3);
               if (var9.d == iv.c) {
                  int[] var10 = var9.a;

                  for(var2 = 0; var2 < var3; ++var2) {
                     var6.g.e(var10[var2]);
                  }
               } else {
                  var4 = var9.b;

                  for(var2 = 0; var2 < var3; ++var2) {
                     jk.a(var6.g, (String)((String)var4[var2]), -1559098139);
                  }
               }
            } else if (var8 == null) {
               var6.g.b(0);
            }
         }

         var6.g.i(var6.g.c - var11);
         client.P.a(var6);
      }

   }
}
