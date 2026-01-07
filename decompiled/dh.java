package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
public final class dh {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Llc;"
   )
   public static final dh a;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Llc;"
   )
   public static final dh b;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Llc;"
   )
   public static final dh c;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Llc;"
   )
   public static final dh d;
   @ObfuscatedName("pz")
   static byte[][] e;
   @ObfuscatedName("ac")
   public final String f;

   private dh(String var1) {
      this.f = var1;
   }

   @ObfuscatedName("iz")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1152794419"
   )
   static final void a() {
      aM.a.o.b();

      for(int var0 = 0; var0 < aM.a.t.a; ++var0) {
         hG var1;
         if ((var1 = (hG)aM.a.l.b((long)aM.a.t.b[var0])) != null) {
            var1.e.o.b();
         }
      }

   }

   @ObfuscatedName("kp")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIIIIIILcp;I)V",
      garbageValue = "-934346104"
   )
   static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, jG var13) {
      bJ var22 = jT.b(var6);
      int var14;
      int var15;
      if (var4 != 1 && var4 != 3) {
         var14 = var22.q * -1313509743;
         var15 = var22.o;
      } else {
         var14 = var22.o;
         var15 = var22.q * -1313509743;
      }

      int var16 = (var14 >> 1) + var1;
      int var17 = (var14 + 1 >> 1) + var1;
      int var18 = (var15 >> 1) + var2;
      int var19 = var2 + (var15 + 1 >> 1);
      int[][] var20;
      var16 = (var20 = ec.a.s[var0])[var16][var18] + var20[var17][var18] + var20[var16][var19] + var20[var17][var19] >> 2;
      var17 = (var1 << 7) + (var14 << 6);
      var18 = (var2 << 7) + (var15 << 6);
      cn var21;
      if ((var21 = var22.a(var3, var4, var20, var17, var16, var18)) != null) {
         dF.a(ec.a, var0, var1, var2, var5, -1, 0, 0, 31, (String[])null, var7 + 1, var8 + 1);
         var13.aX = var7 + client.Z;
         var13.aR = var8 + client.Z;
         var13.be = var21;
         var13.bb = (var14 << 6) + (var1 << 7);
         var13.aP = (var2 << 7) + (var15 << 6);
         var13.bh = var16 * -1227879605;
         if (var9 > var11) {
            var0 = var9;
            var9 = var11;
            var11 = var0;
         }

         if (var10 > var12) {
            var0 = var10;
            var10 = var12;
            var12 = var0;
         }

         var13.aY = var9 + var1;
         var13.aZ = var11 + var1;
         var13.aD = var10 + var2;
         var13.aF = var2 + var12;
      }

   }

   static {
      new dh("area");
      a = new dh("compositemap");
      b = new dh("labels");
      c = new dh("compositetexture");
      d = new dh("details");
   }
}
