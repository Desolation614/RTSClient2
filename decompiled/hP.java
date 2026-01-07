package osrs;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
public final class hP {
   @ObfuscatedName("aj")
   private Future a;
   @ObfuscatedName("ap")
   private ExecutorService b = Executors.newSingleThreadExecutor();

   hP() {
      this.a = this.b.submit(new jt());
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "672314543"
   )
   final boolean a() {
      return this.a.isDone();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)Ljava/security/SecureRandom;",
      garbageValue = "1011430894"
   )
   final SecureRandom b() {
      try {
         return (SecureRandom)this.a.get();
      } catch (Exception var2) {
         SecureRandom var1;
         (var1 = new SecureRandom()).nextInt();
         return var1;
      }
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "(Lca;I)V"
   )
   public static void a(hP var0, int var1) {
      if (var0 == null) {
         var0.b.shutdown();
         var0.b = null;
      } else {
         var0.b.shutdown();
         var0.b = null;
      }
   }
}
