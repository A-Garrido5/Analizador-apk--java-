// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.util.bq;
import android.content.DialogInterface$OnCancelListener;
import android.app.ProgressDialog;
import android.app.Dialog;
import com.twitter.android.widget.CheckBoxListPreference;
import android.os.Bundle;
import android.widget.Toast;
import android.os.Handler;
import android.content.BroadcastReceiver;
import com.twitter.library.provider.ae;
import com.twitter.library.platform.PushService;
import android.content.IntentFilter;
import com.twitter.library.client.az;
import com.twitter.android.util.bi;
import java.io.Serializable;
import com.twitter.library.featureswitch.d;
import android.preference.PreferenceGroup;
import android.content.SharedPreferences;
import android.view.View;
import android.view.View$OnClickListener;
import com.twitter.android.client.c;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.Intent;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.Session;
import android.preference.PreferenceCategory;
import com.twitter.library.featureswitch.n;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;
import com.twitter.errorreporter.ErrorReporter;
import android.accounts.Account;
import com.twitter.android.highlights.e;
import com.twitter.library.provider.k;
import com.twitter.library.provider.b;
import com.twitter.library.api.account.aa;
import com.twitter.library.api.account.p;
import android.content.Context;
import com.twitter.library.util.a;
import android.preference.ListPreference;
import com.twitter.library.provider.NotificationSetting;
import android.content.ContentValues;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.os.AsyncTask;

class mw extends AsyncTask
{
    final /* synthetic */ NotificationSettingsActivity a;
    private boolean b;
    private boolean c;
    private final String d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    
    public mw(final NotificationSettingsActivity a, final String d) {
        this.a = a;
        this.d = d;
    }
    
    private int a(final Preference preference) {
        if (preference != null && ((CheckBoxPreference)preference).isChecked()) {
            return 1;
        }
        return 0;
    }
    
    private void a(final int n, final String s) {
        switch (n) {
            default: {}
            case 0: {
                this.a.Y.a(this.a.m().g(), "settings", "notifications", s, null, "deselect");
            }
            case 1: {
                this.a.Y.a(this.a.m().g(), "settings", "notifications", s, null, "select");
            }
        }
    }
    
    private void a(final ContentValues contentValues, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int n17) {
        contentValues.put("notif_mention", 0x0 | NotificationSetting.a.b(n3) | NotificationSetting.b.b(n4) | NotificationSetting.c.b(n5) | NotificationSetting.d.b(n6) | NotificationSetting.h.b(n7) | NotificationSetting.l.b(n13) | NotificationSetting.m.b(n14) | NotificationSetting.o.b(n15));
        contentValues.put("notif_message", NotificationSetting.e.b(n2));
        contentValues.put("notif_tweet", NotificationSetting.g.b(n));
        contentValues.put("notif_experimental", NotificationSetting.i.b(n8));
        contentValues.put("notif_lifeline_alerts", NotificationSetting.f.b(n9));
        contentValues.put("notif_recommendations", NotificationSetting.j.b(n10));
        contentValues.put("notif_news", NotificationSetting.k.b(n11));
        contentValues.put("notif_vit_notable_event", NotificationSetting.n.b(n12));
        contentValues.put("notif_offer_redemption", NotificationSetting.p.b(n16));
        contentValues.put("notif_highlights", NotificationSetting.q.b(n17));
    }
    
    private int b(final Preference preference) {
        if (this.a.d) {
            return Integer.parseInt(((ListPreference)preference).getValue());
        }
        return this.a(preference);
    }
    
    private void b(final int n, final String s) {
        switch (n) {
            default: {}
            case 0: {
                this.a.Y.a(this.a.m().g(), "settings:notifications:" + s + "::deselect");
            }
            case 1: {
                this.a.Y.a(this.a.m().g(), "settings:notifications:" + s + ":from_people_you_follow:select");
            }
            case 2: {
                this.a.Y.a(this.a.m().g(), "settings:notifications:" + s + ":from_anyone:select");
            }
        }
    }
    
