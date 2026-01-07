package osrs;

import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public final class aR extends ak {
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      signature = "Lwy;"
   )
   static jp a;
   @ObfuscatedName("aj")
   private String b;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1713242295
   )
   private int c;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      longValue = 1847766597588277827L
   )
   private long d;
   @ObfuscatedSignature(
      signature = "Lfp;"
   )
   private ai e;

   @ObfuscatedSignature(
      signature = "(Lfp;)V"
   )
   aR(ai var1) {
      this.e = var1;
      this.d = -1L;
      this.b = null;
      this.c = 0;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lgu;I)V",
      garbageValue = "-1572789515"
   )
   final void a(aP var1) {
      var1.a(this.d, this.b, this.c);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-1635342078"
   )
   final void a(jk var1) {
      if (jk.a(var1, (byte)-31) != 255) {
         --var1.c;
         this.d = var1.e();
      }

      this.b = var1.k();
      this.c = var1.d();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Ljava/io/File;ZI)Z",
      garbageValue = "-581170605"
   )
   static boolean a(File var0, boolean var1) {
      try {
         RandomAccessFile var2;
         int var3 = (var2 = new RandomAccessFile(var0, "rw")).read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(IIII)J",
      garbageValue = "871737452"
   )
   static long a(int var0, int var1, int var2) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }
}
