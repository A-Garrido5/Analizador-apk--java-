// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.List;
import java.util.AbstractList;

class G extends AbstractList implements List
{
    b8 a;
    
    public fp a(final int n) {
        return this.a.b(n);
    }
    
    void a() {
        ++this.modCount;
    }
    
    @Override
    public Object get(final int n) {
        return this.a(n);
    }
    
    @Override
    public int size() {
        return this.a.a();
    }
}
