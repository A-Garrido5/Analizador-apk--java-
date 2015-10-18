// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import com.twitter.util.e;
import com.twitter.android.util.l;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.graphics.drawable.LayerDrawable;
import android.view.animation.Transformation;
import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;

class c extends Animation implements Animation$AnimationListener
{
    final /* synthetic */ CameraShutterBar a;
    private final Drawable[] b;
    private final TransitionDrawable c;
    
    c(final CameraShutterBar a, final TransitionDrawable transitionDrawable, final TransitionDrawable c) {
        this.a = a;
        this.b = new Drawable[] { transitionDrawable.getDrawable(0), c.getDrawable(0) };
        this.c = c;
        this.setDuration(250L);
        this.setAnimationListener((Animation$AnimationListener)this);
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        final int alpha = (int)(0.5f + 255.0f * n);
        this.b[0].setAlpha(255 - alpha);
        this.b[1].setAlpha(alpha);
        this.a.invalidate();
    }
    
    public void onAnimationEnd(final Animation animation) {
        this.b[1].setAlpha(255);
        this.a.setBackgroundDrawable((Drawable)this.c);
        this.a.m = null;
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
        this.a.setBackgroundDrawable((Drawable)new LayerDrawable(this.b));
        this.a.m = this;
    }
}
