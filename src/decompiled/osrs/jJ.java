package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public final class jJ {
   @ObfuscatedName("aj")
   final int a;
   @ObfuscatedName("an")
   private String b;
   @ObfuscatedName("ap")
   private int c;

   @ObfuscatedSignature(
      signature = "(Lwt;)V"
   )
   jJ(jk var1) {
      this(jk.a(var1, (byte)-1), jk.a((jk)var1, (byte)117), var1.p());
   }

   private jJ(int var1, int var2, String var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   @ObfuscatedName("wm")
   @ObfuscatedSignature(
      signature = "(Lah;)Ljava/lang/String;"
   )
   public static String a(jJ var0) {
      String var10000 = Integer.toHexString(var0.c);
      return var10000 + Integer.toHexString(var0.a) + var0.b;
   }
}
