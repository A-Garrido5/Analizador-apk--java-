// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events.sports;

import com.twitter.library.api.TimelineScribeContent;

public class g
{
    private final long a;
    private final long b;
    private String c;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private byte[] i;
    private String j;
    private String k;
    private String l;
    private TimelineScribeContent m;
    private String n;
    private int o;
    
    public g(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public f a() {
        return new f(this);
    }
    
    public g a(final int d) {
        this.d = d;
        return this;
    }
    
    public g a(final TimelineScribeContent m) {
        this.m = m;
        return this;
    }
    
    public g a(final String c) {
        this.c = c;
        return this;
    }
    
    public g a(final byte[] i) {
        this.i = i;
        return this;
    }
    
    public g b(final int o) {
        this.o = o;
        return this;
    }
    
    public g b(final String e) {
        this.e = e;
        return this;
    }
    
    public g c(final String f) {
        this.f = f;
        return this;
    }
    
    public g d(final String g) {
        this.g = g;
        return this;
    }
    
    public g e(final String h) {
        this.h = h;
        return this;
    }
    
    public g f(final String j) {
        this.j = j;
        return this;
    }
    
    public g g(final String l) {
        this.l = l;
        return this;
    }
    
    public g h(final String n) {
        this.n = n;
        return this;
    }
}
