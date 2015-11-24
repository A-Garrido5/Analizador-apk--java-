// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

public class a
{
    public final String a;
    
    public a(final String a) {
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && o instanceof a && this.a.equals(((a)o).a);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}
