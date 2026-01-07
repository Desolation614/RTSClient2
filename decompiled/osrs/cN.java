package osrs;

import java.util.Iterator;
import net.runelite.api.Friend;
import net.runelite.api.Ignore;
import net.runelite.api.events.RemovedFriend;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public final class cN {
   @ObfuscatedName("py")
   static int[] a;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -127469585
   )
   int b = 0;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lsk;"
   )
   public final gW c;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lvf;"
   )
   final iw d;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lsb;"
   )
   public final gN e;

   @ObfuscatedSignature(
      signature = "(Lvf;)V"
   )
   cN(iw var1) {
      this.d = var1;
      this.e = new gN(var1);
      this.c = new gW(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1885040757"
   )
   final void a(String var1) {
      jw var2;
      if (var1 != null && (var2 = new jw(var1, this.d)).a()) {
         if (this.c.c() || this.c.h >= 100 && client.am != 1) {
            fh.a("Your ignore list is full. Max of 100 for free users, and 400 for members");
            return;
         }

         if (ai.a.aT.equals(var2)) {
            ah.b();
            return;
         }

         if (a(this, var2, 342185015)) {
            fh.a(var1 + " is already on your ignore list");
            return;
         }

         if (this.a(var2, false)) {
            fh.a("Please remove " + var1 + " from your friend list first");
            return;
         }

         dQ var4;
         (var4 = X.a(j.aq, client.P.f)).g.b(hd.a(var1));
         jk.a(var4.g, (String)var1, -1559098139);
         client.P.a(var4);
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(Lxm;ZI)Z",
      garbageValue = "-1457044852"
   )
   final boolean a(jw var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else {
         return var1.equals(ai.a.aT) ? true : this.e.a(var1, var2);
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "15"
   )
   final boolean a() {
      return this.b == 2;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1563531332"
   )
   final void b() {
      for(gQ var1 = (gQ)fM.a(this.e.a); var1 != null; var1 = (gQ)this.e.a.a()) {
         if ((long)var1.c < au.a() / 1000L - 5L) {
            if (var1.b > 0) {
               fu.a(5, "", String.valueOf(var1.a) + " has logged in.");
            }

            if (var1.b == 0) {
               fu.a(5, "", String.valueOf(var1.a) + " has logged out.");
            }

            var1.a();
         }
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "2125369599"
   )
   final void b(String var1) {
      jw var2;
      if (var1 != null && (var2 = new jw(var1, this.d)).a()) {
         int var3 = -837725278;
         if (this.e.c() || this.e.h >= 200 && client.am != 1) {
            fh.a("Your friend list is full. Max of 200 for free users, and 400 for members");
            return;
         }

         if (ai.a.aT.equals(var2)) {
            fh.a("You can't add yourself to your own friend list");
            return;
         }

         if (this.a(var2, false)) {
            G.a(var1);
            return;
         }

         if (a(this, var2, 342185015)) {
            fh.a("Please remove " + var1 + " from your ignore list first");
            return;
         }

         dQ var4;
         (var4 = X.a(j.ae, client.P.f)).g.b(hd.a(var1));
         jk.a(var4.g, (String)var1, -1559098139);
         client.P.a(var4);
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Lxm;I)Z",
      garbageValue = "1625854015"
   )
   final boolean a(jw var1) {
      hf var2;
      return (var2 = (hf)hg.a((gN)this.e, (jw)var1, (byte)2)) != null && var2.f > 0;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(Lxm;I)Z"
   )
   private boolean b(jw var1) {
      return var1 == null ? false : this.c.b(var1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZI)V",
      garbageValue = "1304379155"
   )
   public final void a(String var1, boolean var2) {
      Ignore var3;
      if ((var3 = (Ignore)this.c.findByName(var1)) != null) {
         dF.c.getCallbacks().post(new RemovedFriend(var3));
      }

      jw var6;
      if (var1 != null && (var6 = new jw(var1, this.d)).a()) {
         if (this.c.d(var6)) {
            client.ep = client.bU * 733503027;
            if (var2) {
               dQ var5;
               (var5 = X.a(j.ao, client.P.f)).g.b(hd.a(var1));
               jk.a(var5.g, (String)var1, -1559098139);
               client.P.a(var5);
            }
         }

         cL.b();
      }

   }

   @ObfuscatedName("pc")
   public final void c(String var1) {
      Friend var3;
      if ((var3 = (Friend)this.e.findByName(var1)) != null) {
         dF.c.getCallbacks().post(new RemovedFriend(var3));
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)Lgf;",
      garbageValue = "-886294915"
   )
   public static az a(int var0) {
      az var1;
      if ((var1 = (az)dX.a(az.b, (long)var0)) != null) {
         return var1;
      } else {
         byte[] var2 = fB.a(ke.a, 16, (int)var0);
         var1 = new az();
         if (var2 != null) {
            var1.a(new jk(var2));
         }

         az.b.a((im)var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      signature = "(Lbb;B)V"
   )
   public static void a(cN var0, byte var1) {
      if (var0 == null) {
         var0.b = 1;
      }

      var0.b = 1;
   }

   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      signature = "(Lbb;Lwt;II)V",
      garbageValue = "-882546654"
   )
   public static void a(cN var0, jo var1, int var2) {
      Iterator var18;
      kd var20;
      if (var0 == null) {
         int var21 = var2;
         gN.a(var0.e, var1, var2);
         var0.b = 2;
         var18 = client.ag.f.iterator();

         while(true) {
            if (!var18.hasNext()) {
               ga var23 = ki.b;
               gc var19 = new gc(var23);

               while(var19.hasNext()) {
                  ((dj)var19.next()).b();
               }

               if (aX.a != null) {
                  aX.a.b();
               }
               break;
            }

            if (var21 != -882546654) {
               break;
            }

            var20 = (kd)var18.next();

            for(var2 = 0; var2 < client.ax.f; ++var2) {
               gg var10000 = var20.e;
               long var16 = (long)client.ax.c[var2];
               gg var4 = var10000;
               in var5 = var10000.c[(int)(var16 & (long)(var4.b - 1))];
               var4.a = var5.aM;

               in var24;
               while(true) {
                  if (var5 == var4.a) {
                     var4.a = null;
                     var24 = null;
                     break;
                  }

                  if (var4.a.aO == var16) {
                     var5 = var4.a;
                     var4.a = var4.a.aM;
                     var24 = var5;
                     break;
                  }

                  var4.a = var4.a.aM;
               }

               jG var22;
               if ((var22 = (jG)var24) != null) {
                  if (var21 != -882546654) {
                     return;
                  }

                  var22.bg = hq.c;
               }
            }
         }

      } else {
         gN.a(var0.e, var1, var2);
         var0.b = 2;
         var18 = client.ag.iterator();

         while(var18.hasNext()) {
            var20 = (kd)var18.next();

            for(var2 = 0; var2 < client.ax.f; ++var2) {
               jG var3;
               if ((var3 = (jG)var20.e.a((long)client.ax.d[var2])) != null) {
                  var3.bg = hq.c;
               }
            }
         }

         for(var18 = ki.b.iterator(); var18.hasNext(); ((dj)var18.next()).g = hq.c) {
         }

         if (aX.a != null) {
            aX.a.b();
         }

      }
   }

   @ObfuscatedName("tz")
   @ObfuscatedSignature(
      signature = "(Lbb;Lxm;I)Z"
   )
   public static boolean a(cN var0, jw var1, int var2) {
      if (var0 == null) {
         var0.b(var1);
      }

      return var1 == null ? false : var0.c.b(var1);
   }
}
