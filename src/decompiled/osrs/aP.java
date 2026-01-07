package osrs;

import com.google.common.primitives.Doubles;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Perspective;
import net.runelite.api.clan.ClanMember;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanSettings;
import net.runelite.api.clan.ClanTitle;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public final class aP implements ClanSettings {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   public static fE a;
   @ObfuscatedName("ol")
   @ObfuscatedGetter(
      longValue = 1177452753148642601L
   )
   static long b;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      longValue = 2512164053598525247L
   )
   long c;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -89876629
   )
   public int d;
   @ObfuscatedName("ad")
   public byte e;
   @ObfuscatedName("ae")
   int[] f;
   @ObfuscatedName("af")
   public byte g;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -2050215255
   )
   private int A = 0;
   @ObfuscatedName("ah")
   public String h = null;
   @ObfuscatedName("ak")
   public byte i;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -657726603
   )
   public int j = -1;
   @ObfuscatedName("ao")
   public boolean[] k;
   @ObfuscatedName("aq")
   long[] l;
   @ObfuscatedName("ar")
   public byte m;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -4811049
   )
   public int n = -1;
   @ObfuscatedName("at")
   public byte[] o;
   @ObfuscatedName("au")
   public boolean p;
   @ObfuscatedName("av")
   public int[] q;
   @ObfuscatedName("aw")
   long[] r;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -2037407203
   )
   public int s;
   @ObfuscatedName("ay")
   public String[] t;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 620751083
   )
   public int u = 0;
   @ObfuscatedName("ba")
   public String[] v;
   @ObfuscatedName("bi")
   boolean w;
   @ObfuscatedName("bl")
   boolean x;
   @ObfuscatedName("bv")
   int[] y;
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "Lqp;"
   )
   ga z;

   @ObfuscatedSignature(
      signature = "(Lwt;)V"
   )
   public aP(jo var1) {
      jo var2 = var1;
      aP var12 = this;
      int var3;
      if ((var3 = jk.a((jk)var1, (byte)19)) > 0 && var3 <= 6) {
         int var4;
         if (((var4 = jk.a((jk)var1, (byte)78)) & 1) != 0) {
            this.x = true;
         }

         if ((var4 & 2) != 0) {
            this.w = true;
         }

         if (!this.x) {
            this.l = null;
            this.r = null;
         }

         if (!this.w) {
            this.t = null;
            this.v = null;
         }

         this.u = jk.d((jk)var1, 1687107415);
         this.A = jk.d((jk)var1, 1687107415);
         if (var3 <= 3 && this.A != 0) {
            this.A += 16912800;
         }

         this.d = var1.d();
         this.s = jk.a((jk)var1, (byte)63);
         this.h = var1.p();
         if (var3 >= 4) {
            jk.d((jk)var1, 1687107415);
         }

         this.p = jk.a((jk)var1, (byte)-67) == 1;
         this.e = var1.B();
         this.i = var1.B();
         this.m = var1.B();
         this.g = var1.B();
         if (this.d > 0) {
            if (this.x && (this.l == null || this.l.length < this.d)) {
               this.l = new long[this.d];
            }

            if (this.w && (this.t == null || this.t.length < this.d)) {
               this.t = new String[this.d];
            }

            if (this.o == null || this.o.length < this.d) {
               this.o = new byte[this.d];
            }

            if (this.f == null || this.f.length < this.d) {
               this.f = new int[this.d];
            }

            if (this.q == null || this.q.length < this.d) {
               this.q = new int[this.d];
            }

            if (this.k == null || this.k.length < this.d) {
               this.k = new boolean[this.d];
            }

            for(var4 = 0; var4 < var12.d; ++var4) {
               if (var12.x) {
                  var12.l[var4] = var2.e();
               }

               if (var12.w) {
                  var12.t[var4] = var2.k();
               }

               var12.o[var4] = var2.B();
               if (var3 >= 2) {
                  var12.f[var4] = jk.d((jk)var2, 1687107415);
               }

               if (var3 >= 5) {
                  var12.q[var4] = var2.d();
               } else {
                  var12.q[var4] = 0;
               }

               if (var3 >= 6) {
                  var12.k[var4] = jk.a((jk)var2, (byte)-57) == 1;
               } else {
                  var12.k[var4] = false;
               }
            }

            var12.b();
         }

         if (var12.s > 0) {
            if (var12.x && (var12.r == null || var12.r.length < var12.s)) {
               var12.r = new long[var12.s];
            }

            if (var12.w && (var12.v == null || var12.v.length < var12.s)) {
               var12.v = new String[var12.s];
            }

            for(var4 = 0; var4 < var12.s; ++var4) {
               if (var12.x) {
                  var12.r[var4] = var2.e();
               }

               if (var12.w) {
                  var12.v[var4] = var2.k();
               }
            }
         }

         if (var3 >= 3 && (var4 = var2.d()) > 0) {
            var12.z = new ga(var4 < 16 ? jN.a(var4) : 16);

            while(var4-- > 0) {
               int var5 = (var3 = jk.d((jk)var2, 1687107415)) & 1073741823;
               if ((var3 >>>= 30) == 0) {
                  int var10 = jk.d((jk)var2, 1687107415);
                  var12.z.b(new io(var10), (long)var5);
               } else if (var3 == 1) {
                  long var13 = var2.e();
                  var12.z.b(new ib(var13), (long)var5);
               } else if (var3 == 2) {
                  String var14 = var2.p();
                  var12.z.b(new hW(var14), (long)var5);
               }
            }
         }

      } else {
         throw new RuntimeException(var3.makeConcatWithConstants<invokedynamic>(var3));
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(JLjava/lang/String;II)V",
      garbageValue = "1118505887"
   )
   final void a(long var1, String var3, int var4) {
      if (var3 != null && var3.isEmpty()) {
         var3 = null;
      }

      if (this.x != var1 > 0L) {
         throw new RuntimeException("");
      } else if (this.w != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.l == null || this.d >= this.l.length) || var3 != null && (this.t == null || this.d >= this.t.length)) {
            this.c(this.d + 5);
         }

         if (this.l != null) {
            this.l[this.d] = var1;
         }

         if (this.t != null) {
            this.t[this.d] = var3;
         }

         if (this.j == -1) {
            this.j = this.d;
            this.o[this.d] = 126;
         } else {
            this.o[this.d] = 0;
         }

         this.f[this.d] = 0;
         this.q[this.d] = var4;
         this.k[this.d] = false;
         ++this.d;
         this.y = null;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)[I",
      garbageValue = "-975818350"
   )
   public final int[] a() {
      if (this.y == null) {
         String[] var1 = new String[this.d];
         this.y = new int[this.d];

         for(int var2 = 0; var2 < this.d; this.y[var2] = var2++) {
            var1[var2] = this.t[var2];
            if (var1[var2] != null) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         as.a(var1, this.y);
      }

      return this.y;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-24"
   )
   final void b() {
      if (this.d == 0) {
         this.j = -1;
         this.n = -1;
      } else {
         this.j = -1;
         this.n = -1;
         int var1 = 0;
         byte var2 = this.o[0];

         for(int var3 = 1; var3 < this.d; ++var3) {
            if (this.o[var3] > var2) {
               if (var2 == 125) {
                  this.n = var1;
               }

               var1 = var3;
               var2 = this.o[var3];
            } else if (this.n == -1 && this.o[var3] == 125) {
               this.n = var3;
            }
         }

         this.j = var1;
         if (this.j != -1) {
            this.o[this.j] = 126;
         }

      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/Integer;",
      garbageValue = "-204519868"
   )
   public final Integer a(int var1) {
      if (this.z == null) {
         return null;
      } else {
         hR var2;
         return (var2 = this.z.b((long)var1)) != null && var2 instanceof io ? new Integer(((io)var2).a) : null;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "0"
   )
   private void c(int var1) {
      if (this.x) {
         if (this.l != null) {
            System.arraycopy(this.l, 0, this.l = new long[var1], 0, this.d);
         } else {
            this.l = new long[var1];
         }
      }

      if (this.w) {
         if (this.t != null) {
            System.arraycopy(this.t, 0, this.t = new String[var1], 0, this.d);
         } else {
            this.t = new String[var1];
         }
      }

      if (this.o != null) {
         System.arraycopy(this.o, 0, this.o = new byte[var1], 0, this.d);
      } else {
         this.o = new byte[var1];
      }

      if (this.f != null) {
         System.arraycopy(this.f, 0, this.f = new int[var1], 0, this.d);
      } else {
         this.f = new int[var1];
      }

      if (this.q != null) {
         System.arraycopy(this.q, 0, this.q = new int[var1], 0, this.d);
      } else {
         this.q = new int[var1];
      }

      if (this.k != null) {
         System.arraycopy(this.k, 0, this.k = new boolean[var1], 0, this.d);
      } else {
         this.k = new boolean[var1];
      }
   }

   @ObfuscatedName("cs")
   private int a(int var1, int var2, int var3) {
      Integer var5;
      var1 = (var5 = this.a(var1)) == null ? -1 : var5;
      var3 = 31 - var3;
      return var1 << var3 >>> var3 + var2;
   }

   @ObfuscatedName("kx")
   public final int a(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         var1 = var1.toLowerCase();
         String[] var2 = this.t;
         int[] var3 = this.a();
         int var4 = 0;
         int var5 = var3.length - 1;

         while(var4 <= var5) {
            int var6 = var4 + var5 >>> 1;
            int var7 = var3[var6];
            int var8;
            if ((var8 = var2[var7].toLowerCase().compareTo(var1)) < 0) {
               var4 = var6 + 1;
            } else {
               if (var8 <= 0) {
                  return var7;
               }

               var5 = var6 - 1;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public final ClanTitle titleForRank(ClanRank var1) {
      if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         int var3;
         switch(var1.getRank()) {
         case -1:
            var3 = -1;
            break;
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 91:
         case 92:
         case 93:
         case 94:
         case 106:
         case 107:
         case 108:
         case 109:
         case 111:
         case 112:
         case 113:
         case 114:
         case 116:
         case 117:
         case 118:
         case 119:
         case 121:
         case 122:
         case 123:
         default:
            var3 = this.a(1, 0, 9);
            break;
         case 10:
            var3 = this.a(1, 10, 19);
            break;
         case 20:
            var3 = this.a(1, 20, 29);
            break;
         case 30:
            var3 = this.a(2, 0, 9);
            break;
         case 40:
            var3 = this.a(2, 10, 19);
            break;
         case 50:
            var3 = this.a(2, 20, 29);
            break;
         case 60:
            var3 = this.a(3, 0, 9);
            break;
         case 70:
            var3 = this.a(3, 10, 19);
            break;
         case 80:
            var3 = this.a(3, 20, 29);
            break;
         case 90:
            var3 = this.a(4, 0, 9);
            break;
         case 95:
            var3 = this.a(5, 20, 29);
            break;
         case 96:
            var3 = this.a(102, 0, 9);
            break;
         case 97:
            var3 = this.a(102, 10, 19);
            break;
         case 98:
            var3 = this.a(102, 20, 29);
            break;
         case 99:
            var3 = this.a(103, 0, 9);
            break;
         case 100:
            var3 = -2;
            break;
         case 101:
            var3 = this.a(103, 10, 19);
            break;
         case 102:
            var3 = this.a(103, 20, 29);
            break;
         case 103:
            var3 = this.a(104, 0, 9);
            break;
         case 104:
            var3 = this.a(104, 10, 19);
            break;
         case 105:
            var3 = this.a(4, 10, 19);
            break;
         case 110:
            var3 = this.a(4, 20, 29);
            break;
         case 115:
            var3 = this.a(5, 0, 9);
            break;
         case 120:
            var3 = this.a(5, 10, 19);
            break;
         case 124:
            var3 = this.a(104, 20, 29);
            break;
         case 125:
            var3 = -3;
            break;
         case 126:
            var3 = -4;
            break;
         case 127:
            var3 = -5;
         }

         if (var3 == 1023) {
            return null;
         } else {
            client var10000 = dF.c;
            String var2;
            return !(var2 = client.h(3797).getStringValue(var3)).isEmpty() ? new ClanTitle(var3, var2) : null;
         }
      }
   }

   public final ClanMember findMember(String var1) {
      int var2;
      return (var2 = this.a(var1.replace(' ', ' '))) == -1 ? null : new kp(this, var2);
   }

   public final String getName() {
      return this.h;
   }

   public final List getMembers() {
      int var1 = this.d;
      ArrayList var2 = new ArrayList(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         var2.add(new kp(this, var3));
      }

      return var2;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
      garbageValue = "-330686398"
   )
   public static String a(CharSequence var0) {
      String var1;
      if ((var1 = cb.a(bi.a(var0))) == null) {
         var1 = "";
      }

      return var1;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      signature = "(ILcr;ZB)I",
      garbageValue = "-42"
   )
   static int b(int var0) {
      if (var0 == 6754) {
         aY var5 = B.a(hE.c[--hE.e]);
         hE.n[++aU.a - 1] = var5 != null ? var5.m : "";
         return 1;
      } else {
         aY var4;
         if (var0 != 6764) {
            if (var0 == 6765) {
               var4 = B.a(hE.c[--hE.e]);
               hE.c[++hE.e - 1] = var4 != null ? var4.K : 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            hE.e -= 2;
            var4 = B.a(hE.c[hE.e]);
            int var1 = hE.c[hE.e + 1];
            hE.c[++hE.e - 1] = var4.I != null && var1 < var4.I.length ? var4.I[var1] : -1;
            hE.c[++hE.e - 1] = var4.F != null && var1 < var4.F.length ? var4.F[var1] : -1;
            return 1;
         }
      }
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      signature = "(Lgu;IJ)Z"
   )
   public static boolean a(aP var0, int var1, long var2) {
      ib var16;
      if (var0 == null) {
         hR var8 = var2;
         if (var0.z != null) {
            long var13 = (long)var1;
            if ((var2 = var0.z.b(var13)) != null) {
               if (var2 instanceof ib) {
                  var16 = (ib)var2;
                  if (var8 == var16.a) {
                     return false;
                  }

                  var16.a = (long)var8;
                  return true;
               }

               gk.a(var2);
            }
         } else {
            var0.z = new ga(4);
         }

         ga var10000 = var0.z;
         ib var10001 = new ib((long)var2);
         long var14 = (long)var1;
         ib var17 = var10001;
         var10000.b(var17, var14);
         return true;
      } else {
         if (var0.z != null) {
            hR var4;
            if ((var4 = var0.z.b((long)var1)) != null) {
               if (var4 instanceof ib) {
                  var16 = (ib)var4;
                  if (var2 == var16.a) {
                     return false;
                  }

                  var16.a = (long)var2;
                  return true;
               }

               gk.a(var4);
            }
         } else {
            var0.z = new ga(4);
         }

         var0.z.b(new ib((long)var2), (long)var1);
         return true;
      }
   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      signature = "(Lov;IIB)V",
      garbageValue = "7"
   )
   static final void a(fd var0, int var1, int var2) {
      if ((client.eX == 0 || client.eX == 3) && !dF.c.isMenuOpen()) {
         int var3;
         if ((var3 = gY.k) == 0) {
            int var11 = client.ci;
            if (client.J && var11 != 0 && gY.j >= var1 && gY.b >= var2 && gY.j < var1 + var0.getWidth() && gY.b < var2 + var0.getHeight()) {
               client.R = Doubles.constrainToRange(client.R + (double)(-var11) * 0.25D, 2.0D, 8.0D);
            }

            return;
         }

         ey var4;
         if ((var4 = var0.a(jD.a, true)) == null) {
            return;
         }

         int var9 = gY.g - var1;
         int var6 = gY.f - var2;
         if (!var4.a(var9, var6)) {
            return;
         }

         if (var3 != 1 && (I.b || var3 != 4)) {
            if (var3 == 2) {
               client.R = 4.0D;
               gY.k = 0;
               return;
            }
         } else {
            boolean var7 = true;
            hO var12;
            if ((var12 = jA.b(client.ag, -1)) == hO.a) {
               var9 -= var4.d / 2;
               var6 -= var4.b / 2;
               var1 = client.cd & 2047;
               var2 = Perspective.SINE[var1];
               var3 = (var1 = Perspective.COSINE[var1]) * var9 + var2 * var6 >> 16;
               var1 = var1 * var6 - var2 * var9 >> 16;
               float var10 = (float)client.R / 128.0F;
               var3 = (int)((float)var3 / var10);
               var1 = (int)((float)var1 / var10);
               var2 = var3 + client.do >> 7;
               var1 = client.dn - var1 >> 7;
               client.c(var2, var1, var9, var6);
               return;
            }

            if (var12 == hO.b) {
               var1 += var4.d / 2;
               var2 += var4.b / 2;
               var1 = gY.j - var1;
               client.eR = var2 = (client.a(Math.atan2((double)(gY.b - var2), (double)var1)) - 512 - client.cd + 64 & 2047) / 128;
               client.eI = 30;
               client.m(var2);
            }
         }
      }

   }

   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      signature = "(Lgu;IIIII)Z",
      garbageValue = "2134959985"
   )
   public static boolean a(aP var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         label55: {
            int var10 = (1 << var1) - 1;
            int var9 = (var1 == 31 ? -1 : (1 << var1 + 1) - 1) ^ var10;
            int var7 = var1 << var1 & var9;
            boolean var10000;
            if (var0.z != null) {
               hR var8;
               if ((var8 = var0.z.a((long)var1)) != null) {
                  if (var8 instanceof io) {
                     io var5;
                     if (((var5 = (io)var8).a & var9) == var7) {
                        var10000 = false;
                     } else {
                        var5.a &= ~var9;
                        var5.a |= var7;
                        var10000 = true;
                     }
                     break label55;
                  }

                  gk.a(var8);
               }
            } else {
               var0.z = new ga(4);
            }

            ga var27 = var0.z;
            io var10001 = new io(var7);
            long var22 = (long)var1;
            io var6 = var10001;
            var27.b(var6, var22);
            var10000 = true;
         }
      }

      int var26 = (1 << var3) - 1;
      var4 = (var4 == 31 ? -1 : (1 << var4 + 1) - 1) ^ var26;
      var2 = var2 << var3 & var4;
      if (var0.z != null) {
         hR var25;
         if ((var25 = var0.z.b((long)var1)) != null) {
            if (var25 instanceof io) {
               io var24;
               if (((var24 = (io)var25).a & var4) == var2) {
                  return false;
               }

               var24.a &= ~var4;
               var24.a |= var2;
               return true;
            }

            gk.a(var25);
         }
      } else {
         var0.z = new ga(4);
      }

      var0.z.b(new io(var2), (long)var1);
      return true;
   }

   @ObfuscatedName("lt")
   @ObfuscatedSignature(
      signature = "(Lgu;IIIIB)I"
   )
   public static int a(aP var0, int var1, int var2, int var3, int var4, byte var5) {
      if (var0 == null) {
         int var10 = (1 << var1) - 1;
         int var9 = (var1 == 31 ? -1 : (1 << var1 + 1) - 1) ^ var10;
         int var7 = var1 << var1 & var9;
         int var8;
         if (((var8 = var0.f[var1]) & var9) == var7) {
            boolean var10000 = true;
         } else {
            var8 &= ~var9;
            var0.f[var1] = var8 | var7;
         }
      }

      int var11 = (1 << var3) - 1;
      var4 = (var4 == 31 ? -1 : (1 << var4 + 1) - 1) ^ var11;
      var2 = var2 << var3 & var4;
      if (((var3 = var0.f[var1]) & var4) == var2) {
         return -1;
      } else {
         var3 &= ~var4;
         var0.f[var1] = var3 | var2;
         return var1;
      }
   }

   @ObfuscatedName("lu")
   @ObfuscatedSignature(
      signature = "(Ldl;ZLwx;B)V",
      garbageValue = "41"
   )
   static final void a(kd var0, boolean var1, jo var2) {
      int var3;
      kc var5;
      int var6;
      int var7;
      for(; var2.r(client.P.e) >= 28 && (var3 = var2.s(16)) != 65535; var5.a(var6 + ke.b, var3 + jG.aC, var7 == 1)) {
         boolean var4 = false;
         if ((var5 = (kc)var0.g.a((long)var3)) == null) {
            var5 = new kc(var3);
            gg.a(var0.g, var5, (long)var3);
            var4 = true;
         }

         var0.f.b(var3);
         var5.aF = false;
         var5.z = var0.k;
         if (var1) {
            if ((var6 = var2.s(8)) > 127) {
               var6 -= 256;
            }
         } else if ((var6 = var2.s(6)) > 31) {
            var6 -= 64;
         }

         if (var2.s(1) == 1) {
            var2.s(32);
         }

         var7 = var2.s(1);
         if (var2.s(1) == 1) {
            client.cM[++client.cH - 1] = var3;
         }

         if (var1) {
            if ((var3 = var2.s(8)) > 127) {
               var3 -= 256;
            }
         } else if ((var3 = var2.s(6)) > 31) {
            var3 -= 64;
         }

         int var8 = client.ee[var2.s(3)];
         if (var4) {
            var5.as = var5.l = var8;
         }

         aY var9 = B.a(var2.s(14));
         var5.a(var9);
         var5.aQ = var9;
         cz.a(var5);
         if (var5.ac == 0) {
            var5.l = 0;
         }
      }

      jo.j(var2, 425769829);
   }

   @ObfuscatedName("my")
   @ObfuscatedSignature(
      signature = "([Lov;Lov;ZB)V"
   )
   static void a(fd[] var0, fd var1, boolean var2, byte var3) {
      int var7;
      if (var1.B != 0) {
         var7 = var1.B;
      } else {
         var7 = var1.i * -1805166981;
      }

      int var4 = var7;
      if (var1.S != 0) {
         var7 = var1.S;
      } else {
         var7 = var1.n * -2133353239;
      }

      cf.a(var0, var1.y, var1.G, var1.m, var1.s * -744024149, var4, var7, var2);
      if (var1.bH != null) {
         cf.a(var1.bH, 0, var1.bH.length - 1, var1.m, -1, var4, var7, var2);
      }

      jR var5;
      if (var1.s * -744024149 == -1 && (var5 = (jR)gb.a(client.bT, (long)var1.m)) != null) {
         int var6 = var5.d;
         if (eu.a(jD.a, var6)) {
            cf.a(jD.a.c[var6], 0, jD.a.c[var6].length - 1, -1, -1, var4, var7, var2);
         }
      }

      int var10000 = var1.e;
   }
}
