// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.net.URISyntaxException;
import java.io.IOException;
import com.squareup.okhttp.b;
import java.net.URI;
import java.net.URL;

public final class ab
{
    private final URL a;
    private final String b;
    private final f c;
    private final ad d;
    private final Object e;
    private volatile af f;
    private volatile URI g;
    private volatile b h;
    
    private ab(final ae ae) {
        this.a = ae.a;
        this.b = ae.b;
        this.c = ae.c.a();
        this.d = ae.d;
        Object e;
        if (ae.e != null) {
            e = ae.e;
        }
        else {
            e = this;
        }
        this.e = e;
    }
    
    private af l() {
        final af f = this.f;
        if (f != null) {
            return f;
        }
        return this.f = new af(this.c);
    }
    
    public String a(final String s) {
        return this.c.a(s);
    }
    
    public URL a() {
        return this.a;
    }
    
    public URI b() {
        try {
            final URI g = this.g;
            if (g != null) {
                return g;
            }
            return this.g = ba.a().a(this.a);
        }
        catch (URISyntaxException ex) {
            throw new IOException(ex.getMessage());
        }
    }
    
    public String c() {
        return this.b;
    }
    
    public f d() {
        return this.c;
    }
    
    public ad e() {
        return this.d;
    }
    
    public ae f() {
        return new ae(this, null);
    }
    
    public f g() {
        return this.c;
    }
    
    public String h() {
        return this.l().a;
    }
    
    public String i() {
        return this.l().b;
    }
    
    public b j() {
        final b h = this.h;
        if (h != null) {
            return h;
        }
        return this.h = com.squareup.okhttp.b.a(this.c);
    }
    
    public boolean k() {
        return this.a().getProtocol().equals("https");
    }
}
