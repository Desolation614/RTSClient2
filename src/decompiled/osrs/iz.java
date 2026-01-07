package osrs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vi")
public final class iz implements iA {
   @ObfuscatedName("aj")
   private Map a;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lwh;"
   )
   private iX b;

   @ObfuscatedSignature(
      signature = "(Lwh;)V"
   )
   public iz(ht var1) {
      this.b = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/Object;B)V",
      garbageValue = "13"
   )
   public final void a(int var1, Object var2) {
      if (this.a == null) {
         this.a = new HashMap();
         this.a.put(var1, new jm(var1, var2));
      } else {
         jm var3;
         if ((var3 = (jm)this.a.get(var1)) == null) {
            this.a.put(var1, new jm(var1, var2));
         } else {
            var3.a = var2;
         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "16"
   )
   public final int a(int var1) {
      jm var2;
      return this.a != null && (var2 = (jm)this.a.get(var1)) != null ? (Integer)var2.a : (Integer)this.b.a(var1);
   }

   public final Iterator iterator() {
      return this.a == null ? Collections.emptyList().iterator() : this.a.values().iterator();
   }
}
