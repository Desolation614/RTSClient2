package osrs;

import net.runelite.api.Deque;
import net.runelite.api.Friend;
import net.runelite.api.FriendContainer;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
public final class gN extends hg<Friend> implements FriendContainer {
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lqc;"
   )
   public fM a = new fM();
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -730326121
   )
   private int b = 1;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lvf;"
   )
   private iw c;

   @ObfuscatedSignature(
      signature = "(Lvf;)V"
   )
   public gN(iw var1) {
      super(400);
      this.c = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)[Lsi;",
      garbageValue = "-308089342"
   )
   final gU[] a(int var1) {
      return new hf[var1];
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lxm;ZI)Z",
      garbageValue = "-1856088668"
   )
   public final boolean a(jw var1, boolean var2) {
      hf var3;
      if ((var3 = (hf)hg.a(this, var1, (byte)-11)) == null) {
         return false;
      } else {
         return !var2 || var3.f != 0;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)Lsi;",
      garbageValue = "1"
   )
   final gU a() {
      return new hf();
   }

   public final Deque getPendingLogins() {
      return this.a;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "110"
   )
   static int a(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 255;
      int var4 = var0 >> 8 & 255;
      var0 &= 255;
      int var5 = var1 >> 16 & 255;
      int var6 = var1 >> 8 & 255;
      var1 &= 255;
      var3 = var3 + (var5 - var3 + 1) * var2 / 64 & 255;
      var4 = var4 + (var6 - var4 + 1) * var2 / 64 & 255;
      var0 = var0 + (var1 - var0 + 1) * var2 / 64 & 255;
      return var3 << 16 | var4 << 8 | var0;
   }

   @ObfuscatedName("te")
   @ObfuscatedSignature(
      signature = "(Lsb;Lwt;II)V",
      garbageValue = "-1327791768"
   )
   public static void a(gN var0, jk var1, int var2) {
      int var6;
      if (var0 == null) {
         var6 = var2;
         int var5 = var2;
         jk var4 = var1;
         gN var3 = var0;

         while(true) {
            if (var4.c >= var5) {
               hg.a(var3, 1282251053);
               break;
            }

            boolean var7 = jk.a(var4, (byte)-38) == 1;
            jw var8 = new jw(var4.k(), var3.c);
            jw var9 = new jw(var4.p(), var3.c);
            int var10 = var4.h();
            int var11 = jk.a(var4, (byte)-5);
            int var12;
            boolean var13;
            if (((var12 = jk.a((jk)var4, (byte)24)) & 2) != 0) {
               if (var6 >= 1554209507) {
                  break;
               }

               var13 = true;
            } else {
               var13 = false;
            }

            boolean var29 = (var12 & 1) != 0;
            if (var10 > 0) {
               var4.k();
               jk.a((jk)var4, (byte)22);
               jk.d(var4, 1687107415);
            }

            var4.p();
            if (!var8.a()) {
               throw new IllegalStateException();
            }

            hf var14 = (hf)var3.c(var8);
            hf var22;
            if (var7 && (var22 = (hf)var3.c(var9)) != null && var14 != var22) {
               if (var14 != null) {
                  var3.b((gU)var22);
               } else {
                  var14 = var22;
               }
            }

            if (var14 != null) {
               var3.a(var14, var8, var9);
               if (var14.e * -259358451 != var10) {
                  var7 = true;

                  hT var10000;
                  fM var30;
                  for(gQ var26 = (gQ)fM.a(var3.a); var26 != null; var26 = (gQ)var10000) {
                     jw var15 = var26.a;
                     jw var16 = (jw)var8;
                     if (var15.a == null ? var16.a == null : (var16.a == null ? false : (var15.hashCode() != var16.hashCode() ? false : var15.a.equals(var16.a)))) {
                        label267: {
                           if (var10 != 0 && var26.b == 0) {
                              var26.a();
                           } else {
                              if (var10 != 0 || var26.b == 0) {
                                 break label267;
                              }

                              if (var26.d != null) {
                                 var26.d.e = var26.e;
                                 var26.e.d = var26.d;
                                 var26.e = null;
                                 var26.d = null;
                              }
                           }

                           var7 = false;
                        }
                     }

                     hT var31;
                     if ((var31 = (var30 = var3.a).b.e) == var30.b) {
                        var30.a = null;
                        var10000 = null;
                     } else {
                        var30.a = var31.e;
                        var10000 = var31;
                     }
                  }

                  if (var7) {
                     fM var33 = var3.a;
                     gQ var32 = new gQ(var8, var10);
                     var30 = var33;
                     if (var32.d != null) {
                        var32.a();
                     }

                     var32.d = var30.b.d;
                     var32.e = var30.b;
                     var32.d.e = var32;
                     var32.e.d = var32;
                  }
               }
            } else {
               if (var3.h >= 400) {
                  continue;
               }

               if (var6 >= 1554209507) {
                  break;
               }

               var14 = (hf)var3.a(var8, var9);
            }

            if (var10 != var14.d * 427063561) {
               var14.d = ++var3.b * -1362928411 - -1362928411;
               if (var14.d * 427063561 == -1 && var10 == 0) {
                  if (var6 >= 1554209507) {
                     break;
                  }

                  var14.d = -(var14.d * 633256399) * -727339729;
               }

               var14.e = var10 * -1329646139;
            }

            var14.f = var11 * 427063561;
            var14.h = var13;
            var14.g = var29;
         }
      }

      while(true) {
         int var23;
         boolean var25;
         boolean var27;
         hf var28;
         while(true) {
            if (var1.c >= var2) {
               hg.a(var0, 1282251053);
               return;
            }

            boolean var17 = jk.a(var1, (byte)-38) == 1;
            jw var19 = new jw(var1.p(), var0.c);
            jw var20 = new jw(var1.p(), var0.c);
            var6 = var1.d();
            var23 = jk.a(var1, (byte)-5);
            int var24;
            var27 = ((var24 = jk.a((jk)var1, (byte)24)) & 2) != 0;
            var25 = (var24 & 1) != 0;
            if (var6 > 0) {
               var1.p();
               jk.a((jk)var1, (byte)22);
               jk.d(var1, 1687107415);
            }

            var1.p();
            if (!var19.a()) {
               throw new IllegalStateException();
            }

            var28 = (hf)var0.e(var19);
            hf var18;
            if (var17 && (var18 = (hf)var0.e(var20)) != null && var28 != var18) {
               if (var28 != null) {
                  var0.b((gU)var18);
               } else {
                  var28 = var18;
               }
            }

            if (var28 == null) {
               if (var0.h >= 400) {
                  continue;
               }

               var28 = (hf)var0.a(var19, var20);
               break;
            }

            var0.a(var28, var19, var20);
            if (var6 == var28.f) {
               break;
            }

            var17 = true;

            for(gQ var21 = (gQ)fM.a(var0.a); var21 != null; var21 = (gQ)var0.a.a()) {
               if (var21.a.equals(var19)) {
                  if (var6 != 0 && var21.b == 0) {
                     var21.a();
                     var17 = false;
                  } else if (var6 == 0 && var21.b != 0) {
                     var21.a();
                     var17 = false;
                  }
               }
            }

            if (var17) {
               var0.a.a(new gQ(var19, var6));
            }
            break;
         }

         if (var6 != var28.f) {
            var28.e = ++var0.b - 1;
            if (var28.f == -1 && var6 == 0) {
               var28.e = -(var28.e * -1995466197) * -1974840189;
            }

            var28.f = var6;
         }

         var28.d = var23;
         var28.h = var27;
         var28.g = var25;
      }
   }
}
