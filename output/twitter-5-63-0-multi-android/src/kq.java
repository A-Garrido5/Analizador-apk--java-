import java.security.KeyStoreException;
import javax.net.ssl.TrustManagerFactory;
import java.util.Iterator;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import com.twitter.util.platform.k;
import java.util.Set;
import java.util.List;
import javax.net.ssl.TrustManager;
import com.twitter.util.platform.m;
import javax.net.ssl.X509TrustManager;

// 
// Decompiled by Procyon v0.5.30
// 

public class kq implements X509TrustManager
{
    private static final m a;
    private final TrustManager[] b;
    private final kr c;
    private final long d;
    private final List e;
    private final Set f;
    
    static {
        a = k.f().b();
    }
    
    public kq(final kr c, final String[] array, final long d) {
        this.e = new LinkedList();
        this.f = Collections.synchronizedSet(new HashSet<Object>());
        this.b = this.a(c);
        this.c = c;
        this.d = d;
        for (int length = array.length, i = 0; i < length; ++i) {
            this.e.add(this.a(array[i]));
        }
    }
    
    private void a(final X509Certificate[] array) {
        if (System.currentTimeMillis() - this.d <= 15552000000L) {
            final X509Certificate[] a = kn.a(array, this.c);
            for (int length = a.length, i = 0; i < length; ++i) {
                if (this.a(a[i])) {
                    return;
                }
            }
            throw new CertificateException("No valid pins found in chain!");
        }
        kq.a.a("Twitter-PinningTrustManager", "Certificate pins are stale, (" + (System.currentTimeMillis() - this.d) + " millis vs " + 15552000000L + " millis) " + "falling back to system trust.");
    }
    
    private void a(final X509Certificate[] array, final String s) {
        final TrustManager[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            ((X509TrustManager)b[i]).checkServerTrusted(array, s);
        }
    }
    
    private boolean a(final X509Certificate x509Certificate) {
        try {
            final byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            final Iterator<byte[]> iterator = (Iterator<byte[]>)this.e.iterator();
            while (iterator.hasNext()) {
                if (Arrays.equals(iterator.next(), digest)) {
                    return true;
                }
            }
            return false;
        }
        catch (NoSuchAlgorithmException ex) {
            throw new CertificateException(ex);
        }
    }
    
    private byte[] a(final String s) {
        final int length = s.length();
        final byte[] array = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            array[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }
        return array;
    }
    
    private TrustManager[] a(final kr kr) {
        try {
            final TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(kr.a);
            return instance.getTrustManagers();
        }
        catch (NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
        catch (KeyStoreException ex2) {
            throw new AssertionError((Object)ex2);
        }
    }
    
    @Override
    public void checkClientTrusted(final X509Certificate[] array, final String s) {
        throw new CertificateException("Client certificates not supported!");
    }
    
    @Override
    public void checkServerTrusted(final X509Certificate[] array, final String s) {
        if (this.f.contains(array[0])) {
            return;
        }
        this.a(array, s);
        this.a(array);
        this.f.add(array[0]);
    }
    
    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
