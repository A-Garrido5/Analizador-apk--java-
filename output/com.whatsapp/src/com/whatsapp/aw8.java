// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.Spanned;
import android.text.InputFilter;

public final class aw8 implements InputFilter
{
    private final int a;
    
    public aw8(final int a) {
        this.a = a;
    }
    
    public CharSequence filter(final CharSequence charSequence, final int n, final int n2, final Spanned spanned, final int n3, final int n4) {
        final String string = spanned.toString();
        final int codePointCount = string.codePointCount(0, string.length());
        final int codePointCount2 = string.codePointCount(n3, n4);
        final int codePointCount3 = charSequence.toString().codePointCount(n, n2);
        final int n5 = codePointCount2 + (this.a - codePointCount);
        if (n5 <= 0) {
            return "";
        }
        if (n5 >= codePointCount3) {
            return null;
        }
        int n6 = n5 + n;
        if (Character.isHighSurrogate(charSequence.charAt(n6 - 1)) && --n6 == n) {
            return "";
        }
        return charSequence.subSequence(n, n6);
    }
}
