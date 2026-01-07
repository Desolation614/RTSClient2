package osrs;

import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public final class fr {
   @ObfuscatedName("aj")
   String a;
   @ObfuscatedName("ap")
   private Future b;

   fr(Future var1) {
      this.b = var1;
   }

   fr(String var1) {
      this.a(var1);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-366500020"
   )
   public final boolean a() {
      return a(this, 2146385787) ? true : this.b.isDone();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "16711680"
   )
   private void a(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.a = var1;
      if (this.b != null) {
         this.b.cancel(true);
         this.b = null;
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(B)Lao;",
      garbageValue = "0"
   )
   public final ac b() {
      if (a(this, -181473305)) {
         return new ac(this.a);
      } else if (!this.a()) {
         return null;
      } else {
         try {
            return (ac)this.b.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + String.valueOf(var3));
            this.a(var2);
            return new ac(var2);
         }
      }
   }

   @ObfuscatedName("an")
   private boolean c() {
      return a(this, 2146385787) ? true : this.b.isDone();
   }

   @ObfuscatedName("qm")
   @ObfuscatedSignature(
      signature = "(Lae;I)Z"
   )
   public static boolean a(fr var0, int var1) {
      if (var0 == null) {
         return var0.c();
      } else {
         return var0.a != null || var0.b == null;
      }
   }
}
