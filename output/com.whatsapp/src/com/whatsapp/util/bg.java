// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

class bg extends InsetDrawable
{
    final RtlCheckBox a;
    
    bg(final RtlCheckBox a, final Drawable drawable, final int n) {
        this.a = a;
        super(drawable, n);
    }
    
    public void draw(final Canvas canvas) {
    }
}
