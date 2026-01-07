package osrs;

import net.runelite.api.MidiRequest;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
public final class ev implements MidiRequest {
   @ObfuscatedName("aa")
   public boolean a;
   @ObfuscatedName("ac")
   public boolean b = false;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "Lnh;"
   )
   public en c;
   @ObfuscatedName("ag")
   boolean d = false;
   @ObfuscatedName("ah")
   public boolean e = false;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1553516633
   )
   public int f = 0;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1904445923
   )
   public int g = -1;
   @ObfuscatedName("al")
   public float h = 0.0F;
   @ObfuscatedName("am")
   public boolean i;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1196301321
   )
   public int j = -1;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   public fB k;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "Ldz;"
   )
   public r l;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "Lmt;"
   )
   public ea m;
   @ObfuscatedName("tw")
   private boolean n;

   @ObfuscatedSignature(
      signature = "(Lps;Ljava/lang/String;Ljava/lang/String;IZ)V"
   )
   public ev(fE var1, String var2, String var3, int var4, boolean var5) {
      this.g = var1.b(var2);
      this.j = var1.a(this.g, var3);
      this.a(var1, this.g, this.j, var4, false);
   }

   @ObfuscatedSignature(
      signature = "(Lps;IIIZ)V"
   )
   public ev(fE var1, int var2, int var3, int var4, boolean var5) {
      this.a(var1, var2, 0, var4, false);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lps;IIIZI)V",
      garbageValue = "-153191873"
   )
   private void a(fB var1, int var2, int var3, int var4, boolean var5) {
      this.a(var1);
      this.k = var1;
      this.g = var2;
      this.j = var3;
      this.f = var4;
      this.b = var5;
   }

   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      signature = "(Lps;IIIZ)V"
   )
   private void a(fB var1) {
      fE var2 = (fE)var1;
      this.n = var2.u == 11;
   }

   public final int getArchiveId() {
      return this.g;
   }

   public final boolean isJingle() {
      return this.n;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1651487933"
   )
   static void a(boolean var0) {
      client var10000 = dF.c;
      if (!client.n() && !client.b(dF.c, 268272057)) {
         var10000 = dF.c;
         if (!client.o()) {
            jB.o = "";
            jB.q = "Enter your username/email & password.";
            jB.h = "";
            jW.a(2);
            if (var0) {
               jB.d = "";
            }

            if (jB.e == null || jB.e.isEmpty()) {
               if (osrs.j.aS.r != null) {
                  jB.e = osrs.j.aS.r;
                  client.C();
                  client.ah = true;
               } else {
                  client.ah = false;
               }
            }

            jL.a();
            return;
         }
      }

      jW.a(10);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lps;Lps;Lps;Lps;I)V",
      garbageValue = "-1272889423"
   )
   public static void a(fE var0, fE var1, fE var2, fE var3) {
      bP.d = var0;
      bP.a = var1;
      bY.a = var2;
      dD.a = var3;
   }

   @ObfuscatedName("np")
   @ObfuscatedSignature(
      signature = "(Lov;IIII)V",
      garbageValue = "47282756"
   )
   static final void a(fd var0, int var1, int var2) {
      ey var3;
      if ((var3 = var0.a(jD.a, false)) != null) {
         if (client.eX != 2 && client.eX != 5) {
            int var4 = dF.c.getCameraYawTarget() & 2047;

            try {
               if (client.F == null) {
                  client.F = client.S();
               }

               if (!client.J && client.bE == client.G) {
                  cm.b(var1, var2, var1 + var3.d, var2 + var3.b);
                  int var16 = client.do / 32 + 48;
                  int var7 = 464 - client.dn / 32;
                  dU.i.b(var1, var2, var3.d, var3.b, var16, var7, var4, 256, var3.a, var3.c);
                  client.a(var0, var1, var2, 0.03125F);
                  return;
               }

               double var6;
               double var8 = (var6 = client.R) / 128.0D;
               int var5 = Math.max(var3.d, var3.b) + 16;
               if (client.M == null || client.M.getWidth() != var5) {
                  client.M = new iT(var5, var5);
               }

               int var10 = (int)((double)(var5 / 2) / var8);
               int var11 = client.do - var10;
               var10 = client.dn - var10;
               int var12 = Math.max(-aM.a.o.e, var11 >> 7);
               int var13 = Math.max(-aM.a.o.e, var10 >> 7);
               client.a(aM.a, client.M, var6, aM.a.m, var12, var13, (int)((double)(-(var11 & 127)) * var8), (int)((double)(-(var10 & 127)) * var8));
               client.M.b(var1, var2, var3.d, var3.b, var5 / 2, var5 / 2, var4, 256, var3.a, var3.c);
               float var15 = (float)client.R / 128.0F;
               client.a(var0, var1, var2, var15);
            } catch (Exception var14) {
               client.cV.debug("minimap", var14);
               return;
            }
         } else {
            cm.b(var1, var2, var1 + var3.d, var2 + var3.b);
            cm.a(var1, var2, 0, var3.a, var3.c);
         }
      }

   }
}
