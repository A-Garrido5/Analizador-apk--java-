// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.client.App;
import com.twitter.library.provider.Tweet;
import android.content.SharedPreferences$Editor;
import com.twitter.library.featureswitch.d;
import android.app.Activity;
import android.content.res.Resources;
import java.util.regex.Matcher;
import com.twitter.library.widget.ao;
import java.util.List;
import com.twitter.library.view.t;
import java.util.ArrayList;
import android.net.Uri;
import android.content.Intent;
import com.twitter.android.UrlInterpreterActivity;
import com.twitter.errorreporter.ErrorReporter;
import android.text.TextUtils;
import android.content.SharedPreferences;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.android.platform.TwitterAccessCwcNotificationReceiver;
import android.preference.PreferenceManager;
import java.util.Map;
import com.twitter.library.util.bk;
import com.twitter.library.network.g;
import com.twitter.library.api.ay;
import android.content.Context;
import java.util.regex.Pattern;

public class bh
{
    private static final Pattern a;
    private static bh b;
    private final Context c;
    private boolean d;
    private boolean e;
    private ay f;
    private boolean g;
    private bj h;
    
    static {
        a = Pattern.compile("<a.* href=\\ ?\"([^\"]*)\"[^>]*>(.*)</a>");
    }
    
    private bh(final Context c) {
        this.g = false;
        this.c = c;
    }
    
    public static bh a(final Context context) {
        synchronized (bh.class) {
            if (bh.b == null) {
                bh.b = new bh(context.getApplicationContext());
            }
            return bh.b;
        }
    }
    
    private void b(final ay f) {
        final ay f2 = this.f;
        if (f != null) {
            com.twitter.library.network.g.a(f.i);
        }
        else {
            final SharedPreferences sharedPreferences = this.c.getSharedPreferences("config", 0);
            final long n = bk.a() / 1000L;
            final long long1 = sharedPreferences.getLong("twitter_access_timestamp", 0L);
            if (f2 == null || long1 + f2.k < n) {
                com.twitter.library.network.g.a((Map)null);
            }
        }
        this.f = f;
        if (!PreferenceManager.getDefaultSharedPreferences(this.c).getBoolean("twitter_access_cwc_notifications_schedule_started", false) && this.j()) {
            TwitterAccessCwcNotificationReceiver.a(this.c);
        }
        if (!TelephonyUtil.c() && ay.a(f, f2)) {
            this.a();
        }
    }
    
