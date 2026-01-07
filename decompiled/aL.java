package osrs;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public final class aL extends im {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   public static dX a = new dX(64);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   static fB b;
   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      signature = "Lii;"
   )
   static bH c;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1935930757
   )
   public int d = 0;

   aL() {
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(Lin;III)Ldc;",
      garbageValue = "-786099370"
   )
   public static final jV a(int var0, int var1) {
      if (B.a == 0) {
         throw new IllegalStateException();
      } else {
         try {
            ax var3;
            (var3 = bq.e.a()).d = new int[(jV.a ? 2 : 1) << 8];
            var3.c = 2048;
            var3.e();
            var3.e = 3072;
            if (var3.e > 16384) {
               var3.e = 16384;
            }

            var3.a(var3.e);
            if (gd.e > 0 && by.a == null) {
               by.a = new jS();
               (v.a = Executors.newScheduledThreadPool(1)).scheduleAtFixedRate(by.a, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (by.a != null) {
               if (by.a.a[0] != null) {
                  throw new IllegalArgumentException();
               }

               by.a.a[0] = var3;
            }

            return var3;
         } catch (Throwable var2) {
            client.a(var2);
            return new jV();
         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)Lhm;",
      garbageValue = "2095563352"
   )
   public static bi a(int var0) {
      return var0 >= 0 && var0 < bi.b.length && bi.b[var0] != null ? bi.b[var0] : new bi(var0);
   }

   @ObfuscatedName("lq")
   @ObfuscatedSignature(
      signature = "(Lgq;Lwt;I)V"
   )
   public static void a(aL var0, jk var1, int var2) {
      while((var2 = jk.a((jk)var1, (byte)103)) != 0) {
         if (var0 == null) {
            if (var2 == 2) {
               var0.d = var1.J();
            }
         } else if (var2 == 2) {
            var0.d = var1.d();
         }
      }

   }
}
