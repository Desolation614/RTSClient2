package osrs;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.util.ArrayList;
import net.runelite.api.GroundObject;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Renderable;
import net.runelite.api.TileObject;
import net.runelite.api.WorldView;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public final class ce implements GroundObject, TileObject {
   @ObfuscatedName("yv")
   public int a;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1480057111
   )
   int b;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 2127434873
   )
   int c;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      longValue = 4010746377285225209L
   )
   public long d;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 108491785
   )
   int e;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1210278711
   )
   int f;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Ljr;"
   )
   public ct g;

   ce() {
   }

   @ObfuscatedName("hm")
   private int a() {
      int var1;
      if ((long)(var1 = (int)(this.getHash() >> 52 & 4095L)) == 4095L) {
         var1 = -1;
      }

      return var1;
   }

   @ObfuscatedName("ra")
   @ObfuscatedSignature(
      signature = "()Ljm;"
   )
   private cn b() {
      ct var1;
      if ((var1 = this.g) == null) {
         return null;
      } else {
         return var1 instanceof cn ? (cn)var1 : var1.j();
      }
   }

   public final Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(dF.c, this.getLocalLocation(), this.getPlane(), var1);
   }

   public final long getHash() {
      return this.d;
   }

   public final int getX() {
      return this.c;
   }

   public final LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY(), this.a());
   }

   public final int getY() {
      return this.e;
   }

   public final int getPlane() {
      return this.a;
   }

   public final int getZ() {
      return this.f;
   }

   public final Shape getClickbox() {
      return Perspective.getClickbox(dF.c, this.b(), 0, this.getX(), this.getY(), this.getZ());
   }

   public final Shape getConvexHull() {
      cn var1;
      return (var1 = this.b()) == null ? null : var1.a(this.getX(), this.getY(), 0, this.getZ());
   }

   public final WorldView getWorldView() {
      return kd.b(this.a());
   }

   public final Renderable getRenderable() {
      return this.g;
   }

   public final Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(dF.c, var1, this.getLocalLocation(), var2, var3);
   }

   public final int getId() {
      return (int)(this.getHash() >>> 20);
   }

   public final Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   public final Point getMinimapLocation() {
      return Perspective.localToMinimap(dF.c, this.getLocalLocation());
   }

   public final WorldPoint getWorldLocation() {
      return WorldPoint.fromLocal(dF.c, this.getX(), this.getY(), this.getPlane());
   }

   public final Polygon getCanvasTilePoly() {
      return Perspective.getCanvasTileAreaPoly(dF.c, this.getLocalLocation(), 1, 1, this.getPlane(), 0);
   }

   public final int getConfig() {
      return this.b;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "103"
   )
   public static void a(int var0, int var1, int var2, int var3) {
      if (ee.e.size() > 1 && ee.e.get(0) != null && ((ev)ee.e.get(0)).m.e() && ee.e.get(1) != null && ((ev)ee.e.get(1)).m.e()) {
         aU.a(var0, var1, var2, var3);
         ee.d.add(new gn((gr)null));
         ArrayList var4;
         (var4 = new ArrayList()).add(new gl(new gA((gr)null, 1, false, ee.b), ee.j));
         var4.add(new gl(new gx((gr)null, 0, false, ee.k), ee.c));
         ee.d.add(new hi((gr)null, var4));
         if (ee.g.get(0) != null && ee.g.get(1) != null) {
            ev var5 = (ev)ee.g.get(0);
            ee.g.set(0, ee.e.get(1));
            ee.g.set(1, var5);
         }
      }

   }
}
