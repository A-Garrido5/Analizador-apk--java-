// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class bb implements Preference$OnPreferenceClickListener
{
    final SettingsAccount a;
    
    bb(final SettingsAccount a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        this.a.startActivity(new Intent((Context)this.a, (Class)ChangeNumberOverview.class));
        return true;
    }
}
