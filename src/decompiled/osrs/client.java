package osrs;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;
import com.jagex.oldscape.pub.OAuthApi;
import io.sentry.Sentry;
import io.sentry.protocol.User;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.IntPredicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import net.runelite.api.Actor;
import net.runelite.api.Animation;
import net.runelite.api.BufferProvider;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Constants;
import net.runelite.api.Deque;
import net.runelite.api.EnumComposition;
import net.runelite.api.FriendContainer;
import net.runelite.api.FriendsChatManager;
import net.runelite.api.GameState;
import net.runelite.api.GrandExchangeOffer;
import net.runelite.api.HashTable;
import net.runelite.api.IndexDataBase;
import net.runelite.api.IndexedSprite;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemComposition;
import net.runelite.api.ItemContainer;
import net.runelite.api.IterableHashTable;
import net.runelite.api.Menu;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.MessageNode;
import net.runelite.api.Model;
import net.runelite.api.ModelData;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.NameableContainer;
import net.runelite.api.NodeCache;
import net.runelite.api.ObjectComposition;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Prayer;
import net.runelite.api.Preferences;
import net.runelite.api.Projectile;
import net.runelite.api.Projection;
import net.runelite.api.Rasterizer;
import net.runelite.api.RenderOverview;
import net.runelite.api.RuneLiteObject;
import net.runelite.api.RuneLiteObjectController;
import net.runelite.api.ScriptEvent;
import net.runelite.api.Skill;
import net.runelite.api.SpritePixels;
import net.runelite.api.StructComposition;
import net.runelite.api.TextureProvider;
import net.runelite.api.TileFunction;
import net.runelite.api.VarbitComposition;
import net.runelite.api.WidgetNode;
import net.runelite.api.World;
import net.runelite.api.WorldType;
import net.runelite.api.WorldView;
import net.runelite.api.clan.ClanChannel;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanSettings;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.dbtable.DBRowConfig;
import net.runelite.api.events.AccountHashChanged;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.AreaSoundEffectPlayed;
import net.runelite.api.events.BeforeMenuRender;
import net.runelite.api.events.CanvasSizeChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ClanChannelChanged;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.DraggingWidgetChanged;
import net.runelite.api.events.FriendsChatChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GrandExchangeOfferChanged;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.api.events.MenuOpened;
import net.runelite.api.events.MenuShouldLeftClick;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.PlayerMenuOptionsChanged;
import net.runelite.api.events.PostMenuSort;
import net.runelite.api.events.ResizeableChanged;
import net.runelite.api.events.ScriptCallbackEvent;
import net.runelite.api.events.ScriptPostFired;
import net.runelite.api.events.ScriptPreFired;
import net.runelite.api.events.SoundEffectPlayed;
import net.runelite.api.events.StatChanged;
import net.runelite.api.events.UsernameChanged;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.events.WidgetClosed;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.events.WorldChanged;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.api.vars.AccountType;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.api.widgets.WidgetUtil;
import net.runelite.api.worldmap.MapElementConfig;
import net.runelite.api.worldmap.WorldMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class client extends fs implements OAuthApi, Client, eG, he {
   private static String fz = null;
   private static int fA = -1;
   @ObfuscatedName("zn")
   private static boolean fB;
   @ObfuscatedName("zh")
   private static boolean fC;
   @ObfuscatedName("xf")
   public static int z;
   @ObfuscatedName("ym")
   private static boolean fD;
   @ObfuscatedName("yy")
   public static int A;
   @ObfuscatedName("yy")
   public static final Map B;
   @ObfuscatedName("yr")
   @ObfuscatedSignature(
      signature = "[Lpu;"
   )
   public static final fE[] C;
   @ObfuscatedName("xf")
   public static IntPredicate D;
   @ObfuscatedName("yj")
   public static int E;
   @ObfuscatedName("yf")
   private static float fE;
   @ObfuscatedName("yt")
   private static double fF;
   @ObfuscatedName("yt")
   private static int fG;
   @ObfuscatedName("xn")
   private static String fH;
   @ObfuscatedName("xv")
   private static volatile long fI;
   @ObfuscatedName("zp")
   private static int fJ;
   @ObfuscatedName("xk")
   private static int fK;
   @ObfuscatedName("zf")
   public static long[] F;
   @ObfuscatedName("xv")
   private static int[] fL;
   @ObfuscatedName("xn")
   private static int[] fM;
   @ObfuscatedName("yi")
   private static List fN;
   @ObfuscatedName("ys")
   private static int fO;
   @ObfuscatedName("aa")
   public static final kA G;
   @ObfuscatedName("aj")
   private static double fP;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lwd;"
   )
   private static iT fQ;
   @ObfuscatedName("aj")
   private static boolean[] fR;
   @ObfuscatedName("aq")
   public static double H;
   @ObfuscatedName("bd")
   private static List fS;
   @ObfuscatedName("bo")
   private static List fT;
   @ObfuscatedName("bt")
   public static List I;
   @ObfuscatedName("bz")
   public static boolean J;
   @ObfuscatedName("cb")
   public static int K;
   @ObfuscatedName("ce")
   public static kx L;
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      signature = "Lwd;"
   )
   public static iT M;
   @ObfuscatedName("ci")
   public static int N;
   @ObfuscatedName("cj")
   private static boolean fU;
   @ObfuscatedName("cj")
   private static double fV;
   @ObfuscatedName("cj")
   private static int fW;
   @ObfuscatedName("cl")
   public static boolean O;
   @ObfuscatedName("cq")
   private static int[] fX;
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      signature = "Ldn;"
   )
   public static final kg P = new kg();
   @ObfuscatedName("ct")
   public static int Q;
   @ObfuscatedName("cu")
   private static volatile int fY;
   @ObfuscatedName("cv")
   public static double R;
   @ObfuscatedName("db")
   public static boolean S;
   @ObfuscatedName("dg")
   private static int fZ;
   @ObfuscatedName("dh")
   private static String ga;
   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      signature = "Lkj;"
   )
   static final cM T = new cM();
   @ObfuscatedName("dk")
   private static int gb;
   @ObfuscatedName("dl")
   private static double gc;
   @ObfuscatedName("dt")
   private static int gd;
   @ObfuscatedName("dw")
   private static String ge;
   @ObfuscatedName("ea")
   static final int[] U;
   @ObfuscatedName("eg")
   private static int gf;
   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      signature = "Lcr;"
   )
   public static jI V;
   @ObfuscatedName("ei")
   @ObfuscatedSignature(
      signature = "Lwd;"
   )
   private static iT gg;
   @ObfuscatedName("em")
   static final int[] W;
   @ObfuscatedName("eq")
   private static int gh;
   @ObfuscatedName("es")
   public static long X;
   @ObfuscatedName("es")
   private static int gi;
   @ObfuscatedName("ex")
   @ObfuscatedSignature(
      signature = "Loq;"
   )
   static final eY Y;
   @ObfuscatedName("fb")
   @ObfuscatedGetter(
      intValue = -195102339
   )
   public static int Z;
   @ObfuscatedName("fd")
   @ObfuscatedGetter(
      intValue = 2062449695
   )
   static int aa;
   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      signature = "Lfz;"
   )
   static as ab;
   @ObfuscatedName("ff")
   public static boolean ac;
   @ObfuscatedName("fh")
   static HashMap ad;
   @ObfuscatedName("fi")
   private static boolean gj;
   @ObfuscatedName("fj")
   private static boolean gk;
   @ObfuscatedName("fl")
   @ObfuscatedGetter(
      intValue = -1185870791
   )
   static int ae;
   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      signature = "Lwc;"
   )
   static iS af;
   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   public static jA ag;
   @ObfuscatedName("fs")
   static boolean ah;
   @ObfuscatedName("fu")
   @ObfuscatedSignature(
      signature = "Lbs;"
   )
   static final gh ai;
   @ObfuscatedName("fw")
   private static int gl;
   @ObfuscatedName("fx")
   @ObfuscatedGetter(
      intValue = -71837669
   )
   public static int aj;
   @ObfuscatedName("ga")
   @ObfuscatedGetter(
      intValue = 1554066619
   )
   static int ak;
   @ObfuscatedName("gb")
   static int[] al;
   @ObfuscatedName("gc")
   @ObfuscatedGetter(
      intValue = 16308607
   )
   static int am;
   @ObfuscatedName("gd")
   static String an;
   @ObfuscatedName("ge")
   static boolean ao;
   @ObfuscatedName("gf")
   static int[] ap;
   @ObfuscatedName("gg")
   static boolean aq;
   @ObfuscatedName("gh")
   @ObfuscatedGetter(
      intValue = 565632123
   )
   static int ar;
   @ObfuscatedName("gi")
   @ObfuscatedGetter(
      intValue = -1603897549
   )
   static int as;
   @ObfuscatedName("gj")
   @ObfuscatedGetter(
      intValue = 2034952093
   )
   static int at;
   @ObfuscatedName("gk")
   @ObfuscatedGetter(
      intValue = 1658742543
   )
   static int au;
   @ObfuscatedName("gm")
   @ObfuscatedGetter(
      intValue = 1499360251
   )
   static int av;
   @ObfuscatedName("gn")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   static fU aw;
   @ObfuscatedName("go")
   @ObfuscatedSignature(
      signature = "Ldx;"
   )
   static p ax;
   @ObfuscatedName("gp")
   @ObfuscatedGetter(
      intValue = 1462955479
   )
   private static int gm;
   @ObfuscatedName("gt")
   @ObfuscatedGetter(
      intValue = 364389501
   )
   static int ay;
   @ObfuscatedName("gu")
   @ObfuscatedGetter(
      intValue = -196739047
   )
   static int az;
   @ObfuscatedName("gv")
   @ObfuscatedGetter(
      intValue = 1992130453
   )
   static int aA;
   @ObfuscatedName("gw")
   static boolean aB;
   @ObfuscatedName("gx")
   private static int gn;
   @ObfuscatedName("gy")
   static int[] aC;
   @ObfuscatedName("ha")
   static short aD;
   @ObfuscatedName("hd")
   public static int aE;
   @ObfuscatedName("he")
   static short aF;
   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      signature = "[Lgd;"
   )
   static aw[] aG;
   @ObfuscatedName("hg")
   static short aH;
   @ObfuscatedName("hh")
   @ObfuscatedGetter(
      longValue = -5744354433194361273L
   )
   static long aI;
   @ObfuscatedName("hi")
   static boolean aJ;
   @ObfuscatedName("hj")
   static int[] aK;
   @ObfuscatedName("hl")
   static short aL;
   @ObfuscatedName("hm")
   static boolean aM;
   @ObfuscatedName("hn")
   static short aN;
   @ObfuscatedName("ho")
   @ObfuscatedGetter(
      intValue = 1538387369
   )
   static int aO;
   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      signature = "[Lgu;"
   )
   static aP[] aP;
   @ObfuscatedName("hq")
   static short aQ;
   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      signature = "Lkp;"
   )
   static cT aR;
   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      signature = "Lov;"
   )
   static fd aS;
   @ObfuscatedName("ht")
   @ObfuscatedGetter(
      intValue = 636189453
   )
   private static int go;
   @ObfuscatedName("hv")
   static boolean aT;
   @ObfuscatedName("hy")
   private static int gp;
   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      signature = "Lkr;"
   )
   public static cV aU;
   @ObfuscatedName("ia")
   static short aV;
   @ObfuscatedName("ib")
   @ObfuscatedGetter(
      intValue = 236621971
   )
   static int aW;
   @ObfuscatedName("id")
   @ObfuscatedGetter(
      intValue = -134624175
   )
   static int aX;
   @ObfuscatedName("ie")
   @ObfuscatedGetter(
      intValue = 1852607271
   )
   static int aY;
   @ObfuscatedName("if")
   @ObfuscatedGetter(
      intValue = -8548079
   )
   static int aZ;
   @ObfuscatedName("ih")
   static short ba;
   @ObfuscatedName("ik")
   @ObfuscatedGetter(
      intValue = -974710557
   )
   static int bb;
   @ObfuscatedName("il")
   @ObfuscatedSignature(
      signature = "[Lpa;"
   )
   static fi[] bc;
   @ObfuscatedName("im")
   @ObfuscatedGetter(
      intValue = 1874270005
   )
   static int bd;
   @ObfuscatedName("in")
   @ObfuscatedSignature(
      signature = "Lbn;"
   )
   static fh be;
   @ObfuscatedName("io")
   @ObfuscatedGetter(
      intValue = 2017901863
   )
   public static int bf;
   @ObfuscatedName("ip")
   @ObfuscatedGetter(
      intValue = 819474861
   )
   static int bg;
   @ObfuscatedName("iq")
   @ObfuscatedGetter(
      intValue = 1605014271
   )
   static int bh;
   @ObfuscatedName("ir")
   private static int[] gq;
   @ObfuscatedName("it")
   static String bi;
   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      signature = "Lcs;"
   )
   public static jK bj;
   @ObfuscatedName("ix")
   private static int gr;
   @ObfuscatedName("ja")
   static boolean bk;
   @ObfuscatedName("jc")
   @ObfuscatedGetter(
      intValue = -221475203
   )
   static int bl;
   @ObfuscatedName("jd")
   public static boolean bm;
   @ObfuscatedName("je")
   @ObfuscatedSignature(
      signature = "Lce;"
   )
   static iF bn;
   @ObfuscatedName("jg")
   static boolean bo;
   @ObfuscatedName("jh")
   static boolean bp;
   @ObfuscatedName("jk")
   @ObfuscatedGetter(
      intValue = 1885040757
   )
   static int bq;
   @ObfuscatedName("jl")
   @ObfuscatedGetter(
      intValue = -2043107529
   )
   static int br;
   @ObfuscatedName("jm")
   static boolean bs;
   @ObfuscatedName("jn")
   @ObfuscatedGetter(
      intValue = -432999495
   )
   static int bt;
   @ObfuscatedName("jp")
   @ObfuscatedGetter(
      intValue = 1539527819
   )
   static int bu;
   @ObfuscatedName("jq")
   static boolean bv;
   @ObfuscatedName("jr")
   @ObfuscatedGetter(
      longValue = 6226946241741619845L
   )
   static long bw;
   @ObfuscatedName("jt")
   @ObfuscatedGetter(
      intValue = 1917232339
   )
   static int bx;
   @ObfuscatedName("jv")
   @ObfuscatedGetter(
      longValue = -452955011114912125L
   )
   private static long gs;
   @ObfuscatedName("jw")
   public static boolean by;
   @ObfuscatedName("jw")
   private static int gt;
   @ObfuscatedName("jx")
   @ObfuscatedGetter(
      intValue = 1955317323
   )
   static int bz;
   @ObfuscatedName("jz")
   @ObfuscatedGetter(
      intValue = 2116308645
   )
   static int bA;
   @ObfuscatedName("kb")
   @ObfuscatedGetter(
      intValue = -1368824765
   )
   private static int gu;
   @ObfuscatedName("ke")
   private static boolean gv;
   @ObfuscatedName("kh")
   public static double bB;
   @ObfuscatedName("kk")
   @ObfuscatedGetter(
      intValue = -1731150859
   )
   private static int gw;
   @ObfuscatedName("kl")
   private static boolean gx;
   @ObfuscatedName("km")
   private static boolean gy;
   @ObfuscatedName("ko")
   public static boolean bC;
   @ObfuscatedName("kq")
   public static double bD;
   @ObfuscatedName("ks")
   public static kA bE;
   @ObfuscatedName("ku")
   public static int bF;
   @ObfuscatedName("kz")
   public static int bG;
   @ObfuscatedName("la")
   @ObfuscatedGetter(
      intValue = 135102871
   )
   private static int gz;
   @ObfuscatedName("lb")
   static int bH;
   @ObfuscatedName("lc")
   @ObfuscatedGetter(
      intValue = -1451144669
   )
   static int bI;
   @ObfuscatedName("ld")
   public static double bJ;
   @ObfuscatedName("le")
   @ObfuscatedGetter(
      intValue = 1340026861
   )
   static int bK;
   @ObfuscatedName("lf")
   @ObfuscatedGetter(
      intValue = -1502439027
   )
   static int bL;
   @ObfuscatedName("lk")
   @ObfuscatedGetter(
      intValue = 1338362809
   )
   static int bM;
   @ObfuscatedName("lm")
   @ObfuscatedGetter(
      intValue = 1546065205
   )
   static int bN;
   @ObfuscatedName("ln")
   private static int[] gA;
   @ObfuscatedName("lo")
   public static kq bO;
   @ObfuscatedName("ls")
   @ObfuscatedGetter(
      intValue = 1416752211
   )
   static int bP;
   @ObfuscatedName("lu")
   @ObfuscatedGetter(
      intValue = -1921942229
   )
   private static int gB;
   @ObfuscatedName("lw")
   public static double bQ;
   @ObfuscatedName("lz")
   @ObfuscatedGetter(
      intValue = -1834884025
   )
   static int bR;
   @ObfuscatedName("ma")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   static fU bS;
   @ObfuscatedName("mb")
   @ObfuscatedSignature(
      signature = "Lqq;"
   )
   static gb bT;
   @ObfuscatedName("mc")
   @ObfuscatedGetter(
      intValue = 501138751
   )
   private static int gC;
   @ObfuscatedName("me")
   @ObfuscatedGetter(
      intValue = 581931935
   )
   static int bU;
   @ObfuscatedName("mf")
   @ObfuscatedGetter(
      intValue = -2099093317
   )
   private static int gD;
   @ObfuscatedName("mg")
   @ObfuscatedGetter(
      intValue = 245093981
   )
   static int bV;
   @ObfuscatedName("mh")
   @ObfuscatedGetter(
      intValue = 583344695
   )
   static int bW;
   @ObfuscatedName("mj")
   @ObfuscatedGetter(
      intValue = 1237270805
   )
   static int bX;
   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      signature = "Lov;"
   )
   static fd bY;
   @ObfuscatedName("ml")
   @ObfuscatedGetter(
      intValue = 2080643147
   )
   static int bZ;
   @ObfuscatedName("mm")
   @ObfuscatedGetter(
      intValue = -2109378139
   )
   private static int gE;
   @ObfuscatedName("mn")
   static boolean ca;
   @ObfuscatedName("mo")
   @ObfuscatedGetter(
      intValue = -1129974461
   )
   static int cb;
   @ObfuscatedName("mq")
   @ObfuscatedGetter(
      intValue = 905001027
   )
   static int cc;
   @ObfuscatedName("mr")
   @ObfuscatedGetter(
      intValue = -822079937
   )
   static int cd;
   @ObfuscatedName("ms")
   @ObfuscatedGetter(
      intValue = -507172899
   )
   static int ce;
   @ObfuscatedName("mt")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   static fU cf;
   @ObfuscatedName("mv")
   @ObfuscatedGetter(
      intValue = 1650076865
   )
   static int cg;
   @ObfuscatedName("mw")
   @ObfuscatedGetter(
      intValue = -436531359
   )
   static int ch;
   @ObfuscatedName("my")
   @ObfuscatedGetter(
      intValue = -903389231
   )
   private static int gF;
   @ObfuscatedName("mz")
   @ObfuscatedGetter(
      intValue = -1851707445
   )
   static int ci;
   @ObfuscatedName("nd")
   static boolean cj;
   @ObfuscatedName("ne")
   @ObfuscatedGetter(
      intValue = 482014895
   )
   static int ck;
   @ObfuscatedName("nf")
   private static int[] gG;
   @ObfuscatedName("ng")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   static dX cl;
   @ObfuscatedName("nh")
   static String cm;
   @ObfuscatedName("ni")
   private static boolean gH;
   @ObfuscatedName("nj")
   static int[] cn;
   @ObfuscatedName("nk")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   static fU co;
   @ObfuscatedName("nl")
   @ObfuscatedSignature(
      signature = "Lqk;"
   )
   static fU cp;
   @ObfuscatedName("nm")
   @ObfuscatedGetter(
      intValue = -839048141
   )
   static int cq;
   @ObfuscatedName("nn")
   static boolean cr;
   @ObfuscatedName("no")
   static int[] cs;
   @ObfuscatedName("np")
   static boolean ct;
   @ObfuscatedName("nq")
   static boolean cu;
   @ObfuscatedName("nr")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   static dX cv;
   @ObfuscatedName("ns")
   static boolean cw;
   @ObfuscatedName("nv")
   @ObfuscatedGetter(
      longValue = -8185571664505572073L
   )
   static long cx;
   @ObfuscatedName("nw")
   @ObfuscatedSignature(
      signature = "Lqq;"
   )
   static gb cy;
   @ObfuscatedName("nx")
   static boolean cz;
   @ObfuscatedName("ny")
   private static boolean gI;
   @ObfuscatedName("nz")
   @ObfuscatedGetter(
      intValue = 1218523195
   )
   static int cA;
   @ObfuscatedName("oa")
   @ObfuscatedSignature(
      signature = "Lca;"
   )
   private static hP gJ;
   @ObfuscatedName("ob")
   private static Dimension gK;
   @ObfuscatedName("oc")
   private static String gL;
   @ObfuscatedName("od")
   @ObfuscatedGetter(
      intValue = 642095193
   )
   static int cB;
   @ObfuscatedName("of")
   @ObfuscatedGetter(
      intValue = 1098063781
   )
   static int cC;
   @ObfuscatedName("og")
   static byte[] cD;
   @ObfuscatedName("oh")
   private static boolean gM;
   @ObfuscatedName("oi")
   @ObfuscatedGetter(
      intValue = 2022895519
   )
   static int cE;
   @ObfuscatedName("oj")
   @ObfuscatedGetter(
      intValue = 989490365
   )
   static int cF;
   @ObfuscatedName("ok")
   @ObfuscatedSignature(
      signature = "Ldv;"
   )
   static ko cG;
   @ObfuscatedName("om")
   @ObfuscatedGetter(
      intValue = -2025025225
   )
   static int cH;
   @ObfuscatedName("on")
   private static int[] gN;
   @ObfuscatedName("op")
   @ObfuscatedGetter(
      intValue = 211114945
   )
   static int cI;
   @ObfuscatedName("oq")
   @ObfuscatedGetter(
      intValue = -463964681
   )
   static int cJ;
   @ObfuscatedName("os")
   @ObfuscatedSignature(
      signature = "Ldv;"
   )
   static ko cK;
   @ObfuscatedName("ou")
   private static int gO;
   @ObfuscatedName("ov")
   @ObfuscatedGetter(
      intValue = -1363384369
   )
   static int cL;
   @ObfuscatedName("ow")
   static int[] cM;
   @ObfuscatedName("ox")
   @ObfuscatedGetter(
      intValue = -2075240755
   )
   static int cN;
   @ObfuscatedName("oy")
   private static int gP;
   @ObfuscatedName("pb")
   @ObfuscatedSignature(
      signature = "Lpi;"
   )
   static fp cO;
   @ObfuscatedName("pd")
   @ObfuscatedGetter(
      intValue = 1608579381
   )
   static int cP;
   @ObfuscatedName("pe")
   public static int cQ;
   @ObfuscatedName("pg")
   static int[][][] cR;
   @ObfuscatedName("pj")
   private static double gQ;
   @ObfuscatedName("pj")
   public static kx cS;
   @ObfuscatedName("pm")
   static int[][][] cT;
   @ObfuscatedName("pp")
   private static boolean gR;
   @ObfuscatedName("ps")
   static boolean cU;
   @ObfuscatedName("pt")
   private static int gS;
   @ObfuscatedName("pu")
   public static Logger cV;
   @ObfuscatedName("pw")
   @ObfuscatedGetter(
      intValue = -419779743
   )
   static int cW;
   @ObfuscatedName("px")
   private static Dimension gT;
   @ObfuscatedName("qa")
   static boolean cX;
   @ObfuscatedName("qb")
   @ObfuscatedGetter(
      intValue = -61861077
   )
   private static int gU;
   @ObfuscatedName("qc")
   @ObfuscatedGetter(
      intValue = 1413436267
   )
   private static int gV;
   @ObfuscatedName("qd")
   @ObfuscatedGetter(
      intValue = 899368885
   )
   static int cY;
   @ObfuscatedName("qe")
   @ObfuscatedGetter(
      intValue = 761823401
   )
   static int cZ;
   @ObfuscatedName("qf")
   @ObfuscatedGetter(
      intValue = -1358914267
   )
   static int da;
   @ObfuscatedName("qg")
   @ObfuscatedGetter(
      intValue = -776932151
   )
   static int db;
   @ObfuscatedName("qh")
   @ObfuscatedGetter(
      intValue = 1615875053
   )
   private static int gW;
   @ObfuscatedName("qi")
   static int[] dc;
   @ObfuscatedName("qj")
   public static DrawCallbacks dd;
   @ObfuscatedName("qm")
   @ObfuscatedGetter(
      intValue = 777014125
   )
   static int de;
   @ObfuscatedName("qn")
   private static boolean gX;
   @ObfuscatedName("qo")
   @ObfuscatedGetter(
      intValue = -808006989
   )
   static int df;
   @ObfuscatedName("qp")
   private static double gY;
   @ObfuscatedName("qp")
   public static int dg;
   @ObfuscatedName("qq")
   @ObfuscatedGetter(
      intValue = -1350308511
   )
   static int dh;
   @ObfuscatedName("qs")
   @ObfuscatedGetter(
      intValue = -544191107
   )
   static int di;
   @ObfuscatedName("qt")
   static boolean dj;
   @ObfuscatedName("qu")
   @ObfuscatedGetter(
      intValue = 81070831
   )
   static int dk;
   @ObfuscatedName("qv")
   @ObfuscatedGetter(
      intValue = 1818888267
   )
   private static int gZ;
   @ObfuscatedName("qy")
   static int[] dl;
   @ObfuscatedName("ra")
   @ObfuscatedGetter(
      intValue = 675119733
   )
   static int dm;
   @ObfuscatedName("rb")
   @ObfuscatedGetter(
      intValue = 2087472901
   )
   static int dn;
   @ObfuscatedName("rc")
   private static int ha;
   @ObfuscatedName("rd")
   @ObfuscatedGetter(
      intValue = -625832873
   )
   static int do;
   @ObfuscatedName("re")
   static int[] dp;
   @ObfuscatedName("rf")
   @ObfuscatedGetter(
      intValue = 723852787
   )
   static int dq;
   @ObfuscatedName("rg")
   static String[] dr;
   @ObfuscatedName("rh")
   static boolean[] ds;
   @ObfuscatedName("ri")
   @ObfuscatedGetter(
      intValue = 319882977
   )
   static int dt;
   @ObfuscatedName("rj")
   public static final Map du;
   @ObfuscatedName("rk")
   @ObfuscatedGetter(
      intValue = -1542697407
   )
   static int dv;
   @ObfuscatedName("rl")
   @ObfuscatedSignature(
      signature = "Ljv;"
   )
   static cx dw;
   public static final boolean dx;
   @ObfuscatedName("rm")
   static int[] dy;
   @ObfuscatedName("rn")
   static int[] dz;
   @ObfuscatedName("ro")
   @ObfuscatedGetter(
      intValue = -1195196699
   )
   static int dA;
   @ObfuscatedName("rp")
   static String[] dB;
   @ObfuscatedName("rq")
   @ObfuscatedGetter(
      intValue = 1550627781
   )
   static int dC;
   @ObfuscatedName("rr")
   @ObfuscatedGetter(
      intValue = -999186357
   )
   static int dD;
   @ObfuscatedName("rs")
   @ObfuscatedGetter(
      longValue = 123374758391802337L
   )
   static long dE;
   @ObfuscatedName("rt")
   static int[] dF;
   @ObfuscatedName("ru")
   @ObfuscatedGetter(
      longValue = 5028019790688935047L
   )
   static long dG;
   @ObfuscatedName("rv")
   static int[] dH;
   @ObfuscatedName("rw")
   static int[][] dI;
   @ObfuscatedName("rx")
   @ObfuscatedGetter(
      intValue = 1220971317
   )
   static int dJ;
   @ObfuscatedName("ry")
   @ObfuscatedGetter(
      intValue = 2046643965
   )
   static int dK;
   @ObfuscatedName("rz")
   static int[] dL;
   @ObfuscatedName("sb")
   @ObfuscatedGetter(
      intValue = -1805685543
   )
   static int dM;
   @ObfuscatedName("sd")
   static String dN;
   @ObfuscatedName("se")
   @ObfuscatedSignature(
      signature = "Lov;"
   )
   public static fd dO;
   @ObfuscatedName("sf")
   static boolean dP;
   @ObfuscatedName("sg")
   @ObfuscatedGetter(
      intValue = 1897664563
   )
   static int dQ;
   @ObfuscatedName("sh")
   static String dR;
   @ObfuscatedName("si")
   @ObfuscatedGetter(
      intValue = -1805320555
   )
   static int dS;
   @ObfuscatedName("sj")
   @ObfuscatedSignature(
      signature = "Lxy;"
   )
   static jy dT;
   @ObfuscatedName("sk")
   static boolean dU;
   @ObfuscatedName("sl")
   @ObfuscatedGetter(
      intValue = 922603103
   )
   static int dV;
   @ObfuscatedName("sm")
   @ObfuscatedGetter(
      intValue = -1617175157
   )
   static int dW;
   @ObfuscatedName("sn")
   static boolean dX;
   @ObfuscatedName("so")
   @ObfuscatedGetter(
      intValue = -1268625889
   )
   static int dY;
   @ObfuscatedName("sp")
   @ObfuscatedGetter(
      intValue = -742557445
   )
   static int dZ;
   @ObfuscatedName("sq")
   @ObfuscatedGetter(
      intValue = -865398809
   )
   static int ea;
   @ObfuscatedName("sr")
   public static List eb;
   @ObfuscatedName("st")
   @ObfuscatedSignature(
      signature = "Lov;"
   )
   static fd ec;
   @ObfuscatedName("su")
   static boolean ed;
   @ObfuscatedName("sv")
   static int[] ee;
   @ObfuscatedName("sx")
   @ObfuscatedGetter(
      intValue = 902149203
   )
   static int ef;
   @ObfuscatedName("sy")
   @ObfuscatedGetter(
      intValue = 797543925
   )
   static int eg;
   @ObfuscatedName("ta")
   @ObfuscatedGetter(
      intValue = -1978424081
   )
   static int eh;
   @ObfuscatedName("tc")
   @ObfuscatedSignature(
      signature = "Lov;"
   )
   static fd ei;
   @ObfuscatedName("te")
   @ObfuscatedGetter(
      intValue = -2111595511
   )
   static int ej;
   @ObfuscatedName("tf")
   @ObfuscatedGetter(
      intValue = 1927736037
   )
   static int ek;
   @ObfuscatedName("tg")
   static boolean el;
   @ObfuscatedName("th")
   @ObfuscatedGetter(
      intValue = -811651397
   )
   static int em;
   @ObfuscatedName("ti")
   @ObfuscatedGetter(
      intValue = -1184427713
   )
   static int en;
   @ObfuscatedName("tj")
   static int[] eo;
   @ObfuscatedName("tk")
   @ObfuscatedGetter(
      intValue = 712972335
   )
   static int ep;
   @ObfuscatedName("tm")
   @ObfuscatedGetter(
      intValue = 28106117
   )
   static int eq;
   @ObfuscatedName("tn")
   @ObfuscatedGetter(
      intValue = 1616415687
   )
   static int er;
   @ObfuscatedName("to")
   @ObfuscatedGetter(
      intValue = -314106663
   )
   static int es;
   @ObfuscatedName("tp")
   @ObfuscatedGetter(
      intValue = 473012747
   )
   static int et;
   @ObfuscatedName("tq")
   static boolean eu;
   @ObfuscatedName("tr")
   static boolean ev;
   @ObfuscatedName("ts")
   @ObfuscatedGetter(
      intValue = -1525396867
   )
   static int ew;
   @ObfuscatedName("tt")
   private static int[] hb;
   @ObfuscatedName("tu")
   @ObfuscatedGetter(
      intValue = -1086179825
   )
   static int ex;
   @ObfuscatedName("tv")
   static int[] ey;
   @ObfuscatedName("tw")
   @ObfuscatedGetter(
      intValue = 682163419
   )
   static int ez;
   @ObfuscatedName("tx")
   @ObfuscatedGetter(
      intValue = -1242911867
   )
   private static int hc;
   @ObfuscatedName("ty")
   private static int[] hd;
   @ObfuscatedName("tz")
   static int[] eA;
   @ObfuscatedName("ub")
   @ObfuscatedGetter(
      intValue = -1591051477
   )
   private static int he;
   @ObfuscatedName("uc")
   @ObfuscatedSignature(
      signature = "[Lwd;"
   )
   private static iT[] hf;
   @ObfuscatedName("ud")
   public static int[] eB;
   @ObfuscatedName("ue")
   @ObfuscatedGetter(
      intValue = 697083101
   )
   public static int eC;
   @ObfuscatedName("uf")
   private static int hg;
   @ObfuscatedName("ug")
   @ObfuscatedGetter(
      intValue = -1356226489
   )
   static int eD;
   @ObfuscatedName("uh")
   static boolean[] eE;
   @ObfuscatedName("ui")
   public static int[] eF;
   @ObfuscatedName("uj")
   @ObfuscatedGetter(
      intValue = 1119443611
   )
   private static int hh;
   @ObfuscatedName("uk")
   static int[] eG;
   @ObfuscatedName("ul")
   private static int[] hi;
   @ObfuscatedName("um")
   private static int[] hj;
   @ObfuscatedName("un")
   @ObfuscatedGetter(
      intValue = -1832433719
   )
   static int eH;
   @ObfuscatedName("uo")
   @ObfuscatedGetter(
      intValue = 1646072177
   )
   static int eI;
   @ObfuscatedName("up")
   @ObfuscatedSignature(
      signature = "Lxz;"
   )
   static jz eJ;
   @ObfuscatedName("uq")
   @ObfuscatedGetter(
      intValue = -486350451
   )
   static int eK;
   @ObfuscatedName("ur")
   public static boolean[] eL;
   @ObfuscatedName("us")
   @ObfuscatedGetter(
      intValue = 1200409791
   )
   static int eM;
   @ObfuscatedName("ut")
   static boolean[] eN;
   @ObfuscatedName("uu")
   @ObfuscatedGetter(
      intValue = 1610442037
   )
   static int eO;
   @ObfuscatedName("uv")
   public static int[] eP;
   @ObfuscatedName("uw")
   public static int[] eQ;
   @ObfuscatedName("ux")
   private static long[] hk;
   @ObfuscatedName("uy")
   @ObfuscatedGetter(
      intValue = -399042659
   )
   static int eR;
   @ObfuscatedName("uz")
   @ObfuscatedGetter(
      intValue = -466443813
   )
   static int eS;
   @ObfuscatedName("vb")
   @ObfuscatedSignature(
      signature = "Lum;"
   )
   static id eT;
   @ObfuscatedName("vc")
   @ObfuscatedGetter(
      intValue = -71837669
   )
   public static int eU;
   @ObfuscatedName("vd")
   static boolean[] eV;
   @ObfuscatedName("ve")
   @ObfuscatedSignature(
      signature = "Lum;"
   )
   static id eW;
   @ObfuscatedName("vk")
   @ObfuscatedGetter(
      intValue = -1166867281
   )
   static int eX;
   @ObfuscatedName("vl")
   static int[] eY;
   @ObfuscatedName("vo")
   static boolean eZ;
   @ObfuscatedName("vp")
   static boolean fa;
   @ObfuscatedName("vs")
   @ObfuscatedSignature(
      signature = "Luc;"
   )
   static hS fb;
   @ObfuscatedName("vw")
   static boolean fc;
   @ObfuscatedName("vx")
   public static kx fd;
   @ObfuscatedName("vx")
   public static int fe;
   @ObfuscatedName("vx")
   private static double hl;
   @ObfuscatedName("wc")
   static ArrayList ff;
   @ObfuscatedName("we")
   @ObfuscatedGetter(
      intValue = 1454406263
   )
   static int fg;
   @ObfuscatedName("wf")
   static List fh;
   @ObfuscatedName("wg")
   @ObfuscatedGetter(
      intValue = 2034510043
   )
   static int fi;
   @ObfuscatedName("wh")
   static int[] fj;
   @ObfuscatedName("wi")
   static int[] fk;
   @ObfuscatedName("wj")
   @ObfuscatedSignature(
      signature = "Lso;"
   )
   static hb fl;
   @ObfuscatedName("wk")
   @ObfuscatedGetter(
      intValue = -892585083
   )
   static int fm;
   @ObfuscatedName("wl")
   static int[] fn;
   @ObfuscatedName("wn")
   @ObfuscatedGetter(
      intValue = 1375092225
   )
   static int fo;
   @ObfuscatedName("wp")
   static int[] fp;
   @ObfuscatedName("wq")
   static int[] fq;
   @ObfuscatedName("wx")
   @ObfuscatedSignature(
      signature = "Luz;"
   )
   static hQ fr;
   @Inject
   @Named("runeLiteDir")
   @ObfuscatedName("zh")
   public File fs;
   @ObfuscatedName("yd")
   @ObfuscatedSignature(
      signature = "Lmr;"
   )
   private dX hm = new dX(16);
   @com.google.inject.Inject(
      optional = true
   )
   @Named("scriptVmMaxOps")
   @ObfuscatedName("yw")
   public int ft = 600000;
   @ObfuscatedName("bc")
   private File hn;
   @Inject
   @Named("insecureWriteCredentials")
   @ObfuscatedName("ek")
   public boolean fu;
   @com.google.inject.Inject(
      optional = true
   )
   @Named("scriptVmWarningOps")
   @ObfuscatedName("el")
   public int fv;
   @ObfuscatedName("iv")
   private boolean ho;
   @ObfuscatedName("lv")
   private long hp;
   @ObfuscatedName("ot")
   private Properties hq;
   @Inject
   @ObfuscatedName("pk")
   public ScheduledExecutorService fw;
   @Inject
   @ObfuscatedName("uf")
   public Callbacks fx;
   @ObfuscatedName("wa")
   @ObfuscatedGetter(
      intValue = 1174170739
   )
   private int hr;
   @ObfuscatedName("wb")
   @ObfuscatedSignature(
      signature = "Lae;"
   )
   private fr hs;
   @ObfuscatedName("wd")
   boolean fy;
   @ObfuscatedName("wm")
   @ObfuscatedSignature(
      signature = "Lak;"
   )
   private n ht;
   @ObfuscatedName("wo")
   private c hu;
   @ObfuscatedName("wu")
   private a hv;
   @ObfuscatedName("wv")
   private String hw;
   @ObfuscatedName("wy")
   private Future hx;
   @ObfuscatedName("wz")
   @ObfuscatedSignature(
      signature = "Lae;"
   )
   private fr hy;
   @ObfuscatedName("xg")
   @ObfuscatedGetter(
      longValue = -2719469319638350901L
   )
   private long hz;
   @ObfuscatedName("xs")
   @ObfuscatedSignature(
      signature = "Lam;"
   )
   private I hA;
   @ObfuscatedName("xy")
   @ObfuscatedSignature(
      signature = "Lwt;"
   )
   private jk hB;
   @ObfuscatedName("xz")
   private Future hC;

   public client() {
      eD = 2;
      String var10000 = (System.currentTimeMillis() % 1000L).makeConcatWithConstants<invokedynamic>(System.currentTimeMillis() % 1000L);
      boolean var1 = true;
      String var2 = var10000;
      fH = var10000.length() > 3 ? var2.substring(0, 3) + "+" : var2;
      this.fy = false;
      this.hr = 0;
      this.hz = -1L;
      this.Y();
   }

   @ObfuscatedName("yu")
   @ObfuscatedSignature(
      signature = "()[Lbg;"
   )
   public static dO[] i() {
      return iB.a;
   }

   @ObfuscatedName("yc")
   private void V() {
      int var1;
      boolean var2 = (var1 = osrs.gY.k) == 1 || !osrs.I.b && var1 == 4;
      int var3 = dT.h - 1;
      int var7;
      if (var2) {
         int var10001 = dT.k[var3];
         boolean var6 = dT.m[var3];
         int var5 = var10001;
         if (a(var5, var6)) {
            var3 = osrs.gY.f;
            var7 = osrs.gY.g;
            this.f(var7, var3);
            return;
         }
      }

      if (var2) {
         dT.a(var3);
      } else {
         if (var1 == 2) {
            var3 = osrs.gY.f;
            var7 = osrs.gY.g;
            this.f(var7, var3);
         }

      }
   }

   @ObfuscatedName("amo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1701779732"
   )
   private void W() {
      X();
      int var1 = 0;
      boolean var2 = P.a > 0;

      for(int var3 = P.g; var1 < 100 || var2; var2 = P.a > 0) {
         boolean var4 = this.b(P);
         if (var2) {
            int var5 = P.g - var3;
            kg var10000 = P;
            var10000.a -= var5;
         }

         if (!var4) {
            break;
         }

         ++var1;
         var3 = P.g;
      }

      kx var6;
      if ((var6 = cS) != null) {
         if (!dx && fd != null) {
            throw new AssertionError();
         }

         cS = null;
         if (!dx && aa != 25) {
            throw new AssertionError();
         }

         b(var6);
         this.setGameState(GameState.LOGGED_IN);
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "13"
   )
   protected final void b() {
      aI = osrs.au.a() + 500L;
      this.ad();
      if (cc != -1) {
         a(this, true, 872661838);
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(I)Lid;"
   )
   public static bC c(int var0) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return osrs.cE.a(var0);
      }
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-777762887"
   )
   protected final void b(boolean var1) {
      this.fx.frame();
      long var5;
      long var7 = (var5 = System.nanoTime()) - this.hp;
      this.hp = var5;
      int var2;
      int var10001;
      int var47;
      int var52;
      if (aa == GameState.LOGGED_IN.getState()) {
         float var4 = (float)var7 / 2.0E7F;
         a(osrs.aM.a, var4);
         double var13 = a(gd, var7);
         double var15 = a(fG, var7);
         gY += var13 / 2.0D;
         gc = Doubles.constrainToRange(gc += var15 / 2.0D, by ? 0.0D : 0.39269909262657166D, by ? 1.5707963705062866D : 1.1750292778015137D);
         cd = a(gY);
         bW = a(gc);
         if (az == 0) {
            int var40 = gm;
            kd var66;
            if ((var66 = ag.b(var40)) == null) {
               var66 = osrs.aM.a;
            }

            Object var14 = null;
            long var77;
            switch(osrs.ec.b.e) {
            case 0:
               var77 = (long)as;
               var14 = (jg)var66.e.a(var77);
               break;
            case 1:
               var77 = (long)as;
               var14 = (jg)var66.g.a(var77);
               break;
            case 2:
               var77 = (long)as;
               var14 = (jg)var66.l.b(var77);
            }

            if (var14 == null) {
               var14 = osrs.ai.a;
            }

            float var67 = ((jg)var14).g();
            float var16 = ((jg)var14).h();
            var2 = ((jg)var14).e();
            if (var66 != osrs.aM.a) {
               var77 = (long)var66.k;
               hG var18;
               go var19;
               if ((var18 = (hG)osrs.aM.a.l.b(var77)) != null) {
                  var10001 = (int)var67;
                  var52 = (int)var16;
                  var47 = var10001;
                  var19 = var18.b(var47, var52);
               } else {
                  var19 = osrs.go.c(var67, 0.0F, var16);
               }

               var67 = var19.g;
               var16 = var19.h;
               osrs.go.a(var19, -1911388082);
            }

            if (!(fP - (double)var67 < -500.0D) && !(fP - (double)var67 > 500.0D) && !(fV - (double)var16 < -500.0D) && !(fV - (double)var16 > 500.0D)) {
               double var72 = (double)var7 / 3.2E8D;
               fP += ((double)var67 - fP) * var72;
               fV += ((double)var16 - fV) * var72;
            } else {
               fP = (double)var67;
               fV = (double)var16;
            }

            float var73 = a(var66, ((jg)var14).g(), ((jg)var14).h(), var2);
            if (var66 != osrs.aM.a) {
               var77 = (long)var66.k;
               hG var75;
               if ((var75 = (hG)osrs.aM.a.l.b(var77)) != null) {
                  var73 += a(osrs.aM.a, var75.g(), var75.h(), var75.c());
               }
            }

            gQ = (double)(var73 - (float)ak);
            osrs.C.b = (int)fP;
            osrs.bs.j = (int)fV;
            osrs.cQ.a = (int)gQ;
         }
      }

      if ((aa == 10 || aa == 20 || aa == 30) && aI != 0L && osrs.au.a() > aI) {
         hN.a(osrs.eg.c());
      }

      if (var1) {
         for(var2 = 0; var2 < 100; ++var2) {
            eE[var2] = true;
         }
      }

      int var57;
      int var68;
      if (aa == 0) {
         boolean var60 = osrs.dn.a;
         boolean var6 = var1;
         String var54 = jB.c;
         int var3 = jB.b;
         client var44 = this;

         try {
            Graphics var48 = var44.u.getGraphics();
            if (osrs.gO.a == null) {
               osrs.gO.a = new Font("Helvetica", 1, 13);
               iB.b = var44.u.getFontMetrics(osrs.gO.a);
            }

            if (var6 && !var60) {
               var48.setColor(Color.black);
               var48.fillRect(0, 0, osrs.fs.h, osrs.fs.a);
            }

            Color var10 = new Color(140, 17, 17);

            try {
               if (osrs.cb.a == null) {
                  osrs.cb.a = var44.u.createImage(304, 34);
               }

               Graphics var11;
               (var11 = osrs.cb.a.getGraphics()).setColor(var10);
               var11.drawRect(0, 0, 303, 33);
               var11.fillRect(2, 2, var3 * 3, 30);
               var11.setColor(Color.black);
               var11.drawRect(1, 1, 301, 31);
               var11.fillRect(var3 * 3 + 2, 2, 300 - var3 * 3, 30);
               var11.setFont(osrs.gO.a);
               var11.setColor(Color.white);
               var11.drawString(var54, (304 - iB.b.stringWidth(var54)) / 2, 22);
               var48.drawImage(osrs.cb.a, osrs.fs.h / 2 - 152, osrs.fs.a / 2 + (var60 ? 50 : -18), (ImageObserver)null);
            } catch (Exception var42) {
               var57 = osrs.fs.h / 2 - 152;
               var68 = osrs.fs.a / 2 - 18;
               var48.setColor(var10);
               var48.drawRect(var57, var68, 303, 33);
               var48.fillRect(var57 + 2, var68 + 2, var3 * 3, 30);
               var48.setColor(Color.black);
               var48.drawRect(var57 + 1, var68 + 1, 301, 31);
               var48.fillRect(var57 + var3 * 3 + 2, var68 + 2, 300 - var3 * 3, 30);
               var48.setFont(osrs.gO.a);
               var48.setColor(Color.white);
               var48.drawString(var54, var57 + (304 - iB.b.stringWidth(var54)) / 2, var68 + 22);
            }
         } catch (Exception var43) {
            super.u.repaint();
         }
      } else if (aa != 5 && aa != 10 && aa != 11 && aa != 20 && aa != 50) {
         if (aa == 25) {
            osrs.fy.a("Loading - please wait.");
         } else if (aa == 30) {
            if (cc != -1) {
               var52 = cc;
               if (osrs.eu.a(jD.a, var52)) {
                  osrs.w.a(jD.a.c[var52], 0, jD.a.c[var52].length - 1, -1, -1);
               }
            }

            for(var52 = 0; var52 < eC; ++var52) {
               if (eE[var52]) {
                  eL[var52] = true;
               }

               eN[var52] = eE[var52];
               eE[var52] = false;
            }

            eK = Z;
            ef = -1;
            dZ = -1;
            if (cc != -1) {
               eC = 0;
               osrs.aA.a(cc, 0, 0, osrs.fs.h, osrs.fs.a, 0, 0, -1);
            }

            jd.h();
            if (aB) {
               if (dv == 1) {
                  osrs.gs.a[dq / 100].a(dD - 8, dC - 8);
               }

               if (dv == 2) {
                  osrs.gs.a[dq / 100 + 4].a(dD - 8, dC - 8);
               }
            }

            int var61;
            if (!dP) {
               if (ef != -1) {
                  var52 = ef;
                  var57 = dZ;
                  if ((dT.h >= 2 || dU) && aJ) {
                     var61 = iC.b();
                     String var8;
                     if (dU && dT.h < 2) {
                        var8 = dN + " " + dR + " ->";
                     } else {
                        var8 = jy.a(dT, var61);
                     }

                     if (dT.h > 2) {
                        var8 = var8 + osrs.dz.a(16777215) + " / " + (dT.h - 2) + " more options";
                     }

                     osrs.hf.a.b((String)var8, var52 + 4, var57 + 15, 16777215, 0, Z / 1000);
                  }
               }
            } else {
               jy var50 = dT;
               BeforeMenuRender var64 = new BeforeMenuRender();
               osrs.dF.c.getCallbacks().post(var64);
               if (!var64.isConsumed()) {
                  b(var50, (ky)null, 255, N);
               }
            }

            if (eD == 3) {
               for(var52 = 0; var52 < eC; ++var52) {
                  if (eN[var52]) {
                     jd.c(eF[var52], eB[var52], eQ[var52], eP[var52], 16711935, 128);
                  } else if (eL[var52]) {
                     jd.c(eF[var52], eB[var52], eQ[var52], eP[var52], 16711680, 128);
                  }
               }
            }

            go var65 = ag.c();
            hG var10000 = ag.a();
            var10001 = (int)var65.f;
            int var10002 = (int)var65.g;
            int var10003 = (int)var65.h;
            int var71 = cP;
            int var69 = var10003;
            int var70 = var10002;
            var68 = var10001;
            hG var59 = var10000;
            Iterator var74 = ag.iterator();

            kd var76;
            while(var74.hasNext()) {
               for(gD var45 = (gD)osrs.fU.e((var76 = (kd)var74.next()).p); var45 != null; var45 = (gD)osrs.fU.b(var76.p)) {
                  if (var45.f * -31212479 != -1 || var45.e != null) {
                     hG var53 = ag.a(var45.n);
                     var52 = var45.i;
                     boolean var46;
                     if (var53 == var59) {
                        var46 = var52 == var68;
                     } else if (var59 != null && var53 == null) {
                        var46 = var59.d.k == var68 && var59.c() == var52;
                     } else {
                        var46 = false;
                     }

                     if (var46) {
                        kd var49;
                        go var55 = osrs.gW.a(var49 = ag.b(var45.n), var45.m, var45.h);
                        go var51 = osrs.gW.a(var49, var45.k, var45.c);
                        var52 = (int)var55.g;
                        var61 = (int)var55.h;
                        int var63 = (int)var51.g;
                        int var9 = (int)var51.h;
                        osrs.go.a(var55, -1851760863);
                        osrs.go.a(var51, -1980813433);
                        var2 = 0;
                        if (var70 > var63) {
                           var2 = 0 + (var70 - var63);
                        } else if (var70 < var52) {
                           var2 = 0 + (var52 - var70);
                        }

                        if (var69 > var9) {
                           var2 += var69 - var9;
                        } else if (var69 < var61) {
                           var2 += var61 - var69;
                        }

                        if ((var2 = Math.max(var2 - 64, 0)) < var45.l && osrs.j.aS.h != 0) {
                           var2 = (int)((var45.g < var45.l ? Math.min(Math.max((float)(var45.l - var2) / (float)(var45.l - var45.g), 0.0F), 1.0F) : 1.0F) * (float)osrs.j.aS.h);
                           km var56;
                           if (var45.p == null) {
                              if (var45.f * -31212479 >= 0 && (var56 = km.a(osrs.dE.a, var45.f * -31212479, 0)) != null) {
                                 o var58;
                                 (var58 = osrs.o.a((kl)kl.a(var56.a(false), osrs.l.e), 100, var2)).f(-1);
                                 osrs.N.a.a((jX)var58);
                                 var45.p = var58;
                              }
                           } else {
                              var45.p.e(var2);
                           }

                           if (var45.q == null) {
                              if (var45.e != null && (var45.j -= var71) <= 0) {
                                 var47 = (int)(Math.random() * (double)var45.e.length);
                                 if ((var56 = km.a(osrs.dE.a, var45.e[var47], 0)) != null) {
                                    o var62;
                                    (var62 = osrs.o.a((kl)kl.a(var56.a(false), osrs.l.e), 100, var2)).f(0);
                                    osrs.N.a.a((jX)var62);
                                    var45.q = var62;
                                    var45.j = var45.o + (int)(Math.random() * (double)(var45.d * 316223597 - var45.o));
                                 }
                              }
                           } else {
                              var45.q.e(var2);
                              if (var45.q.cg == null) {
                                 var45.q = null;
                              }
                           }
                           continue;
                        }
                     }

                     var45.a();
                     var45.b();
                  }
               }
            }

            osrs.go.a(var65, -1947544519);
            cP = 0;
         } else if (aa == 40) {
            osrs.fy.a("Connection lost<br>Please wait - attempting to reestablish");
         } else if (aa == 45) {
            osrs.fy.a("Please wait...");
         }
      } else {
         osrs.gk.a(osrs.hf.a, osrs.dt.a, osrs.cA.a);
      }

      if (aa == 30 && eD == 0 && !var1 && !aT) {
         for(var2 = 0; var2 < eC; ++var2) {
            if (eL[var2]) {
               osrs.fH.d.a(eF[var2], eB[var2], eQ[var2], eP[var2]);
               eL[var2] = false;
            }
         }
      } else if (aa > 0) {
         osrs.fH.d.a(0, 0);

         for(var2 = 0; var2 < eC; ++var2) {
            eL[var2] = false;
         }
      }

      osrs.dX.c();
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1358247604"
   )
   protected final void e() {
      if (osrs.eq.a != null && osrs.eq.a.c) {
         ka.a(osrs.eq.a, (byte)95);
      }

      if (osrs.dU.h != null) {
         osrs.dU.h.g = false;
      }

      osrs.dU.h = null;
      kg.a(P);
      if (osrs.gY.m != null) {
         synchronized(osrs.gY.m) {
            osrs.gY.m = null;
         }
      }

      osrs.dO.e = null;
      if (jD.c != null) {
         jD.c.h();
      }

      osrs.ec.f.a();
      osrs.dG.a();
      if (osrs.aE.a != null) {
         osrs.K.a(osrs.aE.a, (byte)27);
         osrs.aE.a = null;
      }

      osrs.aN.a();
      this.ht.a();
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1154613150"
   )
   protected final void f() {
      int[] var1 = new int[]{20, 260, 10000};
      int[] var2 = new int[]{1000, 100, 500};
      jO.b = var1;
      osrs.di.a = new int[var1.length];
      osrs.p.a = new byte[var1.length][][];

      for(int var3 = 0; var3 < jO.b.length; ++var3) {
         osrs.p.a[var3] = new byte[var2[var3]][];
         osrs.gV.j.add(var1[var3]);
      }

      Collections.sort(osrs.gV.j);
      osrs.eE.a = osrs.G.a(aY, iC.g);
      osrs.gO.b = bl == 0 ? 'ꩊ' : aj + '鱀';
      osrs.er.a = bl == 0 ? 443 : aj + '썐';
      osrs.cb.b = osrs.gO.b;
      osrs.eY.g = osrs.ff.d;
      osrs.eY.d = osrs.ff.b;
      osrs.eY.e = osrs.ff.c;
      osrs.eY.b = osrs.ff.a;
      osrs.aE.a = new u(this.fy, 231);
      this.a_();
      m var14;
      (var14 = super.u).addMouseListener(osrs.gY.m);
      var14.addMouseMotionListener(osrs.gY.m);
      var14.addFocusListener(osrs.gY.m);
      if (super.y == null) {
         super.y = new aS();
         var14 = super.u;
         aS var9 = super.y;
         var14.addMouseWheelListener(var9);
      }

      osrs.dO.e = super.y;
      osrs.fs.a((eh)aR, 0);
      osrs.fs.a((eh)aU, 1);
      super.x = this.getToolkit().getSystemClipboard();
      osrs.ej.f = new hp(255, osrs.bT.d, osrs.bT.c, 750000);
      iH var15 = null;
      jD var8 = new jD();

      try {
         byte[] var11 = new byte[(int)(var15 = jT.a("", iQ.h.g, false)).a.length()];

         int var4;
         for(int var5 = 0; var5 < var11.length; var5 += var4) {
            if ((var4 = var15.b(var11, var5, var11.length - var5)) == -1) {
               throw new IOException();
            }
         }

         var8 = new jD(new jk(var11));
      } catch (Exception var7) {
      }

      try {
         if (var15 != null) {
            var15.a();
         }
      } catch (Exception var6) {
      }

      osrs.j.aS = var8;
      hN.a(jD.c(var8, (byte)-25));
      jE.b = new cN(osrs.gR.c);
      this.ht = new n("tokenRequest", 1, 1);
      if (!osrs.ee.i.contains(this)) {
         osrs.ee.i.add(this);
      }

      cM var10;
      (var10 = T).a = new cQ[1];
      cU var17 = osrs.cU.f;
      var10.a[0] = new cQ(var17.i, var17.h);
      class243 var16;
      (var16 = new class243(3, 1, 0)).a(-64, -8, 64);
      var16.a(64, -8, 64);
      var16.a(0, -8, -24);
      boolean var12 = true;
      var12 = true;
      var12 = true;
      var12 = true;
      var12 = true;
      boolean var18 = true;
      boolean var13 = false;
      var16.d[var16.c] = 0;
      var16.e[var16.c] = 2;
      var16.j[var16.c] = 1;
      var16.g[var16.c] = 1;
      var16.i[var16.c] = -1;
      var16.f[var16.c] = 10173;
      var16.h[var16.c] = -1;
      int var10002 = var16.c++;
      osrs.hj.c = var16.a(1, 32, 0, -128, 0);
      osrs.z.b = var16.a(64, 850, -30, -50, -30);
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "([Lnet/runelite/api/Model;I)Ljm;"
   )
   private static cn a(Model[] var0, int var1) {
      return new cn((cn[])Arrays.copyOf(var0, var1, cn[].class), var1);
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-4"
   )
   protected final void g() {
      this.fx.tick();
      ++Z;
      client var1 = this;
      synchronized(osrs.ec.f) {
         if (aa != 1000 && !osrs.ec.f.b()) {
            a((client)var1, (byte)6);
         }
      }

      while(true) {
         fl var6;
         synchronized(osrs.fH.e) {
            var6 = (fl)osrs.I.a(osrs.fH.c);
         }

         if (var6 == null) {
            if (osrs.ef.a() && cz && jD.c != null) {
               jD.c.i();
            }

            osrs.cV.a(aU, 880494042);
            osrs.fs.c();
            osrs.l.b();
            if (osrs.dO.e != null) {
               ci = osrs.dO.e.a();
            }

            if (aa == 0) {
               osrs.bv.b();
               iQ.a();
            } else if (aa == 5) {
               osrs.bt.a(this, osrs.cA.a);
               osrs.bv.b();
               iQ.a();
            } else if (aa != 10 && aa != 11) {
               if (aa == 20) {
                  osrs.bt.a(this, osrs.cA.a);
                  this.ae();
               } else if (aa == 50) {
                  osrs.bt.a(this, osrs.cA.a);
                  this.ae();
               } else if (aa == 25) {
                  if (cj) {
                     osrs.z.b();
                  }

                  if (ct) {
                     osrs.ag.a(osrs.aC.a);
                  }

                  if (!ct && !cj) {
                     jT.d(30);
                  }
               }
            } else {
               osrs.bt.a(this, osrs.cA.a);
            }

            if (aa == 30) {
               this.A(-1100399580);
            } else if (aa == 40 || aa == 45) {
               this.ae();
            }

            if (jD.c != null) {
               jD.c.g();
            }

            this.fx.tickEnd();
            return;
         }

         var6.b.a(var6.d, (int)var6.cf, var6.c, false);
      }
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "(I)Lwd;"
   )
   private static iT w(int var0) {
      iT var1 = new iT(new int[541696], 736, 736);

      try {
         a(osrs.aM.a, var1, 4.0D, var0, -osrs.aM.a.o.e, -osrs.aM.a.o.e, 0, 0);
      } catch (Exception var2) {
         cV.debug("instance map", var2);
      }

      return var1;
   }

   @ObfuscatedName("dr")
   private static void x(int var0) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         jT.d(var0);
      }
   }

   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIIILnet/runelite/api/Actor;II)Lcy;"
   )
   public static jQ a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Actor var8, int var9, int var10) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         int var11 = 0;
         if (var8 instanceof kc) {
            var11 = ((kc)var8).getIndex() + 1;
         } else if (var8 instanceof jG) {
            var11 = -(((jG)var8).getId() + 1);
         }

         WorldPoint var13 = WorldPoint.fromLocal(osrs.dF.c, var2, var3, var1);
         WorldPoint var14 = WorldPoint.fromLocal(osrs.dF.c, var9, var10, var1);
         jQ var12 = new jQ(var1, var13.getX(), var13.getY(), var4, 0, var1, var14.getX(), var14.getY(), 0, var11, var0, var5, var6, var7, 0);
         osrs.fU.a((fU)aw, var12);
         return var12;
      }
   }

   @ObfuscatedName("eh")
   private String c(String var1) {
      if (this.hq == null) {
         this.hn = new File(this.fs, System.getProperty("runelite.credentials.path", "credentials.properties"));
         this.hq = new Properties();
         if (this.fu) {
            String[] var2;
            int var10000 = (var2 = new String[]{"JX_ACCESS_TOKEN", "JX_REFRESH_TOKEN", "JX_CHARACTER_ID", "JX_SESSION_ID", "JX_DISPLAY_NAME"}).length;

            for(int var4 = 0; var4 < 5; ++var4) {
               String var3 = var2[var4];
               String var5;
               if ((var5 = (String)System.getenv().get(var3)) != null) {
                  this.hq.setProperty(var3, var5);
               }
            }

            this.ho = true;
         }

         if (this.hq.isEmpty() && this.hn.exists()) {
            try {
               FileInputStream var11 = new FileInputStream(this.hn);

               try {
                  InputStreamReader var13 = new InputStreamReader(var11, StandardCharsets.UTF_8);

                  try {
                     this.hq.load(var13);
                  } catch (Throwable var8) {
                     try {
                        var13.close();
                     } catch (Throwable var7) {
                        var8.addSuppressed(var7);
                     }

                     throw var8;
                  }

                  var13.close();
               } catch (Throwable var9) {
                  try {
                     var11.close();
                  } catch (Throwable var6) {
                     var9.addSuppressed(var6);
                  }

                  throw var9;
               }

               var11.close();
            } catch (IOException var10) {
               cV.warn("unable to load credentials from disk", var10);
            }

            if (this.hq.size() > 0) {
               cV.info("read {} credentials from disk", this.hq.size());
            }
         } else if (this.fu) {
            cV.info("writing {} credentials to disk", this.hq.size());
            this.ag();
         }
      }

      String var12;
      if ((var12 = (String)System.getenv().get(var1)) == null && (var12 = this.hq.getProperty(var1)) != null && "JX_REFRESH_TOKEN".equals(var1)) {
         this.ho = true;
      }

      return var12;
   }

   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      signature = "()Lcm;"
   )
   public static jD j() {
      return osrs.j.aS;
   }

   @ObfuscatedName("ey")
   @ObfuscatedSignature(
      signature = "(I)Lva;"
   )
   private static ir y(int var0) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return kd.a(var0);
      }
   }

   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      signature = "(I)Lhl;"
   )
   public static bh d(int var0) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return osrs.bN.a(var0);
      }
   }

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      signature = "(II)Lov;"
   )
   private static fd e(int var0, int var1) {
      if (jD.a == null) {
         return null;
      } else {
         fd[][] var2;
         if ((var2 = jD.a.c) != null && var2.length > var0) {
            fd[] var3;
            return (var3 = var2[var0]) != null && var3.length > var1 ? var3[var1] : null;
         } else {
            return null;
         }
      }
   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      signature = "(IIIILwd;Lnr;)V"
   )
   private static void a(int var0, int var1, int var2, int var3, iT var4, ey var5) {
      osrs.fb.a(var0, var1, var2, var3, var4, var5);
   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      signature = "([Lnet/runelite/api/ModelData;I)Ljj;"
   )
   private static class243 a(ModelData[] var0, int var1) {
      return new class243((class243[])Arrays.copyOf(var0, var1, class243[].class), var1);
   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      signature = "(IIIILwd;Lnr;)V"
   )
   private static void a(int var0, int var1, int var2, int var3, iT var4, ey var5, boolean var6) {
      osrs.bi.a(var0, var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedName("iv")
   private static void X() {
      if (!dx && cS != null) {
         throw new AssertionError();
      } else {
         kx var0;
         if (fd != null && fd.a()) {
            var0 = cS = fd;
            fd = null;
            bC = false;
            osrs.aM.a.m = var0.f;
            if (!dx && aa != 30) {
               throw new AssertionError();
            }

            c(var0);
            if (!dx && aa != 25) {
               throw new AssertionError();
            }
         }

         if (L != null && L.a()) {
            var0 = L;
            L = null;
            if (!dx && !bC) {
               throw new AssertionError();
            }

            bC = false;
            a(var0);
            if (!dx && !ct) {
               throw new AssertionError();
            }

            ct = false;
            osrs.aC.a = null;
         }

      }
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   private void Y() {
      if (this.fx != null) {
         this.fx.post(new AccountHashChanged());
      }

   }

   @ObfuscatedName("ka")
   @ObfuscatedSignature(
      signature = "(I)Ljk;"
   )
   public static cl e(int var0) {
      return osrs.da.a(var0);
   }

   @ObfuscatedName("lj")
   @ObfuscatedSignature(
      signature = "()Luy;"
   )
   public static ip k() {
      return osrs.er.b;
   }

   @Nonnull
   @ObfuscatedName("ls")
   @ObfuscatedSignature(
      signature = "(I)Lip;"
   )
   public static bP f(int var0) {
      return osrs.az.a(var0);
   }

   @ObfuscatedName("nu")
   @ObfuscatedSignature(
      signature = "()Ldk;"
   )
   private kc Z() {
      if (this.getHintArrowType() == 1) {
         long var2 = (long)cI;
         return (kc)osrs.aM.a.g.a(var2);
      } else {
         return null;
      }
   }

   @ObfuscatedName("on")
   @ObfuscatedSignature(
      signature = "()Lcp;"
   )
   private jG aa() {
      if (this.getHintArrowType() == 10) {
         long var2 = (long)cJ;
         return (jG)osrs.aM.a.e.a(var2);
      } else {
         return null;
      }
   }

   @ObfuscatedName("on")
   @ObfuscatedSignature(
      signature = "()[Lwy;"
   )
   public static jp[] l() {
      return osrs.gw.b;
   }

   @ObfuscatedName("oy")
   @ObfuscatedSignature(
      signature = "()Ldg;"
   )
   public static jY m() {
      return osrs.N.a;
   }

   @ObfuscatedName("pf")
   @ObfuscatedSignature(
      signature = "(Ldn;I)Z",
      garbageValue = "1872990227"
   )
   private static boolean a(kg var0) {
      if (var0.e == 0) {
         osrs.aX.a = null;
         R();
      } else {
         if (osrs.aX.a == null) {
            osrs.aX.a = new hd(osrs.gR.c, osrs.dF.c);
            R();
         }

         hd var10000 = osrs.aX.a;
         jo var2 = var0.i;
         hd var1 = var10000;
         String var10001 = var2.p();
         boolean var3 = true;
         String var4 = var10001;
         var10000.e = osrs.aP.a((CharSequence)var4);
         long var7 = var2.e();
         var10001 = osrs.dg.a(var7);
         int var8 = 261798949;
         var4 = var10001;
         var1.c = osrs.aP.a((CharSequence)var4);
         var1.b = var2.B();
         if ((var8 = var2.x()) != -1) {
            var1.d();

            for(int var9 = 0; var9 < var8; ++var9) {
               jw var6 = new jw(var2.p(), var1.d);
               gT var5 = (gT)var1.a(var6, (jw)null);
               int var10 = var2.d();
               var5.a(var10, ++var1.f - 1);
               var5.d = var2.B();
               var2.p();
               var1.a(var5);
            }
         }
      }

      osrs.aA.a();
      var0.b = null;
      return true;
   }

   @ObfuscatedName("pj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1674166349"
   )
   private void ab() {
      osrs.gs.a(dO);
      ++osrs.t.a;
      int var1;
      int var2;
      if (eu && ev) {
         var1 = osrs.gY.j;
         var2 = osrs.gY.b;
         var1 -= eg;
         var2 -= dV;
         if (var1 < eh) {
            var1 = eh;
         }

         if (var1 + dO.i * -1805166981 > ec.i * -1805166981 + eh) {
            var1 = ec.i * -1805166981 + eh - dO.i * -1805166981;
         }

         if (var2 < ex) {
            var2 = ex;
         }

         if (var2 + dO.n * -2133353239 > ec.n * -2133353239 + ex) {
            var2 = ec.n * -2133353239 + ex - dO.n * -2133353239;
         }

         int var3 = var1 - er;
         int var4 = var2 - ej;
         int var5 = dO.aL * -1850741621;
         if (osrs.t.a > dO.aw && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            el = true;
            D();
         }

         var1 = var1 - eh + ec.L;
         var2 = ec.D * 178093445 + (var2 - ex);
         jK var6;
         if (dO.bd != null && el) {
            (var6 = new jK()).j = dO;
            var6.f = var1;
            var6.h = var2;
            var6.g = dO.bd;
            osrs.fW.a(var6);
         }

         if (osrs.gY.h == 0) {
            if (el) {
               if (dO.bF != null) {
                  (var6 = new jK()).j = dO;
                  var6.f = var1;
                  var6.h = var2;
                  var6.i = ei;
                  var6.g = dO.bF;
                  osrs.fW.a(var6);
               }

               if (ei != null) {
                  fd var7;
                  var3 = var2 = osrs.ck.a(var7 = dO) >> 17 & 7;
                  if (var2 == 0) {
                     var7 = null;
                  } else {
                     label109: {
                        for(var2 = 0; var2 < var3; ++var2) {
                           if ((var7 = jD.a.b(var7.v)) == null) {
                              var7 = null;
                              break label109;
                           }
                        }

                        var7 = var7;
                     }
                  }

                  if (var7 != null) {
                     dQ var8;
                     (var8 = osrs.X.a(osrs.j.m, P.f)).g.c(ei.m);
                     jk.g(var8.g, ei.s * -744024149);
                     jk.g(var8.g, dO.s * -744024149);
                     jk.g(var8.g, ei.bJ);
                     jk.h(var8.g, dO.m);
                     var8.g.o(dO.bJ);
                     P.a(var8);
                  }
               }
            } else if (osrs.fO.a != null && !a(osrs.fO.a.j, osrs.fO.a.e)) {
               if (dT.h > 0) {
                  var1 = er + eg;
                  var2 = dV + ej;
                  osrs.gh.a(osrs.fO.a, var1, var2);
                  osrs.fO.a = null;
                  T();
               }
            } else {
               this.f(er + eg, ej + dV);
            }

            dO = null;
         }

      } else {
         if (osrs.t.a > 1) {
            if (!el && dT.h > 0) {
               var1 = eg + er;
               var2 = dV + ej;
               osrs.gh.a(osrs.fO.a, var1, var2);
               osrs.fO.a = null;
               T();
            }

            dO = null;
         }

      }
   }

   @ObfuscatedName("pm")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-536944763"
   )
   private void z(int var1) {
      osrs.aL.c = null;
      osrs.n.a = null;
      gu = 0;
      if (osrs.cb.b == osrs.gO.b) {
         osrs.cb.b = osrs.er.a;
      } else {
         osrs.cb.b = osrs.gO.b;
      }

      if (++gz < 2 || var1 != 7 && var1 != 9) {
         if (gz >= 2 && var1 == 6) {
            osrs.fs.a(this, "js5connect_outofdate", (byte)0);
            jT.d(1000);
            return;
         }

         if (gz >= 4) {
            if (aa <= 5) {
               osrs.fs.a(this, "js5connect", (byte)0);
               jT.d(1000);
               return;
            }

            gw = 3000;
            return;
         }
      } else {
         if (aa <= 5) {
            osrs.fs.a(this, "js5connect_full", (byte)0);
            jT.d(1000);
            return;
         }

         gw = 3000;
      }

   }

   @ObfuscatedName("pq")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1254581128"
   )
   private void ac() {
      if (!dP) {
         boolean var1 = false;
         if (osrs.fO.a != null && dT.h > 0) {
            var1 = osrs.fO.a.j == dT.k[dT.h - 1] && osrs.fO.a.f == dT.g[dT.h - 1] && osrs.fO.a.b == dT.f[dT.h - 1] && osrs.fO.a.i == dT.e[dT.h - 1] && osrs.fO.a.k == dT.b[dT.h - 1] && osrs.fO.a.g == dT.j[dT.h - 1] && osrs.fO.a.h == dT.l[dT.h - 1] && osrs.fO.a.c == dT.a[dT.h - 1];
         }

         boolean var2;
         do {
            var2 = true;

            for(int var3 = 0; var3 < dT.h - 1; ++var3) {
               if (dT.k[var3] < 1000 && dT.k[var3 + 1] > 1000) {
                  dT.c(var3, var3 + 1);
                  var2 = false;
               }
            }
         } while(!var2);

         this.getCallbacks().post(new PostMenuSort());
         boolean var6 = false;
         if (osrs.fO.a != null && dT.h > 0) {
            var6 = osrs.fO.a.j == dT.k[dT.h - 1] && osrs.fO.a.f == dT.g[dT.h - 1] && osrs.fO.a.b == dT.f[dT.h - 1] && osrs.fO.a.i == dT.e[dT.h - 1] && osrs.fO.a.k == dT.b[dT.h - 1] && osrs.fO.a.g == dT.j[dT.h - 1] && osrs.fO.a.h == dT.l[dT.h - 1] && osrs.fO.a.c == dT.a[dT.h - 1];
         }

         if (var1 && !var6 && dT.h > 0) {
            if (!dx && osrs.fO.a == null) {
               throw new AssertionError();
            }

            int var4 = dT.k[dT.h - 1];
            osrs.fO.a.j = var4;
            var4 = dT.g[dT.h - 1];
            osrs.fO.a.f = var4;
            String var5 = dT.f[dT.h - 1];
            osrs.fO.a.b = var5;
            var5 = dT.e[dT.h - 1];
            osrs.fO.a.i = var5;
            var4 = dT.b[dT.h - 1];
            osrs.fO.a.k = var4;
            var4 = dT.j[dT.h - 1];
            osrs.fO.a.g = var4;
            var4 = dT.l[dT.h - 1];
            osrs.fO.a.h = var4;
            var4 = dT.a[dT.h - 1];
            osrs.fO.a.c = var4;
            osrs.fO.a.d = dT.q[dT.h - 1].c;
         }
      }

      if (dO == null) {
         if (dP) {
            af();
            return;
         }

         if (dT.h > 0) {
            this.V();
         }
      }

   }

   @ObfuscatedName("pr")
   private void A(int param1) {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("ps")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-67"
   )
   private void ad() {
      int var1 = osrs.fs.h;
      int var2 = osrs.fs.a;
      int var10000;
      if (super.w < var1) {
         var10000 = super.w;
      }

      if (super.v < var2) {
         var10000 = super.v;
      }

      if (osrs.j.aS != null) {
         try {
            client var4 = osrs.dF.c;
            Object[] var5 = new Object[]{osrs.eg.c()};
            JSObject.getWindow(var4).call("resize", var5);
            return;
         } catch (Throwable var3) {
         }
      }

   }

   @ObfuscatedName("pv")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1577261101"
   )
   static boolean n() {
      return gL != null && !gL.trim().isEmpty() && osrs.ar.c != null && !osrs.ar.c.trim().isEmpty();
   }

   @ObfuscatedName("pw")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-2084170730"
   )
   public final void a(int var1) {
      if (P != null && P.f != null && var1 >= 0 && osrs.j.aS.n > 0 && !cz) {
         dQ var2;
         (var2 = osrs.X.a(osrs.j.N, P.f)).g.c(var1);
         P.a(var2);
      }

   }

   @ObfuscatedName("px")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1902490506"
   )
   private void d(String var1) throws IOException {
      HashMap var2;
      (var2 = new HashMap()).put("grant_type", "refresh_token");
      var2.put("scope", "gamesso.token.create");
      var2.put("refresh_token", var1);
      String var10002 = osrs.gk.a;
      URL var4 = new URL(var10002 + "shield/oauth/token" + (new hX(var2)).c());
      hl var6 = new hl();
      int var3 = -1463602799;
      int var10000 = this.hr;
      osrs.hl.a(var6, ga, (short)-2468);
      var6.a("Host", (new URL(osrs.gk.a)).getHost());
      osrs.hl.a(var6, if.a, (short)-6038);
      js var7 = js.b;
      c var8 = this.hu;
      bp var5 = new bp(var4, var7, var6, this.fy);
      this.hs = osrs.n.a(this.ht, var5, 1762050630);
   }

   @ObfuscatedName("py")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-127"
   )
   static boolean o() {
      return osrs.u.a != null && !osrs.u.a.trim().isEmpty() && osrs.cw.a != null && !osrs.cw.a.trim().isEmpty();
   }

   @ObfuscatedName("pz")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-1803293038"
   )
   private void a(String var1, String var2) throws IOException, JSONException {
      URL var3 = new URL(osrs.aj.a + "game-session/v1/tokens");
      bp var6;
      (var6 = new bp(var3, js.b, this.fy)).c.a(var1);
      osrs.hl.a(var6.c, if.a, (short)-17082);
      JSONObject var5;
      (var5 = new JSONObject()).put("accountId", var2);
      var6.a(new ig(var5));
      this.hy = osrs.n.a(this.ht, var6, -2757541);
   }

   @ObfuscatedName("qd")
   @ObfuscatedSignature(
      signature = "(B)Lxm;",
      garbageValue = "65"
   )
   public final jw a() {
      return osrs.ai.a != null ? osrs.ai.a.aT : null;
   }

   @ObfuscatedName("qj")
   @ObfuscatedSignature(
      signature = "(I)[Lov;"
   )
   public static fd[] g(int var0) {
      if (jD.a == null) {
         return null;
      } else {
         fd[][] var1;
         return (var1 = jD.a.c) != null && var0 >= 0 && var0 < var1.length && var1[var0] != null ? var1[var0] : null;
      }
   }

   @ObfuscatedName("ql")
   @ObfuscatedSignature(
      signature = "(Ldn;I)Z"
   )
   private boolean b(kg var1) {
      if (bC) {
         return false;
      } else {
         kg var2 = var1;
         client var3 = this;
         hw var4 = var1.a();
         jo var5 = var1.i;
         if (var4 != null) {
            String var61;
            int var62;
            try {
               if (var2.a > 0 && !var4.a(var2.a)) {
                  return false;
               }

               int var6;
               if (var2.b == null) {
                  if (var2.j) {
                     if (!var4.a(1)) {
                        return false;
                     }

                     var2.g += var4.b(var2.i.d, 0, 1);
                     var2.k = 0;
                     var2.j = false;
                  }

                  var5.c = 0;
                  if (var5.O()) {
                     if (!var4.a(1)) {
                        return false;
                     }

                     var2.g += var4.b(var2.i.d, 1, 1);
                     var2.k = 0;
                  }

                  var2.j = true;
                  k[] var7 = osrs.cQ.a();
                  if ((var6 = var5.N()) < 0 || var6 >= var7.length) {
                     throw new IOException(var6 + " " + var5.c);
                  }

                  var2.b = var7[var6];
                  var2.e = var2.b.bI;
               }

               if (var2.e == -1) {
                  if (!var4.a(1)) {
                     return false;
                  }

                  var2.g += var4.b(var5.d, 0, 1);
                  var2.e = var5.d[0] & 255;
               }

               if (var2.e == -2) {
                  if (!var4.a(2)) {
                     return false;
                  }

                  var2.g += var4.b(var5.d, 0, 2);
                  var5.c = 0;
                  var2.e = var5.d();
               }

               if (!var4.a(var2.e)) {
                  return false;
               }

               var5.c = 0;
               var2.g += var4.b(var5.d, 0, var2.e);
               var2.k = 0;
               osrs.fp.a(cO, 2025248835);
               var2.h = var2.d;
               var2.d = var2.c;
               var2.c = var2.b;
               if (var2.b == osrs.k.bB) {
                  iQ.a(osrs.ec.a, var5);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.o) {
                  osrs.cD.a(osrs.dR.m);
                  var2.b = null;
                  return true;
               }

               int var9;
               int var10;
               int var11;
               int var12;
               int var63;
               int var70;
               int var71;
               if (var2.b == osrs.k.bt) {
                  cu = true;
                  gH = false;
                  fa = true;
                  hE.r = jk.a((jk)var5, (byte)-72);
                  osrs.cB.a = jk.a((jk)var5, (byte)-40);
                  var12 = var5.d();
                  var6 = osrs.ew.a(jk.a((jk)var5, (byte)11));
                  var62 = osrs.ew.a(jk.a((jk)var5, (byte)64));
                  var70 = var5.d();
                  fc = var5.i();
                  var63 = jk.a((jk)var5, (byte)2);
                  var71 = osrs.ew.a(hE.r);
                  var9 = osrs.ew.a(osrs.cB.a);
                  if (fc) {
                     var10 = jD.b;
                     var11 = osrs.bW.a(osrs.aM.a, var71, var9, osrs.aM.a.m) - var12;
                  } else {
                     var10 = osrs.bW.a(osrs.aM.a, osrs.l.d, osrs.fk.b, osrs.aM.a.m) - jD.b;
                     var11 = var12;
                  }

                  fb = new hZ(osrs.l.d, osrs.fk.b, var10, var71, var9, var11, var6, var62, var70, var63);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aF) {
                  cu = true;
                  gH = false;
                  eZ = true;
                  var12 = osrs.hc.a(var5.c() & 2027);
                  var6 = osrs.ac.a(var5.c() & 2027);
                  var62 = var5.d();
                  var70 = jk.a((jk)var5, (byte)19);
                  eT = new id(osrs.dB.a, var6, var62, var70);
                  eW = new id(osrs.gv.a, var12, var62, var70);
                  var2.b = null;
                  return true;
               }

               boolean var64;
               String var66;
               if (var2.b == osrs.k.aQ) {
                  var12 = jk.a((jk)var5, (int)-464053523);
                  var64 = jk.a((jk)var5, (byte)52) == 1;
                  var61 = "";
                  boolean var103 = false;
                  if (var64) {
                     var61 = var5.p();
                     if (osrs.cN.a(jE.b, new jw(var61, osrs.gR.c), 342185015)) {
                        var103 = true;
                     }
                  }

                  var66 = var5.p();
                  if (!var103) {
                     osrs.fu.a(var12, var61, var66);
                  }

                  var2.b = null;
                  return true;
               }

               fd var68;
               if (var2.b == osrs.k.aa) {
                  var12 = jk.d((jk)var5, 1687107415);
                  var6 = var5.d();
                  if ((var68 = jD.a.b(var12)) != null && var68.j == 0) {
                     if (var6 > var68.S - var68.n * -2133353239) {
                        var6 = var68.S - var68.n * -2133353239;
                     }

                     if (var6 < 0) {
                        var6 = 0;
                     }

                     if (var6 != var68.D * 178093445) {
                        var68.D = var6 * -380832947;
                        osrs.gs.a(var68);
                     }
                  }

                  var2.b = null;
                  return true;
               }

               String var76;
               if (var2.b == osrs.k.J) {
                  var76 = var5.p();
                  var61 = osrs.gw.c(osrs.cX.a(osrs.aB.b(var5)));
                  osrs.fu.a(6, var76, var61);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bA) {
                  var2.a = var5.c();
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.b) {
                  osrs.r.a(false, var2.i);
                  var2.b = null;
                  return true;
               }

               AnimationChanged var86;
               if (var2.b == osrs.k.bh) {
                  Iterator var83 = osrs.ec.a.e.iterator();

                  while(var83.hasNext()) {
                     jG var91;
                     (var91 = (jG)var83.next()).ab = -1;
                     if (jE.a) {
                        var91.aA = (byte)(var91.aA | 2);
                     } else {
                        (var86 = new AnimationChanged()).setActor(var91);
                        osrs.dF.c.getCallbacks().post(var86);
                     }
                  }

                  Iterator var95 = osrs.ec.a.g.iterator();

                  while(true) {
                     kc var97;
                     label2258:
                     while(true) {
                        if (!var95.hasNext()) {
                           var2.b = null;
                           return true;
                        }

                        (var97 = (kc)var95.next()).ab = -1;
                        if (!(var97 instanceof kc)) {
                           break;
                        }

                        switch(var97.getId()) {
                        case 8615:
                        case 8616:
                        case 8617:
                        case 8618:
                        case 8619:
                        case 8620:
                        case 8621:
                        case 8622:
                           break;
                        default:
                           break label2258;
                        }
                     }

                     if (jE.a) {
                        var97.aA = (byte)(var97.aA | 2);
                     } else {
                        (var86 = new AnimationChanged()).setActor(var97);
                        osrs.dF.c.getCallbacks().post(var86);
                     }
                  }
               }

               if (var2.b == osrs.k.ac) {
                  osrs.cD.a(osrs.dR.a);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.r) {
                  osrs.hm.a = var5.G();
                  osrs.bG.e = var5.G();
                  cW = var5.D();
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.Z) {
                  osrs.ft.a = osrs.ao.a(jk.a((jk)var5, (byte)105));
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.F) {
                  Object[] var81 = new Object[(var76 = var5.p()).length() + 1];

                  for(var62 = var76.length() - 1; var62 >= 0; --var62) {
                     hD var85;
                     switch(var76.charAt(var62)) {
                     case 'W':
                        var70 = var5.n();
                        int[] var94 = (var85 = new hD(iv.c, 0, var70, var70)).b();

                        for(var9 = 0; var9 < var70; ++var9) {
                           var94[var9] = var5.v();
                        }

                        var81[var62 + 1] = var85;
                        break;
                     case 'X':
                        var70 = var5.n();
                        Object[] var90 = (var85 = new hD(iv.b, (Object)null, var70, var70)).a();

                        for(var9 = 0; var9 < var70; ++var9) {
                           var90[var9] = var5.p();
                        }

                        var81[var62 + 1] = var85;
                        break;
                     case 's':
                        var81[var62 + 1] = var5.p();
                        break;
                     default:
                        var81[var62 + 1] = new Integer(jk.d((jk)var5, 1687107415));
                     }
                  }

                  var81[0] = new Integer(jk.d((jk)var5, 1687107415));
                  jK var89;
                  (var89 = new jK()).g = var81;
                  osrs.fW.a(var89);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bu) {
                  if ((var12 = jk.f(var5, -1509027406)) == 65535) {
                     var12 = -1;
                  }

                  var70 = var5.d();
                  var63 = jk.a((jo)var5, (byte)7);
                  if ((var6 = var5.d()) == 65535) {
                     var6 = -1;
                  }

                  var62 = jk.a((jo)var5, (byte)7);
                  var71 = jk.a((jo)var5, (byte)7);
                  ArrayList var79;
                  (var79 = new ArrayList()).add(var12);
                  var79.add(var6);
                  osrs.bq.a(var79, var62, var70, var63, var71);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aC) {
                  osrs.eZ.a();
                  var2.b = null;
                  return false;
               }

               if (var2.b == osrs.k.aw) {
                  var5.c += 28;
                  if (var5.t()) {
                     osrs.aW.a(var5, var5.c - 28);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bz) {
                  a(var2);
                  return true;
               }

               fd var78;
               if (var2.b == osrs.k.H) {
                  if ((var12 = jk.b(var5, (byte)-39)) == 65535) {
                     var12 = -1;
                  }

                  var6 = var5.I();
                  var62 = jk.c(var5, (byte)-68);
                  bC var84;
                  if (!(var78 = jD.a.b(var6)).f) {
                     if (var12 == -1) {
                        var78.ap = 0;
                        var2.b = null;
                        return true;
                     }

                     var84 = osrs.bC.a(osrs.cE.a(var12), var62, (byte)-70);
                     var78.ap = 4;
                     var78.aq = var12;
                     var78.ak = var84.n;
                     var78.ai = var84.I;
                     var78.ao = var84.m * 100 / var62;
                  } else {
                     var78.bJ = var12;
                     var78.bG = var62;
                     var84 = osrs.bC.a(osrs.cE.a(var12), var62, (byte)-92);
                     var78.ak = var84.n;
                     var78.ai = var84.I;
                     var78.ab = var84.x;
                     var78.ah = var84.u;
                     var78.ad = var84.G;
                     var78.ao = var84.m;
                     if (var84.C == 1) {
                        var78.au = 1;
                     } else {
                        var78.au = 2;
                     }

                     if (var78.an > 0) {
                        var78.ao = (var78.ao << 5) / var78.an;
                     } else if (var78.u > 0) {
                        var78.ao = (var78.ao << 5) / var78.u;
                     }
                  }

                  osrs.gs.a(var78);
                  var2.b = null;
                  return true;
               }

               byte var8;
               int var13;
               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               if (var2.b == osrs.k.bk) {
                  var8 = var5.g();
                  var15 = jk.b(var5, (byte)-54);
                  var11 = jk.b(var5, (byte)-111);
                  var14 = var5.d();
                  var10 = var5.y();
                  byte var107 = var5.g();
                  var13 = var5.D() << 2;
                  var18 = var5.G() << 2;
                  var17 = var5.h();
                  var16 = jk.b(var5, (byte)-61);
                  var12 = (var62 = var5.J()) >> 16;
                  var6 = var62 >> 8 & 255;
                  var70 = var12 + (var62 >> 4 & 7);
                  var63 = var6 + (var62 & 7);
                  var12 = var5.G();
                  if (var11 != 65535) {
                     var70 += osrs.ec.a.n;
                     var63 += osrs.ec.a.i;
                     var71 = var8 + var70;
                     var9 = var107 + var63;
                     jQ var34 = new jQ(osrs.ec.a.m, var70, var63, var18, var17, osrs.ec.a.m, var71, var9, var13, var10, var11, var14 + Z, var15 + Z, var12, var16);
                     osrs.fU.a((fU)aw, var34);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.by) {
                  ke.b(jk.a((jk)var5, (byte)-45));
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.m) {
                  osrs.cD.a(osrs.dR.e);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bg) {
                  osrs.dA.m = var5.i();
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.i) {
                  osrs.eP.d = new hH(osrs.bP.f);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.a) {
                  osrs.dr.f();
                  var8 = var5.B();
                  if (var2.e == 1) {
                     if (var8 >= 0) {
                        aP[var8] = null;
                     } else {
                        osrs.bt.d = null;
                     }

                     var2.b = null;
                     return true;
                  }

                  if (var8 >= 0) {
                     aP[var8] = new aP(var5);
                  } else {
                     osrs.bt.d = new aP(var5);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aK) {
                  if ((var12 = jk.f(var5, -2067378102)) == 65535) {
                     var12 = -1;
                  }

                  cc = var12;
                  a(var3, false, 1403985516);
                  osrs.ch.a(var12);
                  osrs.bf.a(cc);

                  for(var6 = 0; var6 < 100; ++var6) {
                     eE[var6] = true;
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.j) {
                  eq = bU * 733503027;
                  var8 = var5.B();
                  if (var2.e == 1) {
                     if (var8 >= 0) {
                        aG[var8] = null;
                        J(var8);
                     } else {
                        ik.a = null;
                        F();
                     }

                     var2.b = null;
                     return true;
                  }

                  if (var8 >= 0) {
                     aG[var8] = new aw(var5);
                     J(var8);
                  } else {
                     ik.a = new aw(var5);
                     F();
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.t && cu) {
                  gH = true;
                  eZ = false;
                  fa = false;

                  for(var12 = 0; var12 < 5; ++var12) {
                     eV[var12] = false;
                     H(var12);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bs) {
                  var12 = (var62 = var5.C()) >> 16;
                  var6 = var62 >> 8 & 255;
                  var70 = var12 + (var62 >> 4 & 7);
                  var63 = var6 + (var62 & 7);
                  var71 = jk.a((jo)var5, (byte)7);
                  var9 = var5.G();
                  var10 = jk.f(var5, -1887896553);
                  if (var70 >= 0 && var63 >= 0 && var70 < osrs.ec.a.d && var63 < osrs.ec.a.c) {
                     var70 = osrs.ew.a(var70);
                     var63 = osrs.ew.a(var63);
                     kd var10004 = osrs.ec.a;
                     fY var106 = new fY(var10004, var71, var10004.m, var70, var63, osrs.bW.a(osrs.ec.a, var70, var63, osrs.ec.a.m) - var9, var10, Z);
                     osrs.fU.a((fU)osrs.ec.a.r, var106);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.X) {
                  osrs.cN.a(jE.b, var5, var2.e);
                  ep = bU * 733503027;
                  var2.b = null;
                  return true;
               }

               long var33;
               long var37;
               boolean var72;
               if (var2.b == osrs.k.I) {
                  var8 = var5.B();
                  var33 = (long)var5.d();
                  var37 = (long)var5.f() + (var33 << 32);
                  var72 = false;
                  aw var96;
                  if ((var96 = var8 >= 0 ? aG[var8] : ik.a) == null) {
                     var72 = true;
                  } else {
                     for(var18 = 0; var18 < 100; ++var18) {
                        if (hk[var18] == var37) {
                           var72 = true;
                           break;
                        }
                     }
                  }

                  if (!var72) {
                     hk[he] = var37;
                     he = (he + 1) % 100;
                     var61 = osrs.aB.b(var5);
                     osrs.hx.a(var13 = var8 >= 0 ? 43 : 46, "", var61, var96.e);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.N) {
                  var12 = var5.z();
                  var6 = var5.d();
                  if ((var68 = jD.a.b(var12)).ap != 2 || var6 != var68.aq) {
                     var68.ap = 2;
                     var68.aq = var6;
                     osrs.gs.a(var68);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.p) {
                  var8 = var5.g();
                  var6 = jk.a((jo)var5, (byte)7);
                  osrs.ej.b[var6] = var8;
                  if (osrs.ej.d[var6] != var8) {
                     osrs.ej.d[var6] = var8;
                     k(var6);
                  }

                  osrs.aN.a(var6);
                  ey[++es - 1 & 31] = var6;
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bp) {
                  var62 = var5.d();
                  var12 = jk.f(var5, -1528975815);
                  var63 = jk.f(var5, -1162074361);
                  var6 = var5.d();
                  var70 = var5.d();
                  if (var12 == 65535) {
                     var12 = -1;
                  }

                  ArrayList var92;
                  (var92 = new ArrayList()).add(var12);
                  osrs.bq.a(var92, var6, var62, var70, var63);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bf) {
                  ax.a(var5, var2.e);
                  osrs.et.d();
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.u) {
                  osrs.bG.e = jk.a((jk)var5, (byte)12);
                  osrs.hm.a = var5.D();
                  cW = jk.a((jk)var5, (byte)-68);

                  for(var12 = osrs.hm.a; var12 < osrs.hm.a + 8; ++var12) {
                     for(var6 = osrs.bG.e; var6 < osrs.bG.e + 8; ++var6) {
                        if (osrs.ec.a.v[cW][var12][var6] != null) {
                           osrs.ec.a.v[cW][var12][var6] = null;
                           osrs.dE.a(cW, var12, var6);
                        }
                     }
                  }

                  for(ik var87 = (ik)osrs.fU.e(osrs.ec.a.u); var87 != null; var87 = (ik)osrs.fU.b(osrs.ec.a.u)) {
                     if (var87.i >= osrs.hm.a && var87.i < osrs.hm.a + 8 && var87.k >= osrs.bG.e && var87.k < osrs.bG.e + 8 && var87.j == cW) {
                        var87.f = 0;
                     }
                  }

                  var2.b = null;
                  return true;
               }

               kc var75;
               if (var2.b == osrs.k.ba) {
                  var12 = jk.c((jo)var5, (byte)97);
                  short var101 = (short)var5.E();
                  var62 = var5.G();
                  var70 = jk.a((jo)var5, (byte)7);
                  if ((var75 = (kc)osrs.ec.a.g.a((long)var70)) != null) {
                     var75.a(var62, var12, var101);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aA) {
                  osrs.ah.d();
                  cg = var5.d();
                  eH = bU * 733503027;
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bc) {
                  var12 = jk.a((jk)var5, (byte)85);
                  if (jk.a((jk)var5, (byte)-40) == 0) {
                     bc[var12] = new fi();
                     p(var12);
                     var5.c += 18;
                  } else {
                     --var5.c;
                     bc[var12] = new fi(var5);
                     p(var12);
                  }

                  em = bU * 733503027;
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aS) {
                  if ((eO = jk.a((jk)var5, (byte)-14)) == 255) {
                     eO = 0;
                  }

                  if ((eM = jk.a((jk)var5, (byte)-53)) == 255) {
                     eM = 0;
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.h) {
                  cu = true;
                  gH = false;
                  fa = true;
                  hE.r = jk.a((jk)var5, (byte)-76);
                  osrs.cB.a = jk.a((jk)var5, (byte)-56);
                  var12 = var5.d();
                  var6 = var5.d();
                  fc = var5.i();
                  var62 = jk.a((jk)var5, (byte)-51);
                  var70 = osrs.ew.a(hE.r);
                  var63 = osrs.ew.a(osrs.cB.a);
                  if (fc) {
                     var71 = jD.b;
                     var9 = osrs.bW.a(osrs.aM.a, var70, var63, osrs.aM.a.m) - var12;
                  } else {
                     var71 = osrs.bW.a(osrs.aM.a, osrs.l.d, osrs.fk.b, osrs.aM.a.m) - jD.b;
                     var9 = var12;
                  }

                  fb = new ic(osrs.l.d, osrs.fk.b, var71, var70, var63, var9, var6, var62);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.s) {
                  osrs.K.b = var5.i();
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.d) {
                  osrs.l.a(osrs.ec.a, false, var5);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aH) {
                  jE.b.c.a(var5, var2.e);
                  osrs.cL.b();
                  ep = bU * 733503027;
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.v) {
                  cA = var5.G();
                  cq = jk.a((jk)var5, (byte)-20);
                  var2.b = null;
                  return true;
               }

               fd var77;
               if (var2.b == osrs.k.al) {
                  var12 = jk.c(var5, (byte)-57);
                  (var77 = jD.a.b(var12)).ap = 3;
                  var77.aq = osrs.ai.a.aV.a();
                  osrs.gs.a(var77);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.e) {
                  eq = bU * 733503027;
                  var8 = var5.B();
                  aA var98 = new aA(var5);
                  aw var105;
                  if (var8 >= 0) {
                     var105 = aG[var8];
                  } else {
                     var105 = ik.a;
                  }

                  if (var105 == null) {
                     B(var8);
                     var2.b = null;
                     return true;
                  }

                  if (var98.b > var105.b) {
                     B(var8);
                     var2.b = null;
                     return true;
                  }

                  if (var98.b < var105.b) {
                     var2.b = null;
                     return true;
                  }

                  osrs.aA.a(var98, var105, 1556211735);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.y) {
                  bt = jk.b(var5, (byte)-36) * 30;
                  eH = bU * 733503027;
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aE) {
                  var72 = var5.G() == 1;
                  var6 = jk.c(var5, (byte)-13);
                  var68 = jD.a.b(var6);
                  if (var72 != var68.P) {
                     var68.P = var72;
                     osrs.gs.a(var68);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bj) {
                  if (jk.a((jk)var5, (byte)-83) == 1) {
                     osrs.l.c = osrs.au.a() - var5.e();
                     osrs.ab.c = new fA(var5);
                  } else {
                     osrs.ab.c = null;
                  }

                  en = bU * 733503027;
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.ae) {
                  var12 = var5.d();
                  var6 = var5.z();
                  if ((var68 = jD.a.b(var6)).ap != 1 || var12 != var68.aq) {
                     var68.ap = 1;
                     var68.aq = var12;
                     osrs.gs.a(var68);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.f) {
                  var12 = jk.a((jo)var5, (byte)7);
                  var6 = var5.I();
                  osrs.ej.b[var12] = var6;
                  if (osrs.ej.d[var12] != var6) {
                     osrs.ej.d[var12] = var6;
                     k(var12);
                  }

                  osrs.aN.a(var12);
                  ey[++es - 1 & 31] = var12;
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.af) {
                  if ((var12 = jk.b(var5, (byte)-114)) == 65535) {
                     var12 = -1;
                  }

                  var5.J();
                  osrs.ab.a(var12);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bF) {
                  var12 = var5.c();
                  var6 = jk.a((jk)var5, (byte)17);
                  kd var104;
                  if (var12 == -1) {
                     var104 = osrs.aM.a;
                     osrs.aM.a.c();
                     var104.m = var6;
                     osrs.ec.a = osrs.aM.a;
                  } else {
                     hG var82;
                     if ((var82 = (hG)osrs.aM.a.l.b((long)var12)) == null) {
                        throw new RuntimeException("No valid ClientWorldEntity with ID " + var12);
                     }

                     var104 = var82.e;
                     var82.e.c();
                     var104.m = var6;
                     osrs.ec.a = var82.e;
                  }

                  var2.b = null;
                  return true;
               }

               long var35;
               long var45;
               if (var2.b == osrs.k.z) {
                  var76 = var5.p();
                  var33 = var5.e();
                  var35 = (long)var5.d();
                  var37 = (long)var5.f();
                  fw var80 = (fw)osrs.aU.a(osrs.eb.a(), jk.a((jk)var5, (byte)-26));
                  var45 = var37 + (var35 << 32);
                  boolean var102 = false;

                  for(var14 = 0; var14 < 100; ++var14) {
                     if (var45 == hk[var14]) {
                        var102 = true;
                        break;
                     }
                  }

                  if (var80.G && osrs.cN.a(jE.b, new jw(var76, osrs.gR.c), 342185015)) {
                     var102 = true;
                  }

                  if (!var102 && av == 0) {
                     hk[he] = var45;
                     he = (he + 1) % 100;
                     var66 = osrs.gw.c(osrs.cX.a(osrs.aB.b(var5)));
                     if (var80.F != -1) {
                        osrs.hx.a(9, osrs.cx.d(var80.F) + var76, var66, osrs.cb.a(var33));
                     } else {
                        osrs.hx.a(9, var76, var66, osrs.cb.a(var33));
                     }
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bm) {
                  var12 = var5.E();
                  var6 = var5.z();
                  var62 = jk.e(var5, 1597744300);
                  var78 = jD.a.b(var6);
                  if (var62 != var78.c || var12 != var78.r || var78.p != 0 || var78.l != 0) {
                     var78.c = var62;
                     var78.r = var12;
                     var78.p = 0;
                     var78.l = 0;
                     osrs.gs.a(var78);
                     a(var78);
                     if (var78.j == 0) {
                        osrs.aP.a(jD.a.c[var6 >> 16], var78, false, (byte)3);
                     }
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.M) {
                  osrs.cD.a(osrs.dR.h);
                  var2.b = null;
                  return true;
               }

               hR var73;
               if (var2.b == osrs.k.aB) {
                  if ((var12 = var5.d()) == 65535) {
                     var12 = -1;
                  }

                  var6 = var5.I();
                  if ((var62 = var5.d()) == 65535) {
                     var62 = -1;
                  }

                  var63 = osrs.fO.a(var70 = jk.d((jk)var5, 1687107415));

                  for(var71 = var12; var71 <= var62; ++var71) {
                     var45 = ((long)var6 << 32) + (long)var71;
                     if ((var73 = osrs.gb.a(cy, var45)) != null) {
                        osrs.gk.a(var73);
                     }

                     cy.a((hR)(new eM(var70, var63)), var45);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bw) {
                  if (osrs.eP.d == null) {
                     osrs.eP.d = new hH(osrs.bP.f);
                  }

                  jm var100 = osrs.bP.f.a(var5);
                  osrs.eP.d.a.a(var100.b, var100.a);
                  hd[++hc - 1 & 31] = var100.b;
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.be) {
                  osrs.cD.a(osrs.dR.i);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aP) {
                  var12 = jk.d((jk)var5, 1687107415);
                  jR var99;
                  if ((var99 = (jR)osrs.gb.a(bT, (long)var12)) != null) {
                     osrs.gh.a(var99, true);
                  }

                  if (bY != null) {
                     osrs.gs.a(bY);
                     bY = null;
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.Y) {
                  osrs.O.a(osrs.aM.a, var5);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aO) {
                  for(var12 = 0; var12 < osrs.ej.d.length; ++var12) {
                     if (osrs.ej.d[var12] != osrs.ej.b[var12]) {
                        osrs.ej.d[var12] = osrs.ej.b[var12];
                        k(var12);
                        osrs.aN.a(var12);
                        ey[++es - 1 & 31] = var12;
                     }
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.am) {
                  osrs.l.a(osrs.ec.a, true, var5);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aT) {
                  var12 = jk.d((jk)var5, 1687107415);
                  var6 = var5.d();
                  if (var12 < -70000) {
                     var6 += 32768;
                  }

                  if (var12 >= 0) {
                     var68 = jD.a.b(var12);
                  } else {
                     var68 = null;
                  }

                  if (var68 != null) {
                     for(var70 = 0; var70 < var68.bO.length; ++var70) {
                        var68.bO[var70] = 0;
                        var68.bM[var70] = 0;
                     }
                  }

                  osrs.B.b(var6);
                  var70 = var5.d();

                  for(var63 = 0; var63 < var70; ++var63) {
                     var71 = var5.d();
                     if ((var9 = jk.c(var5, -499234783)) == 255) {
                        var9 = jk.d((jk)var5, 1687107415);
                     }

                     if (var68 != null && var63 < var68.bO.length) {
                        var68.bO[var63] = var71;
                        var68.bM[var63] = var9;
                     }

                     osrs.P.a(var6, var63, var71 - 1, var9);
                  }

                  if (var68 != null) {
                     osrs.gs.a(var68);
                  }

                  osrs.ah.d();
                  eA[++et - 1 & 31] = var6 & 32767;
                  K(et + 1 - 1 & 31);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.U) {
                  var62 = jk.a((jk)var5, (byte)14);
                  var12 = var5.d();
                  if ((var6 = jk.b(var5, (byte)-62)) == 65535) {
                     var6 = -1;
                  }

                  kc var93;
                  if ((var93 = (kc)osrs.ec.a.g.a((long)var12)) != null) {
                     if (var6 == var93.ab && var6 != -1) {
                        if ((var63 = osrs.az.a(var6).w) == 1) {
                           var93.ak = 0;
                           var93.ae = 0;
                           var93.au = var62;
                           var93.av = 0;
                        } else if (var63 == 2) {
                           var93.av = 0;
                        }
                     } else if (var6 == -1 || var93.ab == -1 || osrs.az.a(var6).l * -1915224377 >= osrs.az.a(var93.ab).l * -1915224377) {
                        label2068: {
                           var93.ab = var6;
                           if (var93 instanceof kc) {
                              switch(var93.getId()) {
                              case 8615:
                              case 8616:
                              case 8617:
                              case 8618:
                              case 8619:
                              case 8620:
                              case 8621:
                              case 8622:
                                 break label2068;
                              }
                           }

                           if (jE.a) {
                              var93.aA = (byte)(var93.aA | 2);
                           } else {
                              (var86 = new AnimationChanged()).setActor(var93);
                              osrs.dF.c.getCallbacks().post(var86);
                           }
                        }

                        var93.ak = 0;
                        var93.ae = 0;
                        var93.au = var62;
                        var93.av = 0;
                        var93.aw = var93.aj;
                     }
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.at) {
                  cu = true;
                  gH = false;
                  eZ = false;
                  ki.f = jk.a((jk)var5, (byte)-35);
                  osrs.ah.g = jk.a((jk)var5, (byte)-42);
                  osrs.hj.d = var5.d();
                  osrs.hn.b = jk.a((jk)var5, (byte)16);
                  if ((jN.a = jk.a((jk)var5, (byte)-46)) >= 100) {
                     var12 = osrs.ew.a(ki.f);
                     var6 = osrs.ew.a(osrs.ah.g);
                     var62 = osrs.bW.a(osrs.aM.a, var12, var6, osrs.aM.a.m) - osrs.hj.d;
                     var70 = var12 - osrs.l.d;
                     var63 = var62 - jD.b;
                     var71 = var6 - osrs.fk.b;
                     var9 = (int)Math.sqrt((double)(var70 * var70 + var71 * var71));
                     osrs.dB.a = (int)(Math.atan2((double)var63, (double)var9) * 325.9490051269531D) & 2047;
                     osrs.gv.a = (int)(Math.atan2((double)var70, (double)var71) * -325.9490051269531D) & 2047;
                     if (osrs.dB.a < 128) {
                        osrs.dB.a = 128;
                     }

                     if (osrs.dB.a > 383) {
                        osrs.dB.a = 383;
                     }
                  }

                  var2.b = null;
                  return true;
               }

               fd var74;
               if (var2.b == osrs.k.K) {
                  var12 = jk.b(var5, (byte)-5);
                  var6 = jk.b(var5, (byte)-96);
                  var62 = jk.f(var5, -990533759);
                  var70 = var5.I();
                  var74 = jD.a.b(var70);
                  if (var62 != var74.ak || var6 != var74.ai || var12 != var74.ao) {
                     var74.ak = var62;
                     var74.ai = var6;
                     var74.ao = var12;
                     osrs.gs.a(var74);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aJ) {
                  if ((var12 = jk.d((jk)var5, 1687107415)) != db) {
                     db = var12;
                     jO.b();
                  }

                  var2.b = null;
                  return true;
               }

               jR var67;
               if (var2.b == osrs.k.aX) {
                  var12 = jk.f(var5, -1968794787);
                  var6 = var5.G();
                  var62 = jk.c((jo)var5, (byte)34);
                  if ((var67 = (jR)osrs.gb.a(bT, (long)var62)) != null) {
                     osrs.gh.a(var67, var12 != var67.d);
                  }

                  osrs.fn.a(var62, var12, var6);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.ag) {
                  var12 = var5.d();
                  var6 = var5.z();
                  var62 = var12 >> 10 & 31;
                  var70 = var12 >> 5 & 31;
                  var63 = var12 & 31;
                  var71 = (var70 << 11) + (var62 << 19) + (var63 << 3);
                  fd var108 = jD.a.b(var6);
                  if (var71 != var108.R) {
                     var108.R = var71;
                     osrs.gs.a(var108);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.P) {
                  eX = jk.a((jk)var5, (byte)-53);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bd) {
                  var12 = var5.c();
                  ag.c(var12);
                  var2.b = null;
                  return true;
               }

               long var49;
               jR var88;
               if (var2.b == osrs.k.C) {
                  var12 = var2.e + var5.c;
                  if ((var6 = var5.d()) == 65535) {
                     var6 = -1;
                  }

                  var62 = var5.d();
                  if (var6 != cc) {
                     cc = var6;
                     a(var3, false, 1496509270);
                     osrs.ch.a(cc);
                     osrs.bf.a(cc);

                     for(var70 = 0; var70 < 100; ++var70) {
                        eE[var70] = true;
                     }
                  }

                  for(; var62-- > 0; var88.c = true) {
                     var70 = jk.d((jk)var5, 1687107415);
                     var63 = var5.d();
                     var71 = jk.a((jk)var5, (byte)2);
                     if ((var88 = (jR)osrs.gb.a(bT, (long)var70)) != null && var63 != var88.d) {
                        osrs.gh.a(var88, true);
                        var88 = null;
                     }

                     if (var88 == null) {
                        var88 = osrs.fn.a(var70, var63, var71);
                     }
                  }

                  for(var67 = (jR)bT.a(); var67 != null; var67 = (jR)bT.c()) {
                     if (var67.c) {
                        var67.c = false;
                     } else {
                        osrs.gh.a(var67, true);
                     }
                  }

                  cy = new gb(512);

                  while(var5.c < var12) {
                     var70 = jk.d((jk)var5, 1687107415);
                     var63 = var5.d();
                     var71 = var5.d();
                     var10 = osrs.fO.a(var9 = jk.d((jk)var5, 1687107415));

                     for(var11 = var63; var11 <= var71; ++var11) {
                        var49 = (long)var11 + ((long)var70 << 32);
                        cy.a((hR)(new eM(var9, var10)), var49);
                     }
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aD) {
                  var12 = jk.c(var5, (byte)-3);
                  var6 = var5.d();
                  var62 = jk.a((jo)var5, (byte)7);
                  jD.a.b(var12).al = var62 + (var6 << 16);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.O) {
                  var12 = var5.G();
                  var6 = jk.c(var5, -499234783);
                  var62 = var5.I();
                  (var78 = jD.a.b(var62)).X.b(var6, var12);
                  osrs.gs.a(var78);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.ax) {
                  byte[] var121 = new byte[var2.e];
                  var5.c(var121, 0, var121.length);
                  osrs.eo.a((new jk(var121)).p());
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.ai) {
                  var12 = var5.I();
                  var6 = var5.c();
                  var68 = jD.a.b(var12);
                  if (var6 != var68.at || var6 == -1) {
                     var68.at = var6;
                     var68.bz = 0;
                     var68.bQ = 0;
                     osrs.gs.a(var68);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bo) {
                  var9 = (var71 = jk.a((jk)var5, (byte)-50)) >> 2;
                  var10 = var71 & 3;
                  var11 = W[var9];
                  var12 = (var62 = var5.J()) >> 16;
                  var6 = var62 >> 8 & 255;
                  var70 = var12 + (var62 >> 4 & 7);
                  var63 = var6 + (var62 & 7);
                  var18 = var5.d();
                  if (var70 >= 0 && var70 < 103 && var63 >= 0 && var63 < 103) {
                     osrs.eg.a(var70, var63, var9, var10, var11, var18);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aI) {
                  var12 = var5.d();
                  var6 = var5.d();
                  osrs.ac.a(var12, var6);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bG) {
                  var12 = var2.e + var5.c;
                  if ((var6 = var5.d()) == 65535) {
                     var6 = -1;
                  }

                  var62 = var5.d();
                  if (var6 != cc) {
                     cc = var6;
                     a(var3, false, 1328360177);
                     osrs.ch.a(cc);
                     osrs.bf.a(cc);

                     for(var70 = 0; var70 < 100; ++var70) {
                        eE[var70] = true;
                     }
                  }

                  for(; var62-- > 0; var88.c = true) {
                     var70 = jk.d((jk)var5, 1687107415);
                     var63 = var5.d();
                     var71 = jk.a((jk)var5, (byte)-69);
                     if ((var88 = (jR)osrs.gb.a(bT, (long)var70)) != null && var63 != var88.d) {
                        osrs.gh.a(var88, true);
                        var88 = null;
                     }

                     if (var88 == null) {
                        var88 = osrs.fn.a(var70, var63, var71);
                     }
                  }

                  for(var67 = (jR)bT.a(); var67 != null; var67 = (jR)bT.c()) {
                     if (var67.c) {
                        var67.c = false;
                     } else {
                        osrs.gh.a(var67, true);
                     }
                  }

                  cy = new gb(512);

                  while(var5.c < var12) {
                     var70 = jk.d((jk)var5, 1687107415);
                     var63 = var5.d();
                     var71 = var5.d();
                     var9 = jk.d((jk)var5, 1687107415);
                     var10 = jk.d((jk)var5, 1687107415);

                     for(var11 = var63; var11 <= var71; ++var11) {
                        var49 = ((long)var70 << 32) + (long)var11;
                        cy.a((hR)(new eM(var9, var10)), var49);
                     }
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.br) {
                  var12 = jk.d((jk)var5, 1687107415);
                  var77 = jD.a.b(var12);

                  for(var62 = 0; var62 < var77.bO.length; ++var62) {
                     var77.bO[var62] = -1;
                     var77.bO[var62] = 0;
                  }

                  osrs.gs.a(var77);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.g) {
                  if (cc != -1) {
                     osrs.y.a(cc, 0);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.ar) {
                  cW = var5.G();
                  osrs.hm.a = jk.a((jk)var5, (byte)15);
                  osrs.bG.e = jk.c(var5, -499234783);

                  while(var5.c < var2.e) {
                     var12 = jk.a((jk)var5, (byte)-47);
                     osrs.cD.a(osrs.X.a()[var12]);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.B) {
                  var12 = var5.d();
                  var75 = (kc)osrs.ec.a.g.a((long)var12);
                  var70 = jk.a((jk)var5, (byte)9);
                  var62 = jk.a((jo)var5, (byte)7);
                  var6 = jk.d((jk)var5, 1687107415);
                  if (var75 != null) {
                     var75.a(var70, var62, var6 >> 16, var6 & '\uffff');
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.Q) {
                  var76 = var5.p();
                  var33 = (long)var5.d();
                  var35 = (long)var5.f();
                  fw var120 = (fw)osrs.aU.a(osrs.eb.a(), jk.a((jk)var5, (byte)-58));
                  var45 = var35 + (var33 << 32);
                  var72 = false;

                  for(var18 = 0; var18 < 100; ++var18) {
                     if (var45 == hk[var18]) {
                        var72 = true;
                        break;
                     }
                  }

                  if (osrs.cN.a(jE.b, new jw(var76, osrs.gR.c), 342185015)) {
                     var72 = true;
                  }

                  if (!var72 && av == 0) {
                     hk[he] = var45;
                     he = (he + 1) % 100;
                     var61 = osrs.gw.c(osrs.cX.a(osrs.aB.b(var5)));
                     byte var116;
                     if (var120.E) {
                        var116 = 7;
                     } else {
                        var116 = 3;
                     }

                     if (var120.F != -1) {
                        osrs.fu.a(var116, osrs.cx.d(var120.F) + var76, var61);
                     } else {
                        osrs.fu.a(var116, var76, var61);
                     }
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.ay) {
                  var12 = jk.c(var5, (byte)-46);
                  var6 = jk.b(var5, (byte)-68);
                  if ((var68 = jD.a.b(var12)).ap != 6 || var6 != var68.aq) {
                     var68.ap = 6;
                     var68.aq = var6;
                     osrs.gs.a(var68);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.R) {
                  dO var119;
                  (var119 = new dO()).g = var5.p();
                  var119.k = var5.d();
                  var6 = jk.d((jk)var5, 1687107415);
                  var119.i = var6;
                  if (var119.c()) {
                     var119.j = "beta";
                     osrs.eE.a = true;
                  } else {
                     osrs.eE.a = false;
                  }

                  jT.d(45);
                  var4.a();
                  osrs.dm.a(var119);
                  var2.b = null;
                  return false;
               }

               if (var2.b == osrs.k.aj) {
                  if (var5.i()) {
                     if (osrs.gq.a == null) {
                        osrs.gq.a = new fV();
                     }
                  } else {
                     osrs.gq.a = null;
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aG) {
                  var12 = jk.f(var5, -925316505);
                  var6 = jk.a((jk)var5, (byte)-27);
                  if (var12 == 65535) {
                     var12 = -1;
                  }

                  osrs.fY.a(osrs.ai.a, var12, var6);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aV) {
                  var12 = var5.z();
                  var6 = var5.G();
                  (var68 = jD.a.b(var12)).X.a(osrs.ai.a.aV.i, var6);
                  osrs.gs.a(var68);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.au) {
                  var12 = var5.d();
                  var6 = jk.a((jk)var5, (byte)25);
                  var62 = var5.d();
                  osrs.aU.a(var12, var6, var62);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aR) {
                  var12 = var5.z();
                  var6 = jk.c((jo)var5, (byte)66);
                  (var68 = jD.a.b(var12)).X.d(var6);
                  osrs.gs.a(var68);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aM) {
                  osrs.dr.f();
                  var8 = var5.B();
                  ai var118 = new ai(var5);
                  aP var113;
                  if (var8 >= 0) {
                     var113 = aP[var8];
                  } else {
                     var113 = osrs.bt.d;
                  }

                  if (var113 == null) {
                     C(var8);
                     var2.b = null;
                     return true;
                  }

                  if (var118.c > var113.u) {
                     C(var8);
                     var2.b = null;
                     return true;
                  }

                  if (var118.c < var113.u) {
                     var2.b = null;
                     return true;
                  }

                  var118.a(var113);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.ah) {
                  osrs.cN.a(jE.b, (byte)-85);
                  ep = bU * 733503027;
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aN) {
                  osrs.ec.b = (eL)osrs.aU.a(osrs.ff.a(), jk.a((jk)var5, (byte)-29));
                  gm = var5.c();
                  as = var5.d();
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.k) {
                  for(var12 = 0; var12 < osrs.az.c; ++var12) {
                     if (osrs.cN.a(var12) != null) {
                        osrs.ej.b[var12] = 0;
                        osrs.ej.d[var12] = 0;
                        k(var12);
                     }
                  }

                  osrs.ah.d();
                  es += 32;
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bi) {
                  var72 = jk.a((jk)var5, (byte)-58) == 1;
                  var6 = jk.d((jk)var5, 1687107415);
                  (var68 = jD.a.b(var6)).a(osrs.ai.a.aV, var72);
                  osrs.gs.a(var68);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aY) {
                  osrs.eP.d = null;
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.an) {
                  var12 = jk.f(var5, -618053273);
                  var6 = jk.b(var5, (byte)-5);
                  var62 = jk.a((jo)var5, (byte)7);
                  var70 = jk.a((jo)var5, (byte)7);
                  osrs.ce.a(var12, var6, var62, var70);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.as) {
                  osrs.aA.a = var5.i();
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.w) {
                  osrs.bt.a(var12 = jk.b(var5, (byte)-80));
                  eA[++et - 1 & 31] = var12 & 32767;
                  K(et + 1 - 1 & 31);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bv) {
                  osrs.cD.a(osrs.dR.k);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.ab) {
                  ke.b = jk.a((jk)var5, (byte)7);
                  jG.aC = jk.a((jk)var5, (byte)-11);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.D) {
                  cu = true;
                  gH = false;
                  eZ = true;
                  ki.f = jk.a((jk)var5, (byte)-36);
                  osrs.ah.g = jk.a((jk)var5, (byte)-25);
                  osrs.hj.d = var5.d();
                  var12 = var5.d();
                  var6 = jk.a((jk)var5, (byte)82);
                  var62 = osrs.ew.a(ki.f);
                  var70 = osrs.ew.a(osrs.ah.g);
                  var63 = osrs.bW.a(osrs.aM.a, var62, var70, osrs.aM.a.m) - osrs.hj.d;
                  var71 = var62 - osrs.l.d;
                  var9 = var63 - jD.b;
                  double var117 = Math.sqrt((double)((var10 = var70 - osrs.fk.b) * var10 + var71 * var71));
                  var13 = osrs.ac.a((int)(Math.atan2((double)var9, var117) * 325.9490051269531D) & 2047);
                  var14 = osrs.hc.a((int)(Math.atan2((double)var71, (double)var10) * -325.9490051269531D) & 2047);
                  eT = new id(osrs.dB.a, var13, var12, var6);
                  eW = new id(osrs.gv.a, var14, var12, var6);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.ak) {
                  var12 = jk.a((jk)var5, (byte)31);
                  var6 = jk.a((jk)var5, (byte)74);
                  var62 = jk.a((jk)var5, (byte)-9);
                  var70 = jk.a((jk)var5, (byte)-11);
                  eV[var12] = true;
                  H(var12);
                  eY[var12] = var6;
                  fq[var12] = var62;
                  fn[var12] = var70;
                  fk[var12] = 0;
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bE) {
                  var12 = jk.c(var5, (byte)-52);
                  var6 = jk.c(var5, (byte)-21);
                  if ((var62 = var5.d()) == 65535) {
                     var62 = -1;
                  }

                  var70 = jk.d((jk)var5, 1687107415);
                  if ((var63 = var5.d()) == 65535) {
                     var63 = -1;
                  }

                  for(var71 = var63; var71 <= var62; ++var71) {
                     var45 = ((long)var70 << 32) + (long)var71;
                     if ((var73 = osrs.gb.a(cy, var45)) != null) {
                        osrs.gk.a(var73);
                     }

                     cy.a((hR)(new eM(var12, var6)), var45);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.ad) {
                  var12 = var5.c();
                  hO var115 = (hO)osrs.aU.a(osrs.bL.b(), jk.a((jk)var5, (byte)-33));
                  hK var112 = (hK)osrs.aU.a(osrs.av.a(), jk.a((jk)var5, (byte)-40));
                  if (var12 == -2) {
                     ag.a(var115, var112);
                  } else {
                     ag.a(var12, var115, var112);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.L) {
                  osrs.r.a(true, var2.i);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.q) {
                  var12 = var5.I();
                  var6 = var5.z();
                  jR var114 = (jR)osrs.gb.a(bT, (long)var12);
                  if ((var67 = (jR)osrs.gb.a(bT, (long)var6)) != null) {
                     osrs.gh.a(var67, var114 == null || var114.d != var67.d);
                  }

                  if (var114 != null) {
                     osrs.gk.a(var114);
                     bT.a((hR)var114, (long)var6);
                  }

                  if ((var74 = jD.a.b(var12)) != null) {
                     osrs.gs.a(var74);
                  }

                  if ((var74 = jD.a.b(var6)) != null) {
                     osrs.gs.a(var74);
                     osrs.aP.a(jD.a.c[var74.m >>> 16], var74, true, (byte)3);
                  }

                  if (cc != -1) {
                     osrs.y.a(cc, 1);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.A) {
                  osrs.cD.a(osrs.dR.f);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aZ) {
                  cu = true;
                  gH = false;
                  eZ = true;
                  var12 = var5.c();
                  var62 = osrs.ac.a(var5.c() + osrs.dB.a & 2027);
                  var70 = var12 + osrs.gv.a;
                  var63 = var5.d();
                  var71 = jk.a((jk)var5, (byte)-35);
                  eT = new id(osrs.dB.a, var62, var63, var71);
                  eW = new id(osrs.gv.a, var70, var63, var71);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.S) {
                  ++bA;
                  E();
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aq) {
                  if ((cF = jk.a((jk)var5, (byte)3)) == 1) {
                     cI = var5.d();
                  }

                  if (cF >= 2 && cF <= 6) {
                     if (cF == 2) {
                        cC = 64;
                        cL = 64;
                     }

                     if (cF == 3) {
                        cC = 0;
                        cL = 64;
                     }

                     if (cF == 4) {
                        cC = 128;
                        cL = 64;
                     }

                     if (cF == 5) {
                        cC = 64;
                        cL = 0;
                     }

                     if (cF == 6) {
                        cC = 64;
                        cL = 128;
                     }

                     cF = 2;
                     cB = var5.d();
                     cN = var5.d();
                     cE = jk.a((jk)var5, (byte)5);
                  }

                  if (cF == 10) {
                     cJ = var5.d();
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aW) {
                  osrs.cD.a(osrs.dR.d);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.G) {
                  var76 = var5.p();
                  var6 = jk.c(var5, (byte)-40);
                  var68 = jD.a.b(var6);
                  if (!var76.equals(var68.aC)) {
                     var68.aC = var76;
                     osrs.gs.a(var68);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aU) {
                  a(var3, var2, (short)-1439);
                  return true;
               }

               if (var2.b == osrs.k.l) {
                  osrs.ah.d();
                  cb = var5.c();
                  eH = bU * 733503027;
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bn) {
                  var70 = jk.c(var5, -499234783);
                  jG var111;
                  if ((var12 = jk.f(var5, -1200559773)) == au) {
                     var111 = osrs.ai.a;
                  } else {
                     var111 = (jG)osrs.ec.a.e.a((long)var12);
                  }

                  var6 = jk.f(var5, -1825770326);
                  var62 = var5.I();
                  if (var111 != null) {
                     var111.a(var70, var6, var62 >> 16, var62 & '\uffff');
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.aL) {
                  cu = true;
                  gH = false;
                  fa = false;
                  hE.r = jk.a((jk)var5, (byte)-47);
                  osrs.cB.a = jk.a((jk)var5, (byte)25);
                  osrs.cq.a = var5.d();
                  osrs.ag.a = jk.a((jk)var5, (byte)-17);
                  if ((osrs.cP.b = jk.a((jk)var5, (byte)78)) >= 100) {
                     osrs.l.d = osrs.ew.a(hE.r);
                     osrs.fk.b = osrs.ew.a(osrs.cB.a);
                     jD.b = osrs.bW.a(osrs.aM.a, osrs.l.d, osrs.fk.b, osrs.aM.a.m) - osrs.cq.a;
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.x) {
                  osrs.cD.a(osrs.dR.j);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.av) {
                  var12 = var5.G();
                  var6 = jk.a((jk)var5, (byte)2);
                  var61 = var5.p();
                  if (var6 > 0 && var6 <= 8) {
                     if (var61.equalsIgnoreCase("null")) {
                        var61 = null;
                     }

                     dB[var6 - 1] = var61;
                     r(var6 - 1);
                     ds[var6 - 1] = var12 == 0;
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.az) {
                  gH = false;
                  cu = false;
                  fa = false;
                  eZ = false;
                  ki.f = 0;
                  osrs.ah.g = 0;
                  osrs.hj.d = 0;
                  fc = false;
                  osrs.hn.b = 0;
                  jN.a = 0;
                  osrs.cP.b = 0;
                  osrs.ag.a = 0;
                  hE.r = 0;
                  osrs.cB.a = 0;
                  osrs.cq.a = 0;
                  fb = null;
                  eT = null;
                  eW = null;

                  for(var12 = 0; var12 < 5; ++var12) {
                     eV[var12] = false;
                     H(var12);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.ap) {
                  var12 = jk.d((jk)var5, 1687107415);
                  var6 = jk.d((jk)var5, 1687107415);
                  var62 = osrs.bv.a();
                  dQ var110;
                  (var110 = osrs.X.a(osrs.j.n, P.f)).g.b(var62);
                  jk.d(var110.g, osrs.fs.e);
                  var110.g.m(var12);
                  var110.g.m(var6);
                  P.a(var110);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bb) {
                  an = var5.p();
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bx) {
                  osrs.cD.a(osrs.dR.l);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bC) {
                  osrs.cD.a(osrs.dR.c);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bD) {
                  var6 = osrs.ew.c(var12 = var5.z());
                  var62 = osrs.ew.d(var12);
                  var70 = osrs.ew.b(var12);
                  var63 = var5.H();
                  var71 = jk.a((jo)var5, (byte)7);
                  var10 = osrs.ew.c(var9 = jk.c((jo)var5, (byte)29));
                  var11 = osrs.ew.d(var9);
                  var18 = osrs.ew.b(var9);
                  var13 = var5.D();
                  var14 = var5.H();
                  var15 = jk.a((jo)var5, (byte)7);
                  var12 = jk.a((jo)var5, (byte)7);
                  var16 = var5.d();
                  var17 = jk.a((jo)var5, (byte)7);
                  int var109 = jk.a((jo)var5, (byte)7);
                  if (var12 != 65535) {
                     jQ var53 = new jQ(var6, var62, var70, var71, var14, var10, var11, var18, var16, var63, var12, var15 + Z, var17 + Z, var13, var109);
                     osrs.fU.a((fU)aw, var53);
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.ao) {
                  osrs.m.a(var5.p());
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.T) {
                  osrs.ah.d();
                  var12 = jk.a((jk)var5, (byte)-55);
                  var6 = var5.I();
                  var62 = jk.c(var5, -499234783);
                  var70 = jk.a((jk)var5, (byte)15);
                  ap[var12] = var6;
                  aC[var12] = var70;
                  al[var12] = 1;
                  aK[var12] = var62;

                  for(var63 = 0; var63 < 98; ++var63) {
                     if (var6 >= osrs.fg.b[var63]) {
                        al[var12] = var63 + 2;
                     }
                  }

                  eo[++ez - 1 & 31] = var12;
                  G(ez + 1 - 1 & 31);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bq) {
                  osrs.cD.a(osrs.dR.b);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.c) {
                  int var10001 = var2.e;
                  osrs.cb.a(var5);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.W) {
                  var12 = jk.d((jk)var5, 1687107415);
                  var6 = var5.d();
                  if (var12 < -70000) {
                     var6 += 32768;
                  }

                  if (var12 >= 0) {
                     var68 = jD.a.b(var12);
                  } else {
                     var68 = null;
                  }

                  for(; var5.c < var2.e; osrs.P.a(var6, var70, var63 - 1, var71)) {
                     var70 = jk.a((jk)var5, (int)762721580);
                     var63 = var5.d();
                     var71 = 0;
                     if (var63 != 0 && (var71 = jk.a((jk)var5, (byte)-4)) == 255) {
                        var71 = jk.d((jk)var5, 1687107415);
                     }

                     if (var68 != null && var70 >= 0 && var70 < var68.bO.length) {
                        var68.bO[var70] = var63;
                        var68.bM[var70] = var71;
                     }
                  }

                  if (var68 != null) {
                     osrs.gs.a(var68);
                  }

                  osrs.ah.d();
                  eA[++et - 1 & 31] = var6 & 32767;
                  K(et + 1 - 1 & 31);
                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.V) {
                  var8 = var5.B();
                  var61 = var5.p();
                  long var52 = (long)var5.d();
                  long var54 = (long)var5.f();
                  fw var65 = (fw)osrs.aU.a(osrs.eb.a(), jk.a((jk)var5, (byte)2));
                  long var57 = var54 + (var52 << 32);
                  var64 = false;
                  aw var69;
                  if ((var69 = var8 >= 0 ? aG[var8] : ik.a) == null) {
                     var64 = true;
                  } else {
                     label2406: {
                        for(var14 = 0; var14 < 100; ++var14) {
                           if (var57 == hk[var14]) {
                              var64 = true;
                              break label2406;
                           }
                        }

                        if (var65.G && osrs.cN.a(jE.b, new jw(var61, osrs.gR.c), 342185015)) {
                           var64 = true;
                        }
                     }
                  }

                  if (!var64) {
                     hk[he] = var57;
                     he = (he + 1) % 100;
                     var66 = osrs.gw.c(osrs.aB.b(var5));
                     var15 = var8 >= 0 ? 41 : 44;
                     if (var65.F != -1) {
                        osrs.hx.a(var15, osrs.cx.d(var65.F) + var61, var66, var69.e);
                     } else {
                        osrs.hx.a(var15, var61, var66, var69.e);
                     }
                  }

                  var2.b = null;
                  return true;
               }

               if (var2.b == osrs.k.bl) {
                  osrs.bV.a(jk.a((jk)var5, (byte)93));
                  var2.b = null;
                  return false;
               }

               int var10000 = var2.b != null ? var2.b.bH : -1;
               iE.a(var10000 + "," + (var2.d != null ? var2.d.bH : -1) + "," + (var2.h != null ? var2.h.bH : -1) + "," + var2.e, (Throwable)null);
               osrs.eZ.a();
            } catch (IOException var59) {
               osrs.az.b();
            } catch (Exception var60) {
               var61 = (var1.b != null ? var1.b.bH : -1) + "," + (var1.d != null ? var1.d.bH : -1) + "," + (var1.h != null ? var1.h.bH : -1) + "," + var1.e + "," + (osrs.ai.a.aa[0] + osrs.aM.a.n) + "," + (osrs.ai.a.az[0] + osrs.aM.a.i) + ",";

               for(var62 = 0; var62 < var2.e && var62 < 50; ++var62) {
                  var61 = var61 + var5.d[var62] + ",";
               }

               iE.a(var61, var60);
               osrs.eZ.a();
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("qo")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1205150095"
   )
   private static void B(int var0) {
      dQ var1;
      (var1 = osrs.X.a(osrs.j.x, P.f)).g.b(var0);
      P.a(var1);
   }

   @ObfuscatedName("qp")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-319782347"
   )
   private void f(int var1, int var2) {
      MenuOpened var3;
      (var3 = new MenuOpened()).setMenuEntries(this.getMenuEntries());
      osrs.dF.c.getCallbacks().post(var3);
      dT.b(var1, var2);
      Iterator var4 = ag.iterator();

      while(var4.hasNext()) {
         boolean var5 = false;
         ((kd)var4.next()).o.a(false);
      }

      dP = true;
      gP = 0;
      N = 0;
      fe = 0;
      K = 0;
      if (dT.p > this.getCanvasHeight()) {
         gP = (dT.p - this.getCanvasHeight() + 14) / 15;
      }

      dT.a();
   }

   @ObfuscatedName("qq")
   @ObfuscatedSignature(
      signature = "(Lov;B)V",
      garbageValue = "-18"
   )
   static void a(fd var0) {
      fd var10000 = var0.v == -1 ? null : osrs.eu.a(jD.a, var0.v, var0.M, (byte)37);
      fd var1 = var10000;
      int var2;
      int var3;
      if (var10000 == null) {
         var2 = osrs.fs.h;
         var3 = osrs.fs.a;
      } else {
         var2 = var1.i * -1805166981;
         var3 = var1.n * -2133353239;
      }

      osrs.cv.a(var0, var2, var3, false);
      osrs.bO.a(var0, var2, var3);
   }

   @ObfuscatedName("qr")
   @ObfuscatedSignature(
      signature = "(IZB)Z",
      garbageValue = "117"
   )
   private static boolean a(int var0, boolean var1) {
      if ((ed && dT.h > 2 || ke.a(var0)) && !var1) {
         return true;
      } else {
         MenuShouldLeftClick var2 = new MenuShouldLeftClick();
         osrs.dF.c.getCallbacks().post(var2);
         if (var2.isForceRightClick()) {
            return true;
         } else {
            return var0 == MenuAction.RUNELITE_OVERLAY.getId() || var0 == MenuAction.RUNELITE_OVERLAY_CONFIG.getId() || var0 == MenuAction.RUNELITE_INFOBOX.getId() || var0 == MenuAction.RUNELITE_LOW_PRIORITY.getId();
         }
      }
   }

   @ObfuscatedName("qt")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1182729375"
   )
   private static void C(int var0) {
      dQ var1;
      (var1 = osrs.X.a(osrs.j.W, P.f)).g.b(var0);
      P.a(var1);
   }

   @ObfuscatedName("qx")
   private void ae() {
      String var19;
      String var31;
      if (osrs.aN.a == osrs.cY.p && !gR) {
         if (this.fx.isRuneLiteClientOutdated()) {
            String var36 = "";
            var19 = "Please restart your client.";
            var31 = "RuneLite has been updated!";
            osrs.dY.a("RuneLite has been updated!", var19, var36);
            jB.l = 6;
            this.setGameState(GameState.LOGIN_SCREEN);
         } else {
            gR = true;
         }
      } else {
         client var1 = this;
         Object var2 = P.m;
         jo var3 = P.i;

         try {
            if (osrs.cY.p == osrs.aN.a) {
               if (iu.a == null && (gJ.a() || bK > 250)) {
                  iu.a = gJ.b();
                  hP.a(gJ, 1768744173);
                  gJ = null;
               }

               if (iu.a != null) {
                  if (var2 != null) {
                     ((hw)var2).a();
                     var2 = null;
                  }

                  jL.a = null;
                  gM = false;
                  bK = 0;
                  if (af.b()) {
                     if (n()) {
                        try {
                           var1.d(osrs.ar.c);
                           osrs.dc.a(osrs.cY.x);
                        } catch (Throwable var16) {
                           iE.a((String)null, var16);
                           osrs.gG.a(65);
                           return;
                        }
                     } else {
                        if (!o()) {
                           osrs.gG.a(65);
                           return;
                        }

                        try {
                           var1.a(osrs.u.a, osrs.cw.a);
                           osrs.dc.a(osrs.cY.s);
                        } catch (Exception var15) {
                           iE.a((String)null, var15);
                           osrs.gG.a(65);
                           return;
                        }
                     }
                  } else {
                     osrs.dc.a(osrs.cY.j);
                  }
               }
            }

            ac var4;
            if (osrs.aN.a == osrs.cY.x) {
               if (var1.hC != null) {
                  if (!var1.hC.isDone()) {
                     return;
                  }

                  if (var1.hC.isCancelled()) {
                     osrs.gG.a(65);
                     var1.hC = null;
                     return;
                  }

                  try {
                     d var5;
                     if (!(var5 = (d)var1.hC.get()).a()) {
                        osrs.gG.a(65);
                        var1.hC = null;
                        return;
                     }

                     gL = var5.c();
                     osrs.ar.c = var5.b();
                     ah();
                     var1.hC = null;
                  } catch (Exception var14) {
                     iE.a((String)null, var14);
                     osrs.gG.a(65);
                     var1.hC = null;
                     return;
                  }
               } else {
                  if (var1.hs == null) {
                     osrs.gG.a(65);
                     return;
                  }

                  if (!var1.hs.a()) {
                     return;
                  }

                  if (osrs.fr.a(var1.hs, -2060426607)) {
                     iE.a(var1.hs.a, (Throwable)null);
                     osrs.gG.a(65);
                     var1.hs = null;
                     return;
                  }

                  if ((var4 = var1.hs.b()).c != 200) {
                     osrs.gG.a(65);
                     var1.hs = null;
                     return;
                  }

                  bK = 0;
                  ig var20 = new ig(osrs.ac.a((ac)var4, (byte)61));

                  try {
                     gL = var20.a.getString("access_token");
                     osrs.ar.c = var20.a.getString("refresh_token");
                     ah();
                  } catch (Exception var13) {
                     iE.a("Error parsing tokens", var13);
                     osrs.gG.a(65);
                     var1.hs = null;
                     return;
                  }
               }

               a(var1, gL, -405727278);
               osrs.dc.a(osrs.cY.s);
            }

            if (osrs.aN.a == osrs.cY.s) {
               if (var1.hx != null) {
                  if (!var1.hx.isDone()) {
                     return;
                  }

                  if (var1.hx.isCancelled()) {
                     osrs.gG.a(65);
                     var1.hx = null;
                     return;
                  }

                  try {
                     b var22;
                     if (!(var22 = (b)var1.hx.get()).a()) {
                        osrs.gG.a(65);
                        var1.hx = null;
                        return;
                     }

                     var1.hw = var22.b();
                     var1.hx = null;
                  } catch (Exception var12) {
                     iE.a((String)null, var12);
                     osrs.gG.a(65);
                     var1.hx = null;
                     return;
                  }
               } else {
                  if (var1.hy == null) {
                     osrs.gG.a(65);
                     return;
                  }

                  if (!var1.hy.a()) {
                     return;
                  }

                  if (osrs.fr.a(var1.hy, 231513112)) {
                     iE.a(var1.hy.a, (Throwable)null);
                     osrs.gG.a(65);
                     var1.hy = null;
                     return;
                  }

                  if ((var4 = var1.hy.b()).c != 200) {
                     iE.a("Login authentication error. Response code: " + var4.c + " " + var4.a + " Response body: " + osrs.ac.a((ac)var4, (byte)1), (Throwable)null);
                     osrs.gG.a(65);
                     var1.hy = null;
                     return;
                  }

                  List var23;
                  if ((var23 = (List)var4.b.get("Content-Type")) != null && var23.contains(if.a.b)) {
                     try {
                        JSONObject var18 = new JSONObject(osrs.ac.a((ac)var4, (byte)123));
                        var1.hw = var18.getString("token");
                     } catch (JSONException var11) {
                        iE.a((String)null, var11);
                        osrs.gG.a(65);
                        var1.hy = null;
                        return;
                     }
                  } else {
                     var1.hw = osrs.ac.a((ac)var4, (byte)104);
                  }

                  var1.hy = null;
               }

               bK = 0;
               osrs.dc.a(osrs.cY.j);
            }

            int var24;
            if (osrs.cY.j == osrs.aN.a) {
               if (jL.a == null) {
                  var24 = osrs.cb.b;
                  var19 = osrs.cR.a;
                  jL.a = osrs.fs.g.a(1, var24, var19);
               }

               if (jL.a.f == 2) {
                  throw new IOException();
               }

               if (jL.a.f == 1) {
                  var2 = osrs.fn.a((Socket)jL.a.d, 40000, 5000);
                  P.m = (hw)var2;
                  jL.a = null;
                  osrs.dc.a(osrs.cY.n);
               }
            }

            dQ var26;
            if (osrs.aN.a == osrs.cY.n) {
               kg.a(P, (byte)115);
               (var26 = osrs.cU.c()).e = null;
               var26.f = 0;
               var26.g = new jo(5000);
               var26.g.b(osrs.dU.g.j);
               P.a(var26);
               P.b();
               var3.c = 0;
               osrs.dc.a(osrs.cY.i);
            }

            int var21;
            if (osrs.aN.a == osrs.cY.i) {
               if (jD.c != null) {
                  jD.c.f = true;
               }

               if (((hw)var2).a(1)) {
                  var21 = ((hw)var2).b();
                  if (jD.c != null) {
                     jD.c.f = true;
                  }

                  if (var21 != 0) {
                     osrs.gG.a(var21);
                     return;
                  }

                  var3.c = 0;
                  osrs.dc.a(osrs.cY.l);
               }
            }

            if (osrs.cY.l == osrs.aN.a) {
               if (var3.c < 8) {
                  if ((var21 = ((hw)var2).c()) > 8 - var3.c) {
                     var21 = 8 - var3.c;
                  }

                  if (var21 > 0) {
                     ((hw)var2).b(var3.d, var3.c, var21);
                     var3.c += var21;
                  }
               }

               if (var3.c == 8) {
                  var3.c = 0;
                  osrs.aP.b = var3.e();
                  osrs.dc.a(osrs.cY.c);
               }
            }

            if (osrs.cY.c == osrs.aN.a) {
               P.i.c = 0;
               kg.a(P, (byte)120);
               jo var28 = new jo(500);
               int[] var6 = new int[]{iu.a.nextInt(), iu.a.nextInt(), iu.a.nextInt(), iu.a.nextInt()};
               var28.c = 0;
               var28.b(1);
               var28.c(var6[0]);
               var28.c(var6[1]);
               var28.c(var6[2]);
               var28.c(var6[3]);
               var28.a(osrs.aP.b);
               if (aa == 40) {
                  var28.c(gN[0]);
                  var28.c(gN[1]);
                  var28.c(gN[2]);
                  var28.c(gN[3]);
               } else {
                  if (aa == 50) {
                     var28.b(osrs.as.c.f);
                     var28.c(osrs.W.a);
                  } else {
                     var28.b(ab.f);
                     switch(ab.g) {
                     case 0:
                     case 4:
                        var28.j(jV.b);
                        ++var28.c;
                        break;
                     case 1:
                        var28.c(osrs.j.aS.c(jB.e));
                        break;
                     case 2:
                        var28.c += 4;
                     case 3:
                     }
                  }

                  if (af.b()) {
                     var28.b(iS.a.d);
                     jk.a(var28, (String)var1.hw, -1559098139);
                  } else {
                     var28.b(iS.b.d);
                     jk.a(var28, (String)jB.d, -1559098139);
                  }
               }

               var28.a(osrs.fD.b, osrs.fD.a);
               gN = var6;
               dQ var27;
               (var27 = osrs.cU.c()).e = null;
               var27.f = 0;
               var27.g = new jo(5000);
               var27.g.c = 0;
               if (aa == 40) {
                  var27.g.b(osrs.dU.b.j);
               } else {
                  var27.g.b(osrs.dU.f.j);
               }

               var27.g.d(0);
               int var7 = var27.g.c;
               var27.g.c(231);
               var27.g.c(1);
               var27.g.b(br);
               var27.g.b(bz);
               var27.g.b(0);
               var27.g.a((byte[])var28.d, 0, (int)var28.c);
               var24 = var27.g.c;
               jk.a(var27.g, (String)jB.e, -1559098139);
               var27.g.b((aT ? 1 : 0) << 1 | (bv ? 1 : 0));
               var27.g.d(osrs.fs.h);
               var27.g.d(osrs.fs.a);
               osrs.ep.a(var27.g);
               jk.a(var27.g, (String)osrs.gh.g, -1559098139);
               var27.g.c(osrs.ah.f);
               var27.g.b(0);
               jk var8 = new jk(hV.a(osrs.df.b, 734745187));
               osrs.df.b.a(var8);
               var27.g.a((byte[])var8.d, 0, (int)var8.d.length);
               var27.g.b(br);
               var27.g.c(0);
               if (osrs.eE.a) {
                  var27.g.c(osrs.fW.c.l);
                  jk.a((jo)var27.g, osrs.fk.a.l, (byte)41);
                  var27.g.m(osrs.dE.a.l);
                  var27.g.m(osrs.el.a.l);
                  var27.g.m(ka.a.l);
                  jk.h(var27.g, osrs.ar.b.l);
                  var27.g.c(osrs.bs.i.l);
               } else {
                  osrs.hv.a(var27);
               }

               var27.g.a(var6, var24, var27.g.c);
               var27.g.i(var27.g.c - var7);
               P.a(var27);
               P.b();
               P.f = new jf(var6);
               int[] var29 = new int[4];

               for(var24 = 0; var24 < 4; ++var24) {
                  var29[var24] = var6[var24] + 50;
               }

               jo.a(var3, var29, (byte)26);
               osrs.dc.a(osrs.cY.a);
               User var34;
               (var34 = new User()).setUsername(osrs.i.b(jB.e));
               Sentry.getGlobalScope().setUser(var34);
            }

            boolean var25;
            if (osrs.cY.a == osrs.aN.a && ((hw)var2).c() > 0) {
               if ((var21 = ((hw)var2).b()) == 61) {
                  if (((hw)var2).c() == 1 && ((hw)var2).b() == 1) {
                     var25 = true;
                  } else {
                     var25 = false;
                  }

                  osrs.gf.a = var25;
                  osrs.dc.a(osrs.cY.c);
               }

               if (var21 == 21 && aa == 20) {
                  osrs.dc.a(osrs.cY.d);
               } else if (var21 == 2) {
                  if (osrs.eE.a) {
                     osrs.dc.a(osrs.cY.b);
                  } else {
                     osrs.dc.a(osrs.cY.k);
                  }
               } else if (var21 == 15 && aa == 40) {
                  P.e = -1;
                  osrs.dc.a(osrs.cY.o);
               } else if (var21 == 64) {
                  osrs.dc.a(osrs.cY.u);
               } else if (var21 == 23 && bM <= 0) {
                  ++bM;
                  osrs.dc.a(osrs.cY.p);
               } else if (var21 == 29) {
                  osrs.dc.a(osrs.cY.e);
               } else {
                  if (var21 != 69) {
                     osrs.gG.a(var21);
                     return;
                  }

                  osrs.dc.a(osrs.cY.m);
               }
            }

            if (osrs.cY.b == osrs.aN.a) {
               osrs.dn.a = true;
               jR.a(iF.l);
               jT.d(0);
            }

            if (osrs.aN.a == osrs.cY.m && ((hw)var2).c() >= 2) {
               ((hw)var2).b(var3.d, 0, 2);
               var3.c = 0;
               osrs.eD.c = var3.d();
               osrs.dc.a(osrs.cY.h);
            }

            if (osrs.aN.a == osrs.cY.h && ((hw)var2).c() >= osrs.eD.c) {
               var3.c = 0;
               ((hw)var2).b(var3.d, var3.c, osrs.eD.c);
               l var30 = osrs.cZ.a()[jk.a((jk)var3, (byte)45)];

               try {
                  switch(var30.f) {
                  case 0:
                     am var32 = new am();
                     var1.hA = new I(var3, var32);
                     osrs.dc.a(osrs.cY.g);
                     break;
                  default:
                     throw new IllegalArgumentException();
                  }
               } catch (Exception var10) {
                  osrs.gG.a(22);
                  return;
               }
            }

            if (osrs.aN.a == osrs.cY.g && var1.hA.c()) {
               var1.hB = var1.hA.b();
               var1.hA.a();
               var1.hA = null;
               if (var1.hB == null) {
                  osrs.gG.a(22);
                  return;
               }

               kg.a(P, (byte)118);
               (var26 = osrs.cU.c()).e = null;
               var26.f = 0;
               var26.g = new jo(5000);
               var26.g.b(osrs.dU.d.j);
               var26.g.d(var1.hB.c);
               var26.g.a(var1.hB);
               P.a(var26);
               P.b();
               var1.hB = null;
               osrs.dc.a(osrs.cY.a);
            }

            if (osrs.cY.u == osrs.aN.a && ((hw)var2).c() > 0) {
               osrs.dY.a = ((hw)var2).b();
               osrs.dc.a(osrs.cY.r);
            }

            if (osrs.aN.a == osrs.cY.r && ((hw)var2).c() >= osrs.dY.a) {
               ((hw)var2).b(var3.d, 0, osrs.dY.a);
               var3.c = 0;
               osrs.dc.a(osrs.cY.a);
            }

            if (osrs.cY.d == osrs.aN.a && ((hw)var2).c() > 0) {
               gB = (((hw)var2).b() + 3) * 60;
               osrs.dc.a(osrs.cY.f);
            }

            if (osrs.aN.a == osrs.cY.f) {
               bK = 0;
               osrs.dY.a("You have only just left another world.", "Your profile will be transferred in:", gB / 60 + " seconds.");
               if (--gB <= 0) {
                  osrs.dc.a(osrs.cY.p);
                  return;
               }
            } else {
               if (osrs.aN.a == osrs.cY.q) {
                  (var26 = osrs.cU.c()).e = null;
                  var26.f = 0;
                  var26.g = new jo(5000);
                  var26.g.b(osrs.dU.e.j);
                  var26.g.d(osrs.dU.e.k);
                  var26.g.c(osrs.bI.b.l);
                  var26.g.c(0);
                  jk.h(var26.g, ij.c.l);
                  jk.a(var26.g, osrs.et.a.l, (byte)-65);
                  var26.g.m(osrs.bn.d.l);
                  var26.g.m(osrs.ex.a.l);
                  var26.g.c(osrs.cY.A.l);
                  var26.g.c(osrs.r.a.l);
                  var26.g.c(osrs.z.a.l);
                  jk.h(var26.g, osrs.ec.c.l);
                  var26.g.c(osrs.df.a.l);
                  var26.g.c(osrs.fD.c.l);
                  var26.g.c(osrs.fJ.y.l);
                  jk.h(var26.g, osrs.bB.c.l);
                  jk.h(var26.g, osrs.fl.a.l);
                  var26.g.m(osrs.bS.a.l);
                  P.a(var26);
                  P.b();
                  osrs.dc.a(osrs.cY.k);
                  return;
               }

               if (osrs.cY.k == osrs.aN.a && ((hw)var2).c() > 0) {
                  if ((osrs.fo.a = ((hw)var2).b()) != osrs.dU.a.k) {
                     osrs.gG.a(osrs.fo.a);
                     return;
                  }

                  osrs.dc.a(osrs.cY.y);
               }

               if (osrs.cY.y == osrs.aN.a && ((hw)var2).c() >= osrs.fo.a) {
                  var25 = ((hw)var2).b() == 1;
                  ((hw)var2).b(var3.d, 0, 4);
                  var3.c = 0;
                  if (var25) {
                     var24 = var3.Q() << 24 | var3.Q() << 16 | var3.Q() << 8 | var3.Q();
                     osrs.j.aS.a(jB.e, var24);
                  }

                  if (ah) {
                     osrs.j.aS.a(jB.e);
                  } else {
                     osrs.j.aS.a((String)null);
                  }

                  ki.a();
                  bX = ((hw)var2).b();
                  ca = ((hw)var2).b() == 1;
                  au = (au = (au = ((hw)var2).b()) << 8) + ((hw)var2).b();
                  am = ((hw)var2).b();
                  ((hw)var2).b(var3.d, 0, 8);
                  var3.c = 0;
                  var1.hz = var3.e();
                  var1.Y();
                  ((hw)var2).b(var3.d, 0, 8);
                  var3.c = 0;
                  dE = var3.e();
                  ((hw)var2).b(var3.d, 0, 8);
                  var3.c = 0;
                  dG = var3.e();
                  osrs.be.a().a(var1.fy);
                  osrs.dc.a(osrs.cY.w);
               }

               if (osrs.cY.w == osrs.aN.a && ((hw)var2).c() >= P.e) {
                  ((hw)var2).b(var3.d, 0, 1);
                  var3.c = 0;
                  if (var3.O()) {
                     ((hw)var2).b(var3.d, 1, 1);
                     var3.c = 0;
                  }

                  k[] var33 = osrs.cQ.a();
                  if ((var24 = var3.N()) < 0 || var24 >= var33.length) {
                     throw new IOException("Invalid ServerProt: " + var24 + " at " + var3.c);
                  }

                  P.b = var33[var24];
                  kg var10000 = P;
                  var10000.e = var10000.b.bI;
                  ((hw)var2).b(var3.d, 0, 2);
                  var3.c = 0;
                  P.e = var3.d();

                  try {
                     osrs.cC.a(osrs.dF.c, "zap");
                  } catch (Throwable var9) {
                  }

                  osrs.dc.a(osrs.cY.t);
               }

               if (osrs.cY.t == osrs.aN.a) {
                  if (((hw)var2).c() >= P.e) {
                     var3.c = 0;
                     ((hw)var2).b(var3.d, 0, P.e);
                     cO.a();
                     osrs.l.c();
                     ax.a(var3);
                     as = au;
                     osrs.ec.b = osrs.eL.d;
                     gm = -1;
                     osrs.bp.a = -1;
                     osrs.r.a(false, var3);
                     P.b = null;
                     cw = false;
                     return;
                  }
               } else {
                  if (osrs.aN.a == osrs.cY.e && ((hw)var2).c() >= 2) {
                     var3.c = 0;
                     ((hw)var2).b(var3.d, 0, 2);
                     var3.c = 0;
                     ik.b = var3.d();
                     osrs.dc.a(osrs.cY.v);
                  }

                  if (osrs.cY.v == osrs.aN.a && ((hw)var2).c() >= ik.b) {
                     var3.c = 0;
                     ((hw)var2).b(var3.d, 0, ik.b);
                     var3.c = 0;
                     String var35 = var3.p();
                     var19 = var3.p();
                     var31 = var3.p();
                     osrs.dY.a(var35, var19, var31);
                     jT.d(10);
                     if (af.b()) {
                        jW.a(9);
                     }
                  }

                  if (osrs.cY.o == osrs.aN.a) {
                     if (P.e == -1) {
                        if (((hw)var2).c() < 2) {
                           return;
                        }

                        ((hw)var2).b(var3.d, 0, 2);
                        var3.c = 0;
                        P.e = var3.d();
                     }

                     if (((hw)var2).c() >= P.e) {
                        ((hw)var2).b(var3.d, 0, P.e);
                        var3.c = 0;
                        var21 = P.e;
                        osrs.fp.a(cO, (byte)16);
                        jO.a();
                        ax.a(var3);
                        if (var21 != var3.c) {
                           throw new RuntimeException();
                        }
                     }
                  } else if (++bK > 2000) {
                     if (bM <= 0) {
                        if (osrs.gO.b == osrs.cb.b) {
                           osrs.cb.b = osrs.er.a;
                        } else {
                           osrs.cb.b = osrs.gO.b;
                        }

                        ++bM;
                        osrs.dc.a(osrs.cY.p);
                        return;
                     }

                     osrs.gG.a(-3);
                  }
               }
            }

         } catch (IOException var17) {
            if (bM <= 0) {
               if (osrs.gO.b == osrs.cb.b) {
                  osrs.cb.b = osrs.er.a;
               } else {
                  osrs.cb.b = osrs.gO.b;
               }

               ++bM;
               osrs.dc.a(osrs.cY.p);
            } else {
               osrs.gG.a(-2);
            }
         }
      }
   }

   @ObfuscatedName("rb")
   @ObfuscatedSignature(
      signature = "(I)Lhy;"
   )
   public static bw h(int var0) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return osrs.dO.a(var0);
      }
   }

   public final boolean isWidgetSelected() {
      return dU;
   }

   public final EnumSet getWorldType() {
      return WorldType.fromMask(aY);
   }

   public final int getMusicVolume() {
      return osrs.j.aS.n;
   }

   public final void playSoundEffect(int var1, int var2, int var3, int var4, int var5) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         var2 = ((var2 & 255) << 16) + ((var3 & 255) << 8) + (var4 & 255);
         jC.h[jC.c] = var1;
         jC.a[jC.c] = 1;
         jC.b[jC.c] = var5;
         jC.f[jC.c] = null;
         jC.g[jC.c] = var2;
         jC.i[jC.c] = 0;
         gl = ++jC.c;
      }
   }

   public final void openWorldHopper() {
      int var1 = MenuAction.CC_OP.getId();
      String var2 = "";
      String var3 = "World Switcher";
      osrs.fw.a(-1, 11927555, var1, 1, -1, -1, var3, var2, -1, -1);
   }

   public final int getVarbitValue(int var1) {
      return this.getVarbitValue(osrs.ej.d, var1);
   }

   @ObfuscatedSignature(
      signature = "(Lnet/runelite/api/ChatMessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lnet/runelite/api/MessageNode;",
      garbageValue = "1"
   )
   public final MessageNode addChatMessage(ChatMessageType var1, String var2, String var3, String var4, boolean var5) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         ChatMessageType var10 = var1;
         String var6 = var3;
         if (var1 == ChatMessageType.CLAN_GIM_CHAT) {
            var10 = ChatMessageType.CLAN_CHAT;
            var6 = "|" + var3;
         } else if (var1 == ChatMessageType.CLAN_GIM_MESSAGE) {
            var10 = ChatMessageType.CLAN_MESSAGE;
            var6 = "|" + var3;
         }

         int var7 = var10.getType();
         iu var8;
         if ((var8 = (iu)ki.d.get(var7)) == null) {
            var8 = new iu();
            ki.d.put(var7, var8);
         }

         dj var12 = var8.a(var7, var2, var6, var4);
         ki.b.b(var12, (long)var12.i);
         ki.c.a((im)var12);
         ce = bU * 733503027;
         if (cV.isDebugEnabled()) {
            cV.debug("Chat message type {}: {}", var1.name(), var3);
         }

         MessageNode var11 = ((iu)osrs.dF.c.getChatLineMap().get(var10.getType())).getLines()[0];
         ChatMessage var9 = new ChatMessage(var11, var1, var2, var3, var4, var11.getTimestamp());
         osrs.dF.c.getCallbacks().post(var9);
         return var11;
      }
   }

   public final int[] getBoostedSkillLevels() {
      return aC;
   }

   public final int[] getSkillExperiences() {
      return ap;
   }

   public final int[] getRealSkillLevels() {
      return al;
   }

   public final Map getVarcMap() {
      return osrs.eq.a.b;
   }

   public final int getTopLevelInterfaceId() {
      return cc;
   }

   public final int getHintArrowType() {
      return cF;
   }

   public final boolean isStretchedEnabled() {
      return fU;
   }

   public final void setVarbitValue(int[] var1, int var2, int var3) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (var2 >= 0 && var2 < fX.length) {
         int var4;
         if ((var4 = fX[var2]) == 0) {
            throw new IndexOutOfBoundsException("Varbit " + var2 + " does not exist");
         } else {
            var2 = var4 >> 16;
            int var5 = var4 & 255;
            var4 = var4 >> 8 & 255;
            var4 = osrs.ej.a[var4 - var5];
            var1[var2] = var1[var2] & ~(var4 << var5) | (var3 & var4) << var5;
         }
      } else {
         throw new IndexOutOfBoundsException("Varbit " + var2 + " does not exist");
      }
   }

   public final MenuEntry[] getMenuEntries() {
      return dT.getMenuEntries();
   }

   public final int getVarbitValue(int[] var1, int var2) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (var2 >= 0 && var2 < fX.length) {
         int var3;
         if ((var3 = fX[var2]) == 0) {
            throw new IndexOutOfBoundsException("Varbit " + var2 + " does not exist");
         } else {
            var2 = var3 >> 16;
            int var4 = var3 & 255;
            var3 = var3 >> 8 & 255;
            int var5 = var1[var2];
            var2 = osrs.ej.a[var3 - var4];
            return var5 >> var4 & var2;
         }
      } else {
         throw new IndexOutOfBoundsException("Varbit " + var2 + " does not exist");
      }
   }

   public final boolean isMenuOpen() {
      return dP;
   }

   public final int getGameCycle() {
      return Z;
   }

   public final boolean isGpu() {
      return (E & 1) == 1;
   }

   public final Callbacks getCallbacks() {
      return this.fx;
   }

   @ObfuscatedSignature(
      signature = "(Z)V",
      garbageValue = "0"
   )
   public final void invalidateStretching(boolean var1) {
      gT = null;
      gK = null;
      boolean var2 = true;
      super.s = var2;
   }

   public final int getCurrentLoginField() {
      return jB.D;
   }

   public final boolean isResized() {
      return aT;
   }

   public final GameState getGameState() {
      return GameState.of(aa);
   }

   public final Dimension getStretchedDimensions() {
      if (gK == null) {
         Container var1;
         int var2 = (var1 = this.getCanvas().getParent()).getWidth();
         int var7 = var1.getHeight();
         Dimension var3 = this.getRealDimensions();
         if (fC) {
            double var5 = var3.getWidth() / var3.getHeight();
            int var4;
            if ((var4 = (int)((double)var7 * var5)) > var2) {
               var7 = (int)((double)var2 / var5);
            } else {
               var2 = var4;
            }
         }

         if (gk) {
            if (var2 > var3.width) {
               var2 -= var2 % var3.width;
            }

            if (var7 > var3.height) {
               var7 -= var7 % var3.height;
            }
         }

         gK = new Dimension(var2, var7);
      }

      return gK;
   }

   public final Dimension getRealDimensions() {
      if (!this.isStretchedEnabled()) {
         return this.getCanvas().getSize();
      } else {
         if (gT == null) {
            if (this.isResized()) {
               Container var1;
               int var2 = (var1 = this.getCanvas().getParent()).getWidth();
               int var12 = var1.getHeight();
               int var3 = (int)((double)var2 / fF);
               int var4 = (int)((double)var12 / fF);
               if (var3 < 765 || var4 < 503) {
                  double var6 = (double)var2 / 765.0D;
                  double var8 = (double)var12 / 503.0D;
                  double var10 = Math.min(var6, var8);
                  var3 = (int)((double)var2 / var10);
                  var4 = (int)((double)var12 / var10);
               }

               gT = new Dimension(var3, var4);
            } else {
               gT = Constants.GAME_FIXED_SIZE;
            }
         }

         return gT;
      }
   }

   public final void setGameState(GameState var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         x(var1.getState());
         if (var1 == GameState.LOADING) {
            cj = true;
         }

      }
   }

   public final void closeInterface(WidgetNode var1, boolean var2) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         jR var3;
         if ((var3 = (jR)var1) != osrs.bs.a(bT, var3.getHash())) {
            throw new IllegalArgumentException("WidgetNode is no longer valid");
         } else {
            osrs.gh.a(var3, var2);
         }
      }
   }

   public final int getCanvasHeight() {
      return osrs.fs.a;
   }

   public final Map getChatLineMap() {
      return ki.d;
   }

   public final LocalPoint getLocalDestinationLocation() {
      int var1 = eO;
      int var2 = eM;
      return var1 != 0 && var2 != 0 ? LocalPoint.fromScene(var1, var2, osrs.aM.a.o) : null;
   }

   public final int get3dZoom() {
      return osrs.cc.d.i;
   }

   public final int getCenterX() {
      return osrs.cc.d.c;
   }

   public final int getViewportXOffset() {
      return bb;
   }

   public final int getCenterY() {
      return osrs.cc.d.f;
   }

   public final int getCameraPitch() {
      return osrs.dB.a;
   }

   public final int getViewportYOffset() {
      return aX;
   }

   public final int getViewportWidth() {
      return aZ;
   }

   public final int getCameraX() {
      return osrs.l.d;
   }

   public final int getViewportHeight() {
      return bg;
   }

   public final boolean isDraggingWidget() {
      return el;
   }

   public final int getCameraY() {
      return osrs.fk.b;
   }

   public final int getCameraYawTarget() {
      return cd;
   }

   public final void stopNow() {
      osrs.fs.j = 1L;
   }

   public final int getOculusOrbState() {
      return az;
   }

   public final void setMenuEntries(MenuEntry[] var1) {
      dT.setMenuEntries(var1);
   }

   public final int getObjectStackSize() {
      return osrs.aU.a;
   }

   public final int[] getIntStack() {
      return hE.c;
   }

   public final Object[] getObjectStack() {
      return hE.n;
   }

   public final int getIntStackSize() {
      return hE.e;
   }

   public final void setObjectStackSize(int var1) {
      osrs.aU.a = var1;
   }

   public final void setIntStackSize(int var1) {
      hE.e = var1;
   }

   public final int getMouseCurrentButton() {
      return osrs.gY.h;
   }

   public final int[] getPlayerMenuTypes() {
      return U;
   }

   public final VarbitComposition getVarbit(int var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         long var6 = (long)var1;
         bj var2;
         if ((var2 = (bj)osrs.dX.a(osrs.bj.b, var6)) == null) {
            client var10000 = osrs.dF.c;
            osrs.x.a(var1);
            var6 = (long)var1;
            var2 = (bj)osrs.dX.a(osrs.bj.b, var6);
         }

         return var2.getIndex() == 0 && var2.getLeastSignificantBit() == 0 && var2.getMostSignificantBit() == 0 ? null : var2;
      }
   }

   public final void setUnlockedFpsTarget(int var1) {
      if (var1 <= 0) {
         X = 0L;
      } else {
         X = 1000000000L / (long)var1;
      }
   }

   public final void init() {
      try {
         if (this.h()) {
            String var2;
            for(int var1 = 0; var1 <= 28; ++var1) {
               if ((var2 = this.getParameter(Integer.toString(var1))) != null) {
                  int var9;
                  switch(var1) {
                  case 3:
                     if (var2.equalsIgnoreCase("true")) {
                        ac = true;
                     } else {
                        ac = false;
                     }
                     break;
                  case 4:
                     if (br == -1) {
                        br = Integer.parseInt(var2);
                     }
                     break;
                  case 5:
                     aY = Integer.parseInt(var2);
                     break;
                  case 6:
                     gd var12;
                     if ((var9 = Integer.parseInt(var2)) >= 0 && var9 < osrs.gd.b.length) {
                        var12 = osrs.gd.b[var9];
                     } else {
                        var12 = null;
                     }

                     osrs.eN.c = var12;
                     break;
                  case 7:
                     var9 = Integer.parseInt(var2);
                     eH[] var11 = jw.b();
                     int var4 = 0;

                     eH var10;
                     while(true) {
                        if (var4 >= var11.length) {
                           var10 = null;
                           break;
                        }

                        eH var5 = var11[var4];
                        if (var9 == var5.e) {
                           var10 = var5;
                           break;
                        }

                        ++var4;
                     }

                     osrs.bV.c = var10;
                     break;
                  case 8:
                     if (var2.equalsIgnoreCase("true")) {
                     }
                     break;
                  case 9:
                     osrs.gh.g = var2;
                     break;
                  case 10:
                     if ((iQ.h = (eV)osrs.aU.a(new eV[]{osrs.eV.e, osrs.eV.d, osrs.eV.b, osrs.eV.a, osrs.eV.c, osrs.eV.f}, Integer.parseInt(var2))) == osrs.eV.a) {
                        osrs.gR.c = iw.b;
                     } else {
                        osrs.gR.c = iw.a;
                     }
                     break;
                  case 11:
                     osrs.gk.a = var2;
                     break;
                  case 12:
                     aj = Integer.parseInt(var2);
                  case 13:
                  case 16:
                  case 18:
                  case 19:
                  case 20:
                  case 23:
                  case 24:
                  default:
                     break;
                  case 14:
                     osrs.ah.f = Integer.parseInt(var2);
                     break;
                  case 15:
                     bl = Integer.parseInt(var2);
                     break;
                  case 17:
                     osrs.n.b = var2;
                     break;
                  case 21:
                     bu = Integer.parseInt(var2);
                     break;
                  case 22:
                     osrs.aj.a = var2;
                     break;
                  case 25:
                     int var3;
                     if ((var3 = var2.indexOf(".")) == -1) {
                        iZ.a = Integer.parseInt(var2);
                     } else {
                        iZ.a = Integer.parseInt(var2.substring(0, var3));
                        Integer.parseInt(var2.substring(var3 + 1));
                     }
                  }
               }
            }

            jT.a();
            osrs.cR.a = this.getCodeBase().getHost();
            osrs.ec.f = new fv();
            fz = this.getParameter("js5");
            fA = Integer.parseInt(this.getParameter("js5port"));
            String var8 = osrs.bV.c.f;
            if ((aY & iC.g.l) != 0) {
               osrs.fI.a = "beta";
            }

            try {
               osrs.ba.a("ferox", osrs.fI.a, var8, 0, 25);
            } catch (Exception var6) {
               iE.a((String)null, var6);
            }

            osrs.dF.c = this;
            var2 = "JX_ACCESS_TOKEN";
            gL = osrs.dF.c.c(var2);
            var2 = "JX_REFRESH_TOKEN";
            osrs.ar.c = osrs.dF.c.c(var2);
            ah();
            var2 = "JX_SESSION_ID";
            osrs.u.a = osrs.dF.c.c(var2);
            var2 = "JX_CHARACTER_ID";
            osrs.cw.a = osrs.dF.c.c(var2);
            var2 = "JX_DISPLAY_NAME";
            jB.n = (var8 = osrs.dF.c.c(var2)) != null && !var8.isEmpty() && var8.charAt(0) != '#' ? var8 : "";
            if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
               this.fy = true;
            }

            if (bz == -1) {
               if (!n() && !o()) {
                  bz = 0;
               } else {
                  bz = 5;
               }
            }

            this.a(765, 503, 231, 1);
         }

      } catch (RuntimeException var7) {
         throw jQ.a(var7, "osrs.client.init()");
      }
   }

   protected final void finalize() throws Throwable {
      osrs.ee.i.remove(this);
      super.finalize();
   }

   public final int getOculusOrbFocalPointY() {
      return osrs.bs.j;
   }

   public final int getMenuY() {
      return dT.d;
   }

   public final long getAccountHash() {
      return this.hz;
   }

   public final ItemComposition getItemDefinition(int var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return c(var1);
      }
   }

   public final ModelData mergeModels(ModelData[] var1) {
      return a(var1, var1.length);
   }

   public final void setCameraPitchTarget(int var1) {
      gc = (double)var1 * 0.0030679615757712823D;
      bW = var1;
   }

   public final void setMenuScroll(int var1) {
      N = Ints.constrainToRange(var1, 0, gP);
   }

   public final int[][][] getInstanceTemplateChunks() {
      return cT;
   }

   public final void setMinimapZoom(boolean var1) {
      J = var1;
      R = 4.0D;
   }

   public final Map getWidgetSpriteOverrides() {
      return du;
   }

   public final int getDraw2DMask() {
      return gS;
   }

   public final Widget getWidget(int var1, int var2) {
      return e(var1, var2);
   }

   public final SpritePixels[] getSprites(IndexDataBase var1, int var2, int var3) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         fB var16;
         byte[] var17;
         if ((var17 = (var16 = (fB)var1).loadData(var2, var3)) == null) {
            return null;
         } else {
            jQ.a(var17);
            int var18 = iR.c;
            var2 = iR.e;
            int[] var19 = iR.b;
            int[] var4 = osrs.ej.c;
            int[] var5 = osrs.eL.a;
            int[] var6 = osrs.aQ.a;
            byte[][] var7 = iR.a;
            iT[] var8 = new iT[iR.f];

            for(int var9 = 0; var9 < iR.f; ++var9) {
               int var10 = var5[var9];
               int var11 = var6[var9];
               byte[] var12 = var7[var9];
               int[] var13 = new int[var10 * var11];
               iT var14;
               (var14 = new iT(var13, var10, var11)).setMaxHeight(var2);
               var14.setMaxWidth(var18);
               var14.setOffsetX(var19[var9]);
               var14.setOffsetY(var4[var9]);

               for(int var15 = 0; var15 < var10 * var11; ++var15) {
                  var13[var15] = iR.d[var12[var15] & 255];
               }

               var8[var9] = var14;
            }

            osrs.ej.c = null;
            iR.b = null;
            osrs.aQ.a = null;
            osrs.eL.a = null;
            iR.d = null;
            iR.a = null;
            return var8;
         }
      }
   }

   public final String getWorldHost() {
      return osrs.cR.a;
   }

   public final boolean isFriended(String var1, boolean var2) {
      jw var4 = new jw(var1, osrs.gR.c);
      return jE.b.a(var4, var2);
   }

   public final long[] getCrossWorldMessageIds() {
      return hk;
   }

   public final ItemContainer getItemContainer(int var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return (jP)osrs.bs.a(jP.a, (long)var1);
      }
   }

   public final Widget getWidget(WidgetInfo var1) {
      int var2 = var1.getGroupId();
      int var3 = var1.getChildId();
      return e(var2, var3);
   }

   public final void queueChangedVarp(int var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         osrs.aN.a(var1);
         int var2 = es;
         ++var2;
         ey[var2 - 1 & 31] = var1;
         es = var2;
      }
   }

   public final IndexDataBase getIndexSprites() {
      return C[8];
   }

   public final ItemContainer getItemContainer(InventoryID var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return (jP)osrs.bs.a(jP.a, (long)var1.getId());
      }
   }

   public final NodeCache getObjectCompositionCache() {
      return osrs.bJ.g;
   }

   public final SpritePixels createSpritePixels(int[] var1, int var2, int var3) {
      return new iT(var1, var2, var3);
   }

   public final MenuEntry createMenuEntry(int var1) {
      return dT.b(var1);
   }

   public final WorldView getTopLevelWorldView() {
      return osrs.aM.a;
   }

   public final int getVar(int var1) {
      return this.getVarbitValue(osrs.ej.d, var1);
   }

   public final NodeCache getWidgetSpriteCache() {
      return jD.a == null ? null : jD.a.l;
   }

   public final void hopToWorld(World var1) {
      int var5 = var1.getId();
      int var2 = MenuAction.CC_OP.getId();
      String var3 = "<col=ff9040>" + (var5 - 300) + "</col>";
      String var4 = "Switch";
      osrs.fw.a(var5, 4522002, var2, 1, -1, -1, var4, var3, -1, -1);
   }

   public final int getKeyboardIdleTicks() {
      return osrs.fs.l.a;
   }

   public final DBRowConfig getDBRowConfig(int var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return y(var1);
      }
   }

   public final double getCameraFpY() {
      return bQ;
   }

   public final void setMinimapTileDrawer(TileFunction var1) {
      if (var1 == null) {
         bE = G;
      } else {
         bE = (var1x, var2, var3, var4, var5, var6, var7, var8) -> {
            var1.drawTile(var1x.ak[var2 >> var1x.ap & 3][var3 + var1x.e][var4 + var1x.e], var3, var4, var5, var6, var7, var8);
         };
      }
   }

   public final void setUsername(String var1) {
      jB.e = var1;
      this.getCallbacks().post(new UsernameChanged());
   }

   public final int[] getMapRegions() {
      return osrs.S.c;
   }

   public final void setAnimationInterpolationFilter(IntPredicate var1) {
      D = var1;
   }

   public final void setCameraYawTarget(int var1) {
      gY = (double)var1 * 0.0030679615757712823D;
      cd = var1;
   }

   public final IndexDataBase getIndexConfig() {
      return C[2];
   }

   public final World[] getWorldList() {
      return iB.a;
   }

   public final int getCameraMode() {
      return az;
   }

   public final int[] getArray(int var1) {
      return ae >= 5 ? ((hD)hE.k[var1]).a : hE.a[var1];
   }

   public final SpritePixels[] getMapDots() {
      return ki.e;
   }

   public final void runScript(Object... var1) {
      a(a(var1));
   }

   public final double getCameraFocalPointZ() {
      return fV;
   }

   public final void setCameraFocalPointZ(double var1) {
      Preconditions.checkArgument(az == 1, "must be in free camera mode");
      fV = var1;
      osrs.bs.j = (int)var1;
   }

   public final double getCameraFpYaw() {
      return H;
   }

   public final long getMouseLastPressedMillis() {
      return osrs.gY.o;
   }

   public final int getDragTime() {
      return osrs.t.a;
   }

   public final NodeCache getItemCompositionCache() {
      return osrs.bC.a;
   }

   public final void setCompass(SpritePixels var1) {
      osrs.bZ.a = (iT)var1;
   }

   public final ClanSettings getClanSettings(int var1) {
      aP[] var2 = aP;
      return var1 >= 0 && var1 < var2.length ? var2[var1] : null;
   }

   public final void setOculusOrbNormalSpeed(int var1) {
      ar = var1;
   }

   public final int getRevision() {
      return jv.a;
   }

   public final int getFPS() {
      return osrs.fs.e;
   }

   public final boolean isCameraShakeDisabled() {
      return fD;
   }

   public final void resetHealthBarCaches() {
      osrs.bq.c.reset();
      osrs.bq.a.reset();
   }

   public final int[][] getXteaKeys() {
      return jQ.a;
   }

   public final int getRasterizer3D_clipNegativeMidY() {
      return osrs.cc.d.m;
   }

   public final Model mergeModels(Model[] var1) {
      return a(var1, var1.length);
   }

   public final HashTable getComponentTable() {
      return bT;
   }

   public final Widget getWidget(int var1) {
      return this.i(var1);
   }

   public final Rasterizer getRasterizer() {
      return osrs.cm.a;
   }

   public final WorldPoint getHintArrowPoint() {
      return this.getHintArrowType() == 2 ? new WorldPoint(cB, cN, gf) : null;
   }

   public final IndexDataBase getIndex(int var1) {
      return C[var1];
   }

   public final int getEnvironment() {
      return bl;
   }

   public final int getRasterizer3D_clipMidY2() {
      return osrs.cc.d.h;
   }

   public final int[] getServerVarps() {
      return osrs.ej.b;
   }

   public final void playSoundEffect(int var1) {
      this.playSoundEffect(var1, 0, 0, 0, 0);
   }

   public final void setShouldRenderLoginScreenFire(boolean var1) {
      ia.a = var1;
   }

   public final String getBuildID() {
      return "16172643907.190";
   }

   public final int getTickCount() {
      return z;
   }

   public final Projectile createProjectile(int var1, WorldPoint var2, int var3, Actor var4, WorldPoint var5, int var6, Actor var7, int var8, int var9, int var10, int var11) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         int var12 = 0;
         if (var4 instanceof kc) {
            var12 = ((kc)var4).getIndex() + 1;
         } else if (var4 instanceof jG) {
            var12 = -(((jG)var4).getId() + 1);
         }

         int var14 = 0;
         if (var7 instanceof kc) {
            var14 = ((kc)var7).getIndex() + 1;
         } else if (var7 instanceof jG) {
            var14 = -(((jG)var7).getId() + 1);
         }

         jQ var13 = new jQ(var2.getPlane(), var2.getX(), var2.getY(), var3, var12, var5.getPlane(), var5.getX(), var5.getY(), var6, var14, var1, var8, var9, var10, var11);
         osrs.fU.a((fU)aw, var13);
         return var13;
      }
   }

   public final String[] getPlayerOptions() {
      return dB;
   }

   public final void setStretchedIntegerScaling(boolean var1) {
      gk = var1;
   }

   public final void draw2010Menu(int var1) {
      a(dT, (ky)null, var1, N);
   }

   public final void setPassword(String var1) {
      jB.d = var1;
   }

   public final int getExpandedMapLoading() {
      return A;
   }

   public final SpritePixels createItemSprite(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         cK var8;
         int var9 = (var8 = osrs.cc.d).i;
         var8.i = var7;

         iT var13;
         try {
            if (!osrs.dF.c.isClientThread()) {
               if (!osrs.fs.q) {
                  throw new AssertionError("must be called on client thread");
               }

               throw new IllegalStateException("must be called on client thread");
            }

            var13 = ji.a(var1, var2, var3, var4, var5, var6);
         } finally {
            var8.i = var9;
         }

         return var13;
      }
   }

   public final int getCameraYaw() {
      return osrs.gv.a;
   }

   public final WidgetNode openInterface(int var1, int var2, int var3) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         int var4 = var3;
         var3 = var2;
         if (!osrs.dF.c.isClientThread()) {
            if (!osrs.fs.q) {
               throw new AssertionError("must be called on client thread");
            } else {
               throw new IllegalStateException("must be called on client thread");
            }
         } else {
            fd var5;
            if ((var5 = this.i(var1)) == null) {
               throw new IllegalStateException("component does not exist");
            } else if (var5.getType() != 0) {
               throw new IllegalStateException("component is not a layer");
            } else {
               jR var6;
               if ((var6 = (jR)osrs.bs.a(bT, (long)var1)) != null) {
                  this.closeInterface(var6, var2 != var6.d);
               }

               Iterator var17 = bT.iterator();

               while(var17.hasNext()) {
                  jR var7 = (jR)var17.next();
                  if (var3 == var7.d) {
                     throw new IllegalStateException("interface " + var3 + " is already open");
                  }
               }

               (var6 = new jR()).d = var3;
               var6.b = var4;
               long var15 = (long)var1;
               bT.a((hR)var6, var15);
               osrs.eu.a(jD.a, var3);
               a(jD.a.c[var1 >> 16], var5, false);
               osrs.bf.a(var3);
               if ((var1 = this.getTopLevelInterfaceId()) != -1 && osrs.eu.a(jD.a, var1)) {
                  fd[] var10000 = jD.a.c[var1];
                  boolean var18 = true;
                  osrs.da.a(var10000, 1);
               }

               return var6;
            }
         }
      }
   }

   public final void setFreeCameraSpeed(int var1) {
      ar = var1;
   }

   public final GrandExchangeOffer[] getGrandExchangeOffers() {
      return bc;
   }

   public final ClanChannel getGuestClanChannel() {
      return ik.a;
   }

   public final TextureProvider getTextureProvider() {
      return dw;
   }

   public final void refreshChat() {
      ce = bU * 733503027;
   }

   public final void setHintArrow(NPC var1) {
      cF = 1;
      cI = var1.getIndex();
   }

   public final void setStretchedFast(boolean var1) {
      fB = var1;
   }

   public final void checkClickbox(Projection var1, Model var2, int var3, int var4, int var5, int var6, long var7) {
      a((cj)var1, (cj)null, (cn)var2, var3, var4, var5, var6, var7);
   }

   public final ClanSettings getGuestClanSettings() {
      return osrs.bt.d;
   }

   public final void setUnlockedFps(boolean var1) {
      O = var1;
      if (!var1) {
         X = 0L;
      }

      osrs.bR.b = 0.0D;
   }

   public final void setInvertYaw(boolean var1) {
      gy = var1;
   }

   public final void setHintArrow(LocalPoint var1) {
      cF = 2;
      WorldPoint var2;
      cB = (var2 = WorldPoint.fromLocal(osrs.dF.c, var1)).getX();
      cN = var2.getY();
      gf = var2.getPlane();
      cC = var1.getX() & 127;
      cL = var1.getY() & 127;
      cE = 0;
   }

   public final void setExpandedMapLoading(int var1) {
      A = Ints.constrainToRange(var1, 0, 5);
   }

   public final double getCameraFocalPointY() {
      return gQ;
   }

   public final void setInventoryDragDelay(int var1) {
   }

   public final void setDraw2DMask(int var1) {
      gS = var1;
   }

   public final boolean isMenuScrollable() {
      return gP > 0;
   }

   public final void setCameraFocalPointX(double var1) {
      Preconditions.checkArgument(az == 1, "must be in free camera mode");
      fP = var1;
      osrs.C.b = (int)var1;
   }

   public final double getCameraFocalPointX() {
      return fP;
   }

   public final ScriptEvent createScriptEvent(Object[] var1) {
      return a(var1);
   }

   public final int getRealSkillLevel(Skill var1) {
      return this.getRealSkillLevels()[var1.ordinal()];
   }

   public final IndexDataBase getIndexScripts() {
      return C[12];
   }

   public final int getRasterizer3D_clipMidX2() {
      return osrs.cc.d.b;
   }

   public final Object[] getDBTableField(int var1, int var2, int var3) {
      ir var7;
      iD var4 = osrs.Z.a((var7 = y(var1)).getTableID());
      Object[] var8 = var7.a(var2);
      int[] var5 = var4.d[var2];
      if (var8 == null) {
         var8 = var4.c[var2];
      }

      if (var3 >= var5.length) {
         throw new IllegalArgumentException("tuple index too large");
      } else if (var8 == null) {
         return new Object[0];
      } else {
         Object[] var9 = new Object[var2 = var8.length / var5.length];

         for(int var6 = 0; var6 < var2; ++var6) {
            var9[var6] = var8[var3 + var5.length * var6];
         }

         return var9;
      }
   }

   public final World createWorld() {
      return new dO();
   }

   public final int getBoostedSkillLevel(Skill var1) {
      return this.getBoostedSkillLevels()[var1.ordinal()];
   }

   public final NodeCache getItemSpriteCache() {
      return osrs.bC.c;
   }

   public final boolean isMinimapZoom() {
      return J;
   }

   public final String getLauncherDisplayName() {
      return this.c("JX_DISPLAY_NAME");
   }

   public final double getCameraFpX() {
      return bB;
   }

   public final IndexedSprite[] getMapScene() {
      return osrs.fJ.z;
   }

   public final SpritePixels[] getCrossSprites() {
      return osrs.gs.a;
   }

   public final int getOculusOrbFocalPointX() {
      return osrs.C.b;
   }

   public final Widget getDraggedOnWidget() {
      return ei;
   }

   public final List getActiveMidiRequests() {
      return Collections.unmodifiableList(osrs.ee.e);
   }

   public final void clearHintArrow() {
      cF = 0;
   }

   public final HashTable getWidgetFlags() {
      return cy;
   }

   public final double getCameraFpPitch() {
      return bJ;
   }

   public final Menu getMenu() {
      return dT;
   }

   public final void setStretchedKeepAspectRatio(boolean var1) {
      fC = var1;
   }

   public final Animation loadAnimation(int var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         client var10000 = osrs.dF.c;
         bP var2;
         return (var2 = osrs.az.a(var1)).p == null && !var2.isMayaAnim() ? null : var2;
      }
   }

   public final WorldMap getWorldMap() {
      return osrs.er.b;
   }

   public final double getMinimapZoom() {
      return R;
   }

   public final int getVarpValue(int var1) {
      return osrs.ej.d[var1];
   }

   public final void setGeSearchResultIndex(int var1) {
      osrs.cJ.a = var1;
   }

   public final MessageNode addChatMessage(ChatMessageType var1, String var2, String var3, String var4) {
      return this.addChatMessage(var1, var2, var3, var4, true);
   }

   public final void setScalingFactor(int var1) {
      fF = 1.0D + (double)var1 / 100.0D;
   }

   public final NodeCache getAnimationCache() {
      return osrs.bP.c;
   }

   public final void setIdleTimeout(int var1) {
      Q = var1;
      if (var1 > 75000) {
         Q = 75000;
      } else {
         if (Q < 15000) {
            Q = 15000;
         }

      }
   }

   public final int getCameraZ() {
      return jD.b;
   }

   public final SpritePixels drawInstanceMap(int var1) {
      return w(var1);
   }

   public final Deque getProjectiles() {
      return aw;
   }

   public final IndexedSprite[] getModIcons() {
      return osrs.gw.b;
   }

   public final ModelData mergeModels(ModelData[] var1, int var2) {
      return a(var1, var2);
   }

   public final void drawOriginalMenu(int var1) {
      b(dT, (ky)null, var1, N);
   }

   public final boolean isInInstancedRegion() {
      return cU;
   }

   public final ModelData loadModelData(int var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return this.E(var1);
      }
   }

   public final Player getLocalPlayer() {
      return osrs.ai.a;
   }

   public final void changeWorld(World var1) {
      dO var3 = (dO)var1;
      boolean var2 = this.getWorldType().contains(WorldType.BETA_WORLD) != var3.getTypes().contains(WorldType.BETA_WORLD);
      osrs.eE.a = var3.getTypes().contains(WorldType.BETA_WORLD);
      if (var3.getTypes().contains(WorldType.BETA_WORLD)) {
         var3.j = "beta";
      }

      osrs.dm.a(var3);
      if (var2 && this.getGameState().getState() < GameState.LOADING.getState()) {
         osrs.ha.a();
      }

   }

   public final EnumComposition getEnum(int var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return h(var1);
      }
   }

   public final void setCameraMouseButtonMask(int var1) {
      gh = var1;
   }

   public final void queueChangedSkill(Skill var1) {
      int var2 = ez;
      ++var2;
      eo[var2 - 1 & 31] = var1.ordinal();
      ez = var2;
   }

   public final void setAllWidgetsAreOpTargetable(boolean var1) {
      bm = var1;
   }

   public final NameableContainer getIgnoreContainer() {
      return jE.b == null ? null : jE.b.c;
   }

   public final void setCameraPitchRelaxerEnabled(boolean var1) {
      if (by != var1) {
         by = var1;
         if (!var1) {
            bW = a(gc = Doubles.constrainToRange(gc, 0.39269909262657166D, 1.1750292778015137D));
         }
      }

   }

   public final int getMenuScroll() {
      return N;
   }

   public final ClanChannel getClanChannel(int var1) {
      aw[] var2 = aG;
      return var1 >= 0 && var1 < var2.length ? var2[var1] : null;
   }

   public final Widget getScriptDotWidget() {
      return ic.a;
   }

   public final boolean isRuneLiteObjectRegistered(RuneLiteObjectController var1) {
      return kv.c(var1);
   }

   public final void changeMemoryMode(boolean var1) {
      bv = var1;
      osrs.ci.a = var1;
      jV.a = true;
      if (this.getGameState() == GameState.LOGGED_IN) {
         this.setGameState(GameState.LOADING);
      }

   }

   public final void setGpuFlags(int var1) {
      if (((E ^ var1) & 4) == 4) {
         osrs.bJ.b.reset();
         osrs.bJ.a.reset();
         osrs.aY.a.reset();
         osrs.eY.a.reset();
         osrs.bl.a.reset();
      }

      E = var1;
   }

   public final int getCanvasWidth() {
      return osrs.fs.h;
   }

   public final Preferences getPreferences() {
      return osrs.j.aS;
   }

   public final void setMusicVolume(int var1) {
      if (var1 != this.getMusicVolume()) {
         S = true;
      }

      id.a(var1);
   }

   public final int getSkillExperience(Skill var1) {
      int[] var2 = this.getSkillExperiences();
      int var3;
      return (var3 = var1.ordinal()) >= var2.length ? -1 : var2[var3];
   }

   public final void setModIcons(IndexedSprite[] var1) {
      osrs.gw.b = (jp[])var1;
   }

   public final IterableHashTable getMessages() {
      return ki.b;
   }

   public final void setCameraSpeed(float var1) {
      fE = Floats.constrainToRange(var1, 0.2F, 5.0F);
   }

   public final void setDrawCallbacks(DrawCallbacks var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         dd = var1;
         kx var2;
         if ((var2 = fd) != null && aa == 30) {
            c(var2);
            if (!dx && aa != 25) {
               throw new AssertionError();
            }
         }

      }
   }

   public final void setGeSearchResultIds(short[] var1) {
      osrs.bB.b = var1;
   }

   public final Widget getDraggedWidget() {
      return dO;
   }

   public final int getCameraPitchTarget() {
      return bW;
   }

   public final MapElementConfig getMapElementConfig(int var1) {
      return osrs.bi.b[var1];
   }

   public final Model loadModel(int var1) {
      return this.a(var1, (short[])null, (short[])null);
   }

   public final NPC getHintArrowNpc() {
      return this.Z();
   }

   public final int getIdleTimeout() {
      return Q;
   }

   public final int getSkyboxColor() {
      return cQ;
   }

   public final DrawCallbacks getDrawCallbacks() {
      return dd;
   }

   public final boolean isKeyPressed(int var1) {
      return aU.e[var1];
   }

   public final Map getSpriteOverrides() {
      return B;
   }

   public final void setStretchedEnabled(boolean var1) {
      fU = var1;
   }

   public final void setCameraShakeDisabled(boolean var1) {
      fD = var1;
   }

   public final void registerRuneLiteObject(RuneLiteObjectController var1) {
      kv.b(var1);
   }

   public final int getArraySizes(int var1) {
      return ae >= 5 ? ((hD)hE.k[var1]).c * 935110769 : hE.h[var1];
   }

   public final void setCameraMode(int var1) {
      Preconditions.checkArgument(var1 == 0 || var1 == 1, "invalid camera mode");
      az = var1;
   }

   public final void setSkyboxColor(int var1) {
      cQ = var1;
   }

   public final void setGeSearchResultCount(int var1) {
      osrs.hx.a = var1;
   }

   public final int getRasterizer3D_clipNegativeMidX() {
      return osrs.cc.d.k;
   }

   public final int getEnergy() {
      return cg;
   }

   public final FriendContainer getFriendContainer() {
      return jE.b == null ? null : jE.b.e;
   }

   public final void setMinimapZoom(double var1) {
      if (J) {
         R = Doubles.constrainToRange(var1, 2.0D, 8.0D);
      }

   }

   public final boolean hasHintArrow() {
      return this.getHintArrowType() != 0;
   }

   public final String getVarcStrValue(int var1) {
      Object var3;
      return (var3 = this.getVarcMap().get(var1)) instanceof String ? (String)var3 : "";
   }

   public final IndexedSprite createIndexedSprite() {
      return new jp();
   }

   public final void setWidgetSelected(boolean var1) {
      dU = var1;
   }

   public final void playSoundEffect(int var1, int var2, int var3, int var4) {
      this.playSoundEffect(var1, var2, var3, var4, 0);
   }

   public final int getLoginIndex() {
      return jB.l;
   }

   public final int getMouseIdleTicks() {
      return fY;
   }

   public final Player getHintArrowPlayer() {
      return this.aa();
   }

   public final boolean[] getPlayerOptionsPriorities() {
      return ds;
   }

   public final void playSoundEffect(int var1, int var2) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         fE var10000 = C[4];
         int var10001 = var1;
         boolean var5 = false;
         int var4 = var10001;
         km var6;
         if ((var6 = km.a(var10000, var4, 0)) != null) {
            int var3;
            if ((var3 = osrs.j.aS.getSoundEffectVolume()) != 0) {
               var2 = var3;
            }

            kl var10 = var6.a(false);
            D var8 = osrs.l.e;
            var10 = kl.a(var10, var8);
            boolean var9 = true;
            o var7;
            o var11 = var7 = osrs.o.a((kl)var10, 100, var2);
            var9 = true;
            var11.f(1);
            osrs.N.a.a((jX)var7);
         }

      }
   }

   public final boolean isStretchedFast() {
      return fB;
   }

   public final void menuAction(int var1, int var2, MenuAction var3, int var4, int var5, String var6, String var7) {
      int var8 = var3.getId();
      osrs.fw.a(var1, var2, var8, var4, var5, -1, var6, var7, -1, -1);
   }

   public final int getServerVarbitValue(int var1) {
      return this.getVarbitValue(osrs.ej.b, var1);
   }

   public final int getMenuX() {
      return dT.c;
   }

   public final void setVarcIntValue(int var1, int var2) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         this.getVarcMap().put(var1, var2);
      }
   }

   public final void setHintArrow(Player var1) {
      cF = 10;
      cJ = var1.getId();
   }

   public final Widget getSelectedWidget() {
      if (!this.isWidgetSelected()) {
         return null;
      } else {
         int var1 = osrs.fo.b;
         int var2 = dM;
         Object var3;
         if ((var3 = this.i(var1)) != null && var2 >= 0) {
            var3 = ((Widget)var3).getChild(var2);
         }

         return (Widget)var3;
      }
   }

   public final void setVarbit(int var1, int var2) {
      this.setVarbitValue(osrs.ej.d, var1, var2);
   }

   public final int getItemCount() {
      return iJ.a;
   }

   public final ClanSettings getClanSettings() {
      return aP[0];
   }

   public final void setTickCount(int var1) {
      z = var1;
   }

   public final int[] getVarps() {
      return osrs.ej.d;
   }

   public final Deque getAmbientSoundEffects() {
      return osrs.aM.a.p;
   }

   public final StructComposition getStructComposition(int var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return osrs.cd.a(var1);
      }
   }

   public final int getVarcIntValue(int var1) {
      Object var3;
      return (var3 = this.getVarcMap().get(var1)) instanceof Integer ? (Integer)var3 : 0;
   }

   public final NodeCache getStructCompositionCache() {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return osrs.aZ.a;
      }
   }

   public final Model loadModel(int var1, short[] var2, short[] var3) {
      return this.a(var1, var2, var3);
   }

   public final Point getMouseCanvasPosition() {
      return new Point(osrs.gY.i, osrs.gY.r);
   }

   public final int[] getWidgetPositionsX() {
      return eF;
   }

   public final IntPredicate getAnimationInterpolationFilter() {
      return D;
   }

   public final NPCComposition getNpcDefinition(int var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return osrs.B.a(var1);
      }
   }

   public final long getOverallExperience() {
      int[] var1 = this.getSkillExperiences();
      long var2 = 0L;
      int[] var4 = var1;
      int var7 = var1.length;

      for(int var5 = 0; var5 < var7; ++var5) {
         int var6 = var4[var5];
         var2 += (long)var6;
      }

      return var2;
   }

   public final Model applyTransformations(Model var1, Animation var2, int var3, Animation var4, int var5) {
      cn var6 = (cn)var1;
      bP var7 = (bP)var2;
      bP var9 = (bP)var4;
      if (var6 == null) {
         return null;
      } else if (var7 != null && var9 != null) {
         return var7.a(var6, var3, var9, var5);
      } else if (var7 != null) {
         return var7.a(var6, var3);
      } else if (var9 != null) {
         return var9.a(var6, var5);
      } else {
         boolean var8 = true;
         return osrs.cn.a(var6, var8);
      }
   }

   public final void setCameraFocalPointY(double var1) {
      Preconditions.checkArgument(az == 1, "must be in free camera mode");
      gQ = var1;
      osrs.cQ.a = (int)var1;
   }

   public final Model mergeModels(Model[] var1, int var2) {
      return a(var1, var2);
   }

   public final int getServerVarpValue(int var1) {
      return osrs.ej.b[var1];
   }

   public final int[] getWidgetPositionsY() {
      return eB;
   }

   public final int getMenuHeight() {
      return dT.p;
   }

   public final NodeCache getItemModelCache() {
      return osrs.bC.b;
   }

   public final void removeRuneLiteObject(RuneLiteObjectController var1) {
      kv.a(var1);
   }

   public final SpritePixels[] getMapIcons() {
      return hf;
   }

   public final AccountType getAccountType() {
      switch(this.getVarbitValue(1777)) {
      case 1:
         return AccountType.IRONMAN;
      case 2:
         return AccountType.ULTIMATE_IRONMAN;
      case 3:
         return AccountType.HARDCORE_IRONMAN;
      case 4:
         return AccountType.GROUP_IRONMAN;
      case 5:
         return AccountType.HARDCORE_GROUP_IRONMAN;
      default:
         return AccountType.NORMAL;
      }
   }

   public final RuneLiteObject createRuneLiteObject() {
      return new RuneLiteObject(this);
   }

   public final boolean isPrayerActive(Prayer var1) {
      return this.getVarbitValue(var1.getVarbit()) == 1;
   }

   public final Projectile createProjectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Actor var11, int var12, int var13) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return a(var1, var2, var3, var4, var5, var6, var7, var8, var11, var12, var13);
      }
   }

   public final FriendsChatManager getFriendsChatManager() {
      return osrs.aX.a;
   }

   public final void setLoginScreen(SpritePixels var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         fQ = (iT)var1;
         if (osrs.cj.e) {
            osrs.cj.e = false;
            fE var10000 = C[10];
            fE var10001 = C[8];
            int var4 = jB.l;
            boolean var5 = false;
            hM var3 = osrs.ec.d;
            fE var2 = var10001;
            jF.a(var10000, var2, var3, false, var4);
         }

      }
   }

   public final int getWeight() {
      return cb;
   }

   public final RenderOverview getRenderOverview() {
      return osrs.er.b;
   }

   public final int getCrossWorldMessageIdsIndex() {
      return he;
   }

   public final HashTable getItemContainers() {
      return jP.a;
   }

   public final void setDraggedOnWidget(Widget var1) {
      ei = (fd)var1;
   }

   public final ClanChannel getClanChannel() {
      return aG[0];
   }

   public final ObjectComposition getObjectDefinition(int var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return D(var1);
      }
   }

   public final void setInvertPitch(boolean var1) {
      gI = var1;
   }

   public final int getMapAngle() {
      return cd;
   }

   public final void setHintArrow(WorldPoint var1) {
      cF = 2;
      cB = var1.getX();
      cN = var1.getY();
      gf = var1.getPlane();
      cC = 64;
      cL = 64;
      cE = 0;
   }

   public final double getCameraFpZ() {
      return bD;
   }

   public final int getScale() {
      return bd;
   }

   public final String getUsername() {
      return jB.e;
   }

   public final Widget[] getWidgetRoots() {
      int var1;
      if ((var1 = this.getTopLevelInterfaceId()) == -1) {
         return new Widget[0];
      } else {
         ArrayList var2 = new ArrayList();
         fd[] var6;
         int var3 = (var6 = jD.a.c[var1]).length;

         for(int var4 = 0; var4 < var3; ++var4) {
            fd var5;
            if ((var5 = var6[var4]) != null && var5.v == -1) {
               var2.add(var5);
            }
         }

         return (Widget[])var2.toArray(new Widget[var2.size()]);
      }
   }

   public final int getMenuWidth() {
      return dT.i;
   }

   public final Widget getScriptActiveWidget() {
      return osrs.ef.a;
   }

   public final void setOtp(String var1) {
      kn.b = var1;
   }

   public final int getTotalLevel() {
      int var1 = 0;
      int[] var2 = osrs.dF.c.getRealSkillLevels();
      int var3 = Skill.CONSTRUCTION.ordinal();

      for(int var4 = 0; var4 < var2.length; ++var4) {
         if (var4 <= var3) {
            var1 += var2[var4];
         }
      }

      return var1;
   }

   public final NPC getFollower() {
      kd var10000;
      if (osrs.ai.a.z != -1) {
         int var3 = osrs.ai.a.z;
         var10000 = ag.b(var3);
      } else {
         var10000 = osrs.aM.a;
      }

      gg var5 = var10000.g;
      long var6 = (long)ch;
      return (kc)var5.a(var6);
   }

   public final int getWorld() {
      return aj;
   }

   public final void setVarcStrValue(int var1, String var2) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         this.getVarcMap().put(var1, var2);
      }
   }

   public final WorldView getWorldView(int var1) {
      return kd.b(var1);
   }

   public final void setOculusOrbState(int var1) {
      az = var1;
   }

   public final BufferProvider getBufferProvider() {
      return osrs.fH.d;
   }

   public final List getDBRowsByValue(int var1, int var2, int var3, Object var4) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         List var5;
         return (var5 = (List)((Map)iL.a(var1 << 12 | var2 << 4).a.get(var3)).get(var4)) == null ? Collections.emptyList() : Collections.unmodifiableList(var5);
      }
   }

   @ObfuscatedName("rm")
   @ObfuscatedSignature(
      signature = "(I)Lov;"
   )
   public final fd i(int var1) {
      return e(WidgetUtil.componentToInterface(var1), WidgetUtil.componentToId(var1));
   }

   @ObfuscatedName("rm")
   @ObfuscatedSignature(
      signature = "(I)Lik;"
   )
   private static bJ D(int var0) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return jT.b(var0);
      }
   }

   @ObfuscatedName("sm")
   @ObfuscatedSignature(
      signature = "()Lcp;"
   )
   public static jG p() {
      return osrs.ai.a;
   }

   @ObfuscatedName("tr")
   @ObfuscatedSignature(
      signature = "(I[S[S)Ljm;"
   )
   private cn a(int var1, short[] var2, short[] var3) {
      class243 var8;
      if ((var8 = this.E(var1)) == null) {
         return null;
      } else {
         if (var2 != null && var3 != null) {
            var8.h();

            for(int var4 = 0; var4 < var2.length; ++var4) {
               short var10001 = var2[var4];
               short var7 = var3[var4];
               short var6 = var10001;
               var8.b(var6, var7);
            }
         }

         return var8.f();
      }
   }

   @ObfuscatedName("tt")
   private static void af() {
      int var0;
      if ((var0 = osrs.gY.k) != 1 && (osrs.I.b || var0 != 4)) {
         if (!dT.d(osrs.gY.j, osrs.gY.b)) {
            dP = false;
            dT.b();
         }

         var0 = ci;
         if (!dP || var0 == 0) {
            return;
         }

         jy var1;
         if (fe > 0 && dT.o >= 0 && (var1 = dT.n[dT.o]) != null && osrs.gY.j >= var1.c - 10 && osrs.gY.j <= var1.i + var1.c + 10 && osrs.gY.b >= var1.d - 10 && osrs.gY.b <= var1.d + var1.p + 10) {
            if ((K += var0) < 0) {
               K = 0;
               return;
            }

            if (K > fe) {
               K = fe;
            }

            return;
         }

         if (osrs.gY.j < dT.c - 10 || osrs.gY.j > dT.i + dT.c + 10 || osrs.gY.b < dT.d - 10 || osrs.gY.b > dT.d + dT.p + 10 || gP <= 0) {
            return;
         }

         if ((N += var0) >= 0) {
            if (N > gP) {
               N = gP;
            }

            return;
         }

         N = 0;
      } else {
         int var2 = osrs.gY.f;
         int var3 = osrs.gY.g;
         dT.a(var3, var2);
         dP = false;
         dT.b();
      }

   }

   @ObfuscatedName("tu")
   public static void a(fd[] var0, fd var1, boolean var2) {
      osrs.aP.a((fd[])var0, (fd)var1, false, (byte)3);
   }

   @ObfuscatedName("ud")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/Object;)Lcs;"
   )
   private static jK a(Object... var0) {
      jK var1;
      (var1 = new jK()).g = var0;
      return var1;
   }

   @ObfuscatedName("up")
   @ObfuscatedSignature(
      signature = "(Lcs;II)V"
   )
   private static void a(jK var0, int var1, int var2) {
      osrs.fk.a(var0, 5000000, 0);
   }

   @ObfuscatedName("uq")
   @ObfuscatedSignature(
      signature = "(I)Ldl;"
   )
   public static kd j(int var0) {
      return kd.b(var0);
   }

   @ObfuscatedName("uq")
   public static int q() {
      return aa;
   }

   @ObfuscatedName("vc")
   @ObfuscatedSignature(
      signature = "()Lqq;"
   )
   public static gb r() {
      return bT;
   }

   @ObfuscatedName("we")
   @ObfuscatedSignature(
      signature = "(I)Ljj;"
   )
   private class243 E(int var1) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         long var4 = (long)var1;
         class243 var2;
         if ((var2 = (class243)osrs.dX.a(this.hm, var4)) == null) {
            fE var10000 = C[7];
            boolean var5 = false;
            if ((var2 = class243.a(var10000, var1, 0)) == null) {
               return null;
            }

            long var7 = (long)var1;
            this.hm.a((im)var2, var7);
         }

         return var2.g();
      }
   }

   @ObfuscatedName("wj")
   private void ag() {
      try {
         OutputStream var1 = Files.newOutputStream(this.hn.toPath());

         try {
            OutputStreamWriter var2 = new OutputStreamWriter(var1, StandardCharsets.UTF_8);

            try {
               this.hq.store(var2, "Do not share this file with anyone");
            } catch (Throwable var6) {
               try {
                  var2.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }

               throw var6;
            }

            var2.close();
         } catch (Throwable var7) {
            if (var1 != null) {
               try {
                  var1.close();
               } catch (Throwable var4) {
                  var7.addSuppressed(var4);
               }
            }

            throw var7;
         }

         if (var1 != null) {
            var1.close();
         }

      } catch (IOException var8) {
         cV.warn("unable to write credentials to disk", var8);
      }
   }

   @ObfuscatedName("xn")
   public static void s() {
      double var0 = gc;
      double var2;
      if ((var2 = (double)(dk / 256) * 0.0030679615757712823D) > var0) {
         var0 = var2;
      }

      double var4;
      if (fR[4] && (var4 = (double)(fq[4] + 128) * 0.0030679615757712823D) > var0) {
         var0 = var4;
      }

      var4 = gY;
      double var6 = fP;
      double var8 = fV;
      double var10 = gQ;
      int var31 = a(var0) * 3 + 600;
      int var3;
      if ((var3 = bg - 334) < 0) {
         var3 = 0;
      } else if (var3 > 100) {
         var3 = 100;
      }

      var31 = ((aH - aN) * var3 / 100 + aN) * var31 / 256;
      double var16 = 6.283185307179586D - var0;
      double var18 = 6.283185307179586D - var4;
      double var22 = (double)var31;
      double var24 = Math.sin(var16);
      double var26;
      double var28 = (var26 = Math.cos(var16)) * 0.0D - var24 * var22;
      var22 = var26 * var22 + var24 * 0.0D;
      double var20 = var28;
      var24 = Math.sin(var18);
      var26 = Math.cos(var18);
      var28 = var24 * var22 + var26 * 0.0D;
      var22 = var26 * var22 - var24 * 0.0D;
      if (!cu) {
         bB = var6 - var28;
         bD = var10 - var20;
         bQ = var8 - var22;
         bJ = var0;
         H = var4;
      } else {
         bB = (double)osrs.l.d;
         bQ = (double)osrs.fk.b;
         bD = (double)jD.b;
         bJ = (double)osrs.dB.a * 0.0030679615757712823D;
         H = (double)osrs.gv.a * 0.0030679615757712823D;
      }

      for(int var30 = 0; var30 < 5; ++var30) {
         if (fR[var30] && !fD) {
            int var1 = (int)(Math.random() * (double)((eY[var30] << 1) + 1) - (double)eY[var30] + Math.sin((double)fk[var30] * ((double)fn[var30] / 100.0D)) * (double)fq[var30]);
            if (var30 == 0) {
               osrs.l.d += var1;
               bB += (double)var1;
            }

            if (var30 == 1) {
               jD.b += var1;
               bD += (double)var1;
            }

            if (var30 == 2) {
               osrs.fk.b += var1;
               bQ += (double)var1;
            }

            if (var30 == 3) {
               H = (double)(osrs.gv.a = var1 + osrs.gv.a & 2047) * 0.0030679615757712823D;
            }

            if (var30 == 4) {
               bJ = (double)(osrs.dB.a = Ints.constrainToRange(osrs.dB.a += var1, by ? 0 : 128, by ? 512 : 383)) * 0.0030679615757712823D;
            }
         }
      }

   }

   @ObfuscatedName("yp")
   @ObfuscatedSignature(
      signature = "(Lxy;Lrl4;II)V"
   )
   private static void a(jy var0, ky var1, int var2, int var3) {
      int var4 = var0.c;
      int var5 = var0.d;
      int var6 = var0.i;
      int var7 = var0.p;
      osrs.cm.e(var4 + 2, var5, var6 - 4, 7170651, var2);
      osrs.cm.e(var4 + 2, var5 + var7 - 1, var6 - 4, 7170651, var2);
      osrs.cm.f(var4, var5 + 2, var7 - 4, 7170651, var2);
      osrs.cm.f(var4 + var6 - 1, var5 + 2, var7 - 4, 7170651, var2);
      osrs.cm.f(var4 + 1, var5 + 5, var7 - 6, 2827810, var2);
      osrs.cm.f(var4 + var6 - 2, var5 + 5, var7 - 6, 2827810, var2);
      osrs.cm.e(var4 + 1, var5 + 17, var6 - 2, 2827810, var2);
      osrs.cm.e(var4 + 1, var5 + var7 - 2, var6 - 2, 2827810, var2);
      osrs.cm.b(var4 + 2, var5 + var7 - 3, 0, 2827810, var2);
      osrs.cm.b(var4 + var6 - 3, var5 + var7 - 3, 0, 2827810, var2);
      osrs.cm.a(var4 + 2, var5 + 1, var6 - 4, 16, 3288610, 592388, var2, var2);
      osrs.cm.b(var4 + 1, var5 + 1, 2, 4, 2827810, var2);
      osrs.cm.b(var4 + var6 - 3, var5 + 1, 2, 4, 2827810, var2);
      osrs.cm.e(var4 + 2, var5 + 18, var6 - 4, 5392957, var2);
      osrs.cm.e(var4 + 3, var5 + var7 - 3, var6 - 6, 5392957, var2);
      osrs.cm.f(var4 + 2, var5 + 18, var7 - 21, 5392957, var2);
      osrs.cm.f(var4 + var6 - 3, var5 + 18, var7 - 21, 5392957, var2);
      osrs.cm.b(var4 + 3, var5 + 19, var6 - 6, var7 - 22, 2828060, var2);
      osrs.cm.b(var4 + 1, var5 + 1, 0, 7170651, var2);
      osrs.cm.b(var4 + var6 - 2, var5 + 1, 0, 7170651, var2);
      osrs.cm.b(var4 + 1, var5 + var7 - 2, 0, 7170651, var2);
      osrs.cm.b(var4 + var6 - 2, var5 + var7 - 2, 0, 7170651, var2);
      String var11 = var1 == null ? "Choose Option" : var1.getTarget();
      osrs.hf.a.d(var11, var4 + 3, var5 + 14, 13023381, -1);
      int var12 = osrs.gY.j;
      var7 = osrs.gY.b;

      for(int var8 = 0; var8 < var0.h; ++var8) {
         if (var0.h - 1 - var8 >= var3) {
            int var9 = var5 + (var0.h - 1 - var8 - var3) * 15 + 31;
            String var10 = var0.f[var8];
            if (!var0.e[var8].isEmpty()) {
               if (!var10.isEmpty()) {
                  var10 = var10 + " ";
               }

               var10 = var10 + var0.e[var8];
            }

            if (var0.n[var8] != null) {
               var10 = var10 + " <col=ffffff><gt>";
            }

            osrs.hf.a.d(var10, var4 + 3, var9, 13023381, -1);
            if (var12 > var4 && var12 < var6 + var4 && var7 > var9 - 13 && var7 < var9 + 3) {
               osrs.cm.b(var4 + 3, var9 - 12, var6 - 6, 15, 16777215, 80);
            }

            if (var8 == var0.o && var0.n[var8] != null && var0.n[var8].h > 0) {
               a(var0.n[var8], var0.q[var8], var2, K);
            }
         }
      }

   }

   @ObfuscatedName("xl")
   public static void a(int[] var0, int var1, int var2, int var3) {
      if (osrs.dF.c.isGpu()) {
         client var10001 = osrs.dF.c;
         if (var0 == osrs.fH.d.getPixels()) {
            var3 += (var0[var1] >>> 24) * (255 - var3) * '肁' >>> 23;
            var0[var1] = var2 & 16777215 | var3 << 24;
            return;
         }
      }

      var0[var1] = var2;
   }

   @ObfuscatedName("yt")
   @ObfuscatedSignature(
      signature = "(Lja;IIIIIIIII)Z"
   )
   public static boolean a(cb var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var18;
      if (!osrs.cf.e) {
         int var10 = osrs.cc.d.c;
         int var11 = osrs.cc.d.f;
         int var12 = osrs.cc.d.i;
         int var13 = (osrs.cf.b - var10) * 50 / var12;
         int var14 = (osrs.cf.f - var11) * 50 / var12;
         var10 = (osrs.cf.b - var10) * 13312 / var12;
         var11 = (osrs.cf.f - var11) * 13312 / var12;
         gL var19;
         (var19 = osrs.gL.c(var0.d)).d();
         float[] var17 = var0.c;
         var19.a((float)var13, (float)var14, 50.0F, var17);
         var13 = (int)var17[0];
         var14 = (int)var17[1];
         int var15 = (int)var17[2];
         var19.a((float)var10, (float)var11, 13312.0F, var17);
         var10 = (int)var17[0];
         var11 = (int)var17[1];
         var18 = (int)var17[2];
         var19.c();
         osrs.ar.a = (var10 + var13) / 2;
         osrs.hn.a = (var11 + var14) / 2;
         osrs.av.a = (var18 + var15) / 2;
         osrs.bT.f = (var10 - var13) / 2;
         osrs.dj.a = (var11 - var14) / 2;
         osrs.bw.c = (var18 - var15) / 2;
         osrs.aJ.a = Math.abs(osrs.bT.f);
         osrs.bF.a = Math.abs(osrs.dj.a);
         hE.p = Math.abs(osrs.bw.c);
         osrs.ga.a(osrs.cf.g, (float)(var10 - var13), (float)(var11 - var14), (float)(var18 - var15));
         osrs.cf.g.a();
         osrs.cf.e = true;
      }

      var18 = var4 + var1;
      var1 = var5 + var2;
      var2 = var3 + var6;
      return a(var18, var1, var2, var7, var8, var9);
   }

   @ObfuscatedName("zg")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   private static void ah() {
      if (osrs.dF.c.ho) {
         osrs.dF.c.hq.setProperty("JX_ACCESS_TOKEN", gL == null ? "" : gL);
         osrs.dF.c.hq.setProperty("JX_REFRESH_TOKEN", osrs.ar.c == null ? "" : osrs.ar.c);
         osrs.dF.c.ag();
      }

   }

   @ObfuscatedName("xk")
   @ObfuscatedSignature(
      signature = "(ZLwx;)V"
   )
   public static void t() {
      bO = null;
   }

   @ObfuscatedName("yz")
   public static void k(int var0) {
      int var1 = gq[var0];
      int var2 = osrs.ej.d[var0];
      int var3 = var1 ^ var2;
      int var4;
      if ((var4 = Arrays.binarySearch(fM, var0 << 16)) < 0) {
         var4 = -var4 - 1;
      }

      for(; var4 < fM.length; ++var4) {
         int var5 = fM[var4] >> 16;
         if (var0 != var5) {
            break;
         }

         var5 = fM[var4] & '\uffff';
         int var6 = fX[var5] >> 8 & 255;
         int var7 = fX[var5] & 255;
         var6 = osrs.ej.a[var6 - var7] << var7;
         if (((var1 ^ var2) & var6) != 0) {
            var3 &= ~var6;
            var6 = (var2 & var6) >>> var7;
            VarbitChanged var9;
            (var9 = new VarbitChanged()).setVarpId(var0);
            var9.setVarbitId(var5);
            var9.setValue(var6);
            osrs.dF.c.getCallbacks().post(var9);
         }
      }

      if (var3 != 0) {
         VarbitChanged var8;
         (var8 = new VarbitChanged()).setVarpId(var0);
         var8.setValue(var2);
         osrs.dF.c.getCallbacks().post(var8);
      }

      gq[var0] = var2;
   }

   @ObfuscatedName("yq")
   @ObfuscatedSignature(
      signature = "(Ljg;)V"
   )
   public static void a(ci var0) {
      long[] var1 = var0.at;

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < var0.r; ++var3) {
            for(int var4 = 0; var4 < var0.D; ++var4) {
               int var5 = var0.a(var2, var3, var4);
               long var6 = 1080863910568919040L;
               cE var8;
               if ((var8 = var0.am[var5]) != null) {
                  var6 = 1080863910568919040L | (long)var8.getRBG() & 16777215L;
               }

               co var9;
               if ((var9 = var0.ax[var5]) != null) {
                  if (!dx && var8 != null) {
                     throw new AssertionError();
                  }

                  var6 |= ((long)var9.r & 15L) << 50 | ((long)var9.m & 3L) << 48 | ((long)var9.getModelOverlay() & 16777215L) << 24 | (long)var9.getModelUnderlay() & 16777215L;
               }

               if (var0.d(var5) && (var0.c[var2][var3][var4] & 24) == 0) {
                  var6 |= 18014398509481984L;
               }

               if (var2 < 3 && var0.d(var5 + var0.aq) && (var0.c[var2 + 1][var3][var4] & 8) != 0) {
                  var6 |= 36028797018963968L;
               }

               var1[var5] = var6;
            }
         }
      }

   }

   @ObfuscatedName("zx")
   public static String u() {
      return fH + null;
   }

   @ObfuscatedName("zm")
   public static boolean l(int var0) {
      int var1;
      int var2;
      int[] var3;
      if (var0 == 6599) {
         if (!dx && V.getInstructions()[bF] != 6599) {
            throw new AssertionError();
         } else {
            var0 = osrs.dF.c.getObjectStackSize();
            Object[] var6 = osrs.dF.c.getObjectStack();
            --var0;
            String var5 = (String)var6[var0];
            osrs.dF.c.setObjectStackSize(var0);
            if ("debug".equals(var5)) {
               var1 = osrs.dF.c.getIntStackSize();
               var6 = osrs.dF.c.getObjectStack();
               --var0;
               String var10 = (String)var6[var0];
               StringBuffer var9 = new StringBuffer();
               Matcher var7 = Pattern.compile("%(.)").matcher(var10);

               while(var7.find()) {
                  var7.appendReplacement(var9, "");
                  switch(var7.group(1).charAt(0)) {
                  case 'd':
                  case 'i':
                     var3 = osrs.dF.c.getIntStack();
                     --var1;
                     var9.append(var3[var1]);
                     break;
                  case 's':
                     var6 = osrs.dF.c.getObjectStack();
                     --var0;
                     var9.append((String)var6[var0]);
                     break;
                  default:
                     var9.append(var7.group(0)).append("=unknown");
                  }
               }

               var7.appendTail(var9);
               cV.debug(var9.toString());
               osrs.dF.c.setObjectStackSize(var0);
               osrs.dF.c.setIntStackSize(var1);
               return true;
            } else if ("mes".equals(var5)) {
               var1 = osrs.dF.c.getIntStackSize();
               var3 = osrs.dF.c.getIntStack();
               --var1;
               var2 = var3[var1];
               var6 = osrs.dF.c.getObjectStack();
               --var0;
               String var4 = (String)var6[var0];
               osrs.dF.c.setObjectStackSize(var0);
               osrs.dF.c.setIntStackSize(var1);
               osrs.dF.c.addChatMessage(ChatMessageType.of(var2), "", var4, (String)null, true);
               return true;
            } else {
               ScriptCallbackEvent var8;
               (var8 = new ScriptCallbackEvent()).setScript(V);
               var8.setEventName(var5);
               osrs.dF.c.getCallbacks().post(var8);
               return true;
            }
         }
      } else {
         if (var0 == 40) {
            var0 = V.getIntOperands()[bF];
            osrs.dF.c.getCallbacks().post(new ScriptPreFired(var0));
         } else if (var0 == 21) {
            osrs.dF.c.getCallbacks().post(new ScriptPostFired((int)V.getHash()));
         } else if (var0 == 5504) {
            var3 = osrs.dF.c.getIntStack();
            var2 = osrs.dF.c.getIntStackSize();
            var1 = var3[var2 - 2];
            var2 = var3[var2 - 1];
            if (!cu) {
               gY = (double)var2 * 0.0030679615757712823D;
               gc = (double)var1 * 0.0030679615757712823D;
            }
         } else if (var0 == 3214 && osrs.dF.c.getIntStack()[osrs.dF.c.getIntStackSize() - 1] == 25) {
            osrs.dF.c.getIntStack()[osrs.dF.c.getIntStackSize() - 1] = 0;
            return true;
         }

         return false;
      }
   }

   @ObfuscatedName("xp")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   private static void ai() {
      if (az == 0) {
         osrs.bs.j = (int)fV;
      } else {
         fV = (double)osrs.bs.j;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(Lcs;)V"
   )
   public static void a(jK var0) {
      if (!osrs.dF.c.isClientThread()) {
         if (!osrs.fs.q) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (!dx && V != null) {
         throw new AssertionError("scripts are not reentrant");
      } else {
         client var10000 = osrs.dF.c;
         a((jK)var0, 5000000, 0);
         boolean var1 = false;
         if (!dx) {
            var1 = true;
         }

         Object[] var11 = var0.getArguments();
         if (var1 && var11[0] instanceof Integer) {
            int var12 = (Integer)var11[0];
            long var9 = (long)var12;
            jI var2;
            if ((var2 = (jI)osrs.dX.a(jI.b, var9)) != null) {
               int var3 = 0;
               int var4 = 0;
               int var5 = 1;

               while(true) {
                  if (var5 >= var11.length) {
                     if (var3 != var2.f || var4 != var2.e) {
                        throw new AssertionError("Script " + var12 + " was called with the incorrect number of arguments; takes " + var2.f + "+" + var2.e + ", got " + var3 + "+" + var4);
                     }
                     break;
                  }

                  if (var11[var5] instanceof Integer) {
                     ++var3;
                  } else {
                     ++var4;
                  }

                  ++var5;
               }
            }
         }

      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   private static void aj() {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "609156043"
   )
   public static void v() {
      osrs.aO.a.b();
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "(Ldl;ZLwx;)V"
   )
   public static void a(kd var0) {
      if (var0.isTopLevel() && S && osrs.dF.c.getGameState() == GameState.LOGGED_IN) {
         S = false;
         fd var10;
         if ((var10 = osrs.dF.c.i(7602286)) != null && var10.getChildren() != null && var10.getChildren().length > 0) {
            int var1 = var10.getChildren().length;
            var1 = Ints.constrainToRange((osrs.j.aS.n * var1 + 255) / 256, 0, var1 - 1);
            Widget var2;
            if ((var2 = var10.getChild(var1)) != null) {
               Object[] var3 = var2.getOnOpListener();
               boolean var4 = dU;

               try {
                  var2.setOnOpListener((Object[])null);
                  dU = false;
                  client var10000 = osrs.dF.c;
                  int var11 = var10.getId();
                  int var5 = MenuAction.CC_OP.getId();
                  String var6 = "";
                  String var7 = "";
                  osrs.fw.a(var1, var11, var5, 1, -1, -1, var7, var6, -1, -1);
               } finally {
                  var2.setOnOpListener(var3);
                  dU = var4;
               }
            }
         }
      }

      jE.a = true;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   private static void ak() {
      if (!by) {
         gb = dk;
      } else {
         int var0;
         if (az == 0) {
            var0 = osrs.C.b >> 7;
            int var1 = osrs.bs.j >> 7;
            kd var2;
            int var3 = (var2 = osrs.aM.a).getPlane();
            int var6 = osrs.bs.j;
            int var5 = osrs.C.b;
            int var4 = osrs.bW.a(var2, var5, var6, var3);
            var5 = 0;
            if (var0 > 3 && var1 > 3 && var0 < 100 && var1 < 100) {
               for(var6 = var0 - 4; var6 <= var0 + 4; ++var6) {
                  for(int var7 = var1 - 4; var7 <= var1 + 4; ++var7) {
                     int var8 = var3;
                     if (var3 < 3 && (var2.q[1][var6][var7] & 2) == 2) {
                        var8 = var3 + 1;
                     }

                     if ((var8 = var4 - var2.s[var8][var6][var7]) > var5) {
                        var5 = var8;
                     }
                  }
               }
            }

            if ((var0 = var5 << 7) > 98048) {
               var0 = 98048;
            }

            if (var0 < 0) {
               var0 = 0;
            }
         } else {
            var0 = 0;
         }

         int var10002;
         if (var0 > gb) {
            var10002 = gb;
            gb = var10002 + (var0 - var10002) / 24;
         } else if (var0 < gb) {
            var10002 = gb;
            gb = var10002 + (var0 - var10002) / 80;
         }

         dk = gb;
      }
   }

   @ObfuscatedName("by")
   public static void m(int var0) {
      osrs.dg.a(var0);
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      signature = "(Lcz;Z)V"
   )
   public static void a(jR var0, boolean var1) {
      osrs.dF.c.getCallbacks().post(new WidgetClosed(var0.getId(), var0.getModalMode(), var1));
      if (var1) {
         int var2;
         a(var2 = var0.getId(), cf);
         a(var2, cp);
         a(var2, bS);
      }

   }

   @ObfuscatedName("ck")
   public static void w() {
      boolean var0;
      do {
         var0 = true;

         for(int var1 = 0; var1 < osrs.cf.d - 1; ++var1) {
            if (hb[var1] < hb[var1 + 1]) {
               long var2 = osrs.cf.a[var1];
               long[] var10002 = osrs.cf.a;
               var10002[var1] = var10002[var1 + 1];
               osrs.cf.a[var1 + 1] = var2;
               int var4 = hb[var1];
               int[] var5 = hb;
               var5[var1] = var5[var1 + 1];
               hb[var1 + 1] = var4;
               var0 = false;
            }
         }
      } while(!var0);

   }

   @ObfuscatedName("cl")
   public static boolean b(int var0, int var1, int var2, int var3) {
      int var4 = osrs.gY.j;
      int var5 = osrs.gY.b;
      return var4 >= var0 && var5 >= var1 && var4 < var2 && var5 < var3;
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void x() {
      osrs.dF.c.getCallbacks().post(new CanvasSizeChanged());
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void y() {
      if (osrs.dr.a != null && !"cache io".equals(osrs.dr.a.getName())) {
         osrs.dr.a.setName("cache io");
      }

   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      signature = "(Ljg;IIIIIII)V"
   )
   public static void a(ci var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      long var8;
      int var10;
      int var11;
      int var12;
      client var10000;
      if (((var8 = var0.at[var1]) & 72057594037927936L) != 0L) {
         cS var13 = var0.au[var1];
         boolean var14 = false;
         if (var13 != null) {
            var11 = (var10 = var13.getConfig()) & 31;
            var10 = var10 >> 6 & 3;
            int var15 = (var13.getHash() >>> 19 & 1L) == 0L ? fO : eU * -986955245;
            if ((var8 & 144115188075855872L) != 0L) {
               var10000 = osrs.dF.c;
               if (a(D(var13.getId()), var2, var3)) {
                  var14 = true;
               } else {
                  var8 &= -144115188075855873L;
               }
            }

            if ((var8 & 144115188075855872L) == 0L) {
               if (var11 == 0 || var11 == 2) {
                  var14 = true;
                  if ((var10 & 1) == 0) {
                     osrs.cm.c(var10 == 2 ? var6 - 1 : var4, var5, var7 - var5, var15);
                  } else {
                     osrs.cm.a(var4, var10 == 3 ? var7 - 1 : var5, var6 - var4, var15);
                  }
               }

               if (var11 == 3) {
                  var14 = true;
                  boolean var16 = var10 == 0 || var10 == 3;
                  boolean var17 = var10 < 2;
                  var12 = Math.max(1, (var6 - var4) / 4);
                  int var18 = Math.max(1, (var7 - var5) / 4);
                  osrs.cm.a(var16 ? var4 : var6 - var12, var17 ? var5 : var7 - var18, var12, var18, var15);
               }

               if (var11 == 2) {
                  if ((var10 & 1) == 1) {
                     osrs.cm.c(var10 == 1 ? var6 - 1 : var4, var5, var7 - var5, var15);
                  } else {
                     osrs.cm.a(var4, var10 == 2 ? var7 - 1 : var5, var6 - var4, var15);
                  }
               }
            }
         }

         if (!var14) {
            var8 &= -72057594037927937L;
         }
      }

      boolean var19;
      if ((var8 & 288230376151711744L) != 0L) {
         var19 = false;
         cJ var21 = null;

         for(var10 = 0; var10 < 5; ++var10) {
            cJ var20;
            if ((var20 = var0.af[var1 * 5 + var10]) != null && (var20.l * 2077236679447563891L * -2880859857278335301L >>> 16 & 7L) == 2L && var20.g == var2 && var20.f == var3) {
               var21 = var20;
               break;
            }
         }

         if (var21 != null) {
            var11 = (var10 = var21.getConfig()) & 31;
            var10 = var10 >> 6 & 3;
            var10000 = osrs.dF.c;
            if (a(D(var21.getId()), var2, var3)) {
               var19 = true;
            } else if (var11 == 9) {
               var19 = true;
               int var22 = (var21.getHash() >>> 19 & 1L) == 0L ? 15597568 : 15658734;
               int var24;
               if (var10 != 0 && var10 != 2) {
                  var24 = var5;
                  var12 = var7 - 1;
               } else {
                  var24 = var7 - 1;
                  var12 = var5;
               }

               osrs.cm.d(var4, var24, var6 - 1, var12, var22);
            }
         }

         if (!var19) {
            var8 &= -288230376151711745L;
         }
      }

      if ((var8 & 576460752303423488L) != 0L) {
         var19 = false;
         ce var23;
         if ((var23 = var0.aj[var1]) != null) {
            var10000 = osrs.dF.c;
            if (a(D(var23.getId()), var2, var3)) {
               var19 = true;
            }
         }

         if (!var19) {
            var8 &= -576460752303423489L;
         }
      }

      var0.at[var1] = var8;
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void z() {
      if (fQ != null) {
         jR.a = fQ;
      }

   }

   @ObfuscatedName("cy")
   private static void al() {
      dQ var0 = osrs.X.a(osrs.j.H, P.f);
      P.a(var0);
   }

   @ObfuscatedName("de")
   public static long a(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
      long var7 = (long)(var1 & 127 | (var2 & 127) << 7 | (var0 & 3) << 14 | 131072) | ((long)var5 & 4294967295L) << 20 | ((long)var6 & 4095L) << 52;
      if (var4) {
         var7 |= 524288L;
      }

      return var7;
   }

   @ObfuscatedName("dv")
   public static void a(kx var0) {
      kd var1;
      ci var2 = (var1 = var0.n).o;
      var1.o = var0.j;
      var1.o.d = var1;
      var1.o.o = var2.o;
      var1.o.w = var2.w;
      var1.o.B = var2.B;
      var1.o.p = var2.p;
      var1.o.s = var2.s;
      cy var4 = var2.k;
      var1.o.k.a(var4);
      var2.c();
      var1.s = var0.h;
      var1.q = var0.r;
      var1.j = var0.c;
      DrawCallbacks var5;
      if ((var5 = var0.g) != null && var5 == dd && (E & 16) != 0) {
         var5.swapScene(var1.o);
      }

      var1.o.g();
   }

   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      signature = "(Ljg;II)V"
   )
   private static void a(ci var0, int var1, int var2) {
      if (var0.R != -1) {
         var0.R -= var1;
         var0.E -= var2;
      }

      if (var0.v != -1) {
         var0.v -= var1;
         var0.n -= var2;
      }

      if (var0.g != var0.an - 1) {
         var0.g -= var1;
         var0.h -= var2;
      }

   }

   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      signature = "(Ldl;Lwd;DIIIII)V"
   )
   public static void a(kd var0, iT var1, double var2, int var4, int var5, int var6, int var7, int var8) {
      Arrays.fill(var1.getPixels(), 0);
      var1.c();
      osrs.cm.d();
      osrs.cc.d.e = true;
      osrs.cc.d.l = 0;
      gg = var1;
      hl = var2;
      fJ = var5;
      fK = var6;
      fZ = var7;
      gr = var8;

      try {
         a(var0, var4, var5, var6, var7, var8, bE);
         a(var0, var4, var5, var6, var7, var8, client::a);
      } finally {
         osrs.cm.c();
         osrs.cm.d();
      }

   }

   @ObfuscatedName("eh")
   private static void a(client var0, byte var1) {
      if (osrs.ec.f.a >= 4) {
         osrs.fs.a(var0, "js5crc", (byte)0);
         jT.d(1000);
      } else {
         if (osrs.ec.f.d >= 4) {
            if (aa <= 5) {
               osrs.fs.a(var0, "js5io", (byte)0);
               jT.d(1000);
               return;
            }

            gw = 3000;
            osrs.ec.f.d = 3;
         }

         if (--gw + 1 <= 0) {
            try {
               if (gu == 0) {
                  int var3 = fA;
                  String var2 = fz;
                  osrs.aL.c = osrs.fs.g.a(1, var3, var2);
                  ++gu;
               }

               if (gu == 1) {
                  if (osrs.aL.c.f == 2) {
                     var0.z(-1);
                     return;
                  }

                  if (osrs.aL.c.f == 1) {
                     ++gu;
                  }
               }

               if (gu == 2) {
                  osrs.n.a = osrs.fn.a((Socket)osrs.aL.c.d, 40000, 5000);
                  jk var5;
                  (var5 = new jk(osrs.dU.c.k + 1)).b(osrs.dU.c.j);
                  var5.c(231);
                  var5.c(gN[0]);
                  var5.c(gN[1]);
                  var5.c(gN[2]);
                  var5.c(gN[3]);
                  osrs.n.a.a(var5.d, 0, osrs.dU.c.k + 1);
                  ++gu;
                  osrs.eU.a = osrs.au.a();
               }

               if (gu == 3) {
                  if (osrs.n.a.c() > 0) {
                     int var6;
                     if ((var6 = osrs.n.a.b()) != 0) {
                        var0.z(var6);
                        return;
                     }

                     ++gu;
                  } else if (osrs.au.a() - osrs.eU.a > 30000L) {
                     var0.z(-2);
                     return;
                  }
               }

               if (gu == 4) {
                  osrs.ec.f.a(osrs.n.a, aa > 20);
                  osrs.aL.c = null;
                  osrs.n.a = null;
                  gu = 0;
                  gz = 0;
               }

               return;
            } catch (IOException var4) {
               var0.z(-3);
            }
         }

      }
   }

   @ObfuscatedName("ei")
   public static void c(int var0, int var1, int var2, int var3) {
      dQ var4;
      (var4 = osrs.X.a(osrs.j.al, P.f)).g.b(18);
      jk.d(var4.g, aU.c(82) ? (aU.c(81) ? 2 : 1) : 0);
      jk.g(var4.g, var0 + osrs.aM.a.n);
      var4.g.o(var1 + osrs.aM.a.i);
      var4.g.b(var2);
      var4.g.b(var3);
      var4.g.d(cd);
      var4.g.b(57);
      var4.g.b(0);
      var4.g.b(0);
      var4.g.b(89);
      var4.g.d(osrs.ai.a.s);
      var4.g.d(osrs.ai.a.n);
      var4.g.b(63);
      P.a(var4);
      eO = var0;
      eM = var1;
   }

   @ObfuscatedName("ek")
   public static void n(int var0) {
      if (var0 == osrs.dF.c.getTopLevelInterfaceId() && hg != 0) {
         ci = hg;
         hg = 0;
      }

   }

   @ObfuscatedName("fc")
   public static void A() {
   }

   @ObfuscatedName("fi")
   private static int F(int var0) {
      int var1 = var0 >> 2;
      var0 &= 3;
      double var3;
      var1 = (int)(var3 = (double)(gg.getHeight() - gr) - (double)(var1 - fK) * hl);
      int var2 = (int)(var3 - hl);
      return var1 + ((var2 - var1) * var0 >> 2);
   }

   @ObfuscatedName("fo")
   public static boolean o(int var0) {
      return (gS & var0) != 0;
   }

   @ObfuscatedName("fw")
   public static void p(int var0) {
      if (var0 != -1) {
         client var10000 = osrs.dF.c;
         fi var1;
         if ((var1 = bc[var0]) != null) {
            GrandExchangeOfferChanged var2;
            (var2 = new GrandExchangeOfferChanged()).setOffer(var1);
            var2.setSlot(var0);
            osrs.dF.c.getCallbacks().post(var2);
         }
      }

   }

   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void B() {
      if (osrs.gY.c > 0) {
         fY = (int)((System.nanoTime() - fI) / 20000000L);
      } else {
         fY = 0;
         fI = System.nanoTime();
      }

      osrs.gY.c = fY * 15000 / Q;
   }

   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void C() {
      osrs.dF.c.getCallbacks().post(new UsernameChanged());
   }

   @ObfuscatedName("gb")
   private static void am() {
      int var0;
      for(var0 = dT.h - 1; var0 >= 0 && dT.k[var0] != MenuAction.WALK.getId(); --var0) {
      }

      if (var0 >= 0) {
         for(int var1 = dT.h - 1; var1 >= 0; --var1) {
            int var2;
            if ((var2 = dT.k[var1]) >= 2000) {
               var2 -= 2000;
            }

            if (var2 == MenuAction.PLAYER_FIRST_OPTION.getId() || var2 == MenuAction.PLAYER_SECOND_OPTION.getId() || var2 == MenuAction.PLAYER_THIRD_OPTION.getId() || var2 == MenuAction.PLAYER_FOURTH_OPTION.getId() || var2 == MenuAction.PLAYER_FIFTH_OPTION.getId() || var2 == MenuAction.PLAYER_SIXTH_OPTION.getId() || var2 == MenuAction.PLAYER_SEVENTH_OPTION.getId() || var2 == MenuAction.PLAYER_EIGHTH_OPTION.getId()) {
               var1 = dT.g[var1];
               dT.g[var0] = var1 + 1;
               return;
            }
         }
      }

   }

   @ObfuscatedName("gn")
   private static double a(int var0, long var1) {
      double var3 = (double)var0 * 0.0030679615757712823D;
      double var5 = (double)var1 / 2.0E7D;
      return var3 * var5;
   }

   @ObfuscatedName("gq")
   private static void a(long var0, int var2) {
      if (osrs.cf.d < osrs.cf.a.length) {
         osrs.cf.a[osrs.cf.d] = var0;
         hb[osrs.cf.d] = var2;
         ++osrs.cf.d;
      }

   }

   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      signature = "(Ldl;Lip;IIIZ)V"
   )
   public static void a(kd var0, bP var1, int var2, int var3, int var4, boolean var5) {
      osrs.aV.a(var0, var1, var2, var3, var4, false);
   }

   @ObfuscatedName("gr")
   private static ClassLoader an() {
      try {
         String var0;
         if (Strings.isNullOrEmpty(var0 = System.getProperty("runelite.reflectcheck.jar"))) {
            return client.class.getClassLoader();
         } else {
            URLClassLoader var4;
            UnmodifiableIterator var1 = ClassPath.from(var4 = new URLClassLoader(new URL[]{(new File(var0)).toURI().toURL()}, ClassLoader.getPlatformClassLoader())).getTopLevelClasses().iterator();

            while(var1.hasNext()) {
               ((ClassInfo)var1.next()).load();
            }

            return var4;
         }
      } catch (Throwable var3) {
         throw new RuntimeException(var3);
      }
   }

   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      signature = "(Ldl;FFI)F"
   )
   private static float a(kd var0, float var1, float var2, int var3) {
      int var4 = (int)(var1 / 128.0F);
      int var5 = (int)(var2 / 128.0F);
      if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         int var6 = var3;
         if (var3 < 3 && (var0.q[1][var4][var5] & 2) == 2) {
            var6 = var3 + 1;
         }

         var1 %= 128.0F;
         var2 %= 128.0F;
         float var8 = ((128.0F - var1) * (float)var0.s[var6][var4][var5] + var1 * (float)var0.s[var6][var4 + 1][var5]) / 128.0F;
         float var7 = ((float)var0.s[var6][var4][var5 + 1] * (128.0F - var1) + var1 * (float)var0.s[var6][var4 + 1][var5 + 1]) / 128.0F;
         return (var2 * var7 + var8 * (128.0F - var2)) / 128.0F;
      } else {
         return 0.0F;
      }
   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void D() {
      DraggingWidgetChanged var0;
      (var0 = new DraggingWidgetChanged()).setDraggingWidget(osrs.dF.c.isDraggingWidget());
      osrs.dF.c.getCallbacks().post(var0);
   }

   @ObfuscatedName("ha")
   public static void E() {
      if (gp + 1 == bA) {
         osrs.dF.c.fx.serverTick();
      }

      gp = bA;
   }

   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      signature = "(Ldl;ZLwx;)V"
   )
   public static void b(kd var0) {
      Iterator var1 = I.iterator();

      while(var1.hasNext()) {
         NpcSpawned var2 = (NpcSpawned)var1.next();
         osrs.dF.c.getCallbacks().post(var2);
      }

      I.clear();
      var1 = eb.iterator();

      while(var1.hasNext()) {
         NpcChanged var7 = (NpcChanged)var1.next();
         osrs.dF.c.getCallbacks().post(var7);
      }

      eb.clear();
      jE.a = false;

      for(int var8 = 0; var8 < var0.f.a; ++var8) {
         gg var10000 = var0.g;
         long var5 = (long)var0.f.a(var8);
         ((kc)var10000.a(var5)).p();
      }

   }

   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void F() {
      Callbacks var10000 = osrs.dF.c.getCallbacks();
      client var10003 = osrs.dF.c;
      var10000.post(new ClanChannelChanged(ik.a, -1, true));
   }

   @ObfuscatedName("ho")
   public static ClanRank q(int var0) {
      return new ClanRank(var0);
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      signature = "(Ldl;F)V"
   )
   private static void a(kd var0, float var1) {
      Iterator var2 = var0.players().iterator();

      while(var2.hasNext()) {
         jG var3;
         if ((var3 = (jG)var2.next()) != null) {
            jE.a(var3, var1);
         }
      }

      var2 = var0.npcs().iterator();

      while(var2.hasNext()) {
         kc var4;
         if ((var4 = (kc)var2.next()) != null) {
            jE.a(var4, var1);
         }
      }

      var2 = var0.worldEntities().iterator();

      while(var2.hasNext()) {
         hG var5;
         if ((var5 = (hG)var2.next()) != null) {
            var5.e.o.A = -1;
            var5.a(Z);
            a(var5.e, var1);
         }
      }

   }

   @ObfuscatedName("ia")
   public static void G() {
      osrs.dF.c.getCallbacks().post(new WorldChanged());
   }

   @ObfuscatedName("if")
   public static int H() {
      return osrs.gY.k != 0 ? osrs.gY.g : osrs.gY.j;
   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      signature = "(IILwd;II)V"
   )
   private static void a(int var0, int var1, iT var2, int var3, int var4) {
      var3 = var4 + cd & 2047;
      var0 -= 30 * Perspective.SINE[var3] >> 16;
      var1 += 30 * Perspective.COSINE[var3] >> 16;
      var4 = Math.max(var2.getWidth(), var2.getHeight()) / 2;
      iT var10000 = var2;
      int var10001 = var0 - var4;
      int var10002 = var1 - var4;
      int var10003 = var2.getWidth();
      int var10004 = var2.getHeight();
      int var10005 = var2.getWidth() / 2;
      int var10006 = var2.getHeight() / 2;
      double var10007 = (double)var3 * 0.0030679615757712823D;
      boolean var18 = true;
      double var16 = var10007;
      int var6 = var10006;
      int var5 = var10005;
      var4 = var10004;
      var3 = var10003;
      int var19 = var10002;
      var1 = var10001;
      var10000.a(var1, var19, var3, var4, var5, var6, var16, 256);
   }

   @ObfuscatedName("ii")
   public static int c(int var0, int var1) {
      if (var0 >= 0 && var0 < fX.length) {
         int var2;
         if ((var2 = fX[var0]) == 0) {
            throw new IndexOutOfBoundsException("Varbit " + var0 + " does not exist");
         } else {
            var0 = var2 & 255;
            var2 = var2 >> 8 & 255;
            var2 = osrs.ej.a[var2 - var0];
            return var1 >> var0 & var2;
         }
      } else {
         throw new IndexOutOfBoundsException("Varbit " + var0 + " does not exist");
      }
   }

   @ObfuscatedName("in")
   private static void G(int var0) {
      if (var0 != -1) {
         var0 = var0 - 1 & 31;
         var0 = eo[var0];
         Skill[] var1 = Skill.values();
         if (var0 >= 0 && var0 < var1.length) {
            int[] var2 = osrs.dF.c.getSkillExperiences();
            int[] var3 = osrs.dF.c.getBoostedSkillLevels();
            int[] var4 = osrs.dF.c.getRealSkillLevels();
            StatChanged var5 = new StatChanged(var1[var0], var2[var0], var4[var0], var3[var0]);
            osrs.dF.c.getCallbacks().post(var5);
         }
      }

   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      signature = "(Ldl;III)V"
   )
   public static void a(kd var0, int var1, int var2, int var3) {
      kB var4 = var0.o.ae[var1][var2][var3];
      fU var5 = var0.x[var1][var2][var3];
      fU var6 = var0.v[var1][var2][var3];
      if (osrs.dF.c.getGameState() != GameState.LOGGED_IN) {
         var0.x[var1][var2][var3] = var6;
         kk.a = null;
      } else {
         kk var7;
         ItemDespawned var8;
         if (var5 != var6) {
            if (var5 != null) {
               for(var7 = (kk)osrs.fU.e(var5); var7 != null; var7 = (kk)osrs.fU.b(var5)) {
                  var8 = new ItemDespawned(var4, var7);
                  osrs.dF.c.getCallbacks().post(var8);
               }
            }

            var0.x[var1][var2][var3] = var6;
         }

         if ((var7 = kk.a) != null) {
            kk.a = null;
         }

         if (var6 == null) {
            if (var7 != null) {
               var8 = new ItemDespawned(var4, var7);
               osrs.dF.c.getCallbacks().post(var8);
               return;
            }
         } else {
            hR var14 = var6.a;
            kk var10 = null;
            hR var11 = var14.cg;
            if (var14 != var11) {
               kk var12 = (kk)var11;
               if (var2 != var12.k || var3 != var12.l) {
                  var10 = var12;
               }
            }

            hR var13 = var14.ch;
            if (var10 == null && var14 != var13) {
               kk var15 = (kk)var13;
               if (var2 != var15.k || var3 != var15.l) {
                  var10 = var15;
               }
            }

            if (var7 != null && var7 != var11 && var7 != var13) {
               var8 = new ItemDespawned(var4, var7);
               osrs.dF.c.getCallbacks().post(var8);
            }

            if (var10 != null) {
               var10.k = var2;
               var10.l = var3;
               var10.j = var0.getId();
               ItemSpawned var16 = new ItemSpawned(var4, var10);
               osrs.dF.c.getCallbacks().post(var16);
            }
         }

      }
   }

   @ObfuscatedName("is")
   public static String b(String var0) {
      return osrs.dF.c.c(var0);
   }

   @ObfuscatedName("jm")
   public static void b(kx var0) {
      kd var1 = var0.n;
      var0.j.a(var1.o.X, var1.o.J, var1.o.P, var1.o.F, var1.o.M);
      var0.j.ai = var1.o.ai;
      var0.j.R = var1.o.R;
      var0.j.E = var1.o.E;
      var0.j.y = var1.o.y;
      var0.j.v = var1.o.v;
      var0.j.n = var1.o.n;
      ci var2 = var1.o;
      var1.o = var0.j;
      var1.o.d = var1;
      var2.c();
      var1.s = var0.d;
      var1.q = var0.p;
      var1.j = var0.c;

      for(ik var8 = (ik)osrs.fU.e(var1.u); var8 != null; var8 = (ik)osrs.fU.b(var1.u)) {
         if (var8.f == -1) {
            boolean var5 = false;
            var8.e = 0;
            osrs.cS.a(var1, var8);
         } else {
            osrs.gk.a(var8);
         }
      }

      osrs.df.c();
      var1.p.a(var0.o);

      for(gD var9 = (gD)osrs.fU.e(var1.p); var9 != null; var9 = (gD)osrs.fU.b(var1.p)) {
         if (var9.b != null) {
            var9.c();
            if (var9.e != null) {
               var9.j = var9.o + (int)(Math.random() * (double)(var9.d * 316223597 - var9.o));
            }
         }
      }

      for(int var10 = 0; var10 < 104; ++var10) {
         for(int var3 = 0; var3 < 104; ++var3) {
            int var12 = var1.m;
            osrs.br.a(var1, var12, var10, var3);
         }
      }

      var0.j.as = true;
      var0.j.f();
      cj = false;
      DrawCallbacks var11;
      if ((var11 = var0.g) != null && var11 == dd) {
         var11.swapScene(var1.o);
      }

      al();
      var1.o.g();
   }

   @ObfuscatedName("jq")
   public static void a(Throwable var0) {
      cV.error("Error initializing sound engine. Audio will be unavailable.", var0);
   }

   @ObfuscatedName("kb")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void I() {
      cd = a(gY);
      bW = a(gc);
   }

   @ObfuscatedName("ke")
   public static void r(int var0) {
      MenuAction[] var1 = new MenuAction[]{MenuAction.PLAYER_FIRST_OPTION, MenuAction.PLAYER_SECOND_OPTION, MenuAction.PLAYER_THIRD_OPTION, MenuAction.PLAYER_FOURTH_OPTION, MenuAction.PLAYER_FIFTH_OPTION, MenuAction.PLAYER_SIXTH_OPTION, MenuAction.PLAYER_SEVENTH_OPTION, MenuAction.PLAYER_EIGHTH_OPTION};
      if (var0 >= 0 && var0 < var1.length) {
         MenuAction var2 = var1[var0];
         osrs.dF.c.getPlayerMenuTypes()[var0] = var2.getId();
      }

      PlayerMenuOptionsChanged var3;
      (var3 = new PlayerMenuOptionsChanged()).setIndex(var0);
      osrs.dF.c.getCallbacks().post(var3);
   }

   @ObfuscatedName("kp")
   public static int s(int var0) {
      if (var0 >= 0 && var0 < fX.length) {
         int var1;
         if ((var1 = fX[var0]) == 0) {
            throw new IndexOutOfBoundsException("Varbit " + var0 + " does not exist");
         } else {
            return var0 = var1 >> 16;
         }
      } else {
         throw new IndexOutOfBoundsException("Varbit " + var0 + " does not exist");
      }
   }

   @ObfuscatedName("kq")
   public static void t(int var0) {
      if (var0 == osrs.dF.c.getTopLevelInterfaceId() && dP) {
         jy var1;
         if (fe > 0 && dT.o >= 0 && (var1 = dT.n[dT.o]) != null && osrs.gY.j >= var1.c - 10 && osrs.gY.j <= var1.i + var1.c + 10 && osrs.gY.b >= var1.d - 10 && osrs.gY.b <= var1.d + var1.p + 10) {
            hg = ci;
            ci = 0;
            return;
         }

         if (osrs.gY.j >= dT.c - 10 && osrs.gY.j <= dT.i + dT.c + 10 && osrs.gY.b >= dT.d - 10 && osrs.gY.b <= dT.d + dT.p + 10 && gP > 0) {
            hg = ci;
            ci = 0;
         }
      }

   }

   @ObfuscatedName("kq")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   private static void ao() {
      if (az == 0) {
         osrs.cQ.a = (int)gQ;
      } else {
         gQ = (double)osrs.cQ.a;
      }
   }

   @ObfuscatedName("kv")
   private static void a(client var0, boolean var1, int var2) {
      osrs.ag.a(cc, osrs.fs.h, osrs.fs.a, var1);
   }

   @ObfuscatedName("kx")
   @ObfuscatedSignature(
      signature = "(Lrl3;IIIILik;I)V"
   )
   public static void a(kx var0, int var1, int var2, int var3, int var4, bJ var5, int var6) {
      gD var7 = new gD(var1, var2, var3, var4, var6, var5);
      if (!dx && var0 == null) {
         throw new AssertionError();
      } else {
         osrs.fU.a((fU)var0.o, var7);
      }
   }

   @ObfuscatedName("ky")
   @ObfuscatedSignature(
      signature = "(Ldl;IIIIIIIII)V",
      garbageValue = "-1029185959"
   )
   static final void a(kd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("le")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   private static void ap() {
      int var0;
      label61: {
         var0 = osrs.dF.c.getMouseCurrentButton();
         if (gh != 0) {
            if ((gh >> var0 & 1) != 0) {
               break label61;
            }
         } else if (var0 == 4 && osrs.I.b) {
            break label61;
         }

         byte var1 = 96;
         if (aU.c(var1)) {
            gd += ((int)(-24.0F * fE) - gd) / 2;
         } else {
            var1 = 97;
            if (aU.c(var1)) {
               gd += ((int)(24.0F * fE) - gd) / 2;
            } else {
               gd /= 2;
            }
         }

         var1 = 98;
         if (aU.c(var1)) {
            fG += ((int)(12.0F * fE) - fG) / 2;
         } else {
            var1 = 99;
            if (aU.c(var1)) {
               fG += ((int)(-12.0F * fE) - fG) / 2;
            } else {
               fG /= 2;
            }
         }

         gt = osrs.gY.b;
         dg = osrs.gY.j;
         return;
      }

      var0 = osrs.gY.b - gt;
      int var2 = dg - osrs.gY.j;
      fG = (int)((float)(var0 << 1) * fE);
      gd = (int)((float)(var2 << 1) * fE);
      if (gI) {
         fG = -fG;
      }

      if (gy) {
         gd = -gd;
      }

      gt = var0 != -1 && var0 != 1 ? (osrs.gY.b + gt) / 2 : osrs.gY.b;
      dg = var2 != -1 && var2 != 1 ? (osrs.gY.j + dg) / 2 : osrs.gY.j;
   }

   @ObfuscatedName("lr")
   private static boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      var0 = osrs.ar.a - var0;
      var1 = osrs.hn.a - var1;
      var2 = osrs.av.a - var2;
      if (Math.abs(var0) > var3 + osrs.aJ.a) {
         return false;
      } else if (Math.abs(var1) > var4 + osrs.bF.a) {
         return false;
      } else if (Math.abs(var2) > var5 + hE.p) {
         return false;
      } else if (Math.abs(var2 * osrs.dj.a - var1 * osrs.bw.c) > var5 * osrs.bF.a + var4 * hE.p) {
         return false;
      } else if (Math.abs(var0 * osrs.bw.c - var2 * osrs.bT.f) > var5 * osrs.aJ.a + var3 * hE.p) {
         return false;
      } else {
         return Math.abs(var1 * osrs.bT.f - var0 * osrs.dj.a) <= var3 * osrs.bF.a + var4 * osrs.aJ.a;
      }
   }

   @ObfuscatedName("lr")
   @ObfuscatedSignature(
      signature = "(Ldl;IIIIILrl6;)V"
   )
   private static void a(kd var0, int var1, int var2, int var3, int var4, int var5, kA var6) {
      int var7 = gg.getWidth();
      int var8 = gg.getHeight();
      ci var24;
      long[] var9 = (var24 = var0.o).at;
      var3 = var3;

      double var14;
      for(double var12 = (double)(var8 - var5); var3 < var24.al && (int)(var14 = var12 - hl) >= 0; ++var3) {
         var5 = var2;

         double var19;
         for(double var17 = (double)var4; var5 < var24.av && (int)(var19 = var17 + hl) <= var7; ++var5) {
            var8 = var24.a(var1, var5 + var24.e, var3 + var24.e);
            long var22;
            if (((var22 = var9[var8]) & 18014398509481984L) != 0L) {
               var6.method10469(var24, var8, var5, var3, (int)var17, (int)var14, (int)var19, (int)var12);
            }

            if ((var22 & 36028797018963968L) != 0L) {
               var6.method10469(var24, var8 + var24.aq, var5, var3, (int)var17, (int)var14, (int)var19, (int)var12);
            }

            var17 = var19;
         }

         var12 = var14;
      }

   }

   @ObfuscatedName("lu")
   @ObfuscatedSignature(
      signature = "(Ljg;IIIIIII)V"
   )
   public static void b(ci var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      long var8;
      int var10000 = (int)((var8 = var0.at[var1]) >> 50 & 15L);
      int var10001 = (int)(var8 >> 48 & 3L);
      int var10002 = (int)(var8 >> 24 & 16777215L);
      int var10003 = (int)(var8 & 16777215L);
      int var10006 = var6 - var4;
      var7 -= var5;
      var6 = var10006;
      var3 = var10003;
      var2 = var10002;
      var1 = var10001;
      int var27 = var10000;
      int var28 = jd.i;
      int[] var9 = jd.h;
      int var10 = Math.max(var4, 0);
      int var11 = Math.min(var4 + var6, var28);
      int var12 = Math.max(var5, 0);
      int var13 = Math.min(var5 + var7, jd.j);
      int var14 = var3 == 0 ? 1 : 0;
      var2 -= var3;
      if (var27 <= 1) {
         if (var14 != 1 || var27 != 0) {
            var3 += var2 * var27;

            for(int var25 = var12; var25 < var13; ++var25) {
               int var26 = var25 * var28;

               for(var27 = var10; var27 < var11; ++var27) {
                  var9[var26 + var27] = var3;
               }
            }

            return;
         }
      } else {
         long var29 = F[var27];
         var27 = (int)(1158011251845644416L >> (var6 - 1 << 3)) & 255;
         var6 = (int)(1158011251845644416L >> (var7 - 1 << 3)) & 255;
         var4 = (var4 << 3) - 4;
         var5 = (var5 << 3) - 4;
         var1 = (int)(608392186895073544L >> (var1 << 4));

         for(var7 = var12; var7 < var13; ++var7) {
            var12 = var1 >> 4 & 15;
            int var15 = var1 & 15;
            var12 = (((var7 << 3) - var5) * var6 >> 7 ^ var12) * var15;
            var15 = var7 * var28;

            for(int var16 = var10; var16 < var11; ++var16) {
               int var17 = var1 >> 12 & 15;
               int var18 = var1 >> 8 & 15;
               var17 = (((var16 << 3) - var4) * var27 >> 7 ^ var17) * var18;
               var17 = (int)(var29 >> var12 + var17) & 1;
               var18 = var3 + var17 * var2;
               var17 = ~var17 & var14;
               var18 |= var9[var15 + var16] * var17;
               var9[var15 + var16] = var18;
            }
         }
      }

   }

   @ObfuscatedName("lw")
   public static void J() {
      Arrays.fill(fL, 0);
      Arrays.fill(gA, 0);
      Arrays.fill(gG, 0);
      gO = 0;
      gn = 0;
   }

   @ObfuscatedName("mg")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void K() {
      osrs.dF.c.getCallbacks().post(new CanvasSizeChanged());
   }

   @ObfuscatedName("mg")
   public static boolean b(client var0, int var1) {
      a var10000;
      if (var0 == null) {
         var10000 = var0.hv;
         boolean var2 = false;
      }

      var10000 = var0.hv;
      return false;
   }

   @ObfuscatedName("ms")
   public static boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (!osrs.cf.e) {
         cw var9;
         int var10 = (var9 = osrs.cw.b).d;
         int var11 = var9.c;
         int var12 = var9.h;
         int var13 = var9.f;
         int var14 = osrs.cc.d.c;
         int var15 = osrs.cc.d.f;
         int var16 = osrs.cc.d.i;
         int var17 = (osrs.cf.b - var14) * 50 / var16;
         int var18 = (osrs.cf.f - var15) * 50 / var16;
         var14 = (osrs.cf.b - var14) * 13312 / var16;
         var15 = (osrs.cf.f - var15) * 13312 / var16;
         int var19 = var18 * var11 + var10 * 50 >> 16;
         var18 = var11 * 50 - var10 * var18 >> 16;
         int var20 = var15 * var11 + var10 * 13312 >> 16;
         var10 = var11 * 13312 - var10 * var15 >> 16;
         var11 = var17 * var13 - var12 * var18 >> 16;
         var15 = var12 * var17 + var13 * var18 >> 16;
         var17 = var14 * var13 - var12 * var10 >> 16;
         var16 = var12 * var14 + var13 * var10 >> 16;
         osrs.ar.a = (var11 + var17) / 2;
         osrs.hn.a = (var19 + var20) / 2;
         osrs.av.a = (var16 + var15) / 2;
         osrs.bT.f = (var17 - var11) / 2;
         osrs.dj.a = (var20 - var19) / 2;
         osrs.bw.c = (var16 - var15) / 2;
         osrs.aJ.a = Math.abs(osrs.bT.f);
         osrs.bF.a = Math.abs(osrs.dj.a);
         hE.p = Math.abs(osrs.bw.c);
         osrs.ga.a(osrs.cf.g, (float)(var17 - var11), (float)(var20 - var19), (float)(var16 - var15));
         osrs.cf.g.a();
         ha = var9.j;
         fW = var9.g;
         gi = var9.i;
         osrs.cf.e = true;
      }

      var0 -= ha;
      var1 -= fW;
      var2 -= gi;
      var0 += var3;
      var1 += var4;
      var2 += var5;
      return a(var0, var1, var2, var6, var7, var8);
   }

   @ObfuscatedName("mu")
   private static void g(int var0, int var1) {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("mw")
   public static void d(int var0, int var1) {
      int[] var2 = new int[9];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4;
         int var5 = (var4 = (var3 << 5) + 15 + 128) * 3 + 600;
         var4 = Perspective.SINE[var4];
         int var6;
         if ((var6 = var1 - 334) < 0) {
            var6 = 0;
         } else if (var6 > 100) {
            var6 = 100;
         }

         var5 = ((aH - aN) * var6 / 100 + aN) * var5 / 256;
         var2[var3] = var5 * var4 >> 16;
      }

      osrs.aM.a.o.a((int[])var2, 500, 800, var0 * 334 / var1, 334);
   }

   @ObfuscatedName("nd")
   private static void H(int var0) {
      if (var0 != -1) {
         fR[var0] = eV[var0];
         eV[var0] = false;
      }

   }

   @ObfuscatedName("np")
   @ObfuscatedSignature(
      signature = "(Lwt;)V"
   )
   public static void a(jk var0) {
      try {
         client var10000 = osrs.dF.c;
         boolean var2 = true;
         String var3 = "ferox";
         String var10 = "";
         iH var1 = jT.a("", var3, true);

         try {
            byte[] var10001 = var0.d;
            int var8 = var0.K();
            var2 = false;
            byte[] var11 = var10001;
            var1.c(var11, 0, var8);
         } finally {
            iH var12 = var1;
            boolean var9 = true;
            var12.a();
         }
      } catch (Exception var7) {
         cV.error("error saving preferences", var7);
      }

   }

   @ObfuscatedName("ol")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void L() {
      boolean var0;
      if ((var0 = osrs.dF.c.isResized()) != gv) {
         ResizeableChanged var1;
         (var1 = new ResizeableChanged()).setResized(var0);
         osrs.dF.c.getCallbacks().post(var1);
         gv = var0;
      }

   }

   @ObfuscatedName("oq")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void M() {
      if (fQ != null && fQ.getWidth() > 383) {
         osrs.R.a = new iT(new int[]{0}, 1, 1);
      }

   }

   @ObfuscatedName("ot")
   @ObfuscatedSignature(
      signature = "(Lclient;Ldn;S)Z"
   )
   private static boolean a(client var0, kg var1, short var2) {
      if (osrs.aX.a != null) {
         osrs.aX.a.a(var1.i);
      }

      osrs.aA.a();
      var1.b = null;
      return true;
   }

   @ObfuscatedName("oz")
   @ObfuscatedSignature(
      signature = "(ZLwx;)V"
   )
   public static void N() {
      bO = kq.a(true);
      cT = new int[4][13][13];
   }

   @ObfuscatedName("ph")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   private static void aq() {
      if (az == 0) {
         osrs.C.b = (int)fP;
      } else {
         fP = (double)osrs.C.b;
      }
   }

   @ObfuscatedName("pk")
   private static int I(int var0) {
      int var1 = var0 >> 2;
      var0 &= 3;
      double var3;
      var1 = (int)(var3 = (double)fZ + (double)(var1 - fJ) * hl);
      int var2 = (int)(var3 + hl);
      return var1 + ((var2 - var1) * var0 >> 2);
   }

   @ObfuscatedName("pn")
   @ObfuscatedSignature(
      signature = "(Lov;IIF)V"
   )
   public static void a(fd var0, int var1, int var2, float var3) {
      ey var23 = var0.a(jD.a, false);
      int var4 = do;
      int var5 = dn;
      client var10000 = osrs.dF.c;
      iT[] var6 = ki.e;
      kd var7;
      int var8 = (var7 = osrs.aM.a).m;
      osrs.cm.b(var1, var2, var1 + var23.d, var2 + var23.b);

      int var9;
      int var10;
      int var11;
      for(var9 = 0; var9 < hh; ++var9) {
         var10 = (hi[var9] << 7) + 64 - var4;
         var11 = (hj[var9] << 7) + 64 - var5;
         var10 = (int)((float)var10 * var3);
         var11 = (int)((float)var11 * var3);
         var10000 = osrs.dF.c;
         a(var1, var2, var10, var11, hf[var9], var23);
      }

      int var12;
      for(var9 = 0; var9 < 104; ++var9) {
         for(var10 = 0; var10 < 104; ++var10) {
            if (var7.v[var8][var9][var10] != null) {
               var11 = (var9 << 7) + 64 - var4;
               var12 = (var10 << 7) + 64 - var5;
               var11 = (int)((float)var11 * var3);
               var12 = (int)((float)var12 * var3);
               var10000 = osrs.dF.c;
               a(var1, var2, var11, var12, var6[0], var23);
            }
         }
      }

      long var21;
      for(var9 = 0; var9 < var7.f.a; ++var9) {
         gg var32 = var7.g;
         var21 = (long)var7.f.a(var9);
         kc var25;
         if ((var25 = (kc)var32.a(var21)) != null && var25.aQ != null) {
            aY var28;
            if ((var28 = var25.aQ) != null && var28.getConfigs() != null) {
               var28 = var28.a();
            }

            if (var28 != null && var28.isMinimapVisible() && var28.isInteractible()) {
               var12 = var25.s - var4;
               var8 = var25.n - var5;
               var12 = (int)((float)var12 * var3);
               var8 = (int)((float)var8 * var3);
               var10000 = osrs.dF.c;
               a(var1, var2, var12, var8, var6[1], var23);
            }
         }
      }

      p var27 = ax;
      var10000 = osrs.dF.c;
      jG var31 = osrs.ai.a;

      for(var11 = 0; var11 < var27.f; ++var11) {
         var21 = (long)var27.d[var11];
         jG var24;
         if ((var24 = (jG)var7.e.a(var21)) != null && var24.aV != null && !var24.aE && var24 != var31) {
            var8 = var24.s - var4;
            int var13 = var24.n - var5;
            var8 = (int)((float)var8 * var3);
            var13 = (int)((float)var13 * var3);
            iT var26;
            if (var24.isFriend()) {
               var26 = var6[3];
            } else if (var31.getTeam() != 0 && var24.getTeam() != 0 && var31.getTeam() == var24.getTeam()) {
               var26 = var6[4];
            } else if (var24.isFriendsChatMember()) {
               var26 = var6[5];
            } else if (var24.isClanMember()) {
               var26 = var6[6];
            } else {
               var26 = var6[2];
            }

            var10000 = osrs.dF.c;
            a(var1, var2, var8, var13, var26, var23);
         }
      }

      if ((var9 = osrs.dF.c.getHintArrowType()) != 0 && osrs.dF.c.getGameCycle() % 20 < 10) {
         if (var9 != 1 && var9 != 10) {
            if (var9 == 2) {
               var10 = (cB - var7.o.aF << 7) + cC - var4;
               var11 = (cN - var7.o.aG << 7) + cL - var5;
               var10 = (int)((float)var10 * var3);
               var11 = (int)((float)var11 * var3);
               var10000 = osrs.dF.c;
               a(var1, var2, var10, var11, osrs.ai.b[1], var23, true);
            }
         } else {
            Object var33 = var9 == 1 ? osrs.dF.c.Z() : osrs.dF.c.aa();
            Object var29 = var33;
            if (var33 != null) {
               jE var30;
               var11 = (var30 = (jE)var29).s - var4;
               var12 = (var30 = (jE)var29).n - var5;
               var11 = (int)((float)var11 * var3);
               var12 = (int)((float)var12 * var3);
               var10000 = osrs.dF.c;
               a(var1, var2, var11, var12, osrs.ai.b[1], var23, false);
            }
         }
      }

      var9 = eO;
      var10 = eM;
      if (var9 != 0) {
         var11 = (var9 << 7) + 64 - var4;
         var12 = (var10 << 7) + 64 - var5;
         var11 = (int)((float)var11 * var3);
         var12 = (int)((float)var12 * var3);
         var10000 = osrs.dF.c;
         a(var1, var2, var11, var12, osrs.ai.b[0], var23);
      }

      boolean var34 = true;
      if (jA.b(ag, -1) == hO.b && osrs.ai.b.length >= 4) {
         var9 = var23.d / 2 + var1;
         var10 = var23.b / 2 + var2;
         int var10001 = osrs.gY.j - var1;
         int var22 = osrs.gY.b - var2;
         int var35 = var10001;
         if (var23.a(var35, var22)) {
            var12 = (((int)Math.round(Math.atan2((double)(osrs.gY.b - var10), (double)(osrs.gY.j - var9)) / 0.0030679615757712823D) - 512 - cd & 2047) + 64) / 128 << 7;
            a(var9, var10, osrs.ai.b[2], 30, var12);
         }

         if (eI > 0) {
            a(var9, var10, osrs.ai.b[3], 30, eR << 7);
         }
      }

      if (!osrs.ai.a.aE) {
         osrs.cm.a(var23.d / 2 + var1 - 1, (int)(var23.b / 2 + var2 - 1), (int)3, (int)3, (int)16777215);
      }

   }

   @ObfuscatedName("pp")
   public static void O() {
      osrs.dF.c.r = true;
      fX = null;
      fM = null;
      osrs.bJ.a.reset();
   }

   @ObfuscatedName("qi")
   @ObfuscatedSignature(
      signature = "([Lov;IIIIIIIIIII)V"
   )
   public static void a(fd[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      for(var1 = var1; var1 <= var2; ++var1) {
         fd var7;
         if ((var7 = var0[var1]) != null && var3 == var7.v && var4 == var7.M && !var7.isSelfHidden()) {
            int var8 = var5 + var7.getRelativeX();
            int var9 = var6 + var7.getRelativeY();
            if (var7.getType() == 3 && var8 == osrs.dF.c.getViewportXOffset() && var9 == osrs.dF.c.getViewportYOffset() && var7.getWidth() == osrs.dF.c.getViewportWidth() && var7.getHeight() == osrs.dF.c.getViewportHeight() && var7.getOpacity() > 0 && var7.isFilled() && var7.C.g() == 0 && osrs.dF.c.isGpu()) {
               var8 = var7.getTextColor();
               var9 = var7.getOpacity() & 255;
               int var10 = 256 - var9;
               int var11 = bG;
               var8 = (var10 * (var8 & '\uff00') >> 8 & '\uff00') + ((var8 & 16711935) * var10 >> 8 & 16711935);
               var9 = ((var11 & 16711935) * var9 >> 8 & 16711935) + (var9 * (var11 & '\uff00') >> 8 & '\uff00');
               bG = var10 + ((255 - var10) * (var11 >>> 24) * '肁' >>> 23) << 24 | var8 + var9;
               boolean var12 = true;
               var7.P = var12;
               fT.add(var7);
            }
         }
      }

   }

   @ObfuscatedName("qo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void P() {
      GameState var0 = osrs.dF.c.getGameState();
      if (gx) {
         if (var0 == GameState.LOADING) {
            osrs.dF.c.setGameState(GameState.LOGGED_IN);
            return;
         }
      } else {
         cV.debug("Game state changed: {} (state: {}, 2 step: {})", new Object[]{var0, aa, osrs.eE.a});
         boolean var1 = false;
         boolean var2 = true;
         GameStateChanged var3;
         if (var0 == GameState.LOGIN_SCREEN && !osrs.eE.a) {
            var1 = true;
         } else if (var0 == GameState.LOGGING_IN && osrs.eE.a) {
            if (bn == iF.o) {
               var1 = true;
               (var3 = new GameStateChanged()).setGameState(GameState.LOGIN_SCREEN);
               osrs.dF.c.getCallbacks().post(var3);
            } else {
               var2 = false;
            }
         }

         int var5;
         if (var1) {
            cV.debug("Cache is ready");
            if (fM == null) {
               fE var11;
               fE var10000 = var11 = C[2];
               boolean var13 = true;
               int var14 = var10000.d(14);
               int[] var4;
               fM = new int[(var4 = var11.getFileIds(14)).length];
               fX = new int[var14];
               var5 = 0;
               int[] var6 = var4;
               int var7 = var4.length;

               for(int var8 = 0; var8 < var7; ++var8) {
                  int var9 = var6[var8];
                  VarbitComposition var10 = osrs.dF.c.getVarbit(var9);
                  fM[var5++] = var10.getIndex() << 16 | var9;
                  fX[var9] = var10.getIndex() << 16 | var10.getMostSignificantBit() << 8 | var10.getLeastSignificantBit();
               }

               Arrays.sort(fM);
            }
         }

         if (var2) {
            (var3 = new GameStateChanged()).setGameState(var0);
            osrs.dF.c.getCallbacks().post(var3);
         }

         if (var0 == GameState.LOGGED_IN) {
            kd var12 = osrs.aM.a;
            client var22 = osrs.dF.c;
            if (osrs.ai.a != null) {
               kB[][][] var15 = var12.o.ae;
               fU[][] var16 = var12.v[var12.m];

               for(var5 = 0; var5 < 104; ++var5) {
                  for(int var17 = 0; var17 < 104; ++var17) {
                     fU var18;
                     if ((var18 = var16[var5][var17]) != null) {
                        kB var19 = var15[var12.m][var5][var17];

                        for(kk var20 = (kk)osrs.fU.e(var18); var20 != null; var20 = (kk)osrs.fU.b(var18)) {
                           var20.k = var5;
                           var20.l = var17;
                           var20.j = var12.getId();
                           ItemSpawned var21 = new ItemSpawned(var19, var20);
                           osrs.dF.c.getCallbacks().post(var21);
                        }
                     }
                  }
               }
            }

            return;
         }

         if (var0 == GameState.LOGIN_SCREEN) {
            gR = false;
         }
      }

   }

   @ObfuscatedName("qt")
   @ObfuscatedSignature(
      signature = "(Lxy;Lrl4;II)V"
   )
   private static void b(jy var0, ky var1, int var2, int var3) {
      int var4 = var0.c;
      int var5 = var0.d;
      int var6 = var0.i;
      int var7 = var0.p;
      if (var2 != 255) {
         osrs.cm.b(var4, var5, var6, var7, 6116423, var2);
         osrs.cm.b(var4 + 1, var5 + 1, var6 - 2, 16, 0, var2);
         osrs.cm.a(var4 + 1, var5 + 18, var6 - 2, var7 - 19, 0, var2);
      } else {
         osrs.cm.a(var4, var5, var6, var7, 6116423);
         osrs.cm.a(var4 + 1, (int)(var5 + 1), (int)(var6 - 2), (int)16, (int)0);
         osrs.cm.c(var4 + 1, var5 + 18, var6 - 2, var7 - 19, 0);
      }

      String var12 = var1 == null ? "Choose Option" : var1.getTarget();
      osrs.hf.a.d(var12, var4 + 3, var5 + 14, 6116423, -1);
      int var13 = osrs.gY.j;
      var7 = osrs.gY.b;

      for(int var8 = 0; var8 < var0.h; ++var8) {
         if (var0.h - 1 - var8 >= var3) {
            int var9 = var5 + (var0.h - 1 - var8 - var3) * 15 + 31;
            String var10 = var0.f[var8];
            if (!var0.e[var8].isEmpty()) {
               if (!var10.isEmpty()) {
                  var10 = var10 + " ";
               }

               var10 = var10 + var0.e[var8];
            }

            if (var0.n[var8] != null) {
               var10 = var10 + " </col><gt>";
            }

            int var11 = var13 > var4 && var13 < var6 + var4 && var7 > var9 - 13 && var7 < var9 + 3 ? 16776960 : 16777215;
            osrs.hf.a.d(var10, var4 + 3, var9, var11, 0);
            if (var8 == var0.o && var0.n[var8] != null && var0.n[var8].h > 0) {
               b(var0.n[var8], var0.q[var8], var2, K);
            }
         }
      }

   }

   @ObfuscatedName("qz")
   private static void J(int var0) {
      client var10000 = osrs.dF.c;
      aw[] var1 = aG;
      if (var0 >= 0 && var0 < var1.length) {
         aw var2 = var1[var0];
         osrs.dF.c.getCallbacks().post(new ClanChannelChanged(var2, var0, false));
      }

   }

   @ObfuscatedName("rg")
   private static void a(client var0, String var1, int var2) throws IOException {
      URL var6 = new URL(osrs.gk.a + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
      hl var3;
      (var3 = new hl()).a(var1);
      js var4 = js.a;
      a var10000 = var0.hv;
      bp var5 = new bp(var6, var4, var3, var0.fy);
      var0.hy = osrs.n.a(var0.ht, var5, 938676135);
   }

   @ObfuscatedName("rg")
   private static boolean a(long var0, int var2, int var3, int var4, int var5) {
      int var6 = (int)(var0 >>> 20);
      int var7 = (int)(var0 >> 16 & 7L);
      if (var3 == var6 && var7 == 2) {
         var7 = var4 | var5 << 6;
         var2 &= 255;
         return var7 == var2;
      } else {
         return false;
      }
   }

   @ObfuscatedName("rj")
   @ObfuscatedSignature(
      signature = "(Lxy;IIIIIILjava/lang/String;Ljava/lang/String;)Lrl4;"
   )
   public static ky a(jy var0, int var1, int var2, int var3, int var4, int var5, int var6, String var7, String var8) {
      for(int var9 = var0.h - 1; var9 >= 0; --var9) {
         if (var3 == var0.k[var9] && var0.g[var9] == var4 && var0.b[var9] == var1 && var0.j[var9] == var2 && var5 == var0.l[var9] && var0.a[var9] == var6 && var7 == var0.f[var9] && var8 == var0.e[var9]) {
            return var0.q[var9];
         }

         ky var10;
         if (var9 == var0.o && var0.n[var9] != null && (var10 = a(var0.n[var9], var1, var2, var3, var4, var5, var6, var7, var8)) != null) {
            return var10;
         }
      }

      return null;
   }

   @ObfuscatedName("rj")
   @ObfuscatedSignature(
      signature = "([Lov;IIIIIIIIIII)V"
   )
   public static void a(fd[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      Callbacks var11 = osrs.dF.c.getCallbacks();
      int var12 = fS.size();

      fd var19;
      for(int var14 = var1; var14 <= var2; ++var14) {
         if ((var19 = var0[var14]) != null && var3 == var19.v && var4 == var19.M && !var19.isSelfHidden() && var19.getType() == 5 && var19.getItemId() != -1 && var19.getItemId() != 6512) {
            Rectangle var15 = null;
            client var10001 = osrs.dF.c;
            int var16;
            int var17;
            if (var19 == dO && el && ev) {
               var16 = osrs.gY.j;
               var17 = osrs.gY.b;
               var16 -= eg;
               var17 -= dV;
               if (var16 < eh) {
                  var16 = eh;
               }

               if (var16 + var19.getWidth() > eh + ec.getWidth()) {
                  var16 = eh + ec.getWidth() - var19.getWidth();
               }

               if (var17 < ex) {
                  var17 = ex;
               }

               if (var17 + var19.getHeight() > ex + ec.getHeight()) {
                  var17 = ex + ec.getHeight() - var19.getHeight();
               }

               var15 = new Rectangle(var16, var17, var19.getWidth(), var19.getHeight());
            }

            var16 = var9 + var19.getRelativeX();
            var17 = var10 + var19.getRelativeY();
            var19.cd = var16;
            var19.ce = var17;
            if (var16 >= var5 && var16 <= var7 && var17 >= var6 && var17 <= var8) {
               WidgetItem var20 = new WidgetItem(var19.getItemId(), var19.getItemQuantity(), var19.getBounds(), var19, var15);
               fS.add(var20);
            }
         }
      }

      List var21 = Collections.emptyList();
      if (var12 < fS.size()) {
         if (var12 > 0) {
            List var10002 = fS;
            var21 = var10002.subList(var12, var10002.size());
         } else {
            var21 = fS;
         }
      }

      int var13;
      int var22;
      fd var23;
      if (var3 == -1412584499) {
         if (!dx && osrs.ct.aH != var0) {
            throw new AssertionError();
         } else {
            var22 = -1;

            for(var13 = 0; var13 < var0.length; ++var13) {
               if ((var23 = var0[var13]) != null) {
                  var22 = WidgetUtil.componentToInterface(var23.getId());
                  break;
               }
            }

            if (var22 != -1) {
               var11.drawInterface(var22, fS);
               fS.clear();
            }
         }
      } else if (var3 != -1) {
         if (var4 == -1) {
            Widget[] var25;
            if ((var25 = (var19 = osrs.dF.c.i(var3)).getChildren()) == null || var25 == var0) {
               var11.drawLayer(var19, var21);
            }

         }
      } else {
         var22 = -1;

         for(var13 = 0; var13 < var0.length; ++var13) {
            if ((var23 = var0[var13]) != null) {
               var22 = WidgetUtil.componentToInterface(var23.getId());
               break;
            }
         }

         if (var22 != -1) {
            if (osrs.ct.aH == null) {
               var11.drawInterface(var22, fS);
               fS.clear();
            }

            for(var13 = fT.size() - 1; var13 >= 0; --var13) {
               Widget var24;
               if (WidgetUtil.componentToInterface((var24 = (Widget)fT.get(var13)).getId()) == var22) {
                  var24.setHidden(false);
                  fT.remove(var13);
               }
            }

         }
      }
   }

   @ObfuscatedName("rl")
   private static void K(int var0) {
      if (var0 != -1) {
         var0 = var0 - 1 & 31;
         var0 = eA[var0];
         client var10000 = osrs.dF.c;
         gb var1;
         jP var2 = (jP)osrs.bs.a(var1 = jP.a, (long)var0);
         jP var3 = (jP)osrs.bs.a(var1, (long)(var0 | '耀'));
         ItemContainerChanged var4;
         if (var2 != null) {
            var4 = new ItemContainerChanged(var0, var2);
            fN.add(var4);
         }

         if (var3 != null) {
            var4 = new ItemContainerChanged(var0 | '耀', var3);
            fN.add(var4);
         }
      }

   }

   @ObfuscatedName("rx")
   public static double u(int var0) {
      return (double)var0 * 0.0030679615757712823D;
   }

   @ObfuscatedName("se")
   public static int a(double var0) {
      return (int)Math.round(var0 * 325.94932345220167D) & 2047;
   }

   @ObfuscatedName("sr")
   @ObfuscatedSignature(
      signature = "(Ldl;Lwx;)V"
   )
   public static void c(kd var0) {
      if (!dx && !var0.isTopLevel()) {
         throw new AssertionError();
      } else {
         gx = false;
      }
   }

   @ObfuscatedName("sz")
   @ObfuscatedSignature(
      signature = "(Ljh;Ljh;Ljm;IIIIJ)V"
   )
   public static void a(cj var0, cj var1, cn var2, int var3, int var4, int var5, int var6, long var7) {
      if (var7 != 0L && (var7 >> 19 & 1L) != 1L && osrs.cf.c) {
         cB var9 = var2.b(var3);
         if (var1 == null ? a(var4, var5, var6, var9.getCenterX(), var9.getCenterY(), var9.getCenterZ(), var9.getExtremeX(), var9.getExtremeY(), var9.getExtremeZ()) : a((cb)var0, var4, var5, var6, var9.getCenterX(), var9.getCenterY(), var9.getCenterZ(), var9.getExtremeX(), var9.getExtremeY(), var9.getExtremeZ())) {
            int var10;
            int var31;
            if (var1 == null && osrs.ai.a.b()) {
               boolean var32 = (var31 = (int)(var7 >> 16 & 7L)) == 2 || var31 == 3;
               var10 = (int)(var7 & 127L);
               int var11 = (int)(var7 >> 7 & 127L);
               int var12 = osrs.ai.a.aa[0];
               int var13 = osrs.ai.a.az[0];
               if (var32 && Math.max(Math.abs(var10 - var12), Math.abs(var11 - var13)) > 50) {
                  return;
               }
            }

            if (var2.useBoundingBox()) {
               var31 = (int)var0.project((float)var4, (float)(var5 - var2.aI), (float)var6)[2];
               a(var7, var31);
               return;
            }

            var31 = var2.getVerticesCount();
            int var33 = var2.getFaceCount();
            float[] var34 = var2.getVerticesX();
            float[] var35 = var2.getVerticesY();
            float[] var36 = var2.getVerticesZ();
            int[] var37 = var2.getFaceIndices1();
            int[] var14 = var2.getFaceIndices2();
            int[] var15 = var2.getFaceIndices3();
            int[] var16 = var2.getFaceColors3();
            int var17 = osrs.dF.c.get3dZoom();
            int var18 = osrs.dF.c.getCenterX();
            int var19 = osrs.dF.c.getCenterY();
            int var20 = Perspective.SINE[var3];
            int var21 = Perspective.COSINE[var3];

            int var22;
            int var23;
            int var24;
            int var25;
            int var26;
            int var27;
            int var28;
            int var29;
            for(var22 = 0; var22 < var31; ++var22) {
               var23 = (int)var34[var22];
               var24 = (int)var35[var22];
               var25 = (int)var36[var22];
               if (var3 != 0) {
                  var26 = var25 * var20 + var23 * var21 >> 16;
                  var25 = var25 * var21 - var23 * var20 >> 16;
                  var23 = var26;
               }

               var23 += var4;
               var24 += var5;
               var25 += var6;
               float[] var38;
               var27 = (int)(var38 = var0.project((float)var23, (float)var24, (float)var25))[0];
               var28 = (int)var38[1];
               if ((var29 = (int)var38[2]) >= 50) {
                  osrs.cn.g[var22] = var27 * var17 / var29 + var18;
                  osrs.cn.f[var22] = var28 * var17 / var29 + var19;
               } else {
                  osrs.cn.g[var22] = -5000;
               }
            }

            var22 = var2.useBoundingBox() ? 20 : 5;

            for(var23 = 0; var23 < var33; ++var23) {
               if (var16[var23] != -2) {
                  var24 = var37[var23];
                  var25 = var14[var23];
                  var26 = var15[var23];
                  var27 = osrs.cn.g[var24];
                  var28 = osrs.cn.g[var25];
                  var29 = osrs.cn.g[var26];
                  var24 = osrs.cn.f[var24];
                  var31 = osrs.cn.f[var25];
                  var3 = osrs.cn.f[var26];
                  if (var27 != -5000 && var28 != -5000 && var29 != -5000 && ((var10 = var22 + osrs.cf.f) >= var24 || var10 >= var31 || var10 >= var3) && ((var10 = osrs.cf.f - var22) <= var24 || var10 <= var31 || var10 <= var3) && ((var10 = var22 + osrs.cf.b) >= var27 || var10 >= var28 || var10 >= var29) && ((var10 = osrs.cf.b - var22) <= var27 || var10 <= var28 || var10 <= var29)) {
                     int var30 = (int)var0.project((float)var4, (float)(var5 - var2.aI), (float)var6)[2];
                     a(var7, var30);
                     return;
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("tg")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void Q() {
      int var0;
      if ((var0 = jC.c) == gl + 1) {
         int var1 = var0 - 1;
         int var2;
         boolean var6;
         if ((var2 = jC.g[var1]) == 0) {
            SoundEffectPlayed var3;
            (var3 = new SoundEffectPlayed(jE.c)).setSoundId(jC.h[var1]);
            var3.setDelay(jC.b[var1]);
            osrs.dF.c.getCallbacks().post(var3);
            var6 = var3.isConsumed();
         } else {
            int var7 = var2 >> 16 & 255;
            int var4 = var2 >> 8 & 255;
            var2 &= 255;
            AreaSoundEffectPlayed var5;
            (var5 = new AreaSoundEffectPlayed(jE.c)).setSoundId(jC.h[var1]);
            var5.setSceneX(var7);
            var5.setSceneY(var4);
            var5.setRange(var2);
            var5.setDelay(jC.b[var1]);
            osrs.dF.c.getCallbacks().post(var5);
            var6 = var5.isConsumed();
         }

         if (var6) {
            --var0;
            jC.c = var0;
         }
      }

      gl = var0;
   }

   @ObfuscatedName("tg")
   public static void a(String var0, Throwable var1) {
      if (var1 != null) {
         var1.printStackTrace();
      } else {
         iE.a(var0, var1);
      }
   }

   @ObfuscatedName("tg")
   @ObfuscatedSignature(
      signature = "(Ldl;Lwx;)V"
   )
   public static void d(kd var0) {
      if (!dx && !var0.isTopLevel()) {
         throw new AssertionError();
      } else {
         cR = new int[4][13][13];
         gx = true;
      }
   }

   @ObfuscatedName("tn")
   @ObfuscatedSignature(
      signature = "(Ljg;Ljg;Lik;[[IIIIIIIIIII)Ljr;"
   )
   public static ct a(ci var0, ci var1, bJ var2, int[][] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      long var14;
      if (var2.j == null) {
         var14 = (long)((var2.k << 10) + var7);
      } else {
         var14 = (long)((var2.k << 10) + (var6 << 3) + var7);
      }

      Object var16;
      int var50;
      if ((var16 = (ct)osrs.dX.a(osrs.bJ.c, var14)) == null) {
         cn var10000;
         label117: {
            if (!var2.r) {
               int var18 = var1.aF - var0.aF;
               int var42 = var1.aG - var0.aG;
               var50 = var18 + var9;
               var42 += var10;
               if (var50 >= var0.an && var50 < var0.av && var42 >= var0.ah && var42 < var0.al) {
                  ct var40;
                  if (var4 == 22) {
                     ce var39;
                     if ((var39 = var0.g(var8, var50, var42)) != null && a(var39.d, var39.b, var2.getId(), var4, var5) && (var40 = var39.g) instanceof cn) {
                        var10000 = (cn)var40;
                        break label117;
                     }
                  } else if (var4 >= 9) {
                     cJ var41;
                     if ((var41 = var0.c(var8, var50, var42)) != null && a(var41.l, var41.e, var2.getId(), var4, var5) && (var40 = var41.m) instanceof cn) {
                        var10000 = (cn)var40;
                        break label117;
                     }
                  } else if (var4 != 0 && var4 != 1 && var4 != 3) {
                     cD var45;
                     if ((var4 == 4 || var4 == 5 || var4 == 6 || var4 == 7) && (var45 = osrs.ci.d(var0, var8, var50, var42)) != null && a(var45.f, var45.l, var2.getId(), var4, var5)) {
                        var10000 = !((var40 = var45.g) instanceof cn) ? null : (cn)var40;
                        break label117;
                     }
                  } else {
                     cS var43;
                     if ((var43 = var0.h(var8, var50, var42)) != null && a(var43.h, var43.c, var2.getId(), var4, var5) && (var40 = var43.i) instanceof cn) {
                        var10000 = (cn)var40;
                        break label117;
                     }
                  }
               }
            }

            var10000 = null;
         }

         cn var46 = var10000;
         int var10002;
         if (var10000 != null) {
            if (!dx && var2.r) {
               throw new AssertionError();
            }

            cn var44;
            if (var2.H < 0) {
               ++gO;
               var10002 = fL[var4]++;
               var44 = var46.h();
               osrs.bJ.c.a((im)var44, var14);
               return var44;
            }

            if ((var44 = var46.ah) != null) {
               var44 = var44.h();
               (var46 = var46.h()).ah = var44;
               osrs.bJ.c.a((im)var44, var14);
               ++gn;
               var10002 = fL[var4]++;
               return var46;
            }

            var10002 = gG[var4]++;
         } else if (!var2.r) {
            var10002 = gA[var4]++;
         }

         class243 var47;
         if ((var47 = var2.a(var6, var7)) == null) {
            return null;
         }

         if (!var2.r) {
            var16 = var47.b(var2.u + 64, var2.x + 768, -50, -10, -50);
         } else {
            var47.m = (short)(var2.u + 64);
            var47.k = (short)(var2.x + 768);
            var47.d();
            var16 = var47;
         }

         im var36 = (im)var16;
         osrs.bJ.c.a(var36, var14);
      }

      if (var2.r) {
         class243 var48;
         var16 = class243.b(var48 = (class243)var16);
      }

      if (var2.H >= 0) {
         if (var16 instanceof cn) {
            var16 = ((cn)var16).b(var3, var11, var12, var13, true, var2.H);
         } else if (var16 instanceof class243) {
            class243 var51 = (class243)var16;
            var50 = var2.H;
            boolean var49 = true;
            var16 = var51.a(var3, var11, var12, var13, true, var50);
         }
      }

      return (ct)var16;
   }

   @ObfuscatedName("tv")
   @ObfuscatedSignature(
      signature = "(Lik;II)Z"
   )
   private static boolean a(bJ var0, int var1, int var2) {
      int var3;
      if ((var3 = var0.getMapSceneId()) == -1) {
         return false;
      } else {
         jp var6;
         if ((var6 = osrs.fJ.z[var3]) != null && var6.getWidth() > 0 && var6.getHeight() > 0) {
            int var4 = var0.q * -1313509743 << 2;
            int var5 = var0.b() << 2;
            var1 = (var1 << 2) + (var4 - var6.getWidth()) / 2;
            var5 = (var2 << 2) + (var5 - var6.getHeight()) / 2;
            var2 = var1 + var6.getWidth();
            var4 = var5 + var6.getHeight();
            var1 = I(var1);
            var5 = F(var5);
            var2 = I(var2);
            var4 = F(var4);
            var2 = (var2 - var1) * var6.getOriginalWidth() / var6.getWidth();
            var5 = (var5 - var4) * var6.getOriginalHeight() / var6.getHeight();
            if (var2 > 0 && var5 > 0) {
               var6.a(var1, var4, var2, var5);
            }

            return true;
         } else {
            return true;
         }
      }
   }

   @ObfuscatedName("tz")
   @ObfuscatedSignature(
      signature = "(ILqk;)V"
   )
   private static void a(int var0, fU var1) {
      for(jK var2 = (jK)osrs.fU.e(var1); var2 != null; var2 = (jK)osrs.fU.b(var1)) {
         int var3 = WidgetUtil.componentToInterface(var2.j.getId());
         if (var0 == var3) {
            osrs.gk.a(var2);
         }
      }

   }

   @ObfuscatedName("uc")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void R() {
      Callbacks var10000 = osrs.dF.c.getCallbacks();
      client var10003 = osrs.dF.c;
      var10000.post(new FriendsChatChanged(osrs.aX.a != null));
   }

   @ObfuscatedName("ud")
   public static long[] S() {
      long[] var0 = new long[16];
      iT var1;
      (var1 = new iT(8, 8)).c();
      osrs.cm.d();
      osrs.cc.d.e = true;
      osrs.cc.d.l = 0;

      try {
         for(int var2 = 0; var2 < 13; ++var2) {
            co var3;
            int[] var4 = (var3 = new co(var2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0)).getVertexX();
            int[] var5 = var3.getVertexZ();
            int[] var6 = var3.getFaceX();
            int[] var7 = var3.getFaceY();
            int[] var8 = var3.getFaceZ();

            int var9;
            for(var9 = 0; var9 < var4.length; ++var9) {
               osrs.co.f[var9] = var4[var9] << 3 >> 7;
               osrs.co.c[var9] = 128 - var5[var9] << 3 >> 7;
            }

            for(var9 = 0; var9 < var6.length; ++var9) {
               int var14 = var6[var9];
               int var15 = var7[var9];
               int var10 = var8[var9];
               int var11 = var3.getTriangleColorA()[var9] == 0 ? 0 : 1;
               osrs.cm.c(osrs.co.c[var14], osrs.co.c[var15], osrs.co.c[var10], osrs.co.f[var14], osrs.co.f[var15], osrs.co.f[var10], 0.0F, 0.0F, 0.0F, var11);
            }

            for(var9 = 0; var9 < 64; ++var9) {
               var0[var2] |= (long)(var1.getPixels()[var9] & 1) << var9;
            }
         }

         if (!dx && var0[0] != 0L) {
            throw new AssertionError();
         }

         if (!dx && var0[1] != -1L) {
            throw new AssertionError();
         }
      } finally {
         osrs.cm.c();
         osrs.cm.d();
      }

      return var0;
   }

   @ObfuscatedName("uq")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "0"
   )
   public static void d(int var0, int var1, int var2, int var3) {
      if (var0 < jd.n) {
         var2 -= jd.n - var0;
         var0 = jd.n;
      }

      if (var1 < jd.l) {
         var3 -= jd.l - var1;
         var1 = jd.l;
      }

      if (var0 + var2 > jd.m) {
         var2 = jd.m - var0;
      }

      if (var3 + var1 > jd.k) {
         var3 = jd.k - var1;
      }

      int var4 = jd.i - var2;
      var0 += jd.i * var1;

      for(var1 = -var3; var1 < 0; ++var1) {
         for(var3 = -var2; var3 < 0; ++var3) {
            jd.h[var0++] = 0;
         }

         var0 += var4;
      }

   }

   @ObfuscatedName("us")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void T() {
      if (osrs.fO.a != null) {
         osrs.fO.a.d = dT.q[dT.h - 1].c;
      }

   }

   @ObfuscatedName("ve")
   public static void v(int var0) {
      fd[][] var1;
      if ((var1 = jD.a.c) != null && var1[var0] != null) {
         WidgetLoaded var2;
         (var2 = new WidgetLoaded()).setGroupId(var0);
         osrs.dF.c.getCallbacks().post(var2);
      }

   }

   @ObfuscatedName("vl")
   public static void c(kx var0) {
      kd var1 = var0.n;
      var0.a.a();
      var1.w = var0.a.c;
      var1.a = var0.a.b;
      var1.y = var0.a.e;
      if (!dx && !var1.isTopLevel()) {
         throw new AssertionError();
      } else {
         osrs.bp.a = var0.e;
         osrs.bi.d = var0.l;
         client var10000 = osrs.dF.c;
         x(25);
         cj = true;
         int var2 = var0.m - var1.n;
         int var3 = var0.i - var1.i;
         var1.n = var0.m;
         var1.i = var0.i;
         g(var2, var3);
         a(var1.o, var2, var3);
         var1.b.clear();
         Iterator var16 = var1.g.iterator();

         while(true) {
            jE var4;
            int var5;
            int[] var27;
            do {
               if (!var16.hasNext()) {
                  var16 = var1.e.iterator();

                  while(true) {
                     do {
                        if (!var16.hasNext()) {
                           var16 = var1.l.iterator();

                           while(var16.hasNext()) {
                              hG var18;
                              if ((var18 = (hG)var16.next()) != null) {
                                 var18.c(-var2 << 7, -var3 << 7);
                              }
                           }

                           byte var19 = 0;
                           byte var17 = 104;
                           byte var20 = 1;
                           if (var2 < 0) {
                              var19 = 103;
                              var17 = -1;
                              var20 = -1;
                           }

                           byte var6 = 0;
                           byte var7 = 104;
                           byte var8 = 1;
                           if (var3 < 0) {
                              var6 = 103;
                              var7 = -1;
                              var8 = -1;
                           }

                           fU[][][] var9 = var1.v;

                           int var10;
                           int var11;
                           int var12;
                           int var13;
                           int var14;
                           for(var10 = var19; var10 != var17; var10 += var20) {
                              for(var11 = var6; var11 != var7; var11 += var8) {
                                 var12 = var2 + var10;
                                 var13 = var3 + var11;

                                 for(var14 = 0; var14 < 4; ++var14) {
                                    if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                                       var9[var14][var10][var11] = var9[var14][var12][var13];
                                    } else {
                                       var9[var14][var10][var11] = null;
                                    }
                                 }
                              }
                           }

                           for(ik var21 = (ik)osrs.fU.e(var1.u); var21 != null; var21 = (ik)osrs.fU.b(var1.u)) {
                              var21.i -= var2;
                              var21.k -= var3;
                              if (var21.i < 0 || var21.k < 0 || var21.i >= 104 || var21.k >= 104) {
                                 osrs.gk.a(var21);
                              }
                           }

                           for(fY var22 = (fY)osrs.fU.e(var1.r); var22 != null; var22 = (fY)osrs.fU.b(var1.r)) {
                              var11 = var22.c;
                              var12 = var22.e;
                              var11 -= var2 << 7;
                              var12 -= var3 << 7;
                              var22.c = var11;
                              var22.e = var12;
                              if (var11 < 0 || var12 < 0 || var11 >= 13312 || var12 >= 13312) {
                                 osrs.gk.a(var22);
                              }
                           }

                           if (eO != 0) {
                              eO -= var2;
                              eM -= var3;
                           }

                           for(jQ var23 = (jQ)osrs.fU.e(aw); var23 != null; var23 = (jQ)osrs.fU.b(aw)) {
                              var23.a(-var2, -var3);
                           }

                           int var24;
                           for(var10 = 0; var10 < jC.c; ++var10) {
                              if ((var11 = jC.g[var10]) != 0) {
                                 var12 = var11 >> 16 & 255;
                                 var13 = var11 >> 8 & 255;
                                 var14 = var11 & 255;
                                 var12 -= var2;
                                 var13 -= var3;
                                 if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                                    jC.g[var10] = var14 | var13 << 8 | var12 << 16;
                                 } else {
                                    --jC.c;

                                    for(var24 = var10; var24 < jC.c; ++var24) {
                                       int[] var10002 = jC.h;
                                       var10002[var24] = var10002[var24 + 1];
                                       km[] var28 = jC.f;
                                       var28[var24] = var28[var24 + 1];
                                       var10002 = jC.a;
                                       var10002[var24] = var10002[var24 + 1];
                                       var10002 = jC.b;
                                       var10002[var24] = var10002[var24 + 1];
                                       var10002 = jC.g;
                                       var10002[var24] = var10002[var24 + 1];
                                       var10002 = jC.i;
                                       var10002[var24] = var10002[var24 + 1];
                                    }

                                    --var10;
                                 }
                              }
                           }

                           cu = false;
                           osrs.l.d -= var2 << 7;
                           osrs.fk.b -= var3 << 7;
                           bB -= (double)(var2 << 7);
                           bQ -= (double)(var3 << 7);
                           osrs.C.b -= var2 << 7;
                           osrs.bs.j -= var3 << 7;
                           fP -= (double)(var2 << 7);
                           fV -= (double)(var3 << 7);
                           eS = -1;

                           for(var10 = 0; var10 < 4; ++var10) {
                              cI var25;
                              int[][] var26 = (var25 = var1.j[var10]).c;

                              for(var13 = var19; var13 != var17; var13 += var20) {
                                 for(var14 = var6; var14 != var7; var14 += var8) {
                                    var24 = var2 + var13;
                                    int var15 = var3 + var14;
                                    if (var13 != 0 && var14 != 0 && var13 < var25.a - 5 && var14 < var25.d - 5) {
                                       if (var24 >= 0 && var15 >= 0 && var24 < var25.a && var15 < var25.d) {
                                          var26[var13][var14] = var26[var24][var15];
                                       } else {
                                          var26[var13][var14] = 1073741824;
                                       }
                                    } else {
                                       var26[var13][var14] = 16777215;
                                    }
                                 }
                              }
                           }

                           return;
                        }
                     } while((var4 = (jE)var16.next()) == null);

                     for(var5 = 0; var5 < 10; ++var5) {
                        var27 = var4.aa;
                        var27[var5] -= var2;
                        var27 = var4.az;
                        var27[var5] -= var3;
                     }

                     var4.s -= var2 << 7;
                     var4.n -= var3 << 7;
                     var4.d -= (float)(var2 << 7);
                     var4.aB -= (float)(var3 << 7);
                     var4.ay -= var2;
                     var4.am = (var4.am * -320967829 - var3) * -118396605;
                     var4.ax -= var2;
                     var4.ai -= var3;
                  }
               }
            } while((var4 = (jE)var16.next()) == null);

            for(var5 = 0; var5 < 10; ++var5) {
               var27 = var4.aa;
               var27[var5] -= var2;
               var27 = var4.az;
               var27[var5] -= var3;
            }

            var4.s -= var2 << 7;
            var4.n -= var3 << 7;
            var4.d -= (float)(var2 << 7);
            var4.aB -= (float)(var3 << 7);
            var4.ay -= var2;
            var4.am = (var4.am * -320967829 - var3) * -118396605;
            var4.ax -= var2;
            var4.ai -= var3;
         }
      }
   }

   @ObfuscatedName("wi")
   public static int U() {
      return osrs.gY.k != 0 ? osrs.gY.f : osrs.gY.b;
   }

   @ObfuscatedName("wq")
   @ObfuscatedSignature(
      signature = "(Lcr;)V"
   )
   public static void a(jI var0) {
      if (bj != null) {
         if (var0 != null) {
            ScriptPreFired var1;
            (var1 = new ScriptPreFired((int)var0.getHash())).setScriptEvent(bj);
            osrs.dF.c.getCallbacks().post(var1);
         }

         bj = null;
      }

      V = var0;
   }

   @ObfuscatedName("xa")
   @ObfuscatedSignature(
      signature = "([Lov;IIIIIIIIII)V"
   )
   public static void b(fd[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      for(var1 = var1; var1 <= var2; ++var1) {
         fd var7;
         if ((var7 = var0[var1]) != null && var3 == var7.v && var4 == var7.M && !var7.isSelfHidden()) {
            if (var3 != -1) {
               var7.b = var3;
            }

            int var8 = var5 + var7.getRelativeX();
            int var9 = var6 + var7.getRelativeY();
            var7.cd = var8;
            var7.ce = var9;
            jR var14;
            if (var7.getType() == 0 && var7.getIndex() == -1 && (var14 = (jR)osrs.bs.a(bT, (long)var7.getId())) != null) {
               int var13 = var7.getId();
               var8 = var14.getId();
               fd[] var15;
               fd[] var16 = var15 = jD.a.c[var8];
               var8 = var15.length;

               for(int var10 = 0; var10 < var8; ++var10) {
                  fd var11;
                  if ((var11 = var16[var10]).v == -1) {
                     var11.b = var13;
                  }
               }
            }
         }
      }

   }

   public final void setDevelopmentInterfaceLocation(String var1) {
      osrs.eu.a = var1;
   }

   public final void setDevelopmentScriptLocation(String var1) {
      osrs.bc.a = var1;
   }

   static {
      byte var0 = 34;
      byte[] var1 = new byte[34];

      int var2;
      char var3;
      for(var2 = 0; var2 < var0; ++var2) {
         if ((var3 = "com_jagex_auth_desktop_osrs:public".charAt(var2)) > 127) {
            var1[var2] = 63;
         } else {
            var1[var2] = (byte)var3;
         }
      }

      byte[] var6 = var1;
      var2 = var1.length;
      StringBuilder var7 = new StringBuilder();

      int var4;
      int var5;
      int var8;
      for(var8 = 0; var8 < var2; var8 += 3) {
         var4 = var6[var8] & 255;
         var7.append(osrs.ge.a[var4 >>> 2]);
         if (var8 < var2 - 1) {
            var5 = var6[var8 + 1] & 255;
            var7.append(osrs.ge.a[(var4 & 3) << 4 | var5 >>> 4]);
            if (var8 < var2 - 2) {
               var4 = var6[var8 + 2] & 255;
               var7.append(osrs.ge.a[(var5 & 15) << 2 | var4 >>> 6]).append(osrs.ge.a[var4 & 63]);
            } else {
               var7.append(osrs.ge.a[(var5 & 15) << 2]).append("=");
            }
         } else {
            var7.append(osrs.ge.a[(var4 & 3) << 4]).append("==");
         }
      }

      ga = var7.toString();
      var0 = 38;
      var1 = new byte[38];

      for(var2 = 0; var2 < var0; ++var2) {
         if ((var3 = "com_jagex_auth_desktop_runelite:public".charAt(var2)) > 127) {
            var1[var2] = 63;
         } else {
            var1[var2] = (byte)var3;
         }
      }

      var6 = var1;
      var2 = var1.length;
      var7 = new StringBuilder();

      for(var8 = 0; var8 < var2; var8 += 3) {
         var4 = var6[var8] & 255;
         var7.append(osrs.ge.a[var4 >>> 2]);
         if (var8 < var2 - 1) {
            var5 = var6[var8 + 1] & 255;
            var7.append(osrs.ge.a[(var4 & 3) << 4 | var5 >>> 4]);
            if (var8 < var2 - 2) {
               var4 = var6[var8 + 2] & 255;
               var7.append(osrs.ge.a[(var5 & 15) << 2 | var4 >>> 6]).append(osrs.ge.a[var4 & 63]);
            } else {
               var7.append(osrs.ge.a[(var5 & 15) << 2]).append("=");
            }
         } else {
            var7.append(osrs.ge.a[(var4 & 3) << 4]).append("==");
         }
      }

      ge = var7.toString();
      W = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      U = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      Y = new eY();
      ai = new gh();
      gj = true;
      aj = 1;
      ac = false;
      ae = 0;
      aa = 0;
      Z = 0;
      ab = osrs.as.d;
      af = iS.b;
      ah = false;
      ad = new HashMap();
      ag = new jA();
      aw = new fU();
      ax = new p();
      az = 0;
      ak = 50;
      ar = 12;
      at = 6;
      aB = true;
      av = 0;
      aq = true;
      au = -1;
      am = 0;
      an = "";
      aA = -1;
      gm = -1;
      as = -1;
      ao = true;
      ay = 0;
      aC = new int[25];
      al = new int[25];
      ap = new int[25];
      aK = new int[25];
      aM = false;
      aJ = true;
      aO = 0;
      aS = null;
      aI = 0L;
      aT = true;
      go = 600;
      aE = 600 / osrs.fs.i * 581845749;
      aU = new cV();
      aR = new cT();
      aP = new aP[4];
      aG = new aw[4];
      aQ = 256;
      aD = 205;
      aN = 256;
      aH = 320;
      aL = 1;
      aF = 32767;
      ba = 1;
      aV = 32767;
      bb = 0;
      aX = 0;
      aZ = 0;
      bg = 0;
      bd = 0;
      bc = new fi[8];
      be = new fh();
      aW = -1;
      bf = -1;
      bh = 30;
      aY = 0;
      bl = 0;
      bv = false;
      bu = -1;
      br = -1;
      bz = -1;
      bo = false;
      bk = true;
      bA = 0;
      bw = -1L;
      bq = -1;
      bx = -1;
      gs = -1L;
      bp = true;
      bt = 0;
      bs = false;
      bn = iF.h;
      gu = 0;
      gw = 0;
      gz = 0;
      bK = 0;
      bM = 0;
      gB = 0;
      bH = 0;
      bI = 0;
      bN = 1;
      bP = 0;
      bL = 1;
      bR = 0;
      bW = 128;
      cd = 0;
      gE = 0;
      gD = 0;
      gC = 0;
      gF = 0;
      cc = -1;
      bT = new gb(8);
      bV = 0;
      bZ = -1;
      bY = null;
      cg = 0;
      cb = 0;
      bX = 0;
      ch = -1;
      ca = false;
      bU = 1529466107;
      ce = 0;
      ci = 0;
      cf = new fU();
      bS = new fU();
      cp = new fU();
      co = new fU();
      cy = new gb(512);
      cA = 0;
      cq = 0;
      cm = "";
      ck = 0;
      cn = new int[128];
      cs = new int[128];
      cx = -1L;
      cz = false;
      cu = false;
      gH = false;
      cl = new dX(64);
      cv = new dX(64);
      cj = false;
      ct = false;
      cw = false;
      cr = false;
      cF = 0;
      cI = 0;
      cJ = 0;
      cB = 0;
      cN = 0;
      cE = 0;
      cC = 0;
      cL = 0;
      cG = ko.a;
      cK = ko.a;
      gJ = new hP();
      gN = new int[4];
      cD = null;
      cH = 0;
      cM = new int[250];
      gM = false;
      cO = new fp();
      cR = new int[4][13][13];
      cU = false;
      cT = new int[4][13][13];
      cW = -1;
      cP = 0;
      dh = 2301979;
      cZ = 5063219;
      cY = 3353893;
      df = 7759444;
      dj = false;
      de = 0;
      gU = 0;
      gW = 0;
      gV = 0;
      db = 0;
      cX = false;
      gZ = 0;
      gX = false;
      dk = 0;
      di = 0;
      da = 50;
      dl = new int[50];
      dc = new int[da];
      dH = new int[da];
      dz = new int[da];
      dF = new int[da];
      dp = new int[da];
      dI = new int[da][];
      dL = new int[da];
      dr = new String[da];
      dA = 0;
      dK = -1;
      dt = -1;
      dD = 0;
      dC = 0;
      dq = 0;
      dv = 0;
      dE = -1L;
      dG = -1L;
      do = 0;
      dJ = 0;
      dn = 0;
      dm = 0;
      dy = new int[1000];
      dB = new String[8];
      ds = new boolean[8];
      ee = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      dW = -1;
      ed = false;
      dP = false;
      dT = new jy(true);
      dX = false;
      ef = -1;
      dZ = -1;
      dQ = 0;
      dY = 50;
      bi = null;
      dU = false;
      dM = -1;
      ea = -1;
      dN = null;
      dR = null;
      dS = 0;
      dO = null;
      ec = null;
      eg = 0;
      dV = 0;
      ei = null;
      ev = false;
      eh = -1;
      ex = -1;
      eu = false;
      er = -1;
      ej = -1;
      el = false;
      ey = new int[32];
      es = 0;
      eA = new int[32];
      et = 0;
      eo = new int[32];
      ez = 0;
      hd = new int[32];
      hc = 0;
      ep = 0;
      ew = 0;
      ek = 0;
      eq = 0;
      em = 0;
      en = 0;
      eH = 0;
      eJ = new jz();
      eC = 0;
      eK = -2;
      eE = new boolean[100];
      eL = new boolean[100];
      eN = new boolean[100];
      eF = new int[100];
      eB = new int[100];
      eQ = new int[100];
      eP = new int[100];
      eD = 0;
      eG = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      hk = new long[100];
      he = 0;
      eS = -1;
      hh = 0;
      hi = new int[1000];
      hj = new int[1000];
      hf = new iT[1000];
      eO = 0;
      eM = 0;
      eR = -1;
      eI = 0;
      eX = 0;
      fa = false;
      eZ = false;
      fc = false;
      fb = null;
      eW = null;
      eT = null;
      eV = new boolean[5];
      eY = new int[5];
      fq = new int[5];
      fn = new int[5];
      fk = new int[5];
      fg = -1;
      fo = -1;
      fr = new hQ();
      fl = new hb(8, osrs.gP.a);
      fh = new ArrayList();
      ff = new ArrayList(10);
      fi = 0;
      fm = 0;
      fp = new int[50];
      fj = new int[50];
      iZ.a = 231;
      fE = 1.0F;
      by = false;
      gy = false;
      gI = false;
      gc = 0.39269909262657166D;
      fR = new boolean[5];
      fD = false;
      hb = new int[osrs.cf.a.length];
      Q = 15000;
      fI = System.nanoTime();
      dx = !client.class.desiredAssertionStatus();
      fL = new int[23];
      gA = new int[23];
      gG = new int[23];
      eU = ((238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10)) * -71837669;
      fO = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
      R = 4.0D;
      bE = G = client::b;
      cV = LoggerFactory.getLogger("injected-client");
      C = new fE[21];
      gR = false;
      I = new ArrayList();
      eb = new ArrayList();
      fN = new ArrayList();
      new ArrayList();
      gp = 0;
      gS = -1;
      an();
      S = false;
      B = new HashMap();
      du = new HashMap();
      if (osrs.bj.b != null) {
         osrs.bj.b.a(256);
         gq = new int[osrs.ej.d.length];
      }

      fS = new ArrayList();
      fT = new ArrayList();
   }
}
