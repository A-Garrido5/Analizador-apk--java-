// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.net.URL;
import java.security.Permission;
import java.io.OutputStream;
import java.security.Principal;
import java.util.List;
import java.security.cert.Certificate;
import java.util.Map;
import java.io.InputStream;
import com.squareup.okhttp.f;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;

abstract class d extends HttpsURLConnection
{
    private final HttpURLConnection a;
    
    public d(final HttpURLConnection a) {
        super(a.getURL());
        this.a = a;
    }
    
    protected abstract f a();
    
    @Override
    public void addRequestProperty(final String s, final String s2) {
        this.a.addRequestProperty(s, s2);
    }
    
    @Override
    public void connect() {
        this.connected = true;
        this.a.connect();
    }
    
    @Override
    public void disconnect() {
        this.a.disconnect();
    }
    
    @Override
    public boolean getAllowUserInteraction() {
        return this.a.getAllowUserInteraction();
    }
    
    @Override
    public String getCipherSuite() {
        final f a = this.a();
        if (a != null) {
            return a.a();
        }
        return null;
    }
    
    @Override
    public int getConnectTimeout() {
        return this.a.getConnectTimeout();
    }
    
    @Override
    public Object getContent() {
        return this.a.getContent();
    }
    
    @Override
    public Object getContent(final Class[] array) {
        return this.a.getContent(array);
    }
    
    @Override
    public String getContentEncoding() {
        return this.a.getContentEncoding();
    }
    
    @Override
    public int getContentLength() {
        return this.a.getContentLength();
    }
    
    @Override
    public String getContentType() {
        return this.a.getContentType();
    }
    
    @Override
    public long getDate() {
        return this.a.getDate();
    }
    
    @Override
    public boolean getDefaultUseCaches() {
        return this.a.getDefaultUseCaches();
    }
    
    @Override
    public boolean getDoInput() {
        return this.a.getDoInput();
    }
    
    @Override
    public boolean getDoOutput() {
        return this.a.getDoOutput();
    }
    
    @Override
    public InputStream getErrorStream() {
        return this.a.getErrorStream();
    }
    
    @Override
    public long getExpiration() {
        return this.a.getExpiration();
    }
    
    @Override
    public String getHeaderField(final int n) {
        return this.a.getHeaderField(n);
    }
    
    @Override
    public String getHeaderField(final String s) {
        return this.a.getHeaderField(s);
    }
    
    @Override
    public long getHeaderFieldDate(final String s, final long n) {
        return this.a.getHeaderFieldDate(s, n);
    }
    
    @Override
    public int getHeaderFieldInt(final String s, final int n) {
        return this.a.getHeaderFieldInt(s, n);
    }
    
    @Override
    public String getHeaderFieldKey(final int n) {
        return this.a.getHeaderFieldKey(n);
    }
    
    @Override
    public Map getHeaderFields() {
        return this.a.getHeaderFields();
    }
    
    @Override
    public long getIfModifiedSince() {
        return this.a.getIfModifiedSince();
    }
    
    @Override
    public InputStream getInputStream() {
        return this.a.getInputStream();
    }
    
    @Override
    public boolean getInstanceFollowRedirects() {
        return this.a.getInstanceFollowRedirects();
    }
    
    @Override
    public long getLastModified() {
        return this.a.getLastModified();
    }
    
    @Override
    public Certificate[] getLocalCertificates() {
        final f a = this.a();
        if (a != null) {
            final List d = a.d();
            if (!d.isEmpty()) {
                return d.toArray(new Certificate[d.size()]);
            }
        }
        return null;
    }
    
    @Override
    public Principal getLocalPrincipal() {
        final f a = this.a();
        if (a != null) {
            return a.e();
        }
        return null;
    }
    
    @Override
    public OutputStream getOutputStream() {
        return this.a.getOutputStream();
    }
    
    @Override
    public Principal getPeerPrincipal() {
        final f a = this.a();
        if (a != null) {
            return a.c();
        }
        return null;
    }
    
    @Override
    public Permission getPermission() {
        return this.a.getPermission();
    }
    
    @Override
    public int getReadTimeout() {
        return this.a.getReadTimeout();
    }
    
    @Override
    public String getRequestMethod() {
        return this.a.getRequestMethod();
    }
    
    @Override
    public Map getRequestProperties() {
        return this.a.getRequestProperties();
    }
    
    @Override
    public String getRequestProperty(final String s) {
        return this.a.getRequestProperty(s);
    }
    
    @Override
    public int getResponseCode() {
        return this.a.getResponseCode();
    }
    
    @Override
    public String getResponseMessage() {
        return this.a.getResponseMessage();
    }
    
    @Override
    public Certificate[] getServerCertificates() {
        final f a = this.a();
        if (a != null) {
            final List b = a.b();
            if (!b.isEmpty()) {
                return b.toArray(new Certificate[b.size()]);
            }
        }
        return null;
    }
    
    @Override
    public URL getURL() {
        return this.a.getURL();
    }
    
    @Override
    public boolean getUseCaches() {
        return this.a.getUseCaches();
    }
    
    @Override
    public void setAllowUserInteraction(final boolean allowUserInteraction) {
        this.a.setAllowUserInteraction(allowUserInteraction);
    }
    
    @Override
    public void setChunkedStreamingMode(final int chunkedStreamingMode) {
        this.a.setChunkedStreamingMode(chunkedStreamingMode);
    }
    
    @Override
    public void setConnectTimeout(final int connectTimeout) {
        this.a.setConnectTimeout(connectTimeout);
    }
    
    @Override
    public void setDefaultUseCaches(final boolean defaultUseCaches) {
        this.a.setDefaultUseCaches(defaultUseCaches);
    }
    
    @Override
    public void setDoInput(final boolean doInput) {
        this.a.setDoInput(doInput);
    }
    
    @Override
    public void setDoOutput(final boolean doOutput) {
        this.a.setDoOutput(doOutput);
    }
    
    @Override
    public void setFixedLengthStreamingMode(final int fixedLengthStreamingMode) {
        this.a.setFixedLengthStreamingMode(fixedLengthStreamingMode);
    }
    
    @Override
    public void setIfModifiedSince(final long ifModifiedSince) {
        this.a.setIfModifiedSince(ifModifiedSince);
    }
    
    @Override
    public void setInstanceFollowRedirects(final boolean instanceFollowRedirects) {
        this.a.setInstanceFollowRedirects(instanceFollowRedirects);
    }
    
    @Override
    public void setReadTimeout(final int readTimeout) {
        this.a.setReadTimeout(readTimeout);
    }
    
    @Override
    public void setRequestMethod(final String requestMethod) {
        this.a.setRequestMethod(requestMethod);
    }
    
    @Override
    public void setRequestProperty(final String s, final String s2) {
        this.a.setRequestProperty(s, s2);
    }
    
    @Override
    public void setUseCaches(final boolean useCaches) {
        this.a.setUseCaches(useCaches);
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
    
    @Override
    public boolean usingProxy() {
        return this.a.usingProxy();
    }
}
