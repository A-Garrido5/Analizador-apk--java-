// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.preference.PreferenceManager;
import android.content.Context;

public class aj
{
    public static String a(final Context context) {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.getBoolean("inject_ptr_enabled", false)) {
            final String string = defaultSharedPreferences.getString("inject_ptr_order", "");
            final String string2 = defaultSharedPreferences.getString("inject_ptr_index", "0");
            if (!TextUtils.isEmpty((CharSequence)string) && !TextUtils.isEmpty((CharSequence)string2)) {
                final int int1 = Integer.parseInt(string2);
                final String[] split = string.split(",");
                if (int1 < 0 || int1 >= split.length) {
                    defaultSharedPreferences.edit().putString("inject_ptr_index", "0").apply();
                    return null;
                }
                defaultSharedPreferences.edit().putString("inject_ptr_index", Integer.toString((int1 + 1) % split.length)).apply();
                return split[int1].trim();
            }
        }
        return null;
    }
}
