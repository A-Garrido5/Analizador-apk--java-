// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.net.Uri$Builder;
import android.text.TextUtils;
import com.twitter.util.i;
import android.net.Uri;
import java.util.Locale;

public class zl
{
    public static String a(final Locale locale, final String s) {
        if (s == null) {
            return null;
        }
        final Uri$Builder buildUpon = Uri.parse(s).buildUpon();
        buildUpon.appendQueryParameter("initiated_in_app", "true");
        if (locale != null) {
            final String c = i.c(locale);
            if (!TextUtils.isEmpty((CharSequence)c)) {
                buildUpon.appendQueryParameter("lang", c);
            }
        }
        return buildUpon.toString();
    }
}
