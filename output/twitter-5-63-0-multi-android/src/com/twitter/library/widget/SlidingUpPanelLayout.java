// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.annotation.TargetApi;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.view.ViewConfiguration;
import android.support.v4.widget.ViewDragHelper$Callback;
import android.os.Looper;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Handler;
import android.graphics.Rect;
import android.support.v4.widget.ViewDragHelper;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

class SlidingUpPanelLayout extends ViewGroup
{
    private float A;
    private float B;
    private float C;
    private boolean D;
    private boolean E;
    private View F;
    private MotionEvent G;
    private final int a;
    private final int b;
    private int c;
    private int d;
    private final Paint e;
    private Drawable f;
    private int g;
    private final int h;
    private boolean i;
    private View j;
    private View k;
    private float l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private aj s;
    private final ViewDragHelper t;
    private boolean u;
    private final Rect v;
    private final Handler w;
    private final int[] x;
    private final int[] y;
    private float z;
    
    public SlidingUpPanelLayout(final Context context) {
        this(context, null);
    }
    
    public SlidingUpPanelLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SlidingUpPanelLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = 0;
        this.d = -1728053248;
        this.e = new Paint();
        this.u = true;
        this.v = new Rect();
        this.w = new Handler(Looper.getMainLooper());
        final float density = context.getResources().getDisplayMetrics().density;
        this.g = (int)(0.5f + 44.0f * density);
        this.h = (int)(0.5f + 4.0f * density);
        this.setWillNotDraw(false);
        (this.t = ViewDragHelper.create(this, 0.5f, new ai(this, null))).setMinVelocity(density * 400.0f);
        this.i = true;
        this.r = true;
        this.setCoveredFadeColor(-1728053248);
        this.o = 0;
        this.p = 7;
        this.n = -1;
        final int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.a = scaledTouchSlop * scaledTouchSlop;
        this.b = ViewConfiguration.getTapTimeout();
        this.x = new int[2];
        this.y = new int[2];
    }
    
    public static View a(View view, final boolean b, final int n, final int n2, final int n3) {
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            for (int i = -1 + viewGroup.getChildCount(); i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                if (n2 + scrollX >= child.getLeft() && n2 + scrollX < child.getRight() && n3 + scrollY >= child.getTop() && n3 + scrollY < child.getBottom()) {
                    final View a = a(child, true, n, n2 + scrollX - child.getLeft(), n3 + scrollY - child.getTop());
                    if (a != null) {
                        view = a;
                        return view;
                    }
                }
            }
        }
        Label_0144: {
            break Label_0144;
        }
        if (!b || !ViewCompat.canScrollVertically(view, -n)) {
            return null;
        }
        return view;
    }
    
    private void a(final MotionEvent motionEvent) {
        if (MotionEventCompat.getActionMasked(motionEvent) == 0) {
            this.C = this.k.getTop() - motionEvent.getY();
        }
        motionEvent.offsetLocation(0.0f, this.C);
        this.t.processTouchEvent(motionEvent);
        motionEvent.offsetLocation(0.0f, -this.C);
    }
    
    private boolean a(final float n, final float n2) {
        final float n3 = n - this.A;
        final float n4 = n2 - this.B;
        final boolean b = (0x6 & this.o) != 0x0 && (this.w.hasMessages(0) && this.o != 0 && n3 * n3 + n4 * n4 < this.a && !this.t.isViewUnder(this.k, (int)n, (int)n2)) && this.g();
        this.w.removeMessages(0);
        return b;
    }
    
    private boolean a(final MotionEvent motionEvent, final int n, final int n2, final int n3) {
        if (this.F == null || !ViewCompat.canScrollVertically(this.F, -n)) {
            this.F = a(this.k, false, n, n2, n3);
        }
        final View f = this.F;
        boolean b = false;
        if (f != null) {
            if (this.t.getActivePointerId() != -1) {
                motionEvent.setAction(0);
            }
            this.b(motionEvent);
            this.t.cancel();
            b = true;
        }
        return b;
    }
    
    private int b(final float n, final int n2) {
        int n3 = n2;
        while (n3 > 0 && n3 < 4 && (n3 & this.p) == 0x0) {
            if (n > 0.0f) {
                n3 >>= 1;
            }
            else {
                n3 <<= 1;
            }
        }
        if ((n3 & this.p) != 0x0) {
            return n3;
        }
        return this.o;
    }
    
    private void b(final MotionEvent motionEvent) {
        final int n = this.getScrollX() - this.k.getLeft();
        final int n2 = this.getScrollY() - this.k.getTop();
        motionEvent.offsetLocation((float)n, (float)n2);
        this.k.dispatchTouchEvent(motionEvent);
        motionEvent.offsetLocation((float)(-n), (float)(-n2));
    }
    
    private static boolean b(final View view) {
        final Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }
    
    private void c(final MotionEvent motionEvent) {
        if (this.t.getActivePointerId() == -1) {
            motionEvent.setAction(0);
        }
        this.a(motionEvent);
        (this.G = MotionEvent.obtain(motionEvent)).setAction(3);
        this.F = null;
    }
    
    private boolean c(final int n) {
        switch (n) {
            default: {
                return this.d();
            }
            case 4: {
                return this.a();
            }
            case 2: {
                return this.b();
            }
            case 1: {
                return this.c();
            }
        }
    }
    
    private void d(final int n) {
        final int n2 = this.getMeasuredHeight() - this.getPaddingBottom() - this.n;
        float l;
        if (this.m != 0) {
            l = (n - n2) / this.m;
        }
        else {
            l = 1.0f;
        }
        this.l = l;
        this.a(this.k);
    }
    
    private boolean g() {
        int b = this.b(1.0f, this.o >> 1);
        if (b == this.o) {
            b = 0;
        }
        return this.c(b);
    }
    
    public void a(final int n) {
        this.setPossiblePanelStates(this.p & ~n);
    }
    
    void a(final View view) {
        if (this.s != null) {
            this.s.a(view, this.l);
        }
    }
    
    void a(final View view, final int n) {
        boolean b = true;
        if (this.s != null) {
            switch (n) {
                default: {
                    b = false;
                    break;
                }
                case 0: {
                    this.s.c(view);
                    break;
                }
                case 1: {
                    this.s.d(view);
                    break;
                }
                case 2: {
                    this.s.b(view);
                    break;
                }
                case 4: {
                    this.s.a(view);
                    break;
                }
            }
            if (b) {
                this.sendAccessibilityEvent(32);
            }
        }
    }
    
    public boolean a() {
        if (this.k == null || this.o == 4 || (0x4 & this.p) == 0x0) {
            return false;
        }
        this.o = 4;
        this.a(this.getTop(), 0);
        this.requestFocus();
        return true;
    }
    
    boolean a(final float n, final int n2) {
        if (!this.i) {
            return false;
        }
        this.a((int)(this.getMeasuredHeight() - this.getPaddingBottom() - this.n + n * this.m), n2);
        return false;
    }
    
    boolean a(final int n, final int n2) {
        if (this.i && this.t.smoothSlideViewTo(this.k, this.k.getLeft(), n)) {
            this.f();
            ViewCompat.postInvalidateOnAnimation((View)this);
            return true;
        }
        return false;
    }
    
    public void b(final int n) {
        this.setPossiblePanelStates(n | this.p);
    }
    
    public boolean b() {
        if (this.k == null || this.o == 2 || (0x2 & this.p) == 0x0) {
            return false;
        }
        this.o = 2;
        this.a(0.0f, 0);
        this.requestFocus();
        return true;
    }
    
    public boolean c() {
        if (this.k == null || this.o == 1 || (0x1 & this.p) == 0x0) {
            return false;
        }
        this.o = 1;
        this.a(1.0f, 0);
        this.requestFocus();
        return true;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof SlidingUpPanelLayout$LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public void computeScroll() {
        if (this.t.continueSettling(true)) {
            if (this.i) {
                ViewCompat.postInvalidateOnAnimation((View)this);
                return;
            }
            this.t.abort();
        }
    }
    
    public boolean d() {
        if (this.k == null || this.o == 0) {
            return false;
        }
        this.o = 0;
        this.clearFocus();
        this.a(this.getBottom(), 0);
        return true;
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && !keyEvent.isCanceled() && this.o != 0 && keyEvent.getAction() == 1) {
            return this.g();
        }
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.k != null) {
            final int right = this.k.getRight();
            final int n = this.k.getTop() - this.h;
            final int top = this.k.getTop();
            final int left = this.k.getLeft();
            if (this.f != null) {
                this.f.setBounds(left, n, right, top);
                this.f.draw(canvas);
            }
        }
    }
    
    protected boolean drawChild(final Canvas canvas, final View view, final long n) {
        final SlidingUpPanelLayout$LayoutParams slidingUpPanelLayout$LayoutParams = (SlidingUpPanelLayout$LayoutParams)view.getLayoutParams();
        final int save = canvas.save(2);
        while (true) {
            Label_0234: {
                if (!this.i || slidingUpPanelLayout$LayoutParams.a || this.k == null) {
                    break Label_0234;
                }
                canvas.getClipBounds(this.v);
                if (this.r) {
                    this.v.bottom = Math.min(this.v.bottom, this.k.getTop());
                    canvas.clipRect(this.v);
                }
                if (this.l >= 1.0f) {
                    break Label_0234;
                }
                final int n2 = 1;
                final boolean drawChild = super.drawChild(canvas, view, n);
                canvas.restoreToCount(save);
                if (n2 != 0) {
                    float n3;
                    if (this.c == 0) {
                        n3 = 1.0f - Math.max(0.0f, this.l);
                    }
                    else {
                        final float n4 = this.getMeasuredHeight();
                        if (n4 != 0.0f) {
                            n3 = 1.0f - Math.max(0.0f, this.k.getTop() / n4);
                        }
                        else {
                            n3 = 1.0f;
                        }
                    }
                    this.e.setColor((int)(n3 * ((0xFF000000 & this.d) >>> 24)) << 24 | (0xFFFFFF & this.d));
                    canvas.drawRect(this.v, this.e);
                }
                return drawChild;
            }
            final int n2 = 0;
            continue;
        }
    }
    
    void e() {
        if (this.getChildCount() == 0) {
            return;
        }
        final int paddingLeft = this.getPaddingLeft();
        final int n = this.getWidth() - this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        final int n2 = this.getHeight() - this.getPaddingBottom();
        int left;
        int right;
        int top;
        int bottom;
        if (this.k != null && b(this.k)) {
            left = this.k.getLeft();
            right = this.k.getRight();
            top = this.k.getTop();
            bottom = this.k.getBottom();
        }
        else {
            bottom = 0;
            top = 0;
            right = 0;
            left = 0;
        }
        final View child = this.getChildAt(0);
        final int max = Math.max(paddingLeft, child.getLeft());
        final int max2 = Math.max(paddingTop, child.getTop());
        final int min = Math.min(n, child.getRight());
        final int min2 = Math.min(n2, child.getBottom());
        int visibility = 0;
        if (max >= left) {
            visibility = 0;
            if (max2 >= top) {
                visibility = 0;
                if (min <= right) {
                    visibility = 0;
                    if (min2 <= bottom) {
                        visibility = 4;
                    }
                }
            }
        }
        child.setVisibility(visibility);
    }
    
    void f() {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 4) {
                child.setVisibility(0);
            }
        }
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new SlidingUpPanelLayout$LayoutParams();
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new SlidingUpPanelLayout$LayoutParams(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return (ViewGroup$LayoutParams)new SlidingUpPanelLayout$LayoutParams((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return (ViewGroup$LayoutParams)new SlidingUpPanelLayout$LayoutParams(viewGroup$LayoutParams);
    }
    
    public int getCoveredFadeColor() {
        return this.d;
    }
    
    public int getPanelPeekHeight() {
        return this.g;
    }
    
    public int getPanelPreviewHeight() {
        return this.n;
    }
    
    public int getPanelState() {
        return this.o;
    }
    
    public int getPossibleStates() {
        return this.p;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u = true;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u = true;
        if (this.G != null) {
            this.G.recycle();
            this.G = null;
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        boolean onInterceptTouchEvent;
        if (!this.i || (this.q && actionMasked != 0)) {
            this.t.cancel();
            onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        }
        else {
            if (motionEvent.getPointerCount() > 1) {
                this.t.cancel();
                return super.onInterceptTouchEvent(motionEvent);
            }
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            boolean e = false;
            Label_0099: {
                switch (actionMasked) {
                    default: {
                        e = false;
                        break;
                    }
                    case 0: {
                        this.C = 0.0f;
                        this.q = false;
                        this.E = false;
                        this.z = y;
                        this.w.removeMessages(0);
                        switch (this.o) {
                            default: {
                                this.D = false;
                                e = false;
                                break Label_0099;
                            }
                            case 1:
                            case 2:
                            case 4: {
                                this.D = this.t.isViewUnder(this.k, (int)x, (int)y);
                                if (this.D) {
                                    if (this.j != null) {
                                        this.getLocationOnScreen(this.x);
                                        this.j.getLocationOnScreen(this.y);
                                        this.D = this.t.isViewUnder(this.j, (int)x - (this.y[0] - this.x[0]), (int)y - (this.y[1] - this.x[1]));
                                    }
                                    e = this.D;
                                    break Label_0099;
                                }
                                this.w.sendEmptyMessageDelayed(0, (long)this.b);
                                e = (this.o == 2);
                                break Label_0099;
                            }
                        }
                        break;
                    }
                    case 1: {
                        e = this.a(x, y);
                        this.E = e;
                        break;
                    }
                }
            }
            int n;
            if (this.D && this.t.shouldInterceptTouchEvent(motionEvent)) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (!e) {
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
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        final int childCount = this.getChildCount();
        final int n5 = this.getBottom() - this.getPaddingBottom();
        int i = 0;
        int measuredHeight = n5;
        int n6 = paddingTop;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final SlidingUpPanelLayout$LayoutParams slidingUpPanelLayout$LayoutParams = (SlidingUpPanelLayout$LayoutParams)child.getLayoutParams();
                final int measuredHeight2 = child.getMeasuredHeight();
                if (slidingUpPanelLayout$LayoutParams.a) {
                    measuredHeight = this.getMeasuredHeight();
                    this.m = this.n - this.g;
                    switch (this.o) {
                        case 1: {
                            measuredHeight -= this.g;
                            break;
                        }
                        case 2: {
                            measuredHeight -= this.n;
                            break;
                        }
                        case 4: {
                            measuredHeight = paddingTop;
                            break;
                        }
                    }
                }
                else {
                    measuredHeight = n6;
                }
                child.layout(paddingLeft, measuredHeight, paddingLeft + child.getMeasuredWidth(), measuredHeight2 + measuredHeight);
                n6 += child.getHeight();
            }
            ++i;
        }
        if (this.u) {
            float l;
            if (this.m != 0) {
                l = (measuredHeight - (this.getMeasuredHeight() - this.n)) / this.m;
            }
            else {
                l = 1.0f;
            }
            this.l = l;
            this.e();
        }
        this.u = false;
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        final int size2 = View$MeasureSpec.getSize(n2);
        if (mode != 1073741824) {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        }
        if (mode2 != 1073741824) {
            throw new IllegalStateException("Height must have an exact value or MATCH_PARENT");
        }
        final int n3 = size2 - this.getPaddingTop() - this.getPaddingBottom();
        final int n4 = size - this.getPaddingLeft() - this.getPaddingRight();
        final int childCount = this.getChildCount();
        if (childCount > 2) {
            throw new IllegalStateException("onMeasure: More than two child views are not supported.");
        }
        this.k = null;
        this.i = false;
        if (this.n == -1) {
            this.n = n3 / 2;
        }
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final SlidingUpPanelLayout$LayoutParams slidingUpPanelLayout$LayoutParams = (SlidingUpPanelLayout$LayoutParams)child.getLayoutParams();
            if (child.getVisibility() == 8) {
                slidingUpPanelLayout$LayoutParams.b = false;
            }
            else {
                int n5;
                if (i == 1) {
                    slidingUpPanelLayout$LayoutParams.a = true;
                    slidingUpPanelLayout$LayoutParams.b = true;
                    this.k = child;
                    this.i = true;
                    if ((0x4 & this.p) != 0x0) {
                        n5 = n3;
                    }
                    else if ((0x2 & this.p) != 0x0) {
                        n5 = this.n;
                    }
                    else {
                        n5 = this.g;
                    }
                }
                else {
                    n5 = n3;
                }
                int n6;
                if (slidingUpPanelLayout$LayoutParams.width == -2) {
                    n6 = View$MeasureSpec.makeMeasureSpec(n4, Integer.MIN_VALUE);
                }
                else if (slidingUpPanelLayout$LayoutParams.width == -1) {
                    n6 = View$MeasureSpec.makeMeasureSpec(n4, 1073741824);
                }
                else {
                    n6 = View$MeasureSpec.makeMeasureSpec(slidingUpPanelLayout$LayoutParams.width, 1073741824);
                }
                int n7;
                if (slidingUpPanelLayout$LayoutParams.height == -2) {
                    n7 = View$MeasureSpec.makeMeasureSpec(n5, Integer.MIN_VALUE);
                }
                else if (slidingUpPanelLayout$LayoutParams.height == -1) {
                    n7 = View$MeasureSpec.makeMeasureSpec(n5, 1073741824);
                }
                else {
                    n7 = View$MeasureSpec.makeMeasureSpec(slidingUpPanelLayout$LayoutParams.height, 1073741824);
                }
                child.measure(n6, n7);
            }
        }
        this.setMeasuredDimension(size, size2);
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        final SlidingUpPanelLayout$SavedState slidingUpPanelLayout$SavedState = (SlidingUpPanelLayout$SavedState)parcelable;
        super.onRestoreInstanceState(slidingUpPanelLayout$SavedState.getSuperState());
        this.o = slidingUpPanelLayout$SavedState.a;
        this.p = slidingUpPanelLayout$SavedState.b;
        this.i = slidingUpPanelLayout$SavedState.c;
    }
    
    protected Parcelable onSaveInstanceState() {
        final SlidingUpPanelLayout$SavedState slidingUpPanelLayout$SavedState = new SlidingUpPanelLayout$SavedState(super.onSaveInstanceState());
        slidingUpPanelLayout$SavedState.a = this.o;
        slidingUpPanelLayout$SavedState.b = this.p;
        slidingUpPanelLayout$SavedState.c = this.i;
        return (Parcelable)slidingUpPanelLayout$SavedState;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n2 != n4) {
            this.u = true;
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.E) {
            if (!this.i || this.o == 0) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.j != null) {
                this.t.processTouchEvent(motionEvent);
                this.b(motionEvent);
                return true;
            }
            if (motionEvent.getPointerCount() > 1) {
                this.t.cancel();
                return super.onTouchEvent(motionEvent);
            }
            final int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
            if (actionMasked != 2 && actionMasked != 1) {
                this.a(motionEvent);
                this.b(motionEvent);
            }
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            switch (actionMasked) {
                default: {
                    return true;
                }
                case 0: {
                    this.F = null;
                    this.z = y;
                    this.A = x;
                    this.B = y;
                    return true;
                }
                case 2: {
                    final float n = y - this.z;
                    this.z = y;
                    if (!this.D) {
                        this.a(motionEvent);
                        return true;
                    }
                    if (this.k.getTop() > this.getPaddingTop()) {
                        this.c(motionEvent);
                        return true;
                    }
                    if (!this.a(motionEvent, (int)n, (int)x, (int)y)) {
                        this.c(motionEvent);
                        return true;
                    }
                    break;
                }
                case 1: {
                    if (this.a(x, y)) {
                        this.t.cancel();
                        motionEvent.setAction(3);
                        this.k.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                    if (this.F != null || Math.abs(this.B - this.z) < this.t.getTouchSlop()) {
                        this.a(motionEvent);
                        this.b(motionEvent);
                        return true;
                    }
                    break;
                }
                case 3: {
                    this.w.removeMessages(0);
                    return true;
                }
            }
        }
        return true;
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
    }
    
    public void setClipChildren(final boolean r) {
        this.r = r;
    }
    
    public void setCoveredFadeColor(final int d) {
        this.d = d;
        this.invalidate();
    }
    
    public void setDragView(final View j) {
        this.j = j;
    }
    
    public void setFadeMode(final int c) {
        this.c = c;
    }
    
    public void setPadding(final int n, final int n2, final int n3, final int n4) {
        super.setPadding(0, 0, 0, 0);
    }
    
    @TargetApi(17)
    public void setPaddingRelative(final int n, final int n2, final int n3, final int n4) {
        super.setPaddingRelative(0, 0, 0, 0);
    }
    
    public void setPanelPeekHeight(final int g) {
        this.g = g;
    }
    
    public void setPanelPreviewHeight(final int n) {
        this.n = n;
    }
    
    public void setPanelSlideListener(final aj s) {
        this.s = s;
    }
    
    public void setPanelVisiblity(final int visibility) {
        if (this.getChildCount() < 2) {
            return;
        }
        this.getChildAt(1).setVisibility(visibility);
        this.requestLayout();
    }
    
    public void setPossiblePanelStates(final int p) {
        this.p = p;
        if ((this.o & this.p) == 0x0) {
            this.d();
        }
    }
    
    public void setShadowDrawable(final Drawable f) {
        this.f = f;
    }
}
