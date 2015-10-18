// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class cZ extends cs
{
    private final float d;
    
    cZ(final float n, final float n2, final float d) {
        super(n, n2);
        this.d = d;
    }
    
    cZ a(final float n, final float n2, final float n3) {
        return new cZ((n2 + this.a()) / 2.0f, (n + this.b()) / 2.0f, (n3 + this.d) / 2.0f);
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
}
