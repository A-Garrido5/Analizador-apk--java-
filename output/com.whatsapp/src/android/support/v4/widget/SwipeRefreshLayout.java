// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.View$MeasureSpec;
import android.util.Log;
import android.widget.AbsListView;
import android.os.Build$VERSION;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.util.DisplayMetrics;
import android.content.res.TypedArray;
import android.support.v4.view.ViewCompat;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Animation;
import android.view.ViewGroup;

public class SwipeRefreshLayout extends ViewGroup
{
    private static final int[] LAYOUT_ATTRS;
    private static final String LOG_TAG;
    private static final String[] z;
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private int mCircleHeight;
    private CircleImageView mCircleView;
    private int mCircleViewIndex;
    private int mCircleWidth;
    private int mCurrentTargetOffsetTop;
    private final DecelerateInterpolator mDecelerateInterpolator;
    protected int mFrom;
    private float mInitialDownY;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    private SwipeRefreshLayout$OnRefreshListener mListener;
    private int mMediumAnimationDuration;
    private boolean mNotify;
    private boolean mOriginalOffsetCalculated;
    protected int mOriginalOffsetTop;
    private MaterialProgressDrawable mProgress;
    private Animation$AnimationListener mRefreshListener;
    private boolean mRefreshing;
    private boolean mReturningToStart;
    private boolean mScale;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    private float mSpinnerFinalOffset;
    private float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private int mTouchSlop;
    private boolean mUsingCustomStart;
    
    static {
        final String[] z2 = new String[3];
        String s = "t\u007f\u000bO\u0016pD6 \u0019l]09\u0012\u0013u\t\n9G0\u001d\u001a#\u0013t\u0010\u0001pG0\u0017\u000e!V0\u001e\u0001wRs\u000b\u0006!V0\u000f\u0000>]d\u001a\u001dwZtQ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'W';
                        break;
                    }
                    case 0: {
                        c2 = '3';
                        break;
                    }
                    case 1: {
                        c2 = '\u0010';
                        break;
                    }
                    case 2: {
                        c2 = '\u007f';
                        break;
                    }
                    case 3: {
                        c2 = 'o';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "t\u007f\u000bO\u0016pD6 \u0019l]09\u0012\u0013u\t\n9G0\u001d\u001a#\u0013x\u001e\u00192\u0013q\u0011O>]f\u001e\u0003>W0\u001e\f#Zf\u001aO'\\y\u0011\u001b2A0\u0016\u000by";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "t\u007f\u000bO\u0016pD6 \u0019lE/O2Eu\u0011\u001bwQe\u000bO3\\~X\u001bw[q\t\nwR~_\u000e4Gy\t\nwC\u007f\u0016\u0001#Vb_\u00063\u001d";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        LOG_TAG = SwipeRefreshLayout.class.getSimpleName();
        LAYOUT_ATTRS = new int[] { 16842766 };
    }
    
    public SwipeRefreshLayout(final Context context) {
        this(context, null);
    }
    
