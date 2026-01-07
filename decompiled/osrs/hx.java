package osrs;

import net.runelite.api.ChatMessageType;
import net.runelite.api.MessageNode;
import net.runelite.api.events.ChatMessage;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
public abstract class hx {
   @ObfuscatedName("ic")
   @ObfuscatedGetter(
      intValue = 1976217619
   )
   static int a;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lve;"
   )
   iv b;

   hx() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "733867921"
   )
   static void a(int var0, String var1, String var2, String var3) {
      iu var4;
      if ((var4 = (iu)ki.d.get(var0)) == null) {
         var4 = new iu();
         ki.d.put(var0, var4);
      }

      dj var8 = var4.a(var0, var1, var2, var3);
      ki.b.b(var8, (long)var8.i);
      ki.c.a((im)var8);
      client.ce = client.bU * 733503027;
      MessageNode var9 = ((iu)dF.c.getChatLineMap().get(var0)).getLines()[0];
      ChatMessageType var5;
      if ((var5 = ChatMessageType.of(var0)) == ChatMessageType.CLAN_CHAT && var2 != null && var2.startsWith("|")) {
         var5 = ChatMessageType.CLAN_GIM_CHAT;
         var2 = var2.substring(1);
      }

      if (var5 == ChatMessageType.CLAN_MESSAGE && var2 != null && var2.startsWith("|")) {
         var5 = ChatMessageType.CLAN_GIM_MESSAGE;
         var2 = var2.substring(1);
      }

      if (client.cV.isDebugEnabled()) {
         String var6 = var5 == ChatMessageType.UNKNOWN ? String.valueOf(var0) : var5.name();
         client.cV.debug("Chat message type {}: {}", var6, var2);
      }

      ChatMessage var7 = new ChatMessage(var9, var5, var1, var2, var3, var9.getTimestamp());
      dF.c.getCallbacks().post(var7);
   }

   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "(Lth;Lwt;I)V"
   )
   public static void a(hB var0, jk var1, int var2) {
      while((var2 = jk.a(var1, (byte)-39)) != 0) {
         hz var3;
         if ((var3 = (hz)aU.a(jL.b(), var2)) != null) {
            switch(var3.f) {
            case 0:
               var1.w();
               break;
            case 1:
            default:
               throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + String.valueOf(var3));
            case 2:
               var2 = jk.a(var1, (byte)-89);
               var0.b = de.a(var2);
               if (var0.b != null) {
                  break;
               }

               throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var2);
            case 3:
               aU.a(new fj[]{fj.c, fj.b, fj.d, fj.a}, jk.a(var1, (byte)-23));
            }
         }
      }

   }
}
