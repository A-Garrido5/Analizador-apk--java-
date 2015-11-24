// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint$Style;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

public class eu extends ReplacementSpan
{
    private final int a;
    private final int b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    
    public eu(final int a, final int b, final float c, final float d, final float e, final float f, final float g, final float h) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    private float a(final Paint paint) {
        final float strokeWidth = paint.getStrokeWidth();
        if (strokeWidth != 0.0f) {
            return strokeWidth;
        }
        return 1.0f;
    }
    
    public void draw(final Canvas canvas, final CharSequence charSequence, final int n, final int n2, final float n3, final int n4, final int n5, final int n6, final Paint paint) {
        final String trim = charSequence.subSequence(n, n2).toString().trim();
        final float a = this.a(paint);
        final Paint$FontMetrics fontMetrics = paint.getFontMetrics();
        final float n7 = paint.measureText(trim, 0, trim.length()) + 2.0f * this.d + 2.0f * a;
        final float n8 = fontMetrics.bottom - fontMetrics.top + 2.0f * a + this.e + this.f;
        final float n9 = n3 + this.g;
        final float n10 = n4 - this.e - a;
        final RectF rectF = new RectF(n9, n10, n7 + n9, n8 + n10);
        paint.setColor(this.b);
        paint.setStyle(Paint$Style.FILL);
        canvas.drawRoundRect(rectF, this.c, this.c, paint);
        paint.setColor(this.a);
        canvas.drawText(trim, 0, trim.length(), a + (n9 + this.d), (float)n5, paint);
    }
    
    public int getSize(final Paint paint, final CharSequence charSequence, final int n, final int n2, final Paint$FontMetricsInt paint$FontMetricsInt) {
        final String trim = charSequence.subSequence(n, n2).toString().trim();
        return (int)(paint.measureText(trim, 0, trim.length()) + 2.0f * this.a(paint) + 2.0f * this.d + this.g + this.h);
    }
}
