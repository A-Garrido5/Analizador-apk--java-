// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.graphics.Rect;
import com.whatsapp.App;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

public class m extends InsetDrawable
{
    public m(final Drawable drawable) {
        super(drawable, 0);
    }
    
    public void draw(final Canvas canvas) {
        if (App.ak()) {
            super.draw(canvas);
            if (!Log.l) {
                return;
            }
        }
        canvas.save();
        canvas.scale(-1.0f, 1.0f, this.getBounds().exactCenterX(), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }
    
    public boolean getPadding(final Rect rect) {
        final boolean padding = super.getPadding(rect);
        if (!App.ak()) {
            final int right = rect.right;
            rect.right = rect.left;
            rect.left = right;
        }
        return padding;
    }
}
