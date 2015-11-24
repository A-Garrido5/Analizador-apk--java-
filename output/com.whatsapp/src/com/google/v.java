// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class v
{
    private final int a;
    private final cH b;
    
    v(final cH b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof v) {
            final v v = (v)o;
            if (this.b == v.b && this.a == v.a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 65535 * this.b.hashCode() + this.a;
    }
}
