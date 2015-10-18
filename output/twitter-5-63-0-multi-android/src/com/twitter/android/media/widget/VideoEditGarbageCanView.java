// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import com.twitter.android.media.camera.z;
import android.graphics.Rect;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.OvershootInterpolator;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public class VideoEditGarbageCanView extends FrameLayout
{
    private final View a;
    private final View b;
    private final View c;
    private final View d;
    private final int e;
    private int f;
    
    public VideoEditGarbageCanView(final Context context) {
        this(context, null, 0);
    }
    
    public VideoEditGarbageCanView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public VideoEditGarbageCanView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.f = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.VideoEditGarbageCanView, n, 0);
        try {
            this.e = obtainStyledAttributes.getDimensionPixelSize(0, 0) / 2;
            obtainStyledAttributes.recycle();
            inflate(context, 2130969198, (ViewGroup)this);
            this.d = this.findViewById(2131887348);
            this.a = this.findViewById(2131887349);
            this.b = this.a.findViewById(2131887350);
            this.c = this.a.findViewById(2131887351);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    private void a(final int f) {
        if (this.f != f) {
            this.a.setVisibility(0);
            Object o;
            Object o2;
            Animation animation;
            int n;
            if (f == 2) {
                final OvershootInterpolator overshootInterpolator = new OvershootInterpolator(4.0f);
                final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -10.0f, 1, 0.0f, 1, 1.0f);
                ((Animation)rotateAnimation).setInterpolator((Interpolator)overshootInterpolator);
                final RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
                ((Animation)rotateAnimation2).setInterpolator((Interpolator)overshootInterpolator);
                final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.75f);
                this.d.setVisibility(0);
                o = alphaAnimation;
                o2 = rotateAnimation2;
                animation = (Animation)rotateAnimation;
                n = 200;
            }
            else if (this.f == 2) {
                final RotateAnimation rotateAnimation3 = new RotateAnimation(-10.0f, 0.0f, 1, 0.0f, 1, 1.0f);
                final RotateAnimation rotateAnimation4 = new RotateAnimation(10.0f, 0.0f, 0.0f, 0.0f);
                Object o3;
                Animation animation2;
                if (f == 0) {
                    final AnimationSet set = new AnimationSet(true);
                    set.addAnimation((Animation)rotateAnimation3);
                    set.addAnimation((Animation)new AlphaAnimation(1.0f, 0.0f));
                    o3 = new AnimationSet(true);
                    ((AnimationSet)o3).addAnimation((Animation)rotateAnimation4);
                    ((AnimationSet)o3).addAnimation((Animation)new AlphaAnimation(1.0f, 0.0f));
                    animation2 = (Animation)set;
                }
                else {
                    animation2 = (Animation)rotateAnimation3;
                    o3 = rotateAnimation4;
                }
                final AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.75f, 0.0f);
                o2 = o3;
                n = 200;
                animation = animation2;
                o = alphaAnimation2;
            }
            else {
                AlphaAnimation alphaAnimation3;
                AlphaAnimation alphaAnimation4;
                if (f == 0) {
                    alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation4 = new AlphaAnimation(1.0f, 0.0f);
                }
                else {
                    alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation4 = new AlphaAnimation(0.0f, 1.0f);
                }
                o2 = alphaAnimation4;
                n = 200;
                animation = (Animation)alphaAnimation3;
                o = null;
            }
            this.f = f;
            animation.setFillAfter(true);
            animation.setDuration((long)n);
            if (f != 2) {
                animation.setAnimationListener((Animation$AnimationListener)new as(this));
            }
            this.b.startAnimation(animation);
            ((Animation)o2).setFillAfter(true);
            ((Animation)o2).setDuration((long)n);
            this.c.startAnimation((Animation)o2);
            if (o != null) {
                ((Animation)o).setDuration((long)n);
                ((Animation)o).setFillAfter(true);
                this.d.setAlpha(0.75f);
                this.d.startAnimation((Animation)o);
            }
        }
    }
    
    public void a() {
        this.a(0);
    }
    
    public void a(final View view, final Rect rect) {
        int top = rect.top;
        for (Object o = this; o != view; o = ((View)o).getParent()) {
            top -= ((View)o).getTop();
        }
        if (top > this.getHeight()) {
            return;
        }
        int n;
        if (top < this.a.getBottom()) {
            n = 2;
        }
        else {
            n = 1;
        }
        this.a(n);
    }
    
    public void b() {
        this.f = 0;
        this.a.setVisibility(4);
        this.d.setAlpha(0.0f);
        this.d.setVisibility(8);
    }
    
    public int getGarbageCanState() {
        return this.f;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.a.getVisibility() == 8 || this.getResources().getConfiguration().orientation == 1) {
            return;
        }
        int e;
        if (z.a(this.getContext()) < 180) {
            e = -this.e;
        }
        else {
            e = this.e;
        }
        this.a.layout(e + this.a.getLeft(), this.a.getTop(), e + this.a.getRight(), this.a.getBottom());
    }
}
