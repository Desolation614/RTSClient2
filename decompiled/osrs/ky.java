package osrs;

import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.runelite.api.Actor;
import net.runelite.api.Menu;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.widgets.Widget;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

public final class ky implements MenuEntry {
   @ObfuscatedName("gp")
   public int a;
   @ObfuscatedName("qi")
   @ObfuscatedSignature(
      signature = "Lxy;"
   )
   public final jy b;
   @ObfuscatedName("rs")
   public Consumer c;

   @ObfuscatedSignature(
      signature = "(Lxy;I)V"
   )
   public ky(jy var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   @Nullable
   public final NPC getNpc() {
      // $FF: Couldn't be decompiled
   }

   public final String getOption() {
      return this.b.f[this.a];
   }

   public final int getWorldViewId() {
      return this.b.a[this.a];
   }

   public final int getIdentifier() {
      return this.b.g[this.a];
   }

   public final MenuAction getType() {
      int var1;
      if ((var1 = this.b.k[this.a]) >= 2000) {
         var1 -= 2000;
      }

      return MenuAction.of(var1);
   }

   public final String getTarget() {
      return this.b.e[this.a];
   }

   @Nullable
   public final Player getPlayer() {
      // $FF: Couldn't be decompiled
   }

   public final int getParam0() {
      return this.b.b[this.a];
   }

   public final int getParam1() {
      return this.b.j[this.a];
   }

   public final int getItemId() {
      return this.b.l[this.a];
   }

   public final boolean isForceLeftClick() {
      return this.b.m[this.a];
   }

   public final boolean isDeprioritized() {
      return this.b.k[this.a] >= 2000;
   }

   public final MenuEntry setDeprioritized(boolean var1) {
      int var2;
      int[] var3;
      if (var1) {
         if (this.b.k[this.a] < 2000) {
            var3 = this.b.k;
            var2 = this.a * -1286620329 * -1865588633;
            var3[var2] += 2000;
         }
      } else if (this.b.k[this.a] >= 2000) {
         var3 = this.b.k;
         var2 = this.a * -1286620329 * -1865588633;
         var3[var2] -= 2000;
      }

      return this;
   }

   public final MenuEntry setTarget(String var1) {
      this.b.e[this.a] = var1;
      return this;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof ky)) {
         return false;
      } else {
         ky var4 = (ky)var1;
         if (!(this instanceof ky)) {
            return false;
         } else if (this.getIdentifier() != var4.getIdentifier()) {
            return false;
         } else if (this.getParam0() != var4.getParam0()) {
            return false;
         } else if (this.getParam1() != var4.getParam1()) {
            return false;
         } else if (this.getItemId() != var4.getItemId()) {
            return false;
         } else if (this.isForceLeftClick() != var4.isForceLeftClick()) {
            return false;
         } else if (this.getWorldViewId() != var4.getWorldViewId()) {
            return false;
         } else if (this.isDeprioritized() != var4.isDeprioritized()) {
            return false;
         } else {
            String var2 = this.getOption();
            String var3 = var4.getOption();
            if (var2 == null) {
               if (var3 != null) {
                  return false;
               }
            } else if (!var2.equals(var3)) {
               return false;
            }

            label57: {
               var2 = this.getTarget();
               var3 = var4.getTarget();
               if (var2 == null) {
                  if (var3 == null) {
                     break label57;
                  }
               } else if (var2.equals(var3)) {
                  break label57;
               }

               return false;
            }

            MenuAction var5 = this.getType();
            MenuAction var6 = var4.getType();
            if (var5 == null) {
               if (var6 != null) {
                  return false;
               }
            } else if (!var5.equals(var6)) {
               return false;
            }

            return true;
         }
      }
   }

   public final int hashCode() {
      int var1 = ((((((59 + this.getIdentifier()) * 59 + this.getParam0()) * 59 + this.getParam1()) * 59 + this.getItemId()) * 59 + (this.isForceLeftClick() ? 79 : 97)) * 59 + this.getWorldViewId()) * 59 + (this.isDeprioritized() ? 79 : 97);
      String var2 = this.getOption();
      var1 = var1 * 59 + (var2 == null ? 43 : var2.hashCode());
      var2 = this.getTarget();
      var1 = var1 * 59 + (var2 == null ? 43 : var2.hashCode());
      MenuAction var3 = this.getType();
      return var1 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   public final void deleteSubMenu() {
      this.b.n[this.a] = null;
   }

   public final MenuEntry setForceLeftClick(boolean var1) {
      this.b.m[this.a] = var1;
      return this;
   }

   public final Widget getWidget() {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final Actor getActor() {
      NPC var1;
      return (Actor)((var1 = this.getNpc()) != null ? var1 : this.getPlayer());
   }

   public final boolean isItemOp() {
      MenuAction var1;
      if ((var1 = this.getType()) == MenuAction.CC_OP || var1 == MenuAction.CC_OP_LOW_PRIORITY || var1 == MenuAction.RUNELITE_WIDGET) {
         int var3 = this.b.g[this.a];
         if (this.b.j[this.a] == 9764864) {
            switch(var3) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
               return true;
            case 5:
            }
         }
      }

      return false;
   }

   public final MenuEntry onClick(Consumer var1) {
      this.c = var1;
      return this;
   }

   public final MenuEntry setType(MenuAction var1) {
      int var3 = this.b.k[this.a];
      short var4 = 0;
      if (var3 >= 2000) {
         var4 = 2000;
      }

      this.b.k[this.a] = var1.getId() + var4;
      return this;
   }

   public final Consumer onClick() {
      return this.c;
   }

   public final MenuEntry setParam0(int var1) {
      this.b.b[this.a] = var1;
      return this;
   }

   public final int getItemOp() {
      MenuAction var1;
      if ((var1 = this.getType()) == MenuAction.CC_OP || var1 == MenuAction.CC_OP_LOW_PRIORITY || var1 == MenuAction.RUNELITE_WIDGET) {
         int var4 = this.b.g[this.a];
         int var2 = this.b.j[this.a];
         int var3 = this.b.b[this.a];
         if (var2 == 9764864) {
            switch(var4) {
            case 1:
               fd var5;
               Widget var6;
               if ((var5 = dF.c.i(var2)) != null && var3 != -1 && (var6 = var5.getChild(var3)) != null && var6.getItemId() >= 0) {
                  client var10000 = dF.c;
                  if ((var4 = client.c(var6.getItemId()).getShiftClickActionIndex()) >= 0) {
                     return var4 + 1;
                  }
               }
               break;
            case 2:
               return 1;
            case 3:
               return 2;
            case 4:
               return 3;
            case 5:
            default:
               break;
            case 6:
               return 4;
            case 7:
               return 5;
            }
         }
      }

      return -1;
   }

   public final Menu createSubMenu() {
      return this.b.n[this.a] = new jy(false);
   }

   public final MenuEntry setParam1(int var1) {
      this.b.j[this.a] = var1;
      return this;
   }

   public final MenuEntry setIdentifier(int var1) {
      this.b.g[this.a] = var1;
      return this;
   }

   public final String toString() {
      String var10000 = this.getOption();
      return "MenuEntryImpl(getOption=" + var10000 + ", getTarget=" + this.getTarget() + ", getIdentifier=" + this.getIdentifier() + ", getType=" + String.valueOf(this.getType()) + ", getParam0=" + this.getParam0() + ", getParam1=" + this.getParam1() + ", getItemId=" + this.getItemId() + ", isForceLeftClick=" + this.isForceLeftClick() + ", getWorldViewId=" + this.getWorldViewId() + ", isDeprioritized=" + this.isDeprioritized() + ")";
   }

   public final Menu getSubMenu() {
      return this.b.n[this.a];
   }

   public final MenuEntry setOption(String var1) {
      this.b.f[this.a] = var1;
      return this;
   }

   public final MenuEntry setWorldViewId(int var1) {
      this.b.a[this.a] = var1;
      return this;
   }

   public final MenuEntry setItemId(int var1) {
      this.b.l[this.a] = var1;
      return this;
   }
}
