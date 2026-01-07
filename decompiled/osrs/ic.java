package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ul")
public final class ic extends hS {
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "Lov;"
   )
   static fd a;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1616583149
   )
   private int c = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1771360099
   )
   private int d = 0;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -771800985
   )
   private int e = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1695836109
   )
   private int f = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1763489345
   )
   private int g = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 221408973
   )
   private int h = 0;

   public ic(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var7, var8);
      this.h = var1;
      this.e = var2;
      this.g = var3;
      this.d = var4;
      this.f = var5;
      this.c = var6;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2133851745"
   )
   public final int a() {
      double var1 = super.b;
      return (int)Math.round((double)(this.d - this.h) * var1 + (double)this.h);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "77"
   )
   public final int b() {
      double var1 = super.b;
      return (int)Math.round((double)this.g + var1 * (double)(this.c - this.g));
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "2145780228"
   )
   public final int c() {
      double var1 = super.b;
      return (int)Math.round((double)this.e + (double)(this.f - this.e) * var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IIII)Lwd;",
      garbageValue = "-1383531260"
   )
   static iT a(int var0, int var1, int var2) {
      dK var3 = dk.a;
      long var4 = (long)(var2 << 16 | var0 << 8 | var1);
      return (iT)dK.a(var3, var4);
   }
}
