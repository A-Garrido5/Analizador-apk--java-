// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.DialogInterface$OnCancelListener;
import android.app.ProgressDialog;
import android.app.Dialog;
import com.twitter.android.widget.CheckBoxListPreference;
import android.os.Bundle;
import android.widget.Toast;
import com.twitter.library.api.account.p;
import android.os.Handler;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.google.android.gcm.b;
import com.twitter.android.commerce.util.e;
import com.twitter.android.util.bi;
import java.io.Serializable;
import com.twitter.library.featureswitch.d;
import com.twitter.errorreporter.ErrorReporter;
import android.preference.PreferenceGroup;
import android.content.SharedPreferences;
import android.view.View;
import android.view.View$OnClickListener;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.ViewGroup;
import com.twitter.internal.android.service.a;
import android.content.Intent;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.Session;
import android.preference.PreferenceCategory;
import android.preference.Preference$OnPreferenceClickListener;
import com.twitter.android.client.TwitterPreferenceActivity;
import android.preference.PreferenceManager;
import com.twitter.util.c;
import android.database.Cursor;
import android.content.ContentResolver;
import com.twitter.library.provider.ae;
import android.content.ContentUris;
import com.twitter.library.provider.be;
import com.twitter.library.client.az;
import com.twitter.library.provider.NotificationSetting;
import android.net.Uri;
import com.twitter.library.provider.n;
import android.content.Context;
import com.twitter.library.platform.PushService;
import android.preference.CheckBoxPreference;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.library.util.bq;
import android.preference.ListPreference;
import android.preference.Preference;
import android.os.AsyncTask;

class mu extends AsyncTask
{
    final /* synthetic */ NotificationSettingsActivity a;
    private boolean b;
    private boolean c;
    private String d;
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
    private int v;
    private boolean w;
    private final String x;
    
    public mu(final NotificationSettingsActivity a, final String x) {
        this.a = a;
        this.x = x;
    }
    
