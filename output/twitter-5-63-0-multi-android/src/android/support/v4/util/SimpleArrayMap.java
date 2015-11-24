// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.util.Map;

public class SimpleArrayMap
{
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArrayMap";
    static Object[] mBaseCache;
    static int mBaseCacheSize;
    static Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    Object[] mArray;
    int[] mHashes;
    int mSize;
    
    public SimpleArrayMap() {
        this.mHashes = ContainerHelpers.EMPTY_INTS;
        this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        this.mSize = 0;
    }
    
    public SimpleArrayMap(final int n) {
        if (n == 0) {
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        }
        else {
            this.allocArrays(n);
        }
        this.mSize = 0;
    }
    
    public SimpleArrayMap(final SimpleArrayMap simpleArrayMap) {
        this();
        if (simpleArrayMap != null) {
            this.putAll(simpleArrayMap);
        }
    }
    
    private void allocArrays(final int n) {
        while (true) {
            Label_0104: {
                if (n != 8) {
                    break Label_0104;
                }
                synchronized (ArrayMap.class) {
                    if (SimpleArrayMap.mTwiceBaseCache != null) {
                        final Object[] mTwiceBaseCache = SimpleArrayMap.mTwiceBaseCache;
                        this.mArray = mTwiceBaseCache;
                        SimpleArrayMap.mTwiceBaseCache = (Object[])mTwiceBaseCache[0];
                        this.mHashes = (int[])mTwiceBaseCache[1];
                        mTwiceBaseCache[0] = (mTwiceBaseCache[1] = null);
                        --SimpleArrayMap.mTwiceBaseCacheSize;
                        return;
                    }
                    // monitorexit(ArrayMap.class)
                    this.mHashes = new int[n];
                    this.mArray = new Object[n << 1];
                    return;
                }
            }
            if (n == 4) {
                synchronized (ArrayMap.class) {
                    if (SimpleArrayMap.mBaseCache != null) {
                        final Object[] mBaseCache = SimpleArrayMap.mBaseCache;
                        this.mArray = mBaseCache;
                        SimpleArrayMap.mBaseCache = (Object[])mBaseCache[0];
                        this.mHashes = (int[])mBaseCache[1];
                        mBaseCache[0] = (mBaseCache[1] = null);
                        --SimpleArrayMap.mBaseCacheSize;
                        return;
                    }
                }
                // monitorexit(ArrayMap.class)
                continue;
            }
            continue;
        }
    }
    
    private static void freeArrays(final int[] array, final Object[] array2, final int n) {
        if (array.length == 8) {
            synchronized (ArrayMap.class) {
                if (SimpleArrayMap.mTwiceBaseCacheSize < 10) {
                    array2[0] = SimpleArrayMap.mTwiceBaseCache;
                    array2[1] = array;
                    for (int i = -1 + (n << 1); i >= 2; --i) {
                        array2[i] = null;
                    }
                    SimpleArrayMap.mTwiceBaseCache = array2;
                    ++SimpleArrayMap.mTwiceBaseCacheSize;
                }
                return;
            }
        }
        if (array.length == 4) {
            synchronized (ArrayMap.class) {
                if (SimpleArrayMap.mBaseCacheSize < 10) {
                    array2[0] = SimpleArrayMap.mBaseCache;
                    array2[1] = array;
                    for (int j = -1 + (n << 1); j >= 2; --j) {
                        array2[j] = null;
                    }
                    SimpleArrayMap.mBaseCache = array2;
                    ++SimpleArrayMap.mBaseCacheSize;
                }
            }
        }
    }
    
    public void clear() {
        if (this.mSize != 0) {
            freeArrays(this.mHashes, this.mArray, this.mSize);
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
        }
    }
    
    public boolean containsKey(final Object o) {
        return this.indexOfKey(o) >= 0;
    }
    
    public boolean containsValue(final Object o) {
        return this.indexOfValue(o) >= 0;
    }
    
