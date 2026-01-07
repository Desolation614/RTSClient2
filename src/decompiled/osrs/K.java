package osrs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public abstract class K implements Runnable {
   @ObfuscatedName("nf")
   static boolean b;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1823159129
   )
   private int a;
   @ObfuscatedName("aj")
   private volatile boolean c;
   @ObfuscatedName("an")
   private Queue d = new LinkedList();
   @ObfuscatedName("ap")
   private Thread e = new Thread(this);

   K(int var1) {
      this.e.setPriority(1);
      this.e.start();
      this.a = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Ljava/net/URLConnection;I)I",
      garbageValue = "-614165280"
   )
   static int a(URLConnection var0) {
      int var1 = G.a;
      if (var0 != null) {
         try {
            if (var0 instanceof HttpURLConnection) {
               var1 = ((HttpURLConnection)var0).getResponseCode();
            }
         } catch (IOException var2) {
         }
      }

      return var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(Ljava/net/URL;I)Leo;"
   )
   private G a(URL var1) {
      G var4 = new G(var1);
      synchronized(this) {
         this.d.add(var4);
         this.notify();
         return var4;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljava/net/URLConnection;I)V",
      garbageValue = "-990619832"
   )
   final void b(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.a);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Leo;B)V",
      garbageValue = "0"
   )
   abstract void a(G var1) throws IOException;

   public void run() {
      while(!this.c) {
         try {
            G var1;
            synchronized(this) {
               if ((var1 = (G)this.d.poll()) == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var3) {
                  }
                  continue;
               }
            }

            this.a(var1);
         } catch (Exception var5) {
            iE.a((String)null, var5);
         }
      }

   }

   @ObfuscatedName("yo")
   @ObfuscatedSignature(
      signature = "(Les;B)V"
   )
   public static void a(K var0, byte var1) {
      if (var0 == null) {
         K var7 = var0;
         var0.c = true;

         try {
            synchronized(var7) {
               var7.notify();
            }

            var7.e.join();
         } catch (InterruptedException var6) {
         }
      }

      var0.c = true;

      try {
         synchronized(var0) {
            var0.notify();
         }

         var0.e.join();
      } catch (InterruptedException var4) {
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "([J[IIII)V",
      garbageValue = "1549978929"
   )
   public static void a(long[] var0, int[] var1, int var2, int var3) {
      while(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         var4 = var6 == Long.MAX_VALUE ? 0 : 1;

         for(int var9 = var2; var9 < var3; ++var9) {
            if (var0[var9] < var6 + (long)(var9 & var4)) {
               long var11 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var11;
               int var10 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         a(var0, var1, var2, var5 - 1);
         var2 = var5 + 1;
         var1 = var1;
         var0 = var0;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1589928308"
   )
   public static int a(int var0) {
      return ih.a[var0 & 16383];
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(Lwt;Lqp;I)Lqp;",
      garbageValue = "883827698"
   )
   static final ga a(jk var0, ga var1) {
      int var2 = jk.a(var0, (byte)-53);
      int var3;
      if (var1 == null) {
         var3 = jN.a(var2);
         var1 = new ga(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = jk.a((jk)var0, (byte)16) == 1;
         int var5 = var0.f();
         Object var6;
         if (var4) {
            var6 = new hW(var0.p());
         } else {
            var6 = new io(jk.d(var0, 1687107415));
         }

         var1.b((hR)var6, (long)var5);
      }

      return var1;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      signature = "(ILcr;ZB)I",
      garbageValue = "21"
   )
   static int b(int var0) {
      if (var0 == 5000) {
         hE.c[++hE.e - 1] = client.cA;
         return 1;
      } else if (var0 == 5001) {
         hE.e -= 3;
         client.cA = hE.c[hE.e];
         if ((ft.a = ao.a(hE.c[hE.e + 1])) == null) {
            ft.a = jx.a;
         }

         client.cq = hE.c[hE.e + 2];
         dQ var10;
         (var10 = X.a(j.ak, client.P.f)).g.b(client.cA);
         var10.g.b(ft.a.d);
         var10.g.b(client.cq);
         client.P.a(var10);
         return 1;
      } else {
         int var1;
         int var2;
         dQ var3;
         String var4;
         if (var0 == 5002) {
            var4 = (String)hE.n[--aU.a];
            hE.e -= 2;
            var1 = hE.c[hE.e];
            var2 = hE.c[hE.e + 1];
            (var3 = X.a(j.C, client.P.f)).g.b(hd.a(var4) + 2);
            jk.a(var3.g, (String)var4, -1559098139);
            var3.g.b(var1 - 1);
            var3.g.b(var2);
            client.P.a(var3);
            return 1;
         } else {
            dj var5;
            if (var0 == 5003) {
               hE.e -= 2;
               var0 = hE.c[hE.e];
               var1 = hE.c[hE.e + 1];
               if ((var5 = I.a(var0, var1)) != null) {
                  hE.c[++hE.e - 1] = var5.i;
                  hE.c[++hE.e - 1] = var5.f;
                  hE.n[++aU.a - 1] = var5.e != null ? var5.e : "";
                  hE.n[++aU.a - 1] = var5.c != null ? var5.c : "";
                  hE.n[++aU.a - 1] = var5.b != null ? var5.b : "";
                  hE.c[++hE.e - 1] = dj.a(var5, (byte)13) ? 1 : (var5.a() ? 2 : 0);
               } else {
                  hE.c[++hE.e - 1] = -1;
                  hE.c[++hE.e - 1] = 0;
                  hE.n[++aU.a - 1] = "";
                  hE.n[++aU.a - 1] = "";
                  hE.n[++aU.a - 1] = "";
                  hE.c[++hE.e - 1] = 0;
               }

               return 1;
            } else if (var0 == 5004) {
               if ((var5 = dk.a(hE.c[--hE.e])) != null) {
                  hE.c[++hE.e - 1] = var5.h;
                  hE.c[++hE.e - 1] = var5.f;
                  hE.n[++aU.a - 1] = var5.e != null ? var5.e : "";
                  hE.n[++aU.a - 1] = var5.c != null ? var5.c : "";
                  hE.n[++aU.a - 1] = var5.b != null ? var5.b : "";
                  hE.c[++hE.e - 1] = dj.a(var5, (byte)-29) ? 1 : (var5.a() ? 2 : 0);
               } else {
                  hE.c[++hE.e - 1] = -1;
                  hE.c[++hE.e - 1] = 0;
                  hE.n[++aU.a - 1] = "";
                  hE.n[++aU.a - 1] = "";
                  hE.n[++aU.a - 1] = "";
                  hE.c[++hE.e - 1] = 0;
               }

               return 1;
            } else if (var0 == 5005) {
               if (ft.a == null) {
                  hE.c[++hE.e - 1] = -1;
               } else {
                  hE.c[++hE.e - 1] = ft.a.d;
               }

               return 1;
            } else {
               dQ var6;
               gd var10002;
               if (var0 == 5008) {
                  var4 = (String)hE.n[--aU.a];
                  int var10000 = hE.c[--hE.e];
                  var10002 = eN.c;
                  var6 = hZ.a(var10000, var4, -1);
                  client.P.a(var6);
                  return 1;
               } else if (var0 == 5009) {
                  aU.a -= 2;
                  var4 = (String)hE.n[aU.a];
                  String var7 = (String)hE.n[aU.a + 1];
                  (var6 = X.a(j.E, client.P.f)).g.d(0);
                  int var8 = var6.g.c;
                  jk.a(var6.g, (String)var4, -1559098139);
                  M.a(var6.g, var7);
                  var6.g.i(var6.g.c - var8);
                  client.P.a(var6);
                  return 1;
               } else if (var0 == 5010) {
                  var4 = (String)hE.n[--aU.a];
                  hE.e -= 2;
                  var1 = hE.c[hE.e];
                  var2 = hE.c[hE.e + 1];
                  var10002 = eN.c;
                  var3 = hZ.a(var1, var4, var2);
                  client.P.a(var3);
                  return 1;
               } else if (var0 != 5015) {
                  if (var0 == 5016) {
                     hE.c[++hE.e - 1] = client.cq;
                     return 1;
                  } else if (var0 == 5017) {
                     var0 = hE.c[--hE.e];
                     iu var9;
                     hE.c[++hE.e - 1] = (var9 = (iu)ki.d.get(var0)) == null ? 0 : var9.d;
                     return 1;
                  } else if (var0 == 5018) {
                     var0 = hE.c[--hE.e];
                     hE.c[++hE.e - 1] = (var5 = (dj)ki.b.b((long)var0)) == null ? -1 : (var5.aL == ki.c.b ? -1 : ((dj)var5.aL).i);
                     return 1;
                  } else if (var0 == 5019) {
                     var0 = hE.c[--hE.e];
                     hE.c[++hE.e - 1] = ar.a(var0);
                     return 1;
                  } else if (var0 == 5020) {
                     ac.a((String)hE.n[--aU.a]);
                     return 1;
                  } else if (var0 == 5021) {
                     client.cm = ((String)hE.n[--aU.a]).toLowerCase().trim();
                     return 1;
                  } else if (var0 == 5022) {
                     hE.n[++aU.a - 1] = client.cm;
                     return 1;
                  } else if (var0 == 5023) {
                     var4 = (String)hE.n[--aU.a];
                     System.out.println(var4);
                     return 1;
                  } else if (var0 == 5030) {
                     hE.e -= 2;
                     var0 = hE.c[hE.e];
                     var1 = hE.c[hE.e + 1];
                     if ((var5 = I.a(var0, var1)) != null) {
                        hE.c[++hE.e - 1] = var5.i;
                        hE.c[++hE.e - 1] = var5.f;
                        hE.n[++aU.a - 1] = var5.e != null ? var5.e : "";
                        hE.n[++aU.a - 1] = var5.c != null ? var5.c : "";
                        hE.n[++aU.a - 1] = var5.b != null ? var5.b : "";
                        hE.c[++hE.e - 1] = dj.a(var5, (byte)-4) ? 1 : (var5.a() ? 2 : 0);
                        hE.n[++aU.a - 1] = "";
                        hE.c[++hE.e - 1] = 0;
                     } else {
                        hE.c[++hE.e - 1] = -1;
                        hE.c[++hE.e - 1] = 0;
                        hE.n[++aU.a - 1] = "";
                        hE.n[++aU.a - 1] = "";
                        hE.n[++aU.a - 1] = "";
                        hE.c[++hE.e - 1] = 0;
                        hE.n[++aU.a - 1] = "";
                        hE.c[++hE.e - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == 5031) {
                     if ((var5 = dk.a(hE.c[--hE.e])) != null) {
                        hE.c[++hE.e - 1] = var5.h;
                        hE.c[++hE.e - 1] = var5.f;
                        hE.n[++aU.a - 1] = var5.e != null ? var5.e : "";
                        hE.n[++aU.a - 1] = var5.c != null ? var5.c : "";
                        hE.n[++aU.a - 1] = var5.b != null ? var5.b : "";
                        hE.c[++hE.e - 1] = dj.a(var5, (byte)-90) ? 1 : (var5.a() ? 2 : 0);
                        hE.n[++aU.a - 1] = "";
                        hE.c[++hE.e - 1] = 0;
                     } else {
                        hE.c[++hE.e - 1] = -1;
                        hE.c[++hE.e - 1] = 0;
                        hE.n[++aU.a - 1] = "";
                        hE.n[++aU.a - 1] = "";
                        hE.n[++aU.a - 1] = "";
                        hE.c[++hE.e - 1] = 0;
                        hE.n[++aU.a - 1] = "";
                        hE.c[++hE.e - 1] = 0;
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               } else {
                  if (ai.a != null && ai.a.aT != null) {
                     var4 = jw.a(ai.a.aT, 411835733);
                  } else {
                     var4 = "";
                  }

                  hE.n[++aU.a - 1] = var4;
                  return 1;
               }
            }
         }
      }
   }

   @ObfuscatedName("qn")
   @ObfuscatedSignature(
      signature = "(Les;Ljava/net/URL;I)Leo;"
   )
   public static G a(K var0, URL var1, int var2) {
      if (var0 == null) {
         return var0.a(var1);
      } else {
         G var4 = new G(var1);
         synchronized(var0) {
            var0.d.add(var4);
            var0.notify();
            return var4;
         }
      }
   }
}
