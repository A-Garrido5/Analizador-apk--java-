// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.gdrive.SettingsGoogleDrive;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class a8w implements Preference$OnPreferenceClickListener
{
    final SettingsChat a;
    
    a8w(final SettingsChat a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        this.a.startActivity(new Intent((Context)this.a, (Class)SettingsGoogleDrive.class));
        return true;
    }
}
