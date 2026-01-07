package osrs;

import net.runelite.api.coords.WorldPoint;
import net.runelite.api.worldmap.WorldMapIcon;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
public abstract class dz implements WorldMapIcon {
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "Lnp;"
   )
   public final ew b;
   @ObfuscatedName("ag")
   int c;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1324198157
   )
   int d;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "Lnp;"
   )
   public final ew e;

   @ObfuscatedSignature(
      signature = "(Lnp;Lnp;)V"
   )
   dz(ew var1, ew var2) {
      this.e = var1;
      this.b = var2;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "80"
   )
   private boolean a(int var1, int var2) {
      if (!this.i()) {
         return false;
      } else {
         bi var3 = aL.a(this.b());
         int var4 = this.a();
         int var5 = this.c();
         switch(var3.o.e) {
         case 0:
            if (var1 < this.d - var4 / 2 || var1 > var4 / 2 + this.d) {
               return false;
            }
            break;
         case 1:
            if (var1 <= this.d - var4 || var1 > this.d) {
               return false;
            }
            break;
         case 2:
            if (var1 < this.d || var1 >= var4 + this.d) {
               return false;
            }
         }

         switch(var3.r.e) {
         case 0:
            if (var2 < this.c * 1918705007 || var2 >= var5 + this.c * 1918705007) {
               return false;
            }
            break;
         case 1:
            if (var2 <= this.c * 1918705007 - var5 || var2 > this.c * 1918705007) {
               return false;
            }
            break;
         case 2:
            if (var2 < this.c * 1918705007 - var5 / 2 || var2 > var5 / 2 + this.c * 1918705007) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-963913416"
   )
   abstract int a();

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2005636344"
   )
   public abstract int b();

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-341446402"
   )
   abstract int c();

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)Llp;",
      garbageValue = "111016802"
   )
   abstract dx d();

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1236044011"
   )
   final boolean i() {
      return this.b() >= 0;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-102006893"
   )
   private boolean c(int var1, int var2) {
      dx var3;
      if ((var3 = this.d()) == null) {
         return false;
      } else if (var1 >= this.d - var3.b / 2 && var1 <= var3.b / 2 + this.d) {
         return var2 >= this.c * 1918705007 && var2 <= this.c * 1918705007 + var3.c;
      } else {
         return false;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1220021426"
   )
   final boolean b(int var1, int var2) {
      return this.a(var1, var2) ? true : this.c(var1, var2);
   }

   public WorldPoint getCoordinate() {
      ew var1 = this.b;
      return new WorldPoint(var1.b, var1.c * -1165521101, var1.a * 719968039);
   }

   public int getType() {
      return this.b();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "128598371"
   )
   static String a(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }
}
