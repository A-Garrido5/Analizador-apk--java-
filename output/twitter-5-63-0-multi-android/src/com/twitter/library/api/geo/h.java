// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import com.twitter.library.client.Session;
import android.content.Context;

public class h
{
    private Context a;
    private Session b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private boolean h;
    
    public f a() {
        return new f(this.a, this.b, this.c, this.g, this.d, this.e, this.f, this.h, null);
    }
    
    public h a(final long g) {
        this.g = g;
        return this;
    }
    
    public h a(final Context a) {
        this.a = a;
        return this;
    }
    
    public h a(final Session b) {
        this.b = b;
        return this;
    }
    
    public h a(final String c) {
        this.c = c;
        return this;
    }
    
    public h a(final boolean h) {
        this.h = h;
        return this;
    }
    
    public h b(final String d) {
        this.d = d;
        return this;
    }
    
    public h c(final String e) {
        this.e = e;
        return this;
    }
    
    public h d(final String f) {
        this.f = f;
        return this;
    }
}
