package osrs;

import net.runelite.api.AABB;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
public final class cB implements AABB {
   @ObfuscatedName("vr")
   @ObfuscatedGetter(
      intValue = -2056924463
   )
   static int a;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 934249539
   )
   int b;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 513748147
   )
   int c;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1653333789
   )
   int d;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1902189619
   )
   int e;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -391804225
   )
   int f;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "Ljz;"
   )
   cB g;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 834848893
   )
   int h;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1994869327
   )
   final int i;

   cB(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.i = var1;
      this.c = var2;
      this.b = var3;
      this.f = var4;
      this.h = var5;
      this.d = var6;
      this.e = var7;
   }

   public final int getCenterX() {
      return this.c;
   }

   public final int getCenterY() {
      return this.b;
   }

   public final int getCenterZ() {
      return this.f;
   }

   public final int getExtremeX() {
      return this.h;
   }

   public final int getExtremeY() {
      return this.d;
   }

   public final int getExtremeZ() {
      return this.e;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(ILtb;Lpu;I)V",
      garbageValue = "-1368267450"
   )
   static void a(int var0, hp var1, fE var2) {
      byte[] var3 = null;
      synchronized(fH.e) {
         for(fl var5 = (fl)fU.e(fH.e); var5 != null; var5 = (fl)fU.b(fH.e)) {
            if (var5.cf == (long)var0 && var1 == var5.d && var5.e == 0) {
               var3 = var5.c;
               break;
            }
         }
      }

      if (var3 != null) {
         var2.a(var1, var0, var3, true);
      } else {
         byte[] var4 = var1.a(var0);
         var2.a(var1, var0, var4, true);
      }
   }

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      signature = "(Ldl;ZB)V",
      garbageValue = "5"
   )
   static final void a(kd var0, boolean var1) {
      for(int var2 = 0; var2 < var0.f.a; ++var2) {
         kc var3;
         if ((var3 = (kc)var0.g.a((long)var0.f.b[var2])) != null && var3.q() && var3.aQ.U == var1 && aY.a(var3.aQ, -1219421941)) {
            int var4 = var0.m;
            int var5 = var3.s >> 7;
            int var6 = var3.n >> 7;
            if (var5 >= 0 && var5 < var0.d && var6 >= 0 && var6 < var0.c) {
               if (var3.q == 1 && (var3.s & 127) == 64 && (var3.n & 127) == 64) {
                  if (var0.h[var5][var6] == client.dA) {
                     continue;
                  }

                  var0.h[var5][var6] = client.dA;
               }

               long var7 = cQ.a(0, 0, 0, 1, !var3.aQ.A, var3.y, var0.k);
               var3.r = client.Z * -1922570071;
               var5 = fq.a(var0, var3.s, var3.n, var4, var3.aQ.N);
               var6 = (var3.q << 6) - 64 + 60;
               var0.o.a(var4, var3.s, var3.n, var5, var6, var3, var3.l, var7, var3.e);
            }
         }
      }

   }
}
