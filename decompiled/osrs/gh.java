package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
public final class gh extends cR {
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      signature = "Lwy;"
   )
   static jp f;
   @ObfuscatedName("jb")
   static String g;

   gh() {
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(IIILkf;I)Z",
      garbageValue = "-1878565050"
   )
   protected final boolean a(int var1, int var2) {
      return var1 == super.e && var2 == super.c;
   }

   @ObfuscatedName("ld")
   @ObfuscatedSignature(
      signature = "(Lbh;III)V",
      garbageValue = "899467936"
   )
   static final void a(dY var0, int var1, int var2) {
      if (var0 != null) {
         fw.a(var0.k, var0.g, var0.j, var0.f, var0.h, var0.c, var0.b, var0.i, var1, var2);
      }

   }

   @ObfuscatedName("nr")
   @ObfuscatedSignature(
      signature = "(Lcz;ZB)V",
      garbageValue = "0"
   )
   static final void a(jR var0, boolean var1) {
      client.a(var0, var1);
      int var2 = var0.d;
      int var3 = (int)var0.cf;
      gk.a(var0);
      if (var1) {
         jD.a.a(var2);
      }

      for(eM var4 = (eM)client.cy.a(); var4 != null; var4 = (eM)client.cy.c()) {
         if ((long)var2 == (var4.cf >> 48 & 65535L)) {
            gk.a(var4);
         }
      }

      fd var5;
      if ((var5 = jD.a.b(var3)) != null) {
         gs.a(var5);
      }

      if (client.cc != -1) {
         y.a(client.cc, 1);
      }

   }
}
