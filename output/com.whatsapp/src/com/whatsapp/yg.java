// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class yg implements ViewTreeObserver$OnGlobalLayoutListener
{
    final ChatInfoLayout a;
    
    yg(final ChatInfoLayout a) {
        this.a = a;
    }
    
    public void onGlobalLayout() {
        ChatInfoLayout.c(this.a).getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        ChatInfoLayout.b(this.a);
    }
}
