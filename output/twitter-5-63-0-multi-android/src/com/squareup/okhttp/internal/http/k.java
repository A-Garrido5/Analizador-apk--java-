// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Protocol;
import java.net.Socket;
import java.io.IOException;
import java.net.CacheRequest;
import com.squareup.okhttp.c;
import com.squareup.okhttp.d;

public final class k
{
    private static final byte[] g;
    private static final byte[] h;
    private final d a;
    private final c b;
    private final bj c;
    private final bi d;
    private int e;
    private int f;
    
    static {
        g = new byte[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
        h = new byte[] { 48, 13, 10, 13, 10 };
    }
    
    public k(final d a, final c b, final bj c, final bi d) {
        this.e = 0;
        this.f = 0;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public cc a(final long n) {
        if (this.e != 1) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 2;
        return new p(this, n, null);
    }
    
    public cd a(final CacheRequest cacheRequest) {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 5;
        return new r(this, cacheRequest);
    }
    
    public cd a(final CacheRequest cacheRequest, final long n) {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 5;
        return new q(this, cacheRequest, n);
    }
    
    public cd a(final CacheRequest cacheRequest, final u u) {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 5;
        return new o(this, cacheRequest, u);
    }
    
    public void a() {
        this.f = 1;
        if (this.e == 0) {
            this.f = 0;
            this.a.a(this.b);
        }
    }
    
    public void a(final aq aq) {
        if (this.e != 1) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 3;
        aq.a(this.d);
    }
    
    public void a(final f f, final String s) {
        if (this.e != 0) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.d.a(s).a("\r\n");
        for (int i = 0; i < f.a(); ++i) {
            this.d.a(f.a(i)).a(": ").a(f.b(i)).a("\r\n");
        }
        this.d.a("\r\n");
        this.e = 1;
    }
    
    public void a(final h h) {
        while (true) {
            final String a = this.c.a(true);
            if (a.length() == 0) {
                break;
            }
            h.a(a);
        }
    }
    
    public boolean a(final cd cd, final int soTimeout) {
        final Socket c = this.b.c();
        try {
            final int soTimeout2 = c.getSoTimeout();
            c.setSoTimeout(soTimeout);
            try {
                return bf.a(cd, soTimeout);
            }
            finally {
                c.setSoTimeout(soTimeout2);
            }
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    public void b() {
        this.f = 2;
        if (this.e == 0) {
            this.e = 6;
            this.b.close();
        }
    }
    
    public boolean c() {
        return this.e == 6;
    }
    
    public void d() {
        this.d.a();
    }
    
    public ak e() {
        if (this.e != 1 && this.e != 3) {
            throw new IllegalStateException("state: " + this.e);
        }
        au au;
        ak a;
        do {
            au = new au(this.c.a(true));
            a = new ak().a(au);
            final h h = new h();
            this.a(h);
            h.b(y.e, Protocol.c.name.a());
            a.a(h.a());
        } while (au.c() == 100);
        this.e = 4;
        return a;
    }
    
    public cc f() {
        if (this.e != 1) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 2;
        return new n(this, null);
    }
    
    public void g() {
        this.a(null, 0L);
    }
}
