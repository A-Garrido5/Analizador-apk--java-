// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.widget.Adapter;
import android.graphics.Canvas;
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
import android.support.v4.view.ViewCompat;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

class bp implements Runnable
{
    final /* synthetic */ VideoSegmentListView a;
    private final Interpolator b;
    private int c;
    private int d;
    private int e;
    private float f;
    private boolean g;
    
    bp(final VideoSegmentListView a) {
        this.a = a;
        this.b = AnimationUtils.loadInterpolator(a.getContext(), 2131034147);
    }
    
    private int b(final int n) {
        final int n2 = this.a.getPaddingLeft() + this.a.k;
        final int n3 = this.a.getWidth() - this.a.getPaddingRight() - this.a.k;
        final int firstVisiblePosition = this.a.getFirstVisiblePosition();
        int n4;
        if (n < firstVisiblePosition) {
            n4 = n2 + (firstVisiblePosition - n) * (this.a.j + this.a.s) - this.a.getChildAt(0).getLeft();
        }
        else {
            final int lastVisiblePosition = this.a.getLastVisiblePosition();
            if (n > lastVisiblePosition) {
                final View child = this.a.getChildAt(-1 + this.a.getChildCount());
                n4 = 0;
                if (child != null) {
                    return n3 + (lastVisiblePosition - n) * (this.a.j + this.a.s) - child.getRight();
                }
            }
            else {
                final int childCount = this.a.getChildCount();
                n4 = 0;
                if (childCount != 1) {
                    final View child2 = this.a.getChildAt(n - firstVisiblePosition);
                    if (child2.getLeft() < n2) {
                        return n2 - child2.getLeft();
                    }
                    final int right = child2.getRight();
                    n4 = 0;
                    if (right > n3) {
                        return n3 - child2.getRight();
                    }
                }
            }
        }
        return n4;
    }
    
    void a() {
        if (this.g) {
            this.g = false;
            this.a.removeCallbacks((Runnable)this);
        }
    }
    
    void a(final int c) {
        this.a();
        this.a.z.a();
        this.e = this.b(c);
        if (this.e == 0) {
            return;
        }
        this.c = c;
        this.f = 0.0f;
        this.d = (int)SystemClock.elapsedRealtime();
        this.g = true;
        ViewCompat.postOnAnimation((View)this.a, this);
    }
    
    @Override
    public void run() {
        final int firstVisiblePosition = this.a.getFirstVisiblePosition();
        Label_0105: {
            if (this.c < firstVisiblePosition || this.c > this.a.getLastVisiblePosition()) {
                break Label_0105;
            }
            final View child = this.a.getChildAt(this.c - firstVisiblePosition);
            if (child.getLeft() < this.a.getPaddingLeft() + this.a.k || child.getRight() > this.a.getWidth() - this.a.getPaddingRight() - this.a.k) {
                break Label_0105;
            }
            this.g = false;
            return;
        }
        final float n = ((int)SystemClock.elapsedRealtime() - this.d) / 300.0f;
        final int n2 = (int)(this.e * this.b.getInterpolation(Math.min(n, 1.0f)) - this.f);
        this.f += n2;
        if (this.e > 0 && this.a.getFirstVisiblePosition() == 0) {
            final int left = this.a.getChildAt(0).getLeft();
            if (left < this.a.getPaddingLeft() + this.a.k) {
                final int n3 = this.a.getPaddingLeft() + this.a.k - left;
                if (n2 > n3) {
                    this.a.a(n3, n3);
                    this.g = false;
                    return;
                }
            }
        }
        if (this.e < 0 && this.a.getLastVisiblePosition() == -1 + this.a.b) {
            final int right = this.a.getChildAt(-1 + this.a.getChildCount()).getRight();
            final int n4 = this.a.getWidth() - this.a.getPaddingRight() - this.a.k;
            if (right > n4) {
                final int n5 = n4 - right;
                if (n2 < n5) {
                    this.a.a(n5, n5);
                    this.g = false;
                    return;
                }
            }
        }
        if (this.a.a(n2, n2) || n < 1.0f) {
            ViewCompat.postOnAnimation((View)this.a, this);
        }
    }
}
