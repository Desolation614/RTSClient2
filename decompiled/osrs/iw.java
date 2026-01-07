package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vf")
public final class iw {
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "Lvf;"
   )
   public static final iw a;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lvf;"
   )
   private static iw d;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lvf;"
   )
   private static iw e;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lvf;"
   )
   private static iw f;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lvf;"
   )
   private static iw g;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lvf;"
   )
   public static final iw b;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1825474443
   )
   final int c;
   @ObfuscatedName("au")
   private String h;

   private iw(int var1, String var2, byte var3) {
      this.c = var1;
      this.h = var2;
   }

   @ObfuscatedSignature(
      signature = "(IILjava/lang/String;Ljava/lang/String;Z[Lvf;)V"
   )
   private iw(int var1, String var2) {
      this.c = 1;
      this.h = var2;
   }

   public final String toString() {
      return this.h;
   }

   static {
      new iw(6, "", (byte)0);
      new iw(8, "", (byte)0);
      d = new iw(4, "", (byte)0);
      e = new iw(7, "", (byte)0);
      f = new iw(3, "", (byte)0);
      new iw(5, "", (byte)0);
      g = new iw(2, "", (byte)0);
      b = new iw(0, "", (byte)0);
      iw[] var10004 = new iw[]{b, e, g, f, d};
      a = new iw(1, "");
   }
}
