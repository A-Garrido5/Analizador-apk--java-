// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.SharedPreferences;
import android.content.Context;
import android.preference.PreferenceManager;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class PtrDebugSettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener
{
    private Preference a;
    private Preference b;
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.addPreferencesFromResource(2131165206);
        (this.a = this.findPreference((CharSequence)"inject_ptr_index")).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        (this.b = this.findPreference((CharSequence)"inject_ptr_order")).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this);
        this.a.setSummary((CharSequence)defaultSharedPreferences.getString("inject_ptr_index", "0"));
        this.b.setSummary((CharSequence)defaultSharedPreferences.getString("inject_ptr_order", (String)null));
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        if ("inject_ptr_index".equals(preference.getKey())) {
            this.a.setSummary((CharSequence)o.toString());
        }
        else if ("inject_ptr_order".equals(preference.getKey())) {
            this.b.setSummary((CharSequence)o.toString());
        }
        return true;
    }
}
