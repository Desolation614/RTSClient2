package osrs;

import java.util.ArrayList;
import java.util.Calendar;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public final class hE {
   @ObfuscatedName("ad")
   static int[][] a = new int[5][5000];
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "[Lbt;"
   )
   static gs[] b = new gs[50];
   @ObfuscatedName("af")
   static int[] c = new int[1000];
   @ObfuscatedName("ah")
   static final double d = Math.log(2.0D);
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1023999147
   )
   static int e;
   @ObfuscatedName("al")
   static final String[] f = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   @ObfuscatedName("aq")
   static boolean g = false;
   @ObfuscatedName("ar")
   static int[] h = new int[5];
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "Loi;"
   )
   static eQ i = new eQ();
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -492415237
   )
   static int j = 0;
   @ObfuscatedName("au")
   static Object[] k;
   @ObfuscatedName("ax")
   static Calendar l = Calendar.getInstance();
   @ObfuscatedName("ay")
   static boolean m = false;
   @ObfuscatedName("az")
   static Object[] n = new Object[1000];
   @ObfuscatedName("ba")
   static ArrayList o = new ArrayList();
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 1600536679
   )
   static int p;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 260629727
   )
   static int q = 0;
   @ObfuscatedName("vi")
   @ObfuscatedGetter(
      intValue = 1781614849
   )
   static int r;

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "17273"
   )
   public static boolean a() {
      return !ee.g.isEmpty();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)Lhn;",
      garbageValue = "-724431597"
   )
   public static bj a(int var0) {
      bj var1;
      if ((var1 = (bj)dX.a(bj.b, (long)var0)) != null) {
         return var1;
      } else {
         byte[] var2 = fB.a(bj.a, 14, (int)var0);
         var1 = new bj();
         if (var2 != null) {
            jk var3 = new jk(var2);
            bj var7 = var1;

            int var4;
            while((var4 = jk.a((jk)var3, (byte)58)) != 0) {
               if (var4 == 1) {
                  var7.d = var3.d();
                  var7.e = jk.a(var3, (byte)-73);
                  var7.f = jk.a((jk)var3, (byte)2);
               }
            }
         }

         bj.b.a((im)var1, (long)var0);
         return var1;
      }
   }
}
