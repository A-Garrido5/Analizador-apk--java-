// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class fK extends fL
{
    public static final fK b;
    
    static {
        b = new fK();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || o instanceof fK;
    }
    
    @Override
    public int hashCode() {
        return fK.class.hashCode();
    }
}
