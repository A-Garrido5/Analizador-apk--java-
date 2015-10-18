// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.collection;

import java.util.Iterator;
import java.util.Arrays;
import java.util.AbstractCollection;

public class b extends AbstractCollection
{
    private transient Object[] a;
    private transient int b;
    private transient int c;
    private transient boolean d;
    private transient int e;
    
    public b(final int n) {
        this.b = 0;
        this.c = 0;
        this.d = false;
        this.e = 0;
        if (n <= 0) {
            throw new IllegalArgumentException("Size must be greater than zero.");
        }
        this.a = new Object[n];
    }
    
    public Object a() {
        return this.a[this.b];
    }
    
    @Override
    public boolean add(final Object o) {
        if (o == null) {
            return false;
        }
        if (this.d) {
            if (this.b() != null) {
                ++this.e;
            }
        }
        else {
            ++this.e;
        }
        this.a[this.c++] = o;
        if (this.c >= this.a.length) {
            this.c = 0;
        }
        if (this.c == this.b) {
            this.d = true;
        }
        return true;
    }
    
    public Object b() {
        if (this.size() == 0) {
            return null;
        }
        final Object o = this.a[this.b];
        if (o != null) {
            this.a[this.b++] = null;
            if (this.b >= this.a.length) {
                this.b = 0;
            }
            this.d = false;
        }
        return o;
    }
    
    @Override
    public void clear() {
        this.d = false;
        this.b = 0;
        this.c = 0;
        Arrays.fill(this.a, null);
    }
    
    @Override
    public Iterator iterator() {
        return new c(this);
    }
    
    @Override
    public int size() {
        if (this.c < this.b) {
            return this.a.length - this.b + this.c;
        }
        if (this.c != this.b) {
            return this.c - this.b;
        }
        if (this.d) {
            return this.a.length;
        }
        return 0;
    }
}
