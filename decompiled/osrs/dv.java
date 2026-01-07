package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public final class dv {
   @ObfuscatedName("ec")
   public static boolean a;
   @ObfuscatedName("ij")
   public static boolean b;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 326721991
   )
   private int c;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 252360605
   )
   private int d;
   @ObfuscatedName("wk")
   private boolean e;

   dv(int var1, int var2) {
      this.e = a;
      this.d = var1;
      this.c = var2;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lbi;B)Z"
   )
   private boolean a(eh var1) {
      b = this.e;
      if (var1 == null) {
         b = this.e;
         return false;
      } else {
         boolean var3;
         switch(this.d) {
         case 1:
            var3 = var1.b(this.d * -386905165);
            b = this.e;
            return var3;
         case 2:
            var3 = var1.a(this.c);
            b = false;
            return var3;
         case 3:
            var3 = var1.a((char)this.c);
            b = this.e;
            return var3;
         case 4:
            int var10000 = this.d;
            b = this.e;
            return false;
         default:
            b = false;
            return false;
         }
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(Lov;ZI)V",
      garbageValue = "1098605500"
   )
   static void a(fd var0, boolean var1) {
      if (var0 != null) {
         hE.c[++hE.e - 1] = 1;
         if (var1) {
            ic.a = var0;
         } else {
            ef.a = var0;
         }
      } else {
         hE.c[++hE.e - 1] = 0;
      }
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      signature = "(Lea;IIF)F"
   )
   public static float a(s var0, int var1, int var2, float var3) {
      return s.a(((float)var0.c[var1][0][var2] + var3 * (float)(var0.c[var1][1][var2] - var0.c[var1][0][var2])) * 1.2207031E-4F);
   }

   @ObfuscatedName("ry")
   @ObfuscatedSignature(
      signature = "(Lbe;Lbi;B)Z"
   )
   public static boolean a(dv var0, eh var1, byte var2) {
      if (var0 == null) {
         return var0.a(var1);
      } else {
         b = var0.e;
         if (var1 == null) {
            b = false;
            return false;
         } else {
            boolean var3;
            switch(var0.d) {
            case 1:
               var3 = var1.b(var0.c);
               b = false;
               return var3;
            case 2:
               var3 = var1.a(var0.c);
               b = false;
               return var3;
            case 3:
               var3 = var1.a((char)var0.c);
               b = false;
               return var3;
            case 4:
               int var10000 = var0.c;
               b = false;
               return false;
            default:
               b = false;
               return false;
            }
         }
      }
   }
}
