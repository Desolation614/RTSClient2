package osrs;

import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("uq")
public final class ig implements hU {
   @ObfuscatedName("aj")
   JSONObject a;

   public ig(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.a(var2);
   }

   public ig(JSONObject var1) {
      this.a = var1;
   }

   public ig(String var1) throws UnsupportedEncodingException {
      this.a(var1);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1130554091"
   )
   private void a(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.a = new JSONObject(var1);
         } else if (var1.charAt(0) != '[') {
            throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
         } else {
            JSONArray var3 = new JSONArray(var1);
            this.a = new JSONObject();
            this.a.put("arrayValues", var3);
         }
      } catch (JSONException var2) {
         throw new UnsupportedEncodingException(var2.getMessage());
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)[B",
      garbageValue = "2037324047"
   )
   public final byte[] a() throws UnsupportedEncodingException {
      return this.a == null ? new byte[0] : this.a.toString().getBytes("UTF-8");
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)Lup;",
      garbageValue = "329585455"
   )
   public final if b() {
      return if.a;
   }
}
