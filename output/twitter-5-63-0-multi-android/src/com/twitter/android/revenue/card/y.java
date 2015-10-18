// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import android.annotation.TargetApi;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.os.Build$VERSION;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class y implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ w a;
    
    y(final w a) {
        this.a = a;
    }
    
    @TargetApi(16)
    public void onGlobalLayout() {
        if (Build$VERSION.SDK_INT >= 16) {
            this.a.m.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        else {
            this.a.m.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        final int height = this.a.m.getHeight();
        this.a.c.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(height, height));
    }
}
