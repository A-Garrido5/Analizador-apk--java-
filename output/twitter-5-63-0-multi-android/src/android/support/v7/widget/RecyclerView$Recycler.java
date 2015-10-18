// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.util.SparseArray;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.os.Parcelable;
import android.view.ViewParent;
import android.view.FocusFinder;
import android.graphics.Canvas;
import android.support.v4.util.SimpleArrayMap;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.view.VelocityTracker;
import android.graphics.Rect;
import android.support.v4.widget.EdgeEffectCompat;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.util.Log;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.support.v4.view.ViewCompat;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public final class RecyclerView$Recycler
{
    private static final int DEFAULT_CACHE_SIZE = 2;
    final ArrayList mAttachedScrap;
    final ArrayList mCachedViews;
    private ArrayList mChangedScrap;
    private RecyclerView$RecycledViewPool mRecyclerPool;
    private final List mUnmodifiableAttachedScrap;
    private RecyclerView$ViewCacheExtension mViewCacheExtension;
    private int mViewCacheMax;
    final /* synthetic */ RecyclerView this$0;
    
    public RecyclerView$Recycler(final RecyclerView this$0) {
        this.this$0 = this$0;
        this.mAttachedScrap = new ArrayList();
        this.mChangedScrap = null;
        this.mCachedViews = new ArrayList();
        this.mUnmodifiableAttachedScrap = Collections.unmodifiableList((List<?>)this.mAttachedScrap);
        this.mViewCacheMax = 2;
    }
    
    private void attachAccessibilityDelegate(final View view) {
        if (this.this$0.mAccessibilityManager != null && this.this$0.mAccessibilityManager.isEnabled()) {
            if (ViewCompat.getImportantForAccessibility(view) == 0) {
                ViewCompat.setImportantForAccessibility(view, 1);
            }
            if (!ViewCompat.hasAccessibilityDelegate(view)) {
                ViewCompat.setAccessibilityDelegate(view, this.this$0.mAccessibilityDelegate.getItemDelegate());
            }
        }
    }
    
    private void invalidateDisplayListInt(final RecyclerView$ViewHolder recyclerView$ViewHolder) {
        if (recyclerView$ViewHolder.itemView instanceof ViewGroup) {
            this.invalidateDisplayListInt((ViewGroup)recyclerView$ViewHolder.itemView, false);
        }
    }
    
    private void invalidateDisplayListInt(final ViewGroup viewGroup, final boolean b) {
        for (int i = -1 + viewGroup.getChildCount(); i >= 0; --i) {
            final View child = viewGroup.getChildAt(i);
            if (child instanceof ViewGroup) {
                this.invalidateDisplayListInt((ViewGroup)child, true);
            }
        }
        if (!b) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        final int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(visibility);
    }
    
    public void bindViewToPosition(final View view, final int mPreLayoutPosition) {
        boolean b = true;
        final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null) {
            throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
        }
        final int positionOffset = this.this$0.mAdapterHelper.findPositionOffset(mPreLayoutPosition);
        if (positionOffset < 0 || positionOffset >= this.this$0.mAdapter.getItemCount()) {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + mPreLayoutPosition + "(offset:" + positionOffset + ")." + "state:" + this.this$0.mState.getItemCount());
        }
        this.this$0.mAdapter.bindViewHolder(childViewHolderInt, positionOffset);
        this.attachAccessibilityDelegate(view);
        if (this.this$0.mState.isPreLayout()) {
            childViewHolderInt.mPreLayoutPosition = mPreLayoutPosition;
        }
        final ViewGroup$LayoutParams layoutParams = childViewHolderInt.itemView.getLayoutParams();
        RecyclerView$LayoutParams recyclerView$LayoutParams;
        if (layoutParams == null) {
            recyclerView$LayoutParams = (RecyclerView$LayoutParams)this.this$0.generateDefaultLayoutParams();
            childViewHolderInt.itemView.setLayoutParams((ViewGroup$LayoutParams)recyclerView$LayoutParams);
        }
        else if (!this.this$0.checkLayoutParams(layoutParams)) {
            recyclerView$LayoutParams = (RecyclerView$LayoutParams)this.this$0.generateLayoutParams(layoutParams);
            childViewHolderInt.itemView.setLayoutParams((ViewGroup$LayoutParams)recyclerView$LayoutParams);
        }
        else {
            recyclerView$LayoutParams = (RecyclerView$LayoutParams)layoutParams;
        }
        recyclerView$LayoutParams.mInsetsDirty = b;
        recyclerView$LayoutParams.mViewHolder = childViewHolderInt;
        if (childViewHolderInt.itemView.getParent() != null) {
            b = false;
        }
        recyclerView$LayoutParams.mPendingInvalidate = b;
    }
    
    public void clear() {
        this.mAttachedScrap.clear();
        this.recycleAndClearCachedViews();
    }
    
    void clearOldPositions() {
        int i = 0;
        for (int size = this.mCachedViews.size(), j = 0; j < size; ++j) {
            ((RecyclerView$ViewHolder)this.mCachedViews.get(j)).clearOldPosition();
        }
        for (int size2 = this.mAttachedScrap.size(), k = 0; k < size2; ++k) {
            ((RecyclerView$ViewHolder)this.mAttachedScrap.get(k)).clearOldPosition();
        }
        if (this.mChangedScrap != null) {
            while (i < this.mChangedScrap.size()) {
                ((RecyclerView$ViewHolder)this.mChangedScrap.get(i)).clearOldPosition();
                ++i;
            }
        }
    }
    
    void clearScrap() {
        this.mAttachedScrap.clear();
    }
    
    public int convertPreLayoutPositionToPostLayout(final int n) {
        if (n < 0 || n >= this.this$0.mState.getItemCount()) {
            throw new IndexOutOfBoundsException("invalid position " + n + ". State " + "item count is " + this.this$0.mState.getItemCount());
        }
        if (!this.this$0.mState.isPreLayout()) {
            return n;
        }
        return this.this$0.mAdapterHelper.findPositionOffset(n);
    }
    
    void dispatchViewRecycled(final RecyclerView$ViewHolder recyclerView$ViewHolder) {
        if (this.this$0.mRecyclerListener != null) {
            this.this$0.mRecyclerListener.onViewRecycled(recyclerView$ViewHolder);
        }
        if (this.this$0.mAdapter != null) {
            this.this$0.mAdapter.onViewRecycled(recyclerView$ViewHolder);
        }
        if (this.this$0.mState != null) {
            this.this$0.mState.onViewRecycled(recyclerView$ViewHolder);
        }
    }
    
    RecyclerView$ViewHolder getChangedScrapViewForPosition(final int n) {
        int i = 0;
        if (this.mChangedScrap != null) {
            final int size = this.mChangedScrap.size();
            if (size != 0) {
                for (int j = 0; j < size; ++j) {
                    final RecyclerView$ViewHolder recyclerView$ViewHolder = this.mChangedScrap.get(j);
                    if (!recyclerView$ViewHolder.wasReturnedFromScrap() && recyclerView$ViewHolder.getPosition() == n) {
                        recyclerView$ViewHolder.addFlags(32);
                        return recyclerView$ViewHolder;
                    }
                }
                if (this.this$0.mAdapter.hasStableIds()) {
                    final int positionOffset = this.this$0.mAdapterHelper.findPositionOffset(n);
                    if (positionOffset > 0 && positionOffset < this.this$0.mAdapter.getItemCount()) {
                        final long itemId = this.this$0.mAdapter.getItemId(positionOffset);
                        while (i < size) {
                            final RecyclerView$ViewHolder recyclerView$ViewHolder2 = this.mChangedScrap.get(i);
                            if (!recyclerView$ViewHolder2.wasReturnedFromScrap() && recyclerView$ViewHolder2.getItemId() == itemId) {
                                recyclerView$ViewHolder2.addFlags(32);
                                return recyclerView$ViewHolder2;
                            }
                            ++i;
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }
    
    RecyclerView$RecycledViewPool getRecycledViewPool() {
        if (this.mRecyclerPool == null) {
            this.mRecyclerPool = new RecyclerView$RecycledViewPool();
        }
        return this.mRecyclerPool;
    }
    
    int getScrapCount() {
        return this.mAttachedScrap.size();
    }
    
    public List getScrapList() {
        return this.mUnmodifiableAttachedScrap;
    }
    
    View getScrapViewAt(final int n) {
        return this.mAttachedScrap.get(n).itemView;
    }
    
    RecyclerView$ViewHolder getScrapViewForId(final long n, final int n2, final boolean b) {
        for (int i = -1 + this.mAttachedScrap.size(); i >= 0; --i) {
            final RecyclerView$ViewHolder recyclerView$ViewHolder = this.mAttachedScrap.get(i);
            if (recyclerView$ViewHolder.getItemId() == n && !recyclerView$ViewHolder.wasReturnedFromScrap()) {
                if (n2 == recyclerView$ViewHolder.getItemViewType()) {
                    recyclerView$ViewHolder.addFlags(32);
                    if (recyclerView$ViewHolder.isRemoved() && !this.this$0.mState.isPreLayout()) {
                        recyclerView$ViewHolder.setFlags(2, 14);
                    }
                    return recyclerView$ViewHolder;
                }
                if (!b) {
                    this.mAttachedScrap.remove(i);
                    this.this$0.removeDetachedView(recyclerView$ViewHolder.itemView, false);
                    this.quickRecycleScrapView(recyclerView$ViewHolder.itemView);
                }
            }
        }
        for (int j = -1 + this.mCachedViews.size(); j >= 0; --j) {
            final RecyclerView$ViewHolder recyclerView$ViewHolder = (RecyclerView$ViewHolder)this.mCachedViews.get(j);
            if (recyclerView$ViewHolder.getItemId() == n) {
                if (n2 == recyclerView$ViewHolder.getItemViewType()) {
                    if (!b) {
                        this.mCachedViews.remove(j);
                        return recyclerView$ViewHolder;
                    }
                    return recyclerView$ViewHolder;
                }
                else if (!b) {
                    this.tryToRecycleCachedViewAt(j);
                }
            }
        }
        return null;
    }
    
    RecyclerView$ViewHolder getScrapViewForPosition(final int n, final int n2, final boolean b) {
        int i = 0;
        final int size = this.mAttachedScrap.size();
        int j = 0;
        while (j < size) {
            final RecyclerView$ViewHolder recyclerView$ViewHolder = this.mAttachedScrap.get(j);
            if (!recyclerView$ViewHolder.wasReturnedFromScrap() && recyclerView$ViewHolder.getPosition() == n && !recyclerView$ViewHolder.isInvalid() && (this.this$0.mState.mInPreLayout || !recyclerView$ViewHolder.isRemoved())) {
                if (n2 != -1 && recyclerView$ViewHolder.getItemViewType() != n2) {
                    Log.e("RecyclerView", "Scrap view for position " + n + " isn't dirty but has" + " wrong view type! (found " + recyclerView$ViewHolder.getItemViewType() + " but expected " + n2 + ")");
                    break;
                }
                recyclerView$ViewHolder.addFlags(32);
                return recyclerView$ViewHolder;
            }
            else {
                ++j;
            }
        }
        if (!b) {
            final View hiddenNonRemovedView = this.this$0.mChildHelper.findHiddenNonRemovedView(n, n2);
            if (hiddenNonRemovedView != null) {
                this.this$0.mItemAnimator.endAnimation(this.this$0.getChildViewHolder(hiddenNonRemovedView));
            }
        }
        while (i < this.mCachedViews.size()) {
            final RecyclerView$ViewHolder recyclerView$ViewHolder2 = this.mCachedViews.get(i);
            if (!recyclerView$ViewHolder2.isInvalid() && recyclerView$ViewHolder2.getPosition() == n) {
                if (!b) {
                    this.mCachedViews.remove(i);
                }
                return recyclerView$ViewHolder2;
            }
            ++i;
        }
        return null;
    }
    
    public View getViewForPosition(final int n) {
        return this.getViewForPosition(n, false);
    }
    
    View getViewForPosition(final int n, final boolean b) {
        boolean mPendingInvalidate = true;
        if (n < 0 || n >= this.this$0.mState.getItemCount()) {
            throw new IndexOutOfBoundsException("Invalid item position " + n + "(" + n + "). Item count:" + this.this$0.mState.getItemCount());
        }
        boolean b2;
        RecyclerView$ViewHolder recyclerView$ViewHolder;
        if (this.this$0.mState.isPreLayout()) {
            final RecyclerView$ViewHolder changedScrapViewForPosition = this.getChangedScrapViewForPosition(n);
            b2 = (changedScrapViewForPosition != null && mPendingInvalidate);
            recyclerView$ViewHolder = changedScrapViewForPosition;
        }
        else {
            recyclerView$ViewHolder = null;
            b2 = false;
        }
        while (true) {
            Label_0796: {
                if (recyclerView$ViewHolder != null) {
                    break Label_0796;
                }
                recyclerView$ViewHolder = this.getScrapViewForPosition(n, -1, b);
                if (recyclerView$ViewHolder == null) {
                    break Label_0796;
                }
                boolean b3;
                if (!this.validateViewHolderForOffsetPosition(recyclerView$ViewHolder)) {
                    if (!b) {
                        recyclerView$ViewHolder.addFlags(4);
                        if (recyclerView$ViewHolder.isScrap()) {
                            this.this$0.removeDetachedView(recyclerView$ViewHolder.itemView, false);
                            recyclerView$ViewHolder.unScrap();
                        }
                        else if (recyclerView$ViewHolder.wasReturnedFromScrap()) {
                            recyclerView$ViewHolder.clearReturnedFromScrapFlag();
                        }
                        this.recycleViewHolderInternal(recyclerView$ViewHolder);
                    }
                    recyclerView$ViewHolder = null;
                    b3 = b2;
                }
                else {
                    b3 = mPendingInvalidate;
                }
                while (true) {
                    Label_0785: {
                        if (recyclerView$ViewHolder != null) {
                            break Label_0785;
                        }
                        final int positionOffset = this.this$0.mAdapterHelper.findPositionOffset(n);
                        if (positionOffset < 0 || positionOffset >= this.this$0.mAdapter.getItemCount()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + n + "(offset:" + positionOffset + ")." + "state:" + this.this$0.mState.getItemCount());
                        }
                        final int itemViewType = this.this$0.mAdapter.getItemViewType(positionOffset);
                        if (this.this$0.mAdapter.hasStableIds()) {
                            recyclerView$ViewHolder = this.getScrapViewForId(this.this$0.mAdapter.getItemId(positionOffset), itemViewType, b);
                            if (recyclerView$ViewHolder != null) {
                                recyclerView$ViewHolder.mPosition = positionOffset;
                                b3 = mPendingInvalidate;
                            }
                        }
                        if (recyclerView$ViewHolder == null && this.mViewCacheExtension != null) {
                            final View viewForPositionAndType = this.mViewCacheExtension.getViewForPositionAndType(this, n, itemViewType);
                            if (viewForPositionAndType != null) {
                                recyclerView$ViewHolder = this.this$0.getChildViewHolder(viewForPositionAndType);
                                if (recyclerView$ViewHolder == null) {
                                    throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                                }
                                if (recyclerView$ViewHolder.shouldIgnore()) {
                                    throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                                }
                            }
                        }
                        if (recyclerView$ViewHolder == null) {
                            recyclerView$ViewHolder = this.getRecycledViewPool().getRecycledView(this.this$0.mAdapter.getItemViewType(positionOffset));
                            if (recyclerView$ViewHolder != null) {
                                recyclerView$ViewHolder.resetInternal();
                                if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                    this.invalidateDisplayListInt(recyclerView$ViewHolder);
                                }
                            }
                        }
                        if (recyclerView$ViewHolder != null) {
                            break Label_0785;
                        }
                        final RecyclerView$ViewHolder viewHolder = this.this$0.mAdapter.createViewHolder(this.this$0, this.this$0.mAdapter.getItemViewType(positionOffset));
                        final boolean b4 = b3;
                        final RecyclerView$ViewHolder mViewHolder = viewHolder;
                        boolean b5;
                        if (this.this$0.mState.isPreLayout() && mViewHolder.isBound()) {
                            mViewHolder.mPreLayoutPosition = n;
                            b5 = false;
                        }
                        else if (!mViewHolder.isBound() || mViewHolder.needsUpdate() || mViewHolder.isInvalid()) {
                            this.this$0.mAdapter.bindViewHolder(mViewHolder, this.this$0.mAdapterHelper.findPositionOffset(n));
                            this.attachAccessibilityDelegate(mViewHolder.itemView);
                            if (this.this$0.mState.isPreLayout()) {
                                mViewHolder.mPreLayoutPosition = n;
                            }
                            b5 = mPendingInvalidate;
                        }
                        else {
                            b5 = false;
                        }
                        final ViewGroup$LayoutParams layoutParams = mViewHolder.itemView.getLayoutParams();
                        RecyclerView$LayoutParams recyclerView$LayoutParams;
                        if (layoutParams == null) {
                            recyclerView$LayoutParams = (RecyclerView$LayoutParams)this.this$0.generateDefaultLayoutParams();
                            mViewHolder.itemView.setLayoutParams((ViewGroup$LayoutParams)recyclerView$LayoutParams);
                        }
                        else if (!this.this$0.checkLayoutParams(layoutParams)) {
                            recyclerView$LayoutParams = (RecyclerView$LayoutParams)this.this$0.generateLayoutParams(layoutParams);
                            mViewHolder.itemView.setLayoutParams((ViewGroup$LayoutParams)recyclerView$LayoutParams);
                        }
                        else {
                            recyclerView$LayoutParams = (RecyclerView$LayoutParams)layoutParams;
                        }
                        recyclerView$LayoutParams.mViewHolder = mViewHolder;
                        if (!b4 || !b5) {
                            mPendingInvalidate = false;
                        }
                        recyclerView$LayoutParams.mPendingInvalidate = mPendingInvalidate;
                        return mViewHolder.itemView;
                    }
                    final boolean b4 = b3;
                    final RecyclerView$ViewHolder mViewHolder = recyclerView$ViewHolder;
                    continue;
                }
            }
            boolean b3 = b2;
            continue;
        }
    }
    
    void markItemDecorInsetsDirty() {
        for (int size = this.mCachedViews.size(), i = 0; i < size; ++i) {
            final RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)this.mCachedViews.get(i).itemView.getLayoutParams();
            if (recyclerView$LayoutParams != null) {
                recyclerView$LayoutParams.mInsetsDirty = true;
            }
        }
    }
    
    void markKnownViewsInvalid() {
        if (this.this$0.mAdapter != null && this.this$0.mAdapter.hasStableIds()) {
            for (int size = this.mCachedViews.size(), i = 0; i < size; ++i) {
                final RecyclerView$ViewHolder recyclerView$ViewHolder = this.mCachedViews.get(i);
                if (recyclerView$ViewHolder != null) {
                    recyclerView$ViewHolder.addFlags(6);
                }
            }
        }
        else {
            for (int j = -1 + this.mCachedViews.size(); j >= 0; --j) {
                if (!this.tryToRecycleCachedViewAt(j)) {
                    ((RecyclerView$ViewHolder)this.mCachedViews.get(j)).addFlags(6);
                }
            }
        }
    }
    
    void offsetPositionRecordsForInsert(final int n, final int n2) {
        for (int size = this.mCachedViews.size(), i = 0; i < size; ++i) {
            final RecyclerView$ViewHolder recyclerView$ViewHolder = this.mCachedViews.get(i);
            if (recyclerView$ViewHolder != null && recyclerView$ViewHolder.getPosition() >= n) {
                recyclerView$ViewHolder.offsetPosition(n2, true);
            }
        }
    }
    
    void offsetPositionRecordsForMove(final int n, final int n2) {
        int n3;
        int n4;
        int n5;
        if (n < n2) {
            n3 = -1;
            n4 = n2;
            n5 = n;
        }
        else {
            n3 = 1;
            n4 = n;
            n5 = n2;
        }
        for (int size = this.mCachedViews.size(), i = 0; i < size; ++i) {
            final RecyclerView$ViewHolder recyclerView$ViewHolder = this.mCachedViews.get(i);
            if (recyclerView$ViewHolder != null && recyclerView$ViewHolder.mPosition >= n5 && recyclerView$ViewHolder.mPosition <= n4) {
                if (recyclerView$ViewHolder.mPosition == n) {
                    recyclerView$ViewHolder.offsetPosition(n2 - n, false);
                }
                else {
                    recyclerView$ViewHolder.offsetPosition(n3, false);
                }
            }
        }
    }
    
    void offsetPositionRecordsForRemove(final int n, final int n2, final boolean b) {
        final int n3 = n + n2;
        for (int i = -1 + this.mCachedViews.size(); i >= 0; --i) {
            final RecyclerView$ViewHolder recyclerView$ViewHolder = this.mCachedViews.get(i);
            if (recyclerView$ViewHolder != null) {
                if (recyclerView$ViewHolder.getPosition() >= n3) {
                    recyclerView$ViewHolder.offsetPosition(-n2, b);
                }
                else if (recyclerView$ViewHolder.getPosition() >= n && !this.tryToRecycleCachedViewAt(i)) {
                    recyclerView$ViewHolder.addFlags(4);
                }
            }
        }
    }
    
    void onAdapterChanged(final RecyclerView$Adapter recyclerView$Adapter, final RecyclerView$Adapter recyclerView$Adapter2, final boolean b) {
        this.clear();
        this.getRecycledViewPool().onAdapterChanged(recyclerView$Adapter, recyclerView$Adapter2, b);
    }
    
    void quickRecycleScrapView(final View view) {
        final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.mScrapContainer = null;
        childViewHolderInt.clearReturnedFromScrapFlag();
        this.recycleViewHolderInternal(childViewHolderInt);
    }
    
    void recycleAndClearCachedViews() {
        for (int i = -1 + this.mCachedViews.size(); i >= 0; --i) {
            this.tryToRecycleCachedViewAt(i);
        }
        this.mCachedViews.clear();
    }
    
    public void recycleView(final View view) {
        final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isTmpDetached()) {
            this.this$0.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        }
        else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        this.recycleViewHolderInternal(childViewHolderInt);
    }
    
    void recycleViewHolderInternal(final RecyclerView$ViewHolder recyclerView$ViewHolder) {
        boolean b = true;
        if (recyclerView$ViewHolder.isScrap() || recyclerView$ViewHolder.itemView.getParent() != null) {
            final StringBuilder append = new StringBuilder().append("Scrapped or attached views may not be recycled. isScrap:").append(recyclerView$ViewHolder.isScrap()).append(" isAttached:");
            if (recyclerView$ViewHolder.itemView.getParent() == null) {
                b = false;
            }
            throw new IllegalArgumentException(append.append(b).toString());
        }
        if (recyclerView$ViewHolder.isTmpDetached()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + recyclerView$ViewHolder);
        }
        if (recyclerView$ViewHolder.shouldIgnore()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        }
        if (recyclerView$ViewHolder.isRecyclable()) {
            final boolean invalid = recyclerView$ViewHolder.isInvalid();
            boolean b2 = false;
            Label_0277: {
                if (!invalid) {
                    if (!this.this$0.mState.mInPreLayout) {
                        final boolean removed = recyclerView$ViewHolder.isRemoved();
                        b2 = false;
                        if (removed) {
                            break Label_0277;
                        }
                    }
                    final boolean changed = recyclerView$ViewHolder.isChanged();
                    b2 = false;
                    if (!changed) {
                        if (this.mCachedViews.size() == this.mViewCacheMax && !this.mCachedViews.isEmpty()) {
                            for (int n = 0; n < this.mCachedViews.size() && !this.tryToRecycleCachedViewAt(n); ++n) {}
                        }
                        final int size = this.mCachedViews.size();
                        final int mViewCacheMax = this.mViewCacheMax;
                        b2 = false;
                        if (size < mViewCacheMax) {
                            this.mCachedViews.add(recyclerView$ViewHolder);
                            b2 = b;
                        }
                    }
                }
            }
            if (!b2) {
                this.getRecycledViewPool().putRecycledView(recyclerView$ViewHolder);
                this.dispatchViewRecycled(recyclerView$ViewHolder);
            }
        }
        this.this$0.mState.onViewRecycled(recyclerView$ViewHolder);
    }
    
    void recycleViewInternal(final View view) {
        this.recycleViewHolderInternal(RecyclerView.getChildViewHolderInt(view));
    }
    
    void scrapView(final View view) {
        final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.setScrapContainer(this);
        if (childViewHolderInt.isChanged() && this.this$0.supportsChangeAnimations()) {
            if (this.mChangedScrap == null) {
                this.mChangedScrap = new ArrayList();
            }
            this.mChangedScrap.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.this$0.mAdapter.hasStableIds()) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
        }
        this.mAttachedScrap.add(childViewHolderInt);
    }
    
    void setRecycledViewPool(final RecyclerView$RecycledViewPool mRecyclerPool) {
        if (this.mRecyclerPool != null) {
            this.mRecyclerPool.detach();
        }
        if ((this.mRecyclerPool = mRecyclerPool) != null) {
            this.mRecyclerPool.attach(this.this$0.getAdapter());
        }
    }
    
    void setViewCacheExtension(final RecyclerView$ViewCacheExtension mViewCacheExtension) {
        this.mViewCacheExtension = mViewCacheExtension;
    }
    
    public void setViewCacheSize(final int mViewCacheMax) {
        this.mViewCacheMax = mViewCacheMax;
        for (int n = -1 + this.mCachedViews.size(); n >= 0 && this.mCachedViews.size() > mViewCacheMax; --n) {
            this.tryToRecycleCachedViewAt(n);
        }
        while (this.mCachedViews.size() > mViewCacheMax) {
            this.mCachedViews.remove(-1 + this.mCachedViews.size());
        }
    }
    
    boolean tryToRecycleCachedViewAt(final int n) {
        final RecyclerView$ViewHolder recyclerView$ViewHolder = this.mCachedViews.get(n);
        if (recyclerView$ViewHolder.isRecyclable()) {
            this.getRecycledViewPool().putRecycledView(recyclerView$ViewHolder);
            this.dispatchViewRecycled(recyclerView$ViewHolder);
            this.mCachedViews.remove(n);
            return true;
        }
        return false;
    }
    
    void unscrapView(final RecyclerView$ViewHolder recyclerView$ViewHolder) {
        if (!recyclerView$ViewHolder.isChanged() || !this.this$0.supportsChangeAnimations() || this.mChangedScrap == null) {
            this.mAttachedScrap.remove(recyclerView$ViewHolder);
        }
        else {
            this.mChangedScrap.remove(recyclerView$ViewHolder);
        }
        recyclerView$ViewHolder.mScrapContainer = null;
        recyclerView$ViewHolder.clearReturnedFromScrapFlag();
    }
    
    boolean validateViewHolderForOffsetPosition(final RecyclerView$ViewHolder recyclerView$ViewHolder) {
        if (!recyclerView$ViewHolder.isRemoved()) {
            if (recyclerView$ViewHolder.mPosition < 0 || recyclerView$ViewHolder.mPosition >= this.this$0.mAdapter.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + recyclerView$ViewHolder);
            }
            if (!this.this$0.mState.isPreLayout() && this.this$0.mAdapter.getItemViewType(recyclerView$ViewHolder.mPosition) != recyclerView$ViewHolder.getItemViewType()) {
                return false;
            }
            if (this.this$0.mAdapter.hasStableIds() && recyclerView$ViewHolder.getItemId() != this.this$0.mAdapter.getItemId(recyclerView$ViewHolder.mPosition)) {
                return false;
            }
        }
        return true;
    }
    
    void viewRangeUpdate(final int n, final int n2) {
        final int n3 = n + n2;
        for (int size = this.mCachedViews.size(), i = 0; i < size; ++i) {
            final RecyclerView$ViewHolder recyclerView$ViewHolder = this.mCachedViews.get(i);
            if (recyclerView$ViewHolder != null) {
                final int position = recyclerView$ViewHolder.getPosition();
                if (position >= n && position < n3) {
                    recyclerView$ViewHolder.addFlags(2);
                }
            }
        }
    }
}
