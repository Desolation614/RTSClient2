package osrs;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
public abstract class dn implements dP {
   @ObfuscatedName("fv")
   static boolean a;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1850309007
   )
   protected int b;

   @ObfuscatedSignature(
      signature = "(Lon;Lqt;I)V"
   )
   protected dn(int var1) {
      this.b = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(Ltp;I)I",
      garbageValue = "1841229055"
   )
   public static int a(hD var0) {
      gl.a(var0, (iv)null, false);
      int var1 = var0.c * 935110769;
      int var2 = -1;
      int var6;
      if (var0.d == iv.c) {
         int[] var3 = var0.a;

         for(var6 = 0; var6 < var1; ++var6) {
            if (var2 == -1 || var3[var6] > var3[var2]) {
               var2 = var6;
            }
         }
      } else if (var0.d == iv.a) {
         long[] var8 = var0.f;

         for(var6 = 0; var6 < var1; ++var6) {
            if (var2 == -1 || var8[var6] > var8[var2]) {
               var2 = var6;
            }
         }
      } else if (var0.d == iv.b) {
         String var9 = null;
         Object[] var7 = var0.b;

         for(int var4 = 0; var4 < var1; ++var4) {
            String var5 = (String)var7[var4];
            if (var2 == -1 || var5 != null && var5.compareTo(var9) > 0) {
               var2 = var4;
               var9 = var5;
            }
         }
      }

      return var2;
   }

   @ObfuscatedName("kv")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1534634605"
   )
   static final void a() {
      Iterator var0 = client.ag.iterator();

      while(var0.hasNext()) {
         ih.a((kd)var0.next());
      }

   }
}
