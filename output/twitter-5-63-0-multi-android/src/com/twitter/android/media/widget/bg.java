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
import android.widget.RelativeLayout;
import android.graphics.drawable.Drawable;
import android.view.View;

class bg extends ax
{
    final /* synthetic */ VideoSegmentEditView b;
    
    bg(final VideoSegmentEditView b) {
        this.b = b;
        super((View)b, 150, 2131034140);
    }
    
    @Override
    public void a(final float n) {
        if (this.b.j.getIndicatorDrawable() != null) {
            this.b.j.getIndicatorDrawable().setAlpha(255 - (int)(255.0f * n));
            this.b.j.c();
        }
    }
    
    @Override
    public void d() {
        this.b.d();
        final Drawable indicatorDrawable = this.b.j.getIndicatorDrawable();
        if (indicatorDrawable != null) {
            indicatorDrawable.setAlpha(255);
        }
    }
}
