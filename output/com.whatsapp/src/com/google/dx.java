// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;
import java.util.Iterator;

class dx implements Iterator
{
    private Iterator a;
    
    public dx(final Iterator a) {
        this.a = a;
    }
    
    public Map.Entry a() {
        Map.Entry<?, ?> entry = this.a.next();
        if (entry.getValue() instanceof cQ) {
            entry = (Map.Entry<?, ?>)new f8((Map.Entry)entry, null);
        }
        return (Map.Entry)entry;
    }
    
    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }
    
    @Override
    public Object next() {
        return this.a();
    }
    
    @Override
    public void remove() {
        this.a.remove();
    }
}
