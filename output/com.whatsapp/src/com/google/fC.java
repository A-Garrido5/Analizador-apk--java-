// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.NoSuchElementException;
import java.util.Iterator;

final class fC implements Iterator
{
    @Override
    public boolean hasNext() {
        return false;
    }
    
    @Override
    public Object next() {
        throw new NoSuchElementException();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
