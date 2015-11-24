// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.util.g;
import com.twitter.util.t;
import android.view.ViewGroup$LayoutParams;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AlphaAnimation;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import com.twitter.android.pa;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.annotation.SuppressLint;
import android.view.VelocityTracker;
import android.widget.Scroller;
import android.widget.ImageView;
import android.view.ViewGroup;

public class DraggableDrawerLayout extends ViewGroup
{
    private ImageView A;
    private float B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private Scroller I;
    private boolean J;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;
    private final float f;
    private final float g;
    private final float h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    @SuppressLint({ "Recycle" })
    private final VelocityTracker n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private bn v;
    private View w;
    private View x;
    private View y;
    private View z;
    
    public DraggableDrawerLayout(final Context context) {
        this(context, null);
    }
    
    public DraggableDrawerLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public DraggableDrawerLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.n = VelocityTracker.obtain();
        this.s = true;
        this.C = Integer.MIN_VALUE;
        this.D = 1;
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.a = value.getScaledTouchSlop();
        this.b = value.getScaledMinimumFlingVelocity();
        this.c = value.getScaledMaximumFlingVelocity();
        final Resources resources = this.getResources();
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.d = displayMetrics.heightPixels - resources.getDimensionPixelSize(2131558941);
        this.e = (displayMetrics.widthPixels > displayMetrics.heightPixels);
        this.f = 1.0f * displayMetrics.density;
        this.g = 0.01f * displayMetrics.density;
        this.h = 0.005f * displayMetrics.density;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.DraggableDrawerLayout);
        this.i = obtainStyledAttributes.getResourceId(1, 0);
        this.j = obtainStyledAttributes.getResourceId(2, 0);
        this.k = obtainStyledAttributes.getResourceId(3, 0);
        this.l = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.m = resources.getDimensionPixelSize(2131558639);
        obtainStyledAttributes.recycle();
    }
    
    private int a(final int n, int n2) {
        if (n > 0) {
            n2 = n;
        }
        int n3;
        if (n == -2) {
            n3 = Integer.MIN_VALUE;
        }
        else {
            n3 = 1073741824;
        }
        return View$MeasureSpec.makeMeasureSpec(n2, n3);
    }
    
    private int a(final View view, final int n, final int n2) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int n3 = viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin;
        final int n4 = viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
        view.measure(this.a(viewGroup$MarginLayoutParams.width, n - n3), this.a(viewGroup$MarginLayoutParams.height, n2 - n4));
        return n4 + view.getMeasuredHeight();
    }
    
    private void a(final float n, final long duration) {
        final ImageView a = this.A;
        if (a != null && duration > 0L) {
            final float alpha = ((View)a).getAlpha();
            if (alpha != n) {
                ((View)a).setAlpha(1.0f);
                final AlphaAnimation alphaAnimation = new AlphaAnimation(alpha, n);
                alphaAnimation.setDuration(duration);
                alphaAnimation.setAnimationListener((Animation$AnimationListener)new bk(this, (View)a, n));
                ((View)a).setVisibility(0);
                ((View)a).clearAnimation();
                ((View)a).startAnimation((Animation)alphaAnimation);
            }
        }
    }
    
    private void a(final int n, final float n2, final float n3, final float n4) {
        if (this.y != null) {
            this.y.setVisibility(4);
        }
        final bm bm = new bm(n, n2, n3);
        bm.setAnimationListener((Animation$AnimationListener)new bj(this));
        this.p = true;
        this.w.startAnimation((Animation)bm);
        this.a(n4, bm.getDuration());
    }
    
    private void a(final MotionEvent motionEvent) {
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float)(-this.w.getTop()));
        this.w.dispatchTouchEvent(obtain);
        obtain.recycle();
    }
    
    private void b(final View view, int n, int n2) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        if (viewGroup$MarginLayoutParams != null) {
            n += viewGroup$MarginLayoutParams.leftMargin;
            n2 += viewGroup$MarginLayoutParams.topMargin;
        }
        view.layout(n, n2, n + view.getMeasuredWidth(), n2 + view.getMeasuredHeight());
    }
    
    private void b(final boolean b) {
        if (b) {
            this.f();
            return;
        }
        this.g();
    }
    
    private void f() {
        this.n.computeCurrentVelocity(1000, (float)this.c);
        final float yVelocity = this.n.getYVelocity();
        if (this.I == null) {
            this.I = new Scroller(this.getContext());
        }
        this.I.setFriction(3.0f * ViewConfiguration.getScrollFriction());
        this.I.fling(0, 0, 0, (int)yVelocity, 0, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.a(this.E - this.w.getTop(), this.f, this.h, 0.75f);
    }
    
    private void g() {
        final int n = this.G - this.w.getTop();
        this.n.computeCurrentVelocity(1);
        final float yVelocity = this.n.getYVelocity();
        float n2;
        if (n > 0) {
            n2 = this.g;
        }
        else {
            n2 = this.h;
        }
        this.a(n, yVelocity, n2, 0.0f);
    }
    
    private void h() {
        final int n = this.getHeight() - this.w.getTop();
        if (n < 0) {
            this.e();
            return;
        }
        this.a(n, this.f, this.g, 0.0f);
    }
    
    public void a(final boolean b) {
        if (this.D != 0 && !this.a()) {
            this.D = 0;
            this.setLocked(false);
            if (!b) {
                this.e();
                return;
            }
            this.h();
        }
    }
    
    public void a(final boolean b, final boolean b2) {
        int d;
        if (this.e || b2) {
            d = 2;
        }
        else {
            d = 1;
        }
        if (this.D != d && !this.a()) {
            this.D = d;
            if (!b) {
                this.e();
                return;
            }
            this.b(b2);
        }
    }
    
    public boolean a() {
        return this.p || this.o;
    }
    
    public boolean b() {
        return this.e;
    }
    
    public boolean c() {
        return this.J;
    }
    
    void d() {
        this.post((Runnable)new bl(this));
    }
    
    void e() {
        if (this.y != null && this.D == 2) {
            this.y.setVisibility(0);
        }
        this.w.requestLayout();
        if (this.v != null) {
            this.v.b(this.D);
        }
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(this.getContext(), set);
    }
    
    public int getDrawerState() {
        return this.D;
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.y = this.findViewById(this.i);
        if (this.y != null) {
            this.y.setVisibility(4);
            this.y.bringToFront();
        }
        this.z = this.findViewById(this.j);
        this.w = this.findViewById(2131886571);
        this.x = this.w.findViewWithTag((Object)"drawer_header");
        this.A = (ImageView)this.findViewById(this.k);
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (!this.p) {
            if (this.q) {
                return false;
            }
            if (motionEvent.getY() - this.H < this.F) {
                return false;
            }
        }
        return true;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (!this.a()) {
            if (this.y != null) {
                this.b(this.y, n, n2 + this.l);
            }
            this.b(this.z, n, n2 + this.l);
            this.b(this.w, n, n2 + this.H);
        }
        if (this.A != null) {
            final ImageView a = this.A;
            int visibility;
            if (this.D == 2) {
                visibility = 0;
            }
            else {
                visibility = 4;
            }
            a.setVisibility(visibility);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        int a;
        if (this.y != null) {
            a = this.a(this.y, measuredWidth, measuredHeight);
        }
        else {
            a = 0;
        }
        this.E = a;
        int a2;
        if (this.x != null) {
            a2 = this.a(this.x, measuredWidth, measuredHeight);
        }
        else {
            a2 = 0;
        }
        this.F = a2;
        final int d = this.d;
        boolean j = false;
        if (measuredHeight < d) {
            j = true;
        }
        this.J = j;
        final int b = com.twitter.util.t.a(this.getContext()).b();
        if (this.J) {
            this.G = measuredHeight - this.F;
            if (this.D == 1 && this.u) {
                this.G = Math.min(this.m, this.G / 2);
            }
        }
        else if (this.G == 0) {
            this.G = b / 2;
        }
        if (this.J && this.D == 1 && this.u) {
            this.H = this.G;
        }
        else if ((this.J && this.D != 2) || this.D == 0) {
            this.H = measuredHeight - this.F;
        }
        else if (this.D == 1) {
            this.H = this.G;
        }
        else {
            this.H = this.E;
        }
        int n3;
        if (this.D == 2 || this.q) {
            n3 = measuredHeight;
        }
        else {
            n3 = b + this.H;
        }
        int n4;
        if (this.D == 2) {
            n4 = this.G;
        }
        else {
            n4 = this.H;
        }
        this.a(this.z, measuredWidth, n4 - this.l);
        this.a(this.w, measuredWidth, n3 - this.H);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int c = (int)motionEvent.getY();
        final int top = this.w.getTop();
        final boolean b = c >= top && c <= this.w.getBottom();
        if (!this.p) {
            if (this.q) {
                if (b) {
                    this.a(motionEvent);
                    return true;
                }
            }
            else {
                switch (motionEvent.getAction()) {
                    default: {
                        return true;
                    }
                    case 0: {
                        if (b && !this.o) {
                            this.a(motionEvent);
                        }
                        if (this.r && b) {
                            this.B = c;
                            this.C = c;
                            this.n.addMovement(motionEvent);
                            return true;
                        }
                        this.o = false;
                        this.w.requestLayout();
                        return true;
                    }
                    case 1:
                    case 3: {
                        this.C = Integer.MIN_VALUE;
                        this.B = -2.14748365E9f;
                        if (this.o) {
                            this.n.addMovement(motionEvent);
                            if (this.D == 2) {
                                if (top >= 10 + this.E) {
                                    int d;
                                    if (this.e) {
                                        d = 0;
                                    }
                                    else {
                                        d = 1;
                                    }
                                    this.D = d;
                                }
                            }
                            else if (top <= -20 + this.G) {
                                this.D = 2;
                            }
                            if (this.D == 0) {
                                this.h();
                            }
                            else {
                                this.b(this.D == 2);
                            }
                        }
                        if (b) {
                            if (this.o) {
                                motionEvent.setAction(3);
                            }
                            this.a(motionEvent);
                        }
                        this.n.clear();
                        this.o = false;
                        return true;
                    }
                    case 2: {
                        final int n = (int)(c - this.B);
                        this.B = c;
                        boolean b2;
                        if (this.C != Integer.MIN_VALUE && Math.abs(this.C - c) > this.a) {
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        boolean b3;
                        if (c > top && ((this.D == 1 && n < 0) || (this.D == 2 && n > 0))) {
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        if (b2 && b3 && this.r && !this.o) {
                            this.o = true;
                            if (this.y != null) {
                                this.y.setVisibility(4);
                            }
                            if (this.v != null) {
                                this.v.x();
                            }
                            motionEvent.setAction(3);
                            this.a(motionEvent);
                        }
                        if (!this.o) {
                            this.a(motionEvent);
                            return true;
                        }
                        this.n.addMovement(motionEvent);
                        final int n2 = top + n;
                        if (n2 <= this.E) {
                            this.D = 2;
                            this.o = false;
                            this.q = true;
                            this.C = Integer.MIN_VALUE;
                            this.B = -2.14748365E9f;
                            this.e();
                            if (this.t) {
                                final View rootView = this.getRootView();
                                final int b4 = com.twitter.util.t.b((View)this, rootView);
                                final MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                                obtainNoHistory.setAction(0);
                                obtainNoHistory.offsetLocation(0.0f, 1.0f + (b4 + com.twitter.library.util.bj.c));
                                rootView.dispatchTouchEvent(obtainNoHistory);
                                obtainNoHistory.recycle();
                                final MotionEvent obtainNoHistory2 = MotionEvent.obtainNoHistory(motionEvent);
                                obtainNoHistory2.setAction(2);
                                obtainNoHistory2.offsetLocation(0.0f, (float)b4);
                                rootView.dispatchTouchEvent(obtainNoHistory2);
                                obtainNoHistory2.recycle();
                            }
                            return false;
                        }
                        if (this.A != null) {
                            this.A.setVisibility(0);
                            this.A.setAlpha(com.twitter.util.g.a(1.0f - 2.0f * n2 / this.getHeight(), 0.0f, 0.75f));
                        }
                        if (this.s || n2 <= this.G) {
                            this.w.offsetTopAndBottom(n);
                            return true;
                        }
                        break;
                    }
                }
            }
        }
        return true;
    }
    
    public void setDispatchDragToChildren(final boolean t) {
        this.t = t;
    }
    
    public void setDraggableBelowUpPosition(final boolean s) {
        this.s = s;
    }
    
    public void setDrawerDraggable(final boolean r) {
        this.r = r;
    }
    
    public void setDrawerLayoutListener(final bn v) {
        this.v = v;
    }
    
    public void setExtendDrawerInUpState(final boolean u) {
        this.u = u;
    }
    
    public void setFullScreenHeaderView(final View y) {
        if (this.y != y) {
            final View y2 = this.y;
            this.y = y;
            if (y2 != null) {
                com.twitter.util.t.c(y2);
            }
            this.E = 0;
            if (y != null) {
                y.setVisibility(4);
                y.setClickable(true);
                this.addView(y);
                if (this.getMeasuredWidth() != 0) {
                    this.a(y, this.getMeasuredWidth(), this.getMeasuredHeight());
                    this.E = y.getMeasuredHeight();
                }
            }
        }
    }
    
    public void setLocked(final boolean q) {
        this.q = q;
    }
}
