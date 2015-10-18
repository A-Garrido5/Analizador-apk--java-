// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

public class SparseArrayCompat implements Cloneable
{
    private static final Object DELETED;
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;
    
    static {
        DELETED = new Object();
    }
    
    public SparseArrayCompat() {
        this(10);
    }
    
    public SparseArrayCompat(final int n) {
        this.mGarbage = false;
        if (n == 0) {
            this.mKeys = ContainerHelpers.EMPTY_INTS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
        }
        else {
            final int idealIntArraySize = ContainerHelpers.idealIntArraySize(n);
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
            if (o != SparseArrayCompat.DELETED) {
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
            final int idealIntArraySize = ContainerHelpers.idealIntArraySize(mSize + 1);
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
    
    public SparseArrayCompat clone() {
        SparseArrayCompat sparseArrayCompat;
        try {
            final SparseArrayCompat sparseArrayCompat2;
            sparseArrayCompat = (sparseArrayCompat2 = (SparseArrayCompat)super.clone());
            final SparseArrayCompat sparseArrayCompat3 = this;
            final int[] array = sparseArrayCompat3.mKeys;
            final int[] array2 = array.clone();
            final int[] array3 = array2;
            sparseArrayCompat2.mKeys = array3;
            final SparseArrayCompat sparseArrayCompat4 = sparseArrayCompat;
            final SparseArrayCompat sparseArrayCompat5 = this;
            final Object[] array4 = sparseArrayCompat5.mValues;
            final Object[] array5 = array4.clone();
            final Object[] array6 = array5;
            sparseArrayCompat4.mValues = array6;
            return sparseArrayCompat;
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
        try {
            final SparseArrayCompat sparseArrayCompat2 = sparseArrayCompat;
            final SparseArrayCompat sparseArrayCompat3 = this;
            final int[] array = sparseArrayCompat3.mKeys;
            final int[] array2 = array.clone();
            final int[] array3 = array2;
            sparseArrayCompat2.mKeys = array3;
            final SparseArrayCompat sparseArrayCompat4 = sparseArrayCompat;
            final SparseArrayCompat sparseArrayCompat5 = this;
            final Object[] array4 = sparseArrayCompat5.mValues;
            final Object[] array5 = array4.clone();
            final Object[] array6 = array5;
            sparseArrayCompat4.mValues = array6;
            return sparseArrayCompat;
        }
        catch (CloneNotSupportedException ex2) {
            return sparseArrayCompat;
        }
    }
    
    public void delete(final int n) {
        final int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, n);
        if (binarySearch >= 0 && this.mValues[binarySearch] != SparseArrayCompat.DELETED) {
            this.mValues[binarySearch] = SparseArrayCompat.DELETED;
            this.mGarbage = true;
        }
    }
    
    public Object get(final int n) {
        return this.get(n, null);
    }
    
    public Object get(final int n, final Object o) {
        final int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, n);
        if (binarySearch < 0 || this.mValues[binarySearch] == SparseArrayCompat.DELETED) {
            return o;
        }
        return this.mValues[binarySearch];
    }
    
    public int indexOfKey(final int n) {
        if (this.mGarbage) {
            this.gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, n);
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
    
    public int keyAt(final int n) {
        if (this.mGarbage) {
            this.gc();
        }
        return this.mKeys[n];
    }
    
    public void put(final int n, final Object o) {
        final int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, n);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = o;
            return;
        }
        int n2 = ~binarySearch;
        if (n2 < this.mSize && this.mValues[n2] == SparseArrayCompat.DELETED) {
            this.mKeys[n2] = n;
            this.mValues[n2] = o;
            return;
        }
        if (this.mGarbage && this.mSize >= this.mKeys.length) {
            this.gc();
            n2 = (-1 ^ ContainerHelpers.binarySearch(this.mKeys, this.mSize, n));
        }
        if (this.mSize >= this.mKeys.length) {
            final int idealIntArraySize = ContainerHelpers.idealIntArraySize(1 + this.mSize);
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
        if (this.mValues[n] != SparseArrayCompat.DELETED) {
            this.mValues[n] = SparseArrayCompat.DELETED;
            this.mGarbage = true;
        }
    }
    
    public void removeAtRange(int i, final int n) {
        while (i < Math.min(this.mSize, i + n)) {
            this.removeAt(i);
            ++i;
        }
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
