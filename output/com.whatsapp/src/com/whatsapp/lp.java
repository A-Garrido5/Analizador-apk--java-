// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Build$VERSION;
import com.whatsapp.observablescrollview.ObservableListView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

final class lp implements ViewTreeObserver$OnGlobalLayoutListener
{
    final int a;
    final ObservableListView b;
    
    lp(final ObservableListView b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public void onGlobalLayout() {
        Label_0036: {
            if (Build$VERSION.SDK_INT < 16) {
                this.b.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                if (!App.I) {
                    break Label_0036;
                }
            }
            this.b.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        this.b.setSelection(this.a);
    }
}
