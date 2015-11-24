// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.net.URISyntaxException;
import java.io.IOException;
import com.squareup.okhttp.b;
import java.net.URI;
import java.net.URL;

public class ae
{
    private URL a;
    private String b;
    private h c;
    private ad d;
    private Object e;
    
    public ae() {
        this.b = "GET";
        this.c = new h();
    }
    
    private ae(final ab ab) {
        this.a = ab.a;
        this.b = ab.b;
        this.d = ab.d;
        this.e = ab.e;
        this.c = ab.c.b();
    }
    
    public ab a() {
        if (this.a == null) {
            throw new IllegalStateException("url == null");
        }
        return new ab(this, null);
    }
    
    public ae a(final String s) {
        return this.a("User-Agent", s);
    }
    
    public ae a(final String b, final ad d) {
        if (b == null || b.length() == 0) {
            throw new IllegalArgumentException("method == null || method.length() == 0");
        }
        this.b = b;
        this.d = d;
        return this;
    }
    
    public ae a(final String s, final String s2) {
        this.c.b(s, s2);
        return this;
    }
    
    public ae a(final URL a) {
        if (a == null) {
            throw new IllegalArgumentException("url == null");
        }
        this.a = a;
        return this;
    }
    
    public ae b(final String s, final String s2) {
        this.c.a(s, s2);
        return this;
    }
}
