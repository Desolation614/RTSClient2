package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public final class fj implements fN {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lpb;"
   )
   public static final fj a = new fj(2);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lpb;"
   )
   public static final fj b = new fj(0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lpb;"
   )
   public static final fj c = new fj(1);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lpb;"
   )
   public static final fj d = new fj(-1);
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1888819729
   )
   private int e;

   private fj(int var1) {
      this.e = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.e;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/Class;",
      garbageValue = "564155374"
   )
   static Class a(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (var0.equals("J")) {
         return Long.TYPE;
      } else if (var0.equals("Z")) {
         return Boolean.TYPE;
      } else if (var0.equals("F")) {
         return Float.TYPE;
      } else if (var0.equals("D")) {
         return Double.TYPE;
      } else if (var0.equals("C")) {
         return Character.TYPE;
      } else {
         return var0.equals("void") ? Void.TYPE : Class.forName(var0);
      }
   }

   @ObfuscatedName("mo")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-210350458"
   )
   static final String a(int var0) {
      return var0 < 999999999 ? Integer.toString(var0) : "*";
   }
}
