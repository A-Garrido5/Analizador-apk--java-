// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.telephony.TelephonyUtil;
import android.content.SharedPreferences;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import android.preference.PreferenceManager;
import com.twitter.library.client.az;
import android.content.Context;

public class v
{
    private static v a;
    private final Context b;
    private final az c;
    private boolean d;
    
    private v(final Context b) {
        this.b = b;
        this.c = az.a(b);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(b);
        this.a(defaultSharedPreferences.getBoolean("media_forward", true), false);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)new w(this, defaultSharedPreferences));
    }
    
    public static v a(final Context context) {
        synchronized (v.class) {
            if (v.a == null) {
                v.a = new v(context.getApplicationContext());
            }
            return v.a;
        }
    }
    
    private void a(final boolean d, final boolean b) {
        if (this.d != d) {
            this.d = d;
            if (b) {
                TelephonyUtil.d(this.b);
                final c a = com.twitter.android.client.c.a(this.b);
                final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(this.c.b().g());
                final String[] array = { null };
                final StringBuilder append = new StringBuilder().append("settings::::");
                String s;
                if (d) {
                    s = "enable_media_forward";
                }
                else {
                    s = "disable_media_forward";
                }
                array[0] = append.append(s).toString();
                a.a(((TwitterScribeLog)twitterScribeLog.b(array)).c("network_type:" + TelephonyUtil.a() + ",change"));
            }
        }
    }
    
    public boolean a() {
        return this.d;
    }
}
