// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class ar7 implements ViewTreeObserver$OnGlobalLayoutListener
{
    final ChatInfoLayout a;
    
    ar7(final ChatInfoLayout a) {
        this.a = a;
    }
    
    public void onGlobalLayout() {
        ChatInfoLayout.c(this.a).getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        if (ChatInfoLayout.a(this.a)) {
            return;
        }
        final int scrollPos = (int)(0.5625f * this.a.getMeasuredWidth()) - this.a.getMeasuredWidth();
        ChatInfoLayout.c(this.a).setSelectionFromTop(0, scrollPos);
        this.a.setScrollPos(scrollPos);
    }
}
