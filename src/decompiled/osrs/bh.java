package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public final class bh extends im {
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
   @ObfuscatedName("ac")
   boolean c = true;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 116433547
   )
   public int d;
   @ObfuscatedName("al")
   public String e;
   @ObfuscatedName("an")
   private char f;

   bh() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1089998298"
   )
   public final boolean a() {
      return this.f == 's';
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-522712173"
   )
   final void a(jk var1) {
      int var2;
      while((var2 = jk.a(var1, (byte)-29)) != 0) {
         if (var2 == 1) {
            int var3;
            if ((var3 = var1.B() & 255) == 0) {
               throw new IllegalArgumentException(Integer.toString(var3, 16).makeConcatWithConstants<invokedynamic>(Integer.toString(var3, 16)));
            }

            char var5;
            if (var3 >= 128 && var3 < 160) {
               if ((var5 = fX.a[var3 - 128]) == 0) {
                  var5 = '?';
               }

               var3 = var5;
            }

            var5 = (char)var3;
            this.f = var5;
         } else if (var2 == 2) {
            this.d = jk.d(var1, 1687107415);
         } else if (var2 == 4) {
            this.c = false;
         } else if (var2 == 5) {
            this.e = var1.p();
         }
      }

   }
}
