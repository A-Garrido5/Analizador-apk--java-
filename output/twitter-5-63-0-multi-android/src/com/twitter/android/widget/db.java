// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.util.Locale;
import java.util.Comparator;

class db implements Comparator
{
    final /* synthetic */ LocalePreference a;
    
    db(final LocalePreference a) {
        this.a = a;
    }
    
    public int a(final Locale locale, final Locale locale2) {
        int n = locale.getDisplayLanguage().compareTo(locale2.getDisplayLanguage());
        if (n == 0) {
            n = locale.getDisplayCountry().compareTo(locale2.getDisplayCountry());
        }
        return n;
    }
}
