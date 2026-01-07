package osrs;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.worldmap.WorldMapRegion;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public final class dk implements WorldMapRegion {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lmd;"
   )
   static dK a = new dK(37748736, 256);
   @ObfuscatedName("bz")
   static String b;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -2111786059
   )
   int c;
   @ObfuscatedName("ac")
   private HashMap j;
   @ObfuscatedName("ad")
   List d;
   @ObfuscatedName("af")
   HashMap e;
   @ObfuscatedName("ag")
   LinkedList f;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "Lkl;"
   )
   cP g;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 59658863
   )
   int h;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 914011767
   )
   int i;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -532326871
   )
   private int k;

   dk(int var1, int var2, int var3, HashMap var4) {
      this.c = var1;
      this.h = var2;
      this.f = new LinkedList();
      this.d = new LinkedList();
      this.e = new HashMap();
      this.k = var3 | -16777216;
      this.j = var4;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(Lps;I)Z",
      garbageValue = "-2082735223"
   )
   final boolean a(fB var1) {
      this.e.clear();
      if (this.g != null) {
         this.g.a(var1);
         if (this.g.b()) {
            this.a(0, 0, 64, 64, this.g);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         dB var4;
         for(var3 = this.f.iterator(); var3.hasNext(); var2 &= var4.b()) {
            (var4 = (dB)var3.next()).a(var1);
         }

         if (var2) {
            var3 = this.f.iterator();

            while(var3.hasNext()) {
               var4 = (dB)var3.next();
               this.a(dB.a(var4, (byte)77) << 3, var4.b << 3, 8, 8, var4);
            }
         }

         return var2;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(IILlq;Llf;[Lwy;I)V",
      garbageValue = "193150885"
   )
   private void a(int var1, int var2, dy var3, jp[] var4) {
      dy var8 = var3;
      int var7 = var2;
      int var6 = var1;
      dk var5 = this;

      di[] var11;
      int var14;
      int var15;
      int var17;
      for(int var9 = 0; var9 < var8.m; ++var9) {
         di[] var10;
         if ((var10 = var8.n[var9][var6][var7]) != null && var10.length != 0) {
            var11 = var10;

            for(int var12 = 0; var12 < var11.length; ++var12) {
               di var13;
               if ((var14 = (var13 = var11[var12]).b) >= fc.j.m && var14 <= fc.e.m || var14 == fc.f.m) {
                  var15 = jT.b(var13.d).l != 0 ? -3407872 : -3355444;
                  if (var13.b == fc.j.m) {
                     var5.a(var6, var7, var13.c, var15);
                  }

                  if (var13.b == fc.h.m) {
                     var5.a(var6, var7, var13.c, -3355444);
                     var5.a(var6, var7, var13.c + 1, var15);
                  }

                  if (var13.b == fc.e.m) {
                     if (var13.c == 0) {
                        jd.f(var5.i * var6, var5.i * (63 - var7), 1, var15);
                     }

                     if (var13.c == 1) {
                        jd.f(var5.i + var5.i * var6 - 1, var5.i * (63 - var7), 1, var15);
                     }

                     if (var13.c == 2) {
                        jd.f(var5.i * var6 + var5.i - 1, var5.i * (63 - var7) + var5.i - 1, 1, var15);
                     }

                     if (var13.c == 3) {
                        jd.f(var5.i * var6, var5.i * (63 - var7) + var5.i - 1, 1, var15);
                     }
                  }

                  if (var13.b == fc.f.m) {
                     if (var13.c % 2 == 0) {
                        for(var17 = 0; var17 < var5.i; ++var17) {
                           jd.f(var17 + var5.i * var6, (64 - var7) * var5.i - 1 - var17, 1, var15);
                        }
                     } else {
                        for(var17 = 0; var17 < var5.i; ++var17) {
                           jd.f(var17 + var5.i * var6, var17 + var5.i * (63 - var7), 1, var15);
                        }
                     }
                  }
               }
            }
         }
      }

      jp[] var16 = var4;
      var8 = var3;
      var7 = var2;
      var6 = var1;
      var5 = this;

      for(var17 = 0; var17 < var8.m; ++var17) {
         if ((var11 = var8.n[var17][var6][var7]) != null && var11.length != 0) {
            di[] var18 = var11;

            for(int var19 = 0; var19 < var18.length; ++var19) {
               di var20;
               bJ var21;
               if (((var15 = (var20 = var18[var19]).b) >= fc.i.m && var15 <= fc.k.m || Z.b(var20.b)) && (var21 = jT.b(var20.d)).J != -1) {
                  var14 = var20.c != 1 && var20.c != 3 ? var21.o : var21.q * -1313509743;
                  jp.a(var16[var21.J], var5.i * var6, var5.i * (64 - var14 - var7), var5.i << 1, var5.i << 1);
               }
            }
         }
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Lik;IIILlq;I)V",
      garbageValue = "-811016557"
   )
   private void a(bJ var1, int var2, int var3, int var4, dy var5) {
      ew var6 = new ew(var2, var3 + (this.c << 6), (this.h << 6) + var4);
      ew var8;
      if (this.g != null) {
         var8 = new ew(this.g.g + var2, var3 + this.g.d * 214840896, var4 + (this.g.c << 6));
      } else {
         dB var9 = (dB)var5;
         var8 = new ew(var2 + var9.g, var9.d * 214840896 + var3 + (var9.p << 3), var4 + (var9.c << 6) + (var9.q << 3));
      }

      Object var7;
      if (var1.v != null) {
         var7 = new dc(var8, var6, var1.k, this);
      } else {
         bi var10 = aL.a(var1.z);
         var7 = new dw(var8, var6, var10.g, a(this, var10, (byte)99));
      }

      if (aL.a(((dz)var7).b()).q) {
         this.e.put(new ew(0, var3, var4), var7);
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(IIIILlq;I)V",
      garbageValue = "1982881902"
   )
   private void a(int var1, int var2, int var3, int var4, dy var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label66:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            for(int var8 = 0; var8 < var5.m; ++var8) {
               di[] var9;
               if ((var9 = var5.n[var8][var6][var7]) != null && var9.length != 0) {
                  var9 = var9;

                  for(int var10 = 0; var10 < var9.length; ++var10) {
                     bJ var11;
                     boolean var15;
                     label57: {
                        if ((var11 = jT.b(var9[var10].d)).v != null) {
                           int[] var12 = var11.v;

                           for(int var13 = 0; var13 < var12.length; ++var13) {
                              if (jT.b(var12[var13]).z != -1) {
                                 var15 = true;
                                 break label57;
                              }
                           }
                        } else if (var11.z != -1) {
                           var15 = true;
                           break label57;
                        }

                        var15 = false;
                     }

                     if (var15) {
                        this.a(var11, var8, var6, var7, var5);
                        continue label66;
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(IILlq;Llf;I)V"
   )
   private void a(int var1, int var2, dy var3, dl var4, int var5) {
      for(int var6 = 1; var6 < var3.d * 613742515; ++var6) {
         int var7;
         if ((var7 = var3.j[var6][var1][var2] - 1) >= 0) {
            if (var5 == -1239415635) {
               return;
            }

            var7 = bi.a(var7, this.c * 1989282085);
            if (var3.o[var6][var1][var2] == 0) {
               jd.o(this.h * var1 * -888782727, this.h * (63 - var2) * -888782727, this.c * -639961861, this.h * -888782727, var7);
            } else {
               dl.a(var4, this.i * var1, this.i * (63 - var2), 0, var7, this.k * 242285471, this.i, var3.i[var6][var1][var2], var3.i[var6][var1][var2], (byte)1);
            }
         }
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "71"
   )
   final void a() {
      if (this.g != null) {
         this.g.a();
      } else {
         Iterator var1 = this.f.iterator();

         while(var1.hasNext()) {
            ((dB)var1.next()).a();
         }

      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(IILlq;Llj;B)I",
      garbageValue = "112"
   )
   private int a(int var1, int var2, dy var3, dp var4) {
      if (var3.j[0][var1][var2] == 0) {
         return this.k;
      } else {
         int var10001 = var1;
         boolean var5 = true;
         int var6 = var2;
         var2 = var10001;
         return var4 == null ? var4.a[(var2 << 6) + var2] : var4.a[(var6 << 6) + var2];
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(Ljava/util/List;I)V",
      garbageValue = "1364496738"
   )
   final void a(List var1) {
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         dw var2;
         if (aL.a((var2 = (dw)var3.next()).a).q && var2.b.b >> 6 == this.c && var2.b.c * -1165521101 >> 6 == this.h) {
            var2 = new dw(var2.b, var2.b, var2.a, a(this, var2.a));
            this.d.add(var2);
         }
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(IILlq;Llf;Llj;I)V",
      garbageValue = "1229839249"
   )
   private void a(int var1, int var2, dy var3, dl var4, dp var5) {
      int var6 = var3.j[0][var1][var2] - 1;
      int var7 = var3.f[0][var1][var2] - 1;
      if (var6 == -1 && var7 == -1) {
         jd.h(this.i * var1, this.i * (63 - var2), this.i, this.i, this.k);
      }

      var6 = 16711935;
      if (var7 != -1) {
         var6 = bi.a(var7, this.k);
      }

      if (var7 >= 0 && var3.i[0][var1][var2] == 0) {
         jd.h(this.i * var1, this.i * (63 - var2), this.i, this.i, var6);
      } else {
         int var8 = this.a(var1, var2, var3, var5);
         if (var7 == -1) {
            jd.h(this.i * var1, this.i * (63 - var2), this.i, this.i, var8);
         } else {
            dl.a(var4, this.i * var1, this.i * (63 - var2), var8, var6, this.i, this.i, var3.i[0][var1][var2], var3.o[0][var1][var2], (byte)1);
         }
      }
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(Lhm;IIIII)V",
      garbageValue = "-1177876423"
   )
   static void a(bi var0, int var1, int var2, int var3, int var4) {
      iT var5;
      if ((var5 = var0.a(false)) != null) {
         var5.a(var1 - var5.a / 2, var2 - var5.e / 2);
         if (var3 % var4 < var4 / 2) {
            jd.i(var1, var2, 15, 16776960, 128);
            jd.i(var1, var2, 7, 16777215, 256);
         }
      }

   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(B)Ljava/util/List;",
      garbageValue = "1"
   )
   final List b() {
      LinkedList var1;
      (var1 = new LinkedList()).addAll(this.d);
      var1.addAll(this.e.values());
      return var1;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(Llr;Lhm;IIFI)V",
      garbageValue = "233258018"
   )
   private void a(dz var1, bi var2, int var3, int var4, float var5) {
      dx var7;
      if ((var7 = var1.d()) != null) {
         float var6 = var5;
         cL var8 = var7.a;
         if (var6 >= (float)var8.d) {
            gp var9;
            (var9 = (gp)this.j.get(var7.a)).a(var7.d, var3 - var7.b / 2, var4, var7.b, var7.c, -16777216 | var2.k, 0, 1, 0, var9.c / 2);
         }
      }

   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "2065501065"
   )
   private void a(int var1, int var2, int var3, int var4) {
      if ((var3 %= 4) == 0) {
         jd.g(this.i * var1, this.i * (63 - var2), this.i, var4);
      }

      if (var3 == 1) {
         jd.f(this.i * var1, this.i * (63 - var2), this.i, var4);
      }

      if (var3 == 2) {
         jd.g(this.i * var1 + this.i - 1, this.i * (63 - var2), this.i, var4);
      }

      if (var3 == 3) {
         jd.f(this.i * var1, this.i * (63 - var2) + this.i - 1, this.i, var4);
      }

   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(Lhm;IIB)V",
      garbageValue = "1"
   )
   private void a(bi var1, int var2, int var3) {
      iT var4;
      if ((var4 = var1.a(false)) != null) {
         boolean var5 = true;
         bt var9 = var1.o;
         int var10000;
         switch(var9.e) {
         case 0:
            var10000 = -var4.a / 2;
            break;
         case 1:
            var10000 = 0;
            break;
         default:
            var10000 = -var4.a;
         }

         int var10 = var10000;
         bn var7 = var1.r;
         switch(var7.e) {
         case 1:
            var10000 = 0;
            break;
         case 2:
            var10000 = -var4.e / 2;
            break;
         default:
            var10000 = -var4.e;
         }

         int var8 = var10000;
         var4.a(var10 + var2, var3 + var8);
      }

   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(Lhm;B)Llp;"
   )
   private dx a(bi var1) {
      if (var1.m != null && this.j != null && this.j.get(cL.c) != null) {
         cL var2;
         if ((var2 = cL.a(var1.k * -654757473)) == null) {
            return null;
         } else {
            gp var3;
            if ((var3 = (gp)this.j.get(var2)) == null) {
               return null;
            } else {
               int var4 = 1000000;
               String var5 = var1.l;
               String[] var9 = new String[gw.a(var3, var5, new int[]{1000000}, gw.a)];
               gw.a(var3, var1.l, (int[])null, var9);
               int var10 = var9.length * var3.d / 2;
               int var6 = 0;
               var9 = var9;

               for(int var7 = 0; var7 < var9.length; ++var7) {
                  String var8 = var9[var7];
                  int var11;
                  if ((var11 = var3.b(var8)) > var6) {
                     var6 = var11;
                  }
               }

               return new dx(var1.m, var6, var10, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(Llr;IIFB)V",
      garbageValue = "65"
   )
   final void a(dz var1, int var2, int var3, float var4) {
      bi var5 = aL.a(var1.b());
      this.a(var5, var2, var3);
      this.a(var1, var5, var2, var3, var4);
   }

   public final Collection getMapIcons() {
      return Collections.unmodifiableCollection(this.e.values());
   }

   @ObfuscatedName("zk")
   @ObfuscatedSignature(
      signature = "(Lle;II)Llp;",
      garbageValue = "-1121309782"
   )
   private static dx a(dk var0, int var1) {
      bi var2 = aL.a(var1);
      return a(var0, var2, (byte)112);
   }

   @ObfuscatedName("yl")
   @ObfuscatedSignature(
      signature = "(Lle;IIIIII)Ljava/util/List;",
      garbageValue = "2092358045"
   )
   public static List a(dk var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         int var11 = var1;
         int var10 = var1;
         LinkedList var12 = new LinkedList();
         if (var1 >= var1 && var1 >= var1) {
            if (var1 < var1 + var1 && var1 < var1 + var1) {
               Iterator var7 = var0.e.values().iterator();

               dz var8;
               while(var7.hasNext()) {
                  if ((var8 = (dz)var7.next()).i() && var8.b(var10, var11)) {
                     var12.add(var8);
                  }
               }

               var7 = var0.d.iterator();

               while(var7.hasNext()) {
                  if ((var8 = (dz)var7.next()).i() && var8.b(var10, var11)) {
                     var12.add(var8);
                  }
               }
            }
         }
      }

      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var13 = var0.e.values().iterator();

            dz var14;
            while(var13.hasNext()) {
               if ((var14 = (dz)var13.next()).i() && var14.b(var4, var5)) {
                  var6.add(var14);
               }
            }

            var13 = var0.d.iterator();

            while(var13.hasNext()) {
               if ((var14 = (dz)var13.next()).i() && var14.b(var4, var5)) {
                  var6.add(var14);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lps;IIB)Lwy;",
      garbageValue = "-98"
   )
   static jp a(fB var0, int var1, int var2) {
      return !aE.a(var0, var1, var2) ? null : as.b();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(IB)Lbd;",
      garbageValue = "72"
   )
   static dj a(int var0) {
      return (dj)ki.b.b((long)var0);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(IS)I",
      garbageValue = "11992"
   )
   public static int b(int var0) {
      return var0 >> 3 & 2047;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1070819827"
   )
   public static String a(String var0) {
      StringBuilder var1 = new StringBuilder(var0.length());
      int var2 = 0;
      int var3 = -1;

      for(int var4 = 0; var4 < var0.length(); ++var4) {
         char var5;
         if ((var5 = var0.charAt(var4)) == '<') {
            var1.append(var0.substring(var2, var4));
            var3 = var4;
         } else if (var5 == '>' && var3 != -1) {
            String var6 = var0.substring(var3 + 1, var4);
            var3 = -1;
            if (var6.equals("lt")) {
               var1.append("<");
            } else if (var6.equals("gt")) {
               var1.append(">");
            } else if (var6.equals("br")) {
               var1.append("\n");
            }

            var2 = var4 + 1;
         }
      }

      if (var2 < var0.length()) {
         var1.append(var0.substring(var2, var0.length()));
      }

      return var1.toString();
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      signature = "(Lle;Llf;[Lwy;Llj;I)V"
   )
   public static void a(dk var0, dl var1, jp[] var2, dp var3, int var4) {
      int var5;
      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            var0.a(var4, var5, var0.g, var1, var3);
            a(var0, var4, var5, var0.g, var1);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            var0.a(var4, var5, var0.g, (jp[])var2);
         }
      }

   }

   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      signature = "(Lle;IILlq;Llf;I)V",
      garbageValue = "-690658425"
   )
   private static void a(dk var0, int var1, int var2, dy var3, dl var4) {
      if (var0 == null) {
         var0.a(var1, var1, var3, var4, var1);
      }

      for(int var5 = 1; var5 < var3.m; ++var5) {
         int var6;
         if ((var6 = var3.f[var5][var1][var2] - 1) >= 0) {
            var6 = bi.a(var6, var0.k);
            if (var3.i[var5][var1][var2] == 0) {
               jd.h(var0.i * var1, var0.i * (63 - var2), var0.i, var0.i, var6);
            } else {
               dl.a(var4, var0.i * var1, var0.i * (63 - var2), 0, var6, var0.i, var0.i, var3.i[var5][var1][var2], var3.o[var5][var1][var2], (byte)1);
            }
         }
      }

   }

   @ObfuscatedName("kg")
   @ObfuscatedSignature(
      signature = "(Lle;Llf;[Lwy;Llj;I)V"
   )
   public static void b(dk var0, dl var1, jp[] var2, dp var3, int var4) {
      Iterator var9 = var0.f.iterator();

      dB var5;
      int var6;
      int var7;
      while(var9.hasNext()) {
         for(var6 = dB.a(var5 = (dB)var9.next(), (byte)63) << 3; var6 < (dB.a(var5, (byte)99) << 3) + 8; ++var6) {
            for(var7 = var5.b << 3; var7 < (var5.b << 3) + 8; ++var7) {
               var0.a(var6, var7, var5, var1, var3);
               a(var0, var6, var7, var5, var1);
            }
         }
      }

      var9 = var0.f.iterator();

      while(var9.hasNext()) {
         for(var6 = dB.a(var5 = (dB)var9.next(), (byte)127) << 3; var6 < (dB.a(var5, (byte)46) << 3) + 8; ++var6) {
            for(var7 = var5.b << 3; var7 < (var5.b << 3) + 8; ++var7) {
               var0.a(var6, var7, var5, (jp[])var2);
            }
         }
      }

   }

   @ObfuscatedName("nw")
   @ObfuscatedSignature(
      signature = "(Lle;Lhm;B)Llp;"
   )
   public static dx a(dk var0, bi var1, byte var2) {
      if (var0 == null) {
         return var0.a(var1);
      } else if (var1.m != null && var0.j != null && var0.j.get(cL.c) != null) {
         cL var9;
         if ((var9 = cL.a(var1.t)) == null) {
            return null;
         } else {
            gp var8;
            if ((var8 = (gp)var0.j.get(var9)) == null) {
               return null;
            } else {
               String[] var3 = new String[var8.a(var1.m, 1000000)];
               gw.a(var8, var1.m, (int[])null, var3);
               int var4 = var3.length * var8.c / 2;
               int var5 = 0;
               var3 = var3;

               for(int var6 = 0; var6 < var3.length; ++var6) {
                  String var7 = var3[var6];
                  int var10;
                  if ((var10 = var8.a(var7)) > var5) {
                     var5 = var10;
                  }
               }

               return new dx(var1.m, var5, var4, var9);
            }
         }
      } else {
         return null;
      }
   }
}
