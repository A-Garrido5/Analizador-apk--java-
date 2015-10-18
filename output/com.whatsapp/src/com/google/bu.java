// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.Iterator;

abstract class bu implements Iterator
{
    int a;
    h b;
    final aC c;
    h d;
    
    private bu(final aC c) {
        this.c = c;
        this.d = this.c.i.d;
        this.b = null;
        this.a = this.c.h;
    }
    
    bu(final aC ac, final dT dt) {
        this(ac);
    }
    
    final h a() {
        final h d = this.d;
        try {
            if (d == this.c.i) {
                throw new NoSuchElementException();
            }
        }
        catch (NoSuchElementException ex) {
            throw ex;
        }
        try {
            if (this.c.h != this.a) {
                throw new ConcurrentModificationException();
            }
        }
        catch (NoSuchElementException ex2) {
            throw ex2;
        }
        this.d = d.d;
        return this.b = d;
    }
    
    @Override
    public final boolean hasNext() {
        try {
            if (this.d != this.c.i) {
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
            if (this.b == null) {
                throw new IllegalStateException();
            }
        }
        catch (NoSuchElementException ex) {
            throw ex;
        }
        this.c.b(this.b, true);
        this.b = null;
        this.a = this.c.h;
    }
}
