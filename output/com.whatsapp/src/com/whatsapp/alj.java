// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class alj implements Preference$OnPreferenceClickListener
{
    final SettingsChat a;
    
    alj(final SettingsChat a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        this.a.showDialog(5);
        return true;
    }
}
