package osrs;

import java.util.ArrayList;
import net.runelite.api.HealthBarConfig;
import net.runelite.api.SpritePixels;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public final class bq extends im implements HealthBarConfig {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   static dX a = new dX(64);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   static fB b;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   static dX c = new dX(64);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   static fB d;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "Lei;"
   )
   static A e;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 860997041
   )
   public int f = 30;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 608622039
   )
   int g = -1;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -615271137
   )
   int h = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 18000013
   )
   public int i = 1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1280983361
   )
   public int j = 255;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 524103943
   )
   public int k = 255;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1369196193
   )
   public int l = 0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 2033621399
   )
   public int m = -1;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1322806567
   )
   public int n;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1139089751
   )
   public int o = 70;

   bq() {
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)Lwd;",
      garbageValue = "1047976409"
   )
   public final iT a() {
      if (this.h < 0) {
         return null;
      } else {
         iT var1;
         if ((var1 = (iT)dX.a(a, (long)this.h)) != null) {
            return var1;
         } else {
            if ((var1 = hn.a(b, this.h, 0)) != null) {
               a.a((im)var1, (long)this.h);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(B)Lwd;"
   )
   private iT b() {
      if (this.g < 0) {
         return null;
      } else {
         iT var1;
         if ((var1 = (iT)dX.a(a, (long)(this.h * -622735287))) != null) {
            return var1;
         } else {
            if ((var1 = hn.a(d, this.g, 0)) != null) {
               a.a((im)var1, (long)this.g);
            }

            return var1;
         }
      }
   }

   public final void setPadding(int var1) {
      this.l = var1;
   }

   public final int getHealthBarFrontSpriteId() {
      return this.g;
   }

   public final SpritePixels getHealthBarFrontSprite() {
      return a(this, (byte)-1);
   }

   public final SpritePixels getHealthBarBackSprite() {
      return this.a();
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      signature = "(Ljava/util/ArrayList;IIIIB)V",
      garbageValue = "47"
   )
   static void a(ArrayList var0, int var1, int var2, int var3, int var4) {
      if (!var0.isEmpty()) {
         int var5;
         if ((var5 = (Integer)var0.get(0)) == -1 && !client.cz) {
            ac.a(0, 0);
            return;
         }

         ev var6;
         if (var5 != -1 && (ee.g.isEmpty() || (var6 = (ev)ee.g.get(0)) == null || var5 != var6.g) && osrs.j.aS.n != 0) {
            ArrayList var8 = new ArrayList();

            for(var5 = 0; var5 < var0.size(); ++var5) {
               var8.add(new ev(fW.c, (Integer)var0.get(var5), 0, osrs.j.aS.n, false));
            }

            if (client.cz) {
               jB.a(var8, var1, var2, var3, var4);
               return;
            }

            gO.a(var8, var1, var2, var3, var4, false);
         }
      }

   }

   @ObfuscatedName("lw")
   @ObfuscatedSignature(
      signature = "(Lhs;B)Lwd;"
   )
   public static iT a(bq var0, byte var1) {
      if (var0 == null) {
         var0.b();
      }

      if (var0.g < 0) {
         return null;
      } else {
         iT var2;
         if ((var2 = (iT)dX.a(a, (long)var0.g)) != null) {
            return var2;
         } else {
            if ((var2 = hn.a(b, var0.g, 0)) != null) {
               a.a((im)var2, (long)var0.g);
            }

            return var2;
         }
      }
   }
}
