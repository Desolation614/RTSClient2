package osrs;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public final class ba extends im {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   public static dX a = new dX(64);
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 249399443
   )
   int b = 0;
   @ObfuscatedName("ae")
   public boolean c = false;
   @ObfuscatedName("ao")
   int d = 0;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 384441977
   )
   int e = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 603778131
   )
   int f = 0;
   @ObfuscatedName("at")
   String[] g = new String[5];
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1582549443
   )
   int h = 0;
   @ObfuscatedName("ax")
   int i = 0;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "Lwe;"
   )
   iU j;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 1443438447
   )
   int k = 0;

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
      garbageValue = "119"
   )
   public static void a(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (var1 != null && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      bT.b = 25;
      eN.a = 0;

      try {
         dg.b = System.getProperty("os.name");
      } catch (Exception var32) {
         dg.b = "Unknown";
      }

      fx.a = dg.b.toLowerCase();
      x.a = null;

      try {
         x.a = System.getProperty("jagex.userhome");
      } catch (Exception var31) {
      }

      if (x.a == null) {
         try {
            x.a = System.getProperty("user.home");
         } catch (Exception var30) {
         }
      }

      if (x.a != null) {
         x.a = x.a + "/";
      }

      try {
         if (fx.a.startsWith("win")) {
            if (x.a == null) {
               x.a = client.b("USERPROFILE");
            }
         } else if (x.a == null) {
            x.a = client.b("HOME");
         }

         if (x.a != null) {
            x.a = x.a + "/";
         }
      } catch (Exception var29) {
      }

      if (x.a == null) {
         x.a = "~/";
      }

      jM.a = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", x.a, "/tmp/", ""};
      gA.f = new String[]{".jagex_cache_" + eN.a, ".file_store_" + eN.a};
      int var37 = 0;

      String var10002;
      File var39;
      label589:
      while(var37 < 4) {
         String var38 = var37 == 0 ? "" : var37.makeConcatWithConstants<invokedynamic>(var37);
         jc.a = new File(x.a, "jagex_cl_" + var0 + "_" + var2 + var38 + ".dat");
         String var40 = null;
         String var5 = null;
         boolean var6 = false;
         int var11;
         if (jc.a.exists()) {
            iH var8 = null;
            boolean var9 = false;
            boolean var24 = false;

            label584: {
               label583: {
                  try {
                     var24 = true;
                     var9 = true;
                     var8 = new iH(jc.a, "rw", 10000L);

                     jk var7;
                     int var10;
                     for(var7 = new jk((int)var8.a.length()); var7.c < var7.d.length; var7.c += var10) {
                        if ((var10 = var8.b(var7.d, var7.c, var7.d.length - var7.c)) == -1) {
                           throw new IOException();
                        }
                     }

                     var7.c = 0;
                     if ((var10 = jk.a((jk)var7, (byte)2)) <= 0 || var10 > 3) {
                        throw new IOException(var10.makeConcatWithConstants<invokedynamic>(var10));
                     }

                     var11 = 0;
                     if (var10 > 1) {
                        var11 = jk.a(var7, (byte)-29);
                     }

                     if (var10 <= 2) {
                        var40 = var7.w();
                        if (var11 == 1) {
                           var5 = var7.w();
                           var9 = false;
                           var24 = false;
                        } else {
                           var9 = false;
                           var24 = false;
                        }
                     } else {
                        var40 = jk.c(var7, 1930213022);
                        if (var11 == 1) {
                           var5 = jk.c(var7, 1020465735);
                           var9 = false;
                           var24 = false;
                        } else {
                           var24 = false;
                        }
                     }
                  } catch (Exception var35) {
                     var35.printStackTrace();
                     var24 = false;
                     break label583;
                  } finally {
                     if (var24) {
                        if (var9) {
                           try {
                              if (var8 != null) {
                                 var8.a();
                              }
                           } catch (IOException var25) {
                           }
                        }

                     }
                  }

                  try {
                     var8.a();
                  } catch (IOException var28) {
                  }
                  break label584;
               }

               try {
                  if (var8 != null) {
                     var8.a();
                  }
               } catch (IOException var27) {
               }
            }

            if (var40 != null && !(new File(var40)).exists()) {
               var40 = null;
            }

            if (var40 != null && !aR.a(new File(var40, "test.dat"), true)) {
               var40 = null;
            }
         }

         if (var40 == null && var37 == 0) {
            label556:
            for(int var46 = 0; var46 < gA.f.length; ++var46) {
               for(int var49 = 0; var49 < jM.a.length; ++var49) {
                  var10002 = jM.a[var49];
                  File var48;
                  if ((var48 = new File(var10002 + gA.f[var46] + File.separatorChar + var0 + File.separatorChar)).exists() && aR.a(new File(var48, "test.dat"), true)) {
                     var40 = var48.toString();
                     var6 = true;
                     break label556;
                  }
               }
            }
         }

         if (var40 == null) {
            var40 = x.a + File.separatorChar + "jagexcache" + var38 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
            var6 = true;
         }

         File var47;
         File[] var50;
         if (var5 != null) {
            var47 = new File(var5);
            File var43 = new File(var40);

            try {
               var50 = var47.listFiles();

               for(var11 = 0; var11 < var50.length; ++var11) {
                  var39 = var50[var11];
                  File var41 = new File(var43, var39.getName());
                  if (!var39.renameTo(var41)) {
                     throw new IOException();
                  }
               }
            } catch (Exception var34) {
               var34.printStackTrace();
            }

            var6 = true;
         }

         if (var6) {
            var47 = new File(var40);

            try {
               iH var52 = new iH(jc.a, "rw", 10000L);
               jk var51;
               (var51 = new jk(500)).b(3);
               var51.b(0);
               jk.a(var51, (CharSequence)var47.getPath(), 1738619050);
               var52.c(var51.d, 0, var51.c);
               var52.a();
            } catch (IOException var26) {
               var26.printStackTrace();
            }
         }

         if (!(aZ.c = new File(var40)).exists()) {
            aZ.c.mkdirs();
         }

         File[] var53;
         if ((var53 = aZ.c.listFiles()) != null) {
            var50 = var53;

            for(var11 = 0; var11 < var50.length; ++var11) {
               if (!aR.a(var50[var11], false)) {
                  ++var37;
                  continue label589;
               }
            }
         }
         break;
      }

      if (!(dF.a = aZ.c).exists()) {
         throw new RuntimeException("");
      } else {
         bz.b = true;

         try {
            if ((var39 = new File(x.a, "random.dat")).exists()) {
               bT.e = new iG(new iH(var39, "rw", 25L), 24, 0);
            } else {
               label507:
               for(int var42 = 0; var42 < gA.f.length; ++var42) {
                  for(var4 = 0; var4 < jM.a.length; ++var4) {
                     var10002 = jM.a[var4];
                     File var45;
                     if ((var45 = new File(var10002 + gA.f[var42] + File.separatorChar + "random.dat")).exists()) {
                        bT.e = new iG(new iH(var45, "rw", 25L), 24, 0);
                        break label507;
                     }
                  }
               }
            }

            if (bT.e == null) {
               RandomAccessFile var44;
               var4 = (var44 = new RandomAccessFile(var39, "rw")).read();
               var44.seek(0L);
               var44.write(var4);
               var44.seek(0L);
               var44.close();
               bT.e = new iG(new iH(var39, "rw", 25L), 24, 0);
            }
         } catch (IOException var33) {
         }

         bT.d = new iH(bX.a("main_file_cache.dat2"), "rw", 1048576000L);
         bT.c = new iG(new iH(bX.a("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
         bT.a = new iG[bT.b];

         for(var4 = 0; var4 < bT.b; ++var4) {
            bT.a[var4] = new iG(new iH(bX.a("main_file_cache.idx" + var4), "rw", 1048576L), 6000, 0);
         }

      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1240432889"
   )
   static final int a(int var0, int var1) {
      int var2 = fm.a(var0 - 1, var1 - 1) + fm.a(var0 + 1, var1 - 1) + fm.a(var0 - 1, var1 + 1) + fm.a(var0 + 1, var1 + 1);
      int var3 = fm.a(var0 - 1, var1) + fm.a(var0 + 1, var1) + fm.a(var0, var1 - 1) + fm.a(var0, var1 + 1);
      var0 = fm.a(var0, var1);
      return var2 / 16 + var3 / 8 + var0 / 4;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(ILcr;ZB)I",
      garbageValue = "1"
   )
   static int a(int var0) {
      if (var0 == 5306) {
         hE.c[++hE.e - 1] = eg.c();
         return 1;
      } else if (var0 == 5307) {
         if ((var0 = hE.c[--hE.e]) == 1 || var0 == 2) {
            hN.a(var0);
         }

         return 1;
      } else if (var0 == 5308) {
         hE.c[++hE.e - 1] = jD.c(osrs.j.aS, (byte)-74);
         return 1;
      } else if (var0 != 5309) {
         if (var0 == 5310) {
            --hE.e;
            return 1;
         } else {
            return 2;
         }
      } else {
         if ((var0 = hE.c[--hE.e]) == 1 || var0 == 2) {
            osrs.j.aS.q = var0;
            ki.a();
         }

         return 1;
      }
   }

   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      signature = "(Lhf;I)V"
   )
   public static void a(ba var0, int var1) {
      var0.j = new iU(var0.b, var0.e, var0.f, var0.i * -502843199);
      new iU(362 + var0.b, 362 + var0.e, var0.f, var0.i * -502843199);
   }
}
