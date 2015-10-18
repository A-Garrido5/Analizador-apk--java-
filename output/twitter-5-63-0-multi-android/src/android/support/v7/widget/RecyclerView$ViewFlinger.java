// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.graphics.PointF;
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
import android.view.ViewGroup$LayoutParams;
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
import android.view.ViewGroup;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ScrollerCompat;
import android.view.animation.Interpolator;

class RecyclerView$ViewFlinger implements Runnable
{
    private boolean mEatRunOnAnimationRequest;
    private Interpolator mInterpolator;
    private int mLastFlingX;
    private int mLastFlingY;
    private boolean mReSchedulePostAnimationCallback;
    private ScrollerCompat mScroller;
    final /* synthetic */ RecyclerView this$0;
    
    public RecyclerView$ViewFlinger(final RecyclerView this$0) {
        this.this$0 = this$0;
        this.mInterpolator = RecyclerView.sQuinticInterpolator;
        this.mEatRunOnAnimationRequest = false;
        this.mReSchedulePostAnimationCallback = false;
        this.mScroller = ScrollerCompat.create(this$0.getContext(), RecyclerView.sQuinticInterpolator);
    }
    
    private int computeScrollDuration(final int n, final int n2, final int n3, final int n4) {
        final int abs = Math.abs(n);
        final int abs2 = Math.abs(n2);
        boolean b;
        if (abs > abs2) {
            b = true;
        }
        else {
            b = false;
        }
        final int n5 = (int)Math.sqrt(n3 * n3 + n4 * n4);
        final int n6 = (int)Math.sqrt(n * n + n2 * n2);
        int n7;
        if (b) {
            n7 = this.this$0.getWidth();
        }
        else {
            n7 = this.this$0.getHeight();
        }
        final int n8 = n7 / 2;
        final float n9 = n8 + n8 * this.distanceInfluenceForSnapDuration(Math.min(1.0f, 1.0f * n6 / n7));
        int n10;
        if (n5 > 0) {
            n10 = 4 * Math.round(1000.0f * Math.abs(n9 / n5));
        }
        else {
            int n11;
            if (b) {
                n11 = abs;
            }
            else {
                n11 = abs2;
            }
            n10 = (int)(300.0f * (1.0f + n11 / n7));
        }
        return Math.min(n10, 2000);
    }
    
    private void disableRunOnAnimationRequests() {
        this.mReSchedulePostAnimationCallback = false;
        this.mEatRunOnAnimationRequest = true;
    }
    
    private float distanceInfluenceForSnapDuration(final float n) {
        return (float)Math.sin((float)(0.4712389167638204 * (n - 0.5f)));
    }
    
    private void enableRunOnAnimationRequests() {
        this.mEatRunOnAnimationRequest = false;
        if (this.mReSchedulePostAnimationCallback) {
            this.postOnAnimation();
        }
    }
    
