// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class g
{
    public final String a;
    public final Object b;
    
    g(final String a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof g) {
            final g g = (g)o;
            if (this.a.equals(g.a) && this.b.equals(g.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Integer[] { this.a.hashCode(), this.b.hashCode() });
    }
    
    @Override
    public String toString() {
        return "Key: " + this.a + " value: " + this.b.toString();
    }
}
