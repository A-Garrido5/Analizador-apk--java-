// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.twitter.internal.network.k;
import com.twitter.internal.network.g;
import android.content.Context;

public class aa
{
    public static g a(final Context context) {
        return new g(b(context));
    }
    
    private static k b(final Context context) {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return new k(defaultSharedPreferences.getBoolean("proxy_enabled", false), defaultSharedPreferences.getString("proxy_host", ""), defaultSharedPreferences.getString("proxy_port", ""));
    }
}
