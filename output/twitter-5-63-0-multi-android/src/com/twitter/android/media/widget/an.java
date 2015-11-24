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
import com.twitter.library.widget.am;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.twitter.util.g;
import android.widget.ProgressBar;

class an extends ap
{
    final /* synthetic */ ProgressBar a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ VideoClipRangeSeekBar d;
    
    an(final VideoClipRangeSeekBar d, final ProgressBar a, final int b, final int c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        super(d, null);
    }
    
    @Override
    void a() {
        this.d.l.setVisibility(8);
    }
    
    @Override
    boolean a(final float n) {
        final float n2 = n + this.d.c;
        final float max = Math.max(this.d.d - this.d.e, this.d.x);
        final float a = g.a(n2, max, Math.max(this.d.d - this.d.f, max));
        this.d.c = a;
        return n2 != a;
    }
    
    @Override
    boolean a(final int n, final int n2) {
        if (this.d.t && n2 <= this.a.getBottom() && n2 >= this.a.getTop()) {
            final int left = this.a.getLeft();
            final int min = Math.min(2 * this.b, this.a.getWidth() / 2);
            final int n3 = left - this.c;
            final int n4 = left + min;
            if (n >= n3 && n <= n4) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    void b(final int n, final int n2) {
        super.b(n, n2);
        this.d.g();
    }
}
