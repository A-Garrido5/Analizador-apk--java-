// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Locale;

final class eb extends e_
{
    @Override
    public void a(final c3 c3, final Object o) {
        this.a(c3, (Locale)o);
    }
    
    public void a(final c3 c3, final Locale locale) {
        String string;
        if (locale == null) {
            string = null;
        }
        else {
            string = locale.toString();
        }
        c3.a(string);
    }
}
