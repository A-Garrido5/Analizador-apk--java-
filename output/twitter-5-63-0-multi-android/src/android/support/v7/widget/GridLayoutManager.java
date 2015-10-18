// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Arrays;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.util.Log;
import android.content.Context;
import android.view.View$MeasureSpec;
import android.view.View;
import android.util.SparseIntArray;
import android.graphics.Rect;

public class GridLayoutManager extends LinearLayoutManager
{
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    static final int MAIN_DIR_SPEC = 0;
    private static final String TAG = "GridLayoutManager";
    final Rect mDecorInsets;
    final SparseIntArray mPreLayoutSpanIndexCache;
    final SparseIntArray mPreLayoutSpanSizeCache;
    View[] mSet;
    int mSizePerSpan;
    int mSpanCount;
    GridLayoutManager$SpanSizeLookup mSpanSizeLookup;
    
    public GridLayoutManager(final Context context, final int spanCount) {
        super(context);
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new GridLayoutManager$DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        this.setSpanCount(spanCount);
    }
    
    public GridLayoutManager(final Context context, final int spanCount, final int n, final boolean b) {
        super(context, n, b);
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new GridLayoutManager$DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        this.setSpanCount(spanCount);
    }
    
    private void assignSpans(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, int n, final int n2, final boolean b) {
        int n3;
        int n4;
        if (b) {
            n3 = 1;
            n4 = 0;
        }
        else {
            n4 = n - 1;
            n3 = -1;
            n = -1;
        }
        int n5;
        int n6;
        if (this.mOrientation == 1 && this.isLayoutRTL()) {
            n5 = n2 - 1;
            n6 = -1;
        }
        else {
            n6 = 1;
            n5 = 0;
        }
        int n7 = n5;
        for (int i = n4; i != n; i += n3) {
            final View view = this.mSet[i];
            final GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = (GridLayoutManager$LayoutParams)view.getLayoutParams();
            gridLayoutManager$LayoutParams.mSpanSize = this.getSpanSize(recyclerView$Recycler, recyclerView$State, this.getPosition(view));
            if (n6 == -1 && gridLayoutManager$LayoutParams.mSpanSize > 1) {
                gridLayoutManager$LayoutParams.mSpanIndex = n7 - (-1 + gridLayoutManager$LayoutParams.mSpanSize);
            }
            else {
                gridLayoutManager$LayoutParams.mSpanIndex = n7;
            }
            n7 += n6 * gridLayoutManager$LayoutParams.mSpanSize;
        }
    }
    
