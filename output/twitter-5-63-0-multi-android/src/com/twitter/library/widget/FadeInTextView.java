// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.ViewGroup$LayoutParams;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View;
import android.os.Handler;
import android.content.res.TypedArray;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;

public class FadeInTextView extends RelativeLayout
{
    private String[] a;
    private int b;
    private boolean c;
    private int d;
    private float e;
    private int f;
    private int g;
    private u h;
    
    public FadeInTextView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context, set, 0);
    }
    
    public FadeInTextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(context, set, n);
    }
    
    private int a(final float n) {
        return (int)(n * this.g);
    }
    
    private void a() {
        if (this.c || this.a == null || this.a.length == 0) {
            return;
        }
        this.c = true;
        this.b %= this.a.length;
        final AnimationSet set = new AnimationSet(false);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        ((Animation)alphaAnimation).setInterpolator((Interpolator)new LinearInterpolator());
        set.addAnimation((Animation)alphaAnimation);
        final TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 50.0f, 0.0f);
        ((Animation)translateAnimation).setInterpolator((Interpolator)new DecelerateInterpolator());
        set.addAnimation((Animation)translateAnimation);
        set.setDuration((long)this.a(0.16666667f));
        set.setAnimationListener((Animation$AnimationListener)new r(this));
        this.a((Animation)set, this.a(0.16666667f));
    }
    
    private void a(final Context context, final AttributeSet set, final int n) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, li.FadeInTextView, n, 0);
            this.d = obtainStyledAttributes.getColor(li.FadeInTextView_android_textColor, kx.black);
            this.e = obtainStyledAttributes.getDimension(li.FadeInTextView_android_textSize, 15.0f);
            this.f = obtainStyledAttributes.getInt(li.FadeInTextView_android_duration, 0);
            final int resourceId = obtainStyledAttributes.getResourceId(li.FadeInTextView_texts, 1000);
            String[] stringArray;
            if (resourceId != 0) {
                stringArray = this.getResources().getStringArray(resourceId);
            }
            else {
                stringArray = new String[0];
            }
            this.setTexts(stringArray);
            obtainStyledAttributes.recycle();
        }
    }
    
    private void a(final Animation animation, final long n) {
        final Handler handler = this.getHandler();
        if (!this.c || handler == null) {
            this.c = false;
            return;
        }
        handler.postDelayed((Runnable)new s(this, animation), n);
    }
    
    private void b() {
        if (!this.c) {
            return;
        }
        this.c = false;
        this.clearAnimation();
    }
    
    private void c() {
        final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        ((Animation)alphaAnimation).setDuration((long)this.a(0.16666667f));
        ((Animation)alphaAnimation).setInterpolator((Interpolator)new LinearInterpolator());
        ((Animation)alphaAnimation).setAnimationListener((Animation$AnimationListener)new t(this));
        this.a((Animation)alphaAnimation, this.a(0.5f));
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a();
    }
    
    protected void onDetachedFromWindow() {
        this.b();
        super.onDetachedFromWindow();
    }
    
    protected void onVisibilityChanged(final View view, final int n) {
        super.onVisibilityChanged(view, n);
        if (n == 8 || n == 4) {
            this.b();
            return;
        }
        this.a();
    }
    
    public void setCycleListener(final u h) {
        this.h = h;
    }
    
    public void setTexts(final String[] a) {
        this.a = a;
        this.g = this.f / this.a.length;
        this.removeAllViews();
        for (final String text : a) {
            final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            final TypefacesTextView typefacesTextView = new TypefacesTextView(this.getContext());
            typefacesTextView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            typefacesTextView.setVisibility(4);
            typefacesTextView.setTextColor(this.d);
            typefacesTextView.setTextSize(0, this.e);
            typefacesTextView.setGravity(1);
            typefacesTextView.setText((CharSequence)text);
            this.addView((View)typefacesTextView);
        }
    }
    
    public void setVisibility(final int visibility) {
        if (this.getVisibility() != visibility) {
            super.setVisibility(visibility);
            if (visibility != 8 && visibility != 4) {
                this.a();
                return;
            }
            this.b();
        }
    }
}
