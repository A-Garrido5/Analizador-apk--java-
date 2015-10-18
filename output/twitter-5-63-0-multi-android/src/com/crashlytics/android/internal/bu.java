// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import javax.net.ssl.HttpsURLConnection;
import java.util.Map;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import javax.net.ssl.SSLContext;
import java.security.cert.CertificateException;
import java.util.LinkedList;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLSocketFactory;

public class bu
{
    private final ci a;
    private af b;
    private SSLSocketFactory c;
    private boolean d;
    
    public bu() {
        this(new cj());
    }
    
    public bu(final ci a) {
        this.a = a;
    }
    
    private void a() {
        synchronized (this) {
            this.d = false;
            this.c = null;
        }
    }
    
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
    
    public static X509Certificate[] a(final X509Certificate[] array, final ah ah) {
        int n = 1;
        final LinkedList<X509Certificate> list = new LinkedList<X509Certificate>();
        int n2;
        if (ah.a(array[0])) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        list.add(array[0]);
        int n3 = n2;
        int i;
        for (i = n; i < array.length; ++i) {
            if (ah.a(array[i])) {
                n3 = n;
            }
            if (!a(array[i], array[i - 1])) {
                break;
            }
            list.add(array[i]);
        }
        final X509Certificate b = ah.b(array[i - 1]);
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
    
    private SSLSocketFactory b() {
        synchronized (this) {
            if (this.c == null && !this.d) {
                this.c = this.c();
            }
            return this.c;
        }
    }
    
    private SSLSocketFactory c() {
        synchronized (this) {
            this.d = true;
            try {
                final af b = this.b;
                final SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, new TrustManager[] { new ag(new ah(b.a(), b.b()), b) }, null);
                final SSLSocketFactory socketFactory = instance.getSocketFactory();
                this.a.a("Crashlytics", "Custom SSL pinning enabled");
                return socketFactory;
            }
            catch (Exception ex) {
                this.a.a("Crashlytics", "Exception while validating pinned certs", ex);
                final SSLSocketFactory socketFactory = null;
            }
        }
    }
    
    public bw a(final ax ax, final String s, final Map map) {
        bw bw = null;
        switch (bv.a[ax.ordinal()]) {
            default: {
                throw new IllegalArgumentException("Unsupported HTTP method!");
            }
            case 1: {
                bw = com.crashlytics.android.internal.bw.a(s, map, true);
                break;
            }
            case 2: {
                bw = com.crashlytics.android.internal.bw.b(s, map, true);
                break;
            }
            case 3: {
                bw = com.crashlytics.android.internal.bw.a((CharSequence)s);
                break;
            }
            case 4: {
                bw = com.crashlytics.android.internal.bw.b((CharSequence)s);
                break;
            }
        }
        if (s != null && s.toLowerCase().startsWith("https") && this.b != null) {
            final SSLSocketFactory b = this.b();
            if (b != null) {
                ((HttpsURLConnection)bw.a()).setSSLSocketFactory(b);
            }
        }
        return bw;
    }
    
    public void a(final af b) {
        if (this.b != b) {
            this.b = b;
            this.a();
        }
    }
}
