package osrs;

import net.runelite.api.MenuAction;
import net.runelite.mapping.ObfuscatedName;

final class kz {
   @ObfuscatedName("us")
   public static final int[] a = new int[MenuAction.values().length];

   static {
      try {
         a[MenuAction.WIDGET_TARGET.ordinal()] = 1;
      } catch (NoSuchFieldError var25) {
      }

      try {
         a[MenuAction.WIDGET_TARGET_ON_WIDGET.ordinal()] = 2;
      } catch (NoSuchFieldError var24) {
      }

      try {
         a[MenuAction.WIDGET_CONTINUE.ordinal()] = 3;
      } catch (NoSuchFieldError var23) {
      }

      try {
         a[MenuAction.CC_OP.ordinal()] = 4;
      } catch (NoSuchFieldError var22) {
      }

      try {
         a[MenuAction.CC_OP_LOW_PRIORITY.ordinal()] = 5;
      } catch (NoSuchFieldError var21) {
      }

      try {
         a[MenuAction.RUNELITE_WIDGET.ordinal()] = 6;
      } catch (NoSuchFieldError var20) {
      }

      try {
         a[MenuAction.ITEM_USE_ON_NPC.ordinal()] = 7;
      } catch (NoSuchFieldError var19) {
      }

      try {
         a[MenuAction.WIDGET_TARGET_ON_NPC.ordinal()] = 8;
      } catch (NoSuchFieldError var18) {
      }

      try {
         a[MenuAction.NPC_FIRST_OPTION.ordinal()] = 9;
      } catch (NoSuchFieldError var17) {
      }

      try {
         a[MenuAction.NPC_SECOND_OPTION.ordinal()] = 10;
      } catch (NoSuchFieldError var16) {
      }

      try {
         a[MenuAction.NPC_THIRD_OPTION.ordinal()] = 11;
      } catch (NoSuchFieldError var15) {
      }

      try {
         a[MenuAction.NPC_FOURTH_OPTION.ordinal()] = 12;
      } catch (NoSuchFieldError var14) {
      }

      try {
         a[MenuAction.NPC_FIFTH_OPTION.ordinal()] = 13;
      } catch (NoSuchFieldError var13) {
      }

      try {
         a[MenuAction.EXAMINE_NPC.ordinal()] = 14;
      } catch (NoSuchFieldError var12) {
      }

      try {
         a[MenuAction.WALK.ordinal()] = 15;
      } catch (NoSuchFieldError var11) {
      }

      try {
         a[MenuAction.ITEM_USE_ON_PLAYER.ordinal()] = 16;
      } catch (NoSuchFieldError var10) {
      }

      try {
         a[MenuAction.WIDGET_TARGET_ON_PLAYER.ordinal()] = 17;
      } catch (NoSuchFieldError var9) {
      }

      try {
         a[MenuAction.PLAYER_FIRST_OPTION.ordinal()] = 18;
      } catch (NoSuchFieldError var8) {
      }

      try {
         a[MenuAction.PLAYER_SECOND_OPTION.ordinal()] = 19;
      } catch (NoSuchFieldError var7) {
      }

      try {
         a[MenuAction.PLAYER_THIRD_OPTION.ordinal()] = 20;
      } catch (NoSuchFieldError var6) {
      }

      try {
         a[MenuAction.PLAYER_FOURTH_OPTION.ordinal()] = 21;
      } catch (NoSuchFieldError var5) {
      }

      try {
         a[MenuAction.PLAYER_FIFTH_OPTION.ordinal()] = 22;
      } catch (NoSuchFieldError var4) {
      }

      try {
         a[MenuAction.PLAYER_SIXTH_OPTION.ordinal()] = 23;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[MenuAction.PLAYER_SEVENTH_OPTION.ordinal()] = 24;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[MenuAction.PLAYER_EIGHTH_OPTION.ordinal()] = 25;
      } catch (NoSuchFieldError var1) {
      }

      try {
         a[MenuAction.RUNELITE_PLAYER.ordinal()] = 26;
      } catch (NoSuchFieldError var0) {
      }
   }
}
