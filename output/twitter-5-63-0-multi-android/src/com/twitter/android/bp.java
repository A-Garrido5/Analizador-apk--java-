// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;

class bp
{
    public final Drawable a;
    public final int b;
    
    public bp(final Drawable a, final int n, final int b) {
        this.a = a;
        if (this.a != null) {
            this.a.setColorFilter(n, PorterDuff$Mode.SRC_ATOP);
        }
        this.b = b;
    }
}
