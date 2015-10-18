// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.platform;

import android.content.Intent;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.android.util.AppEventTrack$EventType;
import android.preference.PreferenceManager;
import com.twitter.android.util.h;
import com.twitter.android.util.AppEventTrack;
import com.twitter.library.api.b;
import android.provider.Settings$Secure;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.Context;
import android.content.BroadcastReceiver;

public class InstallReferralReceiver extends BroadcastReceiver
{
    protected static void a(final Context context, final String s) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(0L).b(new String[] { "external::::referred" })).a("4", Settings$Secure.getString(context.getContentResolver(), "android_id"));
        final b a = b.a(context);
        if (a != null) {
            twitterScribeLog.a("6", a.a());
            twitterScribeLog.a(a.b());
        }
        if (s != null) {
            AppEventTrack.a(context, s);
            final h h = new h(AppEventTrack.a(s));
            if ("rc".equals(h.a)) {
                PreferenceManager.getDefaultSharedPreferences(context).edit().putString("pref_referral_campaign", h.b).apply();
            }
            else if ("explore_email".equals(h.a)) {
                PreferenceManager.getDefaultSharedPreferences(context).edit().putString("pref_category", h.b).putString("pref_country", h.e).apply();
            }
            twitterScribeLog.a(h.c, h.d, h.a, h.e, h.b, h.f, s);
            AppEventTrack.a(context, AppEventTrack$EventType.a, s);
        }
        ScribeService.a(context, twitterScribeLog);
    }
    
    public void onReceive(final Context context, final Intent intent) {
        new c(context).execute((Object[])new String[] { intent.getStringExtra("referrer") });
    }
}
