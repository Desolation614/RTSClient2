package osrs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
public final class fW implements fN {
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "Lqm;"
   )
   private static fW d;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lqm;"
   )
   private static fW e;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "Lqm;"
   )
   private static fW f;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "Lqm;"
   )
   private static fW g;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "Lqm;"
   )
   private static fW h;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lqm;"
   )
   static final fW a;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lqm;"
   )
   private static fW i;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lqm;"
   )
   private static fW j;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "Lqm;"
   )
   private static fW k;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lqm;"
   )
   private static fW l;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lqm;"
   )
   static final fW b;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "Lqm;"
   )
   private static fW m;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "Lqm;"
   )
   private static fW n;
   @ObfuscatedName("ke")
   @ObfuscatedSignature(
      signature = "Lpu;"
   )
   static fE c;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -74981187
   )
   private int o;
   @ObfuscatedName("ak")
   private Set p = new HashSet();

   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I[Lqe;)V"
   )
   private fW(int var1, fP[] var2) {
      this.o = var1;
      fP[] var4 = var2;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         fP var3 = var4[var5];
         this.p.add(var3);
      }

   }

   private fW(int var1) {
      this.o = 4;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.o;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "-175823994"
   )
   static int a(int var0, jI var1, boolean var2) {
      int var4;
      int var10001;
      int var27;
      int var29;
      if (var0 < 1000) {
         fd var30;
         fd var48;
         if (var0 == 100) {
            hE.e -= 4;
            var27 = hE.c[hE.e];
            var29 = hE.c[hE.e + 1];
            var4 = hE.c[hE.e + 2];
            boolean var51 = hE.c[hE.e + 3] != 0;
            if ((var48 = jD.a.b(var27)).j != 0) {
               throw new RuntimeException("");
            } else {
               M.a(var48, var4, var51);
               (var30 = new fd()).j = var29;
               var30.v = var30.m = var48.m;
               var30.s = var4 * 926100227;
               var30.f = true;
               if (var29 == 12) {
                  r.a(var30);
               }

               var48.bH[var4] = var30;
               if (var2) {
                  ic.a = var30;
               } else {
                  ef.a = var30;
               }

               gs.a(var48);
               return 1;
            }
         } else {
            fd var47;
            fd var50;
            if (var0 == 101) {
               var47 = var2 ? ic.a : ef.a;
               var50 = jD.a.b(var47.m);
               fZ.a(var47, var50);
               gs.a(var50);
               return 1;
            } else if (var0 == 102) {
               --hE.e;
               var27 = hE.c[hE.e];
               (var50 = jD.a.b(var27)).bH = null;
               gs.a(var50);
               return 1;
            } else {
               fd var14;
               if (var0 == 105) {
                  hE.e -= 3;
                  var27 = hE.c[hE.e];
                  var29 = hE.c[hE.e + 1];
                  var4 = hE.c[hE.e + 2];
                  var14 = jD.a.b(var27);
                  var48 = eu.a(jD.a, var27, var29, (byte)47);
                  if (var14 == null) {
                     throw new RuntimeException("");
                  } else if (var29 < 0) {
                     throw new RuntimeException("");
                  } else if (var48 == null) {
                     throw new RuntimeException("");
                  } else if (var48.j == 0) {
                     throw new RuntimeException("");
                  } else {
                     M.a(var14, var4, true);
                     if (var48.M != -1) {
                        ac.a(eu.a(jD.a, var27, var48.M, (byte)59), var4);
                     }

                     (var30 = new fd(var48)).s = var4 * 926100227;
                     if (var48.j == 12) {
                        r.a(var30);
                     }

                     var14.bH[var4] = var30;
                     if (var2) {
                        ic.a = var30;
                     } else {
                        ef.a = var30;
                     }

                     gs.a(var14);
                     return 1;
                  }
               } else {
                  fd var53;
                  if (var0 == 106) {
                     hE.e -= 2;
                     var27 = hE.c[hE.e];
                     var29 = hE.c[hE.e + 1];
                     if ((var53 = var2 ? ic.a : ef.a) == null) {
                        throw new RuntimeException("");
                     } else {
                        var14 = jD.a.b(var53.v);
                        if (var53.j != 0) {
                           throw new RuntimeException("");
                        } else if (var14.j != 0) {
                           throw new RuntimeException();
                        } else {
                           M.a(var14, var29, true);
                           ac.a(var53, var29);
                           (var48 = new fd()).j = var27;
                           var48.v = var48.m = var14.m;
                           var48.M = var53.s * -744024149;
                           var48.s = var29 * 926100227;
                           var48.f = true;
                           if (var27 == 12) {
                              r.a(var48);
                           }

                           var14.bH[var29] = var48;
                           if (var2) {
                              ic.a = var48;
                           } else {
                              ef.a = var48;
                           }

                           gs.a(var14);
                           return 1;
                        }
                     }
                  } else if (var0 == 107) {
                     hE.e -= 2;
                     var27 = hE.c[hE.e];
                     var29 = hE.c[hE.e + 1];
                     if ((var53 = var2 ? ic.a : ef.a) == null) {
                        throw new RuntimeException("");
                     } else {
                        var14 = eu.a(jD.a, var53.v, var53.M, (byte)68);
                        var48 = jD.a.b(var14.v);
                        if (var14.j != 0) {
                           throw new RuntimeException("");
                        } else if (var48.j != 0) {
                           throw new RuntimeException();
                        } else {
                           M.a(var48, var29, true);
                           ac.a(var14, var29);
                           (var30 = new fd()).j = var27;
                           var30.v = var30.m = var48.m;
                           var30.M = var14.s * -744024149;
                           var30.s = var29 * 926100227;
                           var30.f = true;
                           if (var27 == 12) {
                              r.a(var30);
                           }

                           var48.bH[var29] = var30;
                           if (var2) {
                              ic.a = var30;
                           } else {
                              ef.a = var30;
                           }

                           gs.a(var48);
                           return 1;
                        }
                     }
                  } else if (var0 == 200) {
                     hE.e -= 2;
                     var27 = hE.c[hE.e];
                     dv.a((var29 = hE.c[hE.e + 1]) != -1 ? eu.a(jD.a, var27, var29, (byte)80) : null, var2);
                     return 1;
                  } else if (var0 == 201) {
                     dv.a(jD.a.b(hE.c[--hE.e]), var2);
                     return 1;
                  } else if (var0 == 204) {
                     dv.a((var47 = var2 ? ic.a : ef.a) != null ? eu.a(jD.a, var47.v, var47.M, (byte)106) : null, var2);
                     return 1;
                  } else if (var0 == 205) {
                     dv.a((var47 = var2 ? ic.a : ef.a) != null ? jD.a.b(var47.v) : null, var2);
                     return 1;
                  } else {
                     int var16;
                     if (var0 == 206) {
                        if ((var47 = var2 ? ic.a : ef.a) == null) {
                           hE.c[++hE.e - 1] = 0;
                           return 1;
                        } else if (var47.s * -744024149 == -1) {
                           hE.c[++hE.e - 1] = 0;
                           return 1;
                        } else {
                           var50 = jD.a.b(var47.v);
                           var53 = null;

                           for(var16 = var47.s * -744024149 + 1; var16 < var50.bH.length; ++var16) {
                              if ((var48 = var50.bH[var16]) != null && var48.M == var47.M) {
                                 var53 = var48;
                                 break;
                              }
                           }

                           dv.a(var53, var2);
                           return 1;
                        }
                     } else if (var0 == 207) {
                        if ((var47 = var2 ? ic.a : ef.a) == null) {
                           hE.c[++hE.e - 1] = 0;
                           return 1;
                        } else if (var47.s * -744024149 == -1) {
                           hE.c[++hE.e - 1] = 0;
                           return 1;
                        } else {
                           var50 = jD.a.b(var47.v);
                           var53 = null;

                           for(var16 = var47.s * -744024149 - 1; var16 >= 0; --var16) {
                              if ((var48 = var50.bH[var16]) != null && var47.M == var48.M) {
                                 var53 = var48;
                                 break;
                              }
                           }

                           dv.a(var53, var2);
                           return 1;
                        }
                     } else if (var0 == 208) {
                        if ((var47 = var2 ? ic.a : ef.a) == null) {
                           hE.c[++hE.e - 1] = 0;
                           return 1;
                        } else if (var47.j != 0) {
                           hE.c[++hE.e - 1] = 0;
                           return 1;
                        } else if ((var50 = jD.a.b(var47.v)).bH == null) {
                           hE.c[++hE.e - 1] = 0;
                           return 1;
                        } else {
                           var4 = 0;

                           for(var16 = 0; var16 < var50.bH.length; ++var16) {
                              if ((var48 = var50.bH[var16]) != null && var47.s * -744024149 == var48.M) {
                                 ++var4;
                              }
                           }

                           hE.c[++hE.e - 1] = var4;
                           return 1;
                        }
                     } else if (var0 == 209) {
                        var47 = var2 ? ic.a : ef.a;
                        hE.c[++hE.e - 1] = var47 != null ? var47.M : -1;
                        return 1;
                     } else {
                        Object var18;
                        Object var34;
                        int var38;
                        fd var39;
                        Object var54;
                        if (var0 == 210) {
                           var27 = hE.c[--hE.e];
                           var29 = hE.c[--hE.e];
                           var18 = fw.a(var27);
                           var16 = hE.c[--hE.e];
                           var54 = fw.a(var29);
                           bh var44;
                           Object var46 = (var44 = bN.a(var0 = hE.c[--hE.e])).a() ? var44.e : var44.d;
                           var34 = null;
                           if (var16 >= 0) {
                              bh var42;
                              var34 = (var42 = bN.a(var16)).a() ? var42.e : var42.d;
                           }

                           fd var43 = jD.a.b(hE.c[--hE.e]);
                           fd var37 = null;
                           if (var43 != null && var43.bH != null) {
                              for(var38 = 0; var38 < var43.bH.length; ++var38) {
                                 if ((var39 = var43.bH[var38]) != null && (var0 < 0 || var39.a(var0, var46).equals(var54)) && (var16 < 0 || var39.a(var16, var34).equals(var18))) {
                                    var37 = var39;
                                    break;
                                 }
                              }
                           }

                           dv.a(var37, var2);
                           return 1;
                        } else if (var0 == 211) {
                           hE.e -= 3;
                           var27 = hE.c[hE.e];
                           var50 = jD.a.b(hE.c[hE.e + 1]);
                           var4 = hE.c[hE.e + 2];
                           hE.i.a(var27, var50, var4);
                           hE.c[++hE.e - 1] = eQ.a(hE.i, -579241281);
                           return 1;
                        } else if (var0 == 212) {
                           var27 = hE.c[--hE.e];
                           if ((var50 = var2 ? ic.a : ef.a).s * -744024149 == -1) {
                              hE.i.a(var27, var50, -1);
                           } else {
                              hE.i.a(var27, jD.a.b(var50.v), var50.s * -744024149);
                           }

                           hE.c[++hE.e - 1] = eQ.a(hE.i, -1255590161);
                           return 1;
                        } else {
                           int var5;
                           eQ var24;
                           eQ var56;
                           if (var0 == 213) {
                              var56 = hE.i;
                              var27 = -1146545487;
                              var24 = var56;
                              dv.a(var56 == null ? ((var5 = var24.a()) >= 0 ? var24.c.bH[var5] : null) : ((var29 = var24.a()) >= 0 ? var24.c.bH[var29] : null), var2);
                              return 1;
                           } else if (var0 == 214) {
                              hE.c[++hE.e - 1] = hE.i.a();
                              return 1;
                           } else if (var0 == 215) {
                              Object[] var57 = hE.n;
                              var10001 = ++aU.a - 1;
                              int[] var28 = Arrays.copyOf((var24 = hE.i).b, var24.d);
                              hD var36;
                              (var36 = new hD(iv.c, true)).a = var28;
                              var36.c = var28.length * 1090132113;
                              var36.e = var28.length;
                              var57[var10001] = var36;
                              return 1;
                           } else if (var0 == 216) {
                              var18 = fw.a(hE.c[--hE.e]);
                              bh var23;
                              var54 = (var23 = bN.a(var4 = hE.c[--hE.e])).a() ? var23.e : var23.d;
                              var56 = hE.i;
                              Object var40 = var54;
                              var34 = var18;
                              var27 = var4;
                              var24 = var56;
                              Object var7;
                              if (var56 == null) {
                                 var7 = var18;
                                 Object var6 = var18;
                                 var5 = var4;
                                 eQ var25 = var24;
                                 int[] var8 = var24.b;
                                 int var9 = var24.d;
                                 var24.a = var24.a;
                                 var24.d = 0;
                                 var24.a = var8;

                                 for(int var10 = 0; var10 < var9; ++var10) {
                                    if ((var48 = var25.c.bH[var8[var10]]) != null) {
                                       Object var49 = var48.a(var5, var7);
                                       if (var6 == var49 || var49 != null && var49.equals(var6)) {
                                          var25.a(var8[var10]);
                                       }
                                    }
                                 }
                              }

                              int[] var35 = var24.b;
                              int var26 = var24.d;
                              var24.b = var24.a;
                              var24.d = 0;
                              var24.a = var35;

                              for(var38 = 0; var38 < var26; ++var38) {
                                 if ((var39 = var24.c.bH[var35[var38]]) != null) {
                                    var7 = var39.a(var27, var40);
                                    if (var34 == var7 || var7 != null && var7.equals(var34)) {
                                       var24.a(var35[var38]);
                                    }
                                 }
                              }

                              hE.c[++hE.e - 1] = eQ.a(hE.i, -2054699663);
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
      } else if (var0 < 1100) {
         return eu.a(var0, var2);
      } else if (var0 < 1200) {
         return ei.a(var0, var2);
      } else if (var0 < 1300) {
         return et.a(var0, var2);
      } else if (var0 < 1400) {
         return jM.a(var0, var2);
      } else if (var0 < 1500) {
         return ac.a(var0, var2);
      } else if (var0 < 1600) {
         return bG.a(var0, var2);
      } else if (var0 < 1700) {
         return cb.a(var0, var2);
      } else if (var0 < 1800) {
         return aD.a(var0, var2);
      } else if (var0 < 1900) {
         return er.a(var0, var2);
      } else if (var0 < 2000) {
         return t.a(var0, var2);
      } else if (var0 < 2100) {
         return eu.a(var0, var2);
      } else if (var0 < 2200) {
         return ei.a(var0, var2);
      } else if (var0 < 2300) {
         return et.a(var0, var2);
      } else if (var0 < 2400) {
         return jM.a(var0, var2);
      } else if (var0 < 2500) {
         return ac.a(var0, var2);
      } else {
         fd var41;
         if (var0 < 2600) {
            var41 = jD.a.b(hE.c[--hE.e]);
            if (var0 == 2500) {
               hE.c[++hE.e - 1] = var41.o;
               return 1;
            } else if (var0 == 2501) {
               hE.c[++hE.e - 1] = var41.k;
               return 1;
            } else if (var0 == 2502) {
               hE.c[++hE.e - 1] = var41.i * -1805166981;
               return 1;
            } else if (var0 == 2503) {
               hE.c[++hE.e - 1] = var41.n * -2133353239;
               return 1;
            } else if (var0 == 2504) {
               hE.c[++hE.e - 1] = var41.P ? 1 : 0;
               return 1;
            } else if (var0 == 2505) {
               hE.c[++hE.e - 1] = var41.v;
               return 1;
            } else {
               return 2;
            }
         } else {
            int[] var10000;
            int var45;
            if (var0 < 2700) {
               var41 = jD.a.b(hE.c[--hE.e]);
               int var55;
               if (var0 == 2600) {
                  var10000 = hE.c;
                  var10001 = ++hE.e - 1;
                  var55 = var41.L;
               } else if (var0 == 2601) {
                  var10000 = hE.c;
                  var10001 = ++hE.e - 1;
                  var55 = var41.D * 178093445;
               } else {
                  if (var0 == 2602) {
                     hE.n[++aU.a - 1] = var41.aC;
                     return 1;
                  }

                  if (var0 == 2603) {
                     var10000 = hE.c;
                     var10001 = ++hE.e - 1;
                     var55 = var41.B;
                  } else if (var0 == 2604) {
                     var10000 = hE.c;
                     var10001 = ++hE.e - 1;
                     var55 = var41.S;
                  } else if (var0 == 2605) {
                     var10000 = hE.c;
                     var10001 = ++hE.e - 1;
                     var55 = var41.ao;
                  } else if (var0 == 2606) {
                     var10000 = hE.c;
                     var10001 = ++hE.e - 1;
                     var55 = var41.ak;
                  } else if (var0 == 2607) {
                     var10000 = hE.c;
                     var10001 = ++hE.e - 1;
                     var55 = var41.ab;
                  } else if (var0 == 2608) {
                     var10000 = hE.c;
                     var10001 = ++hE.e - 1;
                     var55 = var41.ai;
                  } else if (var0 == 2609) {
                     var10000 = hE.c;
                     var10001 = ++hE.e - 1;
                     var55 = var41.K;
                  } else if (var0 == 2610) {
                     var10000 = hE.c;
                     var10001 = ++hE.e - 1;
                     var55 = var41.z;
                  } else if (var0 == 2611) {
                     var10000 = hE.c;
                     var10001 = ++hE.e - 1;
                     var55 = var41.R;
                  } else if (var0 == 2612) {
                     var10000 = hE.c;
                     var10001 = ++hE.e - 1;
                     var55 = var41.U;
                  } else if (var0 == 2613) {
                     var10000 = hE.c;
                     var10001 = ++hE.e - 1;
                     var55 = var41.C.e;
                  } else {
                     if (var0 == 2614) {
                        hE.c[++hE.e - 1] = var41.V ? 1 : 0;
                        return 1;
                     }

                     el var32;
                     if (var0 == 2617) {
                        var32 = var41.a();
                        hE.c[++hE.e - 1] = var32 != null ? var32.b : 0;
                     }

                     if (var0 == 2618) {
                        var32 = var41.a();
                        hE.c[++hE.e - 1] = var32 != null ? var32.c : 0;
                        return 1;
                     }

                     eK var33;
                     if (var0 == 2619) {
                        var33 = fd.b(var41, -434561526);
                        hE.n[++aU.a - 1] = var33 != null ? var33.b.a() : "";
                        return 1;
                     }

                     if (var0 == 2620) {
                        var32 = var41.a();
                        hE.c[++hE.e - 1] = var32 != null ? var32.d : 0;
                        return 1;
                     }

                     if (var0 == 2621) {
                        var33 = fd.b(var41, 1851889203);
                        hE.c[++hE.e - 1] = var33 != null ? var33.e() : 0;
                        return 1;
                     }

                     if (var0 == 2622) {
                        var33 = fd.b(var41, 696474216);
                        hE.c[++hE.e - 1] = var33 != null ? var33.g() : 0;
                        return 1;
                     }

                     if (var0 == 2623) {
                        var33 = fd.b(var41, 823279178);
                        hE.c[++hE.e - 1] = var33 != null ? var33.m : 0;
                        return 1;
                     }

                     if (var0 == 2624) {
                        var33 = fd.b(var41, 931338055);
                        hE.c[++hE.e - 1] = var33 != null && var33.g ? 1 : 0;
                        return 1;
                     }

                     if (var0 != 2625) {
                        if (var0 == 2626) {
                           var33 = fd.b(var41, 1668782931);
                           hE.n[++aU.a - 1] = var33 != null ? var33.c().d() : "";
                           return 1;
                        }

                        if (var0 != 2627) {
                           if (var0 == 2628) {
                              var33 = fd.b(var41, 1352731959);
                              hE.c[++hE.e - 1] = var33 != null ? var33.p : 0;
                              return 1;
                           }

                           if (var0 == 2629) {
                              var33 = fd.b(var41, 337381567);
                              hE.c[++hE.e - 1] = var33 != null ? var33.i() : 0;
                              return 1;
                           }

                           if (var0 == 2630) {
                              var33 = fd.b(var41, 1411389509);
                              hE.c[++hE.e - 1] = var33 != null ? var33.r : 0;
                              return 1;
                           }

                           if (var0 == 2631) {
                              var33 = fd.b(var41, -592019665);
                              hE.c[++hE.e - 1] = var33 != null ? eK.b(var33, 1002910562) : 0;
                              return 1;
                           }

                           if (var0 == 2632) {
                              var33 = fd.b(var41, 441958176);
                              hE.c[++hE.e - 1] = var33 != null ? var33.h() : 0;
                              return 1;
                           }

                           hj var20;
                           if (var0 == 2633) {
                              var20 = var41.b();
                              hE.c[hE.e - 1] = var20 != null ? var20.b(hE.c[hE.e - 1]) : 0;
                              return 1;
                           }

                           if (var0 == 2634) {
                              var20 = var41.b();
                              hE.c[hE.e - 1] = var20 != null ? var20.a((char)hE.c[hE.e - 1]) : 0;
                              return 1;
                           }

                           return 2;
                        }

                        var0 = (var33 = fd.b(var41, -156832583)) != null ? eK.a(var33, (short)1139) : 0;
                        var45 = var33 != null ? var33.p : 0;
                        hE.c[++hE.e - 1] = Math.min(var0, var45);
                        var10000 = hE.c;
                        var10001 = ++hE.e - 1;
                        var55 = Math.max(var0, var45);
                     } else {
                        var33 = fd.b(var41, 1544994871);
                        var10000 = hE.c;
                        var10001 = ++hE.e - 1;
                        var55 = var33 != null && eK.d(var33, -549852146) ? 1 : 0;
                     }
                  }
               }

               var10000[var10001] = var55;
               return 1;
            } else if (var0 < 2800) {
               return iv.a(var0);
            } else if (var0 < 2900) {
               return hY.b(var0);
            } else if (var0 < 3000) {
               return t.a(var0, var2);
            } else if (var0 < 3200) {
               return dJ.a(var0, var2);
            } else if (var0 < 3300) {
               return eB.a(var0);
            } else if (var0 < 3400) {
               return ec.a(var0);
            } else if (var0 < 3500) {
               return fD.a(var0);
            } else if (var0 < 3600) {
               if (var0 == 3500) {
                  var27 = hE.c[--hE.e];
                  hE.c[++hE.e - 1] = client.aU.c(var27) ? 1 : 0;
                  return 1;
               } else {
                  cV var31;
                  if (var0 == 3501) {
                     var27 = hE.c[--hE.e];
                     var10000 = hE.c;
                     var10001 = ++hE.e - 1;
                     var31 = client.aU;
                     var10000[var10001] = (var27 >= 0 && var27 < 112 ? var31.f[var27] : false) ? 1 : 0;
                     return 1;
                  } else if (var0 != 3502) {
                     return 2;
                  } else {
                     var27 = hE.c[--hE.e];
                     var10000 = hE.c;
                     var10001 = ++hE.e - 1;
                     cV var10002 = client.aU;
                     boolean var19 = true;
                     var31 = var10002;
                     var10000[var10001] = (var10002 == null ? (var27 >= 0 && var27 < 112 ? var31.h[var27] : false) : (var27 >= 0 && var27 < 112 ? var31.h[var27] : false)) ? 1 : 0;
                     return 1;
                  }
               }
            } else if (var0 < 3700) {
               return fZ.a(var0);
            } else if (var0 < 3800) {
               return 2;
            } else if (var0 < 3900) {
               return osrs.n.a(var0);
            } else if (var0 < 4000) {
               return bW.a(var0);
            } else if (var0 < 4100) {
               return x.b(var0);
            } else if (var0 < 4200) {
               return cL.b(var0);
            } else if (var0 < 4300) {
               return hK.a(var0);
            } else if (var0 < 5100) {
               return K.b(var0);
            } else if (var0 < 5400) {
               return ba.a(var0);
            } else if (var0 < 5600) {
               if (var0 == 5504) {
                  hE.e -= 2;
                  var27 = hE.c[hE.e];
                  var29 = hE.c[hE.e + 1];
                  if (!client.cu) {
                     client.bW = var27;
                     client.I();
                     client.cd = var29;
                  }

                  return 1;
               } else if (var0 == 5505) {
                  hE.c[++hE.e - 1] = client.bW;
                  return 1;
               } else if (var0 == 5506) {
                  hE.c[++hE.e - 1] = client.cd;
                  return 1;
               } else if (var0 == 5530) {
                  if ((var27 = hE.c[--hE.e]) < 0) {
                     var27 = 0;
                  }

                  client.ak = var27;
                  return 1;
               } else if (var0 == 5531) {
                  hE.c[++hE.e - 1] = client.ak;
                  return 1;
               } else {
                  return 2;
               }
            } else if (var0 < 5700) {
               return cX.a(var0);
            } else if (var0 < 6300) {
               return osrs.k.a(var0);
            } else if (var0 < 6600) {
               return gO.a(var0);
            } else if (var0 < 6700) {
               return bt.b(var0);
            } else if (var0 < 6800) {
               return aP.b(var0);
            } else if (var0 < 6900) {
               return jD.e(var0);
            } else if (var0 < 7000) {
               return 2;
            } else if (var0 < 7100) {
               return cI.b();
            } else if (var0 < 7200) {
               return ir.b(var0);
            } else if (var0 < 7500) {
               return dd.a(var0);
            } else if (var0 < 7600) {
               return jT.c(var0);
            } else if (var0 < 7700) {
               return gd.b();
            } else if (var0 < 8000) {
               if (var0 == 7900) {
                  client.bh = Math.max(hE.c[--hE.e], 0);
                  return 1;
               } else if (var0 == 7901) {
                  hE.c[++hE.e - 1] = client.bh;
                  return 1;
               } else {
                  return 2;
               }
            } else if (var0 < 8100) {
               return je.a(var0);
            } else if (var0 < 10100) {
               client var21;
               var27 = (var21 = dF.c).getIntStackSize();
               int[] var3 = var21.getIntStack();
               var4 = var21.getObjectStackSize();
               var21.getObjectStack();
               long var11;
               long var13;
               long var17;
               switch(var0) {
               case 10000:
                  --var27;
                  var45 = var3[var27];
                  fm var12 = (fm)ab.c.e.get(var45);
                  var3[var27++] = var12.c.getSpent();
                  break;
               case 10001:
                  var27 -= 3;
                  var11 = (long)var3[var27];
                  var13 = (long)Math.min(var3[var27 + 1], 999999999);
                  long var52 = (long)var3[var27 + 2];
                  if ((var17 = (var11 * 1000000000L + var13) * var52) <= 2147483647999999999L) {
                     var3[var27++] = (int)(var17 / 1000000000L);
                     var3[var27++] = (int)(var17 % 1000000000L);
                  } else {
                     var3[var27++] = Integer.MAX_VALUE;
                     var3[var27++] = 999999999;
                  }
                  break;
               case 10002:
                  var27 -= 3;
                  var11 = (long)var3[var27];
                  var13 = (long)Math.min(var3[var27 + 1], 999999999);
                  double var15 = (double)var3[var27 + 2] / 100.0D;
                  if ((var17 = (long)((double)(var11 * 1000000000L + var13) * (var15 + 1.0D))) <= 2147483647999999999L) {
                     var3[var27++] = (int)(var17 / 1000000000L);
                     var3[var27++] = (int)(var17 % 1000000000L);
                  } else {
                     var3[var27++] = Integer.MAX_VALUE;
                     var3[var27++] = 999999999;
                  }
                  break;
               default:
                  return 2;
               }

               var21.setIntStackSize(var27);
               var21.setObjectStackSize(var4);
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lcs;I)V",
      garbageValue = "518781276"
   )
   public static void a(jK var0) {
      fk.a(var0, 500000, 475000);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "895132688"
   )
   static void b() {
      if (I.d()) {
         jB.u = true;
         jB.B = 0;
         jB.A = 0;
      }

   }

   static {
      b = new fW(0, new fP[]{fP.a, fP.d});
      i = new fW(1, new fP[]{fP.c, fP.a, fP.d});
      l = new fW(2, new fP[]{fP.c, fP.b, fP.a});
      a = new fW(3, new fP[]{fP.c});
      j = new fW(4);
      e = new fW(5, new fP[]{fP.c, fP.a});
      d = new fW(6, new fP[]{fP.a});
      k = new fW(8, new fP[]{fP.c, fP.a});
      h = new fW(9, new fP[]{fP.c, fP.b});
      g = new fW(10, new fP[]{fP.c});
      n = new fW(11, new fP[]{fP.c});
      m = new fW(12, new fP[]{fP.c, fP.a});
      f = new fW(13, new fP[]{fP.c});
      fW[] var10000 = new fW[]{e, d, b, m, g, h, i, j, a, n, f, l, k};
   }
}
