// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.util.Iterator;
import java.util.Collection;
import java.util.Set;

final class MapCollections$KeySet implements Set
{
    final /* synthetic */ MapCollections this$0;
    
    MapCollections$KeySet(final MapCollections this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public boolean add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void clear() {
        this.this$0.colClear();
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.this$0.colIndexOfKey(o) >= 0;
    }
    
    @Override
    public boolean containsAll(final Collection collection) {
        return MapCollections.containsAllHelper(this.this$0.colGetMap(), collection);
    }
    
    @Override
    public boolean equals(final Object o) {
        return MapCollections.equalsSetHelper(this, o);
    }
    
    @Override
    public int hashCode() {
        int i = -1 + this.this$0.colGetSize();
        int n = 0;
        while (i >= 0) {
            final Object colGetEntry = this.this$0.colGetEntry(i, 0);
            int hashCode;
            if (colGetEntry == null) {
                hashCode = 0;
            }
            else {
                hashCode = colGetEntry.hashCode();
            }
            n += hashCode;
            --i;
        }
        return n;
    }
    
    @Override
    public boolean isEmpty() {
        return this.this$0.colGetSize() == 0;
    }
    
    @Override
    public Iterator iterator() {
        return new MapCollections$ArrayIterator(this.this$0, 0);
    }
    
    @Override
    public boolean remove(final Object o) {
        final int colIndexOfKey = this.this$0.colIndexOfKey(o);
        if (colIndexOfKey >= 0) {
            this.this$0.colRemoveAt(colIndexOfKey);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean removeAll(final Collection collection) {
        return MapCollections.removeAllHelper(this.this$0.colGetMap(), collection);
    }
    
    @Override
    public boolean retainAll(final Collection collection) {
        return MapCollections.retainAllHelper(this.this$0.colGetMap(), collection);
    }
    
    @Override
    public int size() {
        return this.this$0.colGetSize();
    }
    
    @Override
    public Object[] toArray() {
        return this.this$0.toArrayHelper(0);
    }
    
    @Override
    public Object[] toArray(final Object[] array) {
        return this.this$0.toArrayHelper(array, 0);
    }
}
