package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public final class U extends aG {
   @ObfuscatedName("ai")
   private String a;
   @ObfuscatedName("aj")
   private byte b;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1373437449
   )
   private int c;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -303517089
   )
   private int d;
   @ObfuscatedSignature(
      signature = "Lgg;"
   )
   private aA e;

   @ObfuscatedSignature(
      signature = "(Lgg;)V"
   )
   U(aA var1) {
      this.e = var1;
      this.d = -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lgd;B)V",
      garbageValue = "0"
   )
   final void a(aw var1) {
      af var2;
      (var2 = (af)var1.f.get(this.d)).d = this.b;
      var2.b = this.c;
      var2.c = new jw(this.a);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-830685594"
   )
   final void a(jk var1) {
      this.d = var1.d();
      this.b = var1.B();
      this.c = var1.d();
      var1.e();
      this.a = var1.p();
   }
}
