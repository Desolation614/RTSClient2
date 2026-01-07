package osrs;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.api.FontTypeFace;
import net.runelite.api.Point;
import net.runelite.api.SpritePixels;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetUtil;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public class fd extends hR implements Widget {
   @ObfuscatedName("bm")
   public static boolean a = false;
   @ObfuscatedName("ux")
   private static boolean ci = !fd.class.desiredAssertionStatus();
   @ObfuscatedName("xk")
   public int b = -1;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 861798047
   )
   public int c = 0;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -544905355
   )
   public int d = 0;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = 1644965835
   )
   public int e = 0;
   @ObfuscatedName("be")
   public boolean f = false;
   @ObfuscatedName("bf")
   String g;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 2121853591
   )
   public int h = 0;
   @ObfuscatedName("bh")
   public int i;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -985509085
   )
   public int j;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -314541625
   )
   public int k;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -712309907
   )
   public int l = 0;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 171818037
   )
   public int m = -1;
   @ObfuscatedName("bp")
   public int n;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 1720170959
   )
   public int o = 0;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 70757019
   )
   public int p = 0;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 1132980169
   )
   public int q = 0;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -142438823
   )
   public int r = 0;
   @ObfuscatedName("bw")
   public int s = -926100227;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 2112218907
   )
   public int t = 0;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 1276950699
   )
   public int u = 0;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = -795816131
   )
   public int v;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = 1279746735
   )
   public int w;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = -929316875
   )
   public int x;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = -1093557263
   )
   public int y;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = -1269649303
   )
   public int z;
   @ObfuscatedName("cf")
   public boolean A;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -870665995
   )
   public int B;
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      signature = "Lwu;"
   )
   public jl C;
   @ObfuscatedName("ci")
   public int D;
   @ObfuscatedName("cj")
   public boolean E;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = 1140797911
   )
   public int F;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = -603567659
   )
   public int G;
   @ObfuscatedName("cm")
   public boolean H;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = 1528347747
   )
   public int I;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = 1814753599
   )
   public int J;
   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = 505347959
   )
   public int K;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = 127427793
   )
   public int L;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = -1883874225
   )
   public int M;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -824756439
   )
   public int N;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = -2072893333
   )
   public int O;
   @ObfuscatedName("cu")
   public boolean P;
   @ObfuscatedName("cv")
   public String Q;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = -669158221
   )
   public int R;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = 944072121
   )
   public int S;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = 1061256913
   )
   public int T;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = -685908593
   )
   public int U;
   @ObfuscatedName("da")
   public boolean V;
   @ObfuscatedName("db")
   @ObfuscatedGetter(
      intValue = 1189051695
   )
   public int W;
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      signature = "Loq;"
   )
   public eY X;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = 347016189
   )
   int Y;
   @ObfuscatedName("de")
   public boolean Z;
   @ObfuscatedName("df")
   @ObfuscatedGetter(
      intValue = -415606593
   )
   public int aa;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = -334271589
   )
   public int ab;
   @ObfuscatedName("dh")
   public String ac;
   @ObfuscatedName("di")
   @ObfuscatedGetter(
      intValue = -61880125
   )
   public int ad;
   @ObfuscatedName("dj")
   public boolean ae;
   @ObfuscatedName("dk")
   public boolean af;
   @ObfuscatedName("dl")
   @ObfuscatedGetter(
      intValue = -505904553
   )
   public int ag;
   @ObfuscatedName("dm")
   @ObfuscatedGetter(
      intValue = 2046893045
   )
   public int ah;
   @ObfuscatedName("dn")
   @ObfuscatedGetter(
      intValue = 1024831575
   )
   public int ai;
   @ObfuscatedName("do")
   @ObfuscatedGetter(
      intValue = 2117685601
   )
   public int aj;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = 633337365
   )
   public int ak;
   @ObfuscatedName("dq")
   @ObfuscatedGetter(
      intValue = 2140261231
   )
   public int al;
   @ObfuscatedName("dr")
   @ObfuscatedGetter(
      intValue = -1028840015
   )
   int am;
   @ObfuscatedName("ds")
   @ObfuscatedGetter(
      intValue = 1687014423
   )
   public int an;
   @ObfuscatedName("dt")
   @ObfuscatedGetter(
      intValue = 1140657255
   )
   public int ao;
   @ObfuscatedName("du")
   @ObfuscatedGetter(
      intValue = 1013029805
   )
   public int ap;
   @ObfuscatedName("dv")
   @ObfuscatedGetter(
      intValue = 1537543699
   )
   public int aq;
   @ObfuscatedName("dw")
   public String ar;
   @ObfuscatedName("dx")
   @ObfuscatedGetter(
      intValue = -372687561
   )
   public int as;
   @ObfuscatedName("dy")
   @ObfuscatedGetter(
      intValue = 1530023549
   )
   public int at;
   @ObfuscatedName("dz")
   @ObfuscatedGetter(
      intValue = -1033802861
   )
   public int au;
   @ObfuscatedName("ea")
   public boolean av;
   @ObfuscatedName("eb")
   @ObfuscatedGetter(
      intValue = -242750207
   )
   public int aw;
   @ObfuscatedName("ec")
   public String[][] ax;
   @ObfuscatedName("ed")
   public Object[] ay;
   @ObfuscatedName("ee")
   private int[] cj;
   @ObfuscatedName("ef")
   public byte[][] az;
   @ObfuscatedName("eg")
   public Object[] aA;
   @ObfuscatedName("eh")
   private int[] ck;
   @ObfuscatedName("ei")
   @ObfuscatedGetter(
      intValue = -1537574259
   )
   public int aB;
   @ObfuscatedName("ej")
   public String aC;
   @ObfuscatedName("ek")
   public boolean aD;
   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = 23408241
   )
   public int aE;
   @ObfuscatedName("em")
   private int[] cl;
   @ObfuscatedName("en")
   private String[] cm;
   @ObfuscatedName("eo")
   public int aF;
   @ObfuscatedName("ep")
   public boolean aG;
   @ObfuscatedName("eq")
   public int[] aH;
   @ObfuscatedName("er")
   public String aI;
   @ObfuscatedName("es")
   public String[] aJ;
   @ObfuscatedName("et")
   @ObfuscatedGetter(
      intValue = 1177108201
   )
   public int aK;
   @ObfuscatedName("eu")
   public int aL;
   @ObfuscatedName("ev")
   public Object[] aM;
   @ObfuscatedName("ew")
   public byte[][] aN;
   @ObfuscatedName("ex")
   public boolean aO;
   @ObfuscatedName("ey")
   public int[] aP;
   @ObfuscatedName("ez")
   @ObfuscatedSignature(
      signature = "Lov;"
   )
   public fd aQ;
   @ObfuscatedName("fa")
   public Object[] aR;
   @ObfuscatedName("fb")
   public int[] aS;
   @ObfuscatedName("fc")
   public Object[] aT;
   @ObfuscatedName("fd")
   public Object[] aU;
   @ObfuscatedName("fe")
   public Object[] aV;
   @ObfuscatedName("ff")
   public Object[] aW;
   @ObfuscatedName("fg")
   public Object[] aX;
   @ObfuscatedName("fh")
   public Object[] aY;
   @ObfuscatedName("fi")
   public Object[] aZ;
   @ObfuscatedName("fj")
   public Object[] ba;
   @ObfuscatedName("fk")
   public Object[] bb;
   @ObfuscatedName("fl")
   public int[] bc;
   @ObfuscatedName("fm")
   public Object[] bd;
   @ObfuscatedName("fn")
   public Object[] be;
   @ObfuscatedName("fo")
   public Object[] bf;
   @ObfuscatedName("fp")
   public Object[] bg;
   @ObfuscatedName("fq")
   public Object[] bh;
   @ObfuscatedName("fr")
   public Object[] bi;
   @ObfuscatedName("fs")
   public Object[] bj;
   @ObfuscatedName("ft")
   public int[] bk;
   @ObfuscatedName("fu")
   public Object[] bl;
   @ObfuscatedName("fv")
   public Object[] bm;
   @ObfuscatedName("fw")
   public Object[] bn;
   @ObfuscatedName("fx")
   public Object[] bo;
   @ObfuscatedName("fy")
   public Object[] bp;
   @ObfuscatedName("fz")
   public Object[] bq;
   @ObfuscatedName("ga")
   public Object[] br;
   @ObfuscatedName("gb")
   @ObfuscatedGetter(
      intValue = 380780679
   )
   public int bs;
   @ObfuscatedName("gc")
   public String bt;
   @ObfuscatedName("gd")
   public String bu;
   @ObfuscatedName("ge")
   public boolean bv;
   @ObfuscatedName("gf")
   @ObfuscatedGetter(
      intValue = 192102523
   )
   public int bw;
   @ObfuscatedName("gg")
   public int[] bx;
   @ObfuscatedName("gh")
   public Object[] by;
   @ObfuscatedName("gi")
   @ObfuscatedGetter(
      intValue = 1852857817
   )
   public int bz;
   @ObfuscatedName("gj")
   public Object[] bA;
   @ObfuscatedName("gk")
   @ObfuscatedGetter(
      intValue = -898268281
   )
   public int bB;
   @ObfuscatedName("gl")
   public Object[] bC;
   @ObfuscatedName("gm")
   public int[] bD;
   @ObfuscatedName("gn")
   public Object[] bE;
   @ObfuscatedName("go")
   public Object[] bF;
   @ObfuscatedName("gp")
   @ObfuscatedGetter(
      intValue = -756517917
   )
   public int bG;
   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      signature = "[Lov;"
   )
   public fd[] bH;
   @ObfuscatedName("gr")
   public Object[] bI;
   @ObfuscatedName("gs")
   @ObfuscatedGetter(
      intValue = -876976075
   )
   public int bJ;
   @ObfuscatedName("gt")
   public boolean bK;
   @ObfuscatedName("gu")
   public Object[] bL;
   @ObfuscatedName("gv")
   public int[] bM;
   @ObfuscatedName("gw")
   public int[][] bN;
   @ObfuscatedName("gx")
   public int[] bO;
   @ObfuscatedName("gy")
   @ObfuscatedGetter(
      intValue = -241170865
   )
   public int bP;
   @ObfuscatedName("gz")
   @ObfuscatedGetter(
      intValue = -816151335
   )
   public int bQ;
   @ObfuscatedName("hc")
   public boolean bR;
   @ObfuscatedName("hd")
   private int[] cn;
   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      signature = "Lop;"
   )
   eW bS;
   @ObfuscatedName("hi")
   @ObfuscatedGetter(
      intValue = -2040815781
   )
   public int bT;
   @ObfuscatedName("hj")
   @ObfuscatedGetter(
      intValue = -587478263
   )
   public int bU;
   @ObfuscatedName("hk")
   public boolean bV;
   @ObfuscatedName("hm")
   public int bW;
   @ObfuscatedName("ho")
   public int[] bX;
   @ObfuscatedName("hr")
   @ObfuscatedGetter(
      intValue = 487450423
   )
   private int co;
   @ObfuscatedName("hs")
   public boolean bY;
   @ObfuscatedName("ht")
   @ObfuscatedGetter(
      intValue = 1424273087
   )
   int bZ;
   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      signature = "Lis;"
   )
   bS ca;
   @ObfuscatedName("hx")
   HashMap cb;
   @ObfuscatedName("hy")
   HashMap cc;
   @ObfuscatedName("hz")
   private Object[] cp;
   @ObfuscatedName("js")
   public int cd = -1;
   @ObfuscatedName("mv")
   private short cq = -1;
   @ObfuscatedName("ua")
   public int ce = -1;
   @ObfuscatedName("ut")
   private short cr = -1;

   public fd() {
      this.d();
      this.k = 0;
      this.e();
      this.i = 0;
      this.n = 0;
      this.F = 1;
      this.T = 1;
      this.v = -1;
      this.M = -1;
      this.P = false;
      this.y = 65535;
      this.G = 0;
      this.L = 0;
      this.D = 0;
      this.B = 0;
      this.S = 0;
      this.R = 0;
      this.U = 0;
      this.N = 0;
      this.O = 0;
      this.A = false;
      this.C = jl.c;
      this.K = 0;
      this.z = 0;
      this.J = 1;
      this.E = false;
      this.x = -1;
      this.I = -1;
      this.w = 0;
      this.H = false;
      this.ag = 0;
      this.W = 0;
      this.ap = 1;
      this.aq = -1;
      this.am = 1;
      this.Y = -1;
      this.at = -1;
      this.as = -1;
      this.ah = 0;
      this.ad = 0;
      this.ak = 0;
      this.ai = 0;
      this.ab = 0;
      this.ao = 100;
      this.an = 0;
      this.al = 0;
      this.ae = false;
      this.V = false;
      this.au = 2;
      this.aj = -1;
      this.aC = "";
      this.bu = "";
      this.aa = 0;
      this.aK = 0;
      this.aB = 0;
      this.aG = false;
      this.aE = 0;
      this.av = false;
      this.ac = "";
      this.aF = -209307052;
      this.aQ = null;
      this.aL = 0;
      this.aw = 0;
      this.aD = false;
      this.bt = "";
      this.aO = false;
      this.bB = -1;
      this.ar = "";
      this.Q = "Ok";
      this.bJ = -1;
      this.bG = 0;
      this.bz = 0;
      this.bQ = 0;
      this.bv = false;
      this.bK = false;
      this.bP = -1;
      this.bs = 0;
      this.bw = 0;
      this.bU = 0;
      this.bW = 1058398199;
      this.bT = -1;
      this.bY = false;
      this.bR = false;
      this.bV = false;
      this.bZ = -1;
   }

   @ObfuscatedSignature(
      signature = "(Lov;)V"
   )
   public fd(fd var1) {
      this.d();
      this.k = 0;
      this.e();
      this.i = 0;
      this.n = 0;
      this.F = 1;
      this.T = 1;
      this.v = -1;
      this.M = -1;
      this.P = false;
      this.y = 65535;
      this.G = 0;
      this.L = 0;
      this.D = 0;
      this.B = 0;
      this.S = 0;
      this.R = 0;
      this.U = 0;
      this.N = 0;
      this.O = 0;
      this.A = false;
      this.C = jl.c;
      this.K = 0;
      this.z = 0;
      this.J = 1;
      this.E = false;
      this.x = -1;
      this.I = -1;
      this.w = 0;
      this.H = false;
      this.ag = 0;
      this.W = 0;
      this.ap = 1;
      this.aq = -1;
      this.am = 1;
      this.Y = -1;
      this.at = -1;
      this.as = -1;
      this.ah = 0;
      this.ad = 0;
      this.ak = 0;
      this.ai = 0;
      this.ab = 0;
      this.ao = 100;
      this.an = 0;
      this.al = 0;
      this.ae = false;
      this.V = false;
      this.au = 2;
      this.aj = -1;
      this.aC = "";
      this.bu = "";
      this.aa = 0;
      this.aK = 0;
      this.aB = 0;
      this.aG = false;
      this.aE = 0;
      this.av = false;
      this.ac = "";
      this.aF = -209307052;
      this.aQ = null;
      this.aL = 0;
      this.aw = 0;
      this.aD = false;
      this.bt = "";
      this.aO = false;
      this.bB = -1;
      this.ar = "";
      this.Q = "Ok";
      this.bJ = -1;
      this.bG = 0;
      this.bz = 0;
      this.bQ = 0;
      this.bv = false;
      this.bK = false;
      this.bP = -1;
      this.bs = 0;
      this.bw = 0;
      this.bU = 0;
      this.bW = 1058398199;
      this.bT = -1;
      this.bY = false;
      this.bR = false;
      this.bV = false;
      this.bZ = -1;
      this.f = var1.f;
      this.m = var1.m;
      this.s = var1.s;
      this.g = var1.g;
      this.j = var1.j;
      this.q = var1.q;
      this.e = var1.e;
      this.p = var1.p;
      this.l = var1.l;
      this.d = var1.d;
      this.h = var1.h;
      this.c = var1.c;
      this.r = var1.r;
      this.u = var1.u;
      this.t = var1.t;
      this.o = var1.o;
      this.d();
      this.k = var1.k;
      this.e();
      this.i = var1.i;
      this.n = var1.n;
      this.F = var1.F;
      this.T = var1.T;
      this.v = var1.v;
      this.M = var1.M;
      this.y = var1.y;
      this.G = var1.G;
      this.P = var1.P;
      this.L = var1.L;
      this.D = var1.D;
      this.B = var1.B;
      this.S = var1.S;
      this.R = var1.R;
      this.U = var1.U;
      this.N = var1.N;
      this.O = var1.O;
      this.A = var1.A;
      this.C = var1.C;
      this.K = var1.K;
      this.z = var1.z;
      this.J = var1.J;
      this.E = var1.E;
      this.x = var1.x;
      this.I = var1.I;
      this.aI = var1.aI;
      this.w = var1.w;
      this.H = var1.H;
      this.ag = var1.ag;
      this.W = var1.W;
      this.af = var1.af;
      this.Z = var1.Z;
      this.ap = var1.ap;
      this.aq = var1.aq;
      this.am = var1.am;
      this.Y = var1.Y;
      this.at = var1.at;
      this.as = var1.as;
      this.ah = var1.ah;
      this.ad = var1.ad;
      this.ak = var1.ak;
      this.ai = var1.ai;
      this.ab = var1.ab;
      this.ao = var1.ao;
      this.an = var1.an;
      this.al = var1.al;
      if (var1.X != null) {
         this.X = new eY(var1.X);
      }

      this.ae = var1.ae;
      this.V = var1.V;
      this.au = var1.au;
      this.aj = var1.aj;
      this.aC = var1.aC;
      this.bu = var1.bu;
      this.aa = var1.aa;
      this.aK = var1.aK;
      this.aB = var1.aB;
      this.aG = var1.aG;
      this.cj = a(var1.cj);
      this.cn = a(var1.cn);
      this.cl = a(var1.cl);
      this.cm = (String[])a((Object[])var1.cm);
      if (var1.ca != null) {
         this.ca = new bS(var1.ca);
      }

      this.bZ = var1.bZ;
      this.cc = var1.cc;
      if (var1.cb != null) {
         this.cb = new HashMap();
         this.cb.putAll(var1.cb);
      }

      this.bS = null;
      this.aE = var1.aE;
      this.av = var1.av;
      int var2;
      if (var1.aN != null) {
         this.aN = new byte[var1.aN.length][];

         for(var2 = 0; var2 < var1.aN.length; ++var2) {
            this.aN[var2] = new byte[var1.aN[var2].length];
            System.arraycopy(var1.aN[var2], 0, this.aN[var2], 0, var1.aN[var2].length);
         }
      }

      if (var1.az != null) {
         this.az = new byte[var1.az.length][];

         for(var2 = 0; var2 < var1.az.length; ++var2) {
            this.az[var2] = new byte[var1.az[var2].length];
            System.arraycopy(var1.az[var2], 0, this.az[var2], 0, var1.az[var2].length);
         }
      }

      this.aP = a(var1.aP);
      this.aH = a(var1.aH);
      this.ac = var1.ac;
      this.aJ = (String[])a((Object[])var1.aJ);
      if (var1.ax != null) {
         this.ax = new String[var1.ax.length][];

         for(var2 = 0; var2 < var1.ax.length; ++var2) {
            this.ax[var2] = new String[var1.ax[var2].length];
            System.arraycopy(var1.ax[var2], 0, this.ax[var2], 0, var1.ax[var2].length);
         }
      }

      this.aF = var1.aF;
      this.aQ = var1.aQ;
      this.aL = var1.aL;
      this.aw = var1.aw;
      this.aD = var1.aD;
      this.bt = var1.bt;
      this.aO = var1.aO;
      this.bo = var1.bo;
      this.ba = var1.ba;
      this.bi = var1.bi;
      this.aW = var1.aW;
      this.bh = var1.bh;
      this.aR = var1.aR;
      this.aM = var1.aM;
      this.bE = var1.bE;
      this.bd = var1.bd;
      this.bF = var1.bF;
      this.aX = var1.aX;
      this.bb = var1.bb;
      this.bp = var1.bp;
      this.bc = var1.bc;
      this.br = var1.br;
      this.bk = var1.bk;
      this.bA = var1.bA;
      this.aS = var1.aS;
      this.aY = var1.aY;
      this.aZ = var1.aZ;
      this.bf = var1.bf;
      this.bI = var1.bI;
      this.bg = var1.bg;
      this.by = var1.by;
      this.bL = var1.bL;
      this.aU = var1.aU;
      this.bj = var1.bj;
      this.bq = var1.bq;
      this.bm = var1.bm;
      this.aA = var1.aA;
      this.ay = var1.ay;
      this.bl = var1.bl;
      this.bn = var1.bn;
      this.aT = var1.aT;
      this.bC = var1.bC;
      this.be = var1.be;
      this.aV = var1.aV;
      this.bN = var1.bN;
      this.bD = a(var1.bD);
      this.bx = a(var1.bx);
      this.bB = var1.bB;
      this.ar = var1.ar;
      this.Q = var1.Q;
      this.bO = a(var1.bO);
      this.bM = a(var1.bM);
      this.bJ = var1.bJ;
      this.bG = var1.bG;
      this.bz = var1.bz;
      this.bQ = var1.bQ;
      if (var1.bH != null) {
         this.bH = new fd[var1.bH.length];

         for(var2 = 0; var2 < var1.bH.length; ++var2) {
            this.bH[var2] = new fd(var1.bH[var2]);
         }
      }

      this.bv = var1.bv;
      this.bK = var1.bK;
      this.bP = var1.bP;
      this.bs = var1.bs;
      this.bw = var1.bw;
      this.bU = var1.bU;
      this.bW = var1.bW;
      this.bT = var1.bT;
      this.bX = a(var1.bX);
      this.bY = var1.bY;
      this.bR = var1.bR;
      this.bV = var1.bV;
      if (var1.co > 0) {
         this.ck = a(var1.ck);
         this.cp = a(var1.cp);
         this.co = var1.co;
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Lwt;B)[Ljava/lang/Object;",
      garbageValue = "0"
   )
   private Object[] b(jk var1) {
      int var2;
      if ((var2 = jk.a((jk)var1, (byte)53)) == 0) {
         return null;
      } else {
         Object[] var3 = new Object[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            int var5;
            if ((var5 = jk.a((jk)var1, (byte)50)) == 0) {
               var3[var4] = new Integer(jk.d(var1, 1687107415));
            } else if (var5 == 1) {
               var3[var4] = var1.p();
            }
         }

         this.aO = true;
         return var3;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(Lnn;B)Lrf;",
      garbageValue = "34"
   )
   public final gp a(eu var1) {
      a = false;
      if (this.aj == -1) {
         return null;
      } else {
         gp var2;
         if ((var2 = (gp)dX.a(var1.k, (long)this.aj)) != null) {
            return var2;
         } else {
            if ((var2 = eU.a(var1.j, var1.d, this.aj, 0)) != null) {
               var1.k.a((im)var2, (long)this.aj);
            } else {
               a = true;
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(Lnn;Les;I)Lwd;",
      garbageValue = "1183152930"
   )
   private iT a(eu var1, K var2) {
      if (this.aI != null && var2 != null) {
         eR var3;
         if ((var3 = (eR)hb.a(var1.e, this.aI, -2137007729)) == null) {
            var3 = new eR(this.aI, var2);
            var1.e.a(this.aI, var3);
         }

         if (var3.a == null && var3.b != null && osrs.G.a(var3.b, -2101621413)) {
            if (var3.b.c != null) {
               var3.a = cA.a(var3.b.c);
            }

            var3.b = null;
         }

         return var3.a;
      } else {
         return null;
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Lnn;ZLes;B)Lwd;",
      garbageValue = "-50"
   )
   public final iT a(eu var1, boolean var2, K var3) {
      SpritePixels var4;
      if (this.getSpriteId() != -1 && (var4 = (SpritePixels)client.du.get(this.getId())) != null) {
         return (iT)var4;
      } else {
         a = false;
         iT var11;
         if (this.aI != null && (var11 = this.b(var1, var3)) != null) {
            return var11;
         } else {
            int var12;
            if (var2) {
               var12 = this.I;
            } else {
               var12 = this.x;
            }

            iT var9;
            if (var12 == -1) {
               var9 = null;
            } else {
               long var7 = ((this.af ? 1L : 0L) << 38) + (long)var12 + ((long)this.ag << 36) + ((this.Z ? 1L : 0L) << 39) + ((long)this.W << 40);
               iT var10;
               if ((var10 = (iT)dX.a(var1.l, var7)) != null) {
                  var9 = var10;
               } else if ((var10 = hn.a(var1.j, var12, 0)) == null) {
                  a = true;
                  var9 = null;
               } else {
                  a(this, var10, -1905997701);
                  var1.l.a((im)var10, var7);
                  var9 = var10;
               }
            }

            return var9;
         }
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "299879929"
   )
   final void a(jk var1) {
      jk.a((jk)var1, (byte)58);
      this.f = true;
      this.j = jk.a((jk)var1, (byte)19);
      this.e = var1.d();
      this.c = var1.c();
      this.r = var1.c();
      this.u = var1.d();
      if (this.j == 9) {
         this.t = var1.c();
      } else {
         this.t = var1.d();
      }

      this.d = var1.B();
      this.h = var1.B();
      this.p = var1.B();
      this.l = var1.B();
      this.v = var1.d();
      if (this.v == 65535) {
         this.v = -1;
      } else {
         this.v += this.m & -65536;
      }

      this.P = jk.a((jk)var1, (byte)9) == 1;
      if (this.j == 0) {
         this.B = var1.d();
         this.S = var1.d();
         this.bY = jk.a(var1, (byte)-76) == 1;
      }

      if (this.j == 5) {
         this.x = jk.d(var1, 1687107415);
         this.w = var1.d();
         this.H = jk.a((jk)var1, (byte)1) == 1;
         this.K = jk.a((jk)var1, (byte)16);
         this.ag = jk.a(var1, (byte)-27);
         this.W = jk.d(var1, 1687107415);
         this.af = jk.a(var1, (byte)-42) == 1;
         this.Z = jk.a(var1, (byte)-44) == 1;
      }

      if (this.j == 6) {
         this.ap = 1;
         this.aq = var1.d();
         if (this.aq == 65535) {
            this.aq = -1;
         }

         this.ah = var1.c();
         this.ad = var1.c();
         this.ak = var1.d();
         this.ai = var1.d();
         this.ab = var1.d();
         this.ao = var1.d();
         this.at = var1.d();
         if (this.at == 65535) {
            this.at = -1;
         }

         this.ae = jk.a(var1, (byte)-6) == 1;
         var1.d();
         if (this.d != 0) {
            this.an = var1.d();
         }

         if (this.h != 0) {
            var1.d();
         }
      }

      if (this.j == 4) {
         this.aj = var1.d();
         if (this.aj == 65535) {
            this.aj = -1;
         }

         this.aC = var1.p();
         this.aa = jk.a(var1, (byte)-73);
         this.aK = jk.a((jk)var1, (byte)53);
         this.aB = jk.a(var1, (byte)-5);
         this.aG = jk.a((jk)var1, (byte)62) == 1;
         this.R = jk.d(var1, 1687107415);
      }

      if (this.j == 3) {
         this.R = jk.d(var1, 1687107415);
         this.A = jk.a((jk)var1, (byte)1) == 1;
         this.K = jk.a(var1, (byte)-13);
      }

      if (this.j == 9) {
         this.J = jk.a(var1, (byte)-51);
         this.R = jk.d(var1, 1687107415);
         this.E = jk.a(var1, (byte)-39) == 1;
      }

      this.aE = var1.f();
      this.ac = var1.p();
      int var2;
      if ((var2 = jk.a((jk)var1, (byte)7)) > 0) {
         this.aJ = new String[var2];

         for(int var3 = 0; var3 < var2; ++var3) {
            this.aJ[var3] = var1.p();
         }
      }

      this.aL = jk.a(var1, (byte)-66) * 1962941219;
      this.aw = jk.a((jk)var1, (byte)33);
      this.aD = jk.a(var1, (byte)-90) == 1;
      this.bt = var1.p();
      this.bo = this.b(var1);
      this.aR = this.b(var1);
      this.bE = this.b(var1);
      this.bb = this.b(var1);
      this.aX = this.b(var1);
      this.bp = this.b(var1);
      this.br = this.b(var1);
      this.bA = this.b(var1);
      this.aY = this.b(var1);
      this.aZ = this.b(var1);
      this.aM = this.b(var1);
      this.ba = this.b(var1);
      this.bi = this.b(var1);
      this.aW = this.b(var1);
      this.bh = this.b(var1);
      this.bd = this.b(var1);
      this.bF = this.b(var1);
      this.bI = this.b(var1);
      this.bc = b(this, var1, (byte)-1);
      this.bk = b(this, var1, (byte)-1);
      this.aS = b(this, var1, (byte)-1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/Object;B)[Ljava/lang/Object;",
      garbageValue = "-1"
   )
   private static Object[] a(Object[] var0) {
      return var0 != null ? Arrays.copyOf(var0, var0.length) : null;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "([II)[I",
      garbageValue = "-1818166288"
   )
   private static int[] a(int[] var0) {
      return var0 != null ? Arrays.copyOf(var0, var0.length) : null;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/Object;I)Ljava/lang/Object;",
      garbageValue = "-2015973166"
   )
   public final Object a(int var1, Object var2) {
      for(int var3 = 0; var3 < this.co; ++var3) {
         if (this.ck[var3] == var1) {
            return this.cp[var3];
         }
      }

      return var2;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "92"
   )
   public final int a(int var1, int var2) {
      for(int var3 = 0; var3 < this.co; ++var3) {
         if (this.ck[var3] == var1) {
            return (Integer)this.cp[var3];
         }
      }

      return var2;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(Lnn;Les;I)Lwd;",
      garbageValue = "-1697819388"
   )
   private iT b(eu var1, K var2) {
      if (!c(this, -1128701242)) {
         return this.a(var1, var2);
      } else {
         String var3 = this.aI + (this.af ? 1 : 0) + (this.Z ? 1 : 0) + this.ag + this.W;
         iT var4;
         iT var5;
         if ((var4 = (iT)hb.a(var1.f, var3, -1986255376)) == null && (var5 = this.a(var1, var2)) != null) {
            var4 = var5.b();
            a(this, var4, 185912984);
            var1.f.a(var3, var4);
         }

         return var4;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "-834317854"
   )
   public final void a(int var1, String var2) {
      if (this.aJ == null || this.aJ.length <= var1) {
         String[] var3 = new String[var1 + 1];
         if (this.aJ != null) {
            for(int var4 = 0; var4 < this.aJ.length; ++var4) {
               var3[var4] = this.aJ[var4];
            }
         }

         this.aJ = var3;
      }

      this.aJ[var1] = var2;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/Object;I)V",
      garbageValue = "-175970997"
   )
   public final void b(int var1, Object var2) {
      for(int var3 = 0; var3 < this.co; ++var3) {
         if (this.ck[var3] == var1) {
            this.cp[var3] = var2;
            return;
         }
      }

      if (this.cp == null) {
         this.ck = new int[4];
         this.cp = new Object[4];
      } else if (this.cp.length == this.co) {
         this.ck = Arrays.copyOf(this.ck, this.ck.length << 1);
         this.cp = Arrays.copyOf(this.cp, this.cp.length << 1);
      }

      this.ck[this.co] = var1;
      this.cp[this.co] = var2;
      ++this.co;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(Lnn;ZI)Lnr;"
   )
   private ey b(eu var1, boolean var2) {
      if (this.L * 522906355 == -1) {
         var2 = false;
      }

      int var3;
      if ((var3 = var2 ? this.bz * 1216019099 : this.bW * -929316875) == -1) {
         return null;
      } else {
         long var4 = ((long)(this.G * 1104529651) << 40) + ((this.bv ? 1L : 0L) << 38) + (long)var3 + ((long)(this.y * -508742969) << 36) + ((this.bK ? 1L : 0L) << 39);
         ey var12;
         if ((var12 = (ey)dX.a(var1.h, var4)) != null) {
            return var12;
         } else {
            iT var11;
            if ((var11 = this.a(var1, var2, (K)null)) == null) {
               return null;
            } else {
               var11 = var11;
               iT var13 = new iT(var11.g, var11.f);

               int var7;
               for(int var6 = 0; var6 < var11.e; ++var6) {
                  for(var7 = 0; var7 < var11.a; ++var7) {
                     var13.b[var7 + (var6 + var11.c) * var11.g + var11.d] = var11.b[var7 + var6 * var11.a];
                  }
               }

               var11 = var13;
               int[] var14 = new int[var13.e];
               int[] var15 = new int[var13.a];

               for(var7 = 0; var7 < var11.e; ++var7) {
                  int var8 = 0;
                  int var9 = var11.f;

                  int var10;
                  for(var10 = 0; var10 < var11.a; ++var10) {
                     if (var11.b[var10 + var7 * var11.d] == 0) {
                        var8 = var10;
                        break;
                     }
                  }

                  for(var10 = var11.a - 1; var10 >= var8; --var10) {
                     if (var11.b[var10 + var7 * var11.g] == 0) {
                        var9 = var10 + 1;
                        break;
                     }
                  }

                  var14[var7] = var8;
                  var15[var7] = var9 - var8;
               }

               var12 = new ey(var11.d, var11.d, var15, var14);
               var1.l.a((im)var12, var4);
               return var12;
            }
         }
      }
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      signature = "(I)Lnf;",
      garbageValue = "719150045"
   )
   public final el a() {
      return this.bS != null ? this.bS.d : null;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(I)Lbx;",
      garbageValue = "-1847766202"
   )
   public final hj b() {
      return this.bS != null ? this.bS.f : null;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(I)Lod;"
   )
   private eK g() {
      return this.bS != null ? this.bS.g : null;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "2125431594"
   )
   public final int a(String var1) {
      return this.j == 11 && this.ca != null && this.c() ? this.ca.a(var1) : -1;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "(Lod;B)Z",
      garbageValue = "-11"
   )
   final boolean a(eK var1) {
      boolean var2 = false;
      if (this.aC != null && !this.aC.isEmpty()) {
         var2 = false | var1.a(dk.a(this.aC));
         this.aC = "";
      }

      if (this.bu != null && !this.bu.isEmpty()) {
         var2 |= var1.b(dk.a(this.bu));
         this.bu = "";
      }

      return var2;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1140266216"
   )
   public final boolean c() {
      return this.bZ == 2;
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "(Loq;ZB)V",
      garbageValue = "0"
   )
   public final void a(eY var1, boolean var2) {
      this.ap = 7;
      this.X = new eY(var1);
      if (!var2) {
         this.X.n = Arrays.copyOf(this.X.j, this.X.j.length);
         eY.a(this.X, (byte)31);
      }

   }

   @ObfuscatedName("md")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public final void d() {
      if (this.cr >= 0) {
         this.setRelativeX(this.cr);
      }

   }

   @ObfuscatedName("pi")
   @ObfuscatedSignature(
      signature = "(II)Lov;"
   )
   private fd b(int var1, int var2) {
      if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (this.getType() != 0) {
         throw new UnsupportedOperationException("children can only be created on type layer widgets");
      } else {
         fd var3;
         (var3 = new fd()).setType(var2);
         var3.v = var3.m = this.m;
         var3.M = this.s * -744024149;
         boolean var6 = true;
         var3.f = true;
         fd var7;
         if ((var7 = dF.c.i(this.m)) == null) {
            throw new IllegalStateException("createChild called on unloaded component");
         } else if (!ci && var7 != this && this.s * -744024149 == -1) {
            throw new AssertionError();
         } else {
            fd[] var4 = var7.bH;
            if (var1 < 0) {
               if (var4 == null) {
                  var1 = 0;
               } else {
                  var1 = 0;

                  for(int var5 = var4.length - 1; var5 >= 0; --var5) {
                     if (var4[var5] != null) {
                        var1 = var5 + 1;
                        break;
                     }
                  }
               }
            }

            if (var4 == null) {
               var4 = new fd[var1 + 1];
               var7.bH = var4;
            } else if (var4.length <= var1) {
               fd[] var8 = new fd[var1 + 1];
               System.arraycopy(var4, 0, var8, 0, var4.length);
               var4 = var8;
               var7.bH = var8;
            }

            var4[var1] = var3;
            var3.s = var1 * 926100227;
            if (this.s * -744024149 >= 0) {
               if (!ci && this.getType() != 0) {
                  throw new AssertionError();
               }

               if (var1 > this.G) {
                  this.G = var1;
               }

               if (var1 < this.y) {
                  this.y = var1;
               }
            }

            return var3;
         }
      }
   }

   @ObfuscatedName("qr")
   @ObfuscatedSignature(
      signature = "(Lnn;Z)Lnr;"
   )
   public final ey a(eu var1, boolean var2) {
      return a(this, var1, var2, 1528088946);
   }

   public int getParentId() {
      if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         int var1;
         if ((var1 = this.v) != -1) {
            return var1;
         } else if (WidgetUtil.componentToInterface(var1 = this.getId()) == dF.c.getTopLevelInterfaceId()) {
            return -1;
         } else {
            int var2;
            if ((var2 = this.b) != -1) {
               jR var3;
               if ((var3 = (jR)osrs.bs.a(client.bT, (long)var2)) != null && var3.getId() == WidgetUtil.componentToInterface(var1)) {
                  return var2;
               }

               this.b = -1;
            }

            int var6 = WidgetUtil.componentToInterface(this.getId());
            client var10000 = dF.c;
            Iterator var4 = client.r().iterator();

            while(var4.hasNext()) {
               jR var5 = (jR)var4.next();
               if (var6 == var5.getId()) {
                  return (int)var5.getHash();
               }
            }

            return -1;
         }
      }
   }

   public int getSpriteId() {
      return this.x;
   }

   public Rectangle getBounds() {
      return new Rectangle(this.cd, this.ce, this.getWidth(), this.getHeight());
   }

   public int getType() {
      return this.j;
   }

   public int getWidth() {
      return this.i * -1805166981;
   }

   public void setRelativeY(int var1) {
      this.k = var1;
   }

   public void setRelativeX(int var1) {
      this.o = var1;
   }

   public boolean isSelfHidden() {
      return this.P;
   }

   public int getHeight() {
      return this.n * -2133353239;
   }

   public int getId() {
      return this.m;
   }

   public Widget getParent() {
      int var1;
      return (var1 = this.getParentId()) == -1 ? null : dF.c.i(var1);
   }

   public void setType(int var1) {
      this.j = var1;
   }

   public int getRelativeX() {
      return this.o;
   }

   public int getRelativeY() {
      return this.k;
   }

   public int getItemId() {
      return this.bJ;
   }

   public int getOpacity() {
      return this.K;
   }

   public boolean isFilled() {
      return this.A;
   }

   public int getTextColor() {
      return this.R;
   }

   public int getItemQuantity() {
      return this.bG;
   }

   public int getIndex() {
      return this.s * -744024149;
   }

   public Widget setScrollWidth(int var1) {
      this.B = var1;
      return this;
   }

   public boolean isHidden() {
      if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (this.isSelfHidden()) {
         return true;
      } else {
         Widget var1;
         if ((var1 = this.getParent()) == null) {
            if (WidgetUtil.componentToInterface(this.getId()) != dF.c.getTopLevelInterfaceId()) {
               return true;
            }
         } else if (var1.isHidden()) {
            return true;
         }

         return false;
      }
   }

   public void revalidate() {
      if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         client var1 = dF.c;
         client.a((fd)this);
      }
   }

   public Widget setClickMask(int var1) {
      this.aE = var1;
      return this;
   }

   public Widget createChild(int var1) {
      return this.b(-1, var1);
   }

   public Widget setTextColor(int var1) {
      this.R = var1;
      return this;
   }

   public int getOriginalX() {
      return this.c;
   }

   public void setOnVarTransmitListener(Object[] var1) {
      this.bp = var1;
   }

   public int getRotationZ() {
      return this.ai;
   }

   public int getScrollHeight() {
      return this.S;
   }

   public Widget setScrollX(int var1) {
      this.L = var1;
      return this;
   }

   public void setChildren(Widget[] var1) {
      if (this.getType() != 0) {
         throw new UnsupportedOperationException("children can only be set on type layer widgets");
      } else if (this.s * -744024149 != -1) {
         throw new UnsupportedOperationException("only static widgets may have children");
      } else {
         this.bH = (fd[])var1;
      }
   }

   public Widget setRotationZ(int var1) {
      this.ai = var1;
      return this;
   }

   public Widget setItemId(int var1) {
      this.bJ = var1;
      return this;
   }

   public int getLineHeight() {
      return this.aa;
   }

   public int getContentType() {
      return this.e;
   }

   public int getDragDeadZone() {
      return this.aL * -1850741621;
   }

   public void setOnMouseLeaveListener(Object[] var1) {
      this.bE = var1;
   }

   public Widget setHidden(boolean var1) {
      this.P = var1;
      return this;
   }

   public void setOnReleaseListener(Object[] var1) {
      this.aW = var1;
   }

   public void setForcedPosition(int var1, int var2) {
      this.cr = (short)var1;
      this.cq = (short)var2;
      this.setRelativeX(var1);
      this.setRelativeY(var2);
   }

   public Widget setSpriteTiling(boolean var1) {
      this.H = var1;
      return this;
   }

   public Widget setTextShadowed(boolean var1) {
      this.aG = var1;
      return this;
   }

   public Widget getDragParent() {
      return this.aQ;
   }

   public Widget[] getChildren() {
      return this.bH;
   }

   public void revalidateScroll() {
      if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         client var1 = dF.c;
         client.a((fd)this);
         client var10000 = dF.c;
         client.a(jD.a.c[WidgetUtil.componentToInterface(this.getId())], this, false);
      }
   }

   public int getYPositionMode() {
      return this.l;
   }

   public Widget setSize(int var1, int var2, int var3, int var4) {
      this.u = var1;
      fd var6;
      (var6 = this).t = var2;
      (var6 = var6).d = var3;
      (var6 = var6).h = var4;
      return var6;
   }

   public Widget setFilled(boolean var1) {
      this.A = var1;
      return this;
   }

   public void setWidth(int var1) {
      this.i = var1 * -352773965;
   }

   public int getFontId() {
      return this.aj;
   }

   public void setOnDialogAbortListener(Object[] var1) {
      this.bl = var1;
   }

   public Widget setWidthMode(int var1) {
      this.d = var1;
      return this;
   }

   public Widget setLineHeight(int var1) {
      this.aa = var1;
      return this;
   }

   public void setOnHoldListener(Object[] var1) {
      this.bh = var1;
   }

   public boolean getTextShadowed() {
      return this.aG;
   }

   public Widget setItemQuantity(int var1) {
      this.bG = var1;
      return this;
   }

   public int getXTextAlignment() {
      return this.aK;
   }

   public Object[] getOnOpListener() {
      return this.aZ;
   }

   public Widget getChild(int var1) {
      fd[] var2;
      return (var2 = this.bH) != null && var1 >= 0 && var1 < var2.length ? var2[var1] : null;
   }

   public int getTargetPriority() {
      return this.aF * -1196438339;
   }

   public void setOnScrollWheelListener(Object[] var1) {
      this.bI = var1;
   }

   public void setOnTimerListener(Object[] var1) {
      this.aY = var1;
   }

   public boolean isIf3() {
      return this.f;
   }

   public Widget setDragParent(Widget var1) {
      this.aQ = (fd)var1;
      return this;
   }

   public void setVarTransmitTrigger(int[] var1) {
      this.bc = var1;
   }

   public Widget setItemQuantityMode(int var1) {
      this.au = var1;
      return this;
   }

   public void setOnTargetEnterListener(Object[] var1) {
      this.aX = var1;
   }

   public int getOriginalHeight() {
      return this.t;
   }

   public Widget setModelZoom(int var1) {
      this.ao = var1;
      return this;
   }

   public int[] getVarTransmitTrigger() {
      return this.bc;
   }

   public int getRotationX() {
      return this.ak;
   }

   public int getXPositionMode() {
      return this.p;
   }

   public Widget setYPositionMode(int var1) {
      this.l = var1;
      return this;
   }

   public void setAction(int var1, String var2) {
      this.a(var1, var2);
   }

   public Widget setRotationY(int var1) {
      this.ab = var1;
      return this;
   }

   public void setOnTargetLeaveListener(Object[] var1) {
      this.bb = var1;
   }

   public int getScrollX() {
      return this.L;
   }

   public Widget[] getStaticChildren() {
      if (this.s * -744024149 >= 0) {
         return new Widget[0];
      } else {
         ArrayList var1 = new ArrayList();
         client var10000 = dF.c;
         fd[] var2;
         int var3 = (var2 = client.g(WidgetUtil.componentToInterface(this.m))).length;

         for(int var4 = 0; var4 < var3; ++var4) {
            fd var5;
            if ((var5 = var2[var4]) != null && var5.v == this.m) {
               var1.add(var5);
            }
         }

         return (Widget[])var1.toArray(new fd[0]);
      }
   }

   public void setDragDeadZone(int var1) {
      this.aL = var1 * 1962941219;
   }

   public Widget setModelId(int var1) {
      this.aq = var1;
      return this;
   }

   public Widget setHeightMode(int var1) {
      this.h = var1;
      return this;
   }

   public int getAnimationId() {
      return this.at;
   }

   public Widget[] getDynamicChildren() {
      fd var1;
      if ((var1 = dF.c.i(this.m)) == null) {
         return new Widget[0];
      } else {
         fd[] var6;
         if ((var6 = var1.bH) == null) {
            return new Widget[0];
         } else {
            ArrayList var2 = new ArrayList();
            fd[] var3 = var6;
            int var7 = var6.length;

            for(int var4 = 0; var4 < var7; ++var4) {
               fd var5;
               if ((var5 = var3[var4]) != null) {
                  if (!ci && var5.v != this.m) {
                     throw new AssertionError();
                  }

                  if (this.s * -744024149 == var5.M) {
                     var2.add(var5);
                  }
               }
            }

            return (Widget[])var2.toArray(new fd[0]);
         }
      }
   }

   public void setDragDeadTime(int var1) {
      this.aw = var1;
   }

   public boolean hasListener() {
      return this.aO;
   }

   public int getItemQuantityMode() {
      return this.au;
   }

   public Widget setFontId(int var1) {
      this.aj = var1;
      return this;
   }

   public Widget setText(String var1) {
      this.aC = var1;
      return this;
   }

   public Widget setAnimationId(int var1) {
      this.at = var1;
      return this;
   }

   public Widget setSpriteId(int var1) {
      this.x = var1;
      return this;
   }

   public Widget setOriginalX(int var1) {
      this.c = var1;
      return this;
   }

   public void setOnMouseRepeatListener(Object[] var1) {
      this.aM = var1;
   }

   public void setTargetVerb(String var1) {
      this.bt = var1;
   }

   public Widget setRotationX(int var1) {
      this.ak = var1;
      return this;
   }

   public int getHeightMode() {
      return this.h;
   }

   public Widget setContentType(int var1) {
      this.e = var1;
      return this;
   }

   public void setBorderType(int var1) {
      this.ag = var1;
   }

   public int getScrollWidth() {
      return this.B;
   }

   public int getOriginalY() {
      return this.r;
   }

   public Widget setXPositionMode(int var1) {
      this.p = var1;
      return this;
   }

   public void setOnMouseOverListener(Object[] var1) {
      this.aR = var1;
   }

   public String[] getActions() {
      return this.aJ;
   }

   public String getName() {
      return this.ac.replace(' ', ' ');
   }

   public Widget setSize(int var1, int var2) {
      this.u = var1;
      fd var4;
      (var4 = this).t = var2;
      return var4;
   }

   public void setTargetPriority(int var1) {
      this.aF = var1 * -52326763;
   }

   public void setOnDragListener(Object[] var1) {
      this.bd = var1;
   }

   public void setNoClickThrough(boolean var1) {
      this.bY = var1;
   }

   public int getYTextAlignment() {
      return this.aB;
   }

   public int getRotationY() {
      return this.ab;
   }

   public int getModelZoom() {
      return this.ao;
   }

   public Object[] getOnVarTransmitListener() {
      return this.bp;
   }

   public Widget setPos(int var1, int var2) {
      this.c = var1;
      fd var4;
      (var4 = this).r = var2;
      return var4;
   }

   public void setOnClickListener(Object[] var1) {
      this.ba = var1;
   }

   public boolean contains(Point var1) {
      Rectangle var2;
      return (var2 = this.getBounds()) != null && var2.contains(new java.awt.Point(var1.getX(), var1.getY()));
   }

   public Widget setHasListener(boolean var1) {
      this.aO = var1;
      return this;
   }

   public int getBorderType() {
      return this.ag;
   }

   public void setOnOpListener(Object[] var1) {
      this.aZ = var1;
   }

   public Object[] getOnKeyListener() {
      return this.by;
   }

   public String getTargetVerb() {
      return this.bt;
   }

   public boolean getNoScrollThrough() {
      return this.bR;
   }

   public void setOnKeyListener(Object[] var1) {
      this.by = var1;
   }

   public int getClickMask() {
      return this.aE;
   }

   public int getDragDeadTime() {
      return this.aw;
   }

   public Point getCanvasLocation() {
      return new Point(this.cd, this.ce);
   }

   public Object[] getOnInvTransmitListener() {
      return this.br;
   }

   public String getText() {
      return this.aC.replace(' ', ' ');
   }

   public boolean getNoClickThrough() {
      return this.bY;
   }

   public int getWidthMode() {
      return this.d;
   }

   public Widget setOpacity(int var1) {
      this.K = var1;
      return this;
   }

   public void setHeight(int var1) {
      this.n = var1 * -1251804327;
   }

   public Widget setOriginalHeight(int var1) {
      this.t = var1;
      return this;
   }

   public void setNoScrollThrough(boolean var1) {
      this.bR = var1;
   }

   public Widget setScrollHeight(int var1) {
      this.S = var1;
      return this;
   }

   public void clearActions() {
      this.aJ = null;
   }

   public void setOnDragCompleteListener(Object[] var1) {
      this.bF = var1;
   }

   public Widget setModelType(int var1) {
      this.ap = var1;
      return this;
   }

   public int getOriginalWidth() {
      return this.u;
   }

   public Widget setYTextAlignment(int var1) {
      this.aB = var1;
      return this;
   }

   public Widget createChild(int var1, int var2) {
      if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return this.b(var1, var2);
      }
   }

   public Widget setXTextAlignment(int var1) {
      this.aK = var1;
      return this;
   }

   public int getModelId() {
      return this.aq;
   }

   public Widget setScrollY(int var1) {
      this.D = var1 * -380832947;
      return this;
   }

   public int getModelType() {
      return this.ap;
   }

   public boolean getSpriteTiling() {
      return this.H;
   }

   public FontTypeFace getFont() {
      eu var2 = jD.a;
      return this.a(var2);
   }

   public Widget setName(String var1) {
      String var3 = var1.replace(' ', ' ');
      this.ac = var3;
      return this;
   }

   public Widget[] getNestedChildren() {
      if (!dF.c.isClientThread()) {
         if (!fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (this.s * -744024149 >= 0) {
         return new Widget[0];
      } else {
         jR var1;
         if ((var1 = (jR)osrs.bs.a(client.bT, (long)this.m)) == null) {
            return new fd[0];
         } else {
            int var6 = var1.getId();
            ArrayList var2 = new ArrayList();
            client var10000 = dF.c;
            fd[] var7;
            int var3 = (var7 = client.g(var6)).length;

            for(int var4 = 0; var4 < var3; ++var4) {
               fd var5;
               if ((var5 = var7[var4]) != null && var5.v == -1) {
                  var2.add(var5);
               }
            }

            return (Widget[])var2.toArray(new fd[0]);
         }
      }
   }

   public Object[] getOnLoadListener() {
      return this.bo;
   }

   public Widget setPos(int var1, int var2, int var3, int var4) {
      this.c = var1;
      fd var6;
      (var6 = this).r = var2;
      (var6 = var6).p = var3;
      (var6 = var6).l = var4;
      return var6;
   }

   public Widget setOriginalY(int var1) {
      this.r = var1;
      return this;
   }

   public void deleteAllChildren() {
      if (this.bH != null) {
         Arrays.fill(this.bH, (Object)null);
      }

   }

   public int getScrollY() {
      return this.D * 178093445;
   }

   public Widget setOriginalWidth(int var1) {
      this.u = var1;
      return this;
   }

   @ObfuscatedName("wu")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public final void e() {
      if (this.cq >= 0) {
         this.setRelativeY(this.cq);
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(ILcj;I)Ldl;",
      garbageValue = "-1332034168"
   )
   public static kd a(int var0, jA var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         kd var3;
         if ((var3 = (kd)var2.next()).g.a((long)var0) != null) {
            return var3;
         }
      }

      return jA.a(var1, 146371071);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(Lov;Lnn;ZI)Lnr;"
   )
   public static ey a(fd var0, eu var1, boolean var2, int var3) {
      if (var0 == null) {
         var0.b(var1, var2);
      }

      if (var0.I == -1) {
         var2 = false;
      }

      if ((var3 = var2 ? var0.I : var0.x) == -1) {
         return null;
      } else {
         long var5 = ((long)var0.W << 40) + ((var0.af ? 1L : 0L) << 38) + (long)var3 + ((long)var0.ag << 36) + ((var0.Z ? 1L : 0L) << 39);
         ey var12;
         if ((var12 = (ey)dX.a(var1.g, var5)) != null) {
            return var12;
         } else {
            iT var10;
            if ((var10 = var0.a(var1, var2, (K)null)) == null) {
               return null;
            } else {
               int[] var11 = new int[(var10 = var10.a()).e];
               int[] var13 = new int[var10.e];

               for(int var4 = 0; var4 < var10.e; ++var4) {
                  int var7 = 0;
                  int var8 = var10.a;

                  int var9;
                  for(var9 = 0; var9 < var10.a; ++var9) {
                     if (var10.b[var9 + var4 * var10.a] == 0) {
                        var7 = var9;
                        break;
                     }
                  }

                  for(var9 = var10.a - 1; var9 >= var7; --var9) {
                     if (var10.b[var9 + var4 * var10.a] == 0) {
                        var8 = var9 + 1;
                        break;
                     }
                  }

                  var11[var4] = var7;
                  var13[var4] = var8 - var7;
               }

               var12 = new ey(var10.a, var10.e, var13, var11);
               var1.g.a((im)var12, var5);
               return var12;
            }
         }
      }
   }

   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      signature = "(Lov;I)I"
   )
   public static int a(fd var0, int var1) {
      if (var0 == null) {
         return var0.cc != null && !var0.cc.isEmpty() ? 1 : 0;
      } else {
         return var0.cb != null && !var0.cb.isEmpty() ? 1 : 0;
      }
   }

   @ObfuscatedName("jz")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1894285498"
   )
   static boolean f() {
      return (client.ay & 2) != 0;
   }

   @ObfuscatedName("mo")
   @ObfuscatedSignature(
      signature = "(Lov;Lwt;B)[I"
   )
   private static int[] b(fd var0, jk var1, byte var2) {
      int var4;
      if ((var4 = jk.a(var1, (byte)-59)) == 0) {
         return null;
      } else {
         int[] var5 = new int[var4];

         for(int var3 = 0; var3 < var4; ++var3) {
            var5[var3] = jk.d(var1, 1687107415);
         }

         return var5;
      }
   }

   @ObfuscatedName("pp")
   @ObfuscatedSignature(
      signature = "(Lov;Lwd;I)V"
   )
   private static void a(fd var0, iT var1, int var2) {
      if (var0.af) {
         var1.e();
      }

      if (var0.Z) {
         if (var2 >= 1356408701) {
            return;
         }

         var1.d();
      }

      if (var0.ag > 0) {
         var1.b(var0.ag);
      }

      if (var0.ag > 0) {
         if (var2 >= 1356408701) {
            return;
         }

         iT.a(var1, 1);
      }

      if (var0.ag >= 2) {
         iT.a(var1, 16777215);
      }

      if (var0.W != 0) {
         var1.a(var0.W);
      }

   }

   @ObfuscatedName("rv")
   @ObfuscatedSignature(
      signature = "(Lov;I)Lod;"
   )
   public static eK b(fd var0, int var1) {
      if (var0 == null) {
         return var0.g();
      } else {
         return var0.bS != null ? var0.bS.g : null;
      }
   }

   @ObfuscatedName("vq")
   @ObfuscatedSignature(
      signature = "(Lov;I)Z"
   )
   private static boolean c(fd var0, int var1) {
      return var0.af || var0.Z || var0.ag != 0 || var0.W != 0;
   }

   @ObfuscatedName("wr")
   @ObfuscatedSignature(
      signature = "(Lov;Lwt;B)V"
   )
   public static void a(fd var0, jk var1, byte var2) {
      var0.g = var1.p();
   }

   @ObfuscatedName("ww")
   @ObfuscatedSignature(
      signature = "(Lov;B)V"
   )
   public static void a(fd var0, byte var1) {
      var0.cc = new HashMap();
      var0.cb = new HashMap();
   }
}
