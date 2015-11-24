// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;

class m6 extends Drawable
{
    final Drawable a;
    final ViewGroup b;
    final MessageDetailsActivity c;
    
    m6(final MessageDetailsActivity c, final Drawable a, final ViewGroup b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void draw(final Canvas canvas) {
        final int intrinsicHeight = this.a.getIntrinsicHeight();
        final int intrinsicWidth = this.a.getIntrinsicWidth();
        int width = this.b.getWidth();
        int height = this.b.getHeight();
        Label_0067: {
            if (width * intrinsicHeight > height * intrinsicWidth) {
                height = intrinsicHeight * width / intrinsicWidth;
                if (!App.I) {
                    break Label_0067;
                }
            }
            width = intrinsicWidth * height / intrinsicHeight;
        }
        this.a.setBounds(0, 0, width, height);
        this.a.draw(canvas);
    }
    
    public int getOpacity() {
        return 0;
    }
    
    public void setAlpha(final int n) {
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
    }
}
