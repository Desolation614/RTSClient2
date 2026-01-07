package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public final class en extends hR {
   @ObfuscatedName("aj")
   byte[] a;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lqq;"
   )
   gb b = new gb(16);

   @ObfuscatedSignature(
      signature = "(Lwt;)V"
   )
   private en(jk var1) {
      var1.c = var1.d.length - 3;
      int var2 = jk.a(var1, (byte)-94);
      int var3 = var1.d();
      int var4 = var2 * 10 + 14;
      var1.c = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;

      int var13;
      int var14;
      int var15;
      for(var13 = 0; var13 < var2; ++var13) {
         var14 = -1;

         while(true) {
            if ((var15 = jk.a((jk)var1, (byte)35)) != var14) {
               ++var4;
            }

            var14 = var15 & 15;
            if (var15 == 7) {
               break;
            }

            if (var15 == 23) {
               ++var5;
            } else if (var14 == 0) {
               ++var7;
            } else if (var14 == 1) {
               ++var8;
            } else if (var14 == 2) {
               ++var6;
            } else if (var14 == 3) {
               ++var9;
            } else if (var14 == 4) {
               ++var10;
            } else if (var14 == 5) {
               ++var11;
            } else {
               if (var14 != 6) {
                  throw new RuntimeException();
               }

               ++var12;
            }
         }
      }

      var4 = var4 + var5 * 5 + (var7 + var8 + var6 + var9 + var11 << 1) + var10 + var12;
      var13 = var1.c;
      var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(var15 = 0; var15 < var14; ++var15) {
         var1.s();
      }

      var4 += var1.c - var13;
      var15 = var1.c;
      var14 = 0;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;

      int var28;
      for(var28 = 0; var28 < var6; ++var28) {
         if ((var27 = var27 + jk.a(var1, (byte)-41) & 127) != 0 && var27 != 32) {
            if (var27 == 1) {
               ++var14;
            } else if (var27 == 33) {
               ++var16;
            } else if (var27 == 7) {
               ++var17;
            } else if (var27 == 39) {
               ++var18;
            } else if (var27 == 10) {
               ++var19;
            } else if (var27 == 42) {
               ++var20;
            } else if (var27 == 99) {
               ++var21;
            } else if (var27 == 98) {
               ++var22;
            } else if (var27 == 101) {
               ++var23;
            } else if (var27 == 100) {
               ++var24;
            } else if (var27 != 64 && var27 != 65 && var27 != 120 && var27 != 121 && var27 != 123) {
               ++var26;
            } else {
               ++var25;
            }
         } else {
            ++var12;
         }
      }

      var28 = 0;
      var6 = var1.c;
      var1.c += var25;
      var25 = var1.c;
      var1.c += var11;
      int var29 = var1.c;
      var1.c += var10;
      var10 = var1.c;
      var1.c += var9;
      int var30 = var1.c;
      var1.c += var14;
      var14 = var1.c;
      var1.c += var17;
      var17 = var1.c;
      var1.c += var19;
      var19 = var1.c;
      var1.c += var7 + var8 + var11;
      var11 = var1.c;
      var1.c += var7;
      var7 = var1.c;
      var1.c += var26;
      var26 = var1.c;
      var1.c += var8;
      var8 = var1.c;
      var1.c += var16;
      var16 = var1.c;
      var1.c += var18;
      var18 = var1.c;
      var1.c += var20;
      var20 = var1.c;
      var1.c += var12;
      var12 = var1.c;
      var1.c += var9;
      var9 = var1.c;
      var1.c += var21;
      var21 = var1.c;
      var1.c += var22;
      var22 = var1.c;
      var1.c += var23;
      var23 = var1.c;
      var1.c += var24;
      var24 = var1.c;
      var1.c += var5 * 3;
      this.a = new byte[var4];
      jk var75;
      (var75 = new jk(this.a)).c(1297377380);
      var75.c(6);
      var75.d(var2 > 1 ? 1 : 0);
      var75.d(var2);
      var75.d(var3);
      var1.c = var13;
      var3 = 0;
      var5 = 0;
      var13 = 0;
      int var31 = 0;
      int var32 = 0;
      int var33 = 0;
      int var34 = 0;
      int[] var35 = new int[128];
      var27 = 0;
      int[] var36 = new int[16];
      int[] var37;
      (var37 = new int[16])[9] = 128;
      var36[9] = 128;

      label237:
      for(int var38 = 0; var38 < var2; ++var38) {
         var75.c(1297379947);
         var75.c += 4;
         int var39;
         int var64 = var39 = var75.c;
         int var65 = -1;

         while(true) {
            while(true) {
               int var66 = var1.s();
               jk.b(var75, var66);
               var64 += var66;
               int var67;
               boolean var68 = (var67 = var1.d[var28++] & 255) != var65;
               var65 = var67 & 15;
               if (var67 == 7) {
                  if (var68) {
                     var75.b(255);
                  }

                  var75.b(47);
                  var75.b(0);
                  int var74 = var75.c - var39;
                  if (var74 < 0) {
                     throw new IllegalArgumentException();
                  }

                  var75.d[var75.c - var74 - 4] = (byte)(var74 >> 24);
                  var75.d[var75.c - var74 - 3] = (byte)(var74 >> 16);
                  var75.d[var75.c - var74 - 2] = (byte)(var74 >> 8);
                  var75.d[var75.c - var74 - 1] = (byte)var74;
                  continue label237;
               }

               if (var67 == 23) {
                  if (var68) {
                     var75.b(255);
                  }

                  var75.b(81);
                  var75.b(3);
                  var75.b(var1.d[var24++]);
                  var75.b(var1.d[var24++]);
                  var75.b(var1.d[var24++]);
               } else {
                  var3 ^= var67 >> 4;
                  int var70;
                  int var76;
                  if (var65 == 0) {
                     if (var68) {
                        var75.b(var3 + 144);
                     }

                     var5 += var1.d[var19++];
                     var13 += var1.d[var11++];
                     var76 = var5 & 127;
                     var70 = var13 & 127;
                     var75.b(var76);
                     var75.b(var70);
                     if (var70 > 0) {
                        int var71 = var37[var3];
                        eC var72;
                        if ((var72 = (eC)gb.a(this.b, (long)var71)) == null) {
                           var72 = new eC(var64);
                           this.b.a((hR)var72, (long)var71);
                        }

                        var72.c.set(var76);
                     }
                  } else if (var65 == 1) {
                     if (var68) {
                        var75.b(var3 + 128);
                     }

                     var5 += var1.d[var19++];
                     var31 += var1.d[var26++];
                     var75.b(var5 & 127);
                     var75.b(var31 & 127);
                  } else {
                     byte var69;
                     if (var65 == 2) {
                        if (var68) {
                           var75.b(var3 + 176);
                        }

                        var27 = var27 + var1.d[var15++] & 127;
                        var75.b(var27);
                        if (var27 != 0 && var27 != 32) {
                           if (var27 == 1) {
                              var69 = var1.d[var30++];
                           } else if (var27 == 33) {
                              var69 = var1.d[var8++];
                           } else if (var27 == 7) {
                              var69 = var1.d[var14++];
                           } else if (var27 == 39) {
                              var69 = var1.d[var16++];
                           } else if (var27 == 10) {
                              var69 = var1.d[var17++];
                           } else if (var27 == 42) {
                              var69 = var1.d[var18++];
                           } else if (var27 == 99) {
                              var69 = var1.d[var9++];
                           } else if (var27 == 98) {
                              var69 = var1.d[var21++];
                           } else if (var27 == 101) {
                              var69 = var1.d[var22++];
                           } else if (var27 == 100) {
                              var69 = var1.d[var23++];
                           } else if (var27 != 64 && var27 != 65 && var27 != 120 && var27 != 121 && var27 != 123) {
                              var69 = var1.d[var7++];
                           } else {
                              var69 = var1.d[var6++];
                           }
                        } else {
                           var69 = var1.d[var20++];
                        }

                        var76 = var69 + var35[var27];
                        var35[var27] = var76;
                        var70 = var76 & 127;
                        var75.b(var70);
                        if (var27 == 0) {
                           var36[var3] = (var70 << 14) + (var36[var3] & -2080769);
                        }

                        if (var27 == 32) {
                           var36[var3] = (var36[var3] & -16257) + (var70 << 7);
                        }
                     } else if (var65 == 3) {
                        if (var68) {
                           var75.b(var3 + 224);
                        }

                        var32 = var32 + var1.d[var12++] + (var1.d[var10++] << 7);
                        var75.b(var32 & 127);
                        var75.b(var32 >> 7 & 127);
                     } else if (var65 == 4) {
                        if (var68) {
                           var75.b(var3 + 208);
                        }

                        var33 += var1.d[var29++];
                        var75.b(var33 & 127);
                     } else if (var65 == 5) {
                        if (var68) {
                           var75.b(var3 + 160);
                        }

                        var5 += var1.d[var19++];
                        var34 += var1.d[var25++];
                        var75.b(var5 & 127);
                        var75.b(var34 & 127);
                     } else {
                        if (var65 != 6) {
                           throw new RuntimeException();
                        }

                        if (var68) {
                           var75.b(var3 + 192);
                        }

                        var69 = var1.d[var20++];
                        var37[var3] = var69 + var36[var3];
                        var75.b(var69);
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lps;II)Lnh;"
   )
   public static en a(fB var0, int var1, int var2) {
      byte[] var3;
      return (var3 = fB.a(var0, var1, var2)) == null ? null : new en(new jk(var3));
   }
}
