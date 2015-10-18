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

class bb extends ax
{
    final /* synthetic */ VideoSegmentEditView b;
    
    bb(final VideoSegmentEditView b) {
        this.b = b;
        super((View)b, 400);
    }
    
    @Override
    public void a(final float n) {
        this.b.u = 1.2f * (1.0f - n);
        this.b.invalidate();
    }
    
    @Override
    public void d() {
        this.b.u = 1.0f;
        this.b.y = -1;
        this.b.t = null;
        this.b.e();
        this.b.invalidate();
    }
}
