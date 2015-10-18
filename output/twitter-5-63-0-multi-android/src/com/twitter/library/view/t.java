// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import android.content.res.Resources;
import android.text.Spannable;

public class t
{
    private final String a;
    private final String b;
    private final Spannable c;
    
    public t(final Resources resources, final String a, final String b) {
        this.b = b;
        this.a = a;
        final String format = String.format(a, b);
        this.c = (Spannable)new SpannableString((CharSequence)format);
        final int index = format.indexOf(b);
        if (index >= 0) {
            this.c.setSpan((Object)new ForegroundColorSpan(resources.getColor(kx.strong_white)), index, index + b.length(), 33);
        }
    }
    
    public t(final String a) {
        this.b = null;
        this.a = a;
        this.c = (Spannable)new SpannableString((CharSequence)this.a);
    }
    
    public Spannable a() {
        return this.c;
    }
}
