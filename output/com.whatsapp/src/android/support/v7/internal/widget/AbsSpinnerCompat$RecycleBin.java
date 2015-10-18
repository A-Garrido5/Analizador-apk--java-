// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.View;
import android.util.SparseArray;

class AbsSpinnerCompat$RecycleBin
{
    private final SparseArray mScrapHeap;
    final AbsSpinnerCompat this$0;
    
    AbsSpinnerCompat$RecycleBin(final AbsSpinnerCompat this$0) {
        this.this$0 = this$0;
        this.mScrapHeap = new SparseArray();
    }
    
    void clear() {
        final int a = AdapterViewCompat.a;
        final SparseArray mScrapHeap = this.mScrapHeap;
        int n;
        for (int size = mScrapHeap.size(), i = 0; i < size; i = n) {
            final View view = (View)mScrapHeap.valueAt(i);
            if (view != null) {
                AbsSpinnerCompat.access$000(this.this$0, view, true);
            }
            n = i + 1;
            if (a != 0) {
                break;
            }
        }
        mScrapHeap.clear();
    }
    
    View get(final int n) {
        final View view = (View)this.mScrapHeap.get(n);
        if (view != null) {
            this.mScrapHeap.delete(n);
        }
        return view;
    }
    
    public void put(final int n, final View view) {
        this.mScrapHeap.put(n, (Object)view);
    }
}
