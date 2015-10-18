// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.SpannableString;
import android.text.Spannable;
import android.text.Spannable$Factory;

final class kw extends Spannable$Factory
{
    public Spannable newSpannable(final CharSequence charSequence) {
        return (Spannable)new ad_((CharSequence)new SpannableString(charSequence));
    }
}
