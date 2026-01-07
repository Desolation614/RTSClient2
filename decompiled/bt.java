package osrs;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public final class bt implements fN {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   static final bt a = new bt(0, 1);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   static final bt b = new bt(2, 2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   static final bt c = new bt(1, 0);
   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   static aP d;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -420179143
   )
   public final int e;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 183181169
   )
   private int f;

   private bt(int var1, int var2) {
      this.e = var1;
      this.f = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.f;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Lbo;Lrf;Lrf;S)V",
      garbageValue = "-27926"
   )
   static void a(client var0, gp var1) {
      if (jB.u) {
         eD.a();
      } else {
         jD var10000;
         if ((gY.k == 1 || !I.b && gY.k == 4) && gY.g >= jB.f + 765 - 50 && gY.f >= 453 && gY.g < jB.f + 765 && gY.f < 503) {
            var10000 = j.aS;
            var10000.c(!jD.b(var10000, (byte)83));
            cY.a();
            Z.a();
         }

         if (client.aa != 5) {
            if (jB.t == -1L) {
               jB.t = au.a() + 1000L;
            }

            long var2 = au.a();
            int var4;
            boolean var34;
            if (client.ff != null && client.fi < client.ff.size()) {
               while(true) {
                  if (client.fi >= client.ff.size()) {
                     var34 = true;
                     break;
                  }

                  iY var13;
                  (var13 = (iY)client.ff.get(client.fi)).a = 0;

                  for(var4 = 0; var4 < var13.c; ++var4) {
                     if (var13.b.e(var4) == null || var13.b.o[var4]) {
                        ++var13.a;
                     }
                  }

                  if (var13.a < var13.c) {
                     var34 = false;
                     break;
                  }

                  ++client.fi;
               }
            } else {
               var34 = true;
            }

            if (var34 && -1L == jB.w) {
               jB.w = var2;
               if (var2 > jB.t) {
                  jB.t = jB.w;
               }
            }

            if (client.aa == 10 || client.aa == 11) {
               int var14;
               if (gd.d == eN.c) {
                  if (gY.k == 1 || !I.b && gY.k == 4) {
                     var14 = jB.f + 5;
                     if (gY.g >= var14 && gY.g <= var14 + 100 && gY.f >= 463 && gY.f <= 498) {
                        fW.b();
                        return;
                     }
                  }

                  if (l.a != null) {
                     fW.b();
                  }
               }

               var14 = gY.k;
               int var17 = gY.g;
               int var3 = gY.f;
               if (var14 == 0) {
                  var17 = gY.j;
                  var3 = gY.b;
               }

               if (!I.b && var14 == 4) {
                  var14 = 1;
               }

               cV var18;
               cV var5 = var18 = client.aU;
               int var15;
               boolean var27;
               if (jB.l == 0) {
                  var27 = false;

                  while(true) {
                     if (!var5.a()) {
                        var15 = cP.a - 80;
                        if (var14 == 1 && var17 >= var15 - 75 && var17 <= var15 + 75 && var3 >= 271 && var3 <= 311) {
                           eo.a(ep.a("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws");
                        }

                        var15 = cP.a + 80;
                        if (var14 == 1 && var17 >= var15 - 75 && var17 <= var15 + 75 && var3 >= 271 && var3 <= 311 || var27) {
                           if (eQ.b()) {
                              jL.a();
                              return;
                           } else {
                              ev.a(false);
                              return;
                           }
                        }
                        break;
                     }

                     if (var5.i == 84) {
                        var27 = true;
                     }
                  }
               } else if (jB.l == 1) {
                  label984: {
                     client var37 = dF.c;
                     if (!client.n() && !client.b(dF.c, 268272057)) {
                        var37 = dF.c;
                        if (!client.o()) {
                           var34 = false;
                           break label984;
                        }
                     }

                     var34 = true;
                  }

                  var27 = var34;

                  while(var5.a()) {
                     if (var5.i == 84) {
                        if (var27) {
                           aB.a();
                           return;
                        }

                        ev.a(false);
                        return;
                     }

                     if (var5.i == 13) {
                        ay.a(true);
                        return;
                     }
                  }

                  var15 = cP.a - 80;
                  if (var14 == 1 && var17 >= var15 - 75 && var17 <= var15 + 75 && var3 >= 301 && var3 <= 341) {
                     if (var27) {
                        aB.a();
                        return;
                     }

                     ev.a(false);
                     return;
                  }

                  var15 = cP.a + 80;
                  if (var14 == 1 && var17 >= var15 - 75 && var17 <= var15 + 75 && var3 >= 301 && var3 <= 341) {
                     ay.a(true);
                     return;
                  }
               } else {
                  int var6;
                  if (jB.l == 2) {
                     if (var14 == 1 && var3 >= 241 && var3 < 255) {
                        jB.D = 0;
                     }

                     if (var14 == 1 && var3 >= 256 && var3 < 270) {
                        jB.D = 1;
                     }

                     if (bN.b != null) {
                        var15 = bN.b.e / 2;
                        if (var14 == 1 && var17 >= bN.b.f - var15 && var17 <= var15 + bN.b.f && var3 >= 346 && var3 < 361) {
                           switch(jB.g) {
                           case 1:
                              eo.a("https://support.runescape.com/hc/en-gb/articles/360001552065");
                              return;
                           case 2:
                              eo.a("https://support.runescape.com/hc/en-gb");
                           }
                        }
                     }

                     var15 = cP.a - 80;
                     if (var14 == 1 && var17 >= var15 - 75 && var17 <= var15 + 75 && var3 >= 301 && var3 <= 341) {
                        jB.e = jB.e.trim();
                        client.C();
                        if (jB.e.isEmpty()) {
                           dY.a("", "Please enter your username/email address.", "");
                           return;
                        }

                        if (jB.d.isEmpty()) {
                           dY.a("", "Please enter your password.", "");
                           return;
                        }

                        dY.a("", "Connecting to server...", "");
                        client.ab = j.aS.b(jB.e) ? as.e : as.d;
                        jT.d(20);
                        return;
                     }

                     var15 = jB.j + 180 + 80;
                     if (var14 == 1 && var17 >= var15 - 75 && var17 <= var15 + 75 && var3 >= 301 && var3 <= 341) {
                        jW.a(0);
                        jB.e = "";
                        client.C();
                        jB.d = "";
                        jV.b = 0;
                        kn.b = "";
                        jB.p = true;
                     }

                     var15 = cP.a + -117;
                     jB.x = var17 >= var15 && var17 < var15 + dQ.c && var3 >= 277 && var3 < 277 + fS.a;
                     if (var14 == 1 && jB.x && !(client.ah = !client.ah) && j.aS.r != null) {
                        j.aS.a((String)null);
                     }

                     var15 = cP.a + 24;
                     jB.v = var17 >= var15 && var17 < var15 + dQ.c && var3 >= 277 && var3 < 277 + fS.a;
                     if (var14 == 1 && jB.v) {
                        var10000 = j.aS;
                        var10000.a(!jD.d(var10000, (byte)24));
                        if (!jD.d(j.aS, (byte)83)) {
                           jB.e = "";
                           client.C();
                           j.aS.a((String)null);
                           jL.a();
                        }
                     }

                     label896:
                     while(true) {
                        Transferable var25;
                        do {
                           while(true) {
                              char var24;
                              label860:
                              do {
                                 while(true) {
                                    while(var5.a()) {
                                       if (var5.i != 13) {
                                          if (jB.D != 0) {
                                             continue label860;
                                          }

                                          var24 = var5.d;

                                          for(var15 = 0; var15 < 97 && var24 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15); ++var15) {
                                          }

                                          if (var5.i == 85 && !jB.e.isEmpty()) {
                                             jB.e = jB.e.substring(0, jB.e.length() - 1);
                                             client.C();
                                          }

                                          if (var5.i == 84 || var5.i == 80) {
                                             jB.D = 1;
                                          }

                                          char var29 = var5.d;
                                          if ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var29) != -1 && jB.e.length() < 320) {
                                             jB.e = jB.e + var5.d;
                                             client.C();
                                          }
                                       } else {
                                          jW.a(0);
                                          jB.e = "";
                                          client.C();
                                          jB.d = "";
                                          jV.b = 0;
                                          kn.b = "";
                                          jB.p = true;
                                       }
                                    }

                                    return;
                                 }
                              } while(jB.D != 1);

                              if (var5.i == 85 && !jB.d.isEmpty()) {
                                 jB.d = jB.d.substring(0, jB.d.length() - 1);
                              } else if (var5.i == 84 || var5.i == 80) {
                                 jB.D = 0;
                                 if (var5.i == 84) {
                                    jB.e = jB.e.trim();
                                    client.C();
                                    if (jB.e.isEmpty()) {
                                       dY.a("", "Please enter your username/email address.", "");
                                       return;
                                    }

                                    if (jB.d.isEmpty()) {
                                       dY.a("", "Please enter your password.", "");
                                       return;
                                    }

                                    dY.a("", "Connecting to server...", "");
                                    client.ab = j.aS.b(jB.e) ? as.e : as.d;
                                    jT.d(20);
                                    return;
                                 }
                              }

                              if ((var5.c(82) || var5.c(87)) && var5.i == 67) {
                                 var25 = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(dF.c);
                                 var15 = 20 - jB.d.length();
                                 break;
                              }

                              if (bs.a(var5.d)) {
                                 var24 = var5.d;
                                 if ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var24) != -1 && jB.d.length() < 20) {
                                    jB.d = jB.d + var5.d;
                                 }
                              }
                           }
                        } while(var15 <= 0);

                        try {
                           String var26 = (String)var25.getTransferData(DataFlavor.stringFlavor);
                           var6 = Math.min(var15, var26.length());
                           int var31 = 0;

                           while(true) {
                              if (var31 >= var6) {
                                 String var36 = jB.d;
                                 jB.d = var36 + var26.substring(0, var6);
                                 continue label896;
                              }

                              if (!bs.a(var26.charAt(var31))) {
                                 break;
                              }

                              char var32 = var26.charAt(var31);
                              if ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var32) == -1) {
                                 break;
                              }

                              ++var31;
                           }

                           jW.a(3);
                           return;
                        } catch (UnsupportedFlavorException var9) {
                        } catch (IOException var10) {
                        }
                     }
                  }

                  if (jB.l == 3) {
                     int var35 = jB.j;
                     var6 = jB.j + 180;
                     if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 256 && var3 <= 296) {
                        ay.a(false);
                     }

                     var6 = jB.j + 180;
                     if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 306 && var3 <= 346) {
                        eo.a("https://support.runescape.com/hc/en-gb/articles/360001552065");
                        return;
                     }
                  } else {
                     boolean var33;
                     if (jB.l == 4) {
                        var6 = jB.j + 180 - 80;
                        if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 301 && var3 <= 341) {
                           dY.a();
                           return;
                        }

                        if (var14 == 1 && var17 >= jB.j + 180 - 9 && var17 <= jB.j + 180 + 130 && var3 >= 263 && var3 <= 296) {
                           jB.p = !jB.p;
                        }

                        if (var14 == 1 && var17 >= jB.j + 180 - 34 && var17 <= jB.j + 34 + 180 && var3 >= 351 && var3 <= 363) {
                           eo.a("https://support.runescape.com/hc/en-gb/articles/360001552065");
                        }

                        var6 = jB.j + 180 + 80;
                        if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 301 && var3 <= 341) {
                           jW.a(0);
                           jB.e = "";
                           client.C();
                           jB.d = "";
                           jV.b = 0;
                           kn.b = "";
                        }

                        while(var5.a()) {
                           var33 = false;

                           for(var4 = 0; var4 < 10; ++var4) {
                              if (var5.d == "1234567890".charAt(var4)) {
                                 var33 = true;
                                 break;
                              }
                           }

                           if (var5.i == 13) {
                              jW.a(0);
                              jB.e = "";
                              client.C();
                              jB.d = "";
                              jV.b = 0;
                              kn.b = "";
                           } else {
                              if (var5.i == 85 && !kn.b.isEmpty()) {
                                 kn.b = kn.b.substring(0, kn.b.length() - 1);
                              }

                              if (var5.i == 84) {
                                 dY.a();
                                 return;
                              }

                              if (var33 && kn.b.length() < 6) {
                                 kn.b = kn.b + var5.d;
                              }
                           }
                        }
                     } else if (jB.l == 5) {
                        var6 = jB.j + 180 - 80;
                        if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 301 && var3 <= 341) {
                           jV.j();
                           return;
                        }

                        var6 = jB.j + 180 + 80;
                        if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 301 && var3 <= 341) {
                           ev.a(true);
                        }

                        if (cY.z != null) {
                           var4 = cY.z.e / 2;
                           if (var14 == 1 && var17 >= cY.z.f - var4 && var17 <= var4 + cY.z.f && var3 >= 346 && var3 < 361) {
                              eo.a(ep.a("secure", true) + "m=weblogin/g=oldscape/cant_log_in");
                           }
                        }

                        while(var5.a()) {
                           boolean var23 = false;

                           for(var15 = 0; var15 < 97; ++var15) {
                              if (var5.d == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15)) {
                                 var23 = true;
                                 break;
                              }
                           }

                           if (var5.i == 13) {
                              ev.a(true);
                           } else {
                              if (var5.i == 85 && !jB.e.isEmpty()) {
                                 jB.e = jB.e.substring(0, jB.e.length() - 1);
                                 client.C();
                              }

                              if (var5.i == 84) {
                                 jV.j();
                                 return;
                              }

                              if (var23 && jB.e.length() < 320) {
                                 jB.e = jB.e + var5.d;
                                 client.C();
                              }
                           }
                        }
                     } else {
                        if (jB.l == 6) {
                           while(true) {
                              do {
                                 if (!var5.a()) {
                                    if (var14 == 1 && var3 >= 301 && var3 <= 341) {
                                       ev.a(true);
                                    }

                                    return;
                                 }
                              } while(var5.i != 84 && var5.i != 13);

                              ev.a(true);
                           }
                        }

                        if (jB.l == 7) {
                           if (gf.a) {
                              var34 = client.bo;
                              var15 = (var6 = cP.a - 150) + 40 + 240 + 25;
                              if (var14 == 1 && var17 >= var6 && var17 <= var15 && var3 >= 231 && var3 <= 271) {
                                 var15 = var6;

                                 label954: {
                                    for(var6 = 0; var6 < 8; ++var6) {
                                       if (var17 <= var15 + 30) {
                                          var15 = var6;
                                          break label954;
                                       }

                                       var15 += 30;
                                       var15 += var6 != 1 && var6 != 3 ? 5 : 20;
                                    }

                                    var15 = 0;
                                 }

                                 jB.m = var15;
                              }

                              var15 = jB.j + 180 - 80;
                              boolean var19;
                              Calendar var21;
                              Date var22;
                              Date var28;
                              if (var14 == 1 && var17 >= var15 - 75 && var17 <= var15 + 75 && var3 >= 301 && var3 <= 341) {
                                 label934: {
                                    try {
                                       var28 = dc.f();
                                    } catch (ParseException var12) {
                                       jW.a(7);
                                       dY.a("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                       var19 = false;
                                       break label934;
                                    }

                                    if (var28 == null) {
                                       var19 = false;
                                    } else {
                                       (var21 = Calendar.getInstance()).set(1, var21.get(1) - 13);
                                       var21.set(5, var21.get(5) + 1);
                                       var21.set(11, 0);
                                       var21.set(12, 0);
                                       var21.set(13, 0);
                                       var21.set(14, 0);
                                       var22 = var21.getTime();
                                       var33 = var28.before(var22);
                                       if (!fC.a(var28)) {
                                          O.a("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                          var19 = false;
                                       } else {
                                          if (!var33) {
                                             W.a = 8388607;
                                          } else {
                                             W.a = (int)(var28.getTime() / 86400000L - 11745L);
                                          }

                                          var19 = true;
                                       }
                                    }
                                 }

                                 if (var19) {
                                    jT.d(50);
                                    return;
                                 }
                              }

                              var15 = jB.j + 180 + 80;
                              if (var14 == 1 && var17 >= var15 - 75 && var17 <= var15 + 75 && var3 >= 301 && var3 <= 341) {
                                 jB.r = new String[8];
                                 ev.a(true);
                              }

                              do {
                                 if (!var5.a()) {
                                    return;
                                 }

                                 if (var5.i == 101) {
                                    jB.r[jB.m] = null;
                                 }

                                 if (var5.i == 85) {
                                    if (jB.r[jB.m] == null && jB.m > 0) {
                                       --jB.m;
                                    }

                                    jB.r[jB.m] = null;
                                 }

                                 if (var5.d >= '0' && var5.d <= '9') {
                                    jB.r[jB.m] = var5.d.makeConcatWithConstants<invokedynamic>(var5.d);
                                    if (jB.m < 7) {
                                       ++jB.m;
                                    }
                                 }
                              } while(var5.i != 84);

                              label923: {
                                 try {
                                    var28 = dc.f();
                                 } catch (ParseException var11) {
                                    jW.a(7);
                                    dY.a("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                    var19 = false;
                                    break label923;
                                 }

                                 if (var28 == null) {
                                    var19 = false;
                                 } else {
                                    (var21 = Calendar.getInstance()).set(1, var21.get(1) - 13);
                                    var21.set(5, var21.get(5) + 1);
                                    var21.set(11, 0);
                                    var21.set(12, 0);
                                    var21.set(13, 0);
                                    var21.set(14, 0);
                                    var22 = var21.getTime();
                                    var33 = var28.before(var22);
                                    if (!fC.a(var28)) {
                                       O.a("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                       var19 = false;
                                    } else {
                                       if (!var33) {
                                          W.a = 8388607;
                                       } else {
                                          W.a = (int)(var28.getTime() / 86400000L - 11745L);
                                       }

                                       var19 = true;
                                    }
                                 }
                              }

                              if (var19) {
                                 jT.d(50);
                              }

                              return;
                           }

                           var6 = jB.j + 180 - 80;
                           if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 301 && var3 <= 341) {
                              eo.a(ep.a("secure", true) + "m=dob/set_dob.ws");
                              dY.a("", "Page has opened in the browser.", "");
                              jW.a(6);
                              return;
                           }

                           var6 = jB.j + 180 + 80;
                           if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 301 && var3 <= 341) {
                              ev.a(true);
                              return;
                           }
                        } else {
                           if (jB.l == 8) {
                              var6 = jB.j + 180 - 80;
                              if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 301 && var3 <= 341) {
                                 eo.a("https://www.jagex.com/terms/privacy");
                                 dY.a("", "Page has opened in the browser.", "");
                                 jW.a(6);
                                 return;
                              }

                              var6 = jB.j + 180 + 80;
                              if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 301 && var3 <= 341) {
                                 ev.a(true);
                                 return;
                              }
                           } else if (jB.l == 9) {
                              var6 = jB.j + 180;
                              if (var18.i == 84 || var18.i == 13 || var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 291 && var3 <= 331) {
                                 ay.a(false);
                                 return;
                              }
                           } else if (jB.l == 10) {
                              var6 = jB.j + 180;
                              if (var18.i == 84 || var14 == 1 && var17 >= var6 - 109 && var17 <= var6 + 109 && var3 >= 209 && var3 <= 277) {
                                 if (eQ.b()) {
                                    return;
                                 }

                                 aB.a();
                                 return;
                              }
                           } else {
                              if (jB.l == 12) {
                                 var6 = cP.a;
                                 gH var20 = gw.a(var1, 0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var6, 233);
                                 gH var30 = gw.a(var1, 32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var6, 233);
                                 gH var8 = gw.a(var1, 70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var6, 233);
                                 gH var16 = gw.a(var1, 0, 34, "<col=ffd200>agreement (EULA)</col>.", var6, 250);
                                 if (var14 == 1) {
                                    if (var20.a(var17, var3)) {
                                       eo.a("https://www.jagex.com/terms");
                                    } else if (var30.a(var17, var3)) {
                                       eo.a("https://www.jagex.com/terms/privacy");
                                    } else if (var8.a(var17, var3) || var16.a(var17, var3)) {
                                       eo.a("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool");
                                    }
                                 }

                                 var6 = cP.a - 80;
                                 if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 291 && var3 <= 331) {
                                    var4 = client.bu;
                                    j.aS.k = var4 * 470766863;
                                    ki.a();
                                    ay.a(true);
                                 }

                                 var6 = cP.a + 80;
                                 if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 291 && var3 <= 331) {
                                    jB.l = 13;
                                 }

                                 return;
                              }

                              if (jB.l == 13) {
                                 var6 = cP.a;
                                 if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 301 && var3 <= 341) {
                                    ay.a(true);
                                    return;
                                 }
                              } else {
                                 if (jB.l == 14) {
                                    String var7 = "";
                                    switch(jB.a) {
                                    case 0:
                                       var7 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                       break;
                                    case 1:
                                       var7 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                       break;
                                    case 2:
                                       var7 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                       break;
                                    default:
                                       ev.a(false);
                                    }

                                    var15 = jB.j + 180;
                                    if (var14 == 1 && var17 >= var15 - 75 && var17 <= var15 + 75 && var3 >= 256 && var3 <= 296) {
                                       eo.a(var7);
                                       dY.a("", "Page has opened in the browser.", "");
                                       jW.a(6);
                                       return;
                                    }

                                    var15 = jB.j + 180;
                                    if (var14 == 1 && var17 >= var15 - 75 && var17 <= var15 + 75 && var3 >= 306 && var3 <= 346) {
                                       ev.a(false);
                                    }

                                    return;
                                 }

                                 if (jB.l == 24) {
                                    var6 = jB.j + 180;
                                    if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 281 && var3 <= 321) {
                                       ay.a(false);
                                       return;
                                    }
                                 } else if (jB.l == 32) {
                                    var6 = jB.j + 180 - 80;
                                    if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 301 && var3 <= 341) {
                                       eo.a(ep.a("secure", true) + "m=dob/set_dob.ws");
                                       dY.a("", "Page has opened in the browser.", "");
                                       jW.a(6);
                                       return;
                                    }

                                    var6 = jB.j + 180 + 80;
                                    if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 301 && var3 <= 341) {
                                       ev.a(true);
                                       return;
                                    }
                                 } else if (jB.l == 33) {
                                    var6 = jB.j + 180;
                                    if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 256 && var3 <= 296) {
                                       eo.a("https://oldschool.runescape.com/launcher");
                                    }

                                    var6 = jB.j + 180;
                                    if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 306 && var3 <= 346) {
                                       ev.a(true);
                                       return;
                                    }
                                 } else if (jB.l == 34) {
                                    var6 = jB.j + 180;
                                    if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 256 && var3 <= 296) {
                                       fW.b();
                                       return;
                                    }

                                    if (l.a != null) {
                                       fW.b();
                                    }

                                    var6 = jB.j + 180;
                                    if (var14 == 1 && var17 >= var6 - 75 && var17 <= var6 + 75 && var3 >= 306 && var3 <= 346) {
                                       ev.a(false);
                                    }
                                 }
                              }
                           }

                           return;
                        }
                     }
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "47"
   )
   static void a(int var0) {
      jP var1;
      if ((var1 = (jP)gb.a(jP.a, (long)var0)) != null) {
         gk.a(var1);
      }

   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "414181365"
   )
   static int b(int var0) {
      int var6;
      int var15;
      if (var0 == 6600) {
         var0 = aM.a.m;
         var6 = (ai.a.s >> 7) + aM.a.n;
         var15 = (ai.a.n >> 7) + aM.a.i;
         er.b.a(var0, var6, var15, true);
         return 1;
      } else {
         df var10;
         if (var0 == 6601) {
            var0 = hE.c[--hE.e];
            String var16 = "";
            if ((var10 = er.b.a(var0)) != null) {
               var16 = var10.i;
            }

            hE.n[++aU.a - 1] = var16;
            return 1;
         } else {
            ip var11;
            if (var0 == 6602) {
               var0 = hE.c[--hE.e];
               df var13;
               if ((var13 = (var11 = er.b).a(var0)) != null) {
                  var11.a(var13);
               }

               return 1;
            } else {
               int var10001;
               if (var0 == 6603) {
                  int[] var20 = hE.c;
                  var10001 = ++hE.e - 1;
                  var11 = er.b;
                  var20[var10001] = 1.0D == (double)var11.s ? 25 : ((double)var11.s == 1.5D ? 37 : (2.0D == (double)var11.s ? 50 : (3.0D == (double)var11.s ? 75 : ((double)var11.s == 4.0D ? 100 : 200))));
                  return 1;
               } else if (var0 == 6604) {
                  var0 = hE.c[--hE.e];
                  ip.b(er.b, var0, (byte)-33);
                  return 1;
               } else if (var0 == 6605) {
                  hE.c[++hE.e - 1] = er.b.D.b ? 1 : 0;
                  return 1;
               } else {
                  ew var2;
                  if (var0 == 6606) {
                     var2 = new ew(hE.c[--hE.e]);
                     er.b.b(var2.b, var2.c * -1165521101);
                     return 1;
                  } else if (var0 == 6607) {
                     var2 = new ew(hE.c[--hE.e]);
                     er.b.a(var2.b, var2.c * -1165521101);
                     return 1;
                  } else {
                     int var3;
                     int[] var12;
                     ip var10000;
                     if (var0 == 6608) {
                        var2 = new ew(hE.c[--hE.e]);
                        var10000 = er.b;
                        var10001 = var2.a * 719968039;
                        var3 = var2.c * -1165521101;
                        var15 = var2.b;
                        var6 = var10001;
                        var11 = var10000;
                        if (var10000.h != null && (var12 = df.a(var11.h, var6, var15, var3)) != null) {
                           var11.b(var12[0], var12[1]);
                        }

                        return 1;
                     } else if (var0 == 6609) {
                        var2 = new ew(hE.c[--hE.e]);
                        var10000 = er.b;
                        var10001 = var2.a * 719968039;
                        var3 = var2.c * -1165521101;
                        var15 = var2.b;
                        var6 = var10001;
                        var11 = var10000;
                        if (var10000.h != null && (var12 = df.a(var11.h, var6, var15, var3)) != null) {
                           var11.a(var12[0], var12[1]);
                        }

                        return 1;
                     } else if (var0 == 6610) {
                        hE.c[++hE.e - 1] = er.b.d();
                        hE.c[++hE.e - 1] = er.b.b();
                        return 1;
                     } else {
                        df var17;
                        if (var0 == 6611) {
                           var0 = hE.c[--hE.e];
                           if ((var17 = er.b.a(var0)) == null) {
                              hE.c[++hE.e - 1] = 0;
                           } else {
                              hE.c[++hE.e - 1] = (new ew(var17.c)).b();
                           }

                           return 1;
                        } else if (var0 == 6612) {
                           var0 = hE.c[--hE.e];
                           if ((var17 = er.b.a(var0)) == null) {
                              hE.c[++hE.e - 1] = 0;
                              hE.c[++hE.e - 1] = 0;
                           } else {
                              hE.c[++hE.e - 1] = var17.e - df.c(var17, -1253214795) + 1 << 6;
                              hE.c[++hE.e - 1] = var17.l - df.a(var17, -1550087144) + 1 << 6;
                           }

                           return 1;
                        } else if (var0 == 6613) {
                           var0 = hE.c[--hE.e];
                           if ((var17 = er.b.a(var0)) == null) {
                              hE.c[++hE.e - 1] = 0;
                              hE.c[++hE.e - 1] = 0;
                              hE.c[++hE.e - 1] = 0;
                              hE.c[++hE.e - 1] = 0;
                           } else {
                              hE.c[++hE.e - 1] = df.c(var17, 1229711669) << 6;
                              hE.c[++hE.e - 1] = df.a(var17, -1070730347) << 6;
                              hE.c[++hE.e - 1] = (var17.e << 6) + 64 - 1;
                              hE.c[++hE.e - 1] = (var17.l << 6) + 64 - 1;
                           }

                           return 1;
                        } else if (var0 == 6614) {
                           var0 = hE.c[--hE.e];
                           if ((var17 = er.b.a(var0)) == null) {
                              hE.c[++hE.e - 1] = -1;
                           } else {
                              hE.c[++hE.e - 1] = df.b(var17, -2063851752);
                           }

                           return 1;
                        } else if (var0 == 6615) {
                           if ((var2 = (var11 = er.b).h == null ? null : var11.h.a(var11.d(), var11.b())) == null) {
                              hE.c[++hE.e - 1] = -1;
                              hE.c[++hE.e - 1] = -1;
                           } else {
                              hE.c[++hE.e - 1] = var2.b;
                              hE.c[++hE.e - 1] = var2.c * -1165521101;
                           }

                           return 1;
                        } else if (var0 == 6616) {
                           hE.c[++hE.e - 1] = (var11 = er.b).h == null ? -1 : var11.h.j;
                           return 1;
                        } else if (var0 == 6617) {
                           var2 = new ew(hE.c[--hE.e]);
                           if ((var17 = er.b.h) == null) {
                              hE.c[++hE.e - 1] = -1;
                              hE.c[++hE.e - 1] = -1;
                              return 1;
                           } else {
                              int[] var18;
                              if ((var18 = df.a(var17, var2.a * 719968039, var2.b, var2.c * -1165521101)) == null) {
                                 hE.c[++hE.e - 1] = -1;
                                 hE.c[++hE.e - 1] = -1;
                              } else {
                                 hE.c[++hE.e - 1] = var18[0];
                                 hE.c[++hE.e - 1] = var18[1];
                              }

                              return 1;
                           }
                        } else {
                           ew var9;
                           if (var0 == 6618) {
                              var2 = new ew(hE.c[--hE.e]);
                              if ((var17 = er.b.h) == null) {
                                 hE.c[++hE.e - 1] = -1;
                                 hE.c[++hE.e - 1] = -1;
                                 return 1;
                              } else {
                                 if ((var9 = var17.a(var2.b, var2.c * -1165521101)) == null) {
                                    hE.c[++hE.e - 1] = -1;
                                 } else {
                                    hE.c[++hE.e - 1] = var9.b();
                                 }

                                 return 1;
                              }
                           } else if (var0 == 6619) {
                              e -= 2;
                              var0 = hE.c[hE.e];
                              var2 = new ew(hE.c[hE.e + 1]);
                              cj.a(var0, var2, false);
                              return 1;
                           } else if (var0 == 6620) {
                              e -= 2;
                              var0 = hE.c[hE.e];
                              var2 = new ew(hE.c[hE.e + 1]);
                              cj.a(var0, var2, true);
                              return 1;
                           } else if (var0 == 6621) {
                              e -= 2;
                              var0 = hE.c[hE.e];
                              var2 = new ew(hE.c[hE.e + 1]);
                              if ((var10 = er.b.a(var0)) == null) {
                                 hE.c[++hE.e - 1] = 0;
                                 return 1;
                              } else {
                                 hE.c[++hE.e - 1] = df.b(var10, var2.a * 719968039, var2.b, var2.c * -1165521101) ? 1 : 0;
                                 return 1;
                              }
                           } else if (var0 == 6622) {
                              hE.c[++hE.e - 1] = er.b.c();
                              hE.c[++hE.e - 1] = er.b.C;
                              return 1;
                           } else if (var0 == 6623) {
                              var2 = new ew(hE.c[--hE.e]);
                              if ((var17 = er.b.a(var2.a * 719968039, var2.b, var2.c * -1165521101)) == null) {
                                 hE.c[++hE.e - 1] = -1;
                              } else {
                                 hE.c[++hE.e - 1] = var17.j;
                              }

                              return 1;
                           } else if (var0 == 6624) {
                              var10000 = er.b;
                              var6 = hE.c[--hE.e];
                              var11 = var10000;
                              if (var6 > 0) {
                                 var11.A = var6 * 1365849437;
                              }

                              return 1;
                           } else if (var0 == 6625) {
                              er.b.A = -197418985;
                              return 1;
                           } else if (var0 == 6626) {
                              ip.a(er.b, hE.c[--hE.e], (byte)73);
                              return 1;
                           } else if (var0 == 6627) {
                              er.b.r = 50;
                              return 1;
                           } else {
                              boolean var14;
                              if (var0 == 6628) {
                                 var14 = hE.c[--hE.e] == 1;
                                 er.b.z = var14;
                                 return 1;
                              } else if (var0 == 6629) {
                                 var0 = hE.c[--hE.e];
                                 (var11 = er.b).x = new HashSet();
                                 var11.x.add(var0);
                                 var11.q = 0;
                                 var11.t = 0;
                                 return 1;
                              } else if (var0 == 6630) {
                                 var0 = hE.c[--hE.e];
                                 var10000 = er.b;
                                 var6 = var0;
                                 var11 = var10000;
                                 var10000.x = new HashSet();
                                 var11.q = 0;
                                 var11.t = 0;

                                 for(var3 = 0; var3 < iP.a; ++var3) {
                                    if (aL.a(var3) != null && aL.a(var3).p == var6) {
                                       var11.x.add(aL.a(var3).g);
                                    }
                                 }

                                 return 1;
                              } else if (var0 == 6631) {
                                 er.b.x = null;
                                 return 1;
                              } else if (var0 == 6632) {
                                 var14 = hE.c[--hE.e] == 1;
                                 er.b.G = !var14;
                                 return 1;
                              } else {
                                 boolean var1;
                                 if (var0 == 6633) {
                                    e -= 2;
                                    var0 = hE.c[hE.e];
                                    var1 = hE.c[hE.e + 1] == 1;
                                    var11 = er.b;
                                    if (!var1) {
                                       var11.F.add(var0);
                                    } else {
                                       var11.F.remove(var0);
                                    }

                                    ip.b(var11, -791237074);
                                    return 1;
                                 } else if (var0 == 6634) {
                                    e -= 2;
                                    var0 = hE.c[hE.e];
                                    var1 = hE.c[hE.e + 1] == 1;
                                    boolean var8 = var1;
                                    var6 = var0;
                                    var11 = er.b;
                                    if (!var1) {
                                       var11.H.add(var0);
                                    } else {
                                       var11.H.remove(var0);
                                    }

                                    for(var3 = 0; var3 < iP.a; ++var3) {
                                       if (aL.a(var3) != null && aL.a(var3).p == var6) {
                                          int var4 = aL.a(var3).g;
                                          if (!var8) {
                                             var11.E.add(var4);
                                          } else {
                                             var11.E.remove(var4);
                                          }
                                       }
                                    }

                                    ip.b(var11, -1691858236);
                                    return 1;
                                 } else if (var0 == 6635) {
                                    hE.c[++hE.e - 1] = !er.b.G ? 1 : 0;
                                    return 1;
                                 } else if (var0 == 6636) {
                                    var0 = hE.c[--hE.e];
                                    hE.c[++hE.e - 1] = !er.b.F.contains(var0) ? 1 : 0;
                                    return 1;
                                 } else if (var0 == 6637) {
                                    var0 = hE.c[--hE.e];
                                    hE.c[++hE.e - 1] = !er.b.H.contains(var0) ? 1 : 0;
                                    return 1;
                                 } else if (var0 == 6638) {
                                    e -= 2;
                                    var0 = hE.c[hE.e];
                                    var2 = new ew(hE.c[hE.e + 1]);
                                    if ((var9 = ip.a(er.b, var0, var2, (byte)77)) == null) {
                                       hE.c[++hE.e - 1] = -1;
                                    } else {
                                       hE.c[++hE.e - 1] = var9.b();
                                    }

                                    return 1;
                                 } else {
                                    dz var7;
                                    if (var0 == 6639) {
                                       if ((var7 = ip.e(er.b, -1500299658)) == null) {
                                          hE.c[++hE.e - 1] = -1;
                                          hE.c[++hE.e - 1] = -1;
                                       } else {
                                          hE.c[++hE.e - 1] = var7.b();
                                          hE.c[++hE.e - 1] = var7.b.b();
                                       }

                                       return 1;
                                    } else if (var0 == 6640) {
                                       if ((var7 = ip.d(er.b, 2133622522)) == null) {
                                          hE.c[++hE.e - 1] = -1;
                                          hE.c[++hE.e - 1] = -1;
                                       } else {
                                          hE.c[++hE.e - 1] = var7.b();
                                          hE.c[++hE.e - 1] = var7.b.b();
                                       }

                                       return 1;
                                    } else {
                                       bi var5;
                                       if (var0 == 6693) {
                                          if ((var5 = aL.a(hE.c[--hE.e])).m == null) {
                                             hE.n[++aU.a - 1] = "";
                                          } else {
                                             hE.n[++aU.a - 1] = var5.m;
                                          }

                                          return 1;
                                       } else if (var0 == 6694) {
                                          var5 = aL.a(hE.c[--hE.e]);
                                          hE.c[++hE.e - 1] = var5.t;
                                          return 1;
                                       } else if (var0 == 6695) {
                                          if ((var5 = aL.a(hE.c[--hE.e])) == null) {
                                             hE.c[++hE.e - 1] = -1;
                                          } else {
                                             hE.c[++hE.e - 1] = var5.p;
                                          }

                                          return 1;
                                       } else if (var0 == 6696) {
                                          if ((var5 = aL.a(hE.c[--hE.e])) == null) {
                                             hE.c[++hE.e - 1] = -1;
                                          } else {
                                             hE.c[++hE.e - 1] = var5.e;
                                          }

                                          return 1;
                                       } else if (var0 == 6697) {
                                          hE.c[++hE.e - 1] = eO.a.c;
                                          return 1;
                                       } else if (var0 == 6698) {
                                          hE.c[++hE.e - 1] = eO.a.a.b();
                                          return 1;
                                       } else if (var0 == 6699) {
                                          hE.c[++hE.e - 1] = eO.a.b.b();
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
            }
         }
      }
   }
}
