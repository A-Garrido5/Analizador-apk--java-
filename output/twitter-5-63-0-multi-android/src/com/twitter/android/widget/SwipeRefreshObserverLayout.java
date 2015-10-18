// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View$MeasureSpec;
import android.widget.AbsListView;
import android.support.v4.view.ViewCompat;
import android.os.Build$VERSION;
import android.view.View;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.view.MotionEvent;
import android.view.ViewGroup;

public class SwipeRefreshObserverLayout extends ViewGroup
{
    private fd a;
    private MotionEvent b;
    private boolean c;
    private int d;
    private float e;
    private boolean f;
    private final LinearInterpolator g;
    
    public SwipeRefreshObserverLayout(final Context context) {
        this(context, null);
    }
    
    public SwipeRefreshObserverLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = false;
        this.e = -1.0f;
        this.setWillNotDraw(true);
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.g = new LinearInterpolator();
    }
    
    private void a() {
        if (this.e == -1.0f) {
            final View view = (View)this.getParent();
            if (view != null && view.getHeight() > 0) {
                this.e = (int)Math.min(0.6f * view.getHeight(), 240.0f * this.getResources().getDisplayMetrics().density);
            }
        }
    }
    
    private boolean b() {
        boolean b = true;
        if (this.a == null) {
            b = false;
        }
        else {
            final View u = this.a.u();
            if (u != null) {
                if (Build$VERSION.SDK_INT >= 14) {
                    return ViewCompat.canScrollVertically(u, -1);
                }
                if (u instanceof AbsListView) {
                    final AbsListView absListView = (AbsListView)u;
                    return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop()) && b;
                }
                if (u.getScrollY() <= 0) {
                    return false;
                }
            }
        }
        return b;
    }
    
    private void setTriggerPercentage(final float n) {
        if (n == 0.0f) {
            return;
        }
        this.a.b(n);
    }
    
    public void a(final boolean c, final boolean b) {
        if (this.c != c) {
            this.c = c;
            if (b) {
                this.a.a(c);
            }
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        this.a();
        if (this.f && motionEvent.getAction() == 0) {
            this.f = false;
        }
        if (!this.isEnabled() || this.f || this.b() || this.c || !this.onTouchEvent(motionEvent)) {
            final boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            final boolean b = false;
            if (!onInterceptTouchEvent) {
                return b;
            }
        }
        return true;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        if (this.getChildCount() == 0) {
            return;
        }
        final View child = this.getChildAt(0);
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        child.layout(paddingLeft, paddingTop, measuredWidth - this.getPaddingLeft() - this.getPaddingRight() + paddingLeft, measuredHeight - this.getPaddingTop() - this.getPaddingBottom() + paddingTop);
    }
    
    public void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.getChildCount() > 1 && !this.isInEditMode()) {
            throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
        }
        if (this.getChildCount() > 0) {
            this.getChildAt(0).measure(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), 1073741824), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), 1073741824));
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        boolean b = true;
        switch (motionEvent.getAction()) {
            case 0: {
                this.b = MotionEvent.obtain(motionEvent);
                return false;
            }
            case 2: {
                if (this.a == null || this.b == null || this.f) {
                    break;
                }
                final float n = motionEvent.getY() - this.b.getY();
                if (Math.abs(motionEvent.getX() - this.b.getX()) <= n) {
                    if (n > this.d) {
                        if (n > this.e) {
                            return b;
                        }
                        this.setTriggerPercentage(this.g.getInterpolation(n / this.e));
                    }
                    else {
                        b = false;
                    }
                    return b;
                }
                break;
            }
            case 1:
            case 3: {
                if (this.b != null) {
                    this.b.recycle();
                    this.b = null;
                }
                if (this.a != null) {
                    this.a.x();
                    return false;
                }
                break;
            }
        }
        return false;
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
    }
    
    public void setRefreshing(final boolean b) {
        this.a(b, true);
    }
    
    public void setSwipeListener(final fd a) {
        this.a = a;
    }
}
