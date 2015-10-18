// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class a1
{
    private final int a;
    private final bl b;
    
    a1(final bl b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof a1) {
            final a1 a1 = (a1)o;
            if (this.b == a1.b && this.a == a1.a) {
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
