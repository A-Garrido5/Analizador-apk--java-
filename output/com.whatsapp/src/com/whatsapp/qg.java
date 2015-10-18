// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Transformation;
import android.view.View;
import android.view.animation.Animation;

class qg extends Animation
{
    final sf a;
    final int b;
    final int c;
    final View d;
    
    qg(final sf a, final View d, final int b, final int c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        Label_0052: {
            if (n == 1.0f) {
                this.d.getLayoutParams().height = -2;
                if (!App.I) {
                    break Label_0052;
                }
            }
            this.d.getLayoutParams().height = this.b + (int)(n * (this.c - this.b));
        }
        this.d.requestLayout();
    }
    
    public boolean willChangeBounds() {
        return true;
    }
}
