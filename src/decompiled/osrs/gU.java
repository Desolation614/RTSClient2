package osrs;

import net.runelite.api.Nameable;
import net.runelite.api.events.NameableNameChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
public class gU implements Comparable<Nameable>, Nameable {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lxm;"
   )
   jw b;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lxm;"
   )
   jw c;

   gU() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lsi;B)I",
      garbageValue = "-27"
   )
   public int a(gU var1) {
      return jw.a(this.c, var1.c, -1272671100);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "1945780872"
   )
   public final String b() {
      return this.c == null ? "" : jw.a(this.c, 1913263773);
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "0"
   )
   public final String c() {
      return this.b == null ? "" : jw.a(this.b, -1982561569);
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(Lxm;Lxm;B)V",
      garbageValue = "72"
   )
   final void a(jw var1, jw var2) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.c = var1;
         this.b = var2;
         this.d();
      }
   }

   @ObfuscatedName("ks")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public final void d() {
      NameableNameChanged var1 = new NameableNameChanged(this);
      dF.c.getCallbacks().post(var1);
   }

   public String getPrevName() {
      jw var1;
      return (var1 = this.b) == null ? null : var1.b;
   }

   public String getName() {
      return this.c.b;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIFFFI)F",
      garbageValue = "1914902033"
   )
   public static float a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      float var11 = (float)((var6 - var7) * (var2 - var4) + (var5 - var7) * (var4 - var3));
      float var14 = (float)((var6 - var7) * (var0 - var4) + (var1 - var7) * (var4 - var3)) / var11;
      float var12 = (float)((var7 - var5) * (var0 - var4) + (var1 - var7) * (var2 - var4)) / var11;
      float var13 = 1.0F - var14 - var12;
      return var10 * var13 + var14 * var8 + var9 * var12;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      Nameable var2 = (Nameable)var1;
      return this.a((gU)var2);
   }
}
