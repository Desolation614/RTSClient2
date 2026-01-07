package osrs;

import net.runelite.api.NodeCache;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public final class dX implements NodeCache {
   @ObfuscatedName("ye")
   private int f;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lqp;"
   )
   ga a;
   @ObfuscatedName("aj")
   int b;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lqa;"
   )
   fK c = new fK();
   @ObfuscatedName("an")
   int d;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Luv;"
   )
   im e = new im();
   @ObfuscatedName("pe")
   private float g = 0.0F;

   public dX(int var1) {
      this.b = var1;
      this.d = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
      }

      this.a = new ga(var2);
      this.a();
   }

   @ObfuscatedName("yr")
   public final void a(int var1) {
      this.b(var1);
      this.f = this.b;
   }

   @ObfuscatedName("ad")
   public final void a() {
      this.f = this.b;
   }

   @ObfuscatedName("aj")
   public final void a(long var1) {
      im var3;
      if ((var3 = (im)this.a.b(var1)) != null) {
         gk.a(var3);
         var3.n();
         ++this.d;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Luv;J)V"
   )
   public final void a(im var1, long var2) {
      if (this.d == 0) {
         im var4;
         gk.a(var4 = this.c.a());
         var4.n();
         if (var4 == this.e) {
            gk.a(var4 = this.c.a());
            var4.n();
         }
      } else {
         --this.d;
      }

      this.a.b(var1, var2);
      this.c.a(var1);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(J)Luv;"
   )
   private im b(long var1) {
      im var3;
      if ((var3 = (im)this.a.b(var1)) != null) {
         this.c.a(var3);
      }

      return var3;
   }

   @ObfuscatedName("ar")
   public final void b() {
      fK.a(this.c);
      this.a.b();
      this.e = new im();
      this.d = this.b;
      this.d();
   }

   @ObfuscatedName("bm")
   private void d() {
      this.g = 0.0F;
      im var2 = this.e;
      this.c.a(var2);
   }

   public final void reset() {
      this.b();
   }

   @ObfuscatedName("wu")
   private void b(int var1) {
      if (var1 > this.b) {
         int var2;
         for(var2 = 1; var2 < var1; var2 += var2) {
         }

         this.b = var2;
         this.reset();
         this.a = new ga(var2);
      }

   }

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Lmr;)V"
   )
   private static void a(String var0, dX var1) {
      synchronized(var1) {
         dX var3;
         boolean var6 = (var3 = var1).d <= 0 && var3.e.aL == null;
         var1.g = var1.g * 0.92F + (var6 ? 0.07999998F : 0.0F);
         if (var6) {
            if (var1.g > 0.2F) {
               client.cV.trace("cache {} is thrashing", var0);
            }

            if (var1.g > 0.9F && var1.b < var1.f << 3) {
               var1.b(var1.b << 1);
               client.cV.info("cache {} thrashing, enlarging to {} entries", var0, var1.b);
            }
         }

         fK var10000 = var1.c;
         im var5 = var1.e;
         var10000.a(var5);
      }
   }

   @ObfuscatedName("nm")
   public static void c() {
      a("EnumDefinition_cached", bw.a);
      a("SpotAnimationDefinition_cachedModels", bl.c);
      a("animPoseCache", bP.b);
      a("animationCache", bP.c);
      a("animayaPoses", bP.e);
      a("cachedModels2", bJ.b);
      a("dbRowConfigCache", ir.a);
      a("dbTableConfigCache", iD.a);
      a("dbTableIndexCache", client.cl);
      a("field1898", ay.a);
      a("field1901", aO.a);
      a("field1904", aT.a);
      a("field1907", au.a);
      a("field1915", bf.a);
      a("field1926", bi.c);
      a("field1943", be.a);
      a("field1985", bg.a);
      a("field2004", bv.a);
      a("field2008", bc.b);
      a("field2076", bx.a);
      a("field2088", aW.a);
      a("field2132", ba.a);
      a("field2147", bm.a);
      a("field2165", bb.a);
      a("field2185", bG.d);
      a("field440", client.cv);
      a("healthBarCache", bq.c);
      a("healthBarSpriteCache", bq.a);
      a("hitsplatCompCache", bG.b);
      a("hitsplatFontCache", bG.a);
      a("identKits", bk.a);
      a("inventoryCache", aL.a);
      a("itemModelCache", bC.b);
      a("itemSpriteCache", bC.c);
      a("items", bC.a);
      a("npcModelCache", aY.a);
      a("npcs", aY.c);
      a("objModelDataCache", bJ.e);
      a("objects", bJ.g);
      a("overlays", bE.a);
      a("paramCompositionCache", bh.a);
      a("playerModelCache", eY.a);
      a("scriptCache", jI.b);
      a("spotanimModelCache", bl.a);
      a("structCompositionCache", aZ.a);
      a("underlays", bu.a);
      a("varbits", bj.b);
      a("varplayers", az.b);
   }

   @ObfuscatedName("qn")
   @ObfuscatedSignature(
      signature = "(Lmr;J)Luv;"
   )
   public static im a(dX var0, long var1) {
      if (var0 == null) {
         var0.b(var1);
      }

      im var3;
      if ((var3 = (im)var0.a.b(var1)) != null) {
         var0.c.a(var3);
      }

      return var3;
   }
}
