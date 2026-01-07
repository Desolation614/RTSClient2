package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public final class cy {
   @ObfuscatedName("ai")
   byte a = 0;
   @ObfuscatedName("aj")
   byte b = -1;
   @ObfuscatedName("an")
   byte c = -1;
   @ObfuscatedName("ap")
   byte d = -1;

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Ljw;)V"
   )
   final void a(cy var1) {
      this.d = var1.d;
      this.b = var1.b;
      this.c = var1.c;
      this.a = var1.a;
   }

   @ObfuscatedName("ai")
   public final boolean a() {
      return this.a > 0;
   }

   @ObfuscatedName("aj")
   public final void a(byte var1, byte var2, byte var3, byte var4) {
      this.d = var1;
      this.b = var2;
      this.c = var3;
      this.a = var4;
   }

   @ObfuscatedName("an")
   public final void b() {
      this.d = -1;
      this.b = -1;
      this.c = -1;
      this.a = 0;
   }
}
