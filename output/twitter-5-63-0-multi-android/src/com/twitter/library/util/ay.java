// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.HashMap;
import java.lang.ref.ReferenceQueue;
import java.util.NoSuchElementException;
import java.util.AbstractMap;
import java.lang.ref.Reference;
import java.util.Map;
import java.util.Iterator;

class ay implements Iterator
{
    final /* synthetic */ ReferenceMap a;
    private final Iterator b;
    private Map.Entry c;
    
    public ay(final ReferenceMap a) {
        this.a = a;
        this.b = this.a.a.entrySet().iterator();
        this.b();
    }
    
    private void b() {
        this.c = null;
        while (this.c == null && this.b.hasNext()) {
            final Map.Entry<K, Reference> entry = this.b.next();
            final Object value = entry.getValue().get();
            if (value != null) {
                this.c = (Map.Entry)new AbstractMap.SimpleImmutableEntry(entry.getKey(), value);
            }
        }
    }
    
    public Map.Entry a() {
        if (this.c == null) {
            throw new NoSuchElementException();
        }
        final Map.Entry c = this.c;
        this.b();
        return c;
    }
    
    @Override
    public boolean hasNext() {
        return this.c != null;
    }
    
    @Override
    public void remove() {
        this.b.remove();
    }
}
