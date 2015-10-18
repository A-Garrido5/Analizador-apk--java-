// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.Context;
import android.os.Handler;

public class ab
{
    private static final Object a;
    private static volatile ab b;
    private Handler c;
    private final Runnable d;
    private Context e;
    
    static {
        a = new Object();
    }
    
    private ab(final Context context) {
        this.c = new Handler();
        this.d = new ac(this);
        this.e = context.getApplicationContext();
    }
    
    public static ab a(final Context context) {
        Label_0031: {
            if (ab.b != null) {
                break Label_0031;
            }
            synchronized (ab.a) {
                if (ab.b == null) {
                    ab.b = new ab(context);
                }
                return ab.b;
            }
        }
    }
    
    private void a(final boolean b) {
        PreferenceManager.getDefaultSharedPreferences(this.e).edit().putLong("app_usage_monitor_update_ts", System.currentTimeMillis()).apply();
        if (b) {
            this.c.postDelayed(this.d, 600000L);
        }
    }
    
    public void a() {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.e);
        final int int1 = defaultSharedPreferences.getInt("app_usage_monitor_state", 0);
        final long long1 = defaultSharedPreferences.getLong("app_usage_monitor_start_ts", 0L);
        final long long2 = defaultSharedPreferences.getLong("app_usage_monitor_update_ts", 0L);
        final long n = long2 - long1;
        if (long1 > 0L && long2 > 0L) {
            String s;
            if (int1 == 2) {
                s = "app:session_length:scheduled_exit";
            }
            else {
                s = "app:session_length:forced_exit";
            }
            final ih ih = new ih(s, ih.m, n);
            ih.b("app_usage_monitor");
            ir.b().a(ih);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        defaultSharedPreferences.edit().putInt("app_usage_monitor_state", 1).putLong("app_usage_monitor_start_ts", currentTimeMillis).putLong("app_usage_monitor_update_ts", currentTimeMillis).apply();
        this.c.postDelayed(this.d, 600000L);
    }
    
    public void b() {
        this.a(false);
    }
    
    public void c() {
        synchronized (this) {
            PreferenceManager.getDefaultSharedPreferences(this.e).edit().putInt("app_usage_monitor_state", 2).putLong("app_usage_monitor_update_ts", System.currentTimeMillis()).apply();
        }
    }
}
