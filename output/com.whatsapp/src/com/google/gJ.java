// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.AbstractList;

public class gJ extends AbstractList implements eQ, RandomAccess
{
    public static final eQ b;
    private final List a;
    
    static {
        b = new bT(new gJ());
    }
    
    public gJ() {
        this.a = new ArrayList();
    }
    
    public gJ(final eQ eq) {
        this.a = new ArrayList(eq.size());
        this.addAll(eq);
    }
    
    private String a(final Object o) {
        if (o instanceof String) {
            return (String)o;
        }
        return ((hv)o).i();
    }
    
    @Override
    public hv a(final int n) {
        final hv value = this.a.get(n);
        if (value instanceof String) {
            final hv b = hv.b((String)value);
            this.a.set(n, b);
            return b;
        }
        return value;
    }
    
    public String a(final int n) {
        final Object remove = this.a.remove(n);
        ++this.modCount;
        return this.a(remove);
    }
    
    public String a(final int n, final String s) {
        return this.a(this.a.set(n, s));
    }
    
    @Override
    public List a() {
        return Collections.unmodifiableList((List<?>)this.a);
    }
    
    @Override
    public void a(final hv hv) {
        this.a.add(hv);
        ++this.modCount;
    }
    
    @Override
    public void add(final int n, final Object o) {
        this.b(n, (String)o);
    }
    
    @Override
    public boolean addAll(final int n, Collection a) {
        if (a instanceof eQ) {
            a = ((eQ)a).a();
        }
        final boolean addAll = this.a.addAll(n, a);
        ++this.modCount;
        return addAll;
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        return this.addAll(this.size(), collection);
    }
    
    public String b(final int n) {
        final hv value = this.a.get(n);
        if (value instanceof String) {
            return (String)value;
        }
        final hv hv = value;
        final String i = hv.i();
        if (hv.b()) {
            this.a.set(n, i);
        }
        return i;
    }
    
    public void b(final int n, final String s) {
        this.a.add(n, s);
        ++this.modCount;
    }
    
    @Override
    public void clear() {
        this.a.clear();
        ++this.modCount;
    }
    
    @Override
    public Object get(final int n) {
        return this.b(n);
    }
    
    @Override
    public Object remove(final int n) {
        return this.a(n);
    }
    
    @Override
    public Object set(final int n, final Object o) {
        return this.a(n, (String)o);
    }
    
    @Override
    public int size() {
        return this.a.size();
    }
}
