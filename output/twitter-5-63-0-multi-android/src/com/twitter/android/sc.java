// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class sc implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ View a;
    final /* synthetic */ SelectionFragment b;
    
    sc(final SelectionFragment b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    public void onGlobalLayout() {
        this.a.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
}
