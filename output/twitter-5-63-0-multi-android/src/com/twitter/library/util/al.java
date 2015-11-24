// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.List;
import java.util.Iterator;

public class al implements Iterator
{
    private final int a;
    private final List b;
    private int c;
    
    public al(final int a, final List b) {
        this.a = a;
        this.b = b;
        this.c = 0;
    }
    
    public List a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        final int n = this.c * this.a;
        final int min = Math.min(n + this.a, this.b.size());
        ++this.c;
        return Collections.unmodifiableList((List<?>)this.b.subList(n, min));
    }
    
    @Override
    public boolean hasNext() {
        return this.c * this.a < this.b.size();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
