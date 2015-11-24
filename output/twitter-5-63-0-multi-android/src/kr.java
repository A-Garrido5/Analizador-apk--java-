import java.security.GeneralSecurityException;
import java.util.Enumeration;
import java.security.KeyStoreException;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import java.util.HashMap;
import java.security.KeyStore;

// 
// Decompiled by Procyon v0.5.30
// 

public class kr
{
    final KeyStore a;
    private final HashMap b;
    
    public kr(final KeyStore a) {
        this.b = this.a(a);
        this.a = a;
    }
    
    private HashMap a(final KeyStore keyStore) {
        HashMap<X500Principal, X509Certificate> hashMap;
        try {
            hashMap = new HashMap<X500Principal, X509Certificate>();
            final Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                final X509Certificate x509Certificate = (X509Certificate)keyStore.getCertificate(aliases.nextElement());
                if (x509Certificate != null) {
                    hashMap.put(x509Certificate.getSubjectX500Principal(), x509Certificate);
                }
            }
        }
        catch (KeyStoreException ex) {
            throw new AssertionError((Object)ex);
        }
        return hashMap;
    }
    
    public boolean a(final X509Certificate x509Certificate) {
        final X509Certificate x509Certificate2 = this.b.get(x509Certificate.getSubjectX500Principal());
        return x509Certificate2 != null && x509Certificate2.getPublicKey().equals(x509Certificate.getPublicKey());
    }
    
    public X509Certificate b(final X509Certificate x509Certificate) {
        final X509Certificate x509Certificate2 = this.b.get(x509Certificate.getIssuerX500Principal());
        if (x509Certificate2 == null) {
            return null;
        }
        if (x509Certificate2.getSubjectX500Principal().equals(x509Certificate.getSubjectX500Principal())) {
            return null;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return x509Certificate2;
        }
        catch (GeneralSecurityException ex) {
            return null;
        }
    }
}
