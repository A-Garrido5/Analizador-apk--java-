// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class b4
{
    private final int a;
    private final Object b;
    
    b4(final Object b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof b4) {
            final b4 b4 = (b4)o;
            if (this.b == b4.b && this.a == b4.a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 65535 * System.identityHashCode(this.b) + this.a;
    }
}
