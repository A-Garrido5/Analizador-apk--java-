// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.Context;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

public class bo
{
    public static float a;
    public static boolean b;
    static SharedPreferences$OnSharedPreferenceChangeListener c;
    
    static {
        bo.c = (SharedPreferences$OnSharedPreferenceChangeListener)new bp();
    }
    
    public static float a() {
        return 14.0f * bj.b;
    }
    
    public static float a(final float n) {
        return n - 2.0f * bj.b;
    }
    
    public static void a(final Context context) {
        bo.a = context.getResources().getDimension(ky.font_size_medium);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        final String string = defaultSharedPreferences.getString("font_size", (String)null);
        if (string != null) {
            bo.a = Float.parseFloat(string) * bj.b;
        }
        bo.b = defaultSharedPreferences.getBoolean("sound_effects", true);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(bo.c);
    }
    
    public static float b() {
        return 12.0f * bj.b;
    }
}
