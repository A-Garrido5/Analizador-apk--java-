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

class bf extends ax
{
    final /* synthetic */ VideoSegmentEditView b;
    private int c;
    
    bf(final VideoSegmentEditView b) {
        this.b = b;
        super((View)b, 400);
    }
    
    @Override
    public void a(final float n) {
        final View child = this.b.j.getChildAt(this.b.E - this.b.j.getFirstVisiblePosition());
        if (child != null) {
            child.getLayoutParams().width = Math.round(this.c * (1.0f - n));
            child.forceLayout();
            this.b.j.requestLayout();
        }
        else {
            this.b.d();
            this.b();
        }
        this.b.j.invalidate();
    }
    
    @Override
    public void c() {
        final VideoSegmentListItemView videoSegmentListItemView = (VideoSegmentListItemView)this.b.j.getChildAt(this.b.E - this.b.j.getFirstVisiblePosition());
        if (videoSegmentListItemView != null) {
            this.c = videoSegmentListItemView.getWidth();
            return;
        }
        this.b.d();
        this.b();
    }
    
    @Override
    public void d() {
        final VideoSegmentListItemView videoSegmentListItemView = (VideoSegmentListItemView)this.b.j.getChildAt(this.b.E - this.b.j.getFirstVisiblePosition());
        if (videoSegmentListItemView != null) {
            videoSegmentListItemView.setVisibility(8);
        }
        this.b.d();
    }
}
