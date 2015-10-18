// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.view.View$MeasureSpec;
import com.twitter.library.view.x;
import android.view.animation.AnimationUtils;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import com.twitter.library.widget.am;
import android.widget.ProgressBar;
import android.widget.FrameLayout;
import com.twitter.library.view.TickMarksView;
import android.view.animation.Transformation;
import android.view.animation.Interpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;

class ar extends Animation implements Animation$AnimationListener
{
    final /* synthetic */ VideoClipRangeSeekBar a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    
    ar(final VideoClipRangeSeekBar a, final float b, final float c, final float d, final float e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.setDuration(250L);
        this.setInterpolator((Interpolator)new AccelerateDecelerateInterpolator());
        this.setAnimationListener((Animation$AnimationListener)this);
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        final float n2 = 1.0f - n;
        float n3;
        if (this.a.v) {
            n3 = n;
        }
        else {
            n3 = n2;
        }
        final int textAlpha = (int)(n3 * 255.0f);
        this.a.k.a(1, textAlpha);
        this.a.m.setTextAlpha(textAlpha);
        float n4;
        if (this.a.v) {
            n4 = n2;
        }
        else {
            n4 = n;
        }
        this.a.setPadding((int)(n4 * this.a.z), 0, (int)(n4 * this.a.A), 0);
        this.a.x = n * this.d + n2 * this.b;
        this.a.y = n * this.e + n2 * this.c;
        this.a.m.a((int)(this.a.x * this.a.w), (int)(this.a.y * this.a.w));
        this.a.c();
        this.a.a(this.a.getLeft(), this.a.getRight());
    }
    
    public void onAnimationEnd(final Animation animation) {
        this.a.D = false;
        this.a.x = this.d;
        this.a.y = this.e;
        this.a.m.a(this.a.v);
        this.a.k.a(0, !this.a.v);
        this.a.k.a(1, this.a.v);
        this.a.k.a(1, 255);
        if (this.a.s != null) {
            this.a.s.a(this.a.v);
        }
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
        this.a.k.a(0, true);
        this.a.k.a(1, true);
        final boolean g = this.a.v;
        int textAlpha = 0;
        if (!g) {
            textAlpha = 255;
        }
        this.a.k.a(1, textAlpha);
        this.a.m.a(true);
        this.a.m.setTextAlpha(textAlpha);
        final TickMarksView n = this.a.m;
        int n2;
        if (this.a.v) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        n.a(n2);
    }
}
