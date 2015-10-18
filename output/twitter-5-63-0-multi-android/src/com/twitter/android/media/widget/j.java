// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.animation.Transformation;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.animation.Animation;

class j extends Animation
{
    final /* synthetic */ boolean a;
    final /* synthetic */ ViewGroup$MarginLayoutParams b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ boolean g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;
    final /* synthetic */ View j;
    final /* synthetic */ FilterFilmstripView k;
    
    j(final FilterFilmstripView k, final boolean a, final ViewGroup$MarginLayoutParams b, final int c, final int d, final int e, final int f, final boolean g, final int h, final int i, final View j) {
        this.k = k;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        float n2;
        if (this.a) {
            n2 = n;
        }
        else {
            n2 = 1.0f - n;
        }
        this.b.width = Math.round(n2 * this.c);
        this.b.leftMargin = Math.round(n2 * this.d);
        this.b.rightMargin = Math.round(n2 * this.e);
        if (this.f != 0 && !this.g) {
            this.k.scrollTo(Math.round(this.h + n * this.i), 0);
        }
        this.j.requestLayout();
    }
    
    public boolean willChangeBounds() {
        return true;
    }
}
