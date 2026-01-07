package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public final class at extends aG {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 307467737
   )
   private int a;
   @ObfuscatedName("an")
   private byte b;
   @ObfuscatedName("ap")
   private String c;
   @ObfuscatedSignature(
      signature = "Lgg;"
   )
   private aA d;

   @ObfuscatedSignature(
      signature = "(Lgg;)V"
   )
   at(aA var1) {
      this.d = var1;
      this.c = null;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lgd;B)V",
      garbageValue = "0"
   )
   final void a(aw var1) {
      af var2;
      (var2 = new af()).c = new jw(this.c);
      var2.b = this.a;
      var2.d = this.b;
      aw.a(var1, var2, 1054867355);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-830685594"
   )
   final void a(jk var1) {
      if (jk.a((jk)var1, (byte)5) != 255) {
         --var1.c;
         var1.e();
      }

      this.c = var1.k();
      this.a = var1.d();
      this.b = var1.B();
      var1.e();
   }
}
