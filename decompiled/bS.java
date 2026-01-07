package osrs;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("is")
public final class bS {
   @ObfuscatedName("km")
   @ObfuscatedSignature(
      signature = "Lpu;"
   )
   static fE a;
   @ObfuscatedName("ad")
   String b;
   @ObfuscatedName("af")
   String c;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   bB d;
   @ObfuscatedName("ak")
   String e;
   @ObfuscatedName("ar")
   int f = 876180149;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   bO g;
   @ObfuscatedName("aw")
   private int h = 0;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "Leo;"
   )
   private G i;

   public bS() {
   }

   @ObfuscatedSignature(
      signature = "(Lis;)V"
   )
   public bS(bS var1) {
      if (var1 != null) {
         this.d = var1.d;
         this.g = var1.g;
         this.f = var1.f;
         this.b = var1.b;
         this.c = var1.c;
         this.e = var1.e;
         this.i = null;
         this.h = var1.h;
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "-715660522"
   )
   public final int a(String var1) {
      return this.g.b.containsKey(var1) ? (Integer)this.g.b.get(var1) : -1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "17"
   )
   public final String a() {
      return this.g.e;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;Les;I)Z",
      garbageValue = "-1592321374"
   )
   public final boolean a(String var1, String var2, K var3) {
      if (var1 != null && !var1.isEmpty()) {
         if (var3 == null) {
            return false;
         } else {
            this.i = null;

            try {
               this.b = var1;
               this.i = K.a(var3, new URL(this.b), -1352286354);
               this.f = 0;
            } catch (MalformedURLException var5) {
               this.i = null;
               this.f = 790246700;
               return false;
            }

            if (!var2.isEmpty()) {
               this.e = var2;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Les;I)Z"
   )
   private boolean a(String var1, K var2) {
      try {
         JSONObject var5 = (new ig(var1.getBytes())).a;

         try {
            this.f = var5.getInt("version") * 1574746731;
         } catch (Exception var3) {
            this.i = null;
            this.h = -962113598;
            return false;
         }

         if (!this.g.a(var5, this.f * 195764803, var2)) {
            this.h = -962113598;
         }

         this.h = (!this.g.g.isEmpty() ? 1 : 2) * -876180149;
      } catch (UnsupportedEncodingException var4) {
         this.h = -962113598;
      }

      return this.h * 211326051 < 3;
   }

   @ObfuscatedName("aw")
   private void b() {
      Iterator var1 = this.g.g.iterator();

      bF var2;
      do {
         if (!var1.hasNext()) {
            var1 = this.g.g.iterator();

            byte[] var3;
            do {
               if (!var1.hasNext()) {
                  this.i = null;
                  this.f = -85933449;
                  return;
               }
            } while((var2 = (bF)var1.next()).c == null || (var3 = var2.c.c) == null || var3.length <= 0);

            this.h = -1752360298;
            return;
         }
      } while((var2 = (bF)var1.next()).c == null || G.a(var2.c, -386298731));

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "3"
   )
   static final void a(int var0, int var1, int var2, int var3) {
      if (!cf.e) {
         int var5 = cm.b();
         int var6 = (cf.b - cc.a()) * 50 / cc.c();
         int var7 = (cf.f - cc.g()) * 50 / cc.c();
         int var8 = (cf.b - cc.a()) * var5 / cc.c();
         int var9 = (cf.f - cc.g()) * var5 / cc.c();
         int var10 = dj.a(var7, 50, var1, var0);
         int var4 = M.a(var7, 50, var1, var0);
         var7 = var10;
         var10 = dj.a(var9, var5, var1, var0);
         var5 = M.a(var9, var5, var1, var0);
         var9 = var10;
         var10 = bY.a(var6, var4, var3, var2);
         var4 = cL.a(var6, var4, var3, var2);
         var6 = var10;
         var10 = bY.a(var8, var5, var3, var2);
         var5 = cL.a(var8, var5, var3, var2);
         bg.a(var6, var7, var4, var10, var9, var5);
      }

   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(Lis;Ljava/lang/String;Les;I)Z"
   )
   public static boolean a(bS var0, String var1, K var2, int var3) {
      if (var0 == null) {
         var0.a(var1, var2);
      }

      try {
         JSONObject var6 = (new ig(var1.getBytes())).a;

         try {
            var0.h = var6.getInt("version") * 1574746731;
         } catch (Exception var4) {
            var0.i = null;
            var0.f = -962113598;
            return false;
         }

         if (!var0.g.a(var6, var0.h * 195764803, var2)) {
            var0.f = -962113598;
         }

         var0.f = (!var0.g.j.isEmpty() ? 1 : 2) * -876180149;
      } catch (UnsupportedEncodingException var5) {
         var0.f = -962113598;
      }

      return var0.f * 211326051 < 3;
   }

   @ObfuscatedName("oj")
   @ObfuscatedSignature(
      signature = "(Lis;Les;I)V"
   )
   public static void a(bS var0, K var1, int var2) {
      if (var0.i != null && G.a(var0.i, 1788804344)) {
         byte[] var6;
         if ((var6 = var0.i.c) == null) {
            var0.i = null;
            var0.f = 790246700;
         } else {
            try {
               JSONObject var7;
               if ((var7 = (new ig(var6)).a) == null) {
                  return;
               }

               try {
                  var0.h = var7.getInt("version") * 1574746731;
               } catch (Exception var4) {
                  var0.i = null;
                  var0.f = -962113598;
                  return;
               }

               if (var0.h * 195764803 < 2) {
                  if (!var0.g.a(var7, var0.h * 195764803, var1)) {
                     var0.f = -962113598;
                  }
               } else if (var0.h * 195764803 == 2) {
                  bY var3;
                  (var3 = T.b()).a(var7, var0.h * 195764803, var1);
                  var0.g = var3.a(var0.e);
                  if (var0.g != null) {
                     a(var0, -307518633);
                     var0.f = -876180149;
                  } else {
                     var0.f = -1838293747;
                  }
               }
            } catch (UnsupportedEncodingException var5) {
               var0.i = null;
               var0.f = -962113598;
               return;
            }

            if (var0.g != null) {
               byte var8;
               if (!var0.g.j.isEmpty()) {
                  var8 = 1;
               } else {
                  var8 = 2;
               }

               var0.f = var8 * -876180149;
            }

            var0.i = null;
         }
      }
   }

   @ObfuscatedName("pm")
   @ObfuscatedSignature(
      signature = "(Lis;I)V"
   )
   public static void a(bS var0, int var1) {
      if (var0 == null) {
         var0.b();
      } else {
         Iterator var3 = var0.g.j.iterator();

         bF var2;
         do {
            if (!var3.hasNext()) {
               var3 = var0.g.j.iterator();

               byte[] var4;
               do {
                  if (!var3.hasNext()) {
                     var0.i = null;
                     var0.f = -85933449;
                     return;
                  }
               } while((var2 = (bF)var3.next()).c == null || (var4 = var2.c.c) == null || var4.length <= 0);

               var0.f = -1752360298;
               return;
            }
         } while((var2 = (bF)var3.next()).c == null || G.a(var2.c, -386298731));

      }
   }

   @ObfuscatedName("ve")
   @ObfuscatedSignature(
      signature = "(Lis;I)[F"
   )
   public static float[] b(bS var0, int var1) {
      return var0 == null ? var0.g.c : var0.g.c;
   }
}
