// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import com.twitter.util.k;
import com.twitter.library.network.a;

public abstract class ak
{
    public final String l;
    public a m;
    public boolean n;
    public boolean o;
    public boolean p;
    public al q;
    public Object r;
    public ResourceRequestType s;
    
    protected ak(final String s) {
        this.o = true;
        this.l = k.a(s);
    }
    
    public ak a(final ResourceRequestType s) {
        this.s = s;
        return this;
    }
    
    public ak a(final al q) {
        this.q = q;
        return this;
    }
    
    public ak a(final a m) {
        this.m = m;
        return this;
    }
    
    public ak b(final boolean n) {
        this.n = n;
        return this;
    }
    
    public ak c(final boolean o) {
        this.o = o;
        return this;
    }
    
    public ak d(final boolean p) {
        this.p = p;
        return this;
    }
}
