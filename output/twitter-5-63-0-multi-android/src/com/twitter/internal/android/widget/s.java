// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.os.Handler;
import android.graphics.drawable.TransitionDrawable;
import android.view.MotionEvent;
import android.widget.Adapter;
import android.view.ViewParent;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ListAdapter;
import android.view.VelocityTracker;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.database.DataSetObserver;
import android.widget.AdapterView;
import android.widget.Scroller;

class s implements Runnable
{
    final /* synthetic */ HorizontalListView a;
    private final Scroller b;
    private int c;
    private int d;
    
    public s(final HorizontalListView a) {
        this.a = a;
        this.b = new Scroller(a.getContext());
    }
    
    public void a() {
        if (this.a.E == 4) {
            this.a.E = -1;
            this.a.removeCallbacks((Runnable)this);
            if (!this.b.isFinished()) {
                this.b.abortAnimation();
                this.a.invalidate();
            }
            this.a.h();
        }
    }
    
    public void a(final int n) {
        if (n == 0) {
            return;
        }
        this.a.E = 4;
        this.d = -1 + (this.a.getWidth() - this.a.getPaddingLeft() - this.a.getPaddingRight());
        this.a.removeCallbacks((Runnable)this);
        int c;
        if (n < 0) {
            c = Integer.MAX_VALUE;
        }
        else {
            c = 0;
        }
        this.c = c;
        this.b.fling(c, 0, n, 0, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.a.post((Runnable)this);
        this.a.h();
    }
    
    @Override
    public void run() {
        final int childCount = this.a.getChildCount();
        if (this.a.d == 0 || childCount == 0) {
            this.a();
            return;
        }
        final Scroller b = this.b;
        final boolean computeScrollOffset = b.computeScrollOffset();
        final int currX = b.getCurrX();
        final int n = this.c - currX;
        int n2;
        if (n > 0) {
            n2 = Math.min(this.d, n);
        }
        else {
            n2 = Math.max(-this.d, n);
        }
        final boolean b2 = this.a.c(n2);
        if (computeScrollOffset) {
            if (b2) {
                this.c = currX;
                this.a.post((Runnable)this);
            }
            else {
                int n3;
                if (n2 > 0) {
                    n3 = this.a.getOverflowLeft() + this.a.j;
                }
                else {
                    n3 = -(this.a.getOverflowRight() + this.a.j);
                }
                this.a.c(n3);
                this.a();
            }
            this.a.e();
            return;
        }
        this.a();
    }
}
