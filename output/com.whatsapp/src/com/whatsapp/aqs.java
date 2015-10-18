// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class aqs implements ViewTreeObserver$OnGlobalLayoutListener
{
    final MessageDetailsActivity a;
    
    aqs(final MessageDetailsActivity a) {
        this.a = a;
    }
    
    public void onGlobalLayout() {
        MessageDetailsActivity.f(this.a).getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        MessageDetailsActivity.f(this.a).setSelectionFromTop(1, 3 * this.a.getResources().getDimensionPixelSize(2131361793));
    }
}
