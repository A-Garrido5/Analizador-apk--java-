// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Button;

public class MinimumWidthButton extends Button
{
    static int b;
    private static final String z;
    private Context a;
    
    static {
        final char[] charArray = "S)\u007f\u00183".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '[';
                    break;
                }
                case 0: {
                    c2 = '$';
                    break;
                }
                case 1: {
                    c2 = '@';
                    break;
                }
                case 2: {
                    c2 = '\u001b';
                    break;
                }
                case 3: {
                    c2 = 'l';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        MinimumWidthButton.b = 0;
    }
    
    public MinimumWidthButton(final Context a, final AttributeSet set) {
        final boolean i = App.I;
        super(a, set);
        this.a = a;
        int j = 0;
        while (j < set.getAttributeCount()) {
            if (set.getAttributeName(j).equals(MinimumWidthButton.z)) {
                final String attributeValue = set.getAttributeValue(j);
                MinimumWidthButton.b = (int)(Integer.parseInt(attributeValue.substring(0, attributeValue.indexOf("."))) * vc.b().b);
                if (!i) {
                    break;
                }
            }
            ++j;
            if (i) {
                break;
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        int i = 0;
        final boolean j = App.I;
        final TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(this.getResources().getDimension(2131361903));
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        float n3 = 0.0f;
        final float[] array = new float[this.getText().length()];
        textPaint.getTextWidths(this.getText(), 0, this.getText().length(), array);
        while (i < array.length) {
            n3 += array[i];
            ++i;
            if (j) {
                break;
            }
        }
        final float n4 = n3 + vc.b().d;
        int n5;
        if (MinimumWidthButton.b > this.getSuggestedMinimumWidth()) {
            n5 = MinimumWidthButton.b;
        }
        else {
            n5 = this.getSuggestedMinimumWidth();
        }
        final int resolveSize = resolveSize(this.getSuggestedMinimumHeight(), n2);
        float n6;
        if (n5 > n4) {
            n6 = n5;
        }
        else {
            n6 = n4;
        }
        this.setMeasuredDimension((int)n6, resolveSize);
    }
}
