// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import java.util.ArrayList;
import android.util.SparseArray;
import android.util.SparseIntArray;

public class RecyclerView$RecycledViewPool
{
    private static final int DEFAULT_MAX_SCRAP = 5;
    private int mAttachCount;
    private SparseIntArray mMaxScrap;
    private SparseArray mScrap;
    
    public RecyclerView$RecycledViewPool() {
        this.mScrap = new SparseArray();
        this.mMaxScrap = new SparseIntArray();
        this.mAttachCount = 0;
    }
    
    private ArrayList getScrapHeapForType(final int n) {
        ArrayList list = (ArrayList)this.mScrap.get(n);
        if (list == null) {
            list = new ArrayList();
            this.mScrap.put(n, (Object)list);
            if (this.mMaxScrap.indexOfKey(n) < 0) {
                this.mMaxScrap.put(n, 5);
            }
        }
        return list;
    }
    
    void attach(final RecyclerView$Adapter recyclerView$Adapter) {
        ++this.mAttachCount;
    }
    
    public void clear() {
        this.mScrap.clear();
    }
    
    void detach() {
        --this.mAttachCount;
    }
    
    public RecyclerView$ViewHolder getRecycledView(final int n) {
        final ArrayList list = (ArrayList)this.mScrap.get(n);
        if (list != null && !list.isEmpty()) {
            final int n2 = -1 + list.size();
            final RecyclerView$ViewHolder recyclerView$ViewHolder = list.get(n2);
            list.remove(n2);
            return recyclerView$ViewHolder;
        }
        return null;
    }
    
    void onAdapterChanged(final RecyclerView$Adapter recyclerView$Adapter, final RecyclerView$Adapter recyclerView$Adapter2, final boolean b) {
        if (recyclerView$Adapter != null) {
            this.detach();
        }
        if (!b && this.mAttachCount == 0) {
            this.clear();
        }
        if (recyclerView$Adapter2 != null) {
            this.attach(recyclerView$Adapter2);
        }
    }
    
    public void putRecycledView(final RecyclerView$ViewHolder recyclerView$ViewHolder) {
        final int itemViewType = recyclerView$ViewHolder.getItemViewType();
        final ArrayList scrapHeapForType = this.getScrapHeapForType(itemViewType);
        if (this.mMaxScrap.get(itemViewType) <= scrapHeapForType.size()) {
            return;
        }
        recyclerView$ViewHolder.resetInternal();
        scrapHeapForType.add(recyclerView$ViewHolder);
    }
    
    public void setMaxRecycledViews(final int n, final int n2) {
        this.mMaxScrap.put(n, n2);
        final ArrayList list = (ArrayList)this.mScrap.get(n);
        if (list != null) {
            while (list.size() > n2) {
                list.remove(-1 + list.size());
            }
        }
    }
    
    int size() {
        int i = 0;
        int n = 0;
        while (i < this.mScrap.size()) {
            final ArrayList list = (ArrayList)this.mScrap.valueAt(i);
            if (list != null) {
                n += list.size();
            }
            ++i;
        }
        return n;
    }
}
