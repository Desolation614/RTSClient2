package osrs;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import sun.misc.Unsafe;

@ObfuscatedName("nb")
public class eg extends ex {
   @ObfuscatedName("at")
   private static Unsafe b = d();
   @ObfuscatedName("rz")
   private static boolean c = !eg.class.desiredAssertionStatus();
   @ObfuscatedName("aa")
   private long d;
   @ObfuscatedName("ap")
   private ByteBuffer e;
   @ObfuscatedName("fd")
   private int f;

   eg() {
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "([BB)V",
      garbageValue = "1"
   )
   final void a(byte[] var1) {
      if (b != null) {
         if (!c && this.d != 0L) {
            throw new AssertionError();
         } else {
            long var2 = b.allocateMemory((long)var1.length);
            b.copyMemory(var1, (long)Unsafe.ARRAY_BYTE_BASE_OFFSET, (Object)null, var2, (long)var1.length);
            this.d = var2;
            this.f = var1.length;
         }
      } else {
         this.e = ByteBuffer.allocateDirect(var1.length);
         this.e.position(0);
         this.e.put(var1);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)[B",
      garbageValue = "-1961071285"
   )
   final byte[] a() {
      byte[] var1;
      if (b != null) {
         var1 = new byte[this.f];
         b.copyMemory((Object)null, this.d, var1, (long)Unsafe.ARRAY_BYTE_BASE_OFFSET, (long)this.f);
         return var1;
      } else {
         var1 = new byte[this.e.capacity()];
         this.e.position(0);
         this.e.get(var1);
         return var1;
      }
   }

   @ObfuscatedName("fc")
   public final void b() {
      if (b != null) {
         b.freeMemory(this.d);
         this.d = 0L;
         this.f = 0;
      }

   }

   @ObfuscatedName("yl")
   private static Unsafe d() {
      try {
         Field var0;
         if (!(var0 = Unsafe.class.getDeclaredField("theUnsafe")).getType().equals(Unsafe.class)) {
            return null;
         } else {
            int var1;
            if (Modifier.isStatic(var1 = var0.getModifiers()) && Modifier.isFinal(var1)) {
               var0.setAccessible(true);
               return (Unsafe)var0.get((Object)null);
            } else {
               return null;
            }
         }
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedName("ai")
   public static int a(long var0) {
      return (int)(var0 >>> 20);
   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-461915513"
   )
   static int c() {
      return client.aT ? 2 : 1;
   }

   @ObfuscatedName("kf")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)Z",
      garbageValue = "1"
   )
   static boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      return af.a(ec.a.m, var0, var1, var2, var3, var4, var5);
   }

   static {
      if (b == null) {
         client.cV.info("unable to find Unsafe, using direct buffer");
      }

   }
}
