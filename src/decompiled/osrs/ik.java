package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
public final class ik extends hR {
   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static aw a;
   @ObfuscatedName("lx")
   @ObfuscatedGetter(
      intValue = -896334133
   )
   static int b;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -166971769
   )
   int c;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1164039879
   )
   int d;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1217862617
   )
   int e = 0;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1567800059
   )
   int f = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1823725945
   )
   int g;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 895143665
   )
   int h;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 55581095
   )
   int i;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1209225183
   )
   int j;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1501047539
   )
   private int q = 31;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1626548053
   )
   int k;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -968275809
   )
   int l;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 2100731413
   )
   int m;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -99312829
   )
   int n;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 762403611
   )
   int o;
   @ObfuscatedName("az")
   String[] p;

   ik() {
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      signature = "(Lcc;II)Z",
      garbageValue = "-833030301"
   )
   public static boolean a(ik var0, int var1) {
      if (var0 == null) {
         boolean var10000;
         if (var1 >= 0 && var1 <= 4) {
            if ((var0.g * -809862965 & 1 << var1) != 0) {
               var10000 = true;
            } else {
               var10000 = false;
            }
         } else {
            var10000 = true;
         }
      }

      if (var1 >= 0 && var1 <= 4) {
         return (var0.q & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("pk")
   @ObfuscatedSignature(
      signature = "(Lcc;IB)V"
   )
   public static void a(ik var0, int var1, byte var2) {
      if (var0 == null) {
         var0.c = var1 * 940080355;
      }

      var0.q = var1;
   }
}
