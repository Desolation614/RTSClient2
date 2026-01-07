package osrs;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public final class S {
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      signature = "Lwy;"
   )
   static jp a;
   static jp b;
   @ObfuscatedName("pn")
   static int[] c;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "Lfa;"
   )
   S d;
   @ObfuscatedName("ac")
   float e;
   @ObfuscatedName("ai")
   float f;
   @ObfuscatedName("aj")
   float g;
   @ObfuscatedName("al")
   float h;
   @ObfuscatedName("an")
   float i;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1203899933
   )
   int j;

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lfg;FZI)F",
      garbageValue = "-1614793055"
   )
   static float a(Y var0, float var1, boolean var2) {
      if (var0 != null && var0.a() != 0) {
         float var3 = (float)var0.k[0].j;
         float var4;
         float var5;
         if ((var5 = (var4 = (float)var0.k[var0.a() - 1].j) - var3) == 0.0F) {
            return var0.k[0].g;
         } else {
            float var6;
            if (var1 > var4) {
               var6 = (var1 - var4) / var5;
            } else {
               var6 = (var1 - var3) / var5;
            }

            float var7;
            label69: {
               var7 = (float)((int)var6);
               var5 = Math.abs(var6 - var7) * var5;
               float var8 = (float)((int)(var6 = (var7 = Math.abs(var7 + 1.0F)) / 2.0F));
               var6 -= var8;
               float var10;
               if (var2) {
                  if (var0.m != ah.c) {
                     if (var0.m != ah.d && var0.m != ah.a) {
                        if (var0.m == ah.b) {
                           var5 = var3 - var1;
                           var10 = var0.k[0].i;
                           var3 = var0.k[0].f;
                           var1 = var0.k[0].g;
                           if (0.0F != var10) {
                              var1 -= var5 * var3 / var10;
                           }

                           return var1;
                        }
                     } else {
                        var5 = var4 - var5;
                     }
                     break label69;
                  }

                  if (0.0F == var6) {
                     var5 = var4 - var5;
                     break label69;
                  }
               } else {
                  if (var0.h == ah.c) {
                     if (var6 != 0.0F) {
                        var5 = var4 - var5;
                     } else {
                        var5 += var3;
                     }
                     break label69;
                  }

                  if (var0.h != ah.d && var0.h != ah.a) {
                     if (var0.h == ah.b) {
                        var5 = var1 - var4;
                        var10 = var0.k[var0.a() - 1].h;
                        var3 = var0.k[var0.a() - 1].e;
                        var1 = var0.k[var0.a() - 1].g;
                        if (var10 != 0.0F) {
                           var1 += var5 * var3 / var10;
                        }

                        return var1;
                     }
                     break label69;
                  }
               }

               var5 += var3;
            }

            var1 = bT.a(var0, var5);
            float var9;
            if (var2 && var0.m == ah.a) {
               var9 = var0.k[var0.a() - 1].g - var0.k[0].g;
               var1 -= var7 * var9;
            } else if (!var2 && var0.h == ah.a) {
               var9 = var0.k[var0.a() - 1].g - var0.k[0].g;
               var1 += var7 * var9;
            }

            return var1;
         }
      } else {
         return 0.0F;
      }
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1159154770"
   )
   static final void a() {
      if (eu.b) {
         Iterator var0 = client.ag.iterator();

         while(var0.hasNext()) {
            kd var10000 = (kd)var0.next();

            for(int var1 = 0; var1 < client.ax.f; ++var1) {
               jG var2;
               if ((var2 = (jG)aM.a.e.a((long)client.ax.d[var1])) != null) {
                  jG.a(var2, -1507286124);
               }
            }
         }

         eu.b = false;
      }

   }
}
