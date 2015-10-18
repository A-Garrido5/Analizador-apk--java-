// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.platform;

import com.twitter.android.kg;
import com.twitter.android.SearchActivity;
import android.content.SharedPreferences;
import java.util.ArrayList;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.client.az;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.x;
import com.twitter.android.client.bh;
import com.twitter.library.featureswitch.d;
import android.preference.PreferenceManager;
import android.app.AlarmManager;
import android.content.Intent;
import android.app.PendingIntent;
import android.content.Context;
import java.util.Calendar;
import android.content.BroadcastReceiver;

public class TwitterAccessCwcNotificationReceiver extends BroadcastReceiver
{
    private static long a() {
        final Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.add(5, 1);
        instance.set(10, 8);
        instance.set(12, 0);
        instance.set(13, 0);
        return instance.getTimeInMillis();
    }
    
    public static PendingIntent a(final Context context, final String s, final int n) {
        final Intent intent = new Intent(context, (Class)TwitterAccessCwcNotificationReceiver.class);
        intent.putExtra("key_event_type", s);
        return PendingIntent.getBroadcast(context, n, intent, 0);
    }
    
    public static void a(final Context context) {
        ((AlarmManager)context.getSystemService("alarm")).setRepeating(1, a(), 259200000L, e(context));
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("twitter_access_cwc_notifications_schedule_started", true).apply();
    }
    
    private void b(final Context context) {
        final ArrayList h = d.h("twitter_access_cwc_notifications_carriers_keys");
        final ArrayList h2 = d.h("twitter_access_cwc_notifications_carriers_names");
        final ArrayList h3 = d.h("twitter_access_cwc_notifications_headlines");
        final ArrayList h4 = d.h("twitter_access_cwc_notifications_bodies");
        if (h != null && h2 != null && h3 != null && h4 != null) {
            final int index = h.indexOf(bh.a(context).d());
            if (index != -1 && index < h2.size() && index < h3.size() && index < h4.size()) {
                x.a(context).a(h2.get(index).toString(), h3.get(index).toString(), h4.get(index).toString());
                ScribeService.a(context, ((TwitterScribeLog)new TwitterScribeLog(az.a(context).b().g()).b(new String[] { "app:twitter_access:cricket:notification:impression" })).b(context));
                final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                final int int1 = defaultSharedPreferences.getInt("twitter_access_notifications_shown_count", 0);
                if (int1 == 14) {
                    this.d(context);
                    return;
                }
                defaultSharedPreferences.edit().putInt("twitter_access_notifications_shown_count", int1 + 1).apply();
            }
        }
    }
    
    private void c(final Context context) {
        x.a(context).e();
        this.d(context);
        ScribeService.a(context, ((TwitterScribeLog)new TwitterScribeLog(az.a(context).b().g()).b(new String[] { "app:twitter_access:cricket:notification:disabled" })).b(context));
    }
    
    private void d(final Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("twitter_access_cwc_notifications_enabled", false).apply();
        ((AlarmManager)context.getSystemService("alarm")).cancel(e(context));
    }
    
    private static PendingIntent e(final Context context) {
        return a(context, "type_event_show", 1);
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final String stringExtra = intent.getStringExtra("key_event_type");
        if (stringExtra != null) {
            switch (stringExtra) {
                default: {}
                case "type_event_show": {
                    if (!d.f("twitter_access_cwc_notifications_enabled")) {
                        this.c(context);
                        return;
                    }
                    if (bh.a(context).j()) {
                        this.b(context);
                        return;
                    }
                    break;
                }
                case "type_event_disable": {
                    this.c(context);
                }
                case "type_event_start_cricket_activity": {
                    final Intent setFlags = new Intent(context, (Class)SearchActivity.class).putExtra("query", d.g("cricket_experience_tournament_hashtag_takeover")).setFlags(335544320);
                    kg.a(true, context, setFlags);
                    context.startActivity(setFlags);
                    ScribeService.a(context, ((TwitterScribeLog)new TwitterScribeLog(az.a(context).b().g()).b(new String[] { "app:twitter_access:cricket:notification:open" })).b(context));
                }
            }
        }
    }
}
