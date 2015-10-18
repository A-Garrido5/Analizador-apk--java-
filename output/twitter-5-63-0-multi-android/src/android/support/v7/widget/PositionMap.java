// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import java.util.ArrayList;

class PositionMap implements Cloneable
{
    private static final Object DELETED;
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;
    
    static {
        DELETED = new Object();
    }
    
    public PositionMap() {
        this(10);
    }
    
    public PositionMap(final int n) {
        this.mGarbage = false;
        if (n == 0) {
            this.mKeys = PositionMap$ContainerHelpers.EMPTY_INTS;
            this.mValues = PositionMap$ContainerHelpers.EMPTY_OBJECTS;
        }
        else {
            final int idealIntArraySize = idealIntArraySize(n);
            this.mKeys = new int[idealIntArraySize];
            this.mValues = new Object[idealIntArraySize];
        }
        this.mSize = 0;
    }
    
    private void gc() {
        final int mSize = this.mSize;
        final int[] mKeys = this.mKeys;
        final Object[] mValues = this.mValues;
        int i = 0;
        int mSize2 = 0;
        while (i < mSize) {
            final Object o = mValues[i];
            if (o != PositionMap.DELETED) {
                if (i != mSize2) {
                    mKeys[mSize2] = mKeys[i];
                    mValues[mSize2] = o;
                    mValues[i] = null;
                }
                ++mSize2;
            }
            ++i;
        }
        this.mGarbage = false;
        this.mSize = mSize2;
    }
    
    static int idealBooleanArraySize(final int n) {
        return idealByteArraySize(n);
    }
    
    static int idealByteArraySize(int n) {
        for (int i = 4; i < 32; ++i) {
            if (n <= -12 + (1 << i)) {
                n = -12 + (1 << i);
                break;
            }
        }
        return n;
    }
    
    static int idealCharArraySize(final int n) {
        return idealByteArraySize(n * 2) / 2;
    }
    
    static int idealFloatArraySize(final int n) {
        return idealByteArraySize(n * 4) / 4;
    }
    
    static int idealIntArraySize(final int n) {
        return idealByteArraySize(n * 4) / 4;
    }
    
    static int idealLongArraySize(final int n) {
        return idealByteArraySize(n * 8) / 8;
    }
    
    static int idealObjectArraySize(final int n) {
        return idealByteArraySize(n * 4) / 4;
    }
    
    static int idealShortArraySize(final int n) {
        return idealByteArraySize(n * 2) / 2;
    }
    
    public void append(final int n, final Object o) {
        if (this.mSize != 0 && n <= this.mKeys[-1 + this.mSize]) {
            this.put(n, o);
            return;
        }
        if (this.mGarbage && this.mSize >= this.mKeys.length) {
            this.gc();
        }
        final int mSize = this.mSize;
        if (mSize >= this.mKeys.length) {
            final int idealIntArraySize = idealIntArraySize(mSize + 1);
            final int[] mKeys = new int[idealIntArraySize];
            final Object[] mValues = new Object[idealIntArraySize];
            System.arraycopy(this.mKeys, 0, mKeys, 0, this.mKeys.length);
            System.arraycopy(this.mValues, 0, mValues, 0, this.mValues.length);
            this.mKeys = mKeys;
            this.mValues = mValues;
        }
        this.mKeys[mSize] = n;
        this.mValues[mSize] = o;
        this.mSize = mSize + 1;
    }
    
