package osrs;

import net.runelite.api.events.ProjectileMoved;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public final class fX {
   @ObfuscatedName("ap")
   public static final char[] a = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "366"
   )
   static final void a() {
      ++client.dA;
      aM.a.o.A = client.Z;
      if (ai.a.s >> 7 == client.eO && ai.a.n >> 7 == client.eM) {
         client.eO = 0;
      }

      jy.a(aM.a);
      kd var0 = aM.a;
      int var1 = iC.b();
      int var2;
      int var6;
      int var7;
      if (var0 == aM.a && var1 >= 0 && client.dT.k[var1] == 60) {
         var2 = client.dT.g[var1] << 7;
         cn var3 = hj.c;
         var1 = Math.max(384, 2000 - (client.bd << 1));
         int var4 = client.do - (int)(hB.a(var2) * (double)var1);
         int var5 = client.dn;
         double var8 = (double)cp.a(var2) / 65536.0D;
         var1 = var5 - (int)(var8 * (double)var1);
         var5 = var0.m;
         var6 = var4 >> 7;
         var7 = var1 >> 7;
         long var14 = cQ.a(var5, var6, var7, 5, false, -1, var0.k);
         var0.o.a(var0.m, var4, var1, client.dJ, 60, var3, var2, var14, false);
      }

      ay.a(aM.a);
      kd var36 = aM.a;
      if (client.dW >= 0 && var36.e.a((long)client.dW) != null) {
         cW.a(var36, client.dW, false);
      }

      hG var37;
      if ((var37 = (hG)(var0 = aM.a).l.b((long)client.aA)) != null) {
         bm.a(var0, var37, false);
      }

      cA.a(aM.a, eP.b);
      cA.a(aM.a, eP.c);
      cB.a(aM.a, true);
      kd var39 = aM.a;
      int var34 = client.ax.f;
      int[] var41 = client.ax.d;

      for(var1 = 0; var1 < var34; ++var1) {
         if (var41[var1] != client.dW && var41[var1] != client.au) {
            cW.a(var39, var41[var1], true);
         }
      }

      cB.a(aM.a, false);

      for(jQ var44 = (jQ)fU.e(client.aw); var44 != null; var44 = (jQ)fU.b(client.aw)) {
         if (client.Z > var44.s) {
            gk.a(var44);
         } else if (client.Z >= var44.u) {
            int var40 = client.cP;
            var2 = client.Z;
            jA var38 = client.ag;
            jQ var35 = var44;
            if (var2 >= var44.u) {
               ProjectileMoved var42;
               (var42 = new ProjectileMoved()).setProjectile(var44);
               var42.setPosition(var44.getTarget());
               var42.setZ(var44.i);
               dF.c.getCallbacks().post(var42);
            }

            if (var2 >= var44.u) {
               go var43;
               var6 = (int)(var43 = dO.a(var44.h, var44.b, var44.n, var44.d, var38)).g;
               var7 = (int)var43.h;
               int var46 = (int)var43.f - var44.i;
               go.a(var43, -2110726031);
               double var24;
               double var26;
               double var28;
               if (!var44.v) {
                  go var30;
                  int var31 = (int)(var30 = dO.a(var44.m, var44.k, var44.o, var44.q, var38)).g;
                  int var32 = (int)var30.h;
                  int var33 = (int)var30.f - var44.j;
                  go.a(var30, -1928833348);
                  var24 = (double)(var6 - var31);
                  var28 = Math.sqrt((var26 = (double)(var7 - var32)) * var26 + var24 * var24);
                  var44.l = Math.abs(var28) < 0.009999999776482582D ? (double)var31 : (double)var31 + (double)var44.g * var24 / var28;
                  var44.y = Math.abs(var28) < 0.009999999776482582D ? (double)var32 : (double)var32 + var26 * (double)var44.g / var28;
                  var44.w = (double)var33;
               }

               double var48 = (double)(var44.s + 1 - var2);
               double var49 = ((double)var6 - var44.l) / var48;
               var26 = Math.sqrt((var24 = ((double)var7 - var44.y) / var48) * var24 + var49 * var49);
               if (!var44.v) {
                  var44.p = -var26 * Math.tan(0.02454369D * (double)var44.e);
               }

               var28 = 2.0D * ((double)var46 - var44.w - var44.p * var48) / (var48 * var48);
               var44.v = true;
               var44.l += (double)var40 * var49;
               var44.y += (double)var40 * var24;
               var44.w += (double)var40 * var44.p + var28 * 0.5D * (double)var40 * (double)var40;
               var44.p += var28 * (double)var40;
               var44.t = (int)(Math.atan2(var49, var24) * 325.949D) + 1024 & 2047;
               var44.f = (int)(Math.atan2(var44.p, var26) * 325.949D) & 2047;
               if (var44.x != null) {
                  if (!var44.x.b()) {
                     var44.r += var40;

                     label113:
                     while(true) {
                        do {
                           do {
                              if (var35.r <= var35.x.i[var35.c]) {
                                 break label113;
                              }

                              var35.r -= var35.x.i[var35.c];
                              ++var35.c;
                           } while(var35.c < var35.x.p.length);

                           var35.c -= var35.x.k;
                        } while(var35.c >= 0 && var35.c < var35.x.p.length);

                        var35.c = 0;
                     }
                  } else {
                     var44.c += var40;
                     var1 = var44.x.a();
                     if (var44.c >= var1) {
                        var44.c = var1 - var44.x.k;
                     }
                  }
               }
            }

            aM.a.o.a(var44.q, (int)var44.l, (int)var44.y, (int)var44.w, 60, var44, var44.t, -1L, false);
         }
      }

      kd var45;
      for(fY var47 = (fY)fU.e((var45 = aM.a).r); var47 != null; var47 = (fY)fU.b(var45.r)) {
         if (var45.m == var47.f && !var47.a) {
            if (client.Z < var47.d) {
               continue;
            }

            var1 = client.cP;
            var47.a(var1);
            if (!var47.a) {
               var45.o.a(var47.f, var47.c, var47.e, var47.b, 60, var47, 0, -1L, false);
               continue;
            }
         }

         gk.a(var47);
      }

      cA.a(aM.a, eP.a);
   }
}
