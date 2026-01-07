package osrs;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("ad")
final class du extends SSLSocket {
   @ObfuscatedName("ap")
   Certificate[] a;
   @ObfuscatedSignature(
      signature = "Laz;"
   )
   private cr c;
   private TlsClientProtocol d;
   final String b;

   @ObfuscatedSignature(
      signature = "(Laz;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
   )
   du(cr var1, TlsClientProtocol var2, String var3) {
      this.c = var1;
      this.d = var2;
      this.b = var3;
   }

   public final SSLSession getSession() {
      return new bd(this);
   }

   public final synchronized void close() throws IOException {
      this.d.close();
   }

   public final void setEnableSessionCreation(boolean var1) {
   }

   public final String[] getEnabledCipherSuites() {
      return null;
   }

   public final void setNeedClientAuth(boolean var1) {
   }

   public final void setEnabledProtocols(String[] var1) {
   }

   public final boolean getNeedClientAuth() {
      return false;
   }

   public final String[] getEnabledProtocols() {
      return null;
   }

   public final String[] getSupportedCipherSuites() {
      return null;
   }

   public final boolean getUseClientMode() {
      return false;
   }

   public final void setUseClientMode(boolean var1) {
   }

   public final boolean getWantClientAuth() {
      return false;
   }

   public final void setWantClientAuth(boolean var1) {
   }

   public final void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
   }

   public final void startHandshake() throws IOException {
      this.d.connect(new hu(this));
   }

   public final void setEnabledCipherSuites(String[] var1) {
   }

   public final OutputStream getOutputStream() throws IOException {
      return this.d.getOutputStream();
   }

   public final void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
   }

   public final boolean getEnableSessionCreation() {
      return false;
   }

   public final InputStream getInputStream() throws IOException {
      return this.d.getInputStream();
   }

   public final String[] getSupportedProtocols() {
      return null;
   }
}
