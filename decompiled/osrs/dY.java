package osrs;

import java.util.function.Consumer;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public final class dY {
   @ObfuscatedName("lq")
   @ObfuscatedGetter(
      intValue = -991701221
   )
   static int a;
   @ObfuscatedName("aa")
   String b;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1147961811
   )
   int c;
   @ObfuscatedName("ae")
   public Consumer d;
   @ObfuscatedName("ah")
   boolean e;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1920339353
   )
   int f;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1118476265
   )
   int g;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1589067211
   )
   int h;
   @ObfuscatedName("am")
   String i;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -550876181
   )
   int j;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -72210831
   )
   int k;

   dY() {
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "8"
   )
   static void a() {
      kn.b.trim();
      if (kn.b.length() != 6) {
         a("", "Please enter a 6-digit PIN.", "");
      } else {
         jV.b = Integer.parseInt(kn.b);
         kn.b = "";
         client.ab = jB.p ? as.b : as.a;
         a("", "Connecting to server...", "");
         jT.d(20);
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-1765096593"
   )
   static void a(String var0, String var1, String var2) {
      jB.o = var0;
      jB.q = var1;
      jB.h = var2;
   }
}
