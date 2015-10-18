// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.content.SharedPreferences;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import android.preference.PreferenceManager;
import com.twitter.library.client.u;
import com.twitter.library.api.b;
import android.content.Context;

final class m implements Runnable
{
    private final Context a;
    
    public m(final Context a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final b a = b.a(this.a);
        u.a.a(a);
        if (a != null) {
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a);
            if (!a.equals(new b(defaultSharedPreferences.getString("adid_identifier", ""), defaultSharedPreferences.getBoolean("adid_no_tracking_enabled", false)))) {
                defaultSharedPreferences.edit().putBoolean("adid_no_tracking_enabled", a.b()).putString("adid_identifier", a.a()).apply();
                final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(az.a(this.a).b().g());
                twitterScribeLog.b(new String[] { "app::::enter_foreground" });
                twitterScribeLog.f("app_download_client_event");
                twitterScribeLog.a("6", a.a());
                twitterScribeLog.a(a.b());
                c.a(this.a).a(twitterScribeLog);
            }
        }
    }
}
