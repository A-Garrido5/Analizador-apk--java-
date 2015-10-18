// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.mdat;

import java.util.Iterator;
import java.util.Set;
import java.util.Comparator;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

public class DummyMap<K, V> implements Map<K, V>
{
    HashSet<K> keys;
    V value;
    
    public DummyMap(final V value) {
        this.keys = new HashSet<K>();
        this.value = value;
    }
    
    public void addKeys(final K[] array) {
        Collections.addAll(this.keys, array);
    }
    
    @Override
    public void clear() {
        this.keys.clear();
    }
    
    public Comparator<? super K> comparator() {
        return null;
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.keys.contains(o);
    }
    
    @Override
    public boolean containsValue(final Object o) {
        return this.value == o;
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public V get(final Object o) {
        if (this.keys.contains(o)) {
            return this.value;
        }
        return null;
    }
    
    @Override
    public boolean isEmpty() {
        return this.keys.isEmpty();
    }
    
    @Override
    public Set<K> keySet() {
        return this.keys;
    }
    
    @Override
    public V put(final K k, final V v) {
        assert this.value == v;
        this.keys.add(k);
        return this.value;
    }
    
    @Override
    public void putAll(final Map<? extends K, ? extends V> map) {
        for (final K k : map.keySet()) {
            assert map.get(k) == this.value;
            this.keys.add(k);
        }
    }
    
    @Override
    public V remove(final Object o) {
        final V value = this.get(o);
        this.keys.remove(o);
        return value;
    }
    
    @Override
    public int size() {
        return this.keys.size();
    }
    
    @Override
    public Collection<V> values() {
        throw new UnsupportedOperationException();
    }
}
