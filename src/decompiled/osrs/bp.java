package osrs;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public final class bp {
   @ObfuscatedName("lw")
   @ObfuscatedGetter(
      intValue = -1967414437
   )
   static int a;
   @ObfuscatedName("pv")
   static int[] b;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1967490067
   )
   private int d;
   @ObfuscatedName("ac")
   private boolean e;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lue;"
   )
   private hU f;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lsx;"
   )
   final hl c;
   @ObfuscatedName("al")
   private boolean g;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lag;"
   )
   private js h;
   @ObfuscatedName("ap")
   private HttpsURLConnection i;

   @ObfuscatedSignature(
      signature = "(Ljava/net/URL;Lag;Lsx;Z)V"
   )
   public bp(URL var1, js var2, hl var3, boolean var4) throws IOException {
      this.g = false;
      this.e = false;
      this.d = 300000;
      if (!js.a(var2, 77197743)) {
         throw new UnsupportedEncodingException("Unsupported request method used " + var2.e);
      } else {
         this.i = (HttpsURLConnection)var1.openConnection();
         if (!var4) {
            this.i.setSSLSocketFactory(cr.a());
         }

         this.h = var2;
         this.c = var3;
      }
   }

   @ObfuscatedSignature(
      signature = "(Ljava/net/URL;Lag;Z)V"
   )
   public bp(URL var1, js var2, boolean var3) throws IOException {
      this(var1, var2, new hl(), var3);
   }

   @ObfuscatedName("ai")
   private boolean a() throws IOException {
      if (!this.g) {
         this.c();
      }

      this.i.connect();
      return this.i.getResponseCode() == -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lue;I)V",
      garbageValue = "398577248"
   )
   public final void a(ig var1) {
      if (!this.g) {
         this.f = var1;
         if (this.f.b() != null) {
            hl var10000 = this.c;
            if var2 = this.f.b();
            var10000.a.put("Content-Type", var2.b);
            return;
         }

         this.c.a.remove("Content-Type");
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(B)Lao;"
   )
   private ac b() {
      try {
         boolean var10000 = this.e;
         return new ac("No REST response has been received yet.");
      } catch (IOException var2) {
         this.i.disconnect();
         return new ac("Error decoding REST response code: " + var2.getMessage());
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-239176657"
   )
   private void c() throws ProtocolException {
      if (!this.g) {
         this.i.setRequestMethod(this.h.e);
         this.c.a(this.i);
         if (this.h.f && this.f != null) {
            label94: {
               this.i.setDoOutput(true);
               ByteArrayOutputStream var1 = new ByteArrayOutputStream();
               boolean var8 = false;

               label85: {
                  try {
                     var8 = true;
                     var1.write(this.f.a());
                     var1.writeTo(this.i.getOutputStream());
                     var8 = false;
                     break label85;
                  } catch (IOException var12) {
                     var12.printStackTrace();
                     var8 = false;
                  } finally {
                     if (var8) {
                        try {
                           var1.close();
                        } catch (IOException var9) {
                           var9.printStackTrace();
                        }

                     }
                  }

                  try {
                     var1.close();
                  } catch (IOException var10) {
                     var10.printStackTrace();
                  }
                  break label94;
               }

               try {
                  var1.close();
               } catch (IOException var11) {
                  var11.printStackTrace();
               }
            }
         }

         this.i.setConnectTimeout(this.d);
         this.i.setInstanceFollowRedirects(this.e);
         this.g = true;
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(Lov;IIIB)V",
      garbageValue = "48"
   )
   static final void a(fd var0, int var1, int var2, int var3) {
      if (var0.aP == null) {
         throw new RuntimeException();
      } else {
         var0.aP[var1] = var2;
         var0.aH[var1] = var3;
      }
   }

   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      signature = "(Lau;I)Z"
   )
   public static boolean a(bp var0, int var1) throws IOException {
      if (var0 == null) {
         return var0.a();
      } else {
         if (!var0.g) {
            var0.c();
         }

         var0.i.connect();
         return var0.i.getResponseCode() == -1;
      }
   }

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      signature = "(Lau;B)Lao;"
   )
   public static ac a(bp var0, byte var1) {
      if (var0 == null) {
         var0.b();
      }

      try {
         if (!var0.g || var0.i.getResponseCode() == -1) {
            return new ac("No REST response has been received yet.");
         }
      } catch (IOException var7) {
         var0.i.disconnect();
         return new ac("Error decoding REST response code: " + var7.getMessage());
      }

      ac var8;
      try {
         var8 = new ac(var0.i);
         return var8;
      } catch (IOException var5) {
         var8 = new ac("Error decoding REST response: " + var5.getMessage());
      } finally {
         var0.i.disconnect();
      }

      return var8;
   }
}
