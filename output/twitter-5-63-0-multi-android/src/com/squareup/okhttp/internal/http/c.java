// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import com.squareup.okhttp.ResponseSource;
import java.util.Date;

public class c
{
    final long a;
    final ab b;
    final ah c;
    private Date d;
    private String e;
    private Date f;
    private String g;
    private Date h;
    private long i;
    private long j;
    private String k;
    private int l;
    
    public c(final long a, final ab b, final ah c) {
        this.l = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        if (c != null) {
            for (int i = 0; i < c.g().a(); ++i) {
                final String a2 = c.g().a(i);
                final String b2 = c.g().b(i);
                if ("Date".equalsIgnoreCase(a2)) {
                    this.d = s.a(b2);
                    this.e = b2;
                }
                else if ("Expires".equalsIgnoreCase(a2)) {
                    this.h = s.a(b2);
                }
                else if ("Last-Modified".equalsIgnoreCase(a2)) {
                    this.f = s.a(b2);
                    this.g = b2;
                }
                else if ("ETag".equalsIgnoreCase(a2)) {
                    this.k = b2;
                }
                else if ("Age".equalsIgnoreCase(a2)) {
                    this.l = com.squareup.okhttp.internal.http.e.a(b2);
                }
                else if (y.b.equalsIgnoreCase(a2)) {
                    this.i = Long.parseLong(b2);
                }
                else if (y.c.equalsIgnoreCase(a2)) {
                    this.j = Long.parseLong(b2);
                }
            }
        }
    }
    
    private static boolean a(final ab ab) {
        return ab.a("If-Modified-Since") != null || ab.a("If-None-Match") != null;
    }
    
    private a b() {
        long millis = 0L;
        if (this.c == null) {
            return new a(this.b, this.c, ResponseSource.c, null);
        }
        if (this.b.k() && this.c.f() == null) {
            return new a(this.b, this.c, ResponseSource.c, null);
        }
        if (!com.squareup.okhttp.internal.http.a.a(this.c, this.b)) {
            return new a(this.b, this.c, ResponseSource.c, null);
        }
        final com.squareup.okhttp.b j = this.b.j();
        if (j.a() || a(this.b)) {
            return new a(this.b, this.c, ResponseSource.c, null);
        }
        final long d = this.d();
        long n = this.c();
        if (j.c() != -1) {
            n = Math.min(n, TimeUnit.SECONDS.toMillis(j.c()));
        }
        long millis2;
        if (j.h() != -1) {
            millis2 = TimeUnit.SECONDS.toMillis(j.h());
        }
        else {
            millis2 = millis;
        }
        final com.squareup.okhttp.b i = this.c.j();
        if (!i.f() && j.g() != -1) {
            millis = TimeUnit.SECONDS.toMillis(j.g());
        }
        if (!i.a() && d + millis2 < millis + n) {
            final ak a = this.c.i().a(ResponseSource.a);
            if (millis2 + d >= n) {
                a.b("Warning", "110 HttpURLConnection \"Response is stale\"");
            }
            if (d > 86400000L && this.e()) {
                a.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
            }
            return new a(this.b, a.a(), ResponseSource.a, null);
        }
        final ae f = this.b.f();
        if (this.f != null) {
            f.a("If-Modified-Since", this.g);
        }
        else if (this.d != null) {
            f.a("If-Modified-Since", this.e);
        }
        if (this.k != null) {
            f.a("If-None-Match", this.k);
        }
        final ab a2 = f.a();
        ResponseSource responseSource;
        if (a(a2)) {
            responseSource = ResponseSource.b;
        }
        else {
            responseSource = ResponseSource.c;
        }
        return new a(a2, this.c, responseSource, null);
    }
    
    private long c() {
        long millis = 0L;
        final com.squareup.okhttp.b j = this.c.j();
        if (j.c() != -1) {
            millis = TimeUnit.SECONDS.toMillis(j.c());
        }
        else {
            if (this.h != null) {
                long n;
                if (this.d != null) {
                    n = this.d.getTime();
                }
                else {
                    n = this.j;
                }
                long n2 = this.h.getTime() - n;
                if (n2 <= millis) {
                    n2 = millis;
                }
                return n2;
            }
            if (this.f != null && this.c.a().a().getQuery() == null) {
                long n3;
                if (this.d != null) {
                    n3 = this.d.getTime();
                }
                else {
                    n3 = this.i;
                }
                final long n4 = n3 - this.f.getTime();
                if (n4 > millis) {
                    return n4 / 10L;
                }
            }
        }
        return millis;
    }
    
    private long d() {
        long n = 0L;
        if (this.d != null) {
            n = Math.max(n, this.j - this.d.getTime());
        }
        if (this.l != -1) {
            n = Math.max(n, TimeUnit.SECONDS.toMillis(this.l));
        }
        return this.a - this.j + (n + (this.j - this.i));
    }
    
    private boolean e() {
        return this.c.j().c() == -1 && this.h == null;
    }
    
    public a a() {
        final a b = this.b();
        if (b.c != ResponseSource.a && this.b.j().i()) {
            return new a(b.a, new ak().a(b.a).a(com.squareup.okhttp.internal.http.a.e).a(ResponseSource.d).a(com.squareup.okhttp.internal.http.a.d).a(), ResponseSource.d, null);
        }
        return b;
    }
}
