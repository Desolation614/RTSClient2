package osrs;

import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public final class G {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 542409307
   )
   static int a = -2;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 2132140187
   )
   private static int e = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 2047674915
   )
   volatile int b;
   @ObfuscatedName("al")
   volatile byte[] c;
   @ObfuscatedName("an")
   final URL d;

   G(URL var1) {
      this.b = e;
      this.d = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1109877326"
   )
   static final void a(String var0) {
      fh.a(var0 + " is already on your friend list");
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(IZI)Ljava/lang/String;",
      garbageValue = "1327721359"
   )
   public static String a(int var0, boolean var1) {
      String var10000;
      if (var1 && var0 >= 0) {
         boolean var4 = true;
         var0 = var0;
         if (!var1 || var0 < 0) {
            return Integer.toString(var0, 10);
         }

         int var5 = 2;

         for(int var2 = var0 / 10; var2 != 0; ++var5) {
            var2 /= 10;
         }

         char[] var6;
         (var6 = new char[var5])[0] = '+';
         --var5;

         for(; var5 > 0; --var5) {
            int var3 = var0;
            var0 /= 10;
            if ((var3 -= var0 * 10) >= 10) {
               var6[var5] = (char)(var3 + 87);
            } else {
               var6[var5] = (char)(var3 + 48);
            }
         }

         var10000 = new String(var6);
      } else {
         var10000 = Integer.toString(var0);
      }

      return var10000;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(ILvl;I)Z",
      garbageValue = "213901937"
   )
   public static boolean a(int var0, iC var1) {
      return (var0 & var1.l) != 0;
   }

   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      signature = "(Leo;B)Ljava/lang/String;"
   )
   public static String a(G var0, byte var1) {
      if (var0 == null) {
         URL var10000 = var0.d;
      }

      return var0.d.toString();
   }

   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1531496980"
   )
   static final void a() {
      kc.w();
      aT.b();
      aT.a.b();
      ir.a.b();
      bl.b();
      dF.a();
      bE.a.b();
      iu.a();
      bq.c.b();
      bq.a.b();
      bG.b.b();
      bG.a.b();
      bG.d.b();
      client.v();
      az.a();
      aL.a.b();
      bJ.g.b();
      bJ.e.b();
      bJ.c.b();
      bJ.b.b();
      bi.c.b();
      bc.b.b();
      bL.a();
      bC.a.b();
      bC.b.b();
      bC.c.b();
      bh.a.b();
      bP.c.b();
      bP.b.b();
      bP.e.b();
      bl.c.b();
      bl.a.b();
      aZ.a.b();
      bj.b.b();
      if (hj.b != null) {
         hj.b.c();
      }

      if (bP.f != null) {
         bP.f.c();
      }

      cD.b();
      aW.a.b();
      be.a.b();
      bf.a.b();
      ay.a.b();
      au.a.b();
      aY.b();
      az.b.b();
      bl.c();
      client.cl.b();
      client.cv.b();
      cU.b();
      if (jD.a != null) {
         eu.a(jD.a, (byte)-1);
      }

      if (cc.d.a != null) {
         ((cx)cc.d.a).a();
      }

      cD.a();
      client.fl.a();
      if (bB.c != null) {
         bB.c.b();
      }

      if (fD.c != null) {
         fD.c.b();
      }

      if (r.a != null) {
         r.a.b();
      }

      if (bs.i != null) {
         bs.i.b();
      }

      if (ij.c != null) {
         ij.c.b();
      }

      if (et.a != null) {
         et.a.b();
      }

      if (ex.a != null) {
         ex.a.b();
      }

      if (fJ.y != null) {
         fJ.y.b();
      }

      if (el.a != null) {
         el.a.b();
      }

      if (ec.c != null) {
         ec.c.b();
      }

      if (em.a != null) {
         em.a.b();
      }

      if (dE.a != null) {
         dE.a.b();
      }

      if (bS.a != null) {
         bS.a.b();
      }

      if (bn.d != null) {
         bn.d.b();
      }

      if (fW.c != null) {
         fW.c.b();
      }

      if (df.a != null) {
         df.a.b();
      }

      if (ka.a != null) {
         ka.a.b();
      }

      if (fk.a != null) {
         fk.a.b();
      }

      if (bI.b != null) {
         bI.b.b();
      }

      if (ar.b != null) {
         ar.b.b();
      }

      if (z.a != null) {
         z.a.b();
      }

      if (cY.A != null) {
         cY.A.b();
      }

      if (fl.a != null) {
         fl.a.b();
      }

   }

   @ObfuscatedName("oh")
   @ObfuscatedSignature(
      signature = "(Leo;I)Z"
   )
   public static boolean a(G var0, int var1) {
      if (var0 == null) {
         boolean var10000;
         if (a * -1010962751 != var0.b) {
            var10000 = true;
         } else {
            var10000 = false;
         }
      }

      return var0.b != e;
   }
}
