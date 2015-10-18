// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

public abstract class ca extends t
{
    String l;
    String m;
    String n;
    int o;
    int p;
    
    public ca() {
    }
    
    public ca(final UrlEntity urlEntity) {
        super(urlEntity);
        this.l = urlEntity.url;
        this.m = urlEntity.expandedUrl;
        this.n = urlEntity.displayUrl;
        this.o = urlEntity.displayStart;
        this.p = urlEntity.displayEnd;
    }
    
    @Override
    protected void av_() {
        super.av_();
        if (this.l == null) {
            this.l = "";
        }
        if (this.m == null) {
            this.m = this.l;
        }
        if (this.n == null) {
            this.n = this.m;
        }
        if (this.a != -1 && this.b == -1) {
            this.b = this.a + this.l.length();
        }
        if (this.p == 0) {
            this.p = this.o + this.n.length();
        }
    }
    
    public ca b(final String l) {
        this.l = l;
        return this;
    }
    
    public ca c(final String m) {
        this.m = m;
        return this;
    }
    
    public ca d(final String n) {
        this.n = n;
        return this;
    }
}
