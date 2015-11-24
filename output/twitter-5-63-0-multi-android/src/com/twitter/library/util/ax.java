// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Map;
import java.util.Iterator;

class ax implements Iterator
{
    final /* synthetic */ aw a;
    private Iterator b;
    
    ax(final aw a) {
        this.a = a;
        this.b = this.a.a.iterator();
    }
    
    @Override
    public boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public Object next() {
        return this.b.next().getValue();
    }
    
    @Override
    public void remove() {
        this.b.remove();
    }
}