    public void ensureCapacity(final int n) {
        if (this.mHashes.length < n) {
            final int[] mHashes = this.mHashes;
            final Object[] mArray = this.mArray;
            this.allocArrays(n);
            if (this.mSize > 0) {
                System.arraycopy(mHashes, 0, this.mHashes, 0, this.mSize);
                System.arraycopy(mArray, 0, this.mArray, 0, this.mSize << 1);
            }
            freeArrays(mHashes, mArray, this.mSize);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof Map) {
                final Map map = (Map)o;
                if (this.size() != map.size()) {
                    return false;
                }
                int i = 0;
                try {
                    while (i < this.mSize) {
                        final Object key = this.keyAt(i);
                        final Object value = this.valueAt(i);
                        final Object value2 = map.get(key);
                        if (value == null) {
                            if (value2 != null || !map.containsKey(key)) {
                                return false;
                            }
                        }
                        else if (!value.equals(value2)) {
                            return false;
                        }
                        ++i;
                    }
                    return true;
                }
                catch (NullPointerException ex) {
                    return false;
                }
                catch (ClassCastException ex2) {
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }
    
    public Object get(final Object o) {
        final int indexOfKey = this.indexOfKey(o);
        if (indexOfKey >= 0) {
            return this.mArray[1 + (indexOfKey << 1)];
        }
        return null;
    }
    
    @Override
    public int hashCode() {
        final int[] mHashes = this.mHashes;
        final Object[] mArray = this.mArray;
        final int mSize = this.mSize;
        int n = 1;
        int i = 0;
        int n2 = 0;
        while (i < mSize) {
            final Object o = mArray[n];
            final int n3 = mHashes[i];
            int hashCode;
            if (o == null) {
                hashCode = 0;
            }
            else {
                hashCode = o.hashCode();
            }
            n2 += (hashCode ^ n3);
            ++i;
            n += 2;
        }
        return n2;
    }
    
    int indexOf(final Object o, final int n) {
        final int mSize = this.mSize;
        int binarySearch;
        if (mSize == 0) {
            binarySearch = -1;
        }
        else {
            binarySearch = ContainerHelpers.binarySearch(this.mHashes, mSize, n);
            if (binarySearch >= 0 && !o.equals(this.mArray[binarySearch << 1])) {
                int n2;
                for (n2 = binarySearch + 1; n2 < mSize && this.mHashes[n2] == n; ++n2) {
                    if (o.equals(this.mArray[n2 << 1])) {
                        return n2;
                    }
                }
                --binarySearch;
                while (binarySearch >= 0 && this.mHashes[binarySearch] == n) {
                    if (o.equals(this.mArray[binarySearch << 1])) {
                        return binarySearch;
                    }
                    --binarySearch;
                }
                return ~n2;
            }
        }
        return binarySearch;
    }
    
    public int indexOfKey(final Object o) {
        if (o == null) {
            return this.indexOfNull();
        }
        return this.indexOf(o, o.hashCode());
    }
    
    int indexOfNull() {
        final int mSize = this.mSize;
        int binarySearch;
        if (mSize == 0) {
            binarySearch = -1;
        }
        else {
            binarySearch = ContainerHelpers.binarySearch(this.mHashes, mSize, 0);
            if (binarySearch >= 0 && this.mArray[binarySearch << 1] != null) {
                int n;
                for (n = binarySearch + 1; n < mSize && this.mHashes[n] == 0; ++n) {
                    if (this.mArray[n << 1] == null) {
                        return n;
                    }
                }
                --binarySearch;
                while (binarySearch >= 0 && this.mHashes[binarySearch] == 0) {
                    if (this.mArray[binarySearch << 1] == null) {
                        return binarySearch;
                    }
                    --binarySearch;
                }
                return ~n;
            }
        }
        return binarySearch;
    }
    
    int indexOfValue(final Object o) {
        int i = 1;
        final int n = 2 * this.mSize;
        final Object[] mArray = this.mArray;
        if (o == null) {
            while (i < n) {
                if (mArray[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        else {
            while (i < n) {
                if (o.equals(mArray[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return this.mSize <= 0;
    }
    
    public Object keyAt(final int n) {
        return this.mArray[n << 1];
    }
    
    public Object put(final Object o, final Object o2) {
        int n = 8;
        int n2;
        int hashCode;
        if (o == null) {
            n2 = this.indexOfNull();
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
            n2 = this.indexOf(o, hashCode);
        }
        if (n2 >= 0) {
            final int n3 = 1 + (n2 << 1);
            final Object o3 = this.mArray[n3];
            this.mArray[n3] = o2;
            return o3;
        }
        final int n4 = ~n2;
        if (this.mSize >= this.mHashes.length) {
            if (this.mSize >= n) {
                n = this.mSize + (this.mSize >> 1);
            }
            else if (this.mSize < 4) {
                n = 4;
            }
            final int[] mHashes = this.mHashes;
            final Object[] mArray = this.mArray;
            this.allocArrays(n);
            if (this.mHashes.length > 0) {
                System.arraycopy(mHashes, 0, this.mHashes, 0, mHashes.length);
                System.arraycopy(mArray, 0, this.mArray, 0, mArray.length);
            }
            freeArrays(mHashes, mArray, this.mSize);
        }
        if (n4 < this.mSize) {
            System.arraycopy(this.mHashes, n4, this.mHashes, n4 + 1, this.mSize - n4);
            System.arraycopy(this.mArray, n4 << 1, this.mArray, n4 + 1 << 1, this.mSize - n4 << 1);
        }
        this.mHashes[n4] = hashCode;
        this.mArray[n4 << 1] = o;
        this.mArray[1 + (n4 << 1)] = o2;
        ++this.mSize;
        return null;
    }
    
    public void putAll(final SimpleArrayMap simpleArrayMap) {
        final int mSize = simpleArrayMap.mSize;
        this.ensureCapacity(mSize + this.mSize);
        final int mSize2 = this.mSize;
        int i = 0;
        if (mSize2 == 0) {
            if (mSize > 0) {
                System.arraycopy(simpleArrayMap.mHashes, 0, this.mHashes, 0, mSize);
                System.arraycopy(simpleArrayMap.mArray, 0, this.mArray, 0, mSize << 1);
                this.mSize = mSize;
            }
        }
        else {
            while (i < mSize) {
                this.put(simpleArrayMap.keyAt(i), simpleArrayMap.valueAt(i));
                ++i;
            }
        }
    }
    
    public Object remove(final Object o) {
        final int indexOfKey = this.indexOfKey(o);
        if (indexOfKey >= 0) {
            return this.removeAt(indexOfKey);
        }
        return null;
    }
    
    public Object removeAt(final int n) {
        int n2 = 8;
        final Object o = this.mArray[1 + (n << 1)];
        if (this.mSize <= 1) {
            freeArrays(this.mHashes, this.mArray, this.mSize);
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
        }
        else {
            if (this.mHashes.length <= n2 || this.mSize >= this.mHashes.length / 3) {
                --this.mSize;
                if (n < this.mSize) {
                    System.arraycopy(this.mHashes, n + 1, this.mHashes, n, this.mSize - n);
                    System.arraycopy(this.mArray, n + 1 << 1, this.mArray, n << 1, this.mSize - n << 1);
                }
                this.mArray[this.mSize << 1] = null;
                this.mArray[1 + (this.mSize << 1)] = null;
                return o;
            }
            if (this.mSize > n2) {
                n2 = this.mSize + (this.mSize >> 1);
            }
            final int[] mHashes = this.mHashes;
            final Object[] mArray = this.mArray;
            this.allocArrays(n2);
            --this.mSize;
            if (n > 0) {
                System.arraycopy(mHashes, 0, this.mHashes, 0, n);
                System.arraycopy(mArray, 0, this.mArray, 0, n << 1);
            }
            if (n < this.mSize) {
                System.arraycopy(mHashes, n + 1, this.mHashes, n, this.mSize - n);
                System.arraycopy(mArray, n + 1 << 1, this.mArray, n << 1, this.mSize - n << 1);
                return o;
            }
        }
        return o;
    }
    
    public Object setValueAt(final int n, final Object o) {
        final int n2 = 1 + (n << 1);
        final Object o2 = this.mArray[n2];
        this.mArray[n2] = o;
        return o2;
    }
    
    public int size() {
        return this.mSize;
    }
    
    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(28 * this.mSize);
        sb.append('{');
        for (int i = 0; i < this.mSize; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object key = this.keyAt(i);
            if (key != this) {
                sb.append(key);
            }
            else {
                sb.append("(this Map)");
            }
            sb.append('=');
            final Object value = this.valueAt(i);
            if (value != this) {
                sb.append(value);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
    
    public Object valueAt(final int n) {
        return this.mArray[1 + (n << 1)];
    }
}
