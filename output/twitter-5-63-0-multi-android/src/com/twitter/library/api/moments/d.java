// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.moments;

import com.twitter.model.common.a;

public class d extends a
{
    private long a;
    private String b;
    private boolean c;
    private boolean d;
    private String e;
    private String f;
    private boolean g;
    private String h;
    private int i;
    
    public d a(final int i) {
        this.i = i;
        return this;
    }
    
    public d a(final long a) {
        this.a = a;
        return this;
    }
    
    public d a(final String b) {
        this.b = b;
        return this;
    }
    
    public d a(final boolean c) {
        this.c = c;
        return this;
    }
    
    public d b(final String e) {
        this.e = e;
        return this;
    }
    
    public d b(final boolean d) {
        this.d = d;
        return this;
    }
    
    protected Moment c() {
        return new Moment(this, null);
    }
    
    public d c(final String f) {
        this.f = f;
        return this;
    }
    
    public d c(final boolean g) {
        this.g = g;
        return this;
    }
    
    public d d(final String h) {
        this.h = h;
        return this;
    }
}
