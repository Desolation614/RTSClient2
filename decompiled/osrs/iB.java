package osrs;

import java.awt.FontMetrics;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vk")
public final class iB {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "[Lbg;"
   )
   static dO[] a;
   @ObfuscatedName("as")
   static FontMetrics b;
   @ObfuscatedName("aj")
   public final Object c;
   @ObfuscatedName("ap")
   public final Object d;

   public iB(Object var1, Object var2) {
      this.d = var1;
      this.c = var2;
   }

   public final String toString() {
      String var10000 = String.valueOf(this.d);
      return var10000 + ", " + String.valueOf(this.c);
   }

   public final boolean equals(Object var1) {
      if (var1 != null && var1 instanceof iB) {
         iB var2 = (iB)var1;
         if (this.d == null) {
            if (var2.d != null) {
               return false;
            }
         } else if (!this.d.equals(var2.d)) {
            return false;
         }

         if (this.c == null) {
            if (var2.c != null) {
               return false;
            }
         } else if (!this.c.equals(var2.c)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public final int hashCode() {
      int var1 = 0;
      if (this.d != null) {
         var1 = 0 + this.d.hashCode();
      }

      if (this.c != null) {
         var1 += 31 * this.c.hashCode();
      }

      return var1;
   }

   @ObfuscatedName("li")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   static void a() {
      client.dT.h = 0;
      client.dT.c();
      client.dP = false;
      client.dT.a[0] = -1;
      client.dT.f[0] = "Cancel";
      client.dT.e[0] = "";
      client.dT.k[0] = 1006;
      client.dT.m[0] = false;
      client.dT.n[0] = null;
      client.dT.h = 1;
      client.dT.c();
   }
}
