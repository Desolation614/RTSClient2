package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public final class jF {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lps;Lps;Ltx;ZII)V",
      garbageValue = "1550955576"
   )
   static void a(fB var0, fB var1, hM var2, boolean var3, int var4) {
      if (cj.e) {
         if (var4 == 4) {
            jW.a(4);
            return;
         }
      } else {
         if (var4 == 0) {
            ay.a(var3);
         } else {
            jW.a(var4);
         }

         jd.g();
         jR.a = cA.a(var0.c("title.jpg", ""));
         client.z();
         iT var7 = jR.a;
         iT var8;
         (var8 = new iT(var7.a, var7.e)).g = var7.g;
         var8.f = var7.f;
         var8.d = var7.g - var7.a - var7.d;
         var8.c = var7.c;

         for(int var5 = 0; var5 < var7.e; ++var5) {
            for(int var6 = 0; var6 < var7.a; ++var6) {
               var8.b[var6 + var5 * var7.a] = var7.b[var5 * var7.a + var7.a - 1 - var6];
            }
         }

         R.a = var8;
         client.M();
         eZ.a(var1, client.aY);
         aK.a = fn.a(var1, "titlebox", "");
         S.a = fn.a(var1, "titlebutton", "");
         S.b = fn.a(var1, "titlebutton_alt", "");
         jB.k = fn.a(var1, "titlebutton_large", "");
         bz.c = fn.a(var1, "play_now_text", "");
         fn.a(var1, "titlebutton_wide42,1", "");
         I.a = eY.a(var1, "runes", "");
         dD.b = eY.a(var1, "title_mute", "");
         aR.a = fn.a(var1, "title_radio_buttons,0", "");
         gh.f = fn.a(var1, "title_radio_buttons,4", "");
         kn.a = fn.a(var1, "title_radio_buttons,2", "");
         fs.p = fn.a(var1, "title_radio_buttons,6", "");
         dQ.c = aR.a.g;
         fS.a = aR.a.c;
         iS.c = new ia(I.a, var2.b);
         if (var3) {
            jB.e = "";
            client.C();
            jB.d = "";
            jB.r = new String[8];
            jB.m = 0;
         }

         jV.b = 0;
         kn.b = "";
         jB.p = true;
         jB.u = false;
         cY.a();
         Z.a();
         ec.f.a(false);
         cj.e = true;
         cP.a = (jB.j = (jB.f = (fs.h - 765) / 2) + 204) + 180;
         jR.a.b(jB.f, 0);
         jp.a(eC.a, jB.f + 382 - eC.a.g / 2, 18);
      }

   }

   @ObfuscatedName("mw")
   @ObfuscatedSignature(
      signature = "(Lov;II)I",
      garbageValue = "-1769195292"
   )
   static final int a(fd var0, int var1) {
      if (var0.bN != null && var1 < var0.bN.length) {
         try {
            int[] var11 = var0.bN[var1];
            var1 = 0;
            int var2 = 0;
            byte var3 = 0;

            while(true) {
               int var4 = var11[var2++];
               int var5 = 0;
               byte var6 = 0;
               if (var4 == 0) {
                  return var1;
               }

               if (var4 == 1) {
                  var5 = client.aC[var11[var2++]];
               }

               if (var4 == 2) {
                  var5 = client.al[var11[var2++]];
               }

               if (var4 == 3) {
                  var5 = client.ap[var11[var2++]];
               }

               int var7;
               int var8;
               int var9;
               fd var12;
               if (var4 == 4) {
                  var7 = (var11[var2++] << 16) + var11[var2++];
                  var12 = jD.a.b(var7);
                  if ((var8 = var11[var2++]) != -1 && (!cE.a(var8).r || client.ac)) {
                     for(var9 = 0; var9 < var12.bO.length; ++var9) {
                        if (var8 + 1 == var12.bO[var9]) {
                           var5 += var12.bM[var9];
                        }
                     }
                  }
               }

               if (var4 == 5) {
                  var5 = ej.d[var11[var2++]];
               }

               if (var4 == 6) {
                  var5 = fg.b[client.al[var11[var2++]] - 1];
               }

               if (var4 == 7) {
                  var5 = ej.d[var11[var2++]] * 100 / '뜛';
               }

               if (var4 == 8) {
                  var5 = ai.a.bf;
               }

               if (var4 == 9) {
                  for(var7 = 0; var7 < 25; ++var7) {
                     if (fg.a[var7]) {
                        var5 += client.al[var7];
                     }
                  }
               }

               if (var4 == 10) {
                  var7 = (var11[var2++] << 16) + var11[var2++];
                  var12 = jD.a.b(var7);
                  if ((var8 = var11[var2++]) != -1 && (!cE.a(var8).r || client.ac)) {
                     for(var9 = 0; var9 < var12.bO.length; ++var9) {
                        if (var8 + 1 == var12.bO[var9]) {
                           var5 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var4 == 11) {
                  var5 = client.cg;
               }

               if (var4 == 12) {
                  var5 = client.cb;
               }

               if (var4 == 13) {
                  var7 = ej.d[var11[var2++]];
                  var5 = var11[var2++];
                  var5 = (var7 & 1 << var5) != 0 ? 1 : 0;
               }

               if (var4 == 14) {
                  int var10001 = var2++;
                  int var10000 = var11[var10001];
                  var10001 = var11[var10001];
                  var5 = x.a(var10000);
               }

               if (var4 == 15) {
                  var6 = 1;
               }

               if (var4 == 16) {
                  var6 = 2;
               }

               if (var4 == 17) {
                  var6 = 3;
               }

               if (var4 == 18) {
                  var5 = (ai.a.s >> 7) + aM.a.n;
               }

               if (var4 == 19) {
                  var5 = (ai.a.n >> 7) + aM.a.i;
               }

               if (var4 == 20) {
                  var5 = var11[var2++];
               }

               if (var6 == 0) {
                  if (var3 == 0) {
                     var1 += var5;
                  }

                  if (var3 == 1) {
                     var1 -= var5;
                  }

                  if (var3 == 2 && var5 != 0) {
                     var1 /= var5;
                  }

                  if (var3 == 3) {
                     var1 *= var5;
                  }

                  var3 = 0;
               } else {
                  var3 = var6;
               }
            }
         } catch (Exception var10) {
            return -1;
         }
      } else {
         return -2;
      }
   }
}
