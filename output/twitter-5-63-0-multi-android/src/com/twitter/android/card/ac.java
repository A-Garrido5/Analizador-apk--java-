// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.errorreporter.ErrorReporter;
import android.text.TextUtils;
import com.twitter.library.card.Card;
import android.content.Context;
import com.twitter.library.media.manager.a;

public class ac
{
    private final a a;
    
    public ac(final Context context) {
        this(context, Math.max(5242880, 10485760));
    }
    
    public ac(final Context context, final int n) {
        this.a = new a(context, "card", 5, Math.min(n, 10485760), Math.min(n, 5242880));
    }
    
    public Card a(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        try {
            return (Card)this.a.c(s);
        }
        catch (Exception ex) {
            ErrorReporter.a(ex);
            return null;
        }
    }
    
    public void a(final String s, final Card card) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        try {
            this.a.a(s, card);
        }
        catch (Exception ex) {
            ErrorReporter.a(ex);
        }
    }
}
