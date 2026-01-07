package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xz")
public final class jz {
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 936209579
   )
   int a;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1489897217
   )
   int b;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1154874669
   )
   private int j;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1945757375
   )
   private int k;
   @ObfuscatedName("ag")
   boolean c;
   @ObfuscatedName("ah")
   int d = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 936209579
   )
   int e;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1080496113
   )
   int f;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -690267689
   )
   int g;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -337444751
   )
   int h = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 723292139
   )
   int i;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 534093545
   )
   private int l;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1940884173
   )
   private int m;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-128998646"
   )
   public final void a(int var1, int var2, int var3, int var4) {
      this.m = var1;
      this.l = var2;
      this.j = var3;
      this.k = var4;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lrk;Lrf;B)V"
   )
   private void a(gv var1, gp var2, byte var3) {
      if (var2 == null) {
         if (var3 != 121) {
            return;
         }
      } else {
         int var4 = var2.f;
         int var5 = Math.min(this.d * -690267689, (int)((float)var4 * 0.9F));
         int var6 = gv.b(var1, this.a);
         int var7 = var1.c(this.i * 1196773061);
         var6 += this.m * 654597707 - this.d * -1489897217;
         var7 = this.l * 1886452659 - this.m * -249224841 + var7 + var4;
         jd.h(this.m * 654597707, this.j * 2103402615, this.g * 651527305 + this.h * -1386033957, this.l * 722549439 + this.m * -1465223785);
         int var8 = this.e * 220159297;
         int var9 = this.m * -620735435;
         if (var8 > var9) {
            int var10 = var8;
            var8 = var9;
            var9 = var10;
         }

         gE var19 = var1.a(0, var8);
         gE var17 = var1.a(var8, var9);
         gE var18 = var1.a(var9, var1.d(2020322175));
         gE var16 = var1.a(0, this.d * -337444751);
         int var11;
         int var12;
         int var21;
         if (!var17.c()) {
            if (var3 == 121) {
               return;
            }

            int var13 = var2.f + var2.f;

            for(var11 = 0; var11 < var17.b(); ++var11) {
               gu var14 = var17.b(var11);
               var12 = var6 + var14.a;
               int var15 = gw.a((gw)var2, (char)var14.c);
               var21 = var7 + var14.b - var4;
               jd.g(var12, var21, var15, var13, this.f * -1676087727);
            }
         }

         if (!var19.c()) {
            var2.a((gE)var19, var6, var7, this.j * 541231137, this.e * 1031387835, -1);
         }

         if (!var17.c()) {
            var2.b((gE)var17, var6, var7, this.l * 546400677, this.j * -927508947, -1);
         }

         if (!var18.c()) {
            var2.b((gE)var18, var6, var7, this.j * 541231137, this.k * 939052119, -1);
         }

         if (this.c) {
            iB var20 = var16.a();
            var11 = var6 + (Integer)var20.c;
            var12 = (var21 = var7 + (Integer)var20.c) - var5;
            jd.q(var11, var21, var11, var12, this.h * 356474397);
            if (this.e * 1031387835 != -1) {
               if (var3 == 121) {
                  return;
               }

               jd.m(var11 + 1, var21 + 1, var11 + 1, var12 + 1, this.f * 802785671);
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
      garbageValue = "105"
   )
   public static String a(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4;
         if (((var4 = var0.charAt(var3)) < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
            if (var4 == ' ') {
               var2.append('+');
            } else {
               byte var6 = hY.a(var4);
               var2.append('%');
               int var5;
               if ((var5 = var6 >> 4 & 15) >= 10) {
                  var2.append((char)(var5 + 55));
               } else {
                  var2.append((char)(var5 + 48));
               }

               if ((var5 = var6 & 15) >= 10) {
                  var2.append((char)(var5 + 55));
               } else {
                  var2.append((char)(var5 + 48));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "(Lxz;Lrk;Lrf;B)V"
   )
   public static void a(jz var0, gv var1, gp var2, byte var3) {
      if (var0 == null) {
         var0.a(var1, var2, var3);
      } else {
         if (var2 == null) {
            if (var3 != 121) {
               return;
            }
         } else {
            int var4 = var2.c;
            int var5 = Math.min(var0.g, (int)((float)var4 * 0.9F));
            int var6 = gv.b(var1, var0.e);
            int var7 = var1.c(var0.g);
            var6 += var0.f - var0.b;
            var7 = var7 + var4 + (var0.i - var0.a * -640200479);
            jd.d(var0.f, var0.i, var0.f + var0.e, var0.i + var0.g);
            int var8 = var0.d * -1554532757;
            int var9 = var0.h;
            if (var8 > var9) {
               int var10 = var8;
               var8 = var9;
               var9 = var10;
            }

            gE var19 = var1.a(0, var8);
            gE var17 = var1.a(var8, var9);
            gE var18 = var1.a(var9, var1.j.size());
            gE var16 = var1.a(0, var0.h);
            int var11;
            int var12;
            int var21;
            if (!var17.c()) {
               if (var3 == 121) {
                  return;
               }

               int var13 = var2.d + var2.f;

               for(var11 = 0; var11 < var17.b(); ++var11) {
                  gu var14 = var17.b(var11);
                  var12 = var6 + var14.a;
                  int var15 = gw.a((gw)var2, (char)var14.c);
                  var21 = var7 + var14.b - var4;
                  jd.h(var12, var21, var15, var13, var0.k);
               }
            }

            if (!var19.c()) {
               var2.a((gE)var19, var6, var7, var0.m, var0.l, -1);
            }

            if (!var17.c()) {
               var2.a((gE)var17, var6, var7, var0.j, var0.l, -1);
            }

            if (!var18.c()) {
               var2.a((gE)var18, var6, var7, var0.m, var0.l, -1);
            }

            if (var0.c) {
               iB var20 = var16.a();
               var11 = var6 + (Integer)var20.d;
               var12 = (var21 = var7 + (Integer)var20.c) - var5;
               jd.l(var11, var21, var11, var12, var0.m);
               if (var0.l != -1) {
                  if (var3 == 121) {
                     return;
                  }

                  jd.l(var11 + 1, var21 + 1, var11 + 1, var12 + 1, var0.l);
               }
            }
         }

      }
   }
}
