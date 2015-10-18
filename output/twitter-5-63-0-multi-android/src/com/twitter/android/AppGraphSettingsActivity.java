// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Activity;
import com.twitter.library.client.v;
import android.preference.Preference;
import com.twitter.library.api.b;
import android.net.Uri;
import android.content.Intent;
import com.twitter.library.client.u;
import android.content.Context;
import com.twitter.android.client.c;
import android.os.Bundle;
import com.twitter.library.client.m;
import android.text.TextUtils;
import com.twitter.library.client.k;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.preference.CheckBoxPreference;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class AppGraphSettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener
{
    private void a(final boolean enabled, final boolean checked, final int summary) {
        final CheckBoxPreference checkBoxPreference = (CheckBoxPreference)this.findPreference((CharSequence)"allow_app_graph");
        checkBoxPreference.setEnabled(enabled);
        checkBoxPreference.setChecked(checked);
        if (summary > 0) {
            checkBoxPreference.setSummary(summary);
            return;
        }
        checkBoxPreference.setSummary((CharSequence)"");
    }
    
    public void a(final int n, final y y) {
        super.a(n, y);
        final aa aa = (aa)y.l().b();
        if (n == 1) {
            final k k = new k(this.getApplicationContext(), this.m().e());
            if (!aa.a()) {
                this.a(false, false, 2131296318);
                return;
            }
            final String f = ((ov)y).f();
            final m a = k.a();
            String s;
            if (!TextUtils.isEmpty((CharSequence)f)) {
                s = f;
            }
            else {
                s = "undetermined";
            }
            a.a("app_graph_status", s).apply();
            if (!TextUtils.isEmpty((CharSequence)f) && !"undetermined".equals(f)) {
                this.a(true, "optin".equals(f), 0);
                return;
            }
            this.a(false, false, 2131296319);
        }
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.Y = com.twitter.android.client.c.a((Context)this);
        this.setTitle(2131297670);
        final String stringExtra = this.getIntent().getStringExtra("AppGraphSettingsActivity_account_name");
        this.addPreferencesFromResource(2131165188);
        final String string = new k((Context)this, stringExtra).getString("app_graph_status", "undetermined");
        this.findPreference((CharSequence)"allow_app_graph").setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        final b a = u.a.a();
        if (a != null && a.b()) {
            this.a(false, false, 2131296317);
        }
        else {
            this.a(new ov(this.getApplicationContext(), this.m()), 1);
            if (string.equals("undetermined")) {
                this.a(false, false, 2131296319);
            }
            else {
                this.a(true, string.equals("optin"), 0);
            }
        }
        this.findPreference((CharSequence)"app_graph_learn_more").setIntent(new Intent((Context)this, (Class)WebViewActivity.class).setData(Uri.parse(this.getString(2131298292))));
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        final String key = preference.getKey();
        if (key != null && "allow_app_graph".equals(key)) {
            String s;
            if (o) {
                s = "optin";
            }
            else {
                s = "optout";
            }
            v.a((Context)this).a(s);
            return true;
        }
        return false;
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        if (!this.m().d()) {
            DispatchActivity.a((Activity)this, this.getIntent());
        }
    }
}
