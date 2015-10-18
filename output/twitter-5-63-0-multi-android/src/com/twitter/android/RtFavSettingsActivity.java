// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.preference.Preference;
import android.content.Intent;
import com.twitter.library.util.bq;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.os.Bundle;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class RtFavSettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener
{
    String a;
    String b;
    int c;
    boolean d;
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = this.getIntent();
        this.a = intent.getStringExtra("pref_choice_key");
        this.b = intent.getStringExtra("pref_mention_key");
        this.c = intent.getIntExtra("pref_choice", 0);
        this.d = intent.getBooleanExtra("pref_mention", false);
        this.setTitle((CharSequence)intent.getStringExtra("pref_title"));
        this.addPreferencesFromResource(intent.getIntExtra("pref_xml", 0));
        final ListPreference listPreference = (ListPreference)this.findPreference((CharSequence)this.a);
        final CheckBoxPreference checkBoxPreference = (CheckBoxPreference)this.findPreference((CharSequence)this.b);
        final String value = String.valueOf(this.c);
        listPreference.setValue(value);
        bq.a(listPreference, value);
        checkBoxPreference.setChecked(this.d);
        listPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        checkBoxPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        if (this.a.equals(preference.getKey())) {
            this.c = Integer.parseInt((String)o);
            bq.a((ListPreference)preference, (String)o);
            if (this.d && this.c == 0) {
                this.d = false;
                ((CheckBoxPreference)this.findPreference((CharSequence)this.b)).setChecked(false);
            }
        }
        else if (this.b.equals(preference.getKey())) {
            if (this.c <= 0) {
                return false;
            }
            this.d = (boolean)o;
        }
        this.setResult(-1, new Intent().putExtra("pref_choice", this.c).putExtra("pref_mention", this.d));
        return true;
    }
}
