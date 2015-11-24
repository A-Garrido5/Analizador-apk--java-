// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.util.Iterator;
import java.util.Collection;

final class MapCollections$ValuesCollection implements Collection
{
    final MapCollections this$0;
    
    MapCollections$ValuesCollection(final MapCollections this$0) {
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
        try {
            if (this.this$0.colIndexOfValue(o) >= 0) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return false;
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
        return new MapCollections$ArrayIterator(this.this$0, 1);
    }
    
    @Override
    public boolean remove(final Object o) {
        final int colIndexOfValue = this.this$0.colIndexOfValue(o);
        if (colIndexOfValue >= 0) {
            try {
                this.this$0.colRemoveAt(colIndexOfValue);
                return true;
            }
            catch (UnsupportedOperationException ex) {
                throw ex;
            }
        }
        return false;
    }
    
    @Override
    public boolean removeAll(final Collection collection) {
        int i = 0;
        final int a = LruCache.a;
        int colGetSize = this.this$0.colGetSize();
        boolean b = false;
        while (i < colGetSize) {
            if (collection.contains(this.this$0.colGetEntry(i, 1))) {
                this.this$0.colRemoveAt(i);
                final int n = i - 1;
                --colGetSize;
                i = n;
                b = true;
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
        return b;
    }
    
    @Override
    public boolean retainAll(final Collection collection) {
        int i = 0;
        final int a = LruCache.a;
        int colGetSize = this.this$0.colGetSize();
        boolean b = false;
        while (i < colGetSize) {
            if (!collection.contains(this.this$0.colGetEntry(i, 1))) {
                this.this$0.colRemoveAt(i);
                final int n = i - 1;
                --colGetSize;
                i = n;
                b = true;
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
        return b;
    }
    
    @Override
    public int size() {
        return this.this$0.colGetSize();
    }
    
    @Override
    public Object[] toArray() {
        return this.this$0.toArrayHelper(1);
    }
    
    @Override
    public Object[] toArray(final Object[] array) {
        return this.this$0.toArrayHelper(array, 1);
    }
}
