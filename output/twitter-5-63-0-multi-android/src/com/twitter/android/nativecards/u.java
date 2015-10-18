// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.graphics.Canvas;
import android.content.Context;
import android.graphics.drawable.Drawable;

class u
{
    private Drawable a;
    
    public void a(final Context context, final int n) {
        if (this.a == null) {
            this.a = context.getResources().getDrawable(n);
        }
    }
    
    public void a(final Canvas canvas) {
        if (this.a != null) {
            this.a.draw(canvas);
        }
    }
    
    public void a(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (this.a != null) {
            final int n5 = n3 - n;
            final int n6 = n4 - n2;
            int n8;
            int n9;
            if (n5 > 0.0f) {
                final int min = Math.min(this.a.getMinimumWidth(), n5);
                final int n7 = (n5 - min) / 2;
                n8 = min;
                n9 = n7;
            }
            else {
                n9 = 0;
                n8 = 0;
            }
            int min2;
            int n10;
            if (n6 > 0.0f) {
                min2 = Math.min(this.a.getMinimumHeight(), n6);
                n10 = (n6 - min2) / 2;
            }
            else {
                n10 = 0;
                min2 = 0;
            }
            this.a.setBounds(n9, n10, n8 + n9, min2 + n10);
        }
    }
    
    public void a(final int[] state) {
        if (this.a != null && this.a.isStateful()) {
            this.a.setState(state);
        }
    }
}
