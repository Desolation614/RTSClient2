package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
public final class go {
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -147855743
   )
   static int a;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lre;"
   )
   public static final go b;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "[Lre;"
   )
   static go[] c;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lre;"
   )
   public static final go d;
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   static aP e;
   @ObfuscatedName("aa")
   public float f;
   @ObfuscatedName("ac")
   public float g;
   @ObfuscatedName("am")
   public float h;

   public go() {
   }

   go(float var1, float var2, float var3) {
      this.g = var1;
      this.f = var2;
      this.h = var3;
   }

   @ObfuscatedSignature(
      signature = "(Lre;)V"
   )
   go(go var1) {
      this.g = var1.g;
      this.f = var1.f;
      this.h = var1.h;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(FFFI)V",
      garbageValue = "252102386"
   )
   public final void a(float var1, float var2, float var3) {
      this.g = var1;
      this.f = var2;
      this.h = var3;
   }

   @ObfuscatedName("ac")
   private void a(int var1) {
      synchronized(c) {
         if (fG.a < a) {
            if (var1 >= -1794013737) {
               return;
            }

            c[++fG.a - 1] = this;
         }

      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(FFFI)V",
      garbageValue = "-1023999147"
   )
   public final void b(float var1, float var2, float var3) {
      this.g += var1;
      this.f += 0.0F;
      this.h += var3;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(Lre;I)Z",
      garbageValue = "750979643"
   )
   final boolean a(go var1) {
      return this.g == var1.g && this.f == var1.f && var1.h == this.h;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(Lre;B)F",
      garbageValue = "12"
   )
   final float b(go var1) {
      return this.f * var1.f + var1.g * this.g + this.h * var1.h;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1388656432"
   )
   public final void a() {
      float var1 = 1.0F / this.b();
      this.g *= var1;
      this.f *= var1;
      this.h *= var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(B)F",
      garbageValue = "1"
   )
   final float b() {
      return (float)Math.sqrt((double)(this.h * this.h + this.f * this.f + this.g * this.g));
   }

   public final String toString() {
      return this.g + ", " + this.f + ", " + this.h;
   }

   @ObfuscatedName("et")
   @ObfuscatedSignature(
      signature = "(Lre;B)V"
   )
   public static void a(go var0, byte var1) {
      if (var0 == null) {
         var0.g = 0.0F;
         var0.g = 0.0F;
         var0.f = 0.0F;
      }

      var0.h = 0.0F;
      var0.f = 0.0F;
      var0.g = 0.0F;
   }

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      signature = "(Lre;I)V"
   )
   public static void a(go var0, int var1) {
      if (var0 == null) {
         var0.a(var1);
      } else {
         synchronized(c) {
            if (fG.a < a) {
               if (var1 >= -1794013737) {
                  return;
               }

               c[++fG.a - 1] = var0;
            }

         }
      }
   }

   @ObfuscatedName("kz")
   @ObfuscatedSignature(
      signature = "(Lre;Lre;I)V"
   )
   public static void a(go var0, go var1, int var2) {
      if (var0 == null) {
         var0.a(var0.h, var0.g, var0.f);
      }

      var0.g += var1.g;
      var0.f += var1.f;
      var0.h += var1.h;
   }

   @ObfuscatedName("xy")
   @ObfuscatedSignature(
      signature = "(FFF)Lre;"
   )
   public static go c(float var0, float var1, float var2) {
      return hv.a(var0, 0.0F, var2);
   }

   static {
      new go(0.0F, 0.0F, 0.0F);
      new go(1.0F, 1.0F, 1.0F);
      new go(1.0F, 0.0F, 0.0F);
      d = new go(0.0F, 1.0F, 0.0F);
      new go(0.0F, 0.0F, 1.0F);
      new go(1.0F, 0.0F, 0.0F);
      new go(-1.0F, 0.0F, 0.0F);
      new go(0.0F, 0.0F, 1.0F);
      b = new go(0.0F, 0.0F, -1.0F);
      new go(0.0F, 1.0F, 0.0F);
      new go(0.0F, -1.0F, 0.0F);
      c = new go[0];
      br.a(16);
   }
}
