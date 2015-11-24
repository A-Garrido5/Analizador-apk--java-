// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.security.KeyStoreException;
import javax.net.ssl.TrustManagerFactory;
import java.util.Iterator;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

final class ag implements X509TrustManager
{
    private final TrustManager[] a;
    private final ah b;
    private final long c;
    private final List d;
    private final Set e;
    
    public ag(final ah b, final af af) {
        this.d = new LinkedList();
        this.e = Collections.synchronizedSet(new HashSet<Object>());
        this.a = a(b);
        this.b = b;
        this.c = -1L;
        final String[] c = af.c();
        for (int length = c.length, i = 0; i < length; ++i) {
            this.d.add(a(c[i]));
        }
    }
    
    private boolean a(final X509Certificate x509Certificate) {
        try {
            final byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            final Iterator<byte[]> iterator = (Iterator<byte[]>)this.d.iterator();
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
    
    private static byte[] a(final String s) {
        final int length = s.length();
        final byte[] array = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            array[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }
        return array;
    }
    
    private static TrustManager[] a(final ah ah) {
        try {
            final TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(ah.a);
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
    public final void checkClientTrusted(final X509Certificate[] array, final String s) {
        throw new CertificateException("Client certificates not supported!");
    }
    
    @Override
    public final void checkServerTrusted(final X509Certificate[] array, final String s) {
        if (this.e.contains(array[0])) {
            return;
        }
        final TrustManager[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            ((X509TrustManager)a[i]).checkServerTrusted(array, s);
        }
        Label_0127: {
            if (this.c == -1L || System.currentTimeMillis() - this.c <= 15552000000L) {
                final X509Certificate[] a2 = bu.a(array, this.b);
                for (int length2 = a2.length, j = 0; j < length2; ++j) {
                    if (this.a(a2[j])) {
                        break Label_0127;
                    }
                }
                throw new CertificateException("No valid pins found in chain!");
            }
            cl.a().b().c("Crashlytics", "Certificate pins are stale, (" + (System.currentTimeMillis() - this.c) + " millis vs 15552000000" + " millis) falling back to system trust.");
        }
        this.e.add(array[0]);
    }
    
    @Override
    public final X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
