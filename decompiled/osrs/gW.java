package osrs;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
public final class gW extends hg {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lvf;"
   )
   private iw a;

   @ObfuscatedSignature(
      signature = "(Lvf;)V"
   )
   public gW(iw var1) {
      super(400);
      this.a = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)[Lsi;",
      garbageValue = "-308089342"
   )
   final gU[] a(int var1) {
      return new hm[var1];
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lwt;II)V",
      garbageValue = "-197016394"
   )
   public final void a(jo var1, int var2) {
      while(var1.c < var2) {
         int var3;
         if ((var3 = jk.a((jk)var1, (byte)29)) == 4) {
            jw var9;
            if (!(var9 = new jw(var1.p(), this.a)).a()) {
               throw new IllegalStateException();
            }

            jE.b.a(jw.a(var9, -2094208150), false);
         } else {
            boolean var7 = (var3 & 1) != 0;
            jw var4 = new jw(var1.p(), this.a);
            jw var5 = new jw(var1.p(), this.a);
            var1.p();
            if (!var4.a()) {
               throw new IllegalStateException();
            }

            hm var6 = (hm)this.e(var4);
            hm var8;
            if (var7 && (var8 = (hm)this.e(var5)) != null && var6 != var8) {
               if (var6 != null) {
                  this.b((gU)var8);
               } else {
                  var6 = var8;
               }
            }

            if (var6 != null) {
               this.a(var6, var4, var5);
            } else if (super.h < 400) {
               var3 = super.h;
               ((hm)this.a(var4, var5)).d = var3;
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(B)Lsi;",
      garbageValue = "1"
   )
   final gU a() {
      return new hm();
   }

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      signature = "(Ldl;IIB)Lre;",
      garbageValue = "63"
   )
   static go a(kd var0, int var1, int var2) {
      if (var0 != null && aM.a != var0) {
         hG var3;
         return (var3 = (hG)aM.a.l.b((long)var0.k)) == null ? hv.a((float)var1, 0.0F, (float)var2) : var3.b(var1, var2);
      } else {
         return hv.a((float)var1, 0.0F, (float)var2);
      }
   }
}
