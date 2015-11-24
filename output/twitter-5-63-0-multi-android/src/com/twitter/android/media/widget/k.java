// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.animation.Animation;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import com.twitter.library.util.f;

class k extends f
{
    final /* synthetic */ View a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ViewTreeObserver$OnPreDrawListener c;
    final /* synthetic */ FilterFilmstripView d;
    
    k(final FilterFilmstripView d, final View a, final boolean b, final ViewTreeObserver$OnPreDrawListener c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        if (this.c != null) {
            this.d.getViewTreeObserver().removeOnPreDrawListener(this.c);
        }
    }
    
    @Override
    public void onAnimationStart(final Animation animation) {
        this.a.setVisibility(0);
    }
}