    public void clear() {
        final int mSize = this.mSize;
        final Object[] mValues = this.mValues;
        for (int i = 0; i < mSize; ++i) {
            mValues[i] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }
    
    public PositionMap clone() {
        PositionMap positionMap;
        try {
            final PositionMap positionMap2;
            positionMap = (positionMap2 = (PositionMap)super.clone());
            final PositionMap positionMap3 = this;
            final int[] array = positionMap3.mKeys;
            final int[] array2 = array.clone();
            final int[] array3 = array2;
            positionMap2.mKeys = array3;
            final PositionMap positionMap4 = positionMap;
            final PositionMap positionMap5 = this;
            final Object[] array4 = positionMap5.mValues;
            final Object[] array5 = array4.clone();
            final Object[] array6 = array5;
            positionMap4.mValues = array6;
            return positionMap;
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
        try {
            final PositionMap positionMap2 = positionMap;
            final PositionMap positionMap3 = this;
            final int[] array = positionMap3.mKeys;
            final int[] array2 = array.clone();
            final int[] array3 = array2;
            positionMap2.mKeys = array3;
            final PositionMap positionMap4 = positionMap;
            final PositionMap positionMap5 = this;
            final Object[] array4 = positionMap5.mValues;
            final Object[] array5 = array4.clone();
            final Object[] array6 = array5;
            positionMap4.mValues = array6;
            return positionMap;
        }
        catch (CloneNotSupportedException ex2) {
            return positionMap;
        }
    }
    
    public void delete(final int n) {
        final int binarySearch = PositionMap$ContainerHelpers.binarySearch(this.mKeys, this.mSize, n);
        if (binarySearch >= 0 && this.mValues[binarySearch] != PositionMap.DELETED) {
            this.mValues[binarySearch] = PositionMap.DELETED;
            this.mGarbage = true;
        }
    }
    
    public Object get(final int n) {
        return this.get(n, null);
    }
    
    public Object get(final int n, final Object o) {
        final int binarySearch = PositionMap$ContainerHelpers.binarySearch(this.mKeys, this.mSize, n);
        if (binarySearch < 0 || this.mValues[binarySearch] == PositionMap.DELETED) {
            return o;
        }
        return this.mValues[binarySearch];
    }
    
    public int indexOfKey(final int n) {
        if (this.mGarbage) {
            this.gc();
        }
        return PositionMap$ContainerHelpers.binarySearch(this.mKeys, this.mSize, n);
    }
    
    public int indexOfValue(final Object o) {
        if (this.mGarbage) {
            this.gc();
        }
        for (int i = 0; i < this.mSize; ++i) {
            if (this.mValues[i] == o) {
                return i;
            }
        }
        return -1;
    }
    
    public void insertKeyRange(final int n, final int n2) {
    }
    
    public int keyAt(final int n) {
        if (this.mGarbage) {
            this.gc();
        }
        return this.mKeys[n];
    }
    
    public void put(final int n, final Object o) {
        final int binarySearch = PositionMap$ContainerHelpers.binarySearch(this.mKeys, this.mSize, n);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = o;
            return;
        }
        int n2 = ~binarySearch;
        if (n2 < this.mSize && this.mValues[n2] == PositionMap.DELETED) {
            this.mKeys[n2] = n;
            this.mValues[n2] = o;
            return;
        }
        if (this.mGarbage && this.mSize >= this.mKeys.length) {
            this.gc();
            n2 = (-1 ^ PositionMap$ContainerHelpers.binarySearch(this.mKeys, this.mSize, n));
        }
        if (this.mSize >= this.mKeys.length) {
            final int idealIntArraySize = idealIntArraySize(1 + this.mSize);
            final int[] mKeys = new int[idealIntArraySize];
            final Object[] mValues = new Object[idealIntArraySize];
            System.arraycopy(this.mKeys, 0, mKeys, 0, this.mKeys.length);
            System.arraycopy(this.mValues, 0, mValues, 0, this.mValues.length);
            this.mKeys = mKeys;
            this.mValues = mValues;
        }
        if (this.mSize - n2 != 0) {
            System.arraycopy(this.mKeys, n2, this.mKeys, n2 + 1, this.mSize - n2);
            System.arraycopy(this.mValues, n2, this.mValues, n2 + 1, this.mSize - n2);
        }
        this.mKeys[n2] = n;
        this.mValues[n2] = o;
        ++this.mSize;
    }
    
    public void remove(final int n) {
        this.delete(n);
    }
    
    public void removeAt(final int n) {
        if (this.mValues[n] != PositionMap.DELETED) {
            this.mValues[n] = PositionMap.DELETED;
            this.mGarbage = true;
        }
    }
    
    public void removeAtRange(int i, final int n) {
        while (i < Math.min(this.mSize, i + n)) {
            this.removeAt(i);
            ++i;
        }
    }
    
    public void removeKeyRange(final ArrayList list, final int n, final int n2) {
    }
    
    public void setValueAt(final int n, final Object o) {
        if (this.mGarbage) {
            this.gc();
        }
        this.mValues[n] = o;
    }
    
    public int size() {
        if (this.mGarbage) {
            this.gc();
        }
        return this.mSize;
    }
    
    @Override
    public String toString() {
        if (this.size() <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(28 * this.mSize);
        sb.append('{');
        for (int i = 0; i < this.mSize; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.keyAt(i));
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
        if (this.mGarbage) {
            this.gc();
        }
        return this.mValues[n];
    }
}
