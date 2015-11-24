// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

public class Pools$SimplePool implements Pools$Pool
{
    private final Object[] mPool;
    private int mPoolSize;
    
    public Pools$SimplePool(final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.mPool = new Object[n];
    }
    
    private boolean isInPool(final Object o) {
        int n = 0;
        boolean b;
        while (true) {
            final int mPoolSize = this.mPoolSize;
            b = false;
            if (n >= mPoolSize) {
                break;
            }
            if (this.mPool[n] == o) {
                b = true;
                break;
            }
            ++n;
        }
        return b;
    }
    
    @Override
    public Object acquire() {
        if (this.mPoolSize > 0) {
            final int n = -1 + this.mPoolSize;
            final Object o = this.mPool[n];
            this.mPool[n] = null;
            --this.mPoolSize;
            return o;
        }
        return null;
    }
    
    @Override
    public boolean release(final Object o) {
        if (this.isInPool(o)) {
            throw new IllegalStateException("Already in the pool!");
        }
        if (this.mPoolSize < this.mPool.length) {
            this.mPool[this.mPoolSize] = o;
            ++this.mPoolSize;
            return true;
        }
        return false;
    }
}
