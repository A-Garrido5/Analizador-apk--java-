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

class ba extends ax
{
    final /* synthetic */ VideoSegmentEditView b;
    private int c;
    private int d;
    private float e;
    private float f;
    private int g;
    private float h;
    
    ba(final VideoSegmentEditView b) {
        this.b = b;
        super((View)b, 150);
    }
    
    @Override
    public void a(final float n) {
        int c = this.c;
        int d = this.d;
        final View child = this.b.j.getChildAt(this.g - this.b.j.getFirstVisiblePosition());
        if (child != null) {
            d = child.getTop() + this.b.j.getTop();
            c = child.getLeft() + this.b.j.getLeft();
        }
        this.c = c;
        this.d = d;
        final float n2 = 1.0f - n;
        this.b.v.offsetTo(this.c + (int)(n2 * this.f), this.d + (int)(n2 * this.e));
        this.b.u = 1.0f + n2 * this.h;
        this.b.invalidate();
    }
    
    @Override
    public void c() {
        this.b.e.b();
        this.h = this.b.u - 1.0f;
        this.g = this.b.y;
        final View child = this.b.j.getChildAt(this.g - this.b.j.getFirstVisiblePosition());
        if (child != null) {
            this.d = child.getTop() + this.b.j.getTop();
            this.c = child.getLeft() + this.b.j.getLeft();
        }
        else {
            this.b.i.a();
            this.b();
        }
        this.f = this.b.v.left - this.c;
        this.e = this.b.v.top - this.d;
    }
    
    @Override
    public void d() {
        this.b.c();
    }
}
