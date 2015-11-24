// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import com.twitter.android.util.am;
import com.twitter.android.util.ap;
import com.twitter.library.util.ar;
import com.twitter.library.util.bq;
import android.preference.ListPreference;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceScreen;
import com.twitter.android.client.c;
import android.os.Bundle;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.api.account.ab;
import com.twitter.library.client.Session;
import android.preference.Preference;
import com.twitter.library.api.UserSettings;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class PrivacySettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener
{
    private long a;
    
    private void a(final UserSettings userSettings, final Preference preference) {
        if (userSettings != null) {
            if (!userSettings.q) {
                preference.setSummary(2131296809);
                return;
            }
            preference.setSummary(2131296944);
        }
    }
    
    private void a(final Session session, final UserSettings userSettings) {
        this.a(ab.a((Context)this, session, userSettings, false, null));
    }
    
    private void a(final String s) {
        String s2;
        if (s.equals(this.getString(2131298227))) {
            s2 = "privacy_settings:who_can_tag_me::from_anyone:select";
        }
        else if (s.equals(this.getString(2131298228))) {
            s2 = "privacy_settings:who_can_tag_me::from_people_you_follow:select";
        }
        else {
            if (!s.equals(this.getString(2131298229))) {
                return;
            }
            s2 = "privacy_settings:who_can_tag_me:::deselect";
        }
        this.Y.a(this.a, s2);
    }
    
    private Session b() {
        if (this.a != 0L) {
            return this.l().b(this.a);
        }
        return this.m();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        boolean checked = true;
        super.onCreate(bundle);
        this.Y = com.twitter.android.client.c.a((Context)this);
        this.setTitle(2131297764);
        this.addPreferencesFromResource(2131165204);
        this.a = this.getIntent().getLongExtra("account_id", 0L);
        final PreferenceScreen preferenceScreen = (PreferenceScreen)this.findPreference((CharSequence)"privacy_screen");
        final UserSettings j = this.b().j();
        final CheckBoxPreference checkBoxPreference = (CheckBoxPreference)this.findPreference((CharSequence)"protected");
        checkBoxPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        checkBoxPreference.setChecked(j != null && j.j && checked);
        final ListPreference listPreference = (ListPreference)this.findPreference((CharSequence)"allow_media_tagging");
        listPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        if (j != null) {
            listPreference.setValue(j.n);
            bq.a(listPreference, j.n);
        }
        final CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference)this.findPreference((CharSequence)"discoverable_by_email");
        checkBoxPreference2.setChecked(j != null && j.i && checked);
        checkBoxPreference2.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        final CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference)this.findPreference((CharSequence)"discoverable_by_mobile_phone");
        final ar a = ar.a(this.getApplicationContext());
        if (!a.c()) {
            if (a.b()) {
                checkBoxPreference3.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
                checkBoxPreference3.setChecked(j != null && j.l && checked);
            }
            else {
                preferenceScreen.removePreference((Preference)checkBoxPreference3);
            }
        }
        else {
            checkBoxPreference3.setEnabled(false);
            ap.a(this.getApplicationContext()).a(new oh(this, checkBoxPreference3, j, preferenceScreen));
        }
        final Preference preference = this.findPreference((CharSequence)"personalized_ads");
        preference.setIntent(new Intent((Context)this, (Class)PersonalizedAdsSettingsActivity.class));
        this.a(j, preference);
        final CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference)this.findPreference((CharSequence)"allow_dms_from");
        if (j == null || !"all".equals(j.r)) {
            checked = false;
        }
        checkBoxPreference4.setChecked(checked);
        checkBoxPreference4.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        final String key = preference.getKey();
        if (key == null) {
            return false;
        }
        final Session b = this.b();
        final UserSettings j = b.j();
        switch (key) {
            default: {
                return false;
            }
            case "protected": {
                j.j = (boolean)o;
                this.a(b, j);
                break;
            }
            case "allow_media_tagging": {
                final String n2 = (String)o;
                j.n = n2;
                this.a(b, j);
                bq.a((ListPreference)preference, n2);
                this.a(n2);
                break;
            }
            case "discoverable_by_email": {
                j.i = (boolean)o;
                this.a(b, j);
                break;
            }
            case "discoverable_by_mobile_phone": {
                j.l = (boolean)o;
                this.a(b, j);
                break;
            }
            case "allow_dms_from": {
                if (o) {
                    j.r = "all";
                }
                else {
                    j.r = "following";
                }
                this.a(b, j);
                break;
            }
        }
        return true;
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.a(this.b().j(), this.findPreference((CharSequence)"personalized_ads"));
    }
}
