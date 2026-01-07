package osrs;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public final class ax extends jV {
   @ObfuscatedName("ai")
   private byte[] g;
   @ObfuscatedName("aj")
   private SourceDataLine h;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 389796733
   )
   private int i;
   @ObfuscatedName("ap")
   private AudioFormat j;

   ax() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1005956693"
   )
   protected final void a() {
      this.h.flush();
   }

   @ObfuscatedName("ai")
   protected final void b() {
      short var1 = 256;
      if (jV.a) {
         var1 = 512;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3;
         if (((var3 = super.d[var2]) + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.g[var2 << 1] = (byte)(var3 >> 8);
         this.g[(var2 << 1) + 1] = (byte)(var3 >> 16);
      }

      this.h.write(this.g, 0, var1 << 1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "608279250"
   )
   protected final void a(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.j, var1 << (jV.a ? 2 : 1));
         this.h = (SourceDataLine)AudioSystem.getLine(var2);
         this.h.open();
         this.h.start();
         this.i = var1;
      } catch (LineUnavailableException var3) {
         if (jV.b(var1) != 1) {
            this.a(jN.a(var1));
         } else {
            this.h = null;
            throw var3;
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1859747430"
   )
   protected final void c() {
      if (this.h != null) {
         this.h.close();
         this.h = null;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1325486588"
   )
   protected final int d() {
      return this.i - (this.h.available() >> (jV.a ? 2 : 1));
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1333754181"
   )
   protected final void e() {
      this.j = new AudioFormat((float)B.a, 16, jV.a ? 2 : 1, true, false);
      this.g = new byte[256 << (jV.a ? 2 : 1)];
   }
}
