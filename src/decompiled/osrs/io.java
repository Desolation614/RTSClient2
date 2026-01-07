package osrs;

import net.runelite.api.IntegerNode;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ux")
public final class io extends hR implements IntegerNode {
   @ObfuscatedName("ap")
   public int a;

   public io(int var1) {
      this.a = var1;
   }

   public final int getValue() {
      return this.a;
   }

   public final void setValue(int var1) {
      this.a = var1;
   }
}
