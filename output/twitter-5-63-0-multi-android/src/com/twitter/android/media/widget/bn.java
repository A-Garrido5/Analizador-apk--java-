// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.widget.Adapter;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.database.DataSetObserver;
import android.widget.ListAdapter;
import android.widget.AdapterView;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.widget.Scroller;

class bn implements Runnable
{
    final /* synthetic */ VideoSegmentListView a;
    private final Scroller b;
    private int c;
    private int d;
    
    bn(final VideoSegmentListView a) {
        this.a = a;
        this.b = new Scroller(a.getContext());
    }
    
    void a() {
        if (this.a.d == 3) {
            this.a.d = 0;
            this.a.removeCallbacks((Runnable)this);
            if (!this.b.isFinished()) {
                this.b.abortAnimation();
                this.a.invalidate();
            }
        }
    }
    
    void a(final int n) {
        this.a.B.a();
        this.a();
        if (n == 0) {
            return;
        }
        this.a.d = 3;
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
        ViewCompat.postOnAnimation((View)this.a, this);
    }
    
    @Override
    public void run() {
        final int childCount = this.a.getChildCount();
        if (this.a.b == 0 || childCount == 0) {
            this.a();
        }
        else {
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
            final boolean a = this.a.a(n2, n2);
            if (!computeScrollOffset) {
                this.a();
                return;
            }
            if (a) {
                this.c = currX;
                ViewCompat.postOnAnimation((View)this.a, this);
                return;
            }
            int e;
            if (n2 > 0) {
                e = this.a.getOverflowLeft();
            }
            else {
                e = -this.a.getOverflowRight();
            }
            if (this.a.a(e, e)) {
                ViewCompat.postOnAnimation((View)this.a, this);
            }
        }
    }
}
