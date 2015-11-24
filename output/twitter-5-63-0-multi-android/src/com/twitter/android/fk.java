// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.service.a;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.l;
import com.twitter.library.api.ac;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.android.util.AppEventTrack;
import com.twitter.android.util.h;
import android.preference.PreferenceManager;
import com.twitter.library.service.aa;
import com.twitter.library.api.b;
import android.provider.Settings$Secure;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.service.z;

class fk extends z
{
    private Context a;
    
    fk(final Context a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(0L).a("4", Settings$Secure.getString(this.a.getContentResolver(), "android_id"));
        final b a = b.a(this.a);
        if (a != null) {
            twitterScribeLog.a("6", a.a());
            twitterScribeLog.a(a.b());
        }
        final aa aa = (aa)y.l().b();
        if (aa.a()) {
            final ac e = ((mn)y).e();
            final String s = e.a.get("campaign");
            final String s2 = e.a.get("content");
            final String s3 = e.a.get("src");
            final String s4 = e.a.get("group");
            final String s5 = e.a.get("term");
            if (s != null && s2 != null && "rc".equals(s) && !PreferenceManager.getDefaultSharedPreferences(this.a).contains("pref_referral_campaign")) {
                PreferenceManager.getDefaultSharedPreferences(this.a).edit().putString("pref_referral_campaign", s2).apply();
            }
            AppEventTrack.a(this.a, AppEventTrack.a(new h(s, s2, s3, s4, s5, null, true).a()));
            twitterScribeLog.b(new String[] { "external:::irs:referred" });
            twitterScribeLog.a(s3, s4, s, s5, s2, null, null);
        }
        else {
            twitterScribeLog.b(new String[] { "external:::irs:error" });
            final l f = aa.f();
            final HttpOperation e2 = aa.e();
            if (f != null && e2 != null && e2.i() != null) {
                twitterScribeLog.a(e2.i().toString(), f);
            }
        }
        ScribeService.a(this.a, twitterScribeLog);
    }
}
