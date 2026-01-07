package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public final class av extends ak {
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1911563409
   )
   static int a;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 997150031
   )
   private int b;
   @ObfuscatedSignature(
      signature = "Lfp;"
   )
   private ai c;

   @ObfuscatedSignature(
      signature = "(Lfp;)V"
   )
   av(ai var1) {
      this.c = var1;
      this.b = -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lgu;I)V",
      garbageValue = "-1572789515"
   )
   final void a(aP var1) {
      int var2 = this.b;
      boolean var10000;
      if (var1.j != var2 && var1.o[var2] != 126) {
         var1.o[var1.j] = 125;
         var1.n = var1.j;
         var1.o[var2] = 126;
         var1.j = var2;
         var10000 = true;
      } else {
         var10000 = false;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-1635342078"
   )
   final void a(jk var1) {
      this.b = var1.d();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Lwt;II)Ljava/lang/String;",
      garbageValue = "250730910"
   )
   static String a(jk var0, int var1) {
      try {
         if ((var1 = jk.a(var0, 1984544959)) > 32767) {
            var1 = 32767;
         }

         byte[] var2 = new byte[var1];
         int var10001 = var0.c;
         int var6 = 0;
         byte[] var5 = var2;
         int var4 = var0.c;
         byte[] var3 = var0.d;
         ef var13 = eF.b;
         int var10002;
         if (var1 == 0) {
            var10002 = 0;
         } else {
            int var8 = 0;
            int var7 = var1;
            int var9 = var4;

            while(true) {
               byte var10;
               if ((var10 = var3[var9]) < 0) {
                  var8 = var13.b[var8];
               } else {
                  ++var8;
               }

               int var11;
               if ((var11 = var13.b[var8]) < 0) {
                  var5[var6++] = (byte)(~var11);
                  if (var6 >= var7) {
                     break;
                  }

                  var8 = 0;
               }

               if ((var10 & 64) != 0) {
                  var8 = var13.b[var8];
               } else {
                  ++var8;
               }

               if ((var11 = var13.b[var8]) < 0) {
                  var5[var6++] = (byte)(~var11);
                  if (var6 >= var7) {
                     break;
                  }

                  var8 = 0;
               }

               if ((var10 & 32) != 0) {
                  var8 = var13.b[var8];
               } else {
                  ++var8;
               }

               if ((var11 = var13.b[var8]) < 0) {
                  var5[var6++] = (byte)(~var11);
                  if (var6 >= var7) {
                     break;
                  }

                  var8 = 0;
               }

               if ((var10 & 16) != 0) {
                  var8 = var13.b[var8];
               } else {
                  ++var8;
               }

               if ((var11 = var13.b[var8]) < 0) {
                  var5[var6++] = (byte)(~var11);
                  if (var6 >= var7) {
                     break;
                  }

                  var8 = 0;
               }

               if ((var10 & 8) != 0) {
                  var8 = var13.b[var8];
               } else {
                  ++var8;
               }

               if ((var11 = var13.b[var8]) < 0) {
                  var5[var6++] = (byte)(~var11);
                  if (var6 >= var7) {
                     break;
                  }

                  var8 = 0;
               }

               if ((var10 & 4) != 0) {
                  var8 = var13.b[var8];
               } else {
                  ++var8;
               }

               if ((var11 = var13.b[var8]) < 0) {
                  var5[var6++] = (byte)(~var11);
                  if (var6 >= var7) {
                     break;
                  }

                  var8 = 0;
               }

               if ((var10 & 2) != 0) {
                  var8 = var13.b[var8];
               } else {
                  ++var8;
               }

               if ((var11 = var13.b[var8]) < 0) {
                  var5[var6++] = (byte)(~var11);
                  if (var6 >= var7) {
                     break;
                  }

                  var8 = 0;
               }

               if ((var10 & 1) != 0) {
                  var8 = var13.b[var8];
               } else {
                  ++var8;
               }

               if ((var11 = var13.b[var8]) < 0) {
                  var5[var6++] = (byte)(~var11);
                  if (var6 >= var7) {
                     break;
                  }

                  var8 = 0;
               }

               ++var9;
            }

            var10002 = var9 + 1 - var4;
         }

         var0.c = var10001 + var10002;
         return osrs.ch.a(var2, 0, var1);
      } catch (Exception var12) {
         return "Cabbage";
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)[Ltv;",
      garbageValue = "-744024149"
   )
   public static hK[] a() {
      return new hK[]{hK.d, hK.b, hK.c, hK.a};
   }
}
