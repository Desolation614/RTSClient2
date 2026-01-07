package osrs;

import net.runelite.api.ChatPlayer;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
public class gX extends gU implements ChatPlayer {
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -727339729
   )
   public int d;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1974840189
   )
   public int e;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -654684761
   )
   public int f = -1;

   gX() {
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-986901278"
   )
   final void a(int var1, int var2) {
      this.f = var1;
      this.e = var2;
   }

   public int getWorld() {
      return this.f;
   }
}
