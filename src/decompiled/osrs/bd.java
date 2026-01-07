package osrs;

import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
final class bd implements SSLSession {
   @ObfuscatedSignature(
      signature = "Lad;"
   )
   private du a;

   @ObfuscatedSignature(
      signature = "(Lad;)V"
   )
   bd(du var1) {
      this.a = var1;
   }

   public final Principal getLocalPrincipal() {
      throw new UnsupportedOperationException();
   }

   public final int getApplicationBufferSize() {
      return 0;
   }

   public final long getCreationTime() {
      throw new UnsupportedOperationException();
   }

   public final long getLastAccessedTime() {
      throw new UnsupportedOperationException();
   }

   public final Certificate[] getLocalCertificates() {
      throw new UnsupportedOperationException();
   }

   public final Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
      return this.a.a;
   }

   public final byte[] getId() {
      throw new UnsupportedOperationException();
   }

   public final Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
      return null;
   }

   public final String getPeerHost() {
      throw new UnsupportedOperationException();
   }

   public final SSLSessionContext getSessionContext() {
      throw new UnsupportedOperationException();
   }

   public final String[] getValueNames() {
      throw new UnsupportedOperationException();
   }

   public final void invalidate() {
      throw new UnsupportedOperationException();
   }

   public final boolean isValid() {
      throw new UnsupportedOperationException();
   }

   public final void putValue(String var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   public final String getCipherSuite() {
      throw new UnsupportedOperationException();
   }

   public final String getProtocol() {
      throw new UnsupportedOperationException();
   }

   public final int getPeerPort() {
      return 0;
   }

   public final X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
      return null;
   }

   public final Object getValue(String var1) {
      throw new UnsupportedOperationException();
   }

   public final int getPacketBufferSize() {
      throw new UnsupportedOperationException();
   }

   public final void removeValue(String var1) {
      throw new UnsupportedOperationException();
   }
}
