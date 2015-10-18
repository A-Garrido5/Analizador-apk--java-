// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.bh;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.preference.CheckBoxPreference;
import com.twitter.android.client.c;
import com.twitter.android.client.am;
import com.twitter.library.util.bq;
import android.preference.ListPreference;
import android.content.Context;
import android.preference.PreferenceManager;
import android.os.Bundle;
import android.content.Intent;
import android.text.TextUtils;
import android.preference.Preference;
import android.content.SharedPreferences;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class GeneralSettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener, Preference$OnPreferenceClickListener
{
    private SharedPreferences a;
    private Preference b;
    private sp c;
    
    private void b() {
        if (this.a.getBoolean("proxy_enabled", false)) {
            final String string = this.a.getString("proxy_host", "");
            if (!TextUtils.isEmpty((CharSequence)string)) {
                final String string2 = this.a.getString("proxy_port", "");
                final StringBuilder sb = new StringBuilder(string);
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    sb.append(':').append(string2);
                }
                this.b.setSummary((CharSequence)sb.toString());
                return;
            }
        }
        this.b.setSummary(2131297686);
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n == 1 && n2 == -1) {
            this.b();
        }
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.addPreferencesFromResource(2131165197);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this);
        this.a = defaultSharedPreferences;
        final Preference preference = this.findPreference((CharSequence)"advanced_proxy");
        preference.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        this.b = preference;
        this.b();
        final Preference preference2 = this.findPreference((CharSequence)"font_size");
        bq.a((ListPreference)preference2, defaultSharedPreferences.getString("font_size", this.getString(2131298165)));
        preference2.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        this.c = sp.a((Context)this.getApplication());
        final Preference preference3 = this.findPreference((CharSequence)"location");
        if (this.c.c()) {
            preference3.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        }
        else {
            this.getPreferenceScreen().removePreference(preference3);
        }
        if (!am.a()) {
            final Preference preference4 = this.findPreference((CharSequence)"in_app_browser");
            if (preference4 != null) {
                this.getPreferenceScreen().removePreference(preference4);
            }
        }
        if (com.twitter.android.client.c.a((Context)this).l()) {
            final CheckBoxPreference checkBoxPreference = new CheckBoxPreference((Context)this);
            ((Preference)checkBoxPreference).setKey("readability_mode");
            ((Preference)checkBoxPreference).setTitle(2131297769);
            ((Preference)checkBoxPreference).setSummary(2131297768);
            ((Preference)checkBoxPreference).setDefaultValue((Object)true);
            ((Preference)checkBoxPreference).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
            this.getPreferenceScreen().addPreference((Preference)checkBoxPreference);
        }
        if (defaultSharedPreferences.contains("twitter_access_config")) {
            final CheckBoxPreference checkBoxPreference2 = new CheckBoxPreference((Context)this);
            ((Preference)checkBoxPreference2).setKey("data_charges_alerts");
            ((Preference)checkBoxPreference2).setTitle(2131297675);
            ((Preference)checkBoxPreference2).setSummary(2131297674);
            ((Preference)checkBoxPreference2).setDefaultValue((Object)true);
            ((Preference)checkBoxPreference2).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
            this.getPreferenceScreen().addPreference((Preference)checkBoxPreference2);
        }
        else {
            final Preference preference5 = this.findPreference((CharSequence)"data_charges_alerts");
            if (preference5 != null) {
                this.getPreferenceScreen().removePreference(preference5);
            }
        }
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        final String key = preference.getKey();
        if (key == null) {
            return false;
        }
        switch (key) {
            default: {
                return false;
            }
            case "location": {
                if ((boolean)o && !sk.a().e()) {
                    final in in = new in(this);
                    new AlertDialog$Builder((Context)this).setMessage(2131296802).setPositiveButton(2131297667, (DialogInterface$OnClickListener)in).setNegativeButton(2131296445, (DialogInterface$OnClickListener)in).setCancelable(false).create().show();
                    break;
                }
                break;
            }
            case "data_charges_alerts": {
                final boolean booleanValue = (boolean)o;
                final bh a = bh.a((Context)this);
                a.a(booleanValue, false);
                a.b(booleanValue, false);
                break;
            }
            case "font_size": {
                bq.a((ListPreference)preference, (String)o);
                break;
            }
        }
        return true;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        final String key = preference.getKey();
        if ("advanced_proxy".equals(key)) {
            this.startActivityForResult(new Intent((Context)this, (Class)ProxySettingsActivity.class), 1);
            return true;
        }
        if ("readability_mode".equals(key)) {
            String s;
            if (((CheckBoxPreference)preference).isChecked()) {
                s = "settings::::enable_quick_read";
            }
            else {
                s = "settings::::disable_quick_read";
            }
            this.Y.a(this.l().b().g(), s);
            return true;
        }
        return false;
    }
}
