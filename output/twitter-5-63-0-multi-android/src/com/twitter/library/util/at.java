// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.List;
import java.lang.ref.Reference;
import java.util.Iterator;

class at implements Iterator
{
    final /* synthetic */ ReferenceList a;
    private int b;
    
    private at(final ReferenceList a) {
        this.a = a;
        this.b = -1;
    }
    
    @Override
    public boolean hasNext() {
        // monitorexit(list)
        Label_0081: {
            Label_0077: {
                synchronized (this.a.a) {
                    final int i = 1 + this.b;
                    while (i < this.a.a.size()) {
                        if (((Reference)this.a.a.get(i)).get() != null) {
                            break Label_0077;
                        }
                        this.a.a.remove(i);
                    }
                    break Label_0081;
                }
            }
            return true;
        }
        // monitorexit(list)
        return false;
    }
    
    @Override
    public Object next() {
        synchronized (this.a.a) {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
        }
        ++this.b;
        // monitorexit(list)
        return this.a.a.get(this.b).get();
    }
    
    @Override
    public void remove() {
        synchronized (this.a.a) {
            if (this.b == -1) {
                throw new NoSuchElementException();
            }
        }
        this.a.a.remove(this.b);
    }
    // monitorexit(list)
}
