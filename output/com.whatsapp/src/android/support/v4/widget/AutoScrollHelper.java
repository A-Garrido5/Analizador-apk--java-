// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.support.v4.app.FragmentActivity;
import android.content.res.Resources;
import android.view.animation.AccelerateInterpolator;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.View$OnTouchListener;

public abstract class AutoScrollHelper implements View$OnTouchListener
{
    private static final int DEFAULT_ACTIVATION_DELAY;
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    private boolean mAnimating;
    private final Interpolator mEdgeInterpolator;
    private int mEdgeType;
    private boolean mEnabled;
    private boolean mExclusive;
    private float[] mMaximumEdges;
    private float[] mMaximumVelocity;
    private float[] mMinimumVelocity;
    private boolean mNeedsCancel;
    private boolean mNeedsReset;
    private float[] mRelativeEdges;
    private float[] mRelativeVelocity;
    private Runnable mRunnable;
    private final AutoScrollHelper$ClampedScroller mScroller;
    private final View mTarget;
    
    static {
        DEFAULT_ACTIVATION_DELAY = ViewConfiguration.getTapTimeout();
    }
    
    public AutoScrollHelper(final View mTarget) {
        final boolean a = SlidingPaneLayout.a;
        this.mScroller = new AutoScrollHelper$ClampedScroller();
        this.mEdgeInterpolator = (Interpolator)new AccelerateInterpolator();
        this.mRelativeEdges = new float[] { 0.0f, 0.0f };
        this.mMaximumEdges = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
        this.mRelativeVelocity = new float[] { 0.0f, 0.0f };
        this.mMinimumVelocity = new float[] { 0.0f, 0.0f };
        this.mMaximumVelocity = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
        this.mTarget = mTarget;
        final DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        final int n = (int)(0.5f + 1575.0f * displayMetrics.density);
        final int n2 = (int)(0.5f + 315.0f * displayMetrics.density);
        this.setMaximumVelocity(n, n);
        this.setMinimumVelocity(n2, n2);
        this.setEdgeType(1);
        this.setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        this.setRelativeEdges(0.2f, 0.2f);
        this.setRelativeVelocity(1.0f, 1.0f);
        this.setActivationDelay(AutoScrollHelper.DEFAULT_ACTIVATION_DELAY);
        this.setRampUpDuration(500);
        this.setRampDownDuration(500);
        if (a) {
            ++FragmentActivity.a;
        }
    }
    
    static boolean access$100(final AutoScrollHelper autoScrollHelper) {
        return autoScrollHelper.mAnimating;
    }
    
    static boolean access$102(final AutoScrollHelper autoScrollHelper, final boolean mAnimating) {
        return autoScrollHelper.mAnimating = mAnimating;
    }
    
    static boolean access$200(final AutoScrollHelper autoScrollHelper) {
        return autoScrollHelper.mNeedsReset;
    }
    
    static boolean access$202(final AutoScrollHelper autoScrollHelper, final boolean mNeedsReset) {
        return autoScrollHelper.mNeedsReset = mNeedsReset;
    }
    
    static AutoScrollHelper$ClampedScroller access$300(final AutoScrollHelper autoScrollHelper) {
        return autoScrollHelper.mScroller;
    }
    
    static boolean access$400(final AutoScrollHelper autoScrollHelper) {
        return autoScrollHelper.shouldAnimate();
    }
    
    static boolean access$500(final AutoScrollHelper autoScrollHelper) {
        return autoScrollHelper.mNeedsCancel;
    }
    
    static boolean access$502(final AutoScrollHelper autoScrollHelper, final boolean mNeedsCancel) {
        return autoScrollHelper.mNeedsCancel = mNeedsCancel;
    }
    
    static void access$600(final AutoScrollHelper autoScrollHelper) {
        autoScrollHelper.cancelTargetTouch();
    }
    
    static View access$700(final AutoScrollHelper autoScrollHelper) {
        return autoScrollHelper.mTarget;
    }
    
    static int access$800(final int n, final int n2, final int n3) {
        return constrain(n, n2, n3);
    }
    
    static float access$900(final float n, final float n2, final float n3) {
        return constrain(n, n2, n3);
    }
    
