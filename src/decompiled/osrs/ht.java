package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
public abstract class ht extends dn implements iX {
   @ObfuscatedSignature(
      signature = "(Lon;Lqt;I)V"
   )
   protected ht(eV var1, gd var2, int var3) {
      super(var3);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Lwt;I)Lwv;",
      garbageValue = "-1304473454"
   )
   public final jm a(jo var1) {
      int var2 = var1.d();
      hB var3 = this.b(var2);
      jm var7 = new jm(var2);
      Class var8;
      if ((var8 = var3.b.d) == Integer.class) {
         var7.a = jk.d((jk)var1, 1687107415);
      } else if (var8 == Long.class) {
         var7.a = var1.e();
      } else if (var8 == String.class) {
         var7.a = var1.w();
      } else {
         if (!iV.class.isAssignableFrom(var8)) {
            throw new IllegalStateException();
         }

         try {
            iV var6 = (iV)var8.newInstance();
            var7.a = var6;
         } catch (InstantiationException var4) {
         } catch (IllegalAccessException var5) {
         }
      }

      return var7;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-8"
   )
   public final int b() {
      return super.b;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/Object;",
      garbageValue = "2094088981"
   )
   public final Object a(int var1) {
      Object var10000;
      hB var3;
      if ((var3 = this.b(var1)) != null && var3.b != null) {
         if (var3.b == iv.c) {
            var10000 = 0;
         } else if (var3.b == iv.a) {
            var10000 = -1L;
         } else {
            if (var3.b != iv.b) {
               return null;
            }

            var10000 = "";
         }
      } else {
         var10000 = null;
      }

      return var10000;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)Lth;",
      garbageValue = "1059633187"
   )
   protected abstract hB b(int var1);
}
