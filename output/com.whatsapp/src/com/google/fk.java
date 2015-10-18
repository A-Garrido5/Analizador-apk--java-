// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Set;

public final class fk extends fL
{
    private final aC b;
    
    public fk() {
        this.b = new aC();
    }
    
    public Set a() {
        return this.b.entrySet();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof fk && ((fk)o).b.equals(this.b));
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
}
