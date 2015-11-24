// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.net.SocketPermission;
import java.net.InetSocketAddress;
import java.security.Permission;
import java.io.OutputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Map;
import java.io.InputStream;
import java.net.Proxy;
import java.net.HttpRetryException;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.net.ProtocolException;
import com.squareup.okhttp.l;
import com.squareup.okhttp.c;
import java.net.URL;
import com.squareup.okhttp.m;
import com.squareup.okhttp.f;
import java.io.IOException;
import com.squareup.okhttp.j;
import java.net.HttpURLConnection;

public class HttpURLConnectionImpl extends HttpURLConnection
{
    final j a;
    protected IOException b;
    protected u c;
    f d;
    private h e;
    private long f;
    private int g;
    private m h;
    
    public HttpURLConnectionImpl(final URL url, final j a) {
        super(url);
        this.e = new h();
        this.f = -1L;
        this.a = a;
    }
    
    private u a(final String s, final c c, final aq aq) {
        final ae a = new ae().a(this.getURL()).a(s, (ad)null);
        final com.squareup.okhttp.internal.http.f a2 = this.e.a();
        for (int i = 0; i < a2.a(); ++i) {
            a.b(a2.a(i), a2.b(i));
        }
        boolean b;
        if (this.f != -1L) {
            a.a("Content-Length", Long.toString(this.f));
            b = false;
        }
        else if (this.chunkLength > 0) {
            a.a("Transfer-Encoding", "chunked");
            b = false;
        }
        else {
            b = true;
        }
        final ab a3 = a.a();
        j j = this.a;
        if (j.f() != null && !this.getUseCaches()) {
            j = this.a.o().a((l)null);
        }
        return new u(j, a3, b, c, null, aq);
    }
    
    private void a() {
        if (this.b != null) {
            throw this.b;
        }
        if (this.c != null) {
            return;
        }
        while (true) {
            this.connected = true;
            while (true) {
                Label_0073: {
                    try {
                        if (this.doOutput) {
                            if (!this.method.equals("GET")) {
                                break Label_0073;
                            }
                            this.method = "POST";
                        }
                        this.c = this.a(this.method, null, null);
                        return;
                    }
                    catch (IOException b) {
                        throw this.b = b;
                    }
                }
                if (!v.a(this.method)) {
                    break;
                }
                continue;
            }
        }
        throw new ProtocolException(this.method + " does not support writing");
    }
    
    private void a(final String s, final boolean b) {
        final ArrayList<Object> list = new ArrayList<Object>();
        if (b) {
            list.addAll(this.a.m());
        }
        final String[] split = s.split(",", -1);
        final int length = split.length;
        int i = 0;
        while (i < length) {
            final String s2 = split[i];
            try {
                list.add(bf.a(bk.a(s2)));
                ++i;
                continue;
            }
            catch (IOException ex) {
                throw new IllegalStateException(ex);
            }
            break;
        }
        this.a.a(list);
    }
    
    private boolean a(final boolean b) {
        try {
            this.c.a();
            this.h = this.c.l();
            f i;
            if (this.c.k() != null) {
                i = this.c.k().i();
            }
            else {
                i = null;
            }
            this.d = i;
            if (b) {
                this.c.q();
            }
            return true;
        }
        catch (IOException b2) {
            final u a = this.c.a(b2);
            if (a != null) {
                this.c = a;
                return false;
            }
            throw this.b = b2;
        }
    }
    
    private u b() {
        this.a();
        if (this.c.f()) {
            return this.c;
        }
        while (true) {
            if (this.a(true)) {
                final HttpURLConnectionImpl$Retry c = this.c();
                if (c == HttpURLConnectionImpl$Retry.a) {
                    this.c.m();
                    return this.c;
                }
                String method = this.method;
                cc d = this.c.d();
                final int c2 = this.c.h().c();
                if (c2 == 300 || c2 == 301 || c2 == 302 || c2 == 303) {
                    method = "GET";
                    this.e.b("Content-Length");
                    d = null;
                }
                if (d != null && !(d instanceof aq)) {
                    throw new HttpRetryException("Cannot retry streamed HTTP body", c2);
                }
                if (c == HttpURLConnectionImpl$Retry.c) {
                    this.c.m();
                }
                this.c = this.a(method, this.c.n(), (aq)d);
            }
        }
    }
    
