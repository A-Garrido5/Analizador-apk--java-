// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

public class d
{
    boolean i;
    int j;
    boolean k;
    int l;
    boolean m;
    
    public d() {
        this.k = true;
        this.l = 14;
    }
    
    protected d(final d d) {
        this.k = true;
        this.l = 14;
        this.i = d.i;
        this.j = d.j;
        this.k = d.k;
        this.l = d.l;
        this.m = d.m;
    }
    
    protected final void b() {
        if (this.i) {
            throw new IllegalStateException("Options are already configured!");
        }
    }
    
    public final void b(final int l) {
        this.b();
        this.l = l;
    }
    
    public final void c(final int j) {
        this.b();
        this.j = j;
    }
    
    public final void d(final boolean k) {
        this.b();
        this.k = k;
    }
    
    public final void e(final boolean m) {
        this.b();
        this.m = m;
    }
}