    private void cancelTargetTouch() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.mTarget.onTouchEvent(obtain);
        obtain.recycle();
    }
    
    private float computeTargetVelocity(final int n, final float n2, final float n3, final float n4) {
        final float edgeValue = this.getEdgeValue(this.mRelativeEdges[n], n3, this.mMaximumEdges[n], n2);
        if (edgeValue == 0.0f) {
            return 0.0f;
        }
        final float n5 = this.mRelativeVelocity[n];
        final float n6 = this.mMinimumVelocity[n];
        final float n7 = this.mMaximumVelocity[n];
        final float n8 = n5 * n4;
        if (edgeValue > 0.0f) {
            return constrain(edgeValue * n8, n6, n7);
        }
        return -constrain(n8 * -edgeValue, n6, n7);
    }
    
    private static float constrain(final float n, final float n2, final float n3) {
        if (n > n3) {
            return n3;
        }
        if (n < n2) {
            return n2;
        }
        return n;
    }
    
    private static int constrain(final int n, final int n2, final int n3) {
        if (n > n3) {
            return n3;
        }
        if (n < n2) {
            return n2;
        }
        return n;
    }
    
    private float constrainEdgeValue(final float n, final float n2) {
        if (n2 != 0.0f) {
            switch (this.mEdgeType) {
                default: {
                    return 0.0f;
                }
                case 0:
                case 1: {
                    if (n >= n2) {
                        break;
                    }
                    if (n >= 0.0f) {
                        return 1.0f - n / n2;
                    }
                    if (this.mAnimating && this.mEdgeType == 1) {
                        return 1.0f;
                    }
                    break;
                }
                case 2: {
                    if (n < 0.0f) {
                        return n / -n2;
                    }
                    break;
                }
            }
        }
        return 0.0f;
    }
    
    private float getEdgeValue(final float n, final float n2, final float n3, final float n4) {
        final boolean a = SlidingPaneLayout.a;
        final float constrain = constrain(n * n2, 0.0f, n3);
        final float n5 = this.constrainEdgeValue(n2 - n4, constrain) - this.constrainEdgeValue(n4, constrain);
        if (n5 < 0.0f) {
            final float interpolation = -this.mEdgeInterpolator.getInterpolation(-n5);
            if (!a) {
                return constrain(interpolation, -1.0f, 1.0f);
            }
        }
        if (n5 > 0.0f) {
            final float interpolation = this.mEdgeInterpolator.getInterpolation(n5);
            if (!a) {
                return constrain(interpolation, -1.0f, 1.0f);
            }
        }
        return 0.0f;
    }
    
    private void requestStop() {
        if (this.mNeedsReset) {
            this.mAnimating = false;
            if (!SlidingPaneLayout.a) {
                return;
            }
        }
        this.mScroller.requestStop();
    }
    
    private boolean shouldAnimate() {
        final AutoScrollHelper$ClampedScroller mScroller = this.mScroller;
        final int verticalDirection = mScroller.getVerticalDirection();
        final int horizontalDirection = mScroller.getHorizontalDirection();
        return (verticalDirection != 0 && this.canTargetScrollVertically(verticalDirection)) || (horizontalDirection != 0 && this.canTargetScrollHorizontally(horizontalDirection));
    }
    
    private void startAnimating() {
        if (this.mRunnable == null) {
            this.mRunnable = new AutoScrollHelper$ScrollAnimationRunnable(this, null);
        }
        this.mAnimating = true;
        this.mNeedsReset = true;
        Label_0075: {
            if (!this.mAlreadyDelayed && this.mActivationDelay > 0) {
                ViewCompat.postOnAnimationDelayed(this.mTarget, this.mRunnable, this.mActivationDelay);
                if (!SlidingPaneLayout.a) {
                    break Label_0075;
                }
            }
            this.mRunnable.run();
        }
        this.mAlreadyDelayed = true;
    }
    
    public abstract boolean canTargetScrollHorizontally(final int p0);
    
    public abstract boolean canTargetScrollVertically(final int p0);
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        int mNeedsCancel = 1;
        if (!this.mEnabled) {
            return false;
        }
        Label_0153: {
            switch (MotionEventCompat.getActionMasked(motionEvent)) {
                case 0: {
                    this.mNeedsCancel = (mNeedsCancel != 0);
                    this.mAlreadyDelayed = false;
                }
                case 2: {
                    this.mScroller.setTargetVelocity(this.computeTargetVelocity(0, motionEvent.getX(), view.getWidth(), this.mTarget.getWidth()), this.computeTargetVelocity(mNeedsCancel, motionEvent.getY(), view.getHeight(), this.mTarget.getHeight()));
                    if (this.mAnimating || !this.shouldAnimate()) {
                        break;
                    }
                    this.startAnimating();
                    if (SlidingPaneLayout.a) {
                        break Label_0153;
                    }
                    break;
                }
                case 1:
                case 3: {
                    this.requestStop();
                    break;
                }
            }
        }
        if (!this.mExclusive || !this.mAnimating) {
            mNeedsCancel = 0;
        }
        return mNeedsCancel != 0;
    }
    
    public abstract void scrollTargetBy(final int p0, final int p1);
    
    public AutoScrollHelper setActivationDelay(final int mActivationDelay) {
        this.mActivationDelay = mActivationDelay;
        return this;
    }
    
    public AutoScrollHelper setEdgeType(final int mEdgeType) {
        this.mEdgeType = mEdgeType;
        return this;
    }
    
    public AutoScrollHelper setEnabled(final boolean mEnabled) {
        if (this.mEnabled && !mEnabled) {
            this.requestStop();
        }
        this.mEnabled = mEnabled;
        return this;
    }
    
    public AutoScrollHelper setMaximumEdges(final float n, final float n2) {
        this.mMaximumEdges[0] = n;
        this.mMaximumEdges[1] = n2;
        return this;
    }
    
    public AutoScrollHelper setMaximumVelocity(final float n, final float n2) {
        this.mMaximumVelocity[0] = n / 1000.0f;
        this.mMaximumVelocity[1] = n2 / 1000.0f;
        return this;
    }
    
    public AutoScrollHelper setMinimumVelocity(final float n, final float n2) {
        this.mMinimumVelocity[0] = n / 1000.0f;
        this.mMinimumVelocity[1] = n2 / 1000.0f;
        return this;
    }
    
    public AutoScrollHelper setRampDownDuration(final int rampDownDuration) {
        this.mScroller.setRampDownDuration(rampDownDuration);
        return this;
    }
    
    public AutoScrollHelper setRampUpDuration(final int rampUpDuration) {
        this.mScroller.setRampUpDuration(rampUpDuration);
        return this;
    }
    
    public AutoScrollHelper setRelativeEdges(final float n, final float n2) {
        this.mRelativeEdges[0] = n;
        this.mRelativeEdges[1] = n2;
        return this;
    }
    
    public AutoScrollHelper setRelativeVelocity(final float n, final float n2) {
        this.mRelativeVelocity[0] = n / 1000.0f;
        this.mRelativeVelocity[1] = n2 / 1000.0f;
        return this;
    }
}