    private HttpURLConnectionImpl$Retry c() {
        final c k = this.c.k();
        Proxy proxy;
        if (k != null) {
            proxy = k.b().b();
        }
        else {
            proxy = this.a.c();
        }
        final int responseCode = this.getResponseCode();
        switch (responseCode) {
            default: {
                return HttpURLConnectionImpl$Retry.a;
            }
            case 407: {
                if (proxy.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
            }
            case 401: {
                final ab a = i.a(this.a.i(), this.c.h(), proxy);
                if (a == null) {
                    return HttpURLConnectionImpl$Retry.a;
                }
                this.e = a.g().b();
                return HttpURLConnectionImpl$Retry.b;
            }
            case 300:
            case 301:
            case 302:
            case 303:
            case 307: {
                if (!this.getInstanceFollowRedirects()) {
                    return HttpURLConnectionImpl$Retry.a;
                }
                if (++this.g > 20) {
                    throw new ProtocolException("Too many redirects: " + this.g);
                }
                if (responseCode == 307 && !this.method.equals("GET") && !this.method.equals("HEAD")) {
                    return HttpURLConnectionImpl$Retry.a;
                }
                final String headerField = this.getHeaderField("Location");
                if (headerField == null) {
                    return HttpURLConnectionImpl$Retry.a;
                }
                final URL url = this.url;
                this.url = new URL(url, headerField);
                if (!this.url.getProtocol().equals("https") && !this.url.getProtocol().equals("http")) {
                    return HttpURLConnectionImpl$Retry.a;
                }
                final boolean equals = url.getProtocol().equals(this.url.getProtocol());
                if (!equals && !this.a.k()) {
                    return HttpURLConnectionImpl$Retry.a;
                }
                final boolean equals2 = url.getHost().equals(this.url.getHost());
                int n;
                if (bf.a(url) == bf.a(this.url)) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (equals2 && n != 0 && equals) {
                    return HttpURLConnectionImpl$Retry.b;
                }
                return HttpURLConnectionImpl$Retry.c;
            }
        }
    }
    
    @Override
    public final void addRequestProperty(final String s, final String s2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot add request property after connection is made");
        }
        if (s == null) {
            throw new NullPointerException("field == null");
        }
        if (s2 == null) {
            ba.a().a("Ignoring header " + s + " because its value was null.");
            return;
        }
        if ("X-Android-Transports".equals(s) || "X-Android-Protocols".equals(s)) {
            this.a(s2, false);
            return;
        }
        this.e.a(s, s2);
    }
    
    @Override
    public final void connect() {
        this.a();
        while (!this.a(false)) {}
    }
    
    @Override
    public final void disconnect() {
        if (this.c != null) {
            this.c.n();
        }
    }
    
    @Override
    public int getConnectTimeout() {
        return this.a.a();
    }
    
