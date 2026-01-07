package osrs;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wk")
public final class jb implements Comparator {
   @ObfuscatedName("aj")
   public static String a;
   @ObfuscatedName("ap")
   private boolean b;

   public jb(boolean var1) {
      this.b = var1;
   }

   public final int compare(Object var1, Object var2) {
      gU var10001 = (gU)var1;
      gU var3 = (gU)var2;
      gU var4 = var10001;
      return this.b ? jw.a(var4.c, var3.c, -1272671100) : jw.a(var3.c, var4.c, -1272671100);
   }

   public final boolean equals(Object var1) {
      return super.equals(var1);
   }
}
