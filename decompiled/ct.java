package osrs;

import net.runelite.api.Model;
import net.runelite.api.Renderable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public abstract class ct extends in implements Renderable {
   @ObfuscatedName("tl")
   @ObfuscatedSignature(
      signature = "[Lov;"
   )
   static fd[] aH;
   @ObfuscatedName("ei")
   @ObfuscatedGetter(
      intValue = -1985311067
   )
   public int aI = 1000;

   protected ct() {
   }

   @ObfuscatedName("yx")
   @ObfuscatedSignature(
      signature = "()Ljm;"
   )
   public final cn j() {
      return this.k();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)Ljm;",
      garbageValue = "27"
   )
   protected cn k() {
      return null;
   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      signature = "(ILrz;IIIJ)V"
   )
   void a(int var1, gL var2, int var3, int var4, int var5, long var6) {
      cn var8;
      if ((var8 = this.k()) != null) {
         this.aI = var8.aI;
         var8.a(var1, var2, var3, var4, var5, var6);
      }

   }

   @ObfuscatedName("js")
   void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      cn var15;
      if ((var15 = this.k()) != null) {
         this.aI = var15.aI;
         var13 = cc.b[var2];
         var2 = cc.a[var2];
         int var16 = cc.b[var3];
         var3 = cc.a[var3];
         var15.a(var1, var13, var2, var16, var3, var4 - var7, var5 - var8, var6 - var9, var10);
      }

   }

   public int getModelHeight() {
      return this.aI;
   }

   public void setModelHeight(int var1) {
      this.aI = var1;
   }

   public Model getModel() {
      return this.k();
   }
}
