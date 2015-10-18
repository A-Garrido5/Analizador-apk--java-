// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

class al6 extends Drawable
{
    private int a;
    
    private al6() {
        this.a = 16842921;
    }
    
    al6(final yr yr) {
        this();
    }
    
    public void draw(final Canvas canvas) {
    }
    
    public int getOpacity() {
        return 0;
    }
    
    public boolean isStateful() {
        return true;
    }
    
    public void setAlpha(final int n) {
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
    }
    
    public boolean setState(final int[] array) {
        final boolean i = App.I;
        final int a = this.a;
        this.a = 16842921;
        final int length = array.length;
        int j = 0;
        while (j < length) {
            final int n = array[j];
            if (n == 16842919) {
                this.a = 16842919;
                if (!i) {
                    break;
                }
            }
            if (n == 16842908) {
                this.a = 16842908;
            }
            ++j;
            if (i) {
                break;
            }
        }
        final int a2 = this.a;
        boolean b = false;
        if (a != a2) {
            this.invalidateSelf();
            b = true;
        }
        return b;
    }
}