    private void cachePreLayoutSpanMapping() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = (GridLayoutManager$LayoutParams)this.getChildAt(i).getLayoutParams();
            final int viewPosition = gridLayoutManager$LayoutParams.getViewPosition();
            this.mPreLayoutSpanSizeCache.put(viewPosition, gridLayoutManager$LayoutParams.getSpanSize());
            this.mPreLayoutSpanIndexCache.put(viewPosition, gridLayoutManager$LayoutParams.getSpanIndex());
        }
    }
    
    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }
    
    private void ensureAnchorIsInFirstSpan(final LinearLayoutManager$AnchorInfo linearLayoutManager$AnchorInfo) {
        for (int n = this.mSpanSizeLookup.getCachedSpanIndex(linearLayoutManager$AnchorInfo.mPosition, this.mSpanCount); n > 0 && linearLayoutManager$AnchorInfo.mPosition > 0; n = this.mSpanSizeLookup.getCachedSpanIndex(linearLayoutManager$AnchorInfo.mPosition, this.mSpanCount)) {
            --linearLayoutManager$AnchorInfo.mPosition;
        }
    }
    
    private int getMainDirSpec(final int n) {
        if (n < 0) {
            return GridLayoutManager.MAIN_DIR_SPEC;
        }
        return View$MeasureSpec.makeMeasureSpec(n, 1073741824);
    }
    
    private int getSpanGroupIndex(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final int n) {
        if (!recyclerView$State.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanGroupIndex(n, this.mSpanCount);
        }
        final int convertPreLayoutPositionToPostLayout = recyclerView$Recycler.convertPreLayoutPositionToPostLayout(n);
        if (convertPreLayoutPositionToPostLayout == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + n);
            return 0;
        }
        return this.mSpanSizeLookup.getSpanGroupIndex(convertPreLayoutPositionToPostLayout, this.mSpanCount);
    }
    
    private int getSpanIndex(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final int n) {
        int n2;
        if (!recyclerView$State.isPreLayout()) {
            n2 = this.mSpanSizeLookup.getCachedSpanIndex(n, this.mSpanCount);
        }
        else {
            n2 = this.mPreLayoutSpanIndexCache.get(n, -1);
            if (n2 == -1) {
                final int convertPreLayoutPositionToPostLayout = recyclerView$Recycler.convertPreLayoutPositionToPostLayout(n);
                if (convertPreLayoutPositionToPostLayout == -1) {
                    Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + n);
                    return 0;
                }
                return this.mSpanSizeLookup.getCachedSpanIndex(convertPreLayoutPositionToPostLayout, this.mSpanCount);
            }
        }
        return n2;
    }
    
    private int getSpanSize(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final int n) {
        int n2;
        if (!recyclerView$State.isPreLayout()) {
            n2 = this.mSpanSizeLookup.getSpanSize(n);
        }
        else {
            n2 = this.mPreLayoutSpanSizeCache.get(n, -1);
            if (n2 == -1) {
                final int convertPreLayoutPositionToPostLayout = recyclerView$Recycler.convertPreLayoutPositionToPostLayout(n);
                if (convertPreLayoutPositionToPostLayout == -1) {
                    Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + n);
                    return 1;
                }
                return this.mSpanSizeLookup.getSpanSize(convertPreLayoutPositionToPostLayout);
            }
        }
        return n2;
    }
    
    private void measureChildWithDecorationsAndMargin(final View view, final int n, final int n2) {
        this.calculateItemDecorationsForChild(view, this.mDecorInsets);
        final RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        view.measure(this.updateSpecWithExtra(n, recyclerView$LayoutParams.leftMargin + this.mDecorInsets.left, recyclerView$LayoutParams.rightMargin + this.mDecorInsets.right), this.updateSpecWithExtra(n2, recyclerView$LayoutParams.topMargin + this.mDecorInsets.top, recyclerView$LayoutParams.bottomMargin + this.mDecorInsets.bottom));
    }
    
    private void updateMeasurements() {
        int n;
        if (this.getOrientation() == 1) {
            n = this.getWidth() - this.getPaddingRight() - this.getPaddingLeft();
        }
        else {
            n = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
        }
        this.mSizePerSpan = n / this.mSpanCount;
    }
    
    private int updateSpecWithExtra(final int n, final int n2, final int n3) {
        if (n2 != 0 || n3 != 0) {
            final int mode = View$MeasureSpec.getMode(n);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                return View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n) - n2 - n3, mode);
            }
        }
        return n;
    }
    
    @Override
    public boolean checkLayoutParams(final RecyclerView$LayoutParams recyclerView$LayoutParams) {
        return recyclerView$LayoutParams instanceof GridLayoutManager$LayoutParams;
    }
    
    @Override
    public RecyclerView$LayoutParams generateDefaultLayoutParams() {
        return new GridLayoutManager$LayoutParams(-2, -2);
    }
    
    @Override
    public RecyclerView$LayoutParams generateLayoutParams(final Context context, final AttributeSet set) {
        return new GridLayoutManager$LayoutParams(context, set);
    }
    
    @Override
    public RecyclerView$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new GridLayoutManager$LayoutParams((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new GridLayoutManager$LayoutParams(viewGroup$LayoutParams);
    }
    
    @Override
    public int getColumnCountForAccessibility(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        if (recyclerView$State.getItemCount() < 1) {
            return 0;
        }
        return this.getSpanGroupIndex(recyclerView$Recycler, recyclerView$State, -1 + recyclerView$State.getItemCount());
    }
    
    @Override
    public int getRowCountForAccessibility(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        if (recyclerView$State.getItemCount() < 1) {
            return 0;
        }
        return this.getSpanGroupIndex(recyclerView$Recycler, recyclerView$State, -1 + recyclerView$State.getItemCount());
    }
    
    public int getSpanCount() {
        return this.mSpanCount;
    }
    
    public GridLayoutManager$SpanSizeLookup getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }
    
    @Override
    void layoutChunk(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final LinearLayoutManager$LayoutState linearLayoutManager$LayoutState, final LinearLayoutManager$LayoutChunkResult linearLayoutManager$LayoutChunkResult) {
        final boolean b = linearLayoutManager$LayoutState.mItemDirection == 1;
        int mSpanCount = this.mSpanCount;
        int n = 0;
        int n2 = 0;
        if (!b) {
            mSpanCount = this.getSpanIndex(recyclerView$Recycler, recyclerView$State, linearLayoutManager$LayoutState.mCurrentPosition) + this.getSpanSize(recyclerView$Recycler, recyclerView$State, linearLayoutManager$LayoutState.mCurrentPosition);
        }
        while (n < this.mSpanCount && linearLayoutManager$LayoutState.hasMore(recyclerView$State) && mSpanCount > 0) {
            final int mCurrentPosition = linearLayoutManager$LayoutState.mCurrentPosition;
            final int spanSize = this.getSpanSize(recyclerView$Recycler, recyclerView$State, mCurrentPosition);
            if (spanSize > this.mSpanCount) {
                throw new IllegalArgumentException("Item at position " + mCurrentPosition + " requires " + spanSize + " spans but GridLayoutManager has only " + this.mSpanCount + " spans.");
            }
            mSpanCount -= spanSize;
            if (mSpanCount < 0) {
                break;
            }
            final View next = linearLayoutManager$LayoutState.next(recyclerView$Recycler);
            if (next == null) {
                break;
            }
            n2 += spanSize;
            this.mSet[n] = next;
            ++n;
        }
        if (n == 0) {
            linearLayoutManager$LayoutChunkResult.mFinished = true;
            return;
        }
        this.assignSpans(recyclerView$Recycler, recyclerView$State, n, n2, b);
        int i = 0;
        int mConsumed = 0;
        while (i < n) {
            final View view = this.mSet[i];
            if (linearLayoutManager$LayoutState.mScrapList == null) {
                if (b) {
                    this.addView(view);
                }
                else {
                    this.addView(view, 0);
                }
            }
            else if (b) {
                this.addDisappearingView(view);
            }
            else {
                this.addDisappearingView(view, 0);
            }
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getSpanSize(recyclerView$Recycler, recyclerView$State, this.getPosition(view)) * this.mSizePerSpan, 1073741824);
            final GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = (GridLayoutManager$LayoutParams)view.getLayoutParams();
            if (this.mOrientation == 1) {
                this.measureChildWithDecorationsAndMargin(view, measureSpec, this.getMainDirSpec(gridLayoutManager$LayoutParams.height));
            }
            else {
                this.measureChildWithDecorationsAndMargin(view, this.getMainDirSpec(gridLayoutManager$LayoutParams.width), measureSpec);
            }
            int decoratedMeasurement = this.mOrientationHelper.getDecoratedMeasurement(view);
            if (decoratedMeasurement <= mConsumed) {
                decoratedMeasurement = mConsumed;
            }
            ++i;
            mConsumed = decoratedMeasurement;
        }
        final int mainDirSpec = this.getMainDirSpec(mConsumed);
        for (int j = 0; j < n; ++j) {
            final View view2 = this.mSet[j];
            if (this.mOrientationHelper.getDecoratedMeasurement(view2) != mConsumed) {
                final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.getSpanSize(recyclerView$Recycler, recyclerView$State, this.getPosition(view2)) * this.mSizePerSpan, 1073741824);
                if (this.mOrientation == 1) {
                    this.measureChildWithDecorationsAndMargin(view2, measureSpec2, mainDirSpec);
                }
                else {
                    this.measureChildWithDecorationsAndMargin(view2, mainDirSpec, measureSpec2);
                }
            }
        }
        linearLayoutManager$LayoutChunkResult.mConsumed = mConsumed;
        int mOffset;
        int n3;
        int n4;
        int mOffset2;
        if (this.mOrientation == 1) {
            if (linearLayoutManager$LayoutState.mLayoutDirection == -1) {
                mOffset = linearLayoutManager$LayoutState.mOffset;
                n3 = mOffset - mConsumed;
                n4 = 0;
                mOffset2 = 0;
            }
            else {
                final int mOffset3 = linearLayoutManager$LayoutState.mOffset;
                mOffset = mOffset3 + mConsumed;
                n3 = mOffset3;
                n4 = 0;
                mOffset2 = 0;
            }
        }
        else if (linearLayoutManager$LayoutState.mLayoutDirection == -1) {
            final int mOffset4 = linearLayoutManager$LayoutState.mOffset;
            final int n5 = mOffset4 - mConsumed;
            n4 = mOffset4;
            mOffset2 = n5;
            mOffset = 0;
            n3 = 0;
        }
        else {
            mOffset2 = linearLayoutManager$LayoutState.mOffset;
            n4 = mConsumed + mOffset2;
            mOffset = 0;
            n3 = 0;
        }
        int k = 0;
        int n6 = mOffset2;
        int n7 = n4;
        int n8 = n3;
        int n9 = mOffset;
        while (k < n) {
            final View view3 = this.mSet[k];
            final GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams2 = (GridLayoutManager$LayoutParams)view3.getLayoutParams();
            int n11;
            int n12;
            if (this.mOrientation == 1) {
                final int n10 = this.getPaddingLeft() + this.mSizePerSpan * gridLayoutManager$LayoutParams2.mSpanIndex;
                n11 = n10 + this.mOrientationHelper.getDecoratedMeasurementInOther(view3);
                n12 = n10;
            }
            else {
                n8 = this.getPaddingTop() + this.mSizePerSpan * gridLayoutManager$LayoutParams2.mSpanIndex;
                n9 = n8 + this.mOrientationHelper.getDecoratedMeasurementInOther(view3);
                n11 = n7;
                n12 = n6;
            }
            this.layoutDecorated(view3, n12 + gridLayoutManager$LayoutParams2.leftMargin, n8 + gridLayoutManager$LayoutParams2.topMargin, n11 - gridLayoutManager$LayoutParams2.rightMargin, n9 - gridLayoutManager$LayoutParams2.bottomMargin);
            if (gridLayoutManager$LayoutParams2.isItemRemoved() || gridLayoutManager$LayoutParams2.isItemChanged()) {
                linearLayoutManager$LayoutChunkResult.mIgnoreConsumed = true;
            }
            linearLayoutManager$LayoutChunkResult.mFocusable |= view3.isFocusable();
            ++k;
            n7 = n11;
            n6 = n12;
        }
        Arrays.fill(this.mSet, null);
    }
    
    @Override
    void onAnchorReady(final RecyclerView$State recyclerView$State, final LinearLayoutManager$AnchorInfo linearLayoutManager$AnchorInfo) {
        super.onAnchorReady(recyclerView$State, linearLayoutManager$AnchorInfo);
        this.updateMeasurements();
        if (recyclerView$State.getItemCount() > 0 && !recyclerView$State.isPreLayout()) {
            this.ensureAnchorIsInFirstSpan(linearLayoutManager$AnchorInfo);
        }
        if (this.mSet == null || this.mSet.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }
    
    @Override
    public void onInitializeAccessibilityNodeInfoForItem(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final View view, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof GridLayoutManager$LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        final GridLayoutManager$LayoutParams gridLayoutManager$LayoutParams = (GridLayoutManager$LayoutParams)layoutParams;
        final int spanGroupIndex = this.getSpanGroupIndex(recyclerView$Recycler, recyclerView$State, gridLayoutManager$LayoutParams.getViewPosition());
        if (this.mOrientation == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(gridLayoutManager$LayoutParams.getSpanIndex(), gridLayoutManager$LayoutParams.getSpanSize(), spanGroupIndex, 1, this.mSpanCount > 1 && gridLayoutManager$LayoutParams.getSpanSize() == this.mSpanCount, false));
            return;
        }
        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(spanGroupIndex, 1, gridLayoutManager$LayoutParams.getSpanIndex(), gridLayoutManager$LayoutParams.getSpanSize(), this.mSpanCount > 1 && gridLayoutManager$LayoutParams.getSpanSize() == this.mSpanCount, false));
    }
    
    @Override
    public void onItemsAdded(final RecyclerView recyclerView, final int n, final int n2) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }
    
    @Override
    public void onItemsChanged(final RecyclerView recyclerView) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }
    
    @Override
    public void onItemsMoved(final RecyclerView recyclerView, final int n, final int n2, final int n3) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }
    
    @Override
    public void onItemsRemoved(final RecyclerView recyclerView, final int n, final int n2) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }
    
    @Override
    public void onItemsUpdated(final RecyclerView recyclerView, final int n, final int n2) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }
    
    @Override
    public void onLayoutChildren(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        if (recyclerView$State.isPreLayout()) {
            this.cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(recyclerView$Recycler, recyclerView$State);
        this.clearPreLayoutSpanMappingCache();
    }
    
    public void setSpanCount(final int mSpanCount) {
        if (mSpanCount == this.mSpanCount) {
            return;
        }
        if (mSpanCount < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + mSpanCount);
        }
        this.mSpanCount = mSpanCount;
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }
    
    public void setSpanSizeLookup(final GridLayoutManager$SpanSizeLookup mSpanSizeLookup) {
        this.mSpanSizeLookup = mSpanSizeLookup;
    }
    
    @Override
    public void setStackFromEnd(final boolean b) {
        if (b) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }
    
    @Override
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }
}
