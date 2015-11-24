// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

import java.security.cert.X509Certificate;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Collections;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import java.util.List;

public final class f
{
    private final String a;
    private final List b;
    private final List c;
    
    private f(final String a, final List b, final List c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static f a(final String s, final List list, final List list2) {
        if (s == null) {
            throw new IllegalArgumentException("cipherSuite == null");
        }
        return new f(s, bf.a(list), bf.a(list2));
    }
    
    public static f a(final SSLSession sslSession) {
        final String cipherSuite = sslSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        Certificate[] peerCertificates;
        List<Object> list;
        Certificate[] localCertificates;
        List<Object> list2;
        Label_0042_Outer:Label_0062_Outer:
        while (true) {
            while (true) {
            Label_0089:
                while (true) {
                    while (true) {
                        try {
                            peerCertificates = sslSession.getPeerCertificates();
                            if (peerCertificates != null) {
                                list = (List<Object>)bf.a(peerCertificates);
                                localCertificates = sslSession.getLocalCertificates();
                                if (localCertificates != null) {
                                    list2 = (List<Object>)bf.a(localCertificates);
                                    return new f(cipherSuite, list, list2);
                                }
                                break Label_0089;
                            }
                        }
                        catch (SSLPeerUnverifiedException ex) {
                            peerCertificates = null;
                            continue Label_0042_Outer;
                        }
                        break;
                    }
                    list = Collections.emptyList();
                    continue Label_0062_Outer;
                }
                list2 = Collections.emptyList();
                continue;
            }
        }
    }
    
    public String a() {
        return this.a;
    }
    
    public List b() {
        return this.b;
    }
    
    public Principal c() {
        if (!this.b.isEmpty()) {
            return this.b.get(0).getSubjectX500Principal();
        }
        return null;
    }
    
    public List d() {
        return this.c;
    }
    
    public Principal e() {
        if (!this.c.isEmpty()) {
            return this.c.get(0).getSubjectX500Principal();
        }
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof f) {
            final f f = (f)o;
            if (this.a.equals(f.a) && this.b.equals(f.b) && this.c.equals(f.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (527 + this.a.hashCode()) + this.b.hashCode()) + this.c.hashCode();
    }
}
