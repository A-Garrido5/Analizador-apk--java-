// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;

public class am extends LayerDrawable
{
    private final boolean[] a;
    
    public am(final Context context, final int n) {
        this((LayerDrawable)context.getResources().getDrawable(n));
    }
    
    public am(final LayerDrawable layerDrawable) {
        this(a(layerDrawable));
        for (int numberOfLayers = layerDrawable.getNumberOfLayers(), i = 0; i < numberOfLayers; ++i) {
            this.setId(i, layerDrawable.getId(i));
        }
    }
    
    public am(final Drawable[] array) {
        super(array);
        this.a = new boolean[array.length];
    }
    
    private static Drawable[] a(final LayerDrawable layerDrawable) {
        final int numberOfLayers = layerDrawable.getNumberOfLayers();
        final Drawable[] array = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; ++i) {
            array[i] = layerDrawable.getDrawable(i);
        }
        return array;
    }
    
    public void a(final int n, final int alpha) {
        this.getDrawable(n).setAlpha(alpha);
        this.invalidateSelf();
    }
    
    public void a(final int n, final boolean b) {
        final boolean b2 = !b;
        if (this.a[n] != b2) {
            this.a[n] = b2;
            this.invalidateSelf();
        }
    }
    
    public void draw(final Canvas canvas) {
        final int numberOfLayers = this.getNumberOfLayers();
        final boolean[] a = this.a;
        for (int i = 0; i < numberOfLayers; ++i) {
            if (!a[i]) {
                this.getDrawable(i).draw(canvas);
            }
        }
    }
    
    protected void onBoundsChange(final Rect bounds) {
        for (int numberOfLayers = this.getNumberOfLayers(), i = 0; i < numberOfLayers; ++i) {
            this.getDrawable(i).setBounds(bounds);
        }
    }
}
