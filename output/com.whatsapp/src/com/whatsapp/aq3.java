// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.HorizontalScrollView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class aq3 implements ViewTreeObserver$OnGlobalLayoutListener
{
    final HorizontalScrollView a;
    final ChatInfoActivity b;
    
    aq3(final ChatInfoActivity b, final HorizontalScrollView a) {
        this.b = b;
        this.a = a;
    }
    
    public void onGlobalLayout() {
        this.a.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        this.a.fullScroll(66);
    }
}
