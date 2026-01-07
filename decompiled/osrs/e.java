package osrs;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

public final class e {
   private static final h a;

   public static String a() {
      if (a == null) {
         return "error";
      } else {
         try {
            Pointer var0;
            if ((var0 = a.getSystemId("ferox")) != null && Pointer.nativeValue(var0) != 0L) {
               String var1 = var0.getString(0L);
               Native.free(Pointer.nativeValue(var0));
               return var1;
            } else {
               iE.a("Native system id returned null or invalid pointer", (Throwable)null);
               return "error";
            }
         } catch (Throwable var2) {
            iE.a("Exception occurred getting native system id", var2);
            return "error";
         }
      }
   }

   static {
      h var0;
      try {
         String var3 = System.getProperty("os.name", "generic").toLowerCase();
         String var1 = "rsps";
         if ((var3.contains("mac") || var3.contains("darwin")) && System.getProperty("os.arch").equalsIgnoreCase("aarch64")) {
            var1 = "rspsaarch64";
         }

         var0 = (h)Native.load(var1, h.class);
      } catch (Throwable var2) {
         iE.a("Error loading native library.", var2);
         var0 = null;
      }

      a = var0;
   }
}
