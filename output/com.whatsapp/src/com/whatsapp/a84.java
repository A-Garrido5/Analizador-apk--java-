// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Build$VERSION;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class a84 implements ViewTreeObserver$OnGlobalLayoutListener
{
    final CircularRevealView a;
    final gw b;
    
    a84(final gw b, final CircularRevealView a) {
        this.b = b;
        this.a = a;
    }
    
    public void onGlobalLayout() {
        final boolean i = App.I;
        Label_0038: {
            if (Build$VERSION.SDK_INT < 16) {
                this.a.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                if (!i) {
                    break Label_0038;
                }
            }
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        Label_0094: {
            if (App.ak()) {
                this.a.setAnchor(this.a.getRight() - gw.a(this.b), 0);
                if (!i) {
                    break Label_0094;
                }
            }
            this.a.setAnchor(this.a.getLeft() + gw.a(this.b), 0);
        }
        this.a.b();
    }
}
