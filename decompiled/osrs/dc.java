package osrs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public final class dc extends dz {
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -198317875
   )
   private int a;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   private dx f;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lle;"
   )
   private dk g;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -2105074555
   )
   private int h;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1509856945
   )
   private int i;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 864766503
   )
   private int j;

   @ObfuscatedSignature(
      signature = "(Lnp;Lnp;ILle;)V"
   )
   dc(ew var1, ew var2, int var3, dk var4) {
      super(var1, var2);
      this.j = var3;
      this.g = var4;
      this.e();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-963913416"
   )
   final int a() {
      return this.h;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2005636344"
   )
   public final int b() {
      return this.i;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-341446402"
   )
   final int c() {
      return this.a;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)Llp;",
      garbageValue = "111016802"
   )
   final dx d() {
      return this.f;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   final void e() {
      this.i = bJ.b(jT.b(this.j), (byte)0).z;
      this.f = dk.a(this.g, aL.a(this.i), (byte)21);
      iT var1;
      if ((var1 = aL.a(this.i).a(false)) != null) {
         this.h = var1.a;
         this.a = var1.e;
      } else {
         this.h = 0;
         this.a = 0;
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(B)Ljava/util/Date;",
      garbageValue = "-76"
   )
   static Date f() throws ParseException {
      SimpleDateFormat var0;
      (var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH)).setLenient(false);
      StringBuilder var1 = new StringBuilder();
      String[] var2 = jB.r;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         String var4;
         if ((var4 = var2[var3]) == null) {
            O.a("Date not valid.", "Please ensure all characters are populated.", "");
            return null;
         }

         var1.append(var4);
      }

      var1.append("12");
      return var0.parse(var1.toString());
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "([J[Ljava/lang/Object;III)V",
      garbageValue = "-301953778"
   )
   public static void a(long[] var0, Object[] var1, int var2, int var3) {
      while(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         var4 = var6 == Long.MAX_VALUE ? 0 : 1;

         for(int var9 = var2; var9 < var3; ++var9) {
            if (var0[var9] < var6 + (long)(var9 & var4)) {
               long var11 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var11;
               Object var10 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         a(var0, var1, var2, var5 - 1);
         var2 = var5 + 1;
         var1 = var1;
         var0 = var0;
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-39130042"
   )
   static void g() {
      Iterator var0 = ee.e.iterator();

      while(var0.hasNext()) {
         ev var1;
         if ((var1 = (ev)var0.next()) != null) {
            var1.m.d();
            var1.m.g();
            var1.m.b(0);
            var1.m.d = 0;
            fs.b(var1.g, var1.j);
         }
      }

      ee.e.clear();
   }

   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1785959251"
   )
   static int h() {
      if (client.ff != null && client.fi < client.ff.size()) {
         int var0 = 0;

         for(int var1 = 0; var1 <= client.fi; ++var1) {
            var0 += ((iY)client.ff.get(var1)).a;
         }

         return var0 * 10000 / client.fm;
      } else {
         return 10000;
      }
   }

   @ObfuscatedName("pb")
   @ObfuscatedSignature(
      signature = "(Lbc;I)V",
      garbageValue = "-39384719"
   )
   static void a(cY var0) {
      if (aN.a != var0) {
         aN.a = var0;
      }

   }
}
