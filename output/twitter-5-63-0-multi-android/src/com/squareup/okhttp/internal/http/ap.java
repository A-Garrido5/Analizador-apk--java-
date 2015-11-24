// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.net.URLConnection;
import java.net.CacheRequest;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.util.Collections;
import java.net.SecureCacheResponse;
import com.squareup.okhttp.ResponseSource;
import java.util.Iterator;
import java.util.List;
import java.net.CacheResponse;
import java.net.ResponseCache;
import com.squareup.okhttp.l;
import java.io.OutputStream;
import java.util.Map;
import java.io.InputStream;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.HostnameVerifier;
import com.squareup.okhttp.f;
import java.net.HttpURLConnection;

final class ap extends d
{
    private final ao a;
    
    public ap(final ao a) {
        super(a);
        this.a = a;
    }
    
    @Override
    protected f a() {
        return this.a.b.f();
    }
    
    @Override
    public HostnameVerifier getHostnameVerifier() {
        throw h();
    }
    
    @Override
    public SSLSocketFactory getSSLSocketFactory() {
        throw h();
    }
    
    @Override
    public void setFixedLengthStreamingMode(final long fixedLengthStreamingMode) {
        this.a.setFixedLengthStreamingMode(fixedLengthStreamingMode);
    }
    
    @Override
    public void setHostnameVerifier(final HostnameVerifier hostnameVerifier) {
        throw f();
    }
    
    @Override
    public void setSSLSocketFactory(final SSLSocketFactory sslSocketFactory) {
        throw f();
    }
}
