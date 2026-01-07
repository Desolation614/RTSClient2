package osrs;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public final class gY implements FocusListener, MouseListener, MouseMotionListener {
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      longValue = -6000464207886188825L
   )
   public static long a = 0L;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1952176513
   )
   public static int b = 0;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1137337605
   )
   public static volatile int c = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1195633007
   )
   static volatile int d = 0;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1205295435
   )
   static volatile int e = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -2083547213
   )
   public static int f = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1116192787
   )
   public static int g = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1444120391
   )
   public static int h = 0;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -241385397
   )
   static volatile int i = -1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -41687009
   )
   public static int j = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 795827763
   )
   public static int k = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      longValue = 8488725944337585033L
   )
   static volatile long l = 0L;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "Lbw;"
   )
   public static gY m = new gY();
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 560166427
   )
   static volatile int n = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      longValue = -6451793251839322579L
   )
   public static long o = 0L;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -633123169
   )
   static volatile int p = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      longValue = 8820212074249144311L
   )
   static volatile long q = -1L;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1669100459
   )
   static volatile int r = -1;
   @ObfuscatedName("pt")
   @ObfuscatedSignature(
      signature = "[Lwd;"
   )
   static iT[] s;
   @ObfuscatedName("xj")
   private int t;

   gY() {
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (this.t == 0) {
         var1 = dF.c.getCallbacks().mouseMoved(var1);
      }

      if (!var1.isConsumed()) {
         ++this.t;

         try {
            if (m != null) {
               c = 0;
               client.B();
               i = var1.getX();
               r = var1.getY();
               q = var1.getWhen();
            }
         } finally {
            --this.t;
         }

      }
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (this.t == 0) {
         var1 = dF.c.getCallbacks().mousePressed(var1);
      }

      if (!var1.isConsumed()) {
         ++this.t;

         try {
            if (m != null) {
               c = 0;
               client.B();
               d = var1.getX();
               p = var1.getY();
               l = au.a();
               int var3 = var1.getButton();
               if ((n = !var1.isAltDown() && var3 != 2 ? (!var1.isMetaDown() && var3 != 3 ? 1 : 2) : 4) != 0) {
                  e = n;
               }
            }

            if (var1.isPopupTrigger()) {
               var1.consume();
            }
         } finally {
            --this.t;
         }

      }
   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (this.t == 0) {
         var1 = dF.c.getCallbacks().mouseReleased(var1);
      }

      if (!var1.isConsumed()) {
         ++this.t;

         try {
            if (m != null) {
               c = 0;
               client.B();
               e = 0;
            }

            if (var1.isPopupTrigger()) {
               var1.consume();
            }
         } finally {
            --this.t;
         }

      }
   }

   public final void mouseClicked(MouseEvent var1) {
      if (!(var1 = dF.c.getCallbacks().mouseClicked(var1)).isConsumed() && var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (this.t == 0) {
         var1 = dF.c.getCallbacks().mouseExited(var1);
      }

      if (!var1.isConsumed()) {
         ++this.t;

         try {
            if (m != null) {
               c = 0;
               client.B();
               i = -1;
               r = -1;
               q = var1.getWhen();
            }
         } finally {
            --this.t;
         }

      }
   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      if (this.t == 0) {
         var1 = dF.c.getCallbacks().mouseDragged(var1);
      }

      if (!var1.isConsumed()) {
         ++this.t;

         try {
            this.mouseMoved(var1);
         } finally {
            --this.t;
         }

      }
   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (m != null) {
         e = 0;
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      if (this.t == 0) {
         var1 = dF.c.getCallbacks().mouseEntered(var1);
      }

      if (!var1.isConsumed()) {
         ++this.t;

         try {
            this.mouseMoved(var1);
         } finally {
            --this.t;
         }

      }
   }

   @ObfuscatedName("ph")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1410406466"
   )
   static void a(int var0) {
      bP var1;
      if ((var1 = az.a(var0)).b() && dF.a(var1.h) == 2) {
         client.fh.add(var1.h);
      }

   }
}
