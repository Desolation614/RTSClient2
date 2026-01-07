package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wu")
public final class jl implements fN {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lwu;"
   )
   static final jl a = new jl(1, 1);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lwu;"
   )
   static final jl b = new jl(2, 2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lwu;"
   )
   public static final jl c = new jl(0, 0);
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1960515693
   )
   public final int d;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1176597651
   )
   final int e;

   private jl(int var1, int var2) {
      this.d = var1;
      this.e = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "26"
   )
   public final int a() {
      return this.e;
   }

   @ObfuscatedName("wf")
   @ObfuscatedSignature(
      signature = "(Lqb;Lqh;)V"
   )
   public static void a(fL var0, fR var1) {
      var0.a = var1;
      fL.a(var0);
   }
}
