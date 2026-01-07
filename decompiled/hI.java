package osrs;

import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
public final class hI extends hw {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Ltl;"
   )
   private hA a;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Ltd;"
   )
   private hr b;
   @ObfuscatedName("ap")
   private Socket c;

   hI(Socket var1, int var2, int var3) throws IOException {
      this.c = var1;
      this.c.setSoTimeout(30000);
      this.c.setTcpNoDelay(true);
      this.c.setReceiveBufferSize(65536);
      this.c.setSendBufferSize(65536);
      this.a = new hA(this.c.getInputStream(), var2);
      this.b = new hr(this.c.getOutputStream(), var3);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "797434832"
   )
   public final void a() {
      hr var1;
      synchronized(var1 = this.b) {
         var1.e = true;
         var1.notifyAll();
      }

      try {
         var1.g.join();
      } catch (InterruptedException var4) {
      }

      try {
         this.c.close();
      } catch (IOException var3) {
      }

      hA.a(this.a, 58065257);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "50"
   )
   public final void a(byte[] var1, int var2, int var3) throws IOException {
      int var4 = var3;
      byte var10 = 0;
      byte[] var9 = var1;
      hr var8 = this.b;
      if (var4 >= 0 && var10 >= 0 && var4 + var10 <= var9.length) {
         synchronized(var8) {
            if (var8.a != null) {
               throw new IOException(var8.a.toString());
            } else {
               int var6;
               if (var8.d <= var8.b) {
                  var6 = var8.f - var8.b + var8.d - 1;
               } else {
                  var6 = var8.d - var8.b - 1;
               }

               if (var6 < var4) {
                  throw new IOException("");
               } else {
                  if (var4 + var8.b <= var8.f) {
                     System.arraycopy(var9, var10, var8.c, var8.b, var4);
                  } else {
                     var6 = var8.f - var8.b;
                     System.arraycopy(var9, var10, var8.c, var8.b, var6);
                     System.arraycopy(var9, var6 + var10, var8.c, 0, var4 - var6);
                  }

                  var8.b = (var4 + var8.b) % var8.f;
                  var8.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-122"
   )
   public final int b() throws IOException {
      return this.a.b();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-118"
   )
   public final boolean a(int var1) throws IOException {
      return this.a.a(var1);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-2009179957"
   )
   public final int b(byte[] var1, int var2, int var3) throws IOException {
      return this.a.a(var1, var2, var3);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-837832776"
   )
   public final int c() throws IOException {
      return this.a.a();
   }

   protected final void finalize() {
      this.a();
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Ltp;B)V",
      garbageValue = "3"
   )
   public static void a(hD var0) {
      gl.a(var0, (iv)null, true);
      int var1;
      if ((var1 = var0.c * 935110769) > 1) {
         if (var0.d == iv.c) {
            bf.a(var0.a, 0, var1 - 1);
            return;
         }

         if (var0.d == iv.a) {
            ay.a(var0.f, 0, var1 - 1);
            return;
         }

         dO.a(var0.b, 0, var1 - 1);
      }

   }
}
