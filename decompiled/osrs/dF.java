package osrs;

import java.io.File;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public final class dF {
   @ObfuscatedName("aj")
   static File a;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lqh;"
   )
   public static fR b = new fR();
   @ObfuscatedName("fg")
   public static client c;

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "16"
   )
   public static int a(int var0) {
      ab var3;
      if ((var3 = R.a(var0)) == null) {
         return 2;
      } else {
         boolean var10000;
         if ((var3 = var3).f == null && var3.e == null) {
            var10000 = true;
         } else {
            if (var3.f != null) {
               if (!var3.f.isDone()) {
                  var10000 = false;
                  return var10000 ? 0 : 1;
               }

               var3.f = null;
            }

            boolean var1 = true;

            for(int var2 = 0; var2 < var3.e.size(); ++var2) {
               if (!((Future)var3.e.get(var2)).isDone()) {
                  var1 = false;
               } else {
                  var3.e.remove(var2);
                  --var2;
               }
            }

            if (!var1) {
               var10000 = false;
            } else {
               var3.e = null;
               var10000 = true;
            }
         }

         return var10000 ? 0 : 1;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "514941940"
   )
   public static void a() {
      bw.a.b();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)[Ldv;",
      garbageValue = "-72"
   )
   static ko[] b() {
      return new ko[]{ko.c, ko.e, ko.a, ko.d, ko.b};
   }

   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      signature = "(Ldl;IIIIIIII[Ljava/lang/String;III)V",
      garbageValue = "2046012377"
   )
   static void a(kd var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String[] var9, int var10, int var11) {
      fU var12 = var0.u;
      ik var13 = null;

      for(ik var14 = (ik)fU.e(var12); var14 != null; var14 = (ik)fU.b(var12)) {
         if (var14.j == var1 && var2 == var14.i && var3 == var14.k && var4 == var14.m) {
            var13 = var14;
            break;
         }
      }

      if (var13 == null) {
         (var13 = new ik()).j = var1;
         var13.m = var4;
         var13.i = var2;
         var13.k = var3;
         var13.n = -1;
         cS.a(var0, var13);
         fU.a((fU)var12, var13);
      }

      var13.h = var5;
      var13.o = var6;
      var13.g = var7;
      var13.e = var10;
      var13.f = var11;
      ik.a(var13, var8, (byte)4);
      var13.p = var9;
   }
}
