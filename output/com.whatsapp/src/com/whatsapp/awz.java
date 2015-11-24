// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Transformation;
import android.view.animation.Interpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.View;
import com.whatsapp.util.b3;

class awz extends b3
{
    final View h;
    final ahh i;
    final boolean j;
    final View k;
    private boolean l;
    final View m;
    
    public awz(final ahh i, final View m, final View h, final View k, final boolean j) {
        this.i = i;
        this.m = m;
        this.h = h;
        this.k = k;
        this.j = j;
        super(0.0f, 360.0f, m.getWidth() / 2, m.getHeight() / 2, 200.0f * vc.b().b, false);
        this.setDuration(1000L);
        this.setInterpolator((Interpolator)new AccelerateDecelerateInterpolator());
    }
    
    @Override
    protected void applyTransformation(final float n, final Transformation transformation) {
        super.applyTransformation(n, transformation);
        final float b = this.b;
        final int n2 = (int)(b + n * (this.g - b)) % 360;
        if (n2 > 90 && n2 < 270) {
            if (this.l) {
                return;
            }
            this.l = true;
            this.h.setVisibility(4);
            this.k.setVisibility(4);
            if (!App.I) {
                return;
            }
        }
        if (this.l) {
            this.l = false;
            this.h.setVisibility(0);
            if (this.j) {
                this.k.setVisibility(0);
            }
        }
    }
}
