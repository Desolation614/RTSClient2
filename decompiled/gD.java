package osrs;

import net.runelite.api.AmbientSoundEffect;
import net.runelite.api.coords.LocalPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
public final class gD extends hR implements AmbientSoundEffect {
   @ObfuscatedName("ob")
   @ObfuscatedSignature(
      signature = "Ltg;"
   )
   static hw a;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "Lik;"
   )
   final bJ b;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 550171561
   )
   final int c;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 229689935
   )
   int d;
   @ObfuscatedName("af")
   int[] e;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 443155313
   )
   int f;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 2091518745
   )
   int g;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1842172823
   )
   final int h;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -275650299
   )
   final int i;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 2140607899
   )
   int j;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1170668485
   )
   final int k;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 443155313
   )
   int l;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -2085882123
   )
   final int m;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1131180031
   )
   final int n;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 106761089
   )
   int o;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "Ldw;"
   )
   o p;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "Ldw;"
   )
   o q;

   @ObfuscatedSignature(
      signature = "(IIIIILik;)V"
   )
   gD(int var1, int var2, int var3, int var4, int var5, bJ var6) {
      this.n = var1;
      this.i = var2;
      this.m = var3 << 7;
      this.h = var4 << 7;
      var1 = var6.q * -1313509743;
      var2 = var6.o;
      if (var5 == 1 || var5 == 3) {
         var1 = var6.o;
         var2 = var6.q * -1313509743;
      }

      this.k = var3 + var1 << 7;
      this.c = var2 + var4 << 7;
      this.f = var6.I * -2021239871;
      this.l = var6.M << 7;
      this.g = Math.max(var6.L - 1 << 7, 0);
      this.o = var6.F * 1311063897;
      this.d = var6.A;
      this.e = var6.y;
      if (var6.v != null) {
         this.b = var6;
      } else {
         this.b = null;
      }

      if (this.e != null) {
         this.j = this.o + (int)(Math.random() * (double)(this.d * 316223597 - this.o));
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-760509835"
   )
   final void a() {
      if (this.p != null) {
         N.a.a(this.p);
         this.p = null;
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "567966176"
   )
   final void b() {
      if (this.q != null) {
         N.a.a(this.q);
         this.q = null;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-51"
   )
   final void c() {
      int var1 = this.f * -31212479;
      bJ var2;
      if ((var2 = bJ.b(this.b, (byte)0)) != null) {
         this.f = var2.I * -2021239871;
         this.l = var2.M << 7;
         this.g = var2.L << 7;
         this.o = var2.F * 1311063897;
         this.d = var2.A;
         this.e = var2.y;
      } else {
         this.f = 2021239871;
         this.l = 0;
         this.g = 0;
         this.o = 0;
         this.d = 0;
         this.e = null;
      }

      if (this.f * -31212479 != var1) {
         this.a();
      }

   }

   public final int getSoundEffectId() {
      return this.f * -31212479;
   }

   public final LocalPoint getMinPosition() {
      return new LocalPoint(this.m, this.h, ai.a.z);
   }

   public final LocalPoint getMaxPosition() {
      return new LocalPoint(this.k, this.c, ai.a.z);
   }

   public final int[] getBackgroundSoundEffectIds() {
      return this.e;
   }

   public final int getPlane() {
      return this.i;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "20427667"
   )
   static final int a(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      var0 &= var2 - 1;
      int var4 = var1 / var2;
      var1 &= var2 - 1;
      int var5 = ba.a(var3, var4);
      int var6 = ba.a(var3 + 1, var4);
      int var7 = ba.a(var3, var4 + 1);
      var3 = ba.a(var3 + 1, var4 + 1);
      var4 = cE.a(var5, var6, var0, var2);
      var0 = cE.a(var7, var3, var0, var2);
      return cE.a(var4, var0, var1, var2);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[IIII)V",
      garbageValue = "-586527781"
   )
   public static void a(String[] var0, int[] var1, int var2, int var3) {
      while(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(var4 = var2; var4 < var3; ++var4) {
            if (var6 == null || var0[var4] != null && var0[var4].compareTo(var6) < (var4 & 1)) {
               String var8 = var0[var4];
               var0[var4] = var0[var5];
               var0[var5] = var8;
               int var9 = var1[var4];
               var1[var4] = var1[var5];
               var1[var5++] = var9;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         a(var0, var1, var2, var5 - 1);
         var2 = var5 + 1;
         var1 = var1;
         var0 = var0;
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lqp;III)I",
      garbageValue = "-405545737"
   )
   static int a(ga var0, int var1, int var2) {
      if (var0 == null) {
         return var2;
      } else {
         io var3;
         return (var3 = (io)var0.b((long)var1)) == null ? var2 : var3.a;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "502005707"
   )
   public static void d() {
      dF.b = new fR();
   }

   @ObfuscatedName("np")
   @ObfuscatedSignature(
      signature = "(Lbu;I)I"
   )
   public static int a(gD var0, int var1) {
      if (var0 == null) {
         int var10000 = var0.f;
      }

      return var0.l;
   }
}
