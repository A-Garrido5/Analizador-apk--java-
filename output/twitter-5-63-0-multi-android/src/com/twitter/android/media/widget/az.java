// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.widget.ListAdapter;
import android.view.View$MeasureSpec;
import android.view.View$OnTouchListener;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewConfiguration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.os.SystemClock;

class az implements Runnable
{
    final /* synthetic */ VideoSegmentEditView a;
    private long b;
    private long c;
    private int d;
    private float e;
    private long f;
    private int g;
    private float h;
    private boolean i;
    
    private az(final VideoSegmentEditView a) {
        this.a = a;
        this.h = 0.0f;
        this.i = false;
    }
    
    void a() {
        this.a.j.removeCallbacks((Runnable)this);
        this.i = false;
    }
    
    void a(final int g) {
        if (!this.i) {
            this.i = true;
            this.f = SystemClock.uptimeMillis();
            this.b = this.f;
            this.g = g;
            ViewCompat.postOnAnimation((View)this.a, this);
        }
    }
    
    @Override
    public void run() {
        if (this.i) {
            final int firstVisiblePosition = this.a.j.getFirstVisiblePosition();
            final int lastVisiblePosition = this.a.j.getLastVisiblePosition();
            final int count = this.a.j.getCount();
            final int width = this.a.j.getWidth();
            if (this.g == 0) {
                final View child = this.a.j.getChildAt(0);
                if (child == null) {
                    this.i = false;
                    return;
                }
                if (firstVisiblePosition == 0 && child.getLeft() == 0) {
                    this.i = false;
                    return;
                }
                final int n = this.a.o - this.a.j.getLeft();
                int n2 = 0;
                if (n >= 0) {
                    n2 = n;
                }
                this.h = this.a.D / (n2 + 1);
            }
            else {
                final View child2 = this.a.j.getChildAt(lastVisiblePosition - firstVisiblePosition);
                if (child2 == null) {
                    this.i = false;
                    return;
                }
                if (lastVisiblePosition == count - 1 && child2.getRight() <= width) {
                    this.i = false;
                    return;
                }
                final int n3 = width - this.a.o + this.a.j.getLeft();
                int n4 = 0;
                if (n3 >= 0) {
                    n4 = n3;
                }
                this.h = -this.a.D / (n4 + 1);
            }
            this.c = SystemClock.uptimeMillis();
            this.e = this.c - this.b;
            this.d = Math.round(this.h * this.e);
            this.a.j.a(this.d, this.d);
            this.b = this.c;
            this.a.a(this.a.getClosestItemPosition());
            if (this.i) {
                ViewCompat.postOnAnimation((View)this.a, this);
            }
        }
    }
}