    public ay a(final SharedPreferences sharedPreferences) {
        final String string = sharedPreferences.getString("twitter_access_config", "");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            try {
                return new ay(string);
            }
            catch (RuntimeException ex) {
                ErrorReporter.a(ex);
                return null;
            }
        }
        return null;
    }
    
    public void a() {
        final com.twitter.library.client.bk a = com.twitter.library.client.bk.a();
        if (this.e() && !TelephonyUtil.c()) {
            final Matcher matcher = bh.a.matcher(this.f.c);
            Intent setData;
            String group;
            String s;
            if (matcher.find()) {
                setData = new Intent(this.c, (Class)UrlInterpreterActivity.class).setData(Uri.parse(matcher.group(1)));
                group = matcher.group(2);
                s = this.f.c.replace(matcher.group(0), "%1$s");
            }
            else {
                s = this.f.c;
                group = null;
                setData = null;
            }
            final Resources resources = this.c.getResources();
            final String[] split = s.split("\n");
            final ArrayList<t> list = new ArrayList<t>();
            for (final String s2 : split) {
                if (s2.contains("%1$s")) {
                    list.add(new t(resources, s2, group));
                }
                else {
                    list.add(new t(s2));
                }
            }
            a.a(list);
            a.a(true);
            if (this.h == null) {
                this.h = new bj(this.c);
            }
            this.h.a = setData;
            a.a(this.h);
            return;
        }
        a.a(false);
    }
    
    public void a(final Activity activity, final Runnable runnable) {
        if (this.g() && com.twitter.library.featureswitch.d.f("twitter_access_android_media_forward_enabled")) {
            am.a((Context)activity, new bi(this, runnable));
            return;
        }
        runnable.run();
    }
    
    void a(final ay ay) {
        final long n = bk.a() / 1000L;
        if (ay != null) {
            this.c.getSharedPreferences("config", 0).edit().putLong("twitter_access_timestamp", n).apply();
        }
        this.b(ay);
    }
    
    public void a(final ay ay, final SharedPreferences sharedPreferences) {
        final SharedPreferences$Editor edit = sharedPreferences.edit();
        if (ay != null) {
            edit.putString("twitter_access_config", ay.toString());
        }
        else {
            edit.remove("twitter_access_config");
        }
        edit.apply();
        this.b(ay);
    }
    
    public void a(final boolean d, final boolean b) {
        if (this.d != d) {
            final SharedPreferences$Editor edit = PreferenceManager.getDefaultSharedPreferences(this.c).edit();
            edit.putBoolean("data_alerts_links", d);
            if (b && !d && !this.e) {
                edit.putBoolean("data_charges_alerts", false);
            }
            edit.apply();
            this.d = d;
        }
    }
    
    public boolean a(final Tweet tweet) {
        return !this.c() || (com.twitter.library.featureswitch.d.f("twitter_access_android_media_forward_enabled") && !tweet.F());
    }
    
    public void b() {
        if (!this.g) {
            com.twitter.android.client.c.a(this.c).h();
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.c);
            this.d = defaultSharedPreferences.getBoolean("data_alerts_links", true);
            this.e = defaultSharedPreferences.getBoolean("data_alerts_inline", true);
            this.g = true;
            this.b(this.a(defaultSharedPreferences));
        }
    }
    
    public void b(final boolean e, final boolean b) {
        if (this.e != e) {
            final SharedPreferences$Editor edit = PreferenceManager.getDefaultSharedPreferences(this.c).edit();
            edit.putBoolean("data_alerts_inline", e);
            if (b && !e && !this.d) {
                edit.putBoolean("data_charges_alerts", false);
            }
            edit.apply();
            this.e = e;
        }
    }
    
    public boolean c() {
        this.b();
        return this.f != null && this.f.d && !TelephonyUtil.c();
    }
    
    public String d() {
        this.b();
        if (this.f != null) {
            return this.f.b;
        }
        return null;
    }
    
    public boolean e() {
        this.b();
        return this.f != null && this.f.a();
    }
    
    public String f() {
        this.b();
        if (this.f != null) {
            return this.f.j;
        }
        return null;
    }
    
    public boolean g() {
        this.b();
        return this.c() && this.f.f && this.d;
    }
    
    public boolean h() {
        this.b();
        return this.c() && this.f.f && this.e;
    }
    
    public boolean i() {
        return this.f != null && !this.f.l && com.twitter.library.featureswitch.d.f("twitter_access_video_interstitial_enabled");
    }
    
    public boolean j() {
        boolean b = true;
        if (PreferenceManager.getDefaultSharedPreferences(this.c).getBoolean("twitter_access_cwc_notifications_enabled", b) && this.c() && !TelephonyUtil.c() && com.twitter.library.featureswitch.d.f("twitter_access_cwc_notifications_enabled")) {
            final String d = this.d();
            if (d != null) {
                final ArrayList h = com.twitter.library.featureswitch.d.h("twitter_access_cwc_notifications_carriers_keys");
                if (h == null || h.indexOf(d) == -1) {
                    b = false;
                }
                return b;
            }
        }
        return false;
    }
    
    String k() {
        if (App.f()) {
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.c);
            if (defaultSharedPreferences.contains("twitter_access_carrier")) {
                return defaultSharedPreferences.getString("twitter_access_carrier", "");
            }
        }
        return null;
    }
}
