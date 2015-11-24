// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.util.Collection;

public class u
{
    private String a;
    private int b;
    private long c;
    private Collection d;
    private String e;
    private boolean f;
    private long g;
    private long h;
    private long i;
    private long j;
    private boolean k;
    
    public u() {
        this.b = -1;
        this.c = -1L;
        this.g = -1L;
        this.h = -1L;
        this.i = -1L;
        this.j = -1L;
    }
    
    public s a() {
        if (this.b != -1) {
            return new s(this.e, this.b, this.c, this.d, this.a, this.f, this.g, this.h, this.i, this.j, this.k, null);
        }
        return null;
    }
    
    public u a(final int b) {
        this.b = b;
        return this;
    }
    
    public u a(final long c) {
        this.c = c;
        return this;
    }
    
    public u a(final String e) {
        this.e = e;
        return this;
    }
    
    public u a(final Collection d) {
        this.d = d;
        return this;
    }
    
    public u a(final boolean f) {
        this.f = f;
        return this;
    }
    
    public u b(final long g) {
        this.g = g;
        return this;
    }
    
    public u b(final String a) {
        this.a = a;
        return this;
    }
    
    public u b(final boolean k) {
        this.k = k;
        return this;
    }
    
    public u c(final long j) {
        this.j = j;
        return this;
    }
    
    public u d(final long h) {
        this.h = h;
        return this;
    }
    
    public u e(final long i) {
        this.i = i;
        return this;
    }
}
