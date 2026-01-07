package osrs;

import net.runelite.api.PacketBuffer;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wx")
public final class jo extends jk implements PacketBuffer {
   @ObfuscatedName("ap")
   private static int[] f = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lwo;"
   )
   jf e;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1377656211
   )
   private int g;

   public jo(int var1) {
      super(var1);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   public final int N() {
      int var1;
      return (var1 = super.d[++super.c - 1] - this.e.b() & 255) < 128 ? var1 : (var1 - 128 << 8) + (super.d[++super.c - 1] - this.e.b() & 255);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "66"
   )
   public final boolean O() {
      return (super.d[super.c] - this.e.a() & 255) >= 128;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "167145060"
   )
   public final int r(int var1) {
      return (var1 << 3) - this.g;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1979851245"
   )
   public final void P() {
      this.g = super.c << 3;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-126160068"
   )
   public final int Q() {
      return super.d[++super.c - 1] - this.e.b() & 255;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "1697636668"
   )
   public final void c(byte[] var1, int var2, int var3) {
      for(var2 = 0; var2 < var3; ++var2) {
         var1[var2] = (byte)(super.d[++super.c - 1] - this.e.b());
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1494039360"
   )
   public final void b() {
      super.b();
      this.e = null;
      this.g = 0;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-192851006"
   )
   public final int s(int var1) {
      int var2 = this.g >> 3;
      int var3 = 8 - (this.g & 7);
      int var4 = 0;

      for(this.g += var1; var1 > var3; var3 = 8) {
         var4 += (super.d[var2++] & f[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += super.d[var2] & f[var3];
      } else {
         var4 += super.d[var2] >> var3 - var1 & f[var1];
      }

      return var4;
   }

   @ObfuscatedName("ey")
   @ObfuscatedSignature(
      signature = "(Lwx;IB)V"
   )
   public static void b(jo var0, int var1, byte var2) {
      if (var0 == null) {
         var0.d[++var0.c - 1] = (byte)(var1 + var0.e.a());
      }

      var0.d[++var0.c - 1] = (byte)(var1 + var0.e.b());
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      signature = "(Lwx;[IB)V"
   )
   public static void a(jo var0, int[] var1, byte var2) {
      if (var0 == null) {
         var0.e = new jf(var1);
      }

      var0.e = new jf(var1);
   }

   @ObfuscatedName("ug")
   @ObfuscatedSignature(
      signature = "(Lwx;I)V"
   )
   public static void j(jo var0, int var1) {
      if (var0 == null) {
         var0.c = (var0.g + 7) / 8;
      } else {
         var0.c = (var0.g + 7) / 8;
      }
   }
}
