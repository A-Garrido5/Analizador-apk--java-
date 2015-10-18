// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;

class eF implements Iterator
{
    Iterator a;
    final bT b;
    
    eF(final bT b) {
        this.b = b;
        this.a = bT.a(this.b).iterator();
    }
    
    public String a() {
        return this.a.next();
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
        throw new UnsupportedOperationException();
    }
}
