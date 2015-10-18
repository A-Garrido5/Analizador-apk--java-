// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import android.support.v4.util.LruCache;

public class x implements ak
{
    protected final LruCache a;
    protected final ReferenceMap b;
    private final ab c;
    
    public x(int n, final ab c) {
        this.b = ReferenceMap.b();
        this.c = c;
        if (n <= 0) {
            n = 1;
        }
        this.a = new y(this, n);
    }
    
    @Override
    public Object a(final Object o) {
        if (o == null) {
            return null;
        }
        while (true) {
            synchronized (this) {
                final Object o2 = this.a.remove(o);
                if (o2 != null) {
                    return o2;
                }
            }
            return this.b.c(o);
        }
    }
    
    @Override
    public Object a(final Object o, final Object o2) {
        if (o == null || o2 == null) {
            return null;
        }
        while (true) {
            synchronized (this) {
                if (this.c(o2) <= this.a.maxSize()) {
                    break;
                }
                final Object o3 = this.b.a(o, o2);
                if (o3 != null) {
                    return o3;
                }
            }
            return this.a.remove(o);
        }
        Object o4 = this.a.put(o, o2);
        if (o4 == null && this.a.size() != 0) {
            o4 = this.b.c(o);
        }
        // monitorexit(this)
        return o4;
    }
    
    @Override
    public void a() {
        synchronized (this) {
            this.a.evictAll();
            this.b.c();
        }
    }
    
    public void a(final aa aa) {
        this.b.a(aa);
    }
    
    @Override
    public Object b(final Object o) {
        if (o == null) {
            return null;
        }
        synchronized (this) {
            Object o2 = this.a.get(o);
            if (o2 == null) {
                o2 = this.b.c(o);
                if (o2 != null) {
                    this.a.put(o, o2);
                }
            }
            return o2;
        }
    }
    
    @Override
    public Collection b() {
        final Collection<?> values = (Collection<?>)this.a.snapshot().values();
        final ArrayList list = new ArrayList<Object>(values.size() + this.b.d());
        list.addAll(values);
        final Iterator<Object> iterator = (Iterator<Object>)this.b.h().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }
    
    protected int c(final Object o) {
        if (o == null) {
            return 0;
        }
        if (this.c != null) {
            return this.c.b(o);
        }
        return 1;
    }
}
