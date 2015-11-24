// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

class ChildHelper
{
    private static final boolean DEBUG = false;
    private static final String TAG = "ChildrenHelper";
    final ChildHelper$Bucket mBucket;
    final ChildHelper$Callback mCallback;
    final List mHiddenViews;
    
    ChildHelper(final ChildHelper$Callback mCallback) {
        this.mCallback = mCallback;
        this.mBucket = new ChildHelper$Bucket();
        this.mHiddenViews = new ArrayList();
    }
    
    private int getOffset(final int n) {
        if (n >= 0) {
            int n2;
            for (int childCount = this.mCallback.getChildCount(), i = n; i < childCount; i += n2) {
                n2 = n - (i - this.mBucket.countOnesBefore(i));
                if (n2 == 0) {
                    while (this.mBucket.get(i)) {
                        ++i;
                    }
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }
    
    void addView(final View view, final int n, final boolean b) {
        int n2;
        if (n < 0) {
            n2 = this.mCallback.getChildCount();
        }
        else {
            n2 = this.getOffset(n);
        }
        this.mCallback.addView(view, n2);
        this.mBucket.insert(n2, b);
        if (b) {
            this.mHiddenViews.add(view);
        }
    }
    
    void addView(final View view, final boolean b) {
        this.addView(view, -1, b);
    }
    
    void attachViewToParent(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams, final boolean b) {
        int n2;
        if (n < 0) {
            n2 = this.mCallback.getChildCount();
        }
        else {
            n2 = this.getOffset(n);
        }
        this.mCallback.attachViewToParent(view, n2, viewGroup$LayoutParams);
        this.mBucket.insert(n2, b);
        if (b) {
            this.mHiddenViews.add(view);
        }
    }
    
    void detachViewFromParent(final int n) {
        final int offset = this.getOffset(n);
        this.mCallback.detachViewFromParent(offset);
        this.mBucket.remove(offset);
    }
    
    View findHiddenNonRemovedView(final int n, final int n2) {
        for (int size = this.mHiddenViews.size(), i = 0; i < size; ++i) {
            final View view = this.mHiddenViews.get(i);
            final RecyclerView$ViewHolder childViewHolder = this.mCallback.getChildViewHolder(view);
            if (childViewHolder.getPosition() == n && !childViewHolder.isInvalid() && (n2 == -1 || childViewHolder.getItemViewType() == n2)) {
                return view;
            }
        }
        return null;
    }
    
    View getChildAt(final int n) {
        return this.mCallback.getChildAt(this.getOffset(n));
    }
    
    int getChildCount() {
        return this.mCallback.getChildCount() - this.mHiddenViews.size();
    }
    
    View getUnfilteredChildAt(final int n) {
        return this.mCallback.getChildAt(n);
    }
    
    int getUnfilteredChildCount() {
        return this.mCallback.getChildCount();
    }
    
    void hide(final View view) {
        final int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.mBucket.set(indexOfChild);
        this.mHiddenViews.add(view);
    }
    
    int indexOfChild(final View view) {
        final int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild != -1 && !this.mBucket.get(indexOfChild)) {
            return indexOfChild - this.mBucket.countOnesBefore(indexOfChild);
        }
        return -1;
    }
    
    boolean isHidden(final View view) {
        return this.mHiddenViews.contains(view);
    }
    
    void removeAllViewsUnfiltered() {
        this.mCallback.removeAllViews();
        this.mBucket.reset();
        this.mHiddenViews.clear();
    }
    
    void removeView(final View view) {
        final int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild >= 0) {
            this.mCallback.removeViewAt(indexOfChild);
            if (this.mBucket.remove(indexOfChild)) {
                this.mHiddenViews.remove(view);
            }
        }
    }
    
    void removeViewAt(final int n) {
        final int offset = this.getOffset(n);
        final View child = this.mCallback.getChildAt(offset);
        if (child != null) {
            this.mCallback.removeViewAt(offset);
            if (this.mBucket.remove(offset)) {
                this.mHiddenViews.remove(child);
            }
        }
    }
    
    boolean removeViewIfHidden(final View view) {
        final int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild == -1) {
            if (this.mHiddenViews.remove(view)) {}
        }
        else {
            if (!this.mBucket.get(indexOfChild)) {
                return false;
            }
            this.mBucket.remove(indexOfChild);
            this.mCallback.removeViewAt(indexOfChild);
            if (!this.mHiddenViews.remove(view)) {
                return true;
            }
        }
        return true;
    }
    
    @Override
    public String toString() {
        return this.mBucket.toString() + ", hidden list:" + this.mHiddenViews.size();
    }
}
