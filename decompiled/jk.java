package osrs;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wt")
public class jk extends hR {
   @ObfuscatedName("ag")
   public static long[] a = new long[256];
   @ObfuscatedName("au")
   public static int[] b = new int[256];
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1275301079
   )
   public int c;
   @ObfuscatedName("ar")
   public byte[] d;

   public jk(int var1, boolean var2) {
      boolean var3 = true;
      short var4 = 419;
      this.b();
      this.d = eJ.a(var4, var3);
      this.c = 0;
   }

   public jk(int var1) {
      this.d = fs.b(var1);
      this.c = 0;
   }

   public jk(byte[] var1) {
      this.d = var1;
      this.c = 0;
   }

   @ObfuscatedName("xk")
   public final int a() {
      return a(this, -1039512213);
   }

   @ObfuscatedName("aa")
   public final void a(int var1) {
      this.c = var1 * 1396955417 * -1275301079;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1494039360"
   )
   void b() {
      if (this.d != null) {
         iY.a(this.d);
      }

      this.d = null;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "71"
   )
   public final void b(int var1) {
      this.d[++this.c - 1] = (byte)var1;
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "15"
   )
   public final void c(int var1) {
      this.d[++this.c - 1] = (byte)(var1 >> 24);
      this.d[++this.c - 1] = (byte)(var1 >> 16);
      this.d[++this.c - 1] = (byte)(var1 >> 8);
      this.d[++this.c - 1] = (byte)var1;
   }

   @ObfuscatedName("cb")
   private int N() {
      this.c += 4;
      return ((this.d[this.c - 3] & 255) << 16) + (this.d[this.c - 1] & 255) + ((this.d[this.c - 2] & 255) << 8) + ((this.d[this.c - 4] & 255) << 24);
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1107577599"
   )
   public final int c() {
      this.c += 2;
      int var1;
      if ((var1 = (this.d[this.c - 1] & 255) + ((this.d[this.c - 2] & 255) << 8)) > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("ce")
   private int O() {
      return this.d[++this.c - 1] & 255;
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1932272012"
   )
   public final void a(byte[] var1, int var2, int var3) {
      for(var2 = 0; var2 < var3; ++var2) {
         this.d[++this.c - 1] = var1[var2];
      }

   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-12"
   )
   private void r(int var1) {
      while(var1 < 0 || var1 > 127) {
         this.b(128 | var1 & 127);
         var1 >>>= 7;
      }

      this.b(var1);
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1835463653"
   )
   public final int d() {
      this.c += 2;
      return (this.d[this.c - 1] & 255) + ((this.d[this.c - 2] & 255) << 8);
   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "15"
   )
   public final void d(int var1) {
      this.d[++this.c - 1] = (byte)(var1 >> 8);
      this.d[++this.c - 1] = (byte)var1;
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "1687005960"
   )
   public final long e() {
      long var1 = (long)d(this, 1687107415) & 4294967295L;
      return ((long)d(this, 1687107415) & 4294967295L) + (var1 << 32);
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "32"
   )
   public final int f() {
      this.c += 3;
      return ((this.d[this.c - 3] & 255) << 16) + (this.d[this.c - 1] & 255) + ((this.d[this.c - 2] & 255) << 8);
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "587875902"
   )
   public final byte g() {
      return (byte)(128 - this.d[++this.c - 1]);
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "53"
   )
   public final void e(int var1) {
      var1 = var1 << 1 ^ var1 >> 31;
      this.r(var1);
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "5488"
   )
   public final void a(String var1) {
      if (var1.indexOf(0) >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.d[++this.c - 1] = 0;
         this.c += be.a(var1, 0, var1.length(), this.d, this.c);
         this.d[++this.c - 1] = 0;
      }
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-681352197"
   )
   public final void f(int var1) {
      this.d[++this.c - 1] = (byte)(var1 >> 8);
      this.d[++this.c - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "86"
   )
   public final void g(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.b(var1);
      } else if (var1 >= 0 && var1 < 32768) {
         this.d(var1 + '耀');
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("cu")
   public final void a(long var1) {
      this.d[++this.c - 1] = (byte)((int)(var1 >> 56));
      this.d[++this.c - 1] = (byte)((int)(var1 >> 48));
      this.d[++this.c - 1] = (byte)((int)(var1 >> 40));
      this.d[++this.c - 1] = (byte)((int)(var1 >> 32));
      this.d[++this.c - 1] = (byte)((int)(var1 >> 24));
      this.d[++this.c - 1] = (byte)((int)(var1 >> 16));
      this.d[++this.c - 1] = (byte)((int)(var1 >> 8));
      this.d[++this.c - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "712746855"
   )
   public final int h() {
      this.c += 3;
      int var1;
      if ((var1 = ((this.d[this.c - 3] & 255) << 16) + (this.d[this.c - 1] & 255) + ((this.d[this.c - 2] & 255) << 8)) > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1683063198"
   )
   public final void h(int var1) {
      this.d[++this.c - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "1860311087"
   )
   public final void a(jk var1) {
      this.a((byte[])var1.d, 0, (int)var1.c);
   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "77"
   )
   public final void i(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.d[this.c - var1 - 2] = (byte)(var1 >> 8);
         this.d[this.c - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("da")
   @ObfuscatedSignature(
      signature = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V",
      garbageValue = "-117"
   )
   public final void a(BigInteger var1, BigInteger var2) {
      int var3 = this.c;
      this.c = 0;
      byte[] var4 = new byte[var3];
      this.b(var4, 0, var3);
      byte[] var5 = (new BigInteger(var4)).modPow(var1, var2).toByteArray();
      this.c = 0;
      this.d(var5.length);
      this.a((byte[])var5, 0, (int)var5.length);
   }

   @ObfuscatedName("db")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1620390389"
   )
   public final boolean i() {
      return (a(this, (byte)-102) & 1) == 1;
   }

   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      signature = "([IIII)V",
      garbageValue = "-1295859271"
   )
   public final void a(int[] var1, int var2, int var3) {
      int var4 = this.c;
      this.c = var2;
      var2 = (var3 - var2) / 8;

      for(var3 = 0; var3 < var2; ++var3) {
         int var5 = d(this, 1687107415);
         int var6 = d(this, 1687107415);
         int var7 = 0;

         for(int var8 = 32; var8-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7) {
            var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
            var7 += -1640531527;
         }

         this.c -= 8;
         this.c(var5);
         this.c(var6);
      }

      this.c = var4;
   }

   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1632074922"
   )
   public final int j() {
      return (this.d[this.c] & 255) < 128 ? a(this, (byte)-66) - 64 : this.d() - '쀀';
   }

   @ObfuscatedName("de")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-52"
   )
   public final String k() {
      if (this.d[this.c] == 0) {
         ++this.c;
         return null;
      } else {
         return this.p();
      }
   }

   @ObfuscatedName("df")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-195102339"
   )
   public final void j(int var1) {
      this.d[++this.c - 1] = (byte)(var1 >> 16);
      this.d[++this.c - 1] = (byte)(var1 >> 8);
      this.d[++this.c - 1] = (byte)var1;
   }

   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-840700680"
   )
   public final int n() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      do {
         var3 = a(this, (byte)-87);
         var1 |= (var3 & 127) << var2;
         var2 += 7;
      } while(var3 > 127);

      return var1;
   }

   @ObfuscatedName("di")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "-25217"
   )
   public final int o() {
      return this.d[this.c] < 0 ? d(this, 1687107415) & Integer.MAX_VALUE : this.d();
   }

   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-79"
   )
   public final String p() {
      int var1 = this.c;

      while(this.d[++this.c - 1] != 0) {
      }

      int var2;
      return (var2 = this.c - var1 - 1) == 0 ? "" : osrs.ch.a(this.d, var1, var2);
   }

   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      signature = "(B)F",
      garbageValue = "72"
   )
   public final float q() {
      return Float.intBitsToFloat(d(this, 1687107415));
   }

   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-53317489"
   )
   public final int r() {
      int var1 = 0;

      int var2;
      for(var2 = a(this, 1875497734); var2 == 32767; var2 = a(this, -35406132)) {
         var1 += 32767;
      }

      return var1 + var2;
   }

   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-2"
   )
   public final int s() {
      byte var1 = this.d[++this.c - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.d[++this.c - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "128"
   )
   public final boolean t() {
      this.c -= 4;
      byte[] var1 = this.d;
      int var2 = this.c;
      int var3 = -1;

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ b[(var3 ^ var1[var4]) & 255];
      }

      var3 = ~var3;
      var4 = d(this, 1687107415);
      return var3 == var4;
   }

   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1872360278"
   )
   public final int u() {
      if (this.d[this.c] < 0) {
         return d(this, 1687107415) & Integer.MAX_VALUE;
      } else {
         int var1;
         return (var1 = this.d()) == 32767 ? -1 : var1;
      }
   }

   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      signature = "([BIIS)V",
      garbageValue = "255"
   )
   public final void b(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.d[++this.c - 1];
      }

   }

   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "6"
   )
   public final int v() {
      int var1;
      return (var1 = this.n()) >>> 1 ^ -(var1 & 1);
   }

   @ObfuscatedName("du")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "1063120485"
   )
   public final String w() {
      if (this.d[++this.c - 1] != 0) {
         throw new IllegalStateException("");
      } else {
         int var1 = this.c;

         while(this.d[++this.c - 1] != 0) {
         }

         int var2;
         return (var2 = this.c - var1 - 1) == 0 ? "" : osrs.ch.a(this.d, var1, var2);
      }
   }

   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-49"
   )
   public final int x() {
      return (this.d[this.c] & 255) < 128 ? a((jk)this, (byte)60) - 1 : this.d() - '老';
   }

   @ObfuscatedName("dy")
   private int P() {
      return (this.d[this.c] & 255) < 128 ? a((jk)this, (byte)77) : this.n() - '耀';
   }

   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1949010863"
   )
   public final void k(int var1) {
      this.d[++this.c - 1] = (byte)(var1 >> 16);
      this.d[++this.c - 1] = (byte)var1;
      this.d[++this.c - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "48"
   )
   public final int y() {
      this.c += 3;
      int var1;
      if ((var1 = ((this.d[this.c - 1] & 255) << 8) + ((this.d[this.c - 3] & 255) << 16) + (this.d[this.c - 2] & 255)) > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedName("ec")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1438347912"
   )
   public final void l(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.d[this.c - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-408082718"
   )
   public final int z() {
      this.c += 4;
      return (this.d[this.c - 4] & 255) + ((this.d[this.c - 3] & 255) << 8) + ((this.d[this.c - 2] & 255) << 16) + ((this.d[this.c - 1] & 255) << 24);
   }

   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      signature = "(B)B",
      garbageValue = "41"
   )
   public final byte A() {
      return (byte)(this.d[++this.c - 1] - 128);
   }

   @ObfuscatedName("ej")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-114"
   )
   public final void m(int var1) {
      this.d[++this.c - 1] = (byte)var1;
      this.d[++this.c - 1] = (byte)(var1 >> 8);
      this.d[++this.c - 1] = (byte)(var1 >> 16);
      this.d[++this.c - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedName("el")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1206435127"
   )
   public final void n(int var1) {
      this.d[++this.c - 1] = (byte)(128 - var1);
   }

   @ObfuscatedName("em")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "587875902"
   )
   public final byte B() {
      return this.d[++this.c - 1];
   }

   @ObfuscatedName("en")
   private void a(int var1, int var2) {
      if (var1 < 0) {
         if (var2 < 861474562) {
            throw new IllegalArgumentException();
         }
      } else {
         this.d[this.c - var1 - 4] = (byte)(var1 >> 24);
         this.d[this.c - var1 - 3] = (byte)(var1 >> 16);
         this.d[this.c - var1 - 2] = (byte)(var1 >> 8);
         this.d[this.c - var1 - 1] = (byte)var1;
      }

   }

   @ObfuscatedName("eo")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-2"
   )
   public final int C() {
      this.c += 3;
      return ((this.d[this.c - 1] & 255) << 8) + ((this.d[this.c - 3] & 255) << 16) + (this.d[this.c - 2] & 255);
   }

   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1763504322"
   )
   public final int D() {
      return 128 - this.d[++this.c - 1] & 255;
   }

   @ObfuscatedName("eq")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1956231952"
   )
   public final int E() {
      this.c += 2;
      int var1;
      if ((var1 = ((this.d[this.c - 1] & 255) << 8) + (this.d[this.c - 2] & 255)) > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("es")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1970919917"
   )
   public final int F() {
      this.c += 2;
      int var1;
      if ((var1 = ((this.d[this.c - 1] & 255) << 8) + (this.d[this.c - 2] - 128 & 255)) > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("et")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-677480771"
   )
   public final int G() {
      return this.d[++this.c - 1] - 128 & 255;
   }

   @ObfuscatedName("eu")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "820305521"
   )
   public final int H() {
      this.c += 3;
      int var1;
      if ((var1 = (this.d[this.c - 3] & 255) + ((this.d[this.c - 2] & 255) << 8) + ((this.d[this.c - 1] & 255) << 16)) > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedName("ev")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1199063103"
   )
   public final int I() {
      this.c += 4;
      return ((this.d[this.c - 2] & 255) << 24) + ((this.d[this.c - 4] & 255) << 8) + (this.d[this.c - 3] & 255) + ((this.d[this.c - 1] & 255) << 16);
   }

   @ObfuscatedName("ex")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-31632026"
   )
   public final void o(int var1) {
      this.d[++this.c - 1] = (byte)(var1 + 128);
      this.d[++this.c - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("ez")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1913885009"
   )
   public final int J() {
      this.c += 3;
      return (this.d[this.c - 1] & 255) + ((this.d[this.c - 3] & 255) << 8) + ((this.d[this.c - 2] & 255) << 16);
   }

   @ObfuscatedName("jh")
   public final int p(int var1) {
      var1 = cW.a(this.d, var1, this.c * -1574207335);
      this.c(var1);
      return var1;
   }

   @ObfuscatedName("jl")
   public final int K() {
      return this.c * 1396955417 * -1275301079;
   }

   @ObfuscatedName("jt")
   public final int q(int var1) {
      var1 = cW.a(this.d, var1, this.c * 1632282644);
      this.c(var1);
      return var1;
   }

   @ObfuscatedName("mv")
   public final int L() {
      return this.r();
   }

   @ObfuscatedName("qy")
   public final int M() {
      return a((jk)this, (byte)2);
   }

   @ObfuscatedName("xb")
   @ObfuscatedSignature(
      signature = "(Lwt;Ljava/lang/String;I)V"
   )
   public static void a(jk var0, String var1, int var2) {
      if (var0 == null) {
         if (var1.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
         }

         var0.c += be.a(var1, 0, var1.length(), var0.d, var0.c);
         var0.d[++var0.c - 1] = 0;
      }

      if (var1.indexOf(0) >= 0) {
         throw new IllegalArgumentException("");
      } else {
         var0.c += be.a(var1, 0, var1.length(), var0.d, var0.c);
         var0.d[++var0.c - 1] = 0;
      }
   }

   @ObfuscatedName("xf")
   @ObfuscatedSignature(
      signature = "(Lwt;I)I"
   )
   public static int a(jk var0, int var1) {
      if (var0 == null) {
         return var0.P();
      } else {
         return (var0.d[var0.c] & 255) < 128 ? a((jk)var0, (byte)77) : var0.d() - '耀';
      }
   }

   @ObfuscatedName("xo")
   @ObfuscatedSignature(
      signature = "(Lwt;B)I"
   )
   public static int a(jk var0, byte var1) {
      return var0 == null ? var0.O() : var0.d[++var0.c - 1] & 255;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lwt;I)I"
   )
   public static int a(jo var0, int var1) {
      if (var0 == null) {
         var0.c += 4;
         int var10000 = (var0.d[var0.c - 4] & 255) + ((var0.d[var0.c - 3] & 255) << 8) + ((var0.d[var0.c - 2] & 255) << 16) + ((var0.d[var0.c - 1] & 255) << 24);
      }

      var0.c += 3;
      int var2;
      if ((var2 = ((var0.d[var0.c - 2] & 255) << 16) + (var0.d[var0.c - 1] & 255) + ((var0.d[var0.c - 3] & 255) << 8)) > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "(Lwt;Ljava/lang/CharSequence;I)V"
   )
   public static void a(jk var0, CharSequence var1, int var2) {
      var2 = gZ.a(var1);
      var0.d[++var0.c - 1] = 0;
      b(var0, var2);
      var0.c += hN.a(var0.d, var0.c, var1);
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      signature = "(Lwt;II)I",
      garbageValue = "1236951337"
   )
   public static int b(jo var0, int var1) {
      if (var0 == null) {
         int var3 = cW.a(var0.d, var1, var0.c);
         var0.g(var3);
      }

      var1 = cW.a(var0.d, var1, var0.c);
      var0.c(var1);
      return var1;
   }

   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      signature = "(Lwt;II)V",
      garbageValue = "-34602821"
   )
   public static void b(jk var0, int var1) {
      if (var0 == null) {
         var0.a(var1, var1);
      }

      if ((var1 & -128) != 0) {
         if ((var1 & -16384) != 0) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  var0.b(var1 >>> 28 | 128);
               }

               var0.b(var1 >>> 21 | 128);
            }

            var0.b(var1 >>> 14 | 128);
         }

         var0.b(var1 >>> 7 | 128);
      }

      var0.b(var1 & 127);
   }

   @ObfuscatedName("ej")
   @ObfuscatedSignature(
      signature = "(Lwt;I)I"
   )
   public static int c(jo var0, int var1) {
      if (var0 == null) {
         int var10000 = 0 - var0.d[++var0.c - 1] & 255;
      }

      return 0 - var0.d[++var0.c - 1] & 255;
   }

   @ObfuscatedName("ev")
   @ObfuscatedSignature(
      signature = "(Lwt;I)Ljava/lang/String;"
   )
   public static String c(jk var0, int var1) {
      if (var0.d[++var0.c - 1] != 0) {
         throw new IllegalStateException("");
      } else if ((var1 = var0.s()) + var0.c > var0.d.length) {
         throw new IllegalStateException("");
      } else {
         String var2 = dA.a(var0.d, var0.c, var1);
         var0.c += var1;
         return var2;
      }
   }

   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      signature = "(Lwt;J)V"
   )
   public static void a(jk var0, long var1) {
      var0.d[++var0.c - 1] = (byte)((int)(var1 >> 40));
      var0.d[++var0.c - 1] = (byte)((int)(var1 >> 32));
      var0.d[++var0.c - 1] = (byte)((int)(var1 >> 24));
      var0.d[++var0.c - 1] = (byte)((int)(var1 >> 16));
      var0.d[++var0.c - 1] = (byte)((int)(var1 >> 8));
      var0.d[++var0.c - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "(Lwt;[BIII)V",
      garbageValue = "-1635215085"
   )
   public static void a(jo var0, byte[] var1, int var2, int var3) {
      if (var0 == null) {
         byte var6 = 0;
         byte var5 = 0;
         byte[] var4 = var1;
         jo var7 = var0;

         for(int var8 = var6 + var5 - 1; var8 >= var5; --var8) {
            var4[var8] = var7.d[++var7.c - 1];
         }
      }

      for(var2 = var3 - 1; var2 >= 0; --var2) {
         var1[var2] = var0.d[++var0.c - 1];
      }

   }

   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      signature = "(Lwt;II)V",
      garbageValue = "-2096512444"
   )
   public static void d(jo var0, int var1) {
      if (var0 == null) {
         (var0 = var0).d[++var0.c - 1] = (byte)(0 - var1);
      } else {
         var0.d[++var0.c - 1] = (byte)(0 - var1);
      }
   }

   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      signature = "(Lwt;I)I"
   )
   public static int e(jo var0, int var1) {
      if (var0 == null) {
         var0.c += 4;
         int var10000 = ((var0.d[var0.c - 2] & 255) << 24) + ((var0.d[var0.c - 4] & 255) << 8) + (var0.d[var0.c - 3] & 255) + ((var0.d[var0.c - 1] & 255) << 16);
      }

      var0.c += 2;
      int var2;
      if ((var2 = ((var0.d[var0.c - 2] & 255) << 8) + (var0.d[var0.c - 1] - 128 & 255)) > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      signature = "(Lwt;B)I"
   )
   public static int a(jo var0, byte var1) {
      if (var0 == null) {
         var0.c += 2;
         return ((var0.d[var0.c - 1] & 255) << 8) + (var0.d[var0.c - 2] & 255);
      } else {
         var0.c += 2;
         return (var0.d[var0.c - 2] & 255) + ((var0.d[var0.c - 1] & 255) << 8);
      }
   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      signature = "(Lwt;I)I"
   )
   public static int d(jk var0, int var1) {
      if (var0 == null) {
         var0.N();
      }

      var0.c += 4;
      return ((var0.d[var0.c - 2] & 255) << 8) + ((var0.d[var0.c - 4] & 255) << 24) + ((var0.d[var0.c - 3] & 255) << 16) + (var0.d[var0.c - 1] & 255);
   }

   @ObfuscatedName("iz")
   @ObfuscatedSignature(
      signature = "(Lwt;B)I"
   )
   public static int b(jo var0, byte var1) {
      if (var0 == null) {
         var0.c += 3;
         return ((var0.d[var0.c - 3] & 255) << 16) + (var0.d[var0.c - 1] & 255) + ((var0.d[var0.c - 2] & 255) << 8);
      } else {
         var0.c += 2;
         return (var0.d[var0.c - 2] - 128 & 255) + ((var0.d[var0.c - 1] & 255) << 8);
      }
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      signature = "(Lwt;I)I"
   )
   public static int f(jo var0, int var1) {
      if (var0 == null) {
         int var2 = cW.a(var0.d, var1, var0.c * 1632282644);
         var0.b(var2);
      }

      var0.c += 2;
      return ((var0.d[var0.c - 2] & 255) << 8) + (var0.d[var0.c - 1] - 128 & 255);
   }

   @ObfuscatedName("ki")
   @ObfuscatedSignature(
      signature = "(Lwt;II)V",
      garbageValue = "1700014651"
   )
   public static void g(jo var0, int var1) {
      if (var0 == null) {
         (var0 = var0).d[++var0.c - 1] = (byte)var1;
         var0.d[++var0.c - 1] = (byte)(var1 >> 8);
      } else {
         var0.d[++var0.c - 1] = (byte)var1;
         var0.d[++var0.c - 1] = (byte)(var1 >> 8);
      }
   }

   @ObfuscatedName("ly")
   @ObfuscatedSignature(
      signature = "(Lwt;B)I"
   )
   public static int c(jo var0, byte var1) {
      if (var0 == null) {
         var0.c += 4;
         return ((var0.d[var0.c - 1] & 255) << 8) + ((var0.d[var0.c - 4] & 255) << 16) + (var0.d[var0.c - 2] & 255) + ((var0.d[var0.c - 3] & 255) << 24);
      } else {
         var0.c += 4;
         return ((var0.d[var0.c - 4] & 255) << 16) + (var0.d[var0.c - 2] & 255) + ((var0.d[var0.c - 1] & 255) << 8) + ((var0.d[var0.c - 3] & 255) << 24);
      }
   }

   @ObfuscatedName("mq")
   @ObfuscatedSignature(
      signature = "(Lwt;ZI)V"
   )
   public static void a(jk var0, boolean var1, int var2) {
      if (var0 == null) {
         label24: {
            byte var4;
            if (var1) {
               if (var2 <= -1471487864) {
                  break label24;
               }

               var4 = 1;
            } else {
               var4 = 0;
            }

            var0.m(var4);
         }
      }

      byte var6;
      if (var1) {
         if (var2 <= -1471487864) {
            return;
         }

         var6 = 1;
      } else {
         var6 = 0;
      }

      var0.b(var6);
   }

   @ObfuscatedName("ua")
   @ObfuscatedSignature(
      signature = "(Lwt;IB)V"
   )
   public static void a(jo var0, int var1, byte var2) {
      if (var0 == null) {
         (var0 = var0).d[++var0.c - 1] = (byte)(var1 >> 16);
         var0.d[++var0.c - 1] = (byte)(var1 >> 24);
         var0.d[++var0.c - 1] = (byte)var1;
         var0.d[++var0.c - 1] = (byte)(var1 >> 8);
      } else {
         var0.d[++var0.c - 1] = (byte)(var1 >> 16);
         var0.d[++var0.c - 1] = (byte)(var1 >> 24);
         var0.d[++var0.c - 1] = (byte)var1;
         var0.d[++var0.c - 1] = (byte)(var1 >> 8);
      }
   }

   @ObfuscatedName("vp")
   @ObfuscatedSignature(
      signature = "(Lwt;II)V",
      garbageValue = "-1716233462"
   )
   public static void h(jo var0, int var1) {
      if (var0 == null) {
         (var0 = var0).d[++var0.c - 1] = (byte)(var1 >> 16);
         var0.d[++var0.c - 1] = (byte)var1;
         var0.d[++var0.c - 1] = (byte)(var1 >> 8);
      } else {
         var0.d[++var0.c - 1] = (byte)(var1 >> 8);
         var0.d[++var0.c - 1] = (byte)var1;
         var0.d[++var0.c - 1] = (byte)(var1 >> 24);
         var0.d[++var0.c - 1] = (byte)(var1 >> 16);
      }
   }

   @ObfuscatedName("ww")
   @ObfuscatedSignature(
      signature = "(Lwt;I)B"
   )
   public static byte i(jo var0, int var1) {
      if (var0 == null) {
         byte var10000 = (byte)(0 - var0.d[++var0.c - 1]);
      }

      return (byte)(0 - var0.d[++var0.c - 1]);
   }

   static {
      int var0;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = var1;

         for(var0 = 0; var0 < 8; ++var0) {
            if ((var2 & 1) == 1) {
               var2 = var2 >>> 1 ^ -306674912;
            } else {
               var2 >>>= 1;
            }
         }

         b[var1] = var2;
      }

      for(var0 = 0; var0 < 256; ++var0) {
         long var4 = (long)var0;

         for(int var3 = 0; var3 < 8; ++var3) {
            if ((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         a[var0] = var4;
      }

   }
}
