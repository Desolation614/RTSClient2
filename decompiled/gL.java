package osrs;

import java.util.Objects;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public final class gL {
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 807658107
   )
   private static int t = 16;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lrz;"
   )
   public static final gL a = new gL();
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1584756353
   )
   static int b;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "[Lrz;"
   )
   static gL[] c = new gL[0];
   @ObfuscatedName("zg")
   public float d;
   @ObfuscatedName("aa")
   public float e;
   @ObfuscatedName("ac")
   private float[] u;
   @ObfuscatedName("az")
   public float f;
   @ObfuscatedName("cr")
   public float g;
   @ObfuscatedName("cv")
   public float h;
   @ObfuscatedName("fm")
   public float i;
   @ObfuscatedName("hz")
   public float j;
   @ObfuscatedName("jz")
   public float k;
   @ObfuscatedName("lh")
   public float l;
   @ObfuscatedName("mn")
   public float m;
   @ObfuscatedName("qb")
   public float n;
   @ObfuscatedName("ru")
   public float o;
   @ObfuscatedName("tn")
   public float p;
   @ObfuscatedName("um")
   public float q;
   @ObfuscatedName("vf")
   public float r;
   @ObfuscatedName("wh")
   public float s;

   public gL() {
      this.s = 1.0F;
      this.n = 1.0F;
      this.g = 1.0F;
      this.q = 1.0F;
   }

   @ObfuscatedSignature(
      signature = "(Lrz;)V"
   )
   public gL(gL var1) {
      a(this, var1, -1662681798);
   }

   @ObfuscatedSignature(
      signature = "(Lwt;Z)V"
   )
   public gL(jk var1, boolean var2) {
      boolean var3 = var2;
      jk var7 = var1;
      int var6 = -231750250;
      if (var3) {
         if (!var3) {
            float[] var10000 = this.u;
            var7.q();
            throw new NullPointerException();
         }

         gq var8;
         (var8 = new gq()).b(di.a(var7.c()));
         var8.c(di.a(var7.c()));
         var8.a(di.a(var7.c()));
         var8.a((float)var7.c(), (float)var7.c(), (float)var7.c());
         this.a(var8);
      } else {
         this.s = var7.q();
         this.r = var7.q();
         this.k = var7.q();
         this.l = var7.q();
         this.f = var7.q();
         this.n = var7.q();
         this.j = var7.q();
         this.m = var7.q();
         this.o = var7.q();
         this.i = var7.q();
         this.g = var7.q();
         this.e = var7.q();
         this.h = var7.q();
         this.d = var7.q();
         this.p = var7.q();
         this.q = var7.q();
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "452771979"
   )
   final void a() {
      this.s = 1.0F;
      this.r = 0.0F;
      this.k = 0.0F;
      this.l = 0.0F;
      this.f = 0.0F;
      this.n = 1.0F;
      this.j = 0.0F;
      this.m = 0.0F;
      this.o = 0.0F;
      this.i = 0.0F;
      this.g = 1.0F;
      this.e = 0.0F;
      this.h = 0.0F;
      this.d = 0.0F;
      this.p = 0.0F;
      this.q = 1.0F;
   }

   @ObfuscatedName("ab")
   private float e(float var1, float var2, float var3) {
      return var1 * this.f + this.f * var2 + this.g * var3 + this.d;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(Lrz;I)V",
      garbageValue = "-303329759"
   )
   public final void a(gL var1) {
      float var2 = var1.h * this.l + this.k * var1.o + var1.s * this.s + this.r * var1.f;
      float var3 = this.s * var1.r + this.r * var1.n + var1.i * this.k + var1.d * this.l;
      float var4 = var1.p * this.l + var1.j * this.r + var1.k * this.s + this.k * var1.g;
      float var5 = this.s * var1.l + var1.m * this.r + this.k * var1.e + this.l * var1.q;
      float var6 = var1.f * this.n + this.f * var1.s + this.j * var1.o + this.m * var1.h;
      float var7 = this.j * var1.i + var1.r * this.f + this.n * var1.n + var1.d * this.m;
      float var8 = var1.p * this.m + var1.g * this.j + var1.j * this.n + var1.k * this.f;
      float var9 = this.m * var1.q + this.j * var1.e + var1.l * this.f + this.n * var1.m;
      float var10 = this.o * var1.s + this.i * var1.f + var1.o * this.g + this.e * var1.h;
      float var11 = var1.n * this.i + this.o * var1.r + var1.i * this.g + this.e * var1.d;
      float var12 = var1.k * this.o + var1.j * this.i + this.g * var1.g + this.e * var1.p;
      float var13 = this.g * var1.e + var1.l * this.o + this.i * var1.m + this.e * var1.q;
      float var14 = this.p * var1.o + var1.s * this.h + var1.f * this.d + this.q * var1.h;
      float var15 = this.q * var1.d + var1.i * this.p + this.d * var1.n + this.h * var1.r;
      float var16 = var1.g * this.p + var1.j * this.d + var1.k * this.h + var1.p * this.q;
      float var17 = this.d * var1.m + this.h * var1.l + this.p * var1.e + var1.q * this.q;
      this.s = var2;
      this.r = var3;
      this.k = var4;
      this.l = var5;
      this.f = var6;
      this.n = var7;
      this.j = var8;
      this.m = var9;
      this.o = var10;
      this.i = var11;
      this.g = var12;
      this.e = var13;
      this.h = var14;
      this.d = var15;
      this.p = var16;
      this.q = var17;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Lqi;I)V",
      garbageValue = "1453735347"
   )
   public final void a(fS var1) {
      float var2 = var1.d.c * var1.d.c;
      float var3 = var1.d.c * var1.d.e;
      float var4 = var1.d.f * var1.d.c;
      float var5 = var1.d.d * var1.d.c;
      float var6 = var1.d.e * var1.d.e;
      float var7 = var1.d.f * var1.d.e;
      float var8 = var1.d.d * var1.d.e;
      float var9 = var1.d.f * var1.d.f;
      float var10 = var1.d.d * var1.d.f;
      float var11 = var1.d.d * var1.d.d;
      this.s = var2 + var6 - var11 - var9;
      this.r = var5 + var7 + var5 + var7;
      this.k = var8 - var4 - var4 + var8;
      this.f = var7 - var5 - var5 + var7;
      this.n = var2 + var9 - var6 - var11;
      this.j = var10 + var10 + var3 + var3;
      this.o = var8 + var8 + var4 + var4;
      this.i = var10 - var3 - var3 + var10;
      this.g = var2 + var11 - var9 - var6;
      this.e = 0.0F;
      this.m = 0.0F;
      this.l = 0.0F;
      this.h = var1.b.g;
      this.d = var1.b.f;
      this.p = var1.b.h;
      this.q = 1.0F;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Lrz;I)V"
   )
   private void d(gL var1) {
      this.m = var1.n;
      this.r = var1.m;
      this.l = var1.i;
      this.i = var1.m;
      this.s = var1.s;
      this.j = var1.f;
      this.g = var1.k;
      this.k = var1.k;
      this.o = var1.d;
      this.i = var1.d;
      this.l = var1.s;
      this.j = var1.k;
      this.r = var1.h;
      this.n = var1.l;
      this.n = var1.r;
      this.o = var1.e;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "20"
   )
   public final void b() {
      this.s = 0.0F;
      this.r = 0.0F;
      this.k = 0.0F;
      this.l = 0.0F;
      this.f = 0.0F;
      this.n = 0.0F;
      this.j = 0.0F;
      this.m = 0.0F;
      this.o = 0.0F;
      this.i = 0.0F;
      this.g = 0.0F;
      this.e = 0.0F;
      this.h = 0.0F;
      this.d = 0.0F;
      this.p = 0.0F;
      this.q = 0.0F;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "776678911"
   )
   public final void c() {
      synchronized(c) {
         if (b < t) {
            c[++b - 1] = this;
         }

      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(FFFI)Lre;",
      garbageValue = "292154950"
   )
   public final go a(float var1, float var2, float var3) {
      var2 = 1.0F / (this.q + this.l * var1 + this.m * 0.0F + var3 * this.e);
      return hv.a((var1 * this.s + 0.0F * this.f + this.o * var3 + this.h) * var2, var2 * (var1 * this.r + this.n * 0.0F + this.i * var3 + this.d), var2 * (var3 * this.g + var1 * this.k + this.j * 0.0F + this.p));
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Lrz;B)V",
      garbageValue = "92"
   )
   public final void b(gL var1) {
      this.s += var1.s;
      this.r += var1.r;
      this.k += var1.k;
      this.l += var1.l;
      this.f += var1.f;
      this.n += var1.n;
      this.j += var1.j;
      this.m += var1.m;
      this.o += var1.o;
      this.i += var1.i;
      this.g += var1.g;
      this.e += var1.e;
      this.h += var1.h;
      this.d += var1.d;
      this.p += var1.p;
      this.q += var1.q;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(FFFB)F",
      garbageValue = "-76"
   )
   public final float b(float var1, float var2, float var3) {
      return var1 * this.s + this.f * var2 + this.o * var3 + this.h;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1505125459"
   )
   public final void d() {
      float var1 = 1.0F / this.f();
      float var2 = (this.d * this.j * this.e + (this.g * this.n * this.q - this.p * this.e * this.n - this.i * this.j * this.q) + this.i * this.m * this.p - this.d * this.m * this.g) * var1;
      float var3 = (-this.r * this.g * this.q + this.p * this.e * this.r + this.i * this.k * this.q - this.k * this.e * this.d - this.l * this.i * this.p + this.l * this.g * this.d) * var1;
      float var4 = (this.n * this.l * this.p + this.d * this.m * this.k + (this.q * this.j * this.r - this.p * this.m * this.r - this.q * this.k * this.n) - this.d * this.l * this.j) * var1;
      float var5 = (-this.r * this.j * this.e + this.g * this.r * this.m + this.e * this.n * this.k - this.m * this.k * this.i - this.n * this.l * this.g + this.i * this.j * this.l) * var1;
      float var6 = var1 * (this.h * this.g * this.m + (this.q * this.o * this.j + this.e * this.f * this.p + this.g * -this.f * this.q - this.h * this.j * this.e - this.m * this.o * this.p));
      float var7 = (this.h * this.k * this.e + (this.q * this.s * this.g - this.p * this.e * this.s - this.k * this.o * this.q) + this.p * this.o * this.l - this.h * this.g * this.l) * var1;
      float var8 = var1 * (this.h * this.j * this.l + (this.f * this.k * this.q + this.p * this.m * this.s + this.q * -this.s * this.j - this.h * this.m * this.k - this.l * this.f * this.p));
      float var9 = (this.g * this.l * this.f + this.j * this.s * this.e - this.s * this.m * this.g - this.e * this.f * this.k + this.o * this.m * this.k - this.o * this.j * this.l) * var1;
      float var10 = (this.d * this.o * this.m + this.i * this.f * this.q - this.d * this.f * this.e - this.q * this.n * this.o + this.n * this.e * this.h - this.m * this.i * this.h) * var1;
      float var11 = var1 * (this.i * this.l * this.h + (this.q * this.i * -this.s + this.d * this.e * this.s + this.r * this.o * this.q - this.h * this.e * this.r - this.o * this.l * this.d));
      float var12 = (this.h * this.m * this.r + (this.q * this.n * this.s - this.d * this.m * this.s - this.r * this.f * this.q) + this.f * this.l * this.d - this.l * this.n * this.h) * var1;
      float var13 = (this.o * this.n * this.l + (this.s * this.m * this.i + this.e * -this.s * this.n + this.e * this.r * this.f - this.r * this.m * this.o - this.i * this.f * this.l)) * var1;
      float var14 = (this.p * this.n * this.o + this.d * this.f * this.g + -this.f * this.i * this.p - this.n * this.g * this.h - this.d * this.o * this.j + this.h * this.j * this.i) * var1;
      float var15 = (this.k * this.o * this.d + this.h * this.g * this.r + (this.i * this.s * this.p - this.d * this.g * this.s - this.p * this.r * this.o) - this.h * this.i * this.k) * var1;
      float var16 = var1 * (this.k * this.n * this.h + (this.p * -this.s * this.n + this.d * this.j * this.s + this.p * this.f * this.r - this.r * this.j * this.h - this.k * this.f * this.d));
      var1 *= this.o * this.j * this.r + (this.g * this.s * this.n - this.s * this.j * this.i - this.f * this.r * this.g) + this.i * this.f * this.k - this.o * this.k * this.n;
      this.s = var2;
      this.r = var3;
      this.k = var4;
      this.l = var5;
      this.f = var6;
      this.n = var7;
      this.j = var8;
      this.m = var9;
      this.o = var10;
      this.i = var11;
      this.g = var12;
      this.e = var13;
      this.h = var14;
      this.d = var15;
      this.p = var16;
      this.q = var1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(FFFB)V",
      garbageValue = "113"
   )
   public final void c(float var1, float var2, float var3) {
      this.a();
      this.s = var1;
      this.n = var2;
      this.g = var3;
   }

   @ObfuscatedName("av")
   private void b(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.f + var3 * this.p + var1 * this.i + var2 * this.h;
      var4[1] = this.e + this.i * var1 + var2 * this.l + var3 * this.o;
      var4[2] = this.f * var3 + var2 * this.i + this.i * var1 + this.i;
      if (var4.length > 3) {
         var4[3] = var3 * this.q + var2 * this.o + var1 * this.r + this.n;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)F",
      garbageValue = "1418601169"
   )
   private float f() {
      return this.o * this.k * this.m * this.d + this.k * this.f * this.i * this.q + this.h * this.r * this.m * this.g + (this.e * this.f * this.r * this.p + (this.i * this.m * this.s * this.p + this.d * this.s * this.j * this.e + (this.q * this.s * this.n * this.g - this.p * this.e * this.s * this.n - this.q * this.s * this.j * this.i) - this.d * this.g * this.s * this.m - this.q * this.g * this.f * this.r) + this.q * this.j * this.r * this.o - this.r * this.j * this.e * this.h - this.m * this.r * this.o * this.p) - this.d * this.e * this.k * this.f - this.n * this.k * this.o * this.q + this.e * this.k * this.n * this.h - this.k * this.m * this.i * this.h - this.i * this.l * this.f * this.p + this.d * this.f * this.l * this.g + this.p * this.o * this.n * this.l - this.g * this.n * this.l * this.h - this.d * this.o * this.j * this.l + this.h * this.l * this.j * this.i;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(Lrg;I)V",
      garbageValue = "1887143324"
   )
   public final void a(gq var1) {
      this.s = var1.k;
      this.r = var1.m;
      this.k = var1.h;
      this.l = 0.0F;
      this.f = var1.f;
      this.n = var1.c;
      this.j = var1.n;
      this.m = 0.0F;
      this.o = var1.l;
      this.i = var1.e;
      this.g = var1.j;
      this.e = 0.0F;
      this.h = var1.d;
      this.d = var1.i;
      this.p = var1.g;
      this.q = 1.0F;
   }

   @ObfuscatedName("kt")
   public final void a(float var1, float var2, float var3, float[] var4) {
      a(this, var1, var2, var3, var4, (byte)0);
   }

   public final String toString() {
      return "Mat4{m0=" + this.s + ", m1=" + this.r + ", m2=" + this.k + ", m3=" + this.l + ", m4=" + this.f + ", m5=" + this.n + ", m6=" + this.j + ", m7=" + this.m + ", m8=" + this.o + ", m9=" + this.i + ", m10=" + this.g + ", m11=" + this.e + ", m12=" + this.h + ", m13=" + this.d + ", m14=" + this.p + ", m15=" + this.q + "}";
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         gL var2;
         return Float.compare((var2 = (gL)var1).s, this.s) == 0 && Float.compare(var2.r, this.r) == 0 && Float.compare(var2.k, this.k) == 0 && Float.compare(var2.l, this.l) == 0 && Float.compare(var2.f, this.f) == 0 && Float.compare(var2.n, this.n) == 0 && Float.compare(var2.j, this.j) == 0 && Float.compare(var2.m, this.m) == 0 && Float.compare(var2.o, this.o) == 0 && Float.compare(var2.i, this.i) == 0 && Float.compare(var2.g, this.g) == 0 && Float.compare(var2.e, this.e) == 0 && Float.compare(var2.h, this.h) == 0 && Float.compare(var2.d, this.d) == 0 && Float.compare(var2.p, this.p) == 0 && Float.compare(var2.q, this.q) == 0;
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return Objects.hash(new Object[]{this.s, this.r, this.k, this.l, this.f, this.n, this.j, this.m, this.o, this.i, this.g, this.e, this.h, this.d, this.p, this.q});
   }

   @ObfuscatedName("ud")
   public final float d(float var1, float var2, float var3) {
      return a(this, var1, var2, var3, (byte)108);
   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      signature = "()Lrz;"
   )
   public static gL e() {
      synchronized(c) {
         if (b == 0) {
            return new gL();
         } else {
            gL var1;
            (var1 = c[--b]).a();
            return var1;
         }
      }
   }

   @ObfuscatedName("mq")
   @ObfuscatedSignature(
      signature = "(Lrz;FFFB)F"
   )
   public static float a(gL var0, float var1, float var2, float var3, byte var4) {
      return var0 == null ? var0.e(var1, var1, var1) : var0.g * var3 + var0.k * var1 + var0.j * var2 + var0.p;
   }

   @ObfuscatedName("ns")
   @ObfuscatedSignature(
      signature = "(Lrz;FFFFI)V"
   )
   public static void a(gL var0, float var1, float var2, float var3, float var4, int var5) {
      var0.s = var1;
      var0.r = 0.0F;
      var0.k = 0.0F;
      var0.l = 0.0F;
      var0.f = 0.0F;
      var0.n = var2;
      var0.j = 0.0F;
      var0.m = 0.0F;
      var0.o = 0.0F;
      var0.i = 0.0F;
      var0.g = var3;
      var0.e = 0.0F;
      var0.h = 0.0F;
      var0.d = 0.0F;
      var0.p = 0.0F;
      var0.q = var4;
   }

   @ObfuscatedName("ok")
   @ObfuscatedSignature(
      signature = "(Lrz;Lrz;I)V"
   )
   public static void a(gL var0, gL var1, int var2) {
      if (var0 == null) {
         var0.d(var0);
      } else {
         var0.s = var1.s;
         var0.r = var1.r;
         var0.k = var1.k;
         var0.l = var1.l;
         var0.f = var1.f;
         var0.n = var1.n;
         var0.j = var1.j;
         var0.m = var1.m;
         var0.o = var1.o;
         var0.i = var1.i;
         var0.g = var1.g;
         var0.e = var1.e;
         var0.h = var1.h;
         var0.d = var1.d;
         var0.p = var1.p;
         var0.q = var1.q;
      }
   }

   @ObfuscatedName("wa")
   @ObfuscatedSignature(
      signature = "(Lrz;FI)V"
   )
   public static void a(gL var0, float var1, int var2) {
      if (var0 == null) {
         var0.c(var1, var1, var1);
      }

      var0.c(var1, var1, var1);
   }

   @ObfuscatedName("ww")
   @ObfuscatedSignature(
      signature = "(Lrz;FFF[FB)V"
   )
   public static void a(gL var0, float var1, float var2, float var3, float[] var4, byte var5) {
      if (var0 == null) {
         var0.b(var1, var1, var1, var4);
      } else {
         var4[0] = var0.h + var3 * var0.o + var1 * var0.s + var2 * var0.f;
         var4[1] = var0.d + var0.r * var1 + var2 * var0.n + var3 * var0.i;
         var4[2] = var0.g * var3 + var2 * var0.j + var0.k * var1 + var0.p;
         if (var4.length > 3) {
            var4[3] = var3 * var0.e + var2 * var0.m + var1 * var0.l + var0.q;
         }

      }
   }

   @ObfuscatedName("wy")
   @ObfuscatedSignature(
      signature = "(Lrz;)Lrz;"
   )
   public static gL c(gL var0) {
      synchronized(c) {
         if (b == 0) {
            return new gL(var0);
         } else {
            gL var2;
            a(var2 = c[--b], var0, -1662681798);
            return var2;
         }
      }
   }

   static {
      c = new gL[16];
      b = 0;
   }
}
