package osrs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ix")
public final class bY {
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "Lps;"
   )
   static fB a;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lix;"
   )
   static final bY b = new bY();
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1532250959
   )
   private int c = 0;
   @ObfuscatedName("an")
   private Map d = new HashMap();

   bY() {
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(B)Ljava/util/Map;",
      garbageValue = "78"
   )
   private Map a() {
      HashMap var1 = new HashMap();
      ArrayList var2;
      (var2 = new ArrayList()).addAll(this.d.entrySet());
      boolean var3 = false;

      Entry var6;
      while(!var3) {
         var3 = true;

         for(int var4 = 0; var4 < var2.size() - 1; ++var4) {
            if (((bO)((Entry)var2.get(var4)).getValue()).d > ((bO)((Entry)var2.get(var4 + 1)).getValue()).d) {
               var6 = (Entry)var2.get(var4);
               var2.set(var4, var2.get(var4 + 1));
               var2.set(var4 + 1, var6);
               var3 = false;
            }
         }
      }

      Iterator var7 = var2.iterator();

      while(var7.hasNext()) {
         var6 = (Entry)var7.next();
         var1.put(var6.getKey(), var6.getValue());
      }

      return var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lorg/json/JSONObject;ILes;I)V",
      garbageValue = "-467091703"
   )
   final void a(JSONObject var1, int var2, K var3) {
      this.d.clear();

      JSONObject var4;
      try {
         var4 = var1;
         this.c = var2;
         var1.getLong("lastfullsyncat");
         var1.getLong("lastcardupdatedat");
      } catch (Exception var6) {
         return;
      }

      try {
         this.a(var4.getJSONArray("crmcomponents"), this.c, var3);
      } catch (Exception var5) {
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Lio;",
      garbageValue = "94"
   )
   final bO a(String var1) {
      return (bO)this.d.get(var1);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lorg/json/JSONArray;ILes;I)V",
      garbageValue = "-350853634"
   )
   private void a(JSONArray var1, int var2, K var3) throws JSONException {
      if (var1 != null) {
         for(int var4 = 0; var4 < var1.length(); ++var4) {
            JSONObject var5;
            String var6;
            if ((var5 = var1.getJSONObject(var4)).getString("game").equals("osrs") && !var5.getBoolean("removed") && !(var6 = var5.getString("platform")).equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
               bO var9 = new bO();

               try {
                  var9.a(var5, var2, var3);
               } catch (Exception var7) {
               }

               if (!var9.h.isEmpty()) {
                  String var8 = var5.getString("location");
                  this.d.put(var8, var9);
               }
            }
         }

         this.d = this.a();
         au.a();
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(IIIIB)I",
      garbageValue = "1"
   )
   static final int a(int var0, int var1, int var2, int var3) {
      return var0 * var2 - var3 * var1 >> 16;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;Lks;III)V",
      garbageValue = "-838032069"
   )
   public static void a(jo var0, cW var1, int var2, int var3) {
      boolean var7 = false;
      int var10001 = 0 << 7;
      var7 = false;
      int var4 = 0 << 7;
      var3 = var10001;
      var1.b = var3;
      var1.c = var4;
      byte var9 = 0;
      var1.a = var9;
      var1.a(0);
      byte var8;
      if ((var8 = var0.B()) != 0) {
         var3 = eA.a(var0, var8, 0);
         var4 = eA.a(var0, var8, 2);
         int var5 = eA.a(var0, var8, 4);
         int var6 = eA.a(var0, var8, 6);
         var1.a(var3, var4, var5, var6);
      }

   }
}
