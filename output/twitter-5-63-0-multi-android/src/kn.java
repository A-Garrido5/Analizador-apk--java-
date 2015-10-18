import java.security.cert.CertificateException;
import java.util.LinkedList;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;

// 
// Decompiled by Procyon v0.5.30
// 

public class kn
{
    private static boolean a(final X509Certificate x509Certificate, final X509Certificate x509Certificate2) {
        if (!x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getIssuerX500Principal())) {
            return false;
        }
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            return true;
        }
        catch (GeneralSecurityException ex) {
            return false;
        }
    }
    
    public static X509Certificate[] a(final X509Certificate[] array, final kr kr) {
        int n = 1;
        final LinkedList<X509Certificate> list = new LinkedList<X509Certificate>();
        int n2;
        if (kr.a(array[0])) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        list.add(array[0]);
        int n3 = n2;
        int i;
        for (i = n; i < array.length; ++i) {
            if (kr.a(array[i])) {
                n3 = n;
            }
            if (!a(array[i], array[i - 1])) {
                break;
            }
            list.add(array[i]);
        }
        final X509Certificate b = kr.b(array[i - 1]);
        if (b != null) {
            list.add(b);
        }
        else {
            n = n3;
        }
        if (n != 0) {
            return list.toArray(new X509Certificate[list.size()]);
        }
        throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
    }
}
