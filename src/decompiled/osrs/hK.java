package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
public final class hK implements fN {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Ltv;"
   )
   public static final hK a = new hK(3, 3, 499, 499, 499, 507);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Ltv;"
   )
   static final hK b = new hK(1, 1, 507, 507, 507, 507);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Ltv;"
   )
   static final hK c = new hK(2, 2, 338, 338, 338, 507);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Ltv;"
   )
   static final hK d = new hK(0, 0, 0, 0, 0, 0);
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1079798799
   )
   private int h;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1256904109
   )
   private int i;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1256904109
   )
   final int e;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1496392143
   )
   final int f;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -671116821
   )
   final int g;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 280771563
   )
   private int j;

   private hK(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.i = var1 * -1620270375;
      this.j = var2;
      this.e = var3;
      this.f = var4;
      this.h = var5;
      this.g = var6;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.j;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(IZZZI)Z",
      garbageValue = "629555742"
   )
   static boolean a(int var0, boolean var1, boolean var2, boolean var3) {
      int var4 = (var4 = 0 | (var2 ? 1 : 0)) | (var1 ? 8 : 32) | (var3 ? 128 : 0);
      return (var0 & var4) != 0;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "893853754"
   )
   static int a(int var0) {
      if (var0 == 4200) {
         var0 = hE.c[--hE.e];
         hE.n[++aU.a - 1] = cE.a(var0).k;
         return 1;
      } else {
         int var1;
         bC var6;
         if (var0 == 4201) {
            e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            var6 = cE.a(var0);
            if (var1 > 0 && var1 <= 5 && var6.v[var1 - 1] != null) {
               hE.n[++aU.a - 1] = var6.v[var1 - 1];
            } else {
               hE.n[++aU.a - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            e -= 2;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            var6 = cE.a(var0);
            if (var1 > 0 && var1 <= 5 && var6.F[var1 - 1] != null) {
               hE.n[++aU.a - 1] = var6.F[var1 - 1];
            } else {
               hE.n[++aU.a - 1] = "";
            }

            return 1;
         } else if (var0 == 4222) {
            e -= 3;
            var0 = hE.c[hE.e];
            var1 = hE.c[hE.e + 1];
            int var5 = hE.c[hE.e + 2];
            var6 = cE.a(var0);
            String var3 = null;
            if (var1 > 0 && var1 <= 5 && var6.F[var1 - 1] != null && var6.p != null && var6.p[var1 - 1] != null && var5 > 0 && var5 <= var6.p[var1 - 1].length) {
               var3 = var6.p[var1 - 1][var5 - 1];
            }

            hE.n[++aU.a - 1] = var3 != null ? var3 : "";
            return 1;
         } else if (var0 == 4203) {
            var0 = hE.c[--hE.e];
            hE.c[++hE.e - 1] = cE.a(var0).y;
            return 1;
         } else if (var0 == 4204) {
            var0 = hE.c[--hE.e];
            hE.c[++hE.e - 1] = cE.a(var0).C == 1 ? 1 : 0;
            return 1;
         } else {
            bC var2;
            if (var0 == 4205) {
               if ((var2 = cE.a(var0 = hE.c[--hE.e])).s == -1 && var2.o >= 0) {
                  hE.c[++hE.e - 1] = var2.o;
               } else {
                  hE.c[++hE.e - 1] = var0;
               }

               return 1;
            } else if (var0 == 4206) {
               if ((var2 = cE.a(var0 = hE.c[--hE.e])).s >= 0 && var2.o >= 0) {
                  hE.c[++hE.e - 1] = var2.o;
               } else {
                  hE.c[++hE.e - 1] = var0;
               }

               return 1;
            } else if (var0 == 4207) {
               var0 = hE.c[--hE.e];
               hE.c[++hE.e - 1] = cE.a(var0).r ? 1 : 0;
               return 1;
            } else if (var0 == 4208) {
               if ((var2 = cE.a(var0 = hE.c[--hE.e])).W == -1 && var2.T >= 0) {
                  hE.c[++hE.e - 1] = var2.T;
               } else {
                  hE.c[++hE.e - 1] = var0;
               }

               return 1;
            } else if (var0 == 4209) {
               if ((var2 = cE.a(var0 = hE.c[--hE.e])).W >= 0 && var2.T >= 0) {
                  hE.c[++hE.e - 1] = var2.T;
               } else {
                  hE.c[++hE.e - 1] = var0;
               }

               return 1;
            } else if (var0 == 4210) {
               String var4 = (String)hE.n[--aU.a];
               var1 = hE.c[--hE.e];
               gi.a(var4, var1 == 1);
               hE.c[++hE.e - 1] = hx.a;
               return 1;
            } else if (var0 != 4211) {
               if (var0 == 4212) {
                  cJ.a = 0;
                  return 1;
               } else if (var0 == 4213) {
                  if ((var1 = cE.a(hE.c[--hE.e]).a()) == -1) {
                     hE.c[++hE.e - 1] = var1;
                  } else {
                     hE.c[++hE.e - 1] = var1 + 1;
                  }

                  return 1;
               } else if (var0 == 4214) {
                  var0 = hE.c[--hE.e];
                  hE.c[++hE.e - 1] = cE.a(var0).q;
                  return 1;
               } else if (var0 == 4215) {
                  var0 = hE.c[--hE.e];
                  hE.c[++hE.e - 1] = cE.a(var0).A;
                  return 1;
               } else if (var0 == 4216) {
                  var0 = hE.c[--hE.e];
                  hE.c[++hE.e - 1] = cE.a(var0).H;
                  return 1;
               } else if (var0 == 4217) {
                  var2 = cE.a(hE.c[--hE.e]);
                  hE.c[++hE.e - 1] = var2.t;
                  return 1;
               } else if (var0 == 4218) {
                  var0 = hE.c[--hE.e];
                  hE.n[++aU.a - 1] = cE.a(var0).g;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (bB.b != null && cJ.a < hx.a) {
                  hE.c[++hE.e - 1] = bB.b[++cJ.a - 1] & '\uffff';
               } else {
                  hE.c[++hE.e - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("mx")
   @ObfuscatedSignature(
      signature = "(Ltv;ZZZB)Z"
   )
   public static boolean a(hK var0, boolean var1, boolean var2, boolean var3, byte var4) {
      if (var0 == null) {
         boolean var6 = true;
         boolean var5 = true;
         boolean var8 = true;
         int var7 = var0.e * 362129451;
         int var9 = (var9 = 0 | (var5 ? 2 : 0)) | (var8 ? 16 : 64) | (var6 ? 256 : 0);
         boolean var10000;
         if ((var7 & var9) != 0) {
            var10000 = true;
         } else {
            var10000 = false;
         }
      }

      return a(var0.h, true, var2, var3);
   }

   @ObfuscatedName("my")
   @ObfuscatedSignature(
      signature = "(Ltv;IZZZI)Z",
      garbageValue = "-1955885013"
   )
   public static boolean a(hK var0, int var1, boolean var2, boolean var3, boolean var4) {
      int var5 = (var5 = 0 | (var3 ? 2 : 0)) | (var2 ? 16 : 64) | (var4 ? 256 : 0);
      return (var1 & var5) != 0;
   }

   @ObfuscatedName("tf")
   @ObfuscatedSignature(
      signature = "(Ltv;ZZZI)Z"
   )
   public static boolean a(hK var0, boolean var1, boolean var2, boolean var3, int var4) {
      if (var0 == null) {
         boolean var6 = true;
         boolean var5 = true;
         boolean var7 = true;
         a(var0, var0.i, var7, var5, var6);
      }

      return a(var0, var0.h, true, var2, var3);
   }
}
