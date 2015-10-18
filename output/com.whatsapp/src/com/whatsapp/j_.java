// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.fieldstats.aq;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class j_ implements Preference$OnPreferenceClickListener
{
    final SettingsHelp a;
    
    j_(final SettingsHelp a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        aam.a(aq.ABOUT);
        this.a.startActivity(new Intent((Context)this.a, (Class)About.class));
        return true;
    }
}