    private void a(final Preference preference, final int n) {
        if (this.a.d) {
            final ListPreference listPreference = (ListPreference)preference;
            final String value = String.valueOf(n);
            listPreference.setValue(value);
            bq.a(listPreference, value);
            listPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this.a);
            return;
        }
        this.b(preference, n);
    }
    
    private void b(final Preference preference, final int n) {
        boolean checked = true;
        final CheckBoxPreference checkBoxPreference = (CheckBoxPreference)preference;
        if (n != (checked ? 1 : 0)) {
            checked = false;
        }
        checkBoxPreference.setChecked(checked);
    }
    
    protected Void a(final Void... array) {
        if (this.a.d) {
            this.w = PushService.g((Context)this.a, this.x);
        }
        final ContentResolver contentResolver = this.a.getContentResolver();
        final String x = this.x;
        final Cursor query = contentResolver.query(Uri.withAppendedPath(com.twitter.library.provider.n.a, x), new String[] { "vibrate", "ringtone", "light", "notif_tweet", "notif_mention", "notif_message", "notif_experimental", "notif_lifeline_alerts", "notif_recommendations", "notif_news", "notif_vit_notable_event", "notif_offer_redemption", "notif_highlights" }, (String)null, (String[])null, (String)null);
        boolean b = true;
        String s = com.twitter.library.provider.n.b;
        boolean b2 = true;
        int int1;
        int int2;
        int int3;
        int int4;
        int int5;
        int int6;
        int int7;
        int int8;
        int n;
        if (this.a.d) {
            int1 = 0;
            int2 = 0;
            int3 = 0;
            int4 = 0;
            int5 = 0;
            int6 = 0;
            int7 = 0;
            int8 = 0;
            n = 0;
        }
        else {
            int1 = 2005;
            int2 = 1;
            int3 = 1;
            int4 = 1;
            int5 = 1;
            int6 = 1;
            int7 = 1;
            int8 = 1;
            n = 1;
        }
        int int9 = 0;
        int n3 = 0;
        boolean c = false;
        String d = null;
        boolean b4 = false;
        Label_0540: {
            if (query != null) {
                final boolean moveToFirst = query.moveToFirst();
                int9 = 0;
                while (true) {
                    Label_0896: {
                        if (!moveToFirst) {
                            break Label_0896;
                        }
                        if (!query.isNull(0)) {
                            b = (query.getInt(0) == 1);
                        }
                        if (!query.isNull(1)) {
                            s = query.getString(1);
                        }
                        if (!query.isNull(2)) {
                            b2 = (query.getInt(2) == 1);
                        }
                        final boolean null = query.isNull(3);
                        int9 = 0;
                        if (!null) {
                            int9 = query.getInt(3);
                        }
                        if (!query.isNull(4)) {
                            int1 = query.getInt(4);
                        }
                        if (!query.isNull(5)) {
                            int2 = query.getInt(5);
                        }
                        if (!query.isNull(6)) {
                            int3 = query.getInt(6);
                        }
                        if (!query.isNull(7)) {
                            int4 = query.getInt(7);
                        }
                        if (!query.isNull(8)) {
                            int5 = query.getInt(8);
                        }
                        if (!query.isNull(9)) {
                            int6 = query.getInt(9);
                        }
                        if (!query.isNull(10)) {
                            int7 = query.getInt(10);
                        }
                        if (!query.isNull(11)) {
                            int8 = query.getInt(11);
                        }
                        if (query.isNull(12)) {
                            break Label_0896;
                        }
                        final int int10 = query.getInt(12);
                        final boolean b3 = b;
                        final int n2 = int10;
                        query.close();
                        n3 = int1;
                        c = b2;
                        d = s;
                        b4 = b3;
                        n = n2;
                        break Label_0540;
                    }
                    final int n4 = n;
                    final boolean b3 = b;
                    final int n2 = n4;
                    continue;
                }
            }
            n3 = int1;
            c = b2;
            d = s;
            b4 = b;
            int9 = 0;
        }
        this.e = NotificationSetting.g.c(int9);
        if (this.e == 1) {
            final long g = az.a((Context)this.a).b(x).g();
            final Cursor query2 = contentResolver.query(ae.a(ContentUris.withAppendedId(be.m, g), g), new String[] { "_id" }, (String)null, (String[])null, (String)null);
            if (query2 != null) {
                this.f = query2.getCount();
                query2.close();
            }
        }
        this.b = b4;
        this.d = d;
        this.c = c;
        this.g = NotificationSetting.a.c(n3);
        this.h = NotificationSetting.b.c(n3);
        this.i = NotificationSetting.c.c(n3);
        this.j = NotificationSetting.d.c(n3);
        this.r = NotificationSetting.o.c(n3);
        this.k = NotificationSetting.e.c(int2);
        this.n = NotificationSetting.f.c(int4);
        if (this.a.d) {
            this.l = NotificationSetting.h.c(n3);
            this.m = NotificationSetting.i.c(int3);
            this.s = NotificationSetting.l.c(n3);
            this.t = NotificationSetting.m.c(n3);
            this.o = NotificationSetting.j.c(int5);
            this.p = NotificationSetting.k.c(int6);
            this.q = NotificationSetting.n.c(int7);
            this.u = NotificationSetting.p.c(int8);
            this.v = NotificationSetting.q.c(n);
        }
        return null;
    }
    
    protected void a(final Void void1) {
        if (this.a.isFinishing()) {
            return;
        }
        final Context applicationContext = this.a.getApplicationContext();
        final Preference preference = this.a.findPreference((CharSequence)"vibrate");
        if (!com.twitter.util.c.e(applicationContext)) {
            preference.setSelectable(this.b = false);
            preference.setSummary(2131297784);
        }
        this.a.D = this.b;
        ((CheckBoxPreference)preference).setChecked(this.b);
        this.a.findPreference((CharSequence)"ringtone").setDefaultValue((Object)this.d);
        PreferenceManager.getDefaultSharedPreferences(applicationContext).edit().putString("ringtone", this.d).apply();
        this.a.F = this.d;
        this.a.e = this.a.F;
        ((CheckBoxPreference)this.a.findPreference((CharSequence)"use_led")).setChecked(this.c);
        this.a.E = this.c;
        this.a(this.a.J, this.g);
        if (this.a.l) {
            if (this.r > 0) {
                this.a((Preference)this.a.W, 2);
            }
            else if (this.j > 0) {
                this.a((Preference)this.a.W, 1);
            }
            else {
                this.a((Preference)this.a.W, 0);
            }
        }
        else {
            this.b(this.a.M, this.j);
        }
        this.b(this.a.P, this.k);
        if (this.a.d) {
            this.a.a(this.e == 1, this.f);
            this.a.G = this.w;
            this.b(this.a.Q, this.n);
            this.b(this.a.N, this.l);
            this.b(this.a.O, this.m);
            this.b(this.a.R, this.o);
            this.b(this.a.S, this.p);
            this.b(this.a.T, this.q);
            this.b(this.a.U, this.u);
            this.b(this.a.V, this.v);
            this.a(this.a.K, this.h);
            this.a(this.a.L, this.i);
            this.a.s = this.l;
            this.a.t = this.m;
            this.a.g = this.h;
            this.a.i = this.i;
            this.a.k = this.r;
            this.a.v = this.o;
            this.a.w = this.p;
            this.a.x = this.q;
            this.a.y = this.r;
            this.a.z = this.s;
            this.a.A = this.t;
            this.a.B = this.u;
            this.a.C = this.v;
        }
        else {
            this.b(this.a.I, this.e);
            this.a(this.a.K, this.h);
            this.a(this.a.L, this.i);
        }
        this.a.n = this.g;
        this.a.r = this.k;
        this.a.m = this.e;
        this.a.o = this.h;
        this.a.p = this.i;
        this.a.q = this.j;
        this.a.u = this.n;
        this.a.b(this.w);
    }
    
    protected void onPreExecute() {
        super.onPreExecute();
        this.a.b(false);
    }
}
