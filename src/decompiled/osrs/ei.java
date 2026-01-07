package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
public final class ei {
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(ILcr;ZS)I",
      garbageValue = "10549"
   )
   static int a(int var0, boolean var1) {
      int var2 = -1;
      fd var10000;
      if (var0 >= 2000) {
         var0 -= 1000;
         var2 = hE.c[--hE.e];
         var10000 = jD.a.b(var2);
      } else {
         var10000 = var1 ? ic.a : ef.a;
      }

      fd var25 = var10000;
      eK var37;
      if (var0 == 1100) {
         hE.e -= 2;
         var0 = hE.c[hE.e];
         var2 = hE.c[hE.e + 1];
         if (var25.j == 12) {
            if ((var37 = fd.b(var25, 383139979)) != null && eK.a(var37, var0, var2)) {
               gs.a(var25);
            }
         } else {
            var25.L = var0;
            if (var25.L > var25.B - var25.i * -1805166981) {
               var25.L = var25.B - var25.i * -1805166981;
            }

            if (var25.L < 0) {
               var25.L = 0;
            }

            var25.D = var2 * -380832947;
            if (var25.D * 178093445 > var25.S - var25.n * -2133353239) {
               var25.D = var25.S * -380832947 - var25.n * 284646677;
            }

            if (var25.D * 178093445 < 0) {
               var25.D = 0;
            }

            gs.a(var25);
         }

         return 1;
      } else if (var0 == 1101) {
         var25.R = hE.c[--hE.e];
         gs.a(var25);
         return 1;
      } else if (var0 == 1102) {
         var25.A = hE.c[--hE.e] == 1;
         gs.a(var25);
         return 1;
      } else if (var0 == 1103) {
         var25.K = hE.c[--hE.e];
         gs.a(var25);
         return 1;
      } else if (var0 == 1104) {
         var25.J = hE.c[--hE.e];
         gs.a(var25);
         return 1;
      } else if (var0 == 1105) {
         var25.x = hE.c[--hE.e];
         gs.a(var25);
         return 1;
      } else if (var0 == 1106) {
         var25.w = hE.c[--hE.e];
         gs.a(var25);
         return 1;
      } else if (var0 == 1107) {
         var25.H = hE.c[--hE.e] == 1;
         gs.a(var25);
         return 1;
      } else if (var0 == 1108) {
         var25.ap = 1;
         var25.aq = hE.c[--hE.e];
         gs.a(var25);
         return 1;
      } else if (var0 == 1109) {
         hE.e -= 6;
         var25.ah = hE.c[hE.e];
         var25.ad = hE.c[hE.e + 1];
         var25.ak = hE.c[hE.e + 2];
         var25.ai = hE.c[hE.e + 3];
         var25.ab = hE.c[hE.e + 4];
         var25.ao = hE.c[hE.e + 5];
         gs.a(var25);
         return 1;
      } else if (var0 == 1110) {
         if ((var0 = hE.c[--hE.e]) != var25.at) {
            var25.at = var0;
            var25.bz = 0;
            var25.bQ = 0;
            gs.a(var25);
         }

         return 1;
      } else if (var0 == 1111) {
         var25.ae = hE.c[--hE.e] == 1;
         gs.a(var25);
         return 1;
      } else {
         String var29;
         if (var0 == 1112) {
            var29 = (String)hE.n[--aU.a];
            if (var25.j == 12) {
               if ((var37 = fd.b(var25, 616791283)) != null && var37.h) {
                  var37.a(var29);
               } else {
                  var25.aC = var29;
               }

               gs.a(var25);
            } else if (!var29.equals(var25.aC)) {
               var25.aC = var29;
               gs.a(var25);
            }

            return 1;
         } else {
            eK var28;
            if (var0 == 1113) {
               var25.aj = hE.c[--hE.e];
               if (var25.j == 12 && (var28 = fd.b(var25, 1535004856)) != null) {
                  var28.h = false;
               }

               gs.a(var25);
               return 1;
            } else {
               String var10001;
               int var31;
               int var38;
               boolean var48;
               if (var0 == 1114) {
                  hE.e -= 3;
                  if (var25.j == 12) {
                     if ((var28 = fd.b(var25, 504241193)) != null) {
                        var10001 = hE.c[hE.e];
                        var38 = hE.c[hE.e + 1];
                        gv var41 = var10001;
                        boolean var46 = true;
                        if (!(var41 >= 0) || var41 > 2) {
                           var46 = false;
                        }

                        if (var38 < 0 || var38 > 2) {
                           var46 = false;
                        }

                        if (!var46) {
                           var48 = false;
                        } else {
                           gv var51 = var28.f;
                           gv var35 = var41;
                           gv var47 = var51;
                           if (var51 == null) {
                              var41 = var47;
                              if (var47.b * -871642455 != var35 || var47.i * -490292867 != var35) {
                                 var47.b = var35 * -585467495;
                                 var47.b = var35 * -1612405265;
                                 var47.d();
                              }

                              var48 = true;
                           }

                           if (var47.g != var41 || var38 != var47.c) {
                              var47.g = (int)var41;
                              var47.c = var38;
                              var47.d();
                           }

                           var48 = true;
                        }

                        var31 = hE.c[hE.e + 2];
                        if (var28 == null) {
                           gv.a(var28.b, var31);
                        }

                        gv.a(var28.f, var31);
                     }
                  } else {
                     var25.aK = hE.c[hE.e];
                     var25.aB = hE.c[hE.e + 1];
                     var25.aa = hE.c[hE.e + 2];
                  }

                  gs.a(var25);
                  return 1;
               } else if (var0 == 1115) {
                  var25.aG = hE.c[--hE.e] == 1;
                  gs.a(var25);
                  return 1;
               } else if (var0 == 1116) {
                  var25.ag = hE.c[--hE.e];
                  gs.a(var25);
                  return 1;
               } else if (var0 == 1117) {
                  var25.W = hE.c[--hE.e];
                  gs.a(var25);
                  return 1;
               } else if (var0 == 1118) {
                  var25.af = hE.c[--hE.e] == 1;
                  gs.a(var25);
                  return 1;
               } else if (var0 == 1119) {
                  var25.Z = hE.c[--hE.e] == 1;
                  gs.a(var25);
                  return 1;
               } else if (var0 == 1120) {
                  hE.e -= 2;
                  var25.B = hE.c[hE.e];
                  var25.S = hE.c[hE.e + 1];
                  gs.a(var25);
                  if (var2 != -1 && var25.j == 0) {
                     aP.a(jD.a.c[var2 >> 16], var25, false, (byte)3);
                  }

                  return 1;
               } else if (var0 == 1121) {
                  ap.a(var25.m, var25.s * -744024149);
                  client.bY = var25;
                  gs.a(var25);
                  return 1;
               } else if (var0 == 1122) {
                  var25.I = hE.c[--hE.e];
                  gs.a(var25);
                  return 1;
               } else if (var0 == 1123) {
                  var25.U = hE.c[--hE.e];
                  gs.a(var25);
                  return 1;
               } else if (var0 == 1124) {
                  var25.z = hE.c[--hE.e];
                  gs.a(var25);
                  return 1;
               } else if (var0 == 1125) {
                  var0 = hE.c[--hE.e];
                  jl var43;
                  if ((var43 = (jl)aU.a(fg.a(), var0)) != null) {
                     var25.C = var43;
                     gs.a(var25);
                  }

                  return 1;
               } else {
                  boolean var36;
                  if (var0 == 1126) {
                     var36 = hE.c[--hE.e] == 1;
                     var25.E = var36;
                     return 1;
                  } else if (var0 == 1127) {
                     var36 = hE.c[--hE.e] == 1;
                     var25.V = var36;
                     return 1;
                  } else if (var0 == 1129) {
                     var25.aI = (String)hE.n[--aU.a];
                     gs.a(var25);
                     return 1;
                  } else {
                     String var4;
                     String var30;
                     if (var0 == 1130) {
                        var10001 = (String)hE.n[--aU.a];
                        long var45 = client.dE;
                        u var42 = aE.a;
                        var4 = "";
                        var30 = var10001;
                        if (var25.j == 11 && -1L != var45) {
                           var30 = var30.replaceAll("%userid%", Long.toString(var45));
                           var25.ca = new bS();
                           if (!var25.ca.a(var30, var4, var42)) {
                              var25.ca = null;
                           } else if (var25.cc == null || var25.cb == null) {
                              fd.a(var25, (byte)-111);
                           }
                        }

                        return 1;
                     } else if (var0 == 1131) {
                        hE.e -= 2;
                        int var49 = hE.c[hE.e];
                        var38 = hE.c[hE.e + 1];
                        var31 = var49;
                        if (var25.j == 11) {
                           if (var25.cc == null) {
                              fd.a(var25, (byte)-73);
                           }

                           var25.cc.put(var31, var38);
                        }

                        return 1;
                     } else if (var0 == 1132) {
                        var10001 = (String)hE.n[--aU.a];
                        var38 = hE.c[--hE.e];
                        var30 = var10001;
                        if (var25.j == 11) {
                           if (var25.cb == null) {
                              fd.a(var25, (byte)-82);
                           }

                           var25.cb.put(var30, var38);
                        }

                        return 1;
                     } else {
                        el var40;
                        if (var0 == 1133) {
                           --hE.e;
                           if ((var40 = var25.a()) != null) {
                              var40.b = hE.c[hE.e];
                              gs.a(var25);
                           }

                           return 1;
                        } else if (var0 == 1134) {
                           --hE.e;
                           if ((var40 = var25.a()) != null) {
                              var40.c = hE.c[hE.e];
                              gs.a(var25);
                           }

                           return 1;
                        } else if (var0 == 1135) {
                           --aU.a;
                           if (fd.b(var25, -105064451) != null) {
                              var25.bu = (String)hE.n[aU.a];
                           }

                           return 1;
                        } else if (var0 == 1136) {
                           --hE.e;
                           if ((var40 = var25.a()) != null) {
                              var40.d = hE.c[hE.e];
                              gs.a(var25);
                           }

                           return 1;
                        } else if (var0 == 1137) {
                           --hE.e;
                           if ((var28 = fd.b(var25, 691175472)) != null) {
                              var31 = hE.c[hE.e];
                              if (var31 < 0) {
                                 var31 = Integer.MAX_VALUE;
                              }

                              var36 = var31 == var28.f.k;
                              var28.f.b(var31);
                              var28.b.b(var31);
                              if (var28.d()) {
                                 var28.k();
                                 var36 = true;
                              }

                              if (var36) {
                                 gs.a(var25);
                              }
                           }

                           return 1;
                        } else if (var0 == 1138) {
                           --hE.e;
                           if ((var28 = fd.b(var25, 829647615)) != null) {
                              var31 = hE.c[hE.e];
                              gv.h(var28.f, var31);
                              if (var28.d()) {
                                 var28.k();
                                 var48 = true;
                              } else {
                                 var48 = false;
                              }

                              if (var48) {
                                 gs.a(var25);
                              }
                           }

                           return 1;
                        } else if (var0 == 1139) {
                           --hE.e;
                           if ((var28 = fd.b(var25, 893458313)) != null) {
                              var31 = hE.c[hE.e];
                              var28.m = var31;
                              if (var28.d()) {
                                 var28.k();
                                 var48 = true;
                              } else {
                                 var48 = false;
                              }

                              if (var48) {
                                 gs.a(var25);
                              }
                           }

                           return 1;
                        } else if (var0 == 1140) {
                           var36 = hE.c[--hE.e] == 1;
                           client.aR.a();
                           if ((var37 = fd.b(var25, 1340142487)) != null && var37.a(var36)) {
                              if (var36) {
                                 client.aR.a(var25);
                              }

                              gs.a(var25);
                           }

                           return 1;
                        } else if (var0 == 1141) {
                           if (!(var36 = hE.c[--hE.e] == 1) && client.aR.a == var25) {
                              client.aR.a();
                              gs.a(var25);
                           }

                           if ((var37 = fd.b(var25, 850090633)) != null) {
                              var38 = 2100731413;
                              if (var37 == null) {
                                 if (var37.a() && !var36) {
                                    var37.a(Math.min(var37.d * -1673153711, var37.d * -1038968907), var36);
                                 } else if (var37.e * 196801799 > 0) {
                                    var37.a(var37.s * -878072063 - 1, var36);
                                 }
                              } else {
                                 var37.c = var36;
                                 var37.g = var36 && var37.g;
                              }
                           }

                           return 1;
                        } else if (var0 == 1142) {
                           hE.e -= 2;
                           if ((var28 = fd.b(var25, 359662853)) != null && var28.b(hE.c[hE.e], hE.c[hE.e + 1])) {
                              gs.a(var25);
                           }

                           return 1;
                        } else if (var0 == 1143) {
                           --hE.e;
                           if ((var28 = fd.b(var25, 1501466643)) != null && var28.b(hE.c[hE.e], hE.c[hE.e])) {
                              gs.a(var25);
                           }

                           return 1;
                        } else if (var0 == 1144) {
                           --hE.e;
                           if ((var28 = fd.b(var25, -575114776)) != null) {
                              var31 = hE.c[hE.e];
                              gv.e(var28.f, var31);
                              gs.a(var25);
                           }

                           return 1;
                        } else if (var0 == 1145) {
                           --hE.e;
                           if ((var28 = fd.b(var25, 937968288)) != null) {
                              var31 = hE.c[hE.e];
                              var28.r = var31;
                           }

                           return 1;
                        } else {
                           String var26;
                           if (var0 == 1146) {
                              --hE.e;
                              if ((var28 = fd.b(var25, -635775479)) != null) {
                                 var31 = hE.c[hE.e];
                                 var28.k = var31;
                                 int var44 = (var26 = var28.f.a()).length();
                                 if ((var26 = var28.c(var26)).length() != var44) {
                                    var28.f.a(var26);
                                    eK.a(var28, var28.i * 260151395, var28.o * -511517567);
                                    var28.d();
                                    var28.k();
                                    var48 = true;
                                 } else {
                                    var48 = false;
                                 }
                              }

                              return 1;
                           } else if (var0 == 1147) {
                              --hE.e;
                              if ((var28 = fd.b(var25, 1523008469)) != null) {
                                 var31 = hE.c[hE.e];
                                 gv var33;
                                 if ((var33 = var28.f).e != var31) {
                                    var33.e = var31;
                                    var33.d();
                                 }

                                 gs.a(var25);
                              }

                              return 1;
                           } else {
                              hj var27;
                              if (var0 == 1148) {
                                 hE.e -= 2;
                                 if ((var27 = var25.b()) != null) {
                                    var27.a(hE.c[hE.e], hE.c[hE.e + 1]);
                                 }

                                 return 1;
                              } else if (var0 == 1149) {
                                 hE.e -= 2;
                                 if ((var27 = var25.b()) != null) {
                                    var27.a((char)hE.c[hE.e], hE.c[hE.e + 1]);
                                 }

                                 return 1;
                              } else if (var0 == 1150) {
                                 var10001 = (String)hE.n[--aU.a];
                                 u var32 = aE.a;
                                 var30 = var10001;
                                 if (var25.j == 11 && var30 != null) {
                                    var25.ca = new bS();
                                    bS.a(var25.ca, var30, var32, 2147088926);
                                 }

                                 return 1;
                              } else if (var0 == 1151) {
                                 aU.a -= 3;
                                 var29 = (String)hE.n[aU.a];
                                 var26 = (String)hE.n[aU.a + 1];
                                 var30 = (String)hE.n[aU.a + 2];
                                 long var13 = client.dE;
                                 long var15 = dr.c();
                                 T.c();
                                 var4 = hV.a(T.c().b);
                                 if (-1L != var13) {
                                    var29 = var29.replaceAll("%userid%", Long.toString(var13));
                                 }

                                 if (var15 != -1L) {
                                    var29 = var29.replaceAll("%userhash%", Long.toString(var15));
                                 }

                                 if (!var4.isEmpty()) {
                                    var29 = var29.replaceAll("%deviceid%", var4);
                                 }

                                 String var10005 = Long.toString(var15);
                                 u var5 = aE.a;
                                 String var23 = var10005;
                                 var25.ca = new bS();
                                 if (!var25.ca.a(var29, var30, var5)) {
                                    var25.ca = null;
                                 } else {
                                    if (var25.cc == null || var25.cb == null) {
                                       fd.a(var25, (byte)-35);
                                    }

                                    bS var50 = var25.ca;
                                    var0 = -52542663;
                                    bS var34 = var50;
                                    if (var50 == null) {
                                       var34.d = be.a();
                                       var34.b = var26;
                                       var34.d.a(var34.e, var26, var26);
                                    }

                                    var34.d = be.a();
                                    var34.c = var26;
                                    var34.d.a(var34.c, var4, var23);
                                 }

                                 return 1;
                              } else if (var0 == 1152) {
                                 if (var25.j != 11) {
                                    throw new RuntimeException();
                                 } else {
                                    bS var24;
                                    if ((var24 = var25.ca) != null && var24.g != null) {
                                       bB.a(be.a(), var24.a(), -2070695575);
                                       var48 = true;
                                    } else {
                                       var48 = false;
                                    }

                                    boolean var3 = var48;
                                    hE.c[++hE.e - 1] = var3 ? 1 : 0;
                                    return 1;
                                 }
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
