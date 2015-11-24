// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import android.net.Uri$Builder;
import android.text.TextUtils;
import android.preference.PreferenceManager;
import android.net.Uri;
import android.content.Context;

public class m
{
    public static String a(final Context context, final String s) {
        if (s == null) {
            return null;
        }
        final Uri$Builder buildUpon = Uri.parse(s).buildUpon();
        final String string = PreferenceManager.getDefaultSharedPreferences(context).getString("kdt", "");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            buildUpon.appendQueryParameter("kdt", string);
        }
        return buildUpon.toString();
    }
    
    public static void b(final Context context, final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString("kdt", s).apply();
        }
    }
}
