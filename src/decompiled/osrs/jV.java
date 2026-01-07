package osrs;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public class jV {
   @ObfuscatedName("af")
   protected static boolean a;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = 1518954695
   )
   static int b;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -341655537
   )
   int c;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -641148757
   )
   private int g = 32;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "Ldf;"
   )
   private jX h;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1255551147
   )
   private int i;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      longValue = -7791089586844821533L
   )
   private long j = au.a();
   @ObfuscatedName("av")
   protected int[] d;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 157905339
   )
   int e;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      longValue = 2124210000103161639L
   )
   private long k = 0L;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -1035585485
   )
   private int l = 0;
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "[Ldf;"
   )
   private jX[] m = new jX[8];
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      longValue = -3546962462441414759L
   )
   private long n = 0L;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 988218727
   )
   private int o = 0;
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "[Ldf;"
   )
   private jX[] p = new jX[8];
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 1054887061
   )
   private int q = 0;
   @ObfuscatedName("bv")
   boolean f = true;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -1303224249
   )
   private int r = 0;

   protected jV() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1005956693"
   )
   protected void a() throws Exception {
   }

   @ObfuscatedName("ai")
   protected void b() throws Exception {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "608279250"
   )
   protected void a(int var1) throws Exception {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1859747430"
   )
   protected void c() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1325486588"
   )
   protected int d() throws Exception {
      return this.e;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1333754181"
   )
   protected void e() throws Exception {
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(Ldf;B)V",
      garbageValue = "76"
   )
   public final synchronized void a(jY var1) {
      this.h = var1;
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-855755305"
   )
   public final synchronized void f() {
      if (this.d != null) {
         long var1 = au.a();

         try {
            if (this.k != 0L) {
               if (var1 < this.k) {
                  return;
               }

               this.a(this.e);
               this.k = 0L;
               this.f = true;
            }

            int var3 = this.d();
            if (this.o - var3 > this.l) {
               this.l = this.o - var3;
            }

            int var4;
            if ((var4 = this.c + this.i) + 256 > 16384) {
               var4 = 16128;
            }

            if (var4 + 256 > this.e) {
               this.e += 1024;
               if (this.e > 16384) {
                  this.e = 16384;
               }

               this.c();
               this.a(this.e);
               var3 = 0;
               this.f = true;
               if (var4 + 256 > this.e) {
                  var4 = this.e - 256;
                  this.i = var4 - this.c;
               }
            }

            while(var3 < var4) {
               boolean var5 = true;
               int[] var6 = this.d;
               jV var19 = this;
               short var7 = 256;
               if (a) {
                  var7 = 512;
               }

               hh.a(var6, 0, var7);
               this.q -= 256;
               if (this.h != null && this.q <= 0) {
                  this.q += B.a >> 4;
                  jT.a(this.h);
                  this.a(this.h, this.h.f());
                  int var21 = 0;
                  int var8 = 255;

                  int var9;
                  jX var10;
                  label181:
                  for(var9 = 7; var8 != 0; --var9) {
                     int var11;
                     int var12;
                     if (var9 < 0) {
                        var11 = var9 & 3;
                        var12 = -(var9 >> 2);
                     } else {
                        var11 = var9;
                        var12 = 0;
                     }

                     for(int var13 = var8 >>> var11 & 286331153; var13 != 0; var13 >>>= 4) {
                        if ((var13 & 1) != 0) {
                           var8 &= ~(1 << var11);
                           var10 = null;
                           jX var14 = var19.p[var11];

                           label176:
                           while(true) {
                              while(true) {
                                 if (var14 == null) {
                                    break label176;
                                 }

                                 kl var15;
                                 if ((var15 = var14.s) != null && var15.a > var12) {
                                    var8 |= 1 << var11;
                                    var10 = var14;
                                    var14 = var14.p;
                                 } else {
                                    var14.q = true;
                                    int var16 = var14.c();
                                    var21 += var16;
                                    if (var15 != null) {
                                       var15.a += var16;
                                    }

                                    if (var21 >= var19.g) {
                                       break label181;
                                    }

                                    jX var24;
                                    if ((var24 = var14.b()) != null) {
                                       for(var16 = var14.r; var24 != null; var24 = var14.a()) {
                                          var19.a(var24, var16 * var24.f() >> 8);
                                       }
                                    }

                                    jX var25 = var14.p;
                                    var14.p = null;
                                    if (var10 == null) {
                                       var19.p[var11] = var25;
                                    } else {
                                       var10.p = var25;
                                    }

                                    if (var25 == null) {
                                       var19.m[var11] = var10;
                                    }

                                    var14 = var25;
                                 }
                              }
                           }
                        }

                        var11 += 4;
                        ++var12;
                     }
                  }

                  for(var9 = 0; var9 < 8; ++var9) {
                     jX var22 = var19.p[var9];
                     jX[] var23 = var19.p;
                     var19.m[var9] = null;

                     for(var23[var9] = null; var22 != null; var22 = var10) {
                        var10 = var22.p;
                        var22.p = null;
                     }
                  }
               }

               if (var19.q < 0) {
                  var19.q = 0;
               }

               if (var19.h != null) {
                  var19.h.a(var6, 0, 256);
               }

               var19.j = au.a();
               this.b();
               var3 += 256;
            }

            if (var1 > this.n) {
               if (!this.f) {
                  if (this.l == 0 && this.r == 0) {
                     this.c();
                     this.k = var1 + 2000L;
                     return;
                  }

                  this.i = Math.min(this.r, this.l);
                  this.r = this.l;
               } else {
                  this.f = false;
               }

               this.l = 0;
               this.n = var1 + 2000L;
            }

            this.o = var3;
         } catch (Exception var17) {
            this.c();
            this.k = var1 + 2000L;
         }

         try {
            if (var1 > 500000L + this.j) {
               var1 = this.j;
            }

            for(; var1 > 5000L + this.j; this.j += (long)(256000 / B.a)) {
               boolean var20 = true;
               this.q -= 256;
               if (this.q < 0) {
                  this.q = 0;
               }

               if (this.h != null) {
                  this.h.a(256);
               }
            }

            return;
         } catch (Exception var18) {
            this.j = var1;
         }
      }

   }

   @ObfuscatedName("bh")
   public final void g() {
      if (this.d == null) {
         client var10000 = dF.c;
         jY var1;
         synchronized(var1 = client.m()) {
            var1.a.clear();
         }
      }
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-108"
   )
   public final synchronized void h() {
      if (by.a != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == by.a.a[var2]) {
               by.a.a[var2] = null;
            }

            if (by.a.a[var2] != null) {
               var1 = false;
            }
         }

         if (var1) {
            v.a.shutdownNow();
            v.a = null;
            by.a = null;
         }
      }

      this.c();
      this.d = null;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-86"
   )
   public final synchronized void i() {
      this.f = true;

      try {
         this.a();
      } catch (Exception var1) {
         this.c();
         this.k = au.a() + 2000L;
      }
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "(Ldf;IB)V",
      garbageValue = "12"
   )
   private void a(jX var1, int var2) {
      int var3 = var2 >> 5;
      jX var4;
      if ((var4 = this.m[var3]) == null) {
         this.p[var3] = var1;
      } else {
         var4.p = var1;
      }

      this.m[var3] = var1;
      var1.r = var2;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "2064953132"
   )
   public static int b(int var0) {
      return (var0 = (var0 = (var0 = ((var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765)) >>> 2 & 858993459) + (var0 & 858993459)) + (var0 >>> 4) & 252645135) + (var0 >>> 8)) + (var0 >>> 16) & 255;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1684213519"
   )
   static void j() {
      jB.e = jB.e.trim();
      client.C();
      if (jB.e.isEmpty()) {
         dY.a("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var0;
         jk var5;
         try {
            label173: {
               URLConnection var2;
               (var2 = (new URL(ep.a("services", false) + "m=accountappeal/login.ws")).openConnection()).setRequestProperty("connection", "close");
               var2.setDoInput(true);
               var2.setDoOutput(true);
               var2.setConnectTimeout(5000);
               OutputStreamWriter var3;
               (var3 = new OutputStreamWriter(var2.getOutputStream())).write("data1=req");
               var3.flush();
               InputStream var4 = var2.getInputStream();
               var5 = new jk(new byte[1000]);

               int var6;
               while((var6 = var4.read(var5.d, var5.c, 1000 - var5.c)) != -1) {
                  var5.c += var6;
                  if (var5.c >= 1000) {
                     var0 = 0L;
                     break label173;
                  }
               }

               var5.c = 0;
               var0 = var5.e();
            }
         } catch (Exception var14) {
            var0 = 0L;
         }

         byte var15;
         if (var0 == 0L) {
            var15 = 5;
         } else {
            String var21 = jB.e;
            Random var25 = new Random();
            jk var28 = new jk(128);
            var5 = new jk(128);
            int[] var32 = new int[]{var25.nextInt(), var25.nextInt(), (int)(var0 >> 32), (int)var0};
            var28.b(10);

            int var8;
            for(var8 = 0; var8 < 4; ++var8) {
               var28.c(var25.nextInt());
            }

            var28.c(var32[0]);
            var28.c(var32[1]);
            var28.a(var0);
            var28.a(0L);

            for(var8 = 0; var8 < 4; ++var8) {
               var28.c(var25.nextInt());
            }

            var28.a(eD.b, eD.a);
            var5.b(10);

            for(var8 = 0; var8 < 3; ++var8) {
               var5.c(var25.nextInt());
            }

            var5.a(var25.nextLong());
            jk.a(var5, var25.nextLong());
            ep.a(var5);
            var5.a(var25.nextLong());
            var5.a(eD.b, eD.a);
            if ((var8 = hd.a(var21)) % 8 != 0) {
               var8 += 8 - var8 % 8;
            }

            jk var9;
            jk.a(var9 = new jk(var8), var21, -1559098139);
            var9.c = var8;
            int[] var23 = var32;
            jk var1 = var9;
            int var27 = var9.c / 8;
            var9.c = 0;

            int var7;
            int var10;
            int var11;
            int var12;
            for(var7 = 0; var7 < var27; ++var7) {
               var8 = jk.d(var1, 1687107415);
               var10 = jk.d(var1, 1687107415);
               var11 = 0;

               for(var12 = 32; var12-- > 0; var10 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var23[var11 >>> 11 & 3] + var11) {
                  var8 += var10 + (var10 << 4 ^ var10 >>> 5) ^ var11 + var23[var11 & 3];
                  var11 += -1640531527;
               }

               var1.c -= 8;
               var1.c(var8);
               var1.c(var10);
            }

            jk var17;
            (var17 = new jk(var5.c + var28.c + var9.c + 5)).b(2);
            var17.b(var28.c);
            var17.a((byte[])var28.d, 0, (int)var28.c);
            var17.b(var5.c);
            var17.a((byte[])var5.d, 0, (int)var5.c);
            var17.d(var9.c);
            var17.a((byte[])var9.d, 0, (int)var9.c);
            byte[] var19;
            int var16 = (var19 = var17.d).length;
            StringBuilder var24 = new StringBuilder();

            for(int var29 = 0; var29 < var16; var29 += 3) {
               int var31 = var19[var29] & 255;
               var24.append(ge.a[var31 >>> 2]);
               if (var29 < var16 - 1) {
                  var27 = var19[var29 + 1] & 255;
                  var24.append(ge.a[(var31 & 3) << 4 | var27 >>> 4]);
                  if (var29 < var16 - 2) {
                     var31 = var19[var29 + 2] & 255;
                     var24.append(ge.a[(var27 & 15) << 2 | var31 >>> 6]).append(ge.a[var31 & 63]);
                  } else {
                     var24.append(ge.a[(var27 & 15) << 2]).append("=");
                  }
               } else {
                  var24.append(ge.a[(var31 & 3) << 4]).append("==");
               }
            }

            String var30 = var24.toString();

            byte var33;
            try {
               label177: {
                  URLConnection var22;
                  (var22 = (new URL(ep.a("services", false) + "m=accountappeal/login.ws")).openConnection()).setDoInput(true);
                  var22.setDoOutput(true);
                  var22.setConnectTimeout(5000);
                  OutputStreamWriter var18;
                  OutputStreamWriter var34 = var18 = new OutputStreamWriter(var22.getOutputStream());
                  String var10001 = jz.a(var30);
                  var34.write("data2=" + var10001 + "&dest=" + jz.a("passwordchoice.ws"));
                  var18.flush();
                  InputStream var26 = var22.getInputStream();
                  var17 = new jk(new byte[1000]);

                  while((var27 = var26.read(var17.d, var17.c, 1000 - var17.c)) != -1) {
                     var17.c += var27;
                     if (var17.c >= 1000) {
                        var33 = 5;
                        break label177;
                     }
                  }

                  var18.close();
                  var26.close();
                  String var20;
                  if ((var20 = new String(var17.d)).startsWith("OFFLINE")) {
                     var33 = 4;
                  } else if (var20.startsWith("WRONG")) {
                     var33 = 7;
                  } else if (var20.startsWith("RELOAD")) {
                     var33 = 3;
                  } else if (var20.startsWith("Not permitted for social network accounts.")) {
                     var33 = 6;
                  } else {
                     var23 = var32;
                     var1 = var17;
                     var27 = var17.c / 8;
                     var17.c = 0;
                     var7 = 0;

                     while(true) {
                        if (var7 >= var27) {
                           while(var17.c > 0 && var17.d[var17.c - 1] == 0) {
                              --var17.c;
                           }

                           if (cZ.a(var20 = new String(var17.d, 0, var17.c))) {
                              eo.a(var20);
                              var33 = 2;
                           } else {
                              var33 = 5;
                           }
                           break;
                        }

                        var8 = jk.d(var1, 1687107415);
                        var10 = jk.d(var1, 1687107415);
                        var11 = -957401312;

                        for(var12 = 32; var12-- > 0; var8 -= var10 + (var10 << 4 ^ var10 >>> 5) ^ var11 + var23[var11 & 3]) {
                           var10 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var23[var11 >>> 11 & 3] + var11;
                           var11 -= -1640531527;
                        }

                        var1.c -= 8;
                        var1.c(var8);
                        var1.c(var10);
                        ++var7;
                     }
                  }
               }
            } catch (Throwable var13) {
               var13.printStackTrace();
               var33 = 5;
            }

            var15 = var33;
         }

         switch(var15) {
         case 2:
            dY.a(eI.c, eI.b, eI.d);
            jW.a(6);
            return;
         case 3:
            dY.a("", "Error connecting to server.", "");
            return;
         case 4:
            dY.a("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
            return;
         case 5:
            dY.a("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            return;
         case 6:
            dY.a("", "Error connecting to server.", "");
            return;
         case 7:
            dY.a("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         default:
         }
      }
   }
}
