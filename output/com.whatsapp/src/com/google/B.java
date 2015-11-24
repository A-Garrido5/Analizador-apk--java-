// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.ListIterator;

class B implements ListIterator
{
    final bT a;
    final int b;
    ListIterator c;
    
    B(final bT a, final int b) {
        this.a = a;
        this.b = b;
        this.c = bT.a(this.a).listIterator(this.b);
    }
    
    public String a() {
        return this.c.previous();
    }
    
    public void a(final String s) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void add(final Object o) {
        this.a((String)o);
    }
    
    public String b() {
        return this.c.next();
    }
    
    public void b(final String s) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean hasNext() {
        return this.c.hasNext();
    }
    
    @Override
    public boolean hasPrevious() {
        return this.c.hasPrevious();
    }
    
    @Override
    public Object next() {
        return this.b();
    }
    
    @Override
    public int nextIndex() {
        return this.c.nextIndex();
    }
    
    @Override
    public Object previous() {
        return this.a();
    }
    
    @Override
    public int previousIndex() {
        return this.c.previousIndex();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void set(final Object o) {
        this.b((String)o);
    }
}
