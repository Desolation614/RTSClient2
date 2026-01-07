package osrs;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
public abstract class hw {
   hw() {
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "797434832"
   )
   public abstract void a();

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "50"
   )
   public abstract void a(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-122"
   )
   public abstract int b() throws IOException;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-118"
   )
   public abstract boolean a(int var1) throws IOException;

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-2009179957"
   )
   public abstract int b(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-837832776"
   )
   public abstract int c() throws IOException;

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "([I[Ljava/lang/Object;IIB)V",
      garbageValue = "60"
   )
   public static void a(int[] var0, Object[] var1, int var2, int var3) {
      while(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         var4 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var0[var8] < (var8 & var4) + var6) {
               int var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               Object var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         a(var0, var1, var2, var5 - 1);
         var2 = var5 + 1;
         var1 = var1;
         var0 = var0;
      }

   }
}
