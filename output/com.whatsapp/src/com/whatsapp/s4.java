// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class s4 implements Preference$OnPreferenceClickListener
{
    final Settings a;
    
    s4(final Settings a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        this.a.startActivity(new Intent((Context)this.a, (Class)SettingsAccount.class));
        return true;
    }
}
