package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uj")
public final class hZ extends hS {
   @ObfuscatedName("aa")
   private double a = 0.0D;
   @ObfuscatedName("ac")
   private double c = 0.0D;
   @ObfuscatedName("ai")
   private double d = 0.0D;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -266566681
   )
   private int e = 0;
   @ObfuscatedName("al")
   private double f = 0.0D;
   @ObfuscatedName("an")
   private double g = 0.0D;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -600395387
   )
   private int h = 0;

   public hZ(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var9, var10);
      this.h = var3;
      this.e = var6;
      if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
         this.g = (double)var4;
         this.d = (double)var5;
      } else {
         double var11 = (double)((float)(var7 + var1)) / 2.0D;
         double var13 = (double)((float)(var8 + var2)) / 2.0D;
         double var15 = (double)((float)(var4 + var7)) / 2.0D;
         double var17 = (double)((float)(var5 + var8)) / 2.0D;
         double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
         double var21 = -((double)(var4 - var7)) / (double)(var5 - var8);
         this.g = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
         this.d = var13 + var19 * (this.g - var11);
         this.f = Math.sqrt(Math.pow(this.g - (double)var1, 2.0D) + Math.pow(this.d - (double)var2, 2.0D));
         this.c = Math.atan2((double)var2 - this.d, (double)var1 - this.g);
         double var23 = Math.atan2((double)var8 - this.d, (double)var7 - this.g);
         this.a = Math.atan2((double)var5 - this.d, (double)var4 - this.g);
         if ((!(this.c <= var23) || !(var23 <= this.a)) && (!(this.a <= var23) || !(var23 <= this.c))) {
            this.a += (double)(this.c - this.a > 0.0D ? 2 : -2) * 3.141592653589793D;
         }

      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2133851745"
   )
   public final int a() {
      double var3 = super.b * (this.a - this.c) + this.c;
      return (int)Math.round(this.g + this.f * Math.cos(var3));
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "77"
   )
   public final int b() {
      double var1 = super.b;
      return (int)Math.round((double)this.h + (double)(this.e - this.h) * var1);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "2145780228"
   )
   public final int c() {
      double var1 = super.b;
      double var3 = this.c + (this.a - this.c) * var1;
      return (int)Math.round(this.d + this.f * Math.sin(var3));
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Lqt;II)Lmk;",
      garbageValue = "-745180121"
   )
   public static dQ a(int var0, String var1, int var2) {
      dQ var3;
      (var3 = X.a(j.y, client.P.f)).g.b(0);
      int var4 = var3.g.c;
      var3.g.b(var0);
      String var5 = var1.toLowerCase();
      int var6 = 0;
      byte[] var7 = null;
      if (var5.startsWith("yellow:")) {
         var6 = 0;
         var1 = var1.substring(7);
      } else if (var5.startsWith("red:")) {
         var6 = 1;
         var1 = var1.substring(4);
      } else if (var5.startsWith("green:")) {
         var6 = 2;
         var1 = var1.substring(6);
      } else if (var5.startsWith("cyan:")) {
         var6 = 3;
         var1 = var1.substring(5);
      } else if (var5.startsWith("purple:")) {
         var6 = 4;
         var1 = var1.substring(7);
      } else if (var5.startsWith("white:")) {
         var6 = 5;
         var1 = var1.substring(6);
      } else if (var5.startsWith("flash1:")) {
         var6 = 6;
         var1 = var1.substring(7);
      } else if (var5.startsWith("flash2:")) {
         var6 = 7;
         var1 = var1.substring(7);
      } else if (var5.startsWith("flash3:")) {
         var6 = 8;
         var1 = var1.substring(7);
      } else if (var5.startsWith("glow1:")) {
         var6 = 9;
         var1 = var1.substring(6);
      } else if (var5.startsWith("glow2:")) {
         var6 = 10;
         var1 = var1.substring(6);
      } else if (var5.startsWith("glow3:")) {
         var6 = 11;
         var1 = var1.substring(6);
      } else if (var5.startsWith("rainbow:")) {
         var6 = 12;
         var1 = var1.substring(8);
      } else if (var5.startsWith("pattern") && (var7 = ju.a(var5)) != null) {
         var6 = var7.length + 12;
         var1 = var1.substring(7 + var7.length + 1);
      }

      var5 = var1.toLowerCase();
      byte var8 = 0;
      if (var5.startsWith("wave:")) {
         var8 = 1;
         var1 = var1.substring(5);
      } else if (var5.startsWith("wave2:")) {
         var8 = 2;
         var1 = var1.substring(6);
      } else if (var5.startsWith("shake:")) {
         var8 = 3;
         var1 = var1.substring(6);
      } else if (var5.startsWith("scroll:")) {
         var8 = 4;
         var1 = var1.substring(7);
      } else if (var5.startsWith("slide:")) {
         var8 = 5;
         var1 = var1.substring(6);
      }

      var3.g.b(var6);
      var3.g.b(var8);
      if (var7 != null) {
         for(int var9 = 0; var9 < var7.length; ++var9) {
            var3.g.b(var7[var9]);
         }
      }

      M.a(var3.g, var1);
      if (var0 == fa.a.b) {
         var3.g.b(var2);
      }

      var3.g.l(var3.g.c - var4);
      return var3;
   }
}