    public void fling(final int n, final int n2) {
        this.this$0.setScrollState(2);
        this.mLastFlingY = 0;
        this.mLastFlingX = 0;
        this.mScroller.fling(0, 0, n, n2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.postOnAnimation();
    }
    
    void postOnAnimation() {
        if (this.mEatRunOnAnimationRequest) {
            this.mReSchedulePostAnimationCallback = true;
            return;
        }
        ViewCompat.postOnAnimation((View)this.this$0, this);
    }
    
    @Override
    public void run() {
        this.disableRunOnAnimationRequests();
        this.this$0.consumePendingUpdateOperations();
        final ScrollerCompat mScroller = this.mScroller;
        final RecyclerView$SmoothScroller mSmoothScroller = this.this$0.mLayout.mSmoothScroller;
        if (mScroller.computeScrollOffset()) {
            final int currX = mScroller.getCurrX();
            final int currY = mScroller.getCurrY();
            final int n = currX - this.mLastFlingX;
            final int n2 = currY - this.mLastFlingY;
            this.mLastFlingX = currX;
            this.mLastFlingY = currY;
            final RecyclerView$Adapter access$2200 = this.this$0.mAdapter;
            int n3 = 0;
            int scrollVerticallyBy = 0;
            int n4 = 0;
            int scrollHorizontallyBy = 0;
            if (access$2200 != null) {
                this.this$0.eatRequestLayout();
                this.this$0.mRunningLayoutOrScroll = true;
                n4 = 0;
                scrollHorizontallyBy = 0;
                if (n != 0) {
                    scrollHorizontallyBy = this.this$0.mLayout.scrollHorizontallyBy(n, this.this$0.mRecycler, this.this$0.mState);
                    n4 = n - scrollHorizontallyBy;
                }
                n3 = 0;
                scrollVerticallyBy = 0;
                if (n2 != 0) {
                    scrollVerticallyBy = this.this$0.mLayout.scrollVerticallyBy(n2, this.this$0.mRecycler, this.this$0.mState);
                    n3 = n2 - scrollVerticallyBy;
                }
                if (this.this$0.supportsChangeAnimations()) {
                    for (int childCount = this.this$0.mChildHelper.getChildCount(), i = 0; i < childCount; ++i) {
                        final View child = this.this$0.mChildHelper.getChildAt(i);
                        final RecyclerView$ViewHolder childViewHolder = this.this$0.getChildViewHolder(child);
                        if (childViewHolder != null && childViewHolder.mShadowingHolder != null) {
                            View itemView;
                            if (childViewHolder.mShadowingHolder != null) {
                                itemView = childViewHolder.mShadowingHolder.itemView;
                            }
                            else {
                                itemView = null;
                            }
                            if (itemView != null) {
                                final int left = child.getLeft();
                                final int top = child.getTop();
                                if (left != itemView.getLeft() || top != itemView.getTop()) {
                                    itemView.layout(left, top, left + itemView.getWidth(), top + itemView.getHeight());
                                }
                            }
                        }
                    }
                }
                if (mSmoothScroller != null && !mSmoothScroller.isPendingInitialRun() && mSmoothScroller.isRunning()) {
                    final int itemCount = this.this$0.mState.getItemCount();
                    if (itemCount == 0) {
                        mSmoothScroller.stop();
                    }
                    else if (mSmoothScroller.getTargetPosition() >= itemCount) {
                        mSmoothScroller.setTargetPosition(itemCount - 1);
                        mSmoothScroller.onAnimation(n - n4, n2 - n3);
                    }
                    else {
                        mSmoothScroller.onAnimation(n - n4, n2 - n3);
                    }
                }
                this.this$0.mRunningLayoutOrScroll = false;
                this.this$0.resumeRequestLayout(false);
            }
            final int n5 = n3;
            final int n6 = n4;
            final int n7 = scrollVerticallyBy;
            final int n8 = scrollHorizontallyBy;
            boolean b;
            if (n == n8 && n2 == n7) {
                b = true;
            }
            else {
                b = false;
            }
            if (!this.this$0.mItemDecorations.isEmpty()) {
                this.this$0.invalidate();
            }
            if (ViewCompat.getOverScrollMode((View)this.this$0) != 2) {
                this.this$0.considerReleasingGlowsOnScroll(n, n2);
            }
            if (n6 != 0 || n5 != 0) {
                int n9 = (int)mScroller.getCurrVelocity();
                int n11;
                if (n6 != currX) {
                    int n10;
                    if (n6 < 0) {
                        n10 = -n9;
                    }
                    else if (n6 > 0) {
                        n10 = n9;
                    }
                    else {
                        n10 = 0;
                    }
                    n11 = n10;
                }
                else {
                    n11 = 0;
                }
                if (n5 != currY) {
                    if (n5 < 0) {
                        n9 = -n9;
                    }
                    else if (n5 <= 0) {
                        n9 = 0;
                    }
                }
                else {
                    n9 = 0;
                }
                if (ViewCompat.getOverScrollMode((View)this.this$0) != 2) {
                    this.this$0.absorbGlows(n11, n9);
                }
                if ((n11 != 0 || n6 == currX || mScroller.getFinalX() == 0) && (n9 != 0 || n5 == currY || mScroller.getFinalY() == 0)) {
                    mScroller.abortAnimation();
                }
            }
            if (n8 != 0 || n7 != 0) {
                RecyclerView.access$2800(this.this$0, 0, 0, 0, 0);
                if (this.this$0.mScrollListener != null) {
                    this.this$0.mScrollListener.onScrolled(this.this$0, n8, n7);
                }
            }
            if (!RecyclerView.access$3000(this.this$0)) {
                this.this$0.invalidate();
            }
            if (mScroller.isFinished() || !b) {
                this.this$0.setScrollState(0);
            }
            else {
                this.postOnAnimation();
            }
        }
        if (mSmoothScroller != null && mSmoothScroller.isPendingInitialRun()) {
            mSmoothScroller.onAnimation(0, 0);
        }
        this.enableRunOnAnimationRequests();
    }
    
    public void smoothScrollBy(final int n, final int n2) {
        this.smoothScrollBy(n, n2, 0, 0);
    }
    
    public void smoothScrollBy(final int n, final int n2, final int n3) {
        this.smoothScrollBy(n, n2, n3, RecyclerView.sQuinticInterpolator);
    }
    
    public void smoothScrollBy(final int n, final int n2, final int n3, final int n4) {
        this.smoothScrollBy(n, n2, this.computeScrollDuration(n, n2, n3, n4));
    }
    
    public void smoothScrollBy(final int n, final int n2, final int n3, final Interpolator mInterpolator) {
        if (this.mInterpolator != mInterpolator) {
            this.mInterpolator = mInterpolator;
            this.mScroller = ScrollerCompat.create(this.this$0.getContext(), mInterpolator);
        }
        this.this$0.setScrollState(2);
        this.mLastFlingY = 0;
        this.mLastFlingX = 0;
        this.mScroller.startScroll(0, 0, n, n2, n3);
        this.postOnAnimation();
    }
    
    public void stop() {
        this.this$0.removeCallbacks((Runnable)this);
        this.mScroller.abortAnimation();
    }
}
