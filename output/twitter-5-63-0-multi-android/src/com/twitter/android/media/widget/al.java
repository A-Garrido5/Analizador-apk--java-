// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.view.View$MeasureSpec;
import com.twitter.library.view.x;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.view.TickMarksView;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.twitter.util.g;
import android.widget.ProgressBar;

class al extends ap
{
    final /* synthetic */ ProgressBar a;
    final /* synthetic */ int b;
    final /* synthetic */ VideoClipRangeSeekBar c;
    
    al(final VideoClipRangeSeekBar c, final ProgressBar a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
        super(c, null);
    }
    
    @Override
    void a() {
        this.c.d();
    }
    
    @Override
    boolean a(final float n) {
        final float a = g.a(n, this.c.x - this.c.c, this.c.y - this.c.d);
        VideoClipRangeSeekBar.a(this.c, a);
        VideoClipRangeSeekBar.b(this.c, a);
        if (this.c.v && (this.c.c == this.c.x || this.c.d == this.c.y)) {
            this.c.C = System.currentTimeMillis();
            this.c.getHandler().postDelayed((Runnable)new am(this), 100L);
        }
        return a != n;
    }
    
    @Override
    boolean a(final int n, final int n2) {
        boolean b = true;
        if (n2 > this.a.getBottom() || n2 < this.a.getTop()) {
            b = false;
        }
        else if (this.c.t && Math.abs(n - (this.a.getLeft() + this.a.getRight()) / 2) > g.a(this.a.getWidth() - 2 * this.b, this.c.h, 2 * this.c.h) / 2) {
            return false;
        }
        return b;
    }
    
    @Override
    void b() {
        if (this.c.u) {
            this.c.h();
        }
    }
}
