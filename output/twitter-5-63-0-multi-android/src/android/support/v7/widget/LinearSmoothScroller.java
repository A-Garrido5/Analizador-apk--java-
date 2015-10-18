// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;
import android.util.DisplayMetrics;
import android.view.View;
import android.content.Context;
import android.graphics.PointF;
import android.view.animation.LinearInterpolator;
import android.view.animation.DecelerateInterpolator;

public abstract class LinearSmoothScroller extends RecyclerView$SmoothScroller
{
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final String TAG = "LinearSmoothScroller";
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    private final float MILLISECONDS_PER_PX;
    protected final DecelerateInterpolator mDecelerateInterpolator;
    protected int mInterimTargetDx;
    protected int mInterimTargetDy;
    protected final LinearInterpolator mLinearInterpolator;
    protected PointF mTargetVector;
    
    public LinearSmoothScroller(final Context context) {
        this.mLinearInterpolator = new LinearInterpolator();
        this.mDecelerateInterpolator = new DecelerateInterpolator();
        this.mInterimTargetDx = 0;
        this.mInterimTargetDy = 0;
        this.MILLISECONDS_PER_PX = this.calculateSpeedPerPixel(context.getResources().getDisplayMetrics());
    }
    
    private int clampApplyScroll(final int n, final int n2) {
        int n3 = n - n2;
        if (n * n3 <= 0) {
            n3 = 0;
        }
        return n3;
    }
    
    public int calculateDtToFit(final int n, final int n2, final int n3, final int n4, final int n5) {
        int n6 = 0;
        switch (n5) {
            default: {
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            case -1: {
                n6 = n3 - n;
                break;
            }
            case 1: {
                return n4 - n2;
            }
            case 0: {
                n6 = n3 - n;
                if (n6 > 0) {
                    break;
                }
                n6 = n4 - n2;
                if (n6 >= 0) {
                    return 0;
                }
                break;
            }
        }
        return n6;
    }
    
    public int calculateDxToMakeVisible(final View view, final int n) {
        final RecyclerView$LayoutManager layoutManager = this.getLayoutManager();
        if (!layoutManager.canScrollHorizontally()) {
            return 0;
        }
        final RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        return this.calculateDtToFit(layoutManager.getDecoratedLeft(view) - recyclerView$LayoutParams.leftMargin, layoutManager.getDecoratedRight(view) + recyclerView$LayoutParams.rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), n);
    }
    
    public int calculateDyToMakeVisible(final View view, final int n) {
        final RecyclerView$LayoutManager layoutManager = this.getLayoutManager();
        if (!layoutManager.canScrollVertically()) {
            return 0;
        }
        final RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        return this.calculateDtToFit(layoutManager.getDecoratedTop(view) - recyclerView$LayoutParams.topMargin, layoutManager.getDecoratedBottom(view) + recyclerView$LayoutParams.bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), n);
    }
    
    protected float calculateSpeedPerPixel(final DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }
    
    protected int calculateTimeForDeceleration(final int n) {
        return (int)Math.ceil(this.calculateTimeForScrolling(n) / 0.3356);
    }
    
    protected int calculateTimeForScrolling(final int n) {
        return (int)Math.ceil(Math.abs(n) * this.MILLISECONDS_PER_PX);
    }
    
    public abstract PointF computeScrollVectorForPosition(final int p0);
    
    protected int getHorizontalSnapPreference() {
        if (this.mTargetVector == null || this.mTargetVector.x == 0.0f) {
            return 0;
        }
        if (this.mTargetVector.x > 0.0f) {
            return 1;
        }
        return -1;
    }
    
    protected int getVerticalSnapPreference() {
        if (this.mTargetVector == null || this.mTargetVector.y == 0.0f) {
            return 0;
        }
        if (this.mTargetVector.y > 0.0f) {
            return 1;
        }
        return -1;
    }
    
    @Override
    protected void onSeekTargetStep(final int n, final int n2, final RecyclerView$State recyclerView$State, final RecyclerView$SmoothScroller$Action recyclerView$SmoothScroller$Action) {
        if (this.getChildCount() == 0) {
            this.stop();
        }
        else {
            this.mInterimTargetDx = this.clampApplyScroll(this.mInterimTargetDx, n);
            this.mInterimTargetDy = this.clampApplyScroll(this.mInterimTargetDy, n2);
            if (this.mInterimTargetDx == 0 && this.mInterimTargetDy == 0) {
                this.updateActionForInterimTarget(recyclerView$SmoothScroller$Action);
            }
        }
    }
    
    @Override
    protected void onStart() {
    }
    
    @Override
    protected void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }
    
    @Override
    protected void onTargetFound(final View view, final RecyclerView$State recyclerView$State, final RecyclerView$SmoothScroller$Action recyclerView$SmoothScroller$Action) {
        final int calculateDxToMakeVisible = this.calculateDxToMakeVisible(view, this.getHorizontalSnapPreference());
        final int calculateDyToMakeVisible = this.calculateDyToMakeVisible(view, this.getVerticalSnapPreference());
        final int calculateTimeForDeceleration = this.calculateTimeForDeceleration((int)Math.sqrt(calculateDxToMakeVisible * calculateDxToMakeVisible + calculateDyToMakeVisible * calculateDyToMakeVisible));
        if (calculateTimeForDeceleration > 0) {
            recyclerView$SmoothScroller$Action.update(-calculateDxToMakeVisible, -calculateDyToMakeVisible, calculateTimeForDeceleration, (Interpolator)this.mDecelerateInterpolator);
        }
    }
    
    protected void updateActionForInterimTarget(final RecyclerView$SmoothScroller$Action recyclerView$SmoothScroller$Action) {
        final PointF computeScrollVectorForPosition = this.computeScrollVectorForPosition(this.getTargetPosition());
        if (computeScrollVectorForPosition == null || (computeScrollVectorForPosition.x == 0.0f && computeScrollVectorForPosition.y == 0.0f)) {
            Log.e("LinearSmoothScroller", "To support smooth scrolling, you should override \nLayoutManager#computeScrollVectorForPosition.\nFalling back to instant scroll");
            final int targetPosition = this.getTargetPosition();
            this.stop();
            this.instantScrollToPosition(targetPosition);
            return;
        }
        this.normalize(computeScrollVectorForPosition);
        this.mTargetVector = computeScrollVectorForPosition;
        this.mInterimTargetDx = (int)(10000.0f * computeScrollVectorForPosition.x);
        this.mInterimTargetDy = (int)(10000.0f * computeScrollVectorForPosition.y);
        recyclerView$SmoothScroller$Action.update((int)(1.2f * this.mInterimTargetDx), (int)(1.2f * this.mInterimTargetDy), (int)(1.2f * this.calculateTimeForScrolling(10000)), (Interpolator)this.mLinearInterpolator);
    }
}
