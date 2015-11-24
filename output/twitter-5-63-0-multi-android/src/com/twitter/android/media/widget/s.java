// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

class s implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ View a;
    final /* synthetic */ FilterFilmstripView b;
    
    s(final FilterFilmstripView b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onPreDraw() {
        final int n = this.a.getMeasuredWidth() - this.b.getMeasuredWidth();
        if (n < 0) {
            this.b.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        }
        this.b.fullScroll(66);
        return this.b.getScrollX() == n;
    }
}
