// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.os.Parcelable;
import android.view.ViewParent;
import android.view.FocusFinder;
import android.graphics.Canvas;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.support.v4.view.ViewCompat;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.view.VelocityTracker;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import android.support.v4.widget.EdgeEffectCompat;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View;

class RecyclerView$4 implements ChildHelper$Callback
{
    final /* synthetic */ RecyclerView this$0;
    
    RecyclerView$4(final RecyclerView this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void addView(final View view, final int n) {
        this.this$0.addView(view, n);
        this.this$0.dispatchChildAttached(view);
    }
    
    @Override
    public void attachViewToParent(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt);
            }
            childViewHolderInt.clearTmpDetachFlag();
        }
        RecyclerView.access$800(this.this$0, view, n, viewGroup$LayoutParams);
    }
    
    @Override
    public void detachViewFromParent(final int n) {
        final View child = this.getChildAt(n);
        if (child != null) {
            final RecyclerView$ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(child);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt);
                }
                childViewHolderInt.addFlags(256);
            }
        }
        RecyclerView.access$900(this.this$0, n);
    }
    
    @Override
    public View getChildAt(final int n) {
        return this.this$0.getChildAt(n);
    }
    
    @Override
    public int getChildCount() {
        return this.this$0.getChildCount();
    }
    
    @Override
    public RecyclerView$ViewHolder getChildViewHolder(final View view) {
        return RecyclerView.getChildViewHolderInt(view);
    }
    
    @Override
    public int indexOfChild(final View view) {
        return this.this$0.indexOfChild(view);
    }
    
    @Override
    public void removeAllViews() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            this.this$0.dispatchChildDetached(this.getChildAt(i));
        }
        this.this$0.removeAllViews();
    }
    
    @Override
    public void removeViewAt(final int n) {
        final View child = this.this$0.getChildAt(n);
        if (child != null) {
            this.this$0.dispatchChildDetached(child);
        }
        this.this$0.removeViewAt(n);
    }
}
