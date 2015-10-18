// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.graphics.Paint$FontMetrics;
import com.whatsapp.vc;
import android.graphics.drawable.InsetDrawable;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;

class ah implements l
{
    private Paint a;
    private float b;
    
    public ah(final Paint a, final float b) {
        this.b = 1.0f;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public Drawable a(final Drawable drawable, final Context context) {
        final Paint$FontMetrics fontMetrics = this.a.getFontMetrics();
        Object o;
        if (fontMetrics != null) {
            final int max = Math.max((int)(0.5f + (fontMetrics.descent - (this.b - 1.0f) * this.a.getTextSize()) / 2.0f), 0);
            o = new InsetDrawable(drawable, 0, -max, 0, max);
            final int n = (int)(0.5f + 1.1f * (this.b * this.a.getTextSize()));
            ((Drawable)o).setBounds(0, 0, n, n);
            if (!Log.l) {
                return (Drawable)o;
            }
        }
        else {
            o = drawable;
        }
        ((Drawable)o).setBounds(0, 0, (int)vc.b().a(((Drawable)o).getIntrinsicWidth()), (int)vc.b().a(((Drawable)o).getIntrinsicWidth()));
        return (Drawable)o;
    }
}
