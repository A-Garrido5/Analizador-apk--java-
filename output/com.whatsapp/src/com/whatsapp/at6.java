// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;

class at6 implements Preference$OnPreferenceChangeListener
{
    final SettingsAutodownload a;
    
    at6(final SettingsAutodownload a) {
        this.a = a;
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        final int b = SettingsAutodownload.b((CharSequence[])o);
        App.a(3, b);
        if ((b & 0x4) != 0x0) {
            this.a.showDialog(1);
        }
        return true;
    }
}
