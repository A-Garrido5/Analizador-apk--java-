// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$MeasureSpec;
import android.graphics.Rect;
import java.util.BitSet;
import android.view.View;
import java.util.ArrayList;

class StaggeredGridLayoutManager$Span
{
    static final int INVALID_LINE = Integer.MIN_VALUE;
    int mCachedEnd;
    int mCachedStart;
    int mDeletedSize;
    final int mIndex;
    private ArrayList mViews;
    final /* synthetic */ StaggeredGridLayoutManager this$0;
    
    private StaggeredGridLayoutManager$Span(final StaggeredGridLayoutManager this$0, final int mIndex) {
        this.this$0 = this$0;
        this.mViews = new ArrayList();
        this.mCachedStart = Integer.MIN_VALUE;
        this.mCachedEnd = Integer.MIN_VALUE;
        this.mDeletedSize = 0;
        this.mIndex = mIndex;
    }
    
    void appendToSpan(final View view) {
        final StaggeredGridLayoutManager$LayoutParams layoutParams = this.getLayoutParams(view);
        layoutParams.mSpan = this;
        this.mViews.add(view);
        this.mCachedEnd = Integer.MIN_VALUE;
        if (this.mViews.size() == 1) {
            this.mCachedStart = Integer.MIN_VALUE;
        }
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.mDeletedSize += this.this$0.mPrimaryOrientation.getDecoratedMeasurement(view);
        }
    }
    
    void cacheReferenceLineAndClear(final boolean b, final int n) {
        int n2;
        if (b) {
            n2 = this.getEndLine(Integer.MIN_VALUE);
        }
        else {
            n2 = this.getStartLine(Integer.MIN_VALUE);
        }
        this.clear();
        if (n2 != Integer.MIN_VALUE && (!b || n2 >= this.this$0.mPrimaryOrientation.getEndAfterPadding()) && (b || n2 <= this.this$0.mPrimaryOrientation.getStartAfterPadding())) {
            if (n != Integer.MIN_VALUE) {
                n2 += n;
            }
            this.mCachedEnd = n2;
            this.mCachedStart = n2;
        }
    }
    
    void calculateCachedEnd() {
        final View view = this.mViews.get(-1 + this.mViews.size());
        final StaggeredGridLayoutManager$LayoutParams layoutParams = this.getLayoutParams(view);
        this.mCachedEnd = this.this$0.mPrimaryOrientation.getDecoratedEnd(view);
        if (layoutParams.mFullSpan) {
            final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem fullSpanItem = this.this$0.mLazySpanLookup.getFullSpanItem(layoutParams.getViewPosition());
            if (fullSpanItem != null && fullSpanItem.mGapDir == 1) {
                this.mCachedEnd += fullSpanItem.getGapForSpan(this.mIndex);
            }
        }
    }
    
    void calculateCachedStart() {
        final View view = this.mViews.get(0);
        final StaggeredGridLayoutManager$LayoutParams layoutParams = this.getLayoutParams(view);
        this.mCachedStart = this.this$0.mPrimaryOrientation.getDecoratedStart(view);
        if (layoutParams.mFullSpan) {
            final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem fullSpanItem = this.this$0.mLazySpanLookup.getFullSpanItem(layoutParams.getViewPosition());
            if (fullSpanItem != null && fullSpanItem.mGapDir == -1) {
                this.mCachedStart -= fullSpanItem.getGapForSpan(this.mIndex);
            }
        }
    }
    
    void clear() {
        this.mViews.clear();
        this.invalidateCache();
        this.mDeletedSize = 0;
    }
    
    public int findFirstCompletelyVisibleItemPosition() {
        if (this.this$0.mReverseLayout) {
            return this.findOneVisibleChild(-1 + this.mViews.size(), -1, true);
        }
        return this.findOneVisibleChild(0, this.mViews.size(), true);
    }
    
    public int findFirstVisibleItemPosition() {
        if (this.this$0.mReverseLayout) {
            return this.findOneVisibleChild(-1 + this.mViews.size(), -1, false);
        }
        return this.findOneVisibleChild(0, this.mViews.size(), false);
    }
    
    public int findLastCompletelyVisibleItemPosition() {
        if (this.this$0.mReverseLayout) {
            return this.findOneVisibleChild(0, this.mViews.size(), true);
        }
        return this.findOneVisibleChild(-1 + this.mViews.size(), -1, true);
    }
    
    public int findLastVisibleItemPosition() {
        if (this.this$0.mReverseLayout) {
            return this.findOneVisibleChild(0, this.mViews.size(), false);
        }
        return this.findOneVisibleChild(-1 + this.mViews.size(), -1, false);
    }
    
    int findOneVisibleChild(int i, final int n, final boolean b) {
        int position = -1;
        final int startAfterPadding = this.this$0.mPrimaryOrientation.getStartAfterPadding();
        final int endAfterPadding = this.this$0.mPrimaryOrientation.getEndAfterPadding();
        int n2;
        if (n > i) {
            n2 = 1;
        }
        else {
            n2 = position;
        }
        while (i != n) {
            final View view = this.mViews.get(i);
            final int decoratedStart = this.this$0.mPrimaryOrientation.getDecoratedStart(view);
            final int decoratedEnd = this.this$0.mPrimaryOrientation.getDecoratedEnd(view);
            if (decoratedStart < endAfterPadding && decoratedEnd > startAfterPadding) {
                if (!b) {
                    return this.this$0.getPosition(view);
                }
                if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                    position = this.this$0.getPosition(view);
                    break;
                }
            }
            i += n2;
        }
        return position;
    }
    
    public int getDeletedSize() {
        return this.mDeletedSize;
    }
    
    int getEndLine() {
        if (this.mCachedEnd != Integer.MIN_VALUE) {
            return this.mCachedEnd;
        }
        this.calculateCachedEnd();
        return this.mCachedEnd;
    }
    
    int getEndLine(int mCachedEnd) {
        if (this.mCachedEnd != Integer.MIN_VALUE) {
            mCachedEnd = this.mCachedEnd;
        }
        else if (this.mViews.size() != 0) {
            this.calculateCachedEnd();
            return this.mCachedEnd;
        }
        return mCachedEnd;
    }
    
    StaggeredGridLayoutManager$LayoutParams getLayoutParams(final View view) {
        return (StaggeredGridLayoutManager$LayoutParams)view.getLayoutParams();
    }
    
    int getNormalizedOffset(int n, final int n2, final int n3) {
        if (this.mViews.size() == 0) {
            n = 0;
        }
        else if (n < 0) {
            final int n4 = this.getEndLine() - n3;
            if (n4 <= 0) {
                return 0;
            }
            if (-n > n4) {
                return -n4;
            }
        }
        else {
            final int n5 = n2 - this.getStartLine();
            if (n5 <= 0) {
                return 0;
            }
            if (n5 < n) {
                return n5;
            }
        }
        return n;
    }
    
    int getStartLine() {
        if (this.mCachedStart != Integer.MIN_VALUE) {
            return this.mCachedStart;
        }
        this.calculateCachedStart();
        return this.mCachedStart;
    }
    
    int getStartLine(int mCachedStart) {
        if (this.mCachedStart != Integer.MIN_VALUE) {
            mCachedStart = this.mCachedStart;
        }
        else if (this.mViews.size() != 0) {
            this.calculateCachedStart();
            return this.mCachedStart;
        }
        return mCachedStart;
    }
    
    void invalidateCache() {
        this.mCachedStart = Integer.MIN_VALUE;
        this.mCachedEnd = Integer.MIN_VALUE;
    }
    
    boolean isEmpty(final int n, final int n2) {
        for (int size = this.mViews.size(), i = 0; i < size; ++i) {
            final View view = this.mViews.get(i);
            if (this.this$0.mPrimaryOrientation.getDecoratedStart(view) < n2 && this.this$0.mPrimaryOrientation.getDecoratedEnd(view) > n) {
                return false;
            }
        }
        return true;
    }
    
    void onOffset(final int n) {
        if (this.mCachedStart != Integer.MIN_VALUE) {
            this.mCachedStart += n;
        }
        if (this.mCachedEnd != Integer.MIN_VALUE) {
            this.mCachedEnd += n;
        }
    }
    
    void popEnd() {
        final int size = this.mViews.size();
        final View view = this.mViews.remove(size - 1);
        final StaggeredGridLayoutManager$LayoutParams layoutParams = this.getLayoutParams(view);
        layoutParams.mSpan = null;
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.mDeletedSize -= this.this$0.mPrimaryOrientation.getDecoratedMeasurement(view);
        }
        if (size == 1) {
            this.mCachedStart = Integer.MIN_VALUE;
        }
        this.mCachedEnd = Integer.MIN_VALUE;
    }
    
    void popStart() {
        final View view = this.mViews.remove(0);
        final StaggeredGridLayoutManager$LayoutParams layoutParams = this.getLayoutParams(view);
        layoutParams.mSpan = null;
        if (this.mViews.size() == 0) {
            this.mCachedEnd = Integer.MIN_VALUE;
        }
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.mDeletedSize -= this.this$0.mPrimaryOrientation.getDecoratedMeasurement(view);
        }
        this.mCachedStart = Integer.MIN_VALUE;
    }
    
    void prependToSpan(final View view) {
        final StaggeredGridLayoutManager$LayoutParams layoutParams = this.getLayoutParams(view);
        layoutParams.mSpan = this;
        this.mViews.add(0, view);
        this.mCachedStart = Integer.MIN_VALUE;
        if (this.mViews.size() == 1) {
            this.mCachedEnd = Integer.MIN_VALUE;
        }
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.mDeletedSize += this.this$0.mPrimaryOrientation.getDecoratedMeasurement(view);
        }
    }
    
    void setLine(final int n) {
        this.mCachedStart = n;
        this.mCachedEnd = n;
    }
}
