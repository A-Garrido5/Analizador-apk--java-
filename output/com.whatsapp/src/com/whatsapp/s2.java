// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.widget.TextView;
import android.view.ViewTreeObserver$OnPreDrawListener;

class s2 implements ViewTreeObserver$OnPreDrawListener
{
    final TextView a;
    final ps b;
    final View c;
    
    s2(final ps b, final View c, final TextView a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public boolean onPreDraw() {
        final boolean i = App.I;
        final int width = this.c.getWidth();
        if (width > 0) {
            this.c.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
            final int n = width - (this.a.getCompoundPaddingLeft() + this.a.getCompoundPaddingRight());
            final String string = this.a.getText().toString();
            float textSize = this.a.getTextSize();
            while (textSize > 1.0f && (this.a.getPaint().measureText(string) >= n || i)) {
                --textSize;
                this.a.setTextSize(textSize);
                if (i) {
                    break;
                }
            }
        }
        return true;
    }
}
