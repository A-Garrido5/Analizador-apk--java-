// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.text.Spanned;
import android.text.InputFilter;

class g implements InputFilter
{
    private String a;
    
    public g(final String a) {
        this.a = a;
    }
    
    public CharSequence filter(final CharSequence charSequence, final int n, final int n2, final Spanned spanned, final int n3, final int n4) {
        if (charSequence.toString().matches(this.a)) {
            return charSequence;
        }
        return "";
    }
}
