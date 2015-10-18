// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import android.content.Intent;
import com.twitter.library.client.az;
import android.content.Context;
import android.preference.PreferenceManager;
import android.app.Activity;
import com.twitter.library.featureswitch.d;
import java.lang.ref.WeakReference;
import com.twitter.library.client.af;

public class jt implements af
{
    private static WeakReference a;
    
    private static boolean a() {
        return d.f("jump_back_home_enabled");
    }
    
    public static boolean c(final Activity activity) {
        return a() && e(activity);
    }
    
    private static boolean d(final Activity activity) {
        return PreferenceManager.getDefaultSharedPreferences((Context)activity).getBoolean("has_completed_signin_flow", false);
    }
    
    private static boolean e(final Activity activity) {
        final long currentTimeMillis = System.currentTimeMillis();
        final long long1 = PreferenceManager.getDefaultSharedPreferences((Context)activity).getLong("become_inactive_timestamp", 0L);
        final int a = d.a("jump_back_home_interval_seconds", 1800);
        return long1 > 0L && currentTimeMillis > long1 + 1000L * a;
    }
    
    @Override
    public void a(final Activity activity) {
        jt.a = new WeakReference((T)activity);
        PreferenceManager.getDefaultSharedPreferences((Context)activity).edit().putLong("become_inactive_timestamp", System.currentTimeMillis()).apply();
    }
    
    @Override
    public void b(final Activity activity) {
        if (a() && activity instanceof ju && az.a((Context)activity).b().d() && jt.a != null) {
            final Activity activity2 = (Activity)jt.a.get();
            if (activity2 != null && activity2 == activity && activity2.getIntent().equals(activity.getIntent()) && d(activity) && ((ju)activity).v() && c(activity)) {
                if (activity instanceof MainActivity) {
                    ((MainActivity)activity).b_(MainActivity.c);
                    return;
                }
                activity.startActivity(new Intent((Context)activity, (Class)MainActivity.class).putExtra("page", (Parcelable)MainActivity.c).addFlags(335544320));
                activity.finish();
            }
        }
    }
}
