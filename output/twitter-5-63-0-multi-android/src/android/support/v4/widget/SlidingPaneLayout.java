// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Bitmap;
import android.util.Log;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.graphics.Rect;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import android.view.ViewGroup;

public class SlidingPaneLayout extends ViewGroup
{
    private static final int DEFAULT_FADE_COLOR = -858993460;
    private static final int DEFAULT_OVERHANG_SIZE = 32;
    static final SlidingPaneLayout$SlidingPanelLayoutImpl IMPL;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final String TAG = "SlidingPaneLayout";
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private final ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsUnableToDrag;
    private final int mOverhangSize;
    private SlidingPaneLayout$PanelSlideListener mPanelSlideListener;
    private int mParallaxBy;
    private float mParallaxOffset;
    private final ArrayList mPostedRunnables;
    private boolean mPreservedOpenState;
    private Drawable mShadowDrawableLeft;
    private Drawable mShadowDrawableRight;
    private float mSlideOffset;
    private int mSlideRange;
    private View mSlideableView;
    private int mSliderFadeColor;
    private final Rect mTmpRect;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 17) {
            IMPL = new SlidingPaneLayout$SlidingPanelLayoutImplJBMR1();
            return;
        }
        if (sdk_INT >= 16) {
            IMPL = new SlidingPaneLayout$SlidingPanelLayoutImplJB();
            return;
        }
        IMPL = new SlidingPaneLayout$SlidingPanelLayoutImplBase();
    }
    
    public SlidingPaneLayout(final Context context) {
        this(context, null);
    }
    
    public SlidingPaneLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SlidingPaneLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mSliderFadeColor = -858993460;
        this.mFirstLayout = true;
        this.mTmpRect = new Rect();
        this.mPostedRunnables = new ArrayList();
        final float density = context.getResources().getDisplayMetrics().density;
        this.mOverhangSize = (int)(0.5f + 32.0f * density);
        ViewConfiguration.get(context);
        this.setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate((View)this, new SlidingPaneLayout$AccessibilityDelegate(this));
        ViewCompat.setImportantForAccessibility((View)this, 1);
        (this.mDragHelper = ViewDragHelper.create(this, 0.5f, new SlidingPaneLayout$DragHelperCallback(this, null))).setMinVelocity(density * 400.0f);
    }
    
    private boolean closePane(final View view, final int n) {
        if (!this.mFirstLayout) {
            final boolean smoothSlideTo = this.smoothSlideTo(0.0f, n);
            final boolean b = false;
            if (!smoothSlideTo) {
                return b;
            }
        }
        this.mPreservedOpenState = false;
        return true;
    }
    
    private void dimChildView(final View view, final float n, final int n2) {
        final SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)view.getLayoutParams();
        if (n > 0.0f && n2 != 0) {
            final int n3 = (int)(n * ((0xFF000000 & n2) >>> 24)) << 24 | (0xFFFFFF & n2);
            if (slidingPaneLayout$LayoutParams.dimPaint == null) {
                slidingPaneLayout$LayoutParams.dimPaint = new Paint();
            }
            slidingPaneLayout$LayoutParams.dimPaint.setColorFilter((ColorFilter)new PorterDuffColorFilter(n3, PorterDuff$Mode.SRC_OVER));
            if (ViewCompat.getLayerType(view) != 2) {
                ViewCompat.setLayerType(view, 2, slidingPaneLayout$LayoutParams.dimPaint);
            }
            this.invalidateChildRegion(view);
        }
        else if (ViewCompat.getLayerType(view) != 0) {
            if (slidingPaneLayout$LayoutParams.dimPaint != null) {
                slidingPaneLayout$LayoutParams.dimPaint.setColorFilter((ColorFilter)null);
            }
            final SlidingPaneLayout$DisableLayerRunnable slidingPaneLayout$DisableLayerRunnable = new SlidingPaneLayout$DisableLayerRunnable(this, view);
            this.mPostedRunnables.add(slidingPaneLayout$DisableLayerRunnable);
            ViewCompat.postOnAnimation((View)this, slidingPaneLayout$DisableLayerRunnable);
        }
    }
    
    private void invalidateChildRegion(final View view) {
        SlidingPaneLayout.IMPL.invalidateChildRegion(this, view);
    }
    
    private boolean isLayoutRtlSupport() {
        return ViewCompat.getLayoutDirection((View)this) == 1;
    }
    
    private void onPanelDragged(int n) {
        if (this.mSlideableView == null) {
            this.mSlideOffset = 0.0f;
            return;
        }
        final boolean layoutRtlSupport = this.isLayoutRtlSupport();
        final SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)this.mSlideableView.getLayoutParams();
        final int width = this.mSlideableView.getWidth();
        if (layoutRtlSupport) {
            n = this.getWidth() - n - width;
        }
        int n2;
        if (layoutRtlSupport) {
            n2 = this.getPaddingRight();
        }
        else {
            n2 = this.getPaddingLeft();
        }
        int n3;
        if (layoutRtlSupport) {
            n3 = slidingPaneLayout$LayoutParams.rightMargin;
        }
        else {
            n3 = slidingPaneLayout$LayoutParams.leftMargin;
        }
        this.mSlideOffset = (n - (n3 + n2)) / this.mSlideRange;
        if (this.mParallaxBy != 0) {
            this.parallaxOtherViews(this.mSlideOffset);
        }
        if (slidingPaneLayout$LayoutParams.dimWhenOffset) {
            this.dimChildView(this.mSlideableView, this.mSlideOffset, this.mSliderFadeColor);
        }
        this.dispatchOnPanelSlide(this.mSlideableView);
    }
    
    private boolean openPane(final View view, final int n) {
        return (this.mFirstLayout || this.smoothSlideTo(1.0f, n)) && (this.mPreservedOpenState = true);
    }
    
    private void parallaxOtherViews(final float mParallaxOffset) {
        final boolean layoutRtlSupport = this.isLayoutRtlSupport();
        final SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)this.mSlideableView.getLayoutParams();
        while (true) {
            Label_0089: {
                if (!slidingPaneLayout$LayoutParams.dimWhenOffset) {
                    break Label_0089;
                }
                int n;
                if (layoutRtlSupport) {
                    n = slidingPaneLayout$LayoutParams.rightMargin;
                }
                else {
                    n = slidingPaneLayout$LayoutParams.leftMargin;
                }
                if (n > 0) {
                    break Label_0089;
                }
                final boolean b = true;
                for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                    final View child = this.getChildAt(i);
                    if (child != this.mSlideableView) {
                        final int n2 = (int)((1.0f - this.mParallaxOffset) * this.mParallaxBy);
                        this.mParallaxOffset = mParallaxOffset;
                        int n3 = n2 - (int)((1.0f - mParallaxOffset) * this.mParallaxBy);
                        if (layoutRtlSupport) {
                            n3 = -n3;
                        }
                        child.offsetLeftAndRight(n3);
                        if (b) {
                            float n4;
                            if (layoutRtlSupport) {
                                n4 = this.mParallaxOffset - 1.0f;
                            }
                            else {
                                n4 = 1.0f - this.mParallaxOffset;
                            }
                            this.dimChildView(child, n4, this.mCoveredFadeColor);
                        }
                    }
                }
                return;
            }
            final boolean b = false;
            continue;
        }
    }
    
    private static boolean viewIsOpaque(final View view) {
        if (!ViewCompat.isOpaque(view)) {
            if (Build$VERSION.SDK_INT >= 18) {
                return false;
            }
            final Drawable background = view.getBackground();
            if (background == null) {
                return false;
            }
            if (background.getOpacity() != -1) {
                return false;
            }
        }
        return true;
    }
    
    protected boolean canScroll(final View view, final boolean b, int n, final int n2, final int n3) {
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            for (int i = -1 + viewGroup.getChildCount(); i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                if (n2 + scrollX >= child.getLeft() && n2 + scrollX < child.getRight() && n3 + scrollY >= child.getTop() && n3 + scrollY < child.getBottom() && this.canScroll(child, true, n, n2 + scrollX - child.getLeft(), n3 + scrollY - child.getTop())) {
                    return true;
                }
            }
        }
        Label_0149: {
            break Label_0149;
        }
        if (b) {
            if (!this.isLayoutRtlSupport()) {
                n = -n;
            }
            if (ViewCompat.canScrollHorizontally(view, n)) {
                return true;
            }
        }
        return false;
    }
    
    @Deprecated
    public boolean canSlide() {
        return this.mCanSlide;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof SlidingPaneLayout$LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public boolean closePane() {
        return this.closePane(this.mSlideableView, 0);
    }
    
    public void computeScroll() {
        if (this.mDragHelper.continueSettling(true)) {
            if (this.mCanSlide) {
                ViewCompat.postInvalidateOnAnimation((View)this);
                return;
            }
            this.mDragHelper.abort();
        }
    }
    
    void dispatchOnPanelClosed(final View view) {
        if (this.mPanelSlideListener != null) {
            this.mPanelSlideListener.onPanelClosed(view);
        }
        this.sendAccessibilityEvent(32);
    }
    
    void dispatchOnPanelOpened(final View view) {
        if (this.mPanelSlideListener != null) {
            this.mPanelSlideListener.onPanelOpened(view);
        }
        this.sendAccessibilityEvent(32);
    }
    
    void dispatchOnPanelSlide(final View view) {
        if (this.mPanelSlideListener != null) {
            this.mPanelSlideListener.onPanelSlide(view, this.mSlideOffset);
        }
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        Drawable drawable;
        if (this.isLayoutRtlSupport()) {
            drawable = this.mShadowDrawableRight;
        }
        else {
            drawable = this.mShadowDrawableLeft;
        }
        View child;
        if (this.getChildCount() > 1) {
            child = this.getChildAt(1);
        }
        else {
            child = null;
        }
        if (child == null || drawable == null) {
            return;
        }
        final int top = child.getTop();
        final int bottom = child.getBottom();
        final int intrinsicWidth = drawable.getIntrinsicWidth();
        int right;
        int left;
        if (this.isLayoutRtlSupport()) {
            right = child.getRight();
            left = right + intrinsicWidth;
        }
        else {
            left = child.getLeft();
            right = left - intrinsicWidth;
        }
        drawable.setBounds(right, top, left, bottom);
        drawable.draw(canvas);
    }
    
    protected boolean drawChild(final Canvas canvas, final View view, final long n) {
        final SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)view.getLayoutParams();
        final int save = canvas.save(2);
        if (this.mCanSlide && !slidingPaneLayout$LayoutParams.slideable && this.mSlideableView != null) {
            canvas.getClipBounds(this.mTmpRect);
            if (this.isLayoutRtlSupport()) {
                this.mTmpRect.left = Math.max(this.mTmpRect.left, this.mSlideableView.getRight());
            }
            else {
                this.mTmpRect.right = Math.min(this.mTmpRect.right, this.mSlideableView.getLeft());
            }
            canvas.clipRect(this.mTmpRect);
        }
        boolean b;
        if (Build$VERSION.SDK_INT >= 11) {
            b = super.drawChild(canvas, view, n);
        }
        else if (slidingPaneLayout$LayoutParams.dimWhenOffset && this.mSlideOffset > 0.0f) {
            if (!view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(true);
            }
            final Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                canvas.drawBitmap(drawingCache, (float)view.getLeft(), (float)view.getTop(), slidingPaneLayout$LayoutParams.dimPaint);
                b = false;
            }
            else {
                Log.e("SlidingPaneLayout", "drawChild: child view " + view + " returned null drawing cache");
                b = super.drawChild(canvas, view, n);
            }
        }
        else {
            if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
            b = super.drawChild(canvas, view, n);
        }
        canvas.restoreToCount(save);
        return b;
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new SlidingPaneLayout$LayoutParams();
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new SlidingPaneLayout$LayoutParams(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return (ViewGroup$LayoutParams)new SlidingPaneLayout$LayoutParams((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return (ViewGroup$LayoutParams)new SlidingPaneLayout$LayoutParams(viewGroup$LayoutParams);
    }
    
    public int getCoveredFadeColor() {
        return this.mCoveredFadeColor;
    }
    
    public int getParallaxDistance() {
        return this.mParallaxBy;
    }
    
    public int getSliderFadeColor() {
        return this.mSliderFadeColor;
    }
    
    boolean isDimmed(final View view) {
        if (view == null) {
            return false;
        }
        final SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)view.getLayoutParams();
        return this.mCanSlide && slidingPaneLayout$LayoutParams.dimWhenOffset && this.mSlideOffset > 0.0f;
    }
    
    public boolean isOpen() {
        return !this.mCanSlide || this.mSlideOffset == 1.0f;
    }
    
    public boolean isSlideable() {
        return this.mCanSlide;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
        for (int size = this.mPostedRunnables.size(), i = 0; i < size; ++i) {
            ((SlidingPaneLayout$DisableLayerRunnable)this.mPostedRunnables.get(i)).run();
        }
        this.mPostedRunnables.clear();
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (!this.mCanSlide && actionMasked == 0 && this.getChildCount() > 1) {
            final View child = this.getChildAt(1);
            if (child != null) {
                this.mPreservedOpenState = !this.mDragHelper.isViewUnder(child, (int)motionEvent.getX(), (int)motionEvent.getY());
            }
        }
        boolean onInterceptTouchEvent;
        if (!this.mCanSlide || (this.mIsUnableToDrag && actionMasked != 0)) {
            this.mDragHelper.cancel();
            onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        }
        else {
            if (actionMasked == 3 || actionMasked == 1) {
                this.mDragHelper.cancel();
                return false;
            }
            int n = 0;
            Label_0155: {
                switch (actionMasked) {
                    case 0: {
                        this.mIsUnableToDrag = false;
                        final float x = motionEvent.getX();
                        final float y = motionEvent.getY();
                        this.mInitialMotionX = x;
                        this.mInitialMotionY = y;
                        if (this.mDragHelper.isViewUnder(this.mSlideableView, (int)x, (int)y) && this.isDimmed(this.mSlideableView)) {
                            n = 1;
                            break Label_0155;
                        }
                        break;
                    }
                    case 2: {
                        final float x2 = motionEvent.getX();
                        final float y2 = motionEvent.getY();
                        final float abs = Math.abs(x2 - this.mInitialMotionX);
                        final float abs2 = Math.abs(y2 - this.mInitialMotionY);
                        if (abs > this.mDragHelper.getTouchSlop() && abs2 > abs) {
                            this.mDragHelper.cancel();
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                        break;
                    }
                }
                n = 0;
            }
            if (!this.mDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                onInterceptTouchEvent = false;
                if (n == 0) {
                    return onInterceptTouchEvent;
                }
            }
            return true;
        }
        return onInterceptTouchEvent;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final boolean layoutRtlSupport = this.isLayoutRtlSupport();
        if (layoutRtlSupport) {
            this.mDragHelper.setEdgeTrackingEnabled(2);
        }
        else {
            this.mDragHelper.setEdgeTrackingEnabled(1);
        }
        final int n5 = n3 - n;
        int n6;
        if (layoutRtlSupport) {
            n6 = this.getPaddingRight();
        }
        else {
            n6 = this.getPaddingLeft();
        }
        int n7;
        if (layoutRtlSupport) {
            n7 = this.getPaddingLeft();
        }
        else {
            n7 = this.getPaddingRight();
        }
        final int paddingTop = this.getPaddingTop();
        final int childCount = this.getChildCount();
        if (this.mFirstLayout) {
            float mSlideOffset;
            if (this.mCanSlide && this.mPreservedOpenState) {
                mSlideOffset = 1.0f;
            }
            else {
                mSlideOffset = 0.0f;
            }
            this.mSlideOffset = mSlideOffset;
        }
        int i = 0;
        int n8 = n6;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n9;
            int n10;
            if (child.getVisibility() == 8) {
                n9 = n6;
                n10 = n8;
            }
            else {
                final SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)child.getLayoutParams();
                final int measuredWidth = child.getMeasuredWidth();
                int n13;
                int n14;
                if (slidingPaneLayout$LayoutParams.slideable) {
                    final int mSlideRange = Math.min(n6, n5 - n7 - this.mOverhangSize) - n8 - (slidingPaneLayout$LayoutParams.leftMargin + slidingPaneLayout$LayoutParams.rightMargin);
                    this.mSlideRange = mSlideRange;
                    int n11;
                    if (layoutRtlSupport) {
                        n11 = slidingPaneLayout$LayoutParams.rightMargin;
                    }
                    else {
                        n11 = slidingPaneLayout$LayoutParams.leftMargin;
                    }
                    slidingPaneLayout$LayoutParams.dimWhenOffset = (mSlideRange + (n8 + n11) + measuredWidth / 2 > n5 - n7);
                    final int n12 = (int)(mSlideRange * this.mSlideOffset);
                    n13 = n8 + (n11 + n12);
                    this.mSlideOffset = n12 / this.mSlideRange;
                    n14 = 0;
                }
                else if (this.mCanSlide && this.mParallaxBy != 0) {
                    n14 = (int)((1.0f - this.mSlideOffset) * this.mParallaxBy);
                    n13 = n6;
                }
                else {
                    n13 = n6;
                    n14 = 0;
                }
                int n15;
                int n16;
                if (layoutRtlSupport) {
                    n15 = n14 + (n5 - n13);
                    n16 = n15 - measuredWidth;
                }
                else {
                    n16 = n13 - n14;
                    n15 = n16 + measuredWidth;
                }
                child.layout(n16, paddingTop, n15, paddingTop + child.getMeasuredHeight());
                n9 = n6 + child.getWidth();
                n10 = n13;
            }
            ++i;
            n6 = n9;
            n8 = n10;
        }
        if (this.mFirstLayout) {
            if (this.mCanSlide) {
                if (this.mParallaxBy != 0) {
                    this.parallaxOtherViews(this.mSlideOffset);
                }
                if (((SlidingPaneLayout$LayoutParams)this.mSlideableView.getLayoutParams()).dimWhenOffset) {
                    this.dimChildView(this.mSlideableView, this.mSlideOffset, this.mSliderFadeColor);
                }
            }
            else {
                for (int j = 0; j < childCount; ++j) {
                    this.dimChildView(this.getChildAt(j), 0.0f, this.mSliderFadeColor);
                }
            }
            this.updateObscuredViewsVisibility(this.mSlideableView);
        }
        this.mFirstLayout = false;
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        final int size2 = View$MeasureSpec.getSize(n2);
        while (true) {
            Label_1129: {
                int n3;
                int n4;
                int n5;
                if (mode != 1073741824) {
                    if (!this.isInEditMode()) {
                        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
                    }
                    if (mode == Integer.MIN_VALUE) {
                        n3 = mode2;
                        n4 = size;
                        n5 = size2;
                    }
                    else {
                        if (mode != 0) {
                            break Label_1129;
                        }
                        n3 = mode2;
                        n4 = 300;
                        n5 = size2;
                    }
                }
                else {
                    if (mode2 != 0) {
                        break Label_1129;
                    }
                    if (!this.isInEditMode()) {
                        throw new IllegalStateException("Height must not be UNSPECIFIED");
                    }
                    if (mode2 != 0) {
                        break Label_1129;
                    }
                    n3 = Integer.MIN_VALUE;
                    n4 = size;
                    n5 = 300;
                }
                int n6 = 0;
                int n7 = 0;
                switch (n3) {
                    default: {
                        n6 = 0;
                        n7 = -1;
                        break;
                    }
                    case 1073741824: {
                        n6 = (n7 = n5 - this.getPaddingTop() - this.getPaddingBottom());
                        break;
                    }
                    case Integer.MIN_VALUE: {
                        n7 = n5 - this.getPaddingTop() - this.getPaddingBottom();
                        n6 = 0;
                        break;
                    }
                }
                boolean mCanSlide = false;
                final int n8 = n4 - this.getPaddingLeft() - this.getPaddingRight();
                final int childCount = this.getChildCount();
                if (childCount > 2) {
                    Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
                }
                this.mSlideableView = null;
                int i = 0;
                int n9 = n8;
                int min = n6;
                float n10 = 0.0f;
                while (i < childCount) {
                    final View child = this.getChildAt(i);
                    final SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)child.getLayoutParams();
                    int n11 = 0;
                    float n12 = 0.0f;
                    int n13 = 0;
                    boolean b = false;
                    Label_0204: {
                        if (child.getVisibility() == 8) {
                            slidingPaneLayout$LayoutParams.dimWhenOffset = false;
                            n11 = n9;
                            n12 = n10;
                            n13 = min;
                            b = mCanSlide;
                        }
                        else {
                            if (slidingPaneLayout$LayoutParams.weight > 0.0f) {
                                n10 += slidingPaneLayout$LayoutParams.weight;
                                if (slidingPaneLayout$LayoutParams.width == 0) {
                                    n11 = n9;
                                    n12 = n10;
                                    n13 = min;
                                    b = mCanSlide;
                                    break Label_0204;
                                }
                            }
                            final int n14 = slidingPaneLayout$LayoutParams.leftMargin + slidingPaneLayout$LayoutParams.rightMargin;
                            int n15;
                            if (slidingPaneLayout$LayoutParams.width == -2) {
                                n15 = View$MeasureSpec.makeMeasureSpec(n8 - n14, Integer.MIN_VALUE);
                            }
                            else if (slidingPaneLayout$LayoutParams.width == -1) {
                                n15 = View$MeasureSpec.makeMeasureSpec(n8 - n14, 1073741824);
                            }
                            else {
                                n15 = View$MeasureSpec.makeMeasureSpec(slidingPaneLayout$LayoutParams.width, 1073741824);
                            }
                            int n16;
                            if (slidingPaneLayout$LayoutParams.height == -2) {
                                n16 = View$MeasureSpec.makeMeasureSpec(n7, Integer.MIN_VALUE);
                            }
                            else if (slidingPaneLayout$LayoutParams.height == -1) {
                                n16 = View$MeasureSpec.makeMeasureSpec(n7, 1073741824);
                            }
                            else {
                                n16 = View$MeasureSpec.makeMeasureSpec(slidingPaneLayout$LayoutParams.height, 1073741824);
                            }
                            child.measure(n15, n16);
                            final int measuredWidth = child.getMeasuredWidth();
                            final int measuredHeight = child.getMeasuredHeight();
                            if (n3 == Integer.MIN_VALUE && measuredHeight > min) {
                                min = Math.min(measuredHeight, n7);
                            }
                            final int n17 = n9 - measuredWidth;
                            final boolean slideable = n17 < 0;
                            slidingPaneLayout$LayoutParams.slideable = slideable;
                            final boolean b2 = slideable | mCanSlide;
                            if (slidingPaneLayout$LayoutParams.slideable) {
                                this.mSlideableView = child;
                            }
                            n11 = n17;
                            n13 = min;
                            final float n18 = n10;
                            b = b2;
                            n12 = n18;
                        }
                    }
                    ++i;
                    mCanSlide = b;
                    min = n13;
                    n10 = n12;
                    n9 = n11;
                }
                if (mCanSlide || n10 > 0.0f) {
                    final int n19 = n8 - this.mOverhangSize;
                    for (int j = 0; j < childCount; ++j) {
                        final View child2 = this.getChildAt(j);
                        if (child2.getVisibility() != 8) {
                            final SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams2 = (SlidingPaneLayout$LayoutParams)child2.getLayoutParams();
                            if (child2.getVisibility() != 8) {
                                boolean b3;
                                if (slidingPaneLayout$LayoutParams2.width == 0 && slidingPaneLayout$LayoutParams2.weight > 0.0f) {
                                    b3 = true;
                                }
                                else {
                                    b3 = false;
                                }
                                int measuredWidth2;
                                if (b3) {
                                    measuredWidth2 = 0;
                                }
                                else {
                                    measuredWidth2 = child2.getMeasuredWidth();
                                }
                                if (mCanSlide && child2 != this.mSlideableView) {
                                    if (slidingPaneLayout$LayoutParams2.width < 0 && (measuredWidth2 > n19 || slidingPaneLayout$LayoutParams2.weight > 0.0f)) {
                                        int n20;
                                        if (b3) {
                                            if (slidingPaneLayout$LayoutParams2.height == -2) {
                                                n20 = View$MeasureSpec.makeMeasureSpec(n7, Integer.MIN_VALUE);
                                            }
                                            else if (slidingPaneLayout$LayoutParams2.height == -1) {
                                                n20 = View$MeasureSpec.makeMeasureSpec(n7, 1073741824);
                                            }
                                            else {
                                                n20 = View$MeasureSpec.makeMeasureSpec(slidingPaneLayout$LayoutParams2.height, 1073741824);
                                            }
                                        }
                                        else {
                                            n20 = View$MeasureSpec.makeMeasureSpec(child2.getMeasuredHeight(), 1073741824);
                                        }
                                        child2.measure(View$MeasureSpec.makeMeasureSpec(n19, 1073741824), n20);
                                    }
                                }
                                else if (slidingPaneLayout$LayoutParams2.weight > 0.0f) {
                                    int n21;
                                    if (slidingPaneLayout$LayoutParams2.width == 0) {
                                        if (slidingPaneLayout$LayoutParams2.height == -2) {
                                            n21 = View$MeasureSpec.makeMeasureSpec(n7, Integer.MIN_VALUE);
                                        }
                                        else if (slidingPaneLayout$LayoutParams2.height == -1) {
                                            n21 = View$MeasureSpec.makeMeasureSpec(n7, 1073741824);
                                        }
                                        else {
                                            n21 = View$MeasureSpec.makeMeasureSpec(slidingPaneLayout$LayoutParams2.height, 1073741824);
                                        }
                                    }
                                    else {
                                        n21 = View$MeasureSpec.makeMeasureSpec(child2.getMeasuredHeight(), 1073741824);
                                    }
                                    if (mCanSlide) {
                                        final int n22 = n8 - (slidingPaneLayout$LayoutParams2.leftMargin + slidingPaneLayout$LayoutParams2.rightMargin);
                                        final int measureSpec = View$MeasureSpec.makeMeasureSpec(n22, 1073741824);
                                        if (measuredWidth2 != n22) {
                                            child2.measure(measureSpec, n21);
                                        }
                                    }
                                    else {
                                        child2.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth2 + (int)(slidingPaneLayout$LayoutParams2.weight * Math.max(0, n9) / n10), 1073741824), n21);
                                    }
                                }
                            }
                        }
                    }
                }
                this.setMeasuredDimension(n4, min + this.getPaddingTop() + this.getPaddingBottom());
                this.mCanSlide = mCanSlide;
                if (this.mDragHelper.getViewDragState() != 0 && !mCanSlide) {
                    this.mDragHelper.abort();
                }
                return;
            }
            int n3 = mode2;
            int n4 = size;
            int n5 = size2;
            continue;
        }
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        final SlidingPaneLayout$SavedState slidingPaneLayout$SavedState = (SlidingPaneLayout$SavedState)parcelable;
        super.onRestoreInstanceState(slidingPaneLayout$SavedState.getSuperState());
        if (slidingPaneLayout$SavedState.isOpen) {
            this.openPane();
        }
        else {
            this.closePane();
        }
        this.mPreservedOpenState = slidingPaneLayout$SavedState.isOpen;
    }
    
    protected Parcelable onSaveInstanceState() {
        final SlidingPaneLayout$SavedState slidingPaneLayout$SavedState = new SlidingPaneLayout$SavedState(super.onSaveInstanceState());
        boolean isOpen;
        if (this.isSlideable()) {
            isOpen = this.isOpen();
        }
        else {
            isOpen = this.mPreservedOpenState;
        }
        slidingPaneLayout$SavedState.isOpen = isOpen;
        return (Parcelable)slidingPaneLayout$SavedState;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != n3) {
            this.mFirstLayout = true;
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        boolean onTouchEvent;
        if (!this.mCanSlide) {
            onTouchEvent = super.onTouchEvent(motionEvent);
        }
        else {
            this.mDragHelper.processTouchEvent(motionEvent);
            final int action = motionEvent.getAction();
            onTouchEvent = true;
            switch (action & 0xFF) {
                default: {
                    return onTouchEvent;
                }
                case 0: {
                    final float x = motionEvent.getX();
                    final float y = motionEvent.getY();
                    this.mInitialMotionX = x;
                    this.mInitialMotionY = y;
                    return onTouchEvent;
                }
                case 1: {
                    if (!this.isDimmed(this.mSlideableView)) {
                        break;
                    }
                    final float x2 = motionEvent.getX();
                    final float y2 = motionEvent.getY();
                    final float n = x2 - this.mInitialMotionX;
                    final float n2 = y2 - this.mInitialMotionY;
                    final int touchSlop = this.mDragHelper.getTouchSlop();
                    if (n * n + n2 * n2 < touchSlop * touchSlop && this.mDragHelper.isViewUnder(this.mSlideableView, (int)x2, (int)y2)) {
                        this.closePane(this.mSlideableView, 0);
                        return onTouchEvent;
                    }
                    break;
                }
            }
        }
        return onTouchEvent;
    }
    
    public boolean openPane() {
        return this.openPane(this.mSlideableView, 0);
    }
    
    public void requestChildFocus(final View view, final View view2) {
        super.requestChildFocus(view, view2);
        if (!this.isInTouchMode() && !this.mCanSlide) {
            this.mPreservedOpenState = (view == this.mSlideableView);
        }
    }
    
    void setAllChildrenVisible() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 4) {
                child.setVisibility(0);
            }
        }
    }
    
    public void setCoveredFadeColor(final int mCoveredFadeColor) {
        this.mCoveredFadeColor = mCoveredFadeColor;
    }
    
    public void setPanelSlideListener(final SlidingPaneLayout$PanelSlideListener mPanelSlideListener) {
        this.mPanelSlideListener = mPanelSlideListener;
    }
    
    public void setParallaxDistance(final int mParallaxBy) {
        this.mParallaxBy = mParallaxBy;
        this.requestLayout();
    }
    
    @Deprecated
    public void setShadowDrawable(final Drawable shadowDrawableLeft) {
        this.setShadowDrawableLeft(shadowDrawableLeft);
    }
    
    public void setShadowDrawableLeft(final Drawable mShadowDrawableLeft) {
        this.mShadowDrawableLeft = mShadowDrawableLeft;
    }
    
    public void setShadowDrawableRight(final Drawable mShadowDrawableRight) {
        this.mShadowDrawableRight = mShadowDrawableRight;
    }
    
    @Deprecated
    public void setShadowResource(final int n) {
        this.setShadowDrawable(this.getResources().getDrawable(n));
    }
    
    public void setShadowResourceLeft(final int n) {
        this.setShadowDrawableLeft(this.getResources().getDrawable(n));
    }
    
    public void setShadowResourceRight(final int n) {
        this.setShadowDrawableRight(this.getResources().getDrawable(n));
    }
    
    public void setSliderFadeColor(final int mSliderFadeColor) {
        this.mSliderFadeColor = mSliderFadeColor;
    }
    
    @Deprecated
    public void smoothSlideClosed() {
        this.closePane();
    }
    
    @Deprecated
    public void smoothSlideOpen() {
        this.openPane();
    }
    
    boolean smoothSlideTo(final float n, final int n2) {
        if (!this.mCanSlide) {
            return false;
        }
        final boolean layoutRtlSupport = this.isLayoutRtlSupport();
        final SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)this.mSlideableView.getLayoutParams();
        int n3;
        if (layoutRtlSupport) {
            n3 = (int)(this.getWidth() - (this.getPaddingRight() + slidingPaneLayout$LayoutParams.rightMargin + n * this.mSlideRange + this.mSlideableView.getWidth()));
        }
        else {
            n3 = (int)(this.getPaddingLeft() + slidingPaneLayout$LayoutParams.leftMargin + n * this.mSlideRange);
        }
        if (this.mDragHelper.smoothSlideViewTo(this.mSlideableView, n3, this.mSlideableView.getTop())) {
            this.setAllChildrenVisible();
            ViewCompat.postInvalidateOnAnimation((View)this);
            return true;
        }
        return false;
    }
    
    void updateObscuredViewsVisibility(final View view) {
        final boolean layoutRtlSupport = this.isLayoutRtlSupport();
        int paddingLeft;
        if (layoutRtlSupport) {
            paddingLeft = this.getWidth() - this.getPaddingRight();
        }
        else {
            paddingLeft = this.getPaddingLeft();
        }
        int paddingLeft2;
        if (layoutRtlSupport) {
            paddingLeft2 = this.getPaddingLeft();
        }
        else {
            paddingLeft2 = this.getWidth() - this.getPaddingRight();
        }
        final int paddingTop = this.getPaddingTop();
        final int n = this.getHeight() - this.getPaddingBottom();
        int left;
        int right;
        int top;
        int bottom;
        if (view != null && viewIsOpaque(view)) {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        else {
            bottom = 0;
            top = 0;
            right = 0;
            left = 0;
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child == view) {
                break;
            }
            int n2;
            if (layoutRtlSupport) {
                n2 = paddingLeft2;
            }
            else {
                n2 = paddingLeft;
            }
            final int max = Math.max(n2, child.getLeft());
            final int max2 = Math.max(paddingTop, child.getTop());
            int n3;
            if (layoutRtlSupport) {
                n3 = paddingLeft;
            }
            else {
                n3 = paddingLeft2;
            }
            final int min = Math.min(n3, child.getRight());
            final int min2 = Math.min(n, child.getBottom());
            int visibility;
            if (max >= left && max2 >= top && min <= right && min2 <= bottom) {
                visibility = 4;
            }
            else {
                visibility = 0;
            }
            child.setVisibility(visibility);
        }
    }
}
