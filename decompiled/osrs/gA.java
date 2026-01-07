package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
public final class gA extends gr {
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   static fB a;
   @ObfuscatedName("ax")
   static String[] f;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -606630201
   )
   private int g = 0;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lno;"
   )
   private ev h = null;

   @ObfuscatedSignature(
      signature = "(Lrh;IZI)V"
   )
   public gA(gr var1, int var2, boolean var3, int var4) {
      super(var1);
      super.c = "FadeInTask";
      if (var2 >= 0) {
         if (var3 && var2 < ee.h.size()) {
            this.h = (ev)ee.h.get(var2);
         } else if (!var3 && var2 < ee.e.size()) {
            this.h = (ev)ee.e.get(var2);
         }

         this.g = var4;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1822823713"
   )
   public final boolean a() {
      if (this.h != null && this.h.m != null) {
         this.h.e = true;

         try {
            if (this.h.h < (float)this.h.f && this.h.m.e()) {
               float var1 = this.g == 0 ? (float)this.g : (float)this.h.f / (float)this.g;
               ev var10000 = this.h;
               var10000.h += 0.0F == var1 ? (float)this.h.f : var1;
               if (this.h.h > (float)this.h.f) {
                  this.h.h = (float)this.h.f;
               }

               this.h.m.b((int)this.h.h);
               return false;
            }
         } catch (Exception var3) {
            this.a(var3.getMessage());
            return true;
         }

         this.h.e = false;
         return true;
      } else {
         return true;
      }
   }
}
