package osrs;

import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public final class ke implements Callable {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   static fB a;
   @ObfuscatedName("gz")
   @ObfuscatedGetter(
      intValue = -145746093
   )
   static int b;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lai;"
   )
   private jU c;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lwt;"
   )
   private jk d;
   @ObfuscatedSignature(
      signature = "Lam;"
   )
   private I e;

   @ObfuscatedSignature(
      signature = "(Lam;Lwt;Lai;)V"
   )
   ke(I var1, jk var2, jU var3) {
      this.e = var1;
      this.d = var2;
      this.c = var3;
   }

   public final Object call() {
      return this.c.a(this.d);
   }

   @ObfuscatedName("lx")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1771689453"
   )
   static final boolean a(int var0) {
      if (var0 >= 2000) {
         var0 -= 2000;
      }

      return var0 == 1007;
   }

   @ObfuscatedName("oh")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "103"
   )
   static boolean a() {
      return j.aS.k * 617413103 >= client.bu;
   }

   @ObfuscatedName("ow")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1256300723"
   )
   static void b(int var0) {
      client.az = var0;
   }
}
