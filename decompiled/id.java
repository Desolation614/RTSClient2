package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
public final class id extends il {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -832331107
   )
   private int a = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -405435121
   )
   private int c = 0;

   public id(int var1, int var2, int var3, int var4) {
      super(var3, var4);
      this.c = var1;
      this.a = var2;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-316731460"
   )
   public final int a() {
      double var1 = super.b;
      return (int)Math.round((double)this.c + (double)(this.a - this.c) * var1);
   }

   @ObfuscatedName("nx")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-75"
   )
   static final void a(int var0) {
      if ((var0 = Math.min(Math.max(var0, 0), 255)) != j.aS.n) {
         if (j.aS.n == 0 && hE.a()) {
            bb.a(fW.c, var0);
            client.cz = false;
         } else if (var0 == 0) {
            ac.a(0, 0);
            client.cz = false;
         } else {
            r.a(var0);
         }

         jD.b(j.aS, var0);
      }

   }
}
