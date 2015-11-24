// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.Iterator;

class w implements Iterator
{
    private final Stack a;
    private hj b;
    
    private w(final hv hv) {
        this.a = new Stack();
        this.b = this.a(hv);
    }
    
    w(final hv hv, final gv gv) {
        this(hv);
    }
    
    private hj a(final hv hv) {
        final boolean b = dt.b;
        hv b2 = hv;
        while (b2 instanceof hu) {
            final hu hu = (hu)b2;
            this.a.push(hu);
            b2 = com.google.hu.b(hu);
            if (b) {
                break;
            }
        }
        return (hj)b2;
    }
    
    private hj b() {
        while (true) {
            try {
                if (this.a.isEmpty()) {
                    return null;
                }
            }
            catch (NoSuchElementException ex) {
                throw ex;
            }
            final hj a = this.a(hu.a(this.a.pop()));
            try {
                if (!a.d()) {
                    return a;
                }
                continue;
            }
            catch (NoSuchElementException ex2) {
                throw ex2;
            }
        }
    }
    
    public hj a() {
        try {
            if (this.b == null) {
                throw new NoSuchElementException();
            }
        }
        catch (NoSuchElementException ex) {
            throw ex;
        }
        final hj b = this.b;
        this.b = this.b();
        return b;
    }
    
    @Override
    public boolean hasNext() {
        try {
            if (this.b != null) {
                return true;
            }
        }
        catch (NoSuchElementException ex) {
            throw ex;
        }
        return false;
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
