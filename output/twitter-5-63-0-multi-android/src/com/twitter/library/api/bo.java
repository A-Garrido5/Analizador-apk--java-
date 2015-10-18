// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.model.common.a;

public class bo extends a
{
    int a;
    int b;
    int c;
    int d;
    String e;
    int f;
    String g;
    int h;
    
    public bo() {
        this.a = -1;
        this.f = 0;
    }
    
    public bo a(final int a) {
        this.a = a;
        return this;
    }
    
    public bo a(final String e) {
        this.e = e;
        return this;
    }
    
    @Override
    public boolean aw_() {
        return this.a != -1 || this.f != 0;
    }
    
    public bo b(final int b) {
        this.b = b;
        return this;
    }
    
    public bo b(final String g) {
        this.g = g;
        return this;
    }
    
    public int c() {
        return this.a;
    }
    
    public bo c(final int c) {
        this.c = c;
        return this;
    }
    
    public bo d(final int d) {
        this.d = d;
        return this;
    }
    
    protected TwitterSocialProof e() {
        return new TwitterSocialProof(this);
    }
    
    public bo e(final int f) {
        this.f = f;
        return this;
    }
    
    public bo f(final int n) {
        this.f = z.a(this.f, n);
        return this;
    }
    
    public bo g(final int h) {
        this.h = h;
        return this;
    }
}
