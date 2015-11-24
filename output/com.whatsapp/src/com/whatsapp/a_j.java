// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;

class a_j implements Preference$OnPreferenceChangeListener
{
    final SettingsChat a;
    
    a_j(final SettingsChat a) {
        this.a = a;
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        final ListPreference listPreference = (ListPreference)preference;
        preference.setTitle((CharSequence)this.a.getString(2131231694, new Object[] { listPreference.getEntries()[listPreference.findIndexOfValue((String)o)].toString() }));
        return true;
    }
}
