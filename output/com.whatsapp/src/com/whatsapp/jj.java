// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;

class jj implements Preference$OnPreferenceChangeListener
{
    final SettingsAutodownload a;
    
    jj(final SettingsAutodownload a) {
        this.a = a;
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        App.a(1, SettingsAutodownload.b((CharSequence[])o));
        return true;
    }
}
