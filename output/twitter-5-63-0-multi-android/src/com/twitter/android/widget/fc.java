// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public class fc extends Drawable
{
    private int a;
    private BitmapDrawable[] b;
    
    public fc(final BitmapDrawable[] b) {
        this.b = b;
    }
    
    public void a(final int a) {
        this.a = a;
        this.invalidateSelf();
    }
    
    public void a(final BitmapDrawable[] b) {
        this.b = b;
    }
    
    public BitmapDrawable[] a() {
        return this.b;
    }
    
    public void draw(final Canvas canvas) {
        if (this.b != null) {
            this.b[this.a].draw(canvas);
        }
    }
    
    public int getOpacity() {
        return -3;
    }
    
    protected void onBoundsChange(final Rect bounds) {
        final BitmapDrawable[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            ((Drawable)b[i]).setBounds(bounds);
        }
    }
    
    public void setAlpha(final int alpha) {
        final BitmapDrawable[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            ((Drawable)b[i]).setAlpha(alpha);
        }
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        final BitmapDrawable[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            ((Drawable)b[i]).setColorFilter(colorFilter);
        }
    }
}
