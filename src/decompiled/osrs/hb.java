package osrs;

import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
public final class hb {
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1559954835
   )
   private int a;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lsc;"
   )
   private gP b;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lrq;"
   )
   private gB c;
   @ObfuscatedName("aj")
   private Map d;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      longValue = 2567931209999575089L
   )
   private long e;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lrq;"
   )
   private gB f;
   @ObfuscatedName("ap")
   private gS g;

   @ObfuscatedSignature(
      signature = "(JILsc;)V"
   )
   private hb(long var1, int var3, gP var4) {
      this.g = new gS(this);
      this.e = -1L;
      this.a = var3;
      this.b = var4;
      if (this.a == -1) {
         this.d = new HashMap(64);
         this.f = new gB(64, this.g);
         this.c = null;
      } else if (this.b == null) {
         throw new IllegalArgumentException("");
      } else {
         this.d = new HashMap(this.a);
         this.f = new gB(this.a, this.g);
         this.c = new gB(this.a);
      }
   }

   @ObfuscatedSignature(
      signature = "(ILsc;)V"
   )
   public hb(int var1, gP var2) {
      this(-1L, var1, var2);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-57"
   )
   public final void a() {
      synchronized(this) {
         this.d.clear();
         this.f.clear();
         if (this.c()) {
            this.c.clear();
         }

      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Lsa;ZI)V",
      garbageValue = "408374997"
   )
   private void a(gM var1, boolean var2) {
      if (!var2) {
         this.f.remove(var1);
         if (this.c() && !this.c.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.c = System.currentTimeMillis();
      if (this.c()) {
         switch(this.b.b) {
         case 0:
            var1.a = var1.c;
            break;
         case 1:
            ++var1.a;
         }

         this.c.add(var1);
      }

      this.f.add(var1);
   }

   @ObfuscatedName("aj")
   private Object a(Object var1) {
      synchronized(this) {
         if (this.e != -1L) {
            this.b();
         }

         gM var4;
         if ((var4 = (gM)this.d.get(var1)) == null) {
            return null;
         } else {
            this.a(var4, false);
            return var4.d;
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-989122165"
   )
   private void b() {
      if (this.e == -1L) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - this.e;

         while(!this.f.isEmpty()) {
            gM var3;
            if ((var3 = (gM)this.f.peek()).c >= var1) {
               return;
            }

            this.d.remove(var3.b);
            this.f.remove(var3);
            if (this.c()) {
               this.c.remove(var3);
            }
         }

      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;Ljava/lang/Object;B)Ljava/lang/Object;",
      garbageValue = "100"
   )
   public final Object a(Object var1, Object var2) {
      synchronized(this) {
         if (this.e != -1L) {
            this.b();
         }

         gM var4;
         if ((var4 = (gM)this.d.get(var1)) != null) {
            Object var7 = var4.d;
            var4.d = var2;
            this.a(var4, false);
            return var7;
         } else {
            gM var5;
            if (this.c() && this.d.size() == this.a) {
               var5 = (gM)this.c.remove();
               this.d.remove(var5.b);
               this.f.remove(var5);
            }

            var5 = new gM(var2, var1);
            this.d.put(var1, var5);
            this.a(var5, true);
            return null;
         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1704690766"
   )
   private boolean c() {
      return this.a != -1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lps;III)[Lwd;",
      garbageValue = "-953413690"
   )
   public static iT[] a(fB var0, int var1, int var2) {
      if (!aE.a(var0, var1, var2)) {
         return null;
      } else {
         iT[] var6 = new iT[iR.f];

         for(var1 = 0; var1 < iR.f; ++var1) {
            iT var7;
            (var7 = var6[var1] = new iT()).g = iR.c;
            var7.f = iR.e;
            var7.d = iR.b[var1];
            var7.c = ej.c[var1];
            var7.a = eL.a[var1];
            var7.e = aQ.a[var1];
            int var3 = var7.a * var7.e;
            byte[] var4 = iR.a[var1];
            var7.b = new int[var3];

            for(int var5 = 0; var5 < var3; ++var5) {
               var7.b[var5] = iR.d[var4[var5] & 255];
            }
         }

         iR.b = null;
         ej.c = null;
         eL.a = null;
         aQ.a = null;
         iR.d = null;
         iR.a = null;
         return var6;
      }
   }

   @ObfuscatedName("st")
   @ObfuscatedSignature(
      signature = "(Lso;Ljava/lang/Object;I)Ljava/lang/Object;"
   )
   public static Object a(hb var0, Object var1, int var2) {
      if (var0 == null) {
         return var0.a(var1);
      } else {
         synchronized(var0) {
            if (var0.e != -1L) {
               var0.b();
            }

            gM var4;
            if ((var4 = (gM)var0.d.get(var1)) == null) {
               return null;
            } else {
               var0.a(var4, false);
               return var4.d;
            }
         }
      }
   }
}
