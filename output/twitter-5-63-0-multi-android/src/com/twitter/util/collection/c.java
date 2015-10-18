// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.collection;

import java.util.Arrays;
import java.util.AbstractCollection;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class c implements Iterator
{
    final /* synthetic */ b a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    
    c(final b a) {
        this.a = a;
        this.b = this.a.e;
        this.c = this.a.b;
        this.d = -1;
        this.e = this.a.d;
    }
    
    private void a() {
        if (this.b != this.a.e) {
            throw new ConcurrentModificationException();
        }
    }
    
    @Override
    public boolean hasNext() {
        this.a();
        return this.e || this.c != this.a.c;
    }
    
    @Override
    public Object next() {
        this.a();
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.e = false;
        this.d = this.c;
        ++this.c;
        if (this.c >= this.a.a.length) {
            this.c = 0;
        }
        return this.a.a[this.d];
    }
    
    @Override
    public void remove() {
        this.a();
        if (this.d == -1) {
            throw new IllegalStateException("next() must be called before each call to remove()");
        }
        if (this.d == this.a.b) {
            this.a.b();
            this.d = -1;
            ++this.b;
            return;
        }
        int i = 1 + this.d;
        if (this.a.b < this.d && i < this.a.c) {
            System.arraycopy(this.a.a, i, this.a.a, this.d, this.a.c - i);
        }
        else {
            while (i != this.a.c) {
                if (i >= this.a.a.length) {
                    this.a.a[i - 1] = this.a.a[0];
                    i = 0;
                }
                else {
                    int n = i - 1;
                    if (n < 0) {
                        n = -1 + this.a.a.length;
                    }
                    this.a.a[n] = this.a.a[i];
                    if (++i < this.a.a.length) {
                        continue;
                    }
                    i = 0;
                }
            }
        }
        this.d = -1;
        this.a.c--;
        if (this.a.c < 0) {
            this.a.c = -1 + this.a.a.length;
        }
        this.a.d = false;
        --this.c;
        if (this.c < 0) {
            this.c = -1 + this.a.a.length;
        }
        this.a.e++;
        ++this.b;
    }
}
