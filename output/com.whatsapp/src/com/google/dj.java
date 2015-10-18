// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.NoSuchElementException;

class dj implements hb
{
    private int a;
    final hj b;
    private final int c;
    
    private dj(final hj b) {
        this.b = b;
        this.a = 0;
        this.c = b.c();
    }
    
    dj(final hj hj, final k k) {
        this(hj);
    }
    
    @Override
    public byte a() {
        try {
            return this.b.c[this.a++];
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw new NoSuchElementException(ex.getMessage());
        }
    }
    
    @Override
    public Byte a() {
        return this.a();
    }
    
    @Override
    public boolean hasNext() {
        try {
            if (this.a < this.c) {
                return true;
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
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
