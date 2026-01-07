package osrs;

import java.awt.Polygon;
import java.awt.Shape;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.NpcOverrides;
import net.runelite.api.Perspective;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public final class kc extends jE implements NPC {
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 880008649
   )
   static int aC = 1;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1459075309
   )
   static int aD = 1;
   @ObfuscatedName("aa")
   String aE = "";
   @ObfuscatedName("ac")
   boolean aF = false;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "Lht;"
   )
   br aG;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "Lwj;"
   )
   ja aP;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lhd;"
   )
   aY aQ;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 2030963523
   )
   int aR = 31;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "Lht;"
   )
   br aS;

   kc(int var1) {
      super(var1);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(IISI)V",
      garbageValue = "-2040815781"
   )
   final void a(int var1, int var2, short var3) {
      if (this.aP == null) {
         this.aP = new ja(this.aQ);
      }

      ja var10000 = this.aP;
      short var4 = var3;
      int var10 = var2;
      var2 = var1;
      ja var9 = var10000;
      if (var10000 == null) {
         var9.b[var2] = var2;
         var9.a[var2] = var4;
      }

      var9.b[var2] = var10;
      var9.a[var2] = var4;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(IIZB)V",
      garbageValue = "-15"
   )
   final void a(int var1, int var2, boolean var3) {
      if (super.ab != -1 && osrs.az.a(super.ab).x * 428391817 == 1) {
         label33: {
            super.ab = -1;
            if (this instanceof kc) {
               switch(this.getId()) {
               case 8615:
               case 8616:
               case 8617:
               case 8618:
               case 8619:
               case 8620:
               case 8621:
               case 8622:
                  break label33;
               }
            }

            if (jE.a) {
               super.aA = (byte)(super.aA | 2);
            } else {
               AnimationChanged var4;
               (var4 = new AnimationChanged()).setActor(this);
               dF.c.getCallbacks().post(var4);
            }
         }
      }

      if (!var3) {
         int var5 = var1 - super.aa[0];
         int var6 = var2 - super.az[0];
         if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
            jE.a(this, var1, var2, cX.c);
            return;
         }
      }

      this.a(var1, var2);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)Ljm;",
      garbageValue = "27"
   )
   protected final cn k() {
      if (client.D != null && client.D.test(super.ab != -1 ? super.ab : super.V)) {
         int var1 = this.getAnimationFrame();
         int var2 = this.getPoseAnimationFrame();
         boolean var3 = false;
         boolean var9 = false;

         cn var4;
         Iterator var5;
         hs var6;
         int var7;
         try {
            var9 = true;
            var3 = true;
            this.setAnimationFrame(Integer.MIN_VALUE | Math.max(super.ae - 1, 0) << 16 | var1);
            this.setPoseAnimationFrame(-1073741824 | Math.max(super.M - 1, 0) << 16 | var2);
            var5 = super.ar.iterator();

            while(var5.hasNext()) {
               if ((var7 = (var6 = (hs)var5.next()).getFrame()) != -1) {
                  var6.setFrame(Integer.MIN_VALUE | Math.max(var6.getCycle() - 1, 0) << 16 | var7);
               }
            }

            var4 = this.y();
            var3 = false;
            var9 = false;
         } finally {
            if (var9) {
               if (var3) {
                  this.setAnimationFrame(var1);
                  this.setPoseAnimationFrame(var2);
                  Iterator var11 = super.ar.iterator();

                  while(true) {
                     while(!var11.hasNext()) {
                     }

                     hs var12;
                     int var13;
                     if ((var13 = (var12 = (hs)var11.next()).getFrame()) != -1) {
                        var12.setFrame(var13 & '\uffff');
                     }
                  }
               }

            }
         }

         this.setAnimationFrame(var1);
         this.setPoseAnimationFrame(var2);
         var5 = super.ar.iterator();

         while(var5.hasNext()) {
            if ((var7 = (var6 = (hs)var5.next()).getFrame()) != -1) {
               var6.setFrame(var7 & '\uffff');
            }
         }

         return var4;
      } else {
         return this.y();
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "37"
   )
   final boolean b(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.aR & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("am")
   private String x() {
      if (!this.aE.isEmpty()) {
         return this.aE;
      } else {
         aY var1;
         if ((var1 = this.aQ).B != null && (var1 = var1.a()) == null) {
            var1 = this.aQ;
         }

         return var1.m;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-81"
   )
   final boolean q() {
      return this.aQ != null;
   }

   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "22549"
   )
   final int t() {
      return this.aQ.X == -1 ? super.at : this.aQ.X;
   }

   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      signature = "()Ljm;"
   )
   private cn y() {
      cn var1;
      if (this.aQ == null) {
         var1 = null;
      } else {
         bP var3 = super.ab != -1 && super.au == 0 ? osrs.az.a(super.ab) : null;
         bP var2 = super.V != -1 && (super.K != super.V || var3 == null) ? osrs.az.a(super.V) : null;
         if (this.aG != null && this.aG.d) {
            var1 = eY.a(osrs.ai.a.aV, var3, super.ak, var2, super.B);
         } else {
            var1 = this.aQ.a(var3, super.ak, var2, super.B, this.aG);
         }

         if (var1 == null) {
            var1 = null;
         } else {
            var1.a();
            super.at = var1.aI;
            int var4 = var1.E;
            var1 = this.a(var1);
            if (this.aQ.k == 1) {
               var1.ab = true;
            }

            if (super.w.a() && client.Z >= super.f && client.Z < super.v) {
               var1.a(super.w, (short)var4);
            } else {
               var1.G = null;
            }

            var1 = var1;
         }
      }

      return var1;
   }

   @ObfuscatedName("ft")
   @ObfuscatedSignature(
      signature = "()Lhd;"
   )
   private aY z() {
      aY var1;
      if ((var1 = this.aQ) != null && var1.getConfigs() != null) {
         var1 = var1.a();
      }

      return var1;
   }

   @ObfuscatedName("nq")
   @ObfuscatedSignature(
      signature = "(Lhd;)V"
   )
   public final void a(aY var1) {
      if (var1 == null) {
         dF.c.getCallbacks().post(new NpcDespawned(this));
      } else {
         aY var2;
         if ((var2 = this.aQ) == null) {
            client.I.add(new NpcSpawned(this));
         } else {
            if (var1.getId() != var2.getId()) {
               client.eb.add(new NpcChanged(this, var2));
            }

         }
      }
   }

   public final int getId() {
      aY var1;
      if ((var1 = this.aQ) != null && var1.getConfigs() != null) {
         var1 = var1.a();
      }

      return var1 == null ? -1 : var1.getId();
   }

   public final int getIndex() {
      return super.y;
   }

   public final int[] getOverheadArchiveIds() {
      if (this.aP != null) {
         return (int[])this.aP.b.clone();
      } else {
         aY var1;
         return (var1 = this.z()) != null && var1.I != null ? (int[])var1.I.clone() : null;
      }
   }

   @Nullable
   public final NpcOverrides getModelOverrides() {
      return this.aG;
   }

   public final int getCombatLevel() {
      if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (super.af != -1) {
         return super.af;
      } else {
         aY var1;
         if ((var1 = this.aQ) != null && var1.getConfigs() != null) {
            var1 = var1.a();
         }

         return var1 == null ? -1 : var1.getCombatLevel();
      }
   }

   public final NPCComposition getTransformedComposition() {
      return this.z();
   }

   public final Polygon getCanvasTilePoly() {
      aY var1;
      if ((var1 = this.z()) == null) {
         return null;
      } else {
         int var2 = var1.getSize();
         return Perspective.getCanvasTileAreaPoly(dF.c, this.getLocalLocation(), var2);
      }
   }

   public final String getName() {
      if (this.aQ == null) {
         return null;
      } else if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return a(this, 280623754).replace(' ', ' ');
      }
   }

   public final Shape getConvexHull() {
      cn var1;
      if ((var1 = this.j()) == null) {
         return null;
      } else {
         int var2 = Perspective.getFootprintTileHeight(dF.c, this.getLocalLocation(), this.a().m, this.aQ.getFootprintSize());
         return var1.a(super.s, super.n, this.getCurrentOrientation(), var2);
      }
   }

   @Nullable
   public final NpcOverrides getChatheadOverrides() {
      return this.aS;
   }

   public final short[] getOverheadSpriteIds() {
      if (this.aP != null) {
         return (short[])this.aP.a.clone();
      } else {
         aY var1;
         return (var1 = this.z()) != null && var1.F != null ? (short[])var1.F.clone() : null;
      }
   }

   public final NPCComposition getComposition() {
      return this.aQ;
   }

   @ObfuscatedName("zy")
   @ObfuscatedSignature(
      signature = "(Ldk;I)Ljava/lang/String;"
   )
   public static String a(kc var0, int var1) {
      if (var0 == null) {
         return var0.x();
      } else if (!var0.aE.isEmpty()) {
         return var0.aE;
      } else {
         aY var2;
         if ((var2 = var0.aQ).B != null && (var2 = var2.a()) == null) {
            var2 = var0.aQ;
         }

         return var2.m;
      }
   }

   @ObfuscatedName("yr")
   @ObfuscatedSignature(
      signature = "(Ldk;ILkt;I)V",
      garbageValue = "443022046"
   )
   public static void a(kc var0, int var1, cX var2) {
      int var4;
      AnimationChanged var6;
      if (var0 == null) {
         var4 = var0.i[0];
         int var5 = var0.p[0];
         if (var1 == 0) {
            --var4;
            ++var5;
         }

         if (var1 == 1) {
            ++var5;
         }

         if (var1 == 2) {
            ++var4;
            ++var5;
         }

         if (var1 == 3) {
            --var4;
         }

         if (var1 == 4) {
            if (var1 >= 1655989768) {
               return;
            }

            ++var4;
         }

         if (var1 == 5) {
            --var4;
            --var5;
         }

         if (var1 == 6) {
            --var5;
         }

         if (var1 == 7) {
            if (var1 >= 1655989768) {
               return;
            }

            ++var4;
            --var5;
         }

         if (var0.av * 1356544769 != -1 && osrs.az.a(var0.r).o * 428391817 == 1) {
            label130: {
               var0.L = 1088184115;
               if (var0 instanceof kc) {
                  switch(var0.getIndex()) {
                  case 8615:
                  case 8616:
                  case 8617:
                  case 8618:
                  case 8619:
                  case 8620:
                  case 8621:
                  case 8622:
                     break label130;
                  }
               }

               if (jE.a) {
                  var0.aA = (byte)(var0.aA | 2);
               } else {
                  (var6 = new AnimationChanged()).setActor(var0);
                  dF.c.getCallbacks().post(var6);
               }
            }
         }

         jE.a(var0, var4, var5, var2);
      } else {
         int var3 = var0.aa[0];
         var4 = var0.az[0];
         if (var1 == 0) {
            --var3;
            ++var4;
         }

         if (var1 == 1) {
            ++var4;
         }

         if (var1 == 2) {
            ++var3;
            ++var4;
         }

         if (var1 == 3) {
            --var3;
         }

         if (var1 == 4) {
            ++var3;
         }

         if (var1 == 5) {
            --var3;
            --var4;
         }

         if (var1 == 6) {
            --var4;
         }

         if (var1 == 7) {
            ++var3;
            --var4;
         }

         if (var0.ab != -1 && osrs.az.a(var0.ab).x * 428391817 == 1) {
            label108: {
               var0.ab = -1;
               if (var0 instanceof kc) {
                  switch(var0.getId()) {
                  case 8615:
                  case 8616:
                  case 8617:
                  case 8618:
                  case 8619:
                  case 8620:
                  case 8621:
                  case 8622:
                     break label108;
                  }
               }

               if (jE.a) {
                  var0.aA = (byte)(var0.aA | 2);
               } else {
                  (var6 = new AnimationChanged()).setActor(var0);
                  dF.c.getCallbacks().post(var6);
               }
            }
         }

         jE.a(var0, var3, var4, var2);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   public static void w() {
      bg.a.b();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ldk;I)[S"
   )
   public static short[] b(kc var0, int var1) {
      if (var0 == null) {
         return var0.aP != null ? var0.aP.a : var0.aQ.F;
      } else {
         return var0.aP != null ? var0.aP.a : var0.aQ.F;
      }
   }

   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      signature = "(Ldk;I)[I"
   )
   public static int[] c(kc var0, int var1) {
      if (var0 == null) {
         return var0.aP != null ? ja.a(var0.aP, (byte)47) : var0.aQ.I;
      } else {
         return var0.aP != null ? ja.a(var0.aP, (byte)47) : var0.aQ.I;
      }
   }

   @ObfuscatedName("lf")
   @ObfuscatedSignature(
      signature = "(Ldk;B)Lht;"
   )
   public static br a(kc var0, byte var1) {
      if (var0 == null) {
         br var10000 = var0.aS;
      }

      return var0.aS;
   }
}
