// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.annotation.SuppressLint;
import android.os.Build$VERSION;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class q_ implements ViewTreeObserver$OnGlobalLayoutListener
{
    final PagerSlidingTabStrip a;
    
    q_(final PagerSlidingTabStrip a) {
        this.a = a;
    }
    
    @SuppressLint({ "NewApi" })
    public void onGlobalLayout() {
        Label_0036: {
            if (Build$VERSION.SDK_INT < 16) {
                this.a.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                if (!App.I) {
                    break Label_0036;
                }
            }
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        PagerSlidingTabStrip.a(this.a, PagerSlidingTabStrip.a(this.a).getCurrentItem());
        PagerSlidingTabStrip.a(this.a, PagerSlidingTabStrip.b(this.a), 0);
    }
}
