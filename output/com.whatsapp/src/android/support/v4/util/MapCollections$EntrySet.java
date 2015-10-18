// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class MapCollections$EntrySet implements Set
{
    final MapCollections this$0;
    
    MapCollections$EntrySet(final MapCollections this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public boolean add(final Object o) {
        return this.add((Map.Entry)o);
    }
    
    public boolean add(final Map.Entry entry) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        final int a = LruCache.a;
        final int colGetSize = this.this$0.colGetSize();
        for (final Map.Entry<Object, V> entry : collection) {
            this.this$0.colPut(entry.getKey(), entry.getValue());
            if (a != 0) {
                break;
            }
        }
        try {
            if (colGetSize != this.this$0.colGetSize()) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public void clear() {
        this.this$0.colClear();
    }
    
    @Override
    public boolean contains(final Object o) {
        Map.Entry entry;
        int colIndexOfKey;
        while (true) {
            try {
                if (!(o instanceof Map.Entry)) {
                    return false;
                }
            }
            catch (UnsupportedOperationException ex) {
                throw ex;
            }
            entry = (Map.Entry)o;
            colIndexOfKey = this.this$0.colIndexOfKey(entry.getKey());
            if (colIndexOfKey >= 0) {
                break;
            }
            return false;
        }
        return ContainerHelpers.equal(this.this$0.colGetEntry(colIndexOfKey, 1), entry.getValue());
    }
    
    @Override
    public boolean containsAll(final Collection collection) {
        final Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean equals(final Object o) {
        return MapCollections.equalsSetHelper(this, o);
    }
    
    @Override
    public int hashCode() {
        final int a = LruCache.a;
        int i = -1 + this.this$0.colGetSize();
        int n = 0;
        while (i >= 0) {
            final Object colGetEntry = this.this$0.colGetEntry(i, 0);
            final Object colGetEntry2 = this.this$0.colGetEntry(i, 1);
            int hashCode;
            if (colGetEntry == null) {
                hashCode = 0;
            }
            else {
                hashCode = colGetEntry.hashCode();
            }
            int hashCode2;
            if (colGetEntry2 == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = colGetEntry2.hashCode();
            }
            n += (hashCode2 ^ hashCode);
            final int n2 = i - 1;
            if (a != 0) {
                break;
            }
            i = n2;
        }
        return n;
    }
    
    @Override
    public boolean isEmpty() {
        try {
            if (this.this$0.colGetSize() == 0) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public Iterator iterator() {
        return new MapCollections$MapIterator(this.this$0);
    }
    
    @Override
    public boolean remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public int size() {
        return this.this$0.colGetSize();
    }
    
    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Object[] toArray(final Object[] array) {
        throw new UnsupportedOperationException();
    }
}
