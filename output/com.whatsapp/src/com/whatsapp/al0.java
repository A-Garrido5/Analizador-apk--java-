// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class al0 implements Preference$OnPreferenceClickListener
{
    final SettingsAccount a;
    
    al0(final SettingsAccount a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        this.a.startActivity(new Intent((Context)this.a, (Class)SettingsPrivacy.class));
        return true;
    }
}
