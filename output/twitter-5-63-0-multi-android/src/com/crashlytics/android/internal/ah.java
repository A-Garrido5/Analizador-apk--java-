// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.security.GeneralSecurityException;
import java.util.Enumeration;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.NoSuchAlgorithmException;
import java.security.KeyStoreException;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.security.KeyStore;

final class ah
{
    final KeyStore a;
    private final HashMap b;
    
    public ah(final InputStream inputStream, final String s) {
        final KeyStore a = a(inputStream, s);
        this.b = a(a);
        this.a = a;
    }
    
    private static KeyStore a(final InputStream inputStream, final String s) {
        try {
            final KeyStore instance = KeyStore.getInstance("BKS");
            final BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                instance.load(bufferedInputStream, s.toCharArray());
                return instance;
            }
            finally {
                bufferedInputStream.close();
            }
        }
        catch (KeyStoreException ex) {
            throw new AssertionError((Object)ex);
        }
        catch (NoSuchAlgorithmException ex2) {
            throw new AssertionError((Object)ex2);
        }
        catch (CertificateException ex3) {
            throw new AssertionError((Object)ex3);
        }
        catch (IOException ex4) {
            throw new AssertionError((Object)ex4);
        }
    }
    
    private static HashMap a(final KeyStore keyStore) {
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
    
    public final boolean a(final X509Certificate x509Certificate) {
        final X509Certificate x509Certificate2 = this.b.get(x509Certificate.getSubjectX500Principal());
        return x509Certificate2 != null && x509Certificate2.getPublicKey().equals(x509Certificate.getPublicKey());
    }
    
    public final X509Certificate b(final X509Certificate x509Certificate) {
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
