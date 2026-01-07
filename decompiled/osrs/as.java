package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public final class as implements fN {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lfz;"
   )
   public static final as a = new as(4, 3);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lfz;"
   )
   public static final as b = new as(0, 1);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lfz;"
   )
   public static final as c = new as(3, 4);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lfz;"
   )
   public static final as d = new as(2, 2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lfz;"
   )
   public static final as e = new as(1, 0);
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1129913595
   )
   final int f;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1389806771
   )
   public final int g;

   private as(int var1, int var2) {
      this.g = var1;
      this.f = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.f;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[IB)V",
      garbageValue = "84"
   )
   public static void a(String[] var0, int[] var1) {
      gD.a(var0, var1, 0, var0.length - 1);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(I)Lwy;",
      garbageValue = "-699949419"
   )
   static jp b() {
      jp var0;
      (var0 = new jp()).a = iR.c;
      var0.f = iR.e;
      var0.e = iR.b[0];
      var0.b = ej.c[0];
      var0.g = eL.a[0];
      var0.c = aQ.a[0];
      var0.d = iR.d;
      var0.p = iR.a[0];
      iR.b = null;
      ej.c = null;
      eL.a = null;
      aQ.a = null;
      iR.d = null;
      iR.a = null;
      return var0;
   }

   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      signature = "(IIZS)V",
      garbageValue = "-20427"
   )
   static final void a(int var0, int var1, boolean var2) {
      if (!var2 || var0 != bp.a || bi.d != var1) {
         if (!client.dx && client.fd != null) {
            throw new AssertionError();
         }

         kx var4;
         if (client.fd != null) {
            client.cV.error("Loading map {},{},{} while another map load is in progress!", new Object[]{var0, var1, var2});
            var4 = client.fd;

            try {
               var4.q.get();
            } catch (Throwable var3) {
               throw new RuntimeException(var3);
            }

            client.a("concurrent map load", (Throwable)null);
         }

         (var4 = new kx(client.dd, client.A, aM.a, kq.a(true))).m = var0 - 6 << 3;
         var4.i = var1 - 6 << 3;
         var4.e = var0;
         var4.l = var1;
         var4.f = ec.a.m;
         if (!client.dx && client.bC) {
            throw new AssertionError();
         }

         if (client.aa != 30) {
            client.c(var4);
            if (!client.dx && client.aa != 25) {
               throw new AssertionError();
            }

            client.cS = null;
         } else {
            client.bO.a();
            client.bC = true;
            kd var10000 = ec.a;
            var10000.m = var10000.z * 792933123;
            if (!client.dx && client.cS != null) {
               throw new AssertionError();
            }
         }

         client.fd = var4;
         var4.b();
      }

   }
}
