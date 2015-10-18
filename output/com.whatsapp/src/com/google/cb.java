// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.List;
import java.util.AbstractList;

class cb extends AbstractList implements List
{
    b8 a;
    
    public dS a(final int n) {
        return this.a.a(n);
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
