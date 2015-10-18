// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.util.SparseIntArray;

public abstract class GridLayoutManager$SpanSizeLookup
{
    private boolean mCacheSpanIndices;
    final SparseIntArray mSpanIndexCache;
    
    public GridLayoutManager$SpanSizeLookup() {
        this.mSpanIndexCache = new SparseIntArray();
        this.mCacheSpanIndices = false;
    }
    
    int findReferenceIndexFromCache(final int n) {
        int i = 0;
        int n2 = -1 + this.mSpanIndexCache.size();
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            if (this.mSpanIndexCache.keyAt(n3) < n) {
                i = n3 + 1;
            }
            else {
                n2 = n3 - 1;
            }
        }
        final int n4 = i - 1;
        if (n4 >= 0 && n4 < this.mSpanIndexCache.size()) {
            return this.mSpanIndexCache.keyAt(n4);
        }
        return -1;
    }
    
    int getCachedSpanIndex(final int n, final int n2) {
        int n3;
        if (!this.mCacheSpanIndices) {
            n3 = this.getSpanIndex(n, n2);
        }
        else {
            n3 = this.mSpanIndexCache.get(n, -1);
            if (n3 == -1) {
                final int spanIndex = this.getSpanIndex(n, n2);
                this.mSpanIndexCache.put(n, spanIndex);
                return spanIndex;
            }
        }
        return n3;
    }
    
    public int getSpanGroupIndex(final int n, final int n2) {
        final int spanSize = this.getSpanSize(n);
        int i = 0;
        int n3 = 0;
        int n4 = 0;
        while (i < n) {
            int spanSize2 = this.getSpanSize(i);
            final int n5 = n4 + spanSize2;
            if (n5 == n2) {
                ++n3;
                spanSize2 = 0;
            }
            else if (n5 > n2) {
                ++n3;
            }
            else {
                spanSize2 = n5;
            }
            ++i;
            n4 = spanSize2;
        }
        if (n4 + spanSize > n2) {
            ++n3;
        }
        return n3;
    }
    
    public int getSpanIndex(final int n, final int n2) {
        final int spanSize = this.getSpanSize(n);
        if (spanSize != n2) {
            while (true) {
                Label_0134: {
                    if (!this.mCacheSpanIndices || this.mSpanIndexCache.size() <= 0) {
                        break Label_0134;
                    }
                    final int referenceIndexFromCache = this.findReferenceIndexFromCache(n);
                    if (referenceIndexFromCache < 0) {
                        break Label_0134;
                    }
                    int n3 = this.mSpanIndexCache.get(referenceIndexFromCache) + this.getSpanSize(referenceIndexFromCache);
                    final int n4 = referenceIndexFromCache + 1;
                    int spanSize2;
                    for (int i = n4; i < n; ++i, n3 = spanSize2) {
                        spanSize2 = this.getSpanSize(i);
                        final int n5 = n3 + spanSize2;
                        if (n5 == n2) {
                            spanSize2 = 0;
                        }
                        else if (n5 <= n2) {
                            spanSize2 = n5;
                        }
                    }
                    if (n3 + spanSize <= n2) {
                        return n3;
                    }
                    return 0;
                }
                final int n4 = 0;
                int n3 = 0;
                continue;
            }
        }
        return 0;
    }
    
    public abstract int getSpanSize(final int p0);
    
    public void invalidateSpanIndexCache() {
        this.mSpanIndexCache.clear();
    }
    
    public boolean isSpanIndexCacheEnabled() {
        return this.mCacheSpanIndices;
    }
    
    public void setSpanIndexCacheEnabled(final boolean mCacheSpanIndices) {
        this.mCacheSpanIndices = mCacheSpanIndices;
    }
}
