// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

class p
{
    String a;
    int b;
    String c;
    Long d;
    Long e;
    private boolean f;
    
    public p(final String a, final int b, final String c, final Long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = 0L;
        this.d = d;
        this.f = true;
    }
    
    public void a(final int n, final String s, final long n2) {
        this.f = (this.f || this.b != n || !this.c.equals(s));
        this.d = n2;
    }
    
    public void a(final long n) {
        this.f = false;
        this.e = n;
    }
}
