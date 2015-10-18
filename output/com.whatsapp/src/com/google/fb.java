// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public final class fb extends fL implements Iterable
{
    private final List b;
    
    public fb() {
        this.b = new ArrayList();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof fb && ((fb)o).b.equals(this.b));
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public Iterator iterator() {
        return this.b.iterator();
    }
}
