// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;
import android.view.View;
import android.view.MotionEvent;

class cx implements Runnable
{
    final /* synthetic */ InterceptingRelativeLayout a;
    
    cx(final InterceptingRelativeLayout a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final View w = this.a.j.w();
        if (w != null) {
            this.a.g = true;
            if (this.a.i != null) {
                this.a.i.setAction(3);
                w.dispatchTouchEvent(this.a.i);
                this.a.i = null;
            }
            this.a.h = false;
        }
    }
}