    @Override
    public final InputStream getErrorStream() {
        try {
            final u b = this.b();
            final boolean o = b.o();
            InputStream j = null;
            if (o) {
                final int c = b.h().c();
                j = null;
                if (c >= 400) {
                    j = b.j();
                }
            }
            return j;
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    @Override
    public final String getHeaderField(final int n) {
        try {
            return this.b().h().g().b(n);
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    @Override
    public final String getHeaderField(final String s) {
        try {
            final ah h = this.b().h();
            if (s == null) {
                return h.b();
            }
            return h.g().a(s);
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    @Override
    public final String getHeaderFieldKey(final int n) {
        try {
            return this.b().h().g().a(n);
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    @Override
    public final Map getHeaderFields() {
        try {
            final ah h = this.b().h();
            return y.a(h.g(), h.b());
        }
        catch (IOException ex) {
            return Collections.emptyMap();
        }
    }
    
    @Override
    public final InputStream getInputStream() {
        if (!this.doInput) {
            throw new ProtocolException("This protocol does not support input");
        }
        final u b = this.b();
        if (this.getResponseCode() >= 400) {
            throw new FileNotFoundException(this.url.toString());
        }
        final InputStream j = b.j();
        if (j == null) {
            throw new ProtocolException("No response body exists; responseCode=" + this.getResponseCode());
        }
        return j;
    }
    
    @Override
    public final OutputStream getOutputStream() {
        this.connect();
        final bi e = this.c.e();
        if (e == null) {
            throw new ProtocolException("method does not support a request body: " + this.method);
        }
        if (this.c.f()) {
            throw new ProtocolException("cannot write request body after response has been read");
        }
        return e.d();
    }
    
    @Override
    public final Permission getPermission() {
        String s = this.getURL().getHost();
        int n = bf.a(this.getURL());
        if (this.usingProxy()) {
            final InetSocketAddress inetSocketAddress = (InetSocketAddress)this.a.c().address();
            s = inetSocketAddress.getHostName();
            n = inetSocketAddress.getPort();
        }
        return new SocketPermission(s + ":" + n, "connect, resolve");
    }
    
    @Override
    public int getReadTimeout() {
        return this.a.b();
    }
    
    @Override
    public final Map getRequestProperties() {
        if (this.connected) {
            throw new IllegalStateException("Cannot access request header fields after connection is set");
        }
        return y.a(this.e.a(), null);
    }
    
    @Override
    public final String getRequestProperty(final String s) {
        if (s == null) {
            return null;
        }
        return this.e.c(s);
    }
    
    @Override
    public final int getResponseCode() {
        return this.b().h().c();
    }
    
    @Override
    public String getResponseMessage() {
        return this.b().h().d();
    }
    
    @Override
    public void setConnectTimeout(final int n) {
        this.a.a(n, TimeUnit.MILLISECONDS);
    }
    
    @Override
    public void setFixedLengthStreamingMode(final int n) {
        this.setFixedLengthStreamingMode((long)n);
    }
    
    @Override
    public void setFixedLengthStreamingMode(final long f) {
        if (super.connected) {
            throw new IllegalStateException("Already connected");
        }
        if (this.chunkLength > 0) {
            throw new IllegalStateException("Already in chunked mode");
        }
        if (f < 0L) {
            throw new IllegalArgumentException("contentLength < 0");
        }
        this.f = f;
        super.fixedContentLength = (int)Math.min(f, 2147483647L);
    }
    
    @Override
    public void setIfModifiedSince(final long ifModifiedSince) {
        super.setIfModifiedSince(ifModifiedSince);
        if (this.ifModifiedSince != 0L) {
            this.e.b("If-Modified-Since", s.a(new Date(this.ifModifiedSince)));
            return;
        }
        this.e.b("If-Modified-Since");
    }
    
    @Override
    public void setReadTimeout(final int n) {
        this.a.b(n, TimeUnit.MILLISECONDS);
    }
    
    @Override
    public void setRequestMethod(final String method) {
        if (!v.a.contains(method)) {
            throw new ProtocolException("Expected one of " + v.a + " but was " + method);
        }
        this.method = method;
    }
    
    @Override
    public final void setRequestProperty(final String s, final String s2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot set request property after connection is made");
        }
        if (s == null) {
            throw new NullPointerException("field == null");
        }
        if (s2 == null) {
            ba.a().a("Ignoring header " + s + " because its value was null.");
            return;
        }
        if ("X-Android-Transports".equals(s) || "X-Android-Protocols".equals(s)) {
            this.a(s2, false);
            return;
        }
        this.e.b(s, s2);
    }
    
    @Override
    public final boolean usingProxy() {
        Proxy proxy;
        if (this.h != null) {
            proxy = this.h.b();
        }
        else {
            proxy = this.a.c();
        }
        return proxy != null && proxy.type() != Proxy.Type.DIRECT;
    }
}
