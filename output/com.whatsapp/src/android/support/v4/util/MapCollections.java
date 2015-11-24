// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.lang.reflect.Array;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;

abstract class MapCollections
{
    MapCollections$EntrySet mEntrySet;
    MapCollections$KeySet mKeySet;
    MapCollections$ValuesCollection mValues;
    
    public static boolean containsAllHelper(final Map map, final Collection collection) {
        final Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!map.containsKey(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean equalsSetHelper(final Set set, final Object o) {
        final boolean b = true;
        boolean b2;
        if (set == o) {
            b2 = b;
        }
        else {
            final boolean b3 = o instanceof Set;
            b2 = false;
            if (b3) {
                final Set set2 = (Set)o;
                try {
                    try {
                        if (set.size() == set2.size() && set.containsAll(set2)) {
                            return b;
                        }
                        goto Label_0078;
                    }
                    catch (NullPointerException ex) {
                        try {
                            throw ex;
                        }
                        catch (NullPointerException ex2) {
                            try {
                                throw ex2;
                            }
                            catch (NullPointerException ex3) {
                                return false;
                            }
                            catch (ClassCastException ex4) {
                                return false;
                            }
                        }
                    }
                }
                catch (ClassCastException ex5) {}
            }
        }
        return b2;
    }
    
    public static boolean removeAllHelper(final Map map, final Collection collection) {
        final int a = LruCache.a;
        final int size = map.size();
        final Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            map.remove(iterator.next());
            if (a != 0) {
                break;
            }
        }
        try {
            if (size != map.size()) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    public static boolean retainAllHelper(final Map map, final Collection collection) {
        final int a = LruCache.a;
        final int size = map.size();
        final Iterator<Object> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) {
                iterator.remove();
                if (a != 0) {
                    break;
                }
                continue;
            }
        }
        try {
            if (size != map.size()) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    protected abstract void colClear();
    
    protected abstract Object colGetEntry(final int p0, final int p1);
    
    protected abstract Map colGetMap();
    
    protected abstract int colGetSize();
    
    protected abstract int colIndexOfKey(final Object p0);
    
    protected abstract int colIndexOfValue(final Object p0);
    
    protected abstract void colPut(final Object p0, final Object p1);
    
    protected abstract void colRemoveAt(final int p0);
    
    protected abstract Object colSetValue(final int p0, final Object p1);
    
    public Set getEntrySet() {
        try {
            if (this.mEntrySet == null) {
                this.mEntrySet = new MapCollections$EntrySet(this);
            }
            return this.mEntrySet;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public Set getKeySet() {
        try {
            if (this.mKeySet == null) {
                this.mKeySet = new MapCollections$KeySet(this);
            }
            return this.mKeySet;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public Collection getValues() {
        try {
            if (this.mValues == null) {
                this.mValues = new MapCollections$ValuesCollection(this);
            }
            return this.mValues;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public Object[] toArrayHelper(final int n) {
        final int a = LruCache.a;
        final int colGetSize = this.colGetSize();
        final Object[] array = new Object[colGetSize];
        int i = 0;
        while (i < colGetSize) {
            array[i] = this.colGetEntry(i, n);
            ++i;
            if (a != 0) {
                break;
            }
        }
        return array;
    }
    
    public Object[] toArrayHelper(final Object[] array, final int n) {
        final int a = LruCache.a;
        final int colGetSize = this.colGetSize();
        while (true) {
            Label_0088: {
                if (array.length >= colGetSize) {
                    break Label_0088;
                }
                final Object[] array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), colGetSize);
                int i = 0;
                while (i < colGetSize) {
                    array2[i] = this.colGetEntry(i, n);
                    ++i;
                    if (a != 0) {
                        break;
                    }
                }
                try {
                    if (array2.length > colGetSize) {
                        array2[colGetSize] = null;
                    }
                    return array2;
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
            final Object[] array2 = array;
            continue;
        }
    }
}
