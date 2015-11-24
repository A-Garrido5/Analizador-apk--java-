// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.widget.ListAdapter;
import android.widget.Adapter;
import com.twitter.library.util.bj;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.twitter.refresh.widget.RefreshableListView;

public class PinnedHeaderRefreshableListView extends RefreshableListView
{
    private eb d;
    private View e;
    private boolean f;
    private int g;
    private int h;
    private View i;
    private int j;
    private int k;
    private MotionEvent l;
    private float m;
    private float n;
    
    public PinnedHeaderRefreshableListView(final Context context) {
        this(context, null);
    }
    
    public PinnedHeaderRefreshableListView(final Context context, final AttributeSet set) {
        this(context, set, 2130772062);
    }
    
    public PinnedHeaderRefreshableListView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public void a(int n) {
        if (this.e == null || this.getChildCount() == 0) {
            return;
        }
        int n2 = this.getChildAt(0).getBottom();
        if (n2 <= this.j - this.k) {
            for (int n3 = this.getLastVisiblePosition() - this.getFirstVisiblePosition(), i = 1; i < n3; ++i) {
                final View child = this.getChildAt(i);
                if (child == null) {
                    break;
                }
                if (child.getVisibility() == 0 && child.getHeight() > 0) {
                    n = i + this.getFirstVisiblePosition();
                    n2 = child.getBottom();
                    break;
                }
            }
        }
        final int headerViewsCount = this.getHeaderViewsCount();
        final int a_ = this.d.a_(n, headerViewsCount);
        final int paddingLeft = this.getPaddingLeft();
        switch (a_) {
            default: {}
            case 0: {
                this.f = false;
            }
            case 1: {
                this.d.a(this.e, n, headerViewsCount, 255);
                if (this.e.getTop() != 0) {
                    this.e.layout(paddingLeft, this.j, paddingLeft + this.g, this.j + this.h);
                }
                this.f = true;
            }
            case 2: {
                final int height = this.e.getHeight();
                int j;
                int n4;
                if (height > 0 && n2 - this.j < height + this.k) {
                    j = n2 - (height + this.k);
                    n4 = 255 * (height + j) / height;
                }
                else {
                    j = this.j;
                    n4 = 255;
                }
                this.d.a(this.e, n, headerViewsCount, n4);
                if (this.e.getTop() != j) {
                    this.e.layout(paddingLeft, j, paddingLeft + this.g, j + this.h);
                }
                this.f = true;
            }
        }
    }
    
    public void a(final View e, final int j) {
        this.e = e;
        this.j = j;
        this.requestLayout();
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        if (this.f && this.i != null && this.i.isDirty()) {
            this.invalidate();
        }
        super.dispatchDraw(canvas);
        if (this.f) {
            this.drawChild(canvas, this.e, this.getDrawingTime());
        }
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        final float y = motionEvent.getY();
        final float x = motionEvent.getX();
        int n;
        if (this.f && this.e != null && y <= this.e.getBottom() && y >= this.e.getTop() && x <= this.e.getRight() && x >= this.e.getLeft()) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            if (this.l != null) {
                this.l.recycle();
            }
            this.l = null;
            return super.dispatchTouchEvent(motionEvent);
        }
        switch (motionEvent.getActionMasked()) {
            default: {
                if (this.l != null) {
                    super.dispatchTouchEvent(this.l);
                    this.l.recycle();
                    this.l = null;
                    break;
                }
                break;
            }
            case 0: {
                this.m = x;
                this.n = y;
                this.l = MotionEvent.obtain(motionEvent);
                return true;
            }
            case 1: {
                final float n2 = this.getScrollX() - this.e.getLeft();
                final float n3 = this.getScrollY() - this.e.getTop();
                motionEvent.offsetLocation(n2, n3);
                if (this.l != null) {
                    this.l.offsetLocation(n2, n3);
                    this.e.dispatchTouchEvent(this.l);
                    this.l.recycle();
                    this.l = null;
                }
                final boolean dispatchTouchEvent = this.e.dispatchTouchEvent(motionEvent);
                this.invalidate();
                return dispatchTouchEvent;
            }
            case 2: {
                if (this.l == null) {
                    break;
                }
                final float n4 = motionEvent.getX() - this.m;
                final float n5 = motionEvent.getY() - this.n;
                if (n4 * n4 + n5 * n5 > bj.d) {
                    super.dispatchTouchEvent(this.l);
                    this.l.recycle();
                    this.l = null;
                    break;
                }
                break;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    public eb getPinnedHeaderAdapter() {
        return this.d;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.e != null) {
            final int paddingLeft = this.getPaddingLeft();
            this.e.layout(paddingLeft, this.j, paddingLeft + this.g, this.h + this.j);
            this.a(this.getFirstVisiblePosition());
        }
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.e != null) {
            this.measureChild(this.e, n, n2);
            this.g = this.e.getMeasuredWidth();
            this.h = this.e.getMeasuredHeight();
        }
    }
    
    @Override
    public void setAdapter(final ListAdapter adapter) {
        super.setAdapter(adapter);
        this.d = (eb)adapter;
    }
    
    public void setBuiltInDividerHeight(final int k) {
        this.k = k;
    }
    
    public void setPinnedHeaderViewTopMargin(final int j) {
        if (this.j != j) {
            this.j = j;
            this.requestLayout();
        }
    }
    
    public void setRedrawOnDirtyHeaderView(final View i) {
        this.i = i;
    }
}
