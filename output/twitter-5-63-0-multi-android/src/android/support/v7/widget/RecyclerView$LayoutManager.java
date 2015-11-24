// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.view.ViewParent;
import android.view.FocusFinder;
import android.graphics.Canvas;
import android.support.v4.util.SimpleArrayMap;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import android.view.VelocityTracker;
import java.util.List;
import android.support.v4.widget.EdgeEffectCompat;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.view.ViewGroup;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import android.support.v4.view.ViewCompat;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.View;
import android.support.annotation.Nullable;

public abstract class RecyclerView$LayoutManager
{
    ChildHelper mChildHelper;
    RecyclerView mRecyclerView;
    private boolean mRequestedSimpleAnimations;
    @Nullable
    RecyclerView$SmoothScroller mSmoothScroller;
    
    public RecyclerView$LayoutManager() {
        this.mRequestedSimpleAnimations = false;
    }
    
    private void addViewInt(final View view, int childCount, final boolean b) {
        final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (b || childViewHolderInt.isRemoved()) {
            this.mRecyclerView.addToDisappearingList(view);
        }
        else {
            this.mRecyclerView.removeFromDisappearingList(view);
        }
        final RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            }
            else {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.attachViewToParent(view, childCount, view.getLayoutParams(), false);
        }
        else if (view.getParent() == this.mRecyclerView) {
            final int indexOfChild = this.mChildHelper.indexOfChild(view);
            if (childCount == -1) {
                childCount = this.mChildHelper.getChildCount();
            }
            if (indexOfChild == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view));
            }
            if (indexOfChild != childCount) {
                this.mRecyclerView.mLayout.moveView(indexOfChild, childCount);
            }
        }
        else {
            this.mChildHelper.addView(view, childCount, false);
            recyclerView$LayoutParams.mInsetsDirty = true;
            if (this.mSmoothScroller != null && this.mSmoothScroller.isRunning()) {
                this.mSmoothScroller.onChildAttachedToWindow(view);
            }
        }
        if (recyclerView$LayoutParams.mPendingInvalidate) {
            childViewHolderInt.itemView.invalidate();
            recyclerView$LayoutParams.mPendingInvalidate = false;
        }
    }
    
    private void detachViewInternal(final int n, final View view) {
        this.mChildHelper.detachViewFromParent(n);
    }
    
    public static int getChildMeasureSpec(final int n, final int n2, int n3, final boolean b) {
        int n4 = 1073741824;
        final int max = Math.max(0, n - n2);
        if (b) {
            if (n3 < 0) {
                n4 = 0;
                n3 = 0;
            }
        }
        else if (n3 < 0) {
            if (n3 == -1) {
                n3 = max;
            }
            else if (n3 == -2) {
                n4 = Integer.MIN_VALUE;
                n3 = max;
            }
            else {
                n4 = 0;
                n3 = 0;
            }
        }
        return View$MeasureSpec.makeMeasureSpec(n3, n4);
    }
    
    private void onSmoothScrollerStopped(final RecyclerView$SmoothScroller recyclerView$SmoothScroller) {
        if (this.mSmoothScroller == recyclerView$SmoothScroller) {
            this.mSmoothScroller = null;
        }
    }
    
    private void scrapOrRecycleView(final RecyclerView$Recycler recyclerView$Recycler, final int n, final View view) {
        final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.shouldIgnore()) {
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !childViewHolderInt.isChanged() && !this.mRecyclerView.mAdapter.hasStableIds()) {
            this.removeViewAt(n);
            recyclerView$Recycler.recycleViewHolderInternal(childViewHolderInt);
            return;
        }
        this.detachViewAt(n);
        recyclerView$Recycler.scrapView(view);
    }
    
    public void addDisappearingView(final View view) {
        this.addDisappearingView(view, -1);
    }
    
    public void addDisappearingView(final View view, final int n) {
        this.addViewInt(view, n, true);
    }
    
    public void addView(final View view) {
        this.addView(view, -1);
    }
    
    public void addView(final View view, final int n) {
        this.addViewInt(view, n, false);
    }
    
    public void assertInLayoutOrScroll(final String s) {
        if (this.mRecyclerView != null) {
            this.mRecyclerView.assertInLayoutOrScroll(s);
        }
    }
    
    public void assertNotInLayoutOrScroll(final String s) {
        if (this.mRecyclerView != null) {
            this.mRecyclerView.assertNotInLayoutOrScroll(s);
        }
    }
    
    public void attachView(final View view) {
        this.attachView(view, -1);
    }
    
    public void attachView(final View view, final int n) {
        this.attachView(view, n, (RecyclerView$LayoutParams)view.getLayoutParams());
    }
    
    public void attachView(final View view, final int n, final RecyclerView$LayoutParams recyclerView$LayoutParams) {
        final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isRemoved()) {
            this.mRecyclerView.addToDisappearingList(view);
        }
        else {
            this.mRecyclerView.removeFromDisappearingList(view);
        }
        this.mChildHelper.attachViewToParent(view, n, (ViewGroup$LayoutParams)recyclerView$LayoutParams, childViewHolderInt.isRemoved());
    }
    
    public void calculateItemDecorationsForChild(final View view, final Rect rect) {
        if (this.mRecyclerView == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        rect.set(this.mRecyclerView.getItemDecorInsetsForChild(view));
    }
    
    public boolean canScrollHorizontally() {
        return false;
    }
    
    public boolean canScrollVertically() {
        return false;
    }
    
    public boolean checkLayoutParams(final RecyclerView$LayoutParams recyclerView$LayoutParams) {
        return recyclerView$LayoutParams != null;
    }
    
    public int computeHorizontalScrollExtent(final RecyclerView$State recyclerView$State) {
        return 0;
    }
    
    public int computeHorizontalScrollOffset(final RecyclerView$State recyclerView$State) {
        return 0;
    }
    
    public int computeHorizontalScrollRange(final RecyclerView$State recyclerView$State) {
        return 0;
    }
    
    public int computeVerticalScrollExtent(final RecyclerView$State recyclerView$State) {
        return 0;
    }
    
    public int computeVerticalScrollOffset(final RecyclerView$State recyclerView$State) {
        return 0;
    }
    
    public int computeVerticalScrollRange(final RecyclerView$State recyclerView$State) {
        return 0;
    }
    
    public void detachAndScrapAttachedViews(final RecyclerView$Recycler recyclerView$Recycler) {
        for (int i = -1 + this.getChildCount(); i >= 0; --i) {
            this.scrapOrRecycleView(recyclerView$Recycler, i, this.getChildAt(i));
        }
    }
    
    public void detachAndScrapView(final View view, final RecyclerView$Recycler recyclerView$Recycler) {
        this.scrapOrRecycleView(recyclerView$Recycler, this.mChildHelper.indexOfChild(view), view);
    }
    
    public void detachAndScrapViewAt(final int n, final RecyclerView$Recycler recyclerView$Recycler) {
        this.scrapOrRecycleView(recyclerView$Recycler, n, this.getChildAt(n));
    }
    
    public void detachView(final View view) {
        final int indexOfChild = this.mChildHelper.indexOfChild(view);
        if (indexOfChild >= 0) {
            this.detachViewInternal(indexOfChild, view);
        }
    }
    
    public void detachViewAt(final int n) {
        this.detachViewInternal(n, this.getChildAt(n));
    }
    
    public void endAnimation(final View view) {
        if (this.mRecyclerView.mItemAnimator != null) {
            this.mRecyclerView.mItemAnimator.endAnimation(RecyclerView.getChildViewHolderInt(view));
        }
    }
    
    public View findViewByPosition(final int n) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(child);
            if (childViewHolderInt != null && childViewHolderInt.getPosition() == n && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.isPreLayout() || !childViewHolderInt.isRemoved())) {
                return child;
            }
        }
        return null;
    }
    
    public abstract RecyclerView$LayoutParams generateDefaultLayoutParams();
    
    public RecyclerView$LayoutParams generateLayoutParams(final Context context, final AttributeSet set) {
        return new RecyclerView$LayoutParams(context, set);
    }
    
    public RecyclerView$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof RecyclerView$LayoutParams) {
            return new RecyclerView$LayoutParams((RecyclerView$LayoutParams)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new RecyclerView$LayoutParams((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new RecyclerView$LayoutParams(viewGroup$LayoutParams);
    }
    
    public int getBottomDecorationHeight(final View view) {
        return ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets.bottom;
    }
    
    public View getChildAt(final int n) {
        if (this.mChildHelper != null) {
            return this.mChildHelper.getChildAt(n);
        }
        return null;
    }
    
    public int getChildCount() {
        if (this.mChildHelper != null) {
            return this.mChildHelper.getChildCount();
        }
        return 0;
    }
    
    public boolean getClipToPadding() {
        return this.mRecyclerView != null && this.mRecyclerView.mClipToPadding;
    }
    
    public int getColumnCountForAccessibility(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        if (this.mRecyclerView != null && this.mRecyclerView.mAdapter != null && this.canScrollHorizontally()) {
            return this.mRecyclerView.mAdapter.getItemCount();
        }
        return 1;
    }
    
    public int getDecoratedBottom(final View view) {
        return view.getBottom() + this.getBottomDecorationHeight(view);
    }
    
    public int getDecoratedLeft(final View view) {
        return view.getLeft() - this.getLeftDecorationWidth(view);
    }
    
    public int getDecoratedMeasuredHeight(final View view) {
        final Rect mDecorInsets = ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets;
        return view.getMeasuredHeight() + mDecorInsets.top + mDecorInsets.bottom;
    }
    
    public int getDecoratedMeasuredWidth(final View view) {
        final Rect mDecorInsets = ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets;
        return view.getMeasuredWidth() + mDecorInsets.left + mDecorInsets.right;
    }
    
    public int getDecoratedRight(final View view) {
        return view.getRight() + this.getRightDecorationWidth(view);
    }
    
    public int getDecoratedTop(final View view) {
        return view.getTop() - this.getTopDecorationHeight(view);
    }
    
    public View getFocusedChild() {
        if (this.mRecyclerView != null) {
            final View focusedChild = this.mRecyclerView.getFocusedChild();
            if (focusedChild != null && !this.mChildHelper.isHidden(focusedChild)) {
                return focusedChild;
            }
        }
        return null;
    }
    
    public int getHeight() {
        if (this.mRecyclerView != null) {
            return this.mRecyclerView.getHeight();
        }
        return 0;
    }
    
    public int getItemCount() {
        RecyclerView$Adapter adapter;
        if (this.mRecyclerView != null) {
            adapter = this.mRecyclerView.getAdapter();
        }
        else {
            adapter = null;
        }
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }
    
    public int getItemViewType(final View view) {
        return RecyclerView.getChildViewHolderInt(view).getItemViewType();
    }
    
    public int getLayoutDirection() {
        return ViewCompat.getLayoutDirection((View)this.mRecyclerView);
    }
    
    public int getLeftDecorationWidth(final View view) {
        return ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets.left;
    }
    
    public int getMinimumHeight() {
        return ViewCompat.getMinimumHeight((View)this.mRecyclerView);
    }
    
    public int getMinimumWidth() {
        return ViewCompat.getMinimumWidth((View)this.mRecyclerView);
    }
    
    public int getPaddingBottom() {
        if (this.mRecyclerView != null) {
            return this.mRecyclerView.getPaddingBottom();
        }
        return 0;
    }
    
    public int getPaddingEnd() {
        if (this.mRecyclerView != null) {
            return ViewCompat.getPaddingEnd((View)this.mRecyclerView);
        }
        return 0;
    }
    
    public int getPaddingLeft() {
        if (this.mRecyclerView != null) {
            return this.mRecyclerView.getPaddingLeft();
        }
        return 0;
    }
    
    public int getPaddingRight() {
        if (this.mRecyclerView != null) {
            return this.mRecyclerView.getPaddingRight();
        }
        return 0;
    }
    
    public int getPaddingStart() {
        if (this.mRecyclerView != null) {
            return ViewCompat.getPaddingStart((View)this.mRecyclerView);
        }
        return 0;
    }
    
    public int getPaddingTop() {
        if (this.mRecyclerView != null) {
            return this.mRecyclerView.getPaddingTop();
        }
        return 0;
    }
    
    public int getPosition(final View view) {
        return ((RecyclerView$LayoutParams)view.getLayoutParams()).getViewPosition();
    }
    
    public int getRightDecorationWidth(final View view) {
        return ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets.right;
    }
    
    public int getRowCountForAccessibility(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        if (this.mRecyclerView != null && this.mRecyclerView.mAdapter != null && this.canScrollVertically()) {
            return this.mRecyclerView.mAdapter.getItemCount();
        }
        return 1;
    }
    
    public int getSelectionModeForAccessibility(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        return 0;
    }
    
    public int getTopDecorationHeight(final View view) {
        return ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets.top;
    }
    
    public int getWidth() {
        if (this.mRecyclerView != null) {
            return this.mRecyclerView.getWidth();
        }
        return 0;
    }
    
    public boolean hasFocus() {
        return this.mRecyclerView != null && this.mRecyclerView.hasFocus();
    }
    
    public void ignoreView(final View view) {
        if (view.getParent() != this.mRecyclerView || this.mRecyclerView.indexOfChild(view) == -1) {
            throw new IllegalArgumentException("View should be fully attached to be ignored");
        }
        final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.addFlags(128);
        this.mRecyclerView.mState.onViewIgnored(childViewHolderInt);
    }
    
    public boolean isFocused() {
        return this.mRecyclerView != null && this.mRecyclerView.isFocused();
    }
    
    public boolean isLayoutHierarchical(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        return false;
    }
    
    public boolean isSmoothScrolling() {
        return this.mSmoothScroller != null && this.mSmoothScroller.isRunning();
    }
    
    public void layoutDecorated(final View view, final int n, final int n2, final int n3, final int n4) {
        final Rect mDecorInsets = ((RecyclerView$LayoutParams)view.getLayoutParams()).mDecorInsets;
        view.layout(n + mDecorInsets.left, n2 + mDecorInsets.top, n3 - mDecorInsets.right, n4 - mDecorInsets.bottom);
    }
    
    public void measureChild(final View view, final int n, final int n2) {
        final RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        final Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        view.measure(getChildMeasureSpec(this.getWidth(), n + (itemDecorInsetsForChild.left + itemDecorInsetsForChild.right) + (this.getPaddingLeft() + this.getPaddingRight()), recyclerView$LayoutParams.width, this.canScrollHorizontally()), getChildMeasureSpec(this.getHeight(), n2 + (itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom) + (this.getPaddingTop() + this.getPaddingBottom()), recyclerView$LayoutParams.height, this.canScrollVertically()));
    }
    
    public void measureChildWithMargins(final View view, final int n, final int n2) {
        final RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        final Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        view.measure(getChildMeasureSpec(this.getWidth(), n + (itemDecorInsetsForChild.left + itemDecorInsetsForChild.right) + (this.getPaddingLeft() + this.getPaddingRight() + recyclerView$LayoutParams.leftMargin + recyclerView$LayoutParams.rightMargin), recyclerView$LayoutParams.width, this.canScrollHorizontally()), getChildMeasureSpec(this.getHeight(), n2 + (itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom) + (this.getPaddingTop() + this.getPaddingBottom() + recyclerView$LayoutParams.topMargin + recyclerView$LayoutParams.bottomMargin), recyclerView$LayoutParams.height, this.canScrollVertically()));
    }
    
    public void moveView(final int n, final int n2) {
        final View child = this.getChildAt(n);
        if (child == null) {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + n);
        }
        this.detachViewAt(n);
        this.attachView(child, n2);
    }
    
    public void offsetChildrenHorizontal(final int n) {
        if (this.mRecyclerView != null) {
            this.mRecyclerView.offsetChildrenHorizontal(n);
        }
    }
    
    public void offsetChildrenVertical(final int n) {
        if (this.mRecyclerView != null) {
            this.mRecyclerView.offsetChildrenVertical(n);
        }
    }
    
    public void onAdapterChanged(final RecyclerView$Adapter recyclerView$Adapter, final RecyclerView$Adapter recyclerView$Adapter2) {
    }
    
    public boolean onAddFocusables(final RecyclerView recyclerView, final ArrayList list, final int n, final int n2) {
        return false;
    }
    
    public void onAttachedToWindow(final RecyclerView recyclerView) {
    }
    
    @Deprecated
    public void onDetachedFromWindow(final RecyclerView recyclerView) {
    }
    
    public void onDetachedFromWindow(final RecyclerView recyclerView, final RecyclerView$Recycler recyclerView$Recycler) {
        this.onDetachedFromWindow(recyclerView);
    }
    
    public View onFocusSearchFailed(final View view, final int n, final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        return null;
    }
    
    public void onInitializeAccessibilityEvent(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final AccessibilityEvent accessibilityEvent) {
        int scrollable = 1;
        final AccessibilityRecordCompat record = AccessibilityEventCompat.asRecord(accessibilityEvent);
        if (this.mRecyclerView != null && record != null) {
            if (!ViewCompat.canScrollVertically((View)this.mRecyclerView, scrollable) && !ViewCompat.canScrollVertically((View)this.mRecyclerView, -1) && !ViewCompat.canScrollHorizontally((View)this.mRecyclerView, -1) && !ViewCompat.canScrollHorizontally((View)this.mRecyclerView, scrollable)) {
                scrollable = 0;
            }
            record.setScrollable(scrollable != 0);
            if (this.mRecyclerView.mAdapter != null) {
                record.setItemCount(this.mRecyclerView.mAdapter.getItemCount());
            }
        }
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        this.onInitializeAccessibilityEvent(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityEvent);
    }
    
    void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.onInitializeAccessibilityNodeInfo(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, accessibilityNodeInfoCompat);
    }
    
    public void onInitializeAccessibilityNodeInfo(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setClassName(RecyclerView.class.getName());
        if (ViewCompat.canScrollVertically((View)this.mRecyclerView, -1) || ViewCompat.canScrollHorizontally((View)this.mRecyclerView, -1)) {
            accessibilityNodeInfoCompat.addAction(8192);
            accessibilityNodeInfoCompat.setScrollable(true);
        }
        if (ViewCompat.canScrollVertically((View)this.mRecyclerView, 1) || ViewCompat.canScrollHorizontally((View)this.mRecyclerView, 1)) {
            accessibilityNodeInfoCompat.addAction(4096);
            accessibilityNodeInfoCompat.setScrollable(true);
        }
        accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat$CollectionInfoCompat.obtain(this.getRowCountForAccessibility(recyclerView$Recycler, recyclerView$State), this.getColumnCountForAccessibility(recyclerView$Recycler, recyclerView$State), this.isLayoutHierarchical(recyclerView$Recycler, recyclerView$State), this.getSelectionModeForAccessibility(recyclerView$Recycler, recyclerView$State)));
    }
    
    public void onInitializeAccessibilityNodeInfoForItem(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final View view, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int position;
        if (this.canScrollVertically()) {
            position = this.getPosition(view);
        }
        else {
            position = 0;
        }
        int position2;
        if (this.canScrollHorizontally()) {
            position2 = this.getPosition(view);
        }
        else {
            position2 = 0;
        }
        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat$CollectionItemInfoCompat.obtain(position, 1, position2, 1, false, false));
    }
    
    void onInitializeAccessibilityNodeInfoForItem(final View view, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
            this.onInitializeAccessibilityNodeInfoForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, accessibilityNodeInfoCompat);
        }
    }
    
    public View onInterceptFocusSearch(final View view, final int n) {
        return null;
    }
    
    public void onItemsAdded(final RecyclerView recyclerView, final int n, final int n2) {
    }
    
    public void onItemsChanged(final RecyclerView recyclerView) {
    }
    
    public void onItemsMoved(final RecyclerView recyclerView, final int n, final int n2, final int n3) {
    }
    
    public void onItemsRemoved(final RecyclerView recyclerView, final int n, final int n2) {
    }
    
    public void onItemsUpdated(final RecyclerView recyclerView, final int n, final int n2) {
    }
    
    public void onLayoutChildren(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }
    
    public void onMeasure(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        int n3 = View$MeasureSpec.getSize(n);
        int n4 = View$MeasureSpec.getSize(n2);
        switch (mode) {
            default: {
                n3 = this.getMinimumWidth();
            }
            case Integer.MIN_VALUE:
            case 1073741824: {
                switch (mode2) {
                    default: {
                        n4 = this.getMinimumHeight();
                    }
                    case Integer.MIN_VALUE:
                    case 1073741824: {
                        this.setMeasuredDimension(n3, n4);
                        return;
                    }
                }
                break;
            }
        }
    }
    
    public boolean onRequestChildFocus(final RecyclerView recyclerView, final RecyclerView$State recyclerView$State, final View view, final View view2) {
        return this.onRequestChildFocus(recyclerView, view, view2);
    }
    
    @Deprecated
    public boolean onRequestChildFocus(final RecyclerView recyclerView, final View view, final View view2) {
        return this.isSmoothScrolling() || recyclerView.mRunningLayoutOrScroll;
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
    }
    
    public Parcelable onSaveInstanceState() {
        return null;
    }
    
    public void onScrollStateChanged(final int n) {
    }
    
    boolean performAccessibilityAction(final int n, final Bundle bundle) {
        return this.performAccessibilityAction(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, n, bundle);
    }
    
    public boolean performAccessibilityAction(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final int n, final Bundle bundle) {
        if (this.mRecyclerView != null) {
            while (true) {
                int n4 = 0;
                Label_0197: {
                    int n2 = 0;
                    int n3 = 0;
                    switch (n) {
                        default: {
                            n2 = 0;
                            n3 = 0;
                            break;
                        }
                        case 8192: {
                            if (ViewCompat.canScrollVertically((View)this.mRecyclerView, -1)) {
                                n4 = -(this.getHeight() - this.getPaddingTop() - this.getPaddingBottom());
                            }
                            else {
                                n4 = 0;
                            }
                            if (ViewCompat.canScrollHorizontally((View)this.mRecyclerView, -1)) {
                                final int n5 = -(this.getWidth() - this.getPaddingLeft() - this.getPaddingRight());
                                n3 = n4;
                                n2 = n5;
                                break;
                            }
                            break Label_0197;
                        }
                        case 4096: {
                            if (ViewCompat.canScrollVertically((View)this.mRecyclerView, 1)) {
                                n4 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                            }
                            else {
                                n4 = 0;
                            }
                            if (ViewCompat.canScrollHorizontally((View)this.mRecyclerView, 1)) {
                                final int n6 = this.getWidth() - this.getPaddingLeft() - this.getPaddingRight();
                                n3 = n4;
                                n2 = n6;
                                break;
                            }
                            break Label_0197;
                        }
                    }
                    if (n3 != 0 || n2 != 0) {
                        this.mRecyclerView.scrollBy(n2, n3);
                        return true;
                    }
                    return false;
                }
                int n3 = n4;
                int n2 = 0;
                continue;
            }
        }
        return false;
    }
    
    public boolean performAccessibilityActionForItem(final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State, final View view, final int n, final Bundle bundle) {
        return false;
    }
    
    boolean performAccessibilityActionForItem(final View view, final int n, final Bundle bundle) {
        return this.performAccessibilityActionForItem(this.mRecyclerView.mRecycler, this.mRecyclerView.mState, view, n, bundle);
    }
    
    public void removeAllViews() {
        for (int i = -1 + this.getChildCount(); i >= 0; --i) {
            this.getChildAt(i);
            this.mChildHelper.removeViewAt(i);
        }
    }
    
    public void removeAndRecycleAllViews(final RecyclerView$Recycler recyclerView$Recycler) {
        for (int i = -1 + this.getChildCount(); i >= 0; --i) {
            if (!RecyclerView.getChildViewHolderInt(this.getChildAt(i)).shouldIgnore()) {
                this.removeAndRecycleViewAt(i, recyclerView$Recycler);
            }
        }
    }
    
    void removeAndRecycleScrapInt(final RecyclerView$Recycler recyclerView$Recycler) {
        final int scrapCount = recyclerView$Recycler.getScrapCount();
        for (int i = 0; i < scrapCount; ++i) {
            final View scrapView = recyclerView$Recycler.getScrapViewAt(i);
            final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(scrapView);
            if (!childViewHolderInt.shouldIgnore()) {
                if (childViewHolderInt.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(scrapView, false);
                }
                recyclerView$Recycler.quickRecycleScrapView(scrapView);
            }
        }
        recyclerView$Recycler.clearScrap();
        if (scrapCount > 0) {
            this.mRecyclerView.invalidate();
        }
    }
    
    public void removeAndRecycleView(final View view, final RecyclerView$Recycler recyclerView$Recycler) {
        this.removeView(view);
        recyclerView$Recycler.recycleView(view);
    }
    
    public void removeAndRecycleViewAt(final int n, final RecyclerView$Recycler recyclerView$Recycler) {
        final View child = this.getChildAt(n);
        this.removeViewAt(n);
        recyclerView$Recycler.recycleView(child);
    }
    
    public void removeDetachedView(final View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }
    
    public void removeView(final View view) {
        this.mChildHelper.removeView(view);
    }
    
    public void removeViewAt(final int n) {
        if (this.getChildAt(n) != null) {
            this.mChildHelper.removeViewAt(n);
        }
    }
    
    public boolean requestChildRectangleOnScreen(final RecyclerView recyclerView, final View view, final Rect rect, final boolean b) {
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        final int n = this.getWidth() - this.getPaddingRight();
        final int n2 = this.getHeight() - this.getPaddingBottom();
        final int n3 = view.getLeft() + rect.left;
        final int n4 = view.getTop() + rect.top;
        final int n5 = n3 + rect.width();
        final int n6 = n4 + rect.height();
        int min = Math.min(0, n3 - paddingLeft);
        final int min2 = Math.min(0, n4 - paddingTop);
        int max = Math.max(0, n5 - n);
        final int max2 = Math.max(0, n6 - n2);
        if (ViewCompat.getLayoutDirection((View)recyclerView) == 1) {
            if (max == 0) {
                max = min;
            }
            min = max;
        }
        else if (min == 0) {
            min = max;
        }
        int n7;
        if (min2 != 0) {
            n7 = min2;
        }
        else {
            n7 = max2;
        }
        if (min != 0 || n7 != 0) {
            if (b) {
                recyclerView.scrollBy(min, n7);
            }
            else {
                recyclerView.smoothScrollBy(min, n7);
            }
            return true;
        }
        return false;
    }
    
    public void requestLayout() {
        if (this.mRecyclerView != null) {
            this.mRecyclerView.requestLayout();
        }
    }
    
    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }
    
    public int scrollHorizontallyBy(final int n, final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        return 0;
    }
    
    public void scrollToPosition(final int n) {
    }
    
    public int scrollVerticallyBy(final int n, final RecyclerView$Recycler recyclerView$Recycler, final RecyclerView$State recyclerView$State) {
        return 0;
    }
    
    public void setMeasuredDimension(final int n, final int n2) {
        RecyclerView.access$4500(this.mRecyclerView, n, n2);
    }
    
    void setRecyclerView(final RecyclerView mRecyclerView) {
        if (mRecyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            return;
        }
        this.mRecyclerView = mRecyclerView;
        this.mChildHelper = mRecyclerView.mChildHelper;
    }
    
    public void smoothScrollToPosition(final RecyclerView recyclerView, final RecyclerView$State recyclerView$State, final int n) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }
    
    public void startSmoothScroll(final RecyclerView$SmoothScroller mSmoothScroller) {
        if (this.mSmoothScroller != null && mSmoothScroller != this.mSmoothScroller && this.mSmoothScroller.isRunning()) {
            this.mSmoothScroller.stop();
        }
        (this.mSmoothScroller = mSmoothScroller).start(this.mRecyclerView, this);
    }
    
    public void stopIgnoringView(final View view) {
        final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.stopIgnoring();
        childViewHolderInt.resetInternal();
        childViewHolderInt.addFlags(4);
    }
    
    void stopSmoothScroller() {
        if (this.mSmoothScroller != null) {
            this.mSmoothScroller.stop();
        }
    }
    
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
