// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.i;
import java.net.URLStreamHandler;
import java.util.concurrent.TimeUnit;
import com.squareup.okhttp.internal.http.x;
import com.squareup.okhttp.internal.http.HttpURLConnectionImpl;
import java.net.HttpURLConnection;
import java.net.URL;
import com.squareup.okhttp.internal.http.aa;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.net.ssl.TrustManager;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import com.squareup.okhttp.internal.http.am;
import java.net.ResponseCache;
import java.util.Collections;
import java.util.HashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import java.net.CookieHandler;
import java.net.ProxySelector;
import java.util.List;
import java.net.Proxy;
import java.util.Map;
import java.net.URLStreamHandlerFactory;

public final class j implements Cloneable, URLStreamHandlerFactory
{
    private final Map a;
    private final n b;
    private Proxy c;
    private List d;
    private ProxySelector e;
    private CookieHandler f;
    private l g;
    private SSLSocketFactory h;
    private HostnameVerifier i;
    private g j;
    private d k;
    private boolean l;
    private int m;
    private int n;
    private volatile Map o;
    
    public j() {
        this.l = true;
        this.a = new HashMap(64);
        this.b = new n();
        this.o = Collections.EMPTY_MAP;
    }
    
    private l a(final ResponseCache responseCache) {
        if (responseCache == null || responseCache instanceof l) {
            return (l)responseCache;
        }
        return new am(responseCache);
    }
    
    private SSLSocketFactory p() {
        synchronized (this) {
            Label_0035: {
                if (this.h != null) {
                    break Label_0035;
                }
                try {
                    final SSLContext instance = SSLContext.getInstance("TLS");
                    instance.init(null, null, null);
                    this.h = instance.getSocketFactory();
                    return this.h;
                }
                catch (GeneralSecurityException ex) {
                    throw new AssertionError();
                }
            }
        }
    }
    
    public int a() {
        return this.m;
    }
    
    public aa a(final aa aa) {
        return this.o.get(aa);
    }
    
    public j a(final l g) {
        this.g = g;
        return this;
    }
    
    public j a(final CookieHandler f) {
        this.f = f;
        return this;
    }
    
    public j a(final Proxy c) {
        this.c = c;
        return this;
    }
    
    public j a(final List list) {
        final List a = bf.a(list);
        if (!a.contains(Protocol.c)) {
            throw new IllegalArgumentException("protocols doesn't contain http/1.1: " + a);
        }
        if (a.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        this.d = bf.a(a);
        return this;
    }
    
    public j a(final Map map) {
        this.o = new HashMap(map);
        return this;
    }
    
    public j a(final HostnameVerifier i) {
        this.i = i;
        return this;
    }
    
    public j a(final SSLSocketFactory h) {
        this.h = h;
        return this;
    }
    
    public Object a(final a a) {
        synchronized (this) {
            a a2 = this.a.get(a);
            if (a2 == null) {
                this.a.put(a, a);
                a2 = a;
            }
            return a2;
        }
    }
    
    public HttpURLConnection a(final URL url) {
        return this.a(url, this.c);
    }
    
    HttpURLConnection a(final URL url, final Proxy c) {
        final String protocol = url.getProtocol();
        final j n = this.n();
        n.c = c;
        if (protocol.equals("http")) {
            return new HttpURLConnectionImpl(url, n);
        }
        if (protocol.equals("https")) {
            return new x(url, n);
        }
        throw new IllegalArgumentException("Unexpected protocol: " + protocol);
    }
    
    public void a(final long n, final TimeUnit timeUnit) {
        if (n < 0L) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        final long millis = timeUnit.toMillis(n);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        this.m = (int)millis;
    }
    
    public int b() {
        return this.n;
    }
    
    public void b(final long n, final TimeUnit timeUnit) {
        if (n < 0L) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        final long millis = timeUnit.toMillis(n);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        this.n = (int)millis;
    }
    
    public void b(final a a) {
        synchronized (this) {
            this.a.remove(a);
        }
    }
    
    public Proxy c() {
        return this.c;
    }
    
    @Override
    public URLStreamHandler createURLStreamHandler(final String s) {
        if (!s.equals("http") && !s.equals("https")) {
            return null;
        }
        return new k(this, s);
    }
    
    public ProxySelector d() {
        return this.e;
    }
    
    public CookieHandler e() {
        return this.f;
    }
    
    public l f() {
        return this.g;
    }
    
    public SSLSocketFactory g() {
        return this.h;
    }
    
    public HostnameVerifier h() {
        return this.i;
    }
    
    public g i() {
        return this.j;
    }
    
    public d j() {
        return this.k;
    }
    
    public boolean k() {
        return this.l;
    }
    
    public n l() {
        return this.b;
    }
    
    public List m() {
        return this.d;
    }
    
    j n() {
        final j o = this.o();
        if (o.e == null) {
            o.e = ProxySelector.getDefault();
        }
        if (o.f == null) {
            o.f = CookieHandler.getDefault();
        }
        if (o.g == null) {
            o.g = this.a(ResponseCache.getDefault());
        }
        if (o.h == null) {
            o.h = this.p();
        }
        if (o.i == null) {
            o.i = cg.a;
        }
        if (o.j == null) {
            o.j = com.squareup.okhttp.internal.http.i.a;
        }
        if (o.k == null) {
            o.k = com.squareup.okhttp.d.a();
        }
        if (o.d == null) {
            o.d = bf.f;
        }
        return o;
    }
    
    public j o() {
        try {
            return (j)super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
}
