// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.text.TextPaint;
import android.graphics.Typeface;
import android.graphics.Paint;
import android.content.Context;
import com.twitter.ui.widget.ag;
import android.text.style.StyleSpan;

public class TypefacesSpan extends StyleSpan
{
    private final int a;
    private final ag b;
    
    public TypefacesSpan(final Context context, final int a) {
        int n;
        if (ag.a(context).f) {
            n = 0;
        }
        else {
            n = a;
        }
        super(n);
        this.a = a;
        this.b = ag.a(context);
    }
    
    private void a(final Paint paint) {
        final Typeface typeface = paint.getTypeface();
        int style;
        if (typeface == null) {
            style = 0;
        }
        else {
            style = typeface.getStyle();
        }
        paint.setTypeface(this.b.b(style | this.a));
    }
    
    public void updateDrawState(final TextPaint textPaint) {
        if (this.b.f) {
            this.a((Paint)textPaint);
            return;
        }
        super.updateDrawState(textPaint);
    }
    
    public void updateMeasureState(final TextPaint textPaint) {
        if (this.b.f) {
            this.a((Paint)textPaint);
            return;
        }
        super.updateMeasureState(textPaint);
    }
}
