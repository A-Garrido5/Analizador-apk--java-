// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import javax.net.ssl.SSLSocketFactory;
import java.security.Permission;
import java.io.OutputStream;
import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.HostnameVerifier;
import java.util.Map;
import java.io.InputStream;
import com.squareup.okhttp.f;
import com.squareup.okhttp.j;
import java.net.URL;
import java.net.HttpURLConnection;

public final class x extends d
{
    private final HttpURLConnectionImpl a;
    
    public x(final HttpURLConnectionImpl a) {
        super(a);
        this.a = a;
    }
    
    public x(final URL url, final j j) {
        this(new HttpURLConnectionImpl(url, j));
    }
    
    @Override
    protected f a() {
        if (this.a.c == null) {
            throw new IllegalStateException("Connection has not yet been established");
        }
        if (this.a.c.f()) {
            return this.a.c.h().f();
        }
        return this.a.d;
    }
    
    @Override
    public HostnameVerifier getHostnameVerifier() {
        return this.a.a.h();
    }
    
    @Override
    public SSLSocketFactory getSSLSocketFactory() {
        return this.a.a.g();
    }
    
    @Override
    public void setHostnameVerifier(final HostnameVerifier hostnameVerifier) {
        this.a.a.a(hostnameVerifier);
    }
    
    @Override
    public void setSSLSocketFactory(final SSLSocketFactory sslSocketFactory) {
        this.a.a.a(sslSocketFactory);
    }
}
