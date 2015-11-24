// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.preference.PreferenceManager;
import android.content.Context;

public class sv
{
    public static String a(final Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("phone100_temporary_password", "");
    }
    
    public static void a(final Context context, final String s) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString("phone100_temporary_password", s).apply();
    }
    
    public static void b(final Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().remove("phone100_temporary_password").apply();
    }
}
