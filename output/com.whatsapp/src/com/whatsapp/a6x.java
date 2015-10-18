// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;

class a6x implements Preference$OnPreferenceChangeListener
{
    final SettingsNotifications a;
    
    a6x(final SettingsNotifications a) {
        this.a = a;
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        final ListPreference listPreference = (ListPreference)preference;
        preference.setSummary((CharSequence)listPreference.getEntries()[listPreference.findIndexOfValue((String)o)].toString());
        return true;
    }
}
