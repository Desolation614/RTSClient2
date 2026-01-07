package osrs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public final class ac {
   @ObfuscatedName("ai")
   private String d;
   @ObfuscatedName("aj")
   final String a;
   @ObfuscatedName("an")
   final Map b;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1572634993
   )
   final int c;

   ac(String var1) {
      this.c = 400;
      this.a = var1;
      this.b = null;
      this.d = "";
   }

   ac(HttpURLConnection var1) throws IOException {
      this.c = var1.getResponseCode();
      this.a = var1.getResponseMessage();
      this.b = var1.getHeaderFields();
      StringBuilder var2 = new StringBuilder();
      InputStream var5;
      if ((var5 = this.c >= 300 ? var1.getErrorStream() : var1.getInputStream()) != null) {
         InputStreamReader var3 = new InputStreamReader(var5);
         BufferedReader var6 = new BufferedReader(var3);

         String var4;
         while((var4 = var6.readLine()) != null) {
            var2.append(var4);
         }

         var5.close();
      }

      this.d = var2.toString();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-17"
   )
   public static void a(int var0, int var1) {
      c = var0;
      ee.k = var1;
      ee.j = 0;
      ee.b = 0;
      ee.g.clear();
      ee.d.clear();
      if (ee.e.isEmpty() || var0 == 0 && var1 == 0) {
         dc.g();
      } else {
         ee.d.add(new gl((gr)null, ee.c));
         ee.d.add(new gx((gr)null, 0, false, ee.k));
         ArrayList var2 = jG.z();
         ee.d.add(new gJ((gr)null, var2));
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Lov;IB)V",
      garbageValue = "-37"
   )
   static void a(fd var0, int var1) {
      if (var0.j == 0 && var0.s * -744024149 >= 0) {
         if (var1 > var0.G) {
            var0.G = var1;
         }

         if (var1 < var0.y) {
            var0.y = var1;
         }
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "-1505647590"
   )
   static int a(int var0, boolean var1) {
      fd var10000;
      if (var0 >= 2000) {
         var0 -= 1000;
         var10000 = jD.a.b(hE.c[--hE.e]);
      } else {
         var10000 = var1 ? ic.a : ef.a;
      }

      fd var6 = var10000;
      String var2 = (String)hE.n[--aU.a];
      int[] var3 = null;
      if (!var2.isEmpty() && var2.charAt(var2.length() - 1) == 'Y') {
         int var4;
         if ((var4 = hE.c[--hE.e]) > 0) {
            for(var3 = new int[var4]; var4-- > 0; var3[var4] = hE.c[--hE.e]) {
            }
         }

         var2 = var2.substring(0, var2.length() - 1);
      }

      int var5;
      Object[] var8;
      for(var5 = (var8 = new Object[var2.length() + 1]).length - 1; var5 > 0; --var5) {
         switch(var2.charAt(var5 - 1)) {
         case 'W':
         case 'X':
         case 's':
            var8[var5] = hE.n[--aU.a];
            break;
         default:
            var8[var5] = new Integer(hE.c[--hE.e]);
         }
      }

      if ((var5 = hE.c[--hE.e]) != -1) {
         var8[0] = var5;
      } else {
         var8 = null;
      }

      if (var0 == 1400) {
         var6.ba = var8;
      } else if (var0 == 1401) {
         var6.bh = var8;
      } else if (var0 == 1402) {
         var6.aW = var8;
      } else if (var0 == 1403) {
         var6.aR = var8;
      } else if (var0 == 1404) {
         var6.bE = var8;
      } else if (var0 == 1405) {
         var6.bd = var8;
      } else if (var0 == 1406) {
         var6.bb = var8;
      } else if (var0 == 1407) {
         var6.bp = var8;
         var6.bc = var3;
      } else if (var0 == 1408) {
         var6.aY = var8;
      } else if (var0 == 1409) {
         var6.aZ = var8;
      } else if (var0 == 1410) {
         var6.bF = var8;
      } else if (var0 == 1411) {
         var6.bi = var8;
      } else if (var0 == 1412) {
         var6.aM = var8;
      } else if (var0 == 1414) {
         var6.br = var8;
         var6.bk = var3;
      } else if (var0 == 1415) {
         var6.bA = var8;
         var6.aS = var3;
      } else if (var0 == 1416) {
         var6.aX = var8;
      } else if (var0 == 1417) {
         var6.bI = var8;
      } else if (var0 == 1418) {
         var6.bg = var8;
      } else if (var0 == 1419) {
         var6.by = var8;
      } else if (var0 == 1420) {
         var6.bj = var8;
      } else if (var0 == 1421) {
         var6.bq = var8;
      } else if (var0 == 1422) {
         var6.ay = var8;
      } else if (var0 == 1423) {
         var6.bl = var8;
      } else if (var0 == 1424) {
         var6.bn = var8;
      } else if (var0 == 1425) {
         var6.bC = var8;
      } else if (var0 == 1426) {
         var6.be = var8;
      } else if (var0 == 1427) {
         var6.aT = var8;
      } else if (var0 == 1428) {
         var6.bm = var8;
      } else if (var0 == 1429) {
         var6.aA = var8;
      } else if (var0 == 1430) {
         var6.bL = var8;
      } else if (var0 == 1431) {
         var6.aU = var8;
      } else if (var0 == 1434) {
         var6.aV = var8;
      } else if (var0 == 1435) {
         var6.bf = var8;
      } else {
         if (var0 < 1436 || var0 > 1439) {
            return 2;
         }

         eW var7;
         if ((var7 = var6.bS) != null) {
            if (var0 == 1436) {
               var7.e = var8;
            } else if (var0 == 1437) {
               var7.b = var8;
            } else if (var0 == 1438) {
               var7.a = var8;
            } else if (var0 == 1439) {
               var7.c = var8;
            }
         }
      }

      var6.aO = true;
      return 1;
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "18606"
   )
   static final void a(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         jD var10000 = j.aS;
         var10000.b(!var10000.m);
         if (j.aS.m) {
            fu.a(99, "", "Roofs are now all hidden");
         } else {
            fu.a(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.startsWith("zbuf")) {
         boolean var1 = ao.a((CharSequence)var0.substring(5).trim()) == 1;
         dF.c.a(var1);
         cc.a(var1);
      }

      if (var0.equalsIgnoreCase("z")) {
         client.bs = !client.bs;
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         jD var7;
         jD.a(var7 = j.aS, !var7.e, (byte)25);
      }

      if (var0.equalsIgnoreCase("renderself")) {
         client.ao = !client.ao;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         client.aJ = !client.aJ;
      }

      String[] var2;
      int var8;
      if (var0.startsWith("setdrawdistance")) {
         var2 = var0.split(" ");

         try {
            var8 = Integer.parseInt(var2[1]);
            j.aS.a(var8);
         } catch (NumberFormatException var6) {
            fu.a(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var2[1]));
         }
      }

      if (var0.startsWith("settilerendermode")) {
         var2 = var0.split(" ");

         try {
            var8 = Integer.parseInt(var2[1]);
            ci.a(aM.a.o, ca.a()[var8]);
         } catch (NumberFormatException var5) {
            fu.a(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var2[1]));
         }
      }

      if (var0.equalsIgnoreCase("getdrawdistance")) {
         fu.a(99, "", String.format("%d", j.aS.o));
      }

      if (client.bX >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            ip var11 = er.b;
            var11.f = !var11.f;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            jD.a(j.aS, true, (byte)45);
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            jD.a(j.aS, false, (byte)105);
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            az.b();
         }

         if (var0.equalsIgnoreCase("clientreload")) {
            ha.a();
         } else if (var0.equalsIgnoreCase("sfx8bit")) {
            j.aS.d(true);
         } else if (var0.equalsIgnoreCase("sfx16bit")) {
            j.aS.d(false);
         } else if (var0.startsWith("playsong ")) {
            String var9 = var0.substring(9);

            try {
               if (j.aS.n == 0) {
                  a(0, 0);
               } else {
                  var8 = j.aS.n;
                  a(0, 0);
                  ArrayList var3;
                  (var3 = new ArrayList()).add(new ev(fW.c, var9, "", var8, false));
                  gO.a(var3, 0, 0, 0, 100, false);
               }
            } catch (Exception var4) {
               fu.a(99, "", "Can't play the midi named " + var9);
            }
         } else if (var0.equalsIgnoreCase("stopsong")) {
            a(0, 0);
         }
      }

      dQ var10;
      (var10 = X.a(j.aO, client.P.f)).g.b(var0.length() + 1);
      jk.a(var10.g, (String)var0, -1559098139);
      client.P.a(var10);
   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1537437174"
   )
   static final int a(int var0) {
      return Math.min(Math.max(var0, 128), 383);
   }

   @ObfuscatedName("tn")
   @ObfuscatedSignature(
      signature = "(Lao;B)Ljava/lang/String;"
   )
   public static String a(ac var0, byte var1) {
      if (var0 == null) {
         String var10000 = var0.d;
      }

      return var0.d;
   }
}
