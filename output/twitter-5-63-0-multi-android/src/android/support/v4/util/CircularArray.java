// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

public class CircularArray
{
    private int mCapacityBitmask;
    private Object[] mElements;
    private int mHead;
    private int mTail;
    
    public CircularArray() {
        this(8);
    }
    
    public CircularArray(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("capacity must be positive");
        }
        if (Integer.bitCount(n) != 1) {
            n = 1 << 1 + Integer.highestOneBit(n);
        }
        this.mCapacityBitmask = n - 1;
        this.mElements = new Object[n];
    }
    
    private void doubleCapacity() {
        final int length = this.mElements.length;
        final int n = length - this.mHead;
        final int n2 = length << 1;
        if (n2 < 0) {
            throw new RuntimeException("Too big");
        }
        final Object[] array = new Object[n2];
        System.arraycopy(this.mElements, this.mHead, array, 0, n);
        System.arraycopy(this.mElements, 0, array, n, this.mHead);
        this.mElements = array;
        this.mHead = 0;
        this.mTail = length;
        this.mCapacityBitmask = n2 - 1;
    }
    
    public final void addFirst(final Object o) {
        this.mHead = (-1 + this.mHead & this.mCapacityBitmask);
        this.mElements[this.mHead] = o;
        if (this.mHead == this.mTail) {
            this.doubleCapacity();
        }
    }
    
    public final void addLast(final Object o) {
        this.mElements[this.mTail] = o;
        this.mTail = (1 + this.mTail & this.mCapacityBitmask);
        if (this.mTail == this.mHead) {
            this.doubleCapacity();
        }
    }
    
    public final Object get(final int n) {
        if (n < 0 || n >= this.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[n + this.mHead & this.mCapacityBitmask];
    }
    
    public final Object getFirst() {
        if (this.mHead == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[this.mHead];
    }
    
    public final Object getLast() {
        if (this.mHead == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[-1 + this.mTail & this.mCapacityBitmask];
    }
    
    public final boolean isEmpty() {
        return this.mHead == this.mTail;
    }
    
    public final Object popFirst() {
        if (this.mHead == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        final Object o = this.mElements[this.mHead];
        this.mElements[this.mHead] = null;
        this.mHead = (1 + this.mHead & this.mCapacityBitmask);
        return o;
    }
    
    public final Object popLast() {
        if (this.mHead == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        final int mTail = -1 + this.mTail & this.mCapacityBitmask;
        final Object o = this.mElements[mTail];
        this.mElements[mTail] = null;
        this.mTail = mTail;
        return o;
    }
    
    public final int size() {
        return this.mTail - this.mHead & this.mCapacityBitmask;
    }
}
