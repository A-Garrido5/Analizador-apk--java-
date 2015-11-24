// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.AbstractSet;

final class hL extends AbstractSet
{
    final n a;
    
    hL(final n a) {
        this.a = a;
    }
    
    @Override
    public void clear() {
        this.a.clear();
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.a.containsKey(o);
    }
    
    @Override
    public Iterator iterator() {
        return new c7(this);
    }
    
    @Override
    public boolean remove(final Object o) {
        return this.a.a(o) != null;
    }
    
    @Override
    public int size() {
        return this.a.a;
    }
}
