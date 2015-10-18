// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles.animation;

import android.widget.ImageView;
import android.animation.AnimatorSet;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.PathMeasure;
import android.animation.Animator;
import android.view.View;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class FlyThroughSetAnimationView extends FrameLayout
{
    public FlyThroughSetAnimationView(final Context context) {
        this(context, null, 0);
    }
    
    public FlyThroughSetAnimationView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public FlyThroughSetAnimationView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    private Animator a(final Path path, final long duration, final TimeInterpolator interpolator, final View view) {
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        final float[] array = { 0.0f, 0.0f };
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        ofFloat.setDuration(duration);
        ofFloat.setInterpolator(interpolator);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new f(this, pathMeasure, array, view));
        ofFloat.addListener((Animator$AnimatorListener)new g(this, view));
        return (Animator)ofFloat;
    }
    
    public void a(final d d) {
        final AnimatorSet set = new AnimatorSet();
        for (int i = 0; i < d.b(); ++i) {
            final a c = d.c();
            final Path a = c.a();
            final ImageView a2 = c.a(this.getContext());
            a2.setY((float)this.getHeight());
            this.addView((View)a2);
            set.play(this.a(a, c.b(), c.d(), (View)a2)).after(c.c());
        }
        set.addListener((Animator$AnimatorListener)new e(this));
        set.start();
    }
}
