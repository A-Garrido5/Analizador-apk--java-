// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class xe implements Preference$OnPreferenceClickListener
{
    final SettingsContacts a;
    
    xe(final SettingsContacts a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        a8s.a(new bz(this.a, null), new Void[0]);
        return true;
    }
}
