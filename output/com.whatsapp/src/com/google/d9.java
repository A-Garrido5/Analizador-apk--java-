// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.Map;
import java.util.AbstractSet;

class d9 extends AbstractSet
{
    final aC a;
    
    d9(final aC a) {
        this.a = a;
    }
    
    @Override
    public void clear() {
        this.a.clear();
    }
    
    @Override
    public boolean contains(final Object o) {
        return o instanceof Map.Entry && this.a.a((Map.Entry)o) != null;
    }
    
    @Override
    public Iterator iterator() {
        return new bU(this);
    }
    
    @Override
    public boolean remove(final Object o) {
        if (o instanceof Map.Entry) {
            final h a = this.a.a((Map.Entry)o);
            if (a != null) {
                this.a.b(a, true);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int size() {
        return this.a.f;
    }
}
