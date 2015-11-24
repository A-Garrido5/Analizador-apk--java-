// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;

class b implements Preference$OnPreferenceChangeListener
{
    final SettingsAutodownload a;
    
    b(final SettingsAutodownload a) {
        this.a = a;
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        App.a(2, SettingsAutodownload.b((CharSequence[])o));
        return true;
    }
}
