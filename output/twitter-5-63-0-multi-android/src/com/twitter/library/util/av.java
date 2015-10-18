// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Map;
import java.util.Iterator;

class av implements Iterator
{
    final /* synthetic */ au a;
    private Iterator b;
    
    av(final au a) {
        this.a = a;
        this.b = this.a.a.iterator();
    }
    
    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public Object next() {
        return this.b.next().getKey();
    }
    
    @Override
    public void remove() {
        this.b.remove();
    }
}
