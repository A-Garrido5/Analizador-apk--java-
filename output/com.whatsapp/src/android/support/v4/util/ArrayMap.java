// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class ArrayMap extends SimpleArrayMap implements Map
{
    MapCollections mCollections;
    
    private MapCollections getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new ArrayMap$1(this);
        }
        return this.mCollections;
    }
    
    @Override
    public Set entrySet() {
        return this.getCollection().getEntrySet();
    }
    
    @Override
    public Set keySet() {
        return this.getCollection().getKeySet();
    }
    
    @Override
    public void putAll(final Map map) {
        final int a = LruCache.a;
        this.ensureCapacity(this.mSize + map.size());
        for (final Entry<Object, V> entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
            if (a != 0) {
                break;
            }
        }
    }
    
    public boolean retainAll(final Collection collection) {
        return MapCollections.retainAllHelper(this, collection);
    }
    
    @Override
    public Collection values() {
        return this.getCollection().getValues();
    }
}
