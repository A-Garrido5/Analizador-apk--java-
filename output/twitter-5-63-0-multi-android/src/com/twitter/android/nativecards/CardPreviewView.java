// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.view.View$OnClickListener;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.view.View;
import android.widget.FrameLayout;

public class CardPreviewView extends FrameLayout
{
    private c a;
    private View b;
    private View c;
    private View d;
    private ProgressBar e;
    private Animation f;
    private Animation g;
    
    public CardPreviewView(final Context context) {
        this(context, null);
    }
    
    public CardPreviewView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CardPreviewView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.f = AnimationUtils.loadAnimation(context, 2131034166);
        (this.g = AnimationUtils.loadAnimation(context, 2131034167)).setAnimationListener((Animation$AnimationListener)new g(this));
    }
    
    public void a() {
        if (this.d != null) {
            this.d.setAnimation((Animation)null);
            this.removeView(this.d);
            this.d = null;
        }
        if (this.c != null) {
            this.d = this.c;
            this.c = null;
            this.d.startAnimation(this.g);
            this.b.setVisibility(8);
        }
    }
    
    public void a(final View c) {
        if (c != null) {
            this.f.reset();
            this.addView(this.c = c);
            this.b.bringToFront();
            this.b.setVisibility(0);
            this.c.startAnimation(this.f);
            this.setVisibility(0);
        }
    }
    
    public void b() {
        if (this.e != null) {
            this.e.setVisibility(0);
        }
    }
    
    public void c() {
        if (this.e != null) {
            this.e.setVisibility(8);
        }
    }
    
    public void onFinishInflate() {
        (this.b = this.findViewById(2131886567)).setOnClickListener((View$OnClickListener)new h(this));
    }
    
    public void setController(final c a) {
        this.a = a;
    }
    
    public void setProgressBar(final ProgressBar e) {
        this.e = e;
    }
}
