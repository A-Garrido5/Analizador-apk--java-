// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class hE
{
    private static final int[] a;
    private final cA b;
    private final hh c;
    
    static {
        a = new int[] { 1, 1, 2 };
    }
    
    hE() {
        this.c = new hh();
        this.b = new cA();
    }
    
    aU a(final int n, final hN hn, final int n2) {
        final int[] a = gP.a(hn, n2, false, hE.a);
        try {
            return this.b.a(n, hn, a);
        }
        catch (fN fn) {
            return this.c.a(n, hn, a);
        }
    }
}
