package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public final class dJ {
   @ObfuscatedName("di")
   @ObfuscatedSignature(
      signature = "[Lwy;"
   )
   static jp[] a;
   @ObfuscatedName("pc")
   static int[] b;

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(ILcr;ZB)I",
      garbageValue = "7"
   )
   static int a(int var0, boolean var1) {
      String var5;
      if (var0 == 3100) {
         var5 = (String)hE.n[--aU.a];
         fu.a(0, "", var5);
         return 1;
      } else if (var0 == 3101) {
         hE.e -= 2;
         fY.a(ai.a, hE.c[hE.e], hE.c[hE.e + 1]);
         return 1;
      } else if (var0 == 3103) {
         if (!hE.m) {
            hE.g = true;
         }

         return 1;
      } else {
         int var2;
         dQ var7;
         if (var0 == 3104) {
            var5 = (String)hE.n[--aU.a];
            var2 = 0;
            if (dG.a(var5)) {
               var2 = ao.a((CharSequence)var5);
            }

            (var7 = X.a(j.aa, client.P.f)).g.c(var2);
            client.P.a(var7);
            return 1;
         } else if (var0 == 3105) {
            var5 = (String)hE.n[--aU.a];
            (var7 = X.a(j.Q, client.P.f)).g.b(var5.length() + 1);
            jk.a(var7.g, (String)var5, -1559098139);
            client.P.a(var7);
            return 1;
         } else if (var0 == 3106) {
            var5 = (String)hE.n[--aU.a];
            (var7 = X.a(j.aG, client.P.f)).g.b(var5.length() + 1);
            jk.a(var7.g, (String)var5, -1559098139);
            client.P.a(var7);
            return 1;
         } else {
            int var3;
            if (var0 == 3107) {
               var3 = hE.c[--hE.e];
               var5 = (String)hE.n[--aU.a];
               kg.a(var3, var5);
               return 1;
            } else if (var0 == 3108) {
               hE.e -= 3;
               var3 = hE.c[hE.e];
               var2 = hE.c[hE.e + 1];
               int var8 = hE.c[hE.e + 2];
               al.a(jD.a.b(var8), var3, var2);
               return 1;
            } else if (var0 == 3109) {
               hE.e -= 2;
               var3 = hE.c[hE.e];
               var2 = hE.c[hE.e + 1];
               al.a(var1 ? ic.a : ef.a, var3, var2);
               return 1;
            } else if (var0 == 3110) {
               I.b = hE.c[--hE.e] == 1;
               return 1;
            } else if (var0 == 3111) {
               hE.c[++hE.e - 1] = j.aS.m ? 1 : 0;
               return 1;
            } else if (var0 == 3112) {
               j.aS.b(hE.c[--hE.e] == 1);
               return 1;
            } else if (var0 == 3113) {
               var5 = (String)hE.n[--aU.a];
               int var10000 = hE.c[--hE.e];
               eo.a(var5);
               return 1;
            } else if (var0 == 3115) {
               var3 = hE.c[--hE.e];
               (var7 = X.a(j.ad, client.P.f)).g.d(var3);
               client.P.a(var7);
               return 1;
            } else if (var0 == 3116) {
               var3 = hE.c[--hE.e];
               aU.a -= 2;
               var5 = (String)hE.n[aU.a];
               String var6 = (String)hE.n[aU.a + 1];
               if (var5.length() > 500) {
                  return 1;
               } else if (var6.length() > 500) {
                  return 1;
               } else {
                  dQ var4;
                  (var4 = X.a(j.T, client.P.f)).g.d(1 + hd.a(var5) + hd.a(var6));
                  jk.a(var4.g, (String)var5, -1559098139);
                  var4.g.n(var3);
                  jk.a(var4.g, (String)var6, -1559098139);
                  client.P.a(var4);
                  return 1;
               }
            } else if (var0 == 3117) {
               --hE.e;
               return 1;
            } else if (var0 == 3118) {
               client.aJ = hE.c[--hE.e] == 1;
               return 1;
            } else if (var0 == 3119) {
               client.ao = hE.c[--hE.e] == 1;
               return 1;
            } else if (var0 == 3120) {
               if (hE.c[--hE.e] == 1) {
                  client.ay |= 1;
               } else {
                  client.ay &= -2;
               }

               return 1;
            } else if (var0 == 3121) {
               if (hE.c[--hE.e] == 1) {
                  client.ay |= 2;
               } else {
                  client.ay &= -3;
               }

               return 1;
            } else if (var0 == 3122) {
               if (hE.c[--hE.e] == 1) {
                  client.ay |= 4;
               } else {
                  client.ay &= -5;
               }

               return 1;
            } else if (var0 == 3123) {
               if (hE.c[--hE.e] == 1) {
                  client.ay |= 8;
               } else {
                  client.ay &= -9;
               }

               return 1;
            } else if (var0 == 3124) {
               client.ay = 0;
               return 1;
            } else if (var0 == 3125) {
               client.aB = hE.c[--hE.e] == 1;
               return 1;
            } else if (var0 == 3126) {
               client.aq = hE.c[--hE.e] == 1;
               return 1;
            } else if (var0 == 3127) {
               N.a(hE.c[--hE.e] == 1);
               return 1;
            } else if (var0 == 3128) {
               hE.c[++hE.e - 1] = eA.a() ? 1 : 0;
               return 1;
            } else if (var0 == 3129) {
               hE.e -= 2;
               client.ar = hE.c[hE.e];
               client.at = hE.c[hE.e + 1];
               return 1;
            } else if (var0 == 3130) {
               hE.e -= 2;
               return 1;
            } else if (var0 == 3131) {
               --hE.e;
               return 1;
            } else if (var0 == 3132) {
               hE.c[++hE.e - 1] = fs.h;
               hE.c[++hE.e - 1] = fs.a;
               return 1;
            } else if (var0 == 3133) {
               --hE.e;
               return 1;
            } else if (var0 == 3134) {
               return 1;
            } else if (var0 == 3135) {
               hE.e -= 2;
               return 1;
            } else if (var0 == 3136) {
               client.bV = 3;
               client.bZ = hE.c[--hE.e];
               return 1;
            } else if (var0 == 3137) {
               client.bV = 2;
               client.bZ = hE.c[--hE.e];
               return 1;
            } else if (var0 == 3138) {
               client.bV = 0;
               return 1;
            } else if (var0 == 3139) {
               client.bV = 1;
               return 1;
            } else if (var0 == 3140) {
               client.bV = 3;
               client.bZ = var1 ? ic.a.m : ef.a.m;
               return 1;
            } else if (var0 == 3141) {
               var1 = hE.c[--hE.e] == 1;
               j.aS.a(var1);
               return 1;
            } else if (var0 == 3142) {
               hE.c[++hE.e - 1] = jD.d(j.aS, (byte)123) ? 1 : 0;
               return 1;
            } else if (var0 == 3143) {
               client.ah = var1 = hE.c[--hE.e] == 1;
               if (!var1) {
                  j.aS.a("");
               }

               return 1;
            } else if (var0 == 3144) {
               hE.c[++hE.e - 1] = client.ah ? 1 : 0;
               return 1;
            } else if (var0 == 3145) {
               return 1;
            } else if (var0 == 3146) {
               var1 = hE.c[--hE.e] == 1;
               j.aS.c(!var1);
               return 1;
            } else if (var0 == 3147) {
               hE.c[++hE.e - 1] = jD.b(j.aS, (byte)73) ? 0 : 1;
               return 1;
            } else if (var0 == 3148) {
               return 1;
            } else if (var0 == 3149) {
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3150) {
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3151) {
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3152) {
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3153) {
               hE.c[++hE.e - 1] = jB.b;
               return 1;
            } else if (var0 == 3154) {
               hE.c[++hE.e - 1] = dc.h();
               return 1;
            } else if (var0 == 3155) {
               --aU.a;
               return 1;
            } else if (var0 == 3156) {
               return 1;
            } else if (var0 == 3157) {
               hE.e -= 2;
               return 1;
            } else if (var0 == 3158) {
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3159) {
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3160) {
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3161) {
               --hE.e;
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3162) {
               --hE.e;
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3163) {
               --aU.a;
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3164) {
               --hE.e;
               hE.n[++aU.a - 1] = "";
               return 1;
            } else if (var0 == 3165) {
               --hE.e;
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3166) {
               hE.e -= 2;
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3167) {
               hE.e -= 2;
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3168) {
               hE.e -= 2;
               hE.n[++aU.a - 1] = "";
               hE.n[++aU.a - 1] = "";
               hE.n[++aU.a - 1] = "";
               hE.n[++aU.a - 1] = "";
               hE.n[++aU.a - 1] = "";
               hE.n[++aU.a - 1] = "";
               hE.n[++aU.a - 1] = "";
               hE.n[++aU.a - 1] = "";
               hE.n[++aU.a - 1] = "";
               return 1;
            } else if (var0 == 3169) {
               return 1;
            } else if (var0 == 3170) {
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3171) {
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3172) {
               --hE.e;
               return 1;
            } else if (var0 == 3173) {
               --hE.e;
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3174) {
               --hE.e;
               return 1;
            } else if (var0 == 3175) {
               hE.c[++hE.e - 1] = 0;
               return 1;
            } else if (var0 == 3176) {
               return 1;
            } else if (var0 == 3177) {
               return 1;
            } else if (var0 == 3178) {
               --aU.a;
               return 1;
            } else if (var0 == 3179) {
               return 1;
            } else if (var0 == 3180) {
               --aU.a;
               return 1;
            } else if (var0 == 3181) {
               ed.a(hE.c[--hE.e]);
               return 1;
            } else if (var0 == 3182) {
               hE.c[++hE.e - 1] = bG.e();
               return 1;
            } else if (var0 == 3185) {
               var3 = hE.c[--hE.e];
               j.aS.a(var3);
               return 1;
            } else if (var0 == 3186) {
               var3 = j.aS.o;
               hE.c[++hE.e - 1] = var3;
               return 1;
            } else if (var0 == 3189) {
               gY.a(hE.c[--hE.e]);
               return 1;
            } else {
               return 2;
            }
         }
      }
   }
}
