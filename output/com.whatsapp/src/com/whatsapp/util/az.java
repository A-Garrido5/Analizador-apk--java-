// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import android.text.style.ImageSpan;

final class az extends ImageSpan
{
    private WeakReference a;
    
    az(final Drawable drawable) {
        super(drawable);
    }
    
    private Drawable a() {
        final WeakReference a = this.a;
        Drawable drawable = null;
        if (a != null) {
            drawable = a.get();
        }
        if (drawable == null) {
            drawable = this.getDrawable();
            this.a = new WeakReference(drawable);
        }
        return drawable;
    }
    
    public void draw(final Canvas canvas, final CharSequence charSequence, final int n, final int n2, final float n3, final int n4, final int n5, final int n6, final Paint paint) {
        final Drawable a = this.a();
        canvas.save();
        final Paint$FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.translate(n3, (float)(n4 + (fontMetricsInt.bottom - fontMetricsInt.top) / 2 - (a.getBounds().bottom - a.getBounds().top) / 2));
        a.draw(canvas);
        canvas.restore();
    }
}
