// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

final class g implements ViewTreeObserver$OnPreDrawListener
{
    final View a;
    final Runnable b;
    
    g(final View a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    public boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        this.b.run();
        return true;
    }
}
