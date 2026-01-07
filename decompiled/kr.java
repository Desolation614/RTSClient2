package osrs;

import net.runelite.api.Rasterizer;

final class kr implements Rasterizer {
   public kr() {
   }

   public final int[] getPixels() {
      return jd.h;
   }

   public final void setDrawRegion(int var1, int var2, int var3, int var4) {
      jd.d(var1, var2, var3, var4);
   }

   public final void fillRectangle(int var1, int var2, int var3, int var4, int var5) {
      jd.h(var1, var2, var3, var4, var5);
   }

   public final void rasterFlat(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      cm.c(var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7);
   }

   public final void resetRasterClipping() {
      cc.k();
   }

   public final void setRasterGouraudLowRes(boolean var1) {
      cc.d.d = var1;
   }

   public final int getWidth() {
      return jd.i;
   }

   public final void rasterGouraud(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      cm.c(var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7, var8, var9);
   }

   public final int getHeight() {
      return jd.j;
   }
}
