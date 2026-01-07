package osrs;

import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public final class eB {
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "(ILcr;ZI)I",
      garbageValue = "1720990204"
   )
   static int a(int var0) {
      if (var0 == 3200) {
         hE.e -= 3;
         aU.a(hE.c[hE.e], hE.c[hE.e + 1], hE.c[hE.e + 2]);
         return 1;
      } else {
         int var2;
         int var3;
         int var4;
         int var9;
         if (var0 == 3201) {
            hE.e -= 5;
            var0 = hE.c[hE.e];
            var9 = hE.c[hE.e + 1];
            var2 = hE.c[hE.e + 2];
            var3 = hE.c[hE.e + 3];
            var4 = hE.c[hE.e + 4];
            ArrayList var12;
            (var12 = new ArrayList()).add(var0);
            bq.a(var12, var9, var2, var3, var4);
            return 1;
         } else if (var0 == 3202) {
            hE.e -= 2;
            int var10000 = hE.c[hE.e];
            int var10001 = hE.c[hE.e + 1];
            ab.a(var10000);
            return 1;
         } else {
            iO var1;
            ji var5;
            String var7;
            if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
               if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
                  if (var0 == 3211) {
                     return 1;
                  } else if (var0 == 3216) {
                     var0 = hE.c[--hE.e];
                     var9 = 0;
                     if ((var5 = (ji)aU.a(dj.c(), var0)) != null) {
                        var9 = var5 != ji.g ? 1 : 0;
                     }

                     hE.c[++hE.e - 1] = var9;
                     return 1;
                  } else if (var0 == 3218) {
                     var0 = hE.c[--hE.e];
                     var9 = 0;
                     iO var11;
                     if ((var11 = (iO)aU.a(aq.b(), var0)) != null) {
                        var9 = var11 != iO.e ? 1 : 0;
                     }

                     hE.c[++hE.e - 1] = var9;
                     return 1;
                  } else if (var0 != 3217 && var0 != 3219) {
                     if (var0 == 3220) {
                        hE.e -= 2;
                        var0 = hE.c[hE.e];
                        var9 = hE.c[hE.e + 1];
                        ac.a(var0, var9);
                        return 1;
                     } else if (var0 == 3221) {
                        hE.e -= 6;
                        var0 = hE.c[hE.e];
                        var9 = hE.c[hE.e + 1];
                        var2 = hE.c[hE.e + 2];
                        var3 = hE.c[hE.e + 3];
                        var4 = hE.c[hE.e + 4];
                        int var10 = hE.c[hE.e + 5];
                        ArrayList var8;
                        (var8 = new ArrayList()).add(var0);
                        var8.add(var9);
                        bq.a(var8, var2, var3, var4, var10);
                        return 1;
                     } else if (var0 == 3222) {
                        hE.e -= 4;
                        var0 = hE.c[hE.e];
                        var9 = hE.c[hE.e + 1];
                        var2 = hE.c[hE.e + 2];
                        var3 = hE.c[hE.e + 3];
                        ce.a(var0, var9, var2, var3);
                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     var5 = ji.g;
                     var1 = iO.e;
                     if (var0 == 3217) {
                        var4 = hE.c[--hE.e];
                        if ((var5 = (ji)aU.a(dj.c(), var4)) == null) {
                           throw new RuntimeException(String.format("Unrecognized device option %d", var4));
                        }
                     }

                     if (var0 == 3219) {
                        var4 = hE.c[--hE.e];
                        if ((var1 = (iO)aU.a(aq.b(), var4)) == null) {
                           throw new RuntimeException(String.format("Unrecognized game option %d", var4));
                        }
                     }

                     String var6;
                     if (var1 == iO.e) {
                        switch(var5.h) {
                        case 1:
                        case 2:
                        case 3:
                           var3 = 1;
                           break;
                        case 4:
                           var3 = Integer.MAX_VALUE;
                           break;
                        case 5:
                           var3 = 100;
                           break;
                        default:
                           var6 = String.format("Unkown device option: %s.", var5);
                           throw new RuntimeException(var6);
                        }
                     } else {
                        switch(var1.f) {
                        case 1:
                           var3 = 1;
                           break;
                        case 2:
                        case 3:
                        case 4:
                           var3 = 100;
                           break;
                        default:
                           var6 = String.format("Unkown game option: %s.", var1);
                           throw new RuntimeException(var6);
                        }
                     }

                     hE.c[++hE.e - 1] = 0;
                     hE.c[++hE.e - 1] = var3;
                     return 1;
                  }
               } else {
                  var5 = ji.g;
                  var1 = iO.e;
                  if (var0 == 3214) {
                     var3 = hE.c[--hE.e];
                     if ((var5 = (ji)aU.a(dj.c(), var3)) == null) {
                        throw new RuntimeException(String.format("Unrecognized device option %d", var3));
                     }
                  }

                  if (var0 == 3215) {
                     var3 = hE.c[--hE.e];
                     if ((var1 = (iO)aU.a(aq.b(), var3)) == null) {
                        throw new RuntimeException(String.format("Unrecognized game option %d", var3));
                     }
                  }

                  if (var0 == 3210) {
                     var3 = hE.c[--hE.e];
                     if ((var5 = (ji)aU.a(dj.c(), var3)) == null && (var1 = (iO)aU.a(aq.b(), var3)) == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var3));
                     }
                  } else if (var0 == 3182) {
                     var5 = ji.b;
                  } else if (var0 == 3204) {
                     var1 = iO.d;
                  } else if (var0 == 3206) {
                     var1 = iO.a;
                  } else if (var0 == 3208) {
                     var1 = iO.c;
                  }

                  if (var1 == iO.e) {
                     switch(var5.h) {
                     case 1:
                        var2 = jD.d(j.aS, (byte)77) ? 1 : 0;
                        break;
                     case 2:
                        var2 = jD.b(j.aS, (byte)10) ? 1 : 0;
                        break;
                     case 3:
                        var2 = jD.a(j.aS, 1934856266) ? 1 : 0;
                        break;
                     case 4:
                        var2 = j.aS.i;
                        break;
                     case 5:
                        var2 = bG.e();
                        break;
                     case 6:
                        var2 = j.aS.d ? 1 : 0;
                        break;
                     default:
                        var7 = String.format("Unkown device option: %s.", var5);
                        throw new RuntimeException(var7);
                     }
                  } else {
                     switch(var1.f) {
                     case 1:
                        var2 = j.aS.m ? 1 : 0;
                        break;
                     case 2:
                        var2 = Math.round((float)(j.aS.n * 100) / 255.0F);
                        break;
                     case 3:
                        var2 = Math.round((float)(j.aS.f * 100) / 127.0F);
                        break;
                     case 4:
                        var2 = Math.round((float)(j.aS.h * 100) / 127.0F);
                        break;
                     default:
                        var7 = String.format("Unkown game option: %s.", var1);
                        throw new RuntimeException(var7);
                     }
                  }

                  hE.c[++hE.e - 1] = var2;
                  return 1;
               }
            } else {
               var5 = ji.g;
               var1 = iO.e;
               var2 = hE.c[--hE.e];
               if (var0 == 3212) {
                  var3 = hE.c[--hE.e];
                  if ((var5 = (ji)aU.a(dj.c(), var3)) == null) {
                     throw new RuntimeException(String.format("Unrecognized device option %d", var3));
                  }
               }

               if (var0 == 3213) {
                  var3 = hE.c[--hE.e];
                  if ((var1 = (iO)aU.a(aq.b(), var3)) == null) {
                     throw new RuntimeException(String.format("Unrecognized game option %d", var3));
                  }
               }

               if (var0 == 3209) {
                  var3 = hE.c[--hE.e];
                  if ((var5 = (ji)aU.a(dj.c(), var3)) == null && (var1 = (iO)aU.a(aq.b(), var3)) == null) {
                     throw new RuntimeException(String.format("Unrecognized client option %d", var3));
                  }
               } else if (var0 == 3181) {
                  var5 = ji.b;
               } else if (var0 == 3203) {
                  var1 = iO.d;
               } else if (var0 == 3205) {
                  var1 = iO.a;
               } else if (var0 == 3207) {
                  var1 = iO.c;
               }

               if (var1 == iO.e) {
                  switch(var5.h) {
                  case 1:
                     j.aS.a(var2 == 1);
                     break;
                  case 2:
                     j.aS.c(var2 == 1);
                     break;
                  case 3:
                     jD.a(j.aS, var2 == 1, (byte)37);
                     break;
                  case 4:
                     if (var2 < 0) {
                        var2 = 0;
                     }

                     j.aS.i = var2;
                     ki.a();
                     break;
                  case 5:
                     ed.a(var2);
                     break;
                  case 6:
                     j.aS.d(var2 == 1);
                     break;
                  default:
                     var7 = String.format("Unkown device option: %s.", var5);
                     throw new RuntimeException(var7);
                  }
               } else {
                  switch(var1.f) {
                  case 1:
                     j.aS.b(var2 == 1);
                     break;
                  case 2:
                     id.a(Math.round((float)(Math.min(Math.max(var2, 0), 100) * 255) / 100.0F));
                     break;
                  case 3:
                     dp.a(Math.round((float)(Math.min(Math.max(var2, 0), 100) * 127) / 100.0F));
                     break;
                  case 4:
                     gJ.a(Math.round((float)(Math.min(Math.max(var2, 0), 100) * 127) / 100.0F));
                     break;
                  default:
                     var7 = String.format("Unkown game option: %s.", var1);
                     throw new RuntimeException(var7);
                  }
               }

               return 1;
            }
         }
      }
   }
}
