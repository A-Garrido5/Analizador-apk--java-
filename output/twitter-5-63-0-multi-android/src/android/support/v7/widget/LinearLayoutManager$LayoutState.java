// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.util.Log;
import android.view.View;
import java.util.List;

class LinearLayoutManager$LayoutState
{
    static final int INVALID_LAYOUT = Integer.MIN_VALUE;
    static final int ITEM_DIRECTION_HEAD = -1;
    static final int ITEM_DIRECTION_TAIL = 1;
    static final int LAYOUT_END = 1;
    static final int LAYOUT_START = -1;
    static final int SCOLLING_OFFSET_NaN = Integer.MIN_VALUE;
    static final String TAG = "LinearLayoutManager#LayoutState";
    int mAvailable;
    int mCurrentPosition;
    int mExtra;
    boolean mIsPreLayout;
    int mItemDirection;
    int mLayoutDirection;
    int mOffset;
    boolean mRecycle;
    List mScrapList;
    int mScrollingOffset;
    
    LinearLayoutManager$LayoutState() {
        this.mRecycle = true;
        this.mExtra = 0;
        this.mIsPreLayout = false;
        this.mScrapList = null;
    }
    
    private View nextFromLimitedList() {
        final int size = this.mScrapList.size();
        int n = Integer.MAX_VALUE;
        int i = 0;
        RecyclerView$ViewHolder recyclerView$ViewHolder = null;
        while (true) {
            while (i < size) {
                final RecyclerView$ViewHolder recyclerView$ViewHolder2 = this.mScrapList.get(i);
                int n2;
                RecyclerView$ViewHolder recyclerView$ViewHolder3;
                if (!this.mIsPreLayout && recyclerView$ViewHolder2.isRemoved()) {
                    n2 = n;
                    recyclerView$ViewHolder3 = recyclerView$ViewHolder;
                }
                else {
                    final int n3 = (recyclerView$ViewHolder2.getPosition() - this.mCurrentPosition) * this.mItemDirection;
                    if (n3 < 0) {
                        n2 = n;
                        recyclerView$ViewHolder3 = recyclerView$ViewHolder;
                    }
                    else if (n3 < n) {
                        if (n3 == 0) {
                            if (recyclerView$ViewHolder2 != null) {
                                this.mCurrentPosition = recyclerView$ViewHolder2.getPosition() + this.mItemDirection;
                                return recyclerView$ViewHolder2.itemView;
                            }
                            return null;
                        }
                        else {
                            recyclerView$ViewHolder3 = recyclerView$ViewHolder2;
                            n2 = n3;
                        }
                    }
                    else {
                        n2 = n;
                        recyclerView$ViewHolder3 = recyclerView$ViewHolder;
                    }
                }
                ++i;
                recyclerView$ViewHolder = recyclerView$ViewHolder3;
                n = n2;
            }
            final RecyclerView$ViewHolder recyclerView$ViewHolder2 = recyclerView$ViewHolder;
            continue;
        }
    }
    
    boolean hasMore(final RecyclerView$State recyclerView$State) {
        return this.mCurrentPosition >= 0 && this.mCurrentPosition < recyclerView$State.getItemCount();
    }
    
    void log() {
        Log.d("LinearLayoutManager#LayoutState", "avail:" + this.mAvailable + ", ind:" + this.mCurrentPosition + ", dir:" + this.mItemDirection + ", offset:" + this.mOffset + ", layoutDir:" + this.mLayoutDirection);
    }
    
    View next(final RecyclerView$Recycler recyclerView$Recycler) {
        if (this.mScrapList != null) {
            return this.nextFromLimitedList();
        }
        final View viewForPosition = recyclerView$Recycler.getViewForPosition(this.mCurrentPosition);
        this.mCurrentPosition += this.mItemDirection;
        return viewForPosition;
    }
}
