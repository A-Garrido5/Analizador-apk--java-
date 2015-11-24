// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.graphics.drawable.Drawable$Callback;
import android.widget.ImageView;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

class af
{
    boolean a;
    Drawable b;
    boolean c;
    
    private af() {
        this.c = true;
    }
    
    public void a(final int n, final int n2) {
        if (this.a && this.b != null) {
            this.b.setBounds(0, 0, n, n2);
        }
    }
    
    public void a(final Canvas canvas) {
        if (this.b != null && this.c) {
            this.b.draw(canvas);
        }
    }
    
    public void a(final ImageView imageView) {
        if (this.b != null) {
            this.b.setCallback((Drawable$Callback)null);
            imageView.unscheduleDrawable(this.b);
        }
    }
    
    public void b(final ImageView imageView) {
        if (this.b != null && this.b.isStateful()) {
            this.b.setState(imageView.getDrawableState());
        }
    }
}
