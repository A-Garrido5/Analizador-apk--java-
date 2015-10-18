// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.util.Log;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.view.ViewTreeObserver;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.annotation.TargetApi;
import android.view.ViewParent;
import android.os.Build$VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewTreeObserver$OnTouchModeChangeListener;
import android.graphics.Rect;
import android.widget.AbsListView;
import android.view.View$OnClickListener;
import android.view.VelocityTracker;
import android.widget.OverScroller;
import android.view.ViewGroup;

public class BottomSheetDrawerLayout extends ViewGroup
{
    private int a;
    private int b;
    private int c;
    private boolean d;
    private float e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final int k;
    private final float l;
    private final OverScroller m;
    private VelocityTracker n;
    private View$OnClickListener o;
    private float p;
    private float q;
    private AbsListView r;
    private float s;
    private int t;
    private boolean u;
    private final Rect v;
    private boolean w;
    private final ViewTreeObserver$OnTouchModeChangeListener x;
    private final ViewTreeObserver$OnGlobalLayoutListener y;
    
    public BottomSheetDrawerLayout(final Context context) {
        this(context, null);
    }
    
    public BottomSheetDrawerLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public BottomSheetDrawerLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.t = -1;
        this.u = false;
        this.v = new Rect();
        this.w = false;
        this.x = (ViewTreeObserver$OnTouchModeChangeListener)new m(this);
        this.y = (ViewTreeObserver$OnGlobalLayoutListener)new n(this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.BottomSheetDrawerLayout, n, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(li.BottomSheetDrawerLayout_android_maxWidth, -1);
        this.b = obtainStyledAttributes.getDimensionPixelSize(li.BottomSheetDrawerLayout_maxCollapsedHeight, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(li.BottomSheetDrawerLayout_maxCollapsedHeightSmall, this.b);
        obtainStyledAttributes.recycle();
        this.m = new OverScroller(context, AnimationUtils.loadInterpolator(context, 17563653));
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.k = value.getScaledTouchSlop();
        this.l = value.getScaledMinimumFlingVelocity();
    }
    
    private float a(final float n) {
        final float max = Math.max(0.0f, Math.min(n + this.e, this.f));
        final float n2 = fcmpl(max, this.e);
        float n3 = 0.0f;
        if (n2 != 0) {
            final int n4 = (int)(max - this.e);
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = this.getChildAt(i);
                if (!((BottomSheetDrawerLayout$LayoutParams)child.getLayoutParams()).b) {
                    child.offsetTopAndBottom(n4);
                }
            }
            this.e += n4;
            this.g += n4;
            ViewCompat.postInvalidateOnAnimation((View)this);
            n3 = n4;
        }
        return n3;
    }
    
    private View a(final float n, final float n2) {
        return a(this, n, n2);
    }
    
    private static View a(final ViewGroup viewGroup, final float n, final float n2) {
        for (int i = -1 + viewGroup.getChildCount(); i >= 0; --i) {
            final View child = viewGroup.getChildAt(i);
            if (a(child, n, n2)) {
                return child;
            }
        }
        return null;
    }
    
    private void a(final int n, final float n2) {
        if (this.getMaxCollapsedHeight() != 0) {
            this.m.abortAnimation();
            final int n3 = (int)this.e;
            final int n4 = n - n3;
            if (n4 != 0) {
                final int height = this.getHeight();
                final int n5 = height / 2;
                final float n6 = n5 + n5 * this.b(Math.min(1.0f, 1.0f * Math.abs(n4) / height));
                final float abs = Math.abs(n2);
                int n7;
                if (abs > 0.0f) {
                    n7 = 4 * Math.round(1000.0f * Math.abs(n6 / abs));
                }
                else {
                    n7 = (int)(100.0f * (1.0f + Math.abs(n4) / height));
                }
                this.m.startScroll(0, n3, 0, n4, Math.min(n7, 300));
                ViewCompat.postInvalidateOnAnimation((View)this);
            }
        }
    }
    
    private void a(final MotionEvent motionEvent) {
        if (Build$VERSION.SDK_INT < 21 && this.u && this.r != null) {
            final MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            this.a(obtain, (View)this.r);
            obtain.recycle();
        }
    }
    
