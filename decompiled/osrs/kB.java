package osrs;

import java.util.ArrayList;
import java.util.List;
import net.runelite.api.DecorativeObject;
import net.runelite.api.GameObject;
import net.runelite.api.GroundObject;
import net.runelite.api.ItemLayer;
import net.runelite.api.Point;
import net.runelite.api.SceneTileModel;
import net.runelite.api.SceneTilePaint;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

public final class kB implements Tile {
   @ObfuscatedName("zg")
   public final int a;
   @ObfuscatedName("kq")
   @ObfuscatedSignature(
      signature = "Ljg;"
   )
   private ci c;
   @ObfuscatedName("re")
   public kB b;

   @ObfuscatedSignature(
      signature = "(Ljg;I)V"
   )
   public kB(ci var1, int var2) {
      this.c = var1;
      this.a = var2;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "()Ljc;"
   )
   private cd j() {
      return this.c.aC[this.a];
   }

   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      signature = "()Lko;"
   )
   public final cS a() {
      return this.c.au[this.a];
   }

   @ObfuscatedName("ei")
   public final int b() {
      return (this.a & this.c.ad) - this.c.e;
   }

   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      signature = "()[Lkg;"
   )
   public final cJ[] c() {
      return new cJ[]{this.c.af[this.a * 5], this.c.af[this.a * 5 + 1], this.c.af[this.a * 5 + 2], this.c.af[this.a * 5 + 3], this.c.af[this.a * 5 + 4]};
   }

   @ObfuscatedName("hn")
   public final int d() {
      return (this.a >> this.c.aB & this.c.aE) - this.c.e;
   }

   @ObfuscatedName("hv")
   public final int e() {
      return this.c.c(this.a);
   }

   @ObfuscatedName("ml")
   @ObfuscatedSignature(
      signature = "()Lkb;"
   )
   public final cE f() {
      return this.c.am[this.a];
   }

   @ObfuscatedName("og")
   @ObfuscatedSignature(
      signature = "()Lka;"
   )
   public final cD g() {
      return this.c.aD[this.a];
   }

   @ObfuscatedName("pj")
   @ObfuscatedSignature(
      signature = "()Ljd;"
   )
   public final ce h() {
      return this.c.aj[this.a];
   }

   @ObfuscatedName("rc")
   @ObfuscatedSignature(
      signature = "()Ljn;"
   )
   public final co i() {
      return this.c.ax[this.a];
   }

   public final SceneTileModel getSceneTileModel() {
      return this.i();
   }

   public final int getPlane() {
      return this.a >> this.c.ap & 3;
   }

   public final void setGroundObject(GroundObject var1) {
      this.c.aj[this.a] = (ce)var1;
      int var2;
      int[] var3;
      if (var1 == null) {
         var3 = this.c.ao;
         var2 = this.a;
         var3[var2] &= -2049;
      } else {
         var3 = this.c.ao;
         var2 = this.a;
         var3[var2] |= 2048;
      }
   }

   public final LocalPoint getLocalLocation() {
      int var1 = this.a >> this.c.aB & this.c.aE;
      int var2 = this.a & this.c.ad;
      var1 -= this.c.e;
      var2 -= this.c.e;
      return LocalPoint.fromScene(var1, var2, this.c);
   }

   public final DecorativeObject getDecorativeObject() {
      return this.g();
   }

   public final Point getSceneLocation() {
      int var1 = this.a >> this.c.aB & this.c.aE;
      int var2 = this.a & this.c.ad;
      var1 -= this.c.e;
      var2 -= this.c.e;
      return new Point(var1, var2);
   }

   public final Tile getBridge() {
      return this.b;
   }

   public final ItemLayer getItemLayer() {
      return this.j();
   }

   public final SceneTilePaint getSceneTilePaint() {
      return this.f();
   }

   public final WallObject getWallObject() {
      return this.a();
   }

   public final List getGroundItems() {
      cd var1;
      if ((var1 = this.j()) == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         hR var4;
         for(Object var3 = var1.c; var3 instanceof kk; var3 = (var4 = (hR)var3).ch) {
            var2.add((kk)var3);
         }

         return var2;
      }
   }

   public final WorldPoint getWorldLocation() {
      int var1 = this.a >> this.c.ap & 3;
      int var2 = this.a >> this.c.aB & this.c.aE;
      int var3 = this.a & this.c.ad;
      var2 -= this.c.e;
      var3 -= this.c.e;
      return WorldPoint.fromScene(this.c, var2, var3, var1);
   }

   public final int getRenderLevel() {
      return this.c.b(this.a);
   }

   public final GameObject[] getGameObjects() {
      return this.c();
   }

   public final GroundObject getGroundObject() {
      return this.h();
   }
}
