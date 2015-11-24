// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import java.util.Map;
import java.util.List;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import org.apache.http.HttpEntity;
import java.net.HttpURLConnection;
import java.net.URI;

public class n extends HttpOperation
{
    private final m h;
    
    public n(final m h, final URI uri, final HttpOperation$RequestMethod httpOperation$RequestMethod, final j j) {
        super(httpOperation$RequestMethod, uri, j);
        this.h = h;
    }
    
    private void b(final HttpURLConnection httpURLConnection, final HttpEntity httpEntity) {
        final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        final long b = this.b.b();
        httpEntity.writeTo((OutputStream)bufferedOutputStream);
        this.g = this.b.b() - b;
        yh.a(bufferedOutputStream);
        yh.a((Closeable)httpEntity.getContent());
    }
    
    protected String a(final HttpURLConnection httpURLConnection) {
        return httpURLConnection.getContentEncoding();
    }
    
    protected String a(final HttpURLConnection httpURLConnection, final String s, final int n) {
        final Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields != null) {
            final List<String> list = headerFields.get(s);
            if (list != null && list.size() > n) {
                return list.get(n);
            }
        }
        return null;
    }
    
    protected void a(final HttpURLConnection httpURLConnection, final int readTimeout) {
        httpURLConnection.setReadTimeout(readTimeout);
    }
    
    protected void a(final HttpURLConnection httpURLConnection, final String s, final String s2) {
        httpURLConnection.setRequestProperty(s, s2);
    }
    
    protected void a(final HttpURLConnection httpURLConnection, final HttpEntity httpEntity) {
        if (httpEntity == null) {
            httpURLConnection.setDoOutput(false);
            return;
        }
        httpURLConnection.setDoOutput(true);
        final Header contentType = httpEntity.getContentType();
        if (contentType != null && this.a("Content-Type") == null) {
            httpURLConnection.setRequestProperty("Content-Type", contentType.getValue());
        }
        if (httpEntity.isChunked()) {
            httpURLConnection.setChunkedStreamingMode(4096);
            return;
        }
        if (httpEntity.isStreaming()) {
            httpURLConnection.setFixedLengthStreamingMode((int)httpEntity.getContentLength());
            return;
        }
        this.a("Content-Length", String.valueOf(httpEntity.getContentLength()));
    }
    
    protected String b(final HttpURLConnection httpURLConnection) {
        return httpURLConnection.getContentType();
    }
    
    protected int c(final HttpURLConnection httpURLConnection) {
        return httpURLConnection.getContentLength();
    }
    
    protected HttpOperation$Protocol d(final HttpURLConnection httpURLConnection) {
        final String headerField = httpURLConnection.getHeaderField(null);
        HttpOperation$Protocol a = null;
        if (headerField != null) {
            final int length = headerField.length();
            a = null;
            if (length >= 8) {
                a = HttpOperation$Protocol.a(headerField.substring(0, 8));
            }
        }
        return a;
    }
    
    @Override
    protected String d() {
        return "HttpURLConnection";
    }
    
    protected InputStream e(final HttpURLConnection httpURLConnection) {
        final InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream != null) {
            return errorStream;
        }
        return httpURLConnection.getInputStream();
    }
    
    protected void f(final HttpURLConnection httpURLConnection) {
        httpURLConnection.disconnect();
    }
    
    protected void g(final HttpURLConnection httpURLConnection) {
        httpURLConnection.disconnect();
    }
    
    protected HttpURLConnection h(final HttpURLConnection httpURLConnection) {
        httpURLConnection.connect();
        final HttpEntity e = this.e();
        if (e != null) {
            this.b(httpURLConnection, e);
        }
        return httpURLConnection;
    }
    
    protected Map i(final HttpURLConnection httpURLConnection) {
        return httpURLConnection.getHeaderFields();
    }
    
    protected int j(final HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        }
        catch (IOException ex) {
            return httpURLConnection.getResponseCode();
        }
    }
    
    protected String k(final HttpURLConnection httpURLConnection) {
        return httpURLConnection.getResponseMessage();
    }
    
    protected HttpURLConnection t() {
        final HttpURLConnection a = this.h.a(this.i().toURL());
        a.setRequestMethod(this.h().toString());
        this.a("Accept-Encoding", "gzip");
        return a;
    }
}
