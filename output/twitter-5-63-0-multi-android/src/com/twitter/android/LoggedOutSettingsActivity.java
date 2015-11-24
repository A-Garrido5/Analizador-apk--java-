// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.preference.PreferenceScreen;
import com.twitter.library.client.App;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.library.featureswitch.d;
import android.preference.Preference$OnPreferenceClickListener;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.android.dialog.LoggedOutSettingDialogFragmentActivity;
import com.twitter.library.util.am;
import android.preference.CheckBoxPreference;

public class LoggedOutSettingsActivity extends DebugSettingsActivity
{
    CheckBoxPreference a;
    CheckBoxPreference b;
    Long c;
    private com.twitter.library.util.am d;
    
    protected void a(final int n) {
        int n2;
        if (n == 1) {
            n2 = 2131297754;
        }
        else {
            n2 = 2131297683;
        }
        int n3;
        if (n == 1) {
            n3 = 2131297753;
        }
        else {
            n3 = 2131297682;
        }
        this.startActivityForResult(new Intent(this.getBaseContext(), (Class)LoggedOutSettingDialogFragmentActivity.class).putExtra("message", n3).putExtra("title", n2).putExtra("extra_dialog_id", n), 0);
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n2 == -1 && n == 0) {
            final boolean booleanExtra = intent.getBooleanExtra("user_choice", false);
            String s = "ok";
            String s2;
            if (intent.getIntExtra("extra_dialog_id", 0) == 0) {
                s2 = "email_disco";
                if (!booleanExtra) {
                    s = "cancel";
                    this.d.a(Boolean.valueOf(true));
                    this.a.setChecked(true);
                }
            }
            else {
                s2 = "phone_disco";
                if (!booleanExtra) {
                    s = "cancel";
                    this.d.b(true);
                    this.b.setChecked(true);
                }
            }
            if (booleanExtra) {
                this.Y.a(this.c, new String[] { "signup_settings", s2 + ":::disabled" });
            }
            this.Y.a(this.c, "signup_settings", s2, "dialog", s, "click");
        }
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.c = this.m().g();
        this.Y.a(this.c, "signup_settings::::impression");
        this.d = com.twitter.library.util.am.a((Context)this);
        this.addPreferencesFromResource(2131165198);
        final PreferenceScreen preferenceScreen = this.getPreferenceScreen();
        this.findPreference((CharSequence)"advanced_proxy").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.a = (CheckBoxPreference)this.findPreference((CharSequence)"email_disco");
        this.b = (CheckBoxPreference)this.findPreference((CharSequence)"phone_disco");
        int n;
        if (this.getIntent().getBooleanExtra("show_disco_settings", false) && com.twitter.library.featureswitch.d.f("android_logged_out_advanced_signup_settings_enabled")) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            this.a.setChecked(this.d.a());
            this.a.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
            this.b.setChecked(this.d.b());
            this.b.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        }
        else {
            preferenceScreen.removePreference((Preference)this.a);
            preferenceScreen.removePreference((Preference)this.b);
        }
        if (App.f()) {
            this.b();
            this.c();
        }
    }
    
    @Override
    protected void onPause() {
        this.d.c();
        super.onPause();
    }
    
    @Override
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        final String key = preference.getKey();
        final boolean booleanValue = (boolean)o;
        switch (key) {
            default: {
                return super.onPreferenceChange(preference, o);
            }
            case "email_disco": {
                this.Y.a(this.c, "signup_settings:email_disco:::click");
                if (booleanValue) {
                    this.Y.a(this.c, "signup_settings:email_disco:::enabled");
                    this.d.a(Boolean.valueOf(true));
                    break;
                }
                this.d.a(Boolean.valueOf(false));
                this.a(0);
                break;
            }
            case "phone_disco": {
                this.Y.a(this.c, "signup_settings:phone_disco:::click");
                if (booleanValue) {
                    this.Y.a(this.c, "signup_settings:phone_disco:::enabled");
                    this.d.b(true);
                    break;
                }
                this.d.b(false);
                this.a(1);
                break;
            }
        }
        return true;
    }
    
    @Override
    public boolean onPreferenceClick(final Preference preference) {
        if ("advanced_proxy".equals(preference.getKey())) {
            this.Y.a(this.c, "signup_settings:proxy:::click");
            this.startActivity(new Intent((Context)this, (Class)ProxySettingsActivity.class));
            return true;
        }
        return super.onPreferenceClick(preference);
    }
}
