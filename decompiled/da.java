package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
public final class da {
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 733853031
   )
   static int a;

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)Ljk;",
      garbageValue = "-1289643924"
   )
   static cl a(int var0) {
      cl var1;
      if ((var1 = (cl)dX.a(bP.b, (long)var0)) != null) {
         return var1;
      } else {
         fB var9 = bP.a;
         fB var2 = dD.a;
         boolean var3 = true;
         int var4 = -1;
         int[] var5 = var9.e(var0);

         for(int var6 = 0; var6 < var5.length; ++var6) {
            byte[] var7;
            if ((var7 = var9.a(var0, var5[var6])) == null) {
               var3 = false;
            } else if (var4 == -1) {
               var4 = (var7[0] & 255) << 8 | var7[1] & 255;
            }
         }

         if (var4 != -1) {
            if (var2.a(var4, 0) == null) {
               var3 = false;
            }
         } else {
            var3 = false;
         }

         cl var10;
         if (!var3) {
            var10 = null;
         } else {
            try {
               var10 = new cl(var9, var2, var0);
            } catch (Exception var8) {
               var10 = null;
            }
         }

         if (var10 != null) {
            bP.b.a((im)var10, (long)var0);
         }

         return var10;
      }
   }

   @ObfuscatedName("nl")
   @ObfuscatedSignature(
      signature = "([Lov;IB)V",
      garbageValue = "44"
   )
   static final void a(fd[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         fd var3;
         if ((var3 = var0[var2]) != null) {
            if (var3.j == 0) {
               if (var3.bH != null) {
                  a(var3.bH, var1);
               }

               jR var4;
               if (var3.s * -744024149 == -1 && (var4 = (jR)gb.a(client.bT, (long)var3.m)) != null) {
                  y.a(var4.d, var1);
               }
            }

            jK var5;
            if (var1 == 0 && var3.bl != null) {
               (var5 = new jK()).j = var3;
               var5.g = var3.bl;
               fW.a(var5);
            }

            fd var6;
            if (var1 == 1 && var3.bn != null && (var3.s * -744024149 < 0 || (var6 = jD.a.b(var3.m)) != null && var6.bH != null && var3.s * -744024149 < var6.bH.length && var6.bH[var3.s * -744024149] == var3)) {
               (var5 = new jK()).j = var3;
               var5.g = var3.bn;
               fW.a(var5);
            }
         }
      }

   }
}
