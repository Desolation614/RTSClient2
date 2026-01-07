package osrs;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vp")
public final class iH {
   @ObfuscatedName("aj")
   RandomAccessFile a;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      longValue = 1652190434409880809L
   )
   private long b;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      longValue = -2117288706540719639L
   )
   private long c;

   public iH(File var1, String var2, long var3) throws IOException {
      if (-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() > var3) {
         var1.delete();
      }

      this.a = new RandomAccessFile(var1, var2);
      this.c = var3;
      this.b = 0L;
      int var5;
      if ((var5 = this.a.read()) != -1 && !var2.equals("r")) {
         this.a.seek(0L);
         this.a.write(var5);
      }

      this.a.seek(0L);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1665853024"
   )
   public final void a(byte[] var1, int var2, int var3) throws IOException {
      while(var3 > 0) {
         int var4;
         if ((var4 = this.a.read(var1, var2, var3)) == -1) {
            throw new EOFException();
         }

         this.b += (long)var4;
         var2 += var4;
         var3 -= var4;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "([BIIB)I",
      garbageValue = "-97"
   )
   public final int b(byte[] var1, int var2, int var3) throws IOException {
      int var4;
      if ((var4 = this.a.read(var1, var2, var3)) > 0) {
         this.b += (long)var4;
      }

      return var4;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "549460888"
   )
   public final void a() throws IOException {
      if (this.a != null) {
         this.a.close();
         this.a = null;
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "426486803"
   )
   public final void c(byte[] var1, int var2, int var3) throws IOException {
      if (this.b + (long)var3 > this.c) {
         this.a.seek(this.c);
         this.a.write(1);
         throw new EOFException();
      } else {
         this.a.write(var1, var2, var3);
         this.b += (long)var3;
      }
   }

   @ObfuscatedName("ap")
   public final void a(long var1) throws IOException {
      this.a.seek(var1);
      this.b = var1;
   }

   protected final void finalize() throws Throwable {
      if (this.a != null) {
         this.a();
      }

   }
}
