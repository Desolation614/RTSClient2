package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public final class t extends gR {
   @ObfuscatedName("tt")
   @ObfuscatedGetter(
      intValue = 2105061489
   )
   static int a;
   @ObfuscatedName("ap")
   private boolean b;

   public t(boolean var1) {
      this.b = var1;
   }

   public final int compare(Object var1, Object var2) {
      gX var10001 = (gX)var1;
      gX var3 = (gX)var2;
      gX var4 = var10001;
      int var10000;
      if (var4.f != 0 && var3.f != 0) {
         if (!this.b) {
            return var3.e - var4.e;
         }

         var10000 = var4.e - var3.e;
      } else {
         var10000 = this.a(var4, var3);
      }

      return var10000;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "-1448059673"
   )
   static int a(int var0, boolean var1) {
      fd var5;
      if (var0 != 1927 && var0 != 2927) {
         kn var7;
         int var8;
         if (var0 == 1928) {
            var5 = var1 ? ic.a : ef.a;
            if ((var8 = hE.c[--hE.e]) > 0 && var8 <= 10) {
               var7 = new kn(var8, var5.m, var5.s * -744024149, var5.bJ);
               hE.o.add(var7);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 2928) {
            hE.e -= 3;
            int var9 = hE.c[hE.e];
            var8 = hE.c[hE.e + 1];
            if ((var0 = hE.c[hE.e + 2]) > 0 && var0 <= 10) {
               fd var10;
               if ((var10 = eu.a(jD.a, var9, var8, (byte)77)) == null) {
                  throw new RuntimeException();
               } else {
                  var7 = new kn(var0, var9, var8, var10.bJ);
                  hE.o.add(var7);
                  return 1;
               }
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 2929) {
            Object[] var2 = aT.c();
            hE.e -= 3;
            var8 = hE.c[hE.e];
            var0 = hE.c[hE.e + 1];
            int var3 = hE.c[hE.e + 2];
            fd var4;
            if ((var4 = eu.a(jD.a, var0, var3, (byte)71)) != null) {
               int var11 = var4.bJ;
               bb.a(var0, var3, var11, var8, var2);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (hE.q >= 10) {
         throw new RuntimeException();
      } else if ((var5 = var0 >= 2000 ? jD.a.b(hE.c[--hE.e]) : (var1 ? ic.a : ef.a)).aT == null) {
         return 0;
      } else {
         jK var6;
         (var6 = new jK()).j = var5;
         var6.g = var5.aT;
         var6.l = hE.q + 1;
         fU.a((fU)client.cf, var6);
         return 1;
      }
   }
}
