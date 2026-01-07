package osrs;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.api.events.FocusChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public final class ch implements FocusListener, KeyListener {
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1378413789
   )
   volatile int a = 0;
   @ObfuscatedName("ai")
   private Collection b = new ArrayList(100);
   @ObfuscatedName("aj")
   private boolean[] c = new boolean[112];
   @ObfuscatedName("al")
   private Collection d = new ArrayList(100);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "[Lbi;"
   )
   private eh[] e = new eh[3];

   ch() {
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1789012292"
   )
   private synchronized void b() {
      Collection var1 = this.d;
      this.d = this.b;
      this.b = var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-18004391"
   )
   public final boolean a() {
      return this.a <= 1;
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      if (!a(var1)) {
         dF.c.getCallbacks().keyPressed(var1);
      }

      int var2;
      label29: {
         dv.a = var1.isConsumed();
         if ((var2 = var1.getKeyCode()) >= 0) {
            int var3 = eN.b.length;
            if (var2 < var3) {
               var2 = var3 = eN.b[var2];
               if ((var3 & 128) == 0) {
                  break label29;
               }
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         if (!this.c[var2]) {
            this.a = 0;
         }

         this.c[var2] = true;
         this.b.add(new dv(1, var2));
      }

      var1.consume();
      dv.a = false;
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      if (!a(var1)) {
         dF.c.getCallbacks().keyReleased(var1);
      }

      int var2;
      label19: {
         dv.a = var1.isConsumed();
         if ((var2 = var1.getKeyCode()) >= 0) {
            int var3 = eN.b.length;
            if (var2 < var3) {
               var2 = eN.b[var2] & -129;
               break label19;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.c[var2] = false;
         this.b.add(new dv(2, var2));
      }

      var1.consume();
      dv.a = false;
   }

   public final synchronized void focusGained(FocusEvent var1) {
      this.b.add(new dv(4, 1));
   }

   public final synchronized void focusLost(FocusEvent var1) {
      FocusChanged var2;
      (var2 = new FocusChanged()).setFocused(false);
      dF.c.getCallbacks().post(var2);

      for(int var3 = 0; var3 < 112; ++var3) {
         if (this.c[var3]) {
            this.c[var3] = false;
            this.b.add(new dv(2, var3));
         }
      }

      this.b.add(new dv(4, 0));
   }

   public final synchronized void keyTyped(KeyEvent var1) {
      if (!a(var1)) {
         dF.c.getCallbacks().keyTyped(var1);
      }

      dv.a = var1.isConsumed();
      char var2;
      if ((var2 = var1.getKeyChar()) != 0 && var2 != '\uffff') {
         boolean var6;
         if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
            var6 = true;
         } else {
            label57: {
               if (var2 != 0) {
                  char[] var3 = fX.a;

                  for(int var4 = 0; var4 < var3.length; ++var4) {
                     if (var3[var4] == var2) {
                        var6 = true;
                        break label57;
                     }
                  }
               }

               var6 = false;
            }
         }

         if (var6) {
            this.b.add(new dv(3, var2));
         }
      }

      var1.consume();
      dv.a = false;
   }

   @ObfuscatedName("xw")
   @ObfuscatedSignature(
      signature = "(Lay;Ljava/awt/Component;I)V"
   )
   public static void a(ch var0, Component var1, int var2) {
      if (var0 == null) {
         var1.setFocusTraversalKeysEnabled(false);
         var1.addKeyListener(var0);
         var1.addFocusListener(var0);
      } else {
         var1.setFocusTraversalKeysEnabled(false);
         var1.addKeyListener(var0);
         var1.addFocusListener(var0);
      }
   }

   @ObfuscatedName("aa")
   private static boolean a(KeyEvent var0) {
      if (client.aR.a != null) {
         return true;
      } else {
         client var10000 = dF.c;
         if (client.q() != 10) {
            var10000 = dF.c;
            if (client.q() != 11) {
               return false;
            }
         }

         if (dF.c.getCurrentLoginField() == 1 && !var0.isMetaDown() && !var0.isControlDown()) {
            return true;
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "([BIII)Ljava/lang/String;",
      garbageValue = "-1449692965"
   )
   public static String a(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6;
         if ((var6 = var0[var5 + var1] & 255) != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7;
               if ((var7 = fX.a[var6 - 128]) == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      signature = "(Lay;I)V"
   )
   public static void a(ch var0, int var1) {
      if (var0 == null) {
         ch var5 = var0;
         ++var0.a;
         var0.b();
         Iterator var2 = var0.b.iterator();

         while(var2.hasNext()) {
            dv var3 = (dv)var2.next();

            for(int var4 = 0; var4 < var5.e.length && !dv.a(var3, var5.e[var4], (byte)-80); ++var4) {
            }
         }

         var5.d.clear();
      }

      ++var0.a;
      var0.b();
      Iterator var6 = var0.d.iterator();

      while(var6.hasNext()) {
         dv var7 = (dv)var6.next();

         for(int var8 = 0; var8 < var0.e.length && !dv.a(var7, var0.e[var8], (byte)-80); ++var8) {
         }
      }

      var0.d.clear();
   }

   @ObfuscatedName("nh")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1861496833"
   )
   static final void a(int var0) {
      if (eu.a(jD.a, var0)) {
         fd[] var3 = jD.a.c[var0];

         for(int var1 = 0; var1 < var3.length; ++var1) {
            fd var2;
            if ((var2 = var3[var1]) != null) {
               var2.bz = 0;
               var2.bQ = 0;
            }
         }
      }

   }

   @ObfuscatedName("ns")
   @ObfuscatedSignature(
      signature = "(Lay;Lbi;II)V",
      garbageValue = "1433776513"
   )
   public static void a(ch var0, eh var1, int var2) {
      if (var0 == null) {
         var0.e[var2] = var1;
      }

      var0.e[var2] = var1;
   }
}
