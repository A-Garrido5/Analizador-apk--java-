// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.View;
import android.support.v4.widget.ViewDragHelper$Callback;

class k extends ViewDragHelper$Callback
{
    final /* synthetic */ HiddenDrawerLayout a;
    
    private k(final HiddenDrawerLayout a) {
        this.a = a;
    }
    
    @Override
    public int clampViewPositionHorizontal(final View view, final int n, final int n2) {
        return Math.max(0, Math.min(n, this.a.c.getWidth()));
    }
    
    @Override
    public int getViewHorizontalDragRange(final View view) {
        return this.a.c.getWidth();
    }
    
    @Override
    public void onViewCaptured(final View view, final int n) {
        if (this.a.i == 4) {
            this.a.b();
        }
        this.a.i = 5;
    }
    
    @Override
    public void onViewDragStateChanged(final int n) {
        if (this.a.h.getViewDragState() == 0) {
            if (this.a.d.getLeft() == 0) {
                this.a.c();
                this.a.i = 4;
                if (this.a.e != null) {
                    this.a.e.a();
                }
            }
            else {
                this.a.i = 3;
                if (this.a.e != null) {
                    this.a.e.b();
                }
            }
        }
    }
    
    @Override
    public void onViewPositionChanged(final View view, final int n, final int n2, final int n3, final int n4) {
        final RectLayoutParams rectLayoutParams = (RectLayoutParams)this.a.d.getLayoutParams();
        if (rectLayoutParams != null) {
            rectLayoutParams.a += n3;
            rectLayoutParams.c += n3;
        }
        this.a.e();
        this.a.invalidate();
    }
    
    @Override
    public void onViewReleased(final View view, final float n, final float n2) {
        if (n > 0.0f || (n == 0.0f && view.getLeft() >= this.a.c.getWidth() / 2)) {
            this.a.i = 1;
            this.a.h.settleCapturedViewAt(this.a.c.getWidth(), 0);
        }
        else {
            this.a.i = 2;
            this.a.h.settleCapturedViewAt(0, 0);
        }
        this.a.invalidate();
    }
    
    @Override
    public boolean tryCaptureView(final View view, final int n) {
        return (this.a.k || this.a.j) && view == this.a.d;
    }
}
