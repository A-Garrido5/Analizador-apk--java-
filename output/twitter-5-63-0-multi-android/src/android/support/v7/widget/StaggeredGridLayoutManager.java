// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import java.util.ArrayList;
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
import android.view.View;
import java.util.BitSet;

public class StaggeredGridLayoutManager extends RecyclerView$LayoutManager
{
    private static final boolean DEBUG = false;
    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_OFFSET = Integer.MIN_VALUE;
    public static final String TAG = "StaggeredGridLayoutManager";
    public static final int VERTICAL = 1;
    private final Runnable checkForGapsRunnable;
    private final StaggeredGridLayoutManager$AnchorInfo mAnchorInfo;
    private int mFullSizeSpec;
    private int mGapStrategy;
    private int mHeightSpec;
    private boolean mLaidOutInvalidFullSpan;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    private LayoutState mLayoutState;
    StaggeredGridLayoutManager$LazySpanLookup mLazySpanLookup;
    private int mOrientation;
    private StaggeredGridLayoutManager$SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    OrientationHelper mPrimaryOrientation;
    private BitSet mRemainingSpans;
    private boolean mReverseLayout;
    OrientationHelper mSecondaryOrientation;
    boolean mShouldReverseLayout;
    private int mSizePerSpan;
    private boolean mSmoothScrollbarEnabled;
    private int mSpanCount;
    private StaggeredGridLayoutManager$Span[] mSpans;
    private int mWidthSpec;
    
    public StaggeredGridLayoutManager(final int spanCount, final int mOrientation) {
        this.mSpanCount = -1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mLazySpanLookup = new StaggeredGridLayoutManager$LazySpanLookup();
        this.mGapStrategy = 2;
        this.mAnchorInfo = new StaggeredGridLayoutManager$AnchorInfo(this, null);
        this.mLaidOutInvalidFullSpan = false;
        this.mSmoothScrollbarEnabled = true;
        this.checkForGapsRunnable = new StaggeredGridLayoutManager$1(this);
        this.mOrientation = mOrientation;
        this.setSpanCount(spanCount);
    }
    
    private void appendViewToAllSpans(final View view) {
        for (int i = -1 + this.mSpanCount; i >= 0; --i) {
            this.mSpans[i].appendToSpan(view);
        }
    }
    
