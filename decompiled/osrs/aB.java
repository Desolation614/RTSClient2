package osrs;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("gh")
public final class aB extends aG {
   @ObfuscatedName("ai")
   private String a;
   @ObfuscatedName("aj")
   private byte b;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1615171389
   )
   private int c;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1393182613
   )
   private int d;
   @ObfuscatedSignature(
      signature = "Lgg;"
   )
   private aA e;

   @ObfuscatedSignature(
      signature = "(Lgg;)V"
   )
   aB(aA var1) {
      this.e = var1;
      this.d = -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lgd;B)V",
      garbageValue = "0"
   )
   final void a(aw var1) {
      af var2;
      (var2 = (af)var1.f.get(this.d)).d = this.b;
      var2.b = this.c;
      var2.c = new jw(this.a);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;I)V",
      garbageValue = "-830685594"
   )
   final void a(jk var1) {
      jk.a((jk)var1, (byte)71);
      this.d = var1.d();
      this.b = var1.B();
      this.c = var1.d();
      var1.e();
      this.a = var1.p();
      jk.a((jk)var1, (byte)17);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "11"
   )
   static void a() {
      dY.a("", "Connecting to server...", "");
      client.af = iS.a;
      client.ab = j.aS.b(jB.e) ? as.e : as.d;
      jT.d(20);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1114820666"
   )
   public static void b() {
      bz.a.clear();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lwt;B)Ljava/lang/String;",
      garbageValue = "96"
   )
   public static String b(jk var0) {
      return av.a(var0, 32767);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
      garbageValue = "534799523"
   )
   static float[] a(JSONObject var0, String var1) throws JSONException {
      float[] var2 = new float[4];

      try {
         JSONArray var4 = var0.getJSONArray(var1);
         var2[0] = (float)var4.optDouble(0, 0.0D);
         var2[1] = (float)var4.optDouble(1, 0.0D);
         var2[2] = (float)var4.optDouble(2, 1.0D);
         var2[3] = (float)var4.optDouble(3, 1.0D);
      } catch (JSONException var3) {
         var2[0] = 0.0F;
         var2[1] = 0.0F;
         var2[2] = 1.0F;
         var2[3] = 1.0F;
      }

      return var2;
   }
}
