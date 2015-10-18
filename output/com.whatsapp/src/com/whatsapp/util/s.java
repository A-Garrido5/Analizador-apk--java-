// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.view.View;
import android.view.ViewTreeObserver$OnDrawListener;

final class s implements ViewTreeObserver$OnDrawListener
{
    final View a;
    final Runnable b;
    
    s(final View a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    public void onDraw() {
        this.a.getViewTreeObserver().removeOnDrawListener((ViewTreeObserver$OnDrawListener)this);
        this.b.run();
    }
}
