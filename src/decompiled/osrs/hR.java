package osrs;

import net.runelite.api.Node;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ub")
public class hR implements Node {
   @ObfuscatedName("hb")
   public long cf;
   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      signature = "Lub;"
   )
   public hR cg;
   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      signature = "Lub;"
   )
   public hR ch;

   @ObfuscatedName("jw")
   public final void l() {
      this.a();
      if (this.cg != null) {
         this.cg.cg = this.cg;
         this.ch.cg = this.cg;
         this.cg = null;
         this.ch = null;
      }

   }

   @ObfuscatedName("kk")
   private void a() {
      if (this.cg != null) {
         this.cg.ch = this.ch;
         this.ch.cg = this.cg;
         this.ch = null;
         this.cg = null;
      }

   }

   @ObfuscatedName("nv")
   public void m() {
   }

   public long getHash() {
      return this.cf;
   }

   public Node getNext() {
      return this.ch;
   }

   public Node getPrevious() {
      return this.cg;
   }
}
