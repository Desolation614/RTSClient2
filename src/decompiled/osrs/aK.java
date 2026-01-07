package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public final class aK extends ak {
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      signature = "Lwy;"
   )
   static jp a;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      longValue = -3973325281832991069L
   )
   private long b;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 409837471
   )
   private int c;
   @ObfuscatedSignature(
      signature = "Lfp;"
   )
   private ai d;

   @ObfuscatedSignature(
      signature = "(Lfp;)V"
   )
   aK(ai var1) {
      this.d = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lgu;I)V",
      garbageValue = "-1572789515"
   )
   final void a(aP var1) {
      aP.a(var1, this.c, this.b);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-1635342078"
   )
   final void a(jk var1) {
      this.c = jk.d(var1, 1687107415);
      this.b = var1.e();
   }
}
