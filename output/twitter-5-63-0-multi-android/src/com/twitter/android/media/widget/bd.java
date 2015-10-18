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

class bd extends ax
{
    final /* synthetic */ VideoSegmentEditView b;
    
    bd(final VideoSegmentEditView b) {
        this.b = b;
        super((View)b, 100, 2131034147);
    }
    
    @Override
    public void a(final float n) {
        this.b.u = 1.0f + 0.2f * n;
        this.b.invalidate();
    }
}
