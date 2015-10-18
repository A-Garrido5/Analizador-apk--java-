// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

final class ct implements ViewTreeObserver$OnGlobalLayoutListener
{
    final View a;
    final Runnable b;
    
    ct(final View a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    public void onGlobalLayout() {
        this.a.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        this.b.run();
    }
}
