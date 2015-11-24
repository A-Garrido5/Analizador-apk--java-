// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.animation.Animator;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class bd implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ Animator a;
    final /* synthetic */ FloatingActionButtonLayout b;
    
    bd(final FloatingActionButtonLayout b, final Animator a) {
        this.b = b;
        this.a = a;
    }
    
    public void onGlobalLayout() {
        this.b.a(true, true);
        this.a.setupEndValues();
        this.b.a(true, false);
        this.a.start();
        this.b.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
}
