// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import java.net.Proxy;

public final class a
{
    final Proxy a;
    final String b;
    final int c;
    final SSLSocketFactory d;
    final HostnameVerifier e;
    final g f;
    final List g;
    
    public a(final String b, final int c, final SSLSocketFactory d, final HostnameVerifier e, final g f, final Proxy a, final List list) {
        if (b == null) {
            throw new NullPointerException("uriHost == null");
        }
        if (c <= 0) {
            throw new IllegalArgumentException("uriPort <= 0: " + c);
        }
        if (f == null) {
            throw new IllegalArgumentException("authenticator == null");
        }
        if (list == null) {
            throw new IllegalArgumentException("protocols == null");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = bf.a(list);
    }
    
    public String a() {
        return this.b;
    }
    
    public int b() {
        return this.c;
    }
    
    public SSLSocketFactory c() {
        return this.d;
    }
    
    public List d() {
        return this.g;
    }
    
    public Proxy e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof a;
        boolean b2 = false;
        if (b) {
            final a a = (a)o;
            final boolean a2 = bf.a(this.a, a.a);
            b2 = false;
            if (a2) {
                final boolean equals = this.b.equals(a.b);
                b2 = false;
                if (equals) {
                    final int c = this.c;
                    final int c2 = a.c;
                    b2 = false;
                    if (c == c2) {
                        final boolean a3 = bf.a(this.d, a.d);
                        b2 = false;
                        if (a3) {
                            final boolean a4 = bf.a(this.e, a.e);
                            b2 = false;
                            if (a4) {
                                final boolean a5 = bf.a(this.f, a.f);
                                b2 = false;
                                if (a5) {
                                    final boolean a6 = bf.a(this.g, a.g);
                                    b2 = false;
                                    if (a6) {
                                        b2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * (527 + this.b.hashCode()) + this.c);
        int hashCode;
        if (this.d != null) {
            hashCode = this.d.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.e != null) {
            hashCode2 = this.e.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        int hashCode3;
        if (this.f != null) {
            hashCode3 = this.f.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n4 = 31 * (hashCode3 + n3);
        final Proxy a = this.a;
        int hashCode4 = 0;
        if (a != null) {
            hashCode4 = this.a.hashCode();
        }
        return 31 * (n4 + hashCode4) + this.g.hashCode();
    }
}
