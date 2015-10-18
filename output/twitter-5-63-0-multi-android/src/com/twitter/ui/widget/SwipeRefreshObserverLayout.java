// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.widget.AbsListView;
import android.support.v4.view.ViewCompat;
import android.os.Build$VERSION;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public class SwipeRefreshObserverLayout extends FrameLayout
{
    private static final int[] a;
    private View b;
    private u c;
    private t d;
    private s e;
    private boolean f;
    private int g;
    private float h;
    private float i;
    private boolean j;
    private int k;
    
    static {
        a = new int[] { 16842766 };
    }
    
    public SwipeRefreshObserverLayout(final Context context) {
        this(context, null);
    }
    
    public SwipeRefreshObserverLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = new r(this);
        this.f = false;
        this.h = -1.0f;
        this.k = -1;
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, SwipeRefreshObserverLayout.a);
        this.setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        this.h = 64.0f * this.getResources().getDisplayMetrics().density;
    }
    
    private float a(final MotionEvent motionEvent, final int n) {
        final int pointerIndex = MotionEventCompat.findPointerIndex(motionEvent, n);
        if (pointerIndex < 0) {
            return -1.0f;
        }
        return MotionEventCompat.getY(motionEvent, pointerIndex);
    }
    
    private void a(final MotionEvent motionEvent) {
        final int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.k) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.k = MotionEventCompat.getPointerId(motionEvent, n);
        }
    }
    
    private void a(final boolean f, final boolean b) {
        if (this.f != f) {
            this.f = f;
            this.d.setRefreshing(this.f);
            if (this.f && b && this.e != null) {
                this.e.a();
            }
        }
    }
    
    private View getSwipeChild() {
        if (this.c != null) {
            return this.c.a();
        }
        if (this.b == null) {
            this.b = this.getChildAt(0);
        }
        return this.b;
    }
    
    protected boolean a() {
        boolean b = true;
        final View swipeChild = this.getSwipeChild();
        if (Build$VERSION.SDK_INT >= 14) {
            return ViewCompat.canScrollVertically(swipeChild, -1);
        }
        if (swipeChild instanceof AbsListView) {
            final AbsListView absListView = (AbsListView)swipeChild;
            return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop()) && b;
        }
        if (swipeChild.getScrollY() <= 0) {
            b = false;
        }
        return b;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.isEnabled() && !this.a() && !this.f) {
            switch (actionMasked) {
                case 0: {
                    this.k = MotionEventCompat.getPointerId(motionEvent, 0);
                    this.j = false;
                    final float a = this.a(motionEvent, this.k);
                    if (a != -1.0f) {
                        this.i = a;
                        break;
                    }
                    return false;
                }
                case 2: {
                    if (this.k == -1) {
                        return false;
                    }
                    final float a2 = this.a(motionEvent, this.k);
                    if (a2 == -1.0f) {
                        return false;
                    }
                    if (a2 - this.i > this.g && !this.j) {
                        this.j = true;
                        break;
                    }
                    break;
                }
                case 6: {
                    this.a(motionEvent);
                    break;
                }
                case 1:
                case 3: {
                    this.j = false;
                    this.k = -1;
                    break;
                }
            }
            return this.j;
        }
        return false;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.isEnabled() && !this.a() && !this.f) {
            switch (actionMasked) {
                case 0: {
                    this.k = MotionEventCompat.getPointerId(motionEvent, 0);
                    this.j = false;
                    break;
                }
                case 2: {
                    final int pointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.k);
                    if (pointerIndex < 0) {
                        return false;
                    }
                    final float n = 0.5f * (MotionEventCompat.getY(motionEvent, pointerIndex) - this.i);
                    if (!this.j) {
                        break;
                    }
                    final float progress = n / this.h;
                    if (progress >= 0.0f) {
                        this.d.setProgress(progress);
                        break;
                    }
                    return false;
                }
                case 5: {
                    this.k = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                    break;
                }
                case 6: {
                    this.a(motionEvent);
                    break;
                }
                case 1:
                case 3: {
                    if (this.k != -1) {
                        final float n2 = 0.5f * (MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.k)) - this.i);
                        this.j = false;
                        if (n2 > this.h) {
                            this.a(true, true);
                        }
                        else {
                            this.d.setRefreshing(false);
                        }
                        this.k = -1;
                        return false;
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
    }
    
    public void setDistanceToTriggerSync(final int n) {
        this.h = n;
    }
    
    public void setOnRefreshListener(final s e) {
        this.e = e;
    }
    
    public void setProgressView(final t d) {
        this.d.setRefreshing(false);
        (this.d = d).setRefreshing(this.f);
    }
    
    public void setRefreshing(final boolean b) {
        this.a(b, false);
    }
    
    public void setSwipeChildProvider(final u c) {
        this.c = c;
    }
}
