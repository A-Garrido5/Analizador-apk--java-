// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class cy extends cB
{
    private final int b;
    private final int c;
    
    cy(final int n, final int c, final int b) {
        super(n);
        if (c < 0 || c > 10 || b < 0 || b > 10) {
            throw fD.a();
        }
        this.c = c;
        this.b = b;
    }
    
    int b() {
        return this.c;
    }
    
    boolean c() {
        return this.c == 10;
    }
    
    boolean d() {
        return this.b == 10;
    }
    
    int e() {
        return this.b;
    }
}
