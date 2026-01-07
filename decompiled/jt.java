package osrs;

import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public final class jt implements Callable {
   jt() {
   }

   public final Object call() {
      SecureRandom var1;
      (var1 = new SecureRandom()).nextInt();
      return var1;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Lre;I)Lre;",
      garbageValue = "69677009"
   )
   public static go a(go var0) {
      synchronized(go.c) {
         if (fG.a == 0) {
            return new go(var0);
         } else {
            go.c[--fG.a].a(var0.g, var0.f, var0.h);
            return go.c[fG.a];
         }
      }
   }
}
