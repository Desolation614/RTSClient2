package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public final class dm {
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(Lbg;I)V",
      garbageValue = "1938024718"
   )
   static void a(dO var0) {
      if (dO.a(var0, -196907475) != client.ac) {
         client.ac = dO.a(var0, -1656794454);
         bJ.a(dO.a(var0, 1017969484));
      }

      if (var0.i != client.aY) {
         eZ.a((fB)fk.a, var0.i);
      }

      cR.a = var0.g;
      client.aj = var0.k;
      client.aY = var0.i;
      fI.a = var0.j;
      gO.b = client.bl == 0 ? 'ꩊ' : var0.k + '鱀';
      er.a = client.bl == 0 ? 443 : var0.k + '썐';
      cb.b = gO.b;
      client.G();
   }
}
