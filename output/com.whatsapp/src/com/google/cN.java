// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class cN extends cs
{
    private final float d;
    private final int e;
    
    cN(final float n, final float n2, final float n3) {
        this(n, n2, n3, 1);
    }
    
    private cN(final float n, final float n2, final float d, final int e) {
        super(n, n2);
        this.d = d;
        this.e = e;
    }
    
    cN a(final float n, final float n2, final float n3) {
        final int n4 = 1 + this.e;
        return new cN((n2 + this.e * this.a()) / n4, (n + this.e * this.b()) / n4, (n3 + this.e * this.d) / n4, n4);
    }
    
    boolean b(final float n, final float n2, final float n3) {
        final float n4 = fcmpg(Math.abs(n2 - this.b()), n);
        boolean b = false;
        if (n4 <= 0) {
            final float n5 = fcmpg(Math.abs(n3 - this.a()), n);
            b = false;
            if (n5 <= 0) {
                final float abs = Math.abs(n - this.d);
                if (abs > 1.0f) {
                    final float n6 = fcmpg(abs, this.d);
                    b = false;
                    if (n6 > 0) {
                        return b;
                    }
                }
                b = true;
            }
        }
        return b;
    }
    
    public float c() {
        return this.d;
    }
    
    int d() {
        return this.e;
    }
}
