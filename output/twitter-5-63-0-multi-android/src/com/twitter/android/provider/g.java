// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.provider;

class g
{
    public final String a;
    public final int b;
    
    public g(final String a) {
        this.a = a;
        this.b = 0;
    }
    
    public g(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final g g = (g)o;
            if (this.a == null) {
                if (g.a != null) {
                    return false;
                }
            }
            else if (this.b != g.b || !this.a.equalsIgnoreCase(g.a)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * this.a.hashCode() + this.b;
    }
}
