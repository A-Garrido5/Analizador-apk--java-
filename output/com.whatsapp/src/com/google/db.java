// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.AbstractSet;

final class db extends AbstractSet
{
    final aC a;
    
    db(final aC a) {
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
        return new bV(this);
    }
    
    @Override
    public boolean remove(final Object o) {
        return this.a.a(o) != null;
    }
    
    @Override
    public int size() {
        return this.a.f;
    }
}
