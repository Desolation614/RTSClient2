package osrs;

import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.runelite.api.GameObject;
import net.runelite.api.Perspective;
import net.runelite.api.Scene;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.DecorativeObjectSpawned;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GroundObjectDespawned;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.WallObjectSpawned;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public class ci extends ct implements Scene {
   @ObfuscatedName("ad")
   private static int[] aP = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
   @ObfuscatedName("ae")
   public static boolean a = false;
   @ObfuscatedName("af")
   private static int[] aQ = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
   @ObfuscatedName("ag")
   private static int[] aR = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   @ObfuscatedName("ah")
   private static int[] aS = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   @ObfuscatedName("ak")
   private static int[] aT = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
   @ObfuscatedName("ar")
   private static int[] aU = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
   @ObfuscatedName("au")
   private static int[] aV = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
   @ObfuscatedName("de")
   private static int[][] aW = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   @ObfuscatedName("du")
   private static int[][] aX = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   @ObfuscatedName("er")
   private static int aY;
   @ObfuscatedName("km")
   private static int[] aZ = new int[184];
   @ObfuscatedName("le")
   private static int[] ba = new int[184];
   @ObfuscatedName("nl")
   private static boolean bb = !ci.class.desiredAssertionStatus();
   @ObfuscatedName("zb")
   public byte[][][] b;
   @ObfuscatedName("yj")
   public byte[][][] c;
   @ObfuscatedName("zi")
   @ObfuscatedSignature(
      signature = "Ldl;"
   )
   public kd d;
   @ObfuscatedName("zi")
   public int e;
   @ObfuscatedName("zu")
   public final ku[][] f;
   @ObfuscatedName("yy")
   private Set bc = new HashSet();
   @ObfuscatedName("xr")
   public int g = -1;
   @ObfuscatedName("zs")
   public int h = -1;
   @ObfuscatedName("xx")
   public final byte[] i;
   @ObfuscatedName("ab")
   final int j;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "Ljw;"
   )
   public final cy k = new cy();
   @ObfuscatedName("aq")
   final int l;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "Ljw;"
   )
   private cy bd = new cy();
   @ObfuscatedName("av")
   private int be;
   @ObfuscatedName("ax")
   private int bf;
   @ObfuscatedName("ay")
   final int m;
   @ObfuscatedName("ba")
   private int bg;
   @ObfuscatedName("bb")
   private int bh;
   @ObfuscatedName("bc")
   public int n;
   @ObfuscatedName("bd")
   private int bi;
   @ObfuscatedName("be")
   public int o;
   @ObfuscatedName("bf")
   public float p;
   @ObfuscatedName("bg")
   boolean q;
   @ObfuscatedName("bh")
   int r;
   @ObfuscatedName("bi")
   private int bj;
   @ObfuscatedName("bj")
   public boolean s;
   @ObfuscatedName("bk")
   int[][][] t;
   @ObfuscatedName("bl")
   private int bk;
   @ObfuscatedName("bm")
   public int u;
   @ObfuscatedName("bn")
   public int v;
   @ObfuscatedName("bo")
   public int w;
   @ObfuscatedName("bp")
   int x;
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "[[[Ljy;"
   )
   private cA[][][] bl;
   @ObfuscatedName("br")
   private int bm;
   @ObfuscatedName("bs")
   public float y;
   @ObfuscatedName("bt")
   int z;
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "[Ljt;"
   )
   private cv[] bn;
   @ObfuscatedName("bv")
   public int A;
   @ObfuscatedName("bw")
   public int B;
   @ObfuscatedName("bx")
   private int bo;
   @ObfuscatedName("by")
   int C;
   @ObfuscatedName("bz")
   int D;
   @ObfuscatedName("ca")
   private int bp;
   @ObfuscatedName("cb")
   int E;
   @ObfuscatedName("cc")
   private boolean bq;
   @ObfuscatedName("cd")
   private int br;
   @ObfuscatedName("ce")
   int F;
   @ObfuscatedName("cf")
   private int bs;
   @ObfuscatedName("cg")
   int G;
   @ObfuscatedName("ch")
   int H;
   @ObfuscatedName("ci")
   private int bt;
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      signature = "[Lkg;"
   )
   private cJ[] bu;
   @ObfuscatedName("ck")
   private int[][][] bv;
   @ObfuscatedName("cl")
   int I;
   @ObfuscatedName("cm")
   private int bw;
   @ObfuscatedName("cn")
   private int bx;
   @ObfuscatedName("co")
   int J;
   @ObfuscatedName("cp")
   int K;
   @ObfuscatedName("cq")
   int L;
   @ObfuscatedName("cr")
   int M;
   @ObfuscatedName("cs")
   int N;
   @ObfuscatedName("ct")
   int O;
   @ObfuscatedName("cu")
   private int by;
   @ObfuscatedName("cv")
   int P;
   @ObfuscatedName("cw")
   int Q;
   @ObfuscatedName("cx")
   int R;
   @ObfuscatedName("cy")
   int S;
   @ObfuscatedName("cz")
   private int bz;
   @ObfuscatedName("da")
   private int bA;
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      signature = "[[Ljt;"
   )
   private cv[][] bB;
   @ObfuscatedName("dc")
   int T;
   @ObfuscatedName("dd")
   int U;
   @ObfuscatedName("df")
   private int bC;
   @ObfuscatedName("dg")
   private int bD;
   @ObfuscatedName("dh")
   BitSet V;
   @ObfuscatedName("di")
   @ObfuscatedSignature(
      signature = "[Lkg;"
   )
   private cJ[] bE;
   @ObfuscatedName("dj")
   int W;
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   private fU bF;
   @ObfuscatedName("dl")
   int[] X;
   @ObfuscatedName("dm")
   int Y;
   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   private ca bG;
   @ObfuscatedName("do")
   BitSet Z;
   @ObfuscatedName("dq")
   int aa;
   @ObfuscatedName("ds")
   private int[] bH;
   @ObfuscatedName("dt")
   private int bI;
   @ObfuscatedName("dv")
   private int bJ;
   @ObfuscatedName("dw")
   private BitSet bK;
   @ObfuscatedName("dx")
   int ab;
   @ObfuscatedName("dy")
   private int bL;
   @ObfuscatedName("dz")
   BitSet ac;
   @ObfuscatedName("eh")
   public final int ad;
   @ObfuscatedName("et")
   private int bM;
   @ObfuscatedName("ey")
   private int bN;
   @ObfuscatedName("fb")
   public kB[][][] ae;
   @ObfuscatedName("fu")
   private float bO;
   @ObfuscatedName("fw")
   private int[][][] bP;
   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      signature = "[Lkg;"
   )
   public final cJ[] af;
   @ObfuscatedName("gw")
   public int[] ag;
   @ObfuscatedName("gx")
   public int ah;
   @ObfuscatedName("hf")
   private float bQ;
   @ObfuscatedName("ho")
   public int ai = 0;
   @ObfuscatedName("hp")
   private int bR;
   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      signature = "[Ljd;"
   )
   public final ce[] aj;
   @ObfuscatedName("ik")
   public kB[][][] ak;
   @ObfuscatedName("il")
   private int[] bS;
   @ObfuscatedName("im")
   private BitSet bT;
   @ObfuscatedName("jk")
   public int al;
   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      signature = "[Lkb;"
   )
   public final cE[] am;
   @ObfuscatedName("kj")
   private byte[] bU;
   @ObfuscatedName("kr")
   private float bV;
   @ObfuscatedName("kv")
   public int an;
   @ObfuscatedName("mw")
   public final int[] ao;
   @ObfuscatedName("nc")
   private ku[] bW;
   @ObfuscatedName("nf")
   @ObfuscatedSignature(
      signature = "Ljh;"
   )
   private cb bX;
   @ObfuscatedName("nj")
   public final int ap;
   @ObfuscatedName("nx")
   private List bY;
   @ObfuscatedName("ny")
   public final int aq;
   @ObfuscatedName("og")
   private int bZ;
   @ObfuscatedName("pa")
   public int[][][] ar;
   @ObfuscatedName("pt")
   private byte[] ca;
   @ObfuscatedName("ra")
   public boolean as;
   @ObfuscatedName("ri")
   private int cb;
   @ObfuscatedName("rj")
   public long[] at;
   @ObfuscatedName("rv")
   @ObfuscatedSignature(
      signature = "[Lko;"
   )
   public final cS[] au;
   @ObfuscatedName("si")
   private float cc;
   @ObfuscatedName("sj")
   public int av;
   @ObfuscatedName("ss")
   public boolean aw;
   @ObfuscatedName("th")
   private int[][][] cd;
   @ObfuscatedName("tt")
   @ObfuscatedSignature(
      signature = "[Ljn;"
   )
   public final co[] ax;
   @ObfuscatedName("tt")
   public float ay;
   @ObfuscatedName("ue")
   public short[][][] az;
   @ObfuscatedName("ug")
   public short[][][] aA;
   @ObfuscatedName("ul")
   public final int aB;
   @ObfuscatedName("uy")
   @ObfuscatedSignature(
      signature = "[Ljc;"
   )
   public final cd[] aC;
   @ObfuscatedName("vb")
   private int[][][] ce;
   @ObfuscatedName("vn")
   @ObfuscatedSignature(
      signature = "[Lka;"
   )
   public final cD[] aD;
   @ObfuscatedName("vo")
   public final int aE;
   @ObfuscatedName("vr")
   private int ci;
   @ObfuscatedName("vs")
   private int cj;
   @ObfuscatedName("wh")
   public int aF;
   @ObfuscatedName("ww")
   public int aG;

   @ObfuscatedSignature(
      signature = "(IIIIILiz;[[[I)V"
   )
   public ci(int var1, int var2, int var3, int var4, int var5, ca var6, int[][][] var7) {
      this.ak = new kB[4][var3][var4];
      this.ce = new int[4][var3][var4];
      var2 = 32 - Integer.numberOfLeadingZeros(var3 + 3);
      int var8 = 32 - Integer.numberOfLeadingZeros(var4 + 3);
      int var9;
      int var10 = (var9 = (1 << var2) * (1 << var8) << 2) << 1;
      this.aB = var8;
      this.ap = var2 + var8;
      this.aE = (1 << var2) - 1;
      this.ad = (1 << var8) - 1;
      this.aq = 1 << var2 + var8;
      this.bN = 1 << var8;
      this.cj = 1;
      this.bR = var9 - 1;
      this.cb = var9 - 2;
      this.bZ = var9 - 3;
      this.ao = new int[var9];
      this.am = new cE[var9];
      this.ax = new co[var9];
      this.au = new cS[var9];
      this.aD = new cD[var9];
      this.aj = new ce[var9];
      this.aC = new cd[var9];
      this.i = new byte[var9];
      this.af = new cJ[var9 * 5];
      this.bU = new byte[var9 * 5];
      this.ca = new byte[var9];
      this.at = new long[var9];
      this.bS = new int[var10];
      Arrays.fill(this.bS, this.bR);
      var8 = this.cb << 1;
      this.bS[var8] = this.cb;
      var8 = (this.cb << 1) + 1;
      this.bS[var8] = this.cb;
      var2 = var3 >> 3;
      var8 = var4 >> 3;
      this.f = new ku[var2][var8];
      this.bW = new ku[var2 * var8];
      this.bP = new int[4][var2][var8];
      this.cd = new int[4][var2][var8];

      ku var12;
      for(var10 = 0; var10 < var2; ++var10) {
         for(int var11 = 0; var11 < var8; var12.c = var11++) {
            (var12 = this.f[var10][var11] = new ku()).e = var10;
         }
      }

      this.bY = (List)(var1 == -1 ? new ArrayList() : Collections.emptyList());
      this.bT = var1 == -1 ? new BitSet(ej.d.length) : null;
      this.u = 0;
      this.o = 0;
      this.w = 0;
      this.B = 0;
      this.p = 1.0F;
      this.s = true;
      this.R = -1;
      this.E = -1;
      this.y = -1.0F;
      this.v = -1;
      this.n = -1;
      this.q = false;
      this.U = 0;
      this.L = 0;
      this.Q = 0;
      this.bE = new cJ[5];
      this.bq = false;
      this.by = 0;
      this.K = 0;
      this.aa = 0;
      this.bI = 4;
      this.bF = new fU();
      this.bu = new cJ[32];
      this.Y = 0;
      this.bG = osrs.ca.b;
      this.bs = 0;
      this.bJ = 0;
      this.X = new int[9];
      this.C = 4;
      this.r = var3;
      this.D = var4;
      this.bl = new cA[4][var3][var4];
      this.bv = new int[4][var3 + 1][var4 + 1];
      this.t = var7;
      this.Y = var5;
      this.bG = var6;
      this.be = var1;
      if (var1 != -1) {
         this.bf = 0;
         this.bK = null;
         this.ac = null;
         this.j = 0;
         this.l = 0;
         this.m = 0;
         this.bg = 0;
         this.Z = null;
         this.V = null;
         this.bo = 0;
         this.bk = 0;
         this.bj = 0;
      } else {
         this.bf = 8386816;
         this.bK = new BitSet(this.bf);
         this.ac = new BitSet(this.bf);
         this.j = 1048352;
         this.l = 32761;
         this.m = 181;
         this.bg = 9644832;
         this.Z = new BitSet(this.bg);
         this.V = new BitSet(this.bg);
         this.bo = 1071648;
         this.bk = 33489;
         this.bj = 183;
         this.bH = new int[this.bI];
         this.bB = new cv[this.bI][500];
         this.bn = new cv[500];
      }

      cm.a(var5);
      this.a();
   }

   @ObfuscatedName("xj")
   public final int a(int var1, int var2, int var3) {
      if (!bb && (var1 < 0 || var1 > 3)) {
         throw new AssertionError();
      } else if (bb || var2 >= 0 && var2 < this.r) {
         if (!bb && (var3 < 0 || var3 >= this.D)) {
            throw new AssertionError();
         } else {
            return var1 << this.ap | var2 << this.aB | var3;
         }
      } else {
         throw new AssertionError();
      }
   }

   @ObfuscatedName("zq")
   private void f(int var1) {
      int var2 = (var1 << 1) + 1;
      int var3 = this.bS[var2] << 1;
      var2 = var1 << 1;
      int[] var10002 = this.bS;
      var10002[var3] = var10002[var2];
      var2 = var1 << 1;
      var3 = (this.bS[var2] << 1) + 1;
      var2 = (var1 << 1) + 1;
      var10002 = this.bS;
      var10002[var3] = var10002[var2];
      var3 = (var1 << 1) + 1;
      var2 = (this.cb << 1) + 1;
      var10002 = this.bS;
      var10002[var3] = var10002[var2];
      var2 = var1 << 1;
      this.bS[var2] = this.cb;
      var2 = (var1 << 1) + 1;
      var2 = this.bS[var2] << 1;
      this.bS[var2] = var1;
      var2 = var1 << 1;
      var2 = (this.bS[var2] << 1) + 1;
      this.bS[var2] = var1;
   }

   @ObfuscatedName("ye")
   private boolean g(int var1) {
      return (this.ao[var1] & 2) != 0;
   }

   @ObfuscatedName("yh")
   @ObfuscatedSignature(
      signature = "(IIIILjm;)V"
   )
   private void a(int var1, int var2, int var3, int var4, cn var5) {
      var5.calculateBoundsCylinder();
      int var6 = var1 - var5.aI;
      var1 += var5.W;
      if (var6 < this.bP[var2][var3][var4]) {
         this.bP[var2][var3][var4] = var6;
      }

      if (var1 > this.cd[var2][var3][var4]) {
         this.cd[var2][var3][var4] = var1;
      }

   }

   @ObfuscatedName("zx")
   private void p() {
      if (this.ai != 0 && this.be == -1) {
         this.bc.clear();
         client var10000 = dF.c;
         jG var1;
         LocalPoint var2;
         int var12;
         if ((var1 = client.p()) != null && (this.ai & 1) != 0 && (var2 = var1.getLocalLocation()).isInScene()) {
            var12 = this.ce[this.d.m][var2.getSceneX() + this.e][var2.getSceneY() + this.e];
            this.bc.add(var12);
         }

         int var3;
         if (this.g >= this.an && this.g < this.av && this.h >= this.ah && this.h < this.al && (this.ai & 2) != 0) {
            var3 = this.ce[this.d.m][this.g + this.e][this.h + this.e];
            this.bc.add(var3);
         }

         if ((var2 = dF.c.getLocalDestinationLocation()) != null && var2.isInScene() && (this.ai & 4) != 0) {
            var12 = this.ce[this.d.m][var2.getSceneX() + this.e][var2.getSceneY() + this.e];
            this.bc.add(var12);
         }

         if (dF.c.getCameraPitch() < 310 && (this.ai & 8) != 0 && var1 != null) {
            var12 = var1.s >> 7;
            var3 = var1.n >> 7;
            int var11 = dF.c.getCameraX() >> 7;
            int var4 = dF.c.getCameraY() >> 7;
            if (var12 >= this.an && var3 >= this.ah && var11 >= this.an && var4 >= this.ah && var12 < this.av && var3 < this.al && var11 < this.av && var4 < this.al) {
               int var5 = Math.abs(var12 - var11);
               int var6 = Integer.compare(var12, var11);
               int var7 = -Math.abs(var3 - var4);
               int var8 = Integer.compare(var3, var4);
               int var9 = var5 + var7;

               while(var11 != var12 || var4 != var3) {
                  int var10;
                  if (this.l(this.d.m, var11 + this.e, var4 + this.e)) {
                     var10 = this.ce[this.d.m][var11 + this.e][var4 + this.e];
                     this.bc.add(var10);
                  }

                  if ((var10 = var9 << 1) >= var7) {
                     var9 += var7;
                     var11 += var6;
                  } else {
                     var9 += var5;
                     var4 += var8;
                  }
               }
            }
         }

         this.bc.remove(0);
      }

   }

   @ObfuscatedName("xr")
   @ObfuscatedSignature(
      signature = "(Ljh;Ljh;Ljr;IIIIJ)V"
   )
   private static void a(cj var0, cj var1, ct var2, int var3, int var4, int var5, int var6, long var7) {
      cn var10;
      if (var2 instanceof cn) {
         (var10 = (cn)var2).calculateBoundsCylinder();
         client.a(var0, var1, var10, var3, var4, var5, var6, var7);
      } else {
         jM var9;
         if (var2 instanceof jM && (var9 = (jM)var2).e && (var10 = var9.b()) != null) {
            var10.calculateBoundsCylinder();
            client.a(var0, var1, var10, var3, var4, var5, var6, var7);
         }

      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(IIIIIIIILjr;IZJI)Z"
   )
   private boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ct var9, int var10, boolean var11, long var12, int var14) {
      int var15 = var2 + this.e;
      int var16 = var3 + this.e;
      int var17;
      int var18;
      if (!dF.c.getCallbacks().draw(var9, false)) {
         if ((var6 & 127) == 64 && (var7 & 127) == 64 && var9 instanceof jE && ((jE)var9).q == 1) {
            var17 = var6 >> 7;
            var18 = var7 >> 7;
            this.d.h[var17][var18] = -1;
         }

         return false;
      } else {
         int var19;
         for(var17 = var15; var17 < var15 + var4; ++var17) {
            for(var18 = var16; var18 < var5 + var16; ++var18) {
               if (var17 < 0 || var18 < 0 || var17 >= this.r || var18 >= this.D) {
                  return false;
               }

               var19 = this.a(var1, var17, var18);
               if (this.d(var19) && this.i[var19] >= 5) {
                  return false;
               }
            }
         }

         cJ var34;
         if (var11) {
            if (this.L >= this.bu.length) {
               this.bu = (cJ[])Arrays.copyOf(this.bu, this.bu.length << 1);
            }

            if ((var34 = this.bu[this.L]) == null) {
               var34 = this.bu[this.L] = new cJ();
            }

            var34.d = 0;
            boolean var28 = false;
            var34.n = 0;
            ++this.L;
         } else {
            var34 = new cJ();
         }

         var18 = this.a(var1, var15, var16);
         var19 = this.b(var18);
         var12 |= (long)var19 << 14;
         var34.l = var12;
         var34.e = var14;
         var34.h = var1;
         var34.c = var6;
         var34.b = var7;
         var34.j = var8;
         var34.m = var9;
         var34.i = var10;
         var34.g = var2;
         var34.f = var3;
         int var35 = var2 + var4 - 1;
         var34.k = var35;
         var35 = var3 + var5 - 1;
         var34.o = var35;
         if (var11) {
            var18 = var15 + var4 - 1 >> 3;
            var19 = var5 + var16 - 1 >> 3;

            for(var6 = var15 >> 3; var6 <= var18; ++var6) {
               for(var7 = var16 >> 3; var7 <= var19; ++var7) {
                  this.f[var6][var7].b.add(var34);
               }
            }
         } else if (var9 instanceof jM) {
            this.f[var15 >> 3][var16 >> 3].a.add(var34);
            this.a((jM)var9);
         }

         for(var18 = var15; var18 < var15 + var4; ++var18) {
            for(var19 = var16; var19 < var5 + var16; ++var19) {
               var6 = 0;
               if (var18 > var15) {
                  var6 = 1;
               }

               if (var18 < var15 + var4 - 1) {
                  var6 |= 4;
               }

               if (var19 > var16) {
                  var6 |= 8;
               }

               if (var19 < var5 + var16 - 1) {
                  var6 |= 2;
               }

               for(var7 = var1; var7 >= 0; --var7) {
                  var8 = this.a(var7, var18, var19);
                  if (this.ak[var7][var18][var19] == null) {
                     this.ak[var7][var18][var19] = new kB(this, var8);
                  }

                  if (!this.d(var8)) {
                     this.m(var8);
                  }
               }

               var7 = this.a(var1, var18, var19);
               byte var30 = this.i[var7];
               this.af[var7 * 5 + var30] = var34;
               this.bU[var7 * 5 + var30] = (byte)var6;
               byte[] var31;
               (var31 = this.ca)[var7] = (byte)(var31[var7] | var6);
               ++this.i[var7];
            }
         }

         if (!var11 && this.as) {
            if (!bb && var9 instanceof jE) {
               throw new AssertionError();
            }

            if (!bb && var9 instanceof jQ) {
               throw new AssertionError();
            }

            if (!bb && var9 instanceof fY) {
               throw new AssertionError();
            }

            if (!bb && var9 instanceof ci) {
               throw new AssertionError();
            }

            client.cV.trace("Game object spawn: {}", var34.getId());
            GameObjectSpawned var32;
            (var32 = new GameObjectSpawned()).setTile(this.ak[var1][var15][var16]);
            var32.setGameObject(var34);
            dF.c.getCallbacks().post(var32);
            var8 = this.a(var1, var2, var3);
            long[] var33 = this.at;
            var33[var8] |= 1080863910568919040L;
         }

         if (this.as && !var11 && client.dd != null) {
            client.dd.invalidateZone(this, var15 >> 3, var16 >> 3);
         }

         return true;
      }
   }

   @ObfuscatedName("ai")
   public final void a() {
      Arrays.fill(this.ao, 0);
      Arrays.fill(this.am, (Object)null);
      Arrays.fill(this.ax, (Object)null);
      Arrays.fill(this.au, (Object)null);
      Arrays.fill(this.aD, (Object)null);
      Arrays.fill(this.aj, (Object)null);
      Arrays.fill(this.aC, (Object)null);
      Arrays.fill(this.af, (Object)null);
      Arrays.fill(this.bu, (Object)null);
      this.L = 0;
      Arrays.fill(this.bE, (Object)null);

      for(int var1 = 0; var1 < this.r >> 3; ++var1) {
         for(int var2 = 0; var2 < this.D >> 3; ++var2) {
            ku var3;
            (var3 = this.f[var1][var2]).a.clear();
            var3.b.clear();
         }
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(IIIILjr;Ljr;IIIIJI)V"
   )
   public final void a(int var1, int var2, int var3, int var4, ct var5, ct var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      this.b(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var13);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(IIIILjr;JI)V"
   )
   public final void a(int var1, int var2, int var3, int var4, ct var5, long var6, int var8) {
      int var9 = var2 + this.e;
      int var10 = var3 + this.e;
      if (var5 != null) {
         int var11 = this.a(var1, var9, var10);
         int var12 = this.b(var11);
         var6 |= (long)var12 << 14;
         ce var23;
         (var23 = new ce()).g = var5;
         int var19 = (var2 << 7) + 64;
         var23.c = var19;
         var19 = (var3 << 7) + 64;
         var23.e = var19;
         var23.f = var4;
         var23.d = var6;
         var23.b = var8;
         kB var21;
         if ((var21 = this.ak[var1][var9][var10]) == null) {
            this.ak[var1][var9][var10] = var21 = new kB(this, var11);
         }

         if (!this.d(var11)) {
            this.m(var11);
         }

         if (!bb && this.aj[var11] != null) {
            throw new AssertionError();
         }

         this.aj[var11] = var23;
         int[] var10000 = this.ao;
         var10000[var11] |= 2048;
         long[] var24 = this.at;
         var24[var11] |= 1080863910568919040L;
         if (var5 instanceof jM) {
            this.f[var9 >> 3][var10 >> 3].a.add(var23);
            this.a((jM)var5);
         }

         var23.a = var1;
         if (this.as) {
            GroundObjectSpawned var22;
            (var22 = new GroundObjectSpawned()).setTile(var21);
            var22.setGroundObject(var23);
            dF.c.getCallbacks().post(var22);
         }

         if (this.as && client.dd != null) {
            client.dd.invalidateZone(this, var9 >> 3, var10 >> 3);
         }
      }

   }

   @ObfuscatedName("as")
   private void c(int var1, int var2, int var3, int var4) {
      var2 += this.e;
      var3 += this.e;
      var1 = this.a(var1, var2, var3);
      cD var5;
      if (this.d(var1) && (var5 = this.aD[var1]) != null) {
         var5.j = var4 * var5.j / 16;
         var5.d = var4 * var5.d / 16;
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(IIIIILjr;IJIIII)Z"
   )
   public final boolean a(int var1, int var2, int var3, int var4, jG var5, int var6, long var7, int var9, int var10, int var11, int var12) {
      return var5 == null ? true : this.a(var1, var9, var10, var11 - var9 + 1, var12 - var10 + 1, var2, var3, var4, var5, var6, true, var7, 0);
   }

   @ObfuscatedName("av")
   public final void b() {
      int var1;
      for(var1 = 0; var1 < this.L; ++var1) {
         cJ var2 = this.bu[var1];
         this.removeGameObject(var2);
         Object var3 = null;
         var2.m = (ct)var3;
      }

      for(var1 = 0; var1 < this.f.length; ++var1) {
         for(int var4 = 0; var4 < this.f[0].length; ++var4) {
            this.f[var1][var4].b.clear();
         }
      }

      this.L = 0;
   }

   @ObfuscatedName("aw")
   public final void a(boolean var1) {
      if (!this.e() || var1) {
         this.bq = true;
         this.q = var1;
         this.v = -1;
         this.n = -1;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(IIIIILjr;IJZ)Z"
   )
   public final boolean a(int var1, int var2, int var3, int var4, int var5, ct var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var5 + var2;
         var5 += var3;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var5 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var5 /= 128;
         return this.a(var1, var11, var12, var13 - var11 + 1, var5 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(IIIIIILjr;IJI)Z"
   )
   public final boolean a(int var1, int var2, int var3, int var4, int var5, int var6, ct var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = (var5 << 6) + (var2 << 7);
         int var13 = (var6 << 6) + (var3 << 7);
         return this.a(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      signature = "(Ljh;)V"
   )
   private void a(cj var1) {
      for(int var2 = this.ci - 1; var2 >= 0; --var2) {
         ku var3;
         if ((var3 = this.bW[var2]).d) {
            client.dd.drawZone(var1, this, 1, var3.e, var3.c);
         }
      }

      client.dd.drawPass(var1, this, 1);
      Iterator var5 = this.bY.iterator();

      while(var5.hasNext()) {
         ci var4;
         (var4 = (ci)((cJ)var5.next()).m).a((cj)var4.bX);
      }

      this.q();
   }

   @ObfuscatedName("be")
   public final long b(int var1, int var2, int var3) {
      int var4 = var2 + this.e;
      int var5 = var3 + this.e;
      var1 = this.a(var1, var4, var5);
      if (!this.d(var1)) {
         return 0L;
      } else {
         byte var12 = this.i[var1];

         for(var5 = 0; var5 < var12; ++var5) {
            cJ var6;
            if ((int)((var6 = this.af[var1 * 5 + var5]).l >> 16 & 7L) == 2 && var2 == var6.g && var3 == var6.f) {
               return var6.l;
            }
         }

         return 0L;
      }
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(III)Lkg;"
   )
   public final cJ c(int var1, int var2, int var3) {
      int var4 = var2 + this.e;
      int var5 = var3 + this.e;
      var1 = this.a(var1, var4, var5);
      if (!this.d(var1)) {
         return null;
      } else {
         byte var12 = this.i[var1];

         for(var5 = 0; var5 < var12; ++var5) {
            cJ var6;
            if ((int)((var6 = this.af[var1 * 5 + var5]).l >> 16 & 7L) == 2 && var2 == var6.g && var3 == var6.f) {
               return var6;
            }
         }

         return null;
      }
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(III)Lka;"
   )
   private cD k(int var1, int var2, int var3) {
      var2 += this.ai;
      var3 += this.ai;
      var1 = this.i(var1, var2, var3);
      return this.g(var1) ? this.aD[var1] : null;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(Ljh;Ljh;Lrl13;Ljava/util/Set;)V"
   )
   private void a(cj var1, cj var2, ku var3, Set var4) {
      Comparator var5 = Comparator.comparingInt((var1x) -> {
         return (int)var1.project((float)var1x.getX(), (float)var1x.getZ(), (float)var1x.getY())[2];
      }).reversed();
      var3.a.sort(var5);
      Iterator var11 = var3.a.iterator();

      while(true) {
         jM var14;
         cJ var19;
         label212:
         while(true) {
            int var8;
            int var9;
            int var10000;
            int var17;
            do {
               do {
                  label174:
                  do {
                     while(var11.hasNext()) {
                        TileObject var10;
                        if ((var10 = (TileObject)var11.next()) instanceof cJ) {
                           var19 = (cJ)var10;
                           if (!bb && !(var19.m instanceof jM)) {
                              throw new AssertionError();
                           }

                           var14 = (jM)var19.m;
                           continue label174;
                        }

                        int var12;
                        cn var13;
                        if (var10 instanceof ce) {
                           ce var18 = (ce)var10;
                           if (!bb && !(var18.g instanceof jM)) {
                              throw new AssertionError();
                           }

                           if (!(var14 = (jM)var18.g).e && var18.a >= this.U && var18.a <= this.u) {
                              if (var18.a > this.d.m) {
                                 var12 = var18.c >> 7;
                                 var9 = var18.e >> 7;
                                 var17 = this.ce[this.d.m][var12 + this.e][var9 + this.e];
                                 if (var4.contains(var17)) {
                                    continue;
                                 }
                              }

                              if ((var13 = var14.j()) != null) {
                                 client.dd.drawDynamic(var1, this, var18, var18.g, var13, 0, var18.c, var18.f, var18.e);
                                 client.a(var1, var2, var13, 0, var18.c, var18.f, var18.e, var18.d);
                              }
                           }
                        } else if (var10 instanceof cS) {
                           cS var16;
                           if ((var16 = (cS)var10).j >= this.U && var16.j <= this.u) {
                              if (var16.j > this.d.m) {
                                 var8 = var16.f >> 7;
                                 var12 = var16.b >> 7;
                                 var9 = this.ce[this.d.m][var8 + this.e][var12 + this.e];
                                 if (var4.contains(var9)) {
                                    continue;
                                 }
                              }

                              if (var16.i instanceof jM && !(var14 = (jM)var16.i).e && (var13 = var14.j()) != null) {
                                 client.dd.drawDynamic(var1, this, var16, var16.i, var13, 0, var16.f, var16.d, var16.b);
                                 client.a(var1, var2, var13, 0, var16.f, var16.d, var16.b, var16.h);
                              }

                              if (var16.e instanceof jM && !(var14 = (jM)var16.e).e && (var13 = var14.j()) != null) {
                                 client.dd.drawDynamic(var1, this, var16, var16.e, var13, 0, var16.f, var16.d, var16.b);
                                 client.a(var1, var2, var13, 0, var16.f, var16.d, var16.b, var16.h);
                              }
                           }
                        } else if (var10 instanceof cD) {
                           cD var15;
                           if ((var15 = (cD)var10).a >= this.U && var15.a <= this.u) {
                              if (var15.a > this.d.m) {
                                 var8 = var15.c >> 7;
                                 var12 = var15.b >> 7;
                                 var9 = this.ce[this.d.m][var8 + this.e][var12 + this.e];
                                 if (var4.contains(var9)) {
                                    continue;
                                 }
                              }

                              if (var15.g instanceof jM && !(var14 = (jM)var15.g).e && (var13 = var14.j()) != null) {
                                 client.dd.drawDynamic(var1, this, var15, var15.g, var13, 0, var15.c, var15.h, var15.b);
                                 client.a(var1, var2, var13, 0, var15.c, var15.h, var15.b, var15.f);
                              }

                              if (var15.k instanceof jM && !(var14 = (jM)var15.k).e && (var13 = var14.j()) != null) {
                                 client.dd.drawDynamic(var1, this, var15, var15.k, var13, 0, var15.c, var15.h, var15.b);
                                 client.a(var1, var2, var13, 0, var15.c, var15.h, var15.b, var15.f);
                              }
                           }
                        } else {
                           cd var7;
                           if (var10 instanceof cd && (var7 = (cd)var10).i >= this.U && var7.i <= this.u) {
                              if (var7.i > this.d.m) {
                                 var8 = var7.d >> 7;
                                 var12 = var7.g >> 7;
                                 var9 = this.ce[this.d.m][var8 + this.e][var12 + this.e];
                                 if (var4.contains(var9)) {
                                    continue;
                                 }
                              }

                              kk var6;
                              if (var7.e != null) {
                                 if ((var13 = (var6 = (kk)var7.e).j()) == null) {
                                    continue;
                                 }

                                 client.dd.drawDynamic(var1, this, var7, var6, var13, 0, var7.d, var7.h - var7.f, var7.g);
                                 client.a(var1, var2, var13, 0, var7.d, var7.h - var7.f, var7.g, var7.a);
                              }

                              if (var7.b != null) {
                                 if ((var13 = (var6 = (kk)var7.b).j()) == null) {
                                    continue;
                                 }

                                 client.dd.drawDynamic(var1, this, var7, var6, var13, 0, var7.d, var7.h - var7.f, var7.g);
                                 client.a(var1, var2, var13, 0, var7.d, var7.h - var7.f, var7.g, var7.a);
                              }

                              if (var7.c != null && (var13 = (var6 = (kk)var7.c).j()) != null) {
                                 client.dd.drawDynamic(var1, this, var7, var6, var13, 0, var7.d, var7.h - var7.f, var7.g);
                                 client.a(var1, var2, var13, 0, var7.d, var7.h - var7.f, var7.g, var7.a);
                              }
                           }
                        }
                     }

                     return;
                  } while(var14.e);

                  boolean var21 = false;
                  var9 = ((this.c[1][var19.g + this.e][var19.f + this.e] & 2) >> 1) + var19.h & 3;

                  for(var17 = var19.g; var17 <= var19.k; ++var17) {
                     for(var8 = var19.f; var8 <= var19.o; ++var8) {
                        var21 |= (this.c[var9][var17 + this.e][var8 + this.e] & 8) != 0;
                     }
                  }

                  var10000 = var21 ? 0 : var19.h;
                  var17 = var10000;
               } while(var10000 < this.U);
            } while(var17 > this.u);

            if (var17 <= this.d.m) {
               break;
            }

            var8 = var19.g;

            while(true) {
               if (var8 > var19.k) {
                  break label212;
               }

               for(var9 = var19.f; var9 <= var19.o; ++var9) {
                  int var22 = this.ce[this.d.m][var8 + this.e][var9 + this.e];
                  if (var4.contains(var22)) {
                     continue label212;
                  }
               }

               ++var8;
            }
         }

         cn var20;
         if ((var20 = var14.j()) != null) {
            client.dd.drawDynamic(var1, this, var19, var19.m, var20, var19.i, var19.c, var19.j, var19.b);
            client.a(var1, var2, var20, var19.i, var19.c, var19.j, var19.b, var19.l);
         }
      }
   }

   @ObfuscatedName("bm")
   private boolean l(int var1, int var2, int var3) {
      return (this.c[var1][var2][var3] & 4) != 0;
   }

   @ObfuscatedName("bm")
   public final long d(int var1, int var2, int var3) {
      var2 += this.e;
      var3 += this.e;
      var1 = this.a(var1, var2, var3);
      return this.d(var1) && this.aD[var1] != null ? this.aD[var1].f : 0L;
   }

   @ObfuscatedName("bo")
   public final long e(int var1, int var2, int var3) {
      var2 += this.e;
      var3 += this.e;
      var1 = this.a(var1, var2, var3);
      return this.d(var1) && this.aj[var1] != null ? this.aj[var1].d : 0L;
   }

   @ObfuscatedName("bp")
   final boolean a(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var5 + var4 * this.bj + var2 * this.bo + var3 * this.bk, var6);
      return var6;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "(Ljr;)Z"
   )
   private static boolean a(ct var0) {
      jM var1;
      if (var0 instanceof jM && (var1 = (jM)var0).b != -1 && ej.d[var1.b] != var1.d) {
         var1.a();
         if (!bb && !var1.e) {
            throw new AssertionError();
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "(Ljh;Ljh;Lrl13;)V"
   )
   private void a(cj var1, cj var2, ku var3) {
      Comparator var4 = Comparator.comparingInt((var1x) -> {
         int var2 = (int)var1.project((float)(var1x.c * 2115779887 * -1459476017), (float)(var1x.j * -307354679 * -2072549767), (float)(var1x.b * 1009042899 * 346610267))[2];
         if (var1x.m == osrs.ai.a) {
            var2 -= 12;
         }

         return var2;
      }).reversed();
      var3.b.sort(var4);
      Iterator var6 = var3.b.iterator();

      while(var6.hasNext()) {
         cJ var7 = (cJ)var6.next();
         if (this.bD != var7.d * 137646659) {
            var7.d = this.bD * -1841755541;
            ct var5;
            if ((var5 = var7.m) instanceof ci) {
               this.bY.add(var7);
            } else {
               cn var8;
               if ((var8 = var5 instanceof cn ? (cn)var5 : var5.j()) != null) {
                  client.dd.drawTemp(var1, this, var7, var8);
                  client.a(var1, var2, var8, var7.i, var7.c, var7.j, var7.b, var7.l);
               }
            }
         }
      }

   }

   @ObfuscatedName("bq")
   public final long f(int var1, int var2, int var3) {
      var2 += this.e;
      var3 += this.e;
      var1 = this.a(var1, var2, var3);
      return this.d(var1) && this.au[var1] != null ? this.au[var1].h : 0L;
   }

   @ObfuscatedName("bs")
   public final void c() {
      this.d = null;

      for(int var1 = 0; var1 < this.r >> 3; ++var1) {
         for(int var2 = 0; var2 < this.D >> 3; ++var2) {
            Iterator var3 = this.f[var1][var2].a.iterator();

            while(var3.hasNext()) {
               TileObject var4;
               jM var6;
               if ((var4 = (TileObject)var3.next()) instanceof cJ) {
                  cJ var5;
                  var6 = (jM)(var5 = (cJ)var4).m;
                  if (!bb && this != var6.c) {
                     throw new AssertionError();
                  }

                  var6.c = null;
               } else if (var4 instanceof ce) {
                  ce var7;
                  var6 = (jM)(var7 = (ce)var4).g;
                  if (!bb && this != var6.c) {
                     throw new AssertionError();
                  }

                  var6.c = null;
               } else if (var4 instanceof cS) {
                  cS var8;
                  if ((var8 = (cS)var4).i instanceof jM) {
                     var6 = (jM)var8.i;
                     if (!bb && this != var6.c) {
                        throw new AssertionError();
                     }

                     var6.c = null;
                  }

                  if (var8.e instanceof jM) {
                     var6 = (jM)var8.e;
                     if (!bb && this != var6.c) {
                        throw new AssertionError();
                     }

                     var6.c = null;
                  }
               } else if (var4 instanceof cD) {
                  cD var9;
                  if ((var9 = (cD)var4).g instanceof jM) {
                     var6 = (jM)var9.g;
                     if (!bb && this != var6.c) {
                        throw new AssertionError();
                     }

                     var6.c = null;
                  }

                  if (var9.k instanceof jM) {
                     var6 = (jM)var9.k;
                     if (!bb && this != var6.c) {
                        throw new AssertionError();
                     }

                     var6.c = null;
                  }
               }
            }
         }
      }

      this.a();
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "(Ljj;IIIII)V"
   )
   private void b(class243 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.C) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.r) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.D && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                        int var15 = this.a(var12, var13, var14);
                        if (this.d(var15)) {
                           int var16 = this.i(var12, var13, var14) - this.i(var2, var3, var4);
                           cS var17;
                           if ((var17 = this.au[var15]) != null) {
                              class243 var18;
                              if (var17.i instanceof class243) {
                                 var18 = (class243)var17.i;
                                 class243.a(var1, var18, (1 - var5 << 6) + (var13 - var3 << 7), var16, (var14 - var4 << 7) + (1 - var6 << 6), var7);
                              }

                              if (var17.e instanceof class243) {
                                 var18 = (class243)var17.e;
                                 class243.a(var1, var18, (1 - var5 << 6) + (var13 - var3 << 7), var16, (var14 - var4 << 7) + (1 - var6 << 6), var7);
                              }
                           }

                           byte var24 = this.i[var15];

                           for(int var23 = 0; var23 < var24; ++var23) {
                              cJ var19;
                              if ((var19 = this.af[var15 * 5 + var23]) != null && var19.m instanceof class243) {
                                 class243 var20 = (class243)var19.m;
                                 int var21 = var19.k - var19.g + 1;
                                 int var22 = var19.o - var19.f + 1;
                                 class243.a(var1, var20, (var19.g + this.e - var3 << 7) + (var21 - var5 << 6), var16, (var19.f + this.e - var4 << 7) + (var22 - var6 << 6), var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   @ObfuscatedName("bu")
   private boolean b(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var5 + var4 * this.m + var2 * this.j + var3 * this.l, var6);
      return var6;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(III)Ljd;"
   )
   public final ce g(int var1, int var2, int var3) {
      var2 += this.e;
      var3 += this.e;
      var1 = this.a(var1, var2, var3);
      return this.d(var1) ? this.aj[var1] : null;
   }

   @ObfuscatedName("bw")
   public final int a(int var1, int var2, int var3, long var4) {
      var2 += this.e;
      var3 += this.e;
      var1 = this.a(var1, var2, var3);
      if (!this.d(var1)) {
         return -1;
      } else if (this.au[var1] != null && this.au[var1].h == var4) {
         return this.au[var1].c & 255;
      } else if (this.aD[var1] != null && this.aD[var1].f == var4) {
         return this.aD[var1].l & 255;
      } else if (this.aj[var1] != null && this.aj[var1].d == var4) {
         return this.aj[var1].b & 255;
      } else {
         byte var7 = this.i[var1];

         for(var3 = 0; var3 < var7; ++var3) {
            cJ var6;
            if ((var6 = this.af[var1 * 5 + var3]).l == var4) {
               return var6.e & 255;
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(III)Lko;"
   )
   public final cS h(int var1, int var2, int var3) {
      var2 += this.e;
      var3 += this.e;
      var1 = this.a(var1, var2, var3);
      return this.d(var1) ? this.au[var1] : null;
   }

   @ObfuscatedName("bx")
   private boolean a(int var1, int var2, int var3, int var4, boolean var5) {
      DrawCallbacks var6 = client.dd;
      if (dF.c.isGpu() && var6 != null && this.be == -1) {
         int var7;
         int[] var10002;
         for(var7 = this.bz; var7 < this.bA; ++var7) {
            int var8 = this.D;
            int var9 = 0;

            for(int var10 = this.bm; var10 < this.bM; ++var10) {
               int var11 = this.a(var4, var7, var10);
               if (this.d(var11) && var6.tileInFrustum(this, this.O, this.S, this.z, this.T, var1, var2, var3, var4, var7, var10)) {
                  var8 = Math.min(var8, var10);
                  var9 = Math.max(var9, var10);
               }
            }

            if (var5) {
               aZ[var7] = var8;
               ba[var7] = var9;
            } else {
               var10002 = aZ;
               var10002[var7] = Math.min(var10002[var7], var8);
               var10002 = ba;
               var10002[var7] = Math.max(var10002[var7], var9);
            }
         }

         for(var7 = this.bz + 1; var7 < this.bA - 1; ++var7) {
            var10002 = aZ;
            var10002[var7] = Math.min(var10002[var7], Math.max(aZ[var7 - 1], aZ[var7 + 1]));
            var10002 = ba;
            var10002[var7] = Math.max(var10002[var7], Math.min(ba[var7 - 1], ba[var7 + 1]));
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("bz")
   private boolean d(int var1, int var2, int var3, int var4) {
      if (!f(this, var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var10001 = var5 + 1;
         int var10002 = this.t[var1][var2][var3] - var4;
         var1 = var6 + 1;
         int var10000 = this.br;
         return false;
      }
   }

   @ObfuscatedName("cc")
   private boolean e(int var1, int var2, int var3, int var4) {
      if (!f(this, var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         var3 = (var2 = this.t[var1][var2][var3] - 1) - 120;
         int var7 = var2 - 230;
         int var8 = var2 - 238;
         int var10000;
         int var10001;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > this.bC) {
                  var10000 = this.br;
                  return false;
               }

               if (var1 > 0) {
                  var10000 = this.br;
                  return false;
               }

               var10000 = this.br;
               return false;
            }

            if (var4 == 2) {
               if (var6 < this.bL) {
                  var1 = var6 + 128;
                  var10000 = this.br;
                  return false;
               }

               if (var1 > 0) {
                  var1 = var6 + 128;
                  var10000 = this.br;
                  return false;
               }

               var1 = var6 + 128;
               var10000 = this.br;
               return false;
            }

            if (var4 == 4) {
               if (var5 < this.bC) {
                  var10001 = var5 + 128;
                  var10000 = this.br;
                  return false;
               }

               if (var1 > 0) {
                  var10001 = var5 + 128;
                  var10000 = this.br;
                  return false;
               }

               var10001 = var5 + 128;
               var10000 = this.br;
               return false;
            }

            if (var4 == 8) {
               if (var6 > this.bL) {
                  var10000 = this.br;
                  return false;
               }

               if (var1 > 0) {
                  var10000 = this.br;
                  return false;
               }

               var10000 = this.br;
               return false;
            }
         }

         var10001 = var5 + 64;
         var1 = var6 + 64;
         var10000 = this.br;
         return false;
      }
   }

   @ObfuscatedName("cf")
   public final void a(int var1, int var2, int var3, boolean var4) {
      client.s();
      int var5 = osrs.l.d;
      int var6 = jD.b;
      int var7 = fk.b;
      int var8 = dB.a;
      int var9 = gv.a;
      if (!dF.c.isGpu() && client.cQ != 0) {
         cm.a(dF.c.getViewportXOffset(), dF.c.getViewportYOffset(), dF.c.getViewportWidth(), dF.c.getViewportHeight(), client.cQ);
      }

      this.bC = Ints.constrainToRange(var5, this.an << 7, (this.av << 7) - 1);
      this.bt = var6;
      this.bL = Ints.constrainToRange(var7, this.ah << 7, (this.al << 7) - 1);
      this.cc = Floats.constrainToRange((float)client.bB, (float)(this.an << 7), (float)((this.av << 7) - 1));
      this.bO = (float)client.bD;
      this.ay = Floats.constrainToRange((float)client.bQ, (float)(this.ah << 7), (float)((this.al << 7) - 1));
      this.I = this.bC >> 7;
      this.bh = this.bL >> 7;
      this.I += this.e;
      this.bh += this.e;
      this.bp = var2 >> 7;
      this.bw = var3 >> 7;
      this.bp += this.e;
      this.bw += this.e;
      this.u = var1;
      var1 = Ints.constrainToRange(var8, 128, 383);
      float var12 = (float)client.bJ;
      if (!client.by) {
         var8 = var1;
         var12 = Floats.constrainToRange(var12, 0.3926991F, 1.1750293F);
      }

      int var10001 = (var1 - 128) / 32;
      var7 = var9 / 64;
      var6 = var10001;
      this.bx = var6;
      this.bi = var7;
      this.O = Perspective.SINE[var8];
      this.S = Perspective.COSINE[var8];
      this.z = Perspective.SINE[var9];
      this.T = Perspective.COSINE[var9];
      this.bV = var12;
      this.bQ = (float)client.H;
      cw var11;
      (var11 = new cw(this.bC, this.bt, this.bL, var8, var9, var2, var3)).m = this.cc;
      var11.o = this.bO;
      var11.q = this.ay;
      var11.k = this.bV;
      var11.n = this.bQ;
      var11.s = (float)Math.sin((double)this.bV);
      var11.l = (float)Math.cos((double)this.bV);
      var11.p = (float)Math.sin((double)this.bQ);
      var11.r = (float)Math.cos((double)this.bQ);
      this.b(var4);
      cw.b = var11;
      if ((client.E & 16) != 0) {
         this.a((cj)var11, (cj)null);
         this.a((cj)var11);
         this.bY.clear();
         client.w();
         dF.c.getCallbacks().drawScene();
         client.dd.postSceneDraw(this);
      } else {
         this.b(var11);
         if (client.dd != null) {
            client.dd.postDrawScene();
         }

      }
   }

   @ObfuscatedName("ck")
   private boolean f(int var1, int var2, int var3, int var4) {
      if (!this.a(this.V, var1, var2, var3, var4)) {
         return this.a(this.Z, var1, var2, var3, var4);
      } else {
         boolean var15 = false;
         this.a(this.V, var1, var2, var3, var4, false);
         int var5 = (var1 << 5) + 128;
         int var6 = var2 << 6;
         int var7 = var3 - this.Y - this.bs - 1 << 7;
         int var8 = var4 - this.Y - this.bJ - 1 << 7;

         for(int var9 = -this.J; var9 <= this.P; var9 += 128) {
            int var12 = var9 + this.X[var1];
            int[] var16 = osrs.cc.b;
            int[] var17 = osrs.cc.a;
            int var18 = var16[var5];
            int var14 = var17[var5];
            int var20 = var16[var6];
            int var19;
            int var21 = (var19 = var17[var6]) * var7 + var8 * var20 >> 16;
            int var11;
            int var13 = (var11 = var8 * var19 - var20 * var7 >> 16) * var14 + var18 * var12 >> 16;
            var11 = var14 * var12 - var11 * var18 >> 16;
            boolean var10000;
            if (var13 >= 50 && var13 <= cm.b()) {
               var12 = (var21 << 7) / var13 + this.G;
               var11 = (var11 << 7) / var13 + this.H;
               var10000 = var12 >= this.x && var12 <= this.W && var11 >= this.N && var11 <= this.ab;
            } else {
               var10000 = false;
            }

            if (var10000) {
               return this.b(var1, var2, var3, var4, true);
            }
         }

         return this.b(var1, var2, var3, var4, false);
      }
   }

   @ObfuscatedName("cs")
   private void q() {
      if (this.bq) {
         this.bq = false;
         this.v = this.R;
         this.n = this.E;
      }

   }

   @ObfuscatedName("ct")
   public final void d() {
      this.v = -1;
      this.q = false;
   }

   @ObfuscatedName("cz")
   public final boolean e() {
      return this.q && this.v != -1;
   }

   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      signature = "(IIIILjr;Ljr;IIJI)V"
   )
   public final void a(int var1, int var2, int var3, int var4, ct var5, ct var6, int var7, int var8, long var9, int var11) {
      this.b(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
   }

   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      signature = "(IIIILjr;Ljr;IIIIJI)V"
   )
   public final void b(int var1, int var2, int var3, int var4, ct var5, ct var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      int var14 = var2 + this.e;
      int var15 = var3 + this.e;
      if (var5 != null) {
         int var16 = this.a(var1, var14, var15);
         int var17 = this.b(var16);
         var11 |= (long)var17 << 14;
         cD var25;
         (var25 = new cD()).f = var11;
         var25.l = var13;
         int var22 = (var2 << 7) + 64;
         var25.c = var22;
         var22 = (var3 << 7) + 64;
         var25.b = var22;
         var25.h = var4;
         var25.g = var5;
         var25.k = var6;
         var25.i = var7;
         var25.e = var8;
         var25.j = var9;
         var25.d = var10;

         for(var2 = var1; var2 >= 0; --var2) {
            var3 = this.a(var2, var14, var15);
            if (!this.d(var3)) {
               this.m(var3);
            }

            if (this.ak[var2][var14][var15] == null) {
               this.ak[var2][var14][var15] = new kB(this, var3);
            }
         }

         if (!bb && this.aD[var16] != null) {
            throw new AssertionError();
         }

         this.aD[var16] = var25;
         int[] var10000 = this.ao;
         var10000[var16] |= 32768;
         var25.a = var1;
         if (var5 instanceof jM || var6 instanceof jM) {
            this.f[var14 >> 3][var15 >> 3].a.add(var25);
            this.a((jM)var5);
            this.a((jM)var6);
         }

         if (this.as) {
            DecorativeObjectSpawned var24;
            (var24 = new DecorativeObjectSpawned()).setTile(this.ak[var1][var14][var15]);
            var24.setDecorativeObject(var25);
            dF.c.getCallbacks().post(var24);
         }

         if (this.as && client.dd != null) {
            client.dd.invalidateZone(this, var14 >> 3, var15 >> 3);
         }
      }

   }

   @ObfuscatedName("du")
   private void h(int var1) {
      int var2 = (var1 << 1) + 1;
      int var3 = this.bS[var2] << 1;
      var2 = var1 << 1;
      int[] var10002 = this.bS;
      var10002[var3] = var10002[var2];
      var2 = var1 << 1;
      var3 = (this.bS[var2] << 1) + 1;
      var2 = (var1 << 1) + 1;
      var10002 = this.bS;
      var10002[var3] = var10002[var2];
      var3 = var2 = var1 << 1;
      var2 = (var1 << 1) + 1;
      var10002 = this.bS;
      var10002[var3] = var10002[var2] = this.bR;
   }

   @ObfuscatedName("es")
   private boolean c(int var1, int var2) {
      int var3 = var2;
      var2 = var1;
      ci var10 = this;
      int var6 = this.bi;
      int var5 = this.bx;
      if (!osrs.s.a(this, this.ac, var5, var6, var1, var3)) {
         var6 = this.bi;
         var5 = this.bx;
         return osrs.s.a(this, this.bK, var5, var6, var1, var3);
      } else {
         boolean var9 = false;
         var6 = this.bi;
         var5 = this.bx;
         this.b(this.ac, var5, var6, var1, var3, false);
         boolean var4 = false;

         for(var5 = -1; var5 <= 1; ++var5) {
            for(var6 = -1; var6 <= 1; ++var6) {
               if (var10.f(var10.bx, var10.bi, var5 + var2 + 1, var6 + var3 + 1)) {
                  var4 = true;
                  var5 = 2;
                  break;
               }

               if (var10.f(var10.bx, (var10.bi + 1) % 31, var5 + var2 + 1, var6 + var3 + 1)) {
                  var4 = true;
                  var5 = 2;
                  break;
               }

               if (var10.f(var10.bx + 1, var10.bi, var5 + var2 + 1, var6 + var3 + 1)) {
                  var4 = true;
                  var5 = 2;
                  break;
               }

               if (var10.f(var10.bx + 1, (var10.bi + 1) % 31, var5 + var2 + 1, var6 + var3 + 1)) {
                  var4 = true;
                  var5 = 2;
                  break;
               }
            }
         }

         var6 = var10.bi;
         var5 = var10.bx;
         return var10.b(var10.bK, var5, var6, var2, var3, var4);
      }
   }

   @ObfuscatedName("eu")
   public final void a(int var1, int var2, int var3, int var4) {
      this.c(var1, var2, var3, var4);
   }

   @ObfuscatedName("fn")
   private void m(int var1, int var2, int var3) {
      if (var2 >= 0 && var2 < this.r && var3 >= 0 && var3 < this.D) {
         var1 = this.a(var1, var2, var3);
         if (this.d(var1)) {
            this.f(var1);
         }
      }

   }

   @ObfuscatedName("fw")
   public final void f() {
      for(int var1 = 0; var1 < this.C; ++var1) {
         for(int var2 = this.e; var2 < this.r - this.e; ++var2) {
            for(int var3 = this.e; var3 < this.D - this.e; ++var3) {
               kB var4;
               if ((var4 = this.ae[var1][var2 - this.e][var3 - this.e]) != null) {
                  a(var4);
                  if (var4.b != null) {
                     a(var4.b);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("gc")
   private void i(int var1) {
      this.ao[var1] = 0;
      this.am[var1] = null;
      this.ax[var1] = null;
      this.au[var1] = null;
      this.aD[var1] = null;
      this.aj[var1] = null;
      this.aC[var1] = null;
      this.i[var1] = 0;

      for(int var2 = 0; var2 < 5; ++var2) {
         this.af[var2 + var1 * 5] = null;
         this.bU[var2 + var1 * 5] = 0;
      }

      this.ca[var1] = 0;
   }

   @ObfuscatedName("gj")
   private void d(int var1, int var2) {
      int[] var10002 = this.ao;
      var10002[var2] = var10002[var1];
      cE[] var4 = this.am;
      var4[var2] = var4[var1];
      co[] var5 = this.ax;
      var5[var2] = var5[var1];
      cS[] var6 = this.au;
      var6[var2] = var6[var1];
      cD[] var7 = this.aD;
      var7[var2] = var7[var1];
      ce[] var8 = this.aj;
      var8[var2] = var8[var1];
      cd[] var9 = this.aC;
      var9[var2] = var9[var1];
      byte[] var10 = this.i;
      var10[var2] = var10[var1];

      for(int var3 = 0; var3 < 5; ++var3) {
         this.af[var2 * 5 + var3] = this.af[var3 + var1 * 5];
         this.bU[var2 * 5 + var3] = this.bU[var3 + var1 * 5];
      }

      var10 = this.ca;
      var10[var2] = var10[var1];
   }

   @ObfuscatedName("gk")
   public final void a(int var1) {
      int var2 = var1;
      ci var6 = this;
      this.bl = null;
      this.setMinLevel(var1);

      for(int var3 = 0; var3 < var6.r; ++var3) {
         for(int var4 = 0; var4 < var6.D; ++var4) {
            int var5 = var6.a(var2, var3, var4);
            if (!var6.d(var5)) {
               var6.m(var5);
            }

            if (var6.ak[var2][var3][var4] == null) {
               var6.ak[var2][var3][var4] = new kB(var6, var5);
            }
         }
      }

   }

   @ObfuscatedName("gs")
   final boolean a(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var5 + var4 * this.bj + var2 * this.bo + var3 * this.bk);
   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      signature = "(Ljh;IZ)V"
   )
   private void a(cj var1, int var2, boolean var3) {
      this.f(var2);

      while(true) {
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var14;
         cS var15;
         int[] var10000;
         int var25;
         int var26;
         cD var29;
         cd var31;
         do {
            do {
               do {
                  do {
                     label611:
                     do {
                        do {
                           label602:
                           while(true) {
                              int var16;
                              int var17;
                              int var18;
                              boolean var21;
                              cJ var27;
                              while(true) {
                                 do {
                                    if ((var2 = this.r()) == this.bR) {
                                       return;
                                    }
                                 } while(!this.k(var2));

                                 var4 = var2 >> this.aB & this.aE;
                                 var5 = var2 & this.ad;
                                 var6 = var2 >> this.ap & 3;
                                 var7 = this.b(var2);
                                 int var19 = var4 - this.e;
                                 var11 = var5 - this.e;
                                 var8 = this.ao[var2];
                                 if (!this.g(var2)) {
                                    break;
                                 }

                                 if (var3) {
                                    if (var6 > 0) {
                                       var9 = var2 - this.aq;
                                       if (this.d(var9) && this.k(var9)) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= this.I && var4 > this.bz) {
                                       var9 = var2 - this.bN;
                                       if (this.d(var9) && this.k(var9) && (this.g(var9) || (this.ca[var2] & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= this.I && var4 < this.bA - 1) {
                                       var9 = var2 + this.bN;
                                       if (this.d(var9) && this.k(var9) && (this.g(var9) || (this.ca[var2] & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= this.bh && var5 > this.bm) {
                                       var9 = var2 - this.cj;
                                       if (this.d(var9) && this.k(var9) && (this.g(var9) || (this.ca[var2] & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= this.bh && var5 < this.bM - 1) {
                                       var9 = var2 + this.cj;
                                       if (this.d(var9) && this.k(var9) && (this.g(var9) || (this.ca[var2] & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var3 = true;
                                 }

                                 var10000 = this.ao;
                                 if (((var8 = var10000[var2] &= -3) & 32) != 0) {
                                    var9 = this.a(3, var4, var5);
                                    byte var13;
                                    if (((var10 = this.ao[var9]) & 256) != 0) {
                                       var13 = 0;
                                       if (!f(this, var13, var4, var5)) {
                                          var1.a(this, this.am[var9], 0, var19, var11);
                                       }
                                    } else if ((var10 & 1024) != 0) {
                                       var13 = 0;
                                       if (!f(this, var13, var4, var5)) {
                                          var1.b(this, this.ax[var9], var19, var11);
                                       }
                                    }

                                    if ((var10 & 16384) != 0) {
                                       var15 = this.au[var9];
                                       a(var1, var15.i, 0, var15.f, var15.d, var15.b, var15.h);
                                    }

                                    for(var25 = 0; var25 < this.i[var9]; ++var25) {
                                       if ((var27 = this.af[var9 * 5 + var25]) != null) {
                                          a(var1, var27.m, var27.i, var27.c, var27.j, var27.b, var27.l);
                                       }
                                    }
                                 }

                                 var21 = false;
                                 if ((var8 & 256) != 0) {
                                    if (!f(this, var7, var4, var5)) {
                                       var21 = true;
                                       if ((var8 & 512) != 0 || var6 <= this.by) {
                                          cE var28 = this.am[var2];
                                          var1.a(this, var28, var7, var19, var11);
                                       }
                                    }
                                 } else if ((var8 & 1024) != 0 && !f(this, var7, var4, var5)) {
                                    var21 = true;
                                    var1.b(this, this.ax[var2], var19, var11);
                                 }

                                 var10 = 0;
                                 var25 = 0;
                                 var14 = 0;
                                 if ((var8 & '쀀') != 0) {
                                    if (var4 == this.I) {
                                       ++var10;
                                    } else if (this.I < var4) {
                                       var10 += 2;
                                    }

                                    if (var5 == this.bh) {
                                       var10 += 3;
                                    } else if (this.bh > var5) {
                                       var10 += 6;
                                    }

                                    var25 = aS[var10];
                                    var11 = aV[var10];
                                    if (!bb && var11 != (var11 & 255)) {
                                       throw new AssertionError();
                                    }

                                    var10000 = this.ao;
                                    var10000[var2] &= 16777215;
                                    var10000 = this.ao;
                                    var10000[var2] |= var11 << 24;
                                    var14 = aR[var10];
                                    if (!bb && (~(var25 | var11) & 255) != var14) {
                                       throw new AssertionError();
                                    }
                                 }

                                 if ((var8 & 16384) != 0) {
                                    if (((var15 = this.au[var2]).a & var14) != 0) {
                                       byte var12;
                                       switch(var15.a) {
                                       case 16:
                                          var12 = 3;
                                          var16 = aU[var10];
                                          break;
                                       case 32:
                                          var12 = 6;
                                          var16 = aP[var10];
                                          break;
                                       case 64:
                                          var12 = 12;
                                          var16 = aQ[var10];
                                          break;
                                       case 128:
                                          var12 = 9;
                                          var16 = aT[var10];
                                          break;
                                       default:
                                          throw new IllegalStateException();
                                       }

                                       if (!bb && var12 != (var12 & 15)) {
                                          throw new AssertionError();
                                       }

                                       var10000 = this.ao;
                                       var10000[var2] &= -983041;
                                       var10000 = this.ao;
                                       var10000[var2] |= var12 << 16;
                                       if (!bb && var16 != (var16 & 15)) {
                                          throw new AssertionError();
                                       }

                                       var10000 = this.ao;
                                       var10000[var2] &= -15728641;
                                       var10000 = this.ao;
                                       var10000[var2] |= var16 << 20;
                                       if (!bb && var12 - var16 != (var12 ^ var16)) {
                                          throw new AssertionError();
                                       }

                                       var10000 = this.ao;
                                       var8 = var10000[var2] |= 16;
                                    }

                                    if ((var15.a & var25) != 0 && !this.g(var7, var4, var5, var15.a)) {
                                       a(var1, var15.i, 0, var15.f, var15.d, var15.b, var15.h);
                                    }

                                    if ((var15.g & var25) != 0 && !this.g(var7, var4, var5, var15.g)) {
                                       a(var1, var15.e, 0, var15.f, var15.d, var15.b, var15.h);
                                    }
                                 }

                                 if ((var8 & '耀') != 0) {
                                    var29 = this.aD[var2];
                                    if (!this.h(var7, var4, var5, var29.g.aI)) {
                                       if ((var29.i & var25) != 0) {
                                          a(var1, var29.g, 0, var29.c + var29.j, var29.h, var29.b + var29.d, var29.f);
                                       } else if (var29.i == 256) {
                                          var26 = var29.c - this.bC;
                                          var16 = var29.b - this.bL;
                                          if ((var17 = var29.e) != 1 && var17 != 2) {
                                             var18 = var26;
                                          } else {
                                             var18 = -var26;
                                          }

                                          if (var17 != 2 && var17 != 3) {
                                             var26 = var16;
                                          } else {
                                             var26 = -var16;
                                          }

                                          if (var26 < var18) {
                                             a(var1, var29.g, 0, var29.c + var29.j, var29.h, var29.b + var29.d, var29.f);
                                          } else if (var29.k != null) {
                                             a(var1, var29.k, 0, var29.c, var29.h, var29.b, var29.f);
                                          }
                                       }
                                    }
                                 }

                                 if (var21) {
                                    if ((this.ao[var2] & 2048) != 0) {
                                       ce var30 = this.aj[var2];
                                       a(var1, var30.g, 0, var30.c, var30.f, var30.e, var30.d);
                                    }

                                    if ((this.ao[var2] & 4096) != 0) {
                                       if ((var31 = this.aC[var2]).e != null) {
                                          a(var1, var31.e, 0, var31.d, var31.h, var31.g, var31.a);
                                       }

                                       if (var31.b != null) {
                                          a(var1, var31.b, 0, var31.d, var31.h, var31.g, var31.a);
                                       }

                                       if (var31.c != null) {
                                          a(var1, var31.c, 0, var31.d, var31.h, var31.g, var31.a);
                                       }
                                    }
                                 }

                                 byte var32 = this.ca[var2];
                                 if (var4 < this.I && var4 >= this.bz && var4 < this.bA - 1 && (var32 & 4) != 0) {
                                    var26 = var2 + this.bN;
                                    if (this.d(var26) && this.k(var26)) {
                                       this.f(var26);
                                    }
                                 }

                                 if (var5 < this.bh && var5 >= this.bm && var5 < this.bM - 1 && (var32 & 2) != 0) {
                                    var26 = var2 + this.cj;
                                    if (this.d(var26) && this.k(var26)) {
                                       this.f(var26);
                                    }
                                 }

                                 if (var4 > this.I && var4 > this.bz && var4 < this.bA && (var32 & 1) != 0) {
                                    var26 = var2 - this.bN;
                                    if (this.d(var26) && this.k(var26)) {
                                       this.f(var26);
                                    }
                                 }

                                 if (var5 > this.bh && var5 > this.bm && var5 < this.bM && (var32 & 8) != 0) {
                                    var26 = var2 - this.cj;
                                    if (this.d(var26) && this.k(var26)) {
                                       this.f(var26);
                                    }
                                 }
                                 break;
                              }

                              cJ var33;
                              if ((var8 & 16) != 0) {
                                 var21 = true;

                                 for(var10 = 0; var10 < this.i[var2]; ++var10) {
                                    var33 = this.af[var2 * 5 + var10];
                                    byte var22 = this.bU[var2 * 5 + var10];
                                    if (this.bD != var33.d * 137646659 && (var22 & this.l(var2)) == this.n(var2)) {
                                       var21 = false;
                                       break;
                                    }
                                 }

                                 if (var21) {
                                    cS var23 = this.au[var2];
                                    if (!this.g(var7, var4, var5, var23.a)) {
                                       a(var1, var23.i, 0, var23.f, var23.d, var23.b, var23.h);
                                    }

                                    var10000 = this.ao;
                                    var8 = var10000[var2] &= -17;
                                 }
                              }

                              if ((var8 & 8) == 0) {
                                 break;
                              }

                              try {
                                 var10000 = this.ao;
                                 var8 = var10000[var2] &= -9;
                                 var9 = 0;

                                 label598:
                                 for(var10 = 0; var10 < this.i[var2]; ++var10) {
                                    var33 = this.af[var2 * 5 + var10];
                                    if (this.bD != var33.d * 137646659) {
                                       for(var14 = var33.g; var14 <= var33.k; ++var14) {
                                          for(var11 = var33.f; var11 <= var33.o; ++var11) {
                                             var26 = var14 + this.e;
                                             var16 = var11 + this.e;
                                             var17 = this.a(var6, var26, var16);
                                             if (this.g(var17)) {
                                                var10000 = this.ao;
                                                var8 = var10000[var2] |= 8;
                                                continue label598;
                                             }

                                             if ((this.ao[var17] & 16) != 0) {
                                                var18 = 0;
                                                if (var14 > var33.g) {
                                                   var18 = 1;
                                                }

                                                if (var14 < var33.k) {
                                                   var18 |= 4;
                                                }

                                                if (var11 > var33.f) {
                                                   var18 |= 8;
                                                }

                                                if (var11 < var33.o) {
                                                   var18 |= 2;
                                                }

                                                var26 = this.l(var2) ^ this.n(var2);
                                                if ((var18 & this.l(var17)) == var26) {
                                                   var10000 = this.ao;
                                                   var8 = var10000[var2] |= 8;
                                                   continue label598;
                                                }
                                             }
                                          }
                                       }

                                       if (!bb && var9 >= 5) {
                                          throw new AssertionError();
                                       }

                                       this.bE[var9++] = var33;
                                       var14 = this.I - this.e;
                                       var11 = this.bh - this.e;
                                       var26 = var14 - var33.g;
                                       if ((var16 = var33.k - var14) > var26) {
                                          var26 = var16;
                                       }

                                       var17 = var11 - var33.f;
                                       if ((var18 = var33.o - var11) > var17) {
                                          var33.n = var26 + var18;
                                       } else {
                                          var33.n = var26 + var17;
                                       }
                                    }
                                 }

                                 while(true) {
                                    var10 = -50;
                                    var25 = -1;

                                    for(var14 = 0; var14 < var9; ++var14) {
                                       cJ var24 = this.bE[var14];
                                       if (this.bD != var24.d * 137646659) {
                                          if (var24.n > var10) {
                                             var10 = var24.n;
                                             var25 = var14;
                                          } else if (var10 == var24.n) {
                                             var26 = var24.c - this.bC;
                                             var16 = var24.b - this.bL;
                                             var17 = this.bE[var25].c - this.bC;
                                             var18 = this.bE[var25].b - this.bL;
                                             if (var26 * var26 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var25 = var14;
                                             }
                                          }
                                       }
                                    }

                                    if (var25 == -1) {
                                       if ((var8 & 8) == 0) {
                                          break label602;
                                       }
                                       break;
                                    }

                                    (var27 = this.bE[var25]).d = this.bD * -1841755541;
                                    a(var1, var27.m, var27.i, var27.c, var27.j, var27.b, var27.l);

                                    for(var11 = var27.g; var11 <= var27.k; ++var11) {
                                       for(var26 = var27.f; var26 <= var27.o; ++var26) {
                                          var16 = var11 + this.e;
                                          var17 = var26 + this.e;
                                          var18 = this.a(var6, var16, var17);
                                          if ((this.ao[var18] & 16) != 0) {
                                             this.f(var18);
                                          } else if ((var16 != var4 || var17 != var5) && this.k(var18)) {
                                             this.f(var18);
                                          }
                                       }
                                    }
                                 }
                              } catch (Exception var20) {
                                 client.cV.debug("exception drawing game entity", var20);
                                 var10000 = this.ao;
                                 var8 = var10000[var2] &= -9;
                                 break;
                              }
                           }

                           if (this.k(var2)) {
                              continue label611;
                           }
                        } while(bb);

                        throw new AssertionError("tile needs backside draw");
                     } while((var8 & 16) != 0);

                     if (var4 > this.I || var4 <= this.bz) {
                        break;
                     }

                     var9 = var2 - this.bN;
                  } while(this.d(var9) && this.k(var9));

                  if (var4 < this.I || var4 >= this.bA - 1) {
                     break;
                  }

                  var9 = var2 + this.bN;
               } while(this.d(var9) && this.k(var9));

               if (var5 > this.bh || var5 <= this.bm) {
                  break;
               }

               var9 = var2 - this.cj;
            } while(this.d(var9) && this.k(var9));

            if (var5 < this.bh || var5 >= this.bM - 1) {
               break;
            }

            var9 = var2 + this.cj;
         } while(this.d(var9) && this.k(var9));

         var10000 = this.ao;
         var8 = var10000[var2] &= -5;
         --this.Q;
         if ((var8 & 8192) != 0) {
            if ((var31 = this.aC[var2]).e != null) {
               a(var1, var31.e, 0, var31.d, var31.h - var31.f, var31.g, var31.a);
            }

            if (var31.b != null) {
               a(var1, var31.b, 0, var31.d, var31.h - var31.f, var31.g, var31.a);
            }

            if (var31.c != null) {
               a(var1, var31.c, 0, var31.d, var31.h - var31.f, var31.g, var31.a);
            }
         }

         if ((var8 & '쀀') != 0 && this.j(var2) != 0) {
            if ((var8 & '耀') != 0) {
               var29 = this.aD[var2];
               if (!this.h(var7, var4, var5, var29.g.aI)) {
                  if ((var29.i & this.j(var2)) != 0) {
                     a(var1, var29.g, 0, var29.c + var29.j, var29.h, var29.b + var29.d, var29.f);
                  } else if (var29.i == 256) {
                     var10 = var29.c - this.bC;
                     var25 = var29.b - this.bL;
                     if ((var14 = var29.e) != 1 && var14 != 2) {
                        var11 = var10;
                     } else {
                        var11 = -var10;
                     }

                     if (var14 != 2 && var14 != 3) {
                        var26 = var25;
                     } else {
                        var26 = -var25;
                     }

                     if (var26 >= var11) {
                        a(var1, var29.g, 0, var29.c + var29.j, var29.h, var29.b + var29.d, var29.f);
                     } else if (var29.k != null) {
                        a(var1, var29.k, 0, var29.c, var29.h, var29.b, var29.f);
                     }
                  }
               }
            }

            if ((var8 & 16384) != 0) {
               var15 = this.au[var2];
               var10 = this.j(var2);
               if ((var15.g & var10) != 0 && !this.g(var7, var4, var5, var15.g)) {
                  a(var1, var15.e, 0, var15.f, var15.d, var15.b, var15.h);
               }

               if ((var15.a & var10) != 0 && !this.g(var7, var4, var5, var15.a)) {
                  a(var1, var15.i, 0, var15.f, var15.d, var15.b, var15.h);
               }
            }
         }

         if (var6 < this.C - 1) {
            var9 = var2 + this.aq;
            if (this.d(var9) && this.k(var9)) {
               this.f(var9);
            }
         }

         if (var4 < this.I && var4 >= this.bz && var4 < this.bA - 1) {
            var9 = var2 + this.bN;
            if (this.d(var9) && this.k(var9)) {
               this.f(var9);
            }
         }

         if (var5 < this.bh && var5 >= this.bm && var5 < this.bM - 1) {
            var9 = var2 + this.cj;
            if (this.d(var9) && this.k(var9)) {
               this.f(var9);
            }
         }

         if (var4 > this.I && var4 > this.bz && var4 < this.bA) {
            var9 = var2 - this.bN;
            if (this.d(var9) && this.k(var9)) {
               this.f(var9);
            }
         }

         if (var5 > this.bh && var5 > this.bm && var5 < this.bM) {
            var9 = var2 - this.cj;
            if (this.d(var9) && this.k(var9)) {
               this.f(var9);
            }
         }
      }
   }

   @ObfuscatedName("hc")
   public final void g() {
      if ((client.E & 16) != 0) {
         for(int var1 = 0; var1 < this.r >> 3; ++var1) {
            for(int var2 = 0; var2 < this.D >> 3; ++var2) {
               ku var3 = this.f[var1][var2];
               boolean var4 = false;
               Iterator var5 = var3.a.iterator();

               while(true) {
                  while(var5.hasNext()) {
                     TileObject var6;
                     boolean var10000;
                     boolean var10001;
                     if ((var6 = (TileObject)var5.next()) instanceof cJ) {
                        cJ var7 = (cJ)var6;
                        var10000 = var4;
                        var10001 = a(var7.m);
                     } else {
                        if (var6 instanceof cS) {
                           cS var10 = (cS)var6;
                           var4 |= a(var10.i) || a(var10.e);
                           continue;
                        }

                        if (!(var6 instanceof cD)) {
                           if (!(var6 instanceof ce)) {
                              continue;
                           }

                           ce var8 = (ce)var6;
                           var10000 = var4;
                           var10001 = a(var8.g);
                        } else {
                           cD var9 = (cD)var6;
                           var10000 = var4;
                           var10001 = a(var9.g) || a(var9.k);
                        }
                     }

                     var4 = var10000 | var10001;
                  }

                  if (var4 && client.dd != null) {
                     client.dd.invalidateZone(this, var3.e, var3.c);
                  }
                  break;
               }
            }
         }
      }

   }

   @ObfuscatedName("hd")
   public final int b(int var1) {
      return (var1 >> this.ap & 3) + (this.ao[var1 & this.aq - 1] >> 5 & 1) & 3;
   }

   @ObfuscatedName("hp")
   private boolean b(int var1, int var2, int var3, int var4, boolean var5) {
      return this.a(this.Z, var1, var2, var3, var4, var5);
   }

   @ObfuscatedName("hp")
   private int j(int var1) {
      return this.ao[var1] >>> 24;
   }

   @ObfuscatedName("hx")
   private static void a(kB var0) {
      Callbacks var1 = dF.c.getCallbacks();
      cS var2;
      if ((var2 = var0.a()) != null) {
         WallObjectSpawned var3;
         (var3 = new WallObjectSpawned()).setTile(var0);
         var3.setWallObject(var2);
         var1.post(var3);
      }

      cD var10;
      if ((var10 = var0.g()) != null) {
         DecorativeObjectSpawned var7;
         (var7 = new DecorativeObjectSpawned()).setTile(var0);
         var7.setDecorativeObject(var10);
         var1.post(var7);
      }

      ce var8;
      if ((var8 = var0.h()) != null) {
         GroundObjectSpawned var11;
         (var11 = new GroundObjectSpawned()).setTile(var0);
         var11.setGroundObject(var8);
         var1.post(var11);
      }

      cJ[] var12;
      int var10000 = (var12 = var0.c()).length;

      for(int var9 = 0; var9 < 5; ++var9) {
         cJ var4;
         if ((var4 = var12[var9]) != null) {
            int var5 = var4.g;
            int var6 = var4.f;
            if (var5 == var0.d() && var6 == var0.b() && var4.k < 104 && var4.o < 104) {
               GameObjectSpawned var13;
               (var13 = new GameObjectSpawned()).setTile(var0);
               var13.setGameObject(var4);
               var1.post(var13);
            }
         }
      }

   }

   @ObfuscatedName("ir")
   public final void a(int[] var1, int var2, int var3, int var4, int var5) {
      gp.a(this, var1, var2, var3, var4, var5);
   }

   @ObfuscatedName("jf")
   public final void h() {
      for(int var1 = 0; var1 < 4; ++var1) {
         for(int var2 = 0; var2 < this.r; ++var2) {
            for(int var3 = 0; var3 < this.D; ++var3) {
               int var4 = this.a(var1, var2, var3);
               if (this.d(var4)) {
                  int var5 = var2 >> 3;
                  int var6 = var3 >> 3;
                  int var7;
                  if ((this.ao[var4] & 32) != 0) {
                     if (!bb && var1 != 0) {
                        throw new AssertionError();
                     }

                     if ((var7 = this.t[0][var2][var3]) < this.bP[var1][var5][var6]) {
                        this.bP[var1][var5][var6] = var7;
                     }

                     if (var7 > this.cd[var1][var5][var6]) {
                        this.cd[var1][var5][var6] = var7;
                     }
                  }

                  var7 = (this.c[1][var2][var3] & 2) >> 1;
                  var7 += var1;
                  if ((var7 = this.t[var7][var2][var3]) < this.bP[var1][var5][var6]) {
                     this.bP[var1][var5][var6] = var7;
                  }

                  if (var7 > this.cd[var1][var5][var6]) {
                     this.cd[var1][var5][var6] = var7;
                  }

                  int var8;
                  ce var9;
                  if (((var8 = this.ao[var4]) & 2048) != 0 && (var9 = this.aj[var4]).g instanceof cn) {
                     this.a(var7, var1, var5, var6, (cn)var9.g);
                  }

                  if ((var8 & 16384) != 0) {
                     cS var11;
                     if ((var11 = this.au[var4]).i instanceof cn) {
                        this.a(var7, var1, var5, var6, (cn)var11.i);
                     }

                     if (var11.e instanceof cn) {
                        this.a(var7, var1, var5, var6, (cn)var11.e);
                     }
                  }

                  if ((var8 & '耀') != 0) {
                     cD var12;
                     if ((var12 = this.aD[var4]).g instanceof cn) {
                        this.a(var7, var1, var5, var6, (cn)var12.g);
                     }

                     if (var12.k instanceof cn) {
                        this.a(var7, var1, var5, var6, (cn)var12.k);
                     }
                  }

                  for(int var13 = 0; var13 < this.i[var4]; ++var13) {
                     cJ var10;
                     if ((var10 = this.af[var4 * 5 + var13]).m instanceof cn) {
                        this.a(var7, var1, var5, var6, (cn)var10.m);
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      signature = "(IIIIIILjr;IJI)Z"
   )
   public final boolean b(int var1, int var2, int var3, int var4, int var5, int var6, ct var7, int var8, long var9, int var11) {
      return this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
   }

   @ObfuscatedName("js")
   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      cw var31;
      float var33 = (var31 = cw.b).m;
      float var34 = var31.o;
      float var32 = var31.q;
      float var35 = 0.0F;
      float var11 = 0.0F;
      if (this.s) {
         var11 = (float)Math.sin((double)(var35 = (float)(this.A % 300) / 300.0F * 3.1415927F * 2.0F));
         float var16 = (float)Math.cos((double)var35);
         var35 = (float)((double)var11 * 3.141592653589793D) / 100.0F;
         var11 = (float)((double)var16 * 3.141592653589793D) / 100.0F;
      }

      fS var15;
      gI var10000 = (var15 = new fS()).d;
      float var18 = (float)client.u(var1 & 2047);
      var10000.a(var18, var35, var11);
      ga.a(var15.b, (float)var4, (float)var5, (float)var6);
      float var10001 = (float)(-(this.r << 6) - this.o);
      float var10002 = (float)this.w;
      fS var36;
      ga.a((var36 = new fS()).b, var10001, var10002, (float)(-(this.D << 6) - this.B));
      gL var37 = gL.e();
      gL var38 = gL.e();
      var37.a(var36);
      float var27 = 1.0F;
      float var20 = 1.0F;
      float var19 = this.p;
      var18 = 1.0F;
      gL.a(var38, 1.0F, var19, 1.0F, 1.0F, -1378246891);
      var37.a(var38);
      var38.a(var15);
      var37.a(var38);
      gq var21;
      gq var39 = var21 = new gq();
      var18 = (float)client.u(-var2 & 2047);
      var39.b(var18);
      var18 = (float)client.u(-var3 & 2047);
      var21.c(var18);
      var21.a(var33, var34, var32);
      gL var23;
      (var23 = gL.e()).a(var21);
      var23.d();
      gL var22;
      (var22 = gL.e()).a(var15);
      var22.d();
      this.cc = var22.b(var33, var34, var32);
      this.bO = var32 * var22.i + var34 * var22.n + var33 * var22.r + var22.d;
      this.ay = var22.d(var33, var34, var32);
      this.bC = (int)this.cc;
      this.bt = (int)this.bO;
      this.bL = (int)this.ay;
      this.I = this.bC >> 7;
      this.bh = this.bL >> 7;
      var10002 = (float)var12;
      float var30 = (float)var13;
      float var25 = 0.0F;
      float var28 = var10002;
      this.bp = (int)var22.b(var28, var25, var30) >> 7;
      this.bw = (int)var22.d((float)var12, 0.0F, (float)var13) >> 7;
      var15.a();
      var36.a();
      var38.c();
      var22.c();
      gL.a(var22 = new gL(), var37, -1662681798);
      cb var24 = new cb(var22);
      this.bX = var24;
      var37.a(var23);
      cb var26 = new cb(var37);
      this.b(var14);
      osrs.cf.e = false;
      if ((client.E & 16) != 0) {
         this.a((cj)var26, (cj)var24);
      } else {
         cy var29 = osrs.cc.d.g;
         this.bd.a(var29);
         var29 = this.k;
         osrs.cc.d.g.a(var29);
         this.b(var26);
         var29 = this.bd;
         osrs.cc.d.g.a(var29);
         if (client.dd != null) {
            client.dd.postDrawScene();
         }
      }

      osrs.cf.e = false;
      var23.c();
      var37.c();
      if ((client.E & 16) != 0) {
         client.dd.postSceneDraw(this);
      }

   }

   @ObfuscatedName("kb")
   public final int c(int var1) {
      int var2 = var1 >> this.ap & 3;
      return (this.ao[var1] & 64) != 0 ? 0 : var2;
   }

   @ObfuscatedName("kx")
   private void b(boolean var1) {
      boolean var2 = dF.c.isMenuOpen();
      ++this.bD;
      this.R = -1;
      this.E = -1;
      this.y = -1.0F;
      boolean var3 = this.be == -1;
      DrawCallbacks var4;
      if ((var4 = client.dd) != null && var3) {
         client.bG = 0;
         var4.drawScene((double)this.cc, (double)this.bO, (double)this.ay, (double)this.bV, (double)this.bQ, this.u);
      }

      int var7 = dF.c.isGpu() ? aY : this.Y;
      int var5 = !var1 && this.bG != osrs.ca.b ? this.bp : this.I;
      int var6 = !var1 && this.bG != osrs.ca.b ? this.bw : this.bh;
      if (var3) {
         this.bz = Math.max(var5 - var7, this.an + this.e);
         this.bm = Math.max(var6 - var7, this.ah + this.e);
         this.bA = Math.min(var5 + var7, this.av + this.e);
         this.bM = Math.min(var6 + var7, this.al + this.e);
      } else {
         this.bz = 0;
         this.bm = 0;
         this.bA = this.r;
         this.bM = this.D;
         var5 = this.r / 2;
         var6 = this.D / 2;
         this.Y = Math.max(var5, var6);
      }

      this.bs = this.I - var5;
      this.bJ = this.bh - var6;
      this.Q = 0;
      this.p();
      if (!var2) {
         this.g = this.an;
         this.h = this.ah;
      }

      if ((client.E & 16) != 0) {
         client.dd.preSceneDraw(this, this.cc, this.bO, this.ay, this.bV, this.bQ, this.U, this.d.m, this.u, this.bc);
      }

   }

   @ObfuscatedName("lb")
   public final void i() {
      if ((client.E & 16) != 0) {
         for(int var1 = 0; var1 < this.r >> 3; ++var1) {
            for(int var2 = 0; var2 < this.D >> 3; ++var2) {
               ku var3;
               if ((var3 = this.f[var1][var2]) != null) {
                  boolean var4 = false;
                  Iterator var5 = var3.a.iterator();

                  while(var5.hasNext()) {
                     TileObject var6;
                     jM var8;
                     if ((var6 = (TileObject)var5.next()) instanceof cJ) {
                        cJ var7 = (cJ)var6;
                        if (!bb && !(var7.m instanceof jM)) {
                           throw new AssertionError();
                        }

                        if (!(var8 = (jM)var7.m).e && var8.c()) {
                           var8.a();
                           var8.e = true;
                           var4 = true;
                        }
                     } else if (var6 instanceof ce) {
                        ce var9 = (ce)var6;
                        if (!bb && !(var9.g instanceof jM)) {
                           throw new AssertionError();
                        }

                        if (!(var8 = (jM)var9.g).e && var8.c()) {
                           var8.a();
                           var8.e = true;
                           var4 = true;
                        }
                     } else if (var6 instanceof cS) {
                        cS var10;
                        if ((var10 = (cS)var6).i instanceof jM && !(var8 = (jM)var10.i).e && var8.c()) {
                           var8.a();
                           var8.e = true;
                           var4 = true;
                        }

                        if (var10.e instanceof jM && !(var8 = (jM)var10.e).e && var8.c()) {
                           var8.a();
                           var8.e = true;
                           var4 = true;
                        }
                     } else if (var6 instanceof cD) {
                        cD var11;
                        if ((var11 = (cD)var6).g instanceof jM && !(var8 = (jM)var11.g).e && var8.c()) {
                           var8.a();
                           var8.e = true;
                           var4 = true;
                        }

                        if (var11.k instanceof jM && !(var8 = (jM)var11.k).e && var8.c()) {
                           var8.a();
                           var8.e = true;
                           var4 = true;
                        }
                     }
                  }

                  if (var4) {
                     client.dd.invalidateZone(this, var3.e, var3.c);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("le")
   @ObfuscatedSignature(
      signature = "(Ljh;Ljr;IIIIJ)V"
   )
   private static void a(cj var0, ct var1, int var2, int var3, int var4, int var5, long var6) {
      var0.b(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedName("ma")
   public final void a(int var1, int var2, float var3) {
      int var4 = var1;
      int var5 = var2;
      jG var6 = osrs.ai.a;
      if (this.be == -1 && var6.b()) {
         int var7 = var6.s >> 7;
         int var9 = var6.n >> 7;
         int var8;
         if ((var8 = (int)Math.hypot((double)(var7 - var1), (double)(var9 - var2)) - 70) > 0) {
            var4 = (var1 * 70 + var8 * var7) / (var8 + 70);
            var5 = (var2 * 70 + var8 * var9) / (var8 + 70);
         }
      }

      this.R = var4;
      this.E = var5;
      this.y = var3;
   }

   @ObfuscatedName("nu")
   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      int var21 = var20;
      var20 = var19;
      var19 = var18;
      var18 = var17;
      var17 = var16;
      var16 = var15;
      var15 = var14;
      var14 = var13;
      var13 = var12;
      var12 = var11;
      var11 = var10;
      var10 = var9;
      var9 = var8;
      var8 = var7;
      var7 = var6;
      var6 = var5;
      var5 = var4;
      var4 = var3;
      var3 = var2;
      ci var22 = this;
      int[] var10000;
      cE var23;
      if (var5 == 0) {
         var23 = new cE(var12, var13, var14, var15, -1, var20, false);

         for(var6 = var1; var6 >= 0; --var6) {
            var7 = var22.a(var6, var3, var4);
            if (var22.ak[var6][var3][var4] == null) {
               var22.ak[var6][var3][var4] = new kB(var22, var7);
            }

            if (!var22.d(var7)) {
               var22.m(var7);
            }
         }

         var6 = var22.a(var1, var3, var4);
         var22.am[var6] = var23;
         var10000 = var22.ao;
         var10000[var6] |= 256 | (var23.f != 12345678 ? 512 : 0);
      } else if (var5 != 1) {
         co var24 = new co(var5, var6, var7, var2 - this.e, var4 - this.e, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);

         for(var6 = var1; var6 >= 0; --var6) {
            var7 = var22.a(var6, var3, var4);
            if (var22.ak[var6][var3][var4] == null) {
               var22.ak[var6][var3][var4] = new kB(var22, var7);
            }

            if (!var22.d(var7)) {
               var22.m(var7);
            }
         }

         var6 = var22.a(var1, var3, var4);
         var22.ax[var6] = var24;
         var10000 = var22.ao;
         var10000[var6] |= 1024;
      } else {
         var23 = new cE(var16, var17, var18, var19, var7, var21, var9 == var8 && var8 == var10 && var11 == var8);

         for(var6 = var1; var6 >= 0; --var6) {
            var7 = var22.a(var6, var3, var4);
            if (var22.ak[var6][var3][var4] == null) {
               var22.ak[var6][var3][var4] = new kB(var22, var7);
            }

            if (!var22.d(var7)) {
               var22.m(var7);
            }
         }

         var6 = var22.a(var1, var3, var4);
         var22.am[var6] = var23;
         var10000 = var22.ao;
         var10000[var6] |= 256 | (var23.f != 12345678 ? 512 : 0);
      }
   }

   @ObfuscatedName("om")
   public final int i(int var1, int var2, int var3) {
      return this.t[var1][var2 + 1][var3 + 1] + this.t[var1][var2][var3] + this.t[var1][var2][var3 + 1] + this.t[var1][var2 + 1][var3] >> 2;
   }

   @ObfuscatedName("ov")
   @ObfuscatedSignature(
      signature = "(IIIILjr;Ljr;IIJI)V"
   )
   public final void b(int var1, int var2, int var3, int var4, ct var5, ct var6, int var7, int var8, long var9, int var11) {
      int var12 = var2 + this.e;
      int var13 = var3 + this.e;
      if (var5 != null || var6 != null) {
         int var14 = this.a(var1, var12, var13);
         int var15 = this.b(var14);
         var9 |= (long)var15 << 14;
         cS var24;
         (var24 = new cS()).h = var9;
         var24.c = var11;
         int var21 = (var2 << 7) + 64;
         var24.f = var21;
         var21 = (var3 << 7) + 64;
         var24.b = var21;
         var24.d = var4;
         var24.i = var5;
         var24.e = var6;
         var24.a = var7;
         var24.g = var8;

         for(var2 = var1; var2 >= 0; --var2) {
            var3 = this.a(var2, var12, var13);
            if (!this.d(var3)) {
               this.m(var3);
            }

            if (this.ak[var2][var12][var13] == null) {
               this.ak[var2][var12][var13] = new kB(this, var3);
            }
         }

         if (!bb && this.au[var14] != null) {
            throw new AssertionError();
         }

         this.au[var14] = var24;
         int[] var10000 = this.ao;
         var10000[var14] |= 16384;
         long[] var25 = this.at;
         var25[var14] |= 1080863910568919040L;
         if (var5 instanceof jM || var6 instanceof jM) {
            this.f[var12 >> 3][var13 >> 3].a.add(var24);
            this.a((jM)var5);
            this.a((jM)var6);
         }

         var24.j = var1;
         if (this.as) {
            WallObjectSpawned var23;
            (var23 = new WallObjectSpawned()).setTile(this.ak[var1][var12][var13]);
            var23.setWallObject(var24);
            dF.c.getCallbacks().post(var23);
         }

         if (this.as && client.dd != null) {
            client.dd.invalidateZone(this, var12 >> 3, var13 >> 3);
         }
      }

   }

   @ObfuscatedName("oy")
   private int r() {
      int var1 = this.cb << 1;
      if ((var1 = this.bS[var1]) >= this.cb) {
         return this.bR;
      } else {
         this.h(var1);
         return var1;
      }
   }

   @ObfuscatedName("pf")
   @ObfuscatedSignature(
      signature = "(Lcu;)V"
   )
   private void a(jM var1) {
      if (var1 != null && var1.c()) {
         var1.a();
         var1.e = true;
         if (var1.b >= 0 && this.bT != null) {
            this.bT.set(var1.b);
         }
      }

   }

   @ObfuscatedName("pp")
   @ObfuscatedSignature(
      signature = "(Ljh;)V"
   )
   private void b(cj var1) {
      boolean var2 = this.ai != 0 && this.be == -1;
      int var3 = dF.c.isGpu() ? aY : this.Y;

      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for(var4 = this.C - 1; var4 >= this.U; --var4) {
         boolean var12 = this.a(this.bC, this.bt, this.bL, var4, var4 == this.C - 1);

         for(var5 = this.bz; var5 < this.bA; ++var5) {
            int var13 = var12 ? aZ[var5] : this.bm;
            var6 = var12 ? ba[var5] : this.bM - 1;

            for(var7 = var13; var7 <= var6; ++var7) {
               var8 = this.a(var4, var5, var7);
               if (this.d(var8)) {
                  var9 = this.c(var8);
                  var10 = this.ce[this.d.m][var5][var7];
                  if ((var9 <= this.u || var2) && (this.be != -1 || var12 || this.c(var5 - this.I + this.bs + this.Y, var7 - this.bh + this.bJ + this.Y) || this.t[var4][var5][var7] - this.bt >= 2000) && (!var2 || this.d.m >= var9 || var10 == 0 || !this.bc.contains(var10))) {
                     var11 = (this.ao[var8] | 6 | (this.i[var8] > 0 ? 8 : 0)) & -16711697;
                     this.ao[var8] = var11;
                     ++this.Q;
                  } else {
                     int[] var10000 = this.ao;
                     var10000[var8] &= -23;
                  }
               }
            }
         }
      }

      var4 = Math.abs(this.bs);
      int var16 = Math.abs(this.bJ);

      label140:
      for(var5 = 0; var5 < 2; ++var5) {
         boolean var17 = var5 == 0;

         for(var6 = this.U; var6 < this.C; ++var6) {
            for(var7 = -(var4 + var3); var7 <= 0; ++var7) {
               var8 = var7 + this.I;
               var9 = this.I - var7;
               if (var8 >= this.bz || var9 < this.bA) {
                  for(var10 = -(var16 + var3); var10 <= 0; ++var10) {
                     var11 = var10 + this.bh;
                     int var14 = this.bh - var10;
                     int var15;
                     if (var8 >= this.bz && var8 < this.bA) {
                        if (var11 >= this.bm && var11 < this.bM) {
                           var15 = this.a(var6, var8, var11);
                           if ((this.ao[var15] & 3) == 3) {
                              this.a(var1, var15, var17);
                           }
                        }

                        if (var14 >= this.bm && var14 < this.bM) {
                           var15 = this.a(var6, var8, var14);
                           if ((this.ao[var15] & 3) == 3) {
                              this.a(var1, var15, var17);
                           }
                        }
                     }

                     if (var9 >= this.bz && var9 < this.bA) {
                        if (var11 >= this.bm && var11 < this.bM) {
                           var15 = this.a(var6, var9, var11);
                           if ((this.ao[var15] & 3) == 3) {
                              this.a(var1, var15, var17);
                           }
                        }

                        if (var14 >= this.bm && var14 < this.bM) {
                           var15 = this.a(var6, var9, var14);
                           if ((this.ao[var15] & 3) == 3) {
                              this.a(var1, var15, var17);
                           }
                        }
                     }

                     if (this.Q == 0) {
                        break label140;
                     }
                  }
               }
            }
         }
      }

      this.q();
      dF.c.getCallbacks().drawScene();
   }

   @ObfuscatedName("px")
   public final void j(int var1, int var2, int var3) {
      if (var3 == this.d.m && !dF.c.isMenuOpen()) {
         this.g = var1;
         this.h = var2;
      }

   }

   @ObfuscatedName("qz")
   @ObfuscatedSignature(
      signature = "(Ljh;Ljh;)V"
   )
   private void a(cj var1, cj var2) {
      int var3 = this.I >> 3;
      int var4 = this.bh >> 3;
      int var5 = aY >> 3;
      int var6 = this.r >> 3;
      int var7 = this.D >> 3;
      this.ci = 0;

      int var8;
      for(var8 = -var5; var8 <= var5; ++var8) {
         for(int var9 = -var5; var9 <= var5; ++var9) {
            int var10 = var3 + var8;
            int var11 = var4 + var9;
            if (var10 >= 0 && var10 < var6 && var11 >= 0 && var11 < var7) {
               (this.bW[this.ci++] = this.f[var10][var11]).d = false;
            }
         }
      }

      Arrays.sort(this.bW, 0, this.ci, Comparator.nullsLast(Comparator.comparingInt((var1x) -> {
         int var2 = (var1x.e << 3) + 4 - this.e << 7;
         int var3 = (var1x.c << 3) + 4 - this.e << 7;
         return (var2 - this.bC) * (var2 - this.bC) + (var3 - this.bL) * (var3 - this.bL);
      })));

      ku var12;
      for(var8 = 0; var8 < this.ci; ++var8) {
         var12 = this.bW[var8];
         if (this.be != -1 || this.n(this.U, var12.e, var12.c)) {
            var12.d = true;
            client.dd.drawZone(var2, this, 0, var12.e, var12.c);
         }
      }

      for(var8 = this.ci - 1; var8 >= 0; --var8) {
         if ((var12 = this.bW[var8]).d) {
            this.a(var1, var2, var12, this.bc);
            this.a(var1, var2, var12);
            this.b(var1, var2, var12);
         }
      }

      client.dd.drawPass(var2, this, 0);
      Iterator var13 = this.bY.iterator();

      while(var13.hasNext()) {
         cJ var14 = (cJ)var13.next();
         var1.b(var14.m, var14.i, var14.c, var14.j, var14.b, var14.l);
      }

   }

   @ObfuscatedName("ra")
   @ObfuscatedSignature(
      signature = "(Ljh;Ljh;Lrl13;)V"
   )
   private void b(cj var1, cj var2, ku var3) {
      int var4 = this.d.m;
      int var5 = var3.e;
      int var15 = var3.c;
      if (var2 == null ? client.a((var5 << 3) - this.e + 4 << 7, (this.cd[var4][var5][var15] + this.bP[var4][var5][var15]) / 2, (var15 << 3) - this.e + 4 << 7, 0, 0, 0, 512, (-this.bP[var4][var5][var15] + this.cd[var4][var5][var15]) / 2, 512) : client.a((cb)var1, (var5 << 3) - this.e + 4 << 7, (this.cd[var4][var5][var15] + this.bP[var4][var5][var15]) / 2, (var15 << 3) - this.e + 4 << 7, 0, 0, 0, 512, (-this.bP[var4][var5][var15] + this.cd[var4][var5][var15]) / 2, 512)) {
         for(var4 = var5 << 3; var4 < var5 + 1 << 3; ++var4) {
            for(int var6 = var15 << 3; var6 < var15 + 1 << 3; ++var6) {
               int var7 = this.a(this.d.m, var4, var6);
               if (this.d(var7)) {
                  int var8 = var7 >> this.aB & this.aE;
                  int var9 = var7 & this.ad;
                  int var10 = var7 >> this.ap & 3;
                  int var11 = this.ao[var7];
                  int var12 = this.b(var7);
                  int var13 = var8 - this.e;
                  int var14 = var9 - this.e;
                  if ((var11 & 32) != 0) {
                     var8 = this.a(3, var8, var9);
                     if (((var9 = this.ao[var8]) & 256) != 0) {
                        var1.a(this, this.am[var8], 0, var13, var14);
                     } else if ((var9 & 1024) != 0) {
                        var1.b(this, this.ax[var8], var13, var14);
                     }
                  }

                  if ((var11 & 256) != 0) {
                     if ((var11 & 512) != 0 || var10 <= this.by) {
                        cE var16 = this.am[var7];
                        var1.a(this, var16, var12, var13, var14);
                     }
                  } else if ((var11 & 1024) != 0) {
                     var1.b(this, this.ax[var7], var13, var14);
                  }

                  if ((this.ao[var7] & 2048) != 0) {
                     ce var17 = this.aj[var7];
                     a(var1, var2, var17.g, 0, var17.c, var17.f, var17.e, var17.d);
                  }

                  if ((var11 & 16384) != 0) {
                     cS var18 = this.au[var7];
                     a(var1, var2, var18.i, 0, var18.f, var18.d, var18.b, var18.h);
                     a(var1, var2, var18.e, 0, var18.f, var18.d, var18.b, var18.h);
                  }

                  if ((var11 & '耀') != 0) {
                     cD var19 = this.aD[var7];
                     a(var1, var2, var19.g, 0, var19.c + var19.j, var19.h, var19.b + var19.d, var19.f);
                     a(var1, var2, var19.k, 0, var19.c + var19.j, var19.h, var19.b + var19.d, var19.f);
                  }

                  for(var8 = 0; var8 < this.i[var7]; ++var8) {
                     cJ var20 = this.af[var7 * 5 + var8];
                     a(var1, var2, var20.m, var20.i, var20.c, var20.j, var20.b, var20.l);
                  }
               }
            }
         }
      }

   }

   public void setMinLevel(int var1) {
      this.U = var1;
   }

   public void removeGameObject(GameObject var1) {
      cJ var2 = (cJ)var1;
      ci var10 = this;

      int var3;
      int var4;
      int var5;
      for(var3 = var2.g; var3 <= var2.k; ++var3) {
         var4 = var3 + var10.e;

         for(var5 = var2.f; var5 <= var2.o; ++var5) {
            int var6 = var5 + var10.e;
            var6 = var10.a(var2.h, var4, var6);
            if (var10.d(var6)) {
               byte var7 = var10.i[var6];

               int var8;
               for(var8 = 0; var8 < var7; ++var8) {
                  if (var10.af[var6 * 5 + var8] == var2) {
                     var7 = --var10.i[var6];

                     for(var8 = var8; var8 < var7; ++var8) {
                        var10.af[var6 * 5 + var8] = var10.af[var6 * 5 + var8 + 1];
                        var10.bU[var6 * 5 + var8] = var10.bU[var6 * 5 + var8 + 1];
                     }

                     var10.af[var6 * 5 + var7] = null;
                     break;
                  }
               }

               var10.ca[var6] = 0;

               for(var8 = 0; var8 < var10.i[var6]; ++var8) {
                  byte[] var10000 = var10.ca;
                  var10000[var6] |= var10.bU[var6 * 5 + var8];
               }
            }
         }
      }

      if ((var10 = var10).L <= 0) {
         if (!bb && var2.m instanceof jE) {
            throw new AssertionError();
         }

         if (!bb && var2.m instanceof jQ) {
            throw new AssertionError();
         }

         if (!bb && var2.m instanceof fY) {
            throw new AssertionError();
         }

         if (!bb && var2.m instanceof ci) {
            throw new AssertionError();
         }

         var3 = var2.g + var10.e;
         var4 = var2.f + var10.e;
         var5 = var2.getPlane();
         client.cV.trace("Game object despawn: {}", var2.getId());
         if (var2.m instanceof jM) {
            var10.f[var3 >> 3][var4 >> 3].a.remove(var2);
         }

         if (var10.as) {
            GameObjectDespawned var11;
            (var11 = new GameObjectDespawned()).setTile(var10.ak[var5][var3][var4]);
            var11.setGameObject(var2);
            dF.c.getCallbacks().post(var11);
         }

         if (var10.as && client.dd != null) {
            client.dd.invalidateZone(var10, var3 >> 3, var4 >> 3);
         }
      }

   }

   public int getWorldViewId() {
      return this.be;
   }

   public int[][][] getTileHeights() {
      return this.t;
   }

   public void setDrawDistance(int var1) {
      aY = var1;
   }

   public byte[][][] getExtendedTileSettings() {
      return this.c;
   }

   public int[] getMapRegions() {
      return this.ag;
   }

   public Tile[][][] getTiles() {
      return this.ae;
   }

   public int[][][] getRoofs() {
      return this.ce;
   }

   public boolean isInstance() {
      return this.aw;
   }

   public int getMinLevel() {
      return this.U;
   }

   public int getBaseY() {
      return this.aG;
   }

   public Tile[][][] getExtendedTiles() {
      return this.ak;
   }

   public void buildRoofs() {
      this.ce = new int[this.C][this.r][this.D];
      int var1 = 1;

      for(int var2 = 0; var2 < this.C; ++var2) {
         for(int var3 = 0; var3 < this.D; ++var3) {
            for(int var4 = 0; var4 < this.r; ++var4) {
               kB var5;
               if ((var5 = this.ak[var2][var4][var3]) != null && this.ce[var2][var4][var3] == 0 && this.l(var2, var4, var3)) {
                  int var7 = var1++;
                  ci var10 = this;
                  this.f(var5.a);

                  int var11;
                  while((var11 = var10.r()) != var10.bR) {
                     int var8 = var11 >> var10.aB & var10.aE;
                     int var9 = var11 & var10.ad;
                     var11 = var11 >> var10.ap & 3;
                     if (var10.ce[var11][var8][var9] == 0) {
                        if (var10.l(var11, var8, var9)) {
                           var10.m(var11, var8 - 1, var9);
                           var10.m(var11, var8 + 1, var9);
                           var10.m(var11, var8, var9 - 1);
                           var10.m(var11, var8, var9 + 1);
                           var10.m(var11, var8 - 1, var9 - 1);
                           var10.m(var11, var8 + 1, var9 - 1);
                           var10.m(var11, var8 - 1, var9 + 1);
                           var10.m(var11, var8 + 1, var9 + 1);
                           if (var11 < 3 && var10.l(var11 + 1, var8, var9) && (client.E & 16) != 0) {
                              var10.m(var11 + 1, var8, var9);
                           }
                        }

                        var10.ce[var11][var8][var9] = var7;
                     }
                  }
               }
            }
         }
      }

   }

   public int getRoofRemovalMode() {
      return this.ai;
   }

   public byte getOverrideSaturation() {
      return this.k.b;
   }

   public short[][][] getOverlayIds() {
      return this.aA;
   }

   public int getBaseX() {
      return this.aF;
   }

   public byte getOverrideLuminance() {
      return this.k.c;
   }

   public void removeTile(Tile var1) {
      kB var6;
      int var7 = (var6 = (kB)var1).a;
      int var2 = this.ao[var7];
      int var3 = var7 >> this.aB & this.aE;
      int var4 = var7 & this.ad;
      ku var9 = this.f[var3 >> 3][var4 >> 3];
      if ((var2 & 2048) != 0) {
         var9.a.remove(this.aj[var7]);
      }

      if ((var2 & 12288) != 0) {
         var9.a.remove(this.aC[var7]);
      }

      if ((var2 & 16384) != 0) {
         var9.a.remove(this.au[var7]);
      }

      if ((var2 & '耀') != 0) {
         var9.a.remove(this.aD[var7]);
      }

      byte var8 = this.i[var7];

      for(var4 = 0; var4 < var8; ++var4) {
         cJ var5 = this.af[var7 * 5 + var4];
         var9.a.remove(var5);
      }

      this.i(var7);
   }

   public void setRoofRemovalMode(int var1) {
      this.ai = var1;
   }

   public byte getOverrideAmount() {
      return this.k.a;
   }

   public int getDrawDistance() {
      return aY;
   }

   public short[][][] getUnderlayIds() {
      return this.az;
   }

   public byte getOverrideHue() {
      return this.k.d;
   }

   public byte[][][] getTileShapes() {
      return this.b;
   }

   public int[][][] getInstanceTemplateChunks() {
      return this.ar;
   }

   @ObfuscatedName("rn")
   public final boolean d(int var1) {
      return (this.ao[var1] & 1) != 0;
   }

   @ObfuscatedName("sl")
   private boolean k(int var1) {
      return (this.ao[var1] & 4) != 0;
   }

   @ObfuscatedName("su")
   private int l(int var1) {
      return this.ao[var1] >> 16 & 15;
   }

   @ObfuscatedName("sy")
   public final void a(int var1, int var2) {
      int var3 = var2;
      var2 = var1;
      ci var15 = this;
      int var4 = var1 - this.e;
      int var5 = var3 - this.e;
      this.d(this.a(0, var1, var3), this.bZ);

      int var6;
      int var7;
      for(var6 = 0; var6 < 3; ++var6) {
         var7 = var15.a(var6, var2, var3);
         var15.d(var7 + var15.aq, var7);
         if (var15.d(var7)) {
            byte var8 = var15.i[var7];

            for(int var9 = 0; var9 < var8; ++var9) {
               cJ var10;
               if ((int)((var10 = var15.af[var7 * 5 + var9]).l >> 16 & 7L) == 2 && var4 == var10.g && var5 == var10.f) {
                  --var10.h;
               }
            }

            cS var16;
            if ((var16 = var15.au[var7]) != null) {
               --var16.j;
            }

            ce var17;
            if ((var17 = var15.aj[var7]) != null) {
               --var17.a;
            }

            cD var13;
            if ((var13 = var15.aD[var7]) != null) {
               --var13.a;
            }
         }
      }

      var6 = var15.a(0, var2, var3);
      if (!var15.d(var6)) {
         var15.m(var6);
      }

      if (var15.ak[0][var2][var3] == null) {
         var15.ak[0][var2][var3] = new kB(var15, var6);
      }

      int[] var10000 = var15.ao;
      var10000[var6] |= 32;
      var7 = var15.a(3, var2, var3);
      var15.d(var15.bZ, var7);
      var10000 = var15.ao;
      var10000[var7] &= -2;
      var15.i(var15.bZ);
      var15.ak[3][var2][var3] = null;
      var15.ak[0][var2][var3].b = new kB(var15, var7);
   }

   @ObfuscatedName("ti")
   private void m(int var1) {
      this.i(var1);
      this.ao[var1] = 1;
   }

   @ObfuscatedName("tu")
   @ObfuscatedSignature(
      signature = "(Ljj;IIIII)V"
   )
   public final void a(class243 var1, int var2, int var3, int var4, int var5, int var6) {
      this.b(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedName("ue")
   private boolean g(int var1, int var2, int var3, int var4) {
      return this.e(var1, var2, var3, var4);
   }

   @ObfuscatedName("uf")
   private boolean n(int var1, int var2, int var3) {
      int var4 = ((var2 << 3) - this.e << 7) + 512 - this.bC;
      int var5 = ((var3 << 3) - this.e << 7) + 512 - this.bL;
      int var6 = this.cd[var1][var2][var3] - this.bt;
      int var7 = osrs.cc.d.i;
      int var8 = osrs.cc.d.b;
      int var9 = osrs.cc.d.k;
      int var10 = osrs.cc.d.m;
      int var11 = osrs.cc.d.h;
      int var12 = var5 * this.T - var4 * this.z >> 16;
      int var13 = var6 * this.O + var12 * this.S >> 16;
      int var14 = 724 * this.S >> 16;
      if ((var13 += var14) > 50) {
         var4 = var5 * this.z + var4 * this.T >> 16;
         var5 = var7 * (var4 - 724);
         var4 = var7 * (var4 + 724);
         if (var5 < var8 * var13 && var4 > var9 * var13) {
            var4 = var6 * this.S - var12 * this.O >> 16;
            var5 = 724 * this.O >> 16;
            if (var7 * (var4 + var5) > var10 * var13) {
               var1 = -this.bP[var1][var2][var3];
               var1 = var5 + (var1 * this.S >> 16);
               if (var7 * (var4 - var1) < var11 * var13) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @ObfuscatedName("vu")
   private boolean h(int var1, int var2, int var3, int var4) {
      return this.d(var1, var2, var3, var4);
   }

   @ObfuscatedName("xi")
   private int n(int var1) {
      return this.ao[var1] >> 20 & 15;
   }

   @ObfuscatedName("zf")
   @ObfuscatedSignature(
      signature = "(Ljg;III)Z"
   )
   private static boolean f(ci var0, int var1, int var2, int var3) {
      int var4;
      if ((var4 = var0.bv[var1][var2][var3]) == -var0.bD) {
         return false;
      } else if (var4 == var0.bD) {
         return true;
      } else {
         var4 = var2 << 7;
         int var5 = var3 << 7;
         int var10001 = var4 + 1;
         int var10002 = var0.t[var1][var2][var3];
         var4 = var5 + 1;
         int var10000 = var0.br;
         var0.bv[var1][var2][var3] = -var0.bD;
         return false;
      }
   }

   @ObfuscatedName("yc")
   @ObfuscatedSignature(
      signature = "(Ljg;III)V"
   )
   public static void a(ci var0, int var1, int var2, int var3) {
      int var4;
      if (var0 == null) {
         var2 = var1 + var0.av;
         var3 = var1 + var0.w;
         var4 = var0.i(var1, var2, var3);
         if (var0.k(var4) && (var0.ao[var4] & 2048) != 0) {
            ce var14 = var0.aj[var4];
            var0.aj[var4] = null;
            int[] var10000 = var0.bS;
            var10000[var4] &= -2049;
            if (var14.g instanceof jM) {
               var0.f[var2 >> 3][var3 >> 3].a.remove(var14);
            }

            if (var0.s) {
               GroundObjectDespawned var13;
               (var13 = new GroundObjectDespawned()).setTile(var0.ak[var1][var2][var3]);
               var13.setGroundObject(var14);
               dF.c.getCallbacks().post(var13);
            }

            if (var0.aw && client.dd != null) {
               client.dd.invalidateZone(var0, var2 >> 3, var3 >> 3);
            }
         }

      } else {
         var4 = var2 + var0.e;
         int var5 = var3 + var0.e;
         var1 = var0.a(var1, var4, var5);
         if (var0.d(var1)) {
            byte var12 = var0.i[var1];

            for(var5 = 0; var5 < var12; ++var5) {
               cJ var6;
               if ((int)((var6 = var0.af[var1 * 5 + var5]).l >> 16 & 7L) == 2 && var2 == var6.g && var3 == var6.f) {
                  var0.removeGameObject(var6);
                  return;
               }
            }
         }

      }
   }

   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      signature = "(Ljg;III)V"
   )
   public static void b(ci var0, int var1, int var2, int var3) {
      cA var4;
      if (var0 == null && (var4 = var0.bl[var1][var1][var1]) != null) {
         int var10000 = var4.f;
      }

      var2 += var0.e;
      var3 += var0.e;
      var1 = var0.a(var1, var2, var3);
      if (var0.d(var1)) {
         cd var8 = var0.aC[var1];
         var0.aC[var1] = null;
         int[] var9 = var0.ao;
         var9[var1] &= -12289;
         var0.f[var2 >> 3][var3 >> 3].a.remove(var8);
      }

   }

   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      signature = "(Ljg;III)V"
   )
   public static void c(ci var0, int var1, int var2, int var3) {
      if (var0 == null) {
         cA var7;
         if ((var7 = var0.bl[var1][var1][var1]) != null) {
            var7.d = null;
         }

      } else {
         var2 += var0.e;
         var3 += var0.e;
         int var4 = var0.a(var1, var2, var3);
         if (var0.d(var4) && (var0.ao[var4] & 2048) != 0) {
            ce var5 = var0.aj[var4];
            var0.aj[var4] = null;
            int[] var10000 = var0.ao;
            var10000[var4] &= -2049;
            if (var5.g instanceof jM) {
               var0.f[var2 >> 3][var3 >> 3].a.remove(var5);
            }

            if (var0.as) {
               GroundObjectDespawned var8;
               (var8 = new GroundObjectDespawned()).setTile(var0.ak[var1][var2][var3]);
               var8.setGroundObject(var5);
               dF.c.getCallbacks().post(var8);
            }

            if (var0.as && client.dd != null) {
               client.dd.invalidateZone(var0, var2 >> 3, var3 >> 3);
            }
         }

      }
   }

   @ObfuscatedName("fw")
   public static void b(int var0, int var1, int var2, int var3) {
      ci var4;
      int var5 = (var4 = ec.a.o).e + var1;
      int var6 = var2 + var4.e;
      ku var7 = var4.f[var5 >> 3][var6 >> 3];
      if (var3 == 0) {
         cS var8;
         if ((var8 = var4.h(var0, var1, var2)) != null && (var8.i instanceof jM || var8.e instanceof jM) && !var7.a.contains(var8)) {
            var7.a.add(var8);
         }
      } else if (var3 == 1) {
         cD var9;
         if ((var9 = d(var4, var0, var1, var2)) != null && (var9.g instanceof jM || var9.k instanceof jM) && !var7.a.contains(var9)) {
            var7.a.add(var9);
         }
      } else if (var3 == 2) {
         cJ var10;
         if ((var10 = var4.c(var0, var1, var2)) != null && var10.m instanceof jM && !var7.a.contains(var10)) {
            var7.a.add(var10);
         }
      } else {
         ce var11;
         if (var3 == 3 && (var11 = var4.g(var0, var1, var2)) != null && var11.g instanceof jM && !var7.a.contains(var11)) {
            var7.a.add(var11);
         }
      }

      if (client.dd != null) {
         client.dd.invalidateZone(var4, var5 >> 3, var6 >> 3);
      }

   }

   @ObfuscatedName("hc")
   public static int b(int var0, int var1) {
      if ((var1 = (var0 & 127) * var1 >> 7) < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      signature = "(Ljr;Z)Z"
   )
   public static boolean a(jE var0, boolean var1) {
      return dF.c.getCallbacks().draw(var0, var1);
   }

   @ObfuscatedName("mo")
   @ObfuscatedSignature(
      signature = "(Ljg;III)Lka;"
   )
   public static cD d(ci var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.k(var1, var1, var1);
      }

      var2 += var0.e;
      var3 += var0.e;
      var1 = var0.a(var1, var2, var3);
      return var0.d(var1) ? var0.aD[var1] : null;
   }

   @ObfuscatedName("og")
   @ObfuscatedSignature(
      signature = "(Ljg;Liz;)V"
   )
   public static void a(ci var0, ca var1) {
      if (var0 == null && var1 != var0.bG) {
         var0.bG = var1;
         gp.a(var0, var0.bH, var0.L, var0.bJ, var0.bh, var0.br);
      }

      if (var0.bG != var1) {
         var0.bG = var1;
         gp.a(var0, var0.X, var0.J, var0.P, var0.F, var0.M);
      }

   }

   @ObfuscatedName("qa")
   public static boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      boolean var10000;
      if ((var1 >= var2 || var1 >= var3 || var1 >= var4) && (var1 <= var2 || var1 <= var3 || var1 <= var4) && (var0 >= var5 || var0 >= var6 || var0 >= var7) && (var0 <= var5 || var0 <= var6 || var0 <= var7)) {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         var3 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3);
         var0 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7);
         if (var8 == 0) {
            if (var3 == 0) {
               return true;
            }

            if (var3 < 0) {
               var10000 = var0 <= 0;
            } else {
               if (var0 < 0) {
                  return false;
               }

               var10000 = true;
            }

            return var10000;
         }

         if (var8 < 0) {
            if (var3 <= 0 && var0 <= 0) {
               return true;
            }

            return false;
         }

         if (var3 >= 0 && var0 >= 0) {
            return true;
         }
      }

      var10000 = false;
      return var10000;
   }

   @ObfuscatedName("qf")
   @ObfuscatedSignature(
      signature = "(Ljg;III)V"
   )
   public static void e(ci var0, int var1, int var2, int var3) {
      cA var4;
      if (var0 == null && (var4 = var0.bl[var1][var1][var1]) != null) {
         var4.h = null;
      }

      var0.by = var1;
      var0.K = var2;
      var0.aa = var3;
   }

   @ObfuscatedName("sx")
   public static void e(int var0) {
      kd var1;
      ci var2;
      if ((var2 = (var1 = osrs.aM.a).o).bT.get(var0)) {
         var2.g();
      }

      for(var0 = 0; var0 < var1.t.a; ++var0) {
         long var6 = (long)var1.t.b[var0];
         ((hG)var1.l.b(var6)).e.o.g();
      }

   }

   @ObfuscatedName("uh")
   @ObfuscatedSignature(
      signature = "(Ljg;[IIIIII)V"
   )
   public static void a(ci var0, int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         int var10 = var3 = var2;
         cA var11;
         if ((var11 = var0.bl[var10][var2][var3]) != null) {
            cE var10000 = var11.e;
            co var14 = var11.g;
         }

      } else {
         var5 += var0.e;
         var6 += var0.e;
         var3 = var0.a(var4, var5, var6);
         if (var0.d(var3)) {
            int var8;
            if (((var4 = var0.ao[var3]) & 256) != 0) {
               if ((var8 = var0.am[var3].a) != 0) {
                  for(var3 = 0; var3 < 4; ++var3) {
                     var1[var2] = var8;
                     var1[var2 + 1] = var8;
                     var1[var2 + 2] = var8;
                     var1[var2 + 3] = var8;
                     var2 += 512;
                  }
               }

               return;
            }

            co var13;
            if ((var4 & 1024) != 0 && (var13 = var0.ax[var3]) != null) {
               var8 = var13.r;
               var3 = var13.m;
               var5 = var13.o;
               var4 = var13.t;
               int[] var9 = aW[var8];
               int[] var12 = aX[var3];
               var6 = 0;
               int var7;
               if (var5 != 0) {
                  for(var7 = 0; var7 < 4; ++var7) {
                     var1[var2] = var9[var12[var6++]] == 0 ? var5 : var4;
                     var1[var2 + 1] = var9[var12[var6++]] == 0 ? var5 : var4;
                     var1[var2 + 2] = var9[var12[var6++]] == 0 ? var5 : var4;
                     var1[var2 + 3] = var9[var12[var6++]] == 0 ? var5 : var4;
                     var2 += 512;
                  }
               } else {
                  for(var7 = 0; var7 < 4; ++var7) {
                     if (var9[var12[var6++]] != 0) {
                        var1[var2] = var4;
                     }

                     if (var9[var12[var6++]] != 0) {
                        var1[var2 + 1] = var4;
                     }

                     if (var9[var12[var6++]] != 0) {
                        var1[var2 + 2] = var4;
                     }

                     if (var9[var12[var6++]] != 0) {
                        var1[var2 + 3] = var4;
                     }

                     var2 += 512;
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("wq")
   @ObfuscatedSignature(
      signature = "(Ljg;IIIILjr;JLjr;Ljr;)V"
   )
   public static void a(ci var0, int var1, int var2, int var3, int var4, kk var5, long var6, kk var8, kk var9) {
      if (var0 == null) {
         cd var18;
         (var18 = new cd()).c = var5;
         var18.d = (var1 << 7) + 64;
         var18.g = (var1 << 7) + 64;
         var18.h = var1;
         var18.a = var6;
         var18.c = var5;
         var18.b = var5;
         int var12 = 0;
         cA var15;
         if ((var15 = var0.bl[var1][var1][var1]) != null) {
            for(int var16 = 0; var16 < var15.b * -231278501; ++var16) {
               if ((var15.c[var16].b * -582891201 & 256) == 256 && var15.c[var16].m instanceof cn) {
                  cn var17;
                  (var17 = (cn)var15.c[var16].m).c();
                  if (var17.aI > var12) {
                     var12 = var17.aI;
                  }
               }
            }
         }

         var18.g = var12 * -1663211613;
         if (var0.bl[var1][var1][var1] == null) {
            var0.bl[var1][var1][var1] = new cA(var1, var1, var1);
         }

         var0.bl[var1][var1][var1].d = var18;
      }

      int var10 = var2 + var0.e;
      int var11 = var3 + var0.e;
      cd var32;
      (var32 = new cd()).c = var5;
      var32.d = (var2 << 7) + 64;
      var32.g = (var3 << 7) + 64;
      var32.h = var4;
      var32.a = var6;
      var32.e = var8;
      var32.b = var9;
      var32.i = var1;
      var2 = 0;
      var3 = var0.a(var1, var10, var11);
      if (var0.d(var3)) {
         byte var27 = var0.i[var3];

         for(int var29 = 0; var29 < var27; ++var29) {
            cJ var30;
            if (((var30 = var0.af[var3 * 5 + var29]).e & 256) == 256 && var30.m instanceof cn) {
               cn var31;
               (var31 = (cn)var30.m).calculateBoundsCylinder();
               if (var31.aI > var2) {
                  var2 = var31.aI;
               }
            }
         }
      }

      var32.f = var2;
      if (!var0.d(var3)) {
         var0.m(var3);
      }

      if (var0.ak[var1][var10][var11] == null) {
         var0.ak[var1][var10][var11] = new kB(var0, var3);
      }

      ku var28 = var0.f[var10 >> 3][var11 >> 3];
      if ((var0.ao[var3] & 12288) != 0) {
         var28.a.remove(var0.aC[var3]);
      }

      var0.aC[var3] = var32;
      int[] var10000 = var0.ao;
      var10000[var3] &= -12289;
      var10000 = var0.ao;
      var10000[var3] |= var2 != 0 ? 8192 : 4096;
      var28.a.add(var32);
   }
}
