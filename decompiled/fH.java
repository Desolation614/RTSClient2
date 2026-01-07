package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
public final class fH implements Runnable {
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1733720249
   )
   static int a = 0;
   @ObfuscatedName("aj")
   static final Object b = new Object();
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   public static fU c = new fU();
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "Lwz;"
   )
   public static eX d;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   public static final fU e = new fU();

   fH() {
   }

   public final void run() {
      try {
         while(true) {
            fl var1;
            synchronized(e) {
               var1 = (fl)fU.e(e);
            }

            if (var1 != null) {
               if (var1.e == 0) {
                  var1.d.a((int)var1.cf, var1.c, var1.c.length);
                  synchronized(e) {
                     gk.a(var1);
                  }
               } else if (var1.e == 1) {
                  var1.c = var1.d.a((int)var1.cf);
                  synchronized(e) {
                     fU.a((fU)c, var1);
                  }
               }

               synchronized(b) {
                  if (a <= 1) {
                     a = 0;
                     b.notifyAll();
                     return;
                  }

                  a = 600;
               }
            } else {
               M.a(100L);
               synchronized(b) {
                  if (a <= 1) {
                     a = 0;
                     b.notifyAll();
                     return;
                  }

                  --a;
               }
            }
         }
      } catch (Exception var8) {
         iE.a((String)null, var8);
      }
   }
}
