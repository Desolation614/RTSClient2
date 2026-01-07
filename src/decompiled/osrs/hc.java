package osrs;

import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
final class hc implements Comparator {
   @ObfuscatedSignature(
      signature = "Lsx;"
   )
   private hl a;

   @ObfuscatedSignature(
      signature = "(Lsx;)V"
   )
   hc(hl var1) {
      this.a = var1;
   }

   public final int compare(Object var1, Object var2) {
      Entry var10000 = (Entry)var1;
      Entry var4 = (Entry)var2;
      Entry var3 = var10000;
      return ((Float)var4.getValue()).compareTo((Float)var3.getValue());
   }

   public final boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1663738721"
   )
   static final int a(int var0) {
      return Math.abs(var0 - gv.a) > 1024 ? var0 + ((var0 < gv.a ? 1 : -1) << 11) : var0;
   }
}
