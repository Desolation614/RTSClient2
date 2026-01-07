package osrs;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public final class eK {
   @ObfuscatedName("ab")
   int a = 0;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "Lrk;"
   )
   gv b = new gv();
   @ObfuscatedName("ao")
   boolean c = true;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1873479497
   )
   int d = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -2134121275
   )
   int e = 0;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "Lrk;"
   )
   gv f = new gv();
   @ObfuscatedName("av")
   boolean g = false;
   @ObfuscatedName("ax")
   boolean h = false;
   @ObfuscatedName("ay")
   int i = 0;
   @ObfuscatedName("ba")
   int j = 670771271;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1940174109
   )
   int k = 0;
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "Lns;"
   )
   ez l;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 687514827
   )
   int m = Integer.MAX_VALUE;
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "Lns;"
   )
   ez n;
   @ObfuscatedName("bl")
   int o = 0;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 1436928611
   )
   int p = 0;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -1765707803
   )
   int q = 0;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 1079495313
   )
   int r = 0;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -835445405
   )
   int s = 0;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1575115033
   )
   int t = 0;
   @ObfuscatedName("bx")
   int u = 0;

   eK() {
      gv.e(this.f, 1);
      gv.e(this.b, 1);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1753491469"
   )
   public final boolean a(int var1, int var2) {
      boolean var3 = this.d != var1 || var2 != this.s;
      this.d = var1;
      this.s = var2;
      return var3 | a(this, this.i * 260151395, this.o * -511517567);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Z",
      garbageValue = "1"
   )
   public final boolean a(String var1) {
      if (!this.f.a().equals(var1)) {
         var1 = this.c(var1);
         this.f.a(var1);
         this.b(this.t, this.p);
         a(this, this.i * 260151395, this.o * -511517567);
         this.d();
         this.k();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(ZB)Z",
      garbageValue = "1"
   )
   public final boolean a(boolean var1) {
      var1 = var1 && this.c;
      boolean var2 = this.g != var1;
      this.g = var1;
      if (!this.g) {
         this.b(this.p, this.p);
      }

      return var2;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Z",
      garbageValue = "1702902865"
   )
   final boolean b(String var1) {
      this.b.a(var1);
      return true;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "1"
   )
   final boolean a() {
      return this.t != this.p;
   }

   @ObfuscatedName("ap")
   final void b() {
      this.e = (this.o * -413217807 + 1) % 60 * -2018915819;
      if (this.t * -697803405 > 0) {
         this.q = this.t * 828749139 - 494227617;
      }

   }

   @ObfuscatedName("au")
   private boolean c(int var1, int var2) {
      if (!this.h) {
         this.m = var1 * -240170375;
         this.e = var2 * -1587317179;
         return false;
      } else {
         int var3 = this.q * -1385327961;
         int var4 = this.t * -905495465;
         int var5 = Math.max(0, this.b.c() - this.p * 19062429 + 2);
         int var6 = Math.max(0, gv.g(this.b, -1042880717) - this.s + 1);
         this.p = Math.max(0, Math.min(var5, var1)) * 1805428225;
         this.s = Math.max(0, Math.min(var6, var2)) * -203745309;
         return this.i * 260151395 != var3 || var4 != this.o * -511517567;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "491546083"
   )
   public final boolean b(int var1, int var2) {
      if (!this.h) {
         this.t = var1;
         this.p = var2;
         return false;
      } else {
         if (var1 > this.f.j.size()) {
            var1 = this.f.j.size();
         }

         if (var2 > this.f.j.size()) {
            var2 = this.f.j.size();
         }

         boolean var3 = this.t != var1 || var2 != this.p;
         this.t = var1;
         if (var2 != this.p) {
            this.p = var2;
            this.u = 0;
            this.l();
         }

         if (var3 && this.n != null) {
            this.n.a();
         }

         return var3;
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-588414067"
   )
   public final boolean a(int var1) {
      if (e(this, var1)) {
         this.f();
         gm var3 = this.f.a((char)var1, this.p, this.j * -1009254775);
         this.b(var3.a, var3.a);
         this.d();
         this.k();
      }

      return true;
   }

   @ObfuscatedName("bd")
   private void a(Clipboard var1) {
      Transferable var4;
      if ((var4 = var1.getContents((Object)null)) != null && var4.isDataFlavorSupported(DataFlavor.stringFlavor)) {
         try {
            String var5 = this.c((String)var4.getTransferData(DataFlavor.stringFlavor));
            this.a();
            gm var6 = this.b.a(var5, this.i * 1436928611, this.a * -1009254775);
            this.b(var6.a, var6.a);
            this.d();
            this.k();
            return;
         } catch (Exception var3) {
         }
      }

   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "(I)Lrs;",
      garbageValue = "863558138"
   )
   public final gE c() {
      return this.f.a(this.t, this.p);
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "3212"
   )
   private void l() {
      iB var1 = this.f.a(0, this.p).a();
      int var2 = this.f.h * 1744969267;
      int var3;
      int var4 = (var3 = (Integer)var1.d - 10) + 20;
      int var11;
      var2 = (var11 = (Integer)var1.c - 3) + var2 + 6;
      int var5;
      int var6 = (var5 = this.i * 260151395) + this.d;
      int var7;
      int var8 = (var7 = this.o * -511517567) + this.s;
      int var9 = this.i * 260151395;
      int var10 = this.o * -511517567;
      if (var3 < var5) {
         var9 = var3;
      } else if (var4 > var6) {
         var9 = var4 - this.d;
      }

      if (var11 < var7) {
         var10 = var11;
      } else if (var2 > var8) {
         var10 = var2 - this.s;
      }

      a(this, var9, var10);
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-874395768"
   )
   final boolean d() {
      if (!this.h) {
         return false;
      } else {
         boolean var1 = false;
         if (this.f.j.size() > this.m) {
            gv.a(this.f, this.m, this.f.j.size());
            var1 = true;
         }

         int var2 = this.f.i * -3681349;
         if (gv.a(this.f, (byte)-1) > var2) {
            var2 = this.f.b(0, var2) - 1;
            gv var10002 = this.f;
            gv.a(var10002, var2, var10002.j.size());
            var1 = true;
         }

         if (var1) {
            var2 = this.p;
            int var3 = this.t;
            int var4 = this.f.j.size();
            if (this.p > var4) {
               var2 = var4;
            }

            if (this.t > var4) {
               var3 = var4;
            }

            this.b(var3, var2);
         }

         return var1;
      }
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-49"
   )
   public final int e() {
      return this.f.k;
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      signature = "(Lvk;Lvk;B)V",
      garbageValue = "54"
   )
   final void a(iB var1, iB var2) {
      if ((Integer)var2.d < (Integer)var1.d) {
         this.b((Integer)var1.c, (Integer)var2.d);
      } else {
         this.b((Integer)var1.d, (Integer)var2.c);
      }
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-67"
   )
   final boolean f() {
      if (!this.a()) {
         return false;
      } else {
         int var1 = gv.a(this.f, this.t, this.p);
         this.k();
         this.b(var1, var1);
         return true;
      }
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      signature = "(II)Lvk;",
      garbageValue = "193062210"
   )
   final iB b(int var1) {
      int var2 = this.f.j.size();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (gv.d(this.f, var5 - 1).c == '\n') {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (gv.d(this.f, var5).c == '\n') {
            var4 = var5;
            break;
         }
      }

      return new iB(var3, var4);
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-23"
   )
   public final int g() {
      return this.f.i * -3681349;
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-79"
   )
   private static boolean d(int var0) {
      return var0 == 32 || var0 == 10 || var0 == 9;
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "27676055"
   )
   final void a(int var1, boolean var2) {
      if (var2) {
         this.b(this.t, var1);
      } else {
         this.b(var1, var1);
      }
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      signature = "(II)Lvk;",
      garbageValue = "-741688852"
   )
   final iB c(int var1) {
      int var2 = this.f.j.size();
      int var3 = 0;
      int var4 = var2;

      int var5;
      for(var5 = var1; var5 > 0; --var5) {
         if (d(gv.d(this.f, var5 - 1).c)) {
            var3 = var5;
            break;
         }
      }

      for(var5 = var1; var5 < var2; ++var5) {
         if (d(gv.d(this.f, var5).c)) {
            var4 = var5;
            break;
         }
      }

      return new iB(var3, var4);
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "-3"
   )
   final String c(String var1) {
      StringBuilder var2 = new StringBuilder(var1.length());

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         char var4 = var1.charAt(var3);
         if (e(this, var4)) {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1306191244"
   )
   public final int h() {
      return gv.c(this.f, -1074436534);
   }

   @ObfuscatedName("cu")
   private int m() {
      int var1 = 1075653150;
      return gv.a(this.b, 1075653150, 1075653151);
   }

   @ObfuscatedName("cv")
   private int n() {
      return this.r * -1640834381 / this.b.j.size();
   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "88"
   )
   public final int i() {
      return this.f.b;
   }

   @ObfuscatedName("cz")
   private int o() {
      return this.o * -1940174109;
   }

   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      signature = "(B)Lvk;",
      garbageValue = "-15"
   )
   final iB j() {
      int var1 = gv.b(this.f, this.d);
      int var2 = this.f.c(this.s);
      return new iB(var1, var2);
   }

   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-87"
   )
   final void k() {
      if (this.l != null) {
         this.l.a();
      }

   }

   @ObfuscatedName("ex")
   private boolean e(int var1) {
      this.d = var1 * 1588692948;
      if (this.d()) {
         this.b();
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("xu")
   @ObfuscatedSignature(
      signature = "(Lod;I)I"
   )
   public static int a(eK var0, int var1) {
      if (var0 == null) {
         var0.n();
      }

      return var0.s / (var0.f.h * 1744969267);
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      signature = "(Lve;Ljava/lang/Object;B)V",
      garbageValue = "98"
   )
   static void a(iv var0, Object var1) {
      if (var0 == null) {
         throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
      } else {
         switch(var0.f) {
         case 0:
            hE.n[++aU.a - 1] = var1;
            return;
         case 3:
            hE.c[++hE.e - 1] = (Integer)var1;
            return;
         default:
            throw new IllegalStateException("pushValueOfType() failure - unsupported type");
         }
      }
   }

   @ObfuscatedName("fp")
   @ObfuscatedSignature(
      signature = "(Lod;B)I"
   )
   public static int a(eK var0, byte var1) {
      if (var0 == null) {
         var0.m();
      }

      return var0.o * -511517567;
   }

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      signature = "(Lod;I)I"
   )
   public static int b(eK var0, int var1) {
      return var0 == null ? var0.o() : var0.k;
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      signature = "(Lod;I)I"
   )
   public static int c(eK var0, int var1) {
      if (var0 == null) {
         int var10000 = var0.e * 1091595015;
      }

      return var0.i * 260151395;
   }

   @ObfuscatedName("kk")
   @ObfuscatedSignature(
      signature = "(Lod;III)Z",
      garbageValue = "1810361291"
   )
   public static boolean a(eK var0, int var1, int var2) {
      if (var0 == null) {
         return var0.c(var1, var1);
      } else if (!var0.h) {
         var0.i = var1 * 344303947;
         var0.o = var2 * 1632199553;
         return false;
      } else {
         int var3 = var0.i * 260151395;
         int var4 = var0.o * -511517567;
         int var5 = Math.max(0, var0.f.c() - var0.d + 2);
         int var6 = Math.max(0, gv.g(var0.f, -1042880717) - var0.s + 1);
         var0.i = Math.max(0, Math.min(var5, var1)) * 344303947;
         var0.o = Math.max(0, Math.min(var6, var2)) * 1632199553;
         return var3 != var0.i * 260151395 || var4 != var0.o * -511517567;
      }
   }

   @ObfuscatedName("rc")
   @ObfuscatedSignature(
      signature = "(Lod;I)Z"
   )
   public static boolean d(eK var0, int var1) {
      if (var0 == null) {
         var0.e(-549852146);
      }

      return var0.c;
   }

   @ObfuscatedName("ua")
   @ObfuscatedSignature(
      signature = "(Lod;II)Z",
      garbageValue = "-1927082854"
   )
   public static boolean e(eK var0, int var1) {
      switch(var0.k) {
      case 1:
         return osrs.r.a((char)var1);
      case 2:
         return bN.a((char)var1);
      case 3:
         return bx.a((char)var1);
      case 4:
         char var2;
         if (bx.a(var2 = (char)var1)) {
            return true;
         } else {
            if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') {
               return false;
            }

            return true;
         }
      default:
         return true;
      }
   }

   @ObfuscatedName("ui")
   @ObfuscatedSignature(
      signature = "(Lod;S)I"
   )
   public static int a(eK var0, short var1) {
      if (var0 == null) {
         int var10000 = var0.u * -1575115033;
      }

      return var0.t;
   }

   @ObfuscatedName("uo")
   @ObfuscatedSignature(
      signature = "(Lod;Ljava/awt/datatransfer/Clipboard;I)V"
   )
   public static void a(eK var0, Clipboard var1, int var2) {
      if (var0 == null) {
         var0.a(var1);
      }

      gE var3;
      String var4;
      if (!(var3 = var0.f.a(var0.t, var0.p)).c() && !(var4 = var3.d()).isEmpty()) {
         var1.setContents(new StringSelection(var4), (ClipboardOwner)null);
      }

   }
}
