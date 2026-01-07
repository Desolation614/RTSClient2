package osrs;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("ar")
final class aI implements TlsAuthentication {
   @ObfuscatedSignature(
      signature = "Laf;"
   )
   private hu a;

   @ObfuscatedSignature(
      signature = "(Laf;)V"
   )
   aI(hu var1) {
      this.a = var1;
   }

   public final TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
      return null;
   }

   public final void notifyServerCertificate(Certificate var1) throws IOException {
      try {
         CertificateFactory var2 = CertificateFactory.getInstance("X.509");
         LinkedList var3 = new LinkedList();
         org.bouncycastle.asn1.x509.Certificate[] var7 = var1.getCertificateList();

         for(int var4 = 0; var4 < var7.length; ++var4) {
            org.bouncycastle.asn1.x509.Certificate var5 = var7[var4];
            var3.add(var2.generateCertificate(new ByteArrayInputStream(var5.getEncoded())));
         }

         this.a.a.a = (java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]);
      } catch (CertificateException var6) {
         throw new IOException(var6);
      }
   }
}
