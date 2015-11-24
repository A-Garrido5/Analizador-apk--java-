// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.commerce.view.OrderHistoryActivity;
import com.twitter.android.commerce.view.ProfileSummaryActivity;
import com.twitter.library.client.Session;
import com.twitter.library.client.App;
import com.twitter.library.client.k;
import android.os.Bundle;
import android.app.Activity;
import com.twitter.library.service.aa;
import com.twitter.android.dialog.EnterPasswordDialogActivity;
import com.twitter.library.api.account.ab;
import com.twitter.android.client.c;
import com.twitter.android.dialog.RemovePhoneDialogActivity;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.featureswitch.d;
import android.widget.Toast;
import android.text.TextUtils;
import android.content.Intent;
import android.preference.PreferenceCategory;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;
import com.twitter.library.api.UserSettings;
import android.preference.CheckBoxPreference;
import com.twitter.library.util.bq;
import android.preference.ListPreference;
import android.database.Cursor;
import com.twitter.library.util.a;
import com.twitter.library.provider.ae;
import android.net.Uri;
import com.twitter.library.provider.n;
import android.content.Context;
import com.twitter.library.platform.PushService;
import android.content.ContentResolver;
import android.os.AsyncTask;

class f extends AsyncTask
{
    final /* synthetic */ AccountSettingsActivity a;
    private final String b;
    private final boolean c;
    private boolean d;
    private int e;
    
    public f(final AccountSettingsActivity a, final String b) {
        this.a = a;
        this.b = b;
        this.c = ContentResolver.getMasterSyncAutomatically();
    }
    
    protected Void a(final Void... array) {
        if (this.a.d) {
            this.publishProgress((Object[])new Boolean[] { PushService.g((Context)this.a, this.b) });
        }
        final String b = this.b;
        final Cursor query = this.a.getContentResolver().query(Uri.withAppendedPath(n.a, b), new String[] { "interval" }, (String)null, (String[])null, (String)null);
        int int1 = 60;
        if (query != null) {
            if (query.moveToFirst() && !query.isNull(0)) {
                int1 = query.getInt(0);
            }
            query.close();
        }
        this.e = int1;
        this.d = com.twitter.library.util.a.a((Context)this.a, b, ae.c);
        return null;
    }
    
    protected void a(final Void void1) {
        if (this.a.isFinishing()) {
            return;
        }
        this.a.e.setChecked(this.d);
        if (!this.c) {
            this.a.e.setSummary(2131297775);
        }
        else {
            this.a.a(this.d);
        }
        final ListPreference listPreference = (ListPreference)this.a.findPreference((CharSequence)"polling_interval");
        final String value = String.valueOf(this.e);
        listPreference.setValue(value);
        bq.a(listPreference, value);
        final UserSettings a = this.a.f();
        ((CheckBoxPreference)this.a.findPreference((CharSequence)"display_sensitive_media")).setChecked(a != null && a.k);
        if (a != null && this.a.b()) {
            this.a.b(a.p);
        }
        this.a.a = this.d;
        this.a.c = this.e;
    }
    
    protected void onPreExecute() {
        this.a.e.setEnabled(this.c);
    }
}
