// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

class aw implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ View a;
    final /* synthetic */ ComposerScrollView b;
    
    aw(final ComposerScrollView b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onPreDraw() {
        if (this.b.a) {
            int measuredHeight;
            if (this.a.getVisibility() == 0) {
                measuredHeight = this.a.getMeasuredHeight();
            }
            else {
                measuredHeight = 0;
            }
            if (this.b.getScrollY() < measuredHeight) {
                this.b.setScrollY(measuredHeight);
            }
        }
        return true;
    }
}
