package osrs;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public final class p {
   @ObfuscatedName("av")
   public static byte[][][] a;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "Lwt;"
   )
   private jk h = new jk(new byte[5000]);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "[Lkt;"
   )
   private cX[] i = new cX[2048];
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1458080759
   )
   int b = 0;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -664872917
   )
   private int j = 0;
   @ObfuscatedName("ag")
   final int[] c = new int[2048];
   @ObfuscatedName("ah")
   final int[] d = new int[2048];
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "[Lby;"
   )
   final hv[] e = new hv[2048];
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -2126448481
   )
   int f = 0;
   @ObfuscatedName("al")
   private boolean[] k = new boolean[2048];
   @ObfuscatedName("am")
   private String[] l = new String[3];
   @ObfuscatedName("an")
   final int[] g = new int[2048];
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -396474707
   )
   private int m = 0;
   @ObfuscatedName("au")
   private int[] n = new int[2048];

   p() {
      for(int var1 = 0; var1 < 2048; ++var1) {
         this.e[var1] = new hv(var1);
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Lwx;II)Z",
      garbageValue = "-1481773061"
   )
   private boolean b(jo var1, int var2) {
      hv var3 = this.e[var2];
      int var4;
      int var5;
      int var6;
      if ((var4 = var1.s(2)) == 0) {
         if (var1.s(1) != 0) {
            this.b(var1, var2);
         }

         var4 = var1.s(13);
         var5 = var1.s(13);
         if (var1.s(1) == 1) {
            this.c[++this.j - 1] = var2;
         }

         if (var3.a()) {
            throw new RuntimeException();
         } else {
            var6 = var5;
            var5 = var4;
            var4 = var3.k;
            ew var10 = var3.i;
            int var7 = var4 >> 14 & 255;
            int var8 = var4 & 255;
            var10.a = (var4 >> 28) * -831772521;
            var10.b = (var7 << 13) + var5;
            var10.c = (var6 + (var8 << 13)) * 66257915;
            var3.k = -1;
            this.k[var2] = false;
            return true;
         }
      } else {
         int var9;
         if (var4 == 1) {
            var4 = var1.s(2);
            var9 = ((var5 = var3.k) >> 28) + var4 & 3;
            var3.b(var9);
            var3.k = (var5 & 268435455) + (var9 << 28);
            return false;
         } else if (var4 == 2) {
            var5 = (var4 = var1.s(5)) >> 3;
            var9 = var4 & 7;
            var4 = ((var2 = var3.k) >> 28) + var5 & 3;
            var5 = var2 >> 14 & 255;
            var6 = var2 & 255;
            if (var9 == 0) {
               --var5;
               --var6;
            }

            if (var9 == 1) {
               --var6;
            }

            if (var9 == 2) {
               ++var5;
               --var6;
            }

            if (var9 == 3) {
               --var5;
            }

            if (var9 == 4) {
               ++var5;
            }

            if (var9 == 5) {
               --var5;
               ++var6;
            }

            if (var9 == 6) {
               ++var6;
            }

            if (var9 == 7) {
               ++var5;
               ++var6;
            }

            var3.b(var4);
            var3.k = ew.a(var4, var5, var6);
            return false;
         } else {
            var5 = (var4 = var1.s(18)) >> 16;
            var9 = var4 >> 8 & 255;
            var2 = var4 & 255;
            var5 = ((var4 = var3.k) >> 28) + var5 & 3;
            var3.b(var5);
            var6 = ew.d(var4) + var9 & 255;
            var9 = (var4 & 16383) + var2 & 255;
            var3.k = ew.a(var3.i.a * 719968039, var6, var9);
            return false;
         }
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-759356320"
   )
   final void a() {
      this.f = 0;

      for(int var1 = 0; var1 < 2048; ++var1) {
         this.e[var1].c();
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lwx;IB)V",
      garbageValue = "9"
   )
   final void a(jo param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(Lwx;II)V",
      garbageValue = "776433284"
   )
   private void c(jo var1, int var2) {
      boolean var3;
      if (var3 = var1.s(1) == 1) {
         this.c[++this.j - 1] = var2;
      }

      int var4 = var1.s(2);
      hv var5 = this.e[var2];
      if (var4 == 0) {
         if (var3) {
            this.k[var2] = false;
         } else if (var2 == client.au) {
            throw new RuntimeException();
         } else {
            var5.b();
            if (var1.s(1) != 0) {
               this.b(var1, var2);
            }

            this.g[++this.b - 1] = var2;
         }
      } else {
         ew var8;
         int var9;
         if (var4 == 1) {
            var9 = var1.s(3);
            var8 = var5.i;
            if (var9 == 0) {
               --var8.b;
               var8.c -= 66257915;
            } else if (var9 == 1) {
               var8.c -= 66257915;
            } else if (var9 == 2) {
               ++var8.b;
               var8.c -= 66257915;
            } else if (var9 == 3) {
               --var8.b;
            } else if (var9 == 4) {
               ++var8.b;
            } else if (var9 == 5) {
               --var8.b;
               var8.c += 66257915;
            } else if (var9 == 6) {
               var8.c += 66257915;
            } else if (var9 == 7) {
               ++var8.b;
               var8.c += 66257915;
            }

            this.k[var2] = true;
            this.i[var2] = var5.g;
         } else if (var4 == 2) {
            var9 = var1.s(4);
            var8 = var5.i;
            if (var9 == 0) {
               var8.b -= 2;
               var8.c -= 132515830;
            } else if (var9 == 1) {
               --var8.b;
               var8.c -= 132515830;
            } else if (var9 == 2) {
               var8.c -= 132515830;
            } else if (var9 == 3) {
               ++var8.b;
               var8.c -= 132515830;
            } else if (var9 == 4) {
               var8.b += 2;
               var8.c -= 132515830;
            } else if (var9 == 5) {
               var8.b -= 2;
               var8.c -= 66257915;
            } else if (var9 == 6) {
               var8.b += 2;
               var8.c -= 66257915;
            } else if (var9 == 7) {
               var8.b -= 2;
            } else if (var9 == 8) {
               var8.b += 2;
            } else if (var9 == 9) {
               var8.b -= 2;
               var8.c += 66257915;
            } else if (var9 == 10) {
               var8.b += 2;
               var8.c += 66257915;
            } else if (var9 == 11) {
               var8.b -= 2;
               var8.c += 132515830;
            } else if (var9 == 12) {
               --var8.b;
               var8.c += 132515830;
            } else if (var9 == 13) {
               var8.c += 132515830;
            } else if (var9 == 14) {
               ++var8.b;
               var8.c += 132515830;
            } else if (var9 == 15) {
               var8.b += 2;
               var8.c += 132515830;
            }

            this.k[var2] = true;
            this.i[var2] = var5.g;
         } else {
            ew var6;
            int var7;
            if (var1.s(1) == 0) {
               var7 = (var4 = var1.s(12)) >> 10;
               if ((var9 = var4 >> 5 & 31) > 15) {
                  var9 -= 32;
               }

               if ((var4 &= 31) > 15) {
                  var4 -= 32;
               }

               (var6 = var5.i).a = (byte)(var7 + var6.a * 719968039 & 3) * -831772521;
               var6.b += var9;
               var6.c += var4 * 66257915;
               this.k[var2] = true;
               this.i[var2] = var5.g;
            } else {
               var7 = (var4 = var1.s(30)) >> 28;
               var9 = ew.d(var4);
               var4 &= 16383;
               (var6 = var5.i).a = (byte)(var7 + var6.a * 719968039 & 3) * -831772521;
               var6.b = var9 + var6.b & 16383;
               var6.c = (var4 + var6.c * -1165521101 & 16383) * 66257915;
               this.k[var2] = true;
               this.i[var2] = var5.g;
            }
         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwx;I)V",
      garbageValue = "-51952950"
   )
   final void a(jo var1) {
      this.a();
      var1.P();
      int var2 = client.au;
      hv var3 = this.e[var2];
      int var4 = var1.s(30);
      var3.a(-1);
      ew var8 = var3.i;
      if (var4 == -1) {
         var8.a = 831772521;
      } else {
         var8.a = (var4 >> 28 & 3) * -831772521;
         var8.b = var4 >> 14 & 16383;
         var8.c = (var4 & 16383) * 66257915;
      }

      var3.e = 0;
      jG var9 = var3.a(var2, aM.a);
      var3.a(var9);
      gg.a(aM.a.e, var9, (long)var2);
      ai.a = var9;
      this.f = 0;
      this.d[++this.f - 1] = var2;
      this.m = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if (var2 != var7) {
            int var5 = (var4 = var1.s(18)) >> 16;
            int var6 = var4 >> 8 & 255;
            var4 &= 255;
            this.e[var7].a(ew.a(var5, var6, var4));
            this.n[++this.m - 1] = var7;
         }
      }

      jo.j(var1, 1712905351);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(II)F",
      garbageValue = "438565293"
   )
   static final float a(int var0) {
      float var1;
      return ((var1 = 10075.0F - (float)var0) * 1.0075567F - 75.56675F) / var1;
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "324490847"
   )
   static void b() {
      Iterator var0 = client.ag.iterator();

      while(var0.hasNext()) {
         kd var1 = (kd)var0.next();

         for(int var2 = 0; var2 < var1.t.a; ++var2) {
            int var3 = var1.t.b[var2];
            hG var5;
            if ((var5 = (hG)var1.l.b((long)var3)) != null) {
               gg.a(var5, client.Z);
            }
         }
      }

   }

   @ObfuscatedName("wt")
   @ObfuscatedSignature(
      signature = "(Ldx;Lwx;I)I"
   )
   private static int a(p var0, jo var1, int var2) {
      int var3;
      if ((var3 = var1.s(2)) == 0) {
         var3 = 0;
      } else if (var3 == 1) {
         var3 = var1.s(5);
      } else if (var3 == 2) {
         var3 = var1.s(8);
      } else {
         var3 = var1.s(11);
      }

      return var3;
   }
}
