// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.util.Arrays;

final class dc
{
    final int a;
    final byte[] b;
    
    int a() {
        return 0 + qp.f(this.a) + this.b.length;
    }
    
    void a(final qp qp) {
        qp.e(this.a);
        qp.b(this.b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (!(o instanceof dc)) {
                return false;
            }
            final dc dc = (dc)o;
            if (this.a != dc.a || !Arrays.equals(this.b, dc.b)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * (527 + this.a) + Arrays.hashCode(this.b);
    }
}
