// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.annotation.TargetApi;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.os.Looper;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Handler;
import android.graphics.Rect;
import android.support.v4.widget.ViewDragHelper;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.support.v4.widget.ViewDragHelper$Callback;

class ai extends ViewDragHelper$Callback
{
    final /* synthetic */ SlidingUpPanelLayout a;
    
    private ai(final SlidingUpPanelLayout a) {
        this.a = a;
    }
    
    private int a(final float n) {
        int n2 = 2;
        if (n != 0.0f && Math.abs(n) > ViewConfiguration.get(this.a.getContext()).getScaledMinimumFlingVelocity()) {
            if (n < 0.0f) {
                if (this.a.l <= 0.75f) {
                    n2 = 4;
                }
            }
            else if (this.a.l >= 0.25f) {
                n2 = 0;
            }
        }
        else if (this.a.l < 0.0f) {
            n2 = 4;
        }
        else if (this.a.l < 0.0f || this.a.l > 0.5f) {
            if (this.a.l > 0.5f && this.a.l <= 1.0f) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
        }
        if (n2 == this.a.o || (n2 & this.a.p) != 0x0 || n2 == 0) {
            return n2;
        }
        float n3;
        if (n == 0.0f) {
            if (n2 > this.a.o) {
                n3 = -1.0f;
            }
            else {
                n3 = 1.0f;
            }
        }
        else {
            n3 = n;
        }
        return this.a.b(n3, n2);
    }
    
    @Override
    public int clampViewPositionVertical(final View view, final int n, final int n2) {
        return Math.max(n, this.a.getPaddingTop());
    }
    
    @Override
    public int getViewVerticalDragRange(final View view) {
        return this.a.getMeasuredHeight();
    }
    
    @Override
    public void onViewCaptured(final View view, final int n) {
        this.a.f();
    }
    
    @Override
    public void onViewDragStateChanged(final int n) {
        if (this.a.t.getViewDragState() == 0) {
            this.a.e();
            if (this.a.l < 0.0f) {
                this.a.a(this.a.k, 4);
            }
            else {
                if (this.a.l == 0.0f) {
                    this.a.a(this.a.k, 2);
                    return;
                }
                if (this.a.l == 1.0f) {
                    this.a.a(this.a.k, 1);
                    return;
                }
                if (this.a.l > 1.0f) {
                    this.a.a(this.a.k, 0);
                }
            }
        }
    }
    
    @Override
    public void onViewPositionChanged(final View view, final int n, final int n2, final int n3, final int n4) {
        if (n4 != 0) {
            if (this.a.G != null) {
                this.a.k.dispatchTouchEvent(this.a.G);
                this.a.G.recycle();
                this.a.G = null;
            }
            this.a.d(n2);
            this.a.invalidate();
        }
    }
    
    @Override
    public void onViewReleased(final View view, final float n, final float n2) {
        this.a.o = this.a(n2);
        int n3 = 0;
        switch (this.a.o) {
            default: {
                n3 = this.a.getMeasuredHeight();
                break;
            }
            case 0: {
                n3 = this.a.getMeasuredHeight() - this.a.getPaddingBottom();
                break;
            }
            case 1: {
                n3 = this.a.getMeasuredHeight() - this.a.getPaddingBottom() - this.a.g;
                break;
            }
            case 2: {
                n3 = this.a.getMeasuredHeight() - this.a.getPaddingBottom() - this.a.n;
                break;
            }
            case 4: {
                n3 = this.a.getPaddingTop();
                break;
            }
        }
        this.a.t.settleCapturedViewAt(view.getLeft(), n3);
        this.a.invalidate();
    }
    
    @Override
    public boolean tryCaptureView(final View view, final int n) {
        return !this.a.q && ((SlidingUpPanelLayout$LayoutParams)view.getLayoutParams()).a;
    }
}
