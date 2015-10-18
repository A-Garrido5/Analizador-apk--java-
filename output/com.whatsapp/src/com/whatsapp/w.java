// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.aq;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class w implements Preference$OnPreferenceClickListener
{
    final SettingsContacts a;
    
    w(final SettingsContacts a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        aam.a(aq.TELL_A_FRIEND, ag.SETTINGS_CONTACTS);
        App.a((Activity)this.a);
        return true;
    }
}
