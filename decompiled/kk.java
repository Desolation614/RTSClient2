package osrs;

import net.runelite.api.TileItem;
import net.runelite.api.events.ItemQuantityChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public final class kk extends ct implements TileItem {
   @ObfuscatedName("ru")
   @ObfuscatedSignature(
      signature = "Ldr;"
   )
   public static kk a;
   @ObfuscatedName("aa")
   boolean b;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -2055362143
   )
   int c = 31;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "Lgi;"
   )
   aC d;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -783328143
   )
   int e;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 2130412817
   )
   int f;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -766714879
   )
   int g;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 2128121917
   )
   int h;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 644585335
   )
   int i;
   @ObfuscatedName("ic")
   public int j;
   @ObfuscatedName("jw")
   public int k = -1;
   @ObfuscatedName("sq")
   public int l = -1;

   kk() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)Ljm;",
      garbageValue = "27"
   )
   protected final cn k() {
      bC var1 = cE.a(this.h);
      return this.d == null ? var1.a(this.e) : bC.a(var1, this.d, -1800854452);
   }

   @ObfuscatedName("ge")
   private kB a() {
      int var1 = this.k;
      int var2 = this.l;
      kd var3 = kd.b(this.j);
      return var1 != -1 && var2 != -1 && var3 != null ? var3.o.ae[var3.getPlane()][var1][var2] : null;
   }

   @ObfuscatedName("nv")
   public final void m() {
      if (this.k != -1 && a == null) {
         a = this;
      }

   }

   public final int getId() {
      return this.h;
   }

   public final int getQuantity() {
      return this.e;
   }

   public final int getVisibleTime() {
      return this.g - client.bA + client.z;
   }

   public final int getDespawnTime() {
      return this.f - client.bA + client.z;
   }

   public final int getOwnership() {
      return this.i;
   }

   public final boolean isPrivate() {
      return this.b;
   }

   @ObfuscatedName("tx")
   public final void a(int var1) {
      if (this.k != -1) {
         client.cV.debug("Item quantity changed: {} ({} -> {})", new Object[]{this.getId(), this.getQuantity(), var1});
         ItemQuantityChanged var2 = new ItemQuantityChanged(this, this.a(), this.getQuantity(), var1);
         dF.c.getCallbacks().post(var2);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "([BI)[I",
      garbageValue = "-96111231"
   )
   public static int[] a(byte[] var0) {
      if (var0 != null && var0.length != 0 && var0.length <= 8) {
         int[] var1 = new int[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            if (var0[var2] < 0 || var0[var2] >= jr.a.length) {
               return null;
            }

            var1[var2] = jr.a[var0[var2]];
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)Lho;",
      garbageValue = "-2145851402"
   )
   public static bk b(int var0) {
      bk var1;
      if ((var1 = (bk)dX.a(bk.a, (long)var0)) != null) {
         return var1;
      } else if (aP.a == null) {
         return null;
      } else {
         byte[] var2 = fB.a(aP.a, 3, (int)var0);
         var1 = new bk();
         if (var2 != null) {
            bk.a(var1, new jk(var2), (byte)28);
         }

         bk.a.a((im)var1, (long)var0);
         return var1;
      }
   }
}
