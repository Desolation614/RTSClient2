package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
final class jW implements ez {
   @ObfuscatedSignature(
      signature = "Lov;"
   )
   private fd a;

   @ObfuscatedSignature(
      signature = "(Lov;)V"
   )
   jW(fd var1) {
      this.a = var1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "96"
   )
   public final void a() {
      if (this.a.bS.b != null) {
         jK var1;
         jK var10000 = var1 = new jK();
         fd var3 = this.a;
         var10000.j = var3;
         Object[] var4 = this.a.bS.b;
         var1.g = var4;
         fU.a((fU)client.cf, var1);
      }

   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "64"
   )
   static void a(int var0) {
      if (var0 != jB.l) {
         jB.l = var0;
      }

   }
}
