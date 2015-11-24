// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.AbstractList;

public class bT extends AbstractList implements eQ, RandomAccess
{
    private final eQ a;
    
    public bT(final eQ a) {
        this.a = a;
    }
    
    static eQ a(final bT bt) {
        return bt.a;
    }
    
    @Override
    public hv a(final int n) {
        return this.a.a(n);
    }
    
    public String a(final int n) {
        return this.a.get(n);
    }
    
    @Override
    public List a() {
        return this.a.a();
    }
    
    @Override
    public void a(final hv hv) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Object get(final int n) {
        return this.a(n);
    }
    
    @Override
    public Iterator iterator() {
        return new eF(this);
    }
    
    @Override
    public ListIterator listIterator(final int n) {
        return new B(this, n);
    }
    
    @Override
    public int size() {
        return this.a.size();
    }
}
