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
import java.net.HttpURLConnection;

final class ao extends HttpURLConnection
{
    private final ab a;
    private final ah b;
    
    public ao(final ah b) {
        boolean b2 = true;
        super(b.a().a());
        this.a = b.a();
        this.b = b;
        this.connected = b2;
        if (b.h() != null) {
            b2 = false;
        }
        this.doOutput = b2;
        this.method = this.a.c();
    }
    
    @Override
    public void addRequestProperty(final String s, final String s2) {
        throw f();
    }
    
    @Override
    public void connect() {
        throw f();
    }
    
    @Override
    public void disconnect() {
        throw f();
    }
    
    @Override
    public boolean getAllowUserInteraction() {
        return false;
    }
    
    @Override
    public int getConnectTimeout() {
        return 0;
    }
    
    @Override
    public Object getContent() {
        throw i();
    }
    
    @Override
    public Object getContent(final Class[] array) {
        throw i();
    }
    
    @Override
    public boolean getDefaultUseCaches() {
        return super.getDefaultUseCaches();
    }
    
    @Override
    public boolean getDoInput() {
        return true;
    }
    
    @Override
    public boolean getDoOutput() {
        return this.a.e() != null;
    }
    
    @Override
    public InputStream getErrorStream() {
        return null;
    }
    
    @Override
    public String getHeaderField(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid header index: " + n);
        }
        if (n == 0) {
            return this.b.b();
        }
        return this.b.g().b(n - 1);
    }
    
    @Override
    public String getHeaderField(final String s) {
        if (s == null) {
            return this.b.b();
        }
        return this.b.g().a(s);
    }
    
    @Override
    public String getHeaderFieldKey(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid header index: " + n);
        }
        if (n == 0) {
            return null;
        }
        return this.b.g().a(n - 1);
    }
    
    @Override
    public Map getHeaderFields() {
        return y.a(this.b.g(), this.b.b());
    }
    
    @Override
    public long getIfModifiedSince() {
        return 0L;
    }
    
    @Override
    public InputStream getInputStream() {
        throw i();
    }
    
    @Override
    public boolean getInstanceFollowRedirects() {
        return super.getInstanceFollowRedirects();
    }
    
    @Override
    public OutputStream getOutputStream() {
        throw f();
    }
    
    @Override
    public int getReadTimeout() {
        return 0;
    }
    
    @Override
    public String getRequestMethod() {
        return this.a.c();
    }
    
    @Override
    public Map getRequestProperties() {
        throw g();
    }
    
    @Override
    public String getRequestProperty(final String s) {
        return this.a.a(s);
    }
    
    @Override
    public int getResponseCode() {
        return this.b.c();
    }
    
    @Override
    public String getResponseMessage() {
        return this.b.d();
    }
    
    @Override
    public boolean getUseCaches() {
        return super.getUseCaches();
    }
    
    @Override
    public void setAllowUserInteraction(final boolean b) {
        throw f();
    }
    
    @Override
    public void setChunkedStreamingMode(final int n) {
        throw f();
    }
    
    @Override
    public void setConnectTimeout(final int n) {
        throw f();
    }
    
    @Override
    public void setDefaultUseCaches(final boolean defaultUseCaches) {
        super.setDefaultUseCaches(defaultUseCaches);
    }
    
    @Override
    public void setDoInput(final boolean b) {
        throw f();
    }
    
    @Override
    public void setDoOutput(final boolean b) {
        throw f();
    }
    
    @Override
    public void setFixedLengthStreamingMode(final int n) {
        throw f();
    }
    
    @Override
    public void setFixedLengthStreamingMode(final long n) {
        throw f();
    }
    
    @Override
    public void setIfModifiedSince(final long n) {
        throw f();
    }
    
    @Override
    public void setInstanceFollowRedirects(final boolean b) {
        throw f();
    }
    
    @Override
    public void setReadTimeout(final int n) {
        throw f();
    }
    
    @Override
    public void setRequestMethod(final String s) {
        throw f();
    }
    
    @Override
    public void setRequestProperty(final String s, final String s2) {
        throw f();
    }
    
    @Override
    public void setUseCaches(final boolean b) {
        throw f();
    }
    
    @Override
    public boolean usingProxy() {
        return false;
    }
}
