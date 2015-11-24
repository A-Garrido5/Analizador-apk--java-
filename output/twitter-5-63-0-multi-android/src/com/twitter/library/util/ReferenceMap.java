// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Iterator;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.lang.ref.ReferenceQueue;
import java.util.Map;

public class ReferenceMap implements Iterable
{
    private final Map a;
    private final ReferenceQueue b;
    private final ReferenceMap$ReferenceFactory c;
    private Iterable d;
    private Iterable e;
    private bc f;
    
    private ReferenceMap(final int n, final ReferenceMap$ReferenceFactory c) {
        this.b = new ReferenceQueue();
        this.a = new HashMap(n);
        this.c = c;
    }
    
    private ReferenceMap(final ReferenceMap$ReferenceFactory c) {
        this.b = new ReferenceQueue();
        this.a = new HashMap();
        this.c = c;
    }
    
    public static ReferenceMap a() {
        return new ReferenceMap(ReferenceMap$ReferenceFactory.a);
    }
    
    public static ReferenceMap a(final int n) {
        return new ReferenceMap(n, ReferenceMap$ReferenceFactory.a);
    }
    
    public static ReferenceMap b() {
        return new ReferenceMap(ReferenceMap$ReferenceFactory.b);
    }
    
    public Object a(final Object o) {
        final Reference<Object> reference = this.a.get(o);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }
    
    public Object a(final Object o, final Object o2) {
        this.e();
        if (o2 == null) {
            return this.c(o);
        }
        final Reference<Object> reference = this.a.put(o, this.c.a(o, o2, this.b));
        if (reference != null) {
            return reference.get();
        }
        return null;
    }
    
    public void a(final bc f) {
        this.f = f;
    }
    
    public Reference b(final Object o) {
        final Reference reference = this.a.get(o);
        if (reference != null && reference.get() != null) {
            return reference;
        }
        return null;
    }
    
    public Object c(final Object o) {
        this.e();
        final Reference<Object> reference = this.a.remove(o);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }
    
    public void c() {
        while (this.b.poll() != null) {}
        this.a.clear();
    }
    
    public int d() {
        return this.a.size();
    }
    
    public void e() {
        while (true) {
            final Reference poll = this.b.poll();
            if (poll == null) {
                break;
            }
            final Object a = ((az)poll).a();
            if (!poll.equals(this.a.get(a))) {
                continue;
            }
            this.a.remove(a);
            if (this.f == null) {
                continue;
            }
            this.f.a(a);
        }
    }
    
    public Map f() {
        this.e();
        final HashMap<Object, Object> hashMap = new HashMap<Object, Object>(this.a.size());
        for (final Map.Entry<Object, V> entry : this) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }
    
    public Iterable g() {
        if (this.d == null) {
            this.d = new au(this);
        }
        return this.d;
    }
    
    public Iterable h() {
        if (this.e == null) {
            this.e = new aw(this);
        }
        return this.e;
    }
    
    @Override
    public Iterator iterator() {
        return new ay(this);
    }
}
