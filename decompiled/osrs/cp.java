package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public final class cp {
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 545193269
   )
   int a;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 850764827
   )
   int b;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 290545899
   )
   int c;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -182720187
   )
   int d;

   cp() {
   }

   @ObfuscatedSignature(
      signature = "(Ljo;)V"
   )
   cp(cp var1) {
      this.d = var1.d;
      this.b = var1.b;
      this.c = var1.c;
      this.a = var1.a;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "794047741"
   )
   public static int a(int var0) {
      return ij.a[var0 & 2047];
   }

   @ObfuscatedName("ls")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIIII)I",
      garbageValue = "1486832800"
   )
   static final int a(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      return fh.a(var0, var1, var2, var3, var4, var5, var6, false, -1);
   }
}
