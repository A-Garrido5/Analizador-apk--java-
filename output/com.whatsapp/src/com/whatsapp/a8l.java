// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.text.style.ReplacementSpan;

class a8l extends ReplacementSpan
{
    int a;
    final ConversationRow b;
    int c;
    
    a8l(final ConversationRow b, final int c, final int a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public void draw(final Canvas canvas, final CharSequence charSequence, final int n, final int n2, final float n3, final int n4, final int n5, final int n6, final Paint paint) {
    }
    
    public int getSize(final Paint paint, final CharSequence charSequence, final int n, final int n2, final Paint$FontMetricsInt paint$FontMetricsInt) {
        if (paint$FontMetricsInt != null) {
            paint$FontMetricsInt.ascent = -this.a;
            paint$FontMetricsInt.descent = 0;
            paint$FontMetricsInt.top = paint$FontMetricsInt.ascent;
            paint$FontMetricsInt.bottom = 0;
        }
        return this.c;
    }
}
