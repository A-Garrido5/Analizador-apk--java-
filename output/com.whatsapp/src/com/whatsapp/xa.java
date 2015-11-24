// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.SpannableStringBuilder;

public final class xa extends SpannableStringBuilder
{
    public xa(final CharSequence charSequence) {
        super(charSequence);
    }
    
    public char charAt(final int n) {
        if (n >= 0 && n < this.length()) {
            return super.charAt(n);
        }
        return ' ';
    }
    
    public void getChars(final int n, final int n2, final char[] array, final int n3) {
        if (n2 >= n) {
            final int length = this.length();
            if (n <= length && n2 <= length && n >= 0 && n2 >= 0) {
                super.getChars(n, n2, array, n3);
            }
        }
    }
}