    protected Void a(final Void... array) {
        if (!this.b && !this.c) {
            return null;
        }
        final NotificationSettingsActivity a = this.a;
        final Account a2 = com.twitter.library.util.a.a((Context)a, this.d);
        final boolean d = this.a.d;
        final int e = this.e;
        final int j = this.j;
        final int f = this.f;
        final int g = this.g;
        final int h = this.h;
        final int i = this.i;
        final int k = this.k;
        final int l = this.l;
        final int m = this.m;
        final int n = this.n;
        final int o = this.o;
        final int p = this.p;
        final int r = this.r;
        final int s = this.s;
        final int q = this.q;
        final int t = this.t;
        final int u = this.u;
        final boolean f2 = com.twitter.library.api.account.p.f((Context)a, this.a.a);
        final ContentValues contentValues = new ContentValues(10);
        if (this.c) {
            contentValues.put("vibrate", this.w);
            contentValues.put("ringtone", this.a.e);
            contentValues.put("light", this.x);
        }
        if (this.b) {
            if (!d) {
                this.a(contentValues, e, j, f, g, h, i, k, l, m, n, o, p, r, s, q, t, u);
            }
            else if (!this.v && !f2) {
                this.a(contentValues, e, j, f, g, h, i, k, l, m, n, o, p, r, s, q, t, u);
                final aa aa = (aa)new aa((Context)this.a, this.a.m()).c(3);
                aa.e = a2;
                aa.g = true;
                this.a.a(aa);
            }
            else if (!this.v) {
                this.a.Y.a(a2, 1024);
            }
            else {
                final int n2 = 0x0 | NotificationSetting.g.a(e) | NotificationSetting.a.a(f) | NotificationSetting.b.a(g) | NotificationSetting.c.a(h) | NotificationSetting.d.a(i) | NotificationSetting.e.a(j) | NotificationSetting.h.a(k) | NotificationSetting.i.a(l) | NotificationSetting.f.a(m) | NotificationSetting.j.a(n) | NotificationSetting.k.a(o) | NotificationSetting.n.a(p) | NotificationSetting.l.a(r) | NotificationSetting.m.a(s) | NotificationSetting.o.a(q);
                int n3;
                if (f2) {
                    n3 = 1024;
                }
                else {
                    n3 = 0;
                }
                this.a.Y.a(a2, n3 | n2 | NotificationSetting.p.a(t) | NotificationSetting.q.a(u));
            }
        }
        if (contentValues.size() > 0) {
            final b b = new b(((Context)a).getContentResolver());
            com.twitter.library.provider.k.a((Context)this.a).a(this.d, contentValues, d, b);
            b.a();
        }
        if (this.a.n != f) {
            this.b(f, "mention");
        }
        if (this.a.r != j) {
            this.a(j, "message");
        }
        if (this.a.m != e) {
            this.a(e, "tweet");
        }
        if (this.a.o != g) {
            this.b(g, "retweet");
        }
        if (this.a.p != h) {
            this.b(h, "favorite");
        }
        if (this.a.q != i) {
            this.a(i, "follow");
        }
        if (this.a.s != k) {
            this.a(k, "address_book");
        }
        if (this.a.t != l) {
            this.a(l, "experimental");
        }
        if (this.a.u != m) {
            this.a(m, "lifeline_alert");
        }
        if (this.a.v != n) {
            this.b(n, "recommendation");
        }
        if (this.a.w != o) {
            this.a(o, "news");
        }
        if (this.a.x != p) {
            this.a(p, "vit_notable_event");
        }
        if (this.a.y != q) {
            this.a(q, "followed_verified");
        }
        if (this.a.B != t) {
            this.a(t, "offer_redemption");
        }
        int n4;
        if (this.a.C != u) {
            this.a(u, "highlights");
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        if (this.a.G != this.v) {
            if (u == 1) {
                n4 = 1;
            }
            if (this.v) {
                this.a.Y.a(this.a.m().g(), "settings:notifications:::enable_notifications");
            }
            else {
                this.a.Y.a(this.a.m().g(), "settings:notifications:::disable_notifications");
            }
        }
        if (n4 != 0) {
            final boolean b2 = u == 1 && this.v;
            final com.twitter.library.client.k k2 = new com.twitter.library.client.k((Context)a, this.a.a);
            final StringBuilder append = new StringBuilder().append("settings:notifications:highlights::");
            String s2;
            if (b2) {
                s2 = "opt_in";
            }
            else {
                s2 = "opt_out";
            }
            com.twitter.android.highlights.e.a(this.a.m().g(), k2, b2, true, this.a.Y, append.append(s2).toString());
        }
        return null;
    }
    
    protected void onPreExecute() {
        super.onPreExecute();
        if (this.a.d) {
            this.v = this.a.o();
            if (this.a.f) {
                this.e = 1;
            }
            else {
                this.e = 0;
            }
            this.l = this.a(this.a.O);
            this.k = this.a(this.a.N);
            this.n = this.a(this.a.R);
            this.o = this.a(this.a.S);
            if (this.a.h) {
                this.r = 1;
            }
            else {
                this.r = 0;
            }
            if (this.a.j) {
                this.s = 1;
            }
            else {
                this.s = 0;
            }
        }
        else {
            this.e = this.a(this.a.I);
        }
        if (this.a.l) {
            final int b = this.b((Preference)this.a.W);
            if (b == 1) {
                this.q = 0;
                this.i = 1;
            }
            else if (b == 2) {
                this.q = 1;
                this.i = 0;
            }
            else {
                this.q = 0;
                this.i = 0;
            }
        }
        else {
            this.i = this.a(this.a.M);
        }
        this.j = this.a(this.a.P);
        this.f = this.b(this.a.J);
        this.m = this.a(this.a.Q);
        this.n = this.a(this.a.R);
        this.o = this.a(this.a.S);
        this.p = this.a(this.a.T);
        this.t = this.a(this.a.U);
        this.u = this.a(this.a.V);
        this.g = this.b(this.a.K);
        this.h = this.b(this.a.L);
        if (this.a.d) {
            if (this.g != 0) {
                this.r = this.l;
            }
            else {
                this.r = 0;
            }
            if (this.h != 0) {
                this.s = this.l;
            }
            else {
                this.s = 0;
            }
        }
        this.b = (this.a.n != this.f || this.a.r != this.j || this.a.o != this.g || this.a.p != this.h || this.a.q != this.i || this.a.m != this.e || this.a.G != this.v || this.a.s != this.k || this.a.t != this.l || this.a.u != this.m || this.a.v != this.n || this.a.w != this.o || this.a.x != this.p || this.a.y != this.q || this.a.z != this.r || this.a.A != this.s || this.a.B != this.t || this.a.C != this.u);
        for (final String s : NotificationSettingsActivity.Z) {
            if (this.a.findPreference((CharSequence)s) == null) {
                ErrorReporter.a(new IllegalStateException("NotificationSettingsActivity preference (key: " + s + ") was unexpectedly null in " + "WriteAccountUserTask.onPreExecute()"));
                return;
            }
        }
        this.x = ((CheckBoxPreference)this.a.findPreference((CharSequence)"use_led")).isChecked();
        this.w = ((CheckBoxPreference)this.a.findPreference((CharSequence)"vibrate")).isChecked();
        boolean c = false;
        Label_0929: {
            if (this.a.E == this.x && this.a.D == this.w) {
                final String f = this.a.F;
                c = false;
                if (f == null) {
                    break Label_0929;
                }
                final boolean equals = this.a.F.equals(this.a.e);
                c = false;
                if (equals) {
                    break Label_0929;
                }
            }
            c = true;
        }
        this.c = c;
    }
}