    public SwipeRefreshLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.mRefreshing = false;
        this.mTotalDragDistance = -1.0f;
        this.mOriginalOffsetCalculated = false;
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        this.mRefreshListener = (Animation$AnimationListener)new SwipeRefreshLayout$1(this);
        this.mAnimateToCorrectPosition = new SwipeRefreshLayout$6(this);
        this.mAnimateToStartPosition = new SwipeRefreshLayout$7(this);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMediumAnimationDuration = this.getResources().getInteger(17694721);
        this.setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(2.0f);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, SwipeRefreshLayout.LAYOUT_ATTRS);
        this.setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.mCircleWidth = (int)(40.0f * displayMetrics.density);
        this.mCircleHeight = (int)(40.0f * displayMetrics.density);
        this.createProgressView();
        ViewCompat.setChildrenDrawingOrderEnabled(this, true);
        this.mSpinnerFinalOffset = 64.0f * displayMetrics.density;
        this.mTotalDragDistance = this.mSpinnerFinalOffset;
    }
    
    static boolean access$000(final SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mRefreshing;
    }
    
    static MaterialProgressDrawable access$100(final SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mProgress;
    }
    
    static void access$1000(final SwipeRefreshLayout swipeRefreshLayout, final Animation$AnimationListener animation$AnimationListener) {
        swipeRefreshLayout.startScaleDownAnimation(animation$AnimationListener);
    }
    
    static boolean access$1100(final SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mUsingCustomStart;
    }
    
    static float access$1200(final SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mSpinnerFinalOffset;
    }
    
    static void access$1300(final SwipeRefreshLayout swipeRefreshLayout, final float n) {
        swipeRefreshLayout.moveToStart(n);
    }
    
    static float access$1400(final SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mStartingScale;
    }
    
    static boolean access$200(final SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mNotify;
    }
    
    static SwipeRefreshLayout$OnRefreshListener access$300(final SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mListener;
    }
    
    static CircleImageView access$400(final SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mCircleView;
    }
    
    static void access$500(final SwipeRefreshLayout swipeRefreshLayout, final int colorViewAlpha) {
        swipeRefreshLayout.setColorViewAlpha(colorViewAlpha);
    }
    
    static boolean access$600(final SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mScale;
    }
    
    static void access$700(final SwipeRefreshLayout swipeRefreshLayout, final float animationProgress) {
        swipeRefreshLayout.setAnimationProgress(animationProgress);
    }
    
    static int access$800(final SwipeRefreshLayout swipeRefreshLayout) {
        return swipeRefreshLayout.mCurrentTargetOffsetTop;
    }
    
    static int access$802(final SwipeRefreshLayout swipeRefreshLayout, final int mCurrentTargetOffsetTop) {
        return swipeRefreshLayout.mCurrentTargetOffsetTop = mCurrentTargetOffsetTop;
    }
    
    static void access$900(final SwipeRefreshLayout swipeRefreshLayout, final int n, final boolean b) {
        swipeRefreshLayout.setTargetOffsetTopAndBottom(n, b);
    }
    
    private void animateOffsetToCorrectPosition(final int mFrom, final Animation$AnimationListener animationListener) {
        this.mFrom = mFrom;
        this.mAnimateToCorrectPosition.reset();
        this.mAnimateToCorrectPosition.setDuration(200L);
        this.mAnimateToCorrectPosition.setInterpolator((Interpolator)this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
    }
    
    private void animateOffsetToStartPosition(final int mFrom, final Animation$AnimationListener animationListener) {
        if (this.mScale) {
            this.startScaleDownReturnToStartAnimation(mFrom, animationListener);
            if (!SlidingPaneLayout.a) {
                return;
            }
        }
        this.mFrom = mFrom;
        this.mAnimateToStartPosition.reset();
        this.mAnimateToStartPosition.setDuration(200L);
        this.mAnimateToStartPosition.setInterpolator((Interpolator)this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToStartPosition);
    }
    
    private void createProgressView() {
        this.mCircleView = new CircleImageView(this.getContext(), -328966, 20.0f);
        (this.mProgress = new MaterialProgressDrawable(this.getContext(), (View)this)).setBackgroundColor(-328966);
        this.mCircleView.setImageDrawable((Drawable)this.mProgress);
        this.mCircleView.setVisibility(8);
        this.addView((View)this.mCircleView);
    }
    
    private void ensureTarget() {
        final boolean a = SlidingPaneLayout.a;
        if (this.mTarget == null) {
            int i = 0;
            while (i < this.getChildCount()) {
                final View child = this.getChildAt(i);
                if (!child.equals(this.mCircleView)) {
                    this.mTarget = child;
                    if (!a) {
                        break;
                    }
                }
                ++i;
                if (a) {
                    break;
                }
            }
        }
    }
    
    private float getMotionEventY(final MotionEvent motionEvent, final int n) {
        final int pointerIndex = MotionEventCompat.findPointerIndex(motionEvent, n);
        if (pointerIndex < 0) {
            return -1.0f;
        }
        return MotionEventCompat.getY(motionEvent, pointerIndex);
    }
    
    private boolean isAlphaUsedForScale() {
        return Build$VERSION.SDK_INT < 11;
    }
    
    private boolean isAnimationRunning(final Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }
    
    private void moveToStart(final float n) {
        this.setTargetOffsetTopAndBottom(this.mFrom + (int)(n * (this.mOriginalOffsetTop - this.mFrom)) - this.mCircleView.getTop(), false);
    }
    
    private void onSecondaryPointerUp(final MotionEvent motionEvent) {
        final int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, n);
        }
    }
    
    private void setAnimationProgress(final float n) {
        if (this.isAlphaUsedForScale()) {
            this.setColorViewAlpha((int)(255.0f * n));
            if (!SlidingPaneLayout.a) {
                return;
            }
        }
        ViewCompat.setScaleX((View)this.mCircleView, n);
        ViewCompat.setScaleY((View)this.mCircleView, n);
    }
    
    private void setColorViewAlpha(final int n) {
        this.mCircleView.getBackground().setAlpha(n);
        this.mProgress.setAlpha(n);
    }
    
    private void setRefreshing(final boolean mRefreshing, final boolean mNotify) {
        if (this.mRefreshing != mRefreshing) {
            this.mNotify = mNotify;
            this.ensureTarget();
            this.mRefreshing = mRefreshing;
            if (this.mRefreshing) {
                this.animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
                if (!SlidingPaneLayout.a) {
                    return;
                }
            }
            this.startScaleDownAnimation(this.mRefreshListener);
        }
    }
    
    private void setTargetOffsetTopAndBottom(final int n, final boolean b) {
        this.mCircleView.bringToFront();
        this.mCircleView.offsetTopAndBottom(n);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
        if (b && Build$VERSION.SDK_INT < 11) {
            this.invalidate();
        }
    }
    
    private Animation startAlphaAnimation(final int n, final int n2) {
        if (this.mScale && this.isAlphaUsedForScale()) {
            return null;
        }
        final SwipeRefreshLayout$4 swipeRefreshLayout$4 = new SwipeRefreshLayout$4(this, n, n2);
        swipeRefreshLayout$4.setDuration(300L);
        this.mCircleView.setAnimationListener(null);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation((Animation)swipeRefreshLayout$4);
        return swipeRefreshLayout$4;
    }
    
    private void startProgressAlphaMaxAnimation() {
        this.mAlphaMaxAnimation = this.startAlphaAnimation(this.mProgress.getAlpha(), 255);
    }
    
    private void startProgressAlphaStartAnimation() {
        this.mAlphaStartAnimation = this.startAlphaAnimation(this.mProgress.getAlpha(), 76);
    }
    
    private void startScaleDownAnimation(final Animation$AnimationListener animationListener) {
        (this.mScaleDownAnimation = new SwipeRefreshLayout$3(this)).setDuration(150L);
        this.mCircleView.setAnimationListener(animationListener);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }
    
    private void startScaleDownReturnToStartAnimation(final int mFrom, final Animation$AnimationListener animationListener) {
        this.mFrom = mFrom;
        Label_0041: {
            if (this.isAlphaUsedForScale()) {
                this.mStartingScale = this.mProgress.getAlpha();
                if (!SlidingPaneLayout.a) {
                    break Label_0041;
                }
            }
            this.mStartingScale = ViewCompat.getScaleX((View)this.mCircleView);
        }
        (this.mScaleDownToStartAnimation = new SwipeRefreshLayout$8(this)).setDuration(150L);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
    }
    
    public boolean canChildScrollUp() {
        if (Build$VERSION.SDK_INT >= 14) {
            return ViewCompat.canScrollVertically(this.mTarget, -1);
        }
        if (this.mTarget instanceof AbsListView) {
            final AbsListView absListView = (AbsListView)this.mTarget;
            return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
        }
        if (!ViewCompat.canScrollVertically(this.mTarget, -1)) {
            final int scrollY = this.mTarget.getScrollY();
            final boolean b = false;
            if (scrollY <= 0) {
                return b;
            }
        }
        return true;
    }
    
    protected int getChildDrawingOrder(final int n, final int n2) {
        if (this.mCircleViewIndex >= 0) {
            if (n2 == n - 1) {
                return this.mCircleViewIndex;
            }
            if (n2 >= this.mCircleViewIndex) {
                return n2 + 1;
            }
        }
        return n2;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final boolean a = SlidingPaneLayout.a;
        this.ensureTarget();
        final int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (this.isEnabled() && !this.mReturningToStart && !this.canChildScrollUp() && !this.mRefreshing) {
            Label_0274: {
                switch (actionMasked) {
                    case 0: {
                        this.setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop(), true);
                        this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                        this.mIsBeingDragged = false;
                        final float motionEventY = this.getMotionEventY(motionEvent, this.mActivePointerId);
                        if (motionEventY == -1.0f) {
                            return false;
                        }
                        this.mInitialDownY = motionEventY;
                        if (a) {
                            break Label_0274;
                        }
                        break;
                    }
                    case 2: {
                        if (this.mActivePointerId == -1) {
                            Log.e(SwipeRefreshLayout.LOG_TAG, SwipeRefreshLayout.z[0]);
                            return false;
                        }
                        final float motionEventY2 = this.getMotionEventY(motionEvent, this.mActivePointerId);
                        if (motionEventY2 == -1.0f) {
                            return false;
                        }
                        if (motionEventY2 - this.mInitialDownY <= this.mTouchSlop || this.mIsBeingDragged) {
                            break;
                        }
                        this.mInitialMotionY = this.mInitialDownY + this.mTouchSlop;
                        this.mIsBeingDragged = true;
                        this.mProgress.setAlpha(76);
                        if (a) {
                            break Label_0274;
                        }
                        break;
                    }
                    case 6: {
                        this.onSecondaryPointerUp(motionEvent);
                        if (a) {
                            break Label_0274;
                        }
                        break;
                    }
                    case 1:
                    case 3: {
                        this.mIsBeingDragged = false;
                        this.mActivePointerId = -1;
                        break;
                    }
                }
            }
            return this.mIsBeingDragged;
        }
        return false;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        if (this.getChildCount() != 0) {
            if (this.mTarget == null) {
                this.ensureTarget();
            }
            if (this.mTarget != null) {
                final View mTarget = this.mTarget;
                final int paddingLeft = this.getPaddingLeft();
                final int paddingTop = this.getPaddingTop();
                mTarget.layout(paddingLeft, paddingTop, measuredWidth - this.getPaddingLeft() - this.getPaddingRight() + paddingLeft, measuredHeight - this.getPaddingTop() - this.getPaddingBottom() + paddingTop);
                final int measuredWidth2 = this.mCircleView.getMeasuredWidth();
                this.mCircleView.layout(measuredWidth / 2 - measuredWidth2 / 2, this.mCurrentTargetOffsetTop, measuredWidth / 2 + measuredWidth2 / 2, this.mCircleView.getMeasuredHeight() + this.mCurrentTargetOffsetTop);
            }
        }
    }
    
    public void onMeasure(final int n, final int n2) {
        final boolean a = SlidingPaneLayout.a;
        super.onMeasure(n, n2);
        if (this.mTarget == null) {
            this.ensureTarget();
        }
        if (this.mTarget != null) {
            this.mTarget.measure(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), 1073741824), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), 1073741824));
            this.mCircleView.measure(View$MeasureSpec.makeMeasureSpec(this.mCircleWidth, 1073741824), View$MeasureSpec.makeMeasureSpec(this.mCircleHeight, 1073741824));
            if (!this.mUsingCustomStart && !this.mOriginalOffsetCalculated) {
                this.mOriginalOffsetCalculated = true;
                final int n3 = -this.mCircleView.getMeasuredHeight();
                this.mOriginalOffsetTop = n3;
                this.mCurrentTargetOffsetTop = n3;
            }
            this.mCircleViewIndex = -1;
            int i = 0;
            while (i < this.getChildCount()) {
                if (this.getChildAt(i) == this.mCircleView) {
                    this.mCircleViewIndex = i;
                    if (!a) {
                        break;
                    }
                }
                ++i;
                if (a) {
                    return;
                }
            }
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean a = SlidingPaneLayout.a;
        final int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!this.isEnabled() || this.mReturningToStart || this.canChildScrollUp()) {
            return false;
        }
        Label_0560: {
            switch (actionMasked) {
                case 0: {
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                    this.mIsBeingDragged = false;
                    if (a) {
                        break Label_0560;
                    }
                    break;
                }
                case 2: {
                    final int pointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId);
                    if (pointerIndex < 0) {
                        Log.e(SwipeRefreshLayout.LOG_TAG, SwipeRefreshLayout.z[1]);
                        return false;
                    }
                    final float n = 0.5f * (MotionEventCompat.getY(motionEvent, pointerIndex) - this.mInitialMotionY);
                    if (!this.mIsBeingDragged) {
                        break;
                    }
                    this.mProgress.showArrow(true);
                    final float n2 = n / this.mTotalDragDistance;
                    if (n2 < 0.0f) {
                        return false;
                    }
                    final float min = Math.min(1.0f, Math.abs(n2));
                    final float n3 = 5.0f * (float)Math.max(min - 0.4, 0.0) / 3.0f;
                    final float n4 = Math.abs(n) - this.mTotalDragDistance;
                    float mSpinnerFinalOffset;
                    if (this.mUsingCustomStart) {
                        mSpinnerFinalOffset = this.mSpinnerFinalOffset - this.mOriginalOffsetTop;
                    }
                    else {
                        mSpinnerFinalOffset = this.mSpinnerFinalOffset;
                    }
                    final float max = Math.max(0.0f, Math.min(n4, 2.0f * mSpinnerFinalOffset) / mSpinnerFinalOffset);
                    final float n5 = 2.0f * (float)(max / 4.0f - Math.pow(max / 4.0f, 2.0));
                    final int n6 = this.mOriginalOffsetTop + (int)(2.0f * (mSpinnerFinalOffset * n5) + mSpinnerFinalOffset * min);
                    if (this.mCircleView.getVisibility() != 0) {
                        this.mCircleView.setVisibility(0);
                    }
                    if (!this.mScale) {
                        ViewCompat.setScaleX((View)this.mCircleView, 1.0f);
                        ViewCompat.setScaleY((View)this.mCircleView, 1.0f);
                    }
                    Label_0489: {
                        if (n < this.mTotalDragDistance) {
                            if (this.mScale) {
                                this.setAnimationProgress(n / this.mTotalDragDistance);
                            }
                            if (this.mProgress.getAlpha() > 76 && !this.isAnimationRunning(this.mAlphaStartAnimation)) {
                                this.startProgressAlphaStartAnimation();
                            }
                            this.mProgress.setStartEndTrim(0.0f, Math.min(0.8f, 0.8f * n3));
                            this.mProgress.setArrowScale(Math.min(1.0f, n3));
                            if (!a) {
                                break Label_0489;
                            }
                        }
                        if (this.mProgress.getAlpha() < 255 && !this.isAnimationRunning(this.mAlphaMaxAnimation)) {
                            this.startProgressAlphaMaxAnimation();
                        }
                    }
                    this.mProgress.setProgressRotation(0.5f * (-0.25f + 0.4f * n3 + 2.0f * n5));
                    this.setTargetOffsetTopAndBottom(n6 - this.mCurrentTargetOffsetTop, true);
                    if (a) {
                        break Label_0560;
                    }
                    break;
                }
                case 5: {
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                    if (a) {
                        break Label_0560;
                    }
                    break;
                }
                case 6: {
                    this.onSecondaryPointerUp(motionEvent);
                    if (a) {
                        break Label_0560;
                    }
                    break;
                }
                case 1:
                case 3: {
                    if (this.mActivePointerId == -1) {
                        if (actionMasked == 1) {
                            Log.e(SwipeRefreshLayout.LOG_TAG, SwipeRefreshLayout.z[2]);
                        }
                        return false;
                    }
                    final float n7 = 0.5f * (MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId)) - this.mInitialMotionY);
                    this.mIsBeingDragged = false;
                    Label_0700: {
                        if (n7 > this.mTotalDragDistance) {
                            this.setRefreshing(true, true);
                            if (!a) {
                                break Label_0700;
                            }
                        }
                        this.mRefreshing = false;
                        this.mProgress.setStartEndTrim(0.0f, 0.0f);
                        final boolean mScale = this.mScale;
                        Object o = null;
                        if (!mScale) {
                            o = new SwipeRefreshLayout$5(this);
                        }
                        this.animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, (Animation$AnimationListener)o);
                        this.mProgress.showArrow(false);
                    }
                    this.mActivePointerId = -1;
                    return false;
                }
            }
        }
        return true;
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
    }
}
