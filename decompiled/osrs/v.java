package osrs;

import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ed")
public final class v extends gR {
   @ObfuscatedName("ak")
   static ScheduledExecutorService a;
   @ObfuscatedName("ap")
   private boolean b;

   public v(boolean var1) {
      this.b = var1;
   }

   public final int compare(Object var1, Object var2) {
      gX var10001 = (gX)var1;
      gX var3 = (gX)var2;
      gX var4 = var10001;
      int var10000;
      if (var3.d != var4.d) {
         if (!this.b) {
            return var3.d - var4.d;
         }

         var10000 = var4.d - var3.d;
      } else {
         var10000 = this.a(var4, var3);
      }

      return var10000;
   }
}
