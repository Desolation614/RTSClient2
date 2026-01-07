package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wn")
public class je {
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1856428221
   )
   private int e;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1660990085
   )
   final int a;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -416978369
   )
   final int b;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1259741417
   )
   final int c;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1776427703
   )
   final int d;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1802080819
   )
   private int f;

   je(int var1, int var2, int var3, int var4) {
      this.f = var1;
      this.e = var2;
      this.a = var3;
      this.d = var4;
      this.c = var1 / 2;
      this.b = var2 / 2;
   }

   public String toString() {
      return String.format("%dx%d (offset %d,%d)", this.f, this.e, this.a, this.d);
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "287206824"
   )
   static int a(int var0) {
      int var1;
      hD var5;
      hD var6;
      if (var0 == 8000) {
         if (client.ae >= 5) {
            a -= 2;
            var5 = eJ.a(hE.n[aU.a]);
            var6 = (hD)hE.n[aU.a + 1];
            fu.a(var5, var6);
         } else {
            --hE.e;
            var0 = hE.c[hE.e];
            var1 = hE.h[var0];
            et.a(hE.a[var0], new int[var1], 0, var1 - 1);
         }

         return 1;
      } else {
         int var7;
         if (var0 == 8001) {
            if (client.ae >= 5) {
               hE.e -= 2;
               var0 = hE.c[hE.e];
               var1 = hE.c[hE.e + 1];
               gr.a(eJ.a(hE.n[--aU.a]), var0, var1);
            } else {
               hE.e -= 3;
               var0 = hE.c[hE.e];
               var1 = hE.c[hE.e + 1];
               var7 = hE.c[hE.e + 2];
               int var12;
               if ((var12 = hE.h[var0]) <= 1) {
                  return 1;
               }

               hh.a(hE.a[var0], var12, var1, var7);
            }

            return 1;
         } else if (var0 == 8002) {
            var5 = (hD)hE.n[--aU.a];
            hE.c[++hE.e - 1] = var5 == null ? 1 : 0;
            return 1;
         } else if (var0 == 8003) {
            var5 = (hD)hE.n[--aU.a];
            hE.c[++hE.e - 1] = var5 != null ? var5.c * 935110769 : 0;
            return 1;
         } else if (var0 == 8004) {
            a -= 2;
            var5 = (hD)hE.n[aU.a];
            var6 = (hD)hE.n[aU.a + 1];
            hE.c[++hE.e - 1] = bI.a(var5, var6);
            return 1;
         } else {
            hD var10;
            Object var13;
            if (var0 == 8005) {
               hE.e -= 3;
               var0 = hE.c[hE.e];
               var1 = hE.c[hE.e + 1];
               var13 = fw.a(hE.c[hE.e + 2]);
               var10 = (hD)hE.n[--aU.a];
               hE.c[++hE.e - 1] = var10 != null ? C.a(var10, var13, var0, var1) : -1;
               return 1;
            } else if (var0 == 8006) {
               hE.e -= 3;
               var0 = hE.c[hE.e];
               var1 = hE.c[hE.e + 1];
               var13 = fw.a(hE.c[hE.e + 2]);
               var10 = (hD)hE.n[--aU.a];
               hE.c[++hE.e - 1] = var10 != null ? eI.a(var10, var13, var0, var1) : -1;
               return 1;
            } else if (var0 == 8007) {
               hE.e -= 3;
               var0 = hE.c[hE.e];
               var1 = hE.c[hE.e + 1];
               var13 = fw.a(hE.c[hE.e + 2]);
               var10 = (hD)hE.n[--aU.a];
               hE.c[++hE.e - 1] = var10 != null ? dp.a(var10, var13, var0, var1) : 0;
               return 1;
            } else {
               String var14;
               if (var0 == 8008) {
                  var1 = gq.a(var5 = eJ.a(hE.n[--aU.a]));
                  if (var5.d == iv.c) {
                     hE.c[++hE.e - 1] = var1 >= 0 ? var5.a[var1] : -1;
                  } else {
                     if (var5.d != iv.b) {
                        throw new IllegalStateException();
                     }

                     var14 = (String)(var1 >= 0 ? var5.b[var1] : null);
                     hE.n[++aU.a - 1] = var14 != null ? var14 : "";
                  }

                  return 1;
               } else if (var0 == 8009) {
                  var1 = dn.a(var5 = eJ.a(hE.n[--aU.a]));
                  if (var5.d == iv.c) {
                     hE.c[++hE.e - 1] = var1 >= 0 ? var5.a[var1] : -1;
                  } else {
                     if (var5.d != iv.b) {
                        throw new IllegalStateException();
                     }

                     var14 = (String)(var1 >= 0 ? var5.b[var1] : null);
                     hE.n[++aU.a - 1] = var14 != null ? var14 : "";
                  }

                  return 1;
               } else if (var0 == 8010) {
                  hE.e -= 3;
                  var0 = hE.c[hE.e];
                  var1 = hE.c[hE.e + 1];
                  var13 = fw.a(hE.c[hE.e + 2]);
                  bF.a(eJ.a(hE.n[--aU.a]), var13, var0, var1);
                  return 1;
               } else if (var0 == 8011) {
                  hE.e -= 3;
                  var0 = hE.c[hE.e];
                  var1 = hE.c[hE.e + 1];
                  var7 = hE.c[hE.e + 2];
                  ha.a(eJ.a(hE.n[--aU.a]), var0, 1, var1, var7);
                  return 1;
               } else if (var0 == 8012) {
                  hI.a(eJ.a(hE.n[--aU.a]));
                  return 1;
               } else if (var0 == 8013) {
                  var0 = hE.c[--hE.e];
                  hC.a(eJ.a(hE.n[--aU.a]), var0);
                  return 1;
               } else if (var0 == 8014) {
                  hE.e -= 2;
                  var0 = hE.c[hE.e];
                  var1 = hE.c[hE.e + 1];
                  dB.a(eJ.a(hE.n[--aU.a]), var0, var1);
                  return 1;
               } else if (var0 == 8015) {
                  hE.e -= 3;
                  var0 = hE.c[hE.e];
                  var1 = hE.c[hE.e + 1];
                  var7 = hE.c[hE.e + 2];
                  a -= 2;
                  hD var4 = eJ.a(hE.n[aU.a]);
                  var10 = eJ.a(hE.n[aU.a + 1]);
                  fm.a(var4, var10, var0, var1, var7);
                  return 1;
               } else if (var0 == 8016) {
                  var5 = eJ.a(hE.n[--aU.a]);
                  hE.c[++hE.e - 1] = (int)hG.a(var5);
                  return 1;
               } else if (var0 == 8017) {
                  var5 = eJ.a(hE.n[--aU.a]);
                  var1 = hE.c[--hE.e];
                  hE.c[++hE.e - 1] = cQ.a(var5, var1);
                  return 1;
               } else {
                  String var8;
                  if (var0 == 8018) {
                     a -= 2;
                     String var11 = (String)hE.n[aU.a];
                     var8 = (String)hE.n[aU.a + 1];
                     hE.n[++aU.a - 1] = eC.a(var11, var8);
                     return 1;
                  } else if (var0 == 8019) {
                     a -= 2;
                     var5 = eJ.a(hE.n[aU.a]);
                     var8 = (String)hE.n[aU.a + 1];
                     hE.n[++aU.a - 1] = bL.a(var5, var8);
                     return 1;
                  } else {
                     bw var9;
                     if (var0 == 8020) {
                        hE.e -= 2;
                        var0 = hE.c[hE.e];
                        var9 = dO.a(hE.c[hE.e + 1]);
                        if (var0 != var9.k) {
                           throw new RuntimeException();
                        } else {
                           hE.n[++aU.a - 1] = var9.a();
                           return 1;
                        }
                     } else if (var0 == 8021) {
                        hE.e -= 2;
                        var0 = hE.c[hE.e];
                        var9 = dO.a(hE.c[hE.e + 1]);
                        if (var0 != var9.h) {
                           throw new RuntimeException();
                        } else {
                           hE.n[++aU.a - 1] = bw.a(var9, -957403934);
                           return 1;
                        }
                     } else if (var0 == 8022) {
                        hE.e -= 3;
                        var0 = hE.c[hE.e];
                        var1 = hE.c[hE.e + 1];
                        if ((var7 = hE.c[hE.e + 2]) < var1) {
                           var7 = var1;
                        }

                        if (var1 >= 0 && var1 <= 5000 && var7 >= 0 && var7 <= 5000) {
                           if (var0 == 115) {
                              hE.n[++aU.a - 1] = new hD(iv.b, "", var1, var7);
                           } else if (var0 != 105 && var0 != 49) {
                              hE.n[++aU.a - 1] = new hD(iv.c, -1, var1, var7);
                           } else {
                              hE.n[++aU.a - 1] = new hD(iv.c, 0, var1, var7);
                           }

                           return 1;
                        } else {
                           throw new RuntimeException();
                        }
                     } else if (var0 == 8023) {
                        var0 = hE.c[--hE.e];
                        var6 = eJ.a(hE.n[--aU.a]);
                        if (var0 >= 0 && var0 <= 5000) {
                           var6.a(var0);
                           return 1;
                        } else {
                           throw new RuntimeException();
                        }
                     } else {
                        hD var2;
                        Object var3;
                        if (var0 == 8024) {
                           var3 = fw.a(hE.c[--hE.e]);
                           iv.a(var2 = eJ.a(hE.n[--aU.a]), var2.c * 935110769, var3);
                           return 1;
                        } else if (var0 == 8025) {
                           hE.e -= 2;
                           var0 = hE.c[hE.e];
                           var3 = fw.a(hE.c[hE.e + 1]);
                           iv.a(eJ.a(hE.n[--aU.a]), var0, var3);
                           return 1;
                        } else if (var0 == 8026) {
                           var0 = hE.c[--hE.e];
                           var3 = eZ.a(var6 = eJ.a(hE.n[--aU.a]), var0);
                           eK.a(var6.d, var3);
                           return 1;
                        } else if (var0 == 8027) {
                           a -= 2;
                           var5 = eJ.a(hE.n[aU.a]);
                           var6 = eJ.a(hE.n[aU.a + 1]);
                           dE.a(var5, var6, var5.c * 935110769);
                           return 1;
                        } else if (var0 == 8028) {
                           var0 = hE.c[--hE.e];
                           a -= 2;
                           var6 = eJ.a(hE.n[aU.a]);
                           var2 = eJ.a(hE.n[aU.a + 1]);
                           dE.a(var6, var2, var0);
                           return 1;
                        } else if (var0 == 8029) {
                           hE.e -= 2;
                           var0 = hE.c[hE.e];
                           var1 = hE.c[hE.e + 1];
                           eP.a(eJ.a(hE.n[--aU.a]), var0, var1);
                           return 1;
                        } else {
                           return 2;
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
