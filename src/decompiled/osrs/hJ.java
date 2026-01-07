package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tu")
public abstract class hJ {
   hJ() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lks;III)Z",
      garbageValue = "1653046752"
   )
   abstract boolean a(cW var1, int var2);

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-112"
   )
   abstract void a(int var1, int var2);

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lks;Lta;IB)V",
      garbageValue = "-111"
   )
   abstract void a(cW var1, ho var2, int var3);

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(IIIB)D",
      garbageValue = "-40"
   )
   static double a(int var0, int var1, int var2) {
      double var3;
      if (!((var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D) <= 0.0D) && !(var3 >= 1.0D)) {
         switch(var2) {
         case 0:
            return var3;
         case 1:
            return 1.0D - Math.cos(var3 * 3.141592653589793D / 2.0D);
         case 2:
            return Math.sin(var3 * 3.141592653589793D / 2.0D);
         case 3:
            return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D;
         case 4:
            return var3 * var3;
         case 5:
            return 1.0D - (1.0D - var3) * (1.0D - var3);
         case 6:
            if (var3 < 0.5D) {
               return var3 * 2.0D * var3;
            }

            return 1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D) / 2.0D;
         case 7:
            return var3 * var3 * var3;
         case 8:
            return 1.0D - Math.pow(1.0D - var3, 3.0D);
         case 9:
            if (var3 < 0.5D) {
               return var3 * 4.0D * var3 * var3;
            }

            return 1.0D - Math.pow(var3 * -2.0D + 2.0D, 3.0D) / 2.0D;
         case 10:
            return var3 * var3 * var3 * var3;
         case 11:
            return 1.0D - Math.pow(1.0D - var3, 4.0D);
         case 12:
            if (var3 < 0.5D) {
               return var3 * var3 * var3 * 8.0D * var3;
            }

            return 1.0D - Math.pow(2.0D + var3 * -2.0D, 4.0D) / 2.0D;
         case 13:
            return var3 * var3 * var3 * var3 * var3;
         case 14:
            return 1.0D - Math.pow(1.0D - var3, 5.0D);
         case 15:
            if (var3 < 0.5D) {
               return var3 * var3 * 8.0D * var3 * var3 * var3;
            }

            return 1.0D - Math.pow(2.0D + var3 * -2.0D, 5.0D) / 2.0D;
         case 16:
            return Math.pow(2.0D, var3 * 10.0D - 10.0D);
         case 17:
            return 1.0D - Math.pow(2.0D, var3 * -10.0D);
         case 18:
            if (var3 < 0.5D) {
               return Math.pow(2.0D, var3 * 20.0D + 10.0D) / 2.0D;
            }

            return (2.0D - Math.pow(2.0D, var3 * -20.0D + 10.0D)) / 2.0D;
         case 19:
            return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D));
         case 20:
            return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D));
         case 21:
            if (var3 < 0.5D) {
               return (1.0D - Math.sqrt(1.0D - Math.pow(var3 * 2.0D, 2.0D))) / 2.0D;
            }

            return (Math.sqrt(1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D)) + 1.0D) / 2.0D;
         case 22:
            return var3 * 2.70158D * var3 * var3 - var3 * 1.70158D * var3;
         case 23:
            return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D);
         case 24:
            if (var3 < 0.5D) {
               return Math.pow(var3 * 2.0D, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D;
            }

            return (Math.pow(var3 * 2.0D - 2.0D, 2.0D) * (2.5949095D + (var3 * 2.0D - 2.0D) * 3.5949095D) + 2.0D) / 2.0D;
         case 25:
            return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin(2.0943951023931953D * (var3 * 10.0D - 10.75D));
         case 26:
            return Math.pow(2.0D, var3 * -10.0D) * Math.sin((var3 * 10.0D - 0.75D) * 2.0943951023931953D) + 1.0D;
         case 27:
            double var5 = Math.sin((var3 * 20.0D - 11.125D) * 1.3962634015954636D);
            if (var3 < 0.5D) {
               return -(Math.pow(2.0D, var3 * 20.0D - 10.0D) * var5) / 2.0D;
            }

            return Math.pow(2.0D, 10.0D + var3 * -20.0D) * var5 / 2.0D + 1.0D;
         default:
            return var3;
         }
      } else {
         return var3 <= 0.0D ? 0.0D : 1.0D;
      }
   }
}
