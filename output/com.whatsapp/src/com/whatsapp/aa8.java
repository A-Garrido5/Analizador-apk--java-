// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

class aa8 extends Drawable
{
    final ConversationRow a;
    
    aa8(final ConversationRow a) {
        this.a = a;
    }
    
    public void draw(final Canvas canvas) {
    }
    
    public int getOpacity() {
        return -3;
    }
    
    public boolean isStateful() {
        return true;
    }
    
    protected boolean onLevelChange(final int n) {
        return true;
    }
    
    protected boolean onStateChange(final int[] array) {
        return true;
    }
    
    public void setAlpha(final int n) {
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
    }
    
    public boolean setState(final int[] array) {
        this.invalidateSelf();
        return true;
    }
}
