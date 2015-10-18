// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.Map;
import java.util.AbstractSet;

class H extends AbstractSet
{
    final gh a;
    
    private H(final gh a) {
        this.a = a;
    }
    
    H(final gh gh, final gD gd) {
        this(gh);
    }
    
    public boolean a(final Map.Entry entry) {
        if (!this.contains(entry)) {
            this.a.a(entry.getKey(), entry.getValue());
            return true;
        }
        return false;
    }
    
    @Override
    public boolean add(final Object o) {
        return this.a((Map.Entry)o);
    }
    
    @Override
    public void clear() {
        this.a.clear();
    }
    
    @Override
    public boolean contains(final Object o) {
        final Map.Entry entry = (Map.Entry)o;
        final Object value = this.a.get(entry.getKey());
        final Object value2 = entry.getValue();
        return value == value2 || (value != null && value.equals(value2));
    }
    
    @Override
    public Iterator iterator() {
        return new bn(this.a, null);
    }
    
    @Override
    public boolean remove(final Object o) {
        final Map.Entry entry = (Map.Entry)o;
        if (this.contains(entry)) {
            this.a.remove(entry.getKey());
            return true;
        }
        return false;
    }
    
    @Override
    public int size() {
        return this.a.size();
    }
}
