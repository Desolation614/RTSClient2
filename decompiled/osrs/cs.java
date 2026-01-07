package osrs;

import net.runelite.api.Texture;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public final class cs extends hR implements Texture {
   @ObfuscatedName("al")
   static int[] a;
   @ObfuscatedName("aa")
   boolean b;
   @ObfuscatedName("ac")
   int c;
   @ObfuscatedName("ad")
   int d;
   @ObfuscatedName("af")
   int[] e;
   @ObfuscatedName("ag")
   int[] f;
   @ObfuscatedName("ah")
   int[] g;
   @ObfuscatedName("ak")
   boolean h = false;
   @ObfuscatedName("am")
   int[] i;
   @ObfuscatedName("ar")
   int j;
   @ObfuscatedName("au")
   int[] k;
   @ObfuscatedName("sj")
   private float l;
   @ObfuscatedName("tr")
   private float m;

   @ObfuscatedSignature(
      signature = "(Lwt;)V"
   )
   cs(jk var1) {
      this.c = var1.d();
      this.b = jk.a((jk)var1, (byte)4) == 1;
      int var2;
      if ((var2 = jk.a((jk)var1, (byte)46)) > 0 && var2 <= 4) {
         this.i = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.i[var3] = var1.d();
         }

         if (var2 > 1) {
            this.g = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.g[var3] = jk.a(var1, (byte)-71);
            }
         }

         if (var2 > 1) {
            this.f = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.f[var3] = jk.a((jk)var1, (byte)36);
            }
         }

         this.k = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.k[var3] = jk.d(var1, 1687107415);
         }

         this.j = jk.a((jk)var1, (byte)33);
         this.d = jk.a((jk)var1, (byte)98);
         this.e = null;
      } else {
         throw new RuntimeException();
      }
   }

   public final void setU(float var1) {
      this.m = var1;
   }

   public final int getAnimationDirection() {
      return this.j;
   }

   public final float getV() {
      return this.l;
   }

   public final void setV(float var1) {
      this.l = var1;
   }

   public final int getAnimationSpeed() {
      return this.d;
   }

   public final int[] getPixels() {
      return this.e;
   }

   public final boolean isLoaded() {
      return this.h;
   }

   public final float getU() {
      return this.m;
   }
}
