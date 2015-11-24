// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class hG
{
    private final int a;
    private final bM[] b;
    
    private hG(final int a, final bM bm) {
        this.a = a;
        this.b = new bM[] { bm };
    }
    
    hG(final int n, final bM bm, final R r) {
        this(n, bm);
    }
    
    private hG(final int a, final bM bm, final bM bm2) {
        this.a = a;
        this.b = new bM[] { bm, bm2 };
    }
    
    hG(final int n, final bM bm, final bM bm2, final R r) {
        this(n, bm, bm2);
    }
    
    int a() {
        return this.a;
    }
    
    bM[] b() {
        return this.b;
    }
}
