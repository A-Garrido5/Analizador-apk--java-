// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.collection;

import java.util.Collection;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class a implements Map
{
    private final Map a;
    private final Map b;
    
    public a() {
        this(0);
    }
    
    public a(final int n) {
        HashMap a;
        if (n > 0) {
            a = new HashMap(n);
        }
        else {
            a = new HashMap();
        }
        this.a = a;
        HashMap b;
        if (n > 0) {
            b = new HashMap(n);
        }
        else {
            b = new HashMap();
        }
        this.b = b;
    }
    
    public a(final Map map) {
        this(map.size());
        for (final Entry<Object, V> entry : map.entrySet()) {
            this.a.put(entry.getKey(), entry.getValue());
            this.b.put(entry.getValue(), entry.getKey());
        }
    }
    
    public a(final Entry[] array) {
        this(array.length);
        for (final Entry entry : array) {
            this.a.put(entry.getKey(), entry.getValue());
            this.b.put(entry.getValue(), entry.getKey());
        }
    }
    
    public Object a(final Object o) {
        return this.b.get(o);
    }
    
    @Override
    public void clear() {
        this.a.clear();
        this.b.clear();
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.a.containsKey(o);
    }
    
    @Override
    public boolean containsValue(final Object o) {
        return this.b.containsKey(o);
    }
    
    @Override
    public Set entrySet() {
        return this.a.entrySet();
    }
    
    @Override
    public Object get(final Object o) {
        return this.a.get(o);
    }
    
    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public Set keySet() {
        return this.a.keySet();
    }
    
    @Override
    public Object put(final Object o, final Object o2) {
        final Object put = this.a.put(o, o2);
        if (put != null) {
            this.b.remove(put);
        }
        this.b.put(o2, o);
        return o2;
    }
    
    @Override
    public void putAll(final Map map) {
        for (final Entry<Object, V> entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }
    
    @Override
    public Object remove(final Object o) {
        final Object remove = this.a.remove(o);
        if (remove != null) {
            this.b.remove(remove);
        }
        return remove;
    }
    
    @Override
    public int size() {
        return this.a.size();
    }
    
    @Override
    public Collection values() {
        return this.a.values();
    }
}
