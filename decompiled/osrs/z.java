package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public final class z extends hR {
   @ObfuscatedName("kz")
   @ObfuscatedSignature(
      signature = "Lpu;"
   )
   static fE a;
   @ObfuscatedName("rj")
   @ObfuscatedSignature(
      signature = "Ljm;"
   )
   static cn b;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Ldh;"
   )
   private jZ c;

   public z() {
      this.c = null;
   }

   @ObfuscatedSignature(
      signature = "(Lem;)V"
   )
   z(E var1) {
      if (var1 != null) {
         this.c = new jZ(var1, (kl)null);
      }

   }

   @ObfuscatedSignature(
      signature = "(Lds;)V"
   )
   public z(kl var1) {
      this.c = new jZ((E)null, var1);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(I)Lds;",
      garbageValue = "-1771676046"
   )
   private kl c() {
      if (this.c.a == null) {
         jZ var10000 = this.c;
         Object var2 = null;
         E var1 = this.c.c;
         kl var116;
         if (var2 != null && ((Object[])var2)[0] <= 0) {
            var116 = null;
         } else {
            if (var1.A == null) {
               var1.y = 0;
               var1.u = new float[E.f];
               var1.A = new short[var1.t];
               var1.D = 0;
               var1.C = 0;
            }

            while(true) {
               if (var1.C >= var1.s.length) {
                  var1.u = null;
                  short[] var83 = var1.A;
                  var1.A = null;
                  var116 = new kl(var1.w, var83, var1.v, var1.x, var1.E, false);
                  break;
               }

               if (var2 != null && ((Object[])var2)[0] <= 0) {
                  var116 = null;
                  break;
               }

               int var4 = var1.C;
               E var3 = var1;
               w var5;
               (var5 = new w()).a((byte[])var1.s[var4], 0);
               var1.B = new float[E.f];
               var5.a();
               var4 = w.a(var5, aV.a(E.e.length - 1));
               boolean var6;
               int var7 = (var6 = E.j[var4]) ? E.f : E.k;
               boolean var8 = false;
               boolean var9 = false;
               if (var6) {
                  var8 = var5.a() != 0;
                  var9 = var5.a() != 0;
               }

               int var10 = var7 >> 1;
               int var11;
               int var12;
               int var91;
               if (var6 && !var8) {
                  var91 = (var7 >> 2) - (E.k >> 2);
                  var11 = (E.k >> 2) + (var7 >> 2);
                  var12 = E.k >> 1;
               } else {
                  var91 = 0;
                  var11 = var10;
                  var12 = var7 >> 1;
               }

               int var13;
               int var92;
               if (var6 && !var9) {
                  var92 = var7 - (var7 >> 2) - (E.k >> 2);
                  var10 = (E.k >> 2) + (var7 - (var7 >> 2));
                  var13 = E.k >> 1;
               } else {
                  var92 = var10;
                  var10 = var7;
                  var13 = var7 >> 1;
               }

               L var84;
               int var14 = (var84 = E.a[E.e[var4]]).d;
               var14 = var84.c[var14];
               O var15;
               boolean var93 = !(var15 = kj.a(E.i[var14], var5)).b;

               int var16;
               float[] var18;
               int var19;
               int var70;
               int var71;
               int var72;
               int var73;
               int var74;
               int var75;
               for(var16 = 0; var16 < var84.b; ++var16) {
                  kh var17 = E.b[var84.a[var16]];
                  var18 = var3.B;
                  int var10003 = var7 >> 1;
                  w var65 = var5;
                  var19 = var10003;
                  var18 = var18;
                  var17 = var17;

                  int var66;
                  for(var66 = 0; var66 < var19; ++var66) {
                     var18[var66] = 0.0F;
                  }

                  if (!var93) {
                     var66 = E.g[var17.b].b;
                     int var68;
                     int[] var69 = new int[var68 = (var17.f - var17.d) / var17.c];

                     for(var70 = 0; var70 < 8; ++var70) {
                        var71 = 0;

                        while(var71 < var68) {
                           if (var70 == 0) {
                              var72 = E.g[var17.b].b(var65);

                              for(var73 = var66 - 1; var73 >= 0; --var73) {
                                 if (var71 + var73 < var68) {
                                    var69[var71 + var73] = var72 % var17.e;
                                 }

                                 var72 /= var17.e;
                              }
                           }

                           for(var72 = 0; var72 < var66; ++var72) {
                              var73 = var69[var71];
                              if ((var74 = var17.a[var70 + (var73 << 3)]) >= 0) {
                                 var75 = var71 * var17.c + var17.d;
                                 H var76 = E.g[var74];
                                 int var77;
                                 if (var17.g == 0) {
                                    var77 = var17.c / var76.b;

                                    for(int var112 = 0; var112 < var77; ++var112) {
                                       float[] var113 = var76.a(var65);

                                       for(int var80 = 0; var80 < var76.b; ++var80) {
                                          var18[var75 + var112 + var80 * var77] += var113[var80];
                                       }
                                    }
                                 } else {
                                    var77 = 0;

                                    while(var77 < var17.c) {
                                       float[] var78 = var76.a(var65);

                                       for(int var79 = 0; var79 < var76.b; ++var79) {
                                          var18[var75 + var77] += var78[var79];
                                          ++var77;
                                       }
                                    }
                                 }
                              }

                              ++var71;
                              if (var71 >= var68) {
                                 break;
                              }
                           }
                        }
                     }
                  }
               }

               if (var15.b) {
                  var14 = var84.d;
                  int var10001 = var84.c[var14];
                  var19 = var7 >> 1;
                  var18 = var3.B;
                  O var95 = var15;
                  int var107 = var15.e.d.length;
                  kj var114 = var15.e;
                  int var67 = kj.b[var15.e.c - 1];
                  boolean[] var108 = var15.c;
                  var15.c[1] = true;
                  var108[0] = true;

                  int var109;
                  for(var109 = 2; var109 < var107; ++var109) {
                     var114 = var95.e;
                     var70 = kj.b(var95.d, var109);
                     var114 = var95.e;
                     var71 = kj.a(var95.d, var109);
                     var114 = var95.e;
                     var72 = kj.a(var95.d[var70], var95.a[var70], var95.d[var71], var95.a[var71], var95.d[var109]);
                     var73 = var95.a[var109];
                     var75 = ((var74 = var67 - var72) < var72 ? var74 : var72) << 1;
                     if (var73 != 0) {
                        boolean[] var111 = var95.c;
                        var95.c[var71] = true;
                        var111[var70] = true;
                        var95.c[var109] = true;
                        if (var73 >= var75) {
                           var95.a[var109] = var74 > var72 ? var72 + (var73 - var72) : var74 + (var72 - var73) - 1;
                        } else {
                           var95.a[var109] = (var73 & 1) != 0 ? var72 - (var73 + 1) / 2 : var73 / 2 + var72;
                        }
                     } else {
                        var95.c[var109] = false;
                        var95.a[var109] = var72;
                     }
                  }

                  var95.a(0, var107 - 1);
                  var109 = 0;
                  var70 = var95.e.c * var95.a[0];
                  var71 = 1;

                  label332:
                  while(true) {
                     if (var71 >= var107) {
                        var114 = var95.e;
                        float var110 = kj.a[var70];
                        var72 = var109;

                        while(true) {
                           if (var72 >= var19) {
                              break label332;
                           }

                           var18[var72] *= var110;
                           ++var72;
                        }
                     }

                     if (var95.c[var71]) {
                        var72 = var95.d[var71];
                        var73 = var95.e.c * var95.a[var71];
                        var114 = var95.e;
                        kj.a(var109, var70, var72, var73, var18, var19);
                        if (var72 >= var19) {
                           break;
                        }

                        var109 = var72;
                        var70 = var73;
                     }

                     ++var71;
                  }
               }

               float[] var85;
               int var86;
               float[] var88;
               int var97;
               if (!var15.b) {
                  for(var16 = var7 >> 1; var16 < var7; ++var16) {
                     var3.B[var16] = 0.0F;
                  }
               } else {
                  var16 = var7 >> 1;
                  int var96 = var7 >> 2;
                  var97 = var7 >> 3;
                  var85 = var3.B;

                  for(var86 = 0; var86 < var16; ++var86) {
                     var85[var86] *= 0.5F;
                  }

                  for(var86 = var16; var86 < var7; ++var86) {
                     var85[var86] = -var85[var7 - var86 - 1];
                  }

                  var88 = var6 ? E.d : E.o;
                  float[] var94 = var6 ? E.h : E.m;
                  float[] var98 = var6 ? E.q : E.c;
                  int[] var87 = var6 ? E.n : E.p;

                  int var20;
                  float var21;
                  float var22;
                  float var23;
                  float var24;
                  for(var20 = 0; var20 < var96; ++var20) {
                     var21 = var85[var20 << 2] - var85[var7 - (var20 << 2) - 1];
                     var22 = var85[(var20 << 2) + 2] - var85[var7 - (var20 << 2) - 3];
                     var23 = var88[var20 << 1];
                     var24 = var88[(var20 << 1) + 1];
                     var85[var7 - (var20 << 2) - 1] = var21 * var23 - var22 * var24;
                     var85[var7 - (var20 << 2) - 3] = var21 * var24 + var22 * var23;
                  }

                  float var25;
                  float var26;
                  for(var20 = 0; var20 < var97; ++var20) {
                     var21 = var85[var16 + (var20 << 2) + 3];
                     var22 = var85[var16 + (var20 << 2) + 1];
                     var23 = var85[(var20 << 2) + 3];
                     var24 = var85[(var20 << 2) + 1];
                     var85[var16 + (var20 << 2) + 3] = var21 + var23;
                     var85[var16 + (var20 << 2) + 1] = var22 + var24;
                     var25 = var88[var16 - 4 - (var20 << 2)];
                     var26 = var88[var16 - 3 - (var20 << 2)];
                     var85[(var20 << 2) + 3] = (var21 - var23) * var25 - (var22 - var24) * var26;
                     var85[(var20 << 2) + 1] = (var22 - var24) * var25 + (var21 - var23) * var26;
                  }

                  var20 = aV.a(var7 - 1);
                  int var99 = 0;

                  label429:
                  while(true) {
                     int var100;
                     int var101;
                     int var102;
                     if (var99 >= var20 - 3) {
                        for(var99 = 1; var99 < var97 - 1; ++var99) {
                           var100 = var87[var99];
                           if (var99 < var100) {
                              var101 = var99 << 3;
                              var102 = var100 << 3;
                              var25 = var85[var101 + 1];
                              var85[var101 + 1] = var85[var102 + 1];
                              var85[var102 + 1] = var25;
                              var25 = var85[var101 + 3];
                              var85[var101 + 3] = var85[var102 + 3];
                              var85[var102 + 3] = var25;
                              var25 = var85[var101 + 5];
                              var85[var101 + 5] = var85[var102 + 5];
                              var85[var102 + 5] = var25;
                              var25 = var85[var101 + 7];
                              var85[var101 + 7] = var85[var102 + 7];
                              var85[var102 + 7] = var25;
                           }
                        }

                        for(var99 = 0; var99 < var16; ++var99) {
                           var85[var99] = var85[(var99 << 1) + 1];
                        }

                        for(var99 = 0; var99 < var97; ++var99) {
                           var85[var7 - 1 - (var99 << 1)] = var85[var99 << 2];
                           var85[var7 - 2 - (var99 << 1)] = var85[(var99 << 2) + 1];
                           var85[var7 - var96 - 1 - (var99 << 1)] = var85[(var99 << 2) + 2];
                           var85[var7 - var96 - 2 - (var99 << 1)] = var85[(var99 << 2) + 3];
                        }

                        for(var99 = 0; var99 < var97; ++var99) {
                           var22 = var98[var99 << 1];
                           var23 = var98[(var99 << 1) + 1];
                           var24 = var85[var16 + (var99 << 1)];
                           var25 = var85[var16 + (var99 << 1) + 1];
                           var26 = var85[var7 - 2 - (var99 << 1)];
                           float var105 = var85[var7 - 1 - (var99 << 1)];
                           float var106 = var23 * (var24 - var26) + var22 * (var25 + var105);
                           var85[var16 + (var99 << 1)] = (var24 + var26 + var106) * 0.5F;
                           var85[var7 - 2 - (var99 << 1)] = (var24 + var26 - var106) * 0.5F;
                           var106 = var23 * (var25 + var105) - var22 * (var24 - var26);
                           var85[var16 + (var99 << 1) + 1] = (var25 - var105 + var106) * 0.5F;
                           var85[var7 - 1 - (var99 << 1)] = (-var25 + var105 + var106) * 0.5F;
                        }

                        for(var99 = 0; var99 < var96; ++var99) {
                           var85[var99] = var85[var16 + (var99 << 1)] * var94[var99 << 1] + var85[var16 + (var99 << 1) + 1] * var94[(var99 << 1) + 1];
                           var85[var16 - 1 - var99] = var85[var16 + (var99 << 1)] * var94[(var99 << 1) + 1] - var85[var16 + (var99 << 1) + 1] * var94[var99 << 1];
                        }

                        for(var99 = 0; var99 < var96; ++var99) {
                           var85[var99 + (var7 - var96)] = -var85[var99];
                        }

                        for(var99 = 0; var99 < var96; ++var99) {
                           var85[var99] = var85[var96 + var99];
                        }

                        for(var99 = 0; var99 < var96; ++var99) {
                           var85[var96 + var99] = -var85[var96 - var99 - 1];
                        }

                        for(var99 = 0; var99 < var96; ++var99) {
                           var85[var16 + var99] = var85[var7 - var99 - 1];
                        }

                        float[] var115;
                        for(var99 = var91; var99 < var11; ++var99) {
                           var22 = (float)Math.sin(((double)(var99 - var91) + 0.5D) / (double)var12 * 0.5D * 3.141592653589793D);
                           var115 = var3.B;
                           var115[var99] *= (float)Math.sin(1.5707963267948966D * (double)var22 * (double)var22);
                        }

                        var99 = var92;

                        while(true) {
                           if (var99 >= var10) {
                              break label429;
                           }

                           var22 = (float)Math.sin(((double)(var99 - var92) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                           var115 = var3.B;
                           var115[var99] *= (float)Math.sin(1.5707963267948966D * (double)var22 * (double)var22);
                           ++var99;
                        }
                     }

                     var100 = var7 >> var99 + 2;
                     var101 = 8 << var99;

                     for(var102 = 0; var102 < 2 << var99; ++var102) {
                        int var27 = var7 - (var100 * var102 << 1);
                        int var28 = var7 - var100 * ((var102 << 1) + 1);

                        for(int var103 = 0; var103 < var7 >> var99 + 4; ++var103) {
                           int var104 = var103 << 2;
                           float var29 = var85[var27 - 1 - var104];
                           float var30 = var85[var27 - 3 - var104];
                           float var31 = var85[var28 - 1 - var104];
                           float var32 = var85[var28 - 3 - var104];
                           var85[var27 - 1 - var104] = var29 + var31;
                           var85[var27 - 3 - var104] = var30 + var32;
                           float var33 = var88[var103 * var101];
                           float var34 = var88[var103 * var101 + 1];
                           var85[var28 - 1 - var104] = (var29 - var31) * var33 - (var30 - var32) * var34;
                           var85[var28 - 3 - var104] = (var30 - var32) * var33 + (var29 - var31) * var34;
                        }
                     }

                     ++var99;
                  }
               }

               var85 = null;
               if (var3.y > 0) {
                  var85 = new float[var7 + var3.y >> 2];
                  if (!var3.r) {
                     for(var97 = 0; var97 < var3.z; ++var97) {
                        var86 = var97 + (var3.y >> 1);
                        var85[var97] += var3.u[var86];
                     }
                  }

                  if (var15.b) {
                     for(var97 = var91; var97 < var7 >> 1; ++var97) {
                        var86 = var85.length - (var7 >> 1) + var97;
                        var85[var86] += var3.B[var97];
                     }
                  }
               }

               var88 = var3.u;
               var3.u = var3.B;
               var3.B = var88;
               var3.y = var7;
               var3.z = var10 - (var7 >> 1);
               var3.r = !var15.b;
               float[] var82 = var85;
               if (var85 != null) {
                  var4 = var1.D;
                  if ((var86 = var85.length) > var1.t - var4) {
                     var86 = var1.t - var4;
                  }

                  for(int var89 = 0; var89 < var86; ++var89) {
                     short[] var90 = var1.A;
                     var91 = var4++;
                     var92 = (int)(32768.0F * var82[var89]);
                     var92 = Math.max(-32768, Math.min(var92, 32767));
                     var90[var91] = (short)var92;
                  }

                  if (var2 != null) {
                     ((Object[])var2)[0] -= var4 - var1.D;
                  }

                  var1.D = var4;
               }

               ++var1.C;
            }
         }

         var10000.a = var116;
         this.c.c = null;
      }

      return this.c.a;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)Lds;"
   )
   private kl d() {
      if (this.c != null && this.c.b.tryLock()) {
         kl var1;
         try {
            var1 = this.c();
         } finally {
            this.c.b.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(B)Lds;"
   )
   private kl e() {
      if (this.c != null) {
         this.c.b.lock();

         kl var1;
         try {
            var1 = this.c();
         } finally {
            this.c.b.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "88"
   )
   public final boolean a() {
      return this.c == null;
   }

   @ObfuscatedName("xf")
   @ObfuscatedSignature(
      signature = "(Leh;B)Lds;"
   )
   public static kl a(z var0, byte var1) {
      if (var0 == null) {
         var0.d();
      }

      if (var0.c != null && var0.c.b.tryLock()) {
         kl var4;
         try {
            var4 = var0.c();
         } finally {
            var0.c.b.unlock();
         }

         return var4;
      } else {
         return null;
      }
   }

   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      signature = "(Leh;B)Lds;"
   )
   public static kl b(z var0, byte var1) {
      if (var0 == null) {
         return var0.e();
      } else if (var0.c != null) {
         var0.c.b.lock();

         kl var4;
         try {
            var4 = var0.c();
         } finally {
            var0.c.b.unlock();
         }

         return var4;
      } else {
         return null;
      }
   }

   @ObfuscatedName("kk")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "192064387"
   )
   static final void b() {
      if (!client.dx && !client.cj) {
         throw new AssertionError();
      } else {
         kx var0;
         if (client.fd == null) {
            (var0 = new kx(client.dd, client.A, aM.a, kq.a(true))).m = var0.n.n;
            var0.i = var0.n.i;
            var0.e = bp.a;
            var0.l = bi.d;
            var0.f = ec.a.m;
            if (!client.dx && client.cS != null) {
               throw new AssertionError();
            } else {
               client.fd = var0;
               var0.b();
            }
         } else {
            if (client.fd.a()) {
               var0 = client.fd;
               if (!client.dx && client.cS != null) {
                  throw new AssertionError();
               }

               client.fd = null;
               client.bC = false;
               aM.a.m = var0.f;
               client.c(var0);
               client.b(var0);
               if (!client.dx) {
                  client var10000 = dF.c;
                  if (client.q() != 25) {
                     throw new AssertionError();
                  }
               }

               if (!client.dx && client.cj) {
                  throw new AssertionError();
               }

               if (var0.g != client.dd && client.dd != null) {
                  client.cV.info("Reloading due to draw callbacks change while loading!");
                  client.cj = true;
               }
            }

         }
      }
   }
}
