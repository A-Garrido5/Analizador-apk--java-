// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Activity;
import com.twitter.library.client.Session;
import com.twitter.library.service.y;
import com.twitter.library.api.account.ab;
import android.preference.Preference;
import com.twitter.library.api.UserSettings;
import android.net.Uri;
import android.content.Intent;
import android.widget.Toast;
import android.preference.CheckBoxPreference;
import android.content.Context;
import com.twitter.android.client.c;
import android.os.Bundle;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class PersonalizedAdsSettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener
{
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.Y = com.twitter.android.client.c.a((Context)this);
        this.setTitle(2131297749);
        this.addPreferencesFromResource(2131165202);
        final CheckBoxPreference checkBoxPreference = (CheckBoxPreference)this.findPreference((CharSequence)"allow_personalized_ads");
        checkBoxPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        final UserSettings j = this.m().j();
        if (j != null) {
            checkBoxPreference.setChecked(j.q);
        }
        else {
            checkBoxPreference.setEnabled(false);
            Toast.makeText((Context)this, (CharSequence)this.getString(2131297780), 1).show();
            this.finish();
        }
        this.findPreference((CharSequence)"learn_more").setIntent(new Intent((Context)this, (Class)WebViewActivity.class).setData(Uri.parse(this.getString(2131298293))));
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        final String key = preference.getKey();
        if (key == null) {
            return false;
        }
        if ("allow_personalized_ads".equals(key)) {
            final Session m = this.m();
            final UserSettings j = m.j();
            j.q = (boolean)o;
            String s;
            if (j.q) {
                s = "privacy_settings:personalized_ads:::opt_in";
            }
            else {
                s = "privacy_settings:personalized_ads:::opt_out";
            }
            this.a(ab.a((Context)this, m, j, false, null));
            this.Y.a(m.g(), s);
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
