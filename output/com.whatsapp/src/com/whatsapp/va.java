// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;

class va extends ShapeDrawable
{
    final MediaView a;
    
    va(final MediaView a) {
        this.a = a;
    }
    
    public void draw(final Canvas canvas) {
    }
    
    public int getIntrinsicHeight() {
        return (int)(16.0f * vc.b().b);
    }
    
    public int getIntrinsicWidth() {
        return (int)(16.0f * vc.b().b);
    }
    
    public int getOpacity() {
        return 0;
    }
}
