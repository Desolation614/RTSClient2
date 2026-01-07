package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public final class aJ extends ak {
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -450013719
   )
   static int a;
   @ObfuscatedName("ua")
   static boolean b;
   @ObfuscatedName("aj")
   private String c;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1507735327
   )
   private int d;
   @ObfuscatedSignature(
      signature = "Lfp;"
   )
   private ai e;

   @ObfuscatedSignature(
      signature = "(Lfp;)V"
   )
   aJ(ai var1) {
      this.e = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lgu;I)V",
      garbageValue = "-1572789515"
   )
   final void a(aP var1) {
      String var3 = this.c;
      int var2 = this.d;
      if (var3 == null) {
         var3 = "";
      } else if (var3.length() > 80) {
         var3 = var3.substring(0, 80);
      }

      boolean var10000;
      if (var1.z != null) {
         hR var4;
         if ((var4 = var1.z.b((long)var2)) != null) {
            hW var5;
            if (var4 instanceof hW && (var5 = (hW)var4).a instanceof String) {
               if (var3.equals(var5.a)) {
                  var10000 = false;
               } else {
                  gk.a(var5);
                  var1.z.b(new hW(var3), var5.cf);
                  var10000 = true;
               }

               return;
            }

            gk.a(var4);
         }
      } else {
         var1.z = new ga(4);
      }

      var1.z.b(new hW(var3), (long)var2);
      var10000 = true;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-1635342078"
   )
   final void a(jk var1) {
      this.d = jk.d(var1, 1687107415);
      this.c = var1.p();
   }
}
