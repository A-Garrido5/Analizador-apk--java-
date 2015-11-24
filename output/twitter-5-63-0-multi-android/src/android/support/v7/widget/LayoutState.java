// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.View;

class LayoutState
{
    static final int INVALID_LAYOUT = Integer.MIN_VALUE;
    static final int ITEM_DIRECTION_HEAD = -1;
    static final int ITEM_DIRECTION_TAIL = 1;
    static final int LAYOUT_END = 1;
    static final int LAYOUT_START = -1;
    static final int SCOLLING_OFFSET_NaN = Integer.MIN_VALUE;
    static final String TAG = "LayoutState";
    int mAvailable;
    int mCurrentPosition;
    int mExtra;
    int mItemDirection;
    int mLayoutDirection;
    
    LayoutState() {
        this.mExtra = 0;
    }
    
    boolean hasMore(final RecyclerView$State recyclerView$State) {
        return this.mCurrentPosition >= 0 && this.mCurrentPosition < recyclerView$State.getItemCount();
    }
    
    View next(final RecyclerView$Recycler recyclerView$Recycler) {
        final View viewForPosition = recyclerView$Recycler.getViewForPosition(this.mCurrentPosition);
        this.mCurrentPosition += this.mItemDirection;
        return viewForPosition;
    }
}
