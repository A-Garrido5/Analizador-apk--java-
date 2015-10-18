// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.Iterator;

abstract class cI implements Iterator
{
    int a;
    gz b;
    gz c;
    final n d;
    
    private cI(final n d) {
        this.d = d;
        this.b = this.d.i.i;
        this.c = null;
        this.a = this.d.k;
    }
    
    cI(final n n, final bi bi) {
        this(n);
    }
    
    final gz a() {
        final gz b = this.b;
        try {
            if (b == this.d.i) {
                throw new NoSuchElementException();
            }
        }
        catch (NoSuchElementException ex) {
            throw ex;
        }
        try {
            if (this.d.k != this.a) {
                throw new ConcurrentModificationException();
            }
        }
        catch (NoSuchElementException ex2) {
            throw ex2;
        }
        this.b = b.i;
        return this.c = b;
    }
    
    @Override
    public final boolean hasNext() {
        try {
            if (this.b != this.d.i) {
                return true;
            }
        }
        catch (NoSuchElementException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public final void remove() {
        try {
            if (this.c == null) {
                throw new IllegalStateException();
            }
        }
        catch (NoSuchElementException ex) {
            throw ex;
        }
        this.d.a(this.c, true);
        this.c = null;
        this.a = this.d.k;
    }
}
