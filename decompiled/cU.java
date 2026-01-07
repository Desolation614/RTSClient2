package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public final class cU {
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   static final cU a = new cU(6, 128, 128);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   static final cU b = new cU(0, 96, 96);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   static final cU c;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   static final cU d;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   static final cU e;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   static final cU f;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lkq;"
   )
   static final cU g;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 136649251
   )
   private int j;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1289016071
   )
   final int h;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1934162049
   )
   final int i;

   private cU(int var1, int var2, int var3) {
      this.j = var1;
      this.i = var2;
      this.h = var3;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "620059588"
   )
   final int a() {
      return this.h * this.i;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1078160846"
   )
   public static void b() {
      eY.a.b();
      eY.f.a();
      eY.c = 0;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(ZZB)Lwy;",
      garbageValue = "-18"
   )
   static jp a(boolean var0, boolean var1) {
      if (var0) {
         return var1 ? fs.p : kn.a;
      } else {
         return var1 ? gh.f : aR.a;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)Lmk;",
      garbageValue = "117"
   )
   public static dQ c() {
      return dQ.b == 0 ? new dQ() : dQ.a[--dQ.b];
   }

   static {
      cb.c();
      c = new cU(2, 48, 48);
      d = new cU(5, 16, 16);
      e = new cU(1, 64, 64);
      f = new cU(3, 32, 32);
      g = new cU(4, 8, 8);
   }
}
