package osrs;

import net.runelite.api.events.PostHealthBarConfig;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public final class aM extends ak {
   @ObfuscatedName("fc")
   @ObfuscatedSignature(
      signature = "Ldl;"
   )
   public static kd a;
   @ObfuscatedName("ai")
   private byte b;
   @ObfuscatedName("aj")
   private byte c;
   @ObfuscatedName("al")
   private byte d;
   @ObfuscatedName("an")
   private byte e;
   @ObfuscatedName("ap")
   private boolean f;
   @ObfuscatedSignature(
      signature = "Lfp;"
   )
   private ai g;

   @ObfuscatedSignature(
      signature = "(Lfp;)V"
   )
   aM(ai var1) {
      this.g = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lgu;I)V",
      garbageValue = "-1572789515"
   )
   final void a(aP var1) {
      var1.p = this.f;
      var1.e = this.c;
      var1.i = this.e;
      var1.m = this.b;
      var1.g = this.d;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-1635342078"
   )
   final void a(jk var1) {
      this.f = jk.a((jk)var1, (byte)65) == 1;
      this.c = var1.B();
      this.e = var1.B();
      this.b = var1.B();
      this.d = var1.B();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)Lhs;",
      garbageValue = "-1184987531"
   )
   public static bq a(int var0) {
      bq var1;
      if ((var1 = (bq)dX.a(bq.c, (long)var0)) != null) {
         return var1;
      } else {
         byte[] var2 = fB.a(bq.d, 33, (int)var0);
         (var1 = new bq()).n = var0;
         if (var2 != null) {
            jk var3 = new jk(var2);
            bq var7 = var1;

            int var4;
            while((var4 = jk.a((jk)var3, (byte)73)) != 0) {
               if (var4 == 1) {
                  var3.d();
               } else if (var4 == 2) {
                  var7.j = jk.a((jk)var3, (byte)108);
               } else if (var4 == 3) {
                  var7.k = jk.a((jk)var3, (byte)29);
               } else if (var4 == 4) {
                  var7.m = 0;
               } else if (var4 == 5) {
                  var7.o = var3.d();
               } else if (var4 == 6) {
                  jk.a(var3, (byte)-10);
               } else if (var4 == 7) {
                  var7.g = var3.u();
               } else if (var4 == 8) {
                  var7.h = var3.u();
               } else if (var4 == 11) {
                  var7.m = var3.d();
               } else if (var4 == 14) {
                  var7.f = jk.a((jk)var3, (byte)8);
               } else if (var4 == 15) {
                  var7.l = jk.a((jk)var3, (byte)99);
               }
            }

            PostHealthBarConfig var6;
            (var6 = new PostHealthBarConfig()).setHealthBarConfig(var7);
            dF.c.getCallbacks().post(var6);
         }

         bq.c.a((im)var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("of")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "86"
   )
   static final void a() {
      dQ var0;
      (var0 = X.a(j.ab, client.P.f)).g.b(0);
      client.P.a(var0);
   }
}
