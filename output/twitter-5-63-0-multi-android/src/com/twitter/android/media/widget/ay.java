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
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewConfiguration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;

class ay implements Runnable
{
    final /* synthetic */ VideoSegmentEditView a;
    
    private ay(final VideoSegmentEditView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.k != null && this.a.B == this.a.A) {
            if (this.a.B != this.a.z) {
                this.a.e(this.a.B);
            }
            if (this.a.k.c(this.a.B) && this.a.d(this.a.B)) {
                this.a.v.offsetTo(this.a.o - this.a.w, this.a.q - this.a.x);
            }
        }
    }
}
