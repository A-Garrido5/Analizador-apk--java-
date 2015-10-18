// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.util.t;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import com.twitter.internal.android.widget.RectLayoutParams;
import android.view.MotionEvent;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.OvershootInterpolator;
import android.animation.ValueAnimator;
import com.twitter.util.g;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public class DraggableHeaderLayout extends ViewGroup
{
    private static final DraggableHeaderLayout$AnchorMode[] a;
    private final int b;
    private final int c;
    private final int d;
    private View e;
    private View f;
    private int g;
    private DraggableHeaderLayout$AnchorMode h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    
    static {
        a = new DraggableHeaderLayout$AnchorMode[] { DraggableHeaderLayout$AnchorMode.a, DraggableHeaderLayout$AnchorMode.b };
    }
    
    public DraggableHeaderLayout(final Context context) {
        this(context, null, 2130772000);
    }
    
    public DraggableHeaderLayout(final Context context, final AttributeSet set) {
        this(context, set, 2130772000);
    }
    
    public DraggableHeaderLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.p = Integer.MIN_VALUE;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.DraggableHeaderLayout, n, 0);
        this.b = obtainStyledAttributes.getResourceId(0, 2131886123);
        this.c = obtainStyledAttributes.getResourceId(1, 2131886089);
        this.g = obtainStyledAttributes.getDimensionPixelSize(2, 100000);
        this.h = DraggableHeaderLayout.a[obtainStyledAttributes.getInt(3, 0)];
        this.i = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(5, this.getResources().getDimensionPixelSize(2131558640));
        this.k = obtainStyledAttributes.getDimensionPixelSize(6, Integer.MAX_VALUE);
        this.l = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.m = obtainStyledAttributes.getBoolean(8, false);
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        obtainStyledAttributes.recycle();
    }
    
    private int a(final int n) {
        final int measuredHeight = this.e.getMeasuredHeight();
        final int bottom = this.e.getBottom();
        return com.twitter.util.g.a(bottom + n, com.twitter.util.g.a(this.j, 0, measuredHeight), com.twitter.util.g.a(this.k, 0, measuredHeight)) - bottom;
    }
    
    private void a() {
        this.r = true;
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { this.i, this.q });
        ofInt.setDuration(300L);
        ofInt.setInterpolator((TimeInterpolator)new OvershootInterpolator(1.5f));
        ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new bo(this));
        ofInt.addListener((Animator$AnimatorListener)new bp(this));
        ofInt.start();
    }
    
    private void a(final MotionEvent motionEvent) {
        motionEvent.setLocation(motionEvent.getX(), motionEvent.getY() - this.e.getTop());
        this.e.dispatchTouchEvent(motionEvent);
    }
    
    private void b(final int n) {
        switch (bq.a[this.h.ordinal()]) {
            case 1: {
                this.i -= n;
                break;
            }
            case 2: {
                this.i += n;
                break;
            }
        }
        this.requestLayout();
    }
    
    protected RectLayoutParams a(final View view, final int n, final int n2) {
        final RectLayoutParams rectLayoutParams = (RectLayoutParams)view.getLayoutParams();
        rectLayoutParams.a(n, n2, n + view.getMeasuredWidth(), n2 + view.getMeasuredHeight());
        return rectLayoutParams;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof RectLayoutParams && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new RectLayoutParams(-1, -1);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new RectLayoutParams(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new RectLayoutParams(viewGroup$LayoutParams);
    }
    
    public int getVisibleHeaderHeight() {
        return this.e.getBottom();
    }
    
    protected void onFinishInflate() {
        if (this.getChildCount() != 2) {
            throw new IllegalStateException("DraggableHeaderLayout must contain exactly two children");
        }
        this.e = this.findViewById(this.b);
        if (this.e == null) {
            throw new IllegalStateException("DraggableHeaderLayout must have a header view");
        }
        this.f = this.findViewById(this.c);
        if (this.f == null) {
            throw new IllegalStateException("DraggableHeaderLayout must have a body view");
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (this.r) {
            return true;
        }
        switch (motionEvent.getAction()) {
            case 1:
            case 3: {
                return this.n = false;
            }
            case 0: {
                final int p = (int)motionEvent.getY();
                this.p = p;
                if (p <= this.e.getBottom()) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final RectLayoutParams rectLayoutParams = (RectLayoutParams)child.getLayoutParams();
            child.layout(rectLayoutParams.a, rectLayoutParams.b, rectLayoutParams.c, rectLayoutParams.d);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        this.setMeasuredDimension(size, size2);
        boolean b;
        if (this.m && (this.n || this.r)) {
            b = true;
        }
        else {
            b = false;
        }
        final View e = this.e;
        if (!b) {
            this.measureChildWithMargins(e, View$MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View$MeasureSpec.makeMeasureSpec(this.g, Integer.MIN_VALUE), 0);
        }
        final int measuredHeight = e.getMeasuredHeight();
        int i = 0;
        switch (bq.a[this.h.ordinal()]) {
            default: {
                i = 0;
                break;
            }
            case 1: {
                i = measuredHeight - this.i;
                break;
            }
            case 2: {
                i = this.i;
                break;
            }
        }
        final int a = com.twitter.util.g.a(i, com.twitter.util.g.a(this.j, 0, measuredHeight), com.twitter.util.g.a(this.k, 0, measuredHeight));
        final View f = this.f;
        int max = Math.max(size2 - a, 0);
        if (b) {
            max += this.l;
        }
        if (!b || f.getMeasuredHeight() < max) {
            this.measureChildWithMargins(f, View$MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View$MeasureSpec.makeMeasureSpec(max, 1073741824), 0);
        }
        this.a(e, 0, a - measuredHeight);
        this.a(f, 0, a);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.r) {
            final int o = (int)motionEvent.getY();
            switch (motionEvent.getAction()) {
                default: {
                    return true;
                }
                case 0: {
                    this.a(motionEvent);
                    this.o = o;
                    this.p = o;
                    return true;
                }
                case 1:
                case 3: {
                    this.o = Integer.MIN_VALUE;
                    this.p = Integer.MIN_VALUE;
                    if (this.n) {
                        motionEvent.setAction(3);
                        if (this.m) {
                            this.a();
                        }
                    }
                    this.a(motionEvent);
                    this.n = false;
                    return true;
                }
                case 2: {
                    final int n = o - this.o;
                    this.o = o;
                    if (!this.n) {
                        if (Math.abs(o - this.p) > this.d) {
                            this.n = true;
                            this.q = this.i;
                            motionEvent.setAction(3);
                        }
                        this.a(motionEvent);
                    }
                    if (!this.n) {
                        break;
                    }
                    final int a = this.a(n);
                    if (a != 0) {
                        if (n > 0) {
                            t.a(this.getContext(), this.e, false);
                        }
                        this.b(a);
                        return true;
                    }
                    break;
                }
            }
        }
        return true;
    }
    
    public void setAnchorMode(final DraggableHeaderLayout$AnchorMode h) {
        this.h = h;
        this.requestLayout();
    }
    
    public void setAnchorOffset(final int i) {
        this.i = i;
        this.requestLayout();
    }
    
    public void setExtraBodyHeight(final int l) {
        this.l = l;
        this.requestLayout();
    }
    
    public void setMaxHeaderHeight(final int g) {
        this.g = g;
        this.requestLayout();
    }
    
    public void setMaxVisibleHeaderHeight(final int k) {
        this.k = k;
        this.requestLayout();
    }
    
    public void setMinVisibleHeaderHeight(final int j) {
        this.j = j;
        this.requestLayout();
    }
    
    public void setSnapBackOnRelease(final boolean m) {
        this.m = m;
    }
}
