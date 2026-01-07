package osrs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.api.Nameable;
import net.runelite.api.NameableContainer;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
public abstract class hg<T extends Nameable> implements NameableContainer<T> {
   @ObfuscatedName("ad")
   private HashMap a;
   @ObfuscatedName("af")
   Comparator g = null;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1334426563
   )
   int h = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 272550841
   )
   final int i;
   @ObfuscatedName("ar")
   private HashMap b;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "[Lsi;"
   )
   private gU[] c;

   hg(int var1) {
      this.i = var1;
      this.c = this.a(var1);
      this.b = new HashMap(var1 / 8);
      this.a = new HashMap(var1 / 8);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)[Lsi;",
      garbageValue = "-308089342"
   )
   abstract gU[] a(int var1);

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)Lsi;",
      garbageValue = "1"
   )
   abstract gU a();

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      signature = "(Lsi;B)I",
      garbageValue = "-50"
   )
   private int c(gU var1) {
      for(int var2 = 0; var2 < this.h; ++var2) {
         if (this.c[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(Lxm;I)Z",
      garbageValue = "-133638623"
   )
   public final boolean b(jw var1) {
      if (!var1.a()) {
         return false;
      } else {
         return this.b.containsKey(var1) ? true : this.a.containsKey(var1);
      }
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(Lxm;Lxm;)V"
   )
   public void a(jw var1) {
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(Lxm;I)Lsi;",
      garbageValue = "695323366"
   )
   final gU c(jw var1) {
      return !var1.a() ? null : (gU)this.a.get(var1);
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(Lsi;Lxm;Lxm;I)V",
      garbageValue = "677507411"
   )
   final void a(gU var1, jw var2, jw var3) {
      a(this, var1, 2052121543);
      var1.a(var2, var3);
      this.d(var1);
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;I)V",
      garbageValue = "2087328952"
   )
   public final void a(Comparator var1) {
      if (this.g == null) {
         this.g = var1;
      } else {
         if (this.g instanceof gR) {
            ((gR)this.g).a(var1);
         }

      }
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "(Lxm;B)Z",
      garbageValue = "116"
   )
   public final boolean d(jw var1) {
      gU var2;
      if ((var2 = this.e(var1)) == null) {
         return false;
      } else {
         this.b(var2);
         return true;
      }
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2045087471"
   )
   public final boolean c() {
      return this.i == this.h;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(IB)Lsi;",
      garbageValue = "26"
   )
   public final gU b(int var1) {
      if (var1 >= 0 && var1 < this.h) {
         return this.c[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(Lxm;B)Lsi;"
   )
   private gU f(jw var1) {
      gU var2;
      return (var2 = this.a(var1, (jw)null)) != null ? var2 : this.c(var1);
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "1"
   )
   private void c(int var1) {
      --this.h;
      if (var1 < this.h) {
         System.arraycopy(this.c, var1 + 1, this.c, var1, this.h - var1);
      }

   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(Lxm;Lxm;B)Lsi;",
      garbageValue = "125"
   )
   final gU a(jw var1, jw var2) {
      if (this.e(var1) != null) {
         throw new IllegalStateException();
      } else {
         gU var3;
         (var3 = this.a()).a(var1, var2);
         this.e(var3);
         this.d(var3);
         this.a(var1);
         return var3;
      }
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "(Lsi;B)V",
      garbageValue = "118"
   )
   final void b(gU var1) {
      this.a(var1);
      int var2;
      if ((var2 = this.c(var1)) != -1) {
         this.c(var2);
         a(this, var1, 1883110426);
      }

   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "(Lsi;I)V",
      garbageValue = "-2028676701"
   )
   private void d(gU var1) {
      this.b.put(var1.c, var1);
      gU var2;
      if (var1.b != null && (var2 = (gU)this.a.put(var1.b, var1)) != null && var2 != var1) {
         var2.b = null;
         var2.d();
      }

   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "546766375"
   )
   public final void d() {
      this.h = 0;
      Arrays.fill(this.c, (Object)null);
      this.b.clear();
      this.a.clear();
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "(Lxm;I)Lsi;",
      garbageValue = "-1626983323"
   )
   final gU e(jw var1) {
      return !var1.a() ? null : (gU)this.b.get(var1);
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "(Lsi;B)V",
      garbageValue = "1"
   )
   private void e(gU var1) {
      this.c[++this.h - 1] = var1;
   }

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      signature = "(Lsi;)V"
   )
   public void a(gU var1) {
   }

   public int getCount() {
      return this.h;
   }

   public T findByName(String var1) {
      jw var2 = new jw(var1, gR.c);
      return this.e(var2);
   }

   public T[] getMembers() {
      gU[] var1 = this.c;
      int var2 = this.getCount();
      return (Nameable[])Arrays.copyOf(var1, var2);
   }

   public int getSize() {
      return this.i;
   }

   @ObfuscatedName("xq")
   @ObfuscatedSignature(
      signature = "(Lst;Lxm;B)Lsi;"
   )
   public static gU a(gN var0, jw var1, byte var2) {
      if (var0 == null) {
         var0.f(var1);
      }

      gU var3;
      return (var3 = var0.e(var1)) != null ? var3 : var0.c(var1);
   }

   @ObfuscatedName("lz")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1792940041"
   )
   static boolean a(int var0, int var1) {
      if (var1 >= 2000) {
         var1 -= 2000;
      }

      jA var4;
      hK var7;
      hK var2 = (var7 = (hK)(var4 = client.ag).c.get(var0)) != null ? var7 : var4.d;
      boolean var3 = var0 == -1;
      boolean var8 = var0 == client.aA;
      boolean var5;
      if (var1 == 1 || var1 == 2 || var1 >= 3 && var1 <= 6 || var1 == 1001) {
         var5 = true;
         if (!hK.a(var2.e, true, var3, var8)) {
            return false;
         }
      }

      if (var1 == 16 || var1 == 17 || var1 >= 18 && var1 <= 22) {
         var5 = true;
         if (!hK.a(var2.f, true, var3, var8)) {
            return false;
         }
      }

      if ((var1 == 7 || var1 == 8 || var1 >= 9 && var1 <= 13) && !hK.a(var2, true, var3, var8, (byte)11)) {
         return false;
      } else {
         if (var1 == 14 || var1 == 15 || var1 >= 44 && var1 <= 51) {
            var5 = true;
            if (!hK.a(var2.g, true, var3, var8)) {
               return false;
            }
         }

         if (var1 == 1002) {
            var5 = true;
            if (!hK.a(var2, var2.e, true, var3, var8)) {
               return false;
            }
         }

         if (var1 == 1004) {
            var5 = true;
            if (!hK.a(var2, var2.f, true, var3, var8)) {
               return false;
            }
         }

         return var1 != 1003 || hK.a(var2, true, var3, var8, 442464399);
      }
   }

   @ObfuscatedName("og")
   @ObfuscatedSignature(
      signature = "(Lst;Lsi;I)V"
   )
   private static void a(hg var0, gU var1, int var2) {
      if (var0.b.remove(var1.c) == null) {
         if (var2 > -150329039) {
            throw new IllegalStateException();
         }
      } else if (var1.b != null) {
         if (var2 <= -150329039) {
            return;
         }

         var0.a.remove(var1.b);
      }

   }

   @ObfuscatedName("sa")
   @ObfuscatedSignature(
      signature = "(Lst;I)V"
   )
   public static void a(hg var0, int var1) {
      if (var0 == null) {
         var0.g = null;
      }

      if (var0.g == null) {
         Arrays.sort(var0.c, 0, var0.h);
      } else {
         Arrays.sort(var0.c, 0, var0.h, var0.g);
      }
   }
}