    private void a(final MotionEvent motionEvent, final View view) {
        final int n = this.getScrollX() - view.getLeft();
        final int n2 = this.getScrollY() - view.getTop();
        motionEvent.offsetLocation((float)n, (float)n2);
        view.dispatchTouchEvent(motionEvent);
        motionEvent.offsetLocation((float)(-n), (float)(-n2));
    }
    
    private boolean a(final int n) {
        return this.r != null && this.r.canScrollVertically(-n);
    }
    
    private boolean a(View view) {
        this.v.set(0, 0, view.getWidth(), view.getHeight());
        this.offsetDescendantRectToMyCoords(view, this.v);
        if (view.getParent() != this) {
            ViewParent parent2;
            for (ViewParent parent = view.getParent(); parent != this; parent = parent2) {
                final View view2 = (View)parent;
                parent2 = view2.getParent();
                view = view2;
            }
        }
        final int n = this.getHeight() - this.getPaddingBottom();
        final int childCount = this.getChildCount();
        final int n2 = 1 + this.indexOfChild(view);
        int min = n;
        for (int i = n2; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                min = Math.min(min, child.getTop());
            }
        }
        return this.v.bottom > min;
    }
    
    private boolean a(final View view, final float n) {
        return Build$VERSION.SDK_INT < 21 && Math.abs(this.e) <= 1.0 && view instanceof AbsListView && (n < 0.0f || view.canScrollVertically((int)(-n)));
    }
    
    private static boolean a(final View view, final float n, final float n2) {
        final float x = view.getX();
        final float y = view.getY();
        final float n3 = x + view.getWidth();
        final float n4 = y + view.getHeight();
        return n >= x && n2 >= y && n < n3 && n2 < n4;
    }
    
    private float b(final float n) {
        return (float)Math.sin((float)(0.4712389167638204 * (n - 0.5f)));
    }
    
    private View b(float n, float n2) {
        Object o = this.a(n, n2);
        View a;
        while (true) {
            a = null;
            if (o == null) {
                break;
            }
            n -= ((View)o).getX();
            n2 -= ((View)o).getY();
            if (o instanceof AbsListView) {
                a = a((ViewGroup)o, n, n2);
                break;
            }
            if (o instanceof ViewGroup) {
                o = a((ViewGroup)o, n, n2);
            }
            else {
                o = null;
            }
        }
        return a;
    }
    
    private void b() {
        this.t = -1;
        this.h = false;
        this.i = false;
        this.s = 0.0f;
        this.q = 0.0f;
        this.p = 0.0f;
        this.r = null;
        this.u = false;
        if (this.n != null) {
            this.n.recycle();
            this.n = null;
        }
    }
    
    private void b(final MotionEvent motionEvent) {
        float n = motionEvent.getY() - this.s;
        if (Build$VERSION.SDK_INT >= 21) {
            this.a(n);
        }
        else {
            if (this.r == null) {
                this.a(n);
                return;
            }
            if (n <= 0.0f || !this.a((int)n)) {
                n -= this.a(n);
            }
            if (Math.abs(n) >= 1.0) {
                if (!this.u) {
                    final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(0);
                    this.u = true;
                    this.a(obtain, (View)this.r);
                    obtain.recycle();
                    return;
                }
                this.a(motionEvent, (View)this.r);
            }
        }
    }
    
    private void c(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.t) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.p = motionEvent.getX(n);
            final float y = motionEvent.getY(n);
            this.s = y;
            this.q = y;
            this.t = motionEvent.getPointerId(n);
            this.d();
        }
    }
    
    @TargetApi(19)
    private boolean c() {
        if (Build$VERSION.SDK_INT >= 19) {
            return this.isLaidOut();
        }
        return this.w;
    }
    
    private boolean c(final float n, final float n2) {
        final View b = this.b(n, n2);
        return b != null && this.a(b);
    }
    
    private void d() {
        if (Build$VERSION.SDK_INT < 21) {
            final View a = this.a(this.p, this.q);
            if (a instanceof AbsListView) {
                this.r = (AbsListView)a;
            }
        }
    }
    
    private int getMaxCollapsedHeight() {
        if (this.a()) {
            return this.c;
        }
        return this.b;
    }
    
    @TargetApi(21)
    private int getNestedScrollAxesCompat() {
        if (Build$VERSION.SDK_INT >= 21) {
            return this.getNestedScrollAxes();
        }
        return 0;
    }
    
    public boolean a() {
        return this.d;
    }
    
    public void computeScroll() {
        super.computeScroll();
        if (!this.m.isFinished()) {
            final boolean computeScrollOffset = this.m.computeScrollOffset();
            this.a(this.m.getCurrY() - this.e);
            if (computeScrollOffset) {
                ViewCompat.postInvalidateOnAnimation((View)this);
            }
        }
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new BottomSheetDrawerLayout$LayoutParams(-1, -2);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new BottomSheetDrawerLayout$LayoutParams(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof BottomSheetDrawerLayout$LayoutParams) {
            return (ViewGroup$LayoutParams)new BottomSheetDrawerLayout$LayoutParams((BottomSheetDrawerLayout$LayoutParams)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return (ViewGroup$LayoutParams)new BottomSheetDrawerLayout$LayoutParams((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return (ViewGroup$LayoutParams)new BottomSheetDrawerLayout$LayoutParams(viewGroup$LayoutParams);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
        viewTreeObserver.addOnTouchModeChangeListener(this.x);
        if (Build$VERSION.SDK_INT < 19) {
            viewTreeObserver.addOnGlobalLayoutListener(this.y);
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeOnTouchModeChangeListener(this.x);
        this.w = false;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (this.n == null) {
            this.n = VelocityTracker.obtain();
        }
        if (actionMasked == 0) {
            this.n.clear();
        }
        this.n.addMovement(motionEvent);
        switch (actionMasked) {
            case 0: {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                this.p = x;
                this.s = y;
                this.q = y;
                this.d();
                this.i = (this.c(x, y) && this.f > 0);
                break;
            }
            case 2: {
                final float x2 = motionEvent.getX();
                final float y2 = motionEvent.getY();
                final float n = y2 - this.q;
                final View a = this.a(x2, y2);
                if (Math.abs(n) <= this.k || a == null || (0x2 & this.getNestedScrollAxesCompat()) != 0x0) {
                    break;
                }
                if (this.a(a, n)) {
                    this.s = y2;
                    break;
                }
                this.s = Math.max(this.s - this.k, Math.min(n + this.s, this.s + this.k));
                this.t = motionEvent.getPointerId(0);
                this.h = true;
                break;
            }
            case 6: {
                this.c(motionEvent);
                break;
            }
            case 1:
            case 3: {
                this.b();
                break;
            }
        }
        if (this.h) {
            this.m.abortAnimation();
        }
        if (!this.h) {
            final boolean i = this.i;
            final boolean b = false;
            if (!i) {
                return b;
            }
        }
        return true;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int width = this.getWidth();
        int g = this.g;
        final int paddingLeft = this.getPaddingLeft();
        final int n5 = width - this.getPaddingRight();
        int n6;
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i, g = n6) {
            final View child = this.getChildAt(i);
            final BottomSheetDrawerLayout$LayoutParams bottomSheetDrawerLayout$LayoutParams = (BottomSheetDrawerLayout$LayoutParams)child.getLayoutParams();
            if (child.getVisibility() == 8) {
                n6 = g;
            }
            else {
                int n7 = g + bottomSheetDrawerLayout$LayoutParams.topMargin;
                if (bottomSheetDrawerLayout$LayoutParams.b) {
                    n7 -= (int)this.e;
                }
                final int n8 = n7 + child.getMeasuredHeight();
                final int measuredWidth = child.getMeasuredWidth();
                final int n9 = paddingLeft + (n5 - paddingLeft - measuredWidth) / 2;
                child.layout(n9, n7, measuredWidth + n9, n8);
                n6 = n8 + bottomSheetDrawerLayout$LayoutParams.bottomMargin;
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        int min;
        if (this.a >= 0) {
            min = Math.min(size, this.a);
        }
        else {
            min = size;
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(min, 1073741824);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(size2, 1073741824);
        final int n3 = this.getPaddingLeft() + this.getPaddingRight();
        int n4 = this.getPaddingTop() + this.getPaddingBottom();
        final int childCount = this.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final BottomSheetDrawerLayout$LayoutParams bottomSheetDrawerLayout$LayoutParams = (BottomSheetDrawerLayout$LayoutParams)child.getLayoutParams();
            if (bottomSheetDrawerLayout$LayoutParams.a && child.getVisibility() != 8) {
                this.measureChildWithMargins(child, measureSpec, n3, measureSpec2, n4);
                n4 += bottomSheetDrawerLayout$LayoutParams.topMargin + child.getMeasuredHeight() + bottomSheetDrawerLayout$LayoutParams.bottomMargin;
            }
        }
        int j = 0;
        int n5 = n4;
        while (j < childCount) {
            final View child2 = this.getChildAt(j);
            final BottomSheetDrawerLayout$LayoutParams bottomSheetDrawerLayout$LayoutParams2 = (BottomSheetDrawerLayout$LayoutParams)child2.getLayoutParams();
            if (!bottomSheetDrawerLayout$LayoutParams2.a && child2.getVisibility() != 8) {
                this.measureChildWithMargins(child2, measureSpec, n3, measureSpec2, n5);
                n5 += bottomSheetDrawerLayout$LayoutParams2.topMargin + child2.getMeasuredHeight() + bottomSheetDrawerLayout$LayoutParams2.bottomMargin;
            }
            ++j;
        }
        this.f = Math.max(0, n5 - n4 - this.getMaxCollapsedHeight());
        if (this.c()) {
            this.e = Math.min(this.e, this.f);
        }
        else {
            float e;
            if (this.j) {
                e = 0.0f;
            }
            else {
                e = this.f;
            }
            this.e = e;
        }
        this.g = Math.max(0, size2 - n5) + (int)this.e;
        this.setMeasuredDimension(size, size2);
    }
    
    @TargetApi(21)
    public boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        boolean b2 = false;
        if (!b) {
            final float n3 = fcmpl(Math.abs(n2), this.l);
            b2 = false;
            if (n3 > 0) {
                final float n4 = fcmpl(n2, 0.0f);
                int f = 0;
                if (n4 <= 0) {
                    f = this.f;
                }
                this.a(f, n2);
                b2 = true;
            }
        }
        return b2;
    }
    
    @TargetApi(21)
    public boolean onNestedPreFling(final View view, final float n, final float n2) {
        final float n3 = fcmpl(n2, this.l);
        boolean b = false;
        if (n3 > 0) {
            final float n4 = fcmpl(this.e, 0.0f);
            b = false;
            if (n4 != 0) {
                this.a(0, n2);
                b = true;
            }
        }
        return b;
    }
    
    @TargetApi(21)
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        if (n2 > 0) {
            array[1] = (int)(-this.a((float)(-n2)));
        }
    }
    
    @TargetApi(21)
    public void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        if (n4 < 0) {
            this.a((float)(-n4));
        }
    }
    
    @TargetApi(21)
    public void onNestedScrollAccepted(final View view, final View view2, final int n) {
        super.onNestedScrollAccepted(view, view2, n);
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        final BottomSheetDrawerLayout$SavedState bottomSheetDrawerLayout$SavedState = (BottomSheetDrawerLayout$SavedState)parcelable;
        super.onRestoreInstanceState(bottomSheetDrawerLayout$SavedState.getSuperState());
        this.j = bottomSheetDrawerLayout$SavedState.a;
    }
    
    protected Parcelable onSaveInstanceState() {
        final BottomSheetDrawerLayout$SavedState bottomSheetDrawerLayout$SavedState = new BottomSheetDrawerLayout$SavedState(super.onSaveInstanceState());
        bottomSheetDrawerLayout$SavedState.a = (this.f > 0 && this.e == 0.0f);
        return (Parcelable)bottomSheetDrawerLayout$SavedState;
    }
    
    @TargetApi(21)
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return (n & 0x2) != 0x0;
    }
    
    @TargetApi(21)
    public void onStopNestedScroll(final View view) {
        super.onStopNestedScroll(view);
        if (this.m.isFinished()) {
            int f;
            if (this.e < this.f / 2) {
                f = 0;
            }
            else {
                f = this.f;
            }
            this.a(f, 0.0f);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        boolean b = true;
        final int actionMasked = motionEvent.getActionMasked();
        this.n.addMovement(motionEvent);
        boolean b2 = false;
        switch (actionMasked) {
            case 0: {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                this.p = x;
                this.s = y;
                this.q = y;
                this.d();
                this.t = motionEvent.getPointerId(0);
                boolean b3;
                if (this.a(this.p, this.q) == null && this.o != null) {
                    this.h = b;
                    b3 = b;
                }
                else {
                    b3 = false;
                }
                if (this.f <= 0) {
                    b = false;
                }
                b2 = (b3 | b);
                this.m.abortAnimation();
                break;
            }
            case 2: {
                int pointerIndex = motionEvent.findPointerIndex(this.t);
                if (pointerIndex < 0) {
                    Log.e("BottomSheetDrawerLayout", "Bad pointer id " + this.t + ", resetting");
                    this.t = motionEvent.getPointerId(0);
                    this.p = motionEvent.getX();
                    final float y2 = motionEvent.getY();
                    this.s = y2;
                    this.q = y2;
                    this.d();
                    pointerIndex = 0;
                }
                final float x2 = motionEvent.getX(pointerIndex);
                final float y3 = motionEvent.getY(pointerIndex);
                final boolean h = this.h;
                b2 = false;
                if (!h) {
                    final float n = y3 - this.q;
                    final float n2 = fcmpl(Math.abs(n), (float)this.k);
                    b2 = false;
                    if (n2 > 0) {
                        final View a = this.a(x2, y3);
                        b2 = false;
                        if (a != null) {
                            this.h = b;
                            this.s = Math.max(this.s - this.k, Math.min(n + this.s, this.s + this.k));
                            b2 = b;
                        }
                    }
                }
                if (this.h) {
                    this.b(motionEvent);
                }
                this.s = y3;
                break;
            }
            case 5: {
                final int actionIndex = motionEvent.getActionIndex();
                this.t = motionEvent.getPointerId(actionIndex);
                this.p = motionEvent.getX(actionIndex);
                final float y4 = motionEvent.getY(actionIndex);
                this.s = y4;
                this.q = y4;
                this.d();
                b2 = false;
                break;
            }
            case 6: {
                this.c(motionEvent);
                b2 = false;
                break;
            }
            case 1: {
                this.h = false;
                if (this.a(this.p, this.q) == null && this.a(motionEvent.getX(), motionEvent.getY()) == null && this.o != null) {
                    this.o.onClick((View)this);
                    this.b();
                    return b;
                }
                if (this.i && Math.abs(motionEvent.getX() - this.p) < this.k && Math.abs(motionEvent.getY() - this.q) < this.k) {
                    this.a(0, 0.0f);
                    return b;
                }
                this.n.computeCurrentVelocity(1000);
                final float yVelocity = this.n.getYVelocity(this.t);
                if (Math.abs(yVelocity) > this.l) {
                    int f;
                    if (yVelocity < 0.0f) {
                        f = 0;
                    }
                    else {
                        f = this.f;
                    }
                    this.a(f, yVelocity);
                }
                else {
                    int f2;
                    if (this.e < this.f / 2) {
                        f2 = 0;
                    }
                    else {
                        f2 = this.f;
                    }
                    this.a(f2, 0.0f);
                }
                this.a(motionEvent);
                this.b();
                b2 = false;
                break;
            }
            case 3: {
                if (this.h) {
                    final float n3 = fcmpg(this.e, (float)(this.f / 2));
                    int f3 = 0;
                    if (n3 >= 0) {
                        f3 = this.f;
                    }
                    this.a(f3, 0.0f);
                }
                this.a(motionEvent);
                this.b();
                return b;
            }
        }
        return b2;
    }
    
    public void requestChildFocus(final View view, final View view2) {
        super.requestChildFocus(view, view2);
        if (!this.isInTouchMode() && this.a(view2)) {
            this.a(0, 0.0f);
        }
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        if (Build$VERSION.SDK_INT >= 21) {
            super.requestDisallowInterceptTouchEvent(b);
        }
    }
    
    public void setOnClickOutsideListener(final View$OnClickListener o) {
        this.o = o;
    }
    
    public void setSmallCollapsed(final boolean d) {
        this.d = d;
        this.requestLayout();
    }
}
