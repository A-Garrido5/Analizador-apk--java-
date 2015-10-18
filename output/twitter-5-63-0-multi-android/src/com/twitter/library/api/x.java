// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.model.common.a;

public class x extends a
{
    long a;
    int b;
    int c;
    int d;
    long e;
    
    protected ExtendedProfile a() {
        return new ExtendedProfile(this);
    }
    
    public x a(final int b) {
        this.b = b;
        return this;
    }
    
    public x a(final long a) {
        this.a = a;
        return this;
    }
    
    public x b(final int c) {
        this.c = c;
        return this;
    }
    
    public x b(final long e) {
        this.e = e;
        return this;
    }
    
    public x c(final int d) {
        this.d = d;
        return this;
    }
}
