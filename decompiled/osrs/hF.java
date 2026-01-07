package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
public final class hF extends hJ {
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -951086109
   )
   private static int a;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -795039625
   )
   private int b = 0;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lks;"
   )
   private cW c = new cW();
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1909085059
   )
   private int d = 0;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lks;"
   )
   private cW e = new cW();

   hF() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lks;III)Z",
      garbageValue = "1653046752"
   )
   final boolean a(cW var1, int var2) {
      cW var9;
      if (this.b >= this.d) {
         var9 = this.e;
         var1.a(var9);
         return true;
      } else {
         float var10000 = (float)var2 + (float)bR.b;
         int var5 = this.d;
         int var4 = this.b;
         float var8 = (var10000 - (float)var4) / (float)(var5 - var4);
         float var10 = var8;
         var9 = this.e;
         cW var3 = this.c;
         if (var8 < 0.0F) {
            var10 = 0.0F;
         }

         if (var10 > 1.0F) {
            var10 = 1.0F;
         }

         int var6 = var9.b - var3.b;
         int var7 = var9.c - var3.c;
         var6 = (int)(var10 * (float)var6);
         var7 = (int)(var10 * (float)var7);
         var1.b = var6 + var3.b;
         var1.c = var7 + var3.c;
         if ((var4 = var9.d - var3.d & 2047) > 1024) {
            var4 = -(2048 - var4);
         }

         var4 = (int)((float)var4 * var10);
         var1.d = var4 + var3.d & 2047;
         return var8 >= 1.0F;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-112"
   )
   final void a(int var1, int var2) {
      cW.a(this.c, var1, var2);
      cW.a(this.e, var1, var2);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lks;Lta;IB)V",
      garbageValue = "-111"
   )
   final void a(cW var1, ho var2, int var3) {
      this.c.a(var1);
      this.e.a(var2.b);
      this.b = var3 - 1;
      this.d = var2.a + a;
   }

   static {
      a = client.aE * 1513150813 + 3;
   }
}