    private void applyPendingSavedState(final StaggeredGridLayoutManager$AnchorInfo staggeredGridLayoutManager$AnchorInfo) {
        if (this.mPendingSavedState.mSpanOffsetsSize > 0) {
            if (this.mPendingSavedState.mSpanOffsetsSize == this.mSpanCount) {
                for (int i = 0; i < this.mSpanCount; ++i) {
                    this.mSpans[i].clear();
                    int line = this.mPendingSavedState.mSpanOffsets[i];
                    if (line != Integer.MIN_VALUE) {
                        if (this.mPendingSavedState.mAnchorLayoutFromEnd) {
                            line += this.mPrimaryOrientation.getEndAfterPadding();
                        }
                        else {
                            line += this.mPrimaryOrientation.getStartAfterPadding();
                        }
                    }
                    this.mSpans[i].setLine(line);
                }
            }
            else {
                this.mPendingSavedState.invalidateSpanInfo();
                this.mPendingSavedState.mAnchorPosition = this.mPendingSavedState.mVisibleAnchorPosition;
            }
        }
        this.mLastLayoutRTL = this.mPendingSavedState.mLastLayoutRTL;
        this.setReverseLayout(this.mPendingSavedState.mReverseLayout);
        this.resolveShouldLayoutReverse();
        if (this.mPendingSavedState.mAnchorPosition != -1) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
            staggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd = this.mPendingSavedState.mAnchorLayoutFromEnd;
        }
        else {
            staggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd = this.mShouldReverseLayout;
        }
        if (this.mPendingSavedState.mSpanLookupSize > 1) {
            this.mLazySpanLookup.mData = this.mPendingSavedState.mSpanLookup;
            this.mLazySpanLookup.mFullSpanItems = this.mPendingSavedState.mFullSpanItems;
        }
    }
    
    private void attachViewToSpans(final View view, final StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams, final LayoutState layoutState) {
        if (layoutState.mLayoutDirection == 1) {
            if (staggeredGridLayoutManager$LayoutParams.mFullSpan) {
                this.appendViewToAllSpans(view);
                return;
            }
            staggeredGridLayoutManager$LayoutParams.mSpan.appendToSpan(view);
        }
        else {
            if (staggeredGridLayoutManager$LayoutParams.mFullSpan) {
                this.prependViewToAllSpans(view);
                return;
            }
            staggeredGridLayoutManager$LayoutParams.mSpan.prependToSpan(view);
        }
    }
    
    private int calculateScrollDirectionForPosition(final int n) {
        int n2 = -1;
        if (this.getChildCount() != 0) {
            if (n < this.getFirstChildPosition() == this.mShouldReverseLayout) {
                n2 = 1;
            }
            return n2;
        }
        if (this.mShouldReverseLayout) {
            return 1;
        }
        return n2;
    }
    
    private void checkForGaps() {
        if (this.getChildCount() != 0 && this.mGapStrategy != 0) {
            int n;
            int n2;
            if (this.mShouldReverseLayout) {
                final int lastChildPosition = this.getLastChildPosition();
                final int firstChildPosition = this.getFirstChildPosition();
                n = lastChildPosition;
                n2 = firstChildPosition;
            }
            else {
                final int firstChildPosition2 = this.getFirstChildPosition();
                final int lastChildPosition2 = this.getLastChildPosition();
                n = firstChildPosition2;
                n2 = lastChildPosition2;
            }
            if (n == 0 && this.hasGapsToFix() != null) {
                this.mLazySpanLookup.clear();
                this.requestSimpleAnimationsInNextLayout();
                this.requestLayout();
                return;
            }
            if (this.mLaidOutInvalidFullSpan) {
                int n3;
                if (this.mShouldReverseLayout) {
                    n3 = -1;
                }
                else {
                    n3 = 1;
                }
                final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem firstFullSpanItemInRange = this.mLazySpanLookup.getFirstFullSpanItemInRange(n, n2 + 1, n3);
                if (firstFullSpanItemInRange == null) {
                    this.mLaidOutInvalidFullSpan = false;
                    this.mLazySpanLookup.forceInvalidateAfter(n2 + 1);
                    return;
                }
                final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem firstFullSpanItemInRange2 = this.mLazySpanLookup.getFirstFullSpanItemInRange(n, firstFullSpanItemInRange.mPosition, n3 * -1);
                if (firstFullSpanItemInRange2 == null) {
                    this.mLazySpanLookup.forceInvalidateAfter(firstFullSpanItemInRange.mPosition);
                }
                else {
                    this.mLazySpanLookup.forceInvalidateAfter(1 + firstFullSpanItemInRange2.mPosition);
                }
                this.requestSimpleAnimationsInNextLayout();
                this.requestLayout();
            }
        }
    }
    
    private boolean checkSpanForGap(final StaggeredGridLayoutManager$Span staggeredGridLayoutManager$Span) {
        if (this.mShouldReverseLayout) {
            if (staggeredGridLayoutManager$Span.getEndLine() >= this.mPrimaryOrientation.getEndAfterPadding()) {
                return false;
            }
        }
        else if (staggeredGridLayoutManager$Span.getStartLine() <= this.mPrimaryOrientation.getStartAfterPadding()) {
            return false;
        }
        return true;
    }
    
    private int computeScrollExtent(final RecyclerView$State recyclerView$State) {
        boolean b = true;
        if (this.getChildCount() == 0) {
            return 0;
        }
        this.ensureOrientationHelper();
        final OrientationHelper mPrimaryOrientation = this.mPrimaryOrientation;
        final View firstVisibleItemClosestToStart = this.findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled && b);
        if (this.mSmoothScrollbarEnabled) {
            b = false;
        }
        return ScrollbarHelper.computeScrollExtent(recyclerView$State, mPrimaryOrientation, firstVisibleItemClosestToStart, this.findFirstVisibleItemClosestToEnd(b), this, this.mSmoothScrollbarEnabled);
    }
    
    private int computeScrollOffset(final RecyclerView$State recyclerView$State) {
        boolean b = true;
        if (this.getChildCount() == 0) {
            return 0;
        }
        this.ensureOrientationHelper();
        final OrientationHelper mPrimaryOrientation = this.mPrimaryOrientation;
        final View firstVisibleItemClosestToStart = this.findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled && b);
        if (this.mSmoothScrollbarEnabled) {
            b = false;
        }
        return ScrollbarHelper.computeScrollOffset(recyclerView$State, mPrimaryOrientation, firstVisibleItemClosestToStart, this.findFirstVisibleItemClosestToEnd(b), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }
    
    private int computeScrollRange(final RecyclerView$State recyclerView$State) {
        boolean b = true;
        if (this.getChildCount() == 0) {
            return 0;
        }
        this.ensureOrientationHelper();
        final OrientationHelper mPrimaryOrientation = this.mPrimaryOrientation;
        final View firstVisibleItemClosestToStart = this.findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled && b);
        if (this.mSmoothScrollbarEnabled) {
            b = false;
        }
        return ScrollbarHelper.computeScrollRange(recyclerView$State, mPrimaryOrientation, firstVisibleItemClosestToStart, this.findFirstVisibleItemClosestToEnd(b), this, this.mSmoothScrollbarEnabled);
    }
    
    private StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFullSpanItemFromEnd(final int n) {
        final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan = new int[this.mSpanCount];
        for (int i = 0; i < this.mSpanCount; ++i) {
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan[i] = n - this.mSpans[i].getEndLine(n);
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    }
    
    private StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFullSpanItemFromStart(final int n) {
        final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan = new int[this.mSpanCount];
        for (int i = 0; i < this.mSpanCount; ++i) {
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapPerSpan[i] = this.mSpans[i].getStartLine(n) - n;
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    }
    
    private void ensureOrientationHelper() {
        if (this.mPrimaryOrientation == null) {
            this.mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, this.mOrientation);
            this.mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - this.mOrientation);
            this.mLayoutState = new LayoutState();
        }
    }
    
    private int fill(final RecyclerView$Recycler recyclerView$Recycler, final LayoutState layoutState, final RecyclerView$State recyclerView$State) {
        this.mRemainingSpans.set(0, this.mSpanCount, true);
        int n3;
        int n4;
        if (layoutState.mLayoutDirection == 1) {
            final int n = this.mPrimaryOrientation.getEndAfterPadding() + this.mLayoutState.mAvailable;
            final int n2 = n + this.mLayoutState.mExtra + this.mPrimaryOrientation.getEndPadding();
            n3 = n;
            n4 = n2;
        }
        else {
            final int n5 = this.mPrimaryOrientation.getStartAfterPadding() - this.mLayoutState.mAvailable;
            final int n6 = n5 - this.mLayoutState.mExtra - this.mPrimaryOrientation.getStartAfterPadding();
            n3 = n5;
            n4 = n6;
        }
        this.updateAllRemainingSpans(layoutState.mLayoutDirection, n4);
        int n7;
        if (this.mShouldReverseLayout) {
            n7 = this.mPrimaryOrientation.getEndAfterPadding();
        }
        else {
            n7 = this.mPrimaryOrientation.getStartAfterPadding();
        }
        while (layoutState.hasMore(recyclerView$State) && !this.mRemainingSpans.isEmpty()) {
            final View next = layoutState.next(recyclerView$Recycler);
            final StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = (StaggeredGridLayoutManager$LayoutParams)next.getLayoutParams();
            if (layoutState.mLayoutDirection == 1) {
                this.addView(next);
            }
            else {
                this.addView(next, 0);
            }
            this.measureChildWithDecorationsAndMargin(next, staggeredGridLayoutManager$LayoutParams);
            final int viewPosition = staggeredGridLayoutManager$LayoutParams.getViewPosition();
            final int span = this.mLazySpanLookup.getSpan(viewPosition);
            boolean b;
            if (span == -1) {
                b = true;
            }
            else {
                b = false;
            }
            StaggeredGridLayoutManager$Span mSpan;
            if (b) {
                StaggeredGridLayoutManager$Span nextSpan;
                if (staggeredGridLayoutManager$LayoutParams.mFullSpan) {
                    nextSpan = this.mSpans[0];
                }
                else {
                    nextSpan = this.getNextSpan(layoutState);
                }
                this.mLazySpanLookup.setSpan(viewPosition, nextSpan);
                mSpan = nextSpan;
            }
            else {
                mSpan = this.mSpans[span];
            }
            int n9;
            int n10;
            if (layoutState.mLayoutDirection == 1) {
                int n8;
                if (staggeredGridLayoutManager$LayoutParams.mFullSpan) {
                    n8 = this.getMaxEnd(n7);
                }
                else {
                    n8 = mSpan.getEndLine(n7);
                }
                n9 = n8 + this.mPrimaryOrientation.getDecoratedMeasurement(next);
                if (b && staggeredGridLayoutManager$LayoutParams.mFullSpan) {
                    final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem fullSpanItemFromEnd = this.createFullSpanItemFromEnd(n8);
                    fullSpanItemFromEnd.mGapDir = -1;
                    fullSpanItemFromEnd.mPosition = viewPosition;
                    this.mLazySpanLookup.addFullSpanItem(fullSpanItemFromEnd);
                    n10 = n8;
                }
                else {
                    n10 = n8;
                }
            }
            else {
                int n11;
                if (staggeredGridLayoutManager$LayoutParams.mFullSpan) {
                    n11 = this.getMinStart(n7);
                }
                else {
                    n11 = mSpan.getStartLine(n7);
                }
                n10 = n11 - this.mPrimaryOrientation.getDecoratedMeasurement(next);
                if (b && staggeredGridLayoutManager$LayoutParams.mFullSpan) {
                    final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem fullSpanItemFromStart = this.createFullSpanItemFromStart(n11);
                    fullSpanItemFromStart.mGapDir = 1;
                    fullSpanItemFromStart.mPosition = viewPosition;
                    this.mLazySpanLookup.addFullSpanItem(fullSpanItemFromStart);
                }
                n9 = n11;
            }
            if (staggeredGridLayoutManager$LayoutParams.mFullSpan && layoutState.mItemDirection == -1 && b) {
                this.mLaidOutInvalidFullSpan = true;
            }
            staggeredGridLayoutManager$LayoutParams.mSpan = mSpan;
            this.attachViewToSpans(next, staggeredGridLayoutManager$LayoutParams, layoutState);
            int startAfterPadding;
            if (staggeredGridLayoutManager$LayoutParams.mFullSpan) {
                startAfterPadding = this.mSecondaryOrientation.getStartAfterPadding();
            }
            else {
                startAfterPadding = mSpan.mIndex * this.mSizePerSpan + this.mSecondaryOrientation.getStartAfterPadding();
            }
            final int n12 = startAfterPadding + this.mSecondaryOrientation.getDecoratedMeasurement(next);
            if (this.mOrientation == 1) {
                this.layoutDecoratedWithMargins(next, startAfterPadding, n10, n12, n9);
            }
            else {
                this.layoutDecoratedWithMargins(next, n10, startAfterPadding, n9, n12);
            }
            if (staggeredGridLayoutManager$LayoutParams.mFullSpan) {
                this.updateAllRemainingSpans(this.mLayoutState.mLayoutDirection, n4);
            }
            else {
                this.updateRemainingSpans(mSpan, this.mLayoutState.mLayoutDirection, n4);
            }
            this.recycle(recyclerView$Recycler, this.mLayoutState, mSpan, n3);
        }
        if (this.mLayoutState.mLayoutDirection == -1) {
            return Math.max(0, this.mLayoutState.mAvailable + (n3 - this.getMinStart(this.mPrimaryOrientation.getStartAfterPadding())));
        }
        return Math.max(0, this.mLayoutState.mAvailable + (this.getMaxEnd(this.mPrimaryOrientation.getEndAfterPadding()) - n3));
    }
    
    private int findFirstReferenceChildPosition(final int n) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final int position = this.getPosition(this.getChildAt(i));
            if (position >= 0 && position < n) {
                return position;
            }
        }
        return 0;
    }
    
    private int findLastReferenceChildPosition(final int n) {
        for (int i = -1 + this.getChildCount(); i >= 0; --i) {
            final int position = this.getPosition(this.getChildAt(i));
            if (position >= 0 && position < n) {
                return position;
            }
        }
        return 0;
    }
    
    private void fixEndGap(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final boolean b) {
        final int n = this.mPrimaryOrientation.getEndAfterPadding() - this.getMaxEnd(this.mPrimaryOrientation.getEndAfterPadding());
        if (n > 0) {
            final int n2 = n - -this.scrollBy(-n, recyclerView$Recycler, recyclerView$State);
            if (b && n2 > 0) {
                this.mPrimaryOrientation.offsetChildren(n2);
            }
        }
    }
    
    private void fixStartGap(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final boolean b) {
        final int n = this.getMinStart(this.mPrimaryOrientation.getStartAfterPadding()) - this.mPrimaryOrientation.getStartAfterPadding();
        if (n > 0) {
            final int n2 = n - this.scrollBy(n, recyclerView$Recycler, recyclerView$State);
            if (b && n2 > 0) {
                this.mPrimaryOrientation.offsetChildren(-n2);
            }
        }
    }
    
    private int getFirstChildPosition() {
        if (this.getChildCount() == 0) {
            return 0;
        }
        return this.getPosition(this.getChildAt(0));
    }
    
    private int getLastChildPosition() {
        final int childCount = this.getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return this.getPosition(this.getChildAt(childCount - 1));
    }
    
    private int getMaxEnd(final int n) {
        int endLine = this.mSpans[0].getEndLine(n);
        for (int i = 1; i < this.mSpanCount; ++i) {
            final int endLine2 = this.mSpans[i].getEndLine(n);
            if (endLine2 > endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }
    
    private int getMaxStart(final int n) {
        int startLine = this.mSpans[0].getStartLine(n);
        for (int i = 1; i < this.mSpanCount; ++i) {
            final int startLine2 = this.mSpans[i].getStartLine(n);
            if (startLine2 > startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }
    
    private int getMinEnd(final int n) {
        int endLine = this.mSpans[0].getEndLine(n);
        for (int i = 1; i < this.mSpanCount; ++i) {
            final int endLine2 = this.mSpans[i].getEndLine(n);
            if (endLine2 < endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }
    
    private int getMinStart(final int n) {
        int startLine = this.mSpans[0].getStartLine(n);
        for (int i = 1; i < this.mSpanCount; ++i) {
            final int startLine2 = this.mSpans[i].getStartLine(n);
            if (startLine2 < startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }
    
    private StaggeredGridLayoutManager$Span getNextSpan(final LayoutState layoutState) {
        StaggeredGridLayoutManager$Span staggeredGridLayoutManager$Span = null;
        int n = -1;
        int n2;
        int mSpanCount;
        if (this.preferLastSpan(layoutState.mLayoutDirection)) {
            n2 = -1 + this.mSpanCount;
            mSpanCount = n;
        }
        else {
            mSpanCount = this.mSpanCount;
            n = 1;
            n2 = 0;
        }
        if (layoutState.mLayoutDirection == 1) {
            final int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
            int i = n2;
            int n3 = Integer.MAX_VALUE;
            while (i != mSpanCount) {
                final StaggeredGridLayoutManager$Span staggeredGridLayoutManager$Span2 = this.mSpans[i];
                int endLine = staggeredGridLayoutManager$Span2.getEndLine(startAfterPadding);
                StaggeredGridLayoutManager$Span staggeredGridLayoutManager$Span3;
                if (endLine < n3) {
                    staggeredGridLayoutManager$Span3 = staggeredGridLayoutManager$Span2;
                }
                else {
                    endLine = n3;
                    staggeredGridLayoutManager$Span3 = staggeredGridLayoutManager$Span;
                }
                i += n;
                staggeredGridLayoutManager$Span = staggeredGridLayoutManager$Span3;
                n3 = endLine;
            }
        }
        else {
            final int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
            int j = n2;
            int n4 = Integer.MIN_VALUE;
            while (j != mSpanCount) {
                final StaggeredGridLayoutManager$Span staggeredGridLayoutManager$Span4 = this.mSpans[j];
                int startLine = staggeredGridLayoutManager$Span4.getStartLine(endAfterPadding);
                StaggeredGridLayoutManager$Span staggeredGridLayoutManager$Span5;
                if (startLine > n4) {
                    staggeredGridLayoutManager$Span5 = staggeredGridLayoutManager$Span4;
                }
                else {
                    startLine = n4;
                    staggeredGridLayoutManager$Span5 = staggeredGridLayoutManager$Span;
                }
                j += n;
                staggeredGridLayoutManager$Span = staggeredGridLayoutManager$Span5;
                n4 = startLine;
            }
        }
        return staggeredGridLayoutManager$Span;
    }
    
    private void handleUpdate(final int n, final int n2, final int n3) {
        int n4;
        if (this.mShouldReverseLayout) {
            n4 = this.getLastChildPosition();
        }
        else {
            n4 = this.getFirstChildPosition();
        }
        this.mLazySpanLookup.invalidateAfter(n);
        switch (n3) {
            case 0: {
                this.mLazySpanLookup.offsetForAddition(n, n2);
                break;
            }
            case 1: {
                this.mLazySpanLookup.offsetForRemoval(n, n2);
                break;
            }
            case 3: {
                this.mLazySpanLookup.offsetForRemoval(n, 1);
                this.mLazySpanLookup.offsetForAddition(n2, 1);
                break;
            }
        }
        if (n + n2 > n4) {
            int n5;
            if (this.mShouldReverseLayout) {
                n5 = this.getFirstChildPosition();
            }
            else {
                n5 = this.getLastChildPosition();
            }
            if (n <= n5) {
                this.requestLayout();
            }
        }
    }
    
    private void layoutDecoratedWithMargins(final View view, final int n, final int n2, final int n3, final int n4) {
        final StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = (StaggeredGridLayoutManager$LayoutParams)view.getLayoutParams();
        this.layoutDecorated(view, n + staggeredGridLayoutManager$LayoutParams.leftMargin, n2 + staggeredGridLayoutManager$LayoutParams.topMargin, n3 - staggeredGridLayoutManager$LayoutParams.rightMargin, n4 - staggeredGridLayoutManager$LayoutParams.bottomMargin);
    }
    
    private void measureChildWithDecorationsAndMargin(final View view, final int n, final int n2) {
        final Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        final StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = (StaggeredGridLayoutManager$LayoutParams)view.getLayoutParams();
        view.measure(this.updateSpecWithExtra(n, staggeredGridLayoutManager$LayoutParams.leftMargin + itemDecorInsetsForChild.left, staggeredGridLayoutManager$LayoutParams.rightMargin + itemDecorInsetsForChild.right), this.updateSpecWithExtra(n2, staggeredGridLayoutManager$LayoutParams.topMargin + itemDecorInsetsForChild.top, staggeredGridLayoutManager$LayoutParams.bottomMargin + itemDecorInsetsForChild.bottom));
    }
    
    private void measureChildWithDecorationsAndMargin(final View view, final StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams) {
        if (!staggeredGridLayoutManager$LayoutParams.mFullSpan) {
            this.measureChildWithDecorationsAndMargin(view, this.mWidthSpec, this.mHeightSpec);
            return;
        }
        if (this.mOrientation == 1) {
            this.measureChildWithDecorationsAndMargin(view, this.mFullSizeSpec, this.mHeightSpec);
            return;
        }
        this.measureChildWithDecorationsAndMargin(view, this.mWidthSpec, this.mFullSizeSpec);
    }
    
    private boolean preferLastSpan(final int n) {
        if (this.mOrientation == 0) {
            if (n == -1 == this.mShouldReverseLayout) {
                return false;
            }
        }
        else if (n == -1 == this.mShouldReverseLayout != this.isLayoutRTL()) {
            return false;
        }
        return true;
    }
    
    private void prependViewToAllSpans(final View view) {
        for (int i = -1 + this.mSpanCount; i >= 0; --i) {
            this.mSpans[i].prependToSpan(view);
        }
    }
    
    private void recycle(final RecyclerView$Recycler recyclerView$Recycler, final LayoutState layoutState, final StaggeredGridLayoutManager$Span staggeredGridLayoutManager$Span, final int n) {
        if (layoutState.mLayoutDirection == -1) {
            this.recycleFromEnd(recyclerView$Recycler, Math.max(n, this.getMaxStart(staggeredGridLayoutManager$Span.getStartLine())) + (this.mPrimaryOrientation.getEnd() - this.mPrimaryOrientation.getStartAfterPadding()));
            return;
        }
        this.recycleFromStart(recyclerView$Recycler, Math.min(n, this.getMinEnd(staggeredGridLayoutManager$Span.getEndLine())) - (this.mPrimaryOrientation.getEnd() - this.mPrimaryOrientation.getStartAfterPadding()));
    }
    
    private void recycleFromEnd(final RecyclerView$Recycler recyclerView$Recycler, final int n) {
        for (int i = -1 + this.getChildCount(); i >= 0; --i) {
            final View child = this.getChildAt(i);
            if (this.mPrimaryOrientation.getDecoratedStart(child) <= n) {
                break;
            }
            final StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = (StaggeredGridLayoutManager$LayoutParams)child.getLayoutParams();
            if (staggeredGridLayoutManager$LayoutParams.mFullSpan) {
                for (int j = 0; j < this.mSpanCount; ++j) {
                    this.mSpans[j].popEnd();
                }
            }
            else {
                staggeredGridLayoutManager$LayoutParams.mSpan.popEnd();
            }
            this.removeAndRecycleView(child, recyclerView$Recycler);
        }
    }
    
    private void recycleFromStart(final RecyclerView$Recycler recyclerView$Recycler, final int n) {
        while (this.getChildCount() > 0) {
            final View child = this.getChildAt(0);
            if (this.mPrimaryOrientation.getDecoratedEnd(child) >= n) {
                break;
            }
            final StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = (StaggeredGridLayoutManager$LayoutParams)child.getLayoutParams();
            if (staggeredGridLayoutManager$LayoutParams.mFullSpan) {
                for (int i = 0; i < this.mSpanCount; ++i) {
                    this.mSpans[i].popStart();
                }
            }
            else {
                staggeredGridLayoutManager$LayoutParams.mSpan.popStart();
            }
            this.removeAndRecycleView(child, recyclerView$Recycler);
        }
    }
    
    private void resolveShouldLayoutReverse() {
        boolean mShouldReverseLayout = true;
        if (this.mOrientation == (mShouldReverseLayout ? 1 : 0) || !this.isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
            return;
        }
        if (this.mReverseLayout) {
            mShouldReverseLayout = false;
        }
        this.mShouldReverseLayout = mShouldReverseLayout;
    }
    
    private void updateAllRemainingSpans(final int n, final int n2) {
        for (int i = 0; i < this.mSpanCount; ++i) {
            if (!this.mSpans[i].mViews.isEmpty()) {
                this.updateRemainingSpans(this.mSpans[i], n, n2);
            }
        }
    }
    
    private boolean updateAnchorFromChildren(final RecyclerView$State recyclerView$State, final StaggeredGridLayoutManager$AnchorInfo staggeredGridLayoutManager$AnchorInfo) {
        int mPosition;
        if (this.mLastLayoutFromEnd) {
            mPosition = this.findLastReferenceChildPosition(recyclerView$State.getItemCount());
        }
        else {
            mPosition = this.findFirstReferenceChildPosition(recyclerView$State.getItemCount());
        }
        staggeredGridLayoutManager$AnchorInfo.mPosition = mPosition;
        staggeredGridLayoutManager$AnchorInfo.mOffset = Integer.MIN_VALUE;
        return true;
    }
    
    private void updateLayoutStateToFillEnd(final int mCurrentPosition, final RecyclerView$State recyclerView$State) {
        int n = 1;
        this.mLayoutState.mAvailable = 0;
        this.mLayoutState.mCurrentPosition = mCurrentPosition;
        if (this.isSmoothScrolling()) {
            if (this.mShouldReverseLayout == (recyclerView$State.getTargetScrollPosition() > mCurrentPosition && n)) {
                this.mLayoutState.mExtra = 0;
            }
            else {
                this.mLayoutState.mExtra = this.mPrimaryOrientation.getTotalSpace();
            }
        }
        else {
            this.mLayoutState.mExtra = 0;
        }
        this.mLayoutState.mLayoutDirection = n;
        final LayoutState mLayoutState = this.mLayoutState;
        if (this.mShouldReverseLayout) {
            n = -1;
        }
        mLayoutState.mItemDirection = n;
    }
    
    private void updateLayoutStateToFillStart(final int mCurrentPosition, final RecyclerView$State recyclerView$State) {
        int mItemDirection = 1;
        this.mLayoutState.mAvailable = 0;
        this.mLayoutState.mCurrentPosition = mCurrentPosition;
        if (this.isSmoothScrolling()) {
            if (this.mShouldReverseLayout == (recyclerView$State.getTargetScrollPosition() < mCurrentPosition && mItemDirection)) {
                this.mLayoutState.mExtra = 0;
            }
            else {
                this.mLayoutState.mExtra = this.mPrimaryOrientation.getTotalSpace();
            }
        }
        else {
            this.mLayoutState.mExtra = 0;
        }
        this.mLayoutState.mLayoutDirection = -1;
        final LayoutState mLayoutState = this.mLayoutState;
        if (!this.mShouldReverseLayout) {
            mItemDirection = -1;
        }
        mLayoutState.mItemDirection = mItemDirection;
    }
    
    private void updateRemainingSpans(final StaggeredGridLayoutManager$Span staggeredGridLayoutManager$Span, final int n, final int n2) {
        final int deletedSize = staggeredGridLayoutManager$Span.getDeletedSize();
        if (n == -1) {
            if (deletedSize + staggeredGridLayoutManager$Span.getStartLine() < n2) {
                this.mRemainingSpans.set(staggeredGridLayoutManager$Span.mIndex, false);
            }
        }
        else if (staggeredGridLayoutManager$Span.getEndLine() - deletedSize > n2) {
            this.mRemainingSpans.set(staggeredGridLayoutManager$Span.mIndex, false);
        }
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
    public void assertNotInLayoutOrScroll(final String s) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(s);
        }
    }
    
    @Override
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }
    
    @Override
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }
    
    @Override
    public boolean checkLayoutParams(final RecyclerView$LayoutParams recyclerView$LayoutParams) {
        return recyclerView$LayoutParams instanceof StaggeredGridLayoutManager$LayoutParams;
    }
    
    @Override
    public int computeHorizontalScrollExtent(final RecyclerView$State recyclerView$State) {
        return this.computeScrollExtent(recyclerView$State);
    }
    
    @Override
    public int computeHorizontalScrollOffset(final RecyclerView$State recyclerView$State) {
        return this.computeScrollOffset(recyclerView$State);
    }
    
    @Override
    public int computeHorizontalScrollRange(final RecyclerView$State recyclerView$State) {
        return this.computeScrollRange(recyclerView$State);
    }
    
    @Override
    public int computeVerticalScrollExtent(final RecyclerView$State recyclerView$State) {
        return this.computeScrollExtent(recyclerView$State);
    }
    
    @Override
    public int computeVerticalScrollOffset(final RecyclerView$State recyclerView$State) {
        return this.computeScrollOffset(recyclerView$State);
    }
    
    @Override
    public int computeVerticalScrollRange(final RecyclerView$State recyclerView$State) {
        return this.computeScrollRange(recyclerView$State);
    }
    
    public int[] findFirstCompletelyVisibleItemPositions(int[] array) {
        if (array == null) {
            array = new int[this.mSpanCount];
        }
        else if (array.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + array.length);
        }
        for (int i = 0; i < this.mSpanCount; ++i) {
            array[i] = this.mSpans[i].findFirstCompletelyVisibleItemPosition();
        }
        return array;
    }
    
    View findFirstVisibleItemClosestToEnd(final boolean b) {
        this.ensureOrientationHelper();
        final int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        final int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        for (int i = -1 + this.getChildCount(); i >= 0; --i) {
            final View child = this.getChildAt(i);
            if (this.mPrimaryOrientation.getDecoratedStart(child) >= startAfterPadding && (!b || this.mPrimaryOrientation.getDecoratedEnd(child) <= endAfterPadding)) {
                return child;
            }
        }
        return null;
    }
    
    View findFirstVisibleItemClosestToStart(final boolean b) {
        this.ensureOrientationHelper();
        final int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        final int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if ((!b || this.mPrimaryOrientation.getDecoratedStart(child) >= startAfterPadding) && this.mPrimaryOrientation.getDecoratedEnd(child) <= endAfterPadding) {
                return child;
            }
        }
        return null;
    }
    
    int findFirstVisibleItemPositionInt() {
        View view;
        if (this.mShouldReverseLayout) {
            view = this.findFirstVisibleItemClosestToEnd(true);
        }
        else {
            view = this.findFirstVisibleItemClosestToStart(true);
        }
        if (view == null) {
            return -1;
        }
        return this.getPosition(view);
    }
    
    public int[] findFirstVisibleItemPositions(int[] array) {
        if (array == null) {
            array = new int[this.mSpanCount];
        }
        else if (array.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + array.length);
        }
        for (int i = 0; i < this.mSpanCount; ++i) {
            array[i] = this.mSpans[i].findFirstVisibleItemPosition();
        }
        return array;
    }
    
    public int[] findLastCompletelyVisibleItemPositions(int[] array) {
        if (array == null) {
            array = new int[this.mSpanCount];
        }
        else if (array.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + array.length);
        }
        for (int i = 0; i < this.mSpanCount; ++i) {
            array[i] = this.mSpans[i].findLastCompletelyVisibleItemPosition();
        }
        return array;
    }
    
    public int[] findLastVisibleItemPositions(int[] array) {
        if (array == null) {
            array = new int[this.mSpanCount];
        }
        else if (array.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + array.length);
        }
        for (int i = 0; i < this.mSpanCount; ++i) {
            array[i] = this.mSpans[i].findLastVisibleItemPosition();
        }
        return array;
    }
    
    @Override
    public RecyclerView$LayoutParams generateDefaultLayoutParams() {
        return new StaggeredGridLayoutManager$LayoutParams(-2, -2);
    }
    
    @Override
    public RecyclerView$LayoutParams generateLayoutParams(final Context context, final AttributeSet set) {
        return new StaggeredGridLayoutManager$LayoutParams(context, set);
    }
    
    @Override
    public RecyclerView$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new StaggeredGridLayoutManager$LayoutParams((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new StaggeredGridLayoutManager$LayoutParams(viewGroup$LayoutParams);
    }
    
    @Override
    public int getColumnCountForAccessibility(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        return super.getColumnCountForAccessibility(recyclerView$Recycler, recyclerView$State);
    }
    
    public int getGapStrategy() {
        return this.mGapStrategy;
    }
    
    public int getOrientation() {
        return this.mOrientation;
    }
    
    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }
    
    @Override
    public int getRowCountForAccessibility(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        return super.getRowCountForAccessibility(recyclerView$Recycler, recyclerView$State);
    }
    
    public int getSpanCount() {
        return this.mSpanCount;
    }
    
    View hasGapsToFix() {
        final int n = -1 + this.getChildCount();
        final BitSet set = new BitSet(this.mSpanCount);
        set.set(0, this.mSpanCount, true);
        int n2;
        if (this.mOrientation == 1 && this.isLayoutRTL()) {
            n2 = 1;
        }
        else {
            n2 = -1;
        }
        int n3;
        int n4;
        if (this.mShouldReverseLayout) {
            n3 = n - 1;
            n4 = -1;
        }
        else {
            n4 = n;
            n3 = 0;
        }
        int n5;
        if (n3 < n4) {
            n5 = 1;
        }
        else {
            n5 = -1;
        }
    Label_0170:
        for (int i = n3; i != n4; i += n5) {
            final View child = this.getChildAt(i);
            final StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = (StaggeredGridLayoutManager$LayoutParams)child.getLayoutParams();
            if (set.get(staggeredGridLayoutManager$LayoutParams.mSpan.mIndex)) {
                if (this.checkSpanForGap(staggeredGridLayoutManager$LayoutParams.mSpan)) {
                    return child;
                }
                set.clear(staggeredGridLayoutManager$LayoutParams.mSpan.mIndex);
            }
            if (!staggeredGridLayoutManager$LayoutParams.mFullSpan && i + n5 != n4) {
                final View child2 = this.getChildAt(i + n5);
                while (true) {
                    Label_0364: {
                        int n6;
                        if (this.mShouldReverseLayout) {
                            final int decoratedEnd = this.mPrimaryOrientation.getDecoratedEnd(child);
                            final int decoratedEnd2 = this.mPrimaryOrientation.getDecoratedEnd(child2);
                            if (decoratedEnd < decoratedEnd2) {
                                return child;
                            }
                            if (decoratedEnd != decoratedEnd2) {
                                break Label_0364;
                            }
                            n6 = 1;
                        }
                        else {
                            final int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(child);
                            final int decoratedStart2 = this.mPrimaryOrientation.getDecoratedStart(child2);
                            if (decoratedStart > decoratedStart2) {
                                return child;
                            }
                            if (decoratedStart != decoratedStart2) {
                                break Label_0364;
                            }
                            n6 = 1;
                        }
                        if (n6 == 0) {
                            continue Label_0170;
                        }
                        int n7;
                        if (staggeredGridLayoutManager$LayoutParams.mSpan.mIndex - ((StaggeredGridLayoutManager$LayoutParams)child2.getLayoutParams()).mSpan.mIndex < 0) {
                            n7 = 1;
                        }
                        else {
                            n7 = 0;
                        }
                        int n8;
                        if (n2 < 0) {
                            n8 = 1;
                        }
                        else {
                            n8 = 0;
                        }
                        if (n7 != n8) {
                            return child;
                        }
                        continue Label_0170;
                    }
                    int n6 = 0;
                    continue;
                }
            }
        }
        return null;
    }
    
    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.clear();
        this.requestLayout();
    }
    
    boolean isLayoutRTL() {
        return this.getLayoutDirection() == 1;
    }
    
    @Override
    public void offsetChildrenHorizontal(final int n) {
        super.offsetChildrenHorizontal(n);
        for (int i = 0; i < this.mSpanCount; ++i) {
            this.mSpans[i].onOffset(n);
        }
    }
    
    @Override
    public void offsetChildrenVertical(final int n) {
        super.offsetChildrenVertical(n);
        for (int i = 0; i < this.mSpanCount; ++i) {
            this.mSpans[i].onOffset(n);
        }
    }
    
    @Override
    public void onDetachedFromWindow(final RecyclerView recyclerView, final RecyclerView$Recycler recyclerView$Recycler) {
        for (int i = 0; i < this.mSpanCount; ++i) {
            this.mSpans[i].clear();
        }
    }
    
    @Override
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.getChildCount() > 0) {
            final AccessibilityRecordCompat record = AccessibilityEventCompat.asRecord(accessibilityEvent);
            final View firstVisibleItemClosestToStart = this.findFirstVisibleItemClosestToStart(false);
            final View firstVisibleItemClosestToEnd = this.findFirstVisibleItemClosestToEnd(false);
            if (firstVisibleItemClosestToStart != null && firstVisibleItemClosestToEnd != null) {
                final int position = this.getPosition(firstVisibleItemClosestToStart);
                final int position2 = this.getPosition(firstVisibleItemClosestToEnd);
                if (position < position2) {
                    record.setFromIndex(position);
                    record.setToIndex(position2);
                    return;
                }
                record.setFromIndex(position2);
                record.setToIndex(position);
            }
        }
    }
    
    @Override
    public void onInitializeAccessibilityNodeInfoForItem(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final View view, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof StaggeredGridLayoutManager$LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        final StaggeredGridLayoutManager$LayoutParams staggeredGridLayoutManager$LayoutParams = (StaggeredGridLayoutManager$LayoutParams)layoutParams;
        if (this.mOrientation == 0) {
            final int spanIndex = staggeredGridLayoutManager$LayoutParams.getSpanIndex();
            int mSpanCount;
            if (staggeredGridLayoutManager$LayoutParams.mFullSpan) {
                mSpanCount = this.mSpanCount;
            }
            else {
                mSpanCount = 1;
            }
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(spanIndex, mSpanCount, -1, -1, staggeredGridLayoutManager$LayoutParams.mFullSpan, false));
            return;
        }
        final int spanIndex2 = staggeredGridLayoutManager$LayoutParams.getSpanIndex();
        int mSpanCount2;
        if (staggeredGridLayoutManager$LayoutParams.mFullSpan) {
            mSpanCount2 = this.mSpanCount;
        }
        else {
            mSpanCount2 = 1;
        }
        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(-1, -1, spanIndex2, mSpanCount2, staggeredGridLayoutManager$LayoutParams.mFullSpan, false));
    }
    
    @Override
    public void onItemsAdded(final RecyclerView recyclerView, final int n, final int n2) {
        this.handleUpdate(n, n2, 0);
    }
    
    @Override
    public void onItemsChanged(final RecyclerView recyclerView) {
        this.mLazySpanLookup.clear();
        this.requestLayout();
    }
    
    @Override
    public void onItemsMoved(final RecyclerView recyclerView, final int n, final int n2, final int n3) {
        this.handleUpdate(n, n2, 3);
    }
    
    @Override
    public void onItemsRemoved(final RecyclerView recyclerView, final int n, final int n2) {
        this.handleUpdate(n, n2, 1);
    }
    
    @Override
    public void onItemsUpdated(final RecyclerView recyclerView, final int n, final int n2) {
        this.handleUpdate(n, n2, 2);
    }
    
    @Override
    public void onLayoutChildren(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        this.ensureOrientationHelper();
        final StaggeredGridLayoutManager$AnchorInfo mAnchorInfo = this.mAnchorInfo;
        mAnchorInfo.reset();
        if (this.mPendingSavedState != null) {
            this.applyPendingSavedState(mAnchorInfo);
        }
        else {
            this.resolveShouldLayoutReverse();
            mAnchorInfo.mLayoutFromEnd = this.mShouldReverseLayout;
        }
        this.updateAnchorInfoForLayout(recyclerView$State, mAnchorInfo);
        if (this.mPendingSavedState == null && (mAnchorInfo.mLayoutFromEnd != this.mLastLayoutFromEnd || this.isLayoutRTL() != this.mLastLayoutRTL)) {
            this.mLazySpanLookup.clear();
            mAnchorInfo.mInvalidateOffsets = true;
        }
        if (this.getChildCount() > 0 && (this.mPendingSavedState == null || this.mPendingSavedState.mSpanOffsetsSize < 1)) {
            if (mAnchorInfo.mInvalidateOffsets) {
                for (int i = 0; i < this.mSpanCount; ++i) {
                    this.mSpans[i].clear();
                    if (mAnchorInfo.mOffset != Integer.MIN_VALUE) {
                        this.mSpans[i].setLine(mAnchorInfo.mOffset);
                    }
                }
            }
            else {
                for (int j = 0; j < this.mSpanCount; ++j) {
                    this.mSpans[j].cacheReferenceLineAndClear(this.mShouldReverseLayout, mAnchorInfo.mOffset);
                }
            }
        }
        this.detachAndScrapAttachedViews(recyclerView$Recycler);
        this.mLaidOutInvalidFullSpan = false;
        this.updateMeasureSpecs();
        if (mAnchorInfo.mLayoutFromEnd) {
            this.updateLayoutStateToFillStart(mAnchorInfo.mPosition, recyclerView$State);
            this.fill(recyclerView$Recycler, this.mLayoutState, recyclerView$State);
            this.updateLayoutStateToFillEnd(mAnchorInfo.mPosition, recyclerView$State);
            final LayoutState mLayoutState = this.mLayoutState;
            mLayoutState.mCurrentPosition += this.mLayoutState.mItemDirection;
            this.fill(recyclerView$Recycler, this.mLayoutState, recyclerView$State);
        }
        else {
            this.updateLayoutStateToFillEnd(mAnchorInfo.mPosition, recyclerView$State);
            this.fill(recyclerView$Recycler, this.mLayoutState, recyclerView$State);
            this.updateLayoutStateToFillStart(mAnchorInfo.mPosition, recyclerView$State);
            final LayoutState mLayoutState2 = this.mLayoutState;
            mLayoutState2.mCurrentPosition += this.mLayoutState.mItemDirection;
            this.fill(recyclerView$Recycler, this.mLayoutState, recyclerView$State);
        }
        if (this.getChildCount() > 0) {
            if (this.mShouldReverseLayout) {
                this.fixEndGap(recyclerView$Recycler, recyclerView$State, true);
                this.fixStartGap(recyclerView$Recycler, recyclerView$State, false);
            }
            else {
                this.fixStartGap(recyclerView$Recycler, recyclerView$State, true);
                this.fixEndGap(recyclerView$Recycler, recyclerView$State, false);
            }
        }
        if (!recyclerView$State.isPreLayout()) {
            if (this.getChildCount() > 0 && this.mPendingScrollPosition != -1 && this.mLaidOutInvalidFullSpan) {
                ViewCompat.postOnAnimation(this.getChildAt(0), this.checkForGapsRunnable);
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        this.mLastLayoutFromEnd = mAnchorInfo.mLayoutFromEnd;
        this.mLastLayoutRTL = this.isLayoutRTL();
        this.mPendingSavedState = null;
    }
    
    @Override
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (parcelable instanceof StaggeredGridLayoutManager$SavedState) {
            this.mPendingSavedState = (StaggeredGridLayoutManager$SavedState)parcelable;
            this.requestLayout();
        }
    }
    
    @Override
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return (Parcelable)new StaggeredGridLayoutManager$SavedState(this.mPendingSavedState);
        }
        final StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState = new StaggeredGridLayoutManager$SavedState();
        staggeredGridLayoutManager$SavedState.mReverseLayout = this.mReverseLayout;
        staggeredGridLayoutManager$SavedState.mAnchorLayoutFromEnd = this.mLastLayoutFromEnd;
        staggeredGridLayoutManager$SavedState.mLastLayoutRTL = this.mLastLayoutRTL;
        if (this.mLazySpanLookup != null && this.mLazySpanLookup.mData != null) {
            staggeredGridLayoutManager$SavedState.mSpanLookup = this.mLazySpanLookup.mData;
            staggeredGridLayoutManager$SavedState.mSpanLookupSize = staggeredGridLayoutManager$SavedState.mSpanLookup.length;
            staggeredGridLayoutManager$SavedState.mFullSpanItems = this.mLazySpanLookup.mFullSpanItems;
        }
        else {
            staggeredGridLayoutManager$SavedState.mSpanLookupSize = 0;
        }
        if (this.getChildCount() > 0) {
            this.ensureOrientationHelper();
            int mAnchorPosition;
            if (this.mLastLayoutFromEnd) {
                mAnchorPosition = this.getLastChildPosition();
            }
            else {
                mAnchorPosition = this.getFirstChildPosition();
            }
            staggeredGridLayoutManager$SavedState.mAnchorPosition = mAnchorPosition;
            staggeredGridLayoutManager$SavedState.mVisibleAnchorPosition = this.findFirstVisibleItemPositionInt();
            staggeredGridLayoutManager$SavedState.mSpanOffsetsSize = this.mSpanCount;
            staggeredGridLayoutManager$SavedState.mSpanOffsets = new int[this.mSpanCount];
            for (int i = 0; i < this.mSpanCount; ++i) {
                int n;
                if (this.mLastLayoutFromEnd) {
                    n = this.mSpans[i].getEndLine(Integer.MIN_VALUE);
                    if (n != Integer.MIN_VALUE) {
                        n -= this.mPrimaryOrientation.getEndAfterPadding();
                    }
                }
                else {
                    n = this.mSpans[i].getStartLine(Integer.MIN_VALUE);
                    if (n != Integer.MIN_VALUE) {
                        n -= this.mPrimaryOrientation.getStartAfterPadding();
                    }
                }
                staggeredGridLayoutManager$SavedState.mSpanOffsets[i] = n;
            }
        }
        else {
            staggeredGridLayoutManager$SavedState.mAnchorPosition = -1;
            staggeredGridLayoutManager$SavedState.mVisibleAnchorPosition = -1;
            staggeredGridLayoutManager$SavedState.mSpanOffsetsSize = 0;
        }
        return (Parcelable)staggeredGridLayoutManager$SavedState;
    }
    
    @Override
    public void onScrollStateChanged(final int n) {
        if (n == 0) {
            this.checkForGaps();
        }
    }
    
    int scrollBy(int n, final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        int n2 = 1;
        int n3 = -1;
        this.ensureOrientationHelper();
        int n4;
        if (n > 0) {
            this.mLayoutState.mLayoutDirection = n2;
            final LayoutState mLayoutState = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                n3 = n2;
            }
            mLayoutState.mItemDirection = n3;
            n4 = this.getLastChildPosition();
        }
        else {
            this.mLayoutState.mLayoutDirection = n3;
            final LayoutState mLayoutState2 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                n2 = n3;
            }
            mLayoutState2.mItemDirection = n2;
            n4 = this.getFirstChildPosition();
        }
        this.mLayoutState.mCurrentPosition = n4 + this.mLayoutState.mItemDirection;
        final int abs = Math.abs(n);
        this.mLayoutState.mAvailable = abs;
        final LayoutState mLayoutState3 = this.mLayoutState;
        int totalSpace;
        if (this.isSmoothScrolling()) {
            totalSpace = this.mPrimaryOrientation.getTotalSpace();
        }
        else {
            totalSpace = 0;
        }
        mLayoutState3.mExtra = totalSpace;
        final int fill = this.fill(recyclerView$Recycler, this.mLayoutState, recyclerView$State);
        if (abs >= fill) {
            if (n < 0) {
                n = -fill;
            }
            else {
                n = fill;
            }
        }
        this.mPrimaryOrientation.offsetChildren(-n);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        return n;
    }
    
    @Override
    public int scrollHorizontallyBy(final int n, final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        return this.scrollBy(n, recyclerView$Recycler, recyclerView$State);
    }
    
    @Override
    public void scrollToPosition(final int mPendingScrollPosition) {
        if (this.mPendingSavedState != null && this.mPendingSavedState.mAnchorPosition != mPendingScrollPosition) {
            this.mPendingSavedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = mPendingScrollPosition;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.requestLayout();
    }
    
    public void scrollToPositionWithOffset(final int mPendingScrollPosition, final int mPendingScrollPositionOffset) {
        if (this.mPendingSavedState != null) {
            this.mPendingSavedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = mPendingScrollPosition;
        this.mPendingScrollPositionOffset = mPendingScrollPositionOffset;
        this.requestLayout();
    }
    
    @Override
    public int scrollVerticallyBy(final int n, final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        return this.scrollBy(n, recyclerView$Recycler, recyclerView$State);
    }
    
    public void setGapStrategy(final int mGapStrategy) {
        this.assertNotInLayoutOrScroll(null);
        if (mGapStrategy == this.mGapStrategy) {
            return;
        }
        if (mGapStrategy != 0 && mGapStrategy != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.mGapStrategy = mGapStrategy;
        this.requestLayout();
    }
    
    public void setOrientation(final int mOrientation) {
        if (mOrientation != 0 && mOrientation != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        this.assertNotInLayoutOrScroll(null);
        if (mOrientation == this.mOrientation) {
            return;
        }
        this.mOrientation = mOrientation;
        if (this.mPrimaryOrientation != null && this.mSecondaryOrientation != null) {
            final OrientationHelper mPrimaryOrientation = this.mPrimaryOrientation;
            this.mPrimaryOrientation = this.mSecondaryOrientation;
            this.mSecondaryOrientation = mPrimaryOrientation;
        }
        this.requestLayout();
    }
    
    public void setReverseLayout(final boolean b) {
        this.assertNotInLayoutOrScroll(null);
        if (this.mPendingSavedState != null && this.mPendingSavedState.mReverseLayout != b) {
            this.mPendingSavedState.mReverseLayout = b;
        }
        this.mReverseLayout = b;
        this.requestLayout();
    }
    
    public void setSpanCount(final int mSpanCount) {
        this.assertNotInLayoutOrScroll(null);
        if (mSpanCount != this.mSpanCount) {
            this.invalidateSpanAssignments();
            this.mSpanCount = mSpanCount;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new StaggeredGridLayoutManager$Span[this.mSpanCount];
            for (int i = 0; i < this.mSpanCount; ++i) {
                this.mSpans[i] = new StaggeredGridLayoutManager$Span(this, i, null);
            }
            this.requestLayout();
        }
    }
    
    @Override
    public void smoothScrollToPosition(final RecyclerView recyclerView, final RecyclerView$State recyclerView$State, final int targetPosition) {
        final StaggeredGridLayoutManager$2 staggeredGridLayoutManager$2 = new StaggeredGridLayoutManager$2(this, recyclerView.getContext());
        staggeredGridLayoutManager$2.setTargetPosition(targetPosition);
        this.startSmoothScroll(staggeredGridLayoutManager$2);
    }
    
    @Override
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }
    
    boolean updateAnchorFromPendingData(final RecyclerView$State recyclerView$State, final StaggeredGridLayoutManager$AnchorInfo staggeredGridLayoutManager$AnchorInfo) {
        if (recyclerView$State.isPreLayout() || this.mPendingScrollPosition == -1) {
            return false;
        }
        if (this.mPendingScrollPosition < 0 || this.mPendingScrollPosition >= recyclerView$State.getItemCount()) {
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            return false;
        }
        if (this.mPendingSavedState != null && this.mPendingSavedState.mAnchorPosition != -1 && this.mPendingSavedState.mSpanOffsetsSize >= 1) {
            staggeredGridLayoutManager$AnchorInfo.mOffset = Integer.MIN_VALUE;
            staggeredGridLayoutManager$AnchorInfo.mPosition = this.mPendingScrollPosition;
            return true;
        }
        final View viewByPosition = this.findViewByPosition(this.mPendingScrollPosition);
        if (viewByPosition == null) {
            staggeredGridLayoutManager$AnchorInfo.mPosition = this.mPendingScrollPosition;
            if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                final int calculateScrollDirectionForPosition = this.calculateScrollDirectionForPosition(staggeredGridLayoutManager$AnchorInfo.mPosition);
                boolean mLayoutFromEnd = false;
                if (calculateScrollDirectionForPosition == 1) {
                    mLayoutFromEnd = true;
                }
                staggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd = mLayoutFromEnd;
                staggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding();
            }
            else {
                staggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding(this.mPendingScrollPositionOffset);
            }
            return staggeredGridLayoutManager$AnchorInfo.mInvalidateOffsets = true;
        }
        int mPosition;
        if (this.mShouldReverseLayout) {
            mPosition = this.getLastChildPosition();
        }
        else {
            mPosition = this.getFirstChildPosition();
        }
        staggeredGridLayoutManager$AnchorInfo.mPosition = mPosition;
        if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
            if (staggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd) {
                staggeredGridLayoutManager$AnchorInfo.mOffset = this.mPrimaryOrientation.getEndAfterPadding() - this.mPendingScrollPositionOffset - this.mPrimaryOrientation.getDecoratedEnd(viewByPosition);
                return true;
            }
            staggeredGridLayoutManager$AnchorInfo.mOffset = this.mPrimaryOrientation.getStartAfterPadding() + this.mPendingScrollPositionOffset - this.mPrimaryOrientation.getDecoratedStart(viewByPosition);
            return true;
        }
        else {
            if (this.mPrimaryOrientation.getDecoratedMeasurement(viewByPosition) > this.mPrimaryOrientation.getTotalSpace()) {
                int mOffset;
                if (staggeredGridLayoutManager$AnchorInfo.mLayoutFromEnd) {
                    mOffset = this.mPrimaryOrientation.getEndAfterPadding();
                }
                else {
                    mOffset = this.mPrimaryOrientation.getStartAfterPadding();
                }
                staggeredGridLayoutManager$AnchorInfo.mOffset = mOffset;
                return true;
            }
            final int n = this.mPrimaryOrientation.getDecoratedStart(viewByPosition) - this.mPrimaryOrientation.getStartAfterPadding();
            if (n < 0) {
                staggeredGridLayoutManager$AnchorInfo.mOffset = -n;
                return true;
            }
            final int mOffset2 = this.mPrimaryOrientation.getEndAfterPadding() - this.mPrimaryOrientation.getDecoratedEnd(viewByPosition);
            if (mOffset2 < 0) {
                staggeredGridLayoutManager$AnchorInfo.mOffset = mOffset2;
                return true;
            }
            staggeredGridLayoutManager$AnchorInfo.mOffset = Integer.MIN_VALUE;
            return true;
        }
    }
    
    void updateAnchorInfoForLayout(final RecyclerView$State recyclerView$State, final StaggeredGridLayoutManager$AnchorInfo staggeredGridLayoutManager$AnchorInfo) {
        if (!this.updateAnchorFromPendingData(recyclerView$State, staggeredGridLayoutManager$AnchorInfo) && !this.updateAnchorFromChildren(recyclerView$State, staggeredGridLayoutManager$AnchorInfo)) {
            staggeredGridLayoutManager$AnchorInfo.assignCoordinateFromPadding();
            staggeredGridLayoutManager$AnchorInfo.mPosition = 0;
        }
    }
    
    void updateMeasureSpecs() {
        this.mSizePerSpan = this.mSecondaryOrientation.getTotalSpace() / this.mSpanCount;
        this.mFullSizeSpec = View$MeasureSpec.makeMeasureSpec(this.mSecondaryOrientation.getTotalSpace(), 1073741824);
        if (this.mOrientation == 1) {
            this.mWidthSpec = View$MeasureSpec.makeMeasureSpec(this.mSizePerSpan, 1073741824);
            this.mHeightSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            return;
        }
        this.mHeightSpec = View$MeasureSpec.makeMeasureSpec(this.mSizePerSpan, 1073741824);
        this.mWidthSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
    }
}
