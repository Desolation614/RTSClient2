package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public final class O {
   @ObfuscatedName("ai")
   int[] a;
   @ObfuscatedName("aj")
   boolean b;
   @ObfuscatedName("al")
   boolean[] c;
   @ObfuscatedName("an")
   int[] d;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Ldq;"
   )
   kj e;

   @ObfuscatedSignature(
      signature = "(Ldq;Z[I[I[Z)V"
   )
   O(kj var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
      this.e = var1;
      this.b = var2;
      this.d = var3;
      this.a = var4;
      this.c = var5;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "734391722"
   )
   final void a(int var1, int var2) {
      while(var1 < var2) {
         int var3 = var1;
         int var4 = this.d[var1];
         int var5 = this.a[var1];
         boolean var6 = this.c[var1];

         for(int var7 = var1 + 1; var7 <= var2; ++var7) {
            int var8;
            if ((var8 = this.d[var7]) < var4) {
               this.d[var3] = var8;
               int[] var10002 = this.a;
               var10002[var3] = var10002[var7];
               boolean[] var9 = this.c;
               var9[var3] = var9[var7];
               ++var3;
               var10002 = this.d;
               var10002[var7] = var10002[var3];
               var10002 = this.a;
               var10002[var7] = var10002[var3];
               var9 = this.c;
               var9[var7] = var9[var3];
            }
         }

         this.d[var3] = var4;
         this.a[var3] = var5;
         this.c[var3] = var6;
         this.a(var1, var3 - 1);
         var1 = var3 + 1;
         this = this;
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "-82"
   )
   static void a(String var0, String var1, String var2) {
      jW.a(7);
      dY.a(var0, var1, var2);
   }

   @ObfuscatedName("la")
   @ObfuscatedSignature(
      signature = "(Ldl;Lwx;I)V",
      garbageValue = "-1626412502"
   )
   static void a(kd var0, jo var1) {
      client.d(var0);
      kd var2;
      (var2 = ec.a).n = var1.d();
      var2.i = var1.d();
      int var3 = var2.d / 8;
      int var4 = var2.c / 8;
      int var5 = var1.d();
      var1.P();

      int var6;
      int var7;
      int var8;
      for(var6 = 0; var6 < 4; ++var6) {
         for(var7 = 0; var7 < var3; ++var7) {
            for(var8 = 0; var8 < var4; ++var8) {
               if (var1.s(1) == 1) {
                  client.cR[var6][var7][var8] = var1.s(26);
               } else {
                  client.cR[var6][var7][var8] = -1;
               }
            }
         }
      }

      jo.j(var1, -1906504182);
      I.c = new int[var5][4];

      for(var6 = 0; var6 < var5; ++var6) {
         for(var7 = 0; var7 < 4; ++var7) {
            I.c[var6][var7] = jk.d((jk)var1, 1687107415);
         }
      }

      bp.b = new int[var5];
      cN.a = new int[var5];
      bO.a = new int[var5];
      ie.a = new byte[var5][];
      dh.e = new byte[var5][];
      var5 = 0;

      for(var6 = 0; var6 < 4; ++var6) {
         for(var7 = 0; var7 < var3; ++var7) {
            for(var8 = 0; var8 < var4; ++var8) {
               int var9;
               if ((var9 = client.cR[var6][var7][var8]) != -1) {
                  int var10 = ey.a(var9);
                  var9 = dk.b(var9);
                  var10 = (var10 / 8 << 8) + var9 / 8;

                  for(var9 = 0; var9 < var5; ++var9) {
                     if (bp.b[var9] == var10) {
                        var10 = -1;
                        break;
                     }
                  }

                  if (var10 != -1) {
                     bp.b[var5] = var10;
                     var9 = var10 >> 8 & 255;
                     var10 &= 255;
                     cN.a[var5] = bn.d.b("m" + var9 + "_" + var10);
                     bO.a[var5] = bn.d.b("l" + var9 + "_" + var10);
                     ++var5;
                  }
               }
            }
         }
      }

      jT.d(25);
      client.ct = true;
      aC.a = var2;
      ag.a(var2);
      client.c(var0);
   }
}
