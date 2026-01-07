package osrs;

import net.runelite.api.NpcOverrides;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public final class br implements NpcOverrides {
   @ObfuscatedName("vt")
   @ObfuscatedGetter(
      intValue = 934735983
   )
   static int a;
   @ObfuscatedName("ai")
   short[] b;
   @ObfuscatedName("aj")
   int[] c;
   @ObfuscatedName("al")
   public boolean d = false;
   @ObfuscatedName("an")
   short[] e;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      longValue = 1697668634574992809L
   )
   public long f;

   public br(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
      this.f = var1;
      this.c = var3;
      this.e = var4;
      this.b = var5;
      this.d = var6;
   }

   public final boolean useLocalPlayer() {
      return this.d;
   }

   public final int[] getModelIds() {
      return this.c;
   }

   public final short[] getTextureToReplaceWith() {
      return this.b;
   }

   public final short[] getColorToReplaceWith() {
      return this.e;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-283722608"
   )
   static void a(int var0) {
      go.a = 16;
      go.c = new go[16];
      fG.a = 0;
   }

   @ObfuscatedName("ki")
   @ObfuscatedSignature(
      signature = "(Ldl;IIII)V",
      garbageValue = "2052648065"
   )
   static final void a(kd var0, int var1, int var2, int var3) {
      fU var4;
      if ((var4 = var0.v[var1][var2][var3]) == null) {
         ci.b(var0.o, var1, var2, var3);
         client.a(var0, var1, var2, var3);
      } else {
         long var5 = -99999999L;
         kk var7 = null;

         kk var8;
         for(var8 = (kk)fU.e(var4); var8 != null; var8 = (kk)fU.b(var4)) {
            bC var9;
            long var10 = (long)(var9 = cE.a(var8.h)).y;
            if (var9.C == 1) {
               var10 *= var8.e < Integer.MAX_VALUE ? (long)(var8.e + 1) : (long)var8.e;
            }

            if (var10 > var5) {
               var5 = var10;
               var7 = var8;
            }
         }

         if (var7 == null) {
            ci.b(var0.o, var1, var2, var3);
            client.a(var0, var1, var2, var3);
         } else {
            var4.a((hR)var7);
            kk var13 = null;
            kk var14 = null;

            for(var8 = (kk)fU.e(var4); var8 != null; var8 = (kk)fU.b(var4)) {
               if (var8.h != var7.h) {
                  if (var13 == null) {
                     var13 = var8;
                  }

                  if (var13.h != var8.h && var14 == null) {
                     var14 = var8;
                  }
               }
            }

            long var11 = cQ.a(var1, var2, var3, 3, false, 0, var0.k);
            ci.a(var0.o, var1, var2, var3, bW.a(var0, (var2 << 7) + 64, (var3 << 7) + 64, var1), var7, var11, var13, var14);
            client.a(var0, var1, var2, var3);
         }
      }
   }
}
