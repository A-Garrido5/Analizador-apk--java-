// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.util.g;
import com.twitter.util.t;
import android.view.ViewGroup$LayoutParams;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AlphaAnimation;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import com.twitter.android.pa;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.annotation.SuppressLint;
import android.view.VelocityTracker;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.widget.Scroller;

class bl implements Runnable
{
    final /* synthetic */ DraggableDrawerLayout a;
    
    bl(final DraggableDrawerLayout a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.p = false;
        this.a.w.clearAnimation();
        if (this.a.A != null) {
            this.a.A.clearAnimation();
        }
        this.a.e();
        if (this.a.v != null && this.a.D == 2) {
            final Scroller e = this.a.I;
            float n = 0.0f;
            if (e != null) {
                final boolean computeScrollOffset = this.a.I.computeScrollOffset();
                n = 0.0f;
                if (computeScrollOffset) {
                    final boolean finished = this.a.I.isFinished();
                    n = 0.0f;
                    if (!finished) {
                        n = -this.a.I.getCurrVelocity();
                    }
                    this.a.I.abortAnimation();
                }
            }
            if (Math.abs(n) > this.a.b) {
                this.a.v.a(n);
            }
        }
    }
}
