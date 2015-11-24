// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.animation.Animation$AnimationListener;
import android.view.ViewGroup;
import android.view.View;
import android.view.animation.Animation;
import com.twitter.library.util.f;

class vg extends f
{
    private final Animation a;
    private final boolean b;
    private View c;
    private ViewGroup d;
    
    vg(final Animation a, final boolean b) {
        a.setDuration(250L);
        a.setFillAfter(true);
        a.setAnimationListener((Animation$AnimationListener)this);
        this.a = a;
        this.b = b;
    }
    
    void a(final View c, final ViewGroup d) {
        this.c = c;
        this.d = d;
        c.startAnimation(this.a);
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        final View c = this.c;
        if (c != null) {
            if (this.b) {
                c.setVisibility(4);
                c.setEnabled(false);
            }
            else {
                c.setVisibility(0);
                c.setEnabled(true);
            }
            c.clearAnimation();
            this.c = null;
        }
        if (this.d != null) {
            if (!this.b) {
                this.d.setVisibility(4);
            }
            this.d = null;
        }
    }
}
