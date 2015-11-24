// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageButton;

public class MinimumHeightImageButton extends ImageButton
{
    static int a;
    private static final String z;
    private Context b;
    
    static {
        final char[] charArray = "u\u0004!\u001d\u000fi".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'g';
                    break;
                }
                case 0: {
                    c2 = '\u001d';
                    break;
                }
                case 1: {
                    c2 = 'a';
                    break;
                }
                case 2: {
                    c2 = 'H';
                    break;
                }
                case 3: {
                    c2 = 'z';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        MinimumHeightImageButton.a = 0;
    }
    
    public MinimumHeightImageButton(final Context b, final AttributeSet set) {
        final boolean i = App.I;
        super(b, set);
        this.b = b;
        int j = 0;
        while (j < set.getAttributeCount()) {
            if (set.getAttributeName(j).equals(MinimumHeightImageButton.z)) {
                final String attributeValue = set.getAttributeValue(j);
                MinimumHeightImageButton.a = (int)(Integer.parseInt(attributeValue.substring(0, attributeValue.indexOf("."))) * vc.b().b);
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
        float n3 = this.getDrawable().getIntrinsicHeight() + vc.b().t;
        final int n4 = (int)(this.getDrawable().getIntrinsicWidth() + vc.b().t);
        if (n3 < MinimumHeightImageButton.a) {
            n3 = MinimumHeightImageButton.a;
        }
        this.setMeasuredDimension(n4, (int)n3);
    }
}
