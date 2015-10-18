// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.drawable.Drawable;

class a20 extends Drawable
{
    final View a;
    final Drawable b;
    final BroadcastDetails c;
    
    a20(final BroadcastDetails c, final Drawable b, final View a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public void draw(final Canvas canvas) {
        final int intrinsicHeight = this.b.getIntrinsicHeight();
        final int intrinsicWidth = this.b.getIntrinsicWidth();
        final int width = this.a.getWidth();
        this.a.getWidth();
        this.b.setBounds(0, 0, width, intrinsicHeight * width / intrinsicWidth);
        this.b.draw(canvas);
    }
    
    public int getOpacity() {
        return 0;
    }
    
    public void setAlpha(final int n) {
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
    }
}
