// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.text.Spanned;
import android.text.InputFilter;

class bl implements InputFilter
{
    final /* synthetic */ TweetBox a;
    
    bl(final TweetBox a) {
        this.a = a;
    }
    
    public CharSequence filter(CharSequence subSequence, final int n, final int n2, final Spanned spanned, final int n3, final int n4) {
        final int n5 = spanned.length() - " #alert".length();
        if (n5 >= 0 && n4 > n5) {
            subSequence = spanned.subSequence(n3, n4);
        }
        return subSequence;
    }
}
