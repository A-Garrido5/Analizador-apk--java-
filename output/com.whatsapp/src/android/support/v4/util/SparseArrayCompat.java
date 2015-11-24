// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

public class SparseArrayCompat implements Cloneable
{
    private static final Object DELETED;
    private static final String[] z;
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;
    
    static {
        final String[] z2 = new String[3];
        String s = "j$";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0002';
                        break;
                    }
                    case 0: {
                        c2 = 'F';
                        break;
                    }
                    case 1: {
                        c2 = '\u0004';
                        break;
                    }
                    case 2: {
                        c2 = '=';
                        break;
                    }
                    case 3: {
                        c2 = '_';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "npU6qfI\\/+";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "=y";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        DELETED = new Object();
    }
    
    public SparseArrayCompat() {
        this(10);
    }
    
    public SparseArrayCompat(final int n) {
        this.mGarbage = false;
        Label_0053: {
            if (n == 0) {
                this.mKeys = ContainerHelpers.EMPTY_INTS;
                this.mValues = ContainerHelpers.EMPTY_OBJECTS;
                if (LruCache.a == 0) {
                    break Label_0053;
                }
            }
            final int idealIntArraySize = ContainerHelpers.idealIntArraySize(n);
            this.mKeys = new int[idealIntArraySize];
            this.mValues = new Object[idealIntArraySize];
        }
        this.mSize = 0;
    }
    
    private void gc() {
        final int a = LruCache.a;
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
            if (a != 0) {
                break;
            }
        }
        this.mGarbage = false;
        this.mSize = mSize2;
    }
    
    public void clear() {
        final int a = LruCache.a;
        final int mSize = this.mSize;
        final Object[] mValues = this.mValues;
        int i = 0;
        while (i < mSize) {
            mValues[i] = null;
            ++i;
            if (a != 0) {
                break;
            }
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
    
    public Object clone() {
        return this.clone();
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
            if (LruCache.a == 0) {
                return;
            }
        }
        int n2 = ~binarySearch;
        if (n2 >= this.mSize || this.mValues[n2] != SparseArrayCompat.DELETED) {
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
            return;
        }
        this.mKeys[n2] = n;
        this.mValues[n2] = o;
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
    
    public int size() {
        if (this.mGarbage) {
            this.gc();
        }
        return this.mSize;
    }
    
    @Override
    public String toString() {
        final int a = LruCache.a;
        if (this.size() <= 0) {
            return SparseArrayCompat.z[2];
        }
        final StringBuilder sb = new StringBuilder(28 * this.mSize);
        sb.append('{');
        int i = 0;
        while (i < this.mSize) {
            if (i > 0) {
                sb.append(SparseArrayCompat.z[0]);
            }
            sb.append(this.keyAt(i));
            sb.append('=');
            final Object value = this.valueAt(i);
            Label_0119: {
                if (value != this) {
                    sb.append(value);
                    if (a == 0) {
                        break Label_0119;
                    }
                }
                sb.append(SparseArrayCompat.z[1]);
            }
            ++i;
            if (a != 0) {
                break;
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
