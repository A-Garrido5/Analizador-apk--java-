// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.preference.Preference;
import android.preference.CheckBoxPreference;
import android.preference.Preference$OnPreferenceClickListener;

class alw implements Preference$OnPreferenceClickListener
{
    final CheckBoxPreference a;
    final SettingsChat b;
    
    alw(final SettingsChat b, final CheckBoxPreference a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        if (this.a.isChecked()) {
            Conversation.a3 = true;
            if (!App.I) {
                return true;
            }
        }
        Conversation.a3 = false;
        return true;
    }
}
