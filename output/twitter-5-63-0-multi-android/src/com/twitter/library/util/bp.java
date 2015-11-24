// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.content.SharedPreferences;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

final class bp implements SharedPreferences$OnSharedPreferenceChangeListener
{
    public void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, final String s) {
        if ("sound_effects".equals(s)) {
            bo.b = sharedPreferences.getBoolean(s, true);
        }
        else if ("font_size".equals(s)) {
            final String string = sharedPreferences.getString("font_size", (String)null);
            if (string != null) {
                bo.a = Float.parseFloat(string) * bj.b;
            }
        }
    }
}
